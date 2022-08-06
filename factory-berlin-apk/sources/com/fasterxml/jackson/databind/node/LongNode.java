package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import java.math.BigInteger;

public class LongNode extends NumericNode {
    protected final long _value;

    public LongNode(long j2) {
        this._value = j2;
    }

    public static LongNode valueOf(long j2) {
        return new LongNode(j2);
    }

    public String asText() {
        return NumberOutput.toString(this._value);
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    public BigInteger bigIntegerValue() {
        return BigInteger.valueOf(this._value);
    }

    public BigDecimal decimalValue() {
        return BigDecimal.valueOf(this._value);
    }

    public double doubleValue() {
        return (double) this._value;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof LongNode) && ((LongNode) obj)._value == this._value) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j2 = this._value;
        return ((int) j2) ^ ((int) (j2 >> 32));
    }

    public int intValue() {
        return (int) this._value;
    }

    public long longValue() {
        return this._value;
    }

    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.LONG;
    }

    public Number numberValue() {
        return Long.valueOf(this._value);
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNumber(this._value);
    }
}
