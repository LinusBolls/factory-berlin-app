package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import java.math.BigInteger;

public class IntNode extends NumericNode {
    private static final IntNode[] CANONICALS = new IntNode[12];
    protected final int _value;

    static {
        for (int i2 = 0; i2 < 12; i2++) {
            CANONICALS[i2] = new IntNode(i2 - 1);
        }
    }

    public IntNode(int i2) {
        this._value = i2;
    }

    public static IntNode valueOf(int i2) {
        if (i2 > 10 || i2 < -1) {
            return new IntNode(i2);
        }
        return CANONICALS[i2 - -1];
    }

    public String asText() {
        return NumberOutput.toString(this._value);
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    public BigInteger bigIntegerValue() {
        return BigInteger.valueOf((long) this._value);
    }

    public BigDecimal decimalValue() {
        return BigDecimal.valueOf((long) this._value);
    }

    public double doubleValue() {
        return (double) this._value;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof IntNode) && ((IntNode) obj)._value == this._value) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this._value;
    }

    public int intValue() {
        return this._value;
    }

    public long longValue() {
        return (long) this._value;
    }

    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.INT;
    }

    public Number numberValue() {
        return Integer.valueOf(this._value);
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNumber(this._value);
    }
}
