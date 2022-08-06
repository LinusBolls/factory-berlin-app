package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.v;
import androidx.lifecycle.p;
import androidx.lifecycle.r0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FragmentManager */
public abstract class m {
    private static boolean F = false;
    private ArrayList<Boolean> A;
    private ArrayList<Fragment> B;
    private ArrayList<j> C;
    private p D;
    private Runnable E = new d();
    private final ArrayList<h> a = new ArrayList<>();
    private boolean b;
    private final t c = new t();

    /* renamed from: d  reason: collision with root package name */
    ArrayList<a> f826d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<Fragment> f827e;

    /* renamed from: f  reason: collision with root package name */
    private final k f828f = new k(this);

    /* renamed from: g  reason: collision with root package name */
    private OnBackPressedDispatcher f829g;

    /* renamed from: h  reason: collision with root package name */
    private final androidx.activity.b f830h = new a(false);

    /* renamed from: i  reason: collision with root package name */
    private final AtomicInteger f831i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<g> f832j;

    /* renamed from: k  reason: collision with root package name */
    private ConcurrentHashMap<Fragment, HashSet<androidx.core.os.a>> f833k = new ConcurrentHashMap<>();

    /* renamed from: l  reason: collision with root package name */
    private final v.g f834l = new b();

    /* renamed from: m  reason: collision with root package name */
    private final l f835m = new l(this);

    /* renamed from: n  reason: collision with root package name */
    int f836n = -1;
    j<?> o;
    f p;
    private Fragment q;
    Fragment r;
    private i s = null;
    private i t = new c();
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private ArrayList<a> z;

    /* compiled from: FragmentManager */
    class a extends androidx.activity.b {
        a(boolean z) {
            super(z);
        }

        public void b() {
            m.this.m0();
        }
    }

    /* compiled from: FragmentManager */
    class b implements v.g {
        b() {
        }

        public void a(Fragment fragment, androidx.core.os.a aVar) {
            if (!aVar.b()) {
                m.this.M0(fragment, aVar);
            }
        }

        public void b(Fragment fragment, androidx.core.os.a aVar) {
            m.this.c(fragment, aVar);
        }
    }

    /* compiled from: FragmentManager */
    class c extends i {
        c() {
        }

        public Fragment a(ClassLoader classLoader, String str) {
            j<?> jVar = m.this.o;
            return jVar.b(jVar.h(), str, (Bundle) null);
        }
    }

    /* compiled from: FragmentManager */
    class d implements Runnable {
        d() {
        }

        public void run() {
            m.this.Q(true);
        }
    }

    /* compiled from: FragmentManager */
    class e extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ View b;
        final /* synthetic */ Fragment c;

