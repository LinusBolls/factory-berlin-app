package com.google.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* compiled from: JsonWriter */
public class c implements Closeable, Flushable {
    private static final String[] p = new String[128];
    private static final String[] q;

    /* renamed from: g  reason: collision with root package name */
    private final Writer f4349g;

    /* renamed from: h  reason: collision with root package name */
    private int[] f4350h = new int[32];

    /* renamed from: i  reason: collision with root package name */
    private int f4351i = 0;

    /* renamed from: j  reason: collision with root package name */
    private String f4352j;

    /* renamed from: k  reason: collision with root package name */
    private String f4353k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f4354l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f4355m;

    /* renamed from: n  reason: collision with root package name */
    private String f4356n;
    private boolean o;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            p[i2] = String.format("\\u%04x", new Object[]{Integer.valueOf(i2)});
        }
        String[] strArr = p;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        q = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        L(6);
        this.f4353k = ":";
        this.o = true;
        if (writer != null) {
            this.f4349g = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    private c F(int i2, char c) {
        b();
        L(i2);
        this.f4349g.write(c);
        return this;
    }

    private void G0() {
        if (this.f4356n != null) {
            a();
            l0(this.f4356n);
            this.f4356n = null;
        }
    }

    private int K() {
        int i2 = this.f4351i;
        if (i2 != 0) {
            return this.f4350h[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void L(int i2) {
        int i3 = this.f4351i;
        int[] iArr = this.f4350h;
        if (i3 == iArr.length) {
            this.f4350h = Arrays.copyOf(iArr, i3 * 2);
        }
        int[] iArr2 = this.f4350h;
        int i4 = this.f4351i;
        this.f4351i = i4 + 1;
        iArr2[i4] = i2;
    }

    private void M(int i2) {
        this.f4350h[this.f4351i - 1] = i2;
    }

    private void a() {
        int K = K();
        if (K == 5) {
            this.f4349g.write(44);
        } else if (K != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        z();
        M(4);
    }

    private void b() {
        int K = K();
        if (K == 1) {
            M(2);
            z();
        } else if (K == 2) {
            this.f4349g.append(',');
            z();
        } else if (K != 4) {
            if (K != 6) {
                if (K != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f4354l) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            M(7);
        } else {
            this.f4349g.append(this.f4353k);
            M(5);
        }
    }

    private c j(int i2, int i3, char c) {
        int K = K();
        if (K != i3 && K != i2) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f4356n == null) {
            this.f4351i--;
            if (K == i3) {
                z();
            }
            this.f4349g.write(c);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f4356n);
        }
    }

    private void l0(String str) {
        String str2;
        String[] strArr = this.f4355m ? q : p;
        this.f4349g.write(34);
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
                this.f4349g.write(str, i2, i3 - i2);
            }
            this.f4349g.write(str2);
            i2 = i3 + 1;
        }
        if (i2 < length) {
            this.f4349g.write(str, i2, length - i2);
        }
        this.f4349g.write(34);
    }

    private void z() {
        if (this.f4352j != null) {
            this.f4349g.write(10);
            int i2 = this.f4351i;
            for (int i3 = 1; i3 < i2; i3++) {
                this.f4349g.write(this.f4352j);
            }
        }
    }

    public c D() {
        if (this.f4356n != null) {
            if (this.o) {
                G0();
            } else {
                this.f4356n = null;
                return this;
            }
        }
        b();
        this.f4349g.write("null");
        return this;
    }

    public c F0(boolean z) {
        G0();
        b();
        this.f4349g.write(z ? "true" : "false");
        return this;
    }

    public final void U(boolean z) {
        this.f4355m = z;
    }

    public final void Z(String str) {
        if (str.length() == 0) {
            this.f4352j = null;
            this.f4353k = ":";
            return;
        }
        this.f4352j = str;
        this.f4353k = ": ";
    }

    public final void b0(boolean z) {
        this.f4354l = z;
    }

    public void close() {
        this.f4349g.close();
        int i2 = this.f4351i;
        if (i2 > 1 || (i2 == 1 && this.f4350h[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f4351i = 0;
    }

    public void flush() {
        if (this.f4351i != 0) {
            this.f4349g.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public c h() {
        G0();
        F(1, '[');
        return this;
    }

    public c i() {
        G0();
        F(3, '{');
        return this;
    }

    public final void i0(boolean z) {
        this.o = z;
    }

    public c k() {
        j(1, 2, ']');
        return this;
    }

    public c l() {
        j(3, 5, '}');
        return this;
    }

    public final boolean n() {
        return this.o;
    }

    public c n0(long j2) {
        G0();
        b();
        this.f4349g.write(Long.toString(j2));
        return this;
    }

    public final boolean o() {
        return this.f4355m;
    }

    public boolean q() {
        return this.f4354l;
    }

    public c r0(Boolean bool) {
        if (bool == null) {
            return D();
        }
        G0();
        b();
        this.f4349g.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c t0(Number number) {
        if (number == null) {
            return D();
        }
        G0();
        String obj = number.toString();
        if (this.f4354l || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            b();
            this.f4349g.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c w0(String str) {
        if (str == null) {
            return D();
        }
        G0();
        b();
        l0(str);
        return this;
    }

    public c y(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f4356n != null) {
            throw new IllegalStateException();
        } else if (this.f4351i != 0) {
            this.f4356n = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }
}
