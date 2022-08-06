package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.p;
import androidx.core.widget.h;
import e.a.j;
import e.h.k.u;
import java.lang.reflect.Method;

/* compiled from: ListPopupWindow */
public class j0 implements p {
    private static Method L;
    private static Method M;
    private static Method N;
    private AdapterView.OnItemClickListener A;
    private AdapterView.OnItemSelectedListener B;
    final f C;
    private final e D;
    private final d E;
    private final b F;
    final Handler G;
    private final Rect H;
    private Rect I;
    private boolean J;
    PopupWindow K;

    /* renamed from: g  reason: collision with root package name */
    private Context f448g;

    /* renamed from: h  reason: collision with root package name */
    private ListAdapter f449h;

    /* renamed from: i  reason: collision with root package name */
    f0 f450i;

    /* renamed from: j  reason: collision with root package name */
    private int f451j;

    /* renamed from: k  reason: collision with root package name */
    private int f452k;

    /* renamed from: l  reason: collision with root package name */
    private int f453l;

    /* renamed from: m  reason: collision with root package name */
    private int f454m;

    /* renamed from: n  reason: collision with root package name */
    private int f455n;
    private boolean o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean s;
    private boolean t;
    int u;
    private View v;
    private int w;
    private DataSetObserver x;
    private View y;
    private Drawable z;

    /* compiled from: ListPopupWindow */
    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            f0 f0Var;
            if (i2 != -1 && (f0Var = j0.this.f450i) != null) {
                f0Var.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* compiled from: ListPopupWindow */
    private class b implements Runnable {
        b() {
        }

        public void run() {
            j0.this.r();
        }
    }

    /* compiled from: ListPopupWindow */
    private class c extends DataSetObserver {
        c() {
        }

        public void onChanged() {
            if (j0.this.c()) {
                j0.this.e();
            }
        }

        public void onInvalidated() {
            j0.this.dismiss();
        }
    }

    /* compiled from: ListPopupWindow */
    private class d implements AbsListView.OnScrollListener {
        d() {
        }

        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i2) {
            if (i2 == 1 && !j0.this.w() && j0.this.K.getContentView() != null) {
                j0 j0Var = j0.this;
                j0Var.G.removeCallbacks(j0Var.C);
                j0.this.C.run();
            }
        }
    }

