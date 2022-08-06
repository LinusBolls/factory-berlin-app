package l;

import kotlin.jvm.internal.k;

/* compiled from: ForwardingSink.kt */
public abstract class j implements z {

    /* renamed from: g  reason: collision with root package name */
    private final z f11108g;

    public j(z zVar) {
        k.f(zVar, "delegate");
        this.f11108g = zVar;
    }

    public final z a() {
        return this.f11108g;
    }

    public void close() {
        this.f11108g.close();
    }

    public c0 e() {
        return this.f11108g.e();
    }

    public void flush() {
        this.f11108g.flush();
    }

    public void p(f fVar, long j2) {
        k.f(fVar, "source");
        this.f11108g.p(fVar, j2);
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f11108g + ')';
    }
}
