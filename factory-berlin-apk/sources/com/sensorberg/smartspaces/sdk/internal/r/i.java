package com.sensorberg.smartspaces.sdk.internal.r;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.m0;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartspaces.sdk.model.Openable;
import g.e.m.c;
import g.e.n.c.j.a;
import g.e.n.g.b;
import g.e.n.g.e;
import g.e.n.g.t;
import g.e.n.g.x;
import java.util.List;
import kotlin.c0.d;
import kotlin.jvm.internal.k;

/* compiled from: UnitControllerDecorator.kt */
public final class i extends a<x> implements x {

    /* compiled from: UnitControllerDecorator.kt */
    static final class a<I, O> implements e.b.a.c.a<x, LiveData<x.a>> {
        public static final a a = new a();

        a() {
        }

        /* renamed from: b */
        public final LiveData<x.a> a(x xVar) {
            if (xVar != null) {
                return xVar.getStatusLiveData();
            }
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(x xVar) {
        super(xVar);
        k.e(xVar, "first");
    }

    public Object getRootUnits(d<? super c<? extends List<a.b>>> dVar) {
        return ((x) D()).getRootUnits(dVar);
    }

    public LiveData<x.a> getStatusLiveData() {
        LiveData<x.a> c = m0.c(E(), a.a);
        k.d(c, "Transformations.switchMa…it?.getStatusLiveData() }");
        return c;
    }

    public kotlinx.coroutines.e3.c<List<IotUnit>> getUnits(b bVar, t tVar, IotUnit.Type type) {
        k.e(bVar, "availability");
        k.e(tVar, "sorting");
        return ((x) D()).getUnits(bVar, tVar, type);
    }

    public LiveData<g.e.m.a<List<IotUnit>, Void>> getUnitsLiveData(b bVar, t tVar, IotUnit.Type type) {
        k.e(bVar, "availability");
        k.e(tVar, "sorting");
        return ((x) D()).getUnitsLiveData(bVar, tVar, type);
    }

    public LiveData<g.e.m.a<IotUnit, g.e.n.g.i>> openAsLiveData(String str, e eVar) {
        k.e(str, "unitId");
        return ((x) D()).openAsLiveData(str, eVar);
    }

    public LiveData<g.e.m.a<IotUnit, g.e.n.g.i>> openLiveData(Openable openable, e eVar) {
        k.e(openable, "openable");
        return ((x) D()).openLiveData(openable, eVar);
    }
}
