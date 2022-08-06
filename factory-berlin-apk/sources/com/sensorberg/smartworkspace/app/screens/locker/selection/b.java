package com.sensorberg.smartworkspace.app.screens.locker.selection;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartworkspace.app.screens.locker.LockerGroupSelection;
import g.e.m.a;
import g.e.n.g.r;
import g.e.n.g.s;
import g.e.n.g.t;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.e0.c.l;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: LockerGroupSelectionViewModel.kt */
public final class b extends n0 implements com.sensorberg.smartworkspace.app.screens.locker.error.c {

    /* renamed from: i  reason: collision with root package name */
    private final LiveData<List<LockerGroupSelection>> f7656i;

    /* renamed from: j  reason: collision with root package name */
    private final LiveData<Boolean> f7657j;

    /* renamed from: k  reason: collision with root package name */
    private final LiveData<Boolean> f7658k;

    /* renamed from: l  reason: collision with root package name */
    private final kotlin.e0.c.a<x> f7659l = new d(this);
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final s f7660m;

    /* renamed from: n  reason: collision with root package name */
    private final LiveData<Boolean> f7661n;

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return b.c(((LockerGroupSelection) t).getDisplayName(), ((LockerGroupSelection) t2).getDisplayName());
        }
    }

    /* renamed from: com.sensorberg.smartworkspace.app.screens.locker.selection.b$b  reason: collision with other inner class name */
    /* compiled from: LockerGroupSelectionViewModel.kt */
    static final /* synthetic */ class C0516b extends i implements l<g.e.m.a<List<? extends IotUnit>, Void>, List<? extends LockerGroupSelection>> {
        C0516b(b bVar) {
            super(1, bVar, b.class, "updateGroups", "updateGroups(Lcom/sensorberg/response/Response;)Ljava/util/List;", 0);
        }

        /* renamed from: p */
        public final List<LockerGroupSelection> o(g.e.m.a<List<IotUnit>, Void> aVar) {
            return ((b) this.f10671h).z(aVar);
        }
    }

    /* compiled from: LockerGroupSelectionViewModel.kt */
    static final /* synthetic */ class c extends i implements l<g.e.m.a<List<? extends IotUnit>, Void>, Boolean> {
        c(b bVar) {
            super(1, bVar, b.class, "updateError", "updateError(Lcom/sensorberg/response/Response;)Z", 0);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            return Boolean.valueOf(p((g.e.m.a) obj));
        }

        public final boolean p(g.e.m.a<List<IotUnit>, Void> aVar) {
            return ((b) this.f10671h).y(aVar);
        }
    }

    /* compiled from: LockerGroupSelectionViewModel.kt */
    static final class d extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f7662h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.f7662h = bVar;
        }

        public final void a() {
            this.f7662h.f7660m.d(r.IotUnits);
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    public b(s sVar, LiveData<Boolean> liveData) {
        k.e(sVar, "smartSpacesSdk");
        k.e(liveData, "bluetoothError");
        this.f7660m = sVar;
        this.f7661n = liveData;
        LiveData<g.e.m.a<List<IotUnit>, Void>> unitsLiveData = sVar.i().getUnitsLiveData(g.e.n.g.b.AvailableNow, t.Distance, IotUnit.Type.LOCKER_BOX);
        LiveData<List<LockerGroupSelection>> b = m0.b(unitsLiveData, new c(new C0516b(this)));
        k.d(b, "Transformations.map(source, this::updateGroups)");
        this.f7656i = b;
        LiveData<Boolean> b2 = m0.b(unitsLiveData, new c(new c(this)));
        k.d(b2, "Transformations.map(source, this::updateError)");
        this.f7657j = b2;
        this.f7658k = g.e.m.d.a.b(unitsLiveData);
    }

    /* access modifiers changed from: private */
    public final boolean y(g.e.m.a<List<IotUnit>, Void> aVar) {
        return (aVar != null ? aVar.f() : null) == a.b.FAIL;
    }

    /* access modifiers changed from: private */
    public final List<LockerGroupSelection> z(g.e.m.a<List<IotUnit>, Void> aVar) {
        List<IotUnit> c2;
        if (aVar == null || (c2 = aVar.c()) == null) {
            return n.g();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (IotUnit iotUnit : c2) {
            if (iotUnit.isNearby()) {
                linkedHashSet.add(LockerGroupSelection.Companion.a(iotUnit));
            }
        }
        return v.N(v.R(linkedHashSet), new a());
    }

    public kotlin.e0.c.a<x> a() {
        return this.f7659l;
    }

    public final LiveData<Boolean> u() {
        return this.f7661n;
    }

    public final LiveData<List<LockerGroupSelection>> v() {
        return this.f7656i;
    }

    public final LiveData<Boolean> w() {
        return this.f7657j;
    }

    public final LiveData<Boolean> x() {
        return this.f7658k;
    }
}
