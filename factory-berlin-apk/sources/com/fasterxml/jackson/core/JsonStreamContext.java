package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharTypes;

public abstract class JsonStreamContext {
    protected int _index;
    protected int _type;

    protected JsonStreamContext() {
    }

    public final int getCurrentIndex() {
        int i2 = this._index;
        if (i2 < 0) {
            return 0;
        }
        return i2;
    }

    public abstract String getCurrentName();

    public abstract Object getCurrentValue();

    public final int getEntryCount() {
        return this._index + 1;
    }

    public abstract JsonStreamContext getParent();

    public final boolean inArray() {
        return this._type == 1;
    }

    public final boolean inObject() {
        return this._type == 2;
    }

    public final boolean inRoot() {
        return this._type == 0;
    }

    public abstract void setCurrentValue(Object obj);

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i2 = this._type;
        if (i2 == 0) {
            sb.append("/");
        } else if (i2 != 1) {
            sb.append('{');
            String currentName = getCurrentName();
            if (currentName != null) {
                sb.append('\"');
                CharTypes.appendQuoted(sb, currentName);
                sb.append('\"');
            } else {
                sb.append('?');
            }
            sb.append('}');
        } else {
            sb.append('[');
            sb.append(getCurrentIndex());
            sb.append(']');
        }
        return sb.toString();
    }

    public String typeDesc() {
        int i2 = this._type;
        if (i2 == 0) {
            return "root";
        }
        if (i2 != 1) {
            return i2 != 2 ? "?" : "Object";
        }
        return "Array";
    }

    protected JsonStreamContext(JsonStreamContext jsonStreamContext) {
        this._type = jsonStreamContext._type;
        this._index = jsonStreamContext._index;
    }

    protected JsonStreamContext(int i2, int i3) {
        this._type = i2;
        this._index = i3;
    }
}
