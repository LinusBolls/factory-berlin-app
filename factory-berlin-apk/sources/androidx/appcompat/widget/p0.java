package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.i0;

/* compiled from: ScrollingTabContainerView */
public class p0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: g  reason: collision with root package name */
    Runnable f483g;

    /* renamed from: h  reason: collision with root package name */
    private c f484h;

    /* renamed from: i  reason: collision with root package name */
    i0 f485i;

    /* renamed from: j  reason: collision with root package name */
    private Spinner f486j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f487k;

    /* renamed from: l  reason: collision with root package name */
    int f488l;

    /* renamed from: m  reason: collision with root package name */
    int f489m;

    /* renamed from: n  reason: collision with root package name */
    private int f490n;
    private int o;

    /* compiled from: ScrollingTabContainerView */
    class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ View f491g;

        a(View view) {
            this.f491g = view;
        }

        public void run() {
            p0.this.smoothScrollTo(this.f491g.getLeft() - ((p0.this.getWidth() - this.f491g.getWidth()) / 2), 0);
            p0.this.f483g = null;
        }
    }

    /* compiled from: ScrollingTabContainerView */
    private class b extends BaseAdapter {
        b() {
        }

        public int getCount() {
            return p0.this.f485i.getChildCount();
        }

        public Object getItem(int i2) {
            return ((d) p0.this.f485i.getChildAt(i2)).b();
        }

        public long getItemId(int i2) {
            return (long) i2;
        }

        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                return p0.this.c((a.c) getItem(i2), true);
            }
            ((d) view).a((a.c) getItem(i2));
            return view;
        }
    }

    /* compiled from: ScrollingTabContainerView */
    private class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = p0.this.f485i.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = p0.this.f485i.getChildAt(i2);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* compiled from: ScrollingTabContainerView */
    private class d extends LinearLayout {

        /* renamed from: g  reason: collision with root package name */
        private final int[] f495g;

        /* renamed from: h  reason: collision with root package name */
        private a.c f496h;

        /* renamed from: i  reason: collision with root package name */
        private TextView f497i;

        /* renamed from: j  reason: collision with root package name */
        private ImageView f498j;

        /* renamed from: k  reason: collision with root package name */
        private View f499k;

        public d(Context context, a.c cVar, boolean z) {
            super(context, (AttributeSet) null, e.a.a.actionBarTabStyle);
            int[] iArr = {16842964};
            this.f495g = iArr;
            this.f496h = cVar;
            w0 u = w0.u(context, (AttributeSet) null, iArr, e.a.a.actionBarTabStyle, 0);
            if (u.r(0)) {
                setBackgroundDrawable(u.g(0));
            }
            u.v();
            if (z) {
                setGravity(8388627);
            }
            c();
        }

        public void a(a.c cVar) {
            this.f496h = cVar;
            c();
        }

        public a.c b() {
            return this.f496h;
        }

        public void c() {
            a.c cVar = this.f496h;
            View b = cVar.b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f499k = b;
                TextView textView = this.f497i;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f498j;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f498j.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f499k;
            if (view != null) {
                removeView(view);
                this.f499k = null;
            }
            Drawable c = cVar.c();
            CharSequence d2 = cVar.d();
            if (c != null) {
                if (this.f498j == null) {
                    o oVar = new o(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    oVar.setLayoutParams(layoutParams);
                    addView(oVar, 0);
                    this.f498j = oVar;
                }
                this.f498j.setImageDrawable(c);
                this.f498j.setVisibility(0);
            } else {
                ImageView imageView2 = this.f498j;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f498j.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(d2);
            if (z) {
                if (this.f497i == null) {
                    z zVar = new z(getContext(), (AttributeSet) null, e.a.a.actionBarTabTextStyle);
                    zVar.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    zVar.setLayoutParams(layoutParams2);
                    addView(zVar);
                    this.f497i = zVar;
                }
                this.f497i.setText(d2);
                this.f497i.setVisibility(0);
            } else {
                TextView textView2 = this.f497i;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f497i.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f498j;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            if (!z) {
                charSequence = cVar.a();
            }
            y0.a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i2, int i3) {
            int i4;
            super.onMeasure(i2, i3);
            if (p0.this.f488l > 0 && getMeasuredWidth() > (i4 = p0.this.f488l)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    private Spinner b() {
        w wVar = new w(getContext(), (AttributeSet) null, e.a.a.actionDropDownStyle);
        wVar.setLayoutParams(new i0.a(-2, -1));
        wVar.setOnItemSelectedListener(this);
        return wVar;
    }

    private boolean d() {
        Spinner spinner = this.f486j;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (!d()) {
            if (this.f486j == null) {
                this.f486j = b();
            }
            removeView(this.f485i);
            addView(this.f486j, new ViewGroup.LayoutParams(-2, -1));
            if (this.f486j.getAdapter() == null) {
                this.f486j.setAdapter(new b());
            }
            Runnable runnable = this.f483g;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f483g = null;
            }
            this.f486j.setSelection(this.o);
        }
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f486j);
        addView(this.f485i, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f486j.getSelectedItemPosition());
        return false;
    }

    public void a(int i2) {
        View childAt = this.f485i.getChildAt(i2);
        Runnable runnable = this.f483g;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f483g = aVar;
        post(aVar);
    }

    /* access modifiers changed from: package-private */
    public d c(a.c cVar, boolean z) {
        d dVar = new d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable((Drawable) null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f490n));
        } else {
            dVar.setFocusable(true);
            if (this.f484h == null) {
                this.f484h = new c();
            }
            dVar.setOnClickListener(this.f484h);
        }
        return dVar;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f483g;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e.a.n.a b2 = e.a.n.a.b(getContext());
        setContentHeight(b2.f());
        this.f489m = b2.e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f483g;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        ((d) view).b().e();
    }

    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f485i.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f488l = -1;
        } else {
            if (childCount > 2) {
                this.f488l = (int) (((float) View.MeasureSpec.getSize(i2)) * 0.4f);
            } else {
                this.f488l = View.MeasureSpec.getSize(i2) / 2;
            }
            this.f488l = Math.min(this.f488l, this.f489m);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f490n, 1073741824);
        if (z2 || !this.f487k) {
            z = false;
        }
        if (z) {
            this.f485i.measure(0, makeMeasureSpec);
            if (this.f485i.getMeasuredWidth() > View.MeasureSpec.getSize(i2)) {
                e();
            } else {
                f();
            }
        } else {
            f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i2, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z2 && measuredWidth != measuredWidth2) {
            setTabSelected(this.o);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f487k = z;
    }

    public void setContentHeight(int i2) {
        this.f490n = i2;
        requestLayout();
    }

    public void setTabSelected(int i2) {
        this.o = i2;
        int childCount = this.f485i.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.f485i.getChildAt(i3);
            boolean z = i3 == i2;
            childAt.setSelected(z);
            if (z) {
                a(i2);
            }
            i3++;
        }
        Spinner spinner = this.f486j;
        if (spinner != null && i2 >= 0) {
            spinner.setSelection(i2);
        }
    }
}
