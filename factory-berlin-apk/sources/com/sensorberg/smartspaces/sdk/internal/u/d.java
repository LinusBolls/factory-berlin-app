package com.sensorberg.smartspaces.sdk.internal.u;

import g.e.k.c;
import g.e.k.e;
import g.e.n.g.g;
import g.e.n.g.y;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: IotDeviceControllerStatus.kt */
public final class d extends c<g.b> {

    /* compiled from: IotDeviceControllerStatus.kt */
    static final class a extends l implements kotlin.e0.c.l<y.a, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f6642h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(1);
            this.f6642h = dVar;
        }

        public final void a(y.a aVar) {
            Object obj;
            d dVar = this.f6642h;
            if (k.a(aVar, y.a.d.a)) {
                obj = g.b.a.a;
            } else {
                obj = g.b.C0724b.a;
            }
            dVar.w(obj);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((y.a) obj);
            return x.a;
        }
    }

    public d(e<y.a> eVar) {
        k.e(eVar, "userStatus");
        z(eVar, new a(this));
    }
}
