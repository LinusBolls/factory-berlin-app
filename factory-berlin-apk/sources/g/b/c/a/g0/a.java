package g.b.c.a.g0;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.p;
import g.b.c.a.h0.o0;
import g.b.c.a.h0.p0;
import g.b.c.a.h0.q0;
import g.b.c.a.h0.r0;
import g.b.c.a.h0.v0;
import g.b.c.a.j;
import g.b.c.a.k0.c0;
import g.b.c.a.k0.l0;
import g.b.c.a.x;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;

/* compiled from: HkdfPrfKeyManager */
public class a extends j<p0> {

    /* renamed from: g.b.c.a.g0.a$a  reason: collision with other inner class name */
    /* compiled from: HkdfPrfKeyManager */
    class C0646a extends j.b<g.b.c.a.k0.u0.c, p0> {
        C0646a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public g.b.c.a.k0.u0.c a(p0 p0Var) {
            return new g.b.c.a.k0.u0.a(a.m(p0Var.R().O()), p0Var.Q().y(), p0Var.R().P().y());
        }
    }

    /* compiled from: HkdfPrfKeyManager */
    class b extends j.b<d, p0> {

        /* renamed from: g.b.c.a.g0.a$b$a  reason: collision with other inner class name */
        /* compiled from: HkdfPrfKeyManager */
        class C0647a extends d {
            final /* synthetic */ b a;

            C0647a(b bVar, b bVar2) {
                this.a = bVar2;
            }

            public Map<Integer, b> a() {
                return Collections.singletonMap(0, this.a);
            }

            public int b() {
                return 0;
            }
        }

        b(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public d a(p0 p0Var) {
            return new C0647a(this, g.b.c.a.k0.u0.b.c(new g.b.c.a.k0.u0.a(a.m(p0Var.R().O()), p0Var.Q().y(), p0Var.R().P().y())));
        }
    }

    /* compiled from: HkdfPrfKeyManager */
    class c extends j.a<q0, p0> {
        c(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public p0 a(q0 q0Var) {
            p0.b T = p0.T();
            T.D(i.g(l0.c(q0Var.N())));
            T.F(a.this.n());
            T.E(q0Var.O());
            return (p0) T.k();
        }

        /* renamed from: f */
        public q0 c(i iVar) {
            return q0.P(iVar, p.b());
        }

        /* renamed from: g */
        public void d(q0 q0Var) {
            a.r(q0Var.N());
            a.s(q0Var.O());
        }
    }

    /* compiled from: HkdfPrfKeyManager */
    static /* synthetic */ class d {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                g.b.c.a.h0.o0[] r0 = g.b.c.a.h0.o0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                g.b.c.a.h0.o0 r1 = g.b.c.a.h0.o0.SHA1     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                g.b.c.a.h0.o0 r1 = g.b.c.a.h0.o0.SHA256     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                g.b.c.a.h0.o0 r1 = g.b.c.a.h0.o0.SHA384     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                g.b.c.a.h0.o0 r1 = g.b.c.a.h0.o0.SHA512     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.b.c.a.g0.a.d.<clinit>():void");
        }
    }

    a() {
        super(p0.class, new C0646a(g.b.c.a.k0.u0.c.class), new b(d.class));
    }

    /* access modifiers changed from: private */
    public static c0 m(o0 o0Var) {
        int i2 = d.a[o0Var.ordinal()];
        if (i2 == 1) {
            return c0.SHA1;
        }
        if (i2 == 2) {
            return c0.SHA256;
        }
        if (i2 == 3) {
            return c0.SHA384;
        }
        if (i2 == 4) {
            return c0.SHA512;
        }
        throw new GeneralSecurityException("HashType " + o0Var.name() + " not known in");
    }

    public static void p(boolean z) {
        x.r(new a(), z);
    }

    /* access modifiers changed from: private */
    public static void r(int i2) {
        if (i2 < 32) {
            throw new GeneralSecurityException("Invalid HkdfPrfKey/HkdfPrfKeyFormat: Key size too short");
        }
    }

    /* access modifiers changed from: private */
    public static void s(r0 r0Var) {
        if (r0Var.O() != o0.SHA256 && r0Var.O() != o0.SHA512) {
            throw new GeneralSecurityException("Invalid HkdfPrfKey/HkdfPrfKeyFormat: Unsupported hash");
        }
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.HkdfPrfKey";
    }

    public j.a<q0, p0> e() {
        return new c(q0.class);
    }

    public v0.c f() {
        return v0.c.SYMMETRIC;
    }

    public int n() {
        return 0;
    }

    /* renamed from: o */
    public p0 g(i iVar) {
        return p0.U(iVar, p.b());
    }

    /* renamed from: q */
    public void i(p0 p0Var) {
        g.b.c.a.k0.r0.e(p0Var.S(), n());
        r(p0Var.Q().size());
        s(p0Var.R());
    }
}
