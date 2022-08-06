package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class JsonParserDelegate extends JsonParser {
    protected JsonParser delegate;

    public JsonParserDelegate(JsonParser jsonParser) {
        this.delegate = jsonParser;
    }

    public boolean canReadObjectId() {
        return this.delegate.canReadObjectId();
    }

    public boolean canReadTypeId() {
        return this.delegate.canReadTypeId();
    }

    public void clearCurrentToken() {
        this.delegate.clearCurrentToken();
    }

    public JsonToken currentToken() {
        return this.delegate.currentToken();
    }

    public BigInteger getBigIntegerValue() {
        return this.delegate.getBigIntegerValue();
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) {
        return this.delegate.getBinaryValue(base64Variant);
    }

    public byte getByteValue() {
        return this.delegate.getByteValue();
    }

    public ObjectCodec getCodec() {
        return this.delegate.getCodec();
    }

    public JsonLocation getCurrentLocation() {
        return this.delegate.getCurrentLocation();
    }

    public String getCurrentName() {
        return this.delegate.getCurrentName();
    }

    public JsonToken getCurrentToken() {
        return this.delegate.getCurrentToken();
    }

    public int getCurrentTokenId() {
        return this.delegate.getCurrentTokenId();
    }

    public BigDecimal getDecimalValue() {
        return this.delegate.getDecimalValue();
    }

    public double getDoubleValue() {
        return this.delegate.getDoubleValue();
    }

    public Object getEmbeddedObject() {
        return this.delegate.getEmbeddedObject();
    }

    public float getFloatValue() {
        return this.delegate.getFloatValue();
    }

    public int getIntValue() {
        return this.delegate.getIntValue();
    }

    public long getLongValue() {
        return this.delegate.getLongValue();
    }

    public JsonParser.NumberType getNumberType() {
        return this.delegate.getNumberType();
    }

    public Number getNumberValue() {
        return this.delegate.getNumberValue();
    }

    public Object getObjectId() {
        return this.delegate.getObjectId();
    }

    public JsonStreamContext getParsingContext() {
        return this.delegate.getParsingContext();
    }

    public short getShortValue() {
        return this.delegate.getShortValue();
    }

    public String getText() {
        return this.delegate.getText();
    }

    public char[] getTextCharacters() {
        return this.delegate.getTextCharacters();
    }

    public int getTextLength() {
        return this.delegate.getTextLength();
    }

    public int getTextOffset() {
        return this.delegate.getTextOffset();
    }

    public JsonLocation getTokenLocation() {
        return this.delegate.getTokenLocation();
    }

    public Object getTypeId() {
        return this.delegate.getTypeId();
    }

    public int getValueAsInt() {
        return this.delegate.getValueAsInt();
    }

    public long getValueAsLong() {
        return this.delegate.getValueAsLong();
    }

    public String getValueAsString() {
        return this.delegate.getValueAsString();
    }

    public boolean hasCurrentToken() {
        return this.delegate.hasCurrentToken();
    }

    public boolean hasTextCharacters() {
        return this.delegate.hasTextCharacters();
    }

    public boolean hasToken(JsonToken jsonToken) {
        return this.delegate.hasToken(jsonToken);
    }

    public boolean hasTokenId(int i2) {
        return this.delegate.hasTokenId(i2);
    }

    public boolean isEnabled(JsonParser.Feature feature) {
        return this.delegate.isEnabled(feature);
    }

    public boolean isExpectedStartArrayToken() {
        return this.delegate.isExpectedStartArrayToken();
    }

    public boolean isExpectedStartObjectToken() {
        return this.delegate.isExpectedStartObjectToken();
    }

    public boolean isNaN() {
        return this.delegate.isNaN();
    }

    public JsonToken nextValue() {
        return this.delegate.nextValue();
    }

    public JsonParser overrideFormatFeatures(int i2, int i3) {
        this.delegate.overrideFormatFeatures(i2, i3);
        return this;
    }

    public JsonParser overrideStdFeatures(int i2, int i3) {
        this.delegate.overrideStdFeatures(i2, i3);
        return this;
    }

    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) {
        return this.delegate.readBinaryValue(base64Variant, outputStream);
    }

    public boolean requiresCustomCodec() {
        return this.delegate.requiresCustomCodec();
    }

    public void setCurrentValue(Object obj) {
        this.delegate.setCurrentValue(obj);
    }

    @Deprecated
    public JsonParser setFeatureMask(int i2) {
        this.delegate.setFeatureMask(i2);
        return this;
    }

    public void setSchema(FormatSchema formatSchema) {
        this.delegate.setSchema(formatSchema);
    }

    public int getValueAsInt(int i2) {
        return this.delegate.getValueAsInt(i2);
    }

    public long getValueAsLong(long j2) {
        return this.delegate.getValueAsLong(j2);
    }

    public String getValueAsString(String str) {
        return this.delegate.getValueAsString(str);
    }
}
