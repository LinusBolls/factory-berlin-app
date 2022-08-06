package com.sensorberg.smartworkspace.app.screens.door.d;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.lifecycle.f0;
import androidx.navigation.p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sensorberg.factory.R;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartworkspace.app.k.m;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.x;

/* compiled from: FavoriteListFragment.kt */
public final class b extends com.sensorberg.smartworkspace.app.a {
    private HashMap e0;

    /* compiled from: FavoriteListFragment.kt */
    static final class a<T> implements f0<List<? extends c>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f7361g;

        a(a aVar) {
            this.f7361g = aVar;
        }

        /* renamed from: a */
        public final void k(List<? extends c> list) {
            this.f7361g.K(list);
        }
    }

    /* renamed from: com.sensorberg.smartworkspace.app.screens.door.d.b$b  reason: collision with other inner class name */
    /* compiled from: FavoriteListFragment.kt */
    static final class C0484b<T> implements f0<g.e.h.a.a<? extends x>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f7362g;

        /* renamed from: com.sensorberg.smartworkspace.app.screens.door.d.b$b$a */
        /* compiled from: FavoriteListFragment.kt */
        static final class a extends l implements kotlin.e0.c.l<x, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ C0484b f7363h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C0484b bVar) {
                super(1);
                this.f7363h = bVar;
            }

            public final void a(x xVar) {
                k.e(xVar, "it");
                Toast.makeText(this.f7363h.f7362g.C(), R.string.sdk_not_ready, 1).show();
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((x) obj);
                return x.a;
            }
        }

        C0484b(b bVar) {
            this.f7362g = bVar;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<x> aVar) {
            aVar.a(new a(this));
        }
    }

    /* compiled from: FavoriteListFragment.kt */
    static final class c<T> implements f0<g.e.h.a.a<? extends p>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f7364g;

        /* compiled from: FavoriteListFragment.kt */
        static final class a extends l implements kotlin.e0.c.l<p, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ c f7365h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar) {
                super(1);
                this.f7365h = cVar;
            }

            public final void a(p pVar) {
                k.e(pVar, "navDirections");
                androidx.navigation.fragment.a.a(this.f7365h.f7364g).s(pVar);
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((p) obj);
                return x.a;
            }
        }

        c(b bVar) {
            this.f7364g = bVar;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<? extends p> aVar) {
            aVar.a(new a(this));
        }
    }

    /* compiled from: FavoriteListFragment.kt */
    static final class d extends l implements kotlin.e0.c.l<IotUnit, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f7366h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar) {
            super(1);
            this.f7366h = eVar;
        }

        public final void a(IotUnit iotUnit) {
            k.e(iotUnit, "it");
            this.f7366h.I(iotUnit);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((IotUnit) obj);
            return x.a;
        }
    }

    /* compiled from: FavoriteListFragment.kt */
    static final class e extends l implements kotlin.e0.c.l<IotUnit, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f7367h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(e eVar) {
            super(1);
            this.f7367h = eVar;
        }

        public final void a(IotUnit iotUnit) {
            k.e(iotUnit, "it");
            this.f7367h.D(iotUnit);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((IotUnit) obj);
            return x.a;
        }
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        e eVar = (e) m.a.b.a.d.a.b.b(this, v.b(e.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null);
        String X = X(R.string.section_label_favorites);
        k.d(X, "getString(R.string.section_label_favorites)");
        eVar.G(X);
        String X2 = X(R.string.section_label_others);
        k.d(X2, "getString(R.string.section_label_others)");
        eVar.H(X2);
        m mVar = (m) com.sensorberg.smartworkspace.app.a.S1(this, R.layout.frag_favorite_list, (ViewGroup) null, 2, (Object) null);
        mVar.M(eVar);
        RecyclerView recyclerView = mVar.v;
        k.d(recyclerView, "binding.recycler");
        recyclerView.setLayoutManager(new LinearLayoutManager(C()));
        a aVar = new a();
        eVar.x().o(a0(), new a(aVar));
        eVar.A().o(a0(), new C0484b(this));
        eVar.z().o(a0(), new c(this));
        aVar.N(new d(eVar));
        aVar.O(new e(eVar));
        RecyclerView recyclerView2 = mVar.v;
        k.d(recyclerView2, "binding.recycler");
        recyclerView2.setAdapter(aVar);
        return mVar.s();
    }

    public /* synthetic */ void D0() {
        super.D0();
        Q1();
    }

    public void Q1() {
        HashMap hashMap = this.e0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
