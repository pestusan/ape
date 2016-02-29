package org.ape.value;

public class Value<T>
{
    private T value;

    public T getValue()
    {
        return value;
    }

    private void setValue(T value) {
        this.value = value;
    }
}
