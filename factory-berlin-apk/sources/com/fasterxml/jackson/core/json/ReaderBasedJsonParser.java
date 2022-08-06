package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;

public class ReaderBasedJsonParser extends ParserBase {
    protected static final int FEAT_MASK_TRAILING_COMMA = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    protected static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();
    protected boolean _bufferRecyclable;
    protected final int _hashSeed;
    protected char[] _inputBuffer;
    protected int _nameStartCol;
    protected long _nameStartOffset;
    protected int _nameStartRow;
    protected ObjectCodec _objectCodec;
    protected Reader _reader;
    protected final CharsToNameCanonicalizer _symbols;
    protected boolean _tokenIncomplete;

    public ReaderBasedJsonParser(IOContext iOContext, int i2, Reader reader, ObjectCodec objectCodec, CharsToNameCanonicalizer charsToNameCanonicalizer, char[] cArr, int i3, int i4, boolean z) {
        super(iOContext, i2);
        this._reader = reader;
        this._inputBuffer = cArr;
        this._inputPtr = i3;
        this._inputEnd = i4;
        this._objectCodec = objectCodec;
        this._symbols = charsToNameCanonicalizer;
        this._hashSeed = charsToNameCanonicalizer.hashSeed();
        this._bufferRecyclable = z;
    }

    private final void _checkMatchEnd(String str, int i2, int i3) {
        if (Character.isJavaIdentifierPart((char) i3)) {
            _reportInvalidToken(str.substring(0, i2));
            throw null;
        }
    }

    private void _closeScope(int i2) {
        if (i2 == 93) {
            _updateLocation();
            if (this._parsingContext.inArray()) {
                this._parsingContext = this._parsingContext.clearAndGetParent();
                this._currToken = JsonToken.END_ARRAY;
            } else {
                _reportMismatchedEndMarker(i2, '}');
                throw null;
            }
        }
        if (i2 == 125) {
            _updateLocation();
            if (this._parsingContext.inObject()) {
                this._parsingContext = this._parsingContext.clearAndGetParent();
                this._currToken = JsonToken.END_OBJECT;
                return;
            }
            _reportMismatchedEndMarker(i2, ']');
            throw null;
        }
    }

