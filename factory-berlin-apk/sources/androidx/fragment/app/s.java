package androidx.fragment.app;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.p;
import androidx.lifecycle.s0;
import e.l.b;

/* compiled from: FragmentStateManager */
class s {
    private final l a;
    private final Fragment b;
    private int c = -1;

    /* compiled from: FragmentStateManager */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.lifecycle.p$b[] r0 = androidx.lifecycle.p.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                androidx.lifecycle.p$b r1 = androidx.lifecycle.p.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.p$b r1 = androidx.lifecycle.p.b.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.p$b r1 = androidx.lifecycle.p.b.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.s.a.<clinit>():void");
        }
    }

    s(l lVar, Fragment fragment) {
        this.a = lVar;
        this.b = fragment;
    }

    private Bundle n() {
        Bundle bundle = new Bundle();
        this.b.r1(bundle);
        this.a.j(this.b, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.b.M != null) {
            p();
        }
        if (this.b.f777i != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.b.f777i);
        }
        if (!this.b.O) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.b.O);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (m.p0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.b);
        }
        Fragment fragment = this.b;
        fragment.X0(fragment.f776h);
        l lVar = this.a;
        Fragment fragment2 = this.b;
        lVar.a(fragment2, fragment2.f776h, false);
    }

    /* access modifiers changed from: package-private */
    public void b(j<?> jVar, m mVar, Fragment fragment) {
        Fragment fragment2 = this.b;
        fragment2.y = jVar;
        fragment2.A = fragment;
        fragment2.x = mVar;
        this.a.g(fragment2, jVar.h(), false);
        this.b.Y0();
        Fragment fragment3 = this.b;
        Fragment fragment4 = fragment3.A;
        if (fragment4 == null) {
            jVar.j(fragment3);
        } else {
            fragment4.u0(fragment3);
        }
        this.a.b(this.b, jVar.h(), false);
    }

    /* access modifiers changed from: package-private */
    public int c() {
        int i2 = this.c;
        Fragment fragment = this.b;
        if (fragment.s) {
            if (fragment.t) {
                i2 = Math.max(i2, 1);
            } else if (i2 < 2) {
                i2 = Math.min(i2, fragment.f775g);
            } else {
                i2 = Math.min(i2, 1);
            }
        }
        if (!this.b.q) {
            i2 = Math.min(i2, 1);
        }
        Fragment fragment2 = this.b;
        if (fragment2.r) {
            if (fragment2.h0()) {
                i2 = Math.min(i2, 1);
            } else {
                i2 = Math.min(i2, -1);
            }
        }
        Fragment fragment3 = this.b;
        if (fragment3.N && fragment3.f775g < 3) {
            i2 = Math.min(i2, 2);
        }
        int i3 = a.a[this.b.V.ordinal()];
        if (i3 == 1) {
            return i2;
        }
        if (i3 == 2) {
            return Math.min(i2, 3);
        }
        if (i3 != 3) {
            return Math.min(i2, -1);
        }
        return Math.min(i2, 1);
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (m.p0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.b);
        }
        Fragment fragment = this.b;
        if (!fragment.U) {
            this.a.h(fragment, fragment.f776h, false);
            Fragment fragment2 = this.b;
            fragment2.b1(fragment2.f776h);
            l lVar = this.a;
            Fragment fragment3 = this.b;
            lVar.c(fragment3, fragment3.f776h, false);
            return;
        }
        fragment.z1(fragment.f776h);
        this.b.f775g = 1;
    }

    /* JADX WARNING: type inference failed for: r5v15, types: [android.view.View] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(androidx.fragment.app.f r5) {
        /*
            r4 = this;
            androidx.fragment.app.Fragment r0 = r4.b
            boolean r0 = r0.s
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 3
            boolean r0 = androidx.fragment.app.m.p0(r0)
            if (r0 == 0) goto L_0x0026
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATE_VIEW: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L_0x0026:
            r0 = 0
            androidx.fragment.app.Fragment r1 = r4.b
            android.view.ViewGroup r2 = r1.L
            if (r2 == 0) goto L_0x0030
            r0 = r2
            goto L_0x00a5
        L_0x0030:
            int r1 = r1.C
            if (r1 == 0) goto L_0x00a5
            r0 = -1
            if (r1 == r0) goto L_0x0087
            android.view.View r5 = r5.e(r1)
            r0 = r5
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x00a5
            androidx.fragment.app.Fragment r5 = r4.b
            boolean r1 = r5.u
            if (r1 == 0) goto L_0x0047
            goto L_0x00a5
        L_0x0047:
            android.content.res.Resources r5 = r5.R()     // Catch:{ NotFoundException -> 0x0054 }
            androidx.fragment.app.Fragment r0 = r4.b     // Catch:{ NotFoundException -> 0x0054 }
            int r0 = r0.C     // Catch:{ NotFoundException -> 0x0054 }
            java.lang.String r5 = r5.getResourceName(r0)     // Catch:{ NotFoundException -> 0x0054 }
            goto L_0x0056
        L_0x0054:
            java.lang.String r5 = "unknown"
        L_0x0056:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No view found for id 0x"
            r1.append(r2)
            androidx.fragment.app.Fragment r2 = r4.b
            int r2 = r2.C
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r2 = " ("
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = ") for fragment "
            r1.append(r5)
            androidx.fragment.app.Fragment r5 = r4.b
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L_0x0087:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot create fragment "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.b
            r0.append(r1)
            java.lang.String r1 = " for a container view with no id"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x00a5:
            androidx.fragment.app.Fragment r5 = r4.b
            r5.L = r0
            android.os.Bundle r1 = r5.f776h
            android.view.LayoutInflater r1 = r5.h1(r1)
            androidx.fragment.app.Fragment r2 = r4.b
            android.os.Bundle r2 = r2.f776h
            r5.d1(r1, r0, r2)
            androidx.fragment.app.Fragment r5 = r4.b
            android.view.View r5 = r5.M
            if (r5 == 0) goto L_0x010d
            r1 = 0
            r5.setSaveFromParentEnabled(r1)
            androidx.fragment.app.Fragment r5 = r4.b
            android.view.View r2 = r5.M
            int r3 = e.l.b.fragment_container_view_tag
            r2.setTag(r3, r5)
            if (r0 == 0) goto L_0x00d2
            androidx.fragment.app.Fragment r5 = r4.b
            android.view.View r5 = r5.M
            r0.addView(r5)
        L_0x00d2:
            androidx.fragment.app.Fragment r5 = r4.b
            boolean r0 = r5.E
            if (r0 == 0) goto L_0x00df
            android.view.View r5 = r5.M
            r0 = 8
            r5.setVisibility(r0)
        L_0x00df:
            androidx.fragment.app.Fragment r5 = r4.b
            android.view.View r5 = r5.M
            e.h.k.u.c0(r5)
            androidx.fragment.app.Fragment r5 = r4.b
            android.view.View r0 = r5.M
            android.os.Bundle r2 = r5.f776h
            r5.V0(r0, r2)
            androidx.fragment.app.l r5 = r4.a
            androidx.fragment.app.Fragment r0 = r4.b
            android.view.View r2 = r0.M
            android.os.Bundle r3 = r0.f776h
            r5.m(r0, r2, r3, r1)
            androidx.fragment.app.Fragment r5 = r4.b
            android.view.View r0 = r5.M
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x010b
            androidx.fragment.app.Fragment r0 = r4.b
            android.view.ViewGroup r0 = r0.L
            if (r0 == 0) goto L_0x010b
            r1 = 1
        L_0x010b:
            r5.Q = r1
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.s.e(androidx.fragment.app.f):void");
    }

    /* access modifiers changed from: package-private */
    public void f(j<?> jVar, p pVar) {
        if (m.p0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.b);
        }
        Fragment fragment = this.b;
        boolean z = true;
        boolean z2 = fragment.r && !fragment.h0();
        if (z2 || pVar.A(this.b)) {
            if (jVar instanceof s0) {
                z = pVar.y();
            } else if (jVar.h() instanceof Activity) {
                z = true ^ ((Activity) jVar.h()).isChangingConfigurations();
            }
            if (z2 || z) {
                pVar.s(this.b);
            }
            this.b.e1();
            this.a.d(this.b, false);
            return;
        }
        this.b.f775g = 0;
    }

    /* access modifiers changed from: package-private */
    public void g(p pVar) {
        if (m.p0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.b);
        }
        this.b.g1();
        boolean z = false;
        this.a.e(this.b, false);
        Fragment fragment = this.b;
        fragment.f775g = -1;
        fragment.y = null;
        fragment.A = null;
        fragment.x = null;
        if (fragment.r && !fragment.h0()) {
            z = true;
        }
        if (z || pVar.A(this.b)) {
            if (m.p0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.b);
            }
            this.b.c0();
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        Fragment fragment = this.b;
        if (fragment.s && fragment.t && !fragment.v) {
            if (m.p0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.b);
            }
            Fragment fragment2 = this.b;
            fragment2.d1(fragment2.h1(fragment2.f776h), (ViewGroup) null, this.b.f776h);
            View view = this.b.M;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.b;
                fragment3.M.setTag(b.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.b;
                if (fragment4.E) {
                    fragment4.M.setVisibility(8);
                }
                Fragment fragment5 = this.b;
                fragment5.V0(fragment5.M, fragment5.f776h);
                l lVar = this.a;
                Fragment fragment6 = this.b;
                lVar.m(fragment6, fragment6.M, fragment6.f776h, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment i() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        if (m.p0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.b);
        }
        this.b.m1();
        this.a.f(this.b, false);
    }

    /* access modifiers changed from: package-private */
    public void k(ClassLoader classLoader) {
        Bundle bundle = this.b.f776h;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.b;
            fragment.f777i = fragment.f776h.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.b;
            fragment2.f782n = fragment2.f776h.getString("android:target_state");
            Fragment fragment3 = this.b;
            if (fragment3.f782n != null) {
                fragment3.o = fragment3.f776h.getInt("android:target_req_state", 0);
            }
            Fragment fragment4 = this.b;
            Boolean bool = fragment4.f778j;
            if (bool != null) {
                fragment4.O = bool.booleanValue();
                this.b.f778j = null;
            } else {
                fragment4.O = fragment4.f776h.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment5 = this.b;
            if (!fragment5.O) {
                fragment5.N = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        if (m.p0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this.b);
        }
        Fragment fragment = this.b;
        if (fragment.M != null) {
            fragment.A1(fragment.f776h);
        }
        this.b.f776h = null;
    }

    /* access modifiers changed from: package-private */
    public void m() {
        if (m.p0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.b);
        }
        this.b.q1();
        this.a.i(this.b, false);
        Fragment fragment = this.b;
        fragment.f776h = null;
        fragment.f777i = null;
    }

    /* access modifiers changed from: package-private */
    public r o() {
        r rVar = new r(this.b);
        if (this.b.f775g <= -1 || rVar.s != null) {
            rVar.s = this.b.f776h;
        } else {
            Bundle n2 = n();
            rVar.s = n2;
            if (this.b.f782n != null) {
                if (n2 == null) {
                    rVar.s = new Bundle();
                }
                rVar.s.putString("android:target_state", this.b.f782n);
                int i2 = this.b.o;
                if (i2 != 0) {
                    rVar.s.putInt("android:target_req_state", i2);
                }
            }
        }
        return rVar;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        if (this.b.M != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.b.M.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.b.f777i = sparseArray;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void q(int i2) {
        this.c = i2;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        if (m.p0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.b);
        }
        this.b.s1();
        this.a.k(this.b, false);
    }

    /* access modifiers changed from: package-private */
    public void s() {
        if (m.p0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.b);
        }
        this.b.t1();
        this.a.l(this.b, false);
    }

    s(l lVar, ClassLoader classLoader, i iVar, r rVar) {
        this.a = lVar;
        this.b = iVar.a(classLoader, rVar.f852g);
        Bundle bundle = rVar.p;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        this.b.D1(rVar.p);
        Fragment fragment = this.b;
        fragment.f779k = rVar.f853h;
        fragment.s = rVar.f854i;
        fragment.u = true;
        fragment.B = rVar.f855j;
        fragment.C = rVar.f856k;
        fragment.D = rVar.f857l;
        fragment.G = rVar.f858m;
        fragment.r = rVar.f859n;
        fragment.F = rVar.o;
        fragment.E = rVar.q;
        fragment.V = p.b.values()[rVar.r];
        Bundle bundle2 = rVar.s;
        if (bundle2 != null) {
            this.b.f776h = bundle2;
        } else {
            this.b.f776h = new Bundle();
        }
        if (m.p0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + this.b);
        }
    }

    s(l lVar, Fragment fragment, r rVar) {
        this.a = lVar;
        this.b = fragment;
        fragment.f777i = null;
        fragment.w = 0;
        fragment.t = false;
        fragment.q = false;
        Fragment fragment2 = fragment.f781m;
        fragment.f782n = fragment2 != null ? fragment2.f779k : null;
        Fragment fragment3 = this.b;
        fragment3.f781m = null;
        Bundle bundle = rVar.s;
        if (bundle != null) {
            fragment3.f776h = bundle;
        } else {
            fragment3.f776h = new Bundle();
        }
    }
}
