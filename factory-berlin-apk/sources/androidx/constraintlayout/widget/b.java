package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintSet */
public class b {
    private static final int[] b = {0, 4, 8};
    private static SparseIntArray c;
    private HashMap<Integer, C0010b> a = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.b$b  reason: collision with other inner class name */
    /* compiled from: ConstraintSet */
    private static class C0010b {
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public float Q;
        public float R;
        public int S;
        public int T;
        public float U;
        public boolean V;
        public float W;
        public float X;
        public float Y;
        public float Z;
        boolean a;
        public float a0;
        public int b;
        public float b0;
        public int c;
        public float c0;

        /* renamed from: d  reason: collision with root package name */
        int f608d;
        public float d0;

        /* renamed from: e  reason: collision with root package name */
        public int f609e;
        public float e0;

        /* renamed from: f  reason: collision with root package name */
        public int f610f;
        public float f0;

        /* renamed from: g  reason: collision with root package name */
        public float f611g;
        public float g0;

        /* renamed from: h  reason: collision with root package name */
        public int f612h;
        public boolean h0;

        /* renamed from: i  reason: collision with root package name */
        public int f613i;
        public boolean i0;

        /* renamed from: j  reason: collision with root package name */
        public int f614j;
        public int j0;

        /* renamed from: k  reason: collision with root package name */
        public int f615k;
        public int k0;

        /* renamed from: l  reason: collision with root package name */
        public int f616l;
        public int l0;

        /* renamed from: m  reason: collision with root package name */
        public int f617m;
        public int m0;

        /* renamed from: n  reason: collision with root package name */
        public int f618n;
        public int n0;
        public int o;
        public int o0;
        public int p;
        public float p0;
        public int q;
        public float q0;
        public int r;
        public boolean r0;
        public int s;
        public int s0;
        public int t;
        public int t0;
        public float u;
        public int[] u0;
        public float v;
        public String v0;
        public String w;
        public int x;
        public int y;
        public float z;

        private C0010b() {
            this.a = false;
            this.f609e = -1;
            this.f610f = -1;
            this.f611g = -1.0f;
            this.f612h = -1;
            this.f613i = -1;
            this.f614j = -1;
            this.f615k = -1;
            this.f616l = -1;
            this.f617m = -1;
            this.f618n = -1;
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = 0.5f;
            this.v = 0.5f;
            this.w = null;
            this.x = -1;
            this.y = 0;
            this.z = 0.0f;
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.H = -1;
            this.I = -1;
            this.J = 0;
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = -1;
            this.P = -1;
            this.Q = 0.0f;
            this.R = 0.0f;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = false;
            this.W = 0.0f;
            this.X = 0.0f;
            this.Y = 0.0f;
            this.Z = 0.0f;
            this.a0 = 1.0f;
            this.b0 = 1.0f;
            this.c0 = Float.NaN;
            this.d0 = Float.NaN;
            this.e0 = 0.0f;
            this.f0 = 0.0f;
            this.g0 = 0.0f;
            this.h0 = false;
            this.i0 = false;
            this.j0 = 0;
            this.k0 = 0;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = 1.0f;
            this.q0 = 1.0f;
            this.r0 = false;
            this.s0 = -1;
            this.t0 = -1;
        }

        private void e(int i2, ConstraintLayout.a aVar) {
            this.f608d = i2;
            this.f612h = aVar.f591d;
            this.f613i = aVar.f592e;
            this.f614j = aVar.f593f;
            this.f615k = aVar.f594g;
            this.f616l = aVar.f595h;
            this.f617m = aVar.f596i;
            this.f618n = aVar.f597j;
            this.o = aVar.f598k;
            this.p = aVar.f599l;
            this.q = aVar.p;
            this.r = aVar.q;
            this.s = aVar.r;
            this.t = aVar.s;
            this.u = aVar.z;
            this.v = aVar.A;
            this.w = aVar.B;
            this.x = aVar.f600m;
            this.y = aVar.f601n;
            this.z = aVar.o;
            this.A = aVar.P;
            this.B = aVar.Q;
            this.C = aVar.R;
            this.f611g = aVar.c;
            this.f609e = aVar.a;
            this.f610f = aVar.b;
            this.b = aVar.width;
            this.c = aVar.height;
            this.D = aVar.leftMargin;
            this.E = aVar.rightMargin;
            this.F = aVar.topMargin;
            this.G = aVar.bottomMargin;
            this.Q = aVar.E;
            this.R = aVar.D;
            this.T = aVar.G;
            this.S = aVar.F;
            boolean z2 = aVar.S;
            this.h0 = z2;
            this.i0 = aVar.T;
            this.j0 = aVar.H;
            this.k0 = aVar.I;
            this.h0 = z2;
            this.l0 = aVar.L;
            this.m0 = aVar.M;
            this.n0 = aVar.J;
            this.o0 = aVar.K;
            this.p0 = aVar.N;
            this.q0 = aVar.O;
            if (Build.VERSION.SDK_INT >= 17) {
                this.H = aVar.getMarginEnd();
                this.I = aVar.getMarginStart();
            }
        }

