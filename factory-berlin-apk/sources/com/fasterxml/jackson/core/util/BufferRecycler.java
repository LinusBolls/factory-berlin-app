package com.fasterxml.jackson.core.util;

public class BufferRecycler {
    private static final int[] BYTE_BUFFER_LENGTHS = {8000, 8000, 2000, 2000};
    private static final int[] CHAR_BUFFER_LENGTHS = {4000, 4000, 200, 200};
    protected final byte[][] _byteBuffers;
    protected final char[][] _charBuffers;

    public BufferRecycler() {
        this(4, 4);
    }

    public final byte[] allocByteBuffer(int i2) {
        return allocByteBuffer(i2, 0);
    }

    public final char[] allocCharBuffer(int i2) {
        return allocCharBuffer(i2, 0);
    }

    /* access modifiers changed from: protected */
    public byte[] balloc(int i2) {
        return new byte[i2];
    }

    /* access modifiers changed from: protected */
    public int byteBufferLength(int i2) {
        return BYTE_BUFFER_LENGTHS[i2];
    }

    /* access modifiers changed from: protected */
    public char[] calloc(int i2) {
        return new char[i2];
    }

    /* access modifiers changed from: protected */
    public int charBufferLength(int i2) {
        return CHAR_BUFFER_LENGTHS[i2];
    }

    public void releaseByteBuffer(int i2, byte[] bArr) {
        this._byteBuffers[i2] = bArr;
    }

    public void releaseCharBuffer(int i2, char[] cArr) {
        this._charBuffers[i2] = cArr;
    }

    protected BufferRecycler(int i2, int i3) {
        this._byteBuffers = new byte[i2][];
        this._charBuffers = new char[i3][];
    }

    public byte[] allocByteBuffer(int i2, int i3) {
        int byteBufferLength = byteBufferLength(i2);
        if (i3 < byteBufferLength) {
            i3 = byteBufferLength;
        }
        byte[][] bArr = this._byteBuffers;
        byte[] bArr2 = bArr[i2];
        if (bArr2 == null || bArr2.length < i3) {
            return balloc(i3);
        }
        bArr[i2] = null;
        return bArr2;
    }

    public char[] allocCharBuffer(int i2, int i3) {
        int charBufferLength = charBufferLength(i2);
        if (i3 < charBufferLength) {
            i3 = charBufferLength;
        }
        char[][] cArr = this._charBuffers;
        char[] cArr2 = cArr[i2];
        if (cArr2 == null || cArr2.length < i3) {
            return calloc(i3);
        }
        cArr[i2] = null;
        return cArr2;
    }
}