        e(m mVar, ViewGroup viewGroup, View view, Fragment fragment) {
            this.a = viewGroup;
            this.b = view;
            this.c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.b);
            animator.removeListener(this);
            Fragment fragment = this.c;
            View view = fragment.M;
            if (view != null && fragment.E) {
                view.setVisibility(8);
            }
        }
    }

    /* compiled from: FragmentManager */
    public static abstract class f {
        public void a(m mVar, Fragment fragment, Bundle bundle) {
        }

        public void b(m mVar, Fragment fragment, Context context) {
        }

        public void c(m mVar, Fragment fragment, Bundle bundle) {
        }

        public void d(m mVar, Fragment fragment) {
        }

        public void e(m mVar, Fragment fragment) {
        }

        public void f(m mVar, Fragment fragment) {
        }

        public void g(m mVar, Fragment fragment, Context context) {
        }

        public void h(m mVar, Fragment fragment, Bundle bundle) {
        }

        public void i(m mVar, Fragment fragment) {
        }

        public void j(m mVar, Fragment fragment, Bundle bundle) {
        }

        public void k(m mVar, Fragment fragment) {
        }

        public void l(m mVar, Fragment fragment) {
        }

        public void m(m mVar, Fragment fragment, View view, Bundle bundle) {
        }

        public void n(m mVar, Fragment fragment) {
        }
    }

    /* compiled from: FragmentManager */
    public interface g {
        void a();
    }

    /* compiled from: FragmentManager */
    interface h {
        boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* compiled from: FragmentManager */
    private class i implements h {
        final String a;
        final int b;
        final int c;

        i(String str, int i2, int i3) {
            this.a = str;
            this.b = i2;
            this.c = i3;
        }

        public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = m.this.r;
            if (fragment != null && this.b < 0 && this.a == null && fragment.B().H0()) {
                return false;
            }
            return m.this.J0(arrayList, arrayList2, this.a, this.b, this.c);
        }
    }

    /* compiled from: FragmentManager */
    static class j implements Fragment.d {
        final boolean a;
        final a b;
        private int c;

        j(a aVar, boolean z) {
            this.a = z;
            this.b = aVar;
        }

        public void a() {
            int i2 = this.c - 1;
            this.c = i2;
            if (i2 == 0) {
                this.b.r.U0();
            }
        }

        public void b() {
            this.c++;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            a aVar = this.b;
            aVar.r.n(aVar, this.a, false, false);
        }

        /* access modifiers changed from: package-private */
        public void d() {
            boolean z = this.c > 0;
            for (Fragment next : this.b.r.f0()) {
                next.I1((Fragment.d) null);
                if (z && next.j0()) {
                    next.P1();
                }
            }
            a aVar = this.b;
            aVar.r.n(aVar, this.a, !z, true);
        }

        public boolean e() {
            return this.c == 0;
        }
    }

    private void C(Fragment fragment) {
        if (fragment != null && fragment.equals(V(fragment.f779k))) {
            fragment.p1();
        }
    }

    private boolean I0(String str, int i2, int i3) {
        Q(false);
        P(true);
        Fragment fragment = this.r;
        if (fragment != null && i2 < 0 && str == null && fragment.B().H0()) {
            return true;
        }
        boolean J0 = J0(this.z, this.A, str, i2, i3);
        if (J0) {
            this.b = true;
            try {
                O0(this.z, this.A);
            } finally {
                m();
            }
        }
        c1();
        L();
        this.c.b();
        return J0;
    }

    /* JADX INFO: finally extract failed */
    private void J(int i2) {
        try {
            this.b = true;
            this.c.d(i2);
            z0(i2, false);
            this.b = false;
            Q(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    private int K0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, e.e.b<Fragment> bVar) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            a aVar = arrayList.get(i5);
            boolean booleanValue = arrayList2.get(i5).booleanValue();
            if (aVar.I() && !aVar.G(arrayList, i5 + 1, i3)) {
                if (this.C == null) {
                    this.C = new ArrayList<>();
                }
                j jVar = new j(aVar, booleanValue);
                this.C.add(jVar);
                aVar.K(jVar);
                if (booleanValue) {
                    aVar.B();
                } else {
                    aVar.C(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, aVar);
                }
                a(bVar);
            }
        }
        return i4;
    }

    private void L() {
        if (this.y) {
            this.y = false;
            a1();
        }
    }

    private void N() {
        if (!this.f833k.isEmpty()) {
            for (Fragment next : this.f833k.keySet()) {
                j(next);
                B0(next, next.W());
            }
        }
    }

    private void O0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                U(arrayList, arrayList2);
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    if (!arrayList.get(i2).p) {
                        if (i3 != i2) {
                            T(arrayList, arrayList2, i3, i2);
                        }
                        i3 = i2 + 1;
                        if (arrayList2.get(i2).booleanValue()) {
                            while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).p) {
                                i3++;
                            }
                        }
                        T(arrayList, arrayList2, i2, i3);
                        i2 = i3 - 1;
                    }
                    i2++;
                }
                if (i3 != size) {
                    T(arrayList, arrayList2, i3, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    private void P(boolean z2) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.o == null) {
            if (this.x) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.o.i().getLooper()) {
            if (!z2) {
                l();
            }
            if (this.z == null) {
                this.z = new ArrayList<>();
                this.A = new ArrayList<>();
            }
            this.b = true;
            try {
                U((ArrayList<a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.b = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    private void Q0() {
        if (this.f832j != null) {
            for (int i2 = 0; i2 < this.f832j.size(); i2++) {
                this.f832j.get(i2).a();
            }
        }
    }

    private static void S(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            a aVar = arrayList.get(i2);
            boolean z2 = true;
            if (arrayList2.get(i2).booleanValue()) {
                aVar.x(-1);
                if (i2 != i3 - 1) {
                    z2 = false;
                }
                aVar.C(z2);
            } else {
                aVar.x(1);
                aVar.B();
            }
            i2++;
        }
    }

    static int S0(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private void T(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        ArrayList<a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i5 = i2;
        int i6 = i3;
        boolean z2 = arrayList3.get(i5).p;
        ArrayList<Fragment> arrayList5 = this.B;
        if (arrayList5 == null) {
            this.B = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.B.addAll(this.c.m());
        Fragment j0 = j0();
        boolean z3 = false;
        for (int i7 = i5; i7 < i6; i7++) {
            a aVar = arrayList3.get(i7);
            if (!arrayList4.get(i7).booleanValue()) {
                j0 = aVar.D(this.B, j0);
            } else {
                j0 = aVar.L(this.B, j0);
            }
            z3 = z3 || aVar.f863g;
        }
        this.B.clear();
        if (!z2) {
            v.C(this, arrayList, arrayList2, i2, i3, false, this.f834l);
        }
        S(arrayList, arrayList2, i2, i3);
        if (z2) {
            e.e.b bVar = new e.e.b();
            a(bVar);
            int K0 = K0(arrayList, arrayList2, i2, i3, bVar);
            x0(bVar);
            i4 = K0;
        } else {
            i4 = i6;
        }
        if (i4 != i5 && z2) {
            v.C(this, arrayList, arrayList2, i2, i4, true, this.f834l);
            z0(this.f836n, true);
        }
        while (i5 < i6) {
            a aVar2 = arrayList3.get(i5);
            if (arrayList4.get(i5).booleanValue() && aVar2.t >= 0) {
                aVar2.t = -1;
            }
            aVar2.J();
            i5++;
        }
        if (z3) {
            Q0();
        }
    }

    private void U(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<j> arrayList3 = this.C;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            j jVar = this.C.get(i2);
            if (arrayList != null && !jVar.a && (indexOf2 = arrayList.indexOf(jVar.b)) != -1 && arrayList2 != null && arrayList2.get(indexOf2).booleanValue()) {
                this.C.remove(i2);
                i2--;
                size--;
                jVar.c();
            } else if (jVar.e() || (arrayList != null && jVar.b.G(arrayList, 0, arrayList.size()))) {
                this.C.remove(i2);
                i2--;
                size--;
                if (arrayList == null || jVar.a || (indexOf = arrayList.indexOf(jVar.b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                    jVar.d();
                } else {
                    jVar.c();
                }
            }
            i2++;
        }
    }

    private void Y0(Fragment fragment) {
        ViewGroup d0 = d0(fragment);
        if (d0 != null) {
            if (d0.getTag(e.l.b.visible_removing_fragment_view_tag) == null) {
                d0.setTag(e.l.b.visible_removing_fragment_view_tag, fragment);
            }
            ((Fragment) d0.getTag(e.l.b.visible_removing_fragment_view_tag)).G1(fragment.M());
        }
    }

    private void Z() {
        if (this.C != null) {
            while (!this.C.isEmpty()) {
                this.C.remove(0).d();
            }
        }
    }

    private void a(e.e.b<Fragment> bVar) {
        int i2 = this.f836n;
        if (i2 >= 1) {
            int min = Math.min(i2, 3);
            for (Fragment next : this.c.m()) {
                if (next.f775g < min) {
                    B0(next, min);
                    if (next.M != null && !next.E && next.Q) {
                        bVar.add(next);
                    }
                }
            }
        }
    }

    private boolean a0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return false;
            }
            int size = this.a.size();
            boolean z2 = false;
            for (int i2 = 0; i2 < size; i2++) {
                z2 |= this.a.get(i2).a(arrayList, arrayList2);
            }
            this.a.clear();
            this.o.i().removeCallbacks(this.E);
            return z2;
        }
    }

    private void a1() {
        for (Fragment next : this.c.k()) {
            if (next != null) {
                D0(next);
            }
        }
    }

    private p c0(Fragment fragment) {
        return this.D.u(fragment);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (b0() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (s0(r3.q) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.f(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.f830h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c1() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.m$h> r0 = r3.a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.m$h> r1 = r3.a     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.b r1 = r3.f830h     // Catch:{ all -> 0x002a }
            r1.f(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            androidx.activity.b r0 = r3.f830h
            int r1 = r3.b0()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.q
            boolean r1 = r3.s0(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.f(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m.c1():void");
    }

    private ViewGroup d0(Fragment fragment) {
        if (fragment.C > 0 && this.p.f()) {
            View e2 = this.p.e(fragment.C);
            if (e2 instanceof ViewGroup) {
                return (ViewGroup) e2;
            }
        }
        return null;
    }

    private void j(Fragment fragment) {
        HashSet hashSet = this.f833k.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((androidx.core.os.a) it.next()).a();
            }
            hashSet.clear();
            p(fragment);
            this.f833k.remove(fragment);
        }
    }

    static Fragment k0(View view) {
        Object tag = view.getTag(e.l.b.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    private void l() {
        if (u0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void m() {
        this.b = false;
        this.A.clear();
        this.z.clear();
    }

    private void o(Fragment fragment) {
        Animator animator;
        if (fragment.M != null) {
            e.d b2 = e.b(this.o.h(), this.p, fragment, !fragment.E);
            if (b2 == null || (animator = b2.b) == null) {
                if (b2 != null) {
                    fragment.M.startAnimation(b2.a);
                    b2.a.start();
                }
                fragment.M.setVisibility((!fragment.E || fragment.g0()) ? 0 : 8);
                if (fragment.g0()) {
                    fragment.E1(false);
                }
            } else {
                animator.setTarget(fragment.M);
                if (!fragment.E) {
                    fragment.M.setVisibility(0);
                } else if (fragment.g0()) {
                    fragment.E1(false);
                } else {
                    ViewGroup viewGroup = fragment.L;
                    View view = fragment.M;
                    viewGroup.startViewTransition(view);
                    b2.b.addListener(new e(this, viewGroup, view, fragment));
                }
                b2.b.start();
            }
        }
        if (fragment.q && q0(fragment)) {
            this.u = true;
        }
        fragment.R = false;
        fragment.G0(fragment.E);
    }

    private void p(Fragment fragment) {
        fragment.f1();
        this.f835m.n(fragment, false);
        fragment.L = null;
        fragment.M = null;
        fragment.X = null;
        fragment.Y.u(null);
        fragment.t = false;
    }

    static boolean p0(int i2) {
        return F || Log.isLoggable("FragmentManager", i2);
    }

    private boolean q0(Fragment fragment) {
        return (fragment.I && fragment.J) || fragment.z.k();
    }

    private void w0(s sVar) {
        Fragment i2 = sVar.i();
        if (this.c.c(i2.f779k)) {
            if (p0(2)) {
                Log.v("FragmentManager", "Removed fragment from active set " + i2);
            }
            this.c.o(sVar);
            P0(i2);
        }
    }

    private void x0(e.e.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment l2 = bVar.l(i2);
            if (!l2.q) {
                View y1 = l2.y1();
                l2.S = y1.getAlpha();
                y1.setAlpha(0.0f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean A(MenuItem menuItem) {
        if (this.f836n < 1) {
            return false;
        }
        for (Fragment next : this.c.m()) {
            if (next != null && next.k1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void A0(Fragment fragment) {
        B0(fragment, this.f836n);
    }

    /* access modifiers changed from: package-private */
    public void B(Menu menu) {
        if (this.f836n >= 1) {
            for (Fragment next : this.c.m()) {
                if (next != null) {
                    next.l1(menu);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r2 != 3) goto L_0x01f5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B0(androidx.fragment.app.Fragment r13, int r14) {
        /*
            r12 = this;
            androidx.fragment.app.t r0 = r12.c
            java.lang.String r1 = r13.f779k
            androidx.fragment.app.s r0 = r0.l(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0015
            androidx.fragment.app.s r0 = new androidx.fragment.app.s
            androidx.fragment.app.l r2 = r12.f835m
            r0.<init>(r2, r13)
            r0.q(r1)
        L_0x0015:
            int r2 = r0.c()
            int r14 = java.lang.Math.min(r14, r2)
            int r2 = r13.f775g
            r3 = 0
            java.lang.String r4 = "FragmentManager"
            r5 = -1
            r6 = 2
            r7 = 3
            if (r2 > r14) goto L_0x0102
            if (r2 >= r14) goto L_0x0034
            java.util.concurrent.ConcurrentHashMap<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.a>> r2 = r12.f833k
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0034
            r12.j(r13)
        L_0x0034:
            int r2 = r13.f775g
            if (r2 == r5) goto L_0x0042
            if (r2 == 0) goto L_0x00df
            if (r2 == r1) goto L_0x00e4
            if (r2 == r6) goto L_0x00f6
            if (r2 == r7) goto L_0x00fb
            goto L_0x01f5
        L_0x0042:
            if (r14 <= r5) goto L_0x00df
            boolean r2 = p0(r7)
            if (r2 == 0) goto L_0x005e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "moveto ATTACHED: "
            r2.append(r8)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r4, r2)
        L_0x005e:
            androidx.fragment.app.Fragment r2 = r13.f781m
            java.lang.String r8 = " that does not belong to this FragmentManager!"
            java.lang.String r9 = " declared target fragment "
            java.lang.String r10 = "Fragment "
            if (r2 == 0) goto L_0x00a6
            java.lang.String r11 = r2.f779k
            androidx.fragment.app.Fragment r11 = r12.V(r11)
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L_0x0086
            androidx.fragment.app.Fragment r2 = r13.f781m
            int r11 = r2.f775g
            if (r11 >= r1) goto L_0x007d
            r12.B0(r2, r1)
        L_0x007d:
            androidx.fragment.app.Fragment r2 = r13.f781m
            java.lang.String r2 = r2.f779k
            r13.f782n = r2
            r13.f781m = r3
            goto L_0x00a6
        L_0x0086:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r13)
            r0.append(r9)
            androidx.fragment.app.Fragment r13 = r13.f781m
            r0.append(r13)
            r0.append(r8)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            throw r14
        L_0x00a6:
            java.lang.String r2 = r13.f782n
            if (r2 == 0) goto L_0x00d8
            androidx.fragment.app.Fragment r2 = r12.V(r2)
            if (r2 == 0) goto L_0x00b8
            int r3 = r2.f775g
            if (r3 >= r1) goto L_0x00d8
            r12.B0(r2, r1)
            goto L_0x00d8
        L_0x00b8:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r13)
            r0.append(r9)
            java.lang.String r13 = r13.f782n
            r0.append(r13)
            r0.append(r8)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            throw r14
        L_0x00d8:
            androidx.fragment.app.j<?> r2 = r12.o
            androidx.fragment.app.Fragment r3 = r12.q
            r0.b(r2, r12, r3)
        L_0x00df:
            if (r14 <= 0) goto L_0x00e4
            r0.d()
        L_0x00e4:
            if (r14 <= r5) goto L_0x00e9
            r0.h()
        L_0x00e9:
            if (r14 <= r1) goto L_0x00f6
            androidx.fragment.app.f r1 = r12.p
            r0.e(r1)
            r0.a()
            r0.l()
        L_0x00f6:
            if (r14 <= r6) goto L_0x00fb
            r0.r()
        L_0x00fb:
            if (r14 <= r7) goto L_0x01f5
            r0.m()
            goto L_0x01f5
        L_0x0102:
            if (r2 <= r14) goto L_0x01f5
            if (r2 == 0) goto L_0x01ec
            r8 = 0
            if (r2 == r1) goto L_0x01ab
            if (r2 == r6) goto L_0x011c
            if (r2 == r7) goto L_0x0117
            r9 = 4
            if (r2 == r9) goto L_0x0112
            goto L_0x01f5
        L_0x0112:
            if (r14 >= r9) goto L_0x0117
            r0.j()
        L_0x0117:
            if (r14 >= r7) goto L_0x011c
            r0.s()
        L_0x011c:
            if (r14 >= r6) goto L_0x01ab
            boolean r2 = p0(r7)
            if (r2 == 0) goto L_0x0138
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "movefrom ACTIVITY_CREATED: "
            r2.append(r6)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r4, r2)
        L_0x0138:
            android.view.View r2 = r13.M
            if (r2 == 0) goto L_0x014b
            androidx.fragment.app.j<?> r2 = r12.o
            boolean r2 = r2.n(r13)
            if (r2 == 0) goto L_0x014b
            android.util.SparseArray<android.os.Parcelable> r2 = r13.f777i
            if (r2 != 0) goto L_0x014b
            r0.p()
        L_0x014b:
            android.view.View r2 = r13.M
            if (r2 == 0) goto L_0x019c
            android.view.ViewGroup r6 = r13.L
            if (r6 == 0) goto L_0x019c
            r6.endViewTransition(r2)
            android.view.View r2 = r13.M
            r2.clearAnimation()
            boolean r2 = r13.l0()
            if (r2 != 0) goto L_0x019c
            int r2 = r12.f836n
            r6 = 0
            if (r2 <= r5) goto L_0x0184
            boolean r2 = r12.x
            if (r2 != 0) goto L_0x0184
            android.view.View r2 = r13.M
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0184
            float r2 = r13.S
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0184
            androidx.fragment.app.j<?> r2 = r12.o
            android.content.Context r2 = r2.h()
            androidx.fragment.app.f r3 = r12.p
            androidx.fragment.app.e$d r3 = androidx.fragment.app.e.b(r2, r3, r13, r8)
        L_0x0184:
            r13.S = r6
            android.view.ViewGroup r2 = r13.L
            android.view.View r5 = r13.M
            if (r3 == 0) goto L_0x0194
            r13.K1(r14)
            androidx.fragment.app.v$g r6 = r12.f834l
            androidx.fragment.app.e.a(r13, r3, r6)
        L_0x0194:
            r2.removeView(r5)
            android.view.ViewGroup r3 = r13.L
            if (r2 == r3) goto L_0x019c
            return
        L_0x019c:
            java.util.concurrent.ConcurrentHashMap<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.a>> r2 = r12.f833k
            java.lang.Object r2 = r2.get(r13)
            if (r2 != 0) goto L_0x01a8
            r12.p(r13)
            goto L_0x01ab
        L_0x01a8:
            r13.K1(r14)
        L_0x01ab:
            if (r14 >= r1) goto L_0x01ec
            boolean r2 = r13.r
            if (r2 == 0) goto L_0x01b8
            boolean r2 = r13.h0()
            if (r2 != 0) goto L_0x01b8
            r8 = 1
        L_0x01b8:
            if (r8 != 0) goto L_0x01d6
            androidx.fragment.app.p r2 = r12.D
            boolean r2 = r2.A(r13)
            if (r2 == 0) goto L_0x01c3
            goto L_0x01d6
        L_0x01c3:
            java.lang.String r2 = r13.f782n
            if (r2 == 0) goto L_0x01d9
            androidx.fragment.app.Fragment r2 = r12.V(r2)
            if (r2 == 0) goto L_0x01d9
            boolean r3 = r2.S()
            if (r3 == 0) goto L_0x01d9
            r13.f781m = r2
            goto L_0x01d9
        L_0x01d6:
            r12.w0(r0)
        L_0x01d9:
            java.util.concurrent.ConcurrentHashMap<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.a>> r2 = r12.f833k
            java.lang.Object r2 = r2.get(r13)
            if (r2 == 0) goto L_0x01e5
            r13.K1(r14)
            goto L_0x01ed
        L_0x01e5:
            androidx.fragment.app.j<?> r1 = r12.o
            androidx.fragment.app.p r2 = r12.D
            r0.f(r1, r2)
        L_0x01ec:
            r1 = r14
        L_0x01ed:
            if (r1 >= 0) goto L_0x01f4
            androidx.fragment.app.p r14 = r12.D
            r0.g(r14)
        L_0x01f4:
            r14 = r1
        L_0x01f5:
            int r0 = r13.f775g
            if (r0 == r14) goto L_0x0227
            boolean r0 = p0(r7)
            if (r0 == 0) goto L_0x0225
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r13.f775g
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r4, r0)
        L_0x0225:
            r13.f775g = r14
        L_0x0227:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m.B0(androidx.fragment.app.Fragment, int):void");
    }

    /* access modifiers changed from: package-private */
    public void C0() {
        if (this.o != null) {
            this.v = false;
            this.w = false;
            for (Fragment next : this.c.m()) {
                if (next != null) {
                    next.p0();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void D() {
        J(3);
    }

    /* access modifiers changed from: package-private */
    public void D0(Fragment fragment) {
        if (!fragment.N) {
            return;
        }
        if (this.b) {
            this.y = true;
            return;
        }
        fragment.N = false;
        B0(fragment, this.f836n);
    }

    /* access modifiers changed from: package-private */
    public void E(boolean z2) {
        for (Fragment next : this.c.m()) {
            if (next != null) {
                next.n1(z2);
            }
        }
    }

    public void E0() {
        O(new i((String) null, -1, 0), false);
    }

    /* access modifiers changed from: package-private */
    public boolean F(Menu menu) {
        boolean z2 = false;
        if (this.f836n < 1) {
            return false;
        }
        for (Fragment next : this.c.m()) {
            if (next != null && next.o1(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    public void F0(int i2, int i3) {
        if (i2 >= 0) {
            O(new i((String) null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    /* access modifiers changed from: package-private */
    public void G() {
        c1();
        C(this.r);
    }

    public void G0(String str, int i2) {
        O(new i(str, -1, i2), false);
    }

    /* access modifiers changed from: package-private */
    public void H() {
        this.v = false;
        this.w = false;
        J(4);
    }

    public boolean H0() {
        return I0((String) null, -1, 0);
    }

    /* access modifiers changed from: package-private */
    public void I() {
        this.v = false;
        this.w = false;
        J(3);
    }

    /* access modifiers changed from: package-private */
    public boolean J0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<a> arrayList3 = this.f826d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f826d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = this.f826d.size() - 1;
                while (size2 >= 0) {
                    a aVar = this.f826d.get(size2);
                    if ((str != null && str.equals(aVar.E())) || (i2 >= 0 && i2 == aVar.t)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        a aVar2 = this.f826d.get(size2);
                        if ((str == null || !str.equals(aVar2.E())) && (i2 < 0 || i2 != aVar2.t)) {
                            break;
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.f826d.size() - 1) {
                return false;
            }
            for (int size3 = this.f826d.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.f826d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void K() {
        this.w = true;
        J(2);
    }

    public void L0(f fVar, boolean z2) {
        this.f835m.o(fVar, z2);
    }

    public void M(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f827e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f827e.get(i2).toString());
            }
        }
        ArrayList<a> arrayList2 = this.f826d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                a aVar = this.f826d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.z(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f831i.get());
        synchronized (this.a) {
            int size3 = this.a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size3; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(this.a.get(i4));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.p);
        if (this.q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f836n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.v);
        printWriter.print(" mStopped=");
        printWriter.print(this.w);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.x);
        if (this.u) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.u);
        }
    }

    /* access modifiers changed from: package-private */
    public void M0(Fragment fragment, androidx.core.os.a aVar) {
        HashSet hashSet = this.f833k.get(fragment);
        if (hashSet != null && hashSet.remove(aVar) && hashSet.isEmpty()) {
            this.f833k.remove(fragment);
            if (fragment.f775g < 3) {
                p(fragment);
                B0(fragment, fragment.W());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void N0(Fragment fragment) {
        if (p0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.w);
        }
        boolean z2 = !fragment.h0();
        if (!fragment.F || z2) {
            this.c.p(fragment);
            if (q0(fragment)) {
                this.u = true;
            }
            fragment.r = true;
            Y0(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public void O(h hVar, boolean z2) {
        if (!z2) {
            if (this.o != null) {
                l();
            } else if (this.x) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.a) {
            if (this.o != null) {
                this.a.add(hVar);
                U0();
            } else if (!z2) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void P0(Fragment fragment) {
        if (u0()) {
            if (p0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.D.z(fragment) && p0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public boolean Q(boolean z2) {
        P(z2);
        boolean z3 = false;
        while (a0(this.z, this.A)) {
            this.b = true;
            try {
                O0(this.z, this.A);
                m();
                z3 = true;
            } catch (Throwable th) {
                m();
                throw th;
            }
        }
        c1();
        L();
        this.c.b();
        return z3;
    }

    /* access modifiers changed from: package-private */
    public void R(h hVar, boolean z2) {
        if (!z2 || (this.o != null && !this.x)) {
            P(z2);
            if (hVar.a(this.z, this.A)) {
                this.b = true;
                try {
                    O0(this.z, this.A);
                } finally {
                    m();
                }
            }
            c1();
            L();
            this.c.b();
        }
    }

    /* access modifiers changed from: package-private */
    public void R0(Parcelable parcelable) {
        s sVar;
        if (parcelable != null) {
            o oVar = (o) parcelable;
            if (oVar.f839g != null) {
                this.c.q();
                Iterator<r> it = oVar.f839g.iterator();
                while (it.hasNext()) {
                    r next = it.next();
                    if (next != null) {
                        Fragment t2 = this.D.t(next.f853h);
                        if (t2 != null) {
                            if (p0(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + t2);
                            }
                            sVar = new s(this.f835m, t2, next);
                        } else {
                            sVar = new s(this.f835m, this.o.h().getClassLoader(), e0(), next);
                        }
                        Fragment i2 = sVar.i();
                        i2.x = this;
                        if (p0(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + i2.f779k + "): " + i2);
                        }
                        sVar.k(this.o.h().getClassLoader());
                        this.c.n(sVar);
                        sVar.q(this.f836n);
                    }
                }
                for (Fragment next2 : this.D.w()) {
                    if (!this.c.c(next2.f779k)) {
                        if (p0(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + next2 + " that was not found in the set of active Fragments " + oVar.f839g);
                        }
                        B0(next2, 1);
                        next2.r = true;
                        B0(next2, -1);
                    }
                }
                this.c.r(oVar.f840h);
                if (oVar.f841i != null) {
                    this.f826d = new ArrayList<>(oVar.f841i.length);
                    int i3 = 0;
                    while (true) {
                        b[] bVarArr = oVar.f841i;
                        if (i3 >= bVarArr.length) {
                            break;
                        }
                        a a2 = bVarArr[i3].a(this);
                        if (p0(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + a2.t + "): " + a2);
                            PrintWriter printWriter = new PrintWriter(new e.h.j.b("FragmentManager"));
                            a2.A("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f826d.add(a2);
                        i3++;
                    }
                } else {
                    this.f826d = null;
                }
                this.f831i.set(oVar.f842j);
                String str = oVar.f843k;
                if (str != null) {
                    Fragment V = V(str);
                    this.r = V;
                    C(V);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Parcelable T0() {
        int size;
        Z();
        N();
        Q(true);
        this.v = true;
        ArrayList<r> s2 = this.c.s();
        b[] bVarArr = null;
        if (s2.isEmpty()) {
            if (p0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> t2 = this.c.t();
        ArrayList<a> arrayList = this.f826d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new b[size];
            for (int i2 = 0; i2 < size; i2++) {
                bVarArr[i2] = new b(this.f826d.get(i2));
                if (p0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f826d.get(i2));
                }
            }
        }
        o oVar = new o();
        oVar.f839g = s2;
        oVar.f840h = t2;
        oVar.f841i = bVarArr;
        oVar.f842j = this.f831i.get();
        Fragment fragment = this.r;
        if (fragment != null) {
            oVar.f843k = fragment.f779k;
        }
        return oVar;
    }

    /* access modifiers changed from: package-private */
    public void U0() {
        synchronized (this.a) {
            boolean z2 = false;
            boolean z3 = this.C != null && !this.C.isEmpty();
            if (this.a.size() == 1) {
                z2 = true;
            }
            if (z3 || z2) {
                this.o.i().removeCallbacks(this.E);
                this.o.i().post(this.E);
                c1();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment V(String str) {
        return this.c.f(str);
    }

    /* access modifiers changed from: package-private */
    public void V0(Fragment fragment, boolean z2) {
        ViewGroup d0 = d0(fragment);
        if (d0 != null && (d0 instanceof g)) {
            ((g) d0).setDrawDisappearingViewsLast(!z2);
        }
    }

    public Fragment W(int i2) {
        return this.c.g(i2);
    }

    /* access modifiers changed from: package-private */
    public void W0(Fragment fragment, p.b bVar) {
        if (!fragment.equals(V(fragment.f779k)) || !(fragment.y == null || fragment.x == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.V = bVar;
    }

    public Fragment X(String str) {
        return this.c.h(str);
    }

    /* access modifiers changed from: package-private */
    public void X0(Fragment fragment) {
        if (fragment == null || (fragment.equals(V(fragment.f779k)) && (fragment.y == null || fragment.x == this))) {
            Fragment fragment2 = this.r;
            this.r = fragment;
            C(fragment2);
            C(this.r);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* access modifiers changed from: package-private */
    public Fragment Y(String str) {
        return this.c.i(str);
    }

    /* access modifiers changed from: package-private */
    public void Z0(Fragment fragment) {
        if (p0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.E) {
            fragment.E = false;
            fragment.R = !fragment.R;
        }
    }

    /* access modifiers changed from: package-private */
    public void b(a aVar) {
        if (this.f826d == null) {
            this.f826d = new ArrayList<>();
        }
        this.f826d.add(aVar);
    }

    public int b0() {
        ArrayList<a> arrayList = this.f826d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void b1(f fVar) {
        this.f835m.p(fVar);
    }

    /* access modifiers changed from: package-private */
    public void c(Fragment fragment, androidx.core.os.a aVar) {
        if (this.f833k.get(fragment) == null) {
            this.f833k.put(fragment, new HashSet());
        }
        this.f833k.get(fragment).add(aVar);
    }

    /* access modifiers changed from: package-private */
    public void d(Fragment fragment) {
        if (p0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        v0(fragment);
        if (!fragment.F) {
            this.c.a(fragment);
            fragment.r = false;
            if (fragment.M == null) {
                fragment.R = false;
            }
            if (q0(fragment)) {
                this.u = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(Fragment fragment) {
        if (u0()) {
            if (p0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.D.r(fragment) && p0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public i e0() {
        i iVar = this.s;
        if (iVar != null) {
            return iVar;
        }
        Fragment fragment = this.q;
        if (fragment != null) {
            return fragment.x.e0();
        }
        return this.t;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f831i.getAndIncrement();
    }

    public List<Fragment> f0() {
        return this.c.m();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: androidx.activity.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: androidx.fragment.app.Fragment} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(androidx.fragment.app.j<?> r3, androidx.fragment.app.f r4, androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.j<?> r0 = r2.o
            if (r0 != 0) goto L_0x004b
            r2.o = r3
            r2.p = r4
            r2.q = r5
            if (r5 == 0) goto L_0x000f
            r2.c1()
        L_0x000f:
            boolean r4 = r3 instanceof androidx.activity.c
            if (r4 == 0) goto L_0x0026
            r4 = r3
            androidx.activity.c r4 = (androidx.activity.c) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.c()
            r2.f829g = r0
            if (r5 == 0) goto L_0x001f
            r4 = r5
        L_0x001f:
            androidx.activity.OnBackPressedDispatcher r0 = r2.f829g
            androidx.activity.b r1 = r2.f830h
            r0.a(r4, r1)
        L_0x0026:
            if (r5 == 0) goto L_0x0031
            androidx.fragment.app.m r3 = r5.x
            androidx.fragment.app.p r3 = r3.c0(r5)
            r2.D = r3
            goto L_0x004a
        L_0x0031:
            boolean r4 = r3 instanceof androidx.lifecycle.s0
            if (r4 == 0) goto L_0x0042
            androidx.lifecycle.s0 r3 = (androidx.lifecycle.s0) r3
            androidx.lifecycle.r0 r3 = r3.o()
            androidx.fragment.app.p r3 = androidx.fragment.app.p.v(r3)
            r2.D = r3
            goto L_0x004a
        L_0x0042:
            androidx.fragment.app.p r3 = new androidx.fragment.app.p
            r4 = 0
            r3.<init>(r4)
            r2.D = r3
        L_0x004a:
            return
        L_0x004b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m.g(androidx.fragment.app.j, androidx.fragment.app.f, androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater.Factory2 g0() {
        return this.f828f;
    }

    /* access modifiers changed from: package-private */
    public void h(Fragment fragment) {
        if (p0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.F) {
            fragment.F = false;
            if (!fragment.q) {
                this.c.a(fragment);
                if (p0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (q0(fragment)) {
                    this.u = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public l h0() {
        return this.f835m;
    }

    public u i() {
        return new a(this);
    }

    /* access modifiers changed from: package-private */
    public Fragment i0() {
        return this.q;
    }

    public Fragment j0() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        boolean z2 = false;
        for (Fragment next : this.c.k()) {
            if (next != null) {
                z2 = q0(next);
                continue;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public r0 l0(Fragment fragment) {
        return this.D.x(fragment);
    }

    /* access modifiers changed from: package-private */
    public void m0() {
        Q(true);
        if (this.f830h.c()) {
            H0();
        } else {
            this.f829g.c();
        }
    }

    /* access modifiers changed from: package-private */
    public void n(a aVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            aVar.C(z4);
        } else {
            aVar.B();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3) {
            v.C(this, arrayList, arrayList2, 0, 1, true, this.f834l);
        }
        if (z4) {
            z0(this.f836n, true);
        }
        for (Fragment next : this.c.k()) {
            if (next != null && next.M != null && next.Q && aVar.F(next.C)) {
                float f2 = next.S;
                if (f2 > 0.0f) {
                    next.M.setAlpha(f2);
                }
                if (z4) {
                    next.S = 0.0f;
                } else {
                    next.S = -1.0f;
                    next.Q = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void n0(Fragment fragment) {
        if (p0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.E) {
            fragment.E = true;
            fragment.R = true ^ fragment.R;
            Y0(fragment);
        }
    }

    public boolean o0() {
        return this.x;
    }

    /* access modifiers changed from: package-private */
    public void q(Fragment fragment) {
        if (p0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.F) {
            fragment.F = true;
            if (fragment.q) {
                if (p0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.c.p(fragment);
                if (q0(fragment)) {
                    this.u = true;
                }
                Y0(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void r() {
        this.v = false;
        this.w = false;
        J(2);
    }

    /* access modifiers changed from: package-private */
    public boolean r0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.i0();
    }

    /* access modifiers changed from: package-private */
    public void s(Configuration configuration) {
        for (Fragment next : this.c.m()) {
            if (next != null) {
                next.Z0(configuration);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean s0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        m mVar = fragment.x;
        if (!fragment.equals(mVar.j0()) || !s0(mVar.q)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean t(MenuItem menuItem) {
        if (this.f836n < 1) {
            return false;
        }
        for (Fragment next : this.c.m()) {
            if (next != null && next.a1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean t0(int i2) {
        return this.f836n >= i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.q;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.q)));
            sb.append("}");
        } else {
            j<?> jVar = this.o;
            if (jVar != null) {
                sb.append(jVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.o)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public void u() {
        this.v = false;
        this.w = false;
        J(1);
    }

    public boolean u0() {
        return this.v || this.w;
    }

    /* access modifiers changed from: package-private */
    public boolean v(Menu menu, MenuInflater menuInflater) {
        if (this.f836n < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z2 = false;
        for (Fragment next : this.c.m()) {
            if (next != null && r0(next) && next.c1(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z2 = true;
            }
        }
        if (this.f827e != null) {
            for (int i2 = 0; i2 < this.f827e.size(); i2++) {
                Fragment fragment = this.f827e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.C0();
                }
            }
        }
        this.f827e = arrayList;
        return z2;
    }

    /* access modifiers changed from: package-private */
    public void v0(Fragment fragment) {
        if (!this.c.c(fragment.f779k)) {
            s sVar = new s(this.f835m, fragment);
            sVar.k(this.o.h().getClassLoader());
            this.c.n(sVar);
            if (fragment.H) {
                if (fragment.G) {
                    e(fragment);
                } else {
                    P0(fragment);
                }
                fragment.H = false;
            }
            sVar.q(this.f836n);
            if (p0(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void w() {
        this.x = true;
        Q(true);
        N();
        J(-1);
        this.o = null;
        this.p = null;
        this.q = null;
        if (this.f829g != null) {
            this.f830h.d();
            this.f829g = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void x() {
        J(1);
    }

    /* access modifiers changed from: package-private */
    public void y() {
        for (Fragment next : this.c.m()) {
            if (next != null) {
                next.i1();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0049, code lost:
        r0 = r0.M;
        r1 = r4.L;
        r0 = r1.indexOfChild(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void y0(androidx.fragment.app.Fragment r4) {
        /*
            r3 = this;
            androidx.fragment.app.t r0 = r3.c
            java.lang.String r1 = r4.f779k
            boolean r0 = r0.c(r1)
            if (r0 != 0) goto L_0x003a
            r0 = 3
            boolean r0 = p0(r0)
            if (r0 == 0) goto L_0x0039
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring moving "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " to state "
            r0.append(r4)
            int r4 = r3.f836n
            r0.append(r4)
            java.lang.String r4 = "since it is not added to "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r4)
        L_0x0039:
            return
        L_0x003a:
            r3.A0(r4)
            android.view.View r0 = r4.M
            if (r0 == 0) goto L_0x009f
            androidx.fragment.app.t r0 = r3.c
            androidx.fragment.app.Fragment r0 = r0.j(r4)
            if (r0 == 0) goto L_0x0061
            android.view.View r0 = r0.M
            android.view.ViewGroup r1 = r4.L
            int r0 = r1.indexOfChild(r0)
            android.view.View r2 = r4.M
            int r2 = r1.indexOfChild(r2)
            if (r2 >= r0) goto L_0x0061
            r1.removeViewAt(r2)
            android.view.View r2 = r4.M
            r1.addView(r2, r0)
        L_0x0061:
            boolean r0 = r4.Q
            if (r0 == 0) goto L_0x009f
            android.view.ViewGroup r0 = r4.L
            if (r0 == 0) goto L_0x009f
            float r0 = r4.S
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x0075
            android.view.View r2 = r4.M
            r2.setAlpha(r0)
        L_0x0075:
            r4.S = r1
            r0 = 0
            r4.Q = r0
            androidx.fragment.app.j<?> r0 = r3.o
            android.content.Context r0 = r0.h()
            androidx.fragment.app.f r1 = r3.p
            r2 = 1
            androidx.fragment.app.e$d r0 = androidx.fragment.app.e.b(r0, r1, r4, r2)
            if (r0 == 0) goto L_0x009f
            android.view.animation.Animation r1 = r0.a
            if (r1 == 0) goto L_0x0093
            android.view.View r0 = r4.M
            r0.startAnimation(r1)
            goto L_0x009f
        L_0x0093:
            android.animation.Animator r1 = r0.b
            android.view.View r2 = r4.M
            r1.setTarget(r2)
            android.animation.Animator r0 = r0.b
            r0.start()
        L_0x009f:
            boolean r0 = r4.R
            if (r0 == 0) goto L_0x00a6
            r3.o(r4)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m.y0(androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    public void z(boolean z2) {
        for (Fragment next : this.c.m()) {
            if (next != null) {
                next.j1(z2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void z0(int i2, boolean z2) {
        j<?> jVar;
        if (this.o == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.f836n) {
            this.f836n = i2;
            for (Fragment y0 : this.c.m()) {
                y0(y0);
            }
            for (Fragment next : this.c.k()) {
                if (next != null && !next.Q) {
                    y0(next);
                }
            }
            a1();
            if (this.u && (jVar = this.o) != null && this.f836n == 4) {
                jVar.r();
                this.u = false;
            }
        }
    }
}
