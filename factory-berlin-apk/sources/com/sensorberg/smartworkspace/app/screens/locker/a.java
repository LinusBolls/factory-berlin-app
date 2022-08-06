package com.sensorberg.smartworkspace.app.screens.locker;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.lifecycle.s0;
import com.sensorberg.factory.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;

/* compiled from: LockerContainerExtensions.kt */
public final class a {

    /* renamed from: com.sensorberg.smartworkspace.app.screens.locker.a$a  reason: collision with other inner class name */
    /* compiled from: FragmentExt.kt */
    public static final class C0495a extends l implements kotlin.e0.c.a<s0> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Fragment f7532h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0495a(Fragment fragment) {
            super(0);
            this.f7532h = fragment;
        }

        /* renamed from: a */
        public final s0 d() {
            d v = this.f7532h.v();
            if (v != null) {
                return v;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
        }
    }

    public static final void a(Fragment fragment, View view) {
        k.e(fragment, "$this$applyBottomPadding");
        k.e(view, "root");
        if (k.a(((com.sensorberg.smartworkspace.app.activities.main.d) m.a.b.a.d.a.a.a(fragment, v.b(com.sensorberg.smartworkspace.app.activities.main.d.class), (m.a.c.j.a) null, new C0495a(fragment), (kotlin.e0.c.a<m.a.c.i.a>) null)).W().l(), Boolean.FALSE)) {
            int paddingLeft = view.getPaddingLeft();
            int paddingTop = view.getPaddingTop();
            int paddingRight = view.getPaddingRight();
            Context context = view.getContext();
            k.d(context, "root.context");
            view.setPadding(paddingLeft, paddingTop, paddingRight, context.getResources().getDimensionPixelSize(R.dimen.bottom_navigation_height));
        }
    }

    public static final void b(Fragment fragment) {
        k.e(fragment, "$this$retry");
        Fragment fragment2 = fragment;
        while (fragment2 != null && !(fragment2 instanceof d)) {
            fragment2 = fragment2.O();
        }
        if (!(fragment2 instanceof d)) {
            n.a.a.c(fragment + " could not locate LockerContainerFragment", new Object[0]);
            fragment2 = null;
        }
        d dVar = (d) fragment2;
        if (dVar != null) {
            dVar.k();
        }
    }
}
