package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import e.h.k.d0.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.z.b {
    boolean A = false;
    private BitSet B;
    int C = -1;
    int D = RecyclerView.UNDEFINED_DURATION;
    d E = new d();
    private int F = 2;
    private boolean G;
    private boolean H;
    private e I;
    private int J;
    private final Rect K = new Rect();
    private final b L = new b();
    private boolean M = false;
    private boolean N = true;
    private int[] O;
    private final Runnable P = new a();
    private int s = -1;
    f[] t;
    t u;
    t v;
    private int w;
    private int x;
    private final n y;
    boolean z = false;

    class a implements Runnable {
        a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.T1();
        }
    }

    class b {
        int a;
        int b;
        boolean c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1213d;

        /* renamed from: e  reason: collision with root package name */
        boolean f1214e;

        /* renamed from: f  reason: collision with root package name */
        int[] f1215f;

        b() {
            c();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int i2;
            if (this.c) {
                i2 = StaggeredGridLayoutManager.this.u.i();
            } else {
                i2 = StaggeredGridLayoutManager.this.u.m();
            }
            this.b = i2;
        }

        /* access modifiers changed from: package-private */
        public void b(int i2) {
            if (this.c) {
                this.b = StaggeredGridLayoutManager.this.u.i() - i2;
            } else {
                this.b = StaggeredGridLayoutManager.this.u.m() + i2;
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.a = -1;
            this.b = RecyclerView.UNDEFINED_DURATION;
            this.c = false;
            this.f1213d = false;
            this.f1214e = false;
            int[] iArr = this.f1215f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: package-private */
        public void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f1215f;
            if (iArr == null || iArr.length < length) {
                this.f1215f = new int[StaggeredGridLayoutManager.this.t.length];
            }
            for (int i2 = 0; i2 < length; i2++) {
                this.f1215f[i2] = fVarArr[i2].p(RecyclerView.UNDEFINED_DURATION);
            }
        }
    }

    public static class c extends RecyclerView.p {

        /* renamed from: e  reason: collision with root package name */
        f f1217e;

        /* renamed from: f  reason: collision with root package name */
        boolean f1218f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int e() {
            f fVar = this.f1217e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f1232e;
        }

        public boolean f() {
            return this.f1218f;
        }

        public c(int i2, int i3) {
            super(i2, i3);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        int f1223g;

        /* renamed from: h  reason: collision with root package name */
        int f1224h;

        /* renamed from: i  reason: collision with root package name */
        int f1225i;

        /* renamed from: j  reason: collision with root package name */
        int[] f1226j;

        /* renamed from: k  reason: collision with root package name */
        int f1227k;

        /* renamed from: l  reason: collision with root package name */
        int[] f1228l;

        /* renamed from: m  reason: collision with root package name */
        List<d.a> f1229m;

        /* renamed from: n  reason: collision with root package name */
        boolean f1230n;
        boolean o;
        boolean p;

        static class a implements Parcelable.Creator<e> {
            a() {
            }

            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            /* renamed from: b */
            public e[] newArray(int i2) {
                return new e[i2];
            }
        }

        public e() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f1226j = null;
            this.f1225i = 0;
            this.f1223g = -1;
            this.f1224h = -1;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f1226j = null;
            this.f1225i = 0;
            this.f1227k = 0;
            this.f1228l = null;
            this.f1229m = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f1223g);
            parcel.writeInt(this.f1224h);
            parcel.writeInt(this.f1225i);
            if (this.f1225i > 0) {
                parcel.writeIntArray(this.f1226j);
            }
            parcel.writeInt(this.f1227k);
            if (this.f1227k > 0) {
                parcel.writeIntArray(this.f1228l);
            }
            parcel.writeInt(this.f1230n ? 1 : 0);
            parcel.writeInt(this.o ? 1 : 0);
            parcel.writeInt(this.p ? 1 : 0);
            parcel.writeList(this.f1229m);
        }

        e(Parcel parcel) {
            this.f1223g = parcel.readInt();
            this.f1224h = parcel.readInt();
            int readInt = parcel.readInt();
            this.f1225i = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f1226j = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f1227k = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f1228l = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f1230n = parcel.readInt() == 1;
            this.o = parcel.readInt() == 1;
            this.p = parcel.readInt() == 1 ? true : z;
            this.f1229m = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f1225i = eVar.f1225i;
            this.f1223g = eVar.f1223g;
            this.f1224h = eVar.f1224h;
            this.f1226j = eVar.f1226j;
            this.f1227k = eVar.f1227k;
            this.f1228l = eVar.f1228l;
            this.f1230n = eVar.f1230n;
            this.o = eVar.o;
            this.p = eVar.p;
            this.f1229m = eVar.f1229m;
        }
    }

    class f {
        ArrayList<View> a = new ArrayList<>();
        int b = RecyclerView.UNDEFINED_DURATION;
        int c = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: d  reason: collision with root package name */
        int f1231d = 0;

        /* renamed from: e  reason: collision with root package name */
        final int f1232e;

        f(int i2) {
            this.f1232e = i2;
        }

        /* access modifiers changed from: package-private */
        public void a(View view) {
            c n2 = n(view);
            n2.f1217e = this;
            this.a.add(view);
            this.c = RecyclerView.UNDEFINED_DURATION;
            if (this.a.size() == 1) {
                this.b = RecyclerView.UNDEFINED_DURATION;
            }
            if (n2.c() || n2.b()) {
                this.f1231d += StaggeredGridLayoutManager.this.u.e(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z, int i2) {
            int i3;
            if (z) {
                i3 = l(RecyclerView.UNDEFINED_DURATION);
            } else {
                i3 = p(RecyclerView.UNDEFINED_DURATION);
            }
            e();
            if (i3 != Integer.MIN_VALUE) {
                if (z && i3 < StaggeredGridLayoutManager.this.u.i()) {
                    return;
                }
                if (z || i3 <= StaggeredGridLayoutManager.this.u.m()) {
                    if (i2 != Integer.MIN_VALUE) {
                        i3 += i2;
                    }
                    this.c = i3;
                    this.b = i3;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            d.a f2;
            ArrayList<View> arrayList = this.a;
            View view = arrayList.get(arrayList.size() - 1);
            c n2 = n(view);
            this.c = StaggeredGridLayoutManager.this.u.d(view);
            if (n2.f1218f && (f2 = StaggeredGridLayoutManager.this.E.f(n2.a())) != null && f2.f1220h == 1) {
                this.c += f2.a(this.f1232e);
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            d.a f2;
            View view = this.a.get(0);
            c n2 = n(view);
            this.b = StaggeredGridLayoutManager.this.u.g(view);
            if (n2.f1218f && (f2 = StaggeredGridLayoutManager.this.E.f(n2.a())) != null && f2.f1220h == -1) {
                this.b -= f2.a(this.f1232e);
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.a.clear();
            q();
            this.f1231d = 0;
        }

        public int f() {
            if (StaggeredGridLayoutManager.this.z) {
                return i(this.a.size() - 1, -1, true);
            }
            return i(0, this.a.size(), true);
        }

        public int g() {
            if (StaggeredGridLayoutManager.this.z) {
                return i(0, this.a.size(), true);
            }
            return i(this.a.size() - 1, -1, true);
        }

        /* access modifiers changed from: package-private */
        public int h(int i2, int i3, boolean z, boolean z2, boolean z3) {
            int m2 = StaggeredGridLayoutManager.this.u.m();
            int i4 = StaggeredGridLayoutManager.this.u.i();
            int i5 = i3 > i2 ? 1 : -1;
            while (i2 != i3) {
                View view = this.a.get(i2);
                int g2 = StaggeredGridLayoutManager.this.u.g(view);
                int d2 = StaggeredGridLayoutManager.this.u.d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? g2 < i4 : g2 <= i4;
                if (!z3 ? d2 > m2 : d2 >= m2) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.i0(view);
                        }
                        if (g2 < m2 || d2 > i4) {
                            return StaggeredGridLayoutManager.this.i0(view);
                        }
                    } else if (g2 >= m2 && d2 <= i4) {
                        return StaggeredGridLayoutManager.this.i0(view);
                    }
                }
                i2 += i5;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public int i(int i2, int i3, boolean z) {
            return h(i2, i3, false, false, z);
        }

        public int j() {
            return this.f1231d;
        }

        /* access modifiers changed from: package-private */
        public int k() {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            c();
            return this.c;
        }

        /* access modifiers changed from: package-private */
        public int l(int i2) {
            int i3 = this.c;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.a.size() == 0) {
                return i2;
            }
            c();
            return this.c;
        }

        public View m(int i2, int i3) {
            View view = null;
            if (i3 != -1) {
                int size = this.a.size() - 1;
                while (size >= 0) {
                    View view2 = this.a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.z && staggeredGridLayoutManager.i0(view2) >= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.z && staggeredGridLayoutManager2.i0(view2) <= i2) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.a.size();
                int i4 = 0;
                while (i4 < size2) {
                    View view3 = this.a.get(i4);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.z && staggeredGridLayoutManager3.i0(view3) <= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.z && staggeredGridLayoutManager4.i0(view3) >= i2) || !view3.hasFocusable()) {
                        break;
                    }
                    i4++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        public c n(View view) {
            return (c) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        public int o() {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            d();
            return this.b;
        }

        /* access modifiers changed from: package-private */
        public int p(int i2) {
            int i3 = this.b;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.a.size() == 0) {
                return i2;
            }
            d();
            return this.b;
        }

        /* access modifiers changed from: package-private */
        public void q() {
            this.b = RecyclerView.UNDEFINED_DURATION;
            this.c = RecyclerView.UNDEFINED_DURATION;
        }

        /* access modifiers changed from: package-private */
        public void r(int i2) {
            int i3 = this.b;
            if (i3 != Integer.MIN_VALUE) {
                this.b = i3 + i2;
            }
            int i4 = this.c;
            if (i4 != Integer.MIN_VALUE) {
                this.c = i4 + i2;
            }
        }

        /* access modifiers changed from: package-private */
        public void s() {
            int size = this.a.size();
            View remove = this.a.remove(size - 1);
            c n2 = n(remove);
            n2.f1217e = null;
            if (n2.c() || n2.b()) {
                this.f1231d -= StaggeredGridLayoutManager.this.u.e(remove);
            }
            if (size == 1) {
                this.b = RecyclerView.UNDEFINED_DURATION;
            }
            this.c = RecyclerView.UNDEFINED_DURATION;
        }

        /* access modifiers changed from: package-private */
        public void t() {
            View remove = this.a.remove(0);
            c n2 = n(remove);
            n2.f1217e = null;
            if (this.a.size() == 0) {
                this.c = RecyclerView.UNDEFINED_DURATION;
            }
            if (n2.c() || n2.b()) {
                this.f1231d -= StaggeredGridLayoutManager.this.u.e(remove);
            }
            this.b = RecyclerView.UNDEFINED_DURATION;
        }

        /* access modifiers changed from: package-private */
        public void u(View view) {
            c n2 = n(view);
            n2.f1217e = this;
            this.a.add(0, view);
            this.b = RecyclerView.UNDEFINED_DURATION;
            if (this.a.size() == 1) {
                this.c = RecyclerView.UNDEFINED_DURATION;
            }
            if (n2.c() || n2.b()) {
                this.f1231d += StaggeredGridLayoutManager.this.u.e(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void v(int i2) {
            this.b = i2;
            this.c = i2;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        RecyclerView.o.d j0 = RecyclerView.o.j0(context, attributeSet, i2, i3);
        I2(j0.a);
        K2(j0.b);
        J2(j0.c);
        this.y = new n();
        b2();
    }

    private void A2(View view) {
        for (int i2 = this.s - 1; i2 >= 0; i2--) {
            this.t[i2].u(view);
        }
    }

    private void B2(RecyclerView.v vVar, n nVar) {
        int i2;
        int i3;
        if (nVar.a && !nVar.f1340i) {
            if (nVar.b == 0) {
                if (nVar.f1336e == -1) {
                    C2(vVar, nVar.f1338g);
                } else {
                    D2(vVar, nVar.f1337f);
                }
            } else if (nVar.f1336e == -1) {
                int i4 = nVar.f1337f;
                int n2 = i4 - n2(i4);
                if (n2 < 0) {
                    i3 = nVar.f1338g;
                } else {
                    i3 = nVar.f1338g - Math.min(n2, nVar.b);
                }
                C2(vVar, i3);
            } else {
                int o2 = o2(nVar.f1338g) - nVar.f1338g;
                if (o2 < 0) {
                    i2 = nVar.f1337f;
                } else {
                    i2 = Math.min(o2, nVar.b) + nVar.f1337f;
                }
                D2(vVar, i2);
            }
        }
    }

    private void C2(RecyclerView.v vVar, int i2) {
        int K2 = K() - 1;
        while (K2 >= 0) {
            View J2 = J(K2);
            if (this.u.g(J2) >= i2 && this.u.q(J2) >= i2) {
                c cVar = (c) J2.getLayoutParams();
                if (cVar.f1218f) {
                    int i3 = 0;
                    while (i3 < this.s) {
                        if (this.t[i3].a.size() != 1) {
                            i3++;
                        } else {
                            return;
                        }
                    }
                    for (int i4 = 0; i4 < this.s; i4++) {
                        this.t[i4].s();
                    }
                } else if (cVar.f1217e.a.size() != 1) {
                    cVar.f1217e.s();
                } else {
                    return;
                }
                n1(J2, vVar);
                K2--;
            } else {
                return;
            }
        }
    }

    private void D2(RecyclerView.v vVar, int i2) {
        while (K() > 0) {
            View J2 = J(0);
            if (this.u.d(J2) <= i2 && this.u.p(J2) <= i2) {
                c cVar = (c) J2.getLayoutParams();
                if (cVar.f1218f) {
                    int i3 = 0;
                    while (i3 < this.s) {
                        if (this.t[i3].a.size() != 1) {
                            i3++;
                        } else {
                            return;
                        }
                    }
                    for (int i4 = 0; i4 < this.s; i4++) {
                        this.t[i4].t();
                    }
                } else if (cVar.f1217e.a.size() != 1) {
                    cVar.f1217e.t();
                } else {
                    return;
                }
                n1(J2, vVar);
            } else {
                return;
            }
        }
    }

    private void E2() {
        if (this.v.k() != 1073741824) {
            float f2 = 0.0f;
            int K2 = K();
            for (int i2 = 0; i2 < K2; i2++) {
                View J2 = J(i2);
                float e2 = (float) this.v.e(J2);
                if (e2 >= f2) {
                    if (((c) J2.getLayoutParams()).f()) {
                        e2 = (e2 * 1.0f) / ((float) this.s);
                    }
                    f2 = Math.max(f2, e2);
                }
            }
            int i3 = this.x;
            int round = Math.round(f2 * ((float) this.s));
            if (this.v.k() == Integer.MIN_VALUE) {
                round = Math.min(round, this.v.n());
            }
            Q2(round);
            if (this.x != i3) {
                for (int i4 = 0; i4 < K2; i4++) {
                    View J3 = J(i4);
                    c cVar = (c) J3.getLayoutParams();
                    if (!cVar.f1218f) {
                        if (!u2() || this.w != 1) {
                            int i5 = cVar.f1217e.f1232e;
                            int i6 = this.x * i5;
                            int i7 = i5 * i3;
                            if (this.w == 1) {
                                J3.offsetLeftAndRight(i6 - i7);
                            } else {
                                J3.offsetTopAndBottom(i6 - i7);
                            }
                        } else {
                            int i8 = this.s;
                            int i9 = cVar.f1217e.f1232e;
                            J3.offsetLeftAndRight(((-((i8 - 1) - i9)) * this.x) - ((-((i8 - 1) - i9)) * i3));
                        }
                    }
                }
            }
        }
    }

    private void F2() {
        if (this.w == 1 || !u2()) {
            this.A = this.z;
        } else {
            this.A = !this.z;
        }
    }

    private void H2(int i2) {
        n nVar = this.y;
        nVar.f1336e = i2;
        int i3 = 1;
        if (this.A != (i2 == -1)) {
            i3 = -1;
        }
        nVar.f1335d = i3;
    }

    private void L2(int i2, int i3) {
        for (int i4 = 0; i4 < this.s; i4++) {
            if (!this.t[i4].a.isEmpty()) {
                R2(this.t[i4], i2, i3);
            }
        }
    }

    private boolean M2(RecyclerView.a0 a0Var, b bVar) {
        int i2;
        if (this.G) {
            i2 = h2(a0Var.b());
        } else {
            i2 = d2(a0Var.b());
        }
        bVar.a = i2;
        bVar.b = RecyclerView.UNDEFINED_DURATION;
        return true;
    }

    private void N1(View view) {
        for (int i2 = this.s - 1; i2 >= 0; i2--) {
            this.t[i2].a(view);
        }
    }

    private void O1(b bVar) {
        int i2;
        e eVar = this.I;
        int i3 = eVar.f1225i;
        if (i3 > 0) {
            if (i3 == this.s) {
                for (int i4 = 0; i4 < this.s; i4++) {
                    this.t[i4].e();
                    e eVar2 = this.I;
                    int i5 = eVar2.f1226j[i4];
                    if (i5 != Integer.MIN_VALUE) {
                        if (eVar2.o) {
                            i2 = this.u.i();
                        } else {
                            i2 = this.u.m();
                        }
                        i5 += i2;
                    }
                    this.t[i4].v(i5);
                }
            } else {
                eVar.b();
                e eVar3 = this.I;
                eVar3.f1223g = eVar3.f1224h;
            }
        }
        e eVar4 = this.I;
        this.H = eVar4.p;
        J2(eVar4.f1230n);
        F2();
        e eVar5 = this.I;
        int i6 = eVar5.f1223g;
        if (i6 != -1) {
            this.C = i6;
            bVar.c = eVar5.o;
        } else {
            bVar.c = this.A;
        }
        e eVar6 = this.I;
        if (eVar6.f1227k > 1) {
            d dVar = this.E;
            dVar.a = eVar6.f1228l;
            dVar.b = eVar6.f1229m;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void P2(int r5, androidx.recyclerview.widget.RecyclerView.a0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.n r0 = r4.y
            r1 = 0
            r0.b = r1
            r0.c = r5
            boolean r0 = r4.y0()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            int r6 = r6.c()
            r0 = -1
            if (r6 == r0) goto L_0x002e
            boolean r0 = r4.A
            if (r6 >= r5) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r0 != r5) goto L_0x0025
            androidx.recyclerview.widget.t r5 = r4.u
            int r5 = r5.n()
            goto L_0x002f
        L_0x0025:
            androidx.recyclerview.widget.t r5 = r4.u
            int r5 = r5.n()
            r6 = r5
            r5 = 0
            goto L_0x0030
        L_0x002e:
            r5 = 0
        L_0x002f:
            r6 = 0
        L_0x0030:
            boolean r0 = r4.N()
            if (r0 == 0) goto L_0x004d
            androidx.recyclerview.widget.n r0 = r4.y
            androidx.recyclerview.widget.t r3 = r4.u
            int r3 = r3.m()
            int r3 = r3 - r6
            r0.f1337f = r3
            androidx.recyclerview.widget.n r6 = r4.y
            androidx.recyclerview.widget.t r0 = r4.u
            int r0 = r0.i()
            int r0 = r0 + r5
            r6.f1338g = r0
            goto L_0x005d
        L_0x004d:
            androidx.recyclerview.widget.n r0 = r4.y
            androidx.recyclerview.widget.t r3 = r4.u
            int r3 = r3.h()
            int r3 = r3 + r5
            r0.f1338g = r3
            androidx.recyclerview.widget.n r5 = r4.y
            int r6 = -r6
            r5.f1337f = r6
        L_0x005d:
            androidx.recyclerview.widget.n r5 = r4.y
            r5.f1339h = r1
            r5.a = r2
            androidx.recyclerview.widget.t r6 = r4.u
            int r6 = r6.k()
            if (r6 != 0) goto L_0x0074
            androidx.recyclerview.widget.t r6 = r4.u
            int r6 = r6.h()
            if (r6 != 0) goto L_0x0074
            r1 = 1
        L_0x0074:
            r5.f1340i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.P2(int, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    private void R1(View view, c cVar, n nVar) {
        if (nVar.f1336e == 1) {
            if (cVar.f1218f) {
                N1(view);
            } else {
                cVar.f1217e.a(view);
            }
        } else if (cVar.f1218f) {
            A2(view);
        } else {
            cVar.f1217e.u(view);
        }
    }

    private void R2(f fVar, int i2, int i3) {
        int j2 = fVar.j();
        if (i2 == -1) {
            if (fVar.o() + j2 <= i3) {
                this.B.set(fVar.f1232e, false);
            }
        } else if (fVar.k() - j2 >= i3) {
            this.B.set(fVar.f1232e, false);
        }
    }

    private int S1(int i2) {
        if (K() != 0) {
            if ((i2 < k2()) != this.A) {
                return -1;
            }
            return 1;
        } else if (this.A) {
            return 1;
        } else {
            return -1;
        }
    }

    private int S2(int i2, int i3, int i4) {
        if (i3 == 0 && i4 == 0) {
            return i2;
        }
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i3) - i4), mode);
        }
        return i2;
    }

    private boolean U1(f fVar) {
        if (this.A) {
            if (fVar.k() < this.u.i()) {
                ArrayList<View> arrayList = fVar.a;
                return !fVar.n(arrayList.get(arrayList.size() - 1)).f1218f;
            }
        } else if (fVar.o() > this.u.m()) {
            return !fVar.n(fVar.a.get(0)).f1218f;
        }
        return false;
    }

    private int V1(RecyclerView.a0 a0Var) {
        if (K() == 0) {
            return 0;
        }
        return v.a(a0Var, this.u, f2(!this.N), e2(!this.N), this, this.N);
    }

    private int W1(RecyclerView.a0 a0Var) {
        if (K() == 0) {
            return 0;
        }
        return v.b(a0Var, this.u, f2(!this.N), e2(!this.N), this, this.N, this.A);
    }

    private int X1(RecyclerView.a0 a0Var) {
        if (K() == 0) {
            return 0;
        }
        return v.c(a0Var, this.u, f2(!this.N), e2(!this.N), this, this.N);
    }

    private int Y1(int i2) {
        if (i2 == 1) {
            return (this.w != 1 && u2()) ? 1 : -1;
        }
        if (i2 == 2) {
            return (this.w != 1 && u2()) ? -1 : 1;
        }
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 == 130 && this.w == 1) {
                        return 1;
                    }
                    return RecyclerView.UNDEFINED_DURATION;
                } else if (this.w == 0) {
                    return 1;
                } else {
                    return RecyclerView.UNDEFINED_DURATION;
                }
            } else if (this.w == 1) {
                return -1;
            } else {
                return RecyclerView.UNDEFINED_DURATION;
            }
        } else if (this.w == 0) {
            return -1;
        } else {
            return RecyclerView.UNDEFINED_DURATION;
        }
    }

    private d.a Z1(int i2) {
        d.a aVar = new d.a();
        aVar.f1221i = new int[this.s];
        for (int i3 = 0; i3 < this.s; i3++) {
            aVar.f1221i[i3] = i2 - this.t[i3].l(i2);
        }
        return aVar;
    }

    private d.a a2(int i2) {
        d.a aVar = new d.a();
        aVar.f1221i = new int[this.s];
        for (int i3 = 0; i3 < this.s; i3++) {
            aVar.f1221i[i3] = this.t[i3].p(i2) - i2;
        }
        return aVar;
    }

    private void b2() {
        this.u = t.b(this, this.w);
        this.v = t.b(this, 1 - this.w);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r9v5 */
    private int c2(RecyclerView.v vVar, n nVar, RecyclerView.a0 a0Var) {
        int i2;
        int i3;
        int i4;
        f fVar;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13;
        RecyclerView.v vVar2 = vVar;
        n nVar2 = nVar;
        ? r9 = 0;
        this.B.set(0, this.s, true);
        if (this.y.f1340i) {
            i2 = nVar2.f1336e == 1 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION;
        } else {
            if (nVar2.f1336e == 1) {
                i13 = nVar2.f1338g + nVar2.b;
            } else {
                i13 = nVar2.f1337f - nVar2.b;
            }
            i2 = i13;
        }
        L2(nVar2.f1336e, i2);
        if (this.A) {
            i3 = this.u.i();
        } else {
            i3 = this.u.m();
        }
        int i14 = i3;
        boolean z3 = false;
        while (nVar.a(a0Var) && (this.y.f1340i || !this.B.isEmpty())) {
            View b2 = nVar2.b(vVar2);
            c cVar = (c) b2.getLayoutParams();
            int a2 = cVar.a();
            int g2 = this.E.g(a2);
            boolean z4 = g2 == -1;
            if (z4) {
                fVar = cVar.f1218f ? this.t[r9] : q2(nVar2);
                this.E.n(a2, fVar);
            } else {
                fVar = this.t[g2];
            }
            f fVar2 = fVar;
            cVar.f1217e = fVar2;
            if (nVar2.f1336e == 1) {
                e(b2);
            } else {
                f(b2, r9);
            }
            w2(b2, cVar, r9);
            if (nVar2.f1336e == 1) {
                if (cVar.f1218f) {
                    i12 = m2(i14);
                } else {
                    i12 = fVar2.l(i14);
                }
                int e2 = this.u.e(b2) + i12;
                if (z4 && cVar.f1218f) {
                    d.a Z1 = Z1(i12);
                    Z1.f1220h = -1;
                    Z1.f1219g = a2;
                    this.E.a(Z1);
                }
                i5 = e2;
                i6 = i12;
            } else {
                if (cVar.f1218f) {
                    i11 = p2(i14);
                } else {
                    i11 = fVar2.p(i14);
                }
                i6 = i11 - this.u.e(b2);
                if (z4 && cVar.f1218f) {
                    d.a a22 = a2(i11);
                    a22.f1220h = 1;
                    a22.f1219g = a2;
                    this.E.a(a22);
                }
                i5 = i11;
            }
            if (cVar.f1218f && nVar2.f1335d == -1) {
                if (z4) {
                    this.M = true;
                } else {
                    if (nVar2.f1336e == 1) {
                        z2 = P1();
                    } else {
                        z2 = Q1();
                    }
                    if (!z2) {
                        d.a f2 = this.E.f(a2);
                        if (f2 != null) {
                            f2.f1222j = true;
                        }
                        this.M = true;
                    }
                }
            }
            R1(b2, cVar, nVar2);
            if (!u2() || this.w != 1) {
                if (cVar.f1218f) {
                    i9 = this.v.m();
                } else {
                    i9 = (fVar2.f1232e * this.x) + this.v.m();
                }
                i8 = i9;
                i7 = this.v.e(b2) + i9;
            } else {
                if (cVar.f1218f) {
                    i10 = this.v.i();
                } else {
                    i10 = this.v.i() - (((this.s - 1) - fVar2.f1232e) * this.x);
                }
                i7 = i10;
                i8 = i10 - this.v.e(b2);
            }
            if (this.w == 1) {
                A0(b2, i8, i6, i7, i5);
            } else {
                A0(b2, i6, i8, i5, i7);
            }
            if (cVar.f1218f) {
                L2(this.y.f1336e, i2);
            } else {
                R2(fVar2, this.y.f1336e, i2);
            }
            B2(vVar2, this.y);
            if (this.y.f1339h && b2.hasFocusable()) {
                if (cVar.f1218f) {
                    this.B.clear();
                } else {
                    this.B.set(fVar2.f1232e, false);
                    z3 = true;
                    r9 = 0;
                }
            }
            z3 = true;
            r9 = 0;
        }
        if (!z3) {
            B2(vVar2, this.y);
        }
        if (this.y.f1336e == -1) {
            i4 = this.u.m() - p2(this.u.m());
        } else {
            i4 = m2(this.u.i()) - this.u.i();
        }
        if (i4 > 0) {
            return Math.min(nVar2.b, i4);
        }
        return 0;
    }

    private int d2(int i2) {
        int K2 = K();
        for (int i3 = 0; i3 < K2; i3++) {
            int i0 = i0(J(i3));
            if (i0 >= 0 && i0 < i2) {
                return i0;
            }
        }
        return 0;
    }

    private int h2(int i2) {
        for (int K2 = K() - 1; K2 >= 0; K2--) {
            int i0 = i0(J(K2));
            if (i0 >= 0 && i0 < i2) {
                return i0;
            }
        }
        return 0;
    }

    private void i2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z2) {
        int i2;
        int m2 = m2(RecyclerView.UNDEFINED_DURATION);
        if (m2 != Integer.MIN_VALUE && (i2 = this.u.i() - m2) > 0) {
            int i3 = i2 - (-G2(-i2, vVar, a0Var));
            if (z2 && i3 > 0) {
                this.u.r(i3);
            }
        }
    }

    private void j2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z2) {
        int m2;
        int p2 = p2(Integer.MAX_VALUE);
        if (p2 != Integer.MAX_VALUE && (m2 = p2 - this.u.m()) > 0) {
            int G2 = m2 - G2(m2, vVar, a0Var);
            if (z2 && G2 > 0) {
                this.u.r(-G2);
            }
        }
    }

    private int m2(int i2) {
        int l2 = this.t[0].l(i2);
        for (int i3 = 1; i3 < this.s; i3++) {
            int l3 = this.t[i3].l(i2);
            if (l3 > l2) {
                l2 = l3;
            }
        }
        return l2;
    }

    private int n2(int i2) {
        int p = this.t[0].p(i2);
        for (int i3 = 1; i3 < this.s; i3++) {
            int p2 = this.t[i3].p(i2);
            if (p2 > p) {
                p = p2;
            }
        }
        return p;
    }

    private int o2(int i2) {
        int l2 = this.t[0].l(i2);
        for (int i3 = 1; i3 < this.s; i3++) {
            int l3 = this.t[i3].l(i2);
            if (l3 < l2) {
                l2 = l3;
            }
        }
        return l2;
    }

    private int p2(int i2) {
        int p = this.t[0].p(i2);
        for (int i3 = 1; i3 < this.s; i3++) {
            int p2 = this.t[i3].p(i2);
            if (p2 < p) {
                p = p2;
            }
        }
        return p;
    }

    private f q2(n nVar) {
        int i2;
        int i3;
        int i4 = -1;
        if (y2(nVar.f1336e)) {
            i3 = this.s - 1;
            i2 = -1;
        } else {
            i3 = 0;
            i4 = this.s;
            i2 = 1;
        }
        f fVar = null;
        if (nVar.f1336e == 1) {
            int i5 = Integer.MAX_VALUE;
            int m2 = this.u.m();
            while (i3 != i4) {
                f fVar2 = this.t[i3];
                int l2 = fVar2.l(m2);
                if (l2 < i5) {
                    fVar = fVar2;
                    i5 = l2;
                }
                i3 += i2;
            }
            return fVar;
        }
        int i6 = RecyclerView.UNDEFINED_DURATION;
        int i7 = this.u.i();
        while (i3 != i4) {
            f fVar3 = this.t[i3];
            int p = fVar3.p(i7);
            if (p > i6) {
                fVar = fVar3;
                i6 = p;
            }
            i3 += i2;
        }
        return fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.l2()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.k2()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.E
            r7.j(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.k(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.j(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.A
            if (r7 == 0) goto L_0x004d
            int r7 = r6.k2()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.l2()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.u1()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.r2(int, int, int):void");
    }

    private void v2(View view, int i2, int i3, boolean z2) {
        boolean z3;
        k(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i4 = cVar.leftMargin;
        Rect rect = this.K;
        int S2 = S2(i2, i4 + rect.left, cVar.rightMargin + rect.right);
        int i5 = cVar.topMargin;
        Rect rect2 = this.K;
        int S22 = S2(i3, i5 + rect2.top, cVar.bottomMargin + rect2.bottom);
        if (z2) {
            z3 = I1(view, S2, S22, cVar);
        } else {
            z3 = G1(view, S2, S22, cVar);
        }
        if (z3) {
            view.measure(S2, S22);
        }
    }

    private void w2(View view, c cVar, boolean z2) {
        if (cVar.f1218f) {
            if (this.w == 1) {
                v2(view, this.J, RecyclerView.o.L(X(), Y(), h0() + e0(), cVar.height, true), z2);
            } else {
                v2(view, RecyclerView.o.L(p0(), q0(), f0() + g0(), cVar.width, true), this.J, z2);
            }
        } else if (this.w == 1) {
            v2(view, RecyclerView.o.L(this.x, q0(), 0, cVar.width, false), RecyclerView.o.L(X(), Y(), h0() + e0(), cVar.height, true), z2);
        } else {
            v2(view, RecyclerView.o.L(p0(), q0(), f0() + g0(), cVar.width, true), RecyclerView.o.L(this.x, Y(), 0, cVar.height, false), z2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0157, code lost:
        if (T1() != false) goto L_0x015b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void x2(androidx.recyclerview.widget.RecyclerView.v r9, androidx.recyclerview.widget.RecyclerView.a0 r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.I
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.C
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.b()
            if (r1 != 0) goto L_0x0018
            r8.l1(r9)
            r0.c()
            return
        L_0x0018:
            boolean r1 = r0.f1214e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.C
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.I
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.I
            if (r5 == 0) goto L_0x0037
            r8.O1(r0)
            goto L_0x003e
        L_0x0037:
            r8.F2()
            boolean r5 = r8.A
            r0.c = r5
        L_0x003e:
            r8.O2(r10, r0)
            r0.f1214e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.I
            if (r5 != 0) goto L_0x0060
            int r5 = r8.C
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.c
            boolean r6 = r8.G
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.u2()
            boolean r6 = r8.H
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r5 = r8.E
            r5.b()
            r0.f1213d = r4
        L_0x0060:
            int r5 = r8.K()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.I
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f1225i
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f1213d
            if (r5 == 0) goto L_0x008e
            r1 = 0
        L_0x0073:
            int r5 = r8.s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.t
            r5 = r5[r1]
            r5.e()
            int r5 = r0.b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r8.t
            r6 = r6[r1]
            r6.v(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.L
            int[] r1 = r1.f1215f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = 0
        L_0x0098:
            int r5 = r8.s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.t
            r5 = r5[r1]
            r5.e()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.L
            int[] r6 = r6.f1215f
            r6 = r6[r1]
            r5.v(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = 0
        L_0x00b0:
            int r5 = r8.s
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.t
            r5 = r5[r1]
            boolean r6 = r8.A
            int r7 = r0.b
            r5.b(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.t
            r1.d(r5)
        L_0x00c9:
            r8.x(r9)
            androidx.recyclerview.widget.n r1 = r8.y
            r1.a = r3
            r8.M = r3
            androidx.recyclerview.widget.t r1 = r8.v
            int r1 = r1.n()
            r8.Q2(r1)
            int r1 = r0.a
            r8.P2(r1, r10)
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x00fc
            r8.H2(r2)
            androidx.recyclerview.widget.n r1 = r8.y
            r8.c2(r9, r1, r10)
            r8.H2(r4)
            androidx.recyclerview.widget.n r1 = r8.y
            int r2 = r0.a
            int r5 = r1.f1335d
            int r2 = r2 + r5
            r1.c = r2
            r8.c2(r9, r1, r10)
            goto L_0x0113
        L_0x00fc:
            r8.H2(r4)
            androidx.recyclerview.widget.n r1 = r8.y
            r8.c2(r9, r1, r10)
            r8.H2(r2)
            androidx.recyclerview.widget.n r1 = r8.y
            int r2 = r0.a
            int r5 = r1.f1335d
            int r2 = r2 + r5
            r1.c = r2
            r8.c2(r9, r1, r10)
        L_0x0113:
            r8.E2()
            int r1 = r8.K()
            if (r1 <= 0) goto L_0x012d
            boolean r1 = r8.A
            if (r1 == 0) goto L_0x0127
            r8.i2(r9, r10, r4)
            r8.j2(r9, r10, r3)
            goto L_0x012d
        L_0x0127:
            r8.j2(r9, r10, r4)
            r8.i2(r9, r10, r3)
        L_0x012d:
            if (r11 == 0) goto L_0x015a
            boolean r11 = r10.e()
            if (r11 != 0) goto L_0x015a
            int r11 = r8.F
            if (r11 == 0) goto L_0x014b
            int r11 = r8.K()
            if (r11 <= 0) goto L_0x014b
            boolean r11 = r8.M
            if (r11 != 0) goto L_0x0149
            android.view.View r11 = r8.s2()
            if (r11 == 0) goto L_0x014b
        L_0x0149:
            r11 = 1
            goto L_0x014c
        L_0x014b:
            r11 = 0
        L_0x014c:
            if (r11 == 0) goto L_0x015a
            java.lang.Runnable r11 = r8.P
            r8.p1(r11)
            boolean r11 = r8.T1()
            if (r11 == 0) goto L_0x015a
            goto L_0x015b
        L_0x015a:
            r4 = 0
        L_0x015b:
            boolean r11 = r10.e()
            if (r11 == 0) goto L_0x0166
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.L
            r11.c()
        L_0x0166:
            boolean r11 = r0.c
            r8.G = r11
            boolean r11 = r8.u2()
            r8.H = r11
            if (r4 == 0) goto L_0x017a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.L
            r11.c()
            r8.x2(r9, r10, r3)
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.x2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    private boolean y2(int i2) {
        if (this.w == 0) {
            if ((i2 == -1) != this.A) {
                return true;
            }
            return false;
        }
        if (((i2 == -1) == this.A) == u2()) {
            return true;
        }
        return false;
    }

    public void D0(int i2) {
        super.D0(i2);
        for (int i3 = 0; i3 < this.s; i3++) {
            this.t[i3].r(i2);
        }
    }

    public void D1(Rect rect, int i2, int i3) {
        int i4;
        int i5;
        int f0 = f0() + g0();
        int h0 = h0() + e0();
        if (this.w == 1) {
            i5 = RecyclerView.o.o(i3, rect.height() + h0, c0());
            i4 = RecyclerView.o.o(i2, (this.x * this.s) + f0, d0());
        } else {
            i4 = RecyclerView.o.o(i2, rect.width() + f0, d0());
            i5 = RecyclerView.o.o(i3, (this.x * this.s) + h0, c0());
        }
        C1(i4, i5);
    }

    public RecyclerView.p E() {
        if (this.w == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    public void E0(int i2) {
        super.E0(i2);
        for (int i3 = 0; i3 < this.s; i3++) {
            this.t[i3].r(i2);
        }
    }

    public RecyclerView.p F(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public RecyclerView.p G(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public int G2(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (K() == 0 || i2 == 0) {
            return 0;
        }
        z2(i2, a0Var);
        int c2 = c2(vVar, this.y, a0Var);
        if (this.y.b >= c2) {
            i2 = i2 < 0 ? -c2 : c2;
        }
        this.u.r(-i2);
        this.G = this.A;
        n nVar = this.y;
        nVar.b = 0;
        B2(vVar, nVar);
        return i2;
    }

    public void I2(int i2) {
        if (i2 == 0 || i2 == 1) {
            h((String) null);
            if (i2 != this.w) {
                this.w = i2;
                t tVar = this.u;
                this.u = this.v;
                this.v = tVar;
                u1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public void J0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.J0(recyclerView, vVar);
        p1(this.P);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].e();
        }
        recyclerView.requestLayout();
    }

    public void J1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i2) {
        o oVar = new o(recyclerView.getContext());
        oVar.p(i2);
        K1(oVar);
    }

    public void J2(boolean z2) {
        h((String) null);
        e eVar = this.I;
        if (!(eVar == null || eVar.f1230n == z2)) {
            eVar.f1230n = z2;
        }
        this.z = z2;
        u1();
    }

    public View K0(View view, int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        View C2;
        int i3;
        int i4;
        int i5;
        int i6;
        View m2;
        if (K() == 0 || (C2 = C(view)) == null) {
            return null;
        }
        F2();
        int Y1 = Y1(i2);
        if (Y1 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) C2.getLayoutParams();
        boolean z2 = cVar.f1218f;
        f fVar = cVar.f1217e;
        if (Y1 == 1) {
            i3 = l2();
        } else {
            i3 = k2();
        }
        P2(i3, a0Var);
        H2(Y1);
        n nVar = this.y;
        nVar.c = nVar.f1335d + i3;
        nVar.b = (int) (((float) this.u.n()) * 0.33333334f);
        n nVar2 = this.y;
        nVar2.f1339h = true;
        nVar2.a = false;
        c2(vVar, nVar2, a0Var);
        this.G = this.A;
        if (!z2 && (m2 = fVar.m(i3, Y1)) != null && m2 != C2) {
            return m2;
        }
        if (y2(Y1)) {
            for (int i7 = this.s - 1; i7 >= 0; i7--) {
                View m3 = this.t[i7].m(i3, Y1);
                if (m3 != null && m3 != C2) {
                    return m3;
                }
            }
        } else {
            for (int i8 = 0; i8 < this.s; i8++) {
                View m4 = this.t[i8].m(i3, Y1);
                if (m4 != null && m4 != C2) {
                    return m4;
                }
            }
        }
        boolean z3 = (this.z ^ true) == (Y1 == -1);
        if (!z2) {
            if (z3) {
                i6 = fVar.f();
            } else {
                i6 = fVar.g();
            }
            View D2 = D(i6);
            if (!(D2 == null || D2 == C2)) {
                return D2;
            }
        }
        if (y2(Y1)) {
            for (int i9 = this.s - 1; i9 >= 0; i9--) {
                if (i9 != fVar.f1232e) {
                    if (z3) {
                        i5 = this.t[i9].f();
                    } else {
                        i5 = this.t[i9].g();
                    }
                    View D3 = D(i5);
                    if (!(D3 == null || D3 == C2)) {
                        return D3;
                    }
                }
            }
        } else {
            for (int i10 = 0; i10 < this.s; i10++) {
                if (z3) {
                    i4 = this.t[i10].f();
                } else {
                    i4 = this.t[i10].g();
                }
                View D4 = D(i4);
                if (D4 != null && D4 != C2) {
                    return D4;
                }
            }
        }
        return null;
    }

    public void K2(int i2) {
        h((String) null);
        if (i2 != this.s) {
            t2();
            this.s = i2;
            this.B = new BitSet(this.s);
            this.t = new f[this.s];
            for (int i3 = 0; i3 < this.s; i3++) {
                this.t[i3] = new f(i3);
            }
            u1();
        }
    }

    public void L0(AccessibilityEvent accessibilityEvent) {
        super.L0(accessibilityEvent);
        if (K() > 0) {
            View f2 = f2(false);
            View e2 = e2(false);
            if (f2 != null && e2 != null) {
                int i0 = i0(f2);
                int i02 = i0(e2);
                if (i0 < i02) {
                    accessibilityEvent.setFromIndex(i0);
                    accessibilityEvent.setToIndex(i02);
                    return;
                }
                accessibilityEvent.setFromIndex(i02);
                accessibilityEvent.setToIndex(i0);
            }
        }
    }

    public boolean M1() {
        return this.I == null;
    }

    /* access modifiers changed from: package-private */
    public boolean N2(RecyclerView.a0 a0Var, b bVar) {
        int i2;
        int i3;
        int i4;
        boolean z2 = false;
        if (!a0Var.e() && (i2 = this.C) != -1) {
            if (i2 < 0 || i2 >= a0Var.b()) {
                this.C = -1;
                this.D = RecyclerView.UNDEFINED_DURATION;
            } else {
                e eVar = this.I;
                if (eVar == null || eVar.f1223g == -1 || eVar.f1225i < 1) {
                    View D2 = D(this.C);
                    if (D2 != null) {
                        if (this.A) {
                            i3 = l2();
                        } else {
                            i3 = k2();
                        }
                        bVar.a = i3;
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.c) {
                                bVar.b = (this.u.i() - this.D) - this.u.d(D2);
                            } else {
                                bVar.b = (this.u.m() + this.D) - this.u.g(D2);
                            }
                            return true;
                        } else if (this.u.e(D2) > this.u.n()) {
                            if (bVar.c) {
                                i4 = this.u.i();
                            } else {
                                i4 = this.u.m();
                            }
                            bVar.b = i4;
                            return true;
                        } else {
                            int g2 = this.u.g(D2) - this.u.m();
                            if (g2 < 0) {
                                bVar.b = -g2;
                                return true;
                            }
                            int i5 = this.u.i() - this.u.d(D2);
                            if (i5 < 0) {
                                bVar.b = i5;
                                return true;
                            }
                            bVar.b = RecyclerView.UNDEFINED_DURATION;
                        }
                    } else {
                        int i6 = this.C;
                        bVar.a = i6;
                        int i7 = this.D;
                        if (i7 == Integer.MIN_VALUE) {
                            if (S1(i6) == 1) {
                                z2 = true;
                            }
                            bVar.c = z2;
                            bVar.a();
                        } else {
                            bVar.b(i7);
                        }
                        bVar.f1213d = true;
                    }
                } else {
                    bVar.b = RecyclerView.UNDEFINED_DURATION;
                    bVar.a = this.C;
                }
                return true;
            }
        }
        return false;
    }

    public int O(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.w == 1) {
            return this.s;
        }
        return super.O(vVar, a0Var);
    }

    /* access modifiers changed from: package-private */
    public void O2(RecyclerView.a0 a0Var, b bVar) {
        if (!N2(a0Var, bVar) && !M2(a0Var, bVar)) {
            bVar.a();
            bVar.a = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean P1() {
        int l2 = this.t[0].l(RecyclerView.UNDEFINED_DURATION);
        for (int i2 = 1; i2 < this.s; i2++) {
            if (this.t[i2].l(RecyclerView.UNDEFINED_DURATION) != l2) {
                return false;
            }
        }
        return true;
    }

    public void Q0(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, e.h.k.d0.c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.P0(view, cVar);
            return;
        }
        c cVar2 = (c) layoutParams;
        if (this.w == 0) {
            cVar.Z(c.C0564c.a(cVar2.e(), cVar2.f1218f ? this.s : 1, -1, -1, false, false));
        } else {
            cVar.Z(c.C0564c.a(-1, -1, cVar2.e(), cVar2.f1218f ? this.s : 1, false, false));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean Q1() {
        int p = this.t[0].p(RecyclerView.UNDEFINED_DURATION);
        for (int i2 = 1; i2 < this.s; i2++) {
            if (this.t[i2].p(RecyclerView.UNDEFINED_DURATION) != p) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void Q2(int i2) {
        this.x = i2 / this.s;
        this.J = View.MeasureSpec.makeMeasureSpec(i2, this.v.k());
    }

    public void S0(RecyclerView recyclerView, int i2, int i3) {
        r2(i2, i3, 1);
    }

    public void T0(RecyclerView recyclerView) {
        this.E.b();
        u1();
    }

    /* access modifiers changed from: package-private */
    public boolean T1() {
        int i2;
        int i3;
        if (K() == 0 || this.F == 0 || !s0()) {
            return false;
        }
        if (this.A) {
            i3 = l2();
            i2 = k2();
        } else {
            i3 = k2();
            i2 = l2();
        }
        if (i3 == 0 && s2() != null) {
            this.E.b();
            v1();
            u1();
            return true;
        } else if (!this.M) {
            return false;
        } else {
            int i4 = this.A ? -1 : 1;
            int i5 = i2 + 1;
            d.a e2 = this.E.e(i3, i5, i4, true);
            if (e2 == null) {
                this.M = false;
                this.E.d(i5);
                return false;
            }
            d.a e3 = this.E.e(i3, e2.f1219g, i4 * -1, true);
            if (e3 == null) {
                this.E.d(e2.f1219g);
            } else {
                this.E.d(e3.f1219g + 1);
            }
            v1();
            u1();
            return true;
        }
    }

    public void U0(RecyclerView recyclerView, int i2, int i3, int i4) {
        r2(i2, i3, 8);
    }

    public void V0(RecyclerView recyclerView, int i2, int i3) {
        r2(i2, i3, 2);
    }

    public void X0(RecyclerView recyclerView, int i2, int i3, Object obj) {
        r2(i2, i3, 4);
    }

    public void Y0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        x2(vVar, a0Var, true);
    }

    public void Z0(RecyclerView.a0 a0Var) {
        super.Z0(a0Var);
        this.C = -1;
        this.D = RecyclerView.UNDEFINED_DURATION;
        this.I = null;
        this.L.c();
    }

    public PointF a(int i2) {
        int S1 = S1(i2);
        PointF pointF = new PointF();
        if (S1 == 0) {
            return null;
        }
        if (this.w == 0) {
            pointF.x = (float) S1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) S1;
        }
        return pointF;
    }

    public void d1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.I = (e) parcelable;
            u1();
        }
    }

    public Parcelable e1() {
        int i2;
        int i3;
        int i4;
        int[] iArr;
        if (this.I != null) {
            return new e(this.I);
        }
        e eVar = new e();
        eVar.f1230n = this.z;
        eVar.o = this.G;
        eVar.p = this.H;
        d dVar = this.E;
        if (dVar == null || (iArr = dVar.a) == null) {
            eVar.f1227k = 0;
        } else {
            eVar.f1228l = iArr;
            eVar.f1227k = iArr.length;
            eVar.f1229m = dVar.b;
        }
        if (K() > 0) {
            if (this.G) {
                i2 = l2();
            } else {
                i2 = k2();
            }
            eVar.f1223g = i2;
            eVar.f1224h = g2();
            int i5 = this.s;
            eVar.f1225i = i5;
            eVar.f1226j = new int[i5];
            for (int i6 = 0; i6 < this.s; i6++) {
                if (this.G) {
                    i3 = this.t[i6].l(RecyclerView.UNDEFINED_DURATION);
                    if (i3 != Integer.MIN_VALUE) {
                        i4 = this.u.i();
                    } else {
                        eVar.f1226j[i6] = i3;
                    }
                } else {
                    i3 = this.t[i6].p(RecyclerView.UNDEFINED_DURATION);
                    if (i3 != Integer.MIN_VALUE) {
                        i4 = this.u.m();
                    } else {
                        eVar.f1226j[i6] = i3;
                    }
                }
                i3 -= i4;
                eVar.f1226j[i6] = i3;
            }
        } else {
            eVar.f1223g = -1;
            eVar.f1224h = -1;
            eVar.f1225i = 0;
        }
        return eVar;
    }

    /* access modifiers changed from: package-private */
    public View e2(boolean z2) {
        int m2 = this.u.m();
        int i2 = this.u.i();
        View view = null;
        for (int K2 = K() - 1; K2 >= 0; K2--) {
            View J2 = J(K2);
            int g2 = this.u.g(J2);
            int d2 = this.u.d(J2);
            if (d2 > m2 && g2 < i2) {
                if (d2 <= i2 || !z2) {
                    return J2;
                }
                if (view == null) {
                    view = J2;
                }
            }
        }
        return view;
    }

    public void f1(int i2) {
        if (i2 == 0) {
            T1();
        }
    }

    /* access modifiers changed from: package-private */
    public View f2(boolean z2) {
        int m2 = this.u.m();
        int i2 = this.u.i();
        int K2 = K();
        View view = null;
        for (int i3 = 0; i3 < K2; i3++) {
            View J2 = J(i3);
            int g2 = this.u.g(J2);
            if (this.u.d(J2) > m2 && g2 < i2) {
                if (g2 >= m2 || !z2) {
                    return J2;
                }
                if (view == null) {
                    view = J2;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public int g2() {
        View view;
        if (this.A) {
            view = e2(true);
        } else {
            view = f2(true);
        }
        if (view == null) {
            return -1;
        }
        return i0(view);
    }

    public void h(String str) {
        if (this.I == null) {
            super.h(str);
        }
    }

    /* access modifiers changed from: package-private */
    public int k2() {
        if (K() == 0) {
            return 0;
        }
        return i0(J(0));
    }

    public boolean l() {
        return this.w == 0;
    }

    public int l0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.w == 0) {
            return this.s;
        }
        return super.l0(vVar, a0Var);
    }

    /* access modifiers changed from: package-private */
    public int l2() {
        int K2 = K();
        if (K2 == 0) {
            return 0;
        }
        return i0(J(K2 - 1));
    }

    public boolean m() {
        return this.w == 1;
    }

    public boolean n(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    public void p(int i2, int i3, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        int i4;
        int i5;
        if (this.w != 0) {
            i2 = i3;
        }
        if (K() != 0 && i2 != 0) {
            z2(i2, a0Var);
            int[] iArr = this.O;
            if (iArr == null || iArr.length < this.s) {
                this.O = new int[this.s];
            }
            int i6 = 0;
            for (int i7 = 0; i7 < this.s; i7++) {
                n nVar = this.y;
                if (nVar.f1335d == -1) {
                    i5 = nVar.f1337f;
                    i4 = this.t[i7].p(i5);
                } else {
                    i5 = this.t[i7].l(nVar.f1338g);
                    i4 = this.y.f1338g;
                }
                int i8 = i5 - i4;
                if (i8 >= 0) {
                    this.O[i6] = i8;
                    i6++;
                }
            }
            Arrays.sort(this.O, 0, i6);
            for (int i9 = 0; i9 < i6 && this.y.a(a0Var); i9++) {
                cVar.a(this.y.c, this.O[i9]);
                n nVar2 = this.y;
                nVar2.c += nVar2.f1335d;
            }
        }
    }

    public int r(RecyclerView.a0 a0Var) {
        return V1(a0Var);
    }

    public int s(RecyclerView.a0 a0Var) {
        return W1(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View s2() {
        /*
            r12 = this;
            int r0 = r12.K()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.s
            r2.<init>(r3)
            int r3 = r12.s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.w
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.u2()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.A
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.J(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f1217e
            int r9 = r9.f1232e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f1217e
            boolean r9 = r12.U1(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f1217e
            int r9 = r9.f1232e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f1218f
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.J(r9)
            boolean r10 = r12.A
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.t r10 = r12.u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.t r11 = r12.u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.t r10 = r12.u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.t r11 = r12.u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = 1
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f1217e
            int r8 = r8.f1232e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f1217e
            int r9 = r9.f1232e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.s2():android.view.View");
    }

    public int t(RecyclerView.a0 a0Var) {
        return X1(a0Var);
    }

    public boolean t0() {
        return this.F != 0;
    }

    public void t2() {
        this.E.b();
        u1();
    }

    public int u(RecyclerView.a0 a0Var) {
        return V1(a0Var);
    }

    /* access modifiers changed from: package-private */
    public boolean u2() {
        return a0() == 1;
    }

    public int v(RecyclerView.a0 a0Var) {
        return W1(a0Var);
    }

    public int w(RecyclerView.a0 a0Var) {
        return X1(a0Var);
    }

    public int x1(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return G2(i2, vVar, a0Var);
    }

    public void y1(int i2) {
        e eVar = this.I;
        if (!(eVar == null || eVar.f1223g == i2)) {
            eVar.a();
        }
        this.C = i2;
        this.D = RecyclerView.UNDEFINED_DURATION;
        u1();
    }

    public int z1(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return G2(i2, vVar, a0Var);
    }

    /* access modifiers changed from: package-private */
    public void z2(int i2, RecyclerView.a0 a0Var) {
        int i3;
        int i4;
        if (i2 > 0) {
            i4 = l2();
            i3 = 1;
        } else {
            i4 = k2();
            i3 = -1;
        }
        this.y.a = true;
        P2(i4, a0Var);
        H2(i3);
        n nVar = this.y;
        nVar.c = i4 + nVar.f1335d;
        nVar.b = Math.abs(i2);
    }

    static class d {
        int[] a;
        List<a> b;

        d() {
        }

        private int i(int i2) {
            if (this.b == null) {
                return -1;
            }
            a f2 = f(i2);
            if (f2 != null) {
                this.b.remove(f2);
            }
            int size = this.b.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i3 = -1;
                    break;
                } else if (this.b.get(i3).f1219g >= i2) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 == -1) {
                return -1;
            }
            this.b.remove(i3);
            return this.b.get(i3).f1219g;
        }

        private void l(int i2, int i3) {
            List<a> list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = this.b.get(size);
                    int i4 = aVar.f1219g;
                    if (i4 >= i2) {
                        aVar.f1219g = i4 + i3;
                    }
                }
            }
        }

        private void m(int i2, int i3) {
            List<a> list = this.b;
            if (list != null) {
                int i4 = i2 + i3;
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = this.b.get(size);
                    int i5 = aVar.f1219g;
                    if (i5 >= i2) {
                        if (i5 < i4) {
                            this.b.remove(size);
                        } else {
                            aVar.f1219g = i5 - i3;
                        }
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            int size = this.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar2 = this.b.get(i2);
                if (aVar2.f1219g == aVar.f1219g) {
                    this.b.remove(i2);
                }
                if (aVar2.f1219g >= aVar.f1219g) {
                    this.b.add(i2, aVar);
                    return;
                }
            }
            this.b.add(aVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        /* access modifiers changed from: package-private */
        public void c(int i2) {
            int[] iArr = this.a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i2, 10) + 1)];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i2 >= iArr.length) {
                int[] iArr3 = new int[o(i2)];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        public int d(int i2) {
            List<a> list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.b.get(size).f1219g >= i2) {
                        this.b.remove(size);
                    }
                }
            }
            return h(i2);
        }

        public a e(int i2, int i3, int i4, boolean z) {
            List<a> list = this.b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                a aVar = this.b.get(i5);
                int i6 = aVar.f1219g;
                if (i6 >= i3) {
                    return null;
                }
                if (i6 >= i2 && (i4 == 0 || aVar.f1220h == i4 || (z && aVar.f1222j))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i2) {
            List<a> list = this.b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.b.get(size);
                if (aVar.f1219g == i2) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public int g(int i2) {
            int[] iArr = this.a;
            if (iArr == null || i2 >= iArr.length) {
                return -1;
            }
            return iArr[i2];
        }

        /* access modifiers changed from: package-private */
        public int h(int i2) {
            int[] iArr = this.a;
            if (iArr == null || i2 >= iArr.length) {
                return -1;
            }
            int i3 = i(i2);
            if (i3 == -1) {
                int[] iArr2 = this.a;
                Arrays.fill(iArr2, i2, iArr2.length, -1);
                return this.a.length;
            }
            int i4 = i3 + 1;
            Arrays.fill(this.a, i2, i4, -1);
            return i4;
        }

        /* access modifiers changed from: package-private */
        public void j(int i2, int i3) {
            int[] iArr = this.a;
            if (iArr != null && i2 < iArr.length) {
                int i4 = i2 + i3;
                c(i4);
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
                Arrays.fill(this.a, i2, i4, -1);
                l(i2, i3);
            }
        }

        /* access modifiers changed from: package-private */
        public void k(int i2, int i3) {
            int[] iArr = this.a;
            if (iArr != null && i2 < iArr.length) {
                int i4 = i2 + i3;
                c(i4);
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
                int[] iArr3 = this.a;
                Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
                m(i2, i3);
            }
        }

        /* access modifiers changed from: package-private */
        public void n(int i2, f fVar) {
            c(i2);
            this.a[i2] = fVar.f1232e;
        }

        /* access modifiers changed from: package-private */
        public int o(int i2) {
            int length = this.a.length;
            while (length <= i2) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0027a();

            /* renamed from: g  reason: collision with root package name */
            int f1219g;

            /* renamed from: h  reason: collision with root package name */
            int f1220h;

            /* renamed from: i  reason: collision with root package name */
            int[] f1221i;

            /* renamed from: j  reason: collision with root package name */
            boolean f1222j;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            static class C0027a implements Parcelable.Creator<a> {
                C0027a() {
                }

                /* renamed from: a */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                /* renamed from: b */
                public a[] newArray(int i2) {
                    return new a[i2];
                }
            }

            a(Parcel parcel) {
                this.f1219g = parcel.readInt();
                this.f1220h = parcel.readInt();
                this.f1222j = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f1221i = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* access modifiers changed from: package-private */
            public int a(int i2) {
                int[] iArr = this.f1221i;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i2];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f1219g + ", mGapDir=" + this.f1220h + ", mHasUnwantedGapAfter=" + this.f1222j + ", mGapPerSpan=" + Arrays.toString(this.f1221i) + '}';
            }

            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeInt(this.f1219g);
                parcel.writeInt(this.f1220h);
                parcel.writeInt(this.f1222j ? 1 : 0);
                int[] iArr = this.f1221i;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f1221i);
            }

            a() {
            }
        }
    }
}