        /* access modifiers changed from: private */
        public void f(int i2, c.a aVar) {
            e(i2, aVar);
            this.U = aVar.m0;
            this.X = aVar.p0;
            this.Y = aVar.q0;
            this.Z = aVar.r0;
            this.a0 = aVar.s0;
            this.b0 = aVar.t0;
            this.c0 = aVar.u0;
            this.d0 = aVar.v0;
            this.e0 = aVar.w0;
            this.f0 = aVar.x0;
            this.g0 = aVar.y0;
            this.W = aVar.o0;
            this.V = aVar.n0;
        }

        /* access modifiers changed from: private */
        public void g(a aVar, int i2, c.a aVar2) {
            f(i2, aVar2);
            if (aVar instanceof Barrier) {
                this.t0 = 1;
                Barrier barrier = (Barrier) aVar;
                this.s0 = barrier.getType();
                this.u0 = barrier.getReferencedIds();
            }
        }

        public void c(ConstraintLayout.a aVar) {
            aVar.f591d = this.f612h;
            aVar.f592e = this.f613i;
            aVar.f593f = this.f614j;
            aVar.f594g = this.f615k;
            aVar.f595h = this.f616l;
            aVar.f596i = this.f617m;
            aVar.f597j = this.f618n;
            aVar.f598k = this.o;
            aVar.f599l = this.p;
            aVar.p = this.q;
            aVar.q = this.r;
            aVar.r = this.s;
            aVar.s = this.t;
            aVar.leftMargin = this.D;
            aVar.rightMargin = this.E;
            aVar.topMargin = this.F;
            aVar.bottomMargin = this.G;
            aVar.x = this.P;
            aVar.y = this.O;
            aVar.z = this.u;
            aVar.A = this.v;
            aVar.f600m = this.x;
            aVar.f601n = this.y;
            aVar.o = this.z;
            aVar.B = this.w;
            aVar.P = this.A;
            aVar.Q = this.B;
            aVar.E = this.Q;
            aVar.D = this.R;
            aVar.G = this.T;
            aVar.F = this.S;
            aVar.S = this.h0;
            aVar.T = this.i0;
            aVar.H = this.j0;
            aVar.I = this.k0;
            aVar.L = this.l0;
            aVar.M = this.m0;
            aVar.J = this.n0;
            aVar.K = this.o0;
            aVar.N = this.p0;
            aVar.O = this.q0;
            aVar.R = this.C;
            aVar.c = this.f611g;
            aVar.a = this.f609e;
            aVar.b = this.f610f;
            aVar.width = this.b;
            aVar.height = this.c;
            if (Build.VERSION.SDK_INT >= 17) {
                aVar.setMarginStart(this.I);
                aVar.setMarginEnd(this.H);
            }
            aVar.a();
        }

