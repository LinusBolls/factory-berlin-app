package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.DataInput;
import java.io.EOFException;
import java.io.OutputStream;
import java.util.Arrays;

public class UTF8DataInputJsonParser extends ParserBase {
    protected static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();
    private static final int[] _icUTF8 = CharTypes.getInputCodeUtf8();
    protected DataInput _inputData;
    protected int _nextByte = -1;
    protected ObjectCodec _objectCodec;
    private int _quad1;
    protected int[] _quadBuffer = new int[16];
    protected final ByteQuadsCanonicalizer _symbols;
    protected boolean _tokenIncomplete;

    public UTF8DataInputJsonParser(IOContext iOContext, int i2, DataInput dataInput, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, int i3) {
        super(iOContext, i2);
        this._objectCodec = objectCodec;
        this._symbols = byteQuadsCanonicalizer;
        this._inputData = dataInput;
        this._nextByte = i3;
    }

    private final void _checkMatchEnd(String str, int i2, int i3) {
        char _decodeCharForError = (char) _decodeCharForError(i3);
        if (Character.isJavaIdentifierPart(_decodeCharForError)) {
            _reportInvalidToken(_decodeCharForError, str.substring(0, i2));
            throw null;
        }
    }

    private void _closeScope(int i2) {
        if (i2 == 93) {
            if (this._parsingContext.inArray()) {
                this._parsingContext = this._parsingContext.clearAndGetParent();
                this._currToken = JsonToken.END_ARRAY;
            } else {
                _reportMismatchedEndMarker(i2, '}');
                throw null;
            }
        }
        if (i2 != 125) {
            return;
        }
        if (this._parsingContext.inObject()) {
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_OBJECT;
            return;
        }
        _reportMismatchedEndMarker(i2, ']');
        throw null;
    }

