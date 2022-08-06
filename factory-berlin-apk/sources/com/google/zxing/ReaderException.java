package com.google.zxing;

public abstract class ReaderException extends Exception {

    /* renamed from: g  reason: collision with root package name */
    protected static final StackTraceElement[] f4357g = new StackTraceElement[0];

    static {
        String property = System.getProperty("surefire.test.class.path");
    }

    ReaderException() {
    }

    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
