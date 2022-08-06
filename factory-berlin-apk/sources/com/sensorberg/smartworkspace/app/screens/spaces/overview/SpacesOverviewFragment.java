package com.sensorberg.smartworkspace.app.screens.spaces.overview;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.f0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.screens.spaces.detail.m;
import java.util.HashMap;
import java.util.List;
import kotlin.e;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;

@i(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/sensorberg/smartworkspace/app/screens/spaces/overview/SpacesOverviewFragment;", "Lcom/sensorberg/smartworkspace/app/screens/spaces/overview/g;", "Lcom/sensorberg/smartworkspace/app/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/sensorberg/smartworkspace/app/screens/spaces/overview/SpaceItem;", "spaceItem", "", "onSpaceItemClicked", "(Lcom/sensorberg/smartworkspace/app/screens/spaces/overview/SpaceItem;)V", "", "spanCount$delegate", "Lkotlin/Lazy;", "getSpanCount", "()I", "spanCount", "<init>", "()V", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: SpacesOverviewFragment.kt */
public final class SpacesOverviewFragment extends com.sensorberg.smartworkspace.app.a implements g {
    private final e e0 = g.a(new b(this));
    private HashMap f0;

    /* compiled from: SpacesOverviewFragment.kt */
    static final class a<T> implements f0<List<? extends a>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e f7966g;

        a(e eVar) {
            this.f7966g = eVar;
        }

        /* renamed from: a */
        public final void k(List<? extends a> list) {
            this.f7966g.K(list);
        }
    }

    /* compiled from: SpacesOverviewFragment.kt */
    static final class b extends l implements kotlin.e0.c.a<Integer> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ SpacesOverviewFragment f7967h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SpacesOverviewFragment spacesOverviewFragment) {
            super(0);
            this.f7967h = spacesOverviewFragment;
        }

        public final int a() {
            m mVar = m.a;
            Resources R = this.f7967h.R();
            k.d(R, "resources");
            return mVar.a(R, R.dimen.space_item_max_width, 0.95f, 2);
        }

        public /* bridge */ /* synthetic */ Object d() {
            return Integer.valueOf(a());
        }
    }

    private final int T1() {
        return ((Number) this.e0.getValue()).intValue();
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_spaces, viewGroup, false);
        k.d(inflate, "inflater.inflate(R.layou…spaces, container, false)");
        Resources R = R();
        k.d(R, "resources");
        e eVar = new e(R, this);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.fragment_spaces_recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), T1()));
        recyclerView.setAdapter(eVar);
        RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator instanceof w) {
            ((w) itemAnimator).R(false);
        }
        ((h) m.a.b.a.d.a.b.b(this, v.b(h.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null)).s().o(a0(), new a(eVar));
        return inflate;
    }

    public /* synthetic */ void D0() {
        super.D0();
        Q1();
    }

    public void Q1() {
        HashMap hashMap = this.f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void h(b bVar) {
        k.e(bVar, "spaceItem");
        androidx.navigation.fragment.a.a(this).s(f.a.a(bVar.c(), bVar.b()));
    }
}
