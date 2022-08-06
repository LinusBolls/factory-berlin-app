package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.RequestPayload;
import java.io.Closeable;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class JsonParser implements Closeable {
    protected int _features;
    protected transient RequestPayload _requestPayload;

    public enum Feature {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        ALLOW_MISSING_VALUES(false),
        ALLOW_TRAILING_COMMA(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        INCLUDE_SOURCE_IN_LOCATION(true);
        
        private final boolean _defaultState;
        private final int _mask;

        private Feature(boolean z) {
            this._mask = 1 << ordinal();
            this._defaultState = z;
        }

        public static int collectDefaults() {
            int i2 = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    i2 |= feature.getMask();
                }
            }
            return i2;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i2) {
            return (i2 & this._mask) != 0;
        }

        public int getMask() {
            return this._mask;
        }
    }

    public enum NumberType {
        INT,
        LONG,
        BIG_INTEGER,
        FLOAT,
        DOUBLE,
        BIG_DECIMAL
    }

    protected JsonParser() {
    }

    /* access modifiers changed from: protected */
    public JsonParseException _constructError(String str) {
        JsonParseException jsonParseException = new JsonParseException(this, str);
        jsonParseException.withRequestPayload(this._requestPayload);
        return jsonParseException;
    }

    /* access modifiers changed from: protected */
    public void _reportUnsupportedOperation() {
        throw new UnsupportedOperationException("Operation not supported by parser of type " + getClass().getName());
    }

    public boolean canReadObjectId() {
        return false;
    }

    public boolean canReadTypeId() {
        return false;
    }

    public abstract void clearCurrentToken();

    public abstract void close();

    public JsonToken currentToken() {
        return getCurrentToken();
    }

    public abstract BigInteger getBigIntegerValue();

    public byte[] getBinaryValue() {
        return getBinaryValue(Base64Variants.getDefaultVariant());
    }

    public abstract byte[] getBinaryValue(Base64Variant base64Variant);

    public byte getByteValue() {
        int intValue = getIntValue();
        if (intValue >= -128 && intValue <= 255) {
            return (byte) intValue;
        }
        throw _constructError("Numeric value (" + getText() + ") out of range of Java byte");
    }

    public abstract ObjectCodec getCodec();

    public abstract JsonLocation getCurrentLocation();

    public abstract String getCurrentName();

    public abstract JsonToken getCurrentToken();

    public abstract int getCurrentTokenId();

    public abstract BigDecimal getDecimalValue();

    public abstract double getDoubleValue();

    public Object getEmbeddedObject() {
        return null;
    }

    public abstract float getFloatValue();

    public abstract int getIntValue();

    public abstract long getLongValue();

    public abstract NumberType getNumberType();

    public abstract Number getNumberValue();

    public Object getObjectId() {
        return null;
    }

    public abstract JsonStreamContext getParsingContext();

    public short getShortValue() {
        int intValue = getIntValue();
        if (intValue >= -32768 && intValue <= 32767) {
            return (short) intValue;
        }
        throw _constructError("Numeric value (" + getText() + ") out of range of Java short");
    }

    public abstract String getText();

    public abstract char[] getTextCharacters();

    public abstract int getTextLength();

    public abstract int getTextOffset();

    public abstract JsonLocation getTokenLocation();

    public Object getTypeId() {
        return null;
    }

    public int getValueAsInt() {
        return getValueAsInt(0);
    }

    public int getValueAsInt(int i2) {
        return i2;
    }

    public long getValueAsLong() {
        return getValueAsLong(0);
    }

    public long getValueAsLong(long j2) {
        return j2;
    }

    public String getValueAsString() {
        return getValueAsString((String) null);
    }

    public abstract String getValueAsString(String str);

    public abstract boolean hasCurrentToken();

    public abstract boolean hasTextCharacters();

    public abstract boolean hasToken(JsonToken jsonToken);

    public abstract boolean hasTokenId(int i2);

    public boolean isEnabled(Feature feature) {
        return feature.enabledIn(this._features);
    }

    public boolean isExpectedStartArrayToken() {
        return currentToken() == JsonToken.START_ARRAY;
    }

    public boolean isExpectedStartObjectToken() {
        return currentToken() == JsonToken.START_OBJECT;
    }

    public boolean isNaN() {
        return false;
    }

    public String nextFieldName() {
        if (nextToken() == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return null;
    }

    public String nextTextValue() {
        if (nextToken() == JsonToken.VALUE_STRING) {
            return getText();
        }
        return null;
    }

    public abstract JsonToken nextToken();

    public abstract JsonToken nextValue();

    public JsonParser overrideFormatFeatures(int i2, int i3) {
        throw new IllegalArgumentException("No FormatFeatures defined for parser of type " + getClass().getName());
    }

    public JsonParser overrideStdFeatures(int i2, int i3) {
        return setFeatureMask((i2 & i3) | (this._features & (~i3)));
    }

    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) {
        _reportUnsupportedOperation();
        throw null;
    }

    public boolean requiresCustomCodec() {
        return false;
    }

    public void setCurrentValue(Object obj) {
        JsonStreamContext parsingContext = getParsingContext();
        if (parsingContext != null) {
            parsingContext.setCurrentValue(obj);
        }
    }

    @Deprecated
    public JsonParser setFeatureMask(int i2) {
        this._features = i2;
        return this;
    }

    public void setSchema(FormatSchema formatSchema) {
        throw new UnsupportedOperationException("Parser of type " + getClass().getName() + " does not support schema of type '" + formatSchema.getSchemaType() + "'");
    }

    public abstract JsonParser skipChildren();

    protected JsonParser(int i2) {
        this._features = i2;
    }
}
