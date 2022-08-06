package kotlinx.coroutines.channels;

import kotlin.jvm.internal.k;

/* compiled from: Channel.kt */
public final class x<T> {
    public static final b b = new b((DefaultConstructorMarker) null);
    private final Object a;

    /* compiled from: Channel.kt */
    public static final class a {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && k.a(this.a, ((a) obj).a);
        }

        public int hashCode() {
            Throwable th = this.a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Closed(" + this.a + ')';
        }
    }

    /* compiled from: Channel.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ x(Object obj) {
        this.a = obj;
    }

    public static final /* synthetic */ x a(Object obj) {
        return new x(obj);
    }

    public static Object b(Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof x) && k.a(obj, ((x) obj2).i());
    }

    public static final Throwable d(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).a;
        }
        throw new IllegalStateException("Channel was not closed".toString());
    }

    public static final T e(Object obj) {
        if (!(obj instanceof a)) {
            return obj;
        }
        throw new IllegalStateException("Channel was closed".toString());
    }

    public static int f(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static final boolean g(Object obj) {
        return obj instanceof a;
    }

    public static String h(Object obj) {
        if (obj instanceof a) {
            return obj.toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.a, obj);
    }

    public int hashCode() {
        return f(this.a);
    }

    public final /* synthetic */ Object i() {
        return this.a;
    }

    public String toString() {
        return h(this.a);
    }
}
