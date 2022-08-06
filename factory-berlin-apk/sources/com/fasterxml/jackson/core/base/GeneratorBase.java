package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import java.math.BigDecimal;

public abstract class GeneratorBase extends JsonGenerator {
    protected static final int DERIVED_FEATURES_MASK = ((JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask() | JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask()) | JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask());
    protected boolean _cfgNumbersAsStrings;
    protected int _features;
    protected ObjectCodec _objectCodec;
    protected JsonWriteContext _writeContext;

    protected GeneratorBase(int i2, ObjectCodec objectCodec) {
        this._features = i2;
        this._objectCodec = objectCodec;
        this._writeContext = JsonWriteContext.createRootContext(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i2) ? DupDetector.rootDetector((JsonGenerator) this) : null);
        this._cfgNumbersAsStrings = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i2);
    }

    /* access modifiers changed from: protected */
    public String _asString(BigDecimal bigDecimal) {
        if (!JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this._features)) {
            return bigDecimal.toString();
        }
        int scale = bigDecimal.scale();
        if (scale >= -9999 && scale <= 9999) {
            return bigDecimal.toPlainString();
        }
        _reportError(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", new Object[]{Integer.valueOf(scale), 9999, 9999}));
        throw null;
    }

    /* access modifiers changed from: protected */
    public void _checkStdFeatureChanges(int i2, int i3) {
        if ((DERIVED_FEATURES_MASK & i3) != 0) {
            this._cfgNumbersAsStrings = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i2);
            if (JsonGenerator.Feature.ESCAPE_NON_ASCII.enabledIn(i3)) {
                if (JsonGenerator.Feature.ESCAPE_NON_ASCII.enabledIn(i2)) {
                    setHighestNonEscapedChar(127);
                } else {
                    setHighestNonEscapedChar(0);
                }
            }
            if (!JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i3)) {
                return;
            }
            if (!JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i2)) {
                JsonWriteContext jsonWriteContext = this._writeContext;
                jsonWriteContext.withDupDetector((DupDetector) null);
                this._writeContext = jsonWriteContext;
            } else if (this._writeContext.getDupDetector() == null) {
                JsonWriteContext jsonWriteContext2 = this._writeContext;
                jsonWriteContext2.withDupDetector(DupDetector.rootDetector((JsonGenerator) this));
                this._writeContext = jsonWriteContext2;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int _decodeSurrogate(int i2, int i3) {
        if (i3 >= 56320 && i3 <= 57343) {
            return ((i2 - 55296) << 10) + 65536 + (i3 - 56320);
        }
        _reportError("Incomplete surrogate pair: first char 0x" + Integer.toHexString(i2) + ", second 0x" + Integer.toHexString(i3));
        throw null;
    }

    /* access modifiers changed from: protected */
    public abstract void _verifyValueWrite(String str);

    public void close() {
    }

    public JsonGenerator disable(JsonGenerator.Feature feature) {
        int mask = feature.getMask();
        this._features &= ~mask;
        if ((mask & DERIVED_FEATURES_MASK) != 0) {
            if (feature == JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS) {
                this._cfgNumbersAsStrings = false;
            } else if (feature == JsonGenerator.Feature.ESCAPE_NON_ASCII) {
                setHighestNonEscapedChar(0);
            } else if (feature == JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION) {
                JsonWriteContext jsonWriteContext = this._writeContext;
                jsonWriteContext.withDupDetector((DupDetector) null);
                this._writeContext = jsonWriteContext;
            }
        }
        return this;
    }

    public int getFeatureMask() {
        return this._features;
    }

    public JsonStreamContext getOutputContext() {
        return this._writeContext;
    }

    public final boolean isEnabled(JsonGenerator.Feature feature) {
        return (feature.getMask() & this._features) != 0;
    }

    public JsonGenerator overrideStdFeatures(int i2, int i3) {
        int i4 = this._features;
        int i5 = (i2 & i3) | ((~i3) & i4);
        int i6 = i4 ^ i5;
        if (i6 != 0) {
            this._features = i5;
            _checkStdFeatureChanges(i5, i6);
        }
        return this;
    }

    public void setCurrentValue(Object obj) {
        this._writeContext.setCurrentValue(obj);
    }

    @Deprecated
    public JsonGenerator setFeatureMask(int i2) {
        int i3 = this._features ^ i2;
        this._features = i2;
        if (i3 != 0) {
            _checkStdFeatureChanges(i2, i3);
        }
        return this;
    }

    public void writeObject(Object obj) {
        if (obj == null) {
            writeNull();
            return;
        }
        ObjectCodec objectCodec = this._objectCodec;
        if (objectCodec != null) {
            objectCodec.writeValue(this, obj);
        } else {
            _writeSimpleObject(obj);
        }
    }

    public void writeRawValue(String str) {
        _verifyValueWrite("write raw value");
        writeRaw(str);
    }

    public void writeRawValue(SerializableString serializableString) {
        _verifyValueWrite("write raw value");
        writeRaw(serializableString);
    }
}
