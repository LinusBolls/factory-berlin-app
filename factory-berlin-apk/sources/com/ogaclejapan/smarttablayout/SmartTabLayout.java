package com.ogaclejapan.smarttablayout;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import e.h.k.u;

public class SmartTabLayout extends HorizontalScrollView {

    /* renamed from: g  reason: collision with root package name */
    protected final c f4766g;

    /* renamed from: h  reason: collision with root package name */
    private int f4767h;

    /* renamed from: i  reason: collision with root package name */
    private int f4768i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f4769j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f4770k;

    /* renamed from: l  reason: collision with root package name */
    private float f4771l;

    /* renamed from: m  reason: collision with root package name */
    private int f4772m;

    /* renamed from: n  reason: collision with root package name */
    private int f4773n;
    /* access modifiers changed from: private */
    public ViewPager o;
    /* access modifiers changed from: private */
    public ViewPager.j p;
    private d q;
    private h r;
    private b s;
    /* access modifiers changed from: private */
    public e t;
    private boolean u;

    private class b implements View.OnClickListener {
        private b() {
        }

        public void onClick(View view) {
            for (int i2 = 0; i2 < SmartTabLayout.this.f4766g.getChildCount(); i2++) {
                if (view == SmartTabLayout.this.f4766g.getChildAt(i2)) {
                    if (SmartTabLayout.this.t != null) {
                        SmartTabLayout.this.t.a(i2);
                    }
                    SmartTabLayout.this.o.setCurrentItem(i2);
                    return;
                }
            }
        }
    }

    private class c implements ViewPager.j {
        private int a;

        private c() {
        }

        public void a(int i2, float f2, int i3) {
            int childCount = SmartTabLayout.this.f4766g.getChildCount();
            if (childCount != 0 && i2 >= 0 && i2 < childCount) {
                SmartTabLayout.this.f4766g.i(i2, f2);
                SmartTabLayout.this.g(i2, f2);
                if (SmartTabLayout.this.p != null) {
                    SmartTabLayout.this.p.a(i2, f2, i3);
                }
            }
        }

        public void b(int i2) {
            this.a = i2;
            if (SmartTabLayout.this.p != null) {
                SmartTabLayout.this.p.b(i2);
            }
        }

        public void c(int i2) {
            if (this.a == 0) {
                SmartTabLayout.this.f4766g.i(i2, 0.0f);
                SmartTabLayout.this.g(i2, 0.0f);
            }
            int childCount = SmartTabLayout.this.f4766g.getChildCount();
            int i3 = 0;
            while (i3 < childCount) {
                SmartTabLayout.this.f4766g.getChildAt(i3).setSelected(i2 == i3);
                i3++;
            }
            if (SmartTabLayout.this.p != null) {
                SmartTabLayout.this.p.c(i2);
            }
        }
    }

    public interface d {
        void a(int i2, int i3);
    }

    public interface e {
        void a(int i2);
    }

    private static class f implements h {
        private final LayoutInflater a;
        private final int b;
        private final int c;

