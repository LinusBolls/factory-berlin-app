package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberOutput;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class UTF8JsonGenerator extends JsonGeneratorImpl {
    private static final byte[] FALSE_BYTES = {102, 97, 108, 115, 101};
    private static final byte[] HEX_CHARS = CharTypes.copyHexBytes();
    private static final byte[] NULL_BYTES = {110, 117, 108, 108};
    private static final byte[] TRUE_BYTES = {116, 114, 117, 101};
    protected boolean _bufferRecyclable;
    protected char[] _charBuffer;
    protected final int _charBufferLength;
    protected byte[] _outputBuffer;
    protected final int _outputEnd;
    protected final int _outputMaxContiguous;
    protected final OutputStream _outputStream;
    protected int _outputTail;
    protected byte _quoteChar = 34;

    public UTF8JsonGenerator(IOContext iOContext, int i2, ObjectCodec objectCodec, OutputStream outputStream) {
        super(iOContext, i2, objectCodec);
        this._outputStream = outputStream;
        this._bufferRecyclable = true;
        byte[] allocWriteEncodingBuffer = iOContext.allocWriteEncodingBuffer();
        this._outputBuffer = allocWriteEncodingBuffer;
        int length = allocWriteEncodingBuffer.length;
        this._outputEnd = length;
        this._outputMaxContiguous = length >> 3;
        char[] allocConcatBuffer = iOContext.allocConcatBuffer();
        this._charBuffer = allocConcatBuffer;
        this._charBufferLength = allocConcatBuffer.length;
        if (isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII)) {
            setHighestNonEscapedChar(127);
        }
    }

    private final int _handleLongCustomEscape(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        int length = bArr2.length;
        if (i2 + length > i3) {
            this._outputTail = i2;
            _flushBuffer();
            int i5 = this._outputTail;
            if (length > bArr.length) {
                this._outputStream.write(bArr2, 0, length);
                return i5;
            }
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i2 = i5 + length;
        }
        if ((i4 * 6) + i2 <= i3) {
            return i2;
        }
        _flushBuffer();
        return this._outputTail;
    }

    private final int _outputMultiByteChar(int i2, int i3) {
        byte[] bArr = this._outputBuffer;
        if (i2 < 55296 || i2 > 57343) {
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i2 >> 12) | 224);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (((i2 >> 6) & 63) | 128);
            bArr[i5] = (byte) ((i2 & 63) | 128);
            return i5 + 1;
        }
        int i6 = i3 + 1;
        bArr[i3] = 92;
        int i7 = i6 + 1;
        bArr[i6] = 117;
        int i8 = i7 + 1;
        byte[] bArr2 = HEX_CHARS;
        bArr[i7] = bArr2[(i2 >> 12) & 15];
        int i9 = i8 + 1;
        bArr[i8] = bArr2[(i2 >> 8) & 15];
        int i10 = i9 + 1;
        bArr[i9] = bArr2[(i2 >> 4) & 15];
        int i11 = i10 + 1;
        bArr[i10] = bArr2[i2 & 15];
        return i11;
    }

    private final int _outputRawMultiByteChar(int i2, char[] cArr, int i3, int i4) {
        if (i2 < 55296 || i2 > 57343) {
            byte[] bArr = this._outputBuffer;
            int i5 = this._outputTail;
            int i6 = i5 + 1;
            this._outputTail = i6;
            bArr[i5] = (byte) ((i2 >> 12) | 224);
            int i7 = i6 + 1;
            this._outputTail = i7;
            bArr[i6] = (byte) (((i2 >> 6) & 63) | 128);
            this._outputTail = i7 + 1;
            bArr[i7] = (byte) ((i2 & 63) | 128);
            return i3;
        } else if (i3 >= i4 || cArr == null) {
            _reportError(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", new Object[]{Integer.valueOf(i2)}));
            throw null;
        } else {
            _outputSurrogates(i2, cArr[i3]);
            return i3 + 1;
        }
    }

    private final int _readMore(InputStream inputStream, byte[] bArr, int i2, int i3, int i4) {
        int i5 = 0;
        while (i2 < i3) {
            bArr[i5] = bArr[i2];
            i5++;
            i2++;
        }
        int min = Math.min(i4, bArr.length);
        do {
            int i6 = min - i5;
            if (i6 == 0) {
                break;
            }
            int read = inputStream.read(bArr, i5, i6);
            if (read < 0) {
                return i5;
            }
            i5 += read;
        } while (i5 < 3);
        return i5;
    }

    private final void _writeBytes(byte[] bArr) {
        int length = bArr.length;
        if (this._outputTail + length > this._outputEnd) {
            _flushBuffer();
            if (length > 512) {
                this._outputStream.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this._outputBuffer, this._outputTail, length);
        this._outputTail += length;
    }

    private final int _writeCustomEscape(byte[] bArr, int i2, SerializableString serializableString, int i3) {
        byte[] asUnquotedUTF8 = serializableString.asUnquotedUTF8();
        int length = asUnquotedUTF8.length;
        if (length > 6) {
            return _handleLongCustomEscape(bArr, i2, this._outputEnd, asUnquotedUTF8, i3);
        }
        System.arraycopy(asUnquotedUTF8, 0, bArr, i2, length);
        return i2 + length;
    }

    private final void _writeCustomStringSegment2(char[] cArr, int i2, int i3) {
        if (this._outputTail + ((i3 - i2) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i4 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i5 = this._maximumNonEscapedChar;
        if (i5 <= 0) {
            i5 = 65535;
        }
        CharacterEscapes characterEscapes = this._characterEscapes;
        while (i2 < i3) {
            int i6 = i2 + 1;
            char c = cArr[i2];
            if (c <= 127) {
                if (iArr[c] == 0) {
                    bArr[i4] = (byte) c;
                    i2 = i6;
                    i4++;
                } else {
                    int i7 = iArr[c];
                    if (i7 > 0) {
                        int i8 = i4 + 1;
                        bArr[i4] = 92;
                        i4 = i8 + 1;
                        bArr[i8] = (byte) i7;
                    } else if (i7 == -2) {
                        SerializableString escapeSequence = characterEscapes.getEscapeSequence(c);
                        if (escapeSequence != null) {
                            i4 = _writeCustomEscape(bArr, i4, escapeSequence, i3 - i6);
                        } else {
                            _reportError("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(c) + ", although was supposed to have one");
                            throw null;
                        }
                    } else {
                        i4 = _writeGenericEscape(c, i4);
                    }
                }
            } else if (c > i5) {
                i4 = _writeGenericEscape(c, i4);
            } else {
                SerializableString escapeSequence2 = characterEscapes.getEscapeSequence(c);
                if (escapeSequence2 != null) {
                    i4 = _writeCustomEscape(bArr, i4, escapeSequence2, i3 - i6);
                } else if (c <= 2047) {
                    int i9 = i4 + 1;
                    bArr[i4] = (byte) ((c >> 6) | 192);
                    i4 = i9 + 1;
                    bArr[i9] = (byte) ((c & '?') | 128);
                } else {
                    i4 = _outputMultiByteChar(c, i4);
                }
            }
            i2 = i6;
        }
        this._outputTail = i4;
    }

    private int _writeGenericEscape(int i2, int i3) {
        int i4;
        byte[] bArr = this._outputBuffer;
        int i5 = i3 + 1;
        bArr[i3] = 92;
        int i6 = i5 + 1;
        bArr[i5] = 117;
        if (i2 > 255) {
            int i7 = 255 & (i2 >> 8);
            int i8 = i6 + 1;
            byte[] bArr2 = HEX_CHARS;
            bArr[i6] = bArr2[i7 >> 4];
            i4 = i8 + 1;
            bArr[i8] = bArr2[i7 & 15];
            i2 &= 255;
        } else {
            int i9 = i6 + 1;
            bArr[i6] = 48;
            i4 = i9 + 1;
            bArr[i9] = 48;
        }
        int i10 = i4 + 1;
        byte[] bArr3 = HEX_CHARS;
        bArr[i4] = bArr3[i2 >> 4];
        int i11 = i10 + 1;
        bArr[i10] = bArr3[i2 & 15];
        return i11;
    }

    private final void _writeNull() {
        if (this._outputTail + 4 >= this._outputEnd) {
            _flushBuffer();
        }
        System.arraycopy(NULL_BYTES, 0, this._outputBuffer, this._outputTail, 4);
        this._outputTail += 4;
    }

    private final void _writeQuotedInt(int i2) {
        if (this._outputTail + 13 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        int i4 = i3 + 1;
        this._outputTail = i4;
        bArr[i3] = this._quoteChar;
        int outputInt = NumberOutput.outputInt(i2, bArr, i4);
        this._outputTail = outputInt;
        byte[] bArr2 = this._outputBuffer;
        this._outputTail = outputInt + 1;
        bArr2[outputInt] = this._quoteChar;
    }

    private final void _writeQuotedLong(long j2) {
        if (this._outputTail + 23 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        int i3 = i2 + 1;
        this._outputTail = i3;
        bArr[i2] = this._quoteChar;
        int outputLong = NumberOutput.outputLong(j2, bArr, i3);
        this._outputTail = outputLong;
        byte[] bArr2 = this._outputBuffer;
        this._outputTail = outputLong + 1;
        bArr2[outputLong] = this._quoteChar;
    }

    private final void _writeQuotedRaw(String str) {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = this._quoteChar;
        writeRaw(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = this._quoteChar;
    }

    private final void _writeQuotedShort(short s) {
        if (this._outputTail + 8 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        int i3 = i2 + 1;
        this._outputTail = i3;
        bArr[i2] = this._quoteChar;
        int outputInt = NumberOutput.outputInt((int) s, bArr, i3);
        this._outputTail = outputInt;
        byte[] bArr2 = this._outputBuffer;
        this._outputTail = outputInt + 1;
        bArr2[outputInt] = this._quoteChar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = r7 + 1;
        r7 = r6[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        if (r7 >= 2048) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r1 = r5._outputBuffer;
        r2 = r5._outputTail;
        r3 = r2 + 1;
        r5._outputTail = r3;
        r1[r2] = (byte) ((r7 >> 6) | 192);
        r5._outputTail = r3 + 1;
        r1[r3] = (byte) ((r7 & '?') | 128);
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        r7 = _outputRawMultiByteChar(r7, r6, r0, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void _writeRawSegment(char[] r6, int r7, int r8) {
        /*
            r5 = this;
        L_0x0000:
            if (r7 >= r8) goto L_0x0040
        L_0x0002:
            char r0 = r6[r7]
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L_0x0031
            int r0 = r7 + 1
            char r7 = r6[r7]
            r1 = 2048(0x800, float:2.87E-42)
            if (r7 >= r1) goto L_0x002c
            byte[] r1 = r5._outputBuffer
            int r2 = r5._outputTail
            int r3 = r2 + 1
            r5._outputTail = r3
            int r4 = r7 >> 6
            r4 = r4 | 192(0xc0, float:2.69E-43)
            byte r4 = (byte) r4
            r1[r2] = r4
            int r2 = r3 + 1
            r5._outputTail = r2
            r7 = r7 & 63
            r7 = r7 | 128(0x80, float:1.794E-43)
            byte r7 = (byte) r7
            r1[r3] = r7
            r7 = r0
            goto L_0x0000
        L_0x002c:
            int r7 = r5._outputRawMultiByteChar(r7, r6, r0, r8)
            goto L_0x0000
        L_0x0031:
            byte[] r1 = r5._outputBuffer
            int r2 = r5._outputTail
            int r3 = r2 + 1
            r5._outputTail = r3
            byte r0 = (byte) r0
            r1[r2] = r0
            int r7 = r7 + 1
            if (r7 < r8) goto L_0x0002
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8JsonGenerator._writeRawSegment(char[], int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        r9 = _outputRawMultiByteChar(r9, r8, r2, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if ((r7._outputTail + 3) < r7._outputEnd) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        _flushBuffer();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        r2 = r9 + 1;
        r9 = r8[r9];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r9 >= 2048) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r4 = r7._outputTail;
        r5 = r4 + 1;
        r7._outputTail = r5;
        r1[r4] = (byte) ((r9 >> 6) | 192);
        r7._outputTail = r5 + 1;
        r1[r5] = (byte) ((r9 & '?') | 128);
        r9 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void _writeSegmentedRaw(char[] r8, int r9, int r10) {
        /*
            r7 = this;
            int r0 = r7._outputEnd
            byte[] r1 = r7._outputBuffer
            int r10 = r10 + r9
        L_0x0005:
            if (r9 >= r10) goto L_0x0052
        L_0x0007:
            char r2 = r8[r9]
            r3 = 128(0x80, float:1.794E-43)
            if (r2 < r3) goto L_0x003e
            int r2 = r7._outputTail
            int r2 = r2 + 3
            int r4 = r7._outputEnd
            if (r2 < r4) goto L_0x0018
            r7._flushBuffer()
        L_0x0018:
            int r2 = r9 + 1
            char r9 = r8[r9]
            r4 = 2048(0x800, float:2.87E-42)
            if (r9 >= r4) goto L_0x0039
            int r4 = r7._outputTail
            int r5 = r4 + 1
            r7._outputTail = r5
            int r6 = r9 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r1[r4] = r6
            int r4 = r5 + 1
            r7._outputTail = r4
            r9 = r9 & 63
            r9 = r9 | r3
            byte r9 = (byte) r9
            r1[r5] = r9
            r9 = r2
            goto L_0x0005
        L_0x0039:
            int r9 = r7._outputRawMultiByteChar(r9, r8, r2, r10)
            goto L_0x0005
        L_0x003e:
            int r3 = r7._outputTail
            if (r3 < r0) goto L_0x0045
            r7._flushBuffer()
        L_0x0045:
            int r3 = r7._outputTail
            int r4 = r3 + 1
            r7._outputTail = r4
            byte r2 = (byte) r2
            r1[r3] = r2
            int r9 = r9 + 1
            if (r9 < r10) goto L_0x0007
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8JsonGenerator._writeSegmentedRaw(char[], int, int):void");
    }

    private final void _writeStringSegment(char[] cArr, int i2, int i3) {
        int i4 = i3 + i2;
        int i5 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i2 < i4) {
            char c = cArr[i2];
            if (c > 127 || iArr[c] != 0) {
                break;
            }
            bArr[i5] = (byte) c;
            i2++;
            i5++;
        }
        this._outputTail = i5;
        if (i2 >= i4) {
            return;
        }
        if (this._characterEscapes != null) {
            _writeCustomStringSegment2(cArr, i2, i4);
        } else if (this._maximumNonEscapedChar == 0) {
            _writeStringSegment2(cArr, i2, i4);
        } else {
            _writeStringSegmentASCII2(cArr, i2, i4);
        }
    }

    private final void _writeStringSegment2(char[] cArr, int i2, int i3) {
        if (this._outputTail + ((i3 - i2) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i4 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i2 < i3) {
            int i5 = i2 + 1;
            char c = cArr[i2];
            if (c <= 127) {
                if (iArr[c] == 0) {
                    bArr[i4] = (byte) c;
                    i2 = i5;
                    i4++;
                } else {
                    int i6 = iArr[c];
                    if (i6 > 0) {
                        int i7 = i4 + 1;
                        bArr[i4] = 92;
                        i4 = i7 + 1;
                        bArr[i7] = (byte) i6;
                    } else {
                        i4 = _writeGenericEscape(c, i4);
                    }
                }
            } else if (c <= 2047) {
                int i8 = i4 + 1;
                bArr[i4] = (byte) ((c >> 6) | 192);
                i4 = i8 + 1;
                bArr[i8] = (byte) ((c & '?') | 128);
            } else {
                i4 = _outputMultiByteChar(c, i4);
            }
            i2 = i5;
        }
        this._outputTail = i4;
    }

    private final void _writeStringSegmentASCII2(char[] cArr, int i2, int i3) {
        if (this._outputTail + ((i3 - i2) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i4 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i5 = this._maximumNonEscapedChar;
        while (i2 < i3) {
            int i6 = i2 + 1;
            char c = cArr[i2];
            if (c <= 127) {
                if (iArr[c] == 0) {
                    bArr[i4] = (byte) c;
                    i2 = i6;
                    i4++;
                } else {
                    int i7 = iArr[c];
                    if (i7 > 0) {
                        int i8 = i4 + 1;
                        bArr[i4] = 92;
                        i4 = i8 + 1;
                        bArr[i8] = (byte) i7;
                    } else {
                        i4 = _writeGenericEscape(c, i4);
                    }
                }
            } else if (c > i5) {
                i4 = _writeGenericEscape(c, i4);
            } else if (c <= 2047) {
                int i9 = i4 + 1;
                bArr[i4] = (byte) ((c >> 6) | 192);
                i4 = i9 + 1;
                bArr[i9] = (byte) ((c & '?') | 128);
            } else {
                i4 = _outputMultiByteChar(c, i4);
            }
            i2 = i6;
        }
        this._outputTail = i4;
    }

    private final void _writeStringSegments(String str, boolean z) {
        if (z) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            bArr[i2] = this._quoteChar;
        }
        int length = str.length();
        int i3 = 0;
        while (length > 0) {
            int min = Math.min(this._outputMaxContiguous, length);
            if (this._outputTail + min > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(str, i3, min);
            i3 += min;
            length -= min;
        }
        if (z) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr2 = this._outputBuffer;
            int i4 = this._outputTail;
            this._outputTail = i4 + 1;
            bArr2[i4] = this._quoteChar;
        }
    }

    private final void _writeUnq(SerializableString serializableString) {
        int appendQuotedUTF8 = serializableString.appendQuotedUTF8(this._outputBuffer, this._outputTail);
        if (appendQuotedUTF8 < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += appendQuotedUTF8;
        }
    }

    /* access modifiers changed from: protected */
    public final void _flushBuffer() {
        int i2 = this._outputTail;
        if (i2 > 0) {
            this._outputTail = 0;
            this._outputStream.write(this._outputBuffer, 0, i2);
        }
    }

    /* access modifiers changed from: protected */
    public final void _outputSurrogates(int i2, int i3) {
        int _decodeSurrogate = _decodeSurrogate(i2, i3);
        if (this._outputTail + 4 > this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i4 = this._outputTail;
        int i5 = i4 + 1;
        this._outputTail = i5;
        bArr[i4] = (byte) ((_decodeSurrogate >> 18) | 240);
        int i6 = i5 + 1;
        this._outputTail = i6;
        bArr[i5] = (byte) (((_decodeSurrogate >> 12) & 63) | 128);
        int i7 = i6 + 1;
        this._outputTail = i7;
        bArr[i6] = (byte) (((_decodeSurrogate >> 6) & 63) | 128);
        this._outputTail = i7 + 1;
        bArr[i7] = (byte) ((_decodeSurrogate & 63) | 128);
    }

    /* access modifiers changed from: protected */
    public void _releaseBuffers() {
        byte[] bArr = this._outputBuffer;
        if (bArr != null && this._bufferRecyclable) {
            this._outputBuffer = null;
            this._ioContext.releaseWriteEncodingBuffer(bArr);
        }
        char[] cArr = this._charBuffer;
        if (cArr != null) {
            this._charBuffer = null;
            this._ioContext.releaseConcatBuffer(cArr);
        }
    }

    /* access modifiers changed from: protected */
    public final void _verifyValueWrite(String str) {
        byte b;
        int writeValue = this._writeContext.writeValue();
        if (this._cfgPrettyPrinter != null) {
            _verifyPrettyValueWrite(str, writeValue);
            return;
        }
        if (writeValue == 1) {
            b = 44;
        } else if (writeValue == 2) {
            b = 58;
        } else if (writeValue == 3) {
            SerializableString serializableString = this._rootValueSeparator;
            if (serializableString != null) {
                byte[] asUnquotedUTF8 = serializableString.asUnquotedUTF8();
                if (asUnquotedUTF8.length > 0) {
                    _writeBytes(asUnquotedUTF8);
                    return;
                }
                return;
            }
            return;
        } else if (writeValue == 5) {
            _reportCantWriteValueExpectName(str);
            throw null;
        } else {
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = b;
    }

    /* access modifiers changed from: protected */
    public final void _writeBinary(Base64Variant base64Variant, byte[] bArr, int i2, int i3) {
        int i4 = i3 - 3;
        int i5 = this._outputEnd - 6;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        while (i2 <= i4) {
            if (this._outputTail > i5) {
                _flushBuffer();
            }
            int i6 = i2 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            int encodeBase64Chunk = base64Variant.encodeBase64Chunk((int) (((bArr[i2] << 8) | (bArr[i6] & 255)) << 8) | (bArr[i7] & 255), this._outputBuffer, this._outputTail);
            this._outputTail = encodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this._outputBuffer;
                int i9 = encodeBase64Chunk + 1;
                this._outputTail = i9;
                bArr2[encodeBase64Chunk] = 92;
                this._outputTail = i9 + 1;
                bArr2[i9] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
            i2 = i8;
        }
        int i10 = i3 - i2;
        if (i10 > 0) {
            if (this._outputTail > i5) {
                _flushBuffer();
            }
            int i11 = i2 + 1;
            int i12 = bArr[i2] << 16;
            if (i10 == 2) {
                i12 |= (bArr[i11] & 255) << 8;
            }
            this._outputTail = base64Variant.encodeBase64Partial(i12, i10, this._outputBuffer, this._outputTail);
        }
    }

    /* access modifiers changed from: protected */
    public final void _writePPFieldName(String str) {
        int writeFieldName = this._writeContext.writeFieldName(str);
        if (writeFieldName != 4) {
            if (writeFieldName == 1) {
                this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
            } else {
                this._cfgPrettyPrinter.beforeObjectEntries(this);
            }
            if (this._cfgUnqNames) {
                _writeStringSegments(str, false);
                return;
            }
            int length = str.length();
            if (length > this._charBufferLength) {
                _writeStringSegments(str, true);
                return;
            }
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            bArr[i2] = this._quoteChar;
            str.getChars(0, length, this._charBuffer, 0);
            if (length <= this._outputMaxContiguous) {
                if (this._outputTail + length > this._outputEnd) {
                    _flushBuffer();
                }
                _writeStringSegment(this._charBuffer, 0, length);
            } else {
                _writeStringSegments(this._charBuffer, 0, length);
            }
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr2 = this._outputBuffer;
            int i3 = this._outputTail;
            this._outputTail = i3 + 1;
            bArr2[i3] = this._quoteChar;
            return;
        }
        _reportError("Can not write a field name, expecting a value");
        throw null;
    }

    public void close() {
        super.close();
        if (this._outputBuffer != null && isEnabled(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                JsonStreamContext outputContext = getOutputContext();
                if (!outputContext.inArray()) {
                    if (!outputContext.inObject()) {
                        break;
                    }
                    writeEndObject();
                } else {
                    writeEndArray();
                }
            }
        }
        _flushBuffer();
        this._outputTail = 0;
        if (this._outputStream != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                this._outputStream.close();
            } else if (isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                this._outputStream.flush();
            }
        }
        _releaseBuffers();
    }

    public void flush() {
        _flushBuffer();
        if (this._outputStream != null && isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            this._outputStream.flush();
        }
    }

    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i2, int i3) {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        bArr2[i4] = this._quoteChar;
        _writeBinary(base64Variant, bArr, i2, i3 + i2);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i5 = this._outputTail;
        this._outputTail = i5 + 1;
        bArr3[i5] = this._quoteChar;
    }

    public void writeBoolean(boolean z) {
        _verifyValueWrite("write a boolean value");
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = z ? TRUE_BYTES : FALSE_BYTES;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this._outputBuffer, this._outputTail, length);
        this._outputTail += length;
    }

    public final void writeEndArray() {
        if (this._writeContext.inArray()) {
            PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
            if (prettyPrinter != null) {
                prettyPrinter.writeEndArray(this, this._writeContext.getEntryCount());
            } else {
                if (this._outputTail >= this._outputEnd) {
                    _flushBuffer();
                }
                byte[] bArr = this._outputBuffer;
                int i2 = this._outputTail;
                this._outputTail = i2 + 1;
                bArr[i2] = 93;
            }
            this._writeContext = this._writeContext.clearAndGetParent();
            return;
        }
        _reportError("Current context not Array but " + this._writeContext.typeDesc());
        throw null;
    }

    public final void writeEndObject() {
        if (this._writeContext.inObject()) {
            PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
            if (prettyPrinter != null) {
                prettyPrinter.writeEndObject(this, this._writeContext.getEntryCount());
            } else {
                if (this._outputTail >= this._outputEnd) {
                    _flushBuffer();
                }
                byte[] bArr = this._outputBuffer;
                int i2 = this._outputTail;
                this._outputTail = i2 + 1;
                bArr[i2] = 125;
            }
            this._writeContext = this._writeContext.clearAndGetParent();
            return;
        }
        _reportError("Current context not Object but " + this._writeContext.typeDesc());
        throw null;
    }

    public void writeFieldName(String str) {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(str);
            return;
        }
        int writeFieldName = this._writeContext.writeFieldName(str);
        if (writeFieldName != 4) {
            if (writeFieldName == 1) {
                if (this._outputTail >= this._outputEnd) {
                    _flushBuffer();
                }
                byte[] bArr = this._outputBuffer;
                int i2 = this._outputTail;
                this._outputTail = i2 + 1;
                bArr[i2] = 44;
            }
            if (this._cfgUnqNames) {
                _writeStringSegments(str, false);
                return;
            }
            int length = str.length();
            if (length > this._charBufferLength) {
                _writeStringSegments(str, true);
                return;
            }
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr2 = this._outputBuffer;
            int i3 = this._outputTail;
            int i4 = i3 + 1;
            this._outputTail = i4;
            bArr2[i3] = this._quoteChar;
            if (length <= this._outputMaxContiguous) {
                if (i4 + length > this._outputEnd) {
                    _flushBuffer();
                }
                _writeStringSegment(str, 0, length);
            } else {
                _writeStringSegments(str, 0, length);
            }
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr3 = this._outputBuffer;
            int i5 = this._outputTail;
            this._outputTail = i5 + 1;
            bArr3[i5] = this._quoteChar;
            return;
        }
        _reportError("Can not write a field name, expecting a value");
        throw null;
    }

    public void writeNull() {
        _verifyValueWrite("write a null");
        _writeNull();
    }

    public void writeNumber(short s) {
        _verifyValueWrite("write a number");
        if (this._outputTail + 6 >= this._outputEnd) {
            _flushBuffer();
        }
        if (this._cfgNumbersAsStrings) {
            _writeQuotedShort(s);
        } else {
            this._outputTail = NumberOutput.outputInt((int) s, this._outputBuffer, this._outputTail);
        }
    }

    public void writeRaw(String str) {
        int length = str.length();
        char[] cArr = this._charBuffer;
        if (length <= cArr.length) {
            str.getChars(0, length, cArr, 0);
            writeRaw(cArr, 0, length);
            return;
        }
        writeRaw(str, 0, length);
    }

    public void writeRawValue(SerializableString serializableString) {
        _verifyValueWrite("write a raw (unencoded) value");
        byte[] asUnquotedUTF8 = serializableString.asUnquotedUTF8();
        if (asUnquotedUTF8.length > 0) {
            _writeBytes(asUnquotedUTF8);
        }
    }

    public final void writeStartArray() {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.createChildArrayContext();
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartArray(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = 91;
    }

    public final void writeStartObject() {
        _verifyValueWrite("start an object");
        this._writeContext = this._writeContext.createChildObjectContext();
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = 123;
    }

    public void writeString(String str) {
        _verifyValueWrite("write a string");
        if (str == null) {
            _writeNull();
            return;
        }
        int length = str.length();
        if (length > this._outputMaxContiguous) {
            _writeStringSegments(str, true);
            return;
        }
        if (this._outputTail + length >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = this._quoteChar;
        _writeStringSegment(str, 0, length);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = this._quoteChar;
    }

    public void writeNumber(int i2) {
        _verifyValueWrite("write a number");
        if (this._outputTail + 11 >= this._outputEnd) {
            _flushBuffer();
        }
        if (this._cfgNumbersAsStrings) {
            _writeQuotedInt(i2);
        } else {
            this._outputTail = NumberOutput.outputInt(i2, this._outputBuffer, this._outputTail);
        }
    }

    public void writeRaw(String str, int i2, int i3) {
        char c;
        char[] cArr = this._charBuffer;
        int length = cArr.length;
        if (i3 <= length) {
            str.getChars(i2, i2 + i3, cArr, 0);
            writeRaw(cArr, 0, i3);
            return;
        }
        int i4 = this._outputEnd;
        int min = Math.min(length, (i4 >> 2) + (i4 >> 4));
        int i5 = min * 3;
        while (i3 > 0) {
            int min2 = Math.min(min, i3);
            str.getChars(i2, i2 + min2, cArr, 0);
            if (this._outputTail + i5 > this._outputEnd) {
                _flushBuffer();
            }
            if (min2 > 1 && (c = cArr[min2 - 1]) >= 55296 && c <= 56319) {
                min2--;
            }
            _writeRawSegment(cArr, 0, min2);
            i2 += min2;
            i3 -= min2;
        }
    }

    public void writeStartObject(Object obj) {
        _verifyValueWrite("start an object");
        JsonWriteContext createChildObjectContext = this._writeContext.createChildObjectContext();
        this._writeContext = createChildObjectContext;
        if (obj != null) {
            createChildObjectContext.setCurrentValue(obj);
        }
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = 123;
    }

    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i2) {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = this._quoteChar;
        byte[] allocBase64Buffer = this._ioContext.allocBase64Buffer();
        if (i2 < 0) {
            try {
                i2 = _writeBinary(base64Variant, inputStream, allocBase64Buffer);
            } catch (Throwable th) {
                this._ioContext.releaseBase64Buffer(allocBase64Buffer);
                throw th;
            }
        } else {
            int _writeBinary = _writeBinary(base64Variant, inputStream, allocBase64Buffer, i2);
            if (_writeBinary > 0) {
                _reportError("Too few bytes available: missing " + _writeBinary + " bytes (out of " + i2 + ")");
                throw null;
            }
        }
        this._ioContext.releaseBase64Buffer(allocBase64Buffer);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        bArr2[i4] = this._quoteChar;
        return i2;
    }

    private final void _writeStringSegments(char[] cArr, int i2, int i3) {
        do {
            int min = Math.min(this._outputMaxContiguous, i3);
            if (this._outputTail + min > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(cArr, i2, min);
            i2 += min;
            i3 -= min;
        } while (i3 > 0);
    }

    private final void _writeStringSegment(String str, int i2, int i3) {
        int i4 = i3 + i2;
        int i5 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i2 < i4) {
            char charAt = str.charAt(i2);
            if (charAt > 127 || iArr[charAt] != 0) {
                break;
            }
            bArr[i5] = (byte) charAt;
            i2++;
            i5++;
        }
        this._outputTail = i5;
        if (i2 >= i4) {
            return;
        }
        if (this._characterEscapes != null) {
            _writeCustomStringSegment2(str, i2, i4);
        } else if (this._maximumNonEscapedChar == 0) {
            _writeStringSegment2(str, i2, i4);
        } else {
            _writeStringSegmentASCII2(str, i2, i4);
        }
    }

    public void writeNumber(long j2) {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedLong(j2);
            return;
        }
        if (this._outputTail + 21 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputLong(j2, this._outputBuffer, this._outputTail);
    }

    public void writeString(char[] cArr, int i2, int i3) {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i4 = this._outputTail;
        int i5 = i4 + 1;
        this._outputTail = i5;
        bArr[i4] = this._quoteChar;
        if (i3 <= this._outputMaxContiguous) {
            if (i5 + i3 > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(cArr, i2, i3);
        } else {
            _writeStringSegments(cArr, i2, i3);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i6 = this._outputTail;
        this._outputTail = i6 + 1;
        bArr2[i6] = this._quoteChar;
    }

    private final void _writeStringSegments(String str, int i2, int i3) {
        do {
            int min = Math.min(this._outputMaxContiguous, i3);
            if (this._outputTail + min > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(str, i2, min);
            i2 += min;
            i3 -= min;
        } while (i3 > 0);
    }

    private final void _writeStringSegment2(String str, int i2, int i3) {
        if (this._outputTail + ((i3 - i2) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i4 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i2 < i3) {
            int i5 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt <= 127) {
                if (iArr[charAt] == 0) {
                    bArr[i4] = (byte) charAt;
                    i2 = i5;
                    i4++;
                } else {
                    int i6 = iArr[charAt];
                    if (i6 > 0) {
                        int i7 = i4 + 1;
                        bArr[i4] = 92;
                        i4 = i7 + 1;
                        bArr[i7] = (byte) i6;
                    } else {
                        i4 = _writeGenericEscape(charAt, i4);
                    }
                }
            } else if (charAt <= 2047) {
                int i8 = i4 + 1;
                bArr[i4] = (byte) ((charAt >> 6) | 192);
                i4 = i8 + 1;
                bArr[i8] = (byte) ((charAt & '?') | 128);
            } else {
                i4 = _outputMultiByteChar(charAt, i4);
            }
            i2 = i5;
        }
        this._outputTail = i4;
    }

    /* access modifiers changed from: protected */
    public final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i2) {
        int _readMore;
        int i3 = this._outputEnd - 6;
        int i4 = 2;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i5 = -3;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i2 <= 2) {
                break;
            }
            if (i6 > i5) {
                i7 = _readMore(inputStream, bArr, i6, i7, i2);
                if (i7 < 3) {
                    i6 = 0;
                    break;
                }
                i5 = i7 - 3;
                i6 = 0;
            }
            if (this._outputTail > i3) {
                _flushBuffer();
            }
            int i8 = i6 + 1;
            int i9 = i8 + 1;
            i6 = i9 + 1;
            i2 -= 3;
            int encodeBase64Chunk = base64Variant.encodeBase64Chunk((int) (((bArr[i8] & 255) | (bArr[i6] << 8)) << 8) | (bArr[i9] & 255), this._outputBuffer, this._outputTail);
            this._outputTail = encodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this._outputBuffer;
                int i10 = encodeBase64Chunk + 1;
                this._outputTail = i10;
                bArr2[encodeBase64Chunk] = 92;
                this._outputTail = i10 + 1;
                bArr2[i10] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i2 <= 0 || (_readMore = _readMore(inputStream, bArr, i6, i7, i2)) <= 0) {
            return i2;
        }
        if (this._outputTail > i3) {
            _flushBuffer();
        }
        int i11 = bArr[0] << 16;
        if (1 < _readMore) {
            i11 |= (bArr[1] & 255) << 8;
        } else {
            i4 = 1;
        }
        this._outputTail = base64Variant.encodeBase64Partial(i11, i4, this._outputBuffer, this._outputTail);
        return i2 - i4;
    }

    public void writeRaw(SerializableString serializableString) {
        byte[] asUnquotedUTF8 = serializableString.asUnquotedUTF8();
        if (asUnquotedUTF8.length > 0) {
            _writeBytes(asUnquotedUTF8);
        }
    }

    private final void _writeStringSegmentASCII2(String str, int i2, int i3) {
        if (this._outputTail + ((i3 - i2) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i4 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i5 = this._maximumNonEscapedChar;
        while (i2 < i3) {
            int i6 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt <= 127) {
                if (iArr[charAt] == 0) {
                    bArr[i4] = (byte) charAt;
                    i2 = i6;
                    i4++;
                } else {
                    int i7 = iArr[charAt];
                    if (i7 > 0) {
                        int i8 = i4 + 1;
                        bArr[i4] = 92;
                        i4 = i8 + 1;
                        bArr[i8] = (byte) i7;
                    } else {
                        i4 = _writeGenericEscape(charAt, i4);
                    }
                }
            } else if (charAt > i5) {
                i4 = _writeGenericEscape(charAt, i4);
            } else if (charAt <= 2047) {
                int i9 = i4 + 1;
                bArr[i4] = (byte) ((charAt >> 6) | 192);
                i4 = i9 + 1;
                bArr[i9] = (byte) ((charAt & '?') | 128);
            } else {
                i4 = _outputMultiByteChar(charAt, i4);
            }
            i2 = i6;
        }
        this._outputTail = i4;
    }

    public void writeNumber(BigInteger bigInteger) {
        _verifyValueWrite("write a number");
        if (bigInteger == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(bigInteger.toString());
        } else {
            writeRaw(bigInteger.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r0 = r7 + 1;
        r7 = r6[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r7 >= 2048) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r1 = r5._outputBuffer;
        r2 = r5._outputTail;
        r3 = r2 + 1;
        r5._outputTail = r3;
        r1[r2] = (byte) ((r7 >> 6) | 192);
        r5._outputTail = r3 + 1;
        r1[r3] = (byte) ((r7 & '?') | 128);
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        r7 = _outputRawMultiByteChar(r7, r6, r0, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeRaw(char[] r6, int r7, int r8) {
        /*
            r5 = this;
            int r0 = r8 + r8
            int r0 = r0 + r8
            int r1 = r5._outputTail
            int r1 = r1 + r0
            int r2 = r5._outputEnd
            if (r1 <= r2) goto L_0x0013
            if (r2 >= r0) goto L_0x0010
            r5._writeSegmentedRaw(r6, r7, r8)
            return
        L_0x0010:
            r5._flushBuffer()
        L_0x0013:
            int r8 = r8 + r7
        L_0x0014:
            if (r7 >= r8) goto L_0x0054
        L_0x0016:
            char r0 = r6[r7]
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L_0x0045
            int r0 = r7 + 1
            char r7 = r6[r7]
            r1 = 2048(0x800, float:2.87E-42)
            if (r7 >= r1) goto L_0x0040
            byte[] r1 = r5._outputBuffer
            int r2 = r5._outputTail
            int r3 = r2 + 1
            r5._outputTail = r3
            int r4 = r7 >> 6
            r4 = r4 | 192(0xc0, float:2.69E-43)
            byte r4 = (byte) r4
            r1[r2] = r4
            int r2 = r3 + 1
            r5._outputTail = r2
            r7 = r7 & 63
            r7 = r7 | 128(0x80, float:1.794E-43)
            byte r7 = (byte) r7
            r1[r3] = r7
            r7 = r0
            goto L_0x0014
        L_0x0040:
            int r7 = r5._outputRawMultiByteChar(r7, r6, r0, r8)
            goto L_0x0014
        L_0x0045:
            byte[] r1 = r5._outputBuffer
            int r2 = r5._outputTail
            int r3 = r2 + 1
            r5._outputTail = r3
            byte r0 = (byte) r0
            r1[r2] = r0
            int r7 = r7 + 1
            if (r7 < r8) goto L_0x0016
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeRaw(char[], int, int):void");
    }

    /* access modifiers changed from: protected */
    public final void _writePPFieldName(SerializableString serializableString) {
        int writeFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (writeFieldName != 4) {
            if (writeFieldName == 1) {
                this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
            } else {
                this._cfgPrettyPrinter.beforeObjectEntries(this);
            }
            boolean z = !this._cfgUnqNames;
            if (z) {
                if (this._outputTail >= this._outputEnd) {
                    _flushBuffer();
                }
                byte[] bArr = this._outputBuffer;
                int i2 = this._outputTail;
                this._outputTail = i2 + 1;
                bArr[i2] = this._quoteChar;
            }
            _writeBytes(serializableString.asQuotedUTF8());
            if (z) {
                if (this._outputTail >= this._outputEnd) {
                    _flushBuffer();
                }
                byte[] bArr2 = this._outputBuffer;
                int i3 = this._outputTail;
                this._outputTail = i3 + 1;
                bArr2[i3] = this._quoteChar;
                return;
            }
            return;
        }
        _reportError("Can not write a field name, expecting a value");
        throw null;
    }

    public void writeFieldName(SerializableString serializableString) {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(serializableString);
            return;
        }
        int writeFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (writeFieldName != 4) {
            if (writeFieldName == 1) {
                if (this._outputTail >= this._outputEnd) {
                    _flushBuffer();
                }
                byte[] bArr = this._outputBuffer;
                int i2 = this._outputTail;
                this._outputTail = i2 + 1;
                bArr[i2] = 44;
            }
            if (this._cfgUnqNames) {
                _writeUnq(serializableString);
                return;
            }
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr2 = this._outputBuffer;
            int i3 = this._outputTail;
            int i4 = i3 + 1;
            this._outputTail = i4;
            bArr2[i3] = this._quoteChar;
            int appendQuotedUTF8 = serializableString.appendQuotedUTF8(bArr2, i4);
            if (appendQuotedUTF8 < 0) {
                _writeBytes(serializableString.asQuotedUTF8());
            } else {
                this._outputTail += appendQuotedUTF8;
            }
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr3 = this._outputBuffer;
            int i5 = this._outputTail;
            this._outputTail = i5 + 1;
            bArr3[i5] = this._quoteChar;
            return;
        }
        _reportError("Can not write a field name, expecting a value");
        throw null;
    }

    public void writeNumber(double d2) {
        if (this._cfgNumbersAsStrings || ((Double.isNaN(d2) || Double.isInfinite(d2)) && JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this._features))) {
            writeString(String.valueOf(d2));
            return;
        }
        _verifyValueWrite("write a number");
        writeRaw(String.valueOf(d2));
    }

    public final void writeString(SerializableString serializableString) {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        int i3 = i2 + 1;
        this._outputTail = i3;
        bArr[i2] = this._quoteChar;
        int appendQuotedUTF8 = serializableString.appendQuotedUTF8(bArr, i3);
        if (appendQuotedUTF8 < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += appendQuotedUTF8;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        bArr2[i4] = this._quoteChar;
    }

    private final void _writeCustomStringSegment2(String str, int i2, int i3) {
        if (this._outputTail + ((i3 - i2) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i4 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i5 = this._maximumNonEscapedChar;
        if (i5 <= 0) {
            i5 = 65535;
        }
        CharacterEscapes characterEscapes = this._characterEscapes;
        while (i2 < i3) {
            int i6 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt <= 127) {
                if (iArr[charAt] == 0) {
                    bArr[i4] = (byte) charAt;
                    i2 = i6;
                    i4++;
                } else {
                    int i7 = iArr[charAt];
                    if (i7 > 0) {
                        int i8 = i4 + 1;
                        bArr[i4] = 92;
                        i4 = i8 + 1;
                        bArr[i8] = (byte) i7;
                    } else if (i7 == -2) {
                        SerializableString escapeSequence = characterEscapes.getEscapeSequence(charAt);
                        if (escapeSequence != null) {
                            i4 = _writeCustomEscape(bArr, i4, escapeSequence, i3 - i6);
                        } else {
                            _reportError("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(charAt) + ", although was supposed to have one");
                            throw null;
                        }
                    } else {
                        i4 = _writeGenericEscape(charAt, i4);
                    }
                }
            } else if (charAt > i5) {
                i4 = _writeGenericEscape(charAt, i4);
            } else {
                SerializableString escapeSequence2 = characterEscapes.getEscapeSequence(charAt);
                if (escapeSequence2 != null) {
                    i4 = _writeCustomEscape(bArr, i4, escapeSequence2, i3 - i6);
                } else if (charAt <= 2047) {
                    int i9 = i4 + 1;
                    bArr[i4] = (byte) ((charAt >> 6) | 192);
                    i4 = i9 + 1;
                    bArr[i9] = (byte) ((charAt & '?') | 128);
                } else {
                    i4 = _outputMultiByteChar(charAt, i4);
                }
            }
            i2 = i6;
        }
        this._outputTail = i4;
    }

    public void writeNumber(float f2) {
        if (this._cfgNumbersAsStrings || ((Float.isNaN(f2) || Float.isInfinite(f2)) && JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this._features))) {
            writeString(String.valueOf(f2));
            return;
        }
        _verifyValueWrite("write a number");
        writeRaw(String.valueOf(f2));
    }

    public void writeRaw(char c) {
        if (this._outputTail + 3 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        if (c <= 127) {
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            bArr[i2] = (byte) c;
        } else if (c < 2048) {
            int i3 = this._outputTail;
            int i4 = i3 + 1;
            this._outputTail = i4;
            bArr[i3] = (byte) ((c >> 6) | 192);
            this._outputTail = i4 + 1;
            bArr[i4] = (byte) ((c & '?') | 128);
        } else {
            _outputRawMultiByteChar(c, (char[]) null, 0, 0);
        }
    }

    /* access modifiers changed from: protected */
    public final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) {
        int i2 = this._outputEnd - 6;
        int i3 = 2;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i4 = -3;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i5 > i4) {
                i6 = _readMore(inputStream, bArr, i5, i6, bArr.length);
                if (i6 < 3) {
                    break;
                }
                i4 = i6 - 3;
                i5 = 0;
            }
            if (this._outputTail > i2) {
                _flushBuffer();
            }
            int i8 = i5 + 1;
            int i9 = i8 + 1;
            i5 = i9 + 1;
            i7 += 3;
            int encodeBase64Chunk = base64Variant.encodeBase64Chunk((int) (((bArr[i8] & 255) | (bArr[i5] << 8)) << 8) | (bArr[i9] & 255), this._outputBuffer, this._outputTail);
            this._outputTail = encodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this._outputBuffer;
                int i10 = encodeBase64Chunk + 1;
                this._outputTail = i10;
                bArr2[encodeBase64Chunk] = 92;
                this._outputTail = i10 + 1;
                bArr2[i10] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i6 <= 0) {
            return i7;
        }
        if (this._outputTail > i2) {
            _flushBuffer();
        }
        int i11 = bArr[0] << 16;
        if (1 < i6) {
            i11 |= (bArr[1] & 255) << 8;
        } else {
            i3 = 1;
        }
        int i12 = i7 + i3;
        this._outputTail = base64Variant.encodeBase64Partial(i11, i3, this._outputBuffer, this._outputTail);
        return i12;
    }

    public void writeNumber(BigDecimal bigDecimal) {
        _verifyValueWrite("write a number");
        if (bigDecimal == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(_asString(bigDecimal));
        } else {
            writeRaw(_asString(bigDecimal));
        }
    }

    public void writeNumber(String str) {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(str);
        } else {
            writeRaw(str);
        }
    }
}
