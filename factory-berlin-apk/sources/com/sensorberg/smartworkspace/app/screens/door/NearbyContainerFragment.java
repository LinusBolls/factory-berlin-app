package com.sensorberg.smartworkspace.app.screens.door;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.m;
import androidx.lifecycle.f0;
import androidx.viewpager.widget.ViewPager;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.k.u0;
import com.sensorberg.smartworkspace.app.utils.s;
import com.sensorberg.smartworkspace.app.utils.t;
import com.sensorberg.smartworkspace.app.utils.u;
import java.util.HashMap;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.v;

@i(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ-\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/sensorberg/smartworkspace/app/screens/door/NearbyContainerFragment;", "Lcom/sensorberg/smartworkspace/app/utils/t;", "Lcom/sensorberg/smartworkspace/app/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "<init>", "()V", "Companion", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: NearbyContainerFragment.kt */
public final class NearbyContainerFragment extends com.sensorberg.smartworkspace.app.a implements t {
    private HashMap e0;

    /* compiled from: NearbyContainerFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: NearbyContainerFragment.kt */
    static final class b<T> implements f0<a> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ u0 f7348g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ s f7349h;

        b(u0 u0Var, s sVar) {
            this.f7348g = u0Var;
            this.f7349h = sVar;
        }

        /* renamed from: a */
        public final void k(a aVar) {
            if (aVar != null) {
                ViewPager viewPager = this.f7348g.w;
                k.d(viewPager, "binding.unitsPager");
                viewPager.setCurrentItem(aVar.a());
                this.f7349h.clear();
            }
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        u0 u0Var = (u0) R1(R.layout.frag_nearby_container, (ViewGroup) null);
        ViewPager viewPager = u0Var.w;
        k.d(viewPager, "binding.unitsPager");
        Resources R = R();
        k.d(R, "resources");
        m B = B();
        k.d(B, "childFragmentManager");
        viewPager.setAdapter(new b(R, B));
        u0Var.x.setViewPager(u0Var.w);
        u0Var.M((c) m.a.b.a.d.a.b.b(this, v.b(c.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
        s a2 = u.a(this, "tabChangeRequest");
        a2.a().o(a0(), new b(u0Var, a2));
        return u0Var.s();
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
