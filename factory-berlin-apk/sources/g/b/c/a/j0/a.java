package g.b.c.a.j0;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.p;
import g.b.c.a.h0.f;
import g.b.c.a.h0.g;
import g.b.c.a.h0.h;
import g.b.c.a.h0.o0;
import g.b.c.a.h0.u0;
import g.b.c.a.h0.v0;
import g.b.c.a.j;
import g.b.c.a.k0.l0;
import g.b.c.a.k0.r0;
import g.b.c.a.x;
import g.b.c.a.y;
import java.security.GeneralSecurityException;

/* compiled from: AesCtrHmacStreamingKeyManager */
public final class a extends j<f> {

    /* renamed from: g.b.c.a.j0.a$a  reason: collision with other inner class name */
    /* compiled from: AesCtrHmacStreamingKeyManager */
    class C0651a extends j.b<y, f> {
        C0651a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public y a(f fVar) {
            return new g.b.c.a.k0.b(fVar.Q().y(), e.a(fVar.R().Q()), fVar.R().P(), e.a(fVar.R().R().O()), fVar.R().R().P(), fVar.R().N(), 0);
        }
    }

    /* compiled from: AesCtrHmacStreamingKeyManager */
    class b extends j.a<g, f> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public f a(g gVar) {
            f.b T = f.T();
            T.D(i.g(l0.c(gVar.N())));
            T.E(gVar.O());
            T.F(a.this.k());
            return (f) T.k();
        }

        /* renamed from: f */
        public g c(i iVar) {
            return g.P(iVar, p.b());
        }

        /* renamed from: g */
        public void d(g gVar) {
            if (gVar.N() >= 16) {
                a.p(gVar.O());
                return;
            }
            throw new GeneralSecurityException("key_size must be at least 16 bytes");
        }
    }

    /* compiled from: AesCtrHmacStreamingKeyManager */
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
            throw new UnsupportedOperationException("Method not decompiled: g.b.c.a.j0.a.c.<clinit>():void");
        }
    }

    a() {
        super(f.class, new C0651a(y.class));
    }

    public static void m(boolean z) {
        x.r(new a(), z);
    }

    private static void n(u0 u0Var) {
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

    /* access modifiers changed from: private */
    public static void p(h hVar) {
        r0.a(hVar.P());
        if (hVar.Q() == o0.UNKNOWN_HASH) {
            throw new GeneralSecurityException("unknown HKDF hash type");
        } else if (hVar.R().O() != o0.UNKNOWN_HASH) {
            n(hVar.R());
            if (hVar.N() < hVar.P() + hVar.R().P() + 2 + 7) {
                throw new GeneralSecurityException("ciphertext_segment_size must be at least (derived_key_size + tag_size + NONCE_PREFIX_IN_BYTES + 2)");
            }
        } else {
            throw new GeneralSecurityException("unknown HMAC hash type");
        }
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey";
    }

    public j.a<g, f> e() {
        return new b(g.class);
    }

    public v0.c f() {
        return v0.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    /* renamed from: l */
    public f g(i iVar) {
        return f.U(iVar, p.b());
    }

    /* renamed from: o */
    public void i(f fVar) {
        r0.e(fVar.S(), k());
        if (fVar.Q().size() < 16) {
            throw new GeneralSecurityException("key_value must have at least 16 bytes");
        } else if (fVar.Q().size() >= fVar.R().P()) {
            p(fVar.R());
        } else {
            throw new GeneralSecurityException("key_value must have at least as many bits as derived keys");
        }
    }
}
