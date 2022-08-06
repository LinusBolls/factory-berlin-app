package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.g;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.a;
import com.google.android.material.internal.i;
import e.h.k.d0.c;
import e.h.k.u;
import g.b.a.c.c0.n;
import g.b.a.c.j;
import g.b.a.c.k;
import g.b.a.c.l;
import g.b.a.c.m.h;
import g.b.a.c.z.d;
import g.b.a.c.z.f;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class Chip extends g implements a.C0073a, n {
    private static final int[] A = {16842913};
    private static final int[] B = {16842911};
    /* access modifiers changed from: private */
    public static final Rect z = new Rect();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public a f3479j;

    /* renamed from: k  reason: collision with root package name */
    private InsetDrawable f3480k;

    /* renamed from: l  reason: collision with root package name */
    private RippleDrawable f3481l;

    /* renamed from: m  reason: collision with root package name */
    private View.OnClickListener f3482m;

    /* renamed from: n  reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f3483n;
    private boolean o;
    private boolean p;
    private boolean q;
    /* access modifiers changed from: private */
    public boolean r;
    private boolean s;
    private int t;
    private int u;
    private final c v;
    private final Rect w;
    private final RectF x;
    private final f y;

    class a extends f {
        a() {
        }

        public void a(int i2) {
        }

        public void b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.f3479j.D2() ? Chip.this.f3479j.b1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f3479j != null) {
                Chip.this.f3479j.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    private class c extends e.j.b.a {
        c(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        public int B(float f2, float f3) {
            return (!Chip.this.m() || !Chip.this.getCloseIconTouchBounds().contains(f2, f3)) ? 0 : 1;
        }

        /* access modifiers changed from: protected */
        public void C(List<Integer> list) {
            list.add(0);
            if (Chip.this.m() && Chip.this.r()) {
                list.add(1);
            }
        }

        /* access modifiers changed from: protected */
        public boolean J(int i2, int i3, Bundle bundle) {
            if (i3 != 16) {
                return false;
            }
            if (i2 == 0) {
                return Chip.this.performClick();
            }
            if (i2 == 1) {
                return Chip.this.s();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void M(e.h.k.d0.c cVar) {
            cVar.U(Chip.this.q());
            cVar.X(Chip.this.isClickable());
            if (Chip.this.q() || Chip.this.isClickable()) {
                cVar.W(Chip.this.q() ? "android.widget.CompoundButton" : "android.widget.Button");
            } else {
                cVar.W("android.view.View");
            }
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                cVar.q0(text);
            } else {
                cVar.a0(text);
            }
        }

        /* access modifiers changed from: protected */
        public void N(int i2, e.h.k.d0.c cVar) {
            CharSequence charSequence = "";
            if (i2 == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    cVar.a0(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i3 = j.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    cVar.a0(context.getString(i3, objArr).trim());
                }
                cVar.S(Chip.this.getCloseIconTouchBoundsInt());
                cVar.b(c.a.f8690e);
                cVar.c0(Chip.this.isEnabled());
                return;
            }
            cVar.a0(charSequence);
            cVar.S(Chip.z);
        }

        /* access modifiers changed from: protected */
        public void O(int i2, boolean z) {
            if (i2 == 1) {
                boolean unused = Chip.this.r = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.b.a.c.b.chipStyle);
    }

    private void A() {
        TextPaint paint = getPaint();
        a aVar = this.f3479j;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.i(getContext(), paint, this.y);
        }
    }

    private void B(AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.x.setEmpty();
        if (m()) {
            this.f3479j.U0(this.x);
        }
        return this.x;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.w.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.w;
    }

    private d getTextAppearance() {
        a aVar = this.f3479j;
        if (aVar != null) {
            return aVar.c1();
        }
        return null;
    }

    private void h(a aVar) {
        aVar.h2(this);
    }

    private int[] i() {
        int i2 = 0;
        int i3 = isEnabled() ? 1 : 0;
        if (this.r) {
            i3++;
        }
        if (this.q) {
            i3++;
        }
        if (this.p) {
            i3++;
        }
        if (isChecked()) {
            i3++;
        }
        int[] iArr = new int[i3];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i2 = 1;
        }
        if (this.r) {
            iArr[i2] = 16842908;
            i2++;
        }
        if (this.q) {
            iArr[i2] = 16843623;
            i2++;
        }
        if (this.p) {
            iArr[i2] = 16842919;
            i2++;
        }
        if (isChecked()) {
            iArr[i2] = 16842913;
        }
        return iArr;
    }

    private void k() {
        if (getBackgroundDrawable() == this.f3480k && this.f3479j.getCallback() == null) {
            this.f3479j.setCallback(this.f3480k);
        }
    }

    @SuppressLint({"PrivateApi"})
    private boolean l(MotionEvent motionEvent) {
        Class<e.j.b.a> cls = e.j.b.a.class;
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = cls.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.v)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = cls.getDeclaredMethod("V", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.v, new Object[]{Integer.valueOf(RecyclerView.UNDEFINED_DURATION)});
                    return true;
                }
            } catch (NoSuchMethodException e2) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e2);
            } catch (IllegalAccessException e3) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e3);
            } catch (InvocationTargetException e4) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e4);
            } catch (NoSuchFieldException e5) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e5);
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public boolean m() {
        a aVar = this.f3479j;
        return (aVar == null || aVar.N0() == null) ? false : true;
    }

    private void n(Context context, AttributeSet attributeSet, int i2) {
        TypedArray k2 = i.k(context, attributeSet, l.Chip, i2, k.Widget_MaterialComponents_Chip_Action, new int[0]);
        this.s = k2.getBoolean(l.Chip_ensureMinTouchTargetSize, false);
        this.u = (int) Math.ceil((double) k2.getDimension(l.Chip_chipMinTouchTargetSize, (float) Math.ceil((double) com.google.android.material.internal.j.b(getContext(), 48))));
        k2.recycle();
    }

    private void o() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new b());
        }
    }

    private void p(int i2, int i3, int i4, int i5) {
        this.f3480k = new InsetDrawable(this.f3479j, i2, i3, i4, i5);
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.q != z2) {
            this.q = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.p != z2) {
            this.p = z2;
            refreshDrawableState();
        }
    }

    private void t() {
        if (this.f3480k != null) {
            this.f3480k = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            x();
        }
    }

    private void v(a aVar) {
        if (aVar != null) {
            aVar.h2((a.C0073a) null);
        }
    }

    private void w() {
        if (Build.VERSION.SDK_INT < 24) {
            if (!m() || !r()) {
                u.e0(this, (e.h.k.a) null);
            } else {
                u.e0(this, this.v);
            }
        }
    }

    private void x() {
        if (g.b.a.c.a0.b.a) {
            y();
            return;
        }
        this.f3479j.C2(true);
        u.h0(this, getBackgroundDrawable());
        k();
    }

    private void y() {
        this.f3481l = new RippleDrawable(g.b.a.c.a0.b.d(this.f3479j.Z0()), getBackgroundDrawable(), (Drawable) null);
        this.f3479j.C2(false);
        u.h0(this, this.f3481l);
    }

    private void z() {
        a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f3479j) != null) {
            u.r0(this, (int) (this.f3479j.K0() + this.f3479j.e1() + this.f3479j.j0()), getPaddingTop(), (int) (aVar.F0() + this.f3479j.d1() + this.f3479j.n0()), getPaddingBottom());
        }
    }

    public void a() {
        j(this.u);
        x();
        z();
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return l(motionEvent) || this.v.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.v.w(keyEvent) || this.v.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        a aVar = this.f3479j;
        if ((aVar == null || !aVar.j1()) ? false : this.f3479j.d2(i())) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f3480k;
        return insetDrawable == null ? this.f3479j : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        a aVar = this.f3479j;
        if (aVar != null) {
            return aVar.C0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        a aVar = this.f3479j;
        if (aVar != null) {
            return aVar.D0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        a aVar = this.f3479j;
        if (aVar != null) {
            return aVar.E0();
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f3479j;
    }

    public float getChipEndPadding() {
        a aVar = this.f3479j;
        if (aVar != null) {
            return aVar.F0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        a aVar = this.f3479j;
        if (aVar != null) {
            return aVar.G0();
        }
        return null;
    }

    public float getChipIconSize() {
        a aVar = this.f3479j;
        if (aVar != null) {
            return aVar.H0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        a aVar = this.f3479j;
        if (aVar != null) {
            return aVar.I0();
        }
        return null;
    }

    public float getChipMinHeight() {
        a aVar = this.f3479j;
        if (aVar != null) {
            return aVar.J0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        a aVar = this.f3479j;
        if (aVar != null) {
            return aVar.K0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        a aVar = this.f3479j;
        if (aVar != null) {
            return aVar.L0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        a aVar = this.f3479j;
        if (aVar != null) {
            return aVar.M0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        a aVar = this.f3479j;
        if (aVar != null) {
            return aVar.N0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        a aVar = this.f3479j;
        if (aVar != null) {
            return aVar.O0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        a aVar = this.f3479j;
        if (aVar != null) {
            return aVar.P0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        a aVar = this.f3479j;
        if (aVar != null) {
            return aVar.Q0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        a aVar = this.f3479j;
        if (aVar != null) {
            return aVar.R0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        a aVar = this.f3479j;
        if (aVar != null) {
            return aVar.T0();
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        a aVar = this.f3479j;
        if (aVar != null) {
            return aVar.V0();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.v.A() == 1 || this.v.x() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public h getHideMotionSpec() {
        a aVar = this.f3479j;
        if (aVar != null) {
            return aVar.W0();
        }
        return null;
    }

    public float getIconEndPadding() {
        a aVar = this.f3479j;
        if (aVar != null) {
            return aVar.X0();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        a aVar = this.f3479j;
        if (aVar != null) {
            return aVar.Y0();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        a aVar = this.f3479j;
        if (aVar != null) {
            return aVar.Z0();
        }
        return null;
    }

    public g.b.a.c.c0.k getShapeAppearanceModel() {
        return this.f3479j.B();
    }

    public h getShowMotionSpec() {
        a aVar = this.f3479j;
        if (aVar != null) {
            return aVar.a1();
        }
        return null;
    }

    public float getTextEndPadding() {
        a aVar = this.f3479j;
        if (aVar != null) {
            return aVar.d1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        a aVar = this.f3479j;
        if (aVar != null) {
            return aVar.e1();
        }
        return 0.0f;
    }

    public boolean j(int i2) {
        this.u = i2;
        int i3 = 0;
        if (!u()) {
            t();
            return false;
        }
        int max = Math.max(0, i2 - this.f3479j.getIntrinsicHeight());
        int max2 = Math.max(0, i2 - this.f3479j.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            int i4 = max2 > 0 ? max2 / 2 : 0;
            if (max > 0) {
                i3 = max / 2;
            }
            if (this.f3480k != null) {
                Rect rect = new Rect();
                this.f3480k.getPadding(rect);
                if (rect.top == i3 && rect.bottom == i3 && rect.left == i4 && rect.right == i4) {
                    return true;
                }
            }
            if (Build.VERSION.SDK_INT >= 16) {
                if (getMinHeight() != i2) {
                    setMinHeight(i2);
                }
                if (getMinWidth() != i2) {
                    setMinWidth(i2);
                }
            } else {
                setMinHeight(i2);
                setMinWidth(i2);
            }
            p(i4, i3, i4, i3);
            return true;
        }
        t();
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g.b.a.c.c0.h.f(this, this.f3479j);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, A);
        }
        if (q()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, B);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z2, int i2, Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        this.v.I(z2, i2, rect);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (q() || isClickable()) {
            accessibilityNodeInfo.setClassName(q() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            accessibilityNodeInfo.setClassName("android.view.View");
        }
        accessibilityNodeInfo.setCheckable(q());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.t != i2) {
            this.t = i2;
            z();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.p
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.p
            if (r0 == 0) goto L_0x0034
            r5.s()
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean q() {
        a aVar = this.f3479j;
        return aVar != null && aVar.i1();
    }

    public boolean r() {
        a aVar = this.f3479j;
        return aVar != null && aVar.k1();
    }

    public boolean s() {
        boolean z2 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f3482m;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z2 = true;
        }
        this.v.U(1, 1);
        return z2;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f3481l) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f3481l) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i2) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.r1(z2);
        }
    }

    public void setCheckableResource(int i2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.s1(i2);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        a aVar = this.f3479j;
        if (aVar == null) {
            this.o = z2;
        } else if (aVar.i1()) {
            boolean isChecked = isChecked();
            super.setChecked(z2);
            if (isChecked != z2 && (onCheckedChangeListener = this.f3483n) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z2);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.t1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.u1(i2);
        }
    }

    public void setCheckedIconVisible(int i2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.v1(i2);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.x1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.y1(i2);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.z1(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.A1(i2);
        }
    }

    public void setChipDrawable(a aVar) {
        a aVar2 = this.f3479j;
        if (aVar2 != aVar) {
            v(aVar2);
            this.f3479j = aVar;
            aVar.s2(false);
            h(this.f3479j);
            j(this.u);
            x();
        }
    }

    public void setChipEndPadding(float f2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.B1(f2);
        }
    }

    public void setChipEndPaddingResource(int i2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.C1(i2);
        }
    }

    public void setChipIcon(Drawable drawable) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.D1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.E1(i2);
        }
    }

    public void setChipIconSize(float f2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.F1(f2);
        }
    }

    public void setChipIconSizeResource(int i2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.G1(i2);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.H1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.I1(i2);
        }
    }

    public void setChipIconVisible(int i2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.J1(i2);
        }
    }

    public void setChipMinHeight(float f2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.L1(f2);
        }
    }

    public void setChipMinHeightResource(int i2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.M1(i2);
        }
    }

    public void setChipStartPadding(float f2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.N1(f2);
        }
    }

    public void setChipStartPaddingResource(int i2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.O1(i2);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.P1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.Q1(i2);
        }
    }

    public void setChipStrokeWidth(float f2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.R1(f2);
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.S1(i2);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.U1(drawable);
        }
        w();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.V1(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.W1(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.X1(i2);
        }
    }

    public void setCloseIconResource(int i2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.Y1(i2);
        }
        w();
    }

    public void setCloseIconSize(float f2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.Z1(f2);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.a2(i2);
        }
    }

    public void setCloseIconStartPadding(float f2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.b2(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.c2(i2);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.e2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.f2(i2);
        }
    }

    public void setCloseIconVisible(int i2) {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.T(f2);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f3479j != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                a aVar = this.f3479j;
                if (aVar != null) {
                    aVar.i2(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.s = z2;
        j(this.u);
    }

    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i2);
        }
    }

    public void setHideMotionSpec(h hVar) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.j2(hVar);
        }
    }

    public void setHideMotionSpecResource(int i2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.k2(i2);
        }
    }

    public void setIconEndPadding(float f2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.l2(f2);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.m2(i2);
        }
    }

    public void setIconStartPadding(float f2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.n2(f2);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.o2(i2);
        }
    }

    public void setLayoutDirection(int i2) {
        if (this.f3479j != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i2);
        }
    }

    public void setLines(int i2) {
        if (i2 <= 1) {
            super.setLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i2) {
        if (i2 <= 1) {
            super.setMaxLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.p2(i2);
        }
    }

    public void setMinLines(int i2) {
        if (i2 <= 1) {
            super.setMinLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* access modifiers changed from: package-private */
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f3483n = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f3482m = onClickListener;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.q2(colorStateList);
        }
        if (!this.f3479j.g1()) {
            y();
        }
    }

    public void setRippleColorResource(int i2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.r2(i2);
            if (!this.f3479j.g1()) {
                y();
            }
        }
    }

    public void setShapeAppearanceModel(g.b.a.c.c0.k kVar) {
        this.f3479j.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(h hVar) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.t2(hVar);
        }
    }

    public void setShowMotionSpecResource(int i2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.u2(i2);
        }
    }

    public void setSingleLine(boolean z2) {
        if (z2) {
            super.setSingleLine(z2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.f3479j != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(this.f3479j.D2() ? null : charSequence, bufferType);
            a aVar = this.f3479j;
            if (aVar != null) {
                aVar.v2(charSequence);
            }
        }
    }

    public void setTextAppearance(d dVar) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.w2(dVar);
        }
        A();
    }

    public void setTextAppearanceResource(int i2) {
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.y2(f2);
        }
    }

    public void setTextEndPaddingResource(int i2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.z2(i2);
        }
    }

    public void setTextStartPadding(float f2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.A2(f2);
        }
    }

    public void setTextStartPaddingResource(int i2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.B2(i2);
        }
    }

    public boolean u() {
        return this.s;
    }

    public Chip(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.w = new Rect();
        this.x = new RectF();
        this.y = new a();
        B(attributeSet);
        a s0 = a.s0(context, attributeSet, i2, k.Widget_MaterialComponents_Chip_Action);
        n(context, attributeSet, i2);
        setChipDrawable(s0);
        s0.T(u.s(this));
        TypedArray k2 = i.k(context, attributeSet, l.Chip, i2, k.Widget_MaterialComponents_Chip_Action, new int[0]);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(g.b.a.c.z.c.a(context, k2, l.Chip_android_textColor));
        }
        boolean hasValue = k2.hasValue(l.Chip_shapeAppearance);
        k2.recycle();
        c cVar = new c(this);
        this.v = cVar;
        if (Build.VERSION.SDK_INT >= 24) {
            u.e0(this, cVar);
        } else {
            w();
        }
        if (!hasValue) {
            o();
        }
        setChecked(this.o);
        setText(s0.b1());
        setEllipsize(s0.V0());
        setIncludeFontPadding(false);
        A();
        if (!this.f3479j.D2()) {
            setSingleLine();
        }
        setGravity(8388627);
        z();
        if (u()) {
            setMinHeight(this.u);
        }
        this.t = u.x(this);
    }

    public void setCloseIconVisible(boolean z2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.g2(z2);
        }
        w();
    }

    public void setCheckedIconVisible(boolean z2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.w1(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.K1(z2);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.x2(i2);
        }
        A();
    }

    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        a aVar = this.f3479j;
        if (aVar != null) {
            aVar.x2(i2);
        }
        A();
    }
}
