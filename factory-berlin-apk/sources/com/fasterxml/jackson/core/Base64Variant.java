package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.Serializable;
import java.util.Arrays;

public final class Base64Variant implements Serializable {
    private final transient int[] _asciiToBase64;
    private final transient byte[] _base64ToAsciiB;
    private final transient char[] _base64ToAsciiC;
    private final transient int _maxLineLength;
    final String _name;
    private final transient char _paddingChar;
    private final transient boolean _usesPadding;

    public Base64Variant(String str, String str2, boolean z, char c, int i2) {
        this._asciiToBase64 = new int[128];
        this._base64ToAsciiC = new char[64];
        this._base64ToAsciiB = new byte[64];
        this._name = str;
        this._usesPadding = z;
        this._paddingChar = c;
        this._maxLineLength = i2;
        int length = str2.length();
        if (length == 64) {
            str2.getChars(0, length, this._base64ToAsciiC, 0);
            Arrays.fill(this._asciiToBase64, -1);
            for (int i3 = 0; i3 < length; i3++) {
                char c2 = this._base64ToAsciiC[i3];
                this._base64ToAsciiB[i3] = (byte) c2;
                this._asciiToBase64[c2] = i3;
            }
            if (z) {
                this._asciiToBase64[c] = -2;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Base64Alphabet length must be exactly 64 (was " + length + ")");
    }

    /* access modifiers changed from: protected */
    public void _reportBase64EOF() {
        throw new IllegalArgumentException(missingPaddingMessage());
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidBase64(char c, int i2, String str) {
        String str2;
        if (c <= ' ') {
            str2 = "Illegal white space character (code 0x" + Integer.toHexString(c) + ") as character #" + (i2 + 1) + " of 4-char base64 unit: can only used between units";
        } else if (usesPaddingChar(c)) {
            str2 = "Unexpected padding character ('" + getPaddingChar() + "') as character #" + (i2 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(c) || Character.isISOControl(c)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(c) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + c + "' (code 0x" + Integer.toHexString(c) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        throw new IllegalArgumentException(str2);
    }

    public byte[] decode(String str) {
        ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder();
        decode(str, byteArrayBuilder);
        return byteArrayBuilder.toByteArray();
    }

    public int decodeBase64Char(char c) {
        if (c <= 127) {
            return this._asciiToBase64[c];
        }
        return -1;
    }

    public String encode(byte[] bArr) {
        return encode(bArr, false);
    }

    public int encodeBase64Chunk(int i2, char[] cArr, int i3) {
        int i4 = i3 + 1;
        char[] cArr2 = this._base64ToAsciiC;
        cArr[i3] = cArr2[(i2 >> 18) & 63];
        int i5 = i4 + 1;
        cArr[i4] = cArr2[(i2 >> 12) & 63];
        int i6 = i5 + 1;
        cArr[i5] = cArr2[(i2 >> 6) & 63];
        int i7 = i6 + 1;
        cArr[i6] = cArr2[i2 & 63];
        return i7;
    }

    public int encodeBase64Partial(int i2, int i3, char[] cArr, int i4) {
        int i5 = i4 + 1;
        char[] cArr2 = this._base64ToAsciiC;
        cArr[i4] = cArr2[(i2 >> 18) & 63];
        int i6 = i5 + 1;
        cArr[i5] = cArr2[(i2 >> 12) & 63];
        if (this._usesPadding) {
            int i7 = i6 + 1;
            cArr[i6] = i3 == 2 ? cArr2[(i2 >> 6) & 63] : this._paddingChar;
            int i8 = i7 + 1;
            cArr[i7] = this._paddingChar;
            return i8;
        } else if (i3 != 2) {
            return i6;
        } else {
            cArr[i6] = cArr2[(i2 >> 6) & 63];
            return i6 + 1;
        }
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int getMaxLineLength() {
        return this._maxLineLength;
    }

    public String getName() {
        return this._name;
    }

    public char getPaddingChar() {
        return this._paddingChar;
    }

    public int hashCode() {
        return this._name.hashCode();
    }

    public String missingPaddingMessage() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end", new Object[]{getName(), Character.valueOf(getPaddingChar())});
    }

    public String toString() {
        return this._name;
    }

    public boolean usesPadding() {
        return this._usesPadding;
    }

    public boolean usesPaddingChar(char c) {
        return c == this._paddingChar;
    }

    public int decodeBase64Char(int i2) {
        if (i2 <= 127) {
            return this._asciiToBase64[i2];
        }
        return -1;
    }

    public String encode(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z) {
            sb.append('\"');
        }
        int maxLineLength = getMaxLineLength() >> 2;
        int i2 = 0;
        int i3 = length - 3;
        while (i2 <= i3) {
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            encodeBase64Chunk(sb, (((bArr[i2] << 8) | (bArr[i4] & 255)) << 8) | (bArr[i5] & 255));
            maxLineLength--;
            if (maxLineLength <= 0) {
                sb.append('\\');
                sb.append('n');
                maxLineLength = getMaxLineLength() >> 2;
            }
            i2 = i6;
        }
        int i7 = length - i2;
        if (i7 > 0) {
            int i8 = i2 + 1;
            int i9 = bArr[i2] << 16;
            if (i7 == 2) {
                i9 |= (bArr[i8] & 255) << 8;
            }
            encodeBase64Partial(sb, i9, i7);
        }
        if (z) {
            sb.append('\"');
        }
        return sb.toString();
    }

    public boolean usesPaddingChar(int i2) {
        return i2 == this._paddingChar;
    }

    public void decode(String str, ByteArrayBuilder byteArrayBuilder) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt > ' ') {
                int decodeBase64Char = decodeBase64Char(charAt);
                if (decodeBase64Char < 0) {
                    _reportInvalidBase64(charAt, 0, (String) null);
                    throw null;
                } else if (i3 < length) {
                    int i4 = i3 + 1;
                    char charAt2 = str.charAt(i3);
                    int decodeBase64Char2 = decodeBase64Char(charAt2);
                    if (decodeBase64Char2 >= 0) {
                        int i5 = (decodeBase64Char << 6) | decodeBase64Char2;
                        if (i4 < length) {
                            int i6 = i4 + 1;
                            char charAt3 = str.charAt(i4);
                            int decodeBase64Char3 = decodeBase64Char(charAt3);
                            if (decodeBase64Char3 >= 0) {
                                int i7 = (i5 << 6) | decodeBase64Char3;
                                if (i6 < length) {
                                    i3 = i6 + 1;
                                    char charAt4 = str.charAt(i6);
                                    int decodeBase64Char4 = decodeBase64Char(charAt4);
                                    if (decodeBase64Char4 >= 0) {
                                        byteArrayBuilder.appendThreeBytes((i7 << 6) | decodeBase64Char4);
                                    } else if (decodeBase64Char4 == -2) {
                                        byteArrayBuilder.appendTwoBytes(i7 >> 2);
                                    } else {
                                        _reportInvalidBase64(charAt4, 3, (String) null);
                                        throw null;
                                    }
                                } else if (!usesPadding()) {
                                    byteArrayBuilder.appendTwoBytes(i7 >> 2);
                                    return;
                                } else {
                                    _reportBase64EOF();
                                    throw null;
                                }
                            } else if (decodeBase64Char3 != -2) {
                                _reportInvalidBase64(charAt3, 2, (String) null);
                                throw null;
                            } else if (i6 < length) {
                                i2 = i6 + 1;
                                char charAt5 = str.charAt(i6);
                                if (usesPaddingChar(charAt5)) {
                                    byteArrayBuilder.append(i5 >> 4);
                                } else {
                                    _reportInvalidBase64(charAt5, 3, "expected padding character '" + getPaddingChar() + "'");
                                    throw null;
                                }
                            } else {
                                _reportBase64EOF();
                                throw null;
                            }
                        } else if (!usesPadding()) {
                            byteArrayBuilder.append(i5 >> 4);
                            return;
                        } else {
                            _reportBase64EOF();
                            throw null;
                        }
                    } else {
                        _reportInvalidBase64(charAt2, 1, (String) null);
                        throw null;
                    }
                } else {
                    _reportBase64EOF();
                    throw null;
                }
            }
            i2 = i3;
        }
    }

    public void encodeBase64Chunk(StringBuilder sb, int i2) {
        sb.append(this._base64ToAsciiC[(i2 >> 18) & 63]);
        sb.append(this._base64ToAsciiC[(i2 >> 12) & 63]);
        sb.append(this._base64ToAsciiC[(i2 >> 6) & 63]);
        sb.append(this._base64ToAsciiC[i2 & 63]);
    }

    public void encodeBase64Partial(StringBuilder sb, int i2, int i3) {
        sb.append(this._base64ToAsciiC[(i2 >> 18) & 63]);
        sb.append(this._base64ToAsciiC[(i2 >> 12) & 63]);
        if (this._usesPadding) {
            sb.append(i3 == 2 ? this._base64ToAsciiC[(i2 >> 6) & 63] : this._paddingChar);
            sb.append(this._paddingChar);
        } else if (i3 == 2) {
            sb.append(this._base64ToAsciiC[(i2 >> 6) & 63]);
        }
    }

    public int encodeBase64Chunk(int i2, byte[] bArr, int i3) {
        int i4 = i3 + 1;
        byte[] bArr2 = this._base64ToAsciiB;
        bArr[i3] = bArr2[(i2 >> 18) & 63];
        int i5 = i4 + 1;
        bArr[i4] = bArr2[(i2 >> 12) & 63];
        int i6 = i5 + 1;
        bArr[i5] = bArr2[(i2 >> 6) & 63];
        int i7 = i6 + 1;
        bArr[i6] = bArr2[i2 & 63];
        return i7;
    }

    public int encodeBase64Partial(int i2, int i3, byte[] bArr, int i4) {
        int i5 = i4 + 1;
        byte[] bArr2 = this._base64ToAsciiB;
        bArr[i4] = bArr2[(i2 >> 18) & 63];
        int i6 = i5 + 1;
        bArr[i5] = bArr2[(i2 >> 12) & 63];
        if (this._usesPadding) {
            byte b = (byte) this._paddingChar;
            int i7 = i6 + 1;
            bArr[i6] = i3 == 2 ? bArr2[(i2 >> 6) & 63] : b;
            int i8 = i7 + 1;
            bArr[i7] = b;
            return i8;
        } else if (i3 != 2) {
            return i6;
        } else {
            bArr[i6] = bArr2[(i2 >> 6) & 63];
            return i6 + 1;
        }
    }

    public Base64Variant(Base64Variant base64Variant, String str, int i2) {
        this(base64Variant, str, base64Variant._usesPadding, base64Variant._paddingChar, i2);
    }

    public Base64Variant(Base64Variant base64Variant, String str, boolean z, char c, int i2) {
        this._asciiToBase64 = new int[128];
        this._base64ToAsciiC = new char[64];
        byte[] bArr = new byte[64];
        this._base64ToAsciiB = bArr;
        this._name = str;
        byte[] bArr2 = base64Variant._base64ToAsciiB;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr = base64Variant._base64ToAsciiC;
        System.arraycopy(cArr, 0, this._base64ToAsciiC, 0, cArr.length);
        int[] iArr = base64Variant._asciiToBase64;
        System.arraycopy(iArr, 0, this._asciiToBase64, 0, iArr.length);
        this._usesPadding = z;
        this._paddingChar = c;
        this._maxLineLength = i2;
    }
}
