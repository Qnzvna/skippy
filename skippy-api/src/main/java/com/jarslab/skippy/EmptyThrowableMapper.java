package com.jarslab.skippy;

public class EmptyThrowableMapper implements ThrowableMapper
{
    @Override
    public ErrorDetails map(final Throwable throwable)
    {
        return new EmptyErrorDetails();
    }
}
