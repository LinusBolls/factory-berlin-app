package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import e.h.k.d0.c;

public class GridLayoutManager extends LinearLayoutManager {
    boolean I = false;
    int J = -1;
    int[] K;
    View[] L;
    final SparseIntArray M = new SparseIntArray();
    final SparseIntArray N = new SparseIntArray();
    c O = new a();
    final Rect P = new Rect();
    private boolean Q;

    public static final class a extends c {
        public int e(int i2, int i3) {
            return i2 % i3;
        }

        public int f(int i2) {
            return 1;
        }
    }

    public static abstract class c {
        final SparseIntArray a = new SparseIntArray();
        final SparseIntArray b = new SparseIntArray();
        private boolean c = false;

        /* renamed from: d  reason: collision with root package name */
        private boolean f1129d = false;

        static int a(SparseIntArray sparseIntArray, int i2) {
            int size = sparseIntArray.size() - 1;
            int i3 = 0;
            while (i3 <= size) {
                int i4 = (i3 + size) >>> 1;
                if (sparseIntArray.keyAt(i4) < i2) {
                    i3 = i4 + 1;
                } else {
                    size = i4 - 1;
                }
            }
            int i5 = i3 - 1;
            if (i5 < 0 || i5 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i5);
        }

        /* access modifiers changed from: package-private */
        public int b(int i2, int i3) {
            if (!this.f1129d) {
                return d(i2, i3);
            }
            int i4 = this.b.get(i2, -1);
            if (i4 != -1) {
                return i4;
            }
            int d2 = d(i2, i3);
            this.b.put(i2, d2);
            return d2;
        }

