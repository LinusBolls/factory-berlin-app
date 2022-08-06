package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.o implements k.j, RecyclerView.z.b {
    int A;
    int B;
    private boolean C;
    d D;
    final a E;
    private final b F;
    private int G;
    private int[] H;
    int s;
    private c t;
    t u;
    private boolean v;
    private boolean w;
    boolean x;
    private boolean y;
    private boolean z;

    static class a {
        t a;
        int b;
        int c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1130d;

        /* renamed from: e  reason: collision with root package name */
        boolean f1131e;

        a() {
            e();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int i2;
            if (this.f1130d) {
                i2 = this.a.i();
            } else {
                i2 = this.a.m();
            }
            this.c = i2;
        }

        public void b(View view, int i2) {
            if (this.f1130d) {
                this.c = this.a.d(view) + this.a.o();
            } else {
                this.c = this.a.g(view);
            }
            this.b = i2;
        }

        public void c(View view, int i2) {
            int o = this.a.o();
            if (o >= 0) {
                b(view, i2);
                return;
            }
            this.b = i2;
            if (this.f1130d) {
                int i3 = (this.a.i() - o) - this.a.d(view);
                this.c = this.a.i() - i3;
                if (i3 > 0) {
                    int e2 = this.c - this.a.e(view);
                    int m2 = this.a.m();
                    int min = e2 - (m2 + Math.min(this.a.g(view) - m2, 0));
                    if (min < 0) {
                        this.c += Math.min(i3, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g2 = this.a.g(view);
            int m3 = g2 - this.a.m();
            this.c = g2;
            if (m3 > 0) {
                int i4 = (this.a.i() - Math.min(0, (this.a.i() - o) - this.a.d(view))) - (g2 + this.a.e(view));
                if (i4 < 0) {
                    this.c -= Math.min(m3, -i4);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(View view, RecyclerView.a0 a0Var) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return !pVar.c() && pVar.a() >= 0 && pVar.a() < a0Var.b();
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.b = -1;
            this.c = RecyclerView.UNDEFINED_DURATION;
            this.f1130d = false;
            this.f1131e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.f1130d + ", mValid=" + this.f1131e + '}';
        }
    }

    protected static class b {
        public int a;
        public boolean b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1132d;

        protected b() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.a = 0;
            this.b = false;
            this.c = false;
            this.f1132d = false;
        }
    }

    static class c {
        boolean a = true;
        int b;
        int c;

        /* renamed from: d  reason: collision with root package name */
        int f1133d;

        /* renamed from: e  reason: collision with root package name */
        int f1134e;

        /* renamed from: f  reason: collision with root package name */
        int f1135f;

        /* renamed from: g  reason: collision with root package name */
        int f1136g;

        /* renamed from: h  reason: collision with root package name */
        int f1137h = 0;

        /* renamed from: i  reason: collision with root package name */
        int f1138i = 0;

        /* renamed from: j  reason: collision with root package name */
        boolean f1139j;

        /* renamed from: k  reason: collision with root package name */
        int f1140k;

        /* renamed from: l  reason: collision with root package name */
        List<RecyclerView.d0> f1141l = null;

        /* renamed from: m  reason: collision with root package name */
        boolean f1142m;

        c() {
        }

        private View e() {
            int size = this.f1141l.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = this.f1141l.get(i2).a;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.c() && this.f1133d == pVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b((View) null);
        }

        public void b(View view) {
            View f2 = f(view);
            if (f2 == null) {
                this.f1133d = -1;
            } else {
                this.f1133d = ((RecyclerView.p) f2.getLayoutParams()).a();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(RecyclerView.a0 a0Var) {
            int i2 = this.f1133d;
            return i2 >= 0 && i2 < a0Var.b();
        }

        /* access modifiers changed from: package-private */
        public View d(RecyclerView.v vVar) {
            if (this.f1141l != null) {
                return e();
            }
            View o = vVar.o(this.f1133d);
            this.f1133d += this.f1134e;
            return o;
        }

        public View f(View view) {
            int a2;
            int size = this.f1141l.size();
            View view2 = null;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = this.f1141l.get(i3).a;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.c() && (a2 = (pVar.a() - this.f1133d) * this.f1134e) >= 0 && a2 < i2) {
                    view2 = view3;
                    if (a2 == 0) {
                        break;
                    }
                    i2 = a2;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        int f1143g;

        /* renamed from: h  reason: collision with root package name */
        int f1144h;

        /* renamed from: i  reason: collision with root package name */
        boolean f1145i;

        static class a implements Parcelable.Creator<d> {
            a() {
            }

            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* renamed from: b */
            public d[] newArray(int i2) {
                return new d[i2];
            }
        }

        public d() {
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.f1143g >= 0;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f1143g = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f1143g);
            parcel.writeInt(this.f1144h);
            parcel.writeInt(this.f1145i ? 1 : 0);
        }

        d(Parcel parcel) {
            this.f1143g = parcel.readInt();
            this.f1144h = parcel.readInt();
            this.f1145i = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.f1143g = dVar.f1143g;
            this.f1144h = dVar.f1144h;
            this.f1145i = dVar.f1145i;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private void B2() {
        if (this.s == 1 || !r2()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    private boolean H2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        View view;
        int i2;
        boolean z2 = false;
        if (K() == 0) {
            return false;
        }
        View W = W();
        if (W != null && aVar.d(W, a0Var)) {
            aVar.c(W, i0(W));
            return true;
        } else if (this.v != this.y) {
            return false;
        } else {
            if (aVar.f1130d) {
                view = j2(vVar, a0Var);
            } else {
                view = k2(vVar, a0Var);
            }
            if (view == null) {
                return false;
            }
            aVar.b(view, i0(view));
            if (!a0Var.e() && M1()) {
                if (this.u.g(view) >= this.u.i() || this.u.d(view) < this.u.m()) {
                    z2 = true;
                }
                if (z2) {
                    if (aVar.f1130d) {
                        i2 = this.u.i();
                    } else {
                        i2 = this.u.m();
                    }
                    aVar.c = i2;
                }
            }
            return true;
        }
    }

    private boolean I2(RecyclerView.a0 a0Var, a aVar) {
        int i2;
        int i3;
        boolean z2 = false;
        if (!a0Var.e() && (i2 = this.A) != -1) {
            if (i2 < 0 || i2 >= a0Var.b()) {
                this.A = -1;
                this.B = RecyclerView.UNDEFINED_DURATION;
            } else {
                aVar.b = this.A;
                d dVar = this.D;
                if (dVar != null && dVar.a()) {
                    boolean z3 = this.D.f1145i;
                    aVar.f1130d = z3;
                    if (z3) {
                        aVar.c = this.u.i() - this.D.f1144h;
                    } else {
                        aVar.c = this.u.m() + this.D.f1144h;
                    }
                    return true;
                } else if (this.B == Integer.MIN_VALUE) {
                    View D2 = D(this.A);
                    if (D2 == null) {
                        if (K() > 0) {
                            if ((this.A < i0(J(0))) == this.x) {
                                z2 = true;
                            }
                            aVar.f1130d = z2;
                        }
                        aVar.a();
                    } else if (this.u.e(D2) > this.u.n()) {
                        aVar.a();
                        return true;
                    } else if (this.u.g(D2) - this.u.m() < 0) {
                        aVar.c = this.u.m();
                        aVar.f1130d = false;
                        return true;
                    } else if (this.u.i() - this.u.d(D2) < 0) {
                        aVar.c = this.u.i();
                        aVar.f1130d = true;
                        return true;
                    } else {
                        if (aVar.f1130d) {
                            i3 = this.u.d(D2) + this.u.o();
                        } else {
                            i3 = this.u.g(D2);
                        }
                        aVar.c = i3;
                    }
                    return true;
                } else {
                    boolean z4 = this.x;
                    aVar.f1130d = z4;
                    if (z4) {
                        aVar.c = this.u.i() - this.B;
                    } else {
                        aVar.c = this.u.m() + this.B;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private void J2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        if (!I2(a0Var, aVar) && !H2(vVar, a0Var, aVar)) {
            aVar.a();
            aVar.b = this.y ? a0Var.b() - 1 : 0;
        }
    }

    private void K2(int i2, int i3, boolean z2, RecyclerView.a0 a0Var) {
        int i4;
        this.t.f1142m = A2();
        this.t.f1135f = i2;
        int[] iArr = this.H;
        boolean z3 = false;
        iArr[0] = 0;
        int i5 = 1;
        iArr[1] = 0;
        N1(a0Var, iArr);
        int max = Math.max(0, this.H[0]);
        int max2 = Math.max(0, this.H[1]);
        if (i2 == 1) {
            z3 = true;
        }
        this.t.f1137h = z3 ? max2 : max;
        c cVar = this.t;
        if (!z3) {
            max = max2;
        }
        cVar.f1138i = max;
        if (z3) {
            this.t.f1137h += this.u.j();
            View n2 = n2();
            c cVar2 = this.t;
            if (this.x) {
                i5 = -1;
            }
            cVar2.f1134e = i5;
            c cVar3 = this.t;
            int i0 = i0(n2);
            c cVar4 = this.t;
            cVar3.f1133d = i0 + cVar4.f1134e;
            cVar4.b = this.u.d(n2);
            i4 = this.u.d(n2) - this.u.i();
        } else {
            View o2 = o2();
            this.t.f1137h += this.u.m();
            c cVar5 = this.t;
            if (!this.x) {
                i5 = -1;
            }
            cVar5.f1134e = i5;
            c cVar6 = this.t;
            int i02 = i0(o2);
            c cVar7 = this.t;
            cVar6.f1133d = i02 + cVar7.f1134e;
            cVar7.b = this.u.g(o2);
            i4 = (-this.u.g(o2)) + this.u.m();
        }
        c cVar8 = this.t;
        cVar8.c = i3;
        if (z2) {
            cVar8.c = i3 - i4;
        }
        this.t.f1136g = i4;
    }

    private void L2(int i2, int i3) {
        this.t.c = this.u.i() - i3;
        this.t.f1134e = this.x ? -1 : 1;
        c cVar = this.t;
        cVar.f1133d = i2;
        cVar.f1135f = 1;
        cVar.b = i3;
        cVar.f1136g = RecyclerView.UNDEFINED_DURATION;
    }

    private void M2(a aVar) {
        L2(aVar.b, aVar.c);
    }

    private void N2(int i2, int i3) {
        this.t.c = i3 - this.u.m();
        c cVar = this.t;
        cVar.f1133d = i2;
        cVar.f1134e = this.x ? 1 : -1;
        c cVar2 = this.t;
        cVar2.f1135f = -1;
        cVar2.b = i3;
        cVar2.f1136g = RecyclerView.UNDEFINED_DURATION;
    }

    private void O2(a aVar) {
        N2(aVar.b, aVar.c);
    }

    private int P1(RecyclerView.a0 a0Var) {
        if (K() == 0) {
            return 0;
        }
        U1();
        t tVar = this.u;
        View Z1 = Z1(!this.z, true);
        return v.a(a0Var, tVar, Z1, Y1(!this.z, true), this, this.z);
    }

    private int Q1(RecyclerView.a0 a0Var) {
        if (K() == 0) {
            return 0;
        }
        U1();
        t tVar = this.u;
        View Z1 = Z1(!this.z, true);
        return v.b(a0Var, tVar, Z1, Y1(!this.z, true), this, this.z, this.x);
    }

    private int R1(RecyclerView.a0 a0Var) {
        if (K() == 0) {
            return 0;
        }
        U1();
        t tVar = this.u;
        View Z1 = Z1(!this.z, true);
        return v.c(a0Var, tVar, Z1, Y1(!this.z, true), this, this.z);
    }

    private View W1() {
        return e2(0, K());
    }

    private View X1(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return i2(vVar, a0Var, 0, K(), a0Var.b());
    }

    private View b2() {
        return e2(K() - 1, -1);
    }

    private View c2(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return i2(vVar, a0Var, K() - 1, -1, a0Var.b());
    }

    private View g2() {
        if (this.x) {
            return W1();
        }
        return b2();
    }

    private View h2() {
        if (this.x) {
            return b2();
        }
        return W1();
    }

    private View j2(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.x) {
            return X1(vVar, a0Var);
        }
        return c2(vVar, a0Var);
    }

    private View k2(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.x) {
            return c2(vVar, a0Var);
        }
        return X1(vVar, a0Var);
    }

    private int l2(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z2) {
        int i3;
        int i4 = this.u.i() - i2;
        if (i4 <= 0) {
            return 0;
        }
        int i5 = -C2(-i4, vVar, a0Var);
        int i6 = i2 + i5;
        if (!z2 || (i3 = this.u.i() - i6) <= 0) {
            return i5;
        }
        this.u.r(i3);
        return i3 + i5;
    }

    private int m2(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z2) {
        int m2;
        int m3 = i2 - this.u.m();
        if (m3 <= 0) {
            return 0;
        }
        int i3 = -C2(m3, vVar, a0Var);
        int i4 = i2 + i3;
        if (!z2 || (m2 = i4 - this.u.m()) <= 0) {
            return i3;
        }
        this.u.r(-m2);
        return i3 - m2;
    }

    private View n2() {
        return J(this.x ? 0 : K() - 1);
    }

    private View o2() {
        return J(this.x ? K() - 1 : 0);
    }

    private void u2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i2, int i3) {
        RecyclerView.v vVar2 = vVar;
        RecyclerView.a0 a0Var2 = a0Var;
        if (a0Var.g() && K() != 0 && !a0Var.e() && M1()) {
            List<RecyclerView.d0> k2 = vVar.k();
            int size = k2.size();
            int i0 = i0(J(0));
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                RecyclerView.d0 d0Var = k2.get(i6);
                if (!d0Var.v()) {
                    char c2 = 1;
                    if ((d0Var.m() < i0) != this.x) {
                        c2 = 65535;
                    }
                    if (c2 == 65535) {
                        i4 += this.u.e(d0Var.a);
                    } else {
                        i5 += this.u.e(d0Var.a);
                    }
                }
            }
            this.t.f1141l = k2;
            if (i4 > 0) {
                N2(i0(o2()), i2);
                c cVar = this.t;
                cVar.f1137h = i4;
                cVar.c = 0;
                cVar.a();
                V1(vVar2, this.t, a0Var2, false);
            }
            if (i5 > 0) {
                L2(i0(n2()), i3);
                c cVar2 = this.t;
                cVar2.f1137h = i5;
                cVar2.c = 0;
                cVar2.a();
                V1(vVar2, this.t, a0Var2, false);
            }
            this.t.f1141l = null;
        }
    }

    private void w2(RecyclerView.v vVar, c cVar) {
        if (cVar.a && !cVar.f1142m) {
            int i2 = cVar.f1136g;
            int i3 = cVar.f1138i;
            if (cVar.f1135f == -1) {
                y2(vVar, i2, i3);
            } else {
                z2(vVar, i2, i3);
            }
        }
    }

    private void x2(RecyclerView.v vVar, int i2, int i3) {
        if (i2 != i3) {
            if (i3 > i2) {
                for (int i4 = i3 - 1; i4 >= i2; i4--) {
                    o1(i4, vVar);
                }
                return;
            }
            while (i2 > i3) {
                o1(i2, vVar);
                i2--;
            }
        }
    }

    private void y2(RecyclerView.v vVar, int i2, int i3) {
        int K = K();
        if (i2 >= 0) {
            int h2 = (this.u.h() - i2) + i3;
            if (this.x) {
                for (int i4 = 0; i4 < K; i4++) {
                    View J = J(i4);
                    if (this.u.g(J) < h2 || this.u.q(J) < h2) {
                        x2(vVar, 0, i4);
                        return;
                    }
                }
                return;
            }
            int i5 = K - 1;
            for (int i6 = i5; i6 >= 0; i6--) {
                View J2 = J(i6);
                if (this.u.g(J2) < h2 || this.u.q(J2) < h2) {
                    x2(vVar, i5, i6);
                    return;
                }
            }
        }
    }

    private void z2(RecyclerView.v vVar, int i2, int i3) {
        if (i2 >= 0) {
            int i4 = i2 - i3;
            int K = K();
            if (this.x) {
                int i5 = K - 1;
                for (int i6 = i5; i6 >= 0; i6--) {
                    View J = J(i6);
                    if (this.u.d(J) > i4 || this.u.p(J) > i4) {
                        x2(vVar, i5, i6);
                        return;
                    }
                }
                return;
            }
            for (int i7 = 0; i7 < K; i7++) {
                View J2 = J(i7);
                if (this.u.d(J2) > i4 || this.u.p(J2) > i4) {
                    x2(vVar, 0, i7);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean A2() {
        return this.u.k() == 0 && this.u.h() == 0;
    }

    /* access modifiers changed from: package-private */
    public int C2(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (K() == 0 || i2 == 0) {
            return 0;
        }
        U1();
        this.t.a = true;
        int i3 = i2 > 0 ? 1 : -1;
        int abs = Math.abs(i2);
        K2(i3, abs, true, a0Var);
        c cVar = this.t;
        int V1 = cVar.f1136g + V1(vVar, cVar, a0Var, false);
        if (V1 < 0) {
            return 0;
        }
        if (abs > V1) {
            i2 = i3 * V1;
        }
        this.u.r(-i2);
        this.t.f1140k = i2;
        return i2;
    }

    public View D(int i2) {
        int K = K();
        if (K == 0) {
            return null;
        }
        int i0 = i2 - i0(J(0));
        if (i0 >= 0 && i0 < K) {
            View J = J(i0);
            if (i0(J) == i2) {
                return J;
            }
        }
        return super.D(i2);
    }

    public void D2(int i2, int i3) {
        this.A = i2;
        this.B = i3;
        d dVar = this.D;
        if (dVar != null) {
            dVar.b();
        }
        u1();
    }

    public RecyclerView.p E() {
        return new RecyclerView.p(-2, -2);
    }

    public void E2(int i2) {
        if (i2 == 0 || i2 == 1) {
            h((String) null);
            if (i2 != this.s || this.u == null) {
                t b2 = t.b(this, i2);
                this.u = b2;
                this.E.a = b2;
                this.s = i2;
                u1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i2);
    }

    public void F2(boolean z2) {
        h((String) null);
        if (z2 != this.w) {
            this.w = z2;
            u1();
        }
    }

    public void G2(boolean z2) {
        h((String) null);
        if (this.y != z2) {
            this.y = z2;
            u1();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean H1() {
        return (Y() == 1073741824 || q0() == 1073741824 || !r0()) ? false : true;
    }

    public void J0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.J0(recyclerView, vVar);
        if (this.C) {
            l1(vVar);
            vVar.c();
        }
    }

    public void J1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i2) {
        o oVar = new o(recyclerView.getContext());
        oVar.p(i2);
        K1(oVar);
    }

    public View K0(View view, int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int S1;
        View view2;
        View view3;
        B2();
        if (K() == 0 || (S1 = S1(i2)) == Integer.MIN_VALUE) {
            return null;
        }
        U1();
        K2(S1, (int) (((float) this.u.n()) * 0.33333334f), false, a0Var);
        c cVar = this.t;
        cVar.f1136g = RecyclerView.UNDEFINED_DURATION;
        cVar.a = false;
        V1(vVar, cVar, a0Var, true);
        if (S1 == -1) {
            view2 = h2();
        } else {
            view2 = g2();
        }
        if (S1 == -1) {
            view3 = o2();
        } else {
            view3 = n2();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    public void L0(AccessibilityEvent accessibilityEvent) {
        super.L0(accessibilityEvent);
        if (K() > 0) {
            accessibilityEvent.setFromIndex(a2());
            accessibilityEvent.setToIndex(d2());
        }
    }

    public boolean M1() {
        return this.D == null && this.v == this.y;
    }

    /* access modifiers changed from: protected */
    public void N1(RecyclerView.a0 a0Var, int[] iArr) {
        int i2;
        int p2 = p2(a0Var);
        if (this.t.f1135f == -1) {
            i2 = 0;
        } else {
            i2 = p2;
            p2 = 0;
        }
        iArr[0] = p2;
        iArr[1] = i2;
    }

    /* access modifiers changed from: package-private */
    public void O1(RecyclerView.a0 a0Var, c cVar, RecyclerView.o.c cVar2) {
        int i2 = cVar.f1133d;
        if (i2 >= 0 && i2 < a0Var.b()) {
            cVar2.a(i2, Math.max(0, cVar.f1136g));
        }
    }

    /* access modifiers changed from: package-private */
    public int S1(int i2) {
        if (i2 == 1) {
            return (this.s != 1 && r2()) ? 1 : -1;
        }
        if (i2 == 2) {
            return (this.s != 1 && r2()) ? -1 : 1;
        }
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 == 130 && this.s == 1) {
                        return 1;
                    }
                    return RecyclerView.UNDEFINED_DURATION;
                } else if (this.s == 0) {
                    return 1;
                } else {
                    return RecyclerView.UNDEFINED_DURATION;
                }
            } else if (this.s == 1) {
                return -1;
            } else {
                return RecyclerView.UNDEFINED_DURATION;
            }
        } else if (this.s == 0) {
            return -1;
        } else {
            return RecyclerView.UNDEFINED_DURATION;
        }
    }

    /* access modifiers changed from: package-private */
    public c T1() {
        return new c();
    }

    /* access modifiers changed from: package-private */
    public void U1() {
        if (this.t == null) {
            this.t = T1();
        }
    }

    /* access modifiers changed from: package-private */
    public int V1(RecyclerView.v vVar, c cVar, RecyclerView.a0 a0Var, boolean z2) {
        int i2 = cVar.c;
        int i3 = cVar.f1136g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                cVar.f1136g = i3 + i2;
            }
            w2(vVar, cVar);
        }
        int i4 = cVar.c + cVar.f1137h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.f1142m && i4 <= 0) || !cVar.c(a0Var)) {
                break;
            }
            bVar.a();
            t2(vVar, a0Var, cVar, bVar);
            if (!bVar.b) {
                cVar.b += bVar.a * cVar.f1135f;
                if (!bVar.c || cVar.f1141l != null || !a0Var.e()) {
                    int i5 = cVar.c;
                    int i6 = bVar.a;
                    cVar.c = i5 - i6;
                    i4 -= i6;
                }
                int i7 = cVar.f1136g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + bVar.a;
                    cVar.f1136g = i8;
                    int i9 = cVar.c;
                    if (i9 < 0) {
                        cVar.f1136g = i8 + i9;
                    }
                    w2(vVar, cVar);
                }
                if (z2 && bVar.f1132d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - cVar.c;
    }

    public void Y0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View D2;
        int i8;
        int i9;
        int i10 = -1;
        if (!(this.D == null && this.A == -1) && a0Var.b() == 0) {
            l1(vVar);
            return;
        }
        d dVar = this.D;
        if (dVar != null && dVar.a()) {
            this.A = this.D.f1143g;
        }
        U1();
        this.t.a = false;
        B2();
        View W = W();
        if (!this.E.f1131e || this.A != -1 || this.D != null) {
            this.E.e();
            a aVar = this.E;
            aVar.f1130d = this.x ^ this.y;
            J2(vVar, a0Var, aVar);
            this.E.f1131e = true;
        } else if (W != null && (this.u.g(W) >= this.u.i() || this.u.d(W) <= this.u.m())) {
            this.E.c(W, i0(W));
        }
        c cVar = this.t;
        cVar.f1135f = cVar.f1140k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        N1(a0Var, iArr);
        int max = Math.max(0, this.H[0]) + this.u.m();
        int max2 = Math.max(0, this.H[1]) + this.u.j();
        if (!(!a0Var.e() || (i7 = this.A) == -1 || this.B == Integer.MIN_VALUE || (D2 = D(i7)) == null)) {
            if (this.x) {
                i8 = this.u.i() - this.u.d(D2);
                i9 = this.B;
            } else {
                i9 = this.u.g(D2) - this.u.m();
                i8 = this.B;
            }
            int i11 = i8 - i9;
            if (i11 > 0) {
                max += i11;
            } else {
                max2 -= i11;
            }
        }
        if (!this.E.f1130d ? !this.x : this.x) {
            i10 = 1;
        }
        v2(vVar, a0Var, this.E, i10);
        x(vVar);
        this.t.f1142m = A2();
        this.t.f1139j = a0Var.e();
        this.t.f1138i = 0;
        a aVar2 = this.E;
        if (aVar2.f1130d) {
            O2(aVar2);
            c cVar2 = this.t;
            cVar2.f1137h = max;
            V1(vVar, cVar2, a0Var, false);
            c cVar3 = this.t;
            i3 = cVar3.b;
            int i12 = cVar3.f1133d;
            int i13 = cVar3.c;
            if (i13 > 0) {
                max2 += i13;
            }
            M2(this.E);
            c cVar4 = this.t;
            cVar4.f1137h = max2;
            cVar4.f1133d += cVar4.f1134e;
            V1(vVar, cVar4, a0Var, false);
            c cVar5 = this.t;
            i2 = cVar5.b;
            int i14 = cVar5.c;
            if (i14 > 0) {
                N2(i12, i3);
                c cVar6 = this.t;
                cVar6.f1137h = i14;
                V1(vVar, cVar6, a0Var, false);
                i3 = this.t.b;
            }
        } else {
            M2(aVar2);
            c cVar7 = this.t;
            cVar7.f1137h = max2;
            V1(vVar, cVar7, a0Var, false);
            c cVar8 = this.t;
            i2 = cVar8.b;
            int i15 = cVar8.f1133d;
            int i16 = cVar8.c;
            if (i16 > 0) {
                max += i16;
            }
            O2(this.E);
            c cVar9 = this.t;
            cVar9.f1137h = max;
            cVar9.f1133d += cVar9.f1134e;
            V1(vVar, cVar9, a0Var, false);
            c cVar10 = this.t;
            i3 = cVar10.b;
            int i17 = cVar10.c;
            if (i17 > 0) {
                L2(i15, i2);
                c cVar11 = this.t;
                cVar11.f1137h = i17;
                V1(vVar, cVar11, a0Var, false);
                i2 = this.t.b;
            }
        }
        if (K() > 0) {
            if (this.x ^ this.y) {
                int l2 = l2(i2, vVar, a0Var, true);
                i5 = i3 + l2;
                i4 = i2 + l2;
                i6 = m2(i5, vVar, a0Var, false);
            } else {
                int m2 = m2(i3, vVar, a0Var, true);
                i5 = i3 + m2;
                i4 = i2 + m2;
                i6 = l2(i4, vVar, a0Var, false);
            }
            i3 = i5 + i6;
            i2 = i4 + i6;
        }
        u2(vVar, a0Var, i3, i2);
        if (!a0Var.e()) {
            this.u.s();
        } else {
            this.E.e();
        }
        this.v = this.y;
    }

    /* access modifiers changed from: package-private */
    public View Y1(boolean z2, boolean z3) {
        if (this.x) {
            return f2(0, K(), z2, z3);
        }
        return f2(K() - 1, -1, z2, z3);
    }

    public void Z0(RecyclerView.a0 a0Var) {
        super.Z0(a0Var);
        this.D = null;
        this.A = -1;
        this.B = RecyclerView.UNDEFINED_DURATION;
        this.E.e();
    }

    /* access modifiers changed from: package-private */
    public View Z1(boolean z2, boolean z3) {
        if (this.x) {
            return f2(K() - 1, -1, z2, z3);
        }
        return f2(0, K(), z2, z3);
    }

    public PointF a(int i2) {
        if (K() == 0) {
            return null;
        }
        boolean z2 = false;
        int i3 = 1;
        if (i2 < i0(J(0))) {
            z2 = true;
        }
        if (z2 != this.x) {
            i3 = -1;
        }
        if (this.s == 0) {
            return new PointF((float) i3, 0.0f);
        }
        return new PointF(0.0f, (float) i3);
    }

    public int a2() {
        View f2 = f2(0, K(), false, true);
        if (f2 == null) {
            return -1;
        }
        return i0(f2);
    }

    public void b(View view, View view2, int i2, int i3) {
        h("Cannot drop a view during a scroll or layout calculation");
        U1();
        B2();
        int i0 = i0(view);
        int i02 = i0(view2);
        char c2 = i0 < i02 ? (char) 1 : 65535;
        if (this.x) {
            if (c2 == 1) {
                D2(i02, this.u.i() - (this.u.g(view2) + this.u.e(view)));
            } else {
                D2(i02, this.u.i() - this.u.d(view2));
            }
        } else if (c2 == 65535) {
            D2(i02, this.u.g(view2));
        } else {
            D2(i02, this.u.d(view2) - this.u.e(view));
        }
    }

    public void d1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.D = (d) parcelable;
            u1();
        }
    }

    public int d2() {
        View f2 = f2(K() - 1, -1, false, true);
        if (f2 == null) {
            return -1;
        }
        return i0(f2);
    }

    public Parcelable e1() {
        if (this.D != null) {
            return new d(this.D);
        }
        d dVar = new d();
        if (K() > 0) {
            U1();
            boolean z2 = this.v ^ this.x;
            dVar.f1145i = z2;
            if (z2) {
                View n2 = n2();
                dVar.f1144h = this.u.i() - this.u.d(n2);
                dVar.f1143g = i0(n2);
            } else {
                View o2 = o2();
                dVar.f1143g = i0(o2);
                dVar.f1144h = this.u.g(o2) - this.u.m();
            }
        } else {
            dVar.b();
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public View e2(int i2, int i3) {
        int i4;
        int i5;
        U1();
        if ((i3 > i2 ? 1 : i3 < i2 ? (char) 65535 : 0) == 0) {
            return J(i2);
        }
        if (this.u.g(J(i2)) < this.u.m()) {
            i5 = 16644;
            i4 = 16388;
        } else {
            i5 = 4161;
            i4 = 4097;
        }
        if (this.s == 0) {
            return this.f1183e.a(i2, i3, i5, i4);
        }
        return this.f1184f.a(i2, i3, i5, i4);
    }

    /* access modifiers changed from: package-private */
    public View f2(int i2, int i3, boolean z2, boolean z3) {
        U1();
        int i4 = 320;
        int i5 = z2 ? 24579 : 320;
        if (!z3) {
            i4 = 0;
        }
        if (this.s == 0) {
            return this.f1183e.a(i2, i3, i5, i4);
        }
        return this.f1184f.a(i2, i3, i5, i4);
    }

    public void h(String str) {
        if (this.D == null) {
            super.h(str);
        }
    }

    /* access modifiers changed from: package-private */
    public View i2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i2, int i3, int i4) {
        U1();
        int m2 = this.u.m();
        int i5 = this.u.i();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i2 != i3) {
            View J = J(i2);
            int i0 = i0(J);
            if (i0 >= 0 && i0 < i4) {
                if (((RecyclerView.p) J.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = J;
                    }
                } else if (this.u.g(J) < i5 && this.u.d(J) >= m2) {
                    return J;
                } else {
                    if (view == null) {
                        view = J;
                    }
                }
            }
            i2 += i6;
        }
        return view != null ? view : view2;
    }

    public boolean l() {
        return this.s == 0;
    }

    public boolean m() {
        return this.s == 1;
    }

    public void p(int i2, int i3, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        if (this.s != 0) {
            i2 = i3;
        }
        if (K() != 0 && i2 != 0) {
            U1();
            K2(i2 > 0 ? 1 : -1, Math.abs(i2), true, a0Var);
            O1(a0Var, this.t, cVar);
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public int p2(RecyclerView.a0 a0Var) {
        if (a0Var.d()) {
            return this.u.n();
        }
        return 0;
    }

    public void q(int i2, RecyclerView.o.c cVar) {
        boolean z2;
        int i3;
        d dVar = this.D;
        int i4 = -1;
        if (dVar == null || !dVar.a()) {
            B2();
            z2 = this.x;
            i3 = this.A;
            if (i3 == -1) {
                i3 = z2 ? i2 - 1 : 0;
            }
        } else {
            d dVar2 = this.D;
            z2 = dVar2.f1145i;
            i3 = dVar2.f1143g;
        }
        if (!z2) {
            i4 = 1;
        }
        for (int i5 = 0; i5 < this.G && i3 >= 0 && i3 < i2; i5++) {
            cVar.a(i3, 0);
            i3 += i4;
        }
    }

    public int q2() {
        return this.s;
    }

    public int r(RecyclerView.a0 a0Var) {
        return P1(a0Var);
    }

    /* access modifiers changed from: protected */
    public boolean r2() {
        return a0() == 1;
    }

    public int s(RecyclerView.a0 a0Var) {
        return Q1(a0Var);
    }

    public boolean s2() {
        return this.z;
    }

    public int t(RecyclerView.a0 a0Var) {
        return R1(a0Var);
    }

    public boolean t0() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void t2(RecyclerView.v vVar, RecyclerView.a0 a0Var, c cVar, b bVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View d2 = cVar.d(vVar);
        if (d2 == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) d2.getLayoutParams();
        if (cVar.f1141l == null) {
            if (this.x == (cVar.f1135f == -1)) {
                e(d2);
            } else {
                f(d2, 0);
            }
        } else {
            if (this.x == (cVar.f1135f == -1)) {
                c(d2);
            } else {
                d(d2, 0);
            }
        }
        B0(d2, 0, 0);
        bVar.a = this.u.e(d2);
        if (this.s == 1) {
            if (r2()) {
                i6 = p0() - g0();
                i5 = i6 - this.u.f(d2);
            } else {
                i5 = f0();
                i6 = this.u.f(d2) + i5;
            }
            if (cVar.f1135f == -1) {
                int i7 = cVar.b;
                i2 = i7;
                i3 = i6;
                i4 = i7 - bVar.a;
            } else {
                int i8 = cVar.b;
                i4 = i8;
                i3 = i6;
                i2 = bVar.a + i8;
            }
        } else {
            int h0 = h0();
            int f2 = this.u.f(d2) + h0;
            if (cVar.f1135f == -1) {
                int i9 = cVar.b;
                i3 = i9;
                i4 = h0;
                i2 = f2;
                i5 = i9 - bVar.a;
            } else {
                int i10 = cVar.b;
                i4 = h0;
                i3 = bVar.a + i10;
                i2 = f2;
                i5 = i10;
            }
        }
        A0(d2, i5, i4, i3, i2);
        if (pVar.c() || pVar.b()) {
            bVar.c = true;
        }
        bVar.f1132d = d2.hasFocusable();
    }

    public int u(RecyclerView.a0 a0Var) {
        return P1(a0Var);
    }

    public int v(RecyclerView.a0 a0Var) {
        return Q1(a0Var);
    }

    /* access modifiers changed from: package-private */
    public void v2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar, int i2) {
    }

    public int w(RecyclerView.a0 a0Var) {
        return R1(a0Var);
    }

    public int x1(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.s == 1) {
            return 0;
        }
        return C2(i2, vVar, a0Var);
    }

    public void y1(int i2) {
        this.A = i2;
        this.B = RecyclerView.UNDEFINED_DURATION;
        d dVar = this.D;
        if (dVar != null) {
            dVar.b();
        }
        u1();
    }

    public int z1(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.s == 0) {
            return 0;
        }
        return C2(i2, vVar, a0Var);
    }

    public LinearLayoutManager(Context context, int i2, boolean z2) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = RecyclerView.UNDEFINED_DURATION;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        E2(i2);
        F2(z2);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = RecyclerView.UNDEFINED_DURATION;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.o.d j0 = RecyclerView.o.j0(context, attributeSet, i2, i3);
        E2(j0.a);
        F2(j0.c);
        G2(j0.f1193d);
    }
}
