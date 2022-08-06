package com.apollographql.apollo.api.internal.json;

import java.io.IOException;
import kotlin.jvm.internal.k;
import l.g;

/* compiled from: JsonUtf8Writer.kt */
public final class e extends f {
    /* access modifiers changed from: private */
    public static final String[] q;
    public static final a r = new a((DefaultConstructorMarker) null);
    private String o;
    private final g p;

    /* compiled from: JsonUtf8Writer.kt */
    public static final class a {
        private a() {
        }

        /* access modifiers changed from: private */
        public final String b(byte b) {
            StringBuilder sb = new StringBuilder();
            sb.append("0123456789abcdef".charAt(b >>> 4));
            sb.append("0123456789abcdef".charAt(b & 15));
            return sb.toString();
        }

        public final void c(g gVar, String str) {
            String str2;
            k.f(gVar, "sink");
            k.f(str, "value");
            String[] t0 = e.q;
            gVar.R(34);
            int length = str.length();
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = str.charAt(i3);
                if (charAt < 128) {
                    str2 = t0[charAt];
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

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String[] strArr = new String[128];
        for (int i2 = 0; i2 <= 31; i2++) {
            strArr[i2] = "\\u00" + r.b((byte) i2);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        q = strArr;
    }

    public e(g gVar) {
        k.f(gVar, "sink");
        this.p = gVar;
        M(6);
    }

    private final void F0() {
        int L = L();
        if (L == 1) {
            U(2);
            I0();
        } else if (L == 2) {
            this.p.R(44);
            I0();
        } else if (L == 4) {
            this.p.u0(H0());
            U(5);
        } else if (L == 6) {
            U(7);
        } else if (L != 7) {
            throw new IllegalStateException("Nesting problem.");
        } else if (y()) {
            U(7);
        } else {
            throw new IllegalStateException("JSON must have only one top-level value.".toString());
        }
    }

    private final f G0(int i2, int i3, String str) {
        int L = L();
        boolean z = false;
        if (L == i3 || L == i2) {
            if (this.o == null) {
                z = true;
            }
            if (z) {
                b0(q() - 1);
                l()[q()] = null;
                int[] k2 = k();
                int q2 = q() - 1;
                k2[q2] = k2[q2] + 1;
                if (L == i3) {
                    I0();
                }
                this.p.u0(str);
                return this;
            }
            throw new IllegalStateException(("Dangling name: " + this.o).toString());
        }
        throw new IllegalStateException("Nesting problem.".toString());
    }

    private final void I0() {
        if (j() != null) {
            this.p.R(10);
            int q2 = q();
            for (int i2 = 1; i2 < q2; i2++) {
                g gVar = this.p;
                String j2 = j();
                if (j2 == null) {
                    j2 = "";
                }
                gVar.u0(j2);
            }
        }
    }

    private final f J0(int i2, String str) {
        F0();
        M(i2);
        k()[q() - 1] = 0;
        this.p.u0(str);
        return this;
    }

    private final void K0() {
        if (this.o != null) {
            w0();
            a aVar = r;
            g gVar = this.p;
            String str = this.o;
            if (str != null) {
                aVar.c(gVar, str);
                this.o = null;
                return;
            }
            k.m();
            throw null;
        }
    }

    private final void w0() {
        int L = L();
        if (L == 5) {
            this.p.R(44);
        } else {
            if (!(L == 3)) {
                throw new IllegalStateException("Nesting problem.".toString());
            }
        }
        I0();
        U(4);
    }

    public f D(String str) {
        k.f(str, "name");
        boolean z = false;
        if (q() != 0) {
            if (this.o == null) {
                z = true;
            }
            if (z) {
                this.o = str;
                l()[q() - 1] = str;
                return this;
            }
            throw new IllegalStateException("Nesting problem.".toString());
        }
        throw new IllegalStateException("JsonWriter is closed.".toString());
    }

    public f F() {
        if (this.o != null) {
            if (o()) {
                K0();
            } else {
                this.o = null;
                return this;
            }
        }
        F0();
        this.p.u0("null");
        int[] k2 = k();
        int q2 = q() - 1;
        k2[q2] = k2[q2] + 1;
        return this;
    }

    public final String H0() {
        String j2 = j();
        return j2 == null || j2.length() == 0 ? ":" : ": ";
    }

    public f a() {
        K0();
        J0(1, "[");
        return this;
    }

    public f b() {
        K0();
        J0(3, "{");
        return this;
    }

    public void close() {
        this.p.close();
        int q2 = q();
        if (q2 > 1 || (q2 == 1 && n()[q2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        b0(0);
    }

    public void flush() {
        if (q() != 0) {
            this.p.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.".toString());
    }

    public f h() {
        G0(1, 2, "]");
        return this;
    }

    public f i() {
        G0(3, 5, "}");
        return this;
    }

    public f i0(long j2) {
        K0();
        F0();
        this.p.u0(String.valueOf(j2));
        int[] k2 = k();
        int q2 = q() - 1;
        k2[q2] = k2[q2] + 1;
        return this;
    }

    public f l0(Boolean bool) {
        if (bool == null) {
            F();
        } else {
            K0();
            F0();
            this.p.u0(bool.booleanValue() ? "true" : "false");
            int[] k2 = k();
            int q2 = q() - 1;
            k2[q2] = k2[q2] + 1;
        }
        return this;
    }

    public f n0(Number number) {
        if (number == null) {
            F();
            return this;
        }
        String number2 = number.toString();
        if (y() || (!k.a(number2, "-Infinity") && !k.a(number2, "Infinity") && !k.a(number2, "NaN"))) {
            K0();
            F0();
            this.p.u0(number2);
            int[] k2 = k();
            int q2 = q() - 1;
            k2[q2] = k2[q2] + 1;
            return this;
        }
        throw new IllegalArgumentException(("Numeric values must be finite, but was " + number).toString());
    }

    public f r0(String str) {
        if (str == null) {
            F();
            return this;
        }
        K0();
        F0();
        r.c(this.p, str);
        int[] k2 = k();
        int q2 = q() - 1;
        k2[q2] = k2[q2] + 1;
        return this;
    }

    public f z(String str) {
        if (str == null) {
            F();
            return this;
        }
        K0();
        F0();
        this.p.u0(str);
        int[] k2 = k();
        int q2 = q() - 1;
        k2[q2] = k2[q2] + 1;
        return this;
    }
}
