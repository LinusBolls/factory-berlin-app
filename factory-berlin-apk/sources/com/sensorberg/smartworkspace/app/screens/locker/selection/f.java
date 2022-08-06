package com.sensorberg.smartworkspace.app.screens.locker.selection;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.f0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartspaces.sdk.model.Schedule;
import com.sensorberg.smartworkspace.app.screens.locker.LockerGroupSelection;
import com.sensorberg.smartworkspace.app.utils.s;
import g.e.d.p;
import g.e.m.a;
import g.e.n.g.c;
import g.e.n.g.t;
import g.e.n.g.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;
import org.threeten.bp.LocalDate;

/* compiled from: LockerSelectionViewModel.kt */
public final class f extends n0 {

    /* renamed from: i  reason: collision with root package name */
    private final LiveData<LockerGroupSelection> f7672i;

    /* renamed from: j  reason: collision with root package name */
    private final LiveData<String> f7673j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final c0<d> f7674k = new c0<>();

    /* renamed from: l  reason: collision with root package name */
    private final LiveData<d> f7675l;

    /* renamed from: m  reason: collision with root package name */
    private final s<e> f7676m;

    /* compiled from: LockerSelectionViewModel.kt */
    static final class a<I, O> implements e.b.a.c.a<d, LockerGroupSelection> {
        public static final a a = new a();

        a() {
        }

        /* renamed from: b */
        public final LockerGroupSelection a(d dVar) {
            if (dVar instanceof d.a) {
                return ((d.a) dVar).a();
            }
            return null;
        }
    }

    /* compiled from: LockerSelectionViewModel.kt */
    static final class b<I, O> implements e.b.a.c.a<LockerGroupSelection, String> {
        public static final b a = new b();

        b() {
        }

        /* renamed from: b */
        public final String a(LockerGroupSelection lockerGroupSelection) {
            if (lockerGroupSelection != null) {
                return lockerGroupSelection.getDisplayName();
            }
            return null;
        }
    }

    /* compiled from: LockerSelectionViewModel.kt */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LockerSelectionViewModel.kt */
    public static abstract class d {

        /* compiled from: LockerSelectionViewModel.kt */
        public static final class a extends d {
            private final LockerGroupSelection a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(LockerGroupSelection lockerGroupSelection) {
                super((DefaultConstructorMarker) null);
                k.e(lockerGroupSelection, "locker");
                this.a = lockerGroupSelection;
            }

