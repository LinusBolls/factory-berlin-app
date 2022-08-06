package g.b.c.a.d0;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.p;
import g.b.c.a.a0.a;
import g.b.c.a.h0.d;
import g.b.c.a.h0.e;
import g.b.c.a.h0.s;
import g.b.c.a.h0.x0;
import g.b.c.a.k0.r;
import g.b.c.a.x;
import java.security.GeneralSecurityException;

/* compiled from: RegistryEciesAeadHkdfDemHelper */
class g implements r {
    private final String a;
    private int b;

    g(x0 x0Var) {
        String S = x0Var.S();
        this.a = S;
        if (S.equals(a.b)) {
            try {
                s Q = s.Q(x0Var.T(), p.b());
                g.b.c.a.h0.r rVar = (g.b.c.a.h0.r) x.o(x0Var);
                Q.O();
            } catch (InvalidProtocolBufferException e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
            }
        } else if (this.a.equals(a.a)) {
            try {
                e P = e.P(x0Var.T(), p.b());
                d dVar = (d) x.o(x0Var);
                this.b = P.N().O();
                P.O().O();
            } catch (InvalidProtocolBufferException e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: " + this.a);
        }
    }
}
