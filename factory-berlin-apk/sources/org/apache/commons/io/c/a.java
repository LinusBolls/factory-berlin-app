package org.apache.commons.io.c;

import java.io.Serializable;
import java.io.Writer;

/* compiled from: StringBuilderWriter */
public class a extends Writer implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    private final StringBuilder f11460g;

    public a(int i2) {
        this.f11460g = new StringBuilder(i2);
    }

    public void close() {
    }

    public void flush() {
    }

    public String toString() {
        return this.f11460g.toString();
    }

    public void write(String str) {
        if (str != null) {
            this.f11460g.append(str);
        }
    }

    public void write(char[] cArr, int i2, int i3) {
        if (cArr != null) {
            this.f11460g.append(cArr, i2, i3);
        }
    }

    public Writer append(char c) {
        this.f11460g.append(c);
        return this;
    }

    public Writer append(CharSequence charSequence) {
        this.f11460g.append(charSequence);
        return this;
    }

    public Writer append(CharSequence charSequence, int i2, int i3) {
        this.f11460g.append(charSequence, i2, i3);
        return this;
    }
}
