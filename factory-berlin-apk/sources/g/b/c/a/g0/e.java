package g.b.c.a.g0;

import com.google.errorprone.annotations.Immutable;
import g.b.c.a.h0.f1;
import g.b.c.a.r;
import g.b.c.a.s;
import g.b.c.a.x;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Immutable
/* compiled from: PrfSetWrapper */
public class e implements s<d> {

    /* compiled from: PrfSetWrapper */
    private static class b extends d {
        private final Map<Integer, b> a;
        private final int b;

        public Map<Integer, b> a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        private b(r<d> rVar) {
            if (rVar.e().isEmpty()) {
                throw new GeneralSecurityException("No primitives provided.");
            } else if (rVar.b() != null) {
                this.b = rVar.b().b();
                List<r.a<d>> e2 = rVar.e();
                HashMap hashMap = new HashMap();
                for (r.a next : e2) {
                    if (!next.c().equals(f1.RAW)) {
                        throw new GeneralSecurityException("Key " + next.b() + " has non raw prefix type");
                    } else if (((d) next.d()).a().size() <= 1) {
                        hashMap.put(Integer.valueOf(next.b()), ((d) next.d()).a().get(Integer.valueOf(((d) next.d()).b())));
                    } else {
                        throw new GeneralSecurityException("More PRFs than expected in KeyTypeManager for key " + next.b());
                    }
                }
                this.a = Collections.unmodifiableMap(hashMap);
            } else {
                throw new GeneralSecurityException("Primary key not set.");
            }
        }
    }

    public static void c() {
        x.s(new e());
    }

    public Class<d> b() {
        return d.class;
    }

    /* renamed from: d */
    public d a(r<d> rVar) {
        return new b(rVar);
    }
}
