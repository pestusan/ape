package org.ape.value;

import static org.junit.Assert.*;

import org.junit.Test;

public class DescriptiveValueTest {

	@Test
	public void test() {
		
		DescriptionValue<Long> currentValue = getSystemMillis();
		assertNotNull(currentValue.getValue());
		assertNotNull(currentValue.getDescription());
		System.out.println(currentValue);
	}

	private DescriptionValue<Long> getSystemMillis() {
		return DescriptionValue.of(System.currentTimeMillis(), "Systemzeit");
	}
}
