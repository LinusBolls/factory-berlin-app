package com.sensorberg.smartspaces.sdk.internal.unit;

import com.sensorberg.smartspaces.backend.model.units.Action;
import com.sensorberg.smartspaces.backend.model.units.Actuator;
import com.sensorberg.smartspaces.backend.model.units.BeUnit;
import com.sensorberg.smartspaces.sdk.internal.Connector;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartspaces.sdk.model.Schedule;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.c.p;
import kotlin.e0.c.q;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: UnitFiltering.kt */
public final class e {
    public static final e a = new e();

    /* compiled from: UnitFiltering.kt */
    static final class a extends l implements kotlin.e0.c.l<g.e.m.a<List<? extends Schedule>, Void>, Map<IotUnit, ? extends List<? extends g.e.n.c.h.a>>> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f6717h = new a();

        /* renamed from: com.sensorberg.smartspaces.sdk.internal.unit.e$a$a  reason: collision with other inner class name */
        /* compiled from: UnitFiltering.kt */
        static final class C0404a extends l implements kotlin.e0.c.l<List<? extends Schedule>, Map<IotUnit, ? extends List<? extends g.e.n.c.h.a>>> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0404a f6718h = new C0404a();

            C0404a() {
                super(1);
            }

            /* renamed from: a */
            public final Map<IotUnit, List<g.e.n.c.h.a>> o(List<Schedule> list) {
                if (list == null) {
                    return null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Schedule schedule : list) {
                    linkedHashMap.put(schedule.getIotUnit(), schedule.getBusy());
                }
                return e0.m(linkedHashMap);
            }
        }

        a() {
            super(1);
        }

        /* renamed from: a */
        public final Map<IotUnit, List<g.e.n.c.h.a>> o(g.e.m.a<List<Schedule>, Void> aVar) {
            g.e.m.a<O, P> a = g.e.m.b.a(aVar, C0404a.f6718h);
            if (a != null) {
                return (Map) a.c();
            }
            return null;
        }
    }

    /* compiled from: UnitFiltering.kt */
    static final class b extends l implements kotlin.e0.c.l<Actuator, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        public static final b f6719h = new b();

        b() {
            super(1);
        }

        public final boolean a(Actuator actuator) {
            k.e(actuator, "actuator");
            Action action = actuator.actions.get(0);
            k.d(action, "actuator.actions[0]");
            return action.isAvailableNow();
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            return Boolean.valueOf(a((Actuator) obj));
        }
    }

    /* compiled from: UnitFiltering.kt */
    static final class c extends l implements p<List<? extends Connector>, List<? extends String>, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        public static final c f6720h = new c();

        c() {
            super(2);
        }

        public final boolean a(List<? extends Connector> list, List<String> list2) {
            k.e(list, "connectors");
            Connector connector = (Connector) v.A(list);
            if (!(connector instanceof Connector.c)) {
                if (connector instanceof Connector.a) {
                    if (list2 == null || !list2.contains(((Connector.a) connector).g())) {
                        return false;
                    }
                } else if (connector == null) {
                    return false;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return true;
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
            return Boolean.valueOf(a((List) obj, (List) obj2));
        }
    }

    /* compiled from: UnitFiltering.kt */
    static final class d extends l implements p<IotUnit, Map<IotUnit, ? extends List<? extends g.e.n.c.h.a>>, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        public static final d f6721h = new d();

        d() {
            super(2);
        }

        public final boolean a(IotUnit iotUnit, Map<IotUnit, ? extends List<g.e.n.c.h.a>> map) {
            k.e(iotUnit, "iotUnit");
            long currentTimeMillis = System.currentTimeMillis();
            List<g.e.n.c.h.a> list = map != null ? (List) map.get(iotUnit) : null;
            if (list != null) {
                for (g.e.n.c.h.a aVar : list) {
                    Long a = aVar.a();
                    if (currentTimeMillis >= aVar.b() && (a == null || currentTimeMillis < a.longValue())) {
                        if (aVar.c()) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            return true;
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
            return Boolean.valueOf(a((IotUnit) obj, (Map) obj2));
        }
    }

    /* renamed from: com.sensorberg.smartspaces.sdk.internal.unit.e$e  reason: collision with other inner class name */
    /* compiled from: UnitFiltering.kt */
    static final class C0405e extends l implements q<g.e.m.a<List<? extends BeUnit>, Void>, List<? extends String>, g.e.m.a<List<? extends Schedule>, Void>, List<? extends IotUnit>> {

        /* renamed from: h  reason: collision with root package name */
        public static final C0405e f6722h = new C0405e();

        /* renamed from: com.sensorberg.smartspaces.sdk.internal.unit.e$e$a */
        /* compiled from: UnitFiltering.kt */
        static final class a extends l implements p<Actuator, List<? extends Connector>, Boolean> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ List f6723h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(List list) {
                super(2);
                this.f6723h = list;
            }

            public final boolean a(Actuator actuator, List<? extends Connector> list) {
                k.e(actuator, "actuator");
                k.e(list, "connectors");
                return b.f6719h.a(actuator) && c.f6720h.a(list, this.f6723h);
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
                return Boolean.valueOf(a((Actuator) obj, (List) obj2));
            }
        }

        C0405e() {
            super(3);
        }

        /* renamed from: a */
        public final List<IotUnit> k(g.e.m.a<List<BeUnit>, Void> aVar, List<String> list, g.e.m.a<List<Schedule>, Void> aVar2) {
            Map<IotUnit, List<g.e.n.c.h.a>> a2 = a.f6717h.o(aVar2);
            ArrayList arrayList = null;
            if (aVar == null) {
                return null;
            }
            List<IotUnit> a3 = f.c.a(aVar.c(), new a(list));
            if (a3 != null) {
                arrayList = new ArrayList();
                for (T next : a3) {
                    if (d.f6721h.a((IotUnit) next, a2)) {
                        arrayList.add(next);
                    }
                }
            }
            return arrayList;
        }
    }

    /* compiled from: UnitFiltering.kt */
    static final class f extends l implements kotlin.e0.c.l<List<? extends IotUnit>, List<? extends IotUnit>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g.e.k.e f6724h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ g.e.k.e f6725i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ g.e.k.e f6726j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(g.e.k.e eVar, g.e.k.e eVar2, g.e.k.e eVar3) {
            super(1);
            this.f6724h = eVar;
            this.f6725i = eVar2;
            this.f6726j = eVar3;
        }

        /* renamed from: a */
        public final List<IotUnit> o(List<IotUnit> list) {
            return C0405e.f6722h.k((g.e.m.a) this.f6724h.n(), (List) this.f6725i.n(), (g.e.m.a) this.f6726j.n());
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class g<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return b.c(Float.valueOf(-((IotUnit) t).getConnections$sdk_release().get(0).a()), Float.valueOf(-((IotUnit) t2).getConnections$sdk_release().get(0).a()));
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class h<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return b.c(Float.valueOf(-((IotUnit) t).getConnections$sdk_release().get(0).a()), Float.valueOf(-((IotUnit) t2).getConnections$sdk_release().get(0).a()));
        }
    }

    /* compiled from: UnitFiltering.kt */
    static final class i extends l implements kotlin.e0.c.l<g.e.m.a<List<? extends IotUnit>, Void>, g.e.m.a<List<? extends IotUnit>, Void>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g.e.k.e f6727h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ g.e.k.e f6728i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(g.e.k.e eVar, g.e.k.e eVar2) {
            super(1);
            this.f6727h = eVar;
            this.f6728i = eVar2;
        }

        /* renamed from: a */
        public final g.e.m.a<List<IotUnit>, Void> o(g.e.m.a<List<IotUnit>, Void> aVar) {
            return e.a.d(aVar, (g.e.m.a) this.f6727h.n(), (List) this.f6728i.n());
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartspaces.sdk.internal.unit.UnitFiltering$sortByDistanceFlow$1", f = "UnitFiltering.kt", l = {}, m = "invokeSuspend")
    /* compiled from: UnitFiltering.kt */
    static final class j extends kotlin.c0.j.a.k implements q<List<? extends IotUnit>, List<? extends g.e.n.c.d.b>, kotlin.c0.d<? super List<? extends IotUnit>>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private List f6729k;

        /* renamed from: l  reason: collision with root package name */
        private List f6730l;

        /* renamed from: m  reason: collision with root package name */
        int f6731m;

        j(kotlin.c0.d dVar) {
            super(3, dVar);
        }

        public final Object i(Object obj) {
            Object unused = d.c();
            if (this.f6731m == 0) {
                kotlin.l.b(obj);
                return e.a.e(this.f6729k, this.f6730l);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object k(Object obj, Object obj2, Object obj3) {
            return ((j) s((List) obj, (List) obj2, (kotlin.c0.d) obj3)).i(x.a);
        }

        public final kotlin.c0.d<x> s(List<IotUnit> list, List<? extends g.e.n.c.d.b> list2, kotlin.c0.d<? super List<IotUnit>> dVar) {
            k.e(list, "allUnits");
            k.e(list2, "scanResults");
            k.e(dVar, "continuation");
            j jVar = new j(dVar);
            jVar.f6729k = list;
            jVar.f6730l = list2;
            return jVar;
        }
    }

    private e() {
    }

    /* access modifiers changed from: private */
    public final g.e.m.a<List<IotUnit>, Void> d(g.e.m.a<List<IotUnit>, Void> aVar, g.e.m.a<List<IotUnit>, Void> aVar2, List<? extends g.e.n.c.d.b> list) {
        if ((aVar2 != null ? aVar2.c() : null) == null) {
            return aVar;
        }
        if (list == null || list.isEmpty()) {
            return new g.e.m.a<>(aVar2.f(), aVar2.c(), aVar2.e(), aVar2.d());
        }
        ArrayList arrayList = new ArrayList();
        List<IotUnit> c2 = aVar2.c();
        k.c(c2);
        for (IotUnit iotUnit : c2) {
            IotUnit withBleScan$sdk_release = iotUnit.withBleScan$sdk_release(list);
            if (withBleScan$sdk_release != null) {
                iotUnit = withBleScan$sdk_release;
            }
            arrayList.add(iotUnit);
        }
        if (arrayList.size() > 1) {
            r.r(arrayList, new g());
        }
        return new g.e.m.a<>(aVar2.f(), arrayList, aVar2.e(), aVar2.d());
    }

    /* access modifiers changed from: private */
    public final List<IotUnit> e(List<IotUnit> list, List<? extends g.e.n.c.d.b> list2) {
        ArrayList arrayList = new ArrayList();
        for (IotUnit next : list) {
            IotUnit withBleScan$sdk_release = next.withBleScan$sdk_release(list2);
            if (withBleScan$sdk_release != null) {
                next = withBleScan$sdk_release;
            }
            arrayList.add(next);
        }
        if (arrayList.size() > 1) {
            r.r(arrayList, new h());
        }
        return arrayList;
    }

    public final g.e.k.e<g.e.m.a<List<IotUnit>, Void>> c(g.e.k.e<g.e.m.a<List<BeUnit>, Void>> eVar, g.e.k.e<List<String>> eVar2, g.e.k.e<g.e.m.a<List<Schedule>, Void>> eVar3, g.e.k.e<Boolean> eVar4) {
        k.e(eVar, "beUnits");
        k.e(eVar2, "objectIds");
        k.e(eVar3, "schedules");
        k.e(eVar4, "ticTac");
        a aVar = a.f6717h;
        b bVar = b.f6719h;
        c cVar = c.f6720h;
        d dVar = d.f6721h;
        C0405e eVar5 = C0405e.f6722h;
        return com.sensorberg.smartspaces.sdk.internal.h.a.b(n.i(eVar2, eVar4), n.i(eVar, eVar3), new f(eVar, eVar2, eVar3));
    }

    public final g.e.k.e<g.e.m.a<List<IotUnit>, Void>> f(g.e.k.e<g.e.m.a<List<IotUnit>, Void>> eVar, g.e.k.e<List<g.e.n.c.d.b>> eVar2) {
        k.e(eVar, "allUnits");
        k.e(eVar2, "scannerList");
        return g.e.k.h.f(g.e.k.h.a, n.i(eVar, eVar2), (g.e.k.a) null, new i(eVar, eVar2), 2, (Object) null);
    }

    public final kotlinx.coroutines.e3.c<List<IotUnit>> g(kotlinx.coroutines.e3.c<? extends List<IotUnit>> cVar, kotlinx.coroutines.e3.c<? extends List<? extends g.e.n.c.d.b>> cVar2) {
        k.e(cVar, "allUnitsFlow");
        k.e(cVar2, "scanResult");
        return kotlinx.coroutines.e3.e.j(cVar, cVar2, new j((kotlin.c0.d) null));
    }
}
