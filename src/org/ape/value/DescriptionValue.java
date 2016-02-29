package org.ape.value;

/**
 * 
 * @author niclex
 *
 * @param <T>
 */
public class DescriptionValue<T> {

	private T value;
	
	private String description;
	
	public static <T> DescriptionValue<T> of(T value, String description) {
		return new DescriptionValue<T>().setValue(value).setDescription(description);
	}
	
	private DescriptionValue<T> setValue(T value) {
		this.value = value;
		return this;
	}

	private DescriptionValue<T> setDescription(String description) {
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
