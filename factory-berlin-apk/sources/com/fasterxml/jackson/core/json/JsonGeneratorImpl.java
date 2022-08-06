package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;

public abstract class JsonGeneratorImpl extends GeneratorBase {
    protected static final int[] sOutputEscapes = CharTypes.get7BitOutputEscapes();
    protected boolean _cfgUnqNames;
    protected CharacterEscapes _characterEscapes;
    protected final IOContext _ioContext;
    protected int _maximumNonEscapedChar;
    protected int[] _outputEscapes = sOutputEscapes;
    protected SerializableString _rootValueSeparator = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;

    public JsonGeneratorImpl(IOContext iOContext, int i2, ObjectCodec objectCodec) {
        super(i2, objectCodec);
        this._ioContext = iOContext;
        if (JsonGenerator.Feature.ESCAPE_NON_ASCII.enabledIn(i2)) {
            this._maximumNonEscapedChar = 127;
        }
        this._cfgUnqNames = !JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledIn(i2);
    }

    /* access modifiers changed from: protected */
    public void _checkStdFeatureChanges(int i2, int i3) {
        super._checkStdFeatureChanges(i2, i3);
        this._cfgUnqNames = !JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledIn(i2);
    }

    /* access modifiers changed from: protected */
    public void _reportCantWriteValueExpectName(String str) {
        _reportError(String.format("Can not %s, expecting field name (context: %s)", new Object[]{str, this._writeContext.typeDesc()}));
        throw null;
    }

    /* access modifiers changed from: protected */
    public void _verifyPrettyValueWrite(String str, int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                this._cfgPrettyPrinter.writeArrayValueSeparator(this);
            } else if (i2 == 2) {
                this._cfgPrettyPrinter.writeObjectFieldValueSeparator(this);
            } else if (i2 == 3) {
                this._cfgPrettyPrinter.writeRootValueSeparator(this);
            } else if (i2 != 5) {
                _throwInternal();
                throw null;
            } else {
                _reportCantWriteValueExpectName(str);
                throw null;
            }
        } else if (this._writeContext.inArray()) {
            this._cfgPrettyPrinter.beforeArrayValues(this);
        } else if (this._writeContext.inObject()) {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
    }

    public JsonGenerator disable(JsonGenerator.Feature feature) {
        super.disable(feature);
        if (feature == JsonGenerator.Feature.QUOTE_FIELD_NAMES) {
            this._cfgUnqNames = true;
        }
        return this;
    }

    public JsonGenerator setCharacterEscapes(CharacterEscapes characterEscapes) {
        this._characterEscapes = characterEscapes;
        if (characterEscapes == null) {
            this._outputEscapes = sOutputEscapes;
        } else {
            this._outputEscapes = characterEscapes.getEscapeCodesForAscii();
        }
        return this;
    }

    public JsonGenerator setHighestNonEscapedChar(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this._maximumNonEscapedChar = i2;
        return this;
    }

    public JsonGenerator setRootValueSeparator(SerializableString serializableString) {
        this._rootValueSeparator = serializableString;
        return this;
    }

    public final void writeStringField(String str, String str2) {
        writeFieldName(str);
        writeString(str2);
    }
}
