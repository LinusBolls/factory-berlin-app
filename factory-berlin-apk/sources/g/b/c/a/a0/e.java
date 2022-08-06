package g.b.c.a.a0;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.p;
import g.b.c.a.h0.l;
import g.b.c.a.h0.m;
import g.b.c.a.h0.v0;
import g.b.c.a.j;
import g.b.c.a.k0.d;
import g.b.c.a.k0.l0;
import g.b.c.a.k0.r0;
import g.b.c.a.x;
import java.security.GeneralSecurityException;

/* compiled from: AesEaxKeyManager */
public final class e extends j<l> {

    /* compiled from: AesEaxKeyManager */
    class a extends j.b<g.b.c.a.a, l> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public g.b.c.a.a a(l lVar) {
            return new d(lVar.Q().y(), lVar.R().O());
        }
    }

    /* compiled from: AesEaxKeyManager */
    class b extends j.a<m, l> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public l a(m mVar) {
            l.b T = l.T();
            T.D(i.g(l0.c(mVar.N())));
            T.E(mVar.O());
            T.F(e.this.j());
            return (l) T.k();
        }

        /* renamed from: f */
        public m c(i iVar) {
            return m.P(iVar, p.b());
        }

        /* renamed from: g */
        public void d(m mVar) {
            r0.a(mVar.N());
            if (mVar.O().O() != 12 && mVar.O().O() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    e() {
        super(l.class, new a(g.b.c.a.a.class));
    }

    public static void l(boolean z) {
        x.r(new e(), z);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public j.a<m, l> e() {
        return new b(m.class);
    }

    public v0.c f() {
        return v0.c.SYMMETRIC;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public l g(i iVar) {
        return l.U(iVar, p.b());
    }

    /* renamed from: m */
    public void i(l lVar) {
        r0.e(lVar.S(), j());
        r0.a(lVar.Q().size());
        if (lVar.R().O() != 12 && lVar.R().O() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
