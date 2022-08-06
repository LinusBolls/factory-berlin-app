package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;

public class JsonWriteContext extends JsonStreamContext {
    protected JsonWriteContext _child;
    protected String _currentName;
    protected Object _currentValue;
    protected DupDetector _dups;
    protected boolean _gotName;
    protected final JsonWriteContext _parent;

    protected JsonWriteContext(int i2, JsonWriteContext jsonWriteContext, DupDetector dupDetector) {
        this._type = i2;
        this._parent = jsonWriteContext;
        this._dups = dupDetector;
        this._index = -1;
    }

    private final void _checkDup(DupDetector dupDetector, String str) {
        if (dupDetector.isDup(str)) {
            Object source = dupDetector.getSource();
            throw new JsonGenerationException("Duplicate field '" + str + "'", source instanceof JsonGenerator ? (JsonGenerator) source : null);
        }
    }

    public static JsonWriteContext createRootContext(DupDetector dupDetector) {
        return new JsonWriteContext(0, (JsonWriteContext) null, dupDetector);
    }

    public JsonWriteContext clearAndGetParent() {
        this._currentValue = null;
        return this._parent;
    }

    public JsonWriteContext createChildArrayContext() {
        JsonWriteContext jsonWriteContext = this._child;
        if (jsonWriteContext == null) {
            DupDetector dupDetector = this._dups;
            JsonWriteContext jsonWriteContext2 = new JsonWriteContext(1, this, dupDetector == null ? null : dupDetector.child());
            this._child = jsonWriteContext2;
            return jsonWriteContext2;
        }
        jsonWriteContext.reset(1);
        return jsonWriteContext;
    }

    public JsonWriteContext createChildObjectContext() {
        JsonWriteContext jsonWriteContext = this._child;
        if (jsonWriteContext == null) {
            DupDetector dupDetector = this._dups;
            JsonWriteContext jsonWriteContext2 = new JsonWriteContext(2, this, dupDetector == null ? null : dupDetector.child());
            this._child = jsonWriteContext2;
            return jsonWriteContext2;
        }
        jsonWriteContext.reset(2);
        return jsonWriteContext;
    }

    public final String getCurrentName() {
        return this._currentName;
    }

    public Object getCurrentValue() {
        return this._currentValue;
    }

    public DupDetector getDupDetector() {
        return this._dups;
    }

    /* access modifiers changed from: protected */
    public JsonWriteContext reset(int i2) {
        this._type = i2;
        this._index = -1;
        this._currentName = null;
        this._gotName = false;
        this._currentValue = null;
        DupDetector dupDetector = this._dups;
        if (dupDetector != null) {
            dupDetector.reset();
        }
        return this;
    }

    public void setCurrentValue(Object obj) {
        this._currentValue = obj;
    }

    public JsonWriteContext withDupDetector(DupDetector dupDetector) {
        this._dups = dupDetector;
        return this;
    }

    public int writeFieldName(String str) {
        if (this._type != 2 || this._gotName) {
            return 4;
        }
        this._gotName = true;
        this._currentName = str;
        DupDetector dupDetector = this._dups;
        if (dupDetector != null) {
            _checkDup(dupDetector, str);
        }
        if (this._index < 0) {
            return 0;
        }
        return 1;
    }

    public int writeValue() {
        int i2 = this._type;
        if (i2 == 2) {
            if (!this._gotName) {
                return 5;
            }
            this._gotName = false;
            this._index++;
            return 2;
        } else if (i2 == 1) {
            int i3 = this._index;
            this._index = i3 + 1;
            if (i3 < 0) {
                return 0;
            }
            return 1;
        } else {
            int i4 = this._index + 1;
            this._index = i4;
            if (i4 == 0) {
                return 0;
            }
            return 3;
        }
    }

    public final JsonWriteContext getParent() {
        return this._parent;
    }
}
