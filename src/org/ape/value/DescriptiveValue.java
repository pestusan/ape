package org.ape.value;

/**
 * 
 * @author niclex
 *
 * @param <T>
 */
public class DescriptiveValue<T> {

	private T value;
	
	private String description;
	
	public static <T> DescriptiveValue<T> of(T value, String description) {
		return new DescriptiveValue<T>().setValue(value).setDescription(description);
	}
	
	private DescriptiveValue<T> setValue(T value) {
		this.value = value;
		return this;
	}

	private DescriptiveValue<T> setDescription(String description) {
		this.description = description;
		return this;
	}

	public T getValue() {
		return value;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "DescriptiveValue [value=" + value + ", description="
				+ description + "]";
	}
	
	
}
