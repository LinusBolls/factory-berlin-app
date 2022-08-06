package kotlin;

/* compiled from: UInt.kt */
public final class q implements Comparable<q> {

    /* renamed from: g  reason: collision with root package name */
    private final int f10697g;

    /* compiled from: UInt.kt */
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

    private /* synthetic */ q(int i2) {
        this.f10697g = i2;
    }

    public static final /* synthetic */ q a(int i2) {
        return new q(i2);
    }

    private int f(int i2) {
        return h(this.f10697g, i2);
    }

    private static int h(int i2, int i3) {
        return y.a(i2, i3);
    }

    public static int i(int i2) {
        return i2;
    }

    public static boolean j(int i2, Object obj) {
        return (obj instanceof q) && i2 == ((q) obj).n();
    }

    public static int k(int i2) {
        return i2;
    }

    public static String l(int i2) {
        return String.valueOf(((long) i2) & 4294967295L);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return f(((q) obj).n());
    }

    public boolean equals(Object obj) {
        return j(this.f10697g, obj);
    }

    public int hashCode() {
        int i2 = this.f10697g;
        k(i2);
        return i2;
    }

    public final /* synthetic */ int n() {
        return this.f10697g;
    }

    public String toString() {
        return l(this.f10697g);
    }
}
