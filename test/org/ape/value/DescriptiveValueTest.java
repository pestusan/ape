package org.ape.value;

import static org.junit.Assert.*;

import org.junit.Test;

public class DescriptiveValueTest {

	@Test
	public void test() {
		
		DescriptiveValue<Long> currentValue = getSystemMillis();
		assertNotNull(currentValue.getValue());
		assertNotNull(currentValue.getDescription());
		System.out.println(currentValue);
	}

	private DescriptiveValue<Long> getSystemMillis() {
		return DescriptiveValue.of(System.currentTimeMillis(), "Systemzeit");
	}
}
