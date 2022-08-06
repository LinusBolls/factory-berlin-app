package com.sensorberg.smartspaces.sdk.debug.c.d;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.u;
import androidx.lifecycle.f0;
import androidx.lifecycle.n0;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import com.sensorberg.smartspaces.sdk.debug.c.c.a;
import com.sensorberg.smartspaces.sdk.debug.c.d.c;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import g.e.n.g.n;
import g.e.n.g.o;
import java.util.HashMap;
import kotlin.e0.c.q;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: OverviewFragment.kt */
public final class b extends Fragment {
    private final q<View, Integer, c.i, x> d0 = new d(this);
    private HashMap e0;

    /* compiled from: OverviewFragment.kt */
    static final class a<T> implements f0<String> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Toolbar f6322g;

        a(Toolbar toolbar) {
            this.f6322g = toolbar;
        }

        /* renamed from: a */
        public final void k(String str) {
            this.f6322g.setTitle((CharSequence) str);
        }
    }

    /* renamed from: com.sensorberg.smartspaces.sdk.debug.c.d.b$b  reason: collision with other inner class name */
    /* compiled from: OverviewFragment.kt */
    static final class C0377b<T> implements f0<String> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Toolbar f6323g;

        C0377b(Toolbar toolbar) {
            this.f6323g = toolbar;
        }

        /* renamed from: a */
        public final void k(String str) {
            this.f6323g.setSubtitle((CharSequence) str);
        }
    }

    /* compiled from: OverviewFragment.kt */
    static final class c implements Toolbar.f {
        final /* synthetic */ c a;

        c(c cVar) {
            this.a = cVar;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            k.d(menuItem, "it");
            menuItem.setChecked(true);
            this.a.B(menuItem.getItemId());
            return true;
        }
    }

    /* compiled from: OverviewFragment.kt */
    static final class d extends l implements q<View, Integer, c.i, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f6324h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(3);
            this.f6324h = bVar;
        }

        public final void a(View view, int i2, c.i iVar) {
            k.e(view, "view");
            k.e(iVar, "item");
            a.C0373a aVar = com.sensorberg.smartspaces.sdk.debug.c.c.a.f0;
            IotUnit k2 = iVar.k();
            k.c(k2);
            Fragment a = aVar.a(k2);
            m H = this.f6324h.H();
            if (H != null) {
                u i3 = H.i();
                i3.t(g.e.n.g.l.smartspaces_slide_up, 0, 0, g.e.n.g.l.smartspaces_slide_down);
                i3.v(a);
                i3.b(16908290, a);
                i3.h((String) null);
                i3.j();
            }
        }

        public /* bridge */ /* synthetic */ Object k(Object obj, Object obj2, Object obj3) {
            a((View) obj, ((Number) obj2).intValue(), (c.i) obj3);
            return x.a;
        }
    }

    private final void R1(RecyclerView recyclerView, c cVar) {
        a aVar = new a();
        aVar.O(this.d0);
        recyclerView.setLayoutManager(new LinearLayoutManager(C()));
        recyclerView.setAdapter(aVar);
        RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator instanceof w) {
            ((w) itemAnimator).R(false);
        }
        cVar.w().o(a0(), aVar.L());
    }

    private final void S1(Toolbar toolbar, c cVar) {
        cVar.z().o(a0(), new a(toolbar));
        cVar.y().o(a0(), new C0377b(toolbar));
        SubMenu addSubMenu = toolbar.getMenu().addSubMenu("Sorting");
        MenuItem add = addSubMenu.add(101, 1, 1, "Alphabetical");
        add.setCheckable(true);
        add.setChecked(true);
        MenuItem add2 = addSubMenu.add(101, 2, 2, "Distance");
        k.d(add2, "sortingMenu.add(sorting,…ce, distance, \"Distance\")");
        add2.setCheckable(true);
        addSubMenu.setGroupCheckable(101, true, true);
        SubMenu addSubMenu2 = toolbar.getMenu().addSubMenu("Filtering");
        MenuItem add3 = addSubMenu2.add(102, 3, 3, "All");
        add3.setCheckable(true);
        add3.setChecked(true);
        MenuItem add4 = addSubMenu2.add(102, 4, 4, "Gateway");
        k.d(add4, "filteringMenu.add(filter…eway, gateway, \"Gateway\")");
        add4.setCheckable(true);
        MenuItem add5 = addSubMenu2.add(102, 5, 5, "BlueId");
        k.d(add5, "filteringMenu.add(filter…blueid, blueid, \"BlueId\")");
        add5.setCheckable(true);
        MenuItem add6 = addSubMenu2.add(102, 6, 6, "Unkonwn");
        k.d(add6, "filteringMenu.add(filter…nown, unknown, \"Unkonwn\")");
        add6.setCheckable(true);
        addSubMenu2.setGroupCheckable(102, true, true);
        toolbar.setOnMenuItemClickListener(new c(cVar));
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        n0 a2 = q0.a(this).a(c.class);
        k.d(a2, "ViewModelProviders.of(th…iewViewModel::class.java)");
        c cVar = (c) a2;
        View inflate = layoutInflater.inflate(o.smartspaces_debug_overview_screen, viewGroup, false);
        View findViewById = inflate.findViewById(n.smartspacesContent);
        k.d(findViewById, "root.findViewById(R.id.smartspacesContent)");
        View findViewById2 = inflate.findViewById(n.smartspacesToolbar);
        k.d(findViewById2, "root.findViewById(R.id.smartspacesToolbar)");
        R1((RecyclerView) findViewById, cVar);
        S1((Toolbar) findViewById2, cVar);
        return inflate;
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