        /* JADX WARNING: type inference failed for: r0v4, types: [android.view.View] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View a(android.view.ViewGroup r6, int r7, androidx.viewpager.widget.a r8) {
            /*
                r5 = this;
                int r0 = r5.b
                r1 = -1
                r2 = 0
                if (r0 == r1) goto L_0x000e
                android.view.LayoutInflater r3 = r5.a
                r4 = 0
                android.view.View r6 = r3.inflate(r0, r6, r4)
                goto L_0x000f
            L_0x000e:
                r6 = r2
            L_0x000f:
                int r0 = r5.c
                if (r0 == r1) goto L_0x001c
                if (r6 == 0) goto L_0x001c
                android.view.View r0 = r6.findViewById(r0)
                r2 = r0
                android.widget.TextView r2 = (android.widget.TextView) r2
            L_0x001c:
                if (r2 != 0) goto L_0x0029
                java.lang.Class<android.widget.TextView> r0 = android.widget.TextView.class
                boolean r0 = r0.isInstance(r6)
                if (r0 == 0) goto L_0x0029
                r2 = r6
                android.widget.TextView r2 = (android.widget.TextView) r2
            L_0x0029:
                if (r2 == 0) goto L_0x0032
                java.lang.CharSequence r7 = r8.e(r7)
                r2.setText(r7)
            L_0x0032:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ogaclejapan.smarttablayout.SmartTabLayout.f.a(android.view.ViewGroup, int, androidx.viewpager.widget.a):android.view.View");
        }

        private f(Context context, int i2, int i3) {
            this.a = LayoutInflater.from(context);
            this.b = i2;
            this.c = i3;
        }
    }

    public interface g {
        int a(int i2);

        int b(int i2);
    }

    public interface h {
        View a(ViewGroup viewGroup, int i2, androidx.viewpager.widget.a aVar);
    }

    public SmartTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void f() {
        View view;
        androidx.viewpager.widget.a adapter = this.o.getAdapter();
        int i2 = 0;
        while (i2 < adapter.c()) {
            h hVar = this.r;
            if (hVar == null) {
                view = e(adapter.e(i2));
            } else {
                view = hVar.a(this.f4766g, i2, adapter);
            }
            if (view != null) {
                if (this.u) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                }
                b bVar = this.s;
                if (bVar != null) {
                    view.setOnClickListener(bVar);
                }
                this.f4766g.addView(view);
                if (i2 == this.o.getCurrentItem()) {
                    view.setSelected(true);
                }
                i2++;
            } else {
                throw new IllegalStateException("tabView is null.");
            }
        }
    }

    /* access modifiers changed from: private */
    public void g(int i2, float f2) {
        int i3;
        int i4;
        int i5;
        int childCount = this.f4766g.getChildCount();
        if (childCount != 0 && i2 >= 0 && i2 < childCount) {
            boolean n2 = d.n(this);
            View childAt = this.f4766g.getChildAt(i2);
            int l2 = (int) (((float) (d.l(childAt) + d.d(childAt))) * f2);
            if (this.f4766g.h()) {
                if (0.0f < f2 && f2 < 1.0f) {
                    View childAt2 = this.f4766g.getChildAt(i2 + 1);
                    l2 = Math.round(f2 * ((float) ((d.l(childAt) / 2) + d.c(childAt) + (d.l(childAt2) / 2) + d.e(childAt2))));
                }
                View childAt3 = this.f4766g.getChildAt(0);
                if (n2) {
                    int l3 = d.l(childAt3) + d.c(childAt3);
                    int l4 = d.l(childAt) + d.c(childAt);
                    i5 = (d.a(childAt) - d.c(childAt)) - l2;
                    i4 = (l3 - l4) / 2;
                } else {
                    int l5 = d.l(childAt3) + d.e(childAt3);
                    int l6 = d.l(childAt) + d.e(childAt);
                    i5 = (d.j(childAt) - d.e(childAt)) + l2;
                    i4 = (l5 - l6) / 2;
                }
                scrollTo(i5 - i4, 0);
                return;
            }
            if (this.f4767h == -1) {
                if (0.0f < f2 && f2 < 1.0f) {
                    View childAt4 = this.f4766g.getChildAt(i2 + 1);
                    l2 = Math.round(f2 * ((float) ((d.l(childAt) / 2) + d.c(childAt) + (d.l(childAt4) / 2) + d.e(childAt4))));
                }
                i3 = n2 ? (((-d.m(childAt)) / 2) + (getWidth() / 2)) - d.i(this) : ((d.m(childAt) / 2) - (getWidth() / 2)) + d.i(this);
            } else {
                if (n2) {
                    if (i2 > 0 || f2 > 0.0f) {
                        i3 = this.f4767h;
                    }
                } else if (i2 > 0 || f2 > 0.0f) {
                    i3 = -this.f4767h;
                }
                i3 = 0;
            }
            int j2 = d.j(childAt);
            int e2 = d.e(childAt);
            scrollTo(i3 + (n2 ? (((j2 + e2) - l2) - getWidth()) + d.h(this) : (j2 - e2) + l2), 0);
        }
    }

    /* access modifiers changed from: protected */
    public TextView e(CharSequence charSequence) {
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setText(charSequence);
        textView.setTextColor(this.f4770k);
        textView.setTextSize(0, this.f4771l);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        int i2 = this.f4768i;
        if (i2 != -1) {
            textView.setBackgroundResource(i2);
        } else if (Build.VERSION.SDK_INT >= 11) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(16843534, typedValue, true);
            textView.setBackgroundResource(typedValue.resourceId);
        }
        if (Build.VERSION.SDK_INT >= 14) {
            textView.setAllCaps(this.f4769j);
        }
        int i3 = this.f4772m;
        textView.setPadding(i3, 0, i3, 0);
        int i4 = this.f4773n;
        if (i4 > 0) {
            textView.setMinWidth(i4);
        }
        return textView;
    }

