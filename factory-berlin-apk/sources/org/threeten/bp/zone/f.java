package org.threeten.bp.zone;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import org.threeten.bp.d;
import org.threeten.bp.e;
import org.threeten.bp.p;

/* compiled from: ZoneRules */
public abstract class f {

    /* compiled from: ZoneRules */
    static final class a extends f implements Serializable {

        /* renamed from: g  reason: collision with root package name */
        private final p f11777g;

        a(p pVar) {
            this.f11777g = pVar;
        }

        public p a(d dVar) {
            return this.f11777g;
        }

        public d b(e eVar) {
            return null;
        }

        public List<p> c(e eVar) {
            return Collections.singletonList(this.f11777g);
        }

        public boolean d(d dVar) {
            return false;
        }

        public boolean e() {
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f11777g.equals(((a) obj).f11777g);
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.e() || !this.f11777g.equals(bVar.a(d.f11481i))) {
                return false;
            }
            return true;
        }

        public boolean f(e eVar, p pVar) {
            return this.f11777g.equals(pVar);
        }

        public int hashCode() {
            return ((((this.f11777g.hashCode() + 31) ^ 1) ^ 1) ^ (this.f11777g.hashCode() + 31)) ^ 1;
        }

        public String toString() {
            return "FixedRules:" + this.f11777g;
        }
    }

    f() {
    }

    public static f g(p pVar) {
        org.threeten.bp.t.d.i(pVar, "offset");
        return new a(pVar);
    }

    public abstract p a(d dVar);

    public abstract d b(e eVar);

    public abstract List<p> c(e eVar);

    public abstract boolean d(d dVar);

    public abstract boolean e();

    public abstract boolean f(e eVar, p pVar);
}
