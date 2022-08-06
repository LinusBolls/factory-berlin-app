package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.y0;
import androidx.appcompat.widget.z;
import e.a.j;

public class ActionMenuItemView extends z implements n.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: k  reason: collision with root package name */
    i f178k;

    /* renamed from: l  reason: collision with root package name */
    private CharSequence f179l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable f180m;

    /* renamed from: n  reason: collision with root package name */
    g.b f181n;
    private h0 o;
    b p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private int u;

    private class a extends h0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        public p b() {
            b bVar = ActionMenuItemView.this.p;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public boolean c() {
            p b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.f181n;
            if (bVar == null || !bVar.a(actionMenuItemView.f178k) || (b = b()) == null || !b.c()) {
                return false;
            }
            return true;
        }
    }

    public static abstract class b {
        public abstract p a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void h() {
        CharSequence charSequence;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f179l);
        if (this.f180m != null && (!this.f178k.B() || (!this.q && !this.r))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        setText(z3 ? this.f179l : null);
        CharSequence contentDescription = this.f178k.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                charSequence = null;
            } else {
                charSequence = this.f178k.getTitle();
            }
            setContentDescription(charSequence);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f178k.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.f178k.getTitle();
            }
            y0.a(this, charSequence2);
            return;
        }
        y0.a(this, tooltipText);
    }

    public boolean a() {
        return f();
    }

    public boolean b() {
        return f() && this.f178k.getIcon() == null;
    }

    public boolean d() {
        return true;
    }

    public void e(i iVar, int i2) {
        this.f178k = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.i(this));
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.o == null) {
            this.o = new a();
        }
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    public i getItemData() {
        return this.f178k;
    }

    public void onClick(View view) {
        g.b bVar = this.f181n;
        if (bVar != null) {
            bVar.a(this.f178k);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.q = g();
        h();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        boolean f2 = f();
        if (f2 && (i4 = this.t) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.s) : this.s;
        if (mode != 1073741824 && this.s > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (!f2 && this.f180m != null) {
            super.setPadding((getMeasuredWidth() - this.f180m.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var;
        if (!this.f178k.hasSubMenu() || (h0Var = this.o) == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.r != z) {
            this.r = z;
            i iVar = this.f178k;
            if (iVar != null) {
                iVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f180m = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.u;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i2) / ((float) intrinsicWidth)));
                intrinsicWidth = i2;
            }
            int i3 = this.u;
            if (intrinsicHeight > i3) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i3) / ((float) intrinsicHeight)));
                intrinsicHeight = i3;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        h();
    }

    public void setItemInvoker(g.b bVar) {
        this.f181n = bVar;
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        this.t = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(b bVar) {
        this.p = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f179l = charSequence;
        h();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources = context.getResources();
        this.q = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ActionMenuItemView, i2, 0);
        this.s = obtainStyledAttributes.getDimensionPixelSize(j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.u = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.t = -1;
        setSaveEnabled(false);
    }
}
