package kotlin.c0.j.a;

import java.io.Serializable;
import kotlin.c0.d;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: ContinuationImpl.kt */
public abstract class a implements d<Object>, e, Serializable {

    /* renamed from: g  reason: collision with root package name */
    private final d<Object> f10609g;

    public a(d<Object> dVar) {
        this.f10609g = dVar;
    }

    public StackTraceElement C() {
        return g.d(this);
    }

    public d<x> b(Object obj, d<?> dVar) {
        k.e(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public final d<Object> g() {
        return this.f10609g;
    }

    /* access modifiers changed from: protected */
    public abstract Object i(Object obj);

    public e j() {
        d<Object> dVar = this.f10609g;
        if (!(dVar instanceof e)) {
            dVar = null;
        }
        return (e) dVar;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [kotlin.c0.d<java.lang.Object>, kotlin.c0.d, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r3
        L_0x0001:
            kotlin.c0.j.a.h.b(r0)
            kotlin.c0.d<java.lang.Object> r1 = r0.f10609g
            kotlin.jvm.internal.k.c(r1)
            java.lang.Object r4 = r0.i(r4)     // Catch:{ all -> 0x001a }
            java.lang.Object r2 = kotlin.c0.i.d.c()     // Catch:{ all -> 0x001a }
            if (r4 != r2) goto L_0x0014
            return
        L_0x0014:
            kotlin.k$a r2 = kotlin.k.f10687h     // Catch:{ all -> 0x001a }
            kotlin.k.a(r4)     // Catch:{ all -> 0x001a }
            goto L_0x0024
        L_0x001a:
            r4 = move-exception
            kotlin.k$a r2 = kotlin.k.f10687h
            java.lang.Object r4 = kotlin.l.a(r4)
            kotlin.k.a(r4)
        L_0x0024:
            r0.p()
            boolean r0 = r1 instanceof kotlin.c0.j.a.a
            if (r0 == 0) goto L_0x002f
            r0 = r1
            kotlin.c0.j.a.a r0 = (kotlin.c0.j.a.a) r0
            goto L_0x0001
        L_0x002f:
            r1.m(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.c0.j.a.a.m(java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    public void p() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object C = C();
        if (C == null) {
            C = getClass().getName();
        }
        sb.append(C);
        return sb.toString();
    }
}
