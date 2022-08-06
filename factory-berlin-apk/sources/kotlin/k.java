package kotlin;

import java.io.Serializable;

/* compiled from: Result.kt */
public final class k<T> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public static final a f10687h = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private final Object f10688g;

    /* compiled from: Result.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Result.kt */
    public static final class b implements Serializable {

        /* renamed from: g  reason: collision with root package name */
        public final Throwable f10689g;

        public b(Throwable th) {
            kotlin.jvm.internal.k.e(th, "exception");
            this.f10689g = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && kotlin.jvm.internal.k.a(this.f10689g, ((b) obj).f10689g);
        }

        public int hashCode() {
            return this.f10689g.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f10689g + ')';
        }
    }

    private /* synthetic */ k(Object obj) {
        this.f10688g = obj;
    }

    public static Object a(Object obj) {
        return obj;
    }

    public static boolean b(Object obj, Object obj2) {
        return (obj2 instanceof k) && kotlin.jvm.internal.k.a(obj, ((k) obj2).h());
    }

    public static final Throwable c(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f10689g;
        }
        return null;
    }

    public static int d(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static final boolean e(Object obj) {
        return obj instanceof b;
    }

    public static final boolean f(Object obj) {
        return !(obj instanceof b);
    }

    public static String g(Object obj) {
        if (obj instanceof b) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return b(this.f10688g, obj);
    }

    public final /* synthetic */ Object h() {
        return this.f10688g;
    }

    public int hashCode() {
        return d(this.f10688g);
    }

    public String toString() {
        return g(this.f10688g);
    }
}
