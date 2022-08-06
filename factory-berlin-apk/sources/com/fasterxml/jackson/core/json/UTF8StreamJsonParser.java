package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class UTF8StreamJsonParser extends ParserBase {
    protected static final int FEAT_MASK_TRAILING_COMMA = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    protected static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();
    private static final int[] _icUTF8 = CharTypes.getInputCodeUtf8();
    protected boolean _bufferRecyclable;
    protected byte[] _inputBuffer;
    protected InputStream _inputStream;
    protected int _nameStartCol;
    protected int _nameStartOffset;
    protected int _nameStartRow;
    protected ObjectCodec _objectCodec;
    private int _quad1;
    protected int[] _quadBuffer = new int[16];
    protected final ByteQuadsCanonicalizer _symbols;
    protected boolean _tokenIncomplete;

    public UTF8StreamJsonParser(IOContext iOContext, int i2, InputStream inputStream, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, byte[] bArr, int i3, int i4, boolean z) {
        super(iOContext, i2);
        this._inputStream = inputStream;
        this._objectCodec = objectCodec;
        this._symbols = byteQuadsCanonicalizer;
        this._inputBuffer = bArr;
        this._inputPtr = i3;
        this._inputEnd = i4;
        this._currInputRowStart = i3;
        this._currInputProcessed = (long) (-i3);
        this._bufferRecyclable = z;
    }

    private final void _checkMatchEnd(String str, int i2, int i3) {
        if (Character.isJavaIdentifierPart((char) _decodeCharForError(i3))) {
            _reportInvalidToken(str.substring(0, i2));
            throw null;
        }
    }

    private final void _closeArrayScope() {
        _updateLocation();
        if (this._parsingContext.inArray()) {
            this._parsingContext = this._parsingContext.clearAndGetParent();
        } else {
            _reportMismatchedEndMarker(93, '}');
            throw null;
        }
    }

    private final void _closeObjectScope() {
        _updateLocation();
        if (this._parsingContext.inObject()) {
            this._parsingContext = this._parsingContext.clearAndGetParent();
        } else {
            _reportMismatchedEndMarker(125, ']');
            throw null;
        }
    }

    private final JsonToken _closeScope(int i2) {
        if (i2 == 125) {
            _closeObjectScope();
            JsonToken jsonToken = JsonToken.END_OBJECT;
            this._currToken = jsonToken;
            return jsonToken;
        }
        _closeArrayScope();
        JsonToken jsonToken2 = JsonToken.END_ARRAY;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    private final int _decodeUtf8_2(int i2) {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        byte b = bArr[i3];
        if ((b & 192) == 128) {
            return ((i2 & 31) << 6) | (b & 63);
        }
        _reportInvalidOther(b & 255, i4);
        throw null;
    }

    private final int _decodeUtf8_3(int i2) {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        int i3 = i2 & 15;
        byte[] bArr = this._inputBuffer;
        int i4 = this._inputPtr;
        int i5 = i4 + 1;
        this._inputPtr = i5;
        byte b = bArr[i4];
        if ((b & 192) == 128) {
            byte b2 = (i3 << 6) | (b & 63);
            if (i5 >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i6 = this._inputPtr;
            int i7 = i6 + 1;
            this._inputPtr = i7;
            byte b3 = bArr2[i6];
            if ((b3 & 192) == 128) {
                return (b2 << 6) | (b3 & 63);
            }
            _reportInvalidOther(b3 & 255, i7);
            throw null;
        }
        _reportInvalidOther(b & 255, i5);
        throw null;
    }

    private final int _decodeUtf8_3fast(int i2) {
        int i3 = i2 & 15;
        byte[] bArr = this._inputBuffer;
        int i4 = this._inputPtr;
        int i5 = i4 + 1;
        this._inputPtr = i5;
        byte b = bArr[i4];
        if ((b & 192) == 128) {
            byte b2 = (i3 << 6) | (b & 63);
            int i6 = i5 + 1;
            this._inputPtr = i6;
            byte b3 = bArr[i5];
            if ((b3 & 192) == 128) {
                return (b2 << 6) | (b3 & 63);
            }
            _reportInvalidOther(b3 & 255, i6);
            throw null;
        }
        _reportInvalidOther(b & 255, i5);
        throw null;
    }

    private final int _decodeUtf8_4(int i2) {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        byte b = bArr[i3];
        if ((b & 192) == 128) {
            byte b2 = ((i2 & 7) << 6) | (b & 63);
            if (i4 >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i5 = this._inputPtr;
            int i6 = i5 + 1;
            this._inputPtr = i6;
            byte b3 = bArr2[i5];
            if ((b3 & 192) == 128) {
                byte b4 = (b2 << 6) | (b3 & 63);
                if (i6 >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i7 = this._inputPtr;
                int i8 = i7 + 1;
                this._inputPtr = i8;
                byte b5 = bArr3[i7];
                if ((b5 & 192) == 128) {
                    return ((b4 << 6) | (b5 & 63)) - 65536;
                }
                _reportInvalidOther(b5 & 255, i8);
                throw null;
            }
            _reportInvalidOther(b3 & 255, i6);
            throw null;
        }
        _reportInvalidOther(b & 255, i4);
        throw null;
    }

    private final void _finishString2(char[] cArr, int i2) {
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i3 = this._inputPtr;
            if (i3 >= this._inputEnd) {
                _loadMoreGuaranteed();
                i3 = this._inputPtr;
            }
            int i4 = 0;
            if (i2 >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i2 = 0;
            }
            int min = Math.min(this._inputEnd, (cArr.length - i2) + i3);
            while (true) {
                if (i3 >= min) {
                    this._inputPtr = i3;
                    break;
                }
                int i5 = i3 + 1;
                int i6 = bArr[i3] & 255;
                if (iArr[i6] != 0) {
                    this._inputPtr = i5;
                    if (i6 == 34) {
                        this._textBuffer.setCurrentLength(i2);
                        return;
                    }
                    int i7 = iArr[i6];
                    if (i7 == 1) {
                        i6 = _decodeEscaped();
                    } else if (i7 == 2) {
                        i6 = _decodeUtf8_2(i6);
                    } else if (i7 != 3) {
                        if (i7 == 4) {
                            int _decodeUtf8_4 = _decodeUtf8_4(i6);
                            int i8 = i2 + 1;
                            cArr[i2] = (char) (55296 | (_decodeUtf8_4 >> 10));
                            if (i8 >= cArr.length) {
                                cArr = this._textBuffer.finishCurrentSegment();
                                i2 = 0;
                            } else {
                                i2 = i8;
                            }
                            i6 = (_decodeUtf8_4 & 1023) | 56320;
                        } else if (i6 < 32) {
                            _throwUnquotedSpace(i6, "string value");
                        } else {
                            _reportInvalidChar(i6);
                            throw null;
                        }
                    } else if (this._inputEnd - i5 >= 2) {
                        i6 = _decodeUtf8_3fast(i6);
                    } else {
                        i6 = _decodeUtf8_3(i6);
                    }
                    if (i2 >= cArr.length) {
                        cArr = this._textBuffer.finishCurrentSegment();
                    } else {
                        i4 = i2;
                    }
                    i2 = i4 + 1;
                    cArr[i4] = (char) i6;
                } else {
                    cArr[i2] = (char) i6;
                    i3 = i5;
                    i2++;
                }
            }
        }
    }

    private final void _matchToken2(String str, int i2) {
        int i3;
        byte b;
        int length = str.length();
        do {
            if ((this._inputPtr < this._inputEnd || _loadMore()) && this._inputBuffer[this._inputPtr] == str.charAt(i2)) {
                i3 = this._inputPtr + 1;
                this._inputPtr = i3;
                i2++;
            } else {
                _reportInvalidToken(str.substring(0, i2));
                throw null;
            }
        } while (i2 < length);
        if ((i3 < this._inputEnd || _loadMore()) && (b = this._inputBuffer[this._inputPtr] & 255) >= 48 && b != 93 && b != 125) {
            _checkMatchEnd(str, i2, b);
        }
    }

    private final JsonToken _nextAfterName() {
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        this._currToken = jsonToken;
        return jsonToken;
    }

    private final JsonToken _nextTokenNotInObject(int i2) {
        if (i2 == 34) {
            this._tokenIncomplete = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this._currToken = jsonToken;
            return jsonToken;
        } else if (i2 == 45) {
            JsonToken _parseNegNumber = _parseNegNumber();
            this._currToken = _parseNegNumber;
            return _parseNegNumber;
        } else if (i2 == 91) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this._currToken = jsonToken2;
            return jsonToken2;
        } else if (i2 == 102) {
            _matchFalse();
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this._currToken = jsonToken3;
            return jsonToken3;
        } else if (i2 == 110) {
            _matchNull();
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this._currToken = jsonToken4;
            return jsonToken4;
        } else if (i2 == 116) {
            _matchTrue();
            JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
            this._currToken = jsonToken5;
            return jsonToken5;
        } else if (i2 != 123) {
            switch (i2) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    JsonToken _parsePosNumber = _parsePosNumber(i2);
                    this._currToken = _parsePosNumber;
                    return _parsePosNumber;
                default:
                    JsonToken _handleUnexpectedValue = _handleUnexpectedValue(i2);
                    this._currToken = _handleUnexpectedValue;
                    return _handleUnexpectedValue;
            }
        } else {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken6 = JsonToken.START_OBJECT;
            this._currToken = jsonToken6;
            return jsonToken6;
        }
    }

    private static final int _padLastQuad(int i2, int i3) {
        return i3 == 4 ? i2 : i2 | (-1 << (i3 << 3));
    }

    private final JsonToken _parseFloat(char[] cArr, int i2, int i3, boolean z, int i4) {
        boolean z2;
        int i5;
        int i6 = 0;
        if (i3 == 46) {
            if (i2 >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i2 = 0;
            }
            cArr[i2] = (char) i3;
            i2++;
            i5 = 0;
            while (true) {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this._inputBuffer;
                int i7 = this._inputPtr;
                this._inputPtr = i7 + 1;
                i3 = bArr[i7] & 255;
                if (i3 < 48 || i3 > 57) {
                    z2 = false;
                } else {
                    i5++;
                    if (i2 >= cArr.length) {
                        cArr = this._textBuffer.finishCurrentSegment();
                        i2 = 0;
                    }
                    cArr[i2] = (char) i3;
                    i2++;
                }
            }
            z2 = false;
            if (i5 == 0) {
                reportUnexpectedNumberChar(i3, "Decimal point not followed by a digit");
                throw null;
            }
        } else {
            i5 = 0;
            z2 = false;
        }
        if (r13 == 101 || r13 == 69) {
            if (i2 >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i2 = 0;
            }
            int i8 = i2 + 1;
            cArr[i2] = (char) r13;
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i9 = this._inputPtr;
            this._inputPtr = i9 + 1;
            byte b = bArr2[i9] & 255;
            if (b == 45 || b == 43) {
                if (i8 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i8 = 0;
                }
                int i10 = i8 + 1;
                cArr[i8] = (char) b;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i11 = this._inputPtr;
                this._inputPtr = i11 + 1;
                b = bArr3[i11] & 255;
                i8 = i10;
            }
            r13 = b;
            int i12 = 0;
            while (true) {
                if (r13 >= 48 && r13 <= 57) {
                    i12++;
                    if (i8 >= cArr.length) {
                        cArr = this._textBuffer.finishCurrentSegment();
                        i8 = 0;
                    }
                    int i13 = i8 + 1;
                    cArr[i8] = (char) r13;
                    if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                        i6 = i12;
                        r12 = i13;
                        z2 = true;
                        break;
                    }
                    byte[] bArr4 = this._inputBuffer;
                    int i14 = this._inputPtr;
                    this._inputPtr = i14 + 1;
                    r13 = bArr4[i14] & 255;
                    i8 = i13;
                } else {
                    i6 = i12;
                    r12 = i8;
                }
            }
            i6 = i12;
            r12 = i8;
            if (i6 == 0) {
                reportUnexpectedNumberChar(r13, "Exponent indicator not followed by a digit");
                throw null;
            }
        }
        if (!z2) {
            this._inputPtr--;
            if (this._parsingContext.inRoot()) {
                _verifyRootSpace(r13);
            }
        }
        this._textBuffer.setCurrentLength(i2);
        return resetFloat(z, i4, i5, i6);
    }

    private final JsonToken _parseNumber2(char[] cArr, int i2, boolean z, int i3) {
        byte b;
        char[] cArr2 = cArr;
        int i4 = i2;
        int i5 = i3;
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                b = bArr[i6] & 255;
                if (b <= 57 && b >= 48) {
                    if (i4 >= cArr2.length) {
                        i4 = 0;
                        cArr2 = this._textBuffer.finishCurrentSegment();
                    }
                    cArr2[i4] = (char) b;
                    i5++;
                    i4++;
                }
            } else {
                this._textBuffer.setCurrentLength(i4);
                return resetInt(z, i5);
            }
        }
        if (b == 46 || b == 101 || b == 69) {
            return _parseFloat(cArr2, i4, b, z, i5);
        }
        this._inputPtr--;
        this._textBuffer.setCurrentLength(i4);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(this._inputBuffer[this._inputPtr] & 255);
        }
        return resetInt(z, i5);
    }

    private final void _skipCComment() {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            byte b = bArr[i2] & 255;
            int i4 = inputCodeComment[b];
            if (i4 != 0) {
                if (i4 == 2) {
                    _skipUtf8_2();
                } else if (i4 == 3) {
                    _skipUtf8_3();
                } else if (i4 == 4) {
                    _skipUtf8_4(b);
                } else if (i4 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (i4 == 13) {
                    _skipCR();
                } else if (i4 == 42) {
                    if (i3 >= this._inputEnd && !_loadMore()) {
                        break;
                    }
                    byte[] bArr2 = this._inputBuffer;
                    int i5 = this._inputPtr;
                    if (bArr2[i5] == 47) {
                        this._inputPtr = i5 + 1;
                        return;
                    }
                } else {
                    _reportInvalidChar(b);
                    throw null;
                }
            }
        }
        _reportInvalidEOF(" in a comment", (JsonToken) null);
        throw null;
    }

    private final int _skipColon() {
        int i2 = this._inputPtr;
        if (i2 + 4 >= this._inputEnd) {
            return _skipColon2(false);
        }
        byte[] bArr = this._inputBuffer;
        byte b = bArr[i2];
        if (b == 58) {
            int i3 = i2 + 1;
            this._inputPtr = i3;
            byte b2 = bArr[i3];
            if (b2 <= 32) {
                if (b2 == 32 || b2 == 9) {
                    byte[] bArr2 = this._inputBuffer;
                    int i4 = this._inputPtr + 1;
                    this._inputPtr = i4;
                    byte b3 = bArr2[i4];
                    if (b3 > 32) {
                        if (b3 == 47 || b3 == 35) {
                            return _skipColon2(true);
                        }
                        this._inputPtr = i4 + 1;
                        return b3;
                    }
                }
                return _skipColon2(true);
            } else if (b2 == 47 || b2 == 35) {
                return _skipColon2(true);
            } else {
                this._inputPtr = i3 + 1;
                return b2;
            }
        } else {
            if (b == 32 || b == 9) {
                byte[] bArr3 = this._inputBuffer;
                int i5 = this._inputPtr + 1;
                this._inputPtr = i5;
                b = bArr3[i5];
            }
            if (b != 58) {
                return _skipColon2(false);
            }
            byte[] bArr4 = this._inputBuffer;
            int i6 = this._inputPtr + 1;
            this._inputPtr = i6;
            byte b4 = bArr4[i6];
            if (b4 <= 32) {
                if (b4 == 32 || b4 == 9) {
                    byte[] bArr5 = this._inputBuffer;
                    int i7 = this._inputPtr + 1;
                    this._inputPtr = i7;
                    byte b5 = bArr5[i7];
                    if (b5 > 32) {
                        if (b5 == 47 || b5 == 35) {
                            return _skipColon2(true);
                        }
                        this._inputPtr = i7 + 1;
                        return b5;
                    }
                }
                return _skipColon2(true);
            } else if (b4 == 47 || b4 == 35) {
                return _skipColon2(true);
            } else {
                this._inputPtr = i6 + 1;
                return b4;
            }
        }
    }

    private final int _skipColon2(boolean z) {
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i2 = this._inputPtr;
                int i3 = i2 + 1;
                this._inputPtr = i3;
                byte b = bArr[i2] & 255;
                if (b > 32) {
                    if (b == 47) {
                        _skipComment();
                    } else if (b != 35 || !_skipYAMLComment()) {
                        if (z) {
                            return b;
                        }
                        if (b == 58) {
                            z = true;
                        } else {
                            _reportUnexpectedChar(b, "was expecting a colon to separate field name and value");
                            throw null;
                        }
                    }
                } else if (b == 32) {
                    continue;
                } else if (b == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (b == 13) {
                    _skipCR();
                } else if (b != 9) {
                    _throwInvalidSpace(b);
                    throw null;
                }
            } else {
                _reportInvalidEOF(" within/between " + this._parsingContext.typeDesc() + " entries", (JsonToken) null);
                throw null;
            }
        }
    }

    private final void _skipComment() {
        if (!isEnabled(JsonParser.Feature.ALLOW_COMMENTS)) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
            throw null;
        } else if (this._inputPtr < this._inputEnd || _loadMore()) {
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            byte b = bArr[i2] & 255;
            if (b == 47) {
                _skipLine();
            } else if (b == 42) {
                _skipCComment();
            } else {
                _reportUnexpectedChar(b, "was expecting either '*' or '/' for a comment");
                throw null;
            }
        } else {
            _reportInvalidEOF(" in a comment", (JsonToken) null);
            throw null;
        }
    }

    private final void _skipLine() {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i2 = this._inputPtr;
                int i3 = i2 + 1;
                this._inputPtr = i3;
                byte b = bArr[i2] & 255;
                int i4 = inputCodeComment[b];
                if (i4 != 0) {
                    if (i4 == 2) {
                        _skipUtf8_2();
                    } else if (i4 == 3) {
                        _skipUtf8_3();
                    } else if (i4 == 4) {
                        _skipUtf8_4(b);
                    } else if (i4 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = i3;
                        return;
                    } else if (i4 == 13) {
                        _skipCR();
                        return;
                    } else if (i4 != 42 && i4 < 0) {
                        _reportInvalidChar(b);
                        throw null;
                    }
                }
            } else {
                return;
            }
        }
    }

    private final void _skipUtf8_2() {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, i3);
            throw null;
        }
    }

    private final void _skipUtf8_3() {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        byte b = bArr[i2];
        if ((b & 192) == 128) {
            if (i3 >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i4 = this._inputPtr;
            int i5 = i4 + 1;
            this._inputPtr = i5;
            byte b2 = bArr2[i4];
            if ((b2 & 192) != 128) {
                _reportInvalidOther(b2 & 255, i5);
                throw null;
            }
            return;
        }
        _reportInvalidOther(b & 255, i3);
        throw null;
    }

    private final void _skipUtf8_4(int i2) {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        byte b = bArr[i3];
        if ((b & 192) == 128) {
            if (i4 >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i5 = this._inputPtr;
            int i6 = i5 + 1;
            this._inputPtr = i6;
            byte b2 = bArr2[i5];
            if ((b2 & 192) == 128) {
                if (i6 >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i7 = this._inputPtr;
                int i8 = i7 + 1;
                this._inputPtr = i8;
                byte b3 = bArr3[i7];
                if ((b3 & 192) != 128) {
                    _reportInvalidOther(b3 & 255, i8);
                    throw null;
                }
                return;
            }
            _reportInvalidOther(b2 & 255, i6);
            throw null;
        }
        _reportInvalidOther(b & 255, i4);
        throw null;
    }

    private final int _skipWS() {
        while (true) {
            int i2 = this._inputPtr;
            if (i2 >= this._inputEnd) {
                return _skipWS2();
            }
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            byte b = bArr[i2] & 255;
            if (b > 32) {
                if (b != 47 && b != 35) {
                    return b;
                }
                this._inputPtr--;
                return _skipWS2();
            } else if (b != 32) {
                if (b == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (b == 13) {
                    _skipCR();
                } else if (b != 9) {
                    _throwInvalidSpace(b);
                    throw null;
                }
            }
        }
    }

    private final int _skipWS2() {
        byte b;
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i2 = this._inputPtr;
                int i3 = i2 + 1;
                this._inputPtr = i3;
                b = bArr[i2] & 255;
                if (b > 32) {
                    if (b == 47) {
                        _skipComment();
                    } else if (b != 35 || !_skipYAMLComment()) {
                        return b;
                    }
                } else if (b == 32) {
                    continue;
                } else if (b == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (b == 13) {
                    _skipCR();
                } else if (b != 9) {
                    _throwInvalidSpace(b);
                    throw null;
                }
            } else {
                throw _constructError("Unexpected end-of-input within/between " + this._parsingContext.typeDesc() + " entries");
            }
        }
        return b;
    }

    private final int _skipWSOrEnd() {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            return _eofAsNextChar();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        byte b = bArr[i2] & 255;
        if (b <= 32) {
            if (b != 32) {
                if (b == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (b == 13) {
                    _skipCR();
                } else if (b != 9) {
                    _throwInvalidSpace(b);
                    throw null;
                }
            }
            while (true) {
                int i4 = this._inputPtr;
                if (i4 >= this._inputEnd) {
                    return _skipWSOrEnd2();
                }
                byte[] bArr2 = this._inputBuffer;
                int i5 = i4 + 1;
                this._inputPtr = i5;
                byte b2 = bArr2[i4] & 255;
                if (b2 > 32) {
                    if (b2 != 47 && b2 != 35) {
                        return b2;
                    }
                    this._inputPtr--;
                    return _skipWSOrEnd2();
                } else if (b2 != 32) {
                    if (b2 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = i5;
                    } else if (b2 == 13) {
                        _skipCR();
                    } else if (b2 != 9) {
                        _throwInvalidSpace(b2);
                        throw null;
                    }
                }
            }
        } else if (b != 47 && b != 35) {
            return b;
        } else {
            this._inputPtr--;
            return _skipWSOrEnd2();
        }
    }

    private final int _skipWSOrEnd2() {
        byte b;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return _eofAsNextChar();
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            b = bArr[i2] & 255;
            if (b > 32) {
                if (b == 47) {
                    _skipComment();
                } else if (b != 35 || !_skipYAMLComment()) {
                    return b;
                }
            } else if (b == 32) {
                continue;
            } else if (b == 10) {
                this._currInputRow++;
                this._currInputRowStart = i3;
            } else if (b == 13) {
                _skipCR();
            } else if (b != 9) {
                _throwInvalidSpace(b);
                throw null;
            }
        }
        return b;
    }

    private final boolean _skipYAMLComment() {
        if (!isEnabled(JsonParser.Feature.ALLOW_YAML_COMMENTS)) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _updateLocation() {
        this._tokenInputRow = this._currInputRow;
        int i2 = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + ((long) i2);
        this._tokenInputCol = i2 - this._currInputRowStart;
    }

    private final void _updateNameLocation() {
        this._nameStartRow = this._currInputRow;
        int i2 = this._inputPtr;
        this._nameStartOffset = i2;
        this._nameStartCol = i2 - this._currInputRowStart;
    }

    private final int _verifyNoLeadingZeroes() {
        byte b;
        if ((this._inputPtr >= this._inputEnd && !_loadMore()) || (b = this._inputBuffer[this._inputPtr] & 255) < 48 || b > 57) {
            return 48;
        }
        if (isEnabled(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS)) {
            this._inputPtr++;
            if (b == 48) {
                do {
                    if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                        break;
                    }
                    byte[] bArr = this._inputBuffer;
                    int i2 = this._inputPtr;
                    b = bArr[i2] & 255;
                    if (b < 48 || b > 57) {
                        return 48;
                    }
                    this._inputPtr = i2 + 1;
                } while (b == 48);
            }
            return b;
        }
        reportInvalidNumber("Leading zeroes not allowed");
        throw null;
    }

    private final void _verifyRootSpace(int i2) {
        int i3 = this._inputPtr + 1;
        this._inputPtr = i3;
        if (i2 == 9) {
            return;
        }
        if (i2 == 10) {
            this._currInputRow++;
            this._currInputRowStart = i3;
        } else if (i2 == 13) {
            _skipCR();
        } else if (i2 != 32) {
            _reportMissingRootWS(i2);
            throw null;
        }
    }

    private final String addName(int[] iArr, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int[] iArr2 = iArr;
        int i7 = i2;
        int i8 = i3;
        int i9 = ((i7 << 2) - 4) + i8;
        if (i8 < 4) {
            int i10 = i7 - 1;
            i4 = iArr2[i10];
            iArr2[i10] = i4 << ((4 - i8) << 3);
        } else {
            i4 = 0;
        }
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i11 = 0;
        int i12 = 0;
        while (i11 < i9) {
            int i13 = (iArr2[i11 >> 2] >> ((3 - (i11 & 3)) << 3)) & 255;
            i11++;
            if (i13 > 127) {
                if ((i13 & 224) == 192) {
                    i6 = i13 & 31;
                    i5 = 1;
                } else if ((i13 & 240) == 224) {
                    i6 = i13 & 15;
                    i5 = 2;
                } else if ((i13 & 248) == 240) {
                    i6 = i13 & 7;
                    i5 = 3;
                } else {
                    _reportInvalidInitial(i13);
                    throw null;
                }
                if (i11 + i5 <= i9) {
                    int i14 = iArr2[i11 >> 2] >> ((3 - (i11 & 3)) << 3);
                    i11++;
                    if ((i14 & 192) == 128) {
                        i13 = (i6 << 6) | (i14 & 63);
                        if (i5 > 1) {
                            int i15 = iArr2[i11 >> 2] >> ((3 - (i11 & 3)) << 3);
                            i11++;
                            if ((i15 & 192) == 128) {
                                int i16 = (i15 & 63) | (i13 << 6);
                                if (i5 > 2) {
                                    int i17 = iArr2[i11 >> 2] >> ((3 - (i11 & 3)) << 3);
                                    i11++;
                                    if ((i17 & 192) == 128) {
                                        i13 = (i16 << 6) | (i17 & 63);
                                    } else {
                                        _reportInvalidOther(i17 & 255);
                                        throw null;
                                    }
                                } else {
                                    i13 = i16;
                                }
                            } else {
                                _reportInvalidOther(i15);
                                throw null;
                            }
                        }
                        if (i5 > 2) {
                            int i18 = i13 - 65536;
                            if (i12 >= emptyAndGetCurrentSegment.length) {
                                emptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
                            }
                            emptyAndGetCurrentSegment[i12] = (char) ((i18 >> 10) + 55296);
                            i13 = (i18 & 1023) | 56320;
                            i12++;
                        }
                    } else {
                        _reportInvalidOther(i14);
                        throw null;
                    }
                } else {
                    _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
                    throw null;
                }
            }
            if (i12 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
            }
            emptyAndGetCurrentSegment[i12] = (char) i13;
            i12++;
        }
        String str = new String(emptyAndGetCurrentSegment, 0, i12);
        if (i8 < 4) {
            iArr2[i7 - 1] = i4;
        }
        return this._symbols.addName(str, iArr2, i7);
    }

    private final String findName(int i2, int i3) {
        int _padLastQuad = _padLastQuad(i2, i3);
        String findName = this._symbols.findName(_padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = _padLastQuad;
        return addName(iArr, 1, i3);
    }

    private int nextByte() {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        return bArr[i2] & 255;
    }

    private final String parseName(int i2, int i3, int i4) {
        return parseEscapedName(this._quadBuffer, 0, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void _closeInput() {
        if (this._inputStream != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this._inputStream.close();
            }
            this._inputStream = null;
        }
    }

    /* access modifiers changed from: protected */
    public final byte[] _decodeBase64(Base64Variant base64Variant) {
        ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            byte b = bArr[i2] & 255;
            if (b > 32) {
                int decodeBase64Char = base64Variant.decodeBase64Char((int) b);
                if (decodeBase64Char < 0) {
                    if (b == 34) {
                        return _getByteArrayBuilder.toByteArray();
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, (int) b, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr2 = this._inputBuffer;
                int i3 = this._inputPtr;
                this._inputPtr = i3 + 1;
                byte b2 = bArr2[i3] & 255;
                int decodeBase64Char2 = base64Variant.decodeBase64Char((int) b2);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, (int) b2, 1);
                }
                int i4 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i5 = this._inputPtr;
                this._inputPtr = i5 + 1;
                byte b3 = bArr3[i5] & 255;
                int decodeBase64Char3 = base64Variant.decodeBase64Char((int) b3);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (b3 == 34) {
                            _getByteArrayBuilder.append(i4 >> 4);
                            if (!base64Variant.usesPadding()) {
                                return _getByteArrayBuilder.toByteArray();
                            }
                            this._inputPtr--;
                            _handleBase64MissingPadding(base64Variant);
                            throw null;
                        }
                        decodeBase64Char3 = _decodeBase64Escape(base64Variant, (int) b3, 2);
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        byte[] bArr4 = this._inputBuffer;
                        int i6 = this._inputPtr;
                        this._inputPtr = i6 + 1;
                        byte b4 = bArr4[i6] & 255;
                        if (base64Variant.usesPaddingChar((int) b4) || _decodeBase64Escape(base64Variant, (int) b4, 3) == -2) {
                            _getByteArrayBuilder.append(i4 >> 4);
                        } else {
                            throw reportInvalidBase64Char(base64Variant, b4, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                    }
                }
                int i7 = (i4 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr5 = this._inputBuffer;
                int i8 = this._inputPtr;
                this._inputPtr = i8 + 1;
                byte b5 = bArr5[i8] & 255;
                int decodeBase64Char4 = base64Variant.decodeBase64Char((int) b5);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (b5 == 34) {
                            _getByteArrayBuilder.appendTwoBytes(i7 >> 2);
                            if (!base64Variant.usesPadding()) {
                                return _getByteArrayBuilder.toByteArray();
                            }
                            this._inputPtr--;
                            _handleBase64MissingPadding(base64Variant);
                            throw null;
                        }
                        decodeBase64Char4 = _decodeBase64Escape(base64Variant, (int) b5, 3);
                    }
                    if (decodeBase64Char4 == -2) {
                        _getByteArrayBuilder.appendTwoBytes(i7 >> 2);
                    }
                }
                _getByteArrayBuilder.appendThreeBytes((i7 << 6) | decodeBase64Char4);
            }
        }
    }

    /* access modifiers changed from: protected */
    public int _decodeCharForError(int i2) {
        int i3;
        char c;
        int i4 = i2 & 255;
        if (i4 <= 127) {
            return i4;
        }
        if ((i4 & 224) == 192) {
            i3 = i4 & 31;
            c = 1;
        } else if ((i4 & 240) == 224) {
            i3 = i4 & 15;
            c = 2;
        } else if ((i4 & 248) == 240) {
            i3 = i4 & 7;
            c = 3;
        } else {
            _reportInvalidInitial(i4 & 255);
            throw null;
        }
        int nextByte = nextByte();
        if ((nextByte & 192) == 128) {
            int i5 = (i3 << 6) | (nextByte & 63);
            if (c <= 1) {
                return i5;
            }
            int nextByte2 = nextByte();
            if ((nextByte2 & 192) == 128) {
                int i6 = (i5 << 6) | (nextByte2 & 63);
                if (c <= 2) {
                    return i6;
                }
                int nextByte3 = nextByte();
                if ((nextByte3 & 192) == 128) {
                    return (i6 << 6) | (nextByte3 & 63);
                }
                _reportInvalidOther(nextByte3 & 255);
                throw null;
            }
            _reportInvalidOther(nextByte2 & 255);
            throw null;
        }
        _reportInvalidOther(nextByte & 255);
        throw null;
    }

    /* access modifiers changed from: protected */
    public char _decodeEscaped() {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            byte b = bArr[i2];
            if (b == 34 || b == 47 || b == 92) {
                return (char) b;
            }
            if (b == 98) {
                return 8;
            }
            if (b == 102) {
                return 12;
            }
            if (b == 110) {
                return 10;
            }
            if (b == 114) {
                return 13;
            }
            if (b == 116) {
                return 9;
            }
            if (b != 117) {
                char _decodeCharForError = (char) _decodeCharForError(b);
                _handleUnrecognizedCharacterEscape(_decodeCharForError);
                return _decodeCharForError;
            }
            int i3 = 0;
            int i4 = 0;
            while (i3 < 4) {
                if (this._inputPtr < this._inputEnd || _loadMore()) {
                    byte[] bArr2 = this._inputBuffer;
                    int i5 = this._inputPtr;
                    this._inputPtr = i5 + 1;
                    byte b2 = bArr2[i5] & 255;
                    int charToHex = CharTypes.charToHex(b2);
                    if (charToHex >= 0) {
                        i4 = (i4 << 4) | charToHex;
                        i3++;
                    } else {
                        _reportUnexpectedChar(b2, "expected a hex-digit for character escape sequence");
                        throw null;
                    }
                } else {
                    _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
                    throw null;
                }
            }
            return (char) i4;
        }
        _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
        throw null;
    }

    /* access modifiers changed from: protected */
    public String _finishAndReturnString() {
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            _loadMoreGuaranteed();
            i2 = this._inputPtr;
        }
        int i3 = 0;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int min = Math.min(this._inputEnd, emptyAndGetCurrentSegment.length + i2);
        byte[] bArr = this._inputBuffer;
        while (true) {
            if (i2 >= min) {
                break;
            }
            byte b = bArr[i2] & 255;
            if (iArr[b] == 0) {
                i2++;
                emptyAndGetCurrentSegment[i3] = (char) b;
                i3++;
            } else if (b == 34) {
                this._inputPtr = i2 + 1;
                return this._textBuffer.setCurrentAndReturn(i3);
            }
        }
        this._inputPtr = i2;
        _finishString2(emptyAndGetCurrentSegment, i3);
        return this._textBuffer.contentsAsString();
    }

    /* access modifiers changed from: protected */
    public void _finishString() {
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            _loadMoreGuaranteed();
            i2 = this._inputPtr;
        }
        int i3 = 0;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int min = Math.min(this._inputEnd, emptyAndGetCurrentSegment.length + i2);
        byte[] bArr = this._inputBuffer;
        while (true) {
            if (i2 >= min) {
                break;
            }
            byte b = bArr[i2] & 255;
            if (iArr[b] == 0) {
                i2++;
                emptyAndGetCurrentSegment[i3] = (char) b;
                i3++;
            } else if (b == 34) {
                this._inputPtr = i2 + 1;
                this._textBuffer.setCurrentLength(i3);
                return;
            }
        }
        this._inputPtr = i2;
        _finishString2(emptyAndGetCurrentSegment, i3);
    }

    /* access modifiers changed from: protected */
    public final String _getText2(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int id = jsonToken.id();
        if (id == 5) {
            return this._parsingContext.getCurrentName();
        }
        if (id == 6 || id == 7 || id == 8) {
            return this._textBuffer.contentsAsString();
        }
        return jsonToken.asString();
    }

    /* access modifiers changed from: protected */
    public JsonToken _handleApos() {
        int i2;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        int i3 = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            if (i3 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i3 = 0;
            }
            int i4 = this._inputEnd;
            int length = this._inputPtr + (emptyAndGetCurrentSegment.length - i3);
            if (length < i4) {
                i4 = length;
            }
            while (true) {
                int i5 = this._inputPtr;
                if (i5 >= i4) {
                    break;
                }
                this._inputPtr = i5 + 1;
                byte b = bArr[i5] & 255;
                if (b != 39 && iArr[b] == 0) {
                    emptyAndGetCurrentSegment[i3] = (char) b;
                    i3++;
                } else if (b == 39) {
                    this._textBuffer.setCurrentLength(i3);
                    return JsonToken.VALUE_STRING;
                } else {
                    int i6 = iArr[b];
                    if (i6 == 1) {
                        i2 = _decodeEscaped();
                    } else if (i6 == 2) {
                        i2 = _decodeUtf8_2(b);
                    } else if (i6 != 3) {
                        if (i6 != 4) {
                            if (b < 32) {
                                _throwUnquotedSpace(b, "string value");
                            }
                            _reportInvalidChar(b);
                            throw null;
                        }
                        int _decodeUtf8_4 = _decodeUtf8_4(b);
                        int i7 = i3 + 1;
                        emptyAndGetCurrentSegment[i3] = (char) (55296 | (_decodeUtf8_4 >> 10));
                        if (i7 >= emptyAndGetCurrentSegment.length) {
                            emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                            i3 = 0;
                        } else {
                            i3 = i7;
                        }
                        i2 = (_decodeUtf8_4 & 1023) | 56320;
                    } else if (this._inputEnd - this._inputPtr >= 2) {
                        i2 = _decodeUtf8_3fast(b);
                    } else {
                        i2 = _decodeUtf8_3(b);
                    }
                    if (i3 >= emptyAndGetCurrentSegment.length) {
                        emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                        i3 = 0;
                    }
                    emptyAndGetCurrentSegment[i3] = (char) i2;
                    i3++;
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, byte], vars: [r4v0 ?, r4v1 ?, r4v4 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    protected com.fasterxml.jackson.core.JsonToken _handleInvalidNumberStart(
/*
Method generation error in method: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._handleInvalidNumberStart(int, boolean):com.fasterxml.jackson.core.JsonToken, dex: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v0 ?
    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:157)
    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:129)
    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
    
*/

    /* access modifiers changed from: protected */
    public String _handleOddName(int i2) {
        if (i2 == 39 && isEnabled(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
            return _parseAposName();
        }
        if (isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES)) {
            int[] inputCodeUtf8JsNames = CharTypes.getInputCodeUtf8JsNames();
            if (inputCodeUtf8JsNames[i2] == 0) {
                int[] iArr = this._quadBuffer;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (i3 < 4) {
                        i3++;
                        i5 = i2 | (i5 << 8);
                    } else {
                        if (i4 >= iArr.length) {
                            iArr = ParserBase.growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        iArr[i4] = i5;
                        i5 = i2;
                        i4++;
                        i3 = 1;
                    }
                    if (this._inputPtr < this._inputEnd || _loadMore()) {
                        byte[] bArr = this._inputBuffer;
                        int i6 = this._inputPtr;
                        i2 = bArr[i6] & 255;
                        if (inputCodeUtf8JsNames[i2] != 0) {
                            if (i3 > 0) {
                                if (i4 >= iArr.length) {
                                    int[] growArrayBy = ParserBase.growArrayBy(iArr, iArr.length);
                                    this._quadBuffer = growArrayBy;
                                    iArr = growArrayBy;
                                }
                                iArr[i4] = i5;
                                i4++;
                            }
                            String findName = this._symbols.findName(iArr, i4);
                            return findName == null ? addName(iArr, i4, i3) : findName;
                        }
                        this._inputPtr = i6 + 1;
                    } else {
                        _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
                        throw null;
                    }
                }
            } else {
                _reportUnexpectedChar(i2, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
                throw null;
            }
        } else {
            _reportUnexpectedChar((char) _decodeCharForError(i2), "was expecting double-quote to start field name");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (r4 != 44) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        if (r3._parsingContext.inArray() == false) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.JsonToken _handleUnexpectedValue(int r4) {
        /*
            r3 = this;
            r0 = 39
            r1 = 0
            if (r4 == r0) goto L_0x0098
            r0 = 73
            r2 = 1
            if (r4 == r0) goto L_0x007e
            r0 = 78
            if (r4 == r0) goto L_0x0064
            r0 = 93
            if (r4 == r0) goto L_0x0045
            r0 = 125(0x7d, float:1.75E-43)
            if (r4 == r0) goto L_0x005e
            r0 = 43
            if (r4 == r0) goto L_0x0020
            r0 = 44
            if (r4 == r0) goto L_0x004e
            goto L_0x00a5
        L_0x0020:
            int r4 = r3._inputPtr
            int r0 = r3._inputEnd
            if (r4 < r0) goto L_0x0033
            boolean r4 = r3._loadMore()
            if (r4 == 0) goto L_0x002d
            goto L_0x0033
        L_0x002d:
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r3._reportInvalidEOFInValue(r4)
            throw r1
        L_0x0033:
            byte[] r4 = r3._inputBuffer
            int r0 = r3._inputPtr
            int r1 = r0 + 1
            r3._inputPtr = r1
            byte r4 = r4[r0]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleInvalidNumberStart(r4, r0)
            return r4
        L_0x0045:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3._parsingContext
            boolean r0 = r0.inArray()
            if (r0 != 0) goto L_0x004e
            goto L_0x00a5
        L_0x004e:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L_0x005e
            int r4 = r3._inputPtr
            int r4 = r4 - r2
            r3._inputPtr = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L_0x005e:
            java.lang.String r0 = "expected a value"
            r3._reportUnexpectedChar(r4, r0)
            throw r1
        L_0x0064:
            java.lang.String r4 = "NaN"
            r3._matchToken(r4, r2)
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L_0x0078
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r4, r0)
            return r4
        L_0x0078:
            java.lang.String r4 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r4)
            throw r1
        L_0x007e:
            java.lang.String r4 = "Infinity"
            r3._matchToken(r4, r2)
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L_0x0092
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r4, r0)
            return r4
        L_0x0092:
            java.lang.String r4 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r4)
            throw r1
        L_0x0098:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L_0x00a5
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleApos()
            return r4
        L_0x00a5:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto L_0x00c3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = ""
            r0.append(r2)
            char r4 = (char) r4
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "('true', 'false' or 'null')"
            r3._reportInvalidToken(r4, r0)
            throw r1
        L_0x00c3:
            java.lang.String r0 = "expected a valid value (number, String, array, object, 'true', 'false' or 'null')"
            r3._reportUnexpectedChar(r4, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._handleUnexpectedValue(int):com.fasterxml.jackson.core.JsonToken");
    }

    /* access modifiers changed from: protected */
    public final boolean _loadMore() {
        byte[] bArr;
        int length;
        int i2 = this._inputEnd;
        this._currInputProcessed += (long) i2;
        this._currInputRowStart -= i2;
        this._nameStartOffset -= i2;
        InputStream inputStream = this._inputStream;
        if (inputStream == null || (length = bArr.length) == 0) {
            return false;
        }
        int read = inputStream.read((bArr = this._inputBuffer), 0, length);
        if (read > 0) {
            this._inputPtr = 0;
            this._inputEnd = read;
            return true;
        }
        _closeInput();
        if (read == 0) {
            throw new IOException("InputStream.read() returned 0 characters when trying to read " + this._inputBuffer.length + " bytes");
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void _loadMoreGuaranteed() {
        if (!_loadMore()) {
            _reportInvalidEOF();
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public final void _matchFalse() {
        byte b;
        int i2 = this._inputPtr;
        if (i2 + 4 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            if (bArr[i2] == 97) {
                int i4 = i3 + 1;
                if (bArr[i3] == 108) {
                    int i5 = i4 + 1;
                    if (bArr[i4] == 115) {
                        int i6 = i5 + 1;
                        if (bArr[i5] == 101 && ((b = bArr[i6] & 255) < 48 || b == 93 || b == 125)) {
                            this._inputPtr = i6;
                            return;
                        }
                    }
                }
            }
        }
        _matchToken2("false", 1);
    }

    /* access modifiers changed from: protected */
    public final void _matchNull() {
        byte b;
        int i2 = this._inputPtr;
        if (i2 + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            if (bArr[i2] == 117) {
                int i4 = i3 + 1;
                if (bArr[i3] == 108) {
                    int i5 = i4 + 1;
                    if (bArr[i4] == 108 && ((b = bArr[i5] & 255) < 48 || b == 93 || b == 125)) {
                        this._inputPtr = i5;
                        return;
                    }
                }
            }
        }
        _matchToken2("null", 1);
    }

    /* access modifiers changed from: protected */
    public final void _matchToken(String str, int i2) {
        int length = str.length();
        if (this._inputPtr + length >= this._inputEnd) {
            _matchToken2(str, i2);
            return;
        }
        while (this._inputBuffer[this._inputPtr] == str.charAt(i2)) {
            int i3 = this._inputPtr + 1;
            this._inputPtr = i3;
            i2++;
            if (i2 >= length) {
                byte b = this._inputBuffer[i3] & 255;
                if (b >= 48 && b != 93 && b != 125) {
                    _checkMatchEnd(str, i2, b);
                    return;
                }
                return;
            }
        }
        _reportInvalidToken(str.substring(0, i2));
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void _matchTrue() {
        byte b;
        int i2 = this._inputPtr;
        if (i2 + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            if (bArr[i2] == 114) {
                int i4 = i3 + 1;
                if (bArr[i3] == 117) {
                    int i5 = i4 + 1;
                    if (bArr[i4] == 101 && ((b = bArr[i5] & 255) < 48 || b == 93 || b == 125)) {
                        this._inputPtr = i5;
                        return;
                    }
                }
            }
        }
        _matchToken2("true", 1);
    }

    /* access modifiers changed from: protected */
    public String _parseAposName() {
        int i2;
        int i3;
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            byte[] bArr = this._inputBuffer;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            char c = bArr[i4] & 255;
            if (c == '\'') {
                return "";
            }
            int[] iArr = this._quadBuffer;
            int[] iArr2 = _icLatin1;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (c != '\'') {
                if (!(iArr2[c] == 0 || c == '\"')) {
                    if (c != '\\') {
                        _throwUnquotedSpace(c, "name");
                    } else {
                        c = _decodeEscaped();
                    }
                    if (c > 127) {
                        if (i3 >= 4) {
                            if (i6 >= iArr.length) {
                                iArr = ParserBase.growArrayBy(iArr, iArr.length);
                                this._quadBuffer = iArr;
                            }
                            iArr[i6] = i2;
                            i6++;
                            i3 = 0;
                            i2 = 0;
                        }
                        if (c < 2048) {
                            i2 = (i2 << 8) | (c >> 6) | 192;
                            i3++;
                        } else {
                            int i8 = (i2 << 8) | (c >> 12) | 224;
                            int i9 = i3 + 1;
                            if (i9 >= 4) {
                                if (i6 >= iArr.length) {
                                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                                    this._quadBuffer = iArr;
                                }
                                iArr[i6] = i8;
                                i6++;
                                i9 = 0;
                                i8 = 0;
                            }
                            i2 = (i8 << 8) | ((c >> 6) & 63) | 128;
                            i3 = i9 + 1;
                        }
                        c = (c & '?') | 128;
                    }
                }
                if (i3 < 4) {
                    i5 = i3 + 1;
                    i7 = c | (i2 << 8);
                } else {
                    if (i6 >= iArr.length) {
                        iArr = ParserBase.growArrayBy(iArr, iArr.length);
                        this._quadBuffer = iArr;
                    }
                    iArr[i6] = i2;
                    i7 = c;
                    i6++;
                    i5 = 1;
                }
                if (this._inputPtr < this._inputEnd || _loadMore()) {
                    byte[] bArr2 = this._inputBuffer;
                    int i10 = this._inputPtr;
                    this._inputPtr = i10 + 1;
                    c = bArr2[i10] & 255;
                } else {
                    _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
                    throw null;
                }
            }
            if (i3 > 0) {
                if (i6 >= iArr.length) {
                    int[] growArrayBy = ParserBase.growArrayBy(iArr, iArr.length);
                    this._quadBuffer = growArrayBy;
                    iArr = growArrayBy;
                }
                iArr[i6] = _padLastQuad(i2, i3);
                i6++;
            }
            String findName = this._symbols.findName(iArr, i6);
            return findName == null ? addName(iArr, i6, i3) : findName;
        }
        _reportInvalidEOF(": was expecting closing ''' for field name", JsonToken.FIELD_NAME);
        throw null;
    }

    /* access modifiers changed from: protected */
    public final String _parseName(int i2) {
        if (i2 != 34) {
            return _handleOddName(i2);
        }
        int i3 = this._inputPtr;
        if (i3 + 13 > this._inputEnd) {
            return slowParseName();
        }
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        byte b = bArr[i3] & 255;
        if (iArr[b] == 0) {
            int i5 = i4 + 1;
            this._inputPtr = i5;
            byte b2 = bArr[i4] & 255;
            if (iArr[b2] == 0) {
                byte b3 = (b << 8) | b2;
                int i6 = i5 + 1;
                this._inputPtr = i6;
                byte b4 = bArr[i5] & 255;
                if (iArr[b4] == 0) {
                    byte b5 = (b3 << 8) | b4;
                    int i7 = i6 + 1;
                    this._inputPtr = i7;
                    byte b6 = bArr[i6] & 255;
                    if (iArr[b6] == 0) {
                        byte b7 = (b5 << 8) | b6;
                        this._inputPtr = i7 + 1;
                        byte b8 = bArr[i7] & 255;
                        if (iArr[b8] == 0) {
                            this._quad1 = b7;
                            return parseMediumName(b8);
                        } else if (b8 == 34) {
                            return findName(b7, 4);
                        } else {
                            return parseName(b7, b8, 4);
                        }
                    } else if (b6 == 34) {
                        return findName(b5, 3);
                    } else {
                        return parseName(b5, b6, 3);
                    }
                } else if (b4 == 34) {
                    return findName(b3, 2);
                } else {
                    return parseName(b3, b4, 2);
                }
            } else if (b2 == 34) {
                return findName(b, 1);
            } else {
                return parseName(b, b2, 1);
            }
        } else if (b == 34) {
            return "";
        } else {
            return parseName(0, b, 0);
        }
    }

    /* access modifiers changed from: protected */
    public JsonToken _parseNegNumber() {
        byte b;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment[0] = '-';
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        int i3 = bArr[i2] & 255;
        if (i3 <= 48) {
            if (i3 != 48) {
                return _handleInvalidNumberStart(i3, true);
            }
            i3 = _verifyNoLeadingZeroes();
        } else if (i3 > 57) {
            return _handleInvalidNumberStart(i3, true);
        }
        int i4 = 2;
        emptyAndGetCurrentSegment[1] = (char) i3;
        int min = Math.min(this._inputEnd, (this._inputPtr + emptyAndGetCurrentSegment.length) - 2);
        int i5 = 1;
        while (true) {
            int i6 = this._inputPtr;
            if (i6 >= min) {
                return _parseNumber2(emptyAndGetCurrentSegment, i4, true, i5);
            }
            byte[] bArr2 = this._inputBuffer;
            this._inputPtr = i6 + 1;
            b = bArr2[i6] & 255;
            if (b >= 48 && b <= 57) {
                i5++;
                emptyAndGetCurrentSegment[i4] = (char) b;
                i4++;
            }
        }
        if (b == 46 || b == 101 || b == 69) {
            return _parseFloat(emptyAndGetCurrentSegment, i4, b, true, i5);
        }
        this._inputPtr--;
        this._textBuffer.setCurrentLength(i4);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(b);
        }
        return resetInt(true, i5);
    }

    /* access modifiers changed from: protected */
    public JsonToken _parsePosNumber(int i2) {
        byte b;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        if (i2 == 48) {
            i2 = _verifyNoLeadingZeroes();
        }
        emptyAndGetCurrentSegment[0] = (char) i2;
        int min = Math.min(this._inputEnd, (this._inputPtr + emptyAndGetCurrentSegment.length) - 1);
        int i3 = 1;
        int i4 = 1;
        while (true) {
            int i5 = this._inputPtr;
            if (i5 >= min) {
                return _parseNumber2(emptyAndGetCurrentSegment, i3, false, i4);
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i5 + 1;
            b = bArr[i5] & 255;
            if (b >= 48 && b <= 57) {
                i4++;
                emptyAndGetCurrentSegment[i3] = (char) b;
                i3++;
            }
        }
        if (b == 46 || b == 101 || b == 69) {
            return _parseFloat(emptyAndGetCurrentSegment, i3, b, false, i4);
        }
        this._inputPtr--;
        this._textBuffer.setCurrentLength(i3);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(b);
        }
        return resetInt(false, i4);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r10 < 0) goto L_0x0171;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int _readBinary(com.fasterxml.jackson.core.Base64Variant r17, java.io.OutputStream r18, byte[] r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int r4 = r3.length
            r5 = 3
            int r4 = r4 - r5
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x000e:
            int r9 = r0._inputPtr
            int r10 = r0._inputEnd
            if (r9 < r10) goto L_0x0017
            r16._loadMoreGuaranteed()
        L_0x0017:
            byte[] r9 = r0._inputBuffer
            int r10 = r0._inputPtr
            int r11 = r10 + 1
            r0._inputPtr = r11
            byte r9 = r9[r10]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r10 = 32
            if (r9 <= r10) goto L_0x0171
            int r10 = r1.decodeBase64Char((int) r9)
            r11 = 34
            if (r10 >= 0) goto L_0x003c
            if (r9 != r11) goto L_0x0034
        L_0x0031:
            r11 = 0
            goto L_0x012a
        L_0x0034:
            int r10 = r0._decodeBase64Escape((com.fasterxml.jackson.core.Base64Variant) r1, (int) r9, (int) r6)
            if (r10 >= 0) goto L_0x003c
            goto L_0x0171
        L_0x003c:
            if (r7 <= r4) goto L_0x0043
            int r8 = r8 + r7
            r2.write(r3, r6, r7)
            r7 = 0
        L_0x0043:
            int r9 = r0._inputPtr
            int r12 = r0._inputEnd
            if (r9 < r12) goto L_0x004c
            r16._loadMoreGuaranteed()
        L_0x004c:
            byte[] r9 = r0._inputBuffer
            int r12 = r0._inputPtr
            int r13 = r12 + 1
            r0._inputPtr = r13
            byte r9 = r9[r12]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r12 = r1.decodeBase64Char((int) r9)
            r13 = 1
            if (r12 >= 0) goto L_0x0063
            int r12 = r0._decodeBase64Escape((com.fasterxml.jackson.core.Base64Variant) r1, (int) r9, (int) r13)
        L_0x0063:
            int r9 = r10 << 6
            r9 = r9 | r12
            int r10 = r0._inputPtr
            int r12 = r0._inputEnd
            if (r10 < r12) goto L_0x006f
            r16._loadMoreGuaranteed()
        L_0x006f:
            byte[] r10 = r0._inputBuffer
            int r12 = r0._inputPtr
            int r14 = r12 + 1
            r0._inputPtr = r14
            byte r10 = r10[r12]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r12 = r1.decodeBase64Char((int) r10)
            r14 = 0
            r15 = 2
            r6 = -2
            if (r12 >= 0) goto L_0x00f2
            if (r12 == r6) goto L_0x00a5
            if (r10 != r11) goto L_0x00a0
            int r4 = r9 >> 4
            int r5 = r7 + 1
            byte r4 = (byte) r4
            r3[r7] = r4
            boolean r4 = r17.usesPadding()
            if (r4 != 0) goto L_0x0097
            r7 = r5
            goto L_0x0031
        L_0x0097:
            int r2 = r0._inputPtr
            int r2 = r2 - r13
            r0._inputPtr = r2
            r16._handleBase64MissingPadding(r17)
            throw r14
        L_0x00a0:
            int r10 = r0._decodeBase64Escape((com.fasterxml.jackson.core.Base64Variant) r1, (int) r10, (int) r15)
            r12 = r10
        L_0x00a5:
            if (r12 != r6) goto L_0x00f2
            int r10 = r0._inputPtr
            int r11 = r0._inputEnd
            if (r10 < r11) goto L_0x00b0
            r16._loadMoreGuaranteed()
        L_0x00b0:
            byte[] r10 = r0._inputBuffer
            int r11 = r0._inputPtr
            int r12 = r11 + 1
            r0._inputPtr = r12
            byte r10 = r10[r11]
            r10 = r10 & 255(0xff, float:3.57E-43)
            boolean r11 = r1.usesPaddingChar((int) r10)
            if (r11 != 0) goto L_0x00e8
            int r11 = r0._decodeBase64Escape((com.fasterxml.jackson.core.Base64Variant) r1, (int) r10, (int) r5)
            if (r11 != r6) goto L_0x00c9
            goto L_0x00e8
        L_0x00c9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "expected padding character '"
            r2.append(r3)
            char r3 = r17.getPaddingChar()
            r2.append(r3)
            java.lang.String r3 = "'"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r1 = r0.reportInvalidBase64Char(r1, r10, r5, r2)
            throw r1
        L_0x00e8:
            int r6 = r9 >> 4
            int r9 = r7 + 1
            byte r6 = (byte) r6
            r3[r7] = r6
            r7 = r9
            goto L_0x0174
        L_0x00f2:
            int r9 = r9 << 6
            r9 = r9 | r12
            int r10 = r0._inputPtr
            int r12 = r0._inputEnd
            if (r10 < r12) goto L_0x00fe
            r16._loadMoreGuaranteed()
        L_0x00fe:
            byte[] r10 = r0._inputBuffer
            int r12 = r0._inputPtr
            int r5 = r12 + 1
            r0._inputPtr = r5
            byte r5 = r10[r12]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r10 = r1.decodeBase64Char((int) r5)
            if (r10 >= 0) goto L_0x0157
            if (r10 == r6) goto L_0x0144
            if (r5 != r11) goto L_0x013c
            int r4 = r9 >> 2
            int r5 = r7 + 1
            int r6 = r4 >> 8
            byte r6 = (byte) r6
            r3[r7] = r6
            int r7 = r5 + 1
            byte r4 = (byte) r4
            r3[r5] = r4
            boolean r4 = r17.usesPadding()
            if (r4 != 0) goto L_0x0133
            goto L_0x0031
        L_0x012a:
            r0._tokenIncomplete = r11
            if (r7 <= 0) goto L_0x0132
            int r8 = r8 + r7
            r2.write(r3, r11, r7)
        L_0x0132:
            return r8
        L_0x0133:
            int r2 = r0._inputPtr
            int r2 = r2 - r13
            r0._inputPtr = r2
            r16._handleBase64MissingPadding(r17)
            throw r14
        L_0x013c:
            r11 = 0
            r12 = 3
            int r5 = r0._decodeBase64Escape((com.fasterxml.jackson.core.Base64Variant) r1, (int) r5, (int) r12)
            r10 = r5
            goto L_0x0146
        L_0x0144:
            r11 = 0
            r12 = 3
        L_0x0146:
            if (r10 != r6) goto L_0x0159
            int r5 = r9 >> 2
            int r6 = r7 + 1
            int r9 = r5 >> 8
            byte r9 = (byte) r9
            r3[r7] = r9
            int r7 = r6 + 1
            byte r5 = (byte) r5
            r3[r6] = r5
            goto L_0x0173
        L_0x0157:
            r11 = 0
            r12 = 3
        L_0x0159:
            int r5 = r9 << 6
            r5 = r5 | r10
            int r6 = r7 + 1
            int r9 = r5 >> 16
            byte r9 = (byte) r9
            r3[r7] = r9
            int r7 = r6 + 1
            int r9 = r5 >> 8
            byte r9 = (byte) r9
            r3[r6] = r9
            int r6 = r7 + 1
            byte r5 = (byte) r5
            r3[r7] = r5
            r7 = r6
            goto L_0x0173
        L_0x0171:
            r11 = 0
            r12 = 3
        L_0x0173:
            r5 = 3
        L_0x0174:
            r6 = 0
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._readBinary(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream, byte[]):int");
    }

    /* access modifiers changed from: protected */
    public void _releaseBuffers() {
        byte[] bArr;
        super._releaseBuffers();
        this._symbols.release();
        if (this._bufferRecyclable && (bArr = this._inputBuffer) != null) {
            this._inputBuffer = ParserMinimalBase.NO_BYTES;
            this._ioContext.releaseReadIOBuffer(bArr);
        }
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidChar(int i2) {
        if (i2 < 32) {
            _throwInvalidSpace(i2);
            throw null;
        } else {
            _reportInvalidInitial(i2);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidInitial(int i2) {
        _reportError("Invalid UTF-8 start byte 0x" + Integer.toHexString(i2));
        throw null;
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidOther(int i2) {
        _reportError("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i2));
        throw null;
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidToken(String str) {
        _reportInvalidToken(str, "'null', 'true', 'false' or NaN");
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void _skipCR() {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            if (bArr[i2] == 10) {
                this._inputPtr = i2 + 1;
            }
        }
        this._currInputRow++;
        this._currInputRowStart = this._inputPtr;
    }

    /* access modifiers changed from: protected */
    public void _skipString() {
        this._tokenIncomplete = false;
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i2 = this._inputPtr;
            int i3 = this._inputEnd;
            if (i2 >= i3) {
                _loadMoreGuaranteed();
                i2 = this._inputPtr;
                i3 = this._inputEnd;
            }
            while (true) {
                if (i2 >= i3) {
                    this._inputPtr = i2;
                    break;
                }
                int i4 = i2 + 1;
                byte b = bArr[i2] & 255;
                if (iArr[b] != 0) {
                    this._inputPtr = i4;
                    if (b != 34) {
                        int i5 = iArr[b];
                        if (i5 == 1) {
                            _decodeEscaped();
                        } else if (i5 == 2) {
                            _skipUtf8_2();
                        } else if (i5 == 3) {
                            _skipUtf8_3();
                        } else if (i5 == 4) {
                            _skipUtf8_4(b);
                        } else if (b < 32) {
                            _throwUnquotedSpace(b, "string value");
                        } else {
                            _reportInvalidChar(b);
                            throw null;
                        }
                    } else {
                        return;
                    }
                } else {
                    i2 = i4;
                }
            }
        }
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING || (jsonToken == JsonToken.VALUE_EMBEDDED_OBJECT && this._binaryValue != null)) {
            if (this._tokenIncomplete) {
                try {
                    this._binaryValue = _decodeBase64(base64Variant);
                    this._tokenIncomplete = false;
                } catch (IllegalArgumentException e2) {
                    throw _constructError("Failed to decode VALUE_STRING as base64 (" + base64Variant + "): " + e2.getMessage());
                }
            } else if (this._binaryValue == null) {
                ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
                _decodeBase64(getText(), _getByteArrayBuilder, base64Variant);
                this._binaryValue = _getByteArrayBuilder.toByteArray();
            }
            return this._binaryValue;
        }
        _reportError("Current token (" + this._currToken + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        throw null;
    }

    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    public JsonLocation getCurrentLocation() {
        return new JsonLocation(_getSourceReference(), this._currInputProcessed + ((long) this._inputPtr), -1, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    public String getText() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return _getText2(jsonToken);
        }
        if (!this._tokenIncomplete) {
            return this._textBuffer.contentsAsString();
        }
        this._tokenIncomplete = false;
        return _finishAndReturnString();
    }

    public char[] getTextCharacters() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return null;
        }
        int id = jsonToken.id();
        if (id != 5) {
            if (id != 6) {
                if (!(id == 7 || id == 8)) {
                    return this._currToken.asCharArray();
                }
            } else if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.getTextBuffer();
        }
        if (!this._nameCopied) {
            String currentName = this._parsingContext.getCurrentName();
            int length = currentName.length();
            char[] cArr = this._nameCopyBuffer;
            if (cArr == null) {
                this._nameCopyBuffer = this._ioContext.allocNameCopyBuffer(length);
            } else if (cArr.length < length) {
                this._nameCopyBuffer = new char[length];
            }
            currentName.getChars(0, length, this._nameCopyBuffer, 0);
            this._nameCopied = true;
        }
        return this._nameCopyBuffer;
    }

    public int getTextLength() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        int id = jsonToken.id();
        if (id == 5) {
            return this._parsingContext.getCurrentName().length();
        }
        if (id != 6) {
            if (!(id == 7 || id == 8)) {
                return this._currToken.asCharArray().length;
            }
        } else if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r0 != 8) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getTextOffset() {
        /*
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3._currToken
            r1 = 0
            if (r0 == 0) goto L_0x0024
            int r0 = r0.id()
            r2 = 6
            if (r0 == r2) goto L_0x0014
            r2 = 7
            if (r0 == r2) goto L_0x001d
            r2 = 8
            if (r0 == r2) goto L_0x001d
            goto L_0x0024
        L_0x0014:
            boolean r0 = r3._tokenIncomplete
            if (r0 == 0) goto L_0x001d
            r3._tokenIncomplete = r1
            r3._finishString()
        L_0x001d:
            com.fasterxml.jackson.core.util.TextBuffer r0 = r3._textBuffer
            int r0 = r0.getTextOffset()
            return r0
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getTextOffset():int");
    }

    public JsonLocation getTokenLocation() {
        if (this._currToken == JsonToken.FIELD_NAME) {
            return new JsonLocation(_getSourceReference(), this._currInputProcessed + ((long) (this._nameStartOffset - 1)), -1, this._nameStartRow, this._nameStartCol);
        }
        return new JsonLocation(_getSourceReference(), this._tokenInputTotal - 1, -1, this._tokenInputRow, this._tokenInputCol);
    }

    public int getValueAsInt() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(0);
        }
        int i2 = this._numTypesValid;
        if ((i2 & 1) == 0) {
            if (i2 == 0) {
                return _parseIntValue();
            }
            if ((i2 & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    public String getValueAsString() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (!this._tokenIncomplete) {
                return this._textBuffer.contentsAsString();
            }
            this._tokenIncomplete = false;
            return _finishAndReturnString();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        } else {
            return super.getValueAsString((String) null);
        }
    }

    public String nextFieldName() {
        JsonToken jsonToken;
        this._numTypesValid = 0;
        if (this._currToken == JsonToken.FIELD_NAME) {
            _nextAfterName();
            return null;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd == 93) {
            _closeArrayScope();
            this._currToken = JsonToken.END_ARRAY;
            return null;
        } else if (_skipWSOrEnd == 125) {
            _closeObjectScope();
            this._currToken = JsonToken.END_OBJECT;
            return null;
        } else {
            if (this._parsingContext.expectComma()) {
                if (_skipWSOrEnd == 44) {
                    _skipWSOrEnd = _skipWS();
                    if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                        _closeScope(_skipWSOrEnd);
                        return null;
                    }
                } else {
                    _reportUnexpectedChar(_skipWSOrEnd, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
                    throw null;
                }
            }
            if (!this._parsingContext.inObject()) {
                _updateLocation();
                _nextTokenNotInObject(_skipWSOrEnd);
                return null;
            }
            _updateNameLocation();
            String _parseName = _parseName(_skipWSOrEnd);
            this._parsingContext.setCurrentName(_parseName);
            this._currToken = JsonToken.FIELD_NAME;
            int _skipColon = _skipColon();
            _updateLocation();
            if (_skipColon == 34) {
                this._tokenIncomplete = true;
                this._nextToken = JsonToken.VALUE_STRING;
                return _parseName;
            }
            if (_skipColon == 45) {
                jsonToken = _parseNegNumber();
            } else if (_skipColon == 91) {
                jsonToken = JsonToken.START_ARRAY;
            } else if (_skipColon == 102) {
                _matchFalse();
                jsonToken = JsonToken.VALUE_FALSE;
            } else if (_skipColon == 110) {
                _matchNull();
                jsonToken = JsonToken.VALUE_NULL;
            } else if (_skipColon == 116) {
                _matchTrue();
                jsonToken = JsonToken.VALUE_TRUE;
            } else if (_skipColon != 123) {
                switch (_skipColon) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        jsonToken = _parsePosNumber(_skipColon);
                        break;
                    default:
                        jsonToken = _handleUnexpectedValue(_skipColon);
                        break;
                }
            } else {
                jsonToken = JsonToken.START_OBJECT;
            }
            this._nextToken = jsonToken;
            return _parseName;
        }
    }

    public String nextTextValue() {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken != JsonToken.VALUE_STRING) {
                if (jsonToken == JsonToken.START_ARRAY) {
                    this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
                } else if (jsonToken == JsonToken.START_OBJECT) {
                    this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                }
                return null;
            } else if (!this._tokenIncomplete) {
                return this._textBuffer.contentsAsString();
            } else {
                this._tokenIncomplete = false;
                return _finishAndReturnString();
            }
        } else if (nextToken() == JsonToken.VALUE_STRING) {
            return getText();
        } else {
            return null;
        }
    }

    public JsonToken nextToken() {
        JsonToken jsonToken;
        if (this._currToken == JsonToken.FIELD_NAME) {
            return _nextAfterName();
        }
        this._numTypesValid = 0;
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd == 93) {
            _closeArrayScope();
            JsonToken jsonToken2 = JsonToken.END_ARRAY;
            this._currToken = jsonToken2;
            return jsonToken2;
        } else if (_skipWSOrEnd == 125) {
            _closeObjectScope();
            JsonToken jsonToken3 = JsonToken.END_OBJECT;
            this._currToken = jsonToken3;
            return jsonToken3;
        } else {
            if (this._parsingContext.expectComma()) {
                if (_skipWSOrEnd == 44) {
                    _skipWSOrEnd = _skipWS();
                    if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                        return _closeScope(_skipWSOrEnd);
                    }
                } else {
                    _reportUnexpectedChar(_skipWSOrEnd, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
                    throw null;
                }
            }
            if (!this._parsingContext.inObject()) {
                _updateLocation();
                return _nextTokenNotInObject(_skipWSOrEnd);
            }
            _updateNameLocation();
            this._parsingContext.setCurrentName(_parseName(_skipWSOrEnd));
            this._currToken = JsonToken.FIELD_NAME;
            int _skipColon = _skipColon();
            _updateLocation();
            if (_skipColon == 34) {
                this._tokenIncomplete = true;
                this._nextToken = JsonToken.VALUE_STRING;
                return this._currToken;
            }
            if (_skipColon == 45) {
                jsonToken = _parseNegNumber();
            } else if (_skipColon == 91) {
                jsonToken = JsonToken.START_ARRAY;
            } else if (_skipColon == 102) {
                _matchFalse();
                jsonToken = JsonToken.VALUE_FALSE;
            } else if (_skipColon == 110) {
                _matchNull();
                jsonToken = JsonToken.VALUE_NULL;
            } else if (_skipColon == 116) {
                _matchTrue();
                jsonToken = JsonToken.VALUE_TRUE;
            } else if (_skipColon != 123) {
                switch (_skipColon) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        jsonToken = _parsePosNumber(_skipColon);
                        break;
                    default:
                        jsonToken = _handleUnexpectedValue(_skipColon);
                        break;
                }
            } else {
                jsonToken = JsonToken.START_OBJECT;
            }
            this._nextToken = jsonToken;
            return this._currToken;
        }
    }

    /* access modifiers changed from: protected */
    public final String parseEscapedName(int[] iArr, int i2, int i3, int i4, int i5) {
        int[] iArr2 = _icLatin1;
        while (true) {
            if (iArr2[i4] != 0) {
                if (i4 == 34) {
                    if (r10 > 0) {
                        if (i2 >= iArr.length) {
                            iArr = ParserBase.growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        iArr[i2] = _padLastQuad(r8, r10);
                        i2++;
                    }
                    String findName = this._symbols.findName(iArr, i2);
                    return findName == null ? addName(iArr, i2, r10) : findName;
                }
                if (i4 != 92) {
                    _throwUnquotedSpace(i4, "name");
                } else {
                    i4 = _decodeEscaped();
                }
                if (i4 > 127) {
                    int i6 = 0;
                    if (r10 >= 4) {
                        if (i2 >= iArr.length) {
                            iArr = ParserBase.growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        iArr[i2] = r8;
                        i2++;
                        r8 = 0;
                        r10 = 0;
                    }
                    if (i4 < 2048) {
                        r8 = (r8 << 8) | (i4 >> 6) | 192;
                        r10++;
                    } else {
                        int i7 = (r8 << 8) | (i4 >> 12) | 224;
                        int i8 = r10 + 1;
                        if (i8 >= 4) {
                            if (i2 >= iArr.length) {
                                iArr = ParserBase.growArrayBy(iArr, iArr.length);
                                this._quadBuffer = iArr;
                            }
                            iArr[i2] = i7;
                            i2++;
                            i8 = 0;
                        } else {
                            i6 = i7;
                        }
                        r8 = (i6 << 8) | ((i4 >> 6) & 63) | 128;
                        r10 = i8 + 1;
                    }
                    i4 = (i4 & 63) | 128;
                }
            }
            if (r10 < 4) {
                i5 = r10 + 1;
                i3 = (r8 << 8) | i4;
            } else {
                if (i2 >= iArr.length) {
                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i2] = r8;
                i3 = i4;
                i2++;
                i5 = 1;
            }
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i9 = this._inputPtr;
                this._inputPtr = i9 + 1;
                i4 = bArr[i9] & 255;
            } else {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
                throw null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final String parseLongName(int i2, int i3, int i4) {
        int[] iArr = this._quadBuffer;
        iArr[0] = this._quad1;
        iArr[1] = i3;
        iArr[2] = i4;
        byte[] bArr = this._inputBuffer;
        int[] iArr2 = _icLatin1;
        byte b = i2;
        int i5 = 3;
        while (true) {
            int i6 = this._inputPtr;
            if (i6 + 4 <= this._inputEnd) {
                int i7 = i6 + 1;
                this._inputPtr = i7;
                byte b2 = bArr[i6] & 255;
                if (iArr2[b2] == 0) {
                    byte b3 = (b << 8) | b2;
                    int i8 = i7 + 1;
                    this._inputPtr = i8;
                    byte b4 = bArr[i7] & 255;
                    if (iArr2[b4] == 0) {
                        byte b5 = (b3 << 8) | b4;
                        int i9 = i8 + 1;
                        this._inputPtr = i9;
                        byte b6 = bArr[i8] & 255;
                        if (iArr2[b6] == 0) {
                            int i10 = (b5 << 8) | b6;
                            this._inputPtr = i9 + 1;
                            byte b7 = bArr[i9] & 255;
                            if (iArr2[b7] == 0) {
                                int[] iArr3 = this._quadBuffer;
                                if (i5 >= iArr3.length) {
                                    this._quadBuffer = ParserBase.growArrayBy(iArr3, i5);
                                }
                                this._quadBuffer[i5] = i10;
                                b = b7;
                                i5++;
                            } else if (b7 == 34) {
                                return findName(this._quadBuffer, i5, i10, 4);
                            } else {
                                return parseEscapedName(this._quadBuffer, i5, i10, b7, 4);
                            }
                        } else if (b6 == 34) {
                            return findName(this._quadBuffer, i5, (int) b5, 3);
                        } else {
                            return parseEscapedName(this._quadBuffer, i5, b5, b6, 3);
                        }
                    } else if (b4 == 34) {
                        return findName(this._quadBuffer, i5, (int) b3, 2);
                    } else {
                        return parseEscapedName(this._quadBuffer, i5, b3, b4, 2);
                    }
                } else if (b2 == 34) {
                    return findName(this._quadBuffer, i5, b, 1);
                } else {
                    return parseEscapedName(this._quadBuffer, i5, b, b2, 1);
                }
            } else {
                return parseEscapedName(this._quadBuffer, i5, 0, b, 0);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final String parseMediumName(int i2) {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        byte b = bArr[i3] & 255;
        if (iArr[b] == 0) {
            byte b2 = (i2 << 8) | b;
            int i5 = i4 + 1;
            this._inputPtr = i5;
            byte b3 = bArr[i4] & 255;
            if (iArr[b3] == 0) {
                byte b4 = (b2 << 8) | b3;
                int i6 = i5 + 1;
                this._inputPtr = i6;
                byte b5 = bArr[i5] & 255;
                if (iArr[b5] == 0) {
                    byte b6 = (b4 << 8) | b5;
                    this._inputPtr = i6 + 1;
                    byte b7 = bArr[i6] & 255;
                    if (iArr[b7] == 0) {
                        return parseMediumName2(b7, b6);
                    }
                    if (b7 == 34) {
                        return findName(this._quad1, b6, 4);
                    }
                    return parseName(this._quad1, b6, b7, 4);
                } else if (b5 == 34) {
                    return findName(this._quad1, b4, 3);
                } else {
                    return parseName(this._quad1, b4, b5, 3);
                }
            } else if (b3 == 34) {
                return findName(this._quad1, b2, 2);
            } else {
                return parseName(this._quad1, b2, b3, 2);
            }
        } else if (b == 34) {
            return findName(this._quad1, i2, 1);
        } else {
            return parseName(this._quad1, i2, b, 1);
        }
    }

    /* access modifiers changed from: protected */
    public final String parseMediumName2(int i2, int i3) {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i4 = this._inputPtr;
        int i5 = i4 + 1;
        this._inputPtr = i5;
        byte b = bArr[i4] & 255;
        if (iArr[b] == 0) {
            byte b2 = (i2 << 8) | b;
            int i6 = i5 + 1;
            this._inputPtr = i6;
            byte b3 = bArr[i5] & 255;
            if (iArr[b3] == 0) {
                byte b4 = (b2 << 8) | b3;
                int i7 = i6 + 1;
                this._inputPtr = i7;
                byte b5 = bArr[i6] & 255;
                if (iArr[b5] == 0) {
                    byte b6 = (b4 << 8) | b5;
                    this._inputPtr = i7 + 1;
                    byte b7 = bArr[i7] & 255;
                    if (iArr[b7] == 0) {
                        return parseLongName(b7, i3, b6);
                    }
                    if (b7 == 34) {
                        return findName(this._quad1, i3, (int) b6, 4);
                    }
                    return parseName(this._quad1, i3, b6, b7, 4);
                } else if (b5 == 34) {
                    return findName(this._quad1, i3, (int) b4, 3);
                } else {
                    return parseName(this._quad1, i3, b4, b5, 3);
                }
            } else if (b3 == 34) {
                return findName(this._quad1, i3, (int) b2, 2);
            } else {
                return parseName(this._quad1, i3, b2, b3, 2);
            }
        } else if (b == 34) {
            return findName(this._quad1, i3, i2, 1);
        } else {
            return parseName(this._quad1, i3, i2, b, 1);
        }
    }

    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) {
        if (!this._tokenIncomplete || this._currToken != JsonToken.VALUE_STRING) {
            byte[] binaryValue = getBinaryValue(base64Variant);
            outputStream.write(binaryValue);
            return binaryValue.length;
        }
        byte[] allocBase64Buffer = this._ioContext.allocBase64Buffer();
        try {
            return _readBinary(base64Variant, outputStream, allocBase64Buffer);
        } finally {
            this._ioContext.releaseBase64Buffer(allocBase64Buffer);
        }
    }

    /* access modifiers changed from: protected */
    public String slowParseName() {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            byte b = bArr[i2] & 255;
            if (b == 34) {
                return "";
            }
            return parseEscapedName(this._quadBuffer, 0, 0, b, 0);
        }
        _reportInvalidEOF(": was expecting closing '\"' for name", JsonToken.FIELD_NAME);
        throw null;
    }

    private final String parseName(int i2, int i3, int i4, int i5) {
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        return parseEscapedName(iArr, 1, i3, i4, i5);
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidOther(int i2, int i3) {
        this._inputPtr = i3;
        _reportInvalidOther(i2);
        throw null;
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidToken(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            char _decodeCharForError = (char) _decodeCharForError(bArr[i2]);
            if (!Character.isJavaIdentifierPart(_decodeCharForError)) {
                break;
            }
            sb.append(_decodeCharForError);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        _reportError("Unrecognized token '%s': was expecting %s", sb, str2);
        throw null;
    }

    private final String parseName(int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        iArr[1] = i3;
        return parseEscapedName(iArr, 2, i4, i5, i6);
    }

    private final String findName(int i2, int i3, int i4) {
        int _padLastQuad = _padLastQuad(i3, i4);
        String findName = this._symbols.findName(i2, _padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        iArr[1] = _padLastQuad;
        return addName(iArr, 2, i4);
    }

    public int getValueAsInt(int i2) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(i2);
        }
        int i3 = this._numTypesValid;
        if ((i3 & 1) == 0) {
            if (i3 == 0) {
                return _parseIntValue();
            }
            if ((i3 & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    public String getValueAsString(String str) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (!this._tokenIncomplete) {
                return this._textBuffer.contentsAsString();
            }
            this._tokenIncomplete = false;
            return _finishAndReturnString();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        } else {
            return super.getValueAsString(str);
        }
    }

    private final String findName(int i2, int i3, int i4, int i5) {
        int _padLastQuad = _padLastQuad(i4, i5);
        String findName = this._symbols.findName(i2, i3, _padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = _padLastQuad(_padLastQuad, i5);
        return addName(iArr, 3, i5);
    }

    private final String findName(int[] iArr, int i2, int i3, int i4) {
        if (i2 >= iArr.length) {
            iArr = ParserBase.growArrayBy(iArr, iArr.length);
            this._quadBuffer = iArr;
        }
        int i5 = i2 + 1;
        iArr[i2] = _padLastQuad(i3, i4);
        String findName = this._symbols.findName(iArr, i5);
        return findName == null ? addName(iArr, i5, i4) : findName;
    }
}
