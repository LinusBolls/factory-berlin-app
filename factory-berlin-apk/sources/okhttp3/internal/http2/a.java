package okhttp3.internal.http2;

/* compiled from: ErrorCode.kt */
public enum a {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8);
    
    public static final C0795a o = null;

    /* renamed from: g  reason: collision with root package name */
    private final int f11335g;

    /* renamed from: okhttp3.internal.http2.a$a  reason: collision with other inner class name */
    /* compiled from: ErrorCode.kt */
    public static final class C0795a {
        private C0795a() {
        }

        public final a a(int i2) {
            for (a aVar : a.values()) {
                if (aVar.a() == i2) {
                    return aVar;
                }
            }
            return null;
        }

        public /* synthetic */ C0795a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        o = new C0795a((DefaultConstructorMarker) null);
    }

    private a(int i2) {
        this.f11335g = i2;
    }

    public final int a() {
        return this.f11335g;
    }
}
