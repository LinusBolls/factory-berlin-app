package g.e.d;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: DateTimeInterval.kt */
public final class e {

    /* renamed from: d  reason: collision with root package name */
    public static final a f9749d = new a((DefaultConstructorMarker) null);
    private final kotlin.e a;
    private final org.threeten.bp.e b;
    private final org.threeten.bp.e c;

    /* compiled from: DateTimeInterval.kt */
    public static final class a {
        private a() {
        }

        public final e a(org.threeten.bp.e eVar, org.threeten.bp.e eVar2) {
            k.e(eVar, "from");
            k.e(eVar2, "to");
            return new e(eVar, eVar2, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: DateTimeInterval.kt */
    static final class b extends l implements kotlin.e0.c.a<org.threeten.bp.c> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f9750h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(0);
            this.f9750h = eVar;
        }

        /* renamed from: a */
        public final org.threeten.bp.c d() {
            return org.threeten.bp.c.f(this.f9750h.e(), this.f9750h.f());
        }
    }

    /* compiled from: DateTimeInterval.kt */
    static final class c extends l implements kotlin.e0.c.a<Long> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f9751h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar) {
            super(0);
            this.f9751h = eVar;
        }

        public final long a() {
            return this.f9751h.f().U().T() - this.f9751h.e().U().T();
        }

        public /* bridge */ /* synthetic */ Object d() {
            return Long.valueOf(a());
        }
    }

    private e(org.threeten.bp.e eVar, org.threeten.bp.e eVar2) {
        this.b = eVar;
        this.c = eVar2;
        if (!eVar.M(eVar2)) {
            this.a = g.a(new b(this));
            kotlin.e<T> unused = g.a(new c(this));
            return;
        }
        throw new IllegalArgumentException("From must be before To");
    }

    public static /* synthetic */ e b(e eVar, org.threeten.bp.e eVar2, org.threeten.bp.e eVar3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            eVar2 = eVar.b;
        }
        if ((i2 & 2) != 0) {
            eVar3 = eVar.c;
        }
        return eVar.a(eVar2, eVar3);
    }

    public final e a(org.threeten.bp.e eVar, org.threeten.bp.e eVar2) {
        k.e(eVar, "from");
        k.e(eVar2, "to");
        return new e(eVar, eVar2);
    }

    public final void c(org.threeten.bp.c cVar, kotlin.e0.c.l<? super org.threeten.bp.e, x> lVar) {
        k.e(cVar, "step");
        k.e(lVar, "loop");
        org.threeten.bp.c cVar2 = org.threeten.bp.c.f11478i;
        while (cVar2.compareTo(d()) < 0) {
            org.threeten.bp.e v0 = this.b.v0(cVar2);
            k.d(v0, "from.plus(offset)");
            lVar.o(v0);
            cVar2 = cVar2.t(cVar);
        }
    }

    public final org.threeten.bp.c d() {
        return (org.threeten.bp.c) this.a.getValue();
    }

    public final org.threeten.bp.e e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k.a(this.b, eVar.b) && k.a(this.c, eVar.c);
    }

    public final org.threeten.bp.e f() {
        return this.c;
    }

    public int hashCode() {
        org.threeten.bp.e eVar = this.b;
        int i2 = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        org.threeten.bp.e eVar2 = this.c;
        if (eVar2 != null) {
            i2 = eVar2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "DateTimeInterval(from=" + this.b + ", to=" + this.c + ")";
    }

    public /* synthetic */ e(org.threeten.bp.e eVar, org.threeten.bp.e eVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, eVar2);
    }
}
