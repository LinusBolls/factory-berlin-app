package com.google.gson.internal.bind;

import com.google.gson.i;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.stream.c;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JsonTreeWriter */
public final class b extends c {
    private static final Writer u = new a();
    private static final o v = new o("closed");
    private final List<l> r = new ArrayList();
    private String s;
    private l t = m.a;

    /* compiled from: JsonTreeWriter */
    class a extends Writer {
        a() {
        }

        public void close() {
            throw new AssertionError();
        }

        public void flush() {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    }

    public b() {
        super(u);
    }

    private l I0() {
        List<l> list = this.r;
        return list.get(list.size() - 1);
    }

    private void J0(l lVar) {
        if (this.s != null) {
            if (!lVar.i() || n()) {
                ((n) I0()).l(this.s, lVar);
            }
            this.s = null;
        } else if (this.r.isEmpty()) {
            this.t = lVar;
        } else {
            l I0 = I0();
            if (I0 instanceof i) {
                ((i) I0).l(lVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public c D() {
        J0(m.a);
        return this;
    }

    public c F0(boolean z) {
        J0(new o(Boolean.valueOf(z)));
        return this;
    }

    public l H0() {
        if (this.r.isEmpty()) {
            return this.t;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.r);
    }

    public void close() {
        if (this.r.isEmpty()) {
            this.r.add(v);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public void flush() {
    }

    public c h() {
        i iVar = new i();
        J0(iVar);
        this.r.add(iVar);
        return this;
    }

    public c i() {
        n nVar = new n();
        J0(nVar);
        this.r.add(nVar);
        return this;
    }

    public c k() {
        if (this.r.isEmpty() || this.s != null) {
            throw new IllegalStateException();
        } else if (I0() instanceof i) {
            List<l> list = this.r;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public c l() {
        if (this.r.isEmpty() || this.s != null) {
            throw new IllegalStateException();
        } else if (I0() instanceof n) {
            List<l> list = this.r;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public c n0(long j2) {
        J0(new o((Number) Long.valueOf(j2)));
        return this;
    }

    public c r0(Boolean bool) {
        if (bool == null) {
            D();
            return this;
        }
        J0(new o(bool));
        return this;
    }

    public c t0(Number number) {
        if (number == null) {
            D();
            return this;
        }
        if (!q()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        J0(new o(number));
        return this;
    }

    public c w0(String str) {
        if (str == null) {
            D();
            return this;
        }
        J0(new o(str));
        return this;
    }

    public c y(String str) {
        if (this.r.isEmpty() || this.s != null) {
            throw new IllegalStateException();
        } else if (I0() instanceof n) {
            this.s = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }
}
