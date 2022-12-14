package com.fasterxml.jackson.core.io;

import java.io.DataInput;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;

public abstract class InputDecorator implements Serializable {
    public abstract DataInput decorate(IOContext iOContext, DataInput dataInput);

    public abstract InputStream decorate(IOContext iOContext, InputStream inputStream);

    public abstract InputStream decorate(IOContext iOContext, byte[] bArr, int i2, int i3);

    public abstract Reader decorate(IOContext iOContext, Reader reader);
}
