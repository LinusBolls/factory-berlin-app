package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public final class UTF8Writer extends Writer {
    private final IOContext _context;
    private OutputStream _out;
    private byte[] _outBuffer;
    private final int _outBufferEnd;
    private int _outPtr = 0;
    private int _surrogate;

    public UTF8Writer(IOContext iOContext, OutputStream outputStream) {
        this._context = iOContext;
        this._out = outputStream;
        byte[] allocWriteEncodingBuffer = iOContext.allocWriteEncodingBuffer();
        this._outBuffer = allocWriteEncodingBuffer;
        this._outBufferEnd = allocWriteEncodingBuffer.length - 4;
    }

    protected static void illegalSurrogate(int i2) {
        throw new IOException(illegalSurrogateDesc(i2));
    }

    protected static String illegalSurrogateDesc(int i2) {
        if (i2 > 1114111) {
            return "Illegal character point (0x" + Integer.toHexString(i2) + ") to output; max is 0x10FFFF as per RFC 4627";
        } else if (i2 < 55296) {
            return "Illegal character point (0x" + Integer.toHexString(i2) + ") to output";
        } else if (i2 <= 56319) {
            return "Unmatched first part of surrogate pair (0x" + Integer.toHexString(i2) + ")";
        } else {
            return "Unmatched second part of surrogate pair (0x" + Integer.toHexString(i2) + ")";
        }
    }

    public void close() {
        OutputStream outputStream = this._out;
        if (outputStream != null) {
            int i2 = this._outPtr;
            if (i2 > 0) {
                outputStream.write(this._outBuffer, 0, i2);
                this._outPtr = 0;
            }
            OutputStream outputStream2 = this._out;
            this._out = null;
            byte[] bArr = this._outBuffer;
            if (bArr != null) {
                this._outBuffer = null;
                this._context.releaseWriteEncodingBuffer(bArr);
            }
            outputStream2.close();
            int i3 = this._surrogate;
            this._surrogate = 0;
            if (i3 > 0) {
                illegalSurrogate(i3);
                throw null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public int convertSurrogate(int i2) {
        int i3 = this._surrogate;
        this._surrogate = 0;
        if (i2 >= 56320 && i2 <= 57343) {
            return ((i3 - 55296) << 10) + 65536 + (i2 - 56320);
        }
        throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i3) + ", second 0x" + Integer.toHexString(i2) + "; illegal combination");
    }

    public void flush() {
        OutputStream outputStream = this._out;
        if (outputStream != null) {
            int i2 = this._outPtr;
            if (i2 > 0) {
                outputStream.write(this._outBuffer, 0, i2);
                this._outPtr = 0;
            }
            this._out.flush();
        }
    }

    public void write(char[] cArr) {
        write(cArr, 0, cArr.length);
    }

    public Writer append(char c) {
        write((int) c);
        return this;
    }

    public void write(char[] cArr, int i2, int i3) {
        if (i3 >= 2) {
            if (this._surrogate > 0) {
                i3--;
                write(convertSurrogate(cArr[i2]));
                i2++;
            }
            int i4 = this._outPtr;
            byte[] bArr = this._outBuffer;
            int i5 = this._outBufferEnd;
            int i6 = i3 + r9;
            while (r9 < i6) {
                if (i4 >= i5) {
                    this._out.write(bArr, 0, i4);
                    i4 = 0;
                }
                int i7 = r9 + 1;
                char c = cArr[r9];
                if (c < 128) {
                    int i8 = i4 + 1;
                    bArr[i4] = (byte) c;
                    int i9 = i6 - i7;
                    int i10 = i5 - i8;
                    if (i9 > i10) {
                        i9 = i10;
                    }
                    int i11 = i9 + i7;
                    while (true) {
                        r9 = i7;
                        i4 = i8;
                        if (r9 >= i11) {
                            continue;
                            break;
                        }
                        i7 = r9 + 1;
                        c = cArr[r9];
                        if (c >= 128) {
                            break;
                        }
                        i8 = i4 + 1;
                        bArr[i4] = (byte) c;
                    }
                }
                if (c < 2048) {
                    int i12 = i4 + 1;
                    bArr[i4] = (byte) ((c >> 6) | 192);
                    i4 = i12 + 1;
                    bArr[i12] = (byte) ((c & '?') | 128);
                    r9 = i7;
                } else if (c < 55296 || c > 57343) {
                    int i13 = i4 + 1;
                    bArr[i4] = (byte) ((c >> 12) | 224);
                    int i14 = i13 + 1;
                    bArr[i13] = (byte) (((c >> 6) & 63) | 128);
                    bArr[i14] = (byte) ((c & '?') | 128);
                    r9 = i7;
                    i4 = i14 + 1;
                } else if (c <= 56319) {
                    this._surrogate = c;
                    if (i7 >= i6) {
                        break;
                    }
                    r9 = i7 + 1;
                    int convertSurrogate = convertSurrogate(cArr[i7]);
                    if (convertSurrogate <= 1114111) {
                        int i15 = i4 + 1;
                        bArr[i4] = (byte) ((convertSurrogate >> 18) | 240);
                        int i16 = i15 + 1;
                        bArr[i15] = (byte) (((convertSurrogate >> 12) & 63) | 128);
                        int i17 = i16 + 1;
                        bArr[i16] = (byte) (((convertSurrogate >> 6) & 63) | 128);
                        i4 = i17 + 1;
                        bArr[i17] = (byte) ((convertSurrogate & 63) | 128);
                    } else {
                        this._outPtr = i4;
                        illegalSurrogate(convertSurrogate);
                        throw null;
                    }
                } else {
                    this._outPtr = i4;
                    illegalSurrogate(c);
                    throw null;
                }
            }
            this._outPtr = i4;
        } else if (i3 == 1) {
            write((int) cArr[i2]);
        }
    }

    public void write(int i2) {
        int i3;
        if (this._surrogate > 0) {
            i2 = convertSurrogate(i2);
        } else if (i2 >= 55296 && i2 <= 57343) {
            if (i2 <= 56319) {
                this._surrogate = i2;
                return;
            } else {
                illegalSurrogate(i2);
                throw null;
            }
        }
        int i4 = this._outPtr;
        if (i4 >= this._outBufferEnd) {
            this._out.write(this._outBuffer, 0, i4);
            this._outPtr = 0;
        }
        if (i2 < 128) {
            byte[] bArr = this._outBuffer;
            int i5 = this._outPtr;
            this._outPtr = i5 + 1;
            bArr[i5] = (byte) i2;
            return;
        }
        int i6 = this._outPtr;
        if (i2 < 2048) {
            byte[] bArr2 = this._outBuffer;
            int i7 = i6 + 1;
            bArr2[i6] = (byte) ((i2 >> 6) | 192);
            i3 = i7 + 1;
            bArr2[i7] = (byte) ((i2 & 63) | 128);
        } else if (i2 <= 65535) {
            byte[] bArr3 = this._outBuffer;
            int i8 = i6 + 1;
            bArr3[i6] = (byte) ((i2 >> 12) | 224);
            int i9 = i8 + 1;
            bArr3[i8] = (byte) (((i2 >> 6) & 63) | 128);
            bArr3[i9] = (byte) ((i2 & 63) | 128);
            i3 = i9 + 1;
        } else if (i2 <= 1114111) {
            byte[] bArr4 = this._outBuffer;
            int i10 = i6 + 1;
            bArr4[i6] = (byte) ((i2 >> 18) | 240);
            int i11 = i10 + 1;
            bArr4[i10] = (byte) (((i2 >> 12) & 63) | 128);
            int i12 = i11 + 1;
            bArr4[i11] = (byte) (((i2 >> 6) & 63) | 128);
            i3 = i12 + 1;
            bArr4[i12] = (byte) ((i2 & 63) | 128);
        } else {
            illegalSurrogate(i2);
            throw null;
        }
        this._outPtr = i3;
    }

    public void write(String str) {
        write(str, 0, str.length());
    }

    public void write(String str, int i2, int i3) {
        if (i3 >= 2) {
            if (this._surrogate > 0) {
                i3--;
                write(convertSurrogate(str.charAt(i2)));
                i2++;
            }
            int i4 = this._outPtr;
            byte[] bArr = this._outBuffer;
            int i5 = this._outBufferEnd;
            int i6 = i3 + r9;
            while (r9 < i6) {
                if (i4 >= i5) {
                    this._out.write(bArr, 0, i4);
                    i4 = 0;
                }
                int i7 = r9 + 1;
                char charAt = str.charAt(r9);
                if (charAt < 128) {
                    int i8 = i4 + 1;
                    bArr[i4] = (byte) charAt;
                    int i9 = i6 - i7;
                    int i10 = i5 - i8;
                    if (i9 > i10) {
                        i9 = i10;
                    }
                    int i11 = i9 + i7;
                    while (true) {
                        r9 = i7;
                        i4 = i8;
                        if (r9 >= i11) {
                            continue;
                            break;
                        }
                        i7 = r9 + 1;
                        charAt = str.charAt(r9);
                        if (charAt >= 128) {
                            break;
                        }
                        i8 = i4 + 1;
                        bArr[i4] = (byte) charAt;
                    }
                }
                if (charAt < 2048) {
                    int i12 = i4 + 1;
                    bArr[i4] = (byte) ((charAt >> 6) | 192);
                    i4 = i12 + 1;
                    bArr[i12] = (byte) ((charAt & '?') | 128);
                    r9 = i7;
                } else if (charAt < 55296 || charAt > 57343) {
                    int i13 = i4 + 1;
                    bArr[i4] = (byte) ((charAt >> 12) | 224);
                    int i14 = i13 + 1;
                    bArr[i13] = (byte) (((charAt >> 6) & 63) | 128);
                    bArr[i14] = (byte) ((charAt & '?') | 128);
                    r9 = i7;
                    i4 = i14 + 1;
                } else if (charAt <= 56319) {
                    this._surrogate = charAt;
                    if (i7 >= i6) {
                        break;
                    }
                    r9 = i7 + 1;
                    int convertSurrogate = convertSurrogate(str.charAt(i7));
                    if (convertSurrogate <= 1114111) {
                        int i15 = i4 + 1;
                        bArr[i4] = (byte) ((convertSurrogate >> 18) | 240);
                        int i16 = i15 + 1;
                        bArr[i15] = (byte) (((convertSurrogate >> 12) & 63) | 128);
                        int i17 = i16 + 1;
                        bArr[i16] = (byte) (((convertSurrogate >> 6) & 63) | 128);
                        i4 = i17 + 1;
                        bArr[i17] = (byte) ((convertSurrogate & 63) | 128);
                    } else {
                        this._outPtr = i4;
                        illegalSurrogate(convertSurrogate);
                        throw null;
                    }
                } else {
                    this._outPtr = i4;
                    illegalSurrogate(charAt);
                    throw null;
                }
            }
            this._outPtr = i4;
        } else if (i3 == 1) {
            write((int) str.charAt(i2));
        }
    }
}
