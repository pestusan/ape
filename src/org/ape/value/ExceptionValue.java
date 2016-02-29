package org.ape.value;

public class ExceptionValue<T>
{
    private T         value;

    private Exception exception;

    public Exception getException()
    {
        return exception;
    }

    public T getValue()
    {
        return value;
    }

    public ExceptionValue<T> setException(Exception exception)
    {
        this.exception = exception;
        return this;
    }

    public ExceptionValue<T> setValue(T value)
    {
        this.value = value;
        return this;
    }

    @Override
    public String toString()
    {
        return "ExceptionValue [value=" + value + ", exception=" + exception + "]";
    }

    public static <T> ExceptionValue<T> of(T value, Exception exception)
    {
        return new ExceptionValue<T>().setValue(value).setException(exception);
    }

}
