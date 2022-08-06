package l;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;

/* compiled from: ForwardingTimeout.kt */
public class l extends c0 {

    /* renamed from: e  reason: collision with root package name */
    private c0 f11110e;

    public l(c0 c0Var) {
        k.f(c0Var, "delegate");
        this.f11110e = c0Var;
    }

    public c0 a() {
        return this.f11110e.a();
    }

    public c0 b() {
        return this.f11110e.b();
    }

    public long c() {
        return this.f11110e.c();
    }

    public c0 d(long j2) {
        return this.f11110e.d(j2);
    }

    public boolean e() {
        return this.f11110e.e();
    }

    public void f() {
        this.f11110e.f();
    }

    public c0 g(long j2, TimeUnit timeUnit) {
        k.f(timeUnit, "unit");
        return this.f11110e.g(j2, timeUnit);
    }

    public long h() {
        return this.f11110e.h();
    }

    public final c0 i() {
        return this.f11110e;
    }

    public final l j(c0 c0Var) {
        k.f(c0Var, "delegate");
        this.f11110e = c0Var;
        return this;
    }
}
