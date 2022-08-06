package com.sensorberg.smartworkspace.app.screens.locker;

import android.os.Handler;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import com.sensorberg.smartspaces.sdk.model.Booking;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import g.e.d.p;
import g.e.n.g.r;
import g.e.n.g.s;
import g.e.n.g.t;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: LockerContainerViewModel.kt */
public final class c extends n0 {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final e0<b> f7533i = new e0<>();

    /* renamed from: j  reason: collision with root package name */
    private final LiveData<b> f7534j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public Runnable f7535k;

    /* renamed from: l  reason: collision with root package name */
    private final s f7536l;

    /* renamed from: m  reason: collision with root package name */
    private final LiveData<Boolean> f7537m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Handler f7538n;

    /* compiled from: LockerContainerViewModel.kt */
    static final class a<I, O> implements e.b.a.c.a<b, LiveData<b>> {
        final /* synthetic */ c a;

        /* renamed from: com.sensorberg.smartworkspace.app.screens.locker.c$a$a  reason: collision with other inner class name */
        /* compiled from: LockerContainerViewModel.kt */
        static final class C0497a implements Runnable {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ a f7539g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ b f7540h;

            C0497a(a aVar, b bVar) {
                this.f7539g = aVar;
                this.f7540h = bVar;
            }

            public final void run() {
                this.f7539g.a.f7533i.u(this.f7540h);
            }
        }

        a(c cVar) {
            this.a = cVar;
        }

        /* renamed from: b */
        public final LiveData<b> a(b bVar) {
            this.a.f7538n.removeCallbacks(this.a.f7535k);
            this.a.f7535k = new C0497a(this, bVar);
            this.a.f7538n.postDelayed(this.a.f7535k, this.a.f7533i.l() == null ? 0 : 1000);
            return this.a.f7533i;
        }
    }

    /* compiled from: LockerContainerViewModel.kt */
    public enum b {
        SHOW_NONE_NEARBY,
        SHOW_SELECTION,
        SHOW_CURRENT_BOOKED,
        SHOW_ERROR,
        SHOW_LOADING
    }

    /* renamed from: com.sensorberg.smartworkspace.app.screens.locker.c$c  reason: collision with other inner class name */
    /* compiled from: LockerContainerViewModel.kt */
    static final class C0498c extends l implements kotlin.e0.c.l<List<? extends Booking>, Booking> {

        /* renamed from: h  reason: collision with root package name */
        public static final C0498c f7547h = new C0498c();

        C0498c() {
            super(1);
        }

