package g.b.c.a.a0;

import com.google.crypto.tink.shaded.protobuf.i;
import g.b.c.a.h0.d1;
import g.b.c.a.h0.e1;
import g.b.c.a.h0.v0;
import g.b.c.a.j;
import g.b.c.a.k0.r0;
import g.b.c.a.p;
import g.b.c.a.x;

/* compiled from: KmsEnvelopeAeadKeyManager */
public class j extends g.b.c.a.j<d1> {

    /* compiled from: KmsEnvelopeAeadKeyManager */
    class a extends j.b<g.b.c.a.a, d1> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public g.b.c.a.a a(d1 d1Var) {
            String P = d1Var.P().P();
            return new i(d1Var.P().O(), p.a(P).b(P));
        }
    }

    /* compiled from: KmsEnvelopeAeadKeyManager */
    class b extends j.a<e1, d1> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public d1 a(e1 e1Var) {
            d1.b R = d1.R();
            R.D(e1Var);
            R.E(j.this.j());
            return (d1) R.k();
        }

        /* renamed from: f */
        public e1 c(i iVar) {
            return e1.Q(iVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        /* renamed from: g */
        public void d(e1 e1Var) {
        }
    }

    j() {
        super(d1.class, new a(g.b.c.a.a.class));
    }

    public static void l(boolean z) {
        x.r(new j(), z);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    public j.a<e1, d1> e() {
        return new b(e1.class);
    }

    public v0.c f() {
        return v0.c.REMOTE;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public d1 g(i iVar) {
        return d1.S(iVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    /* renamed from: m */
    public void i(d1 d1Var) {
        r0.e(d1Var.Q(), j());
    }
}