    private String _handleOddName2(int i2, int i3, int[] iArr) {
        this._textBuffer.resetWithShared(this._inputBuffer, i2, this._inputPtr - i2);
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int length = iArr.length;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            char c = this._inputBuffer[this._inputPtr];
            if (c >= length) {
                if (!Character.isJavaIdentifierPart(c)) {
                    break;
                }
            } else if (iArr[c] != 0) {
                break;
            }
            this._inputPtr++;
            i3 = (i3 * 33) + c;
            int i4 = currentSegmentSize + 1;
            currentSegment[currentSegmentSize] = c;
            if (i4 >= currentSegment.length) {
                currentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            } else {
                currentSegmentSize = i4;
            }
        }
        this._textBuffer.setCurrentLength(currentSegmentSize);
        TextBuffer textBuffer = this._textBuffer;
        return this._symbols.findSymbol(textBuffer.getTextBuffer(), textBuffer.getTextOffset(), textBuffer.size(), i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = r0 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void _matchFalse() {
        /*
            r5 = this;
            int r0 = r5._inputPtr
            int r1 = r0 + 4
            int r2 = r5._inputEnd
            r3 = 1
            if (r1 >= r2) goto L_0x0038
            char[] r1 = r5._inputBuffer
            char r2 = r1[r0]
            r4 = 97
            if (r2 != r4) goto L_0x0038
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 108(0x6c, float:1.51E-43)
            if (r2 != r4) goto L_0x0038
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 115(0x73, float:1.61E-43)
            if (r2 != r4) goto L_0x0038
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 101(0x65, float:1.42E-43)
            if (r2 != r4) goto L_0x0038
            int r0 = r0 + r3
            char r1 = r1[r0]
            r2 = 48
            if (r1 < r2) goto L_0x0035
            r2 = 93
            if (r1 == r2) goto L_0x0035
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L_0x0038
        L_0x0035:
            r5._inputPtr = r0
            return
        L_0x0038:
            java.lang.String r0 = "false"
            r5._matchToken(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._matchFalse():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r0 = r0 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void _matchNull() {
        /*
            r5 = this;
            int r0 = r5._inputPtr
            int r1 = r0 + 3
            int r2 = r5._inputEnd
            r3 = 1
            if (r1 >= r2) goto L_0x002f
            char[] r1 = r5._inputBuffer
            char r2 = r1[r0]
            r4 = 117(0x75, float:1.64E-43)
            if (r2 != r4) goto L_0x002f
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 108(0x6c, float:1.51E-43)
            if (r2 != r4) goto L_0x002f
            int r0 = r0 + r3
            char r2 = r1[r0]
            if (r2 != r4) goto L_0x002f
            int r0 = r0 + r3
            char r1 = r1[r0]
            r2 = 48
            if (r1 < r2) goto L_0x002c
            r2 = 93
            if (r1 == r2) goto L_0x002c
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L_0x002f
        L_0x002c:
            r5._inputPtr = r0
            return
        L_0x002f:
            java.lang.String r0 = "null"
            r5._matchToken(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._matchNull():void");
    }

    private final void _matchToken2(String str, int i2) {
        int i3;
        char c;
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
        if ((i3 < this._inputEnd || _loadMore()) && (c = this._inputBuffer[this._inputPtr]) >= '0' && c != ']' && c != '}') {
            _checkMatchEnd(str, i2, c);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r0 = r0 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void _matchTrue() {
        /*
            r5 = this;
            int r0 = r5._inputPtr
            int r1 = r0 + 3
            int r2 = r5._inputEnd
            r3 = 1
            if (r1 >= r2) goto L_0x0031
            char[] r1 = r5._inputBuffer
            char r2 = r1[r0]
            r4 = 114(0x72, float:1.6E-43)
            if (r2 != r4) goto L_0x0031
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 117(0x75, float:1.64E-43)
            if (r2 != r4) goto L_0x0031
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 101(0x65, float:1.42E-43)
            if (r2 != r4) goto L_0x0031
            int r0 = r0 + r3
            char r1 = r1[r0]
            r2 = 48
            if (r1 < r2) goto L_0x002e
            r2 = 93
            if (r1 == r2) goto L_0x002e
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L_0x0031
        L_0x002e:
            r5._inputPtr = r0
            return
        L_0x0031:
            java.lang.String r0 = "true"
            r5._matchToken(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._matchTrue():void");
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
        }
        if (i2 != 44) {
            if (i2 == 45) {
                JsonToken _parseNegNumber = _parseNegNumber();
                this._currToken = _parseNegNumber;
                return _parseNegNumber;
            } else if (i2 == 91) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
                JsonToken jsonToken2 = JsonToken.START_ARRAY;
                this._currToken = jsonToken2;
                return jsonToken2;
            } else if (i2 != 93) {
                if (i2 == 102) {
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
                    }
                    JsonToken _handleOddValue = _handleOddValue(i2);
                    this._currToken = _handleOddValue;
                    return _handleOddValue;
                } else {
                    this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                    JsonToken jsonToken6 = JsonToken.START_OBJECT;
                    this._currToken = jsonToken6;
                    return jsonToken6;
                }
            }
        }
        if (isEnabled(JsonParser.Feature.ALLOW_MISSING_VALUES)) {
            this._inputPtr--;
            JsonToken jsonToken7 = JsonToken.VALUE_NULL;
            this._currToken = jsonToken7;
            return jsonToken7;
        }
        JsonToken _handleOddValue2 = _handleOddValue(i2);
        this._currToken = _handleOddValue2;
        return _handleOddValue2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r9 == 'E') goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        if (r9 == '+') goto L_0x0053;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.fasterxml.jackson.core.JsonToken _parseFloat(int r9, int r10, int r11, boolean r12, int r13) {
        /*
            r8 = this;
            int r0 = r8._inputEnd
            r1 = 0
            r2 = 57
            r3 = 48
            r4 = 0
            r5 = 46
            if (r9 != r5) goto L_0x002f
            r9 = 0
        L_0x000d:
            if (r11 < r0) goto L_0x0014
            com.fasterxml.jackson.core.JsonToken r9 = r8._parseNumber2(r12, r10)
            return r9
        L_0x0014:
            char[] r5 = r8._inputBuffer
            int r6 = r11 + 1
            char r11 = r5[r11]
            if (r11 < r3) goto L_0x0023
            if (r11 <= r2) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            int r9 = r9 + 1
            r11 = r6
            goto L_0x000d
        L_0x0023:
            if (r9 == 0) goto L_0x0029
            r7 = r11
            r11 = r9
            r9 = r7
            goto L_0x0031
        L_0x0029:
            java.lang.String r9 = "Decimal point not followed by a digit"
            r8.reportUnexpectedNumberChar(r11, r9)
            throw r1
        L_0x002f:
            r6 = r11
            r11 = 0
        L_0x0031:
            r5 = 101(0x65, float:1.42E-43)
            if (r9 == r5) goto L_0x0039
            r5 = 69
            if (r9 != r5) goto L_0x007a
        L_0x0039:
            if (r6 < r0) goto L_0x0042
            r8._inputPtr = r10
            com.fasterxml.jackson.core.JsonToken r9 = r8._parseNumber2(r12, r10)
            return r9
        L_0x0042:
            char[] r9 = r8._inputBuffer
            int r5 = r6 + 1
            char r9 = r9[r6]
            r6 = 45
            if (r9 == r6) goto L_0x0053
            r6 = 43
            if (r9 != r6) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            r6 = r5
            goto L_0x0062
        L_0x0053:
            if (r5 < r0) goto L_0x005c
            r8._inputPtr = r10
            com.fasterxml.jackson.core.JsonToken r9 = r8._parseNumber2(r12, r10)
            return r9
        L_0x005c:
            char[] r9 = r8._inputBuffer
            int r6 = r5 + 1
            char r9 = r9[r5]
        L_0x0062:
            if (r9 > r2) goto L_0x0078
            if (r9 < r3) goto L_0x0078
            int r4 = r4 + 1
            if (r6 < r0) goto L_0x0071
            r8._inputPtr = r10
            com.fasterxml.jackson.core.JsonToken r9 = r8._parseNumber2(r12, r10)
            return r9
        L_0x0071:
            char[] r9 = r8._inputBuffer
            int r5 = r6 + 1
            char r9 = r9[r6]
            goto L_0x0051
        L_0x0078:
            if (r4 == 0) goto L_0x0096
        L_0x007a:
            int r6 = r6 + -1
            r8._inputPtr = r6
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r8._parsingContext
            boolean r0 = r0.inRoot()
            if (r0 == 0) goto L_0x0089
            r8._verifyRootSpace(r9)
        L_0x0089:
            int r6 = r6 - r10
            com.fasterxml.jackson.core.util.TextBuffer r9 = r8._textBuffer
            char[] r0 = r8._inputBuffer
            r9.resetWithShared(r0, r10, r6)
            com.fasterxml.jackson.core.JsonToken r9 = r8.resetFloat(r12, r13, r11, r4)
            return r9
        L_0x0096:
            java.lang.String r10 = "Exponent indicator not followed by a digit"
            r8.reportUnexpectedNumberChar(r9, r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._parseFloat(int, int, int, boolean, int):com.fasterxml.jackson.core.JsonToken");
    }

    private String _parseName2(int i2, int i3, int i4) {
        this._textBuffer.resetWithShared(this._inputBuffer, i2, this._inputPtr - i2);
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                char[] cArr = this._inputBuffer;
                int i5 = this._inputPtr;
                this._inputPtr = i5 + 1;
                char c = cArr[i5];
                if (c <= '\\') {
                    if (c == '\\') {
                        c = _decodeEscaped();
                    } else if (c <= i4) {
                        if (c == i4) {
                            this._textBuffer.setCurrentLength(currentSegmentSize);
                            TextBuffer textBuffer = this._textBuffer;
                            return this._symbols.findSymbol(textBuffer.getTextBuffer(), textBuffer.getTextOffset(), textBuffer.size(), i3);
                        } else if (c < ' ') {
                            _throwUnquotedSpace(c, "name");
                        }
                    }
                }
                i3 = (i3 * 33) + c;
                int i6 = currentSegmentSize + 1;
                currentSegment[currentSegmentSize] = c;
                if (i6 >= currentSegment.length) {
                    currentSegment = this._textBuffer.finishCurrentSegment();
                    currentSegmentSize = 0;
                } else {
                    currentSegmentSize = i6;
                }
            } else {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
                throw null;
            }
        }
    }

    private final JsonToken _parseNumber2(boolean z, int i2) {
        int i3;
        char c;
        boolean z2;
        int i4;
        char c2;
        char nextChar;
        int i5;
        boolean z3 = z;
        this._inputPtr = z3 ? i2 + 1 : i2;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i6 = 0;
        if (z3) {
            emptyAndGetCurrentSegment[0] = '-';
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i7 = this._inputPtr;
        if (i7 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            this._inputPtr = i7 + 1;
            c = cArr[i7];
        } else {
            c = getNextChar("No digit following minus sign", JsonToken.VALUE_NUMBER_INT);
        }
        if (c == '0') {
            c = _verifyNoLeadingZeroes();
        }
        int i8 = 0;
        while (true) {
            if (c >= '0' && c <= '9') {
                i8++;
                if (i3 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i3 = 0;
                }
                int i9 = i3 + 1;
                emptyAndGetCurrentSegment[i3] = c;
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    i3 = i9;
                    c = 0;
                    z2 = true;
                    break;
                }
                char[] cArr2 = this._inputBuffer;
                int i10 = this._inputPtr;
                this._inputPtr = i10 + 1;
                c = cArr2[i10];
                i3 = i9;
            } else {
                z2 = false;
            }
        }
        if (i8 == 0) {
            return _handleInvalidNumberStart(c, z3);
        }
        if (c == '.') {
            if (i3 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i3 = 0;
            }
            emptyAndGetCurrentSegment[i3] = c;
            int i11 = i3 + 1;
            i4 = 0;
            while (true) {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    z2 = true;
                    break;
                }
                char[] cArr3 = this._inputBuffer;
                int i12 = this._inputPtr;
                this._inputPtr = i12 + 1;
                c = cArr3[i12];
                if (c < '0' || c > '9') {
                    break;
                }
                i4++;
                if (i3 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i3 = 0;
                }
                emptyAndGetCurrentSegment[i3] = c;
                i11 = i3 + 1;
            }
            if (i4 == 0) {
                reportUnexpectedNumberChar(c, "Decimal point not followed by a digit");
                throw null;
            }
        } else {
            i4 = 0;
        }
        if (c == 'e' || c == 'E') {
            if (i3 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i3 = 0;
            }
            int i13 = i3 + 1;
            emptyAndGetCurrentSegment[i3] = c;
            int i14 = this._inputPtr;
            if (i14 < this._inputEnd) {
                char[] cArr4 = this._inputBuffer;
                this._inputPtr = i14 + 1;
                c2 = cArr4[i14];
            } else {
                c2 = getNextChar("expected a digit for number exponent");
            }
            if (c2 == '-' || c2 == '+') {
                if (i13 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i13 = 0;
                }
                int i15 = i13 + 1;
                emptyAndGetCurrentSegment[i13] = c2;
                int i16 = this._inputPtr;
                if (i16 < this._inputEnd) {
                    char[] cArr5 = this._inputBuffer;
                    this._inputPtr = i16 + 1;
                    nextChar = cArr5[i16];
                } else {
                    nextChar = getNextChar("expected a digit for number exponent");
                }
                i13 = i15;
            }
            char c3 = c2;
            int i17 = 0;
            while (true) {
                if (c <= '9' && c >= '0') {
                    i17++;
                    if (i13 >= emptyAndGetCurrentSegment.length) {
                        emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                        i13 = 0;
                    }
                    int i18 = i13 + 1;
                    emptyAndGetCurrentSegment[i13] = c;
                    if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                        i5 = i18;
                        z2 = true;
                        i6 = i17;
                        break;
                    }
                    char[] cArr6 = this._inputBuffer;
                    int i19 = this._inputPtr;
                    this._inputPtr = i19 + 1;
                    c3 = cArr6[i19];
                    i13 = i18;
                } else {
                    i6 = i17;
                    i5 = i13;
                }
            }
            i6 = i17;
            i5 = i13;
            if (i6 == 0) {
                reportUnexpectedNumberChar(c, "Exponent indicator not followed by a digit");
                throw null;
            }
        }
        if (!z2) {
            this._inputPtr--;
            if (this._parsingContext.inRoot()) {
                _verifyRootSpace(c);
            }
        }
        this._textBuffer.setCurrentLength(i3);
        return reset(z3, i8, i4, i6);
    }

    private final int _skipAfterComma2() {
        char c;
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                char[] cArr = this._inputBuffer;
                int i2 = this._inputPtr;
                int i3 = i2 + 1;
                this._inputPtr = i3;
                c = cArr[i2];
                if (c > ' ') {
                    if (c == '/') {
                        _skipComment();
                    } else if (c != '#' || !_skipYAMLComment()) {
                        return c;
                    }
                } else if (c >= ' ') {
                    continue;
                } else if (c == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (c == 13) {
                    _skipCR();
                } else if (c != 9) {
                    _throwInvalidSpace(c);
                    throw null;
                }
            } else {
                throw _constructError("Unexpected end-of-input within/between " + this._parsingContext.typeDesc() + " entries");
            }
        }
        return c;
    }

    private void _skipCComment() {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            char c = cArr[i2];
            if (c <= '*') {
                if (c == '*') {
                    if (i3 >= this._inputEnd && !_loadMore()) {
                        break;
                    }
                    char[] cArr2 = this._inputBuffer;
                    int i4 = this._inputPtr;
                    if (cArr2[i4] == '/') {
                        this._inputPtr = i4 + 1;
                        return;
                    }
                } else if (c >= ' ') {
                    continue;
                } else if (c == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (c == 13) {
                    _skipCR();
                } else if (c != 9) {
                    _throwInvalidSpace(c);
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
        char[] cArr = this._inputBuffer;
        char c = cArr[i2];
        if (c == ':') {
            int i3 = i2 + 1;
            this._inputPtr = i3;
            char c2 = cArr[i3];
            if (c2 <= ' ') {
                if (c2 == ' ' || c2 == 9) {
                    char[] cArr2 = this._inputBuffer;
                    int i4 = this._inputPtr + 1;
                    this._inputPtr = i4;
                    char c3 = cArr2[i4];
                    if (c3 > ' ') {
                        if (c3 == '/' || c3 == '#') {
                            return _skipColon2(true);
                        }
                        this._inputPtr = i4 + 1;
                        return c3;
                    }
                }
                return _skipColon2(true);
            } else if (c2 == '/' || c2 == '#') {
                return _skipColon2(true);
            } else {
                this._inputPtr = i3 + 1;
                return c2;
            }
        } else {
            if (c == ' ' || c == 9) {
                char[] cArr3 = this._inputBuffer;
                int i5 = this._inputPtr + 1;
                this._inputPtr = i5;
                c = cArr3[i5];
            }
            if (c != ':') {
                return _skipColon2(false);
            }
            char[] cArr4 = this._inputBuffer;
            int i6 = this._inputPtr + 1;
            this._inputPtr = i6;
            char c4 = cArr4[i6];
            if (c4 <= ' ') {
                if (c4 == ' ' || c4 == 9) {
                    char[] cArr5 = this._inputBuffer;
                    int i7 = this._inputPtr + 1;
                    this._inputPtr = i7;
                    char c5 = cArr5[i7];
                    if (c5 > ' ') {
                        if (c5 == '/' || c5 == '#') {
                            return _skipColon2(true);
                        }
                        this._inputPtr = i7 + 1;
                        return c5;
                    }
                }
                return _skipColon2(true);
            } else if (c4 == '/' || c4 == '#') {
                return _skipColon2(true);
            } else {
                this._inputPtr = i6 + 1;
                return c4;
            }
        }
    }

    private final int _skipColon2(boolean z) {
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                char[] cArr = this._inputBuffer;
                int i2 = this._inputPtr;
                int i3 = i2 + 1;
                this._inputPtr = i3;
                char c = cArr[i2];
                if (c > ' ') {
                    if (c == '/') {
                        _skipComment();
                    } else if (c != '#' || !_skipYAMLComment()) {
                        if (z) {
                            return c;
                        }
                        if (c == ':') {
                            z = true;
                        } else {
                            _reportUnexpectedChar(c, "was expecting a colon to separate field name and value");
                            throw null;
                        }
                    }
                } else if (c >= ' ') {
                    continue;
                } else if (c == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (c == 13) {
                    _skipCR();
                } else if (c != 9) {
                    _throwInvalidSpace(c);
                    throw null;
                }
            } else {
                _reportInvalidEOF(" within/between " + this._parsingContext.typeDesc() + " entries", (JsonToken) null);
                throw null;
            }
        }
    }

    private final int _skipComma(int i2) {
        if (i2 == 44) {
            while (true) {
                int i3 = this._inputPtr;
                if (i3 >= this._inputEnd) {
                    return _skipAfterComma2();
                }
                char[] cArr = this._inputBuffer;
                int i4 = i3 + 1;
                this._inputPtr = i4;
                char c = cArr[i3];
                if (c > ' ') {
                    if (c != '/' && c != '#') {
                        return c;
                    }
                    this._inputPtr--;
                    return _skipAfterComma2();
                } else if (c < ' ') {
                    if (c == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = i4;
                    } else if (c == 13) {
                        _skipCR();
                    } else if (c != 9) {
                        _throwInvalidSpace(c);
                        throw null;
                    }
                }
            }
        } else {
            _reportUnexpectedChar(i2, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
            throw null;
        }
    }

    private void _skipComment() {
        if (!isEnabled(JsonParser.Feature.ALLOW_COMMENTS)) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
            throw null;
        } else if (this._inputPtr < this._inputEnd || _loadMore()) {
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            char c = cArr[i2];
            if (c == '/') {
                _skipLine();
            } else if (c == '*') {
                _skipCComment();
            } else {
                _reportUnexpectedChar(c, "was expecting either '*' or '/' for a comment");
                throw null;
            }
        } else {
            _reportInvalidEOF(" in a comment", (JsonToken) null);
            throw null;
        }
    }

    private void _skipLine() {
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                char[] cArr = this._inputBuffer;
                int i2 = this._inputPtr;
                int i3 = i2 + 1;
                this._inputPtr = i3;
                char c = cArr[i2];
                if (c < ' ') {
                    if (c == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = i3;
                        return;
                    } else if (c == 13) {
                        _skipCR();
                        return;
                    } else if (c != 9) {
                        _throwInvalidSpace(c);
                        throw null;
                    }
                }
            } else {
                return;
            }
        }
    }

    private final int _skipWSOrEnd() {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            return _eofAsNextChar();
        }
        char[] cArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        char c = cArr[i2];
        if (c <= ' ') {
            if (c != ' ') {
                if (c == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (c == 13) {
                    _skipCR();
                } else if (c != 9) {
                    _throwInvalidSpace(c);
                    throw null;
                }
            }
            while (true) {
                int i4 = this._inputPtr;
                if (i4 >= this._inputEnd) {
                    return _skipWSOrEnd2();
                }
                char[] cArr2 = this._inputBuffer;
                int i5 = i4 + 1;
                this._inputPtr = i5;
                char c2 = cArr2[i4];
                if (c2 > ' ') {
                    if (c2 != '/' && c2 != '#') {
                        return c2;
                    }
                    this._inputPtr--;
                    return _skipWSOrEnd2();
                } else if (c2 != ' ') {
                    if (c2 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = i5;
                    } else if (c2 == 13) {
                        _skipCR();
                    } else if (c2 != 9) {
                        _throwInvalidSpace(c2);
                        throw null;
                    }
                }
            }
        } else if (c != '/' && c != '#') {
            return c;
        } else {
            this._inputPtr--;
            return _skipWSOrEnd2();
        }
    }

    private int _skipWSOrEnd2() {
        char c;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return _eofAsNextChar();
            }
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            c = cArr[i2];
            if (c > ' ') {
                if (c == '/') {
                    _skipComment();
                } else if (c != '#' || !_skipYAMLComment()) {
                    return c;
                }
            } else if (c == ' ') {
                continue;
            } else if (c == 10) {
                this._currInputRow++;
                this._currInputRowStart = i3;
            } else if (c == 13) {
                _skipCR();
            } else if (c != 9) {
                _throwInvalidSpace(c);
                throw null;
            }
        }
        return c;
    }

    private boolean _skipYAMLComment() {
        if (!isEnabled(JsonParser.Feature.ALLOW_YAML_COMMENTS)) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _updateLocation() {
        int i2 = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + ((long) i2);
        this._tokenInputRow = this._currInputRow;
        this._tokenInputCol = i2 - this._currInputRowStart;
    }

    private final void _updateNameLocation() {
        int i2 = this._inputPtr;
        this._nameStartOffset = (long) i2;
        this._nameStartRow = this._currInputRow;
        this._nameStartCol = i2 - this._currInputRowStart;
    }

    private char _verifyNLZ2() {
        char c;
        if ((this._inputPtr >= this._inputEnd && !_loadMore()) || (c = this._inputBuffer[this._inputPtr]) < '0' || c > '9') {
            return '0';
        }
        if (isEnabled(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS)) {
            this._inputPtr++;
            if (c == '0') {
                do {
                    if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                        break;
                    }
                    char[] cArr = this._inputBuffer;
                    int i2 = this._inputPtr;
                    c = cArr[i2];
                    if (c < '0' || c > '9') {
                        return '0';
                    }
                    this._inputPtr = i2 + 1;
                } while (c == '0');
            }
            return c;
        }
        reportInvalidNumber("Leading zeroes not allowed");
        throw null;
    }

    private final char _verifyNoLeadingZeroes() {
        char c;
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd || ((c = this._inputBuffer[i2]) >= '0' && c <= '9')) {
            return _verifyNLZ2();
        }
        return '0';
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

    /* access modifiers changed from: protected */
    public void _closeInput() {
        if (this._reader != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this._reader.close();
            }
            this._reader = null;
        }
    }

    /* access modifiers changed from: protected */
    public byte[] _decodeBase64(Base64Variant base64Variant) {
        ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            char c = cArr[i2];
            if (c > ' ') {
                int decodeBase64Char = base64Variant.decodeBase64Char(c);
                if (decodeBase64Char < 0) {
                    if (c == '\"') {
                        return _getByteArrayBuilder.toByteArray();
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, c, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr2 = this._inputBuffer;
                int i3 = this._inputPtr;
                this._inputPtr = i3 + 1;
                char c2 = cArr2[i3];
                int decodeBase64Char2 = base64Variant.decodeBase64Char(c2);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, c2, 1);
                }
                int i4 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr3 = this._inputBuffer;
                int i5 = this._inputPtr;
                this._inputPtr = i5 + 1;
                char c3 = cArr3[i5];
                int decodeBase64Char3 = base64Variant.decodeBase64Char(c3);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (c3 == '\"') {
                            _getByteArrayBuilder.append(i4 >> 4);
                            if (!base64Variant.usesPadding()) {
                                return _getByteArrayBuilder.toByteArray();
                            }
                            this._inputPtr--;
                            _handleBase64MissingPadding(base64Variant);
                            throw null;
                        }
                        decodeBase64Char3 = _decodeBase64Escape(base64Variant, c3, 2);
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        char[] cArr4 = this._inputBuffer;
                        int i6 = this._inputPtr;
                        this._inputPtr = i6 + 1;
                        char c4 = cArr4[i6];
                        if (base64Variant.usesPaddingChar(c4) || _decodeBase64Escape(base64Variant, c4, 3) == -2) {
                            _getByteArrayBuilder.append(i4 >> 4);
                        } else {
                            throw reportInvalidBase64Char(base64Variant, c4, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                    }
                }
                int i7 = (i4 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr5 = this._inputBuffer;
                int i8 = this._inputPtr;
                this._inputPtr = i8 + 1;
                char c5 = cArr5[i8];
                int decodeBase64Char4 = base64Variant.decodeBase64Char(c5);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (c5 == '\"') {
                            _getByteArrayBuilder.appendTwoBytes(i7 >> 2);
                            if (!base64Variant.usesPadding()) {
                                return _getByteArrayBuilder.toByteArray();
                            }
                            this._inputPtr--;
                            _handleBase64MissingPadding(base64Variant);
                            throw null;
                        }
                        decodeBase64Char4 = _decodeBase64Escape(base64Variant, c5, 3);
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
    public char _decodeEscaped() {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            char c = cArr[i2];
            if (c == '\"' || c == '/' || c == '\\') {
                return c;
            }
            if (c == 'b') {
                return 8;
            }
            if (c == 'f') {
                return 12;
            }
            if (c == 'n') {
                return 10;
            }
            if (c == 'r') {
                return 13;
            }
            if (c == 't') {
                return 9;
            }
            if (c != 'u') {
                _handleUnrecognizedCharacterEscape(c);
                return c;
            }
            int i3 = 0;
            int i4 = 0;
            while (i3 < 4) {
                if (this._inputPtr < this._inputEnd || _loadMore()) {
                    char[] cArr2 = this._inputBuffer;
                    int i5 = this._inputPtr;
                    this._inputPtr = i5 + 1;
                    char c2 = cArr2[i5];
                    int charToHex = CharTypes.charToHex(c2);
                    if (charToHex >= 0) {
                        i4 = (i4 << 4) | charToHex;
                        i3++;
                    } else {
                        _reportUnexpectedChar(c2, "expected a hex-digit for character escape sequence");
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
    public final void _finishString() {
        int i2 = this._inputPtr;
        int i3 = this._inputEnd;
        if (i2 < i3) {
            int[] iArr = _icLatin1;
            int length = iArr.length;
            while (true) {
                char[] cArr = this._inputBuffer;
                char c = cArr[i2];
                if (c >= length || iArr[c] == 0) {
                    i2++;
                    if (i2 >= i3) {
                        break;
                    }
                } else if (c == '\"') {
                    TextBuffer textBuffer = this._textBuffer;
                    int i4 = this._inputPtr;
                    textBuffer.resetWithShared(cArr, i4, i2 - i4);
                    this._inputPtr = i2 + 1;
                    return;
                }
            }
        }
        TextBuffer textBuffer2 = this._textBuffer;
        char[] cArr2 = this._inputBuffer;
        int i5 = this._inputPtr;
        textBuffer2.resetWithCopy(cArr2, i5, i2 - i5);
        this._inputPtr = i2;
        _finishString2();
    }

    /* access modifiers changed from: protected */
    public void _finishString2() {
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int[] iArr = _icLatin1;
        int length = iArr.length;
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                char[] cArr = this._inputBuffer;
                int i2 = this._inputPtr;
                this._inputPtr = i2 + 1;
                char c = cArr[i2];
                if (c < length && iArr[c] != 0) {
                    if (c == '\"') {
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        return;
                    } else if (c == '\\') {
                        c = _decodeEscaped();
                    } else if (c < ' ') {
                        _throwUnquotedSpace(c, "string value");
                    }
                }
                if (currentSegmentSize >= currentSegment.length) {
                    currentSegment = this._textBuffer.finishCurrentSegment();
                    currentSegmentSize = 0;
                }
                currentSegment[currentSegmentSize] = c;
                currentSegmentSize++;
            } else {
                _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
                throw null;
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
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                char[] cArr = this._inputBuffer;
                int i2 = this._inputPtr;
                this._inputPtr = i2 + 1;
                char c = cArr[i2];
                if (c <= '\\') {
                    if (c == '\\') {
                        c = _decodeEscaped();
                    } else if (c <= '\'') {
                        if (c == '\'') {
                            this._textBuffer.setCurrentLength(currentSegmentSize);
                            return JsonToken.VALUE_STRING;
                        } else if (c < ' ') {
                            _throwUnquotedSpace(c, "string value");
                        }
                    }
                }
                if (currentSegmentSize >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    currentSegmentSize = 0;
                }
                emptyAndGetCurrentSegment[currentSegmentSize] = c;
                currentSegmentSize++;
            } else {
                _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
                throw null;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ?, r10v1 ?, r10v4 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    protected com.fasterxml.jackson.core.JsonToken _handleInvalidNumberStart(
/*
Method generation error in method: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._handleInvalidNumberStart(int, boolean):com.fasterxml.jackson.core.JsonToken, dex: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ?
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
        boolean z;
        if (i2 == 39 && isEnabled(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
            return _parseAposName();
        }
        if (isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES)) {
            int[] inputCodeLatin1JsNames = CharTypes.getInputCodeLatin1JsNames();
            int length = inputCodeLatin1JsNames.length;
            if (i2 < length) {
                z = inputCodeLatin1JsNames[i2] == 0;
            } else {
                z = Character.isJavaIdentifierPart((char) i2);
            }
            if (z) {
                int i3 = this._inputPtr;
                int i4 = this._hashSeed;
                int i5 = this._inputEnd;
                if (i3 < i5) {
                    do {
                        char[] cArr = this._inputBuffer;
                        char c = cArr[i3];
                        if (c < length) {
                            if (inputCodeLatin1JsNames[c] != 0) {
                                int i6 = this._inputPtr - 1;
                                this._inputPtr = i3;
                                return this._symbols.findSymbol(cArr, i6, i3 - i6, i4);
                            }
                        } else if (!Character.isJavaIdentifierPart((char) c)) {
                            int i7 = this._inputPtr - 1;
                            this._inputPtr = i3;
                            return this._symbols.findSymbol(this._inputBuffer, i7, i3 - i7, i4);
                        }
                        i4 = (i4 * 33) + c;
                        i3++;
                    } while (i3 < i5);
                }
                this._inputPtr = i3;
                return _handleOddName2(this._inputPtr - 1, i4, inputCodeLatin1JsNames);
            }
            _reportUnexpectedChar(i2, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
            throw null;
        }
        _reportUnexpectedChar(i2, "was expecting double-quote to start field name");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r4 != 44) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        if (r3._parsingContext.inArray() == false) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.JsonToken _handleOddValue(int r4) {
        /*
            r3 = this;
            r0 = 39
            r1 = 0
            if (r4 == r0) goto L_0x008c
            r0 = 73
            r2 = 1
            if (r4 == r0) goto L_0x0072
            r0 = 78
            if (r4 == r0) goto L_0x0058
            r0 = 93
            if (r4 == r0) goto L_0x003f
            r0 = 43
            if (r4 == r0) goto L_0x001c
            r0 = 44
            if (r4 == r0) goto L_0x0048
            goto L_0x0099
        L_0x001c:
            int r4 = r3._inputPtr
            int r0 = r3._inputEnd
            if (r4 < r0) goto L_0x002f
            boolean r4 = r3._loadMore()
            if (r4 == 0) goto L_0x0029
            goto L_0x002f
        L_0x0029:
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r3._reportInvalidEOFInValue(r4)
            throw r1
        L_0x002f:
            char[] r4 = r3._inputBuffer
            int r0 = r3._inputPtr
            int r1 = r0 + 1
            r3._inputPtr = r1
            char r4 = r4[r0]
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleInvalidNumberStart(r4, r0)
            return r4
        L_0x003f:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3._parsingContext
            boolean r0 = r0.inArray()
            if (r0 != 0) goto L_0x0048
            goto L_0x0099
        L_0x0048:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L_0x0099
            int r4 = r3._inputPtr
            int r4 = r4 - r2
            r3._inputPtr = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L_0x0058:
            java.lang.String r4 = "NaN"
            r3._matchToken(r4, r2)
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L_0x006c
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r4, r0)
            return r4
        L_0x006c:
            java.lang.String r4 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r4)
            throw r1
        L_0x0072:
            java.lang.String r4 = "Infinity"
            r3._matchToken(r4, r2)
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L_0x0086
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r4, r0)
            return r4
        L_0x0086:
            java.lang.String r4 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r4)
            throw r1
        L_0x008c:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L_0x0099
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleApos()
            return r4
        L_0x0099:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto L_0x00b7
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
        L_0x00b7:
            java.lang.String r0 = "expected a valid value (number, String, array, object, 'true', 'false' or 'null')"
            r3._reportUnexpectedChar(r4, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._handleOddValue(int):com.fasterxml.jackson.core.JsonToken");
    }

    /* access modifiers changed from: protected */
    public boolean _loadMore() {
        int i2 = this._inputEnd;
        long j2 = (long) i2;
        this._currInputProcessed += j2;
        this._currInputRowStart -= i2;
        this._nameStartOffset -= j2;
        Reader reader = this._reader;
        if (reader != null) {
            char[] cArr = this._inputBuffer;
            int read = reader.read(cArr, 0, cArr.length);
            if (read > 0) {
                this._inputPtr = 0;
                this._inputEnd = read;
                return true;
            }
            _closeInput();
            if (read == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this._inputEnd);
            }
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
                char c = this._inputBuffer[i3];
                if (c >= '0' && c != ']' && c != '}') {
                    _checkMatchEnd(str, i2, c);
                    return;
                }
                return;
            }
        }
        _reportInvalidToken(str.substring(0, i2));
        throw null;
    }

    /* access modifiers changed from: protected */
    public String _parseAposName() {
        int i2 = this._inputPtr;
        int i3 = this._hashSeed;
        int i4 = this._inputEnd;
        if (i2 < i4) {
            int[] iArr = _icLatin1;
            int length = iArr.length;
            do {
                char[] cArr = this._inputBuffer;
                char c = cArr[i2];
                if (c != '\'') {
                    if (c < length && iArr[c] != 0) {
                        break;
                    }
                    i3 = (i3 * 33) + c;
                    i2++;
                } else {
                    int i5 = this._inputPtr;
                    this._inputPtr = i2 + 1;
                    return this._symbols.findSymbol(cArr, i5, i2 - i5, i3);
                }
            } while (i2 < i4);
        }
        int i6 = this._inputPtr;
        this._inputPtr = i2;
        return _parseName2(i6, i3, 39);
    }

    /* access modifiers changed from: protected */
    public final String _parseName() {
        int i2 = this._inputPtr;
        int i3 = this._hashSeed;
        int[] iArr = _icLatin1;
        while (true) {
            if (i2 >= this._inputEnd) {
                break;
            }
            char[] cArr = this._inputBuffer;
            char c = cArr[i2];
            if (c >= iArr.length || iArr[c] == 0) {
                i3 = (i3 * 33) + c;
                i2++;
            } else if (c == '\"') {
                int i4 = this._inputPtr;
                this._inputPtr = i2 + 1;
                return this._symbols.findSymbol(cArr, i4, i2 - i4, i3);
            }
        }
        int i5 = this._inputPtr;
        this._inputPtr = i2;
        return _parseName2(i5, i3, 34);
    }

    /* access modifiers changed from: protected */
    public final JsonToken _parseNegNumber() {
        int i2 = this._inputPtr;
        int i3 = i2 - 1;
        int i4 = this._inputEnd;
        if (i2 >= i4) {
            return _parseNumber2(true, i3);
        }
        int i5 = i2 + 1;
        char c = this._inputBuffer[i2];
        if (c > '9' || c < '0') {
            this._inputPtr = i5;
            return _handleInvalidNumberStart(c, true);
        } else if (c == '0') {
            return _parseNumber2(true, i3);
        } else {
            int i6 = 1;
            while (i5 < i4) {
                int i7 = i5 + 1;
                char c2 = this._inputBuffer[i5];
                if (c2 >= '0' && c2 <= '9') {
                    i6++;
                    i5 = i7;
                } else if (c2 == '.' || c2 == 'e' || c2 == 'E') {
                    this._inputPtr = i7;
                    return _parseFloat(c2, i3, i7, true, i6);
                } else {
                    int i8 = i7 - 1;
                    this._inputPtr = i8;
                    if (this._parsingContext.inRoot()) {
                        _verifyRootSpace(c2);
                    }
                    this._textBuffer.resetWithShared(this._inputBuffer, i3, i8 - i3);
                    return resetInt(true, i6);
                }
            }
            return _parseNumber2(true, i3);
        }
    }

    /* access modifiers changed from: protected */
    public final JsonToken _parsePosNumber(int i2) {
        int i3 = this._inputPtr;
        int i4 = i3 - 1;
        int i5 = this._inputEnd;
        if (i2 == 48) {
            return _parseNumber2(false, i4);
        }
        int i6 = 1;
        while (i3 < i5) {
            int i7 = i3 + 1;
            char c = this._inputBuffer[i3];
            if (c >= '0' && c <= '9') {
                i6++;
                i3 = i7;
            } else if (c == '.' || c == 'e' || c == 'E') {
                this._inputPtr = i7;
                return _parseFloat(c, i4, i7, false, i6);
            } else {
                int i8 = i7 - 1;
                this._inputPtr = i8;
                if (this._parsingContext.inRoot()) {
                    _verifyRootSpace(c);
                }
                this._textBuffer.resetWithShared(this._inputBuffer, i4, i8 - i4);
                return resetInt(false, i6);
            }
        }
        this._inputPtr = i4;
        return _parseNumber2(false, i4);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        if (r10 < 0) goto L_0x0167;
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
            char[] r9 = r0._inputBuffer
            int r10 = r0._inputPtr
            int r11 = r10 + 1
            r0._inputPtr = r11
            char r9 = r9[r10]
            r10 = 32
            if (r9 <= r10) goto L_0x0167
            int r10 = r1.decodeBase64Char((char) r9)
            r11 = 34
            if (r10 >= 0) goto L_0x003a
            if (r9 != r11) goto L_0x0032
        L_0x002f:
            r11 = 0
            goto L_0x0120
        L_0x0032:
            int r10 = r0._decodeBase64Escape((com.fasterxml.jackson.core.Base64Variant) r1, (char) r9, (int) r6)
            if (r10 >= 0) goto L_0x003a
            goto L_0x0167
        L_0x003a:
            if (r7 <= r4) goto L_0x0041
            int r8 = r8 + r7
            r2.write(r3, r6, r7)
            r7 = 0
        L_0x0041:
            int r9 = r0._inputPtr
            int r12 = r0._inputEnd
            if (r9 < r12) goto L_0x004a
            r16._loadMoreGuaranteed()
        L_0x004a:
            char[] r9 = r0._inputBuffer
            int r12 = r0._inputPtr
            int r13 = r12 + 1
            r0._inputPtr = r13
            char r9 = r9[r12]
            int r12 = r1.decodeBase64Char((char) r9)
            r13 = 1
            if (r12 >= 0) goto L_0x005f
            int r12 = r0._decodeBase64Escape((com.fasterxml.jackson.core.Base64Variant) r1, (char) r9, (int) r13)
        L_0x005f:
            int r9 = r10 << 6
            r9 = r9 | r12
            int r10 = r0._inputPtr
            int r12 = r0._inputEnd
            if (r10 < r12) goto L_0x006b
            r16._loadMoreGuaranteed()
        L_0x006b:
            char[] r10 = r0._inputBuffer
            int r12 = r0._inputPtr
            int r14 = r12 + 1
            r0._inputPtr = r14
            char r10 = r10[r12]
            int r12 = r1.decodeBase64Char((char) r10)
            r14 = 0
            r15 = 2
            r6 = -2
            if (r12 >= 0) goto L_0x00ea
            if (r12 == r6) goto L_0x009f
            if (r10 != r11) goto L_0x009a
            int r4 = r9 >> 4
            int r5 = r7 + 1
            byte r4 = (byte) r4
            r3[r7] = r4
            boolean r4 = r17.usesPadding()
            if (r4 != 0) goto L_0x0091
            r7 = r5
            goto L_0x002f
        L_0x0091:
            int r2 = r0._inputPtr
            int r2 = r2 - r13
            r0._inputPtr = r2
            r16._handleBase64MissingPadding(r17)
            throw r14
        L_0x009a:
            int r10 = r0._decodeBase64Escape((com.fasterxml.jackson.core.Base64Variant) r1, (char) r10, (int) r15)
            r12 = r10
        L_0x009f:
            if (r12 != r6) goto L_0x00ea
            int r10 = r0._inputPtr
            int r11 = r0._inputEnd
            if (r10 < r11) goto L_0x00aa
            r16._loadMoreGuaranteed()
        L_0x00aa:
            char[] r10 = r0._inputBuffer
            int r11 = r0._inputPtr
            int r12 = r11 + 1
            r0._inputPtr = r12
            char r10 = r10[r11]
            boolean r11 = r1.usesPaddingChar((char) r10)
            if (r11 != 0) goto L_0x00e0
            int r11 = r0._decodeBase64Escape((com.fasterxml.jackson.core.Base64Variant) r1, (char) r10, (int) r5)
            if (r11 != r6) goto L_0x00c1
            goto L_0x00e0
        L_0x00c1:
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
        L_0x00e0:
            int r6 = r9 >> 4
            int r9 = r7 + 1
            byte r6 = (byte) r6
            r3[r7] = r6
            r7 = r9
            goto L_0x016a
        L_0x00ea:
            int r9 = r9 << 6
            r9 = r9 | r12
            int r10 = r0._inputPtr
            int r12 = r0._inputEnd
            if (r10 < r12) goto L_0x00f6
            r16._loadMoreGuaranteed()
        L_0x00f6:
            char[] r10 = r0._inputBuffer
            int r12 = r0._inputPtr
            int r5 = r12 + 1
            r0._inputPtr = r5
            char r5 = r10[r12]
            int r10 = r1.decodeBase64Char((char) r5)
            if (r10 >= 0) goto L_0x014d
            if (r10 == r6) goto L_0x013a
            if (r5 != r11) goto L_0x0132
            int r4 = r9 >> 2
            int r5 = r7 + 1
            int r6 = r4 >> 8
            byte r6 = (byte) r6
            r3[r7] = r6
            int r7 = r5 + 1
            byte r4 = (byte) r4
            r3[r5] = r4
            boolean r4 = r17.usesPadding()
            if (r4 != 0) goto L_0x0129
            goto L_0x002f
        L_0x0120:
            r0._tokenIncomplete = r11
            if (r7 <= 0) goto L_0x0128
            int r8 = r8 + r7
            r2.write(r3, r11, r7)
        L_0x0128:
            return r8
        L_0x0129:
            int r2 = r0._inputPtr
            int r2 = r2 - r13
            r0._inputPtr = r2
            r16._handleBase64MissingPadding(r17)
            throw r14
        L_0x0132:
            r11 = 0
            r12 = 3
            int r5 = r0._decodeBase64Escape((com.fasterxml.jackson.core.Base64Variant) r1, (char) r5, (int) r12)
            r10 = r5
            goto L_0x013c
        L_0x013a:
            r11 = 0
            r12 = 3
        L_0x013c:
            if (r10 != r6) goto L_0x014f
            int r5 = r9 >> 2
            int r6 = r7 + 1
            int r9 = r5 >> 8
            byte r9 = (byte) r9
            r3[r7] = r9
            int r7 = r6 + 1
            byte r5 = (byte) r5
            r3[r6] = r5
            goto L_0x0169
        L_0x014d:
            r11 = 0
            r12 = 3
        L_0x014f:
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
            goto L_0x0169
        L_0x0167:
            r11 = 0
            r12 = 3
        L_0x0169:
            r5 = 3
        L_0x016a:
            r6 = 0
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._readBinary(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream, byte[]):int");
    }

    /* access modifiers changed from: protected */
    public void _releaseBuffers() {
        char[] cArr;
        super._releaseBuffers();
        this._symbols.release();
        if (this._bufferRecyclable && (cArr = this._inputBuffer) != null) {
            this._inputBuffer = null;
            this._ioContext.releaseTokenBuffer(cArr);
        }
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidToken(String str) {
        _reportInvalidToken(str, "'null', 'true', 'false' or NaN");
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void _skipCR() {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            if (cArr[i2] == 10) {
                this._inputPtr = i2 + 1;
            }
        }
        this._currInputRow++;
        this._currInputRowStart = this._inputPtr;
    }

    /* access modifiers changed from: protected */
    public final void _skipString() {
        this._tokenIncomplete = false;
        int i2 = this._inputPtr;
        int i3 = this._inputEnd;
        char[] cArr = this._inputBuffer;
        while (true) {
            if (i2 >= i3) {
                this._inputPtr = i2;
                if (_loadMore()) {
                    i2 = this._inputPtr;
                    i3 = this._inputEnd;
                } else {
                    _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
                    throw null;
                }
            }
            int i4 = i2 + 1;
            char c = cArr[i2];
            if (c <= '\\') {
                if (c == '\\') {
                    this._inputPtr = i4;
                    _decodeEscaped();
                    i2 = this._inputPtr;
                    i3 = this._inputEnd;
                } else if (c <= '\"') {
                    if (c == '\"') {
                        this._inputPtr = i4;
                        return;
                    } else if (c < ' ') {
                        this._inputPtr = i4;
                        _throwUnquotedSpace(c, "string value");
                    }
                }
            }
            i2 = i4;
        }
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) {
        byte[] bArr;
        if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT && (bArr = this._binaryValue) != null) {
            return bArr;
        }
        if (this._currToken == JsonToken.VALUE_STRING) {
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
        return new JsonLocation(_getSourceReference(), -1, ((long) this._inputPtr) + this._currInputProcessed, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public char getNextChar(String str) {
        return getNextChar(str, (JsonToken) null);
    }

    public final String getText() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return _getText2(jsonToken);
        }
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.contentsAsString();
    }

    public final char[] getTextCharacters() {
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

    public final int getTextLength() {
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
    public final int getTextOffset() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getTextOffset():int");
    }

    public JsonLocation getTokenLocation() {
        if (this._currToken == JsonToken.FIELD_NAME) {
            return new JsonLocation(_getSourceReference(), -1, this._currInputProcessed + (this._nameStartOffset - 1), this._nameStartRow, this._nameStartCol);
        }
        return new JsonLocation(_getSourceReference(), -1, this._tokenInputTotal - 1, this._tokenInputRow, this._tokenInputCol);
    }

    public final String getValueAsString() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsAsString();
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
        if (_skipWSOrEnd == 93 || _skipWSOrEnd == 125) {
            _closeScope(_skipWSOrEnd);
            return null;
        }
        if (this._parsingContext.expectComma()) {
            _skipWSOrEnd = _skipComma(_skipWSOrEnd);
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                _closeScope(_skipWSOrEnd);
                return null;
            }
        }
        if (!this._parsingContext.inObject()) {
            _updateLocation();
            _nextTokenNotInObject(_skipWSOrEnd);
            return null;
        }
        _updateNameLocation();
        String _parseName = _skipWSOrEnd == 34 ? _parseName() : _handleOddName(_skipWSOrEnd);
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
                    jsonToken = _handleOddValue(_skipColon);
                    break;
            }
        } else {
            jsonToken = JsonToken.START_OBJECT;
        }
        this._nextToken = jsonToken;
        return _parseName;
    }

    public final String nextTextValue() {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken == JsonToken.VALUE_STRING) {
                if (this._tokenIncomplete) {
                    this._tokenIncomplete = false;
                    _finishString();
                }
                return this._textBuffer.contentsAsString();
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
            return null;
        } else if (nextToken() == JsonToken.VALUE_STRING) {
            return getText();
        } else {
            return null;
        }
    }

    public final JsonToken nextToken() {
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
        if (_skipWSOrEnd == 93 || _skipWSOrEnd == 125) {
            _closeScope(_skipWSOrEnd);
            return this._currToken;
        }
        if (this._parsingContext.expectComma()) {
            _skipWSOrEnd = _skipComma(_skipWSOrEnd);
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                _closeScope(_skipWSOrEnd);
                return this._currToken;
            }
        }
        boolean inObject = this._parsingContext.inObject();
        if (inObject) {
            _updateNameLocation();
            this._parsingContext.setCurrentName(_skipWSOrEnd == 34 ? _parseName() : _handleOddName(_skipWSOrEnd));
            this._currToken = JsonToken.FIELD_NAME;
            _skipWSOrEnd = _skipColon();
        }
        _updateLocation();
        if (_skipWSOrEnd == 34) {
            this._tokenIncomplete = true;
            jsonToken = JsonToken.VALUE_STRING;
        } else if (_skipWSOrEnd == 45) {
            jsonToken = _parseNegNumber();
        } else if (_skipWSOrEnd == 91) {
            if (!inObject) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            }
            jsonToken = JsonToken.START_ARRAY;
        } else if (_skipWSOrEnd == 102) {
            _matchFalse();
            jsonToken = JsonToken.VALUE_FALSE;
        } else if (_skipWSOrEnd == 110) {
            _matchNull();
            jsonToken = JsonToken.VALUE_NULL;
        } else if (_skipWSOrEnd == 116) {
            _matchTrue();
            jsonToken = JsonToken.VALUE_TRUE;
        } else if (_skipWSOrEnd == 123) {
            if (!inObject) {
                this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
            jsonToken = JsonToken.START_OBJECT;
        } else if (_skipWSOrEnd != 125) {
            switch (_skipWSOrEnd) {
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
                    jsonToken = _parsePosNumber(_skipWSOrEnd);
                    break;
                default:
                    jsonToken = _handleOddValue(_skipWSOrEnd);
                    break;
            }
        } else {
            _reportUnexpectedChar(_skipWSOrEnd, "expected a value");
            throw null;
        }
        if (inObject) {
            this._nextToken = jsonToken;
            return this._currToken;
        }
        this._currToken = jsonToken;
        return jsonToken;
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
    public void _reportInvalidToken(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            char c = this._inputBuffer[this._inputPtr];
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            this._inputPtr++;
            sb.append(c);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        _reportError("Unrecognized token '%s': was expecting %s", sb, str2);
        throw null;
    }

    /* access modifiers changed from: protected */
    public char getNextChar(String str, JsonToken jsonToken) {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            return cArr[i2];
        }
        _reportInvalidEOF(str, jsonToken);
        throw null;
    }

    public final String getValueAsString(String str) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsAsString();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        } else {
            return super.getValueAsString(str);
        }
    }

    public ReaderBasedJsonParser(IOContext iOContext, int i2, Reader reader, ObjectCodec objectCodec, CharsToNameCanonicalizer charsToNameCanonicalizer) {
        super(iOContext, i2);
        this._reader = reader;
        this._inputBuffer = iOContext.allocTokenBuffer();
        this._inputPtr = 0;
        this._inputEnd = 0;
        this._objectCodec = objectCodec;
        this._symbols = charsToNameCanonicalizer;
        this._hashSeed = charsToNameCanonicalizer.hashSeed();
        this._bufferRecyclable = true;
    }
}