    private final int _decodeUtf8_2(int i2) {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) == 128) {
            return ((i2 & 31) << 6) | (readUnsignedByte & 63);
        }
        _reportInvalidOther(readUnsignedByte & 255);
        throw null;
    }

    private final int _decodeUtf8_3(int i2) {
        int i3 = i2 & 15;
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) == 128) {
            int i4 = (i3 << 6) | (readUnsignedByte & 63);
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            if ((readUnsignedByte2 & 192) == 128) {
                return (i4 << 6) | (readUnsignedByte2 & 63);
            }
            _reportInvalidOther(readUnsignedByte2 & 255);
            throw null;
        }
        _reportInvalidOther(readUnsignedByte & 255);
        throw null;
    }

    private final int _decodeUtf8_4(int i2) {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) == 128) {
            int i3 = ((i2 & 7) << 6) | (readUnsignedByte & 63);
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            if ((readUnsignedByte2 & 192) == 128) {
                int i4 = (i3 << 6) | (readUnsignedByte2 & 63);
                int readUnsignedByte3 = this._inputData.readUnsignedByte();
                if ((readUnsignedByte3 & 192) == 128) {
                    return ((i4 << 6) | (readUnsignedByte3 & 63)) - 65536;
                }
                _reportInvalidOther(readUnsignedByte3 & 255);
                throw null;
            }
            _reportInvalidOther(readUnsignedByte2 & 255);
            throw null;
        }
        _reportInvalidOther(readUnsignedByte & 255);
        throw null;
    }

    private String _finishAndReturnString() {
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int length = emptyAndGetCurrentSegment.length;
        int i2 = 0;
        while (true) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (iArr[readUnsignedByte] == 0) {
                int i3 = i2 + 1;
                emptyAndGetCurrentSegment[i2] = (char) readUnsignedByte;
                if (i3 >= length) {
                    _finishString2(emptyAndGetCurrentSegment, i3, this._inputData.readUnsignedByte());
                    return this._textBuffer.contentsAsString();
                }
                i2 = i3;
            } else if (readUnsignedByte == 34) {
                return this._textBuffer.setCurrentAndReturn(i2);
            } else {
                _finishString2(emptyAndGetCurrentSegment, i2, readUnsignedByte);
                return this._textBuffer.contentsAsString();
            }
        }
    }

    private final void _finishString2(char[] cArr, int i2, int i3) {
        int[] iArr = _icUTF8;
        int length = cArr.length;
        while (true) {
            int i4 = 0;
            if (iArr[i3] == 0) {
                if (r8 >= length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    length = cArr.length;
                    r8 = 0;
                }
                cArr[r8] = (char) i3;
                i3 = this._inputData.readUnsignedByte();
                i2 = r8 + 1;
            } else if (i3 == 34) {
                this._textBuffer.setCurrentLength(r8);
                return;
            } else {
                int i5 = iArr[i3];
                if (i5 == 1) {
                    i3 = _decodeEscaped();
                } else if (i5 == 2) {
                    i3 = _decodeUtf8_2(i3);
                } else if (i5 == 3) {
                    i3 = _decodeUtf8_3(i3);
                } else if (i5 == 4) {
                    int _decodeUtf8_4 = _decodeUtf8_4(i3);
                    int i6 = r8 + 1;
                    cArr[r8] = (char) (55296 | (_decodeUtf8_4 >> 10));
                    if (i6 >= cArr.length) {
                        cArr = this._textBuffer.finishCurrentSegment();
                        length = cArr.length;
                        r8 = 0;
                    } else {
                        r8 = i6;
                    }
                    i3 = (_decodeUtf8_4 & 1023) | 56320;
                } else if (i3 < 32) {
                    _throwUnquotedSpace(i3, "string value");
                } else {
                    _reportInvalidChar(i3);
                    throw null;
                }
                if (r8 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    length = cArr.length;
                } else {
                    i4 = r8;
                }
                i2 = i4 + 1;
                cArr[i4] = (char) i3;
                i3 = this._inputData.readUnsignedByte();
            }
        }
    }

    private static int[] _growArrayBy(int[] iArr, int i2) {
        if (iArr == null) {
            return new int[i2];
        }
        return Arrays.copyOf(iArr, iArr.length + i2);
    }

    private final int _handleLeadingZeroes() {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (readUnsignedByte < 48 || readUnsignedByte > 57) {
            return readUnsignedByte;
        }
        if (isEnabled(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS)) {
            while (readUnsignedByte == 48) {
                readUnsignedByte = this._inputData.readUnsignedByte();
            }
            return readUnsignedByte;
        }
        reportInvalidNumber("Leading zeroes not allowed");
        throw null;
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
            _matchToken("false", 1);
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this._currToken = jsonToken3;
            return jsonToken3;
        } else if (i2 == 110) {
            _matchToken("null", 1);
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this._currToken = jsonToken4;
            return jsonToken4;
        } else if (i2 == 116) {
            _matchToken("true", 1);
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

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.fasterxml.jackson.core.JsonToken _parseFloat(char[] r9, int r10, int r11, boolean r12, int r13) {
        /*
            r8 = this;
            r0 = 0
            r1 = 57
            r2 = 48
            r3 = 0
            r4 = 46
            if (r11 != r4) goto L_0x003b
            int r4 = r10 + 1
            char r11 = (char) r11
            r9[r10] = r11
            r10 = r4
            r11 = 0
        L_0x0011:
            java.io.DataInput r4 = r8._inputData
            int r4 = r4.readUnsignedByte()
            if (r4 < r2) goto L_0x002f
            if (r4 <= r1) goto L_0x001c
            goto L_0x002f
        L_0x001c:
            int r11 = r11 + 1
            int r5 = r9.length
            if (r10 < r5) goto L_0x0028
            com.fasterxml.jackson.core.util.TextBuffer r9 = r8._textBuffer
            char[] r9 = r9.finishCurrentSegment()
            r10 = 0
        L_0x0028:
            int r5 = r10 + 1
            char r4 = (char) r4
            r9[r10] = r4
            r10 = r5
            goto L_0x0011
        L_0x002f:
            if (r11 == 0) goto L_0x0035
            r7 = r4
            r4 = r11
            r11 = r7
            goto L_0x003c
        L_0x0035:
            java.lang.String r9 = "Decimal point not followed by a digit"
            r8.reportUnexpectedNumberChar(r4, r9)
            throw r0
        L_0x003b:
            r4 = 0
        L_0x003c:
            r5 = 101(0x65, float:1.42E-43)
            if (r11 == r5) goto L_0x0044
            r5 = 69
            if (r11 != r5) goto L_0x009f
        L_0x0044:
            int r5 = r9.length
            if (r10 < r5) goto L_0x004e
            com.fasterxml.jackson.core.util.TextBuffer r9 = r8._textBuffer
            char[] r9 = r9.finishCurrentSegment()
            r10 = 0
        L_0x004e:
            int r5 = r10 + 1
            char r11 = (char) r11
            r9[r10] = r11
            java.io.DataInput r10 = r8._inputData
            int r10 = r10.readUnsignedByte()
            r11 = 45
            if (r10 == r11) goto L_0x0066
            r11 = 43
            if (r10 != r11) goto L_0x0062
            goto L_0x0066
        L_0x0062:
            r11 = r10
            r10 = r5
            r5 = 0
            goto L_0x007f
        L_0x0066:
            int r11 = r9.length
            if (r5 < r11) goto L_0x0070
            com.fasterxml.jackson.core.util.TextBuffer r9 = r8._textBuffer
            char[] r9 = r9.finishCurrentSegment()
            r5 = 0
        L_0x0070:
            int r11 = r5 + 1
            char r10 = (char) r10
            r9[r5] = r10
            java.io.DataInput r10 = r8._inputData
            int r10 = r10.readUnsignedByte()
            r5 = 0
            r7 = r11
            r11 = r10
            r10 = r7
        L_0x007f:
            if (r11 > r1) goto L_0x009c
            if (r11 < r2) goto L_0x009c
            int r5 = r5 + 1
            int r6 = r9.length
            if (r10 < r6) goto L_0x008f
            com.fasterxml.jackson.core.util.TextBuffer r9 = r8._textBuffer
            char[] r9 = r9.finishCurrentSegment()
            r10 = 0
        L_0x008f:
            int r6 = r10 + 1
            char r11 = (char) r11
            r9[r10] = r11
            java.io.DataInput r10 = r8._inputData
            int r11 = r10.readUnsignedByte()
            r10 = r6
            goto L_0x007f
        L_0x009c:
            if (r5 == 0) goto L_0x00b6
            r3 = r5
        L_0x009f:
            r8._nextByte = r11
            com.fasterxml.jackson.core.json.JsonReadContext r9 = r8._parsingContext
            boolean r9 = r9.inRoot()
            if (r9 == 0) goto L_0x00ac
            r8._verifyRootSpace()
        L_0x00ac:
            com.fasterxml.jackson.core.util.TextBuffer r9 = r8._textBuffer
            r9.setCurrentLength(r10)
            com.fasterxml.jackson.core.JsonToken r9 = r8.resetFloat(r12, r13, r4, r3)
            return r9
        L_0x00b6:
            java.lang.String r9 = "Exponent indicator not followed by a digit"
            r8.reportUnexpectedNumberChar(r11, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._parseFloat(char[], int, int, boolean, int):com.fasterxml.jackson.core.JsonToken");
    }

    private final String _parseLongName(int i2, int i3, int i4) {
        int[] iArr = this._quadBuffer;
        iArr[0] = this._quad1;
        iArr[1] = i3;
        iArr[2] = i4;
        int[] iArr2 = _icLatin1;
        int i5 = i2;
        int i6 = 3;
        while (true) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (iArr2[readUnsignedByte] == 0) {
                int i7 = (i5 << 8) | readUnsignedByte;
                int readUnsignedByte2 = this._inputData.readUnsignedByte();
                if (iArr2[readUnsignedByte2] == 0) {
                    int i8 = (i7 << 8) | readUnsignedByte2;
                    int readUnsignedByte3 = this._inputData.readUnsignedByte();
                    if (iArr2[readUnsignedByte3] == 0) {
                        int i9 = (i8 << 8) | readUnsignedByte3;
                        int readUnsignedByte4 = this._inputData.readUnsignedByte();
                        if (iArr2[readUnsignedByte4] == 0) {
                            int[] iArr3 = this._quadBuffer;
                            if (i6 >= iArr3.length) {
                                this._quadBuffer = _growArrayBy(iArr3, i6);
                            }
                            this._quadBuffer[i6] = i9;
                            i6++;
                            i5 = readUnsignedByte4;
                        } else if (readUnsignedByte4 == 34) {
                            return findName(this._quadBuffer, i6, i9, 4);
                        } else {
                            return parseEscapedName(this._quadBuffer, i6, i9, readUnsignedByte4, 4);
                        }
                    } else if (readUnsignedByte3 == 34) {
                        return findName(this._quadBuffer, i6, i8, 3);
                    } else {
                        return parseEscapedName(this._quadBuffer, i6, i8, readUnsignedByte3, 3);
                    }
                } else if (readUnsignedByte2 == 34) {
                    return findName(this._quadBuffer, i6, i7, 2);
                } else {
                    return parseEscapedName(this._quadBuffer, i6, i7, readUnsignedByte2, 2);
                }
            } else if (readUnsignedByte == 34) {
                return findName(this._quadBuffer, i6, i5, 1);
            } else {
                return parseEscapedName(this._quadBuffer, i6, i5, readUnsignedByte, 1);
            }
        }
    }

    private final String _parseMediumName(int i2) {
        int[] iArr = _icLatin1;
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte] == 0) {
            int i3 = (i2 << 8) | readUnsignedByte;
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            if (iArr[readUnsignedByte2] == 0) {
                int i4 = (i3 << 8) | readUnsignedByte2;
                int readUnsignedByte3 = this._inputData.readUnsignedByte();
                if (iArr[readUnsignedByte3] == 0) {
                    int i5 = (i4 << 8) | readUnsignedByte3;
                    int readUnsignedByte4 = this._inputData.readUnsignedByte();
                    if (iArr[readUnsignedByte4] == 0) {
                        return _parseMediumName2(readUnsignedByte4, i5);
                    }
                    if (readUnsignedByte4 == 34) {
                        return findName(this._quad1, i5, 4);
                    }
                    return parseName(this._quad1, i5, readUnsignedByte4, 4);
                } else if (readUnsignedByte3 == 34) {
                    return findName(this._quad1, i4, 3);
                } else {
                    return parseName(this._quad1, i4, readUnsignedByte3, 3);
                }
            } else if (readUnsignedByte2 == 34) {
                return findName(this._quad1, i3, 2);
            } else {
                return parseName(this._quad1, i3, readUnsignedByte2, 2);
            }
        } else if (readUnsignedByte == 34) {
            return findName(this._quad1, i2, 1);
        } else {
            return parseName(this._quad1, i2, readUnsignedByte, 1);
        }
    }

    private final String _parseMediumName2(int i2, int i3) {
        int[] iArr = _icLatin1;
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte] == 0) {
            int i4 = (i2 << 8) | readUnsignedByte;
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            if (iArr[readUnsignedByte2] == 0) {
                int i5 = (i4 << 8) | readUnsignedByte2;
                int readUnsignedByte3 = this._inputData.readUnsignedByte();
                if (iArr[readUnsignedByte3] == 0) {
                    int i6 = (i5 << 8) | readUnsignedByte3;
                    int readUnsignedByte4 = this._inputData.readUnsignedByte();
                    if (iArr[readUnsignedByte4] == 0) {
                        return _parseLongName(readUnsignedByte4, i3, i6);
                    }
                    if (readUnsignedByte4 == 34) {
                        return findName(this._quad1, i3, i6, 4);
                    }
                    return parseName(this._quad1, i3, i6, readUnsignedByte4, 4);
                } else if (readUnsignedByte3 == 34) {
                    return findName(this._quad1, i3, i5, 3);
                } else {
                    return parseName(this._quad1, i3, i5, readUnsignedByte3, 3);
                }
            } else if (readUnsignedByte2 == 34) {
                return findName(this._quad1, i3, i4, 2);
            } else {
                return parseName(this._quad1, i3, i4, readUnsignedByte2, 2);
            }
        } else if (readUnsignedByte == 34) {
            return findName(this._quad1, i3, i2, 1);
        } else {
            return parseName(this._quad1, i3, i2, readUnsignedByte, 1);
        }
    }

    private void _reportInvalidOther(int i2) {
        _reportError("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i2));
        throw null;
    }

    private final void _skipCComment() {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        int readUnsignedByte = this._inputData.readUnsignedByte();
        while (true) {
            int i2 = inputCodeComment[readUnsignedByte];
            if (i2 != 0) {
                if (i2 == 2) {
                    _skipUtf8_2();
                } else if (i2 == 3) {
                    _skipUtf8_3();
                } else if (i2 == 4) {
                    _skipUtf8_4();
                } else if (i2 == 10 || i2 == 13) {
                    this._currInputRow++;
                } else if (i2 == 42) {
                    readUnsignedByte = this._inputData.readUnsignedByte();
                    if (readUnsignedByte == 47) {
                        return;
                    }
                } else {
                    _reportInvalidChar(readUnsignedByte);
                    throw null;
                }
            }
            readUnsignedByte = this._inputData.readUnsignedByte();
        }
    }

    private final int _skipColon() {
        int i2 = this._nextByte;
        if (i2 < 0) {
            i2 = this._inputData.readUnsignedByte();
        } else {
            this._nextByte = -1;
        }
        if (i2 == 58) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (readUnsignedByte > 32) {
                if (readUnsignedByte == 47 || readUnsignedByte == 35) {
                    return _skipColon2(readUnsignedByte, true);
                }
                return readUnsignedByte;
            } else if ((readUnsignedByte != 32 && readUnsignedByte != 9) || (readUnsignedByte = this._inputData.readUnsignedByte()) <= 32) {
                return _skipColon2(readUnsignedByte, true);
            } else {
                if (readUnsignedByte == 47 || readUnsignedByte == 35) {
                    return _skipColon2(readUnsignedByte, true);
                }
                return readUnsignedByte;
            }
        } else {
            if (i2 == 32 || i2 == 9) {
                i2 = this._inputData.readUnsignedByte();
            }
            if (i2 != 58) {
                return _skipColon2(i2, false);
            }
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            if (readUnsignedByte2 > 32) {
                if (readUnsignedByte2 == 47 || readUnsignedByte2 == 35) {
                    return _skipColon2(readUnsignedByte2, true);
                }
                return readUnsignedByte2;
            } else if ((readUnsignedByte2 != 32 && readUnsignedByte2 != 9) || (readUnsignedByte2 = this._inputData.readUnsignedByte()) <= 32) {
                return _skipColon2(readUnsignedByte2, true);
            } else {
                if (readUnsignedByte2 == 47 || readUnsignedByte2 == 35) {
                    return _skipColon2(readUnsignedByte2, true);
                }
                return readUnsignedByte2;
            }
        }
    }

    private final int _skipColon2(int i2, boolean z) {
        while (true) {
            if (i2 > 32) {
                if (i2 == 47) {
                    _skipComment();
                } else if (i2 != 35 || !_skipYAMLComment()) {
                    if (z) {
                        return i2;
                    }
                    if (i2 == 58) {
                        z = true;
                    } else {
                        _reportUnexpectedChar(i2, "was expecting a colon to separate field name and value");
                        throw null;
                    }
                }
            } else if (i2 == 13 || i2 == 10) {
                this._currInputRow++;
            }
            i2 = this._inputData.readUnsignedByte();
        }
    }

    private final void _skipComment() {
        if (isEnabled(JsonParser.Feature.ALLOW_COMMENTS)) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (readUnsignedByte == 47) {
                _skipLine();
            } else if (readUnsignedByte == 42) {
                _skipCComment();
            } else {
                _reportUnexpectedChar(readUnsignedByte, "was expecting either '*' or '/' for a comment");
                throw null;
            }
        } else {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
            throw null;
        }
    }

    private final void _skipLine() {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            int i2 = inputCodeComment[readUnsignedByte];
            if (i2 != 0) {
                if (i2 == 2) {
                    _skipUtf8_2();
                } else if (i2 == 3) {
                    _skipUtf8_3();
                } else if (i2 == 4) {
                    _skipUtf8_4();
                } else if (i2 == 10 || i2 == 13) {
                    this._currInputRow++;
                } else if (i2 != 42 && i2 < 0) {
                    _reportInvalidChar(readUnsignedByte);
                    throw null;
                }
            }
        }
        this._currInputRow++;
    }

    private final void _skipUtf8_2() {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            _reportInvalidOther(readUnsignedByte & 255);
            throw null;
        }
    }

    private final void _skipUtf8_3() {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) == 128) {
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            if ((readUnsignedByte2 & 192) != 128) {
                _reportInvalidOther(readUnsignedByte2 & 255);
                throw null;
            }
            return;
        }
        _reportInvalidOther(readUnsignedByte & 255);
        throw null;
    }

    private final void _skipUtf8_4() {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) == 128) {
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            if ((readUnsignedByte2 & 192) == 128) {
                int readUnsignedByte3 = this._inputData.readUnsignedByte();
                if ((readUnsignedByte3 & 192) != 128) {
                    _reportInvalidOther(readUnsignedByte3 & 255);
                    throw null;
                }
                return;
            }
            _reportInvalidOther(readUnsignedByte2 & 255);
            throw null;
        }
        _reportInvalidOther(readUnsignedByte & 255);
        throw null;
    }

    private final int _skipWS() {
        int i2 = this._nextByte;
        if (i2 < 0) {
            i2 = this._inputData.readUnsignedByte();
        } else {
            this._nextByte = -1;
        }
        while (i2 <= 32) {
            if (i2 == 13 || i2 == 10) {
                this._currInputRow++;
            }
            i2 = this._inputData.readUnsignedByte();
        }
        if (i2 == 47 || i2 == 35) {
            return _skipWSComment(i2);
        }
        return i2;
    }

    private final int _skipWSComment(int i2) {
        while (true) {
            if (i2 > 32) {
                if (i2 == 47) {
                    _skipComment();
                } else if (i2 != 35 || !_skipYAMLComment()) {
                    return i2;
                }
            } else if (i2 == 13 || i2 == 10) {
                this._currInputRow++;
            }
            i2 = this._inputData.readUnsignedByte();
        }
        return i2;
    }

    private final int _skipWSOrEnd() {
        int i2 = this._nextByte;
        if (i2 < 0) {
            try {
                i2 = this._inputData.readUnsignedByte();
            } catch (EOFException unused) {
                return _eofAsNextChar();
            }
        } else {
            this._nextByte = -1;
        }
        while (i2 <= 32) {
            if (i2 == 13 || i2 == 10) {
                this._currInputRow++;
            }
            try {
                i2 = this._inputData.readUnsignedByte();
            } catch (EOFException unused2) {
                return _eofAsNextChar();
            }
        }
        if (i2 == 47 || i2 == 35) {
            return _skipWSComment(i2);
        }
        return i2;
    }

    private final boolean _skipYAMLComment() {
        if (!isEnabled(JsonParser.Feature.ALLOW_YAML_COMMENTS)) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _verifyRootSpace() {
        int i2 = this._nextByte;
        if (i2 <= 32) {
            this._nextByte = -1;
            if (i2 == 13 || i2 == 10) {
                this._currInputRow++;
                return;
            }
            return;
        }
        _reportMissingRootWS(i2);
        throw null;
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
        int pad = pad(i2, i3);
        String findName = this._symbols.findName(pad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = pad;
        return addName(iArr, 1, i3);
    }

    private static final int pad(int i2, int i3) {
        return i3 == 4 ? i2 : i2 | (-1 << (i3 << 3));
    }

    private final String parseName(int i2, int i3, int i4) {
        return parseEscapedName(this._quadBuffer, 0, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void _closeInput() {
    }

    /* access modifiers changed from: protected */
    public final byte[] _decodeBase64(Base64Variant base64Variant) {
        int readUnsignedByte;
        ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            if (readUnsignedByte2 > 32) {
                int decodeBase64Char = base64Variant.decodeBase64Char(readUnsignedByte2);
                if (decodeBase64Char < 0) {
                    if (readUnsignedByte2 == 34) {
                        return _getByteArrayBuilder.toByteArray();
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, readUnsignedByte2, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                int readUnsignedByte3 = this._inputData.readUnsignedByte();
                int decodeBase64Char2 = base64Variant.decodeBase64Char(readUnsignedByte3);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, readUnsignedByte3, 1);
                }
                int i2 = (decodeBase64Char << 6) | decodeBase64Char2;
                int readUnsignedByte4 = this._inputData.readUnsignedByte();
                int decodeBase64Char3 = base64Variant.decodeBase64Char(readUnsignedByte4);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (readUnsignedByte4 == 34) {
                            _getByteArrayBuilder.append(i2 >> 4);
                            if (!base64Variant.usesPadding()) {
                                return _getByteArrayBuilder.toByteArray();
                            }
                            _handleBase64MissingPadding(base64Variant);
                            throw null;
                        }
                        decodeBase64Char3 = _decodeBase64Escape(base64Variant, readUnsignedByte4, 2);
                    }
                    if (decodeBase64Char3 == -2) {
                        readUnsignedByte = this._inputData.readUnsignedByte();
                        if (base64Variant.usesPaddingChar(readUnsignedByte) || (readUnsignedByte == 92 && _decodeBase64Escape(base64Variant, readUnsignedByte, 3) == -2)) {
                            _getByteArrayBuilder.append(i2 >> 4);
                        }
                    }
                }
                int i3 = (i2 << 6) | decodeBase64Char3;
                int readUnsignedByte5 = this._inputData.readUnsignedByte();
                int decodeBase64Char4 = base64Variant.decodeBase64Char(readUnsignedByte5);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (readUnsignedByte5 == 34) {
                            _getByteArrayBuilder.appendTwoBytes(i3 >> 2);
                            if (!base64Variant.usesPadding()) {
                                return _getByteArrayBuilder.toByteArray();
                            }
                            _handleBase64MissingPadding(base64Variant);
                            throw null;
                        }
                        decodeBase64Char4 = _decodeBase64Escape(base64Variant, readUnsignedByte5, 3);
                    }
                    if (decodeBase64Char4 == -2) {
                        _getByteArrayBuilder.appendTwoBytes(i3 >> 2);
                    }
                }
                _getByteArrayBuilder.appendThreeBytes((i3 << 6) | decodeBase64Char4);
            }
        }
        throw reportInvalidBase64Char(base64Variant, readUnsignedByte, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
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
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) == 128) {
            int i5 = (i3 << 6) | (readUnsignedByte & 63);
            if (c <= 1) {
                return i5;
            }
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            if ((readUnsignedByte2 & 192) == 128) {
                int i6 = (i5 << 6) | (readUnsignedByte2 & 63);
                if (c <= 2) {
                    return i6;
                }
                int readUnsignedByte3 = this._inputData.readUnsignedByte();
                if ((readUnsignedByte3 & 192) == 128) {
                    return (i6 << 6) | (readUnsignedByte3 & 63);
                }
                _reportInvalidOther(readUnsignedByte3 & 255);
                throw null;
            }
            _reportInvalidOther(readUnsignedByte2 & 255);
            throw null;
        }
        _reportInvalidOther(readUnsignedByte & 255);
        throw null;
    }

    /* access modifiers changed from: protected */
    public char _decodeEscaped() {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (readUnsignedByte == 34 || readUnsignedByte == 47 || readUnsignedByte == 92) {
            return (char) readUnsignedByte;
        }
        if (readUnsignedByte == 98) {
            return 8;
        }
        if (readUnsignedByte == 102) {
            return 12;
        }
        if (readUnsignedByte == 110) {
            return 10;
        }
        if (readUnsignedByte == 114) {
            return 13;
        }
        if (readUnsignedByte == 116) {
            return 9;
        }
        if (readUnsignedByte != 117) {
            char _decodeCharForError = (char) _decodeCharForError(readUnsignedByte);
            _handleUnrecognizedCharacterEscape(_decodeCharForError);
            return _decodeCharForError;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < 4) {
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            int charToHex = CharTypes.charToHex(readUnsignedByte2);
            if (charToHex >= 0) {
                i3 = (i3 << 4) | charToHex;
                i2++;
            } else {
                _reportUnexpectedChar(readUnsignedByte2, "expected a hex-digit for character escape sequence");
                throw null;
            }
        }
        return (char) i3;
    }

    /* access modifiers changed from: protected */
    public void _finishString() {
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int length = emptyAndGetCurrentSegment.length;
        int i2 = 0;
        while (true) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (iArr[readUnsignedByte] == 0) {
                int i3 = i2 + 1;
                emptyAndGetCurrentSegment[i2] = (char) readUnsignedByte;
                if (i3 >= length) {
                    _finishString2(emptyAndGetCurrentSegment, i3, this._inputData.readUnsignedByte());
                    return;
                }
                i2 = i3;
            } else if (readUnsignedByte == 34) {
                this._textBuffer.setCurrentLength(i2);
                return;
            } else {
                _finishString2(emptyAndGetCurrentSegment, i2, readUnsignedByte);
                return;
            }
        }
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
        int i3;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int i4 = 0;
        while (true) {
            int length = emptyAndGetCurrentSegment.length;
            if (i4 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                length = emptyAndGetCurrentSegment.length;
                i4 = 0;
            }
            while (true) {
                int readUnsignedByte = this._inputData.readUnsignedByte();
                if (readUnsignedByte != 39) {
                    if (iArr[readUnsignedByte] == 0) {
                        int i5 = i2 + 1;
                        emptyAndGetCurrentSegment[i2] = (char) readUnsignedByte;
                        i4 = i5;
                        if (i5 >= length) {
                            break;
                        }
                    } else {
                        int i6 = iArr[readUnsignedByte];
                        if (i6 == 1) {
                            i3 = _decodeEscaped();
                        } else if (i6 == 2) {
                            i3 = _decodeUtf8_2(readUnsignedByte);
                        } else if (i6 == 3) {
                            i3 = _decodeUtf8_3(readUnsignedByte);
                        } else if (i6 != 4) {
                            if (readUnsignedByte < 32) {
                                _throwUnquotedSpace(readUnsignedByte, "string value");
                            }
                            _reportInvalidChar(readUnsignedByte);
                            throw null;
                        } else {
                            int _decodeUtf8_4 = _decodeUtf8_4(readUnsignedByte);
                            int i7 = i2 + 1;
                            emptyAndGetCurrentSegment[i2] = (char) (55296 | (_decodeUtf8_4 >> 10));
                            if (i7 >= emptyAndGetCurrentSegment.length) {
                                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                                i2 = 0;
                            } else {
                                i2 = i7;
                            }
                            i3 = (_decodeUtf8_4 & 1023) | 56320;
                        }
                        if (i2 >= emptyAndGetCurrentSegment.length) {
                            emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                            i2 = 0;
                        }
                        emptyAndGetCurrentSegment[i2] = (char) i3;
                        i4 = i2 + 1;
                    }
                } else {
                    this._textBuffer.setCurrentLength(i2);
                    return JsonToken.VALUE_STRING;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public JsonToken _handleInvalidNumberStart(int i2, boolean z) {
        String str;
        if (i2 == 73) {
            i2 = this._inputData.readUnsignedByte();
            if (i2 == 78) {
                str = z ? "-INF" : "+INF";
            } else if (i2 == 110) {
                str = z ? "-Infinity" : "+Infinity";
            }
            _matchToken(str, 3);
            if (isEnabled(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
                return resetAsNaN(str, z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            _reportError("Non-standard token '" + str + "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            throw null;
        }
        reportUnexpectedNumberChar(i2, "expected digit (0-9) to follow minus sign, for valid numeric value");
        throw null;
    }

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
                do {
                    if (i3 < 4) {
                        i3++;
                        i5 = i2 | (i5 << 8);
                    } else {
                        if (i4 >= iArr.length) {
                            iArr = _growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        iArr[i4] = i5;
                        i5 = i2;
                        i4++;
                        i3 = 1;
                    }
                    i2 = this._inputData.readUnsignedByte();
                } while (inputCodeUtf8JsNames[i2] == 0);
                this._nextByte = i2;
                if (i3 > 0) {
                    if (i4 >= iArr.length) {
                        int[] _growArrayBy = _growArrayBy(iArr, iArr.length);
                        this._quadBuffer = _growArrayBy;
                        iArr = _growArrayBy;
                    }
                    iArr[i4] = i5;
                    i4++;
                }
                String findName = this._symbols.findName(iArr, i4);
                return findName == null ? addName(iArr, i4, i3) : findName;
            }
            _reportUnexpectedChar(i2, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
            throw null;
        }
        _reportUnexpectedChar((char) _decodeCharForError(i2), "was expecting double-quote to start field name");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (r4 != 44) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        if (r3._parsingContext.inArray() == false) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.JsonToken _handleUnexpectedValue(int r4) {
        /*
            r3 = this;
            r0 = 39
            r1 = 0
            if (r4 == r0) goto L_0x007b
            r0 = 73
            r2 = 1
            if (r4 == r0) goto L_0x0061
            r0 = 78
            if (r4 == r0) goto L_0x0047
            r0 = 93
            if (r4 == r0) goto L_0x002b
            r0 = 125(0x7d, float:1.75E-43)
            if (r4 == r0) goto L_0x0041
            r0 = 43
            if (r4 == r0) goto L_0x001f
            r0 = 44
            if (r4 == r0) goto L_0x0034
            goto L_0x0088
        L_0x001f:
            java.io.DataInput r4 = r3._inputData
            int r4 = r4.readUnsignedByte()
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleInvalidNumberStart(r4, r0)
            return r4
        L_0x002b:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3._parsingContext
            boolean r0 = r0.inArray()
            if (r0 != 0) goto L_0x0034
            goto L_0x0088
        L_0x0034:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L_0x0041
            r3._nextByte = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L_0x0041:
            java.lang.String r0 = "expected a value"
            r3._reportUnexpectedChar(r4, r0)
            throw r1
        L_0x0047:
            java.lang.String r4 = "NaN"
            r3._matchToken(r4, r2)
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L_0x005b
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r4, r0)
            return r4
        L_0x005b:
            java.lang.String r4 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r4)
            throw r1
        L_0x0061:
            java.lang.String r4 = "Infinity"
            r3._matchToken(r4, r2)
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L_0x0075
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r4, r0)
            return r4
        L_0x0075:
            java.lang.String r4 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r4)
            throw r1
        L_0x007b:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L_0x0088
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleApos()
            return r4
        L_0x0088:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto L_0x00a6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = ""
            r0.append(r2)
            char r2 = (char) r4
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "('true', 'false' or 'null')"
            r3._reportInvalidToken(r4, r0, r2)
            throw r1
        L_0x00a6:
            java.lang.String r0 = "expected a valid value (number, String, array, object, 'true', 'false' or 'null')"
            r3._reportUnexpectedChar(r4, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._handleUnexpectedValue(int):com.fasterxml.jackson.core.JsonToken");
    }

    /* access modifiers changed from: protected */
    public final void _matchToken(String str, int i2) {
        int length = str.length();
        do {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (readUnsignedByte == str.charAt(i2)) {
                i2++;
            } else {
                _reportInvalidToken(readUnsignedByte, str.substring(0, i2));
                throw null;
            }
        } while (i2 < length);
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if (!(readUnsignedByte2 < 48 || readUnsignedByte2 == 93 || readUnsignedByte2 == 125)) {
            _checkMatchEnd(str, i2, readUnsignedByte2);
        }
        this._nextByte = readUnsignedByte2;
    }

    /* access modifiers changed from: protected */
    public String _parseAposName() {
        int i2;
        int i3;
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (readUnsignedByte == 39) {
            return "";
        }
        int[] iArr = this._quadBuffer;
        int[] iArr2 = _icLatin1;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (readUnsignedByte != 39) {
            if (!(readUnsignedByte == 34 || iArr2[readUnsignedByte] == 0)) {
                if (readUnsignedByte != 92) {
                    _throwUnquotedSpace(readUnsignedByte, "name");
                } else {
                    readUnsignedByte = _decodeEscaped();
                }
                if (readUnsignedByte > 127) {
                    if (i3 >= 4) {
                        if (i5 >= iArr.length) {
                            iArr = _growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        iArr[i5] = i2;
                        i5++;
                        i3 = 0;
                        i2 = 0;
                    }
                    if (readUnsignedByte < 2048) {
                        i2 = (i2 << 8) | (readUnsignedByte >> 6) | 192;
                        i3++;
                    } else {
                        int i7 = (i2 << 8) | (readUnsignedByte >> 12) | 224;
                        int i8 = i3 + 1;
                        if (i8 >= 4) {
                            if (i5 >= iArr.length) {
                                iArr = _growArrayBy(iArr, iArr.length);
                                this._quadBuffer = iArr;
                            }
                            iArr[i5] = i7;
                            i5++;
                            i8 = 0;
                            i7 = 0;
                        }
                        i2 = (i7 << 8) | ((readUnsignedByte >> 6) & 63) | 128;
                        i3 = i8 + 1;
                    }
                    readUnsignedByte = (readUnsignedByte & 63) | 128;
                }
            }
            if (i3 < 4) {
                i4 = i3 + 1;
                i6 = readUnsignedByte | (i2 << 8);
            } else {
                if (i5 >= iArr.length) {
                    iArr = _growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i5] = i2;
                i6 = readUnsignedByte;
                i5++;
                i4 = 1;
            }
            readUnsignedByte = this._inputData.readUnsignedByte();
        }
        if (i3 > 0) {
            if (i5 >= iArr.length) {
                int[] _growArrayBy = _growArrayBy(iArr, iArr.length);
                this._quadBuffer = _growArrayBy;
                iArr = _growArrayBy;
            }
            iArr[i5] = pad(i2, i3);
            i5++;
        }
        String findName = this._symbols.findName(iArr, i5);
        return findName == null ? addName(iArr, i5, i3) : findName;
    }

    /* access modifiers changed from: protected */
    public final String _parseName(int i2) {
        if (i2 != 34) {
            return _handleOddName(i2);
        }
        int[] iArr = _icLatin1;
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte] == 0) {
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            if (iArr[readUnsignedByte2] == 0) {
                int i3 = (readUnsignedByte << 8) | readUnsignedByte2;
                int readUnsignedByte3 = this._inputData.readUnsignedByte();
                if (iArr[readUnsignedByte3] == 0) {
                    int i4 = (i3 << 8) | readUnsignedByte3;
                    int readUnsignedByte4 = this._inputData.readUnsignedByte();
                    if (iArr[readUnsignedByte4] == 0) {
                        int i5 = (i4 << 8) | readUnsignedByte4;
                        int readUnsignedByte5 = this._inputData.readUnsignedByte();
                        if (iArr[readUnsignedByte5] == 0) {
                            this._quad1 = i5;
                            return _parseMediumName(readUnsignedByte5);
                        } else if (readUnsignedByte5 == 34) {
                            return findName(i5, 4);
                        } else {
                            return parseName(i5, readUnsignedByte5, 4);
                        }
                    } else if (readUnsignedByte4 == 34) {
                        return findName(i4, 3);
                    } else {
                        return parseName(i4, readUnsignedByte4, 3);
                    }
                } else if (readUnsignedByte3 == 34) {
                    return findName(i3, 2);
                } else {
                    return parseName(i3, readUnsignedByte3, 2);
                }
            } else if (readUnsignedByte2 == 34) {
                return findName(readUnsignedByte, 1);
            } else {
                return parseName(readUnsignedByte, readUnsignedByte2, 1);
            }
        } else if (readUnsignedByte == 34) {
            return "";
        } else {
            return parseName(0, readUnsignedByte, 0);
        }
    }

    /* access modifiers changed from: protected */
    public JsonToken _parseNegNumber() {
        int i2;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment[0] = '-';
        int readUnsignedByte = this._inputData.readUnsignedByte();
        emptyAndGetCurrentSegment[1] = (char) readUnsignedByte;
        if (readUnsignedByte <= 48) {
            if (readUnsignedByte != 48) {
                return _handleInvalidNumberStart(readUnsignedByte, true);
            }
            i2 = _handleLeadingZeroes();
        } else if (readUnsignedByte > 57) {
            return _handleInvalidNumberStart(readUnsignedByte, true);
        } else {
            i2 = this._inputData.readUnsignedByte();
        }
        int i3 = 2;
        int i4 = 1;
        while (i2 <= 57 && i2 >= 48) {
            i4++;
            emptyAndGetCurrentSegment[i3] = (char) i2;
            i2 = this._inputData.readUnsignedByte();
            i3++;
        }
        if (i2 == 46 || i2 == 101 || i2 == 69) {
            return _parseFloat(emptyAndGetCurrentSegment, i3, i2, true, i4);
        }
        this._textBuffer.setCurrentLength(i3);
        this._nextByte = i2;
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace();
        }
        return resetInt(true, i4);
    }

    /* access modifiers changed from: protected */
    public JsonToken _parsePosNumber(int i2) {
        int i3;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i4 = 1;
        if (i2 == 48) {
            i3 = _handleLeadingZeroes();
            if (i3 > 57 || i3 < 48) {
                emptyAndGetCurrentSegment[0] = '0';
            } else {
                i4 = 0;
            }
        } else {
            emptyAndGetCurrentSegment[0] = (char) i2;
            i3 = this._inputData.readUnsignedByte();
        }
        int i5 = i3;
        int i6 = i4;
        int i7 = i6;
        while (i5 <= 57 && i5 >= 48) {
            i7++;
            emptyAndGetCurrentSegment[i6] = (char) i5;
            i5 = this._inputData.readUnsignedByte();
            i6++;
        }
        if (i5 == 46 || i5 == 101 || i5 == 69) {
            return _parseFloat(emptyAndGetCurrentSegment, i6, i5, false, i7);
        }
        this._textBuffer.setCurrentLength(i6);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace();
        } else {
            this._nextByte = i5;
        }
        return resetInt(false, i7);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a1, code lost:
        throw reportInvalidBase64Char(r13, r6, 3, "expected padding character '" + r13.getPaddingChar() + "'");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int _readBinary(com.fasterxml.jackson.core.Base64Variant r13, java.io.OutputStream r14, byte[] r15) {
        /*
            r12 = this;
            int r0 = r15.length
            r1 = 3
            int r0 = r0 - r1
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0006:
            java.io.DataInput r5 = r12._inputData
            int r5 = r5.readUnsignedByte()
            r6 = 32
            if (r5 <= r6) goto L_0x0006
            int r6 = r13.decodeBase64Char((int) r5)
            r7 = 34
            if (r6 >= 0) goto L_0x0023
            if (r5 != r7) goto L_0x001c
            goto L_0x00d1
        L_0x001c:
            int r6 = r12._decodeBase64Escape((com.fasterxml.jackson.core.Base64Variant) r13, (int) r5, (int) r2)
            if (r6 >= 0) goto L_0x0023
            goto L_0x0006
        L_0x0023:
            if (r3 <= r0) goto L_0x002a
            int r4 = r4 + r3
            r14.write(r15, r2, r3)
            r3 = 0
        L_0x002a:
            java.io.DataInput r5 = r12._inputData
            int r5 = r5.readUnsignedByte()
            int r8 = r13.decodeBase64Char((int) r5)
            if (r8 >= 0) goto L_0x003b
            r8 = 1
            int r8 = r12._decodeBase64Escape((com.fasterxml.jackson.core.Base64Variant) r13, (int) r5, (int) r8)
        L_0x003b:
            int r5 = r6 << 6
            r5 = r5 | r8
            java.io.DataInput r6 = r12._inputData
            int r6 = r6.readUnsignedByte()
            int r8 = r13.decodeBase64Char((int) r6)
            r9 = 0
            r10 = 2
            r11 = -2
            if (r8 >= 0) goto L_0x00aa
            if (r8 == r11) goto L_0x006a
            if (r6 != r7) goto L_0x0065
            int r0 = r5 >> 4
            int r1 = r3 + 1
            byte r0 = (byte) r0
            r15[r3] = r0
            boolean r0 = r13.usesPadding()
            if (r0 != 0) goto L_0x0061
            r3 = r1
            goto L_0x00d1
        L_0x0061:
            r12._handleBase64MissingPadding(r13)
            throw r9
        L_0x0065:
            int r6 = r12._decodeBase64Escape((com.fasterxml.jackson.core.Base64Variant) r13, (int) r6, (int) r10)
            r8 = r6
        L_0x006a:
            if (r8 != r11) goto L_0x00aa
            java.io.DataInput r6 = r12._inputData
            int r6 = r6.readUnsignedByte()
            boolean r7 = r13.usesPaddingChar((int) r6)
            if (r7 != 0) goto L_0x00a2
            r7 = 92
            if (r6 != r7) goto L_0x0083
            int r7 = r12._decodeBase64Escape((com.fasterxml.jackson.core.Base64Variant) r13, (int) r6, (int) r1)
            if (r7 != r11) goto L_0x0083
            goto L_0x00a2
        L_0x0083:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "expected padding character '"
            r14.append(r15)
            char r15 = r13.getPaddingChar()
            r14.append(r15)
            java.lang.String r15 = "'"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            java.lang.IllegalArgumentException r13 = r12.reportInvalidBase64Char(r13, r6, r1, r14)
            throw r13
        L_0x00a2:
            int r5 = r5 >> 4
            int r6 = r3 + 1
            byte r5 = (byte) r5
            r15[r3] = r5
            goto L_0x010b
        L_0x00aa:
            int r5 = r5 << 6
            r5 = r5 | r8
            java.io.DataInput r6 = r12._inputData
            int r6 = r6.readUnsignedByte()
            int r8 = r13.decodeBase64Char((int) r6)
            if (r8 >= 0) goto L_0x00f5
            if (r8 == r11) goto L_0x00e3
            if (r6 != r7) goto L_0x00de
            int r0 = r5 >> 2
            int r1 = r3 + 1
            int r5 = r0 >> 8
            byte r5 = (byte) r5
            r15[r3] = r5
            int r3 = r1 + 1
            byte r0 = (byte) r0
            r15[r1] = r0
            boolean r0 = r13.usesPadding()
            if (r0 != 0) goto L_0x00da
        L_0x00d1:
            r12._tokenIncomplete = r2
            if (r3 <= 0) goto L_0x00d9
            int r4 = r4 + r3
            r14.write(r15, r2, r3)
        L_0x00d9:
            return r4
        L_0x00da:
            r12._handleBase64MissingPadding(r13)
            throw r9
        L_0x00de:
            int r6 = r12._decodeBase64Escape((com.fasterxml.jackson.core.Base64Variant) r13, (int) r6, (int) r1)
            r8 = r6
        L_0x00e3:
            if (r8 != r11) goto L_0x00f5
            int r5 = r5 >> 2
            int r6 = r3 + 1
            int r7 = r5 >> 8
            byte r7 = (byte) r7
            r15[r3] = r7
            int r3 = r6 + 1
            byte r5 = (byte) r5
            r15[r6] = r5
            goto L_0x0006
        L_0x00f5:
            int r5 = r5 << 6
            r5 = r5 | r8
            int r6 = r3 + 1
            int r7 = r5 >> 16
            byte r7 = (byte) r7
            r15[r3] = r7
            int r3 = r6 + 1
            int r7 = r5 >> 8
            byte r7 = (byte) r7
            r15[r6] = r7
            int r6 = r3 + 1
            byte r5 = (byte) r5
            r15[r3] = r5
        L_0x010b:
            r3 = r6
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._readBinary(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream, byte[]):int");
    }

    /* access modifiers changed from: protected */
    public void _releaseBuffers() {
        super._releaseBuffers();
        this._symbols.release();
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
    public void _reportInvalidToken(int i2, String str) {
        _reportInvalidToken(i2, str, "'null', 'true', 'false' or NaN");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void _skipString() {
        this._tokenIncomplete = false;
        int[] iArr = _icUTF8;
        while (true) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (iArr[readUnsignedByte] != 0) {
                if (readUnsignedByte != 34) {
                    int i2 = iArr[readUnsignedByte];
                    if (i2 == 1) {
                        _decodeEscaped();
                    } else if (i2 == 2) {
                        _skipUtf8_2();
                    } else if (i2 == 3) {
                        _skipUtf8_3();
                    } else if (i2 == 4) {
                        _skipUtf8_4();
                    } else if (readUnsignedByte < 32) {
                        _throwUnquotedSpace(readUnsignedByte, "string value");
                    } else {
                        _reportInvalidChar(readUnsignedByte);
                        throw null;
                    }
                } else {
                    return;
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
        return new JsonLocation(_getSourceReference(), -1, -1, this._currInputRow, -1);
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
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.size();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return this._parsingContext.getCurrentName().length();
        } else {
            if (jsonToken == null) {
                return 0;
            }
            if (jsonToken.isNumeric()) {
                return this._textBuffer.size();
            }
            return this._currToken.asCharArray().length;
        }
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
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getTextOffset():int");
    }

    public JsonLocation getTokenLocation() {
        return new JsonLocation(_getSourceReference(), -1, -1, this._tokenInputRow, -1);
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
        int _skipWS = _skipWS();
        this._binaryValue = null;
        this._tokenInputRow = this._currInputRow;
        if (_skipWS == 93 || _skipWS == 125) {
            _closeScope(_skipWS);
            return null;
        }
        if (this._parsingContext.expectComma()) {
            if (_skipWS == 44) {
                _skipWS = _skipWS();
                if (JsonParser.Feature.ALLOW_TRAILING_COMMA.enabledIn(this._features) && (_skipWS == 93 || _skipWS == 125)) {
                    _closeScope(_skipWS);
                    return null;
                }
            } else {
                _reportUnexpectedChar(_skipWS, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
                throw null;
            }
        }
        if (!this._parsingContext.inObject()) {
            _nextTokenNotInObject(_skipWS);
            return null;
        }
        String _parseName = _parseName(_skipWS);
        this._parsingContext.setCurrentName(_parseName);
        this._currToken = JsonToken.FIELD_NAME;
        int _skipColon = _skipColon();
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
            _matchToken("false", 1);
            jsonToken = JsonToken.VALUE_FALSE;
        } else if (_skipColon == 110) {
            _matchToken("null", 1);
            jsonToken = JsonToken.VALUE_NULL;
        } else if (_skipColon == 116) {
            _matchToken("true", 1);
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
        if (this._closed) {
            return null;
        }
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
        this._tokenInputRow = this._currInputRow;
        if (_skipWSOrEnd == 93 || _skipWSOrEnd == 125) {
            _closeScope(_skipWSOrEnd);
            return this._currToken;
        }
        if (this._parsingContext.expectComma()) {
            if (_skipWSOrEnd == 44) {
                _skipWSOrEnd = _skipWS();
                if (JsonParser.Feature.ALLOW_TRAILING_COMMA.enabledIn(this._features) && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                    _closeScope(_skipWSOrEnd);
                    return this._currToken;
                }
            } else {
                _reportUnexpectedChar(_skipWSOrEnd, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
                throw null;
            }
        }
        if (!this._parsingContext.inObject()) {
            return _nextTokenNotInObject(_skipWSOrEnd);
        }
        this._parsingContext.setCurrentName(_parseName(_skipWSOrEnd));
        this._currToken = JsonToken.FIELD_NAME;
        int _skipColon = _skipColon();
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
            _matchToken("false", 1);
            jsonToken = JsonToken.VALUE_FALSE;
        } else if (_skipColon == 110) {
            _matchToken("null", 1);
            jsonToken = JsonToken.VALUE_NULL;
        } else if (_skipColon == 116) {
            _matchToken("true", 1);
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

    /* access modifiers changed from: protected */
    public final String parseEscapedName(int[] iArr, int i2, int i3, int i4, int i5) {
        int[] iArr2 = _icLatin1;
        while (true) {
            if (iArr2[i4] != 0) {
                if (i4 == 34) {
                    break;
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
                            iArr = _growArrayBy(iArr, iArr.length);
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
                                iArr = _growArrayBy(iArr, iArr.length);
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
                    iArr = _growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i2] = r8;
                i3 = i4;
                i2++;
                i5 = 1;
            }
            i4 = this._inputData.readUnsignedByte();
        }
        if (r10 > 0) {
            if (i2 >= iArr.length) {
                iArr = _growArrayBy(iArr, iArr.length);
                this._quadBuffer = iArr;
            }
            iArr[i2] = pad(r8, r10);
            i2++;
        }
        String findName = this._symbols.findName(iArr, i2);
        return findName == null ? addName(iArr, i2, r10) : findName;
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

    private final String parseName(int i2, int i3, int i4, int i5) {
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        return parseEscapedName(iArr, 1, i3, i4, i5);
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidToken(int i2, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            char _decodeCharForError = (char) _decodeCharForError(i2);
            if (Character.isJavaIdentifierPart(_decodeCharForError)) {
                sb.append(_decodeCharForError);
                i2 = this._inputData.readUnsignedByte();
            } else {
                _reportError("Unrecognized token '" + sb.toString() + "': was expecting " + str2);
                throw null;
            }
        }
    }

    private final String parseName(int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        iArr[1] = i3;
        return parseEscapedName(iArr, 2, i4, i5, i6);
    }

    private final String findName(int i2, int i3, int i4) {
        int pad = pad(i3, i4);
        String findName = this._symbols.findName(i2, pad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        iArr[1] = pad;
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
        int pad = pad(i4, i5);
        String findName = this._symbols.findName(i2, i3, pad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = pad(pad, i5);
        return addName(iArr, 3, i5);
    }

    private final String findName(int[] iArr, int i2, int i3, int i4) {
        if (i2 >= iArr.length) {
            iArr = _growArrayBy(iArr, iArr.length);
            this._quadBuffer = iArr;
        }
        int i5 = i2 + 1;
        iArr[i2] = pad(i3, i4);
        String findName = this._symbols.findName(iArr, i5);
        return findName == null ? addName(iArr, i5, i4) : findName;
    }
}
