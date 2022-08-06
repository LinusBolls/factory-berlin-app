package kotlin;

import kotlin.jvm.internal.k;

/* compiled from: UShort.kt */
public final class v implements Comparable<v> {

    /* renamed from: g  reason: collision with root package name */
    private final short f10705g;

    /* compiled from: UShort.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    private /* synthetic */ v(short s) {
        this.f10705g = s;
    }

    public static final /* synthetic */ v a(short s) {
        return new v(s);
    }

    private int f(short s) {
        return h(this.f10705g, s);
    }

    private static int h(short s, short s2) {
        return k.g(s & 65535, s2 & 65535);
    }

    public static short i(short s) {
        return s;
    }

    public static boolean j(short s, Object obj) {
        return (obj instanceof v) && s == ((v) obj).n();
    }

    public static int k(short s) {
        return s;
    }

    public static String l(short s) {
        return String.valueOf(s & 65535);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return f(((v) obj).n());
    }

    public boolean equals(Object obj) {
        return j(this.f10705g, obj);
    }

    public int hashCode() {
        short s = this.f10705g;
        k(s);
        return s;
    }

    public final /* synthetic */ short n() {
        return this.f10705g;
    }

    public String toString() {
        return l(this.f10705g);
    }
}
