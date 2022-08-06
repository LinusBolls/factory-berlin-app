package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.util.BufferRecyclers;
import java.io.Serializable;

public class SerializedString implements SerializableString, Serializable {
    protected char[] _quotedChars;
    protected byte[] _quotedUTF8Ref;
    protected byte[] _unquotedUTF8Ref;
    protected final String _value;

    public SerializedString(String str) {
        if (str != null) {
            this._value = str;
            return;
        }
        throw new IllegalStateException("Null String illegal for SerializedString");
    }

    public int appendQuotedUTF8(byte[] bArr, int i2) {
        byte[] bArr2 = this._quotedUTF8Ref;
        if (bArr2 == null) {
            bArr2 = BufferRecyclers.quoteAsJsonUTF8(this._value);
            this._quotedUTF8Ref = bArr2;
        }
        int length = bArr2.length;
        if (i2 + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArr2, 0, bArr, i2, length);
        return length;
    }

    public final char[] asQuotedChars() {
        char[] cArr = this._quotedChars;
        if (cArr != null) {
            return cArr;
        }
        char[] quoteAsJsonText = BufferRecyclers.quoteAsJsonText(this._value);
        this._quotedChars = quoteAsJsonText;
        return quoteAsJsonText;
    }

    public final byte[] asQuotedUTF8() {
        byte[] bArr = this._quotedUTF8Ref;
        if (bArr != null) {
            return bArr;
        }
        byte[] quoteAsJsonUTF8 = BufferRecyclers.quoteAsJsonUTF8(this._value);
        this._quotedUTF8Ref = quoteAsJsonUTF8;
        return quoteAsJsonUTF8;
    }

    public final byte[] asUnquotedUTF8() {
        byte[] bArr = this._unquotedUTF8Ref;
        if (bArr != null) {
            return bArr;
        }
        byte[] encodeAsUTF8 = BufferRecyclers.encodeAsUTF8(this._value);
        this._unquotedUTF8Ref = encodeAsUTF8;
        return encodeAsUTF8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != SerializedString.class) {
            return false;
        }
        return this._value.equals(((SerializedString) obj)._value);
    }

    public final String getValue() {
        return this._value;
    }

    public final int hashCode() {
        return this._value.hashCode();
    }

    public final String toString() {
        return this._value;
    }
}
