package k.h0.e;

import kotlin.jvm.internal.k;

/* compiled from: Task.kt */
public abstract class a {
    private d a;
    private long b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f10407d;

    public a(String str, boolean z) {
        k.f(str, "name");
        this.c = str;
        this.f10407d = z;
        this.b = -1;
    }

    public final boolean a() {
        return this.f10407d;
    }

    public final String b() {
        return this.c;
    }

    public final long c() {
        return this.b;
    }

    public final d d() {
        return this.a;
    }

    public final void e(d dVar) {
        k.f(dVar, "queue");
        d dVar2 = this.a;
        if (dVar2 != dVar) {
            if (dVar2 == null) {
                this.a = dVar;
                return;
            }
            throw new IllegalStateException("task is in multiple queues".toString());
        }
    }

    public abstract long f();

    public final void g(long j2) {
        this.b = j2;
    }

    public String toString() {
        return this.c;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? true : z);
    }
}