        /* renamed from: d */
        public C0010b clone() {
            C0010b bVar = new C0010b();
            bVar.a = this.a;
            bVar.b = this.b;
            bVar.c = this.c;
            bVar.f609e = this.f609e;
            bVar.f610f = this.f610f;
            bVar.f611g = this.f611g;
            bVar.f612h = this.f612h;
            bVar.f613i = this.f613i;
            bVar.f614j = this.f614j;
            bVar.f615k = this.f615k;
            bVar.f616l = this.f616l;
            bVar.f617m = this.f617m;
            bVar.f618n = this.f618n;
            bVar.o = this.o;
            bVar.p = this.p;
            bVar.q = this.q;
            bVar.r = this.r;
            bVar.s = this.s;
            bVar.t = this.t;
            bVar.u = this.u;
            bVar.v = this.v;
            bVar.w = this.w;
            bVar.A = this.A;
            bVar.B = this.B;
            bVar.u = this.u;
            bVar.u = this.u;
            bVar.u = this.u;
            bVar.u = this.u;
            bVar.u = this.u;
            bVar.C = this.C;
            bVar.D = this.D;
            bVar.E = this.E;
            bVar.F = this.F;
            bVar.G = this.G;
            bVar.H = this.H;
            bVar.I = this.I;
            bVar.J = this.J;
            bVar.K = this.K;
            bVar.L = this.L;
            bVar.M = this.M;
            bVar.N = this.N;
            bVar.O = this.O;
            bVar.P = this.P;
            bVar.Q = this.Q;
            bVar.R = this.R;
            bVar.S = this.S;
            bVar.T = this.T;
            bVar.U = this.U;
            bVar.V = this.V;
            bVar.W = this.W;
            bVar.X = this.X;
            bVar.Y = this.Y;
            bVar.Z = this.Z;
            bVar.a0 = this.a0;
            bVar.b0 = this.b0;
            bVar.c0 = this.c0;
            bVar.d0 = this.d0;
            bVar.e0 = this.e0;
            bVar.f0 = this.f0;
            bVar.g0 = this.g0;
            bVar.h0 = this.h0;
            bVar.i0 = this.i0;
            bVar.j0 = this.j0;
            bVar.k0 = this.k0;
            bVar.l0 = this.l0;
            bVar.m0 = this.m0;
            bVar.n0 = this.n0;
            bVar.o0 = this.o0;
            bVar.p0 = this.p0;
            bVar.q0 = this.q0;
            bVar.s0 = this.s0;
            bVar.t0 = this.t0;
            int[] iArr = this.u0;
            if (iArr != null) {
                bVar.u0 = Arrays.copyOf(iArr, iArr.length);
            }
            bVar.x = this.x;
            bVar.y = this.y;
            bVar.z = this.z;
            bVar.r0 = this.r0;
            return bVar;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        sparseIntArray.append(f.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        c.append(f.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        c.append(f.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        c.append(f.ConstraintSet_layout_constraintRight_toRightOf, 30);
        c.append(f.ConstraintSet_layout_constraintTop_toTopOf, 36);
        c.append(f.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        c.append(f.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        c.append(f.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        c.append(f.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        c.append(f.ConstraintSet_layout_editor_absoluteX, 6);
        c.append(f.ConstraintSet_layout_editor_absoluteY, 7);
        c.append(f.ConstraintSet_layout_constraintGuide_begin, 17);
        c.append(f.ConstraintSet_layout_constraintGuide_end, 18);
        c.append(f.ConstraintSet_layout_constraintGuide_percent, 19);
        c.append(f.ConstraintSet_android_orientation, 27);
        c.append(f.ConstraintSet_layout_constraintStart_toEndOf, 32);
        c.append(f.ConstraintSet_layout_constraintStart_toStartOf, 33);
        c.append(f.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        c.append(f.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        c.append(f.ConstraintSet_layout_goneMarginLeft, 13);
        c.append(f.ConstraintSet_layout_goneMarginTop, 16);
        c.append(f.ConstraintSet_layout_goneMarginRight, 14);
        c.append(f.ConstraintSet_layout_goneMarginBottom, 11);
        c.append(f.ConstraintSet_layout_goneMarginStart, 15);
        c.append(f.ConstraintSet_layout_goneMarginEnd, 12);
        c.append(f.ConstraintSet_layout_constraintVertical_weight, 40);
        c.append(f.ConstraintSet_layout_constraintHorizontal_weight, 39);
        c.append(f.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        c.append(f.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        c.append(f.ConstraintSet_layout_constraintHorizontal_bias, 20);
        c.append(f.ConstraintSet_layout_constraintVertical_bias, 37);
        c.append(f.ConstraintSet_layout_constraintDimensionRatio, 5);
        c.append(f.ConstraintSet_layout_constraintLeft_creator, 75);
        c.append(f.ConstraintSet_layout_constraintTop_creator, 75);
        c.append(f.ConstraintSet_layout_constraintRight_creator, 75);
        c.append(f.ConstraintSet_layout_constraintBottom_creator, 75);
        c.append(f.ConstraintSet_layout_constraintBaseline_creator, 75);
        c.append(f.ConstraintSet_android_layout_marginLeft, 24);
        c.append(f.ConstraintSet_android_layout_marginRight, 28);
        c.append(f.ConstraintSet_android_layout_marginStart, 31);
        c.append(f.ConstraintSet_android_layout_marginEnd, 8);
        c.append(f.ConstraintSet_android_layout_marginTop, 34);
        c.append(f.ConstraintSet_android_layout_marginBottom, 2);
        c.append(f.ConstraintSet_android_layout_width, 23);
        c.append(f.ConstraintSet_android_layout_height, 21);
        c.append(f.ConstraintSet_android_visibility, 22);
        c.append(f.ConstraintSet_android_alpha, 43);
        c.append(f.ConstraintSet_android_elevation, 44);
        c.append(f.ConstraintSet_android_rotationX, 45);
        c.append(f.ConstraintSet_android_rotationY, 46);
        c.append(f.ConstraintSet_android_rotation, 60);
        c.append(f.ConstraintSet_android_scaleX, 47);
        c.append(f.ConstraintSet_android_scaleY, 48);
        c.append(f.ConstraintSet_android_transformPivotX, 49);
        c.append(f.ConstraintSet_android_transformPivotY, 50);
        c.append(f.ConstraintSet_android_translationX, 51);
        c.append(f.ConstraintSet_android_translationY, 52);
        c.append(f.ConstraintSet_android_translationZ, 53);
        c.append(f.ConstraintSet_layout_constraintWidth_default, 54);
        c.append(f.ConstraintSet_layout_constraintHeight_default, 55);
        c.append(f.ConstraintSet_layout_constraintWidth_max, 56);
        c.append(f.ConstraintSet_layout_constraintHeight_max, 57);
        c.append(f.ConstraintSet_layout_constraintWidth_min, 58);
        c.append(f.ConstraintSet_layout_constraintHeight_min, 59);
        c.append(f.ConstraintSet_layout_constraintCircle, 61);
        c.append(f.ConstraintSet_layout_constraintCircleRadius, 62);
        c.append(f.ConstraintSet_layout_constraintCircleAngle, 63);
        c.append(f.ConstraintSet_android_id, 38);
        c.append(f.ConstraintSet_layout_constraintWidth_percent, 69);
        c.append(f.ConstraintSet_layout_constraintHeight_percent, 70);
        c.append(f.ConstraintSet_chainUseRtl, 71);
        c.append(f.ConstraintSet_barrierDirection, 72);
        c.append(f.ConstraintSet_constraint_referenced_ids, 73);
        c.append(f.ConstraintSet_barrierAllowsGoneWidgets, 74);
    }

    private int[] c(View view, String str) {
        int i2;
        Object c2;
        String[] split = str.split(AndroidSdkMetrics.SEPARATOR);
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            try {
                i2 = e.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i2 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (c2 = ((ConstraintLayout) view.getParent()).c(0, trim)) != null && (c2 instanceof Integer)) {
                i2 = ((Integer) c2).intValue();
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        return i4 != split.length ? Arrays.copyOf(iArr, i4) : iArr;
    }

    private C0010b d(Context context, AttributeSet attributeSet) {
        C0010b bVar = new C0010b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.ConstraintSet);
        g(bVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return bVar;
    }

    private static int f(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    private void g(C0010b bVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            int i3 = c.get(index);
            switch (i3) {
                case 1:
                    bVar.p = f(typedArray, index, bVar.p);
                    break;
                case 2:
                    bVar.G = typedArray.getDimensionPixelSize(index, bVar.G);
                    break;
                case 3:
                    bVar.o = f(typedArray, index, bVar.o);
                    break;
                case 4:
                    bVar.f618n = f(typedArray, index, bVar.f618n);
                    break;
                case 5:
                    bVar.w = typedArray.getString(index);
                    break;
                case 6:
                    bVar.A = typedArray.getDimensionPixelOffset(index, bVar.A);
                    break;
                case 7:
                    bVar.B = typedArray.getDimensionPixelOffset(index, bVar.B);
                    break;
                case 8:
                    bVar.H = typedArray.getDimensionPixelSize(index, bVar.H);
                    break;
                case 9:
                    bVar.t = f(typedArray, index, bVar.t);
                    break;
                case 10:
                    bVar.s = f(typedArray, index, bVar.s);
                    break;
                case 11:
                    bVar.N = typedArray.getDimensionPixelSize(index, bVar.N);
                    break;
                case 12:
                    bVar.O = typedArray.getDimensionPixelSize(index, bVar.O);
                    break;
                case 13:
                    bVar.K = typedArray.getDimensionPixelSize(index, bVar.K);
                    break;
                case 14:
                    bVar.M = typedArray.getDimensionPixelSize(index, bVar.M);
                    break;
                case 15:
                    bVar.P = typedArray.getDimensionPixelSize(index, bVar.P);
                    break;
                case 16:
                    bVar.L = typedArray.getDimensionPixelSize(index, bVar.L);
                    break;
                case 17:
                    bVar.f609e = typedArray.getDimensionPixelOffset(index, bVar.f609e);
                    break;
                case 18:
                    bVar.f610f = typedArray.getDimensionPixelOffset(index, bVar.f610f);
                    break;
                case 19:
                    bVar.f611g = typedArray.getFloat(index, bVar.f611g);
                    break;
                case 20:
                    bVar.u = typedArray.getFloat(index, bVar.u);
                    break;
                case 21:
                    bVar.c = typedArray.getLayoutDimension(index, bVar.c);
                    break;
                case 22:
                    int i4 = typedArray.getInt(index, bVar.J);
                    bVar.J = i4;
                    bVar.J = b[i4];
                    break;
                case 23:
                    bVar.b = typedArray.getLayoutDimension(index, bVar.b);
                    break;
                case 24:
                    bVar.D = typedArray.getDimensionPixelSize(index, bVar.D);
                    break;
                case 25:
                    bVar.f612h = f(typedArray, index, bVar.f612h);
                    break;
                case 26:
                    bVar.f613i = f(typedArray, index, bVar.f613i);
                    break;
                case 27:
                    bVar.C = typedArray.getInt(index, bVar.C);
                    break;
                case 28:
                    bVar.E = typedArray.getDimensionPixelSize(index, bVar.E);
                    break;
                case 29:
                    bVar.f614j = f(typedArray, index, bVar.f614j);
                    break;
                case 30:
                    bVar.f615k = f(typedArray, index, bVar.f615k);
                    break;
                case 31:
                    bVar.I = typedArray.getDimensionPixelSize(index, bVar.I);
                    break;
                case 32:
                    bVar.q = f(typedArray, index, bVar.q);
                    break;
                case 33:
                    bVar.r = f(typedArray, index, bVar.r);
                    break;
                case 34:
                    bVar.F = typedArray.getDimensionPixelSize(index, bVar.F);
                    break;
                case 35:
                    bVar.f617m = f(typedArray, index, bVar.f617m);
                    break;
                case 36:
                    bVar.f616l = f(typedArray, index, bVar.f616l);
                    break;
                case 37:
                    bVar.v = typedArray.getFloat(index, bVar.v);
                    break;
                case 38:
                    bVar.f608d = typedArray.getResourceId(index, bVar.f608d);
                    break;
                case 39:
                    bVar.R = typedArray.getFloat(index, bVar.R);
                    break;
                case 40:
                    bVar.Q = typedArray.getFloat(index, bVar.Q);
                    break;
                case 41:
                    bVar.S = typedArray.getInt(index, bVar.S);
                    break;
                case 42:
                    bVar.T = typedArray.getInt(index, bVar.T);
                    break;
                case 43:
                    bVar.U = typedArray.getFloat(index, bVar.U);
                    break;
                case 44:
                    bVar.V = true;
                    bVar.W = typedArray.getDimension(index, bVar.W);
                    break;
                case 45:
                    bVar.Y = typedArray.getFloat(index, bVar.Y);
                    break;
                case 46:
                    bVar.Z = typedArray.getFloat(index, bVar.Z);
                    break;
                case 47:
                    bVar.a0 = typedArray.getFloat(index, bVar.a0);
                    break;
                case 48:
                    bVar.b0 = typedArray.getFloat(index, bVar.b0);
                    break;
                case 49:
                    bVar.c0 = typedArray.getFloat(index, bVar.c0);
                    break;
                case 50:
                    bVar.d0 = typedArray.getFloat(index, bVar.d0);
                    break;
                case 51:
                    bVar.e0 = typedArray.getDimension(index, bVar.e0);
                    break;
                case 52:
                    bVar.f0 = typedArray.getDimension(index, bVar.f0);
                    break;
                case 53:
                    bVar.g0 = typedArray.getDimension(index, bVar.g0);
                    break;
                default:
                    switch (i3) {
                        case 60:
                            bVar.X = typedArray.getFloat(index, bVar.X);
                            break;
                        case 61:
                            bVar.x = f(typedArray, index, bVar.x);
                            break;
                        case 62:
                            bVar.y = typedArray.getDimensionPixelSize(index, bVar.y);
                            break;
                        case 63:
                            bVar.z = typedArray.getFloat(index, bVar.z);
                            break;
                        default:
                            switch (i3) {
                                case 69:
                                    bVar.p0 = typedArray.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    bVar.q0 = typedArray.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    break;
                                case 72:
                                    bVar.s0 = typedArray.getInt(index, bVar.s0);
                                    break;
                                case 73:
                                    bVar.v0 = typedArray.getString(index);
                                    break;
                                case 74:
                                    bVar.r0 = typedArray.getBoolean(index, bVar.r0);
                                    break;
                                case 75:
                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + c.get(index));
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + c.get(index));
                                    break;
                            }
                    }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.a.keySet());
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (id != -1) {
                if (this.a.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0010b bVar = this.a.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        bVar.t0 = 1;
                    }
                    int i3 = bVar.t0;
                    if (i3 != -1 && i3 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(bVar.s0);
                        barrier.setAllowsGoneWidget(bVar.r0);
                        int[] iArr = bVar.u0;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str = bVar.v0;
                            if (str != null) {
                                int[] c2 = c(barrier, str);
                                bVar.u0 = c2;
                                barrier.setReferencedIds(c2);
                            }
                        }
                    }
                    ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
                    bVar.c(aVar);
                    childAt.setLayoutParams(aVar);
                    childAt.setVisibility(bVar.J);
                    if (Build.VERSION.SDK_INT >= 17) {
                        childAt.setAlpha(bVar.U);
                        childAt.setRotation(bVar.X);
                        childAt.setRotationX(bVar.Y);
                        childAt.setRotationY(bVar.Z);
                        childAt.setScaleX(bVar.a0);
                        childAt.setScaleY(bVar.b0);
                        if (!Float.isNaN(bVar.c0)) {
                            childAt.setPivotX(bVar.c0);
                        }
                        if (!Float.isNaN(bVar.d0)) {
                            childAt.setPivotY(bVar.d0);
                        }
                        childAt.setTranslationX(bVar.e0);
                        childAt.setTranslationY(bVar.f0);
                        if (Build.VERSION.SDK_INT >= 21) {
                            childAt.setTranslationZ(bVar.g0);
                            if (bVar.V) {
                                childAt.setElevation(bVar.W);
                            }
                        }
                    }
                }
                i2++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0010b bVar2 = this.a.get(num);
            int i4 = bVar2.t0;
            if (i4 != -1 && i4 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                int[] iArr2 = bVar2.u0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar2.v0;
                    if (str2 != null) {
                        int[] c3 = c(barrier2, str2);
                        bVar2.u0 = c3;
                        barrier2.setReferencedIds(c3);
                    }
                }
                barrier2.setType(bVar2.s0);
                ConstraintLayout.a a2 = constraintLayout.generateDefaultLayoutParams();
                barrier2.f();
                bVar2.c(a2);
                constraintLayout.addView(barrier2, a2);
            }
            if (bVar2.a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.a a3 = constraintLayout.generateDefaultLayoutParams();
                bVar2.c(a3);
                constraintLayout.addView(guideline, a3);
            }
        }
    }

    public void b(c cVar) {
        int childCount = cVar.getChildCount();
        this.a.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = cVar.getChildAt(i2);
            c.a aVar = (c.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!this.a.containsKey(Integer.valueOf(id))) {
                    this.a.put(Integer.valueOf(id), new C0010b());
                }
                C0010b bVar = this.a.get(Integer.valueOf(id));
                if (childAt instanceof a) {
                    bVar.g((a) childAt, id, aVar);
                }
                bVar.f(id, aVar);
                i2++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void e(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0010b d2 = d(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.a = true;
                    }
                    this.a.put(Integer.valueOf(d2.f608d), d2);
                }
            }
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }
}
