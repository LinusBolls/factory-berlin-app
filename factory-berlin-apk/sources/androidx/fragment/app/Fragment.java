package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.e0;
import androidx.lifecycle.k0;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.p0;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import androidx.savedstate.SavedStateRegistry;
import e.h.k.g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, v, s0, o, androidx.savedstate.b {
    static final Object c0 = new Object();
    Fragment A;
    int B;
    int C;
    String D;
    boolean E;
    boolean F;
    boolean G;
    boolean H;
    boolean I;
    boolean J;
    private boolean K;
    ViewGroup L;
    View M;
    boolean N;
    boolean O;
    c P;
    boolean Q;
    boolean R;
    float S;
    LayoutInflater T;
    boolean U;
    p.b V;
    w W;
    y X;
    e0<v> Y;
    private p0.b Z;
    androidx.savedstate.a a0;
    private int b0;

    /* renamed from: g  reason: collision with root package name */
    int f775g;

    /* renamed from: h  reason: collision with root package name */
    Bundle f776h;

    /* renamed from: i  reason: collision with root package name */
    SparseArray<Parcelable> f777i;

    /* renamed from: j  reason: collision with root package name */
    Boolean f778j;

    /* renamed from: k  reason: collision with root package name */
    String f779k;

    /* renamed from: l  reason: collision with root package name */
    Bundle f780l;

    /* renamed from: m  reason: collision with root package name */
    Fragment f781m;

    /* renamed from: n  reason: collision with root package name */
    String f782n;
    int o;
    private Boolean p;
    boolean q;
    boolean r;
    boolean s;
    boolean t;
    boolean u;
    boolean v;
    int w;
    m x;
    j<?> y;
    m z;

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            Fragment.this.r();
        }
    }

    class b extends f {
        b() {
        }

        public View e(int i2) {
            View view = Fragment.this.M;
            if (view != null) {
                return view.findViewById(i2);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        public boolean f() {
            return Fragment.this.M != null;
        }
    }

    static class c {
        View a;
        Animator b;
        int c;

        /* renamed from: d  reason: collision with root package name */
        int f785d;

        /* renamed from: e  reason: collision with root package name */
        int f786e;

        /* renamed from: f  reason: collision with root package name */
        Object f787f = null;

        /* renamed from: g  reason: collision with root package name */
        Object f788g;

        /* renamed from: h  reason: collision with root package name */
        Object f789h;

        /* renamed from: i  reason: collision with root package name */
        Object f790i;

        /* renamed from: j  reason: collision with root package name */
        Object f791j;

        /* renamed from: k  reason: collision with root package name */
        Object f792k;

        /* renamed from: l  reason: collision with root package name */
        Boolean f793l;

        /* renamed from: m  reason: collision with root package name */
        Boolean f794m;

        /* renamed from: n  reason: collision with root package name */
        androidx.core.app.o f795n;
        androidx.core.app.o o;
        boolean p;
        d q;
        boolean r;

        c() {
            Object obj = Fragment.c0;
            this.f788g = obj;
            this.f789h = null;
            this.f790i = obj;
            this.f791j = null;
            this.f792k = obj;
            this.f795n = null;
            this.o = null;
        }
    }

    interface d {
        void a();

        void b();
    }

    public Fragment() {
        this.f775g = -1;
        this.f779k = UUID.randomUUID().toString();
        this.f782n = null;
        this.p = null;
        this.z = new n();
        this.J = true;
        this.O = true;
        this.V = p.b.RESUMED;
        this.Y = new e0<>();
        b0();
    }

    private void b0() {
        this.W = new w(this);
        this.a0 = androidx.savedstate.a.a(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.W.a(new t() {
                public void d(v vVar, p.a aVar) {
                    View view;
                    if (aVar == p.a.ON_STOP && (view = Fragment.this.M) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
        }
    }

    @Deprecated
    public static Fragment d0(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) i.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.D1(bundle);
            }
            return fragment;
        } catch (InstantiationException e2) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    private c t() {
        if (this.P == null) {
            this.P = new c();
        }
        return this.P;
    }

    public final Bundle A() {
        return this.f780l;
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = this.b0;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void A1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f777i;
        if (sparseArray != null) {
            this.M.restoreHierarchyState(sparseArray);
            this.f777i = null;
        }
        this.K = false;
        W0(bundle);
        if (!this.K) {
            throw new z("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.M != null) {
            this.X.b(p.a.ON_CREATE);
        }
    }

    public final m B() {
        if (this.y != null) {
            return this.z;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void B0() {
        this.K = true;
    }

    /* access modifiers changed from: package-private */
    public void B1(View view) {
        t().a = view;
    }

    public Context C() {
        j<?> jVar = this.y;
        if (jVar == null) {
            return null;
        }
        return jVar.h();
    }

    public void C0() {
    }

    /* access modifiers changed from: package-private */
    public void C1(Animator animator) {
        t().b = animator;
    }

    public Object D() {
        c cVar = this.P;
        if (cVar == null) {
            return null;
        }
        return cVar.f787f;
    }

    public void D0() {
        this.K = true;
    }

    public void D1(Bundle bundle) {
        if (this.x == null || !n0()) {
            this.f780l = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    /* access modifiers changed from: package-private */
    public androidx.core.app.o E() {
        c cVar = this.P;
        if (cVar == null) {
            return null;
        }
        return cVar.f795n;
    }

    public void E0() {
        this.K = true;
    }

    /* access modifiers changed from: package-private */
    public void E1(boolean z2) {
        t().r = z2;
    }

    public Object F() {
        c cVar = this.P;
        if (cVar == null) {
            return null;
        }
        return cVar.f789h;
    }

    public LayoutInflater F0(Bundle bundle) {
        return L(bundle);
    }

    public void F1(boolean z2) {
        if (this.J != z2) {
            this.J = z2;
            if (this.I && e0() && !f0()) {
                this.y.r();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public androidx.core.app.o G() {
        c cVar = this.P;
        if (cVar == null) {
            return null;
        }
        return cVar.o;
    }

    public void G0(boolean z2) {
    }

    /* access modifiers changed from: package-private */
    public void G1(int i2) {
        if (this.P != null || i2 != 0) {
            t().f785d = i2;
        }
    }

    @Deprecated
    public final m H() {
        return this.x;
    }

    @Deprecated
    public void H0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.K = true;
    }

    /* access modifiers changed from: package-private */
    public void H1(int i2) {
        if (this.P != null || i2 != 0) {
            t();
            this.P.f786e = i2;
        }
    }

    public final Object I() {
        j<?> jVar = this.y;
        if (jVar == null) {
            return null;
        }
        return jVar.k();
    }

    public void I0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.K = true;
        j<?> jVar = this.y;
        Activity g2 = jVar == null ? null : jVar.g();
        if (g2 != null) {
            this.K = false;
            H0(g2, attributeSet, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    public void I1(d dVar) {
        t();
        d dVar2 = this.P.q;
        if (dVar != dVar2) {
            if (dVar == null || dVar2 == null) {
                c cVar = this.P;
                if (cVar.p) {
                    cVar.q = dVar;
                }
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    public final int J() {
        return this.B;
    }

    public void J0(boolean z2) {
    }

    public void J1(boolean z2) {
        this.G = z2;
        m mVar = this.x;
        if (mVar == null) {
            this.H = true;
        } else if (z2) {
            mVar.e(this);
        } else {
            mVar.P0(this);
        }
    }

    public final LayoutInflater K() {
        LayoutInflater layoutInflater = this.T;
        return layoutInflater == null ? h1((Bundle) null) : layoutInflater;
    }

    public boolean K0(MenuItem menuItem) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void K1(int i2) {
        t().c = i2;
    }

    @Deprecated
    public LayoutInflater L(Bundle bundle) {
        j<?> jVar = this.y;
        if (jVar != null) {
            LayoutInflater l2 = jVar.l();
            g.b(l2, this.z.g0());
            return l2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void L0(Menu menu) {
    }

    @Deprecated
    public void L1(boolean z2) {
        if (!this.O && z2 && this.f775g < 3 && this.x != null && e0() && this.U) {
            this.x.D0(this);
        }
        this.O = z2;
        this.N = this.f775g < 3 && !z2;
        if (this.f776h != null) {
            this.f778j = Boolean.valueOf(z2);
        }
    }

    /* access modifiers changed from: package-private */
    public int M() {
        c cVar = this.P;
        if (cVar == null) {
            return 0;
        }
        return cVar.f785d;
    }

    public void M0() {
        this.K = true;
    }

    public boolean M1(String str) {
        j<?> jVar = this.y;
        if (jVar != null) {
            return jVar.p(str);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int N() {
        c cVar = this.P;
        if (cVar == null) {
            return 0;
        }
        return cVar.f786e;
    }

    public void N0(boolean z2) {
    }

    public void N1(@SuppressLint({"UnknownNullness"}) Intent intent) {
        O1(intent, (Bundle) null);
    }

    public final Fragment O() {
        return this.A;
    }

    public void O0(Menu menu) {
    }

    public void O1(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        j<?> jVar = this.y;
        if (jVar != null) {
            jVar.q(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final m P() {
        m mVar = this.x;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void P0(boolean z2) {
    }

    public void P1() {
        m mVar = this.x;
        if (mVar == null || mVar.o == null) {
            t().p = false;
        } else if (Looper.myLooper() != this.x.o.i().getLooper()) {
            this.x.o.i().postAtFrontOfQueue(new a());
        } else {
            r();
        }
    }

    public Object Q() {
        c cVar = this.P;
        if (cVar == null) {
            return null;
        }
        Object obj = cVar.f790i;
        return obj == c0 ? F() : obj;
    }

    public void Q0(int i2, String[] strArr, int[] iArr) {
    }

    public final Resources R() {
        return x1().getResources();
    }

    public void R0() {
        this.K = true;
    }

    public final boolean S() {
        return this.G;
    }

    public void S0(Bundle bundle) {
    }

    public Object T() {
        c cVar = this.P;
        if (cVar == null) {
            return null;
        }
        Object obj = cVar.f788g;
        return obj == c0 ? D() : obj;
    }

    public void T0() {
        this.K = true;
    }

    public Object U() {
        c cVar = this.P;
        if (cVar == null) {
            return null;
        }
        return cVar.f791j;
    }

    public void U0() {
        this.K = true;
    }

    public Object V() {
        c cVar = this.P;
        if (cVar == null) {
            return null;
        }
        Object obj = cVar.f792k;
        return obj == c0 ? U() : obj;
    }

    public void V0(View view, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public int W() {
        c cVar = this.P;
        if (cVar == null) {
            return 0;
        }
        return cVar.c;
    }

    public void W0(Bundle bundle) {
        this.K = true;
    }

    public final String X(int i2) {
        return R().getString(i2);
    }

    /* access modifiers changed from: package-private */
    public void X0(Bundle bundle) {
        this.z.C0();
        this.f775g = 2;
        this.K = false;
        q0(bundle);
        if (this.K) {
            this.z.r();
            return;
        }
        throw new z("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public final Fragment Y() {
        String str;
        Fragment fragment = this.f781m;
        if (fragment != null) {
            return fragment;
        }
        m mVar = this.x;
        if (mVar == null || (str = this.f782n) == null) {
            return null;
        }
        return mVar.V(str);
    }

    /* access modifiers changed from: package-private */
    public void Y0() {
        this.z.g(this.y, new b(), this);
        this.f775g = 0;
        this.K = false;
        t0(this.y.h());
        if (!this.K) {
            throw new z("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    public View Z() {
        return this.M;
    }

    /* access modifiers changed from: package-private */
    public void Z0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.z.s(configuration);
    }

    public p a() {
        return this.W;
    }

    public v a0() {
        y yVar = this.X;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    public boolean a1(MenuItem menuItem) {
        if (this.E) {
            return false;
        }
        if (!v0(menuItem) && !this.z.t(menuItem)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void b1(Bundle bundle) {
        this.z.C0();
        this.f775g = 1;
        this.K = false;
        this.a0.c(bundle);
        w0(bundle);
        this.U = true;
        if (this.K) {
            this.W.i(p.a.ON_CREATE);
            return;
        }
        throw new z("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* access modifiers changed from: package-private */
    public void c0() {
        b0();
        this.f779k = UUID.randomUUID().toString();
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.w = 0;
        this.x = null;
        this.z = new n();
        this.y = null;
        this.B = 0;
        this.C = 0;
        this.D = null;
        this.E = false;
        this.F = false;
    }

    /* access modifiers changed from: package-private */
    public boolean c1(Menu menu, MenuInflater menuInflater) {
        boolean z2 = false;
        if (this.E) {
            return false;
        }
        if (this.I && this.J) {
            z2 = true;
            z0(menu, menuInflater);
        }
        return z2 | this.z.v(menu, menuInflater);
    }

    public final SavedStateRegistry d() {
        return this.a0.b();
    }

    /* access modifiers changed from: package-private */
    public void d1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.z.C0();
        this.v = true;
        this.X = new y();
        View A0 = A0(layoutInflater, viewGroup, bundle);
        this.M = A0;
        if (A0 != null) {
            this.X.e();
            this.Y.u(this.X);
        } else if (!this.X.f()) {
            this.X = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public final boolean e0() {
        return this.y != null && this.q;
    }

    /* access modifiers changed from: package-private */
    public void e1() {
        this.z.w();
        this.W.i(p.a.ON_DESTROY);
        this.f775g = 0;
        this.K = false;
        this.U = false;
        B0();
        if (!this.K) {
            throw new z("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final boolean f0() {
        return this.E;
    }

    /* access modifiers changed from: package-private */
    public void f1() {
        this.z.x();
        if (this.M != null) {
            this.X.b(p.a.ON_DESTROY);
        }
        this.f775g = 1;
        this.K = false;
        D0();
        if (this.K) {
            e.o.a.a.b(this).c();
            this.v = false;
            return;
        }
        throw new z("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    public boolean g0() {
        c cVar = this.P;
        if (cVar == null) {
            return false;
        }
        return cVar.r;
    }

    /* access modifiers changed from: package-private */
    public void g1() {
        this.f775g = -1;
        this.K = false;
        E0();
        this.T = null;
        if (!this.K) {
            throw new z("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.z.o0()) {
            this.z.w();
            this.z = new n();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean h0() {
        return this.w > 0;
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater h1(Bundle bundle) {
        LayoutInflater F0 = F0(bundle);
        this.T = F0;
        return F0;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public p0.b i() {
        if (this.x != null) {
            if (this.Z == null) {
                this.Z = new k0(v1().getApplication(), this, A());
            }
            return this.Z;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.x;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i0() {
        /*
            r2 = this;
            boolean r0 = r2.J
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.m r0 = r2.x
            if (r0 == 0) goto L_0x0010
            androidx.fragment.app.Fragment r1 = r2.A
            boolean r0 = r0.r0(r1)
            if (r0 == 0) goto L_0x0012
        L_0x0010:
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.i0():boolean");
    }

    /* access modifiers changed from: package-private */
    public void i1() {
        onLowMemory();
        this.z.y();
    }

    /* access modifiers changed from: package-private */
    public boolean j0() {
        c cVar = this.P;
        if (cVar == null) {
            return false;
        }
        return cVar.p;
    }

    /* access modifiers changed from: package-private */
    public void j1(boolean z2) {
        J0(z2);
        this.z.z(z2);
    }

    public final boolean k0() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public boolean k1(MenuItem menuItem) {
        if (this.E) {
            return false;
        }
        if ((!this.I || !this.J || !K0(menuItem)) && !this.z.A(menuItem)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean l0() {
        Fragment O2 = O();
        return O2 != null && (O2.k0() || O2.l0());
    }

    /* access modifiers changed from: package-private */
    public void l1(Menu menu) {
        if (!this.E) {
            if (this.I && this.J) {
                L0(menu);
            }
            this.z.B(menu);
        }
    }

    public final boolean m0() {
        return this.f775g >= 4;
    }

    /* access modifiers changed from: package-private */
    public void m1() {
        this.z.D();
        if (this.M != null) {
            this.X.b(p.a.ON_PAUSE);
        }
        this.W.i(p.a.ON_PAUSE);
        this.f775g = 3;
        this.K = false;
        M0();
        if (!this.K) {
            throw new z("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    public final boolean n0() {
        m mVar = this.x;
        if (mVar == null) {
            return false;
        }
        return mVar.u0();
    }

    /* access modifiers changed from: package-private */
    public void n1(boolean z2) {
        N0(z2);
        this.z.E(z2);
    }

    public r0 o() {
        m mVar = this.x;
        if (mVar != null) {
            return mVar.l0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.M;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean o0() {
        /*
            r1 = this;
            boolean r0 = r1.e0()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r1.f0()
            if (r0 != 0) goto L_0x0020
            android.view.View r0 = r1.M
            if (r0 == 0) goto L_0x0020
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L_0x0020
            android.view.View r0 = r1.M
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.o0():boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean o1(Menu menu) {
        boolean z2 = false;
        if (this.E) {
            return false;
        }
        if (this.I && this.J) {
            z2 = true;
            O0(menu);
        }
        return z2 | this.z.F(menu);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.K = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        v1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.K = true;
    }

    /* access modifiers changed from: package-private */
    public void p0() {
        this.z.C0();
    }

    /* access modifiers changed from: package-private */
    public void p1() {
        boolean s0 = this.x.s0(this);
        Boolean bool = this.p;
        if (bool == null || bool.booleanValue() != s0) {
            this.p = Boolean.valueOf(s0);
            P0(s0);
            this.z.G();
        }
    }

    public void q0(Bundle bundle) {
        this.K = true;
    }

    /* access modifiers changed from: package-private */
    public void q1() {
        this.z.C0();
        this.z.Q(true);
        this.f775g = 4;
        this.K = false;
        R0();
        if (this.K) {
            this.W.i(p.a.ON_RESUME);
            if (this.M != null) {
                this.X.b(p.a.ON_RESUME);
            }
            this.z.H();
            return;
        }
        throw new z("Fragment " + this + " did not call through to super.onResume()");
    }

    /* access modifiers changed from: package-private */
    public void r() {
        c cVar = this.P;
        d dVar = null;
        if (cVar != null) {
            cVar.p = false;
            d dVar2 = cVar.q;
            cVar.q = null;
            dVar = dVar2;
        }
        if (dVar != null) {
            dVar.a();
        }
    }

    public void r0(int i2, int i3, Intent intent) {
    }

    /* access modifiers changed from: package-private */
    public void r1(Bundle bundle) {
        S0(bundle);
        this.a0.d(bundle);
        Parcelable T0 = this.z.T0();
        if (T0 != null) {
            bundle.putParcelable("android:support:fragments", T0);
        }
    }

    public void s(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.B));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.C));
        printWriter.print(" mTag=");
        printWriter.println(this.D);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f775g);
        printWriter.print(" mWho=");
        printWriter.print(this.f779k);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.q);
        printWriter.print(" mRemoving=");
        printWriter.print(this.r);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.s);
        printWriter.print(" mInLayout=");
        printWriter.println(this.t);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.E);
        printWriter.print(" mDetached=");
        printWriter.print(this.F);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.J);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.I);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.G);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.O);
        if (this.x != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.x);
        }
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.y);
        }
        if (this.A != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.A);
        }
        if (this.f780l != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f780l);
        }
        if (this.f776h != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f776h);
        }
        if (this.f777i != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f777i);
        }
        Fragment Y2 = Y();
        if (Y2 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(Y2);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.o);
        }
        if (M() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(M());
        }
        if (this.L != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.L);
        }
        if (this.M != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.M);
        }
        if (y() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(y());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(W());
        }
        if (C() != null) {
            e.o.a.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.z + ":");
        m mVar = this.z;
        mVar.M(str + "  ", fileDescriptor, printWriter, strArr);
    }

    @Deprecated
    public void s0(Activity activity) {
        this.K = true;
    }

    /* access modifiers changed from: package-private */
    public void s1() {
        this.z.C0();
        this.z.Q(true);
        this.f775g = 3;
        this.K = false;
        T0();
        if (this.K) {
            this.W.i(p.a.ON_START);
            if (this.M != null) {
                this.X.b(p.a.ON_START);
            }
            this.z.I();
            return;
        }
        throw new z("Fragment " + this + " did not call through to super.onStart()");
    }

    public void t0(Context context) {
        this.K = true;
        j<?> jVar = this.y;
        Activity g2 = jVar == null ? null : jVar.g();
        if (g2 != null) {
            this.K = false;
            s0(g2);
        }
    }

    /* access modifiers changed from: package-private */
    public void t1() {
        this.z.K();
        if (this.M != null) {
            this.X.b(p.a.ON_STOP);
        }
        this.W.i(p.a.ON_STOP);
        this.f775g = 2;
        this.K = false;
        U0();
        if (!this.K) {
            throw new z("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f779k);
        sb.append(")");
        if (this.B != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.B));
        }
        if (this.D != null) {
            sb.append(" ");
            sb.append(this.D);
        }
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public Fragment u(String str) {
        if (str.equals(this.f779k)) {
            return this;
        }
        return this.z.Y(str);
    }

    public void u0(Fragment fragment) {
    }

    public final void u1(String[] strArr, int i2) {
        j<?> jVar = this.y;
        if (jVar != null) {
            jVar.m(this, strArr, i2);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final d v() {
        j<?> jVar = this.y;
        if (jVar == null) {
            return null;
        }
        return (d) jVar.g();
    }

    public boolean v0(MenuItem menuItem) {
        return false;
    }

    public final d v1() {
        d v2 = v();
        if (v2 != null) {
            return v2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public boolean w() {
        Boolean bool;
        c cVar = this.P;
        if (cVar == null || (bool = cVar.f794m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void w0(Bundle bundle) {
        this.K = true;
        z1(bundle);
        if (!this.z.t0(1)) {
            this.z.u();
        }
    }

    public final Bundle w1() {
        Bundle A2 = A();
        if (A2 != null) {
            return A2;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public boolean x() {
        Boolean bool;
        c cVar = this.P;
        if (cVar == null || (bool = cVar.f793l) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public Animation x0(int i2, boolean z2, int i3) {
        return null;
    }

    public final Context x1() {
        Context C2 = C();
        if (C2 != null) {
            return C2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* access modifiers changed from: package-private */
    public View y() {
        c cVar = this.P;
        if (cVar == null) {
            return null;
        }
        return cVar.a;
    }

    public Animator y0(int i2, boolean z2, int i3) {
        return null;
    }

    public final View y1() {
        View Z2 = Z();
        if (Z2 != null) {
            return Z2;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* access modifiers changed from: package-private */
    public Animator z() {
        c cVar = this.P;
        if (cVar == null) {
            return null;
        }
        return cVar.b;
    }

    public void z0(Menu menu, MenuInflater menuInflater) {
    }

    /* access modifiers changed from: package-private */
    public void z1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.z.R0(parcelable);
            this.z.u();
        }
    }

    public Fragment(int i2) {
        this();
        this.b0 = i2;
    }
}