    public void h(int i2, int i3) {
        this.r = new f(getContext(), i2, i3);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        ViewPager viewPager;
        super.onLayout(z, i2, i3, i4, i5);
        if (z && (viewPager = this.o) != null) {
            g(viewPager.getCurrentItem(), 0.0f);
        }
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        d dVar = this.q;
        if (dVar != null) {
            dVar.a(i2, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (this.f4766g.h() && this.f4766g.getChildCount() > 0) {
            View childAt = this.f4766g.getChildAt(0);
            c cVar = this.f4766g;
            View childAt2 = cVar.getChildAt(cVar.getChildCount() - 1);
            int f2 = ((i2 - d.f(childAt)) / 2) - d.e(childAt);
            int f3 = ((i2 - d.f(childAt2)) / 2) - d.c(childAt2);
            c cVar2 = this.f4766g;
            cVar2.setMinimumWidth(cVar2.getMeasuredWidth());
            u.r0(this, f2, getPaddingTop(), f3, getPaddingBottom());
            setClipToPadding(false);
        }
    }

    public void setCustomTabColorizer(g gVar) {
        this.f4766g.k(gVar);
    }

    public void setCustomTabView(h hVar) {
        this.r = hVar;
    }

    public void setDefaultTabTextColor(int i2) {
        this.f4770k = ColorStateList.valueOf(i2);
    }

    public void setDistributeEvenly(boolean z) {
        this.u = z;
    }

    public void setDividerColors(int... iArr) {
        this.f4766g.l(iArr);
    }

    public void setIndicationInterpolator(b bVar) {
        this.f4766g.m(bVar);
    }

    public void setOnPageChangeListener(ViewPager.j jVar) {
        this.p = jVar;
    }

    public void setOnScrollChangeListener(d dVar) {
        this.q = dVar;
    }

    public void setOnTabClickListener(e eVar) {
        this.t = eVar;
    }

    public void setSelectedIndicatorColors(int... iArr) {
        this.f4766g.n(iArr);
    }

    public void setViewPager(ViewPager viewPager) {
        this.f4766g.removeAllViews();
        this.o = viewPager;
        if (viewPager != null && viewPager.getAdapter() != null) {
            viewPager.b(new c());
            f();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SmartTabLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        setHorizontalScrollBarEnabled(false);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float f2 = displayMetrics.density;
        float applyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, a.stl_SmartTabLayout, i2, 0);
        int resourceId = obtainStyledAttributes.getResourceId(a.stl_SmartTabLayout_stl_defaultTabBackground, -1);
        boolean z = obtainStyledAttributes.getBoolean(a.stl_SmartTabLayout_stl_defaultTabTextAllCaps, true);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(a.stl_SmartTabLayout_stl_defaultTabTextColor);
        float dimension = obtainStyledAttributes.getDimension(a.stl_SmartTabLayout_stl_defaultTabTextSize, applyDimension);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(a.stl_SmartTabLayout_stl_defaultTabTextHorizontalPadding, (int) (16.0f * f2));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(a.stl_SmartTabLayout_stl_defaultTabTextMinWidth, (int) (0.0f * f2));
        int resourceId2 = obtainStyledAttributes.getResourceId(a.stl_SmartTabLayout_stl_customTabTextLayoutId, -1);
        int resourceId3 = obtainStyledAttributes.getResourceId(a.stl_SmartTabLayout_stl_customTabTextViewId, -1);
        boolean z2 = obtainStyledAttributes.getBoolean(a.stl_SmartTabLayout_stl_distributeEvenly, false);
        boolean z3 = obtainStyledAttributes.getBoolean(a.stl_SmartTabLayout_stl_clickable, true);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(a.stl_SmartTabLayout_stl_titleOffset, (int) (f2 * 24.0f));
        obtainStyledAttributes.recycle();
        this.f4767h = layoutDimension;
        this.f4768i = resourceId;
        this.f4769j = z;
        this.f4770k = colorStateList == null ? ColorStateList.valueOf(-67108864) : colorStateList;
        this.f4771l = dimension;
        this.f4772m = dimensionPixelSize;
        this.f4773n = dimensionPixelSize2;
        this.s = z3 ? new b() : null;
        this.u = z2;
        if (resourceId2 != -1) {
            h(resourceId2, resourceId3);
        }
        c cVar = new c(context2, attributeSet2);
        this.f4766g = cVar;
        if (!z2 || !cVar.h()) {
            setFillViewport(!this.f4766g.h());
            addView(this.f4766g, -1, -1);
            return;
        }
        throw new UnsupportedOperationException("'distributeEvenly' and 'indicatorAlwaysInCenter' both use does not support");
    }

    public void setDefaultTabTextColor(ColorStateList colorStateList) {
        this.f4770k = colorStateList;
    }
}
