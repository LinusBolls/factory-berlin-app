package kotlin;

import kotlin.jvm.internal.k;

/* compiled from: UByte.kt */
public final class o implements Comparable<o> {

    /* renamed from: g  reason: collision with root package name */
    private final byte f10693g;

    /* compiled from: UByte.kt */
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

    private /* synthetic */ o(byte b) {
        this.f10693g = b;
    }

    public static final /* synthetic */ o a(byte b) {
        return new o(b);
    }

    private int f(byte b) {
        return h(this.f10693g, b);
    }

    private static int h(byte b, byte b2) {
        return k.g(b & 255, b2 & 255);
    }

    public static byte i(byte b) {
        return b;
    }

    public static boolean j(byte b, Object obj) {
        return (obj instanceof o) && b == ((o) obj).n();
    }

    public static int k(byte b) {
        return b;
    }

    public static String l(byte b) {
        return String.valueOf(b & 255);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return f(((o) obj).n());
    }

    public boolean equals(Object obj) {
        return j(this.f10693g, obj);
    }

    public int hashCode() {
        byte b = this.f10693g;
        k(b);
        return b;
    }

    public final /* synthetic */ byte n() {
        return this.f10693g;
    }

    public String toString() {
        return l(this.f10693g);
    }
}
