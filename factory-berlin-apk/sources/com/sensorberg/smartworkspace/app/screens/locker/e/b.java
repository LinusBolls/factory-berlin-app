package com.sensorberg.smartworkspace.app.screens.locker.e;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.navigation.p;
import com.sensorberg.smartspaces.sdk.model.Booking;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartworkspace.app.screens.locker.b;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: LockerBookedViewModel.kt */
public final class b extends n0 {

    /* renamed from: i  reason: collision with root package name */
    private final kotlin.e0.c.a<x> f7592i = new e(this);

    /* renamed from: j  reason: collision with root package name */
    private final kotlin.e0.c.a<x> f7593j = new f(this);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final e0<g.e.h.a.a<p>> f7594k;

    /* renamed from: l  reason: collision with root package name */
    private final LiveData<g.e.h.a.a<p>> f7595l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final LiveData<IotUnit> f7596m;

    /* renamed from: n  reason: collision with root package name */
    private final LiveData<String> f7597n;
    private final LiveData<String> o;

    /* compiled from: LockerBookedViewModel.kt */
    static final class a<I, O> implements e.b.a.c.a<g.e.m.a<Booking, Void>, IotUnit> {
        public static final a a = new a();

        a() {
        }

        /* renamed from: b */
        public final IotUnit a(g.e.m.a<Booking, Void> aVar) {
            Booking c;
            if (aVar == null || (c = aVar.c()) == null) {
                return null;
            }
            return c.getIotUnit();
        }
    }

    /* renamed from: com.sensorberg.smartworkspace.app.screens.locker.e.b$b  reason: collision with other inner class name */
    /* compiled from: LockerBookedViewModel.kt */
    static final class C0508b<I, O> implements e.b.a.c.a<IotUnit, String> {
        public static final C0508b a = new C0508b();

        C0508b() {
        }

        /* renamed from: b */
        public final String a(IotUnit iotUnit) {
            if (iotUnit != null) {
                return iotUnit.getDisplayName();
            }
            return null;
        }
    }

    /* compiled from: LockerBookedViewModel.kt */
    static final class c<I, O> implements e.b.a.c.a<IotUnit, String> {
        public static final c a = new c();

        c() {
        }

        /* renamed from: b */
        public final String a(IotUnit iotUnit) {
            if (iotUnit != null) {
                return iotUnit.getGrouping();
            }
            return null;
        }
    }

    /* compiled from: LockerBookedViewModel.kt */
    static final class d extends l implements kotlin.e0.c.l<List<? extends Booking>, Booking> {

        /* renamed from: h  reason: collision with root package name */
        public static final d f7598h = new d();

        d() {
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

    /* compiled from: LockerBookedViewModel.kt */
    static final class e extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f7599h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.f7599h = bVar;
        }

        public final void a() {
            b.a aVar = com.sensorberg.smartworkspace.app.screens.locker.b.a;
            Object l2 = this.f7599h.f7596m.l();
            k.c(l2);
            k.d(l2, "iotUnit.value!!");
            this.f7599h.f7594k.u(new g.e.h.a.a(aVar.b((IotUnit) l2, true)));
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: LockerBookedViewModel.kt */
    static final class f extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f7600h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(0);
            this.f7600h = bVar;
        }

        public final void a() {
            b.a aVar = com.sensorberg.smartworkspace.app.screens.locker.b.a;
            Object l2 = this.f7600h.f7596m.l();
            k.c(l2);
            k.d(l2, "iotUnit.value!!");
            this.f7600h.f7594k.u(new g.e.h.a.a(aVar.b((IotUnit) l2, false)));
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    public b(g.e.n.g.c cVar) {
        k.e(cVar, "bookingManager");
        e0<g.e.h.a.a<p>> e0Var = new e0<>();
        this.f7594k = e0Var;
        this.f7595l = e0Var;
        LiveData<IotUnit> b = m0.b(g.e.m.d.a.a(cVar.m(), d.f7598h), a.a);
        k.d(b, "Transformations.map(book…se) { it?.data?.iotUnit }");
        this.f7596m = b;
        LiveData<String> b2 = m0.b(b, C0508b.a);
        k.d(b2, "Transformations.map(iotUnit) { it?.displayName }");
        this.f7597n = b2;
        LiveData<String> b3 = m0.b(this.f7596m, c.a);
        k.d(b3, "Transformations.map(iotUnit) { it?.grouping }");
        this.o = b3;
    }

    public final LiveData<String> t() {
        return this.f7597n;
    }

    public final LiveData<g.e.h.a.a<p>> u() {
        return this.f7595l;
    }

    public final kotlin.e0.c.a<x> v() {
        return this.f7592i;
    }

    public final kotlin.e0.c.a<x> w() {
        return this.f7593j;
    }

    public final LiveData<String> x() {
        return this.o;
    }
}
