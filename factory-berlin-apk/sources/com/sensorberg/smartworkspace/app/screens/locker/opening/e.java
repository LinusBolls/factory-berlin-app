package com.sensorberg.smartworkspace.app.screens.locker.opening;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.n0;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import g.e.m.a;
import kotlin.e0.c.l;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: LockerOpeningViewModel.kt */
public final class e extends n0 {

    /* renamed from: i  reason: collision with root package name */
    private final g.e.n.g.e f7636i = new g.e.n.g.e();

    /* renamed from: j  reason: collision with root package name */
    private final c0<b> f7637j;

    /* renamed from: k  reason: collision with root package name */
    private final LiveData<b> f7638k;

    /* compiled from: LockerOpeningViewModel.kt */
    static final /* synthetic */ class a extends i implements l<g.e.m.a<IotUnit, g.e.n.g.i>, x> {
        a(e eVar) {
            super(1, eVar, e.class, "updateState", "updateState(Lcom/sensorberg/response/Response;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            p((g.e.m.a) obj);
            return x.a;
        }

        public final void p(g.e.m.a<IotUnit, g.e.n.g.i> aVar) {
            ((e) this.f10671h).t(aVar);
        }
    }

    /* compiled from: LockerOpeningViewModel.kt */
    public enum b {
        SUCCESS,
        FAIL
    }

    public e(IotUnit iotUnit, g.e.n.g.x xVar) {
        k.e(iotUnit, "iotUnit");
        k.e(xVar, "unitController");
        c0<b> c0Var = new c0<>();
        this.f7637j = c0Var;
        this.f7638k = c0Var;
        this.f7637j.v(xVar.openLiveData(iotUnit, this.f7636i), new g(new a(this)));
    }

    /* access modifiers changed from: private */
    public final void t(g.e.m.a<IotUnit, g.e.n.g.i> aVar) {
        n.a.a.a("Locker opening state update: " + aVar, new Object[0]);
        a.b f2 = aVar != null ? aVar.f() : null;
        if (f2 != null) {
            int i2 = f.a[f2.ordinal()];
            if (i2 == 1) {
                this.f7637j.u(b.SUCCESS);
            } else if (i2 == 2) {
                this.f7637j.u(b.FAIL);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void l() {
        g.e.n.g.e.c(this.f7636i, (Exception) null, 1, (Object) null);
    }

    public final LiveData<b> s() {
        return this.f7638k;
    }
}
