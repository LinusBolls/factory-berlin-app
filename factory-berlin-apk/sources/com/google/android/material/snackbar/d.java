package com.google.android.material.snackbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.internal.i;
import e.h.k.u;
import g.b.a.c.l;

/* compiled from: BaseTransientBottomBar */
public class d extends FrameLayout {

    /* renamed from: l  reason: collision with root package name */
    private static final View.OnTouchListener f3621l = new a();

    /* renamed from: g  reason: collision with root package name */
    private c f3622g;

    /* renamed from: h  reason: collision with root package name */
    private b f3623h;

    /* renamed from: i  reason: collision with root package name */
    private int f3624i;

    /* renamed from: j  reason: collision with root package name */
    private final float f3625j;

    /* renamed from: k  reason: collision with root package name */
    private final float f3626k;

    /* compiled from: BaseTransientBottomBar */
    static class a implements View.OnTouchListener {
        a() {
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    protected d(Context context, AttributeSet attributeSet) {
        super(i.f(context, attributeSet, 0, 0), attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, l.SnackbarLayout);
        if (obtainStyledAttributes.hasValue(l.SnackbarLayout_elevation)) {
            u.l0(this, (float) obtainStyledAttributes.getDimensionPixelSize(l.SnackbarLayout_elevation, 0));
        }
        this.f3624i = obtainStyledAttributes.getInt(l.SnackbarLayout_animationMode, 0);
        this.f3625j = obtainStyledAttributes.getFloat(l.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
        this.f3626k = obtainStyledAttributes.getFloat(l.SnackbarLayout_actionTextColorAlpha, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f3621l);
        setFocusable(true);
    }

    /* access modifiers changed from: package-private */
    public float getActionTextColorAlpha() {
        return this.f3626k;
    }

    /* access modifiers changed from: package-private */
    public int getAnimationMode() {
        return this.f3624i;
    }

    /* access modifiers changed from: package-private */
    public float getBackgroundOverlayColorAlpha() {
        return this.f3625j;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f3623h;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        u.c0(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f3623h;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        c cVar = this.f3622g;
        if (cVar != null) {
            cVar.a(this, i2, i3, i4, i5);
        }
    }

    /* access modifiers changed from: package-private */
    public void setAnimationMode(int i2) {
        this.f3624i = i2;
    }

    /* access modifiers changed from: package-private */
    public void setOnAttachStateChangeListener(b bVar) {
        this.f3623h = bVar;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f3621l);
        super.setOnClickListener(onClickListener);
    }

    /* access modifiers changed from: package-private */
    public void setOnLayoutChangeListener(c cVar) {
        this.f3622g = cVar;
    }
}