        /* access modifiers changed from: package-private */
        public int c(int i2, int i3) {
            if (!this.c) {
                return e(i2, i3);
            }
            int i4 = this.a.get(i2, -1);
            if (i4 != -1) {
                return i4;
            }
            int e2 = e(i2, i3);
            this.a.put(i2, e2);
            return e2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.f1129d
                r1 = 0
                if (r0 == 0) goto L_0x0024
                android.util.SparseIntArray r0 = r6.b
                int r0 = a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L_0x0024
                android.util.SparseIntArray r2 = r6.b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.c(r0, r8)
                int r0 = r6.f(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L_0x0027
                int r2 = r2 + 1
                goto L_0x0026
            L_0x0024:
                r2 = 0
                r3 = 0
            L_0x0026:
                r4 = 0
            L_0x0027:
                int r0 = r6.f(r7)
            L_0x002b:
                if (r3 >= r7) goto L_0x0040
                int r5 = r6.f(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L_0x0038
                int r2 = r2 + 1
                r4 = 0
                goto L_0x003d
            L_0x0038:
                if (r4 <= r8) goto L_0x003d
                int r2 = r2 + 1
                r4 = r5
            L_0x003d:
                int r3 = r3 + 1
                goto L_0x002b
            L_0x0040:
                int r4 = r4 + r0
                if (r4 <= r8) goto L_0x0045
                int r2 = r2 + 1
            L_0x0045:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.d(int, int):int");
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int e(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.f(r6)
                r1 = 0
                if (r0 != r7) goto L_0x0008
                return r1
            L_0x0008:
                boolean r2 = r5.c
                if (r2 == 0) goto L_0x0020
                android.util.SparseIntArray r2 = r5.a
                int r2 = a(r2, r6)
                if (r2 < 0) goto L_0x0020
                android.util.SparseIntArray r3 = r5.a
                int r3 = r3.get(r2)
                int r4 = r5.f(r2)
                int r3 = r3 + r4
                goto L_0x0030
            L_0x0020:
                r2 = 0
                r3 = 0
            L_0x0022:
                if (r2 >= r6) goto L_0x0033
                int r4 = r5.f(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L_0x002d
                r3 = 0
                goto L_0x0030
            L_0x002d:
                if (r3 <= r7) goto L_0x0030
                r3 = r4
            L_0x0030:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0033:
                int r0 = r0 + r3
                if (r0 > r7) goto L_0x0037
                return r3
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.e(int, int):int");
        }

        public abstract int f(int i2);

        public void g() {
            this.b.clear();
        }

        public void h() {
            this.a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        g3(RecyclerView.o.j0(context, attributeSet, i2, i3).b);
    }

    private void P2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i2, boolean z) {
        int i3;
        int i4;
        int i5 = 0;
        int i6 = -1;
        if (z) {
            i6 = i2;
            i4 = 0;
            i3 = 1;
        } else {
            i4 = i2 - 1;
            i3 = -1;
        }
        while (i4 != i6) {
            View view = this.L[i4];
            b bVar = (b) view.getLayoutParams();
            int c3 = c3(vVar, a0Var, i0(view));
            bVar.f1128f = c3;
            bVar.f1127e = i5;
            i5 += c3;
            i4 += i3;
        }
    }

    private void Q2() {
        int K2 = K();
        for (int i2 = 0; i2 < K2; i2++) {
            b bVar = (b) J(i2).getLayoutParams();
            int a2 = bVar.a();
            this.M.put(a2, bVar.f());
            this.N.put(a2, bVar.e());
        }
    }

    private void R2(int i2) {
        this.K = S2(this.K, this.J, i2);
    }

    static int[] S2(int[] iArr, int i2, int i3) {
        int i4;
        if (!(iArr != null && iArr.length == i2 + 1 && iArr[iArr.length - 1] == i3)) {
            iArr = new int[(i2 + 1)];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i3 / i2;
        int i7 = i3 % i2;
        int i8 = 0;
        for (int i9 = 1; i9 <= i2; i9++) {
            i5 += i7;
            if (i5 <= 0 || i2 - i5 >= i7) {
                i4 = i6;
            } else {
                i4 = i6 + 1;
                i5 -= i2;
            }
            i8 += i4;
            iArr[i9] = i8;
        }
        return iArr;
    }

    private void T2() {
        this.M.clear();
        this.N.clear();
    }

    private int U2(RecyclerView.a0 a0Var) {
        int i2;
        if (!(K() == 0 || a0Var.b() == 0)) {
            U1();
            boolean s2 = s2();
            View Z1 = Z1(!s2, true);
            View Y1 = Y1(!s2, true);
            if (!(Z1 == null || Y1 == null)) {
                int b2 = this.O.b(i0(Z1), this.J);
                int b3 = this.O.b(i0(Y1), this.J);
                int min = Math.min(b2, b3);
                int max = Math.max(b2, b3);
                int b4 = this.O.b(a0Var.b() - 1, this.J) + 1;
                if (this.x) {
                    i2 = Math.max(0, (b4 - max) - 1);
                } else {
                    i2 = Math.max(0, min);
                }
                if (!s2) {
                    return i2;
                }
                return Math.round((((float) i2) * (((float) Math.abs(this.u.d(Y1) - this.u.g(Z1))) / ((float) ((this.O.b(i0(Y1), this.J) - this.O.b(i0(Z1), this.J)) + 1)))) + ((float) (this.u.m() - this.u.g(Z1))));
            }
        }
        return 0;
    }

    private int V2(RecyclerView.a0 a0Var) {
        if (!(K() == 0 || a0Var.b() == 0)) {
            U1();
            View Z1 = Z1(!s2(), true);
            View Y1 = Y1(!s2(), true);
            if (!(Z1 == null || Y1 == null)) {
                if (!s2()) {
                    return this.O.b(a0Var.b() - 1, this.J) + 1;
                }
                int d2 = this.u.d(Y1) - this.u.g(Z1);
                int b2 = this.O.b(i0(Z1), this.J);
                return (int) ((((float) d2) / ((float) ((this.O.b(i0(Y1), this.J) - b2) + 1))) * ((float) (this.O.b(a0Var.b() - 1, this.J) + 1)));
            }
        }
        return 0;
    }

    private void W2(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i2) {
        boolean z = i2 == 1;
        int b3 = b3(vVar, a0Var, aVar.b);
        if (z) {
            while (b3 > 0) {
                int i3 = aVar.b;
                if (i3 > 0) {
                    int i4 = i3 - 1;
                    aVar.b = i4;
                    b3 = b3(vVar, a0Var, i4);
                } else {
                    return;
                }
            }
            return;
        }
        int b2 = a0Var.b() - 1;
        int i5 = aVar.b;
        while (i5 < b2) {
            int i6 = i5 + 1;
            int b32 = b3(vVar, a0Var, i6);
            if (b32 <= b3) {
                break;
            }
            i5 = i6;
            b3 = b32;
        }
        aVar.b = i5;
    }

    private void X2() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    private int a3(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i2) {
        if (!a0Var.e()) {
            return this.O.b(i2, this.J);
        }
        int f2 = vVar.f(i2);
        if (f2 != -1) {
            return this.O.b(f2, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
        return 0;
    }

    private int b3(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i2) {
        if (!a0Var.e()) {
            return this.O.c(i2, this.J);
        }
        int i3 = this.N.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int f2 = vVar.f(i2);
        if (f2 != -1) {
            return this.O.c(f2, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 0;
    }

    private int c3(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i2) {
        if (!a0Var.e()) {
            return this.O.f(i2);
        }
        int i3 = this.M.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int f2 = vVar.f(i2);
        if (f2 != -1) {
            return this.O.f(f2);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 1;
    }

    private void d3(float f2, int i2) {
        R2(Math.max(Math.round(f2 * ((float) this.J)), i2));
    }

    private void e3(View view, int i2, boolean z) {
        int i3;
        int i4;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.b;
        int i5 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i6 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int Y2 = Y2(bVar.f1127e, bVar.f1128f);
        if (this.s == 1) {
            i3 = RecyclerView.o.L(Y2, i2, i6, bVar.width, false);
            i4 = RecyclerView.o.L(this.u.n(), Y(), i5, bVar.height, true);
        } else {
            int L2 = RecyclerView.o.L(Y2, i2, i5, bVar.height, false);
            int L3 = RecyclerView.o.L(this.u.n(), q0(), i6, bVar.width, true);
            i4 = L2;
            i3 = L3;
        }
        f3(view, i3, i4, z);
    }

    private void f3(View view, int i2, int i3, boolean z) {
        boolean z2;
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z) {
            z2 = I1(view, i2, i3, pVar);
        } else {
            z2 = G1(view, i2, i3, pVar);
        }
        if (z2) {
            view.measure(i2, i3);
        }
    }

    private void i3() {
        int i2;
        int i3;
        if (q2() == 1) {
            i3 = p0() - g0();
            i2 = f0();
        } else {
            i3 = X() - e0();
            i2 = h0();
        }
        R2(i3 - i2);
    }

    public void D1(Rect rect, int i2, int i3) {
        int i4;
        int i5;
        if (this.K == null) {
            super.D1(rect, i2, i3);
        }
        int f0 = f0() + g0();
        int h0 = h0() + e0();
        if (this.s == 1) {
            i5 = RecyclerView.o.o(i3, rect.height() + h0, c0());
            int[] iArr = this.K;
            i4 = RecyclerView.o.o(i2, iArr[iArr.length - 1] + f0, d0());
        } else {
            i4 = RecyclerView.o.o(i2, rect.width() + f0, d0());
            int[] iArr2 = this.K;
            i5 = RecyclerView.o.o(i3, iArr2[iArr2.length - 1] + h0, c0());
        }
        C1(i4, i5);
    }

    public RecyclerView.p E() {
        if (this.s == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    public RecyclerView.p F(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public RecyclerView.p G(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    public void G2(boolean z) {
        if (!z) {
            super.G2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r13 == r11) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View K0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.v r26, androidx.recyclerview.widget.RecyclerView.a0 r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.C(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.b) r5
            int r6 = r5.f1127e
            int r5 = r5.f1128f
            int r5 = r5 + r6
            android.view.View r7 = super.K0(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.S1(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = 1
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.x
            if (r7 == r10) goto L_0x0032
            r7 = 1
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.K()
            int r7 = r7 - r9
            r11 = -1
            r12 = -1
            goto L_0x0045
        L_0x003e:
            int r7 = r23.K()
            r11 = r7
            r7 = 0
            r12 = 1
        L_0x0045:
            int r13 = r0.s
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.r2()
            if (r13 == 0) goto L_0x0051
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.a3(r1, r2, r7)
            r10 = r7
            r8 = 0
            r15 = -1
            r16 = -1
            r17 = 0
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0149
            int r9 = r0.a3(r1, r2, r10)
            android.view.View r1 = r0.J(r10)
            if (r1 != r3) goto L_0x006c
            goto L_0x0149
        L_0x006c:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0086
            if (r9 == r14) goto L_0x0086
            if (r4 == 0) goto L_0x0078
            goto L_0x0149
        L_0x0078:
            r18 = r3
            r21 = r7
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
            goto L_0x0135
        L_0x0086:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r9 = (androidx.recyclerview.widget.GridLayoutManager.b) r9
            int r2 = r9.f1127e
            r18 = r3
            int r3 = r9.f1128f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009e
            if (r2 != r6) goto L_0x009e
            if (r3 != r5) goto L_0x009e
            return r1
        L_0x009e:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a6
            if (r4 == 0) goto L_0x00ae
        L_0x00a6:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00ba
            if (r7 != 0) goto L_0x00ba
        L_0x00ae:
            r21 = r7
        L_0x00b0:
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
        L_0x00b8:
            r11 = 1
            goto L_0x0105
        L_0x00ba:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d9
            if (r7 <= r8) goto L_0x00cf
        L_0x00ce:
            goto L_0x00b0
        L_0x00cf:
            if (r7 != r8) goto L_0x00fc
            if (r2 <= r15) goto L_0x00d5
            r7 = 1
            goto L_0x00d6
        L_0x00d5:
            r7 = 0
        L_0x00d6:
            if (r13 != r7) goto L_0x00fc
            goto L_0x00ce
        L_0x00d9:
            if (r4 != 0) goto L_0x00fc
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.z0(r1, r8, r11)
            if (r22 == 0) goto L_0x0100
            r8 = r17
            if (r7 <= r8) goto L_0x00ee
            r7 = r16
            goto L_0x0105
        L_0x00ee:
            if (r7 != r8) goto L_0x00f9
            r7 = r16
            if (r2 <= r7) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r11 = 0
        L_0x00f6:
            if (r13 != r11) goto L_0x0104
            goto L_0x00b8
        L_0x00f9:
            r7 = r16
            goto L_0x0104
        L_0x00fc:
            r19 = r8
            r20 = r11
        L_0x0100:
            r7 = r16
            r8 = r17
        L_0x0104:
            r11 = 0
        L_0x0105:
            if (r11 == 0) goto L_0x0135
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0123
            int r4 = r9.f1127e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L_0x013d
        L_0x0123:
            int r7 = r9.f1127e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x013d
        L_0x0135:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L_0x013d:
            int r10 = r10 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005e
        L_0x0149:
            r21 = r7
            if (r4 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r4 = r21
        L_0x0150:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.K0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    public boolean M1() {
        return this.D == null && !this.I;
    }

    public int O(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.s == 1) {
            return this.J;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return a3(vVar, a0Var, a0Var.b() - 1) + 1;
    }

    /* access modifiers changed from: package-private */
    public void O1(RecyclerView.a0 a0Var, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int i2 = this.J;
        for (int i3 = 0; i3 < this.J && cVar.c(a0Var) && i2 > 0; i3++) {
            int i4 = cVar.f1133d;
            cVar2.a(i4, Math.max(0, cVar.f1136g));
            i2 -= this.O.f(i4);
            cVar.f1133d += cVar.f1134e;
        }
    }

    public void Q0(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, e.h.k.d0.c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.P0(view, cVar);
            return;
        }
        b bVar = (b) layoutParams;
        int a3 = a3(vVar, a0Var, bVar.a());
        if (this.s == 0) {
            cVar.Z(c.C0564c.a(bVar.e(), bVar.f(), a3, 1, false, false));
            return;
        }
        cVar.Z(c.C0564c.a(a3, 1, bVar.e(), bVar.f(), false, false));
    }

    public void S0(RecyclerView recyclerView, int i2, int i3) {
        this.O.h();
        this.O.g();
    }

    public void T0(RecyclerView recyclerView) {
        this.O.h();
        this.O.g();
    }

    public void U0(RecyclerView recyclerView, int i2, int i3, int i4) {
        this.O.h();
        this.O.g();
    }

    public void V0(RecyclerView recyclerView, int i2, int i3) {
        this.O.h();
        this.O.g();
    }

    public void X0(RecyclerView recyclerView, int i2, int i3, Object obj) {
        this.O.h();
        this.O.g();
    }

    public void Y0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (a0Var.e()) {
            Q2();
        }
        super.Y0(vVar, a0Var);
        T2();
    }

    /* access modifiers changed from: package-private */
    public int Y2(int i2, int i3) {
        if (this.s != 1 || !r2()) {
            int[] iArr = this.K;
            return iArr[i3 + i2] - iArr[i2];
        }
        int[] iArr2 = this.K;
        int i4 = this.J;
        return iArr2[i4 - i2] - iArr2[(i4 - i2) - i3];
    }

    public void Z0(RecyclerView.a0 a0Var) {
        super.Z0(a0Var);
        this.I = false;
    }

    public int Z2() {
        return this.J;
    }

    public void g3(int i2) {
        if (i2 != this.J) {
            this.I = true;
            if (i2 >= 1) {
                this.J = i2;
                this.O.h();
                u1();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i2);
        }
    }

    public void h3(c cVar) {
        this.O = cVar;
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
            View J2 = J(i2);
            int i0 = i0(J2);
            if (i0 >= 0 && i0 < i4 && b3(vVar, a0Var, i0) == 0) {
                if (((RecyclerView.p) J2.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = J2;
                    }
                } else if (this.u.g(J2) < i5 && this.u.d(J2) >= m2) {
                    return J2;
                } else {
                    if (view == null) {
                        view = J2;
                    }
                }
            }
            i2 += i6;
        }
        return view != null ? view : view2;
    }

    public int l0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.s == 0) {
            return this.J;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return a3(vVar, a0Var, a0Var.b() - 1) + 1;
    }

    public boolean n(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    public int s(RecyclerView.a0 a0Var) {
        if (this.Q) {
            return U2(a0Var);
        }
        return super.s(a0Var);
    }

    public int t(RecyclerView.a0 a0Var) {
        if (this.Q) {
            return V2(a0Var);
        }
        return super.t(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x021b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0219  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void t2(androidx.recyclerview.widget.RecyclerView.v r18, androidx.recyclerview.widget.RecyclerView.a0 r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            r17 = this;
            r6 = r17
            r0 = r18
            r1 = r19
            r2 = r20
            r7 = r21
            androidx.recyclerview.widget.t r3 = r6.u
            int r3 = r3.l()
            r4 = 1073741824(0x40000000, float:2.0)
            r8 = 1
            r5 = 0
            if (r3 == r4) goto L_0x0018
            r9 = 1
            goto L_0x0019
        L_0x0018:
            r9 = 0
        L_0x0019:
            int r10 = r17.K()
            if (r10 <= 0) goto L_0x0026
            int[] r10 = r6.K
            int r11 = r6.J
            r10 = r10[r11]
            goto L_0x0027
        L_0x0026:
            r10 = 0
        L_0x0027:
            if (r9 == 0) goto L_0x002c
            r17.i3()
        L_0x002c:
            int r11 = r2.f1134e
            if (r11 != r8) goto L_0x0032
            r11 = 1
            goto L_0x0033
        L_0x0032:
            r11 = 0
        L_0x0033:
            int r12 = r6.J
            if (r11 != 0) goto L_0x0044
            int r12 = r2.f1133d
            int r12 = r6.b3(r0, r1, r12)
            int r13 = r2.f1133d
            int r13 = r6.c3(r0, r1, r13)
            int r12 = r12 + r13
        L_0x0044:
            r13 = 0
        L_0x0045:
            int r14 = r6.J
            if (r13 >= r14) goto L_0x009d
            boolean r14 = r2.c(r1)
            if (r14 == 0) goto L_0x009d
            if (r12 <= 0) goto L_0x009d
            int r14 = r2.f1133d
            int r15 = r6.c3(r0, r1, r14)
            int r4 = r6.J
            if (r15 > r4) goto L_0x006f
            int r12 = r12 - r15
            if (r12 >= 0) goto L_0x005f
            goto L_0x009d
        L_0x005f:
            android.view.View r4 = r2.d(r0)
            if (r4 != 0) goto L_0x0066
            goto L_0x009d
        L_0x0066:
            android.view.View[] r14 = r6.L
            r14[r13] = r4
            int r13 = r13 + 1
            r4 = 1073741824(0x40000000, float:2.0)
            goto L_0x0045
        L_0x006f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Item at position "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " requires "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " spans but GridLayoutManager has only "
            r1.append(r2)
            int r2 = r6.J
            r1.append(r2)
            java.lang.String r2 = " spans."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009d:
            if (r13 != 0) goto L_0x00a2
            r7.b = r8
            return
        L_0x00a2:
            r4 = 0
            r6.P2(r0, r1, r13, r11)
            r0 = 0
            r1 = 0
        L_0x00a8:
            if (r0 >= r13) goto L_0x00f4
            android.view.View[] r12 = r6.L
            r12 = r12[r0]
            java.util.List<androidx.recyclerview.widget.RecyclerView$d0> r14 = r2.f1141l
            if (r14 != 0) goto L_0x00bc
            if (r11 == 0) goto L_0x00b8
            r6.e(r12)
            goto L_0x00c5
        L_0x00b8:
            r6.f(r12, r5)
            goto L_0x00c5
        L_0x00bc:
            if (r11 == 0) goto L_0x00c2
            r6.c(r12)
            goto L_0x00c5
        L_0x00c2:
            r6.d(r12, r5)
        L_0x00c5:
            android.graphics.Rect r14 = r6.P
            r6.k(r12, r14)
            r6.e3(r12, r3, r5)
            androidx.recyclerview.widget.t r14 = r6.u
            int r14 = r14.e(r12)
            if (r14 <= r1) goto L_0x00d6
            r1 = r14
        L_0x00d6:
            android.view.ViewGroup$LayoutParams r14 = r12.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r14 = (androidx.recyclerview.widget.GridLayoutManager.b) r14
            r15 = 1065353216(0x3f800000, float:1.0)
            androidx.recyclerview.widget.t r5 = r6.u
            int r5 = r5.f(r12)
            float r5 = (float) r5
            float r5 = r5 * r15
            int r12 = r14.f1128f
            float r12 = (float) r12
            float r5 = r5 / r12
            int r12 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x00f0
            r4 = r5
        L_0x00f0:
            int r0 = r0 + 1
            r5 = 0
            goto L_0x00a8
        L_0x00f4:
            if (r9 == 0) goto L_0x0112
            r6.d3(r4, r10)
            r0 = 0
            r1 = 0
        L_0x00fb:
            if (r0 >= r13) goto L_0x0112
            android.view.View[] r3 = r6.L
            r3 = r3[r0]
            r4 = 1073741824(0x40000000, float:2.0)
            r6.e3(r3, r4, r8)
            androidx.recyclerview.widget.t r4 = r6.u
            int r3 = r4.e(r3)
            if (r3 <= r1) goto L_0x010f
            r1 = r3
        L_0x010f:
            int r0 = r0 + 1
            goto L_0x00fb
        L_0x0112:
            r0 = 0
        L_0x0113:
            if (r0 >= r13) goto L_0x0175
            android.view.View[] r3 = r6.L
            r3 = r3[r0]
            androidx.recyclerview.widget.t r4 = r6.u
            int r4 = r4.e(r3)
            if (r4 == r1) goto L_0x016f
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r4 = (androidx.recyclerview.widget.GridLayoutManager.b) r4
            android.graphics.Rect r5 = r4.b
            int r9 = r5.top
            int r10 = r5.bottom
            int r9 = r9 + r10
            int r10 = r4.topMargin
            int r9 = r9 + r10
            int r10 = r4.bottomMargin
            int r9 = r9 + r10
            int r10 = r5.left
            int r5 = r5.right
            int r10 = r10 + r5
            int r5 = r4.leftMargin
            int r10 = r10 + r5
            int r5 = r4.rightMargin
            int r10 = r10 + r5
            int r5 = r4.f1127e
            int r11 = r4.f1128f
            int r5 = r6.Y2(r5, r11)
            int r11 = r6.s
            if (r11 != r8) goto L_0x015b
            int r4 = r4.width
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 0
            int r4 = androidx.recyclerview.widget.RecyclerView.o.L(r5, r11, r10, r4, r12)
            int r5 = r1 - r9
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r11)
            goto L_0x016b
        L_0x015b:
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 0
            int r10 = r1 - r10
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            int r4 = r4.height
            int r5 = androidx.recyclerview.widget.RecyclerView.o.L(r5, r11, r9, r4, r12)
            r4 = r10
        L_0x016b:
            r6.f3(r3, r4, r5, r8)
            goto L_0x0172
        L_0x016f:
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 0
        L_0x0172:
            int r0 = r0 + 1
            goto L_0x0113
        L_0x0175:
            r12 = 0
            r7.a = r1
            int r0 = r6.s
            r3 = -1
            if (r0 != r8) goto L_0x018f
            int r0 = r2.f1135f
            if (r0 != r3) goto L_0x0187
            int r0 = r2.b
            int r1 = r0 - r1
            r2 = r1
            goto L_0x018c
        L_0x0187:
            int r0 = r2.b
            int r1 = r1 + r0
            r2 = r0
            r0 = r1
        L_0x018c:
            r1 = 0
            r3 = 0
            goto L_0x01a2
        L_0x018f:
            int r0 = r2.f1135f
            if (r0 != r3) goto L_0x019c
            int r0 = r2.b
            int r1 = r0 - r1
            r3 = r1
            r2 = 0
            r1 = r0
            r0 = 0
            goto L_0x01a2
        L_0x019c:
            int r0 = r2.b
            int r1 = r1 + r0
            r3 = r0
            r0 = 0
            r2 = 0
        L_0x01a2:
            if (r12 >= r13) goto L_0x022d
            android.view.View[] r4 = r6.L
            r9 = r4[r12]
            android.view.ViewGroup$LayoutParams r4 = r9.getLayoutParams()
            r10 = r4
            androidx.recyclerview.widget.GridLayoutManager$b r10 = (androidx.recyclerview.widget.GridLayoutManager.b) r10
            int r4 = r6.s
            if (r4 != r8) goto L_0x01eb
            boolean r1 = r17.r2()
            if (r1 == 0) goto L_0x01d3
            int r1 = r17.f0()
            int[] r3 = r6.K
            int r4 = r6.J
            int r5 = r10.f1127e
            int r4 = r4 - r5
            r3 = r3[r4]
            int r1 = r1 + r3
            androidx.recyclerview.widget.t r3 = r6.u
            int r3 = r3.f(r9)
            int r3 = r1 - r3
            r11 = r0
            r14 = r1
            r15 = r2
            goto L_0x0200
        L_0x01d3:
            int r1 = r17.f0()
            int[] r3 = r6.K
            int r4 = r10.f1127e
            r3 = r3[r4]
            int r1 = r1 + r3
            androidx.recyclerview.widget.t r3 = r6.u
            int r3 = r3.f(r9)
            int r3 = r3 + r1
            r11 = r0
            r16 = r1
            r15 = r2
            r14 = r3
            goto L_0x0202
        L_0x01eb:
            int r0 = r17.h0()
            int[] r2 = r6.K
            int r4 = r10.f1127e
            r2 = r2[r4]
            int r0 = r0 + r2
            androidx.recyclerview.widget.t r2 = r6.u
            int r2 = r2.f(r9)
            int r2 = r2 + r0
            r15 = r0
            r14 = r1
            r11 = r2
        L_0x0200:
            r16 = r3
        L_0x0202:
            r0 = r17
            r1 = r9
            r2 = r16
            r3 = r15
            r4 = r14
            r5 = r11
            r0.A0(r1, r2, r3, r4, r5)
            boolean r0 = r10.c()
            if (r0 != 0) goto L_0x0219
            boolean r0 = r10.b()
            if (r0 == 0) goto L_0x021b
        L_0x0219:
            r7.c = r8
        L_0x021b:
            boolean r0 = r7.f1132d
            boolean r1 = r9.hasFocusable()
            r0 = r0 | r1
            r7.f1132d = r0
            int r12 = r12 + 1
            r0 = r11
            r1 = r14
            r2 = r15
            r3 = r16
            goto L_0x01a2
        L_0x022d:
            android.view.View[] r0 = r6.L
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.t2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    public int v(RecyclerView.a0 a0Var) {
        if (this.Q) {
            return U2(a0Var);
        }
        return super.v(a0Var);
    }

    /* access modifiers changed from: package-private */
    public void v2(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i2) {
        super.v2(vVar, a0Var, aVar, i2);
        i3();
        if (a0Var.b() > 0 && !a0Var.e()) {
            W2(vVar, a0Var, aVar, i2);
        }
        X2();
    }

    public int w(RecyclerView.a0 a0Var) {
        if (this.Q) {
            return V2(a0Var);
        }
        return super.w(a0Var);
    }

    public int x1(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        i3();
        X2();
        return super.x1(i2, vVar, a0Var);
    }

    public int z1(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        i3();
        X2();
        return super.z1(i2, vVar, a0Var);
    }

    public static class b extends RecyclerView.p {

        /* renamed from: e  reason: collision with root package name */
        int f1127e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f1128f = 0;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int e() {
            return this.f1127e;
        }

        public int f() {
            return this.f1128f;
        }

        public b(int i2, int i3) {
            super(i2, i3);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public GridLayoutManager(Context context, int i2) {
        super(context);
        g3(i2);
    }

    public GridLayoutManager(Context context, int i2, int i3, boolean z) {
        super(context, i3, z);
        g3(i2);
    }
}
