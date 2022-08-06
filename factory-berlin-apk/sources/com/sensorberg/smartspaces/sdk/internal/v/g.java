package com.sensorberg.smartspaces.sdk.internal.v;

import android.os.Handler;
import kotlin.jvm.internal.k;

/* compiled from: TimedCalibration.kt */
public final class g {
    private final Handler a;
    private int b;
    private final long c;

    /* renamed from: d  reason: collision with root package name */
    private final g.e.n.c.d.a f6841d;

    /* compiled from: TimedCalibration.kt */
    static final class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g f6842g;

        a(g gVar) {
            this.f6842g = gVar;
        }

        public final void run() {
            this.f6842g.d();
        }
    }

    /* compiled from: TimedCalibration.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: TimedCalibration.kt */
    static final class c implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g f6843g;

        c(g gVar) {
            this.f6843g = gVar;
        }

        public final void run() {
            this.f6843g.d();
        }
    }

    static {
        new b((DefaultConstructorMarker) null);
    }

    public g(long j2, g.e.n.c.d.a aVar, g.e.p.c.c cVar) {
        k.e(aVar, "bleCalibration");
        k.e(cVar, "handlerProvider");
        this.c = j2;
        this.f6841d = aVar;
        Handler a2 = cVar.a();
        this.a = a2;
        a2.postDelayed(new a(this), 200);
    }

    /* access modifiers changed from: private */
    public final void d() {
        if (this.b < 20) {
            this.a.postDelayed(new c(this), 200);
        }
        this.b++;
    }

    public final void b() {
        this.a.removeCallbacksAndMessages((Object) null);
        if (System.currentTimeMillis() - this.c > 500) {
            this.f6841d.c();
        }
    }

    public final float c() {
        return Math.max((this.f6841d.b() * 1.3f) - ((float) this.b), this.f6841d.a());
    }
}
