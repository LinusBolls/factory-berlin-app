package com.fasterxml.jackson.core.io;

import java.io.InputStream;

public final class MergedStream extends InputStream {
    private byte[] _b;
    private final IOContext _ctxt;
    private final int _end;
    private final InputStream _in;
    private int _ptr;

    public MergedStream(IOContext iOContext, InputStream inputStream, byte[] bArr, int i2, int i3) {
        this._ctxt = iOContext;
        this._in = inputStream;
        this._b = bArr;
        this._ptr = i2;
        this._end = i3;
    }

    private void _free() {
        byte[] bArr = this._b;
        if (bArr != null) {
            this._b = null;
            IOContext iOContext = this._ctxt;
            if (iOContext != null) {
                iOContext.releaseReadIOBuffer(bArr);
            }
        }
    }

    public int available() {
        if (this._b != null) {
            return this._end - this._ptr;
        }
        return this._in.available();
    }

    public void close() {
        _free();
        this._in.close();
    }

    public void mark(int i2) {
        if (this._b == null) {
            this._in.mark(i2);
        }
    }

    public boolean markSupported() {
        return this._b == null && this._in.markSupported();
    }

    public int read() {
        byte[] bArr = this._b;
        if (bArr == null) {
            return this._in.read();
        }
        int i2 = this._ptr;
        int i3 = i2 + 1;
        this._ptr = i3;
        byte b = bArr[i2] & 255;
        if (i3 >= this._end) {
            _free();
        }
        return b;
    }

    public void reset() {
        if (this._b == null) {
            this._in.reset();
        }
    }

    public long skip(long j2) {
        long j3;
        if (this._b != null) {
            int i2 = this._end;
            int i3 = this._ptr;
            long j4 = (long) (i2 - i3);
            if (j4 > j2) {
                this._ptr = i3 + ((int) j2);
                return j2;
            }
            _free();
            j3 = j4 + 0;
            j2 -= j4;
        } else {
            j3 = 0;
        }
        return j2 > 0 ? j3 + this._in.skip(j2) : j3;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i2, int i3) {
        if (this._b == null) {
            return this._in.read(bArr, i2, i3);
        }
        int i4 = this._end - this._ptr;
        if (i3 > i4) {
            i3 = i4;
        }
        System.arraycopy(this._b, this._ptr, bArr, i2, i3);
        int i5 = this._ptr + i3;
        this._ptr = i5;
        if (i5 >= this._end) {
            _free();
        }
        return i3;
    }
}
