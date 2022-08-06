package g.b.c.a.f0;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.p;
import g.b.c.a.h0.o0;
import g.b.c.a.h0.s0;
import g.b.c.a.h0.t0;
import g.b.c.a.h0.u0;
import g.b.c.a.h0.v0;
import g.b.c.a.j;
import g.b.c.a.k0.j0;
import g.b.c.a.k0.k0;
import g.b.c.a.k0.l0;
import g.b.c.a.k0.r0;
import g.b.c.a.q;
import g.b.c.a.x;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: HmacKeyManager */
public final class b extends j<s0> {

    /* compiled from: HmacKeyManager */
    class a extends j.b<q, s0> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public q a(s0 s0Var) {
            o0 O = s0Var.S().O();
            SecretKeySpec secretKeySpec = new SecretKeySpec(s0Var.R().y(), "HMAC");
            int P = s0Var.S().P();
            int i2 = c.a[O.ordinal()];
            if (i2 == 1) {
                return new k0(new j0("HMACSHA1", secretKeySpec), P);
            }
            if (i2 == 2) {
                return new k0(new j0("HMACSHA256", secretKeySpec), P);
            }
            if (i2 == 3) {
                return new k0(new j0("HMACSHA512", secretKeySpec), P);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    /* renamed from: g.b.c.a.f0.b$b  reason: collision with other inner class name */
    /* compiled from: HmacKeyManager */
    class C0645b extends j.a<t0, s0> {
        C0645b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public s0 a(t0 t0Var) {
            s0.b U = s0.U();
            U.F(b.this.k());
            U.E(t0Var.P());
            U.D(i.g(l0.c(t0Var.O())));
            return (s0) U.k();
        }

        /* renamed from: f */
        public t0 c(i iVar) {
            return t0.Q(iVar, p.b());
        }

        /* renamed from: g */
        public void d(t0 t0Var) {
            if (t0Var.O() >= 16) {
                b.o(t0Var.P());
                return;
            }
            throw new GeneralSecurityException("key too short");
        }
    }

    /* compiled from: HmacKeyManager */
    static /* synthetic */ class c {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
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
                g.b.c.a.h0.o0 r1 = g.b.c.a.h0.o0.SHA512     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.b.c.a.f0.b.c.<clinit>():void");
        }
    }

    public b() {
        super(s0.class, new a(q.class));
    }

    public static void m(boolean z) {
        x.r(new b(), z);
    }

    /* access modifiers changed from: private */
    public static void o(u0 u0Var) {
        if (u0Var.P() >= 10) {
            int i2 = c.a[u0Var.O().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new GeneralSecurityException("unknown hash type");
                    } else if (u0Var.P() > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (u0Var.P() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (u0Var.P() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public j.a<t0, s0> e() {
        return new C0645b(t0.class);
    }

    public v0.c f() {
        return v0.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    /* renamed from: l */
    public s0 g(i iVar) {
        return s0.V(iVar, p.b());
    }

    /* renamed from: n */
    public void i(s0 s0Var) {
        r0.e(s0Var.T(), k());
        if (s0Var.R().size() >= 16) {
            o(s0Var.S());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
