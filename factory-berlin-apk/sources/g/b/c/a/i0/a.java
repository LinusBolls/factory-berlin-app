package g.b.c.a.i0;

import com.google.crypto.tink.shaded.protobuf.i;
import g.b.c.a.h0.a0;
import g.b.c.a.h0.b0;
import g.b.c.a.h0.v0;
import g.b.c.a.h0.z;
import g.b.c.a.j;
import g.b.c.a.k0.p;
import g.b.c.a.k0.r0;
import g.b.c.a.k0.y;
import g.b.c.a.u;
import g.b.c.a.v;
import g.b.c.a.x;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

/* compiled from: EcdsaSignKeyManager */
public final class a extends u<a0, b0> {

    /* renamed from: g.b.c.a.i0.a$a  reason: collision with other inner class name */
    /* compiled from: EcdsaSignKeyManager */
    class C0650a extends j.b<v, a0> {
        C0650a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public v a(a0 a0Var) {
            return new p(y.f(k.a(a0Var.R().S().N()), a0Var.Q().y()), k.c(a0Var.R().S().Q()), k.b(a0Var.R().S().P()));
        }
    }

    /* compiled from: EcdsaSignKeyManager */
    class b extends j.a<g.b.c.a.h0.y, a0> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public a0 a(g.b.c.a.h0.y yVar) {
            z N = yVar.N();
            KeyPair c = y.c(k.a(N.N()));
            ECPoint w = ((ECPublicKey) c.getPublic()).getW();
            b0.b W = b0.W();
            W.E(a.this.j());
            W.D(N);
            W.F(i.g(w.getAffineX().toByteArray()));
            W.G(i.g(w.getAffineY().toByteArray()));
            a0.b T = a0.T();
            T.F(a.this.j());
            T.E((b0) W.k());
            T.D(i.g(((ECPrivateKey) c.getPrivate()).getS().toByteArray()));
            return (a0) T.k();
        }

        /* renamed from: f */
        public g.b.c.a.h0.y c(i iVar) {
            return g.b.c.a.h0.y.O(iVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        /* renamed from: g */
        public void d(g.b.c.a.h0.y yVar) {
            k.d(yVar.N());
        }
    }

    a() {
        super(a0.class, b0.class, new C0650a(v.class));
    }

    public static void l(boolean z) {
        x.q(new a(), new b(), z);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey";
    }

    public j.a<g.b.c.a.h0.y, a0> e() {
        return new b(g.b.c.a.h0.y.class);
    }

    public v0.c f() {
        return v0.c.ASYMMETRIC_PRIVATE;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public a0 g(i iVar) {
        return a0.U(iVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    /* renamed from: m */
    public void i(a0 a0Var) {
        r0.e(a0Var.S(), j());
        k.d(a0Var.R().S());
    }
}
