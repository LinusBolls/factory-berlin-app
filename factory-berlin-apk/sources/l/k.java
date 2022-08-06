package l;

/* compiled from: ForwardingSource.kt */
public abstract class k implements b0 {

    /* renamed from: g  reason: collision with root package name */
    private final b0 f11109g;

    public k(b0 b0Var) {
        kotlin.jvm.internal.k.f(b0Var, "delegate");
        this.f11109g = b0Var;
    }

    public final b0 a() {
        return this.f11109g;
    }

    public void close() {
        this.f11109g.close();
    }

    public c0 e() {
        return this.f11109g.e();
    }

    public long g0(f fVar, long j2) {
        kotlin.jvm.internal.k.f(fVar, "sink");
        return this.f11109g.g0(fVar, j2);
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f11109g + ')';
    }
}
