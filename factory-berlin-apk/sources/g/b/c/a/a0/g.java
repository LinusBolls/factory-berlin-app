package g.b.c.a.a0;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.p;
import g.b.c.a.h0.v;
import g.b.c.a.h0.v0;
import g.b.c.a.h0.w;
import g.b.c.a.j;
import g.b.c.a.k0.l0;
import g.b.c.a.k0.m;
import g.b.c.a.k0.r0;
import g.b.c.a.x;
import java.security.GeneralSecurityException;

/* compiled from: ChaCha20Poly1305KeyManager */
public class g extends j<v> {

    /* compiled from: ChaCha20Poly1305KeyManager */
    class a extends j.b<g.b.c.a.a, v> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public g.b.c.a.a a(v vVar) {
            return new m(vVar.P().y());
        }
    }

    /* compiled from: ChaCha20Poly1305KeyManager */
    class b extends j.a<w, v> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public v a(w wVar) {
            v.b R = v.R();
            R.E(g.this.j());
            R.D(i.g(l0.c(32)));
            return (v) R.k();
        }

        /* renamed from: f */
        public w c(i iVar) {
            return w.N(iVar, p.b());
        }

        /* renamed from: g */
        public void d(w wVar) {
        }
    }

    g() {
        super(v.class, new a(g.b.c.a.a.class));
    }

    public static void l(boolean z) {
        x.r(new g(), z);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public j.a<w, v> e() {
        return new b(w.class);
    }

    public v0.c f() {
        return v0.c.SYMMETRIC;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public v g(i iVar) {
        return v.S(iVar, p.b());
    }

    /* renamed from: m */
    public void i(v vVar) {
        r0.e(vVar.Q(), j());
        if (vVar.P().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
