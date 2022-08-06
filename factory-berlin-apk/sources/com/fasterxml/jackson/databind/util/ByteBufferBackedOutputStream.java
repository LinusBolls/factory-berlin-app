package com.fasterxml.jackson.databind.util;

import java.io.OutputStream;
import java.nio.ByteBuffer;

public class ByteBufferBackedOutputStream extends OutputStream {
    protected final ByteBuffer _b;

    public ByteBufferBackedOutputStream(ByteBuffer byteBuffer) {
        this._b = byteBuffer;
    }

    public void write(int i2) {
        this._b.put((byte) i2);
    }

    public void write(byte[] bArr, int i2, int i3) {
        this._b.put(bArr, i2, i3);
    }
}
