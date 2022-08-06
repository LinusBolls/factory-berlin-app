package com.sensorberg.smartworkspace.app.screens.locker.delete;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.f0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.navigation.p;
import com.sensorberg.smartspaces.sdk.model.Booking;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartworkspace.app.d;
import com.sensorberg.smartworkspace.app.screens.locker.delete.a;
import com.sensorberg.smartworkspace.app.screens.locker.error.LockerErrorFragment;
import g.e.m.a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: LockerDeleteBookingViewModel.kt */
public final class b extends n0 {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final c0<g.e.h.a.a<p>> f7582i;

    /* renamed from: j  reason: collision with root package name */
    private final LiveData<g.e.h.a.a<p>> f7583j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final g.e.n.g.c f7584k;

    /* compiled from: LockerDeleteBookingViewModel.kt */
    static final class a<T> implements f0<Booking> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f7585g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ LiveData f7586h;

        /* renamed from: com.sensorberg.smartworkspace.app.screens.locker.delete.b$a$a  reason: collision with other inner class name */
        /* compiled from: LockerDeleteBookingViewModel.kt */
        static final class C0504a<T> implements f0<g.e.m.a<Void, Void>> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ a f7587g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ Booking f7588h;

            C0504a(a aVar, Booking booking) {
                this.f7587g = aVar;
                this.f7588h = booking;
            }

            /* renamed from: a */
            public final void k(g.e.m.a<Void, Void> aVar) {
                if (aVar.f() == a.b.SUCCESS) {
                    a.C0503a aVar2 = a.a;
                    IotUnit iotUnit = this.f7588h.getIotUnit();
                    k.c(iotUnit);
                    this.f7587g.f7585g.f7582i.u(new g.e.h.a.a(aVar2.a(iotUnit)));
                } else if (aVar.f() == a.b.FAIL) {
                    this.f7587g.f7585g.f7582i.u(new g.e.h.a.a(d.a.c(LockerErrorFragment.Arguments.b.f7602g)));
                }
            }
        }

        a(b bVar, LiveData liveData) {
            this.f7585g = bVar;
            this.f7586h = liveData;
        }

        /* renamed from: a */
        public final void k(Booking booking) {
            if (booking != null) {
                this.f7585g.f7582i.w(this.f7586h);
                this.f7585g.f7582i.v(this.f7585g.f7584k.p(booking), new C0504a(this, booking));
            }
        }
    }

    /* renamed from: com.sensorberg.smartworkspace.app.screens.locker.delete.b$b  reason: collision with other inner class name */
    /* compiled from: LockerDeleteBookingViewModel.kt */
    static final class C0505b<I, O> implements e.b.a.c.a<g.e.m.a<Booking, Void>, Booking> {
        public static final C0505b a = new C0505b();

        C0505b() {
        }

        /* renamed from: b */
        public final Booking a(g.e.m.a<Booking, Void> aVar) {
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* compiled from: LockerDeleteBookingViewModel.kt */
    static final class c extends l implements kotlin.e0.c.l<List<? extends Booking>, Booking> {

        /* renamed from: h  reason: collision with root package name */
        public static final c f7589h = new c();

        c() {
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

    public b(g.e.n.g.c cVar) {
        k.e(cVar, "bookingManager");
        this.f7584k = cVar;
        c0<g.e.h.a.a<p>> c0Var = new c0<>();
        this.f7582i = c0Var;
        this.f7583j = c0Var;
        LiveData<Y> b = m0.b(g.e.m.d.a.a(this.f7584k.m(), c.f7589h), C0505b.a);
        k.d(b, "Transformations.map(book…nseLiveData) { it?.data }");
        this.f7582i.v(b, new a(this, b));
    }

    public final LiveData<g.e.h.a.a<p>> t() {
        return this.f7583j;
    }
}
