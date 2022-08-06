package g.e.m;

import kotlin.jvm.internal.k;

/* compiled from: Response.kt */
public final class a<TYPE, PROGRESS> {

    /* renamed from: e  reason: collision with root package name */
    public static final C0681a f9908e = new C0681a((DefaultConstructorMarker) null);
    private final b a;
    private final TYPE b;
    private final PROGRESS c;

    /* renamed from: d  reason: collision with root package name */
    private final Exception f9909d;

    /* renamed from: g.e.m.a$a  reason: collision with other inner class name */
    /* compiled from: Response.kt */
    public static final class C0681a {
        private C0681a() {
        }

        public static /* synthetic */ a b(C0681a aVar, Object obj, Object obj2, int i2, Object obj3) {
            if ((i2 & 1) != 0) {
                obj = null;
            }
            if ((i2 & 2) != 0) {
                obj2 = null;
            }
            return aVar.a(obj, obj2);
        }

        public final <T, P> a<T, P> a(P p, T t) {
            return new a<>(b.EXECUTING, t, p, (Exception) null);
        }

        public final <T, P> a<T, P> c(Exception exc) {
            return new a<>(b.FAIL, null, null, exc);
        }

        public final <T, P> a<T, P> d(T t) {
            return new a<>(b.SUCCESS, t, null, (Exception) null);
        }

        public /* synthetic */ C0681a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Response.kt */
    public enum b {
        EXECUTING,
        SUCCESS,
        FAIL
    }

    public a(b bVar, TYPE type, PROGRESS progress, Exception exc) {
        k.e(bVar, "status");
        this.a = bVar;
        this.b = type;
        this.c = progress;
        this.f9909d = exc;
    }

    public static /* synthetic */ a b(a aVar, b bVar, TYPE type, PROGRESS progress, Exception exc, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bVar = aVar.a;
        }
        if ((i2 & 2) != 0) {
            type = aVar.b;
        }
        if ((i2 & 4) != 0) {
            progress = aVar.c;
        }
        if ((i2 & 8) != 0) {
            exc = aVar.f9909d;
        }
        return aVar.a(bVar, type, progress, exc);
    }

    public final a<TYPE, PROGRESS> a(b bVar, TYPE type, PROGRESS progress, Exception exc) {
        k.e(bVar, "status");
        return new a<>(bVar, type, progress, exc);
    }

    public final TYPE c() {
        return this.b;
    }

    public final Exception d() {
        return this.f9909d;
    }

    public final PROGRESS e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.a(this.a, aVar.a) && k.a(this.b, aVar.b) && k.a(this.c, aVar.c) && k.a(this.f9909d, aVar.f9909d);
    }

    public final b f() {
        return this.a;
    }

    public int hashCode() {
        b bVar = this.a;
        int i2 = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        TYPE type = this.b;
        int hashCode2 = (hashCode + (type != null ? type.hashCode() : 0)) * 31;
        PROGRESS progress = this.c;
        int hashCode3 = (hashCode2 + (progress != null ? progress.hashCode() : 0)) * 31;
        Exception exc = this.f9909d;
        if (exc != null) {
            i2 = exc.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "Response(status=" + this.a + ", data=" + this.b + ", progress=" + this.c + ", exception=" + this.f9909d + ")";
    }
}
