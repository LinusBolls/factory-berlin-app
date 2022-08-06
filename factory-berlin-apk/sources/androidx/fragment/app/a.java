package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.u;
import androidx.lifecycle.p;
import e.h.j.b;
import java.io.PrintWriter;
import java.util.ArrayList;
import k.h0.d.d;

/* compiled from: BackStackRecord */
final class a extends u implements m.h {
    final m r;
    boolean s;
    int t;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    a(androidx.fragment.app.m r3) {
        /*
            r2 = this;
            androidx.fragment.app.i r0 = r3.e0()
            androidx.fragment.app.j<?> r1 = r3.o
            if (r1 == 0) goto L_0x0011
            android.content.Context r1 = r1.h()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            r2.<init>(r0, r1)
            r0 = -1
            r2.t = r0
            r2.r = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.<init>(androidx.fragment.app.m):void");
    }

    private static boolean H(u.a aVar) {
        Fragment fragment = aVar.b;
        return fragment != null && fragment.q && fragment.M != null && !fragment.F && !fragment.E && fragment.j0();
    }

    public void A(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f865i);
            printWriter.print(" mIndex=");
            printWriter.print(this.t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.s);
            if (this.f862f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f862f));
            }
            if (!(this.b == 0 && this.c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (!(this.f860d == 0 && this.f861e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f860d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f861e));
            }
            if (!(this.f866j == 0 && this.f867k == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f866j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f867k);
            }
            if (!(this.f868l == 0 && this.f869m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f868l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f869m);
            }
        }
        if (!this.a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                u.a aVar = this.a.get(i2);
                switch (aVar.a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = d.K;
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.b);
                if (z) {
                    if (!(aVar.c == 0 && aVar.f871d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f871d));
                    }
                    if (aVar.f872e != 0 || aVar.f873f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f872e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f873f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void B() {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            u.a aVar = this.a.get(i2);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.H1(this.f862f);
            }
            switch (aVar.a) {
                case 1:
                    fragment.G1(aVar.c);
                    this.r.V0(fragment, false);
                    this.r.d(fragment);
                    break;
                case 3:
                    fragment.G1(aVar.f871d);
                    this.r.N0(fragment);
                    break;
                case 4:
                    fragment.G1(aVar.f871d);
                    this.r.n0(fragment);
                    break;
                case 5:
                    fragment.G1(aVar.c);
                    this.r.V0(fragment, false);
                    this.r.Z0(fragment);
                    break;
                case 6:
                    fragment.G1(aVar.f871d);
                    this.r.q(fragment);
                    break;
                case 7:
                    fragment.G1(aVar.c);
                    this.r.V0(fragment, false);
                    this.r.h(fragment);
                    break;
                case 8:
                    this.r.X0(fragment);
                    break;
                case 9:
                    this.r.X0((Fragment) null);
                    break;
                case 10:
                    this.r.W0(fragment, aVar.f875h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
            }
            if (!(this.p || aVar.a == 1 || fragment == null)) {
                this.r.y0(fragment);
            }
        }
        if (!this.p) {
            m mVar = this.r;
            mVar.z0(mVar.f836n, true);
        }
    }

    /* access modifiers changed from: package-private */
    public void C(boolean z) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            u.a aVar = this.a.get(size);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.H1(m.S0(this.f862f));
            }
            switch (aVar.a) {
                case 1:
                    fragment.G1(aVar.f873f);
                    this.r.V0(fragment, true);
                    this.r.N0(fragment);
                    break;
                case 3:
                    fragment.G1(aVar.f872e);
                    this.r.d(fragment);
                    break;
                case 4:
                    fragment.G1(aVar.f872e);
                    this.r.Z0(fragment);
                    break;
                case 5:
                    fragment.G1(aVar.f873f);
                    this.r.V0(fragment, true);
                    this.r.n0(fragment);
                    break;
                case 6:
                    fragment.G1(aVar.f872e);
                    this.r.h(fragment);
                    break;
                case 7:
                    fragment.G1(aVar.f873f);
                    this.r.V0(fragment, true);
                    this.r.q(fragment);
                    break;
                case 8:
                    this.r.X0((Fragment) null);
                    break;
                case 9:
                    this.r.X0(fragment);
                    break;
                case 10:
                    this.r.W0(fragment, aVar.f874g);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
            }
            if (!(this.p || aVar.a == 3 || fragment == null)) {
                this.r.y0(fragment);
            }
        }
        if (!this.p && z) {
            m mVar = this.r;
            mVar.z0(mVar.f836n, true);
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment D(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i2 = 0;
        while (i2 < this.a.size()) {
            u.a aVar = this.a.get(i2);
            int i3 = aVar.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    Fragment fragment3 = aVar.b;
                    int i4 = fragment3.C;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList2.get(size);
                        if (fragment4.C == i4) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.a.add(i2, new u.a(9, fragment4));
                                    i2++;
                                    fragment2 = null;
                                }
                                u.a aVar2 = new u.a(3, fragment4);
                                aVar2.c = aVar.c;
                                aVar2.f872e = aVar.f872e;
                                aVar2.f871d = aVar.f871d;
                                aVar2.f873f = aVar.f873f;
                                this.a.add(i2, aVar2);
                                arrayList2.remove(fragment4);
                                i2++;
                            }
                        }
                    }
                    if (z) {
                        this.a.remove(i2);
                        i2--;
                    } else {
                        aVar.a = 1;
                        arrayList2.add(fragment3);
                    }
                } else if (i3 == 3 || i3 == 6) {
                    arrayList2.remove(aVar.b);
                    Fragment fragment5 = aVar.b;
                    if (fragment5 == fragment2) {
                        this.a.add(i2, new u.a(9, fragment5));
                        i2++;
                        fragment2 = null;
                    }
                } else if (i3 != 7) {
                    if (i3 == 8) {
                        this.a.add(i2, new u.a(9, fragment2));
                        i2++;
                        fragment2 = aVar.b;
                    }
                }
                i2++;
            }
            arrayList2.add(aVar.b);
            i2++;
        }
        return fragment2;
    }

    public String E() {
        return this.f865i;
    }

    /* access modifiers changed from: package-private */
    public boolean F(int i2) {
        int size = this.a.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.a.get(i3).b;
            int i4 = fragment != null ? fragment.C : 0;
            if (i4 != 0 && i4 == i2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean G(ArrayList<a> arrayList, int i2, int i3) {
        if (i3 == i2) {
            return false;
        }
        int size = this.a.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            Fragment fragment = this.a.get(i5).b;
            int i6 = fragment != null ? fragment.C : 0;
            if (!(i6 == 0 || i6 == i4)) {
                for (int i7 = i2; i7 < i3; i7++) {
                    a aVar = arrayList.get(i7);
                    int size2 = aVar.a.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        Fragment fragment2 = aVar.a.get(i8).b;
                        if ((fragment2 != null ? fragment2.C : 0) == i6) {
                            return true;
                        }
                    }
                }
                i4 = i6;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean I() {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            if (H(this.a.get(i2))) {
                return true;
            }
        }
        return false;
    }

    public void J() {
        if (this.q != null) {
            for (int i2 = 0; i2 < this.q.size(); i2++) {
                this.q.get(i2).run();
            }
            this.q = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void K(Fragment.d dVar) {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            u.a aVar = this.a.get(i2);
            if (H(aVar)) {
                aVar.b.I1(dVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment L(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            u.a aVar = this.a.get(size);
            int i2 = aVar.a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.b;
                            break;
                        case 10:
                            aVar.f875h = aVar.f874g;
                            break;
                    }
                }
                arrayList.add(aVar.b);
            }
            arrayList.remove(aVar.b);
        }
        return fragment;
    }

    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (m.p0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f863g) {
            return true;
        }
        this.r.b(this);
        return true;
    }

    public int j() {
        return y(false);
    }

    public int k() {
        return y(true);
    }

    public void l() {
        o();
        this.r.R(this, false);
    }

    public void m() {
        o();
        this.r.R(this, true);
    }

    public u n(Fragment fragment) {
        m mVar = fragment.x;
        if (mVar == null || mVar == this.r) {
            super.n(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    public void p(int i2, Fragment fragment, String str, int i3) {
        super.p(i2, fragment, str, i3);
        fragment.x = this.r;
    }

    public u q(Fragment fragment) {
        m mVar = fragment.x;
        if (mVar == null || mVar == this.r) {
            super.q(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.t >= 0) {
            sb.append(" #");
            sb.append(this.t);
        }
        if (this.f865i != null) {
            sb.append(" ");
            sb.append(this.f865i);
        }
        sb.append("}");
        return sb.toString();
    }

    public u u(Fragment fragment, p.b bVar) {
        if (fragment.x != this.r) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.r);
        } else if (bVar.a(p.b.CREATED)) {
            super.u(fragment, bVar);
            return this;
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle below " + p.b.CREATED);
        }
    }

    public u v(Fragment fragment) {
        m mVar;
        if (fragment == null || (mVar = fragment.x) == null || mVar == this.r) {
            super.v(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    public void x(int i2) {
        if (this.f863g) {
            if (m.p0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            int size = this.a.size();
            for (int i3 = 0; i3 < size; i3++) {
                u.a aVar = this.a.get(i3);
                Fragment fragment = aVar.b;
                if (fragment != null) {
                    fragment.w += i2;
                    if (m.p0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.b + " to " + aVar.b.w);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int y(boolean z) {
        if (!this.s) {
            if (m.p0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new b("FragmentManager"));
                z("  ", printWriter);
                printWriter.close();
            }
            this.s = true;
            if (this.f863g) {
                this.t = this.r.f();
            } else {
                this.t = -1;
            }
            this.r.O(this, z);
            return this.t;
        }
        throw new IllegalStateException("commit already called");
    }

    public void z(String str, PrintWriter printWriter) {
        A(str, printWriter, true);
    }
}
