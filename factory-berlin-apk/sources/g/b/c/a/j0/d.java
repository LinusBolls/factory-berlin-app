package g.b.c.a.j0;

import g.b.c.a.r;
import g.b.c.a.y;
import java.security.GeneralSecurityException;

/* compiled from: StreamingAeadHelper */
final class d implements y {
    public d(r<y> rVar) {
        if (rVar.b() == null) {
            throw new GeneralSecurityException("Missing primary primitive.");
        }
    }
}
