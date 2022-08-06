package com.fasterxml.jackson.core.base;

import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class ParserMinimalBase extends JsonParser {
    protected static final BigDecimal BD_MAX_INT = new BigDecimal(BI_MAX_INT);
    protected static final BigDecimal BD_MAX_LONG = new BigDecimal(BI_MAX_LONG);
    protected static final BigDecimal BD_MIN_INT = new BigDecimal(BI_MIN_INT);
    protected static final BigDecimal BD_MIN_LONG = new BigDecimal(BI_MIN_LONG);
    protected static final BigInteger BI_MAX_INT = BigInteger.valueOf(2147483647L);
    protected static final BigInteger BI_MAX_LONG = BigInteger.valueOf(Long.MAX_VALUE);
    protected static final BigInteger BI_MIN_INT = BigInteger.valueOf(-2147483648L);
    protected static final BigInteger BI_MIN_LONG = BigInteger.valueOf(Long.MIN_VALUE);
    protected static final byte[] NO_BYTES = new byte[0];
    protected JsonToken _currToken;

    protected ParserMinimalBase(int i2) {
        super(i2);
    }

    protected static final String _getCharDesc(int i2) {
        char c = (char) i2;
        if (Character.isISOControl(c)) {
            return "(CTRL-CHAR, code " + i2 + ")";
        } else if (i2 > 255) {
            return "'" + c + "' (code " + i2 + " / 0x" + Integer.toHexString(i2) + ")";
        } else {
            return "'" + c + "' (code " + i2 + ")";
        }
    }

    /* access modifiers changed from: protected */
    public final JsonParseException _constructError(String str, Throwable th) {
        return new JsonParseException(this, str, th);
    }

    /* access modifiers changed from: protected */
    public void _decodeBase64(String str, ByteArrayBuilder byteArrayBuilder, Base64Variant base64Variant) {
        try {
            base64Variant.decode(str, byteArrayBuilder);
        } catch (IllegalArgumentException e2) {
            _reportError(e2.getMessage());
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void _handleEOF();

    /* access modifiers changed from: protected */
    public char _handleUnrecognizedCharacterEscape(char c) {
        if (isEnabled(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)) {
            return c;
        }
        if (c == '\'' && isEnabled(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
            return c;
        }
        _reportError("Unrecognized character escape " + _getCharDesc(c));
        throw null;
    }

    /* access modifiers changed from: protected */
    public boolean _hasTextualNull(String str) {
        return "null".equals(str);
    }

    /* access modifiers changed from: protected */
    public String _longIntegerDesc(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", new Object[]{Integer.valueOf(length)});
    }

    /* access modifiers changed from: protected */
    public String _longNumberDesc(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", new Object[]{Integer.valueOf(length)});
    }

    /* access modifiers changed from: protected */
    public final void _reportError(String str) {
        throw _constructError(str);
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidEOF() {
        _reportInvalidEOF(" in " + this._currToken, this._currToken);
        throw null;
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidEOFInValue(JsonToken jsonToken) {
        _reportInvalidEOF(jsonToken != JsonToken.VALUE_STRING ? (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value" : " in a String value", jsonToken);
        throw null;
    }

    /* access modifiers changed from: protected */
    public void _reportMissingRootWS(int i2) {
        _reportUnexpectedChar(i2, "Expected space separating root-level values");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void _reportUnexpectedChar(int i2, String str) {
        if (i2 >= 0) {
            String format = String.format("Unexpected character (%s)", new Object[]{_getCharDesc(i2)});
            if (str != null) {
                format = format + ": " + str;
            }
            _reportError(format);
            throw null;
        }
        _reportInvalidEOF();
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void _throwInternal() {
        VersionUtil.throwInternal();
        throw null;
    }

    /* access modifiers changed from: protected */
    public void _throwInvalidSpace(int i2) {
        _reportError("Illegal character (" + _getCharDesc((char) i2) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void _throwUnquotedSpace(int i2, String str) {
        if (!isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS) || i2 > 32) {
            _reportError("Illegal unquoted character (" + _getCharDesc((char) i2) + "): has to be escaped using backslash to be included in " + str);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public final void _wrapError(String str, Throwable th) {
        throw _constructError(str, th);
    }

    public void clearCurrentToken() {
        if (this._currToken != null) {
            this._currToken = null;
        }
    }

    public JsonToken currentToken() {
        return this._currToken;
    }

    public JsonToken getCurrentToken() {
        return this._currToken;
    }

    public int getCurrentTokenId() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.id();
    }

    public int getValueAsInt() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getIntValue();
        }
        return getValueAsInt(0);
    }

    public long getValueAsLong() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getLongValue();
        }
        return getValueAsLong(0);
    }

    public String getValueAsString() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return getText();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return getValueAsString((String) null);
    }

    public boolean hasCurrentToken() {
        return this._currToken != null;
    }

    public boolean hasToken(JsonToken jsonToken) {
        return this._currToken == jsonToken;
    }

    public boolean hasTokenId(int i2) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return i2 == 0;
        }
        if (jsonToken.id() == i2) {
            return true;
        }
        return false;
    }

    public boolean isExpectedStartArrayToken() {
        return this._currToken == JsonToken.START_ARRAY;
    }

    public boolean isExpectedStartObjectToken() {
        return this._currToken == JsonToken.START_OBJECT;
    }

    public JsonToken nextValue() {
        JsonToken nextToken = nextToken();
        return nextToken == JsonToken.FIELD_NAME ? nextToken() : nextToken;
    }

    /* access modifiers changed from: protected */
    public void reportInvalidNumber(String str) {
        _reportError("Invalid numeric value: " + str);
        throw null;
    }

    /* access modifiers changed from: protected */
    public void reportOverflowInt() {
        _reportError(String.format("Numeric value (%s) out of range of int (%d - %s)", new Object[]{_longIntegerDesc(getText()), Integer.valueOf(RecyclerView.UNDEFINED_DURATION), Integer.MAX_VALUE}));
        throw null;
    }

    /* access modifiers changed from: protected */
    public void reportOverflowLong() {
        _reportError(String.format("Numeric value (%s) out of range of long (%d - %s)", new Object[]{_longIntegerDesc(getText()), Long.MIN_VALUE, Long.MAX_VALUE}));
        throw null;
    }

    /* access modifiers changed from: protected */
    public void reportUnexpectedNumberChar(int i2, String str) {
        String format = String.format("Unexpected character (%s) in numeric value", new Object[]{_getCharDesc(i2)});
        if (str != null) {
            format = format + ": " + str;
        }
        _reportError(format);
        throw null;
    }

    public JsonParser skipChildren() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return this;
        }
        int i2 = 1;
        while (true) {
            JsonToken nextToken = nextToken();
            if (nextToken == null) {
                _handleEOF();
                return this;
            } else if (nextToken.isStructStart()) {
                i2++;
            } else if (nextToken.isStructEnd()) {
                i2--;
                if (i2 == 0) {
                    return this;
                }
            } else if (nextToken == JsonToken.NOT_AVAILABLE) {
                _reportError("Not enough content available for `skipChildren()`: non-blocking parser? (%s)", getClass().getName());
                throw null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void _reportError(String str, Object obj) {
        throw _constructError(String.format(str, new Object[]{obj}));
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidEOF(String str, JsonToken jsonToken) {
        throw new JsonEOFException(this, jsonToken, "Unexpected end-of-input" + str);
    }

    /* access modifiers changed from: protected */
    public final void _reportError(String str, Object obj, Object obj2) {
        throw _constructError(String.format(str, new Object[]{obj, obj2}));
    }

    public int getValueAsInt(int i2) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getIntValue();
        }
        if (jsonToken == null) {
            return i2;
        }
        int id = jsonToken.id();
        if (id != 6) {
            switch (id) {
                case 9:
                    return 1;
                case 10:
                case 11:
                    return 0;
                case 12:
                    Object embeddedObject = getEmbeddedObject();
                    if (embeddedObject instanceof Number) {
                        return ((Number) embeddedObject).intValue();
                    }
                    return i2;
                default:
                    return i2;
            }
        } else {
            String text = getText();
            if (_hasTextualNull(text)) {
                return 0;
            }
            return NumberInput.parseAsInt(text, i2);
        }
    }

    public long getValueAsLong(long j2) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getLongValue();
        }
        if (jsonToken == null) {
            return j2;
        }
        int id = jsonToken.id();
        if (id != 6) {
            switch (id) {
                case 9:
                    return 1;
                case 10:
                case 11:
                    return 0;
                case 12:
                    Object embeddedObject = getEmbeddedObject();
                    if (embeddedObject instanceof Number) {
                        return ((Number) embeddedObject).longValue();
                    }
                    return j2;
                default:
                    return j2;
            }
        } else {
            String text = getText();
            if (_hasTextualNull(text)) {
                return 0;
            }
            return NumberInput.parseAsLong(text, j2);
        }
    }

    public String getValueAsString(String str) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return getText();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return (jsonToken == null || jsonToken == JsonToken.VALUE_NULL || !jsonToken.isScalarValue()) ? str : getText();
    }
}
