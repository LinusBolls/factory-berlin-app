package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.i0;
import androidx.recyclerview.widget.RecyclerView;

public class ActionMenuView extends i0 implements g.b, n {
    private m.a A;
    g.a B;
    private boolean C;
    private int D;
    private int E;
    private int F;
    e G;
    private g v;
    private Context w;
    private int x;
    private boolean y;
    private c z;

    public interface a {
        boolean a();

        boolean b();
    }

    private static class b implements m.a {
        b() {
        }

        public void a(g gVar, boolean z) {
        }

        public boolean b(g gVar) {
            return false;
        }
    }

    public static class c extends i0.a {
        @ViewDebug.ExportedProperty
        public boolean c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public int f313d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public int f314e;
        @ViewDebug.ExportedProperty

        /* renamed from: f  reason: collision with root package name */
        public boolean f315f;
        @ViewDebug.ExportedProperty

        /* renamed from: g  reason: collision with root package name */
        public boolean f316g;

        /* renamed from: h  reason: collision with root package name */
        boolean f317h;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.c = cVar.c;
        }

        public c(int i2, int i3) {
            super(i2, i3);
            this.c = false;
        }
    }

    private class d implements g.a {
        d() {
        }

        public boolean a(g gVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.G;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        public void b(g gVar) {
            g.a aVar = ActionMenuView.this.B;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    static int L(View view, int i2, int i3, int i4, int i5) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4) - i5, View.MeasureSpec.getMode(i4));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z2 = true;
        boolean z3 = actionMenuItemView != null && actionMenuItemView.f();
        int i6 = 2;
        if (i3 <= 0 || (z3 && i3 < 2)) {
            i6 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i3 * i2, RecyclerView.UNDEFINED_DURATION), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i7 = measuredWidth / i2;
            if (measuredWidth % i2 != 0) {
                i7++;
            }
            if (!z3 || i7 >= 2) {
                i6 = i7;
            }
        }
        if (cVar.c || !z3) {
            z2 = false;
        }
        cVar.f315f = z2;
        cVar.f313d = i6;
        view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i6, 1073741824), makeMeasureSpec);
        return i6;
    }

    private void M(int i2, int i3) {
        int i4;
        boolean z2;
        int i5;
        int i6;
        boolean z3;
        boolean z4;
        int i7;
        boolean z5;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingTop, -2);
        int i8 = size - paddingLeft;
        int i9 = this.E;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = i9 + (i11 / i10);
        int childCount = getChildCount();
        int i13 = 0;
        int i14 = 0;
        boolean z6 = false;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        long j2 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            int i18 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i19 = i15 + 1;
                if (z7) {
                    int i20 = this.F;
                    i7 = i19;
                    z5 = false;
                    childAt.setPadding(i20, 0, i20, 0);
                } else {
                    i7 = i19;
                    z5 = false;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f317h = z5;
                cVar.f314e = z5 ? 1 : 0;
                cVar.f313d = z5;
                cVar.f315f = z5;
                cVar.leftMargin = z5;
                cVar.rightMargin = z5;
                cVar.f316g = z7 && ((ActionMenuItemView) childAt).f();
                int L = L(childAt, i12, cVar.c ? 1 : i10, childMeasureSpec, paddingTop);
                i16 = Math.max(i16, L);
                if (cVar.f315f) {
                    i17++;
                }
                if (cVar.c) {
                    z6 = true;
                }
                i10 -= L;
                i13 = Math.max(i13, childAt.getMeasuredHeight());
                if (L == 1) {
                    j2 |= (long) (1 << i14);
                    i13 = i13;
                } else {
                    int i21 = i13;
                }
                i15 = i7;
            }
            i14++;
            size2 = i18;
        }
        int i22 = size2;
        boolean z8 = z6 && i15 == 2;
        boolean z9 = false;
        while (true) {
            if (i17 <= 0 || i10 <= 0) {
                i6 = mode;
                i4 = i8;
                z2 = z9;
                i5 = i13;
            } else {
                int i23 = 0;
                int i24 = 0;
                int i25 = Integer.MAX_VALUE;
                long j3 = 0;
                while (i24 < childCount) {
                    boolean z10 = z9;
                    c cVar2 = (c) getChildAt(i24).getLayoutParams();
                    int i26 = i13;
                    if (cVar2.f315f) {
                        int i27 = cVar2.f313d;
                        if (i27 < i25) {
                            j3 = 1 << i24;
                            i25 = i27;
                            i23 = 1;
                        } else if (i27 == i25) {
                            i23++;
                            j3 |= 1 << i24;
                        }
                    }
                    i24++;
                    i13 = i26;
                    z9 = z10;
                }
                z2 = z9;
                i5 = i13;
                j2 |= j3;
                if (i23 > i10) {
                    i6 = mode;
                    i4 = i8;
                    break;
                }
                int i28 = i25 + 1;
                int i29 = 0;
                while (i29 < childCount) {
                    View childAt2 = getChildAt(i29);
                    c cVar3 = (c) childAt2.getLayoutParams();
                    int i30 = i8;
                    int i31 = mode;
                    long j4 = (long) (1 << i29);
                    if ((j3 & j4) == 0) {
                        if (cVar3.f313d == i28) {
                            j2 |= j4;
                        }
                        z4 = z8;
                    } else {
                        if (!z8 || !cVar3.f316g || i10 != 1) {
                            z4 = z8;
                        } else {
                            int i32 = this.F;
                            z4 = z8;
                            childAt2.setPadding(i32 + i12, 0, i32, 0);
                        }
                        cVar3.f313d++;
                        cVar3.f317h = true;
                        i10--;
                    }
                    i29++;
                    mode = i31;
                    i8 = i30;
                    z8 = z4;
                }
                i13 = i5;
                z9 = true;
            }
        }
        boolean z11 = !z6 && i15 == 1;
        if (i10 <= 0 || j2 == 0 || (i10 >= i15 - 1 && !z11 && i16 <= 1)) {
            z3 = z2;
        } else {
            float bitCount = (float) Long.bitCount(j2);
            if (!z11) {
                if ((j2 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f316g) {
                    bitCount -= 0.5f;
                }
                int i33 = childCount - 1;
                if ((j2 & ((long) (1 << i33))) != 0 && !((c) getChildAt(i33).getLayoutParams()).f316g) {
                    bitCount -= 0.5f;
                }
            }
            int i34 = bitCount > 0.0f ? (int) (((float) (i10 * i12)) / bitCount) : 0;
            z3 = z2;
            for (int i35 = 0; i35 < childCount; i35++) {
                if ((j2 & ((long) (1 << i35))) != 0) {
                    View childAt3 = getChildAt(i35);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f314e = i34;
                        cVar4.f317h = true;
                        if (i35 == 0 && !cVar4.f316g) {
                            cVar4.leftMargin = (-i34) / 2;
                        }
                    } else if (cVar4.c) {
                        cVar4.f314e = i34;
                        cVar4.f317h = true;
                        cVar4.rightMargin = (-i34) / 2;
                    } else {
                        if (i35 != 0) {
                            cVar4.leftMargin = i34 / 2;
                        }
                        if (i35 != childCount - 1) {
                            cVar4.rightMargin = i34 / 2;
                        }
                    }
                    z3 = true;
                }
            }
        }
        if (z3) {
            for (int i36 = 0; i36 < childCount; i36++) {
                View childAt4 = getChildAt(i36);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f317h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f313d * i12) + cVar5.f314e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i4, i6 != 1073741824 ? i5 : i22);
    }

    public void B() {
        c cVar = this.z;
        if (cVar != null) {
            cVar.z();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public c m() {
        c cVar = new c(-2, -2);
        cVar.b = 16;
        return cVar;
    }

    /* renamed from: D */
    public c n(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public c o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return m();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (cVar.b <= 0) {
            cVar.b = 16;
        }
        return cVar;
    }

    public c F() {
        c C2 = m();
        C2.c = true;
        return C2;
    }

    /* access modifiers changed from: protected */
    public boolean G(int i2) {
        boolean z2 = false;
        if (i2 == 0) {
            return false;
        }
        View childAt = getChildAt(i2 - 1);
        View childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof a)) {
            z2 = false | ((a) childAt).a();
        }
        return (i2 <= 0 || !(childAt2 instanceof a)) ? z2 : z2 | ((a) childAt2).b();
    }

    public boolean H() {
        c cVar = this.z;
        return cVar != null && cVar.C();
    }

    public boolean I() {
        c cVar = this.z;
        return cVar != null && cVar.E();
    }

    public boolean J() {
        c cVar = this.z;
        return cVar != null && cVar.F();
    }

    public boolean K() {
        return this.y;
    }

    public g N() {
        return this.v;
    }

    public void O(m.a aVar, g.a aVar2) {
        this.A = aVar;
        this.B = aVar2;
    }

    public boolean P() {
        c cVar = this.z;
        return cVar != null && cVar.L();
    }

    public boolean a(i iVar) {
        return this.v.N(iVar, 0);
    }

    public void b(g gVar) {
        this.v = gVar;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.v == null) {
            Context context = getContext();
            g gVar = new g(context);
            this.v = gVar;
            gVar.V(new d());
            c cVar = new c(context);
            this.z = cVar;
            cVar.K(true);
            c cVar2 = this.z;
            m.a aVar = this.A;
            if (aVar == null) {
                aVar = new b();
            }
            cVar2.m(aVar);
            this.v.c(this.z, this.w);
            this.z.I(this);
        }
        return this.v;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.z.B();
    }

    public int getPopupTheme() {
        return this.x;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c cVar = this.z;
        if (cVar != null) {
            cVar.g(false);
            if (this.z.F()) {
                this.z.C();
                this.z.L();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        if (!this.C) {
            super.onLayout(z2, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i4 - i2;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean b2 = c1.b(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b2) {
                        i6 = getPaddingLeft() + cVar.leftMargin;
                        i7 = i6 + measuredWidth;
                    } else {
                        i7 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i6 = i7 - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(i6, i13, i7, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    boolean G2 = G(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        int max = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (b2) {
            int width = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.c) {
                    int i18 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width = i18 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.c) {
                int i21 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = i21 + measuredWidth4 + cVar3.rightMargin + max;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        g gVar;
        boolean z2 = this.C;
        boolean z3 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.C = z3;
        if (z2 != z3) {
            this.D = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (!(!this.C || (gVar = this.v) == null || size == this.D)) {
            this.D = size;
            gVar.M(true);
        }
        int childCount = getChildCount();
        if (!this.C || childCount <= 0) {
            for (int i4 = 0; i4 < childCount; i4++) {
                c cVar = (c) getChildAt(i4).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i2, i3);
            return;
        }
        M(i2, i3);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.z.H(z2);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.G = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.z.J(drawable);
    }

    public void setOverflowReserved(boolean z2) {
        this.y = z2;
    }

    public void setPopupTheme(int i2) {
        if (this.x != i2) {
            this.x = i2;
            if (i2 == 0) {
                this.w = getContext();
            } else {
                this.w = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(c cVar) {
        this.z = cVar;
        cVar.I(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.E = (int) (56.0f * f2);
        this.F = (int) (f2 * 4.0f);
        this.w = context;
        this.x = 0;
    }
}