            public final LockerGroupSelection a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof a) && k.a(this.a, ((a) obj).a);
                }
                return true;
            }

            public int hashCode() {
                LockerGroupSelection lockerGroupSelection = this.a;
                if (lockerGroupSelection != null) {
                    return lockerGroupSelection.hashCode();
                }
                return 0;
            }

            public String toString() {
                return "ShowAvailable(locker=" + this.a + ")";
            }
        }

        /* compiled from: LockerSelectionViewModel.kt */
        public static final class b extends d {
            public static final b a = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* compiled from: LockerSelectionViewModel.kt */
        public static final class c extends d {
            public static final c a = new c();

            private c() {
                super((DefaultConstructorMarker) null);
            }
        }

        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LockerSelectionViewModel.kt */
    static final class e<I, O> implements e.b.a.c.a<g.e.m.a<List<? extends Schedule>, Void>, List<? extends String>> {
        public static final e a = new e();

        e() {
        }

        /* renamed from: b */
        public final List<String> a(g.e.m.a<List<Schedule>, Void> aVar) {
            List<Schedule> c;
            if (aVar == null || (c = aVar.c()) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(o.p(c, 10));
            for (Schedule iotUnit : c) {
                arrayList.add(iotUnit.getIotUnit().getId());
            }
            return arrayList;
        }
    }

    /* renamed from: com.sensorberg.smartworkspace.app.screens.locker.selection.f$f  reason: collision with other inner class name */
    /* compiled from: LockerSelectionViewModel.kt */
    static final class C0518f<T> implements f0<Object> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f f7677g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ LiveData f7678h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ LiveData f7679i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ LiveData f7680j;

        C0518f(f fVar, LiveData liveData, LiveData liveData2, LiveData liveData3) {
            this.f7677g = fVar;
            this.f7678h = liveData;
            this.f7679i = liveData2;
            this.f7680j = liveData3;
        }

        public final void k(Object obj) {
            this.f7677g.f7674k.u(this.f7677g.w((g.e.m.a) this.f7678h.l(), (e) this.f7679i.l(), (List) this.f7680j.l()));
        }
    }

    static {
        new c((DefaultConstructorMarker) null);
    }

    public f(s<e> sVar, x xVar, g.e.n.g.c cVar) {
        k.e(sVar, "userSelectionResult");
        k.e(xVar, "unitController");
        k.e(cVar, "bookingManager");
        this.f7676m = sVar;
        LocalDate x0 = LocalDate.x0();
        LocalDate F0 = x0.F0(1);
        k.d(x0, "start");
        k.d(F0, "end");
        LiveData b2 = m0.b(c.a.c(cVar, x0, F0, (IotUnit) null, 4, (Object) null), e.a);
        k.d(b2, "Transformations.map(book…?.map { it.iotUnit.id } }");
        LiveData<g.e.m.a<List<IotUnit>, Void>> unitsLiveData = xVar.getUnitsLiveData(g.e.n.g.b.AvailableNow, t.Distance, IotUnit.Type.LOCKER_BOX);
        LiveData<e> a2 = this.f7676m.a();
        C0518f fVar = new C0518f(this, unitsLiveData, a2, b2);
        this.f7674k.v(a2, fVar);
        this.f7674k.v(b2, fVar);
        this.f7674k.v(unitsLiveData, fVar);
        LiveData<d> a3 = p.a.a(this.f7674k);
        this.f7675l = a3;
        LiveData<LockerGroupSelection> b3 = m0.b(a3, a.a);
        k.d(b3, "Transformations.map(visi…le) it.locker else null }");
        this.f7672i = b3;
        LiveData<String> b4 = m0.b(b3, b.a);
        k.d(b4, "Transformations.map(sele…cker) { it?.displayName }");
        this.f7673j = b4;
    }

    /* access modifiers changed from: private */
    public final d w(g.e.m.a<List<IotUnit>, Void> aVar, e eVar, List<String> list) {
        List c2;
        boolean z;
        g.e.h.b.b b2;
        boolean z2;
        LockerGroupSelection lockerGroupSelection = null;
        if ((aVar != null ? aVar.f() : null) == a.b.EXECUTING) {
            return d.c.a;
        }
        if (aVar == null || (c2 = aVar.c()) == null) {
            return d.c.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = c2.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            IotUnit iotUnit = (IotUnit) next;
            if (!iotUnit.isNearby() || (list != null && list.contains(iotUnit.getId()))) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            n.a.a.a("Show Unavailable, none nearby", new Object[0]);
            return d.b.a;
        }
        if (eVar != null && (!c2.isEmpty())) {
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (eVar.a().contains((IotUnit) it2.next())) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (z2) {
                n.a.a.a("Show available from user selection " + eVar, new Object[0]);
                return new d.a(eVar.a());
            }
        }
        IotUnit iotUnit2 = (IotUnit) v.A(c2);
        if (iotUnit2 != null) {
            lockerGroupSelection = LockerGroupSelection.Companion.a(iotUnit2);
        }
        if (lockerGroupSelection != null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (lockerGroupSelection.contains((IotUnit) it3.next())) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                if (((eVar == null || (b2 = eVar.b()) == null) ? 0 : b2.a()) > 1000) {
                    n.a.a.a("Clearing user selection", new Object[0]);
                    this.f7676m.clear();
                }
                n.a.a.a("Show available from closest " + lockerGroupSelection, new Object[0]);
                return new d.a(lockerGroupSelection);
            }
        }
        n.a.a.a("Show unavailable", new Object[0]);
        return d.b.a;
    }

    /* access modifiers changed from: protected */
    public void l() {
        this.f7676m.clear();
        super.l();
    }

    public final LockerGroupSelection t() {
        return this.f7672i.l();
    }

    public final LiveData<String> u() {
        return this.f7673j;
    }

    public final LiveData<d> v() {
        return this.f7675l;
    }
}
