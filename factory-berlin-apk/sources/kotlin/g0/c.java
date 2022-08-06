package kotlin.g0;

/* compiled from: Ranges.kt */
public final class c extends a {
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final c f10627k = new c(1, 0);

    /* renamed from: l  reason: collision with root package name */
    public static final a f10628l = new a((DefaultConstructorMarker) null);

    /* compiled from: Ranges.kt */
    public static final class a {
        private a() {
        }

        public final c a() {
            return c.f10627k;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public c(int i2, int i3) {
        super(i2, i3, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (!(a() == cVar.a() && d() == cVar.d())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a() * 31) + d();
    }

    public boolean isEmpty() {
        return a() > d();
    }

    public Integer j() {
        return Integer.valueOf(d());
    }

    public Integer k() {
        return Integer.valueOf(a());
    }

    public String toString() {
        return a() + ".." + d();
    }
}
