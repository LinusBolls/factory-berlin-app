package com.squareup.moshi;

import java.io.IOException;
import l.g;

/* compiled from: JsonUtf8Writer */
final class j extends l {
    private static final String[] s = new String[128];
    private final g p;
    private String q = ":";
    private String r;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            s[i2] = String.format("\\u%04x", new Object[]{Integer.valueOf(i2)});
        }
        String[] strArr = s;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    j(g gVar) {
        if (gVar != null) {
            this.p = gVar;
            D(6);
            return;
        }
        throw new NullPointerException("sink == null");
    }

    static void F0(g gVar, String str) {
        String str2;
        String[] strArr = s;
        gVar.R(34);
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i2 < i3) {
                gVar.s(str, i2, i3);
            }
            gVar.u0(str2);
            i2 = i3 + 1;
        }
        if (i2 < length) {
            gVar.s(str, i2, length);
        }
        gVar.R(34);
    }

    private void G0() {
        if (this.r != null) {
            l0();
            F0(this.p, this.r);
            this.r = null;
        }
    }

    private void l0() {
        int y = y();
        if (y == 5) {
            this.p.R(44);
        } else if (y != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        t0();
        F(4);
    }

    private void n0() {
        int y = y();
        int i2 = 7;
        if (y != 1) {
            if (y != 2) {
                if (y == 4) {
                    i2 = 5;
                    this.p.u0(this.q);
                } else if (y == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                } else if (y != 6) {
                    if (y != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    } else if (!this.f8135l) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                F(i2);
            }
            this.p.R(44);
        }
        t0();
        i2 = 2;
        F(i2);
    }

    private l r0(int i2, int i3, char c) {
        int y = y();
        if (y != i3 && y != i2) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.r == null) {
            int i4 = this.f8130g;
            int i5 = this.o;
            if (i4 == (~i5)) {
                this.o = ~i5;
                return this;
            }
            int i6 = i4 - 1;
            this.f8130g = i6;
            this.f8132i[i6] = null;
            int[] iArr = this.f8133j;
            int i7 = i6 - 1;
            iArr[i7] = iArr[i7] + 1;
            if (y == i3) {
                t0();
            }
            this.p.R(c);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.r);
        }
    }

    private void t0() {
        if (this.f8134k != null) {
            this.p.R(10);
            int i2 = this.f8130g;
            for (int i3 = 1; i3 < i2; i3++) {
                this.p.u0(this.f8134k);
            }
        }
    }

    private l w0(int i2, int i3, char c) {
        int i4 = this.f8130g;
        if (i4 == this.o) {
            int[] iArr = this.f8131h;
            if (iArr[i4 - 1] == i2 || iArr[i4 - 1] == i3) {
                this.o = ~this.o;
                return this;
            }
        }
        n0();
        h();
        D(i2);
        this.f8133j[this.f8130g - 1] = 0;
        this.p.R(c);
        return this;
    }

    public l M(double d2) {
        if (!this.f8135l && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d2);
        } else if (this.f8137n) {
            n(Double.toString(d2));
            return this;
        } else {
            G0();
            n0();
            this.p.u0(Double.toString(d2));
            int[] iArr = this.f8133j;
            int i2 = this.f8130g - 1;
            iArr[i2] = iArr[i2] + 1;
            return this;
        }
    }

    public l U(long j2) {
        if (this.f8137n) {
            n(Long.toString(j2));
            return this;
        }
        G0();
        n0();
        this.p.u0(Long.toString(j2));
        int[] iArr = this.f8133j;
        int i2 = this.f8130g - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    public l Z(Number number) {
        if (number == null) {
            o();
            return this;
        }
        String obj = number.toString();
        if (!this.f8135l && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        } else if (this.f8137n) {
            n(obj);
            return this;
        } else {
            G0();
            n0();
            this.p.u0(obj);
            int[] iArr = this.f8133j;
            int i2 = this.f8130g - 1;
            iArr[i2] = iArr[i2] + 1;
            return this;
        }
    }

    public l a() {
        if (!this.f8137n) {
            G0();
            w0(1, 2, '[');
            return this;
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
    }

    public l b() {
        if (!this.f8137n) {
            G0();
            w0(3, 5, '{');
            return this;
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
    }

    public l b0(String str) {
        if (str == null) {
            o();
            return this;
        } else if (this.f8137n) {
            n(str);
            return this;
        } else {
            G0();
            n0();
            F0(this.p, str);
            int[] iArr = this.f8133j;
            int i2 = this.f8130g - 1;
            iArr[i2] = iArr[i2] + 1;
            return this;
        }
    }

    public void close() {
        this.p.close();
        int i2 = this.f8130g;
        if (i2 > 1 || (i2 == 1 && this.f8131h[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f8130g = 0;
    }

    public void flush() {
        if (this.f8130g != 0) {
            this.p.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public l i() {
        r0(1, 2, ']');
        return this;
    }

    public l i0(boolean z) {
        if (!this.f8137n) {
            G0();
            n0();
            this.p.u0(z ? "true" : "false");
            int[] iArr = this.f8133j;
            int i2 = this.f8130g - 1;
            iArr[i2] = iArr[i2] + 1;
            return this;
        }
        throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
    }

    public l j() {
        this.f8137n = false;
        r0(3, 5, '}');
        return this;
    }

    public l n(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f8130g != 0) {
            int y = y();
            if ((y == 3 || y == 5) && this.r == null) {
                this.r = str;
                this.f8132i[this.f8130g - 1] = str;
                this.f8137n = false;
                return this;
            }
            throw new IllegalStateException("Nesting problem.");
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public l o() {
        if (!this.f8137n) {
            if (this.r != null) {
                if (this.f8136m) {
                    G0();
                } else {
                    this.r = null;
                    return this;
                }
            }
            n0();
            this.p.u0("null");
            int[] iArr = this.f8133j;
            int i2 = this.f8130g - 1;
            iArr[i2] = iArr[i2] + 1;
            return this;
        }
        throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
    }
}
