package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
final class f1 implements s1 {

    /* renamed from: g  reason: collision with root package name */
    private final boolean f10854g;

    public f1(boolean z) {
        this.f10854g = z;
    }

    public boolean b() {
        return this.f10854g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(b() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }

    public i2 y() {
        return null;
    }
}
