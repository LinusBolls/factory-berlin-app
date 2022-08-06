package com.sensorberg.smartspaces.backend.q;

import android.os.SystemClock;
import com.sensorberg.smartspaces.backend.q.f;
import com.sensorberg.smartspaces.sdk.exception.CanceledException;
import g.e.k.e;
import g.e.m.a;
import java.io.IOException;
import k.b0;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.x;
import retrofit2.b;
import retrofit2.d;
import retrofit2.q;

/* compiled from: ObservableRetrofitCall.kt */
public final class g<T> extends e<g.e.m.a<T, Void>> {
    private p<? super a.b, ? super Long, x> q;
    /* access modifiers changed from: private */
    public long r;
    /* access modifiers changed from: private */
    public long s;
    private b<T> t;
    private final a u = new a(this);
    private final k v;

    /* compiled from: ObservableRetrofitCall.kt */
    public static final class a implements d<T> {
        final /* synthetic */ g a;

        a(g gVar) {
            this.a = gVar;
        }

        public void a(b<T> bVar, q<T> qVar) {
            k.e(bVar, "call");
            k.e(qVar, "response");
            if (!bVar.n()) {
                this.a.r = System.currentTimeMillis();
                g gVar = this.a;
                g.e.m.a A = gVar.G(bVar, qVar, gVar.s);
                if (A != null) {
                    this.a.w(A);
                }
            }
        }

        public void b(b<T> bVar, Throwable th) {
            k.e(bVar, "call");
            k.e(th, "t");
            if (!bVar.n()) {
                this.a.r = System.currentTimeMillis();
                g gVar = this.a;
                gVar.w(gVar.F(bVar, th));
            }
        }
    }

    public g(k kVar) {
        k.e(kVar, "responseErrorHandler");
        this.v = kVar;
    }

    /* access modifiers changed from: private */
    public final <T> g.e.m.a<T, Void> F(b<T> bVar, Throwable th) {
        Exception exc;
        if (bVar.n()) {
            exc = new CanceledException();
        } else if (th instanceof IOException) {
            exc = (Exception) th;
        } else {
            exc = new IOException(th);
        }
        n.a.a.m(exc, j.a(bVar) + " failed with " + th.getClass().getSimpleName() + '-' + th.getMessage(), new Object[0]);
        return g.e.m.a.f9908e.c(exc);
    }

    /* access modifiers changed from: private */
    public final <T> g.e.m.a<T, Void> G(b<T> bVar, q<T> qVar, long j2) {
        if (qVar.e()) {
            T a2 = qVar.a();
            n.a.a.a(j.a(bVar) + " success after " + (SystemClock.elapsedRealtime() - j2) + "ms " + a2, new Object[0]);
            return g.e.m.a.f9908e.d(a2);
        }
        f.c cVar = f.f6084d;
        b0 j3 = bVar.j();
        k.d(j3, "call.request()");
        if (cVar.a(j3)) {
            return null;
        }
        return this.v.c(bVar, qVar, j2);
    }

    public final void D() {
        b<T> bVar = this.t;
        if (bVar != null) {
            bVar.cancel();
        }
        w(g.e.m.a.f9908e.c(new CanceledException()));
    }

    public final void E(b<T> bVar) {
        k.e(bVar, "call");
        g.e.m.a aVar = (g.e.m.a) n();
        if ((aVar != null ? aVar.f() : null) != a.b.EXECUTING) {
            if (bVar.n0()) {
                bVar = bVar.i();
                k.d(bVar, "call.clone()");
            }
            this.t = bVar;
            this.s = SystemClock.elapsedRealtime();
            n.a.a.a(j.a(bVar) + " starting", new Object[0]);
            a.C0681a aVar2 = g.e.m.a.f9908e;
            g.e.m.a aVar3 = (g.e.m.a) n();
            w(a.C0681a.b(aVar2, (Object) null, aVar3 != null ? aVar3.c() : null, 1, (Object) null));
            bVar.i().t0(this.u);
        }
    }

    public final void H(p<? super a.b, ? super Long, x> pVar) {
        this.q = pVar;
    }

    /* access modifiers changed from: protected */
    public void s() {
        p<? super a.b, ? super Long, x> pVar = this.q;
        if (pVar != null) {
            g.e.m.a aVar = (g.e.m.a) n();
            x l2 = pVar.l(aVar != null ? aVar.f() : null, Long.valueOf(this.r));
        }
    }
}