        /* renamed from: a */
        public final Booking o(List<Booking> list) {
            boolean z;
            T t = null;
            if (list == null) {
                return null;
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                IotUnit iotUnit = ((Booking) next).getIotUnit();
                if ((iotUnit != null ? iotUnit.getType() : null) == IotUnit.Type.LOCKER_BOX) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    t = next;
                    break;
                }
            }
            return (Booking) t;
        }
    }

    /* compiled from: LockerContainerViewModel.kt */
    static final class d<T> implements f0<Object> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f7548g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c0 f7549h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ LiveData f7550i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ LiveData f7551j;

        d(c cVar, c0 c0Var, LiveData liveData, LiveData liveData2) {
            this.f7548g = cVar;
            this.f7549h = c0Var;
            this.f7550i = liveData;
            this.f7551j = liveData2;
        }

        public final void k(Object obj) {
            this.f7549h.u(this.f7548g.z((g.e.m.a) this.f7550i.l(), (g.e.m.a) this.f7551j.l()));
        }
    }

    public c(s sVar, LiveData<Boolean> liveData, Handler handler) {
        k.e(sVar, "smartSpacesSdk");
        k.e(liveData, "bluetoothError");
        k.e(handler, "handler");
        this.f7536l = sVar;
        this.f7537m = liveData;
        this.f7538n = handler;
        LiveData<g.e.m.a<O, P>> a2 = g.e.m.d.a.a(this.f7536l.l().m(), C0498c.f7547h);
        LiveData<X> a3 = m0.a(this.f7536l.i().getUnitsLiveData(g.e.n.g.b.AvailableNow, t.Distance, IotUnit.Type.LOCKER_BOX));
        k.b(a3, "Transformations.distinctUntilChanged(this)");
        c0 c0Var = new c0();
        d dVar = new d(this, c0Var, a2, a3);
        c0Var.v(a2, dVar);
        c0Var.v(a3, dVar);
        LiveData<b> c = m0.c(p.a.a(c0Var), new a(this));
        k.d(c, "Transformations.switchMa…turn@switchMap _state\n\t\t}");
        this.f7534j = c;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (r6 != true) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00af, code lost:
        if (r6 != true) goto L_0x00b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00ae A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.sensorberg.smartworkspace.app.screens.locker.c.b z(g.e.m.a<com.sensorberg.smartspaces.sdk.model.Booking, java.lang.Void> r5, g.e.m.a<java.util.List<com.sensorberg.smartspaces.sdk.model.IotUnit>, java.lang.Void> r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x00c6
            if (r6 != 0) goto L_0x0006
            goto L_0x00c6
        L_0x0006:
            g.e.m.a$b r0 = r5.f()
            g.e.m.a$b r1 = g.e.m.a.b.EXECUTING
            if (r0 == r1) goto L_0x00c3
            g.e.m.a$b r0 = r6.f()
            g.e.m.a$b r1 = g.e.m.a.b.EXECUTING
            if (r0 != r1) goto L_0x0018
            goto L_0x00c3
        L_0x0018:
            g.e.m.a$b r0 = r5.f()
            g.e.m.a$b r1 = g.e.m.a.b.FAIL
            if (r0 == r1) goto L_0x00c0
            g.e.m.a$b r0 = r6.f()
            g.e.m.a$b r1 = g.e.m.a.b.FAIL
            if (r0 != r1) goto L_0x002a
            goto L_0x00c0
        L_0x002a:
            java.lang.Object r5 = r5.c()
            com.sensorberg.smartspaces.sdk.model.Booking r5 = (com.sensorberg.smartspaces.sdk.model.Booking) r5
            java.lang.Object r6 = r6.c()
            java.util.List r6 = (java.util.List) r6
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L_0x006f
            if (r6 == 0) goto L_0x00b2
            boolean r2 = r6 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0048
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L_0x0048
        L_0x0046:
            r6 = 0
            goto L_0x006c
        L_0x0048:
            java.util.Iterator r6 = r6.iterator()
        L_0x004c:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0046
            java.lang.Object r2 = r6.next()
            com.sensorberg.smartspaces.sdk.model.IotUnit r2 = (com.sensorberg.smartspaces.sdk.model.IotUnit) r2
            boolean r3 = r2.isNearby()
            if (r3 == 0) goto L_0x0068
            com.sensorberg.smartspaces.sdk.model.IotUnit$Type r2 = r2.getType()
            com.sensorberg.smartspaces.sdk.model.IotUnit$Type r3 = com.sensorberg.smartspaces.sdk.model.IotUnit.Type.LOCKER_BOX
            if (r2 != r3) goto L_0x0068
            r2 = 1
            goto L_0x0069
        L_0x0068:
            r2 = 0
        L_0x0069:
            if (r2 == 0) goto L_0x004c
            r6 = 1
        L_0x006c:
            if (r6 != r0) goto L_0x00b2
            goto L_0x00b3
        L_0x006f:
            if (r6 == 0) goto L_0x00b2
            boolean r2 = r6 instanceof java.util.Collection
            if (r2 == 0) goto L_0x007d
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L_0x007d
        L_0x007b:
            r6 = 0
            goto L_0x00af
        L_0x007d:
            java.util.Iterator r6 = r6.iterator()
        L_0x0081:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x007b
            java.lang.Object r2 = r6.next()
            com.sensorberg.smartspaces.sdk.model.IotUnit r2 = (com.sensorberg.smartspaces.sdk.model.IotUnit) r2
            boolean r3 = r2.isNearby()
            if (r3 == 0) goto L_0x00ab
            java.lang.String r2 = r2.getId()
            com.sensorberg.smartspaces.sdk.model.IotUnit r3 = r5.getIotUnit()
            if (r3 == 0) goto L_0x00a2
            java.lang.String r3 = r3.getId()
            goto L_0x00a3
        L_0x00a2:
            r3 = 0
        L_0x00a3:
            boolean r2 = kotlin.jvm.internal.k.a(r2, r3)
            if (r2 == 0) goto L_0x00ab
            r2 = 1
            goto L_0x00ac
        L_0x00ab:
            r2 = 0
        L_0x00ac:
            if (r2 == 0) goto L_0x0081
            r6 = 1
        L_0x00af:
            if (r6 != r0) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r0 = 0
        L_0x00b3:
            if (r0 != 0) goto L_0x00b8
            com.sensorberg.smartworkspace.app.screens.locker.c$b r5 = com.sensorberg.smartworkspace.app.screens.locker.c.b.SHOW_NONE_NEARBY
            return r5
        L_0x00b8:
            if (r5 != 0) goto L_0x00bd
            com.sensorberg.smartworkspace.app.screens.locker.c$b r5 = com.sensorberg.smartworkspace.app.screens.locker.c.b.SHOW_SELECTION
            return r5
        L_0x00bd:
            com.sensorberg.smartworkspace.app.screens.locker.c$b r5 = com.sensorberg.smartworkspace.app.screens.locker.c.b.SHOW_CURRENT_BOOKED
            return r5
        L_0x00c0:
            com.sensorberg.smartworkspace.app.screens.locker.c$b r5 = com.sensorberg.smartworkspace.app.screens.locker.c.b.SHOW_ERROR
            return r5
        L_0x00c3:
            com.sensorberg.smartworkspace.app.screens.locker.c$b r5 = com.sensorberg.smartworkspace.app.screens.locker.c.b.SHOW_LOADING
            return r5
        L_0x00c6:
            com.sensorberg.smartworkspace.app.screens.locker.c$b r5 = com.sensorberg.smartworkspace.app.screens.locker.c.b.SHOW_LOADING
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartworkspace.app.screens.locker.c.z(g.e.m.a, g.e.m.a):com.sensorberg.smartworkspace.app.screens.locker.c$b");
    }

    /* access modifiers changed from: protected */
    public void l() {
        this.f7538n.removeCallbacks(this.f7535k);
        super.l();
    }

    public final LiveData<Boolean> w() {
        return this.f7537m;
    }

    public final LiveData<b> x() {
        return this.f7534j;
    }

    public final void y() {
        this.f7536l.c(n.i(r.MyBookings, r.IotUnits));
    }
}
