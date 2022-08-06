package com.sensorberg.smartspaces.sdk.internal.unit;

import android.os.Handler;
import android.os.HandlerThread;
import com.sensorberg.smartspaces.backend.model.units.Action;
import com.sensorberg.smartspaces.backend.model.units.ActionPeriod;
import com.sensorberg.smartspaces.backend.model.units.Actuator;
import com.sensorberg.smartspaces.backend.model.units.BeUnit;
import java.util.ArrayList;
import java.util.List;
import kotlin.e;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: UnitTicTac.kt */
public final class g extends g.e.k.c<Boolean> {
    /* access modifiers changed from: private */
    public final HandlerThread r;
    private final e s = g.a(new b(this));
    private List<Long> t = n.g();
    private long u;
    private final Runnable v;

    /* compiled from: UnitTicTac.kt */
    static final class a extends l implements kotlin.e0.c.l<g.e.m.a<List<? extends BeUnit>, Void>, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g f6735h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar) {
            super(1);
            this.f6735h = gVar;
        }

        public final void a(g.e.m.a<List<BeUnit>, Void> aVar) {
            this.f6735h.H(aVar != null ? aVar.c() : null);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((g.e.m.a) obj);
            return x.a;
        }
    }

    /* compiled from: UnitTicTac.kt */
    static final class b extends l implements kotlin.e0.c.a<Handler> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g f6736h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar) {
            super(0);
            this.f6736h = gVar;
        }

        /* renamed from: a */
        public final Handler d() {
            return new Handler(this.f6736h.r.getLooper());
        }
    }

    /* compiled from: UnitTicTac.kt */
    static final class c implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g f6737g;

        c(g gVar) {
            this.f6737g = gVar;
        }

        public final void run() {
            if (this.f6737g.o()) {
                g gVar = this.f6737g;
                gVar.w(Boolean.valueOf(!k.a((Boolean) gVar.n(), Boolean.TRUE)));
                n.a.a.a("TicTac", new Object[0]);
                this.f6737g.G();
            }
        }
    }

    public g(g.e.k.e<g.e.m.a<List<BeUnit>, Void>> eVar) {
        k.e(eVar, "beUnits");
        HandlerThread handlerThread = new HandlerThread("UnitTicTac", 1);
        handlerThread.start();
        x xVar = x.a;
        this.r = handlerThread;
        z(eVar, new a(this));
        this.v = new c(this);
    }

    private final Handler E() {
        return (Handler) this.s.getValue();
    }

    private final boolean F() {
        long currentTimeMillis = System.currentTimeMillis();
        for (Long longValue : this.t) {
            long longValue2 = longValue.longValue();
            if (this.u <= longValue2 && currentTimeMillis >= longValue2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final void G() {
        long currentTimeMillis = System.currentTimeMillis() + 1;
        long j2 = Long.MAX_VALUE;
        for (Long longValue : this.t) {
            long longValue2 = longValue.longValue();
            if (currentTimeMillis <= longValue2 && j2 > longValue2) {
                j2 = longValue2;
            }
        }
        if (j2 != Long.MAX_VALUE) {
            long j3 = j2 - currentTimeMillis;
            E().removeCallbacks(this.v);
            n.a.a.a("Scheduling next tick in " + (j3 / 1000) + " seconds", new Object[0]);
            E().postDelayed(this.v, j3);
        }
    }

    /* access modifiers changed from: private */
    public final void H(List<? extends BeUnit> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (BeUnit beUnit : list) {
                List<Actuator> list2 = beUnit.actuators;
                if (list2 != null) {
                    for (Actuator actuator : list2) {
                        List<Action> list3 = actuator.actions;
                        if (list3 != null) {
                            for (Action action : list3) {
                                List<ActionPeriod> list4 = action.periods;
                                k.d(list4, "action.periods");
                                for (ActionPeriod actionPeriod : list4) {
                                    long j2 = (long) 1000;
                                    arrayList.add(Long.valueOf(actionPeriod.startsAt * j2));
                                    arrayList.add(Long.valueOf(actionPeriod.endsAt * j2));
                                }
                            }
                        }
                    }
                }
            }
            E().removeCallbacks(this.v);
            this.t = v.R(arrayList);
            if (o()) {
                G();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void s() {
        super.s();
        if (F()) {
            this.v.run();
        } else {
            G();
        }
    }

    /* access modifiers changed from: protected */
    public void t() {
        E().removeCallbacks(this.v);
        this.u = System.currentTimeMillis();
        super.t();
    }
}
