package org.threeten.bp.temporal;

import org.threeten.bp.LocalDate;
import org.threeten.bp.o;
import org.threeten.bp.p;
import org.threeten.bp.s.h;

/* compiled from: TemporalQueries */
public final class j {
    static final k<o> a = new a();
    static final k<h> b = new b();
    static final k<l> c = new c();

    /* renamed from: d  reason: collision with root package name */
    static final k<o> f11728d = new d();

    /* renamed from: e  reason: collision with root package name */
    static final k<p> f11729e = new e();

    /* renamed from: f  reason: collision with root package name */
    static final k<LocalDate> f11730f = new f();

    /* renamed from: g  reason: collision with root package name */
    static final k<org.threeten.bp.f> f11731g = new g();

    /* compiled from: TemporalQueries */
    class a implements k<o> {
        a() {
        }

        /* renamed from: b */
        public o a(e eVar) {
            return (o) eVar.h(this);
        }
    }

    /* compiled from: TemporalQueries */
    class b implements k<h> {
        b() {
        }

        /* renamed from: b */
        public h a(e eVar) {
            return (h) eVar.h(this);
        }
    }

    /* compiled from: TemporalQueries */
    class c implements k<l> {
        c() {
        }

        /* renamed from: b */
        public l a(e eVar) {
            return (l) eVar.h(this);
        }
    }

    /* compiled from: TemporalQueries */
    class d implements k<o> {
        d() {
        }

        /* renamed from: b */
        public o a(e eVar) {
            o oVar = (o) eVar.h(j.a);
            return oVar != null ? oVar : (o) eVar.h(j.f11729e);
        }
    }

    /* compiled from: TemporalQueries */
    class e implements k<p> {
        e() {
        }

        /* renamed from: b */
        public p a(e eVar) {
            if (eVar.t(a.OFFSET_SECONDS)) {
                return p.O(eVar.w(a.OFFSET_SECONDS));
            }
            return null;
        }
    }

    /* compiled from: TemporalQueries */
    class f implements k<LocalDate> {
        f() {
        }

        /* renamed from: b */
        public LocalDate a(e eVar) {
            if (eVar.t(a.EPOCH_DAY)) {
                return LocalDate.B0(eVar.y(a.EPOCH_DAY));
            }
            return null;
        }
    }

    /* compiled from: TemporalQueries */
    class g implements k<org.threeten.bp.f> {
        g() {
        }

        /* renamed from: b */
        public org.threeten.bp.f a(e eVar) {
            if (eVar.t(a.NANO_OF_DAY)) {
                return org.threeten.bp.f.b0(eVar.y(a.NANO_OF_DAY));
            }
            return null;
        }
    }

    public static final k<h> a() {
        return b;
    }

    public static final k<LocalDate> b() {
        return f11730f;
    }

    public static final k<org.threeten.bp.f> c() {
        return f11731g;
    }

    public static final k<p> d() {
        return f11729e;
    }

    public static final k<l> e() {
        return c;
    }

    public static final k<o> f() {
        return f11728d;
    }

    public static final k<o> g() {
        return a;
    }
}
