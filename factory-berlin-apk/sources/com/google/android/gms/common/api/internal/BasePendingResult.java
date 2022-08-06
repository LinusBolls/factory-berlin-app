package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.r;
import g.b.a.b.c.b.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult<R extends g> extends e<R> {

    /* renamed from: n  reason: collision with root package name */
    static final ThreadLocal<Boolean> f2040n = new t0();
    private final Object a;
    private final a<R> b;
    private final CountDownLatch c;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<e.a> f2041d;

    /* renamed from: e  reason: collision with root package name */
    private h<? super R> f2042e;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicReference<l0> f2043f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public R f2044g;

    /* renamed from: h  reason: collision with root package name */
    private Status f2045h;

    /* renamed from: i  reason: collision with root package name */
    private volatile boolean f2046i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f2047j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f2048k;

    /* renamed from: l  reason: collision with root package name */
    private volatile j0<R> f2049l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f2050m;
    @KeepName
    private b mResultGuardian;

    public static class a<R extends g> extends d {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(h<? super R> hVar, R r) {
            sendMessage(obtainMessage(1, new Pair(hVar, r)));
        }

        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                Pair pair = (Pair) message.obj;
                h hVar = (h) pair.first;
                g gVar = (g) pair.second;
                try {
                    hVar.a(gVar);
                } catch (RuntimeException e2) {
                    BasePendingResult.k(gVar);
                    throw e2;
                }
            } else if (i2 != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i2);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).l(Status.f2027m);
            }
        }
    }

    private final class b {
        private b() {
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            BasePendingResult.k(BasePendingResult.this.f2044g);
            super.finalize();
        }

        /* synthetic */ b(BasePendingResult basePendingResult, t0 t0Var) {
            this();
        }
    }

    @Deprecated
    BasePendingResult() {
        this.a = new Object();
        this.c = new CountDownLatch(1);
        this.f2041d = new ArrayList<>();
        this.f2043f = new AtomicReference<>();
        this.f2050m = false;
        this.b = new a<>(Looper.getMainLooper());
        new WeakReference((Object) null);
    }

    private final R f() {
        R r;
        synchronized (this.a) {
            r.o(!this.f2046i, "Result has already been consumed.");
            r.o(g(), "Result is not ready.");
            r = this.f2044g;
            this.f2044g = null;
            this.f2042e = null;
            this.f2046i = true;
        }
        l0 andSet = this.f2043f.getAndSet((Object) null);
        if (andSet != null) {
            andSet.a(this);
        }
        return r;
    }

    private final void j(R r) {
        this.f2044g = r;
        this.c.countDown();
        this.f2045h = this.f2044g.a();
        if (this.f2047j) {
            this.f2042e = null;
        } else if (this.f2042e != null) {
            this.b.removeMessages(2);
            this.b.a(this.f2042e, f());
        } else if (this.f2044g instanceof f) {
            this.mResultGuardian = new b(this, (t0) null);
        }
        ArrayList<e.a> arrayList = this.f2041d;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            e.a aVar = arrayList.get(i2);
            i2++;
            aVar.a(this.f2045h);
        }
        this.f2041d.clear();
    }

    public static void k(g gVar) {
        if (gVar instanceof f) {
            try {
                ((f) gVar).a();
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(gVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e2);
            }
        }
    }

    public final void c(e.a aVar) {
        r.b(aVar != null, "Callback cannot be null.");
        synchronized (this.a) {
            if (g()) {
                aVar.a(this.f2045h);
            } else {
                this.f2041d.add(aVar);
            }
        }
    }

    public final R d(long j2, TimeUnit timeUnit) {
        if (j2 > 0) {
            r.j("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        r.o(!this.f2046i, "Result has already been consumed.");
        if (this.f2049l != null) {
            z = false;
        }
        r.o(z, "Cannot await if then() has been called.");
        try {
            if (!this.c.await(j2, timeUnit)) {
                l(Status.f2027m);
            }
        } catch (InterruptedException unused) {
            l(Status.f2026l);
        }
        r.o(g(), "Result is not ready.");
        return f();
    }

    /* access modifiers changed from: protected */
    public abstract R e(Status status);

    public final boolean g() {
        return this.c.getCount() == 0;
    }

    public final void h(R r) {
        synchronized (this.a) {
            if (this.f2048k || this.f2047j) {
                k(r);
                return;
            }
            g();
            boolean z = true;
            r.o(!g(), "Results have already been set");
            if (this.f2046i) {
                z = false;
            }
            r.o(z, "Result has already been consumed");
            j(r);
        }
    }

    public final void l(Status status) {
        synchronized (this.a) {
            if (!g()) {
                e(status);
                h(status);
                this.f2048k = true;
            }
        }
    }

    public final void m() {
        this.f2050m = this.f2050m || f2040n.get().booleanValue();
    }

    protected BasePendingResult(com.google.android.gms.common.api.d dVar) {
        this.a = new Object();
        this.c = new CountDownLatch(1);
        this.f2041d = new ArrayList<>();
        this.f2043f = new AtomicReference<>();
        this.f2050m = false;
        this.b = new a<>(dVar != null ? dVar.b() : Looper.getMainLooper());
        new WeakReference(dVar);
    }
}
