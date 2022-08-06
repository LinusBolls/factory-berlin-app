package kotlin;

/* compiled from: ULong.kt */
public final class s implements Comparable<s> {

    /* renamed from: g  reason: collision with root package name */
    private final long f10701g;

    /* compiled from: ULong.kt */
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

    private /* synthetic */ s(long j2) {
        this.f10701g = j2;
    }

    public static final /* synthetic */ s a(long j2) {
        return new s(j2);
    }

    private int f(long j2) {
        return h(this.f10701g, j2);
    }

    private static int h(long j2, long j3) {
        return y.b(j2, j3);
    }

    public static long i(long j2) {
        return j2;
    }

    public static boolean j(long j2, Object obj) {
        return (obj instanceof s) && j2 == ((s) obj).n();
    }

    public static int k(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static String l(long j2) {
        return y.c(j2);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return f(((s) obj).n());
    }

    public boolean equals(Object obj) {
        return j(this.f10701g, obj);
    }

    public int hashCode() {
        return k(this.f10701g);
    }

    public final /* synthetic */ long n() {
        return this.f10701g;
    }

    public String toString() {
        return l(this.f10701g);
    }
}
