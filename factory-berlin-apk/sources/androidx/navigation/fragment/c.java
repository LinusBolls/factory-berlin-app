package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import androidx.fragment.app.u;
import androidx.navigation.NavController;
import androidx.navigation.a0;
import androidx.navigation.fragment.b;
import androidx.navigation.s;
import androidx.navigation.w;
import androidx.navigation.x;

/* compiled from: NavHostFragment */
public class c extends Fragment {
    private s d0;
    private Boolean e0 = null;
    private View f0;
    private int g0;
    private boolean h0;

    public static NavController R1(Fragment fragment) {
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.O()) {
            if (fragment2 instanceof c) {
                return ((c) fragment2).T1();
            }
            Fragment j0 = fragment2.P().j0();
            if (j0 instanceof c) {
                return ((c) j0).T1();
            }
        }
        View Z = fragment.Z();
        if (Z != null) {
            return w.a(Z);
        }
        throw new IllegalStateException("Fragment " + fragment + " does not have a NavController set");
    }

    private int S1() {
        int J = J();
        if (J == 0 || J == -1) {
            return d.nav_host_fragment_container;
        }
        return J;
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        g gVar = new g(layoutInflater.getContext());
        gVar.setId(S1());
        return gVar;
    }

    public void D0() {
        super.D0();
        View view = this.f0;
        if (view != null && w.a(view) == this.d0) {
            w.d(this.f0, (NavController) null);
        }
        this.f0 = null;
    }

    public void I0(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.I0(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.NavHost);
        int resourceId = obtainStyledAttributes.getResourceId(a0.NavHost_navGraph, 0);
        if (resourceId != 0) {
            this.g0 = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, e.NavHostFragment);
        if (obtainStyledAttributes2.getBoolean(e.NavHostFragment_defaultNavHost, false)) {
            this.h0 = true;
        }
        obtainStyledAttributes2.recycle();
    }

    public void P0(boolean z) {
        s sVar = this.d0;
        if (sVar != null) {
            sVar.c(z);
        } else {
            this.e0 = Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public x<? extends b.a> Q1() {
        return new b(x1(), B(), S1());
    }

    public void S0(Bundle bundle) {
        super.S0(bundle);
        Bundle A = this.d0.A();
        if (A != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", A);
        }
        if (this.h0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i2 = this.g0;
        if (i2 != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i2);
        }
    }

    public final NavController T1() {
        s sVar = this.d0;
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalStateException("NavController is not available before onCreate()");
    }

    /* access modifiers changed from: protected */
    public void U1(NavController navController) {
        navController.l().a(new DialogFragmentNavigator(x1(), B()));
        navController.l().a(Q1());
    }

    public void V0(View view, Bundle bundle) {
        super.V0(view, bundle);
        if (view instanceof ViewGroup) {
            w.d(view, this.d0);
            if (view.getParent() != null) {
                View view2 = (View) view.getParent();
                this.f0 = view2;
                if (view2.getId() == J()) {
                    w.d(this.f0, this.d0);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("created host view " + view + " is not a ViewGroup");
    }

    public void t0(Context context) {
        super.t0(context);
        if (this.h0) {
            u i2 = P().i();
            i2.v(this);
            i2.j();
        }
    }

    public void w0(Bundle bundle) {
        Bundle bundle2;
        super.w0(bundle);
        s sVar = new s(x1());
        this.d0 = sVar;
        sVar.E(this);
        this.d0.F(v1().c());
        s sVar2 = this.d0;
        Boolean bool = this.e0;
        int i2 = 0;
        sVar2.c(bool != null && bool.booleanValue());
        Bundle bundle3 = null;
        this.e0 = null;
        this.d0.G(o());
        U1(this.d0);
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.h0 = true;
                u i3 = P().i();
                i3.v(this);
                i3.j();
            }
            this.g0 = bundle.getInt("android-support-nav:fragment:graphId");
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            this.d0.z(bundle2);
        }
        int i4 = this.g0;
        if (i4 != 0) {
            this.d0.B(i4);
            return;
        }
        Bundle A = A();
        if (A != null) {
            i2 = A.getInt("android-support-nav:fragment:graphId");
        }
        if (A != null) {
            bundle3 = A.getBundle("android-support-nav:fragment:startDestinationArgs");
        }
        if (i2 != 0) {
            this.d0.C(i2, bundle3);
        }
    }
}
