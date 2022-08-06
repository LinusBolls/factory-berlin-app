package com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.g;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.d;
import com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: IotDeviceDetailsHolderHeader.kt */
public final class c extends a {
    public static final b w = new b((DefaultConstructorMarker) null);
    private e.b t;
    private final com.sensorberg.smartworkspace.app.widgets.b u;
    /* access modifiers changed from: private */
    public final d v;

    /* compiled from: IotDeviceDetailsHolderHeader.kt */
    static final class a extends l implements kotlin.e0.c.l<String, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f7955h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(1);
            this.f7955h = cVar;
        }

        public final void a(String str) {
            k.e(str, "it");
            this.f7955h.v.A(c.N(this.f7955h).a(), str);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((String) obj);
            return x.a;
        }
    }

    /* compiled from: IotDeviceDetailsHolderHeader.kt */
    public static final class b {
        private b() {
        }

        public final a a(ViewGroup viewGroup, d dVar) {
            k.e(viewGroup, "parent");
            k.e(dVar, "viewModel");
            Context context = viewGroup.getContext();
            k.c(context);
            return new c(new com.sensorberg.smartworkspace.app.widgets.b(context, (AttributeSet) null), dVar);
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(com.sensorberg.smartworkspace.app.widgets.b bVar, d dVar) {
        super(bVar);
        k.e(bVar, "header");
        k.e(dVar, "viewModel");
        this.u = bVar;
        this.v = dVar;
        bVar.setOnEditListener(new a(this));
    }

    public static final /* synthetic */ e.b N(c cVar) {
        e.b bVar = cVar.t;
        if (bVar != null) {
            return bVar;
        }
        k.q("data");
        throw null;
    }

    public void M(e eVar) {
        k.e(eVar, "baseData");
        if (eVar instanceof e.b) {
            e.b bVar = (e.b) eVar;
            this.t = bVar;
            com.sensorberg.smartworkspace.app.widgets.b bVar2 = this.u;
            if (bVar != null) {
                bVar2.setTitle(bVar.c());
                com.sensorberg.smartworkspace.app.widgets.b bVar3 = this.u;
                e.b bVar4 = this.t;
                if (bVar4 != null) {
                    bVar3.setEditable(bVar4.d());
                    com.sensorberg.smartworkspace.app.widgets.b bVar5 = this.u;
                    e.b bVar6 = this.t;
                    if (bVar6 != null) {
                        bVar5.setIcon(bVar6.b());
                    } else {
                        k.q("data");
                        throw null;
                    }
                } else {
                    k.q("data");
                    throw null;
                }
            } else {
                k.q("data");
                throw null;
            }
        } else {
            throw new IllegalStateException("Data cannot be " + eVar.getClass() + " for " + getClass());
        }
    }
}
