package com.sensorberg.smartspaces.sdk.debug.c.b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.f0;
import androidx.lifecycle.n0;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sensorberg.smartspaces.sdk.debug.c.b.c;
import com.sensorberg.smartspaces.sdk.model.IotDevice;
import com.sensorberg.smartspaces.sdk.model.Property;
import g.e.n.g.n;
import g.e.n.g.o;
import java.util.HashMap;
import java.util.List;
import kotlin.e0.c.p;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: IotDevicesFragment.kt */
public final class b extends Fragment {
    private HashMap d0;

    /* compiled from: IotDevicesFragment.kt */
    static final class a<T> implements f0<String> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Toolbar f6214g;

        a(Toolbar toolbar) {
            this.f6214g = toolbar;
        }

        /* renamed from: a */
        public final void k(String str) {
            Toolbar toolbar = this.f6214g;
            k.d(toolbar, "toolbar");
            toolbar.setTitle((CharSequence) str);
        }
    }

    /* renamed from: com.sensorberg.smartspaces.sdk.debug.c.b.b$b  reason: collision with other inner class name */
    /* compiled from: IotDevicesFragment.kt */
    static final class C0364b<T> implements f0<List<? extends c.C0367c>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f6215g;

        C0364b(a aVar) {
            this.f6215g = aVar;
        }

        /* renamed from: a */
        public final void k(List<? extends c.C0367c> list) {
            this.f6215g.K(list);
        }
    }

    /* compiled from: IotDevicesFragment.kt */
    static final class c extends l implements kotlin.e0.c.l<String, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f6216h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(c cVar) {
            super(1);
            this.f6216h = cVar;
        }

        public final void a(String str) {
            k.e(str, "it");
            this.f6216h.A(str);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((String) obj);
            return x.a;
        }
    }

    /* compiled from: IotDevicesFragment.kt */
    static final /* synthetic */ class d extends i implements p<IotDevice, Property, x> {
        d(b bVar) {
            super(2, bVar, b.class, "requestPropertyInput", "requestPropertyInput(Lcom/sensorberg/smartspaces/sdk/model/IotDevice;Lcom/sensorberg/smartspaces/sdk/model/Property;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
            p((IotDevice) obj, (Property) obj2);
            return x.a;
        }

        public final void p(IotDevice iotDevice, Property property) {
            k.e(iotDevice, "p1");
            k.e(property, "p2");
            ((b) this.f10671h).S1(iotDevice, property);
        }
    }

    /* access modifiers changed from: private */
    public final void S1(IotDevice iotDevice, Property property) {
        com.sensorberg.smartspaces.sdk.debug.c.b.d.a.x0.a(this, iotDevice, property);
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        n0 a2 = q0.a(this).a(c.class);
        k.d(a2, "ViewModelProviders.of(th…cesViewModel::class.java)");
        c cVar = (c) a2;
        View inflate = layoutInflater.inflate(o.smartspaces_debug_iotdevices_screen, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(n.smartspacesContent);
        k.d(recyclerView, "recycler");
        recyclerView.setLayoutManager(new LinearLayoutManager(C()));
        a aVar = new a(new c(cVar), new d(this));
        recyclerView.setAdapter(aVar);
        cVar.y().o(a0(), new a((Toolbar) inflate.findViewById(n.smartspacesToolbar)));
        cVar.w().o(a0(), new C0364b(aVar));
        return inflate;
    }

    public /* synthetic */ void D0() {
        super.D0();
        Q1();
    }

    public void Q1() {
        HashMap hashMap = this.d0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
