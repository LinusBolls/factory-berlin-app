package com.fasterxml.jackson.databind.util;

import java.io.InputStream;
import java.nio.ByteBuffer;

public class ByteBufferBackedInputStream extends InputStream {
    protected final ByteBuffer _b;

    public ByteBufferBackedInputStream(ByteBuffer byteBuffer) {
        this._b = byteBuffer;
    }

    public int available() {
        return this._b.remaining();
    }

    public int read() {
        if (this._b.hasRemaining()) {
            return this._b.get() & 255;
        }
        return -1;
    }

    public int read(byte[] bArr, int i2, int i3) {
        if (!this._b.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i3, this._b.remaining());
        this._b.get(bArr, i2, min);
        return min;
    }
}
