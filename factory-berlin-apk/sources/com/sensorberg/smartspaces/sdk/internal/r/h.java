package com.sensorberg.smartspaces.sdk.internal.r;

import com.sensorberg.smartspaces.sdk.internal.v.e;
import g.e.n.g.v;
import g.e.n.g.w;
import java.util.Set;
import kotlin.jvm.internal.k;

/* compiled from: TapControllerDecorator.kt */
public final class h extends a<e> implements v {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(e eVar) {
        super(eVar);
        k.e(eVar, "first");
    }

    /* renamed from: G */
    public void F(e eVar) {
        k.e(eVar, "other");
        e eVar2 = (e) D();
        Set<w> e2 = eVar2.e();
        super.F(eVar);
        for (w wVar : e2) {
            eVar.x(wVar);
            eVar2.l(wVar);
        }
    }

    public void l(w wVar) {
        k.e(wVar, "listener");
        ((e) D()).l(wVar);
    }

    public void x(w wVar) {
        k.e(wVar, "listener");
        ((e) D()).x(wVar);
    }
}
