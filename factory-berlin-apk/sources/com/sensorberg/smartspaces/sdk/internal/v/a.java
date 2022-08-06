package com.sensorberg.smartspaces.sdk.internal.v;

import com.sensorberg.smartspaces.sdk.internal.unit.c;
import com.sensorberg.smartspaces.sdk.internal.v.h;
import g.e.k.e;
import g.e.n.g.x;
import g.e.n.g.y;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: AwaitAllReady.kt */
public final class a implements h.a {
    private boolean a;
    private final g.e.k.a b;
    private final e<Boolean> c;

    /* renamed from: d  reason: collision with root package name */
    private final e<y.a> f6785d;

    /* renamed from: e  reason: collision with root package name */
    private final c f6786e;

    /* renamed from: f  reason: collision with root package name */
    private final kotlin.e0.c.a<x> f6787f;

    public a(g.e.k.a aVar, e<Boolean> eVar, e<y.a> eVar2, c cVar, kotlin.e0.c.a<x> aVar2) {
        k.e(aVar, "cancel");
        k.e(eVar2, "userStatus");
        k.e(cVar, "unitControllerStatus");
        k.e(aVar2, "callback");
        this.b = aVar;
        this.c = eVar;
        this.f6785d = eVar2;
        this.f6786e = cVar;
        this.f6787f = aVar2;
    }

    public void a() {
        if (!this.a) {
            y.a n2 = this.f6785d.n();
            x.a aVar = (x.a) this.f6786e.n();
            n.a.a.a("awaiting... SDK(" + n2 + ") UnitCtl(" + aVar + ')', new Object[0]);
            boolean z = aVar instanceof x.a.f;
            if ((n2 instanceof y.a.d) && z) {
                this.a = true;
                this.f6787f.d();
                this.b.b();
            }
            if (aVar instanceof x.a.c) {
                this.a = true;
                this.b.b();
            }
            if ((n2 instanceof y.a.b) || (n2 instanceof y.a.c)) {
                this.a = true;
                this.b.b();
            }
        }
    }

    public Collection<e<? extends Object>> b() {
        List i2;
        e<Boolean> eVar = this.c;
        if (eVar != null && (i2 = n.i(this.f6785d, this.f6786e, eVar)) != null) {
            return i2;
        }
        return n.i(this.f6785d, this.f6786e);
    }
}
