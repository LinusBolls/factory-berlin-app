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
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

public class WriterBasedJsonGenerator extends JsonGeneratorImpl {
    protected static final char[] HEX_CHARS = CharTypes.copyHexChars();
    protected char[] _charBuffer;
    protected SerializableString _currentEscape;
    protected char[] _entityBuffer;
    protected char[] _outputBuffer;
    protected int _outputEnd;
    protected int _outputHead;
    protected int _outputTail;
    protected char _quoteChar = '\"';
    protected final Writer _writer;

    public WriterBasedJsonGenerator(IOContext iOContext, int i2, ObjectCodec objectCodec, Writer writer) {
        super(iOContext, i2, objectCodec);
        this._writer = writer;
        char[] allocConcatBuffer = iOContext.allocConcatBuffer();
        this._outputBuffer = allocConcatBuffer;
        this._outputEnd = allocConcatBuffer.length;
    }

    private char[] _allocateEntityBuffer() {
        char[] cArr = new char[14];
        cArr[0] = '\\';
        cArr[2] = '\\';
        cArr[3] = 'u';
        cArr[4] = '0';
        cArr[5] = '0';
        cArr[8] = '\\';
        cArr[9] = 'u';
        this._entityBuffer = cArr;
        return cArr;
    }

    private void _appendCharacterEscape(char c, int i2) {
        String str;
        int i3;
        if (i2 >= 0) {
            if (this._outputTail + 2 > this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr = this._outputBuffer;
            int i4 = this._outputTail;
            int i5 = i4 + 1;
            this._outputTail = i5;
            cArr[i4] = '\\';
            this._outputTail = i5 + 1;
            cArr[i5] = (char) i2;
        } else if (i2 != -2) {
            if (this._outputTail + 5 >= this._outputEnd) {
                _flushBuffer();
            }
            int i6 = this._outputTail;
            char[] cArr2 = this._outputBuffer;
            int i7 = i6 + 1;
            cArr2[i6] = '\\';
            int i8 = i7 + 1;
            cArr2[i7] = 'u';
            if (c > 255) {
                int i9 = 255 & (c >> 8);
                int i10 = i8 + 1;
                char[] cArr3 = HEX_CHARS;
                cArr2[i8] = cArr3[i9 >> 4];
                i3 = i10 + 1;
                cArr2[i10] = cArr3[i9 & 15];
                c = (char) (c & 255);
            } else {
                int i11 = i8 + 1;
                cArr2[i8] = '0';
                i3 = i11 + 1;
                cArr2[i11] = '0';
            }
            int i12 = i3 + 1;
            char[] cArr4 = HEX_CHARS;
            cArr2[i3] = cArr4[c >> 4];
            cArr2[i12] = cArr4[c & 15];
            this._outputTail = i12 + 1;
        } else {
            SerializableString serializableString = this._currentEscape;
            if (serializableString == null) {
                str = this._characterEscapes.getEscapeSequence(c).getValue();
            } else {
                str = serializableString.getValue();
                this._currentEscape = null;
            }
            int length = str.length();
            if (this._outputTail + length > this._outputEnd) {
                _flushBuffer();
                if (length > this._outputEnd) {
                    this._writer.write(str);
                    return;
                }
            }
            str.getChars(0, length, this._outputBuffer, this._outputTail);
            this._outputTail += length;
        }
    }

    private void _prependOrWriteCharacterEscape(char c, int i2) {
        String str;
        int i3;
        if (i2 >= 0) {
            int i4 = this._outputTail;
            if (i4 >= 2) {
                int i5 = i4 - 2;
                this._outputHead = i5;
                char[] cArr = this._outputBuffer;
                cArr[i5] = '\\';
                cArr[i5 + 1] = (char) i2;
                return;
            }
            char[] cArr2 = this._entityBuffer;
            if (cArr2 == null) {
                cArr2 = _allocateEntityBuffer();
            }
            this._outputHead = this._outputTail;
            cArr2[1] = (char) i2;
            this._writer.write(cArr2, 0, 2);
        } else if (i2 != -2) {
            int i6 = this._outputTail;
            if (i6 >= 6) {
                char[] cArr3 = this._outputBuffer;
                int i7 = i6 - 6;
                this._outputHead = i7;
                cArr3[i7] = '\\';
                int i8 = i7 + 1;
                cArr3[i8] = 'u';
                if (c > 255) {
                    int i9 = (c >> 8) & 255;
                    int i10 = i8 + 1;
                    char[] cArr4 = HEX_CHARS;
                    cArr3[i10] = cArr4[i9 >> 4];
                    i3 = i10 + 1;
                    cArr3[i3] = cArr4[i9 & 15];
                    c = (char) (c & 255);
                } else {
                    int i11 = i8 + 1;
                    cArr3[i11] = '0';
                    i3 = i11 + 1;
                    cArr3[i3] = '0';
                }
                int i12 = i3 + 1;
                char[] cArr5 = HEX_CHARS;
                cArr3[i12] = cArr5[c >> 4];
                cArr3[i12 + 1] = cArr5[c & 15];
                return;
            }
            char[] cArr6 = this._entityBuffer;
            if (cArr6 == null) {
                cArr6 = _allocateEntityBuffer();
            }
            this._outputHead = this._outputTail;
            if (c > 255) {
                int i13 = (c >> 8) & 255;
                char c2 = c & 255;
                char[] cArr7 = HEX_CHARS;
                cArr6[10] = cArr7[i13 >> 4];
                cArr6[11] = cArr7[i13 & 15];
                cArr6[12] = cArr7[c2 >> 4];
                cArr6[13] = cArr7[c2 & 15];
                this._writer.write(cArr6, 8, 6);
                return;
            }
            char[] cArr8 = HEX_CHARS;
            cArr6[6] = cArr8[c >> 4];
            cArr6[7] = cArr8[c & 15];
            this._writer.write(cArr6, 2, 6);
        } else {
            SerializableString serializableString = this._currentEscape;
            if (serializableString == null) {
                str = this._characterEscapes.getEscapeSequence(c).getValue();
            } else {
                str = serializableString.getValue();
                this._currentEscape = null;
            }
            int length = str.length();
            int i14 = this._outputTail;
            if (i14 >= length) {
                int i15 = i14 - length;
                this._outputHead = i15;
                str.getChars(0, length, this._outputBuffer, i15);
                return;
            }
            this._outputHead = i14;
            this._writer.write(str);
        }
    }

    private int _readMore(InputStream inputStream, byte[] bArr, int i2, int i3, int i4) {
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

    private void _writeLongString(String str) {
        _flushBuffer();
        int length = str.length();
        int i2 = 0;
        while (true) {
            int i3 = this._outputEnd;
            if (i2 + i3 > length) {
                i3 = length - i2;
            }
            int i4 = i2 + i3;
            str.getChars(i2, i4, this._outputBuffer, 0);
            if (this._characterEscapes != null) {
                _writeSegmentCustom(i3);
            } else {
                int i5 = this._maximumNonEscapedChar;
                if (i5 != 0) {
                    _writeSegmentASCII(i3, i5);
                } else {
                    _writeSegment(i3);
                }
            }
            if (i4 < length) {
                i2 = i4;
            } else {
                return;
            }
        }
    }

    private final void _writeNull() {
        if (this._outputTail + 4 >= this._outputEnd) {
            _flushBuffer();
        }
        int i2 = this._outputTail;
        char[] cArr = this._outputBuffer;
        cArr[i2] = 'n';
        int i3 = i2 + 1;
        cArr[i3] = 'u';
        int i4 = i3 + 1;
        cArr[i4] = 'l';
        int i5 = i4 + 1;
        cArr[i5] = 'l';
        this._outputTail = i5 + 1;
    }

    private void _writeQuotedInt(int i2) {
        if (this._outputTail + 13 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        int i4 = i3 + 1;
        this._outputTail = i4;
        cArr[i3] = this._quoteChar;
        int outputInt = NumberOutput.outputInt(i2, cArr, i4);
        this._outputTail = outputInt;
        char[] cArr2 = this._outputBuffer;
        this._outputTail = outputInt + 1;
        cArr2[outputInt] = this._quoteChar;
    }

    private void _writeQuotedLong(long j2) {
        if (this._outputTail + 23 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        int i3 = i2 + 1;
        this._outputTail = i3;
        cArr[i2] = this._quoteChar;
        int outputLong = NumberOutput.outputLong(j2, cArr, i3);
        this._outputTail = outputLong;
        char[] cArr2 = this._outputBuffer;
        this._outputTail = outputLong + 1;
        cArr2[outputLong] = this._quoteChar;
    }

    private void _writeQuotedRaw(String str) {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = this._quoteChar;
        writeRaw(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = this._quoteChar;
    }

    private void _writeQuotedShort(short s) {
        if (this._outputTail + 8 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        int i3 = i2 + 1;
        this._outputTail = i3;
        cArr[i2] = this._quoteChar;
        int outputInt = NumberOutput.outputInt((int) s, cArr, i3);
        this._outputTail = outputInt;
        char[] cArr2 = this._outputBuffer;
        this._outputTail = outputInt + 1;
        cArr2[outputInt] = this._quoteChar;
    }

    private void _writeSegment(int i2) {
        char c;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            do {
                c = this._outputBuffer[i3];
                if ((c < length && iArr[c] != 0) || (i3 = i3 + 1) >= i2) {
                    int i5 = i3 - i4;
                }
                c = this._outputBuffer[i3];
                break;
            } while ((i3 = i3 + 1) >= i2);
            int i52 = i3 - i4;
            if (i52 > 0) {
                this._writer.write(this._outputBuffer, i4, i52);
                if (i3 >= i2) {
                    return;
                }
            }
            i3++;
            i4 = _prependOrWriteCharacterEscape(this._outputBuffer, i3, i2, c, iArr[c]);
        }
    }

    private void _writeSegmentASCII(int i2, int i3) {
        char c;
        int[] iArr = this._outputEscapes;
        int min = Math.min(iArr.length, i3 + 1);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < i2) {
            while (true) {
                c = this._outputBuffer[i4];
                if (c >= min) {
                    if (c > i3) {
                        i6 = -1;
                        break;
                    }
                } else {
                    i6 = iArr[c];
                    if (i6 != 0) {
                        break;
                    }
                }
                i4++;
                if (i4 >= i2) {
                    break;
                }
            }
            int i7 = i4 - i5;
            if (i7 > 0) {
                this._writer.write(this._outputBuffer, i5, i7);
                if (i4 >= i2) {
                    return;
                }
            }
            i4++;
            i5 = _prependOrWriteCharacterEscape(this._outputBuffer, i4, i2, c, i6);
        }
    }

    private void _writeSegmentCustom(int i2) {
        char c;
        int[] iArr = this._outputEscapes;
        int i3 = this._maximumNonEscapedChar;
        if (i3 < 1) {
            i3 = 65535;
        }
        int min = Math.min(iArr.length, i3 + 1);
        CharacterEscapes characterEscapes = this._characterEscapes;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < i2) {
            while (true) {
                c = this._outputBuffer[i4];
                if (c >= min) {
                    if (c <= i3) {
                        SerializableString escapeSequence = characterEscapes.getEscapeSequence(c);
                        this._currentEscape = escapeSequence;
                        if (escapeSequence != null) {
                            i6 = -2;
                            break;
                        }
                    } else {
                        i6 = -1;
                        break;
                    }
                } else {
                    i6 = iArr[c];
                    if (i6 != 0) {
                        break;
                    }
                }
                i4++;
                if (i4 >= i2) {
                    break;
                }
            }
            int i7 = i4 - i5;
            if (i7 > 0) {
                this._writer.write(this._outputBuffer, i5, i7);
                if (i4 >= i2) {
                    return;
                }
            }
            i4++;
            i5 = _prependOrWriteCharacterEscape(this._outputBuffer, i4, i2, c, i6);
        }
    }

    private void _writeString(String str) {
        int length = str.length();
        int i2 = this._outputEnd;
        if (length > i2) {
            _writeLongString(str);
            return;
        }
        if (this._outputTail + length > i2) {
            _flushBuffer();
        }
        str.getChars(0, length, this._outputBuffer, this._outputTail);
        if (this._characterEscapes != null) {
            _writeStringCustom(length);
            return;
        }
        int i3 = this._maximumNonEscapedChar;
        if (i3 != 0) {
            _writeStringASCII(length, i3);
        } else {
            _writeString2(length);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r2 = r6._outputBuffer;
        r3 = r6._outputTail;
        r6._outputTail = r3 + 1;
        r2 = r2[r3];
        _prependOrWriteCharacterEscape(r2, r7[r2]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        r4 = r6._outputHead;
        r3 = r3 - r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r3 <= 0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r6._writer.write(r2, r4, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void _writeString2(int r7) {
        /*
            r6 = this;
            int r0 = r6._outputTail
            int r0 = r0 + r7
            int[] r7 = r6._outputEscapes
            int r1 = r7.length
        L_0x0006:
            int r2 = r6._outputTail
            if (r2 >= r0) goto L_0x0038
        L_0x000a:
            char[] r2 = r6._outputBuffer
            int r3 = r6._outputTail
            char r4 = r2[r3]
            if (r4 >= r1) goto L_0x0030
            r4 = r7[r4]
            if (r4 == 0) goto L_0x0030
            int r4 = r6._outputHead
            int r3 = r3 - r4
            if (r3 <= 0) goto L_0x0020
            java.io.Writer r5 = r6._writer
            r5.write(r2, r4, r3)
        L_0x0020:
            char[] r2 = r6._outputBuffer
            int r3 = r6._outputTail
            int r4 = r3 + 1
            r6._outputTail = r4
            char r2 = r2[r3]
            r3 = r7[r2]
            r6._prependOrWriteCharacterEscape(r2, r3)
            goto L_0x0006
        L_0x0030:
            int r2 = r6._outputTail
            int r2 = r2 + 1
            r6._outputTail = r2
            if (r2 < r0) goto L_0x000a
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString2(int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void _writeStringASCII(int r9, int r10) {
        /*
            r8 = this;
            int r0 = r8._outputTail
            int r0 = r0 + r9
            int[] r9 = r8._outputEscapes
            int r1 = r9.length
            int r2 = r10 + 1
            int r1 = java.lang.Math.min(r1, r2)
        L_0x000c:
            int r2 = r8._outputTail
            if (r2 >= r0) goto L_0x0040
        L_0x0010:
            char[] r2 = r8._outputBuffer
            int r3 = r8._outputTail
            char r2 = r2[r3]
            if (r2 >= r1) goto L_0x001d
            r3 = r9[r2]
            if (r3 == 0) goto L_0x0038
            goto L_0x0020
        L_0x001d:
            if (r2 <= r10) goto L_0x0038
            r3 = -1
        L_0x0020:
            int r4 = r8._outputTail
            int r5 = r8._outputHead
            int r4 = r4 - r5
            if (r4 <= 0) goto L_0x002e
            java.io.Writer r6 = r8._writer
            char[] r7 = r8._outputBuffer
            r6.write(r7, r5, r4)
        L_0x002e:
            int r4 = r8._outputTail
            int r4 = r4 + 1
            r8._outputTail = r4
            r8._prependOrWriteCharacterEscape(r2, r3)
            goto L_0x000c
        L_0x0038:
            int r2 = r8._outputTail
            int r2 = r2 + 1
            r8._outputTail = r2
            if (r2 < r0) goto L_0x0010
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeStringASCII(int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void _writeStringCustom(int r12) {
        /*
            r11 = this;
            int r0 = r11._outputTail
            int r0 = r0 + r12
            int[] r12 = r11._outputEscapes
            int r1 = r11._maximumNonEscapedChar
            r2 = 1
            if (r1 >= r2) goto L_0x000d
            r1 = 65535(0xffff, float:9.1834E-41)
        L_0x000d:
            int r3 = r12.length
            int r4 = r1 + 1
            int r3 = java.lang.Math.min(r3, r4)
            com.fasterxml.jackson.core.io.CharacterEscapes r4 = r11._characterEscapes
        L_0x0016:
            int r5 = r11._outputTail
            if (r5 >= r0) goto L_0x0052
        L_0x001a:
            char[] r5 = r11._outputBuffer
            int r6 = r11._outputTail
            char r5 = r5[r6]
            if (r5 >= r3) goto L_0x0027
            r6 = r12[r5]
            if (r6 == 0) goto L_0x004b
            goto L_0x0034
        L_0x0027:
            if (r5 <= r1) goto L_0x002b
            r6 = -1
            goto L_0x0034
        L_0x002b:
            com.fasterxml.jackson.core.SerializableString r6 = r4.getEscapeSequence(r5)
            r11._currentEscape = r6
            if (r6 == 0) goto L_0x004b
            r6 = -2
        L_0x0034:
            int r7 = r11._outputTail
            int r8 = r11._outputHead
            int r7 = r7 - r8
            if (r7 <= 0) goto L_0x0042
            java.io.Writer r9 = r11._writer
            char[] r10 = r11._outputBuffer
            r9.write(r10, r8, r7)
        L_0x0042:
            int r7 = r11._outputTail
            int r7 = r7 + r2
            r11._outputTail = r7
            r11._prependOrWriteCharacterEscape(r5, r6)
            goto L_0x0016
        L_0x004b:
            int r5 = r11._outputTail
            int r5 = r5 + r2
            r11._outputTail = r5
            if (r5 < r0) goto L_0x001a
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeStringCustom(int):void");
    }

    private void writeRawLong(String str) {
        int i2 = this._outputEnd;
        int i3 = this._outputTail;
        int i4 = i2 - i3;
        str.getChars(0, i4, this._outputBuffer, i3);
        this._outputTail += i4;
        _flushBuffer();
        int length = str.length() - i4;
        while (true) {
            int i5 = this._outputEnd;
            if (length > i5) {
                int i6 = i4 + i5;
                str.getChars(i4, i6, this._outputBuffer, 0);
                this._outputHead = 0;
                this._outputTail = i5;
                _flushBuffer();
                length -= i5;
                i4 = i6;
            } else {
                str.getChars(i4, i4 + length, this._outputBuffer, 0);
                this._outputHead = 0;
                this._outputTail = length;
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void _flushBuffer() {
        int i2 = this._outputTail;
        int i3 = this._outputHead;
        int i4 = i2 - i3;
        if (i4 > 0) {
            this._outputHead = 0;
            this._outputTail = 0;
            this._writer.write(this._outputBuffer, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void _releaseBuffers() {
        char[] cArr = this._outputBuffer;
        if (cArr != null) {
            this._outputBuffer = null;
            this._ioContext.releaseConcatBuffer(cArr);
        }
        char[] cArr2 = this._charBuffer;
        if (cArr2 != null) {
            this._charBuffer = null;
            this._ioContext.releaseNameCopyBuffer(cArr2);
        }
    }

    /* access modifiers changed from: protected */
    public final void _verifyValueWrite(String str) {
        char c;
        int writeValue = this._writeContext.writeValue();
        if (this._cfgPrettyPrinter != null) {
            _verifyPrettyValueWrite(str, writeValue);
            return;
        }
        if (writeValue == 1) {
            c = ',';
        } else if (writeValue == 2) {
            c = ':';
        } else if (writeValue == 3) {
            SerializableString serializableString = this._rootValueSeparator;
            if (serializableString != null) {
                writeRaw(serializableString.getValue());
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
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = c;
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
                char[] cArr = this._outputBuffer;
                int i9 = encodeBase64Chunk + 1;
                this._outputTail = i9;
                cArr[encodeBase64Chunk] = '\\';
                this._outputTail = i9 + 1;
                cArr[i9] = 'n';
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
    public final void _writeFieldName(String str, boolean z) {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(str, z);
            return;
        }
        if (this._outputTail + 1 >= this._outputEnd) {
            _flushBuffer();
        }
        if (z) {
            char[] cArr = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            cArr[i2] = ',';
        }
        if (this._cfgUnqNames) {
            _writeString(str);
            return;
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = this._quoteChar;
        _writeString(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr3 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        cArr3[i4] = this._quoteChar;
    }

    /* access modifiers changed from: protected */
    public final void _writePPFieldName(String str, boolean z) {
        if (z) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        if (this._cfgUnqNames) {
            _writeString(str);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = this._quoteChar;
        _writeString(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = this._quoteChar;
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
        this._outputHead = 0;
        this._outputTail = 0;
        if (this._writer != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                this._writer.close();
            } else if (isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                this._writer.flush();
            }
        }
        _releaseBuffers();
    }

    public void flush() {
        _flushBuffer();
        if (this._writer != null && isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            this._writer.flush();
        }
    }

    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i2, int i3) {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        cArr[i4] = this._quoteChar;
        _writeBinary(base64Variant, bArr, i2, i3 + i2);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i5 = this._outputTail;
        this._outputTail = i5 + 1;
        cArr2[i5] = this._quoteChar;
    }

    public void writeBoolean(boolean z) {
        int i2;
        _verifyValueWrite("write a boolean value");
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        int i3 = this._outputTail;
        char[] cArr = this._outputBuffer;
        if (z) {
            cArr[i3] = 't';
            int i4 = i3 + 1;
            cArr[i4] = 'r';
            int i5 = i4 + 1;
            cArr[i5] = 'u';
            i2 = i5 + 1;
            cArr[i2] = 'e';
        } else {
            cArr[i3] = 'f';
            int i6 = i3 + 1;
            cArr[i6] = 'a';
            int i7 = i6 + 1;
            cArr[i7] = 'l';
            int i8 = i7 + 1;
            cArr[i8] = 's';
            i2 = i8 + 1;
            cArr[i2] = 'e';
        }
        this._outputTail = i2 + 1;
    }

    public void writeEndArray() {
        if (this._writeContext.inArray()) {
            PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
            if (prettyPrinter != null) {
                prettyPrinter.writeEndArray(this, this._writeContext.getEntryCount());
            } else {
                if (this._outputTail >= this._outputEnd) {
                    _flushBuffer();
                }
                char[] cArr = this._outputBuffer;
                int i2 = this._outputTail;
                this._outputTail = i2 + 1;
                cArr[i2] = ']';
            }
            this._writeContext = this._writeContext.clearAndGetParent();
            return;
        }
        _reportError("Current context not Array but " + this._writeContext.typeDesc());
        throw null;
    }

    public void writeEndObject() {
        if (this._writeContext.inObject()) {
            PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
            if (prettyPrinter != null) {
                prettyPrinter.writeEndObject(this, this._writeContext.getEntryCount());
            } else {
                if (this._outputTail >= this._outputEnd) {
                    _flushBuffer();
                }
                char[] cArr = this._outputBuffer;
                int i2 = this._outputTail;
                this._outputTail = i2 + 1;
                cArr[i2] = '}';
            }
            this._writeContext = this._writeContext.clearAndGetParent();
            return;
        }
        _reportError("Current context not Object but " + this._writeContext.typeDesc());
        throw null;
    }

    public void writeFieldName(String str) {
        int writeFieldName = this._writeContext.writeFieldName(str);
        if (writeFieldName != 4) {
            boolean z = true;
            if (writeFieldName != 1) {
                z = false;
            }
            _writeFieldName(str, z);
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
        if (this._cfgNumbersAsStrings) {
            _writeQuotedShort(s);
            return;
        }
        if (this._outputTail + 6 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputInt((int) s, this._outputBuffer, this._outputTail);
    }

    public void writeRaw(String str) {
        int length = str.length();
        int i2 = this._outputEnd - this._outputTail;
        if (i2 == 0) {
            _flushBuffer();
            i2 = this._outputEnd - this._outputTail;
        }
        if (i2 >= length) {
            str.getChars(0, length, this._outputBuffer, this._outputTail);
            this._outputTail += length;
            return;
        }
        writeRawLong(str);
    }

    public void writeStartArray() {
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
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = '[';
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
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = '{';
    }

    public void writeString(String str) {
        _verifyValueWrite("write a string");
        if (str == null) {
            _writeNull();
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = this._quoteChar;
        _writeString(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = this._quoteChar;
    }

    public void writeFieldName(SerializableString serializableString) {
        int writeFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (writeFieldName != 4) {
            boolean z = true;
            if (writeFieldName != 1) {
                z = false;
            }
            _writeFieldName(serializableString, z);
            return;
        }
        _reportError("Can not write a field name, expecting a value");
        throw null;
    }

    public void writeNumber(int i2) {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedInt(i2);
            return;
        }
        if (this._outputTail + 11 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputInt(i2, this._outputBuffer, this._outputTail);
    }

    public void writeRaw(SerializableString serializableString) {
        writeRaw(serializableString.getValue());
    }

    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i2) {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr[i3] = this._quoteChar;
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
        char[] cArr2 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        cArr2[i4] = this._quoteChar;
        return i2;
    }

    public void writeRaw(char[] cArr, int i2, int i3) {
        if (i3 < 32) {
            if (i3 > this._outputEnd - this._outputTail) {
                _flushBuffer();
            }
            System.arraycopy(cArr, i2, this._outputBuffer, this._outputTail, i3);
            this._outputTail += i3;
            return;
        }
        _flushBuffer();
        this._writer.write(cArr, i2, i3);
    }

    public void writeStartObject() {
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
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = '{';
    }

    public void writeString(char[] cArr, int i2, int i3) {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        cArr2[i4] = this._quoteChar;
        _writeString(cArr, i2, i3);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr3 = this._outputBuffer;
        int i5 = this._outputTail;
        this._outputTail = i5 + 1;
        cArr3[i5] = this._quoteChar;
    }

    private void _writeString(char[] cArr, int i2, int i3) {
        if (this._characterEscapes != null) {
            _writeStringCustom(cArr, i2, i3);
            return;
        }
        int i4 = this._maximumNonEscapedChar;
        if (i4 != 0) {
            _writeStringASCII(cArr, i2, i3, i4);
            return;
        }
        int i5 = i3 + i2;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        while (i2 < i5) {
            int i6 = i2;
            do {
                char c = cArr[i6];
                if ((c < length && iArr[c] != 0) || (i6 = i6 + 1) >= i5) {
                    int i7 = i6 - i2;
                }
                char c2 = cArr[i6];
                break;
            } while ((i6 = i6 + 1) >= i5);
            int i72 = i6 - i2;
            if (i72 < 32) {
                if (this._outputTail + i72 > this._outputEnd) {
                    _flushBuffer();
                }
                if (i72 > 0) {
                    System.arraycopy(cArr, i2, this._outputBuffer, this._outputTail, i72);
                    this._outputTail += i72;
                }
            } else {
                _flushBuffer();
                this._writer.write(cArr, i2, i72);
            }
            if (i6 < i5) {
                i2 = i6 + 1;
                char c3 = cArr[i6];
                _appendCharacterEscape(c3, iArr[c3]);
            } else {
                return;
            }
        }
    }

    private void _writeStringASCII(char[] cArr, int i2, int i3, int i4) {
        char c;
        int i5 = i3 + i2;
        int[] iArr = this._outputEscapes;
        int min = Math.min(iArr.length, i4 + 1);
        int i6 = 0;
        while (i2 < i5) {
            int i7 = i2;
            while (true) {
                c = cArr[i7];
                if (c >= min) {
                    if (c > i4) {
                        i6 = -1;
                        break;
                    }
                } else {
                    i6 = iArr[c];
                    if (i6 != 0) {
                        break;
                    }
                }
                i7++;
                if (i7 >= i5) {
                    break;
                }
            }
            int i8 = i7 - i2;
            if (i8 < 32) {
                if (this._outputTail + i8 > this._outputEnd) {
                    _flushBuffer();
                }
                if (i8 > 0) {
                    System.arraycopy(cArr, i2, this._outputBuffer, this._outputTail, i8);
                    this._outputTail += i8;
                }
            } else {
                _flushBuffer();
                this._writer.write(cArr, i2, i8);
            }
            if (i7 < i5) {
                i2 = i7 + 1;
                _appendCharacterEscape(c, i6);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void _writePPFieldName(SerializableString serializableString, boolean z) {
        if (z) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        char[] asQuotedChars = serializableString.asQuotedChars();
        if (this._cfgUnqNames) {
            writeRaw(asQuotedChars, 0, asQuotedChars.length);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = this._quoteChar;
        writeRaw(asQuotedChars, 0, asQuotedChars.length);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = this._quoteChar;
    }

    /* access modifiers changed from: protected */
    public final void _writeFieldName(SerializableString serializableString, boolean z) {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(serializableString, z);
            return;
        }
        if (this._outputTail + 1 >= this._outputEnd) {
            _flushBuffer();
        }
        if (z) {
            char[] cArr = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            cArr[i2] = ',';
        }
        char[] asQuotedChars = serializableString.asQuotedChars();
        if (this._cfgUnqNames) {
            writeRaw(asQuotedChars, 0, asQuotedChars.length);
            return;
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        int i4 = i3 + 1;
        this._outputTail = i4;
        cArr2[i3] = this._quoteChar;
        int length = asQuotedChars.length;
        if (i4 + length + 1 >= this._outputEnd) {
            writeRaw(asQuotedChars, 0, length);
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr3 = this._outputBuffer;
            int i5 = this._outputTail;
            this._outputTail = i5 + 1;
            cArr3[i5] = this._quoteChar;
            return;
        }
        System.arraycopy(asQuotedChars, 0, cArr2, i4, length);
        int i6 = this._outputTail + length;
        this._outputTail = i6;
        char[] cArr4 = this._outputBuffer;
        this._outputTail = i6 + 1;
        cArr4[i6] = this._quoteChar;
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

    private void _writeStringCustom(char[] cArr, int i2, int i3) {
        char c;
        int i4 = i3 + i2;
        int[] iArr = this._outputEscapes;
        int i5 = this._maximumNonEscapedChar;
        if (i5 < 1) {
            i5 = 65535;
        }
        int min = Math.min(iArr.length, i5 + 1);
        CharacterEscapes characterEscapes = this._characterEscapes;
        int i6 = 0;
        while (i2 < i4) {
            int i7 = i2;
            while (true) {
                c = cArr[i7];
                if (c >= min) {
                    if (c <= i5) {
                        SerializableString escapeSequence = characterEscapes.getEscapeSequence(c);
                        this._currentEscape = escapeSequence;
                        if (escapeSequence != null) {
                            i6 = -2;
                            break;
                        }
                    } else {
                        i6 = -1;
                        break;
                    }
                } else {
                    i6 = iArr[c];
                    if (i6 != 0) {
                        break;
                    }
                }
                i7++;
                if (i7 >= i4) {
                    break;
                }
            }
            int i8 = i7 - i2;
            if (i8 < 32) {
                if (this._outputTail + i8 > this._outputEnd) {
                    _flushBuffer();
                }
                if (i8 > 0) {
                    System.arraycopy(cArr, i2, this._outputBuffer, this._outputTail, i8);
                    this._outputTail += i8;
                }
            } else {
                _flushBuffer();
                this._writer.write(cArr, i2, i8);
            }
            if (i7 < i4) {
                i2 = i7 + 1;
                _appendCharacterEscape(c, i6);
            } else {
                return;
            }
        }
    }

    public void writeRaw(char c) {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = c;
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
                char[] cArr = this._outputBuffer;
                int i10 = encodeBase64Chunk + 1;
                this._outputTail = i10;
                cArr[encodeBase64Chunk] = '\\';
                this._outputTail = i10 + 1;
                cArr[i10] = 'n';
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

    public void writeString(SerializableString serializableString) {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = this._quoteChar;
        char[] asQuotedChars = serializableString.asQuotedChars();
        int length = asQuotedChars.length;
        if (length < 32) {
            if (length > this._outputEnd - this._outputTail) {
                _flushBuffer();
            }
            System.arraycopy(asQuotedChars, 0, this._outputBuffer, this._outputTail, length);
            this._outputTail += length;
        } else {
            _flushBuffer();
            this._writer.write(asQuotedChars, 0, length);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = this._quoteChar;
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

    public void writeNumber(double d2) {
        if (this._cfgNumbersAsStrings || (isEnabled(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS) && (Double.isNaN(d2) || Double.isInfinite(d2)))) {
            writeString(String.valueOf(d2));
            return;
        }
        _verifyValueWrite("write a number");
        writeRaw(String.valueOf(d2));
    }

    public void writeNumber(float f2) {
        if (this._cfgNumbersAsStrings || (isEnabled(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS) && (Float.isNaN(f2) || Float.isInfinite(f2)))) {
            writeString(String.valueOf(f2));
            return;
        }
        _verifyValueWrite("write a number");
        writeRaw(String.valueOf(f2));
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
                char[] cArr = this._outputBuffer;
                int i10 = encodeBase64Chunk + 1;
                this._outputTail = i10;
                cArr[encodeBase64Chunk] = '\\';
                this._outputTail = i10 + 1;
                cArr[i10] = 'n';
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

    public void writeNumber(String str) {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(str);
        } else {
            writeRaw(str);
        }
    }

    private int _prependOrWriteCharacterEscape(char[] cArr, int i2, int i3, char c, int i4) {
        String str;
        int i5;
        if (i4 >= 0) {
            if (i2 <= 1 || i2 >= i3) {
                char[] cArr2 = this._entityBuffer;
                if (cArr2 == null) {
                    cArr2 = _allocateEntityBuffer();
                }
                cArr2[1] = (char) i4;
                this._writer.write(cArr2, 0, 2);
                return i2;
            }
            int i6 = i2 - 2;
            cArr[i6] = '\\';
            cArr[i6 + 1] = (char) i4;
            return i6;
        } else if (i4 == -2) {
            SerializableString serializableString = this._currentEscape;
            if (serializableString == null) {
                str = this._characterEscapes.getEscapeSequence(c).getValue();
            } else {
                str = serializableString.getValue();
                this._currentEscape = null;
            }
            int length = str.length();
            if (i2 < length || i2 >= i3) {
                this._writer.write(str);
                return i2;
            }
            int i7 = i2 - length;
            str.getChars(0, length, cArr, i7);
            return i7;
        } else if (i2 <= 5 || i2 >= i3) {
            char[] cArr3 = this._entityBuffer;
            if (cArr3 == null) {
                cArr3 = _allocateEntityBuffer();
            }
            this._outputHead = this._outputTail;
            if (c > 255) {
                int i8 = (c >> 8) & 255;
                char c2 = c & 255;
                char[] cArr4 = HEX_CHARS;
                cArr3[10] = cArr4[i8 >> 4];
                cArr3[11] = cArr4[i8 & 15];
                cArr3[12] = cArr4[c2 >> 4];
                cArr3[13] = cArr4[c2 & 15];
                this._writer.write(cArr3, 8, 6);
                return i2;
            }
            char[] cArr5 = HEX_CHARS;
            cArr3[6] = cArr5[c >> 4];
            cArr3[7] = cArr5[c & 15];
            this._writer.write(cArr3, 2, 6);
            return i2;
        } else {
            int i9 = i2 - 6;
            int i10 = i9 + 1;
            cArr[i9] = '\\';
            int i11 = i10 + 1;
            cArr[i10] = 'u';
            if (c > 255) {
                int i12 = (c >> 8) & 255;
                int i13 = i11 + 1;
                char[] cArr6 = HEX_CHARS;
                cArr[i11] = cArr6[i12 >> 4];
                i5 = i13 + 1;
                cArr[i13] = cArr6[i12 & 15];
                c = (char) (c & 255);
            } else {
                int i14 = i11 + 1;
                cArr[i11] = '0';
                i5 = i14 + 1;
                cArr[i14] = '0';
            }
            int i15 = i5 + 1;
            char[] cArr7 = HEX_CHARS;
            cArr[i5] = cArr7[c >> 4];
            cArr[i15] = cArr7[c & 15];
            return i15 - 5;
        }
    }
}