    /* compiled from: ListPopupWindow */
    private class e implements View.OnTouchListener {
        e() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = j0.this.K) != null && popupWindow.isShowing() && x >= 0 && x < j0.this.K.getWidth() && y >= 0 && y < j0.this.K.getHeight()) {
                j0 j0Var = j0.this;
                j0Var.G.postDelayed(j0Var.C, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                j0 j0Var2 = j0.this;
                j0Var2.G.removeCallbacks(j0Var2.C);
                return false;
            }
        }
    }

    /* compiled from: ListPopupWindow */
    private class f implements Runnable {
        f() {
        }

        public void run() {
            f0 f0Var = j0.this.f450i;
            if (f0Var != null && u.K(f0Var) && j0.this.f450i.getCount() > j0.this.f450i.getChildCount()) {
                int childCount = j0.this.f450i.getChildCount();
                j0 j0Var = j0.this;
                if (childCount <= j0Var.u) {
                    j0Var.K.setInputMethodMode(2);
                    j0.this.e();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                L = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                N = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                M = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public j0(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    private void J(boolean z2) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = L;
            if (method != null) {
                try {
                    method.invoke(this.K, new Object[]{Boolean.valueOf(z2)});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.K.setIsClippedToScreen(z2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: androidx.appcompat.widget.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: androidx.appcompat.widget.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: androidx.appcompat.widget.f0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int q() {
        /*
            r12 = this;
            androidx.appcompat.widget.f0 r0 = r12.f450i
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00b8
            android.content.Context r0 = r12.f448g
            boolean r5 = r12.J
            r5 = r5 ^ r3
            androidx.appcompat.widget.f0 r5 = r12.s(r0, r5)
            r12.f450i = r5
            android.graphics.drawable.Drawable r6 = r12.z
            if (r6 == 0) goto L_0x001b
            r5.setSelector(r6)
        L_0x001b:
            androidx.appcompat.widget.f0 r5 = r12.f450i
            android.widget.ListAdapter r6 = r12.f449h
            r5.setAdapter(r6)
            androidx.appcompat.widget.f0 r5 = r12.f450i
            android.widget.AdapterView$OnItemClickListener r6 = r12.A
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.f0 r5 = r12.f450i
            r5.setFocusable(r3)
            androidx.appcompat.widget.f0 r5 = r12.f450i
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.f0 r5 = r12.f450i
            androidx.appcompat.widget.j0$a r6 = new androidx.appcompat.widget.j0$a
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.f0 r5 = r12.f450i
            androidx.appcompat.widget.j0$d r6 = r12.E
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.B
            if (r5 == 0) goto L_0x004d
            androidx.appcompat.widget.f0 r6 = r12.f450i
            r6.setOnItemSelectedListener(r5)
        L_0x004d:
            androidx.appcompat.widget.f0 r5 = r12.f450i
            android.view.View r6 = r12.v
            if (r6 == 0) goto L_0x00b1
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.w
            if (r8 == 0) goto L_0x0088
            if (r8 == r3) goto L_0x0081
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.w
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x008e
        L_0x0081:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x008e
        L_0x0088:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x008e:
            int r0 = r12.f452k
            if (r0 < 0) goto L_0x0095
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0097
        L_0x0095:
            r0 = 0
            r5 = 0
        L_0x0097:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00b2
        L_0x00b1:
            r0 = 0
        L_0x00b2:
            android.widget.PopupWindow r6 = r12.K
            r6.setContentView(r5)
            goto L_0x00d6
        L_0x00b8:
            android.widget.PopupWindow r0 = r12.K
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.v
            if (r0 == 0) goto L_0x00d5
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00d6
        L_0x00d5:
            r0 = 0
        L_0x00d6:
            android.widget.PopupWindow r5 = r12.K
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00f2
            android.graphics.Rect r6 = r12.H
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.H
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.o
            if (r7 != 0) goto L_0x00f8
            int r6 = -r6
            r12.f454m = r6
            goto L_0x00f8
        L_0x00f2:
            android.graphics.Rect r5 = r12.H
            r5.setEmpty()
            r5 = 0
        L_0x00f8:
            android.widget.PopupWindow r6 = r12.K
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0102
            goto L_0x0103
        L_0x0102:
            r3 = 0
        L_0x0103:
            android.view.View r4 = r12.t()
            int r6 = r12.f454m
            int r3 = r12.u(r4, r6, r3)
            boolean r4 = r12.s
            if (r4 != 0) goto L_0x0174
            int r4 = r12.f451j
            if (r4 != r2) goto L_0x0116
            goto L_0x0174
        L_0x0116:
            int r4 = r12.f452k
            r6 = -2
            if (r4 == r6) goto L_0x013d
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x0124
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            goto L_0x0155
        L_0x0124:
            android.content.Context r2 = r12.f448g
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.H
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x0155
        L_0x013d:
            android.content.Context r2 = r12.f448g
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.H
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L_0x0155:
            r7 = r1
            androidx.appcompat.widget.f0 r6 = r12.f450i
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.d(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0172
            androidx.appcompat.widget.f0 r2 = r12.f450i
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.f0 r3 = r12.f450i
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0172:
            int r1 = r1 + r0
            return r1
        L_0x0174:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j0.q():int");
    }

    private int u(View view, int i2, boolean z2) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.K.getMaxAvailableHeight(view, i2, z2);
        }
        Method method = M;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.K, new Object[]{view, Integer.valueOf(i2), Boolean.valueOf(z2)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.K.getMaxAvailableHeight(view, i2);
    }

    private void y() {
        View view = this.v;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.v);
            }
        }
    }

    public void A(int i2) {
        this.K.setAnimationStyle(i2);
    }

    public void B(int i2) {
        Drawable background = this.K.getBackground();
        if (background != null) {
            background.getPadding(this.H);
            Rect rect = this.H;
            this.f452k = rect.left + rect.right + i2;
            return;
        }
        M(i2);
    }

    public void C(int i2) {
        this.r = i2;
    }

    public void D(Rect rect) {
        this.I = rect != null ? new Rect(rect) : null;
    }

    public void E(int i2) {
        this.K.setInputMethodMode(i2);
    }

    public void F(boolean z2) {
        this.J = z2;
        this.K.setFocusable(z2);
    }

    public void G(PopupWindow.OnDismissListener onDismissListener) {
        this.K.setOnDismissListener(onDismissListener);
    }

    public void H(AdapterView.OnItemClickListener onItemClickListener) {
        this.A = onItemClickListener;
    }

    public void I(boolean z2) {
        this.q = true;
        this.p = z2;
    }

    public void K(int i2) {
        this.w = i2;
    }

    public void L(int i2) {
        f0 f0Var = this.f450i;
        if (c() && f0Var != null) {
            f0Var.setListSelectionHidden(false);
            f0Var.setSelection(i2);
            if (f0Var.getChoiceMode() != 0) {
                f0Var.setItemChecked(i2, true);
            }
        }
    }

    public void M(int i2) {
        this.f452k = i2;
    }

    public void b(Drawable drawable) {
        this.K.setBackgroundDrawable(drawable);
    }

    public boolean c() {
        return this.K.isShowing();
    }

    public int d() {
        return this.f453l;
    }

    public void dismiss() {
        this.K.dismiss();
        y();
        this.K.setContentView((View) null);
        this.f450i = null;
        this.G.removeCallbacks(this.C);
    }

    public void e() {
        int q2 = q();
        boolean w2 = w();
        h.b(this.K, this.f455n);
        boolean z2 = true;
        if (!this.K.isShowing()) {
            int i2 = this.f452k;
            if (i2 == -1) {
                i2 = -1;
            } else if (i2 == -2) {
                i2 = t().getWidth();
            }
            int i3 = this.f451j;
            if (i3 == -1) {
                q2 = -1;
            } else if (i3 != -2) {
                q2 = i3;
            }
            this.K.setWidth(i2);
            this.K.setHeight(q2);
            J(true);
            this.K.setOutsideTouchable(!this.t && !this.s);
            this.K.setTouchInterceptor(this.D);
            if (this.q) {
                h.a(this.K, this.p);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = N;
                if (method != null) {
                    try {
                        method.invoke(this.K, new Object[]{this.I});
                    } catch (Exception e2) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                    }
                }
            } else {
                this.K.setEpicenterBounds(this.I);
            }
            h.c(this.K, t(), this.f453l, this.f454m, this.r);
            this.f450i.setSelection(-1);
            if (!this.J || this.f450i.isInTouchMode()) {
                r();
            }
            if (!this.J) {
                this.G.post(this.F);
            }
        } else if (u.K(t())) {
            int i4 = this.f452k;
            if (i4 == -1) {
                i4 = -1;
            } else if (i4 == -2) {
                i4 = t().getWidth();
            }
            int i5 = this.f451j;
            if (i5 == -1) {
                if (!w2) {
                    q2 = -1;
                }
                if (w2) {
                    this.K.setWidth(this.f452k == -1 ? -1 : 0);
                    this.K.setHeight(0);
                } else {
                    this.K.setWidth(this.f452k == -1 ? -1 : 0);
                    this.K.setHeight(-1);
                }
            } else if (i5 != -2) {
                q2 = i5;
            }
            PopupWindow popupWindow = this.K;
            if (this.t || this.s) {
                z2 = false;
            }
            popupWindow.setOutsideTouchable(z2);
            this.K.update(t(), this.f453l, this.f454m, i4 < 0 ? -1 : i4, q2 < 0 ? -1 : q2);
        }
    }

    public Drawable g() {
        return this.K.getBackground();
    }

    public ListView h() {
        return this.f450i;
    }

    public void j(int i2) {
        this.f454m = i2;
        this.o = true;
    }

    public void l(int i2) {
        this.f453l = i2;
    }

    public int n() {
        if (!this.o) {
            return 0;
        }
        return this.f454m;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.x;
        if (dataSetObserver == null) {
            this.x = new c();
        } else {
            ListAdapter listAdapter2 = this.f449h;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f449h = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.x);
        }
        f0 f0Var = this.f450i;
        if (f0Var != null) {
            f0Var.setAdapter(this.f449h);
        }
    }

    public void r() {
        f0 f0Var = this.f450i;
        if (f0Var != null) {
            f0Var.setListSelectionHidden(true);
            f0Var.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public f0 s(Context context, boolean z2) {
        return new f0(context, z2);
    }

    public View t() {
        return this.y;
    }

    public int v() {
        return this.f452k;
    }

    public boolean w() {
        return this.K.getInputMethodMode() == 2;
    }

    public boolean x() {
        return this.J;
    }

    public void z(View view) {
        this.y = view;
    }

    public j0(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f451j = -2;
        this.f452k = -2;
        this.f455n = 1002;
        this.r = 0;
        this.s = false;
        this.t = false;
        this.u = Integer.MAX_VALUE;
        this.w = 0;
        this.C = new f();
        this.D = new e();
        this.E = new d();
        this.F = new b();
        this.H = new Rect();
        this.f448g = context;
        this.G = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ListPopupWindow, i2, i3);
        this.f453l = obtainStyledAttributes.getDimensionPixelOffset(j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f454m = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.o = true;
        }
        obtainStyledAttributes.recycle();
        q qVar = new q(context, attributeSet, i2, i3);
        this.K = qVar;
        qVar.setInputMethodMode(1);
    }
}
