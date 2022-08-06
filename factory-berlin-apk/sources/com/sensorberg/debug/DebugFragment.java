package com.sensorberg.debug;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v;
import java.util.HashMap;
import kotlin.e;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

@i(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\rJ-\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0016\u001a\u0004\u0018\u00010\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/sensorberg/debug/DebugFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroyView", "()V", "Lcom/sensorberg/debug/databinding/FragmentDebugBinding;", "binding", "Lcom/sensorberg/debug/databinding/FragmentDebugBinding;", "Lcom/sensorberg/debug/DebugViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/sensorberg/debug/DebugViewModel;", "viewModel", "<init>", "feature-debug_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: DebugFragment.kt */
public final class DebugFragment extends Fragment {
    private HashMap d0;

    /* compiled from: LifecycleOwnerExt.kt */
    public static final class a extends l implements kotlin.e0.c.a<a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ v f5064h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5065i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5066j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(v vVar, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f5064h = vVar;
            this.f5065i = aVar;
            this.f5066j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.n0, com.sensorberg.debug.a] */
        /* renamed from: a */
        public final a d() {
            return m.a.b.a.d.a.b.b(this.f5064h, kotlin.jvm.internal.v.b(a.class), this.f5065i, this.f5066j);
        }
    }

    /* compiled from: DebugFragment.kt */
    static final class b implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ DebugFragment f5067g;

        b(DebugFragment debugFragment) {
            this.f5067g = debugFragment;
        }

        public final void onClick(View view) {
            androidx.navigation.fragment.a.a(this.f5067g).t();
        }
    }

    public DebugFragment() {
        e<T> unused = g.a(new a(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        com.sensorberg.debug.d.a c = com.sensorberg.debug.d.a.c(layoutInflater);
        k.d(c, "FragmentDebugBinding.inflate(inflater)");
        c.b.setNavigationOnClickListener(new b(this));
        return c.b();
    }

    public void D0() {
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
