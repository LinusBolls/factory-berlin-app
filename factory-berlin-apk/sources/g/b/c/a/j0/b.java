package g.b.c.a.j0;

import com.google.crypto.tink.shaded.protobuf.i;
import g.b.c.a.h0.o;
import g.b.c.a.h0.o0;
import g.b.c.a.h0.p;
import g.b.c.a.h0.q;
import g.b.c.a.h0.v0;
import g.b.c.a.j;
import g.b.c.a.k0.e;
import g.b.c.a.k0.l0;
import g.b.c.a.k0.r0;
import g.b.c.a.x;
import g.b.c.a.y;
import java.security.GeneralSecurityException;

/* compiled from: AesGcmHkdfStreamingKeyManager */
public final class b extends j<o> {

    /* compiled from: AesGcmHkdfStreamingKeyManager */
    class a extends j.b<y, o> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public y a(o oVar) {
            return new e(oVar.Q().y(), e.a(oVar.R().Q()), oVar.R().P(), oVar.R().N(), 0);
        }
    }

    /* renamed from: g.b.c.a.j0.b$b  reason: collision with other inner class name */
    /* compiled from: AesGcmHkdfStreamingKeyManager */
    class C0652b extends j.a<p, o> {
        C0652b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public o a(p pVar) {
            o.b T = o.T();
            T.D(i.g(l0.c(pVar.N())));
            T.E(pVar.O());
            T.F(b.this.k());
            return (o) T.k();
        }

        /* renamed from: f */
        public p c(i iVar) {
            return p.P(iVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        /* renamed from: g */
        public void d(p pVar) {
            if (pVar.N() >= 16) {
                b.o(pVar.O());
                return;
            }
            throw new GeneralSecurityException("key_size must be at least 16 bytes");
        }
    }

    b() {
        super(o.class, new a(y.class));
    }

    public static void m(boolean z) {
        x.r(new b(), z);
    }

    /* access modifiers changed from: private */
    public static void o(q qVar) {
        r0.a(qVar.P());
        if (qVar.Q() == o0.UNKNOWN_HASH) {
            throw new GeneralSecurityException("unknown HKDF hash type");
        } else if (qVar.N() < qVar.P() + 7 + 16 + 2) {
            throw new GeneralSecurityException("ciphertext_segment_size must be at least (derived_key_size + NONCE_PREFIX_IN_BYTES + TAG_SIZE_IN_BYTES + 2)");
        }
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey";
    }

    public j.a<p, o> e() {
        return new C0652b(p.class);
    }

    public v0.c f() {
        return v0.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    /* renamed from: l */
    public o g(i iVar) {
        return o.U(iVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    /* renamed from: n */
    public void i(o oVar) {
        r0.e(oVar.S(), k());
        o(oVar.R());
    }
}
