package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public abstract class ParserBase extends ParserMinimalBase {
    protected byte[] _binaryValue;
    protected ByteArrayBuilder _byteArrayBuilder;
    protected boolean _closed;
    protected long _currInputProcessed;
    protected int _currInputRow = 1;
    protected int _currInputRowStart;
    protected int _inputEnd;
    protected int _inputPtr;
    protected int _intLength;
    protected final IOContext _ioContext;
    protected boolean _nameCopied;
    protected char[] _nameCopyBuffer;
    protected JsonToken _nextToken;
    protected int _numTypesValid = 0;
    protected BigDecimal _numberBigDecimal;
    protected BigInteger _numberBigInt;
    protected double _numberDouble;
    protected int _numberInt;
    protected long _numberLong;
    protected boolean _numberNegative;
    protected JsonReadContext _parsingContext;
    protected final TextBuffer _textBuffer;
    protected int _tokenInputCol;
    protected int _tokenInputRow = 1;
    protected long _tokenInputTotal;

    protected ParserBase(IOContext iOContext, int i2) {
        super(i2);
        this._ioContext = iOContext;
        this._textBuffer = iOContext.constructTextBuffer();
        this._parsingContext = JsonReadContext.createRootContext(JsonParser.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i2) ? DupDetector.rootDetector((JsonParser) this) : null);
    }

    private void _parseSlowFloat(int i2) {
        if (i2 == 16) {
            try {
                this._numberBigDecimal = this._textBuffer.contentsAsDecimal();
                this._numTypesValid = 16;
            } catch (NumberFormatException e2) {
                _wrapError("Malformed numeric value (" + _longNumberDesc(this._textBuffer.contentsAsString()) + ")", e2);
                throw null;
            }
        } else {
            this._numberDouble = this._textBuffer.contentsAsDouble();
            this._numTypesValid = 8;
        }
    }

    private void _parseSlowInt(int i2) {
        String contentsAsString = this._textBuffer.contentsAsString();
        try {
            int i3 = this._intLength;
            char[] textBuffer = this._textBuffer.getTextBuffer();
            int textOffset = this._textBuffer.getTextOffset();
            if (this._numberNegative) {
                textOffset++;
            }
            if (NumberInput.inLongRange(textBuffer, textOffset, i3, this._numberNegative)) {
                this._numberLong = Long.parseLong(contentsAsString);
                this._numTypesValid = 2;
            } else if (i2 == 1 || i2 == 2) {
                _reportTooLongInt(i2, contentsAsString);
                throw null;
            } else {
                if (i2 != 8) {
                    if (i2 != 32) {
                        this._numberBigInt = new BigInteger(contentsAsString);
                        this._numTypesValid = 4;
                        return;
                    }
                }
                this._numberDouble = NumberInput.parseDouble(contentsAsString);
                this._numTypesValid = 8;
            }
        } catch (NumberFormatException e2) {
            _wrapError("Malformed numeric value (" + _longNumberDesc(contentsAsString) + ")", e2);
            throw null;
        }
    }

    protected static int[] growArrayBy(int[] iArr, int i2) {
        if (iArr == null) {
            return new int[i2];
        }
        return Arrays.copyOf(iArr, iArr.length + i2);
    }

    /* access modifiers changed from: protected */
    public void _checkStdFeatureChanges(int i2, int i3) {
        int mask = JsonParser.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        if ((i3 & mask) != 0 && (i2 & mask) != 0) {
            if (this._parsingContext.getDupDetector() == null) {
                JsonReadContext jsonReadContext = this._parsingContext;
                jsonReadContext.withDupDetector(DupDetector.rootDetector((JsonParser) this));
                this._parsingContext = jsonReadContext;
                return;
            }
            JsonReadContext jsonReadContext2 = this._parsingContext;
            jsonReadContext2.withDupDetector((DupDetector) null);
            this._parsingContext = jsonReadContext2;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void _closeInput();

    /* access modifiers changed from: protected */
    public final int _decodeBase64Escape(Base64Variant base64Variant, int i2, int i3) {
        if (i2 == 92) {
            char _decodeEscaped = _decodeEscaped();
            if (_decodeEscaped <= ' ' && i3 == 0) {
                return -1;
            }
            int decodeBase64Char = base64Variant.decodeBase64Char((int) _decodeEscaped);
            if (decodeBase64Char >= 0 || decodeBase64Char == -2) {
                return decodeBase64Char;
            }
            throw reportInvalidBase64Char(base64Variant, _decodeEscaped, i3);
        }
        throw reportInvalidBase64Char(base64Variant, i2, i3);
    }

    /* access modifiers changed from: protected */
    public abstract char _decodeEscaped();

    /* access modifiers changed from: protected */
    public final int _eofAsNextChar() {
        _handleEOF();
        return -1;
    }

    public ByteArrayBuilder _getByteArrayBuilder() {
        ByteArrayBuilder byteArrayBuilder = this._byteArrayBuilder;
        if (byteArrayBuilder == null) {
            this._byteArrayBuilder = new ByteArrayBuilder();
        } else {
            byteArrayBuilder.reset();
        }
        return this._byteArrayBuilder;
    }

    /* access modifiers changed from: protected */
    public Object _getSourceReference() {
        if (JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION.enabledIn(this._features)) {
            return this._ioContext.getSourceReference();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void _handleBase64MissingPadding(Base64Variant base64Variant) {
        _reportError(base64Variant.missingPaddingMessage());
        throw null;
    }

    /* access modifiers changed from: protected */
    public void _handleEOF() {
        if (!this._parsingContext.inRoot()) {
            _reportInvalidEOF(String.format(": expected close marker for %s (start marker at %s)", new Object[]{this._parsingContext.inArray() ? "Array" : "Object", this._parsingContext.getStartLocation(_getSourceReference())}), (JsonToken) null);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public int _parseIntValue() {
        if (this._currToken != JsonToken.VALUE_NUMBER_INT || this._intLength > 9) {
            _parseNumericValue(1);
            if ((this._numTypesValid & 1) == 0) {
                convertNumberToInt();
            }
            return this._numberInt;
        }
        int contentsAsInt = this._textBuffer.contentsAsInt(this._numberNegative);
        this._numberInt = contentsAsInt;
        this._numTypesValid = 1;
        return contentsAsInt;
    }

    /* access modifiers changed from: protected */
    public void _parseNumericValue(int i2) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
            int i3 = this._intLength;
            if (i3 <= 9) {
                this._numberInt = this._textBuffer.contentsAsInt(this._numberNegative);
                this._numTypesValid = 1;
            } else if (i3 <= 18) {
                long contentsAsLong = this._textBuffer.contentsAsLong(this._numberNegative);
                if (i3 == 10) {
                    if (this._numberNegative) {
                        if (contentsAsLong >= -2147483648L) {
                            this._numberInt = (int) contentsAsLong;
                            this._numTypesValid = 1;
                            return;
                        }
                    } else if (contentsAsLong <= 2147483647L) {
                        this._numberInt = (int) contentsAsLong;
                        this._numTypesValid = 1;
                        return;
                    }
                }
                this._numberLong = contentsAsLong;
                this._numTypesValid = 2;
            } else {
                _parseSlowInt(i2);
            }
        } else if (jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            _parseSlowFloat(i2);
        } else {
            _reportError("Current token (%s) not numeric, can not use numeric value accessors", jsonToken);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void _releaseBuffers() {
        this._textBuffer.releaseBuffers();
        char[] cArr = this._nameCopyBuffer;
        if (cArr != null) {
            this._nameCopyBuffer = null;
            this._ioContext.releaseNameCopyBuffer(cArr);
        }
    }

    /* access modifiers changed from: protected */
    public void _reportMismatchedEndMarker(int i2, char c) {
        JsonReadContext parsingContext = getParsingContext();
        _reportError(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", new Object[]{Character.valueOf((char) i2), Character.valueOf(c), parsingContext.typeDesc(), parsingContext.getStartLocation(_getSourceReference())}));
        throw null;
    }

    /* access modifiers changed from: protected */
    public void _reportTooLongInt(int i2, String str) {
        _reportError("Numeric value (%s) out of range of %s", _longIntegerDesc(str), i2 == 2 ? "long" : "int");
        throw null;
    }

    public void close() {
        if (!this._closed) {
            this._inputPtr = Math.max(this._inputPtr, this._inputEnd);
            this._closed = true;
            try {
                _closeInput();
            } finally {
                _releaseBuffers();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void convertNumberToBigDecimal() {
        int i2 = this._numTypesValid;
        if ((i2 & 8) != 0) {
            this._numberBigDecimal = NumberInput.parseBigDecimal(getText());
        } else if ((i2 & 4) != 0) {
            this._numberBigDecimal = new BigDecimal(this._numberBigInt);
        } else if ((i2 & 2) != 0) {
            this._numberBigDecimal = BigDecimal.valueOf(this._numberLong);
        } else if ((i2 & 1) != 0) {
            this._numberBigDecimal = BigDecimal.valueOf((long) this._numberInt);
        } else {
            _throwInternal();
            throw null;
        }
        this._numTypesValid |= 16;
    }

    /* access modifiers changed from: protected */
    public void convertNumberToBigInteger() {
        int i2 = this._numTypesValid;
        if ((i2 & 16) != 0) {
            this._numberBigInt = this._numberBigDecimal.toBigInteger();
        } else if ((i2 & 2) != 0) {
            this._numberBigInt = BigInteger.valueOf(this._numberLong);
        } else if ((i2 & 1) != 0) {
            this._numberBigInt = BigInteger.valueOf((long) this._numberInt);
        } else if ((i2 & 8) != 0) {
            this._numberBigInt = BigDecimal.valueOf(this._numberDouble).toBigInteger();
        } else {
            _throwInternal();
            throw null;
        }
        this._numTypesValid |= 4;
    }

    /* access modifiers changed from: protected */
    public void convertNumberToDouble() {
        int i2 = this._numTypesValid;
        if ((i2 & 16) != 0) {
            this._numberDouble = this._numberBigDecimal.doubleValue();
        } else if ((i2 & 4) != 0) {
            this._numberDouble = this._numberBigInt.doubleValue();
        } else if ((i2 & 2) != 0) {
            this._numberDouble = (double) this._numberLong;
        } else if ((i2 & 1) != 0) {
            this._numberDouble = (double) this._numberInt;
        } else {
            _throwInternal();
            throw null;
        }
        this._numTypesValid |= 8;
    }

    /* access modifiers changed from: protected */
    public void convertNumberToInt() {
        int i2 = this._numTypesValid;
        if ((i2 & 2) != 0) {
            long j2 = this._numberLong;
            int i3 = (int) j2;
            if (((long) i3) == j2) {
                this._numberInt = i3;
            } else {
                _reportError("Numeric value (" + getText() + ") out of range of int");
                throw null;
            }
        } else if ((i2 & 4) != 0) {
            if (ParserMinimalBase.BI_MIN_INT.compareTo(this._numberBigInt) > 0 || ParserMinimalBase.BI_MAX_INT.compareTo(this._numberBigInt) < 0) {
                reportOverflowInt();
                throw null;
            }
            this._numberInt = this._numberBigInt.intValue();
        } else if ((i2 & 8) != 0) {
            double d2 = this._numberDouble;
            if (d2 < -2.147483648E9d || d2 > 2.147483647E9d) {
                reportOverflowInt();
                throw null;
            }
            this._numberInt = (int) d2;
        } else if ((i2 & 16) == 0) {
            _throwInternal();
            throw null;
        } else if (ParserMinimalBase.BD_MIN_INT.compareTo(this._numberBigDecimal) > 0 || ParserMinimalBase.BD_MAX_INT.compareTo(this._numberBigDecimal) < 0) {
            reportOverflowInt();
            throw null;
        } else {
            this._numberInt = this._numberBigDecimal.intValue();
        }
        this._numTypesValid |= 1;
    }

    /* access modifiers changed from: protected */
    public void convertNumberToLong() {
        int i2 = this._numTypesValid;
        if ((i2 & 1) != 0) {
            this._numberLong = (long) this._numberInt;
        } else if ((i2 & 4) != 0) {
            if (ParserMinimalBase.BI_MIN_LONG.compareTo(this._numberBigInt) > 0 || ParserMinimalBase.BI_MAX_LONG.compareTo(this._numberBigInt) < 0) {
                reportOverflowLong();
                throw null;
            }
            this._numberLong = this._numberBigInt.longValue();
        } else if ((i2 & 8) != 0) {
            double d2 = this._numberDouble;
            if (d2 < -9.223372036854776E18d || d2 > 9.223372036854776E18d) {
                reportOverflowLong();
                throw null;
            }
            this._numberLong = (long) d2;
        } else if ((i2 & 16) == 0) {
            _throwInternal();
            throw null;
        } else if (ParserMinimalBase.BD_MIN_LONG.compareTo(this._numberBigDecimal) > 0 || ParserMinimalBase.BD_MAX_LONG.compareTo(this._numberBigDecimal) < 0) {
            reportOverflowLong();
            throw null;
        } else {
            this._numberLong = this._numberBigDecimal.longValue();
        }
        this._numTypesValid |= 2;
    }

    public BigInteger getBigIntegerValue() {
        int i2 = this._numTypesValid;
        if ((i2 & 4) == 0) {
            if (i2 == 0) {
                _parseNumericValue(4);
            }
            if ((this._numTypesValid & 4) == 0) {
                convertNumberToBigInteger();
            }
        }
        return this._numberBigInt;
    }

    public String getCurrentName() {
        JsonReadContext parent;
        JsonToken jsonToken = this._currToken;
        if ((jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) && (parent = this._parsingContext.getParent()) != null) {
            return parent.getCurrentName();
        }
        return this._parsingContext.getCurrentName();
    }

    public BigDecimal getDecimalValue() {
        int i2 = this._numTypesValid;
        if ((i2 & 16) == 0) {
            if (i2 == 0) {
                _parseNumericValue(16);
            }
            if ((this._numTypesValid & 16) == 0) {
                convertNumberToBigDecimal();
            }
        }
        return this._numberBigDecimal;
    }

    public double getDoubleValue() {
        int i2 = this._numTypesValid;
        if ((i2 & 8) == 0) {
            if (i2 == 0) {
                _parseNumericValue(8);
            }
            if ((this._numTypesValid & 8) == 0) {
                convertNumberToDouble();
            }
        }
        return this._numberDouble;
    }

    public float getFloatValue() {
        return (float) getDoubleValue();
    }

    public int getIntValue() {
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

    public long getLongValue() {
        int i2 = this._numTypesValid;
        if ((i2 & 2) == 0) {
            if (i2 == 0) {
                _parseNumericValue(2);
            }
            if ((this._numTypesValid & 2) == 0) {
                convertNumberToLong();
            }
        }
        return this._numberLong;
    }

    public JsonParser.NumberType getNumberType() {
        if (this._numTypesValid == 0) {
            _parseNumericValue(0);
        }
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            int i2 = this._numTypesValid;
            if ((i2 & 1) != 0) {
                return JsonParser.NumberType.INT;
            }
            if ((i2 & 2) != 0) {
                return JsonParser.NumberType.LONG;
            }
            return JsonParser.NumberType.BIG_INTEGER;
        } else if ((this._numTypesValid & 16) != 0) {
            return JsonParser.NumberType.BIG_DECIMAL;
        } else {
            return JsonParser.NumberType.DOUBLE;
        }
    }

    public Number getNumberValue() {
        if (this._numTypesValid == 0) {
            _parseNumericValue(0);
        }
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            int i2 = this._numTypesValid;
            if ((i2 & 1) != 0) {
                return Integer.valueOf(this._numberInt);
            }
            if ((i2 & 2) != 0) {
                return Long.valueOf(this._numberLong);
            }
            if ((i2 & 4) != 0) {
                return this._numberBigInt;
            }
            return this._numberBigDecimal;
        }
        int i3 = this._numTypesValid;
        if ((i3 & 16) != 0) {
            return this._numberBigDecimal;
        }
        if ((i3 & 8) != 0) {
            return Double.valueOf(this._numberDouble);
        }
        _throwInternal();
        throw null;
    }

    public boolean hasTextCharacters() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return true;
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this._nameCopied;
        }
        return false;
    }

    public boolean isNaN() {
        if (this._currToken != JsonToken.VALUE_NUMBER_FLOAT || (this._numTypesValid & 8) == 0) {
            return false;
        }
        double d2 = this._numberDouble;
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            return true;
        }
        return false;
    }

    public JsonParser overrideStdFeatures(int i2, int i3) {
        int i4 = this._features;
        int i5 = (i2 & i3) | ((~i3) & i4);
        int i6 = i4 ^ i5;
        if (i6 != 0) {
            this._features = i5;
            _checkStdFeatureChanges(i5, i6);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public IllegalArgumentException reportInvalidBase64Char(Base64Variant base64Variant, int i2, int i3) {
        return reportInvalidBase64Char(base64Variant, i2, i3, (String) null);
    }

    /* access modifiers changed from: protected */
    public final JsonToken reset(boolean z, int i2, int i3, int i4) {
        if (i3 >= 1 || i4 >= 1) {
            return resetFloat(z, i2, i3, i4);
        }
        return resetInt(z, i2);
    }

    /* access modifiers changed from: protected */
    public final JsonToken resetAsNaN(String str, double d2) {
        this._textBuffer.resetWithString(str);
        this._numberDouble = d2;
        this._numTypesValid = 8;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    /* access modifiers changed from: protected */
    public final JsonToken resetFloat(boolean z, int i2, int i3, int i4) {
        this._numberNegative = z;
        this._intLength = i2;
        this._numTypesValid = 0;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    /* access modifiers changed from: protected */
    public final JsonToken resetInt(boolean z, int i2) {
        this._numberNegative = z;
        this._intLength = i2;
        this._numTypesValid = 0;
        return JsonToken.VALUE_NUMBER_INT;
    }

    public void setCurrentValue(Object obj) {
        this._parsingContext.setCurrentValue(obj);
    }

    @Deprecated
    public JsonParser setFeatureMask(int i2) {
        int i3 = this._features ^ i2;
        if (i3 != 0) {
            this._features = i2;
            _checkStdFeatureChanges(i2, i3);
        }
        return this;
    }

    public JsonReadContext getParsingContext() {
        return this._parsingContext;
    }

    /* access modifiers changed from: protected */
    public IllegalArgumentException reportInvalidBase64Char(Base64Variant base64Variant, int i2, int i3, String str) {
        String str2;
        if (i2 <= 32) {
            str2 = String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", new Object[]{Integer.toHexString(i2), Integer.valueOf(i3 + 1)});
        } else if (base64Variant.usesPaddingChar(i2)) {
            str2 = "Unexpected padding character ('" + base64Variant.getPaddingChar() + "') as character #" + (i3 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(i2) || Character.isISOControl(i2)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(i2) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + ((char) i2) + "' (code 0x" + Integer.toHexString(i2) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        return new IllegalArgumentException(str2);
    }

    /* access modifiers changed from: protected */
    public final int _decodeBase64Escape(Base64Variant base64Variant, char c, int i2) {
        if (c == '\\') {
            char _decodeEscaped = _decodeEscaped();
            if (_decodeEscaped <= ' ' && i2 == 0) {
                return -1;
            }
            int decodeBase64Char = base64Variant.decodeBase64Char(_decodeEscaped);
            if (decodeBase64Char >= 0 || (decodeBase64Char == -2 && i2 >= 2)) {
                return decodeBase64Char;
            }
            throw reportInvalidBase64Char(base64Variant, _decodeEscaped, i2);
        }
        throw reportInvalidBase64Char(base64Variant, c, i2);
    }
}
