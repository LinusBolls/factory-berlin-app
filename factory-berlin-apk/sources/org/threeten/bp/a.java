package org.threeten.bp;

import java.io.Serializable;

/* compiled from: Clock */
public abstract class a {

    /* renamed from: org.threeten.bp.a$a  reason: collision with other inner class name */
    /* compiled from: Clock */
    static final class C0798a extends a implements Serializable {

        /* renamed from: g  reason: collision with root package name */
        private final o f11469g;

        C0798a(o oVar) {
            this.f11469g = oVar;
        }

        public o a() {
            return this.f11469g;
        }

        public d b() {
            return d.S(e());
        }

        public long e() {
            return System.currentTimeMillis();
        }

        public boolean equals(Object obj) {
            if (obj instanceof C0798a) {
                return this.f11469g.equals(((C0798a) obj).f11469g);
            }
            return false;
        }

        public int hashCode() {
            return this.f11469g.hashCode() + 1;
        }

        public String toString() {
            return "SystemClock[" + this.f11469g + "]";
        }
    }

    protected a() {
    }

    public static a c() {
        return new C0798a(o.C());
    }

    public static a d() {
        return new C0798a(p.f11630l);
    }

    public abstract o a();

    public abstract d b();
}
