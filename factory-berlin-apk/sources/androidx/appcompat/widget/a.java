package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import e.a.j;
import e.h.k.u;
import e.h.k.y;
import e.h.k.z;

/* compiled from: AbsActionBarView */
abstract class a extends ViewGroup {

    /* renamed from: g  reason: collision with root package name */
    protected final C0006a f371g;

    /* renamed from: h  reason: collision with root package name */
    protected final Context f372h;

    /* renamed from: i  reason: collision with root package name */
    protected ActionMenuView f373i;

    /* renamed from: j  reason: collision with root package name */
    protected c f374j;

    /* renamed from: k  reason: collision with root package name */
    protected int f375k;

    /* renamed from: l  reason: collision with root package name */
    protected y f376l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f377m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f378n;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    /* compiled from: AbsActionBarView */
    protected class C0006a implements z {
        private boolean a = false;
        int b;

        protected C0006a() {
        }

        public void a(View view) {
            this.a = true;
        }

        public void b(View view) {
            if (!this.a) {
                a aVar = a.this;
                aVar.f376l = null;
                a.super.setVisibility(this.b);
            }
        }

        public void c(View view) {
            a.super.setVisibility(0);
            this.a = false;
        }

        public C0006a d(y yVar, int i2) {
            a.this.f376l = yVar;
            this.b = i2;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected static int d(int i2, int i3, boolean z) {
        return z ? i2 - i3 : i2 + i3;
    }

    /* access modifiers changed from: protected */
    public int c(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, RecyclerView.UNDEFINED_DURATION), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    /* access modifiers changed from: protected */
    public int e(View view, int i2, int i3, int i4, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i3 + ((i4 - measuredHeight) / 2);
        if (z) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public y f(int i2, long j2) {
        y yVar = this.f376l;
        if (yVar != null) {
            yVar.b();
        }
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            y c = u.c(this);
            c.a(1.0f);
            c.d(j2);
            C0006a aVar = this.f371g;
            aVar.d(c, i2);
            c.f(aVar);
            return c;
        }
        y c2 = u.c(this);
        c2.a(0.0f);
        c2.d(j2);
        C0006a aVar2 = this.f371g;
        aVar2.d(c2, i2);
        c2.f(aVar2);
        return c2;
    }

    public int getAnimatedVisibility() {
        if (this.f376l != null) {
            return this.f371g.b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f375k;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, j.ActionBar, e.a.a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f374j;
        if (cVar != null) {
            cVar.G(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f378n = false;
        }
        if (!this.f378n) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f378n = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f378n = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f377m = false;
        }
        if (!this.f377m) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f377m = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f377m = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i2);

    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            y yVar = this.f376l;
            if (yVar != null) {
                yVar.b();
            }
            super.setVisibility(i2);
        }
    }

    a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f371g = new C0006a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(e.a.a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f372h = context;
        } else {
            this.f372h = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
