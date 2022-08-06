package g.b.a.c.p;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import g.b.a.c.b;
import g.b.a.c.c0.h;
import g.b.a.c.c0.k;
import g.b.a.c.c0.n;

/* compiled from: MaterialCardView */
public class a extends e.d.a.a implements Checkable, n {
    private static final int[] q = {16842911};
    private static final int[] r = {16842912};
    private static final int[] s = {b.state_dragged};

    /* renamed from: l  reason: collision with root package name */
    private final b f9534l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f9535m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f9536n;
    private boolean o;
    private C0636a p;

    /* renamed from: g.b.a.c.p.a$a  reason: collision with other inner class name */
    /* compiled from: MaterialCardView */
    public interface C0636a {
        void a(a aVar, boolean z);
    }

    private void d() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f9534l.a();
        }
    }

    public boolean e() {
        b bVar = this.f9534l;
        return bVar != null && bVar.o();
    }

    public boolean f() {
        return this.o;
    }

    public ColorStateList getCardBackgroundColor() {
        return this.f9534l.c();
    }

    /* access modifiers changed from: package-private */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f9534l.d();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f9534l.e();
    }

    public int getContentPaddingBottom() {
        return this.f9534l.m().bottom;
    }

    public int getContentPaddingLeft() {
        return this.f9534l.m().left;
    }

    public int getContentPaddingRight() {
        return this.f9534l.m().right;
    }

    public int getContentPaddingTop() {
        return this.f9534l.m().top;
    }

    public float getProgress() {
        return this.f9534l.g();
    }

    public float getRadius() {
        return this.f9534l.f();
    }

    public ColorStateList getRippleColor() {
        return this.f9534l.h();
    }

    public k getShapeAppearanceModel() {
        return this.f9534l.i();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f9534l.j();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f9534l.k();
    }

    public int getStrokeWidth() {
        return this.f9534l.l();
    }

    public boolean isChecked() {
        return this.f9536n;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.f(this, this.f9534l.b());
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 3);
        if (e()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, q);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, r);
        }
        if (f()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, s);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(e.d.a.a.class.getName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(e.d.a.a.class.getName());
        accessibilityNodeInfo.setCheckable(e());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.f9534l.p(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f9535m) {
            if (!this.f9534l.n()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f9534l.q(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int i2) {
        this.f9534l.r(ColorStateList.valueOf(i2));
    }

    public void setCardElevation(float f2) {
        super.setCardElevation(f2);
        this.f9534l.D();
    }

    public void setCheckable(boolean z) {
        this.f9534l.s(z);
    }

    public void setChecked(boolean z) {
        if (this.f9536n != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f9534l.t(drawable);
    }

    public void setCheckedIconResource(int i2) {
        this.f9534l.t(e.a.k.a.a.d(getContext(), i2));
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f9534l.u(colorStateList);
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        this.f9534l.B();
    }

    public void setDragged(boolean z) {
        if (this.o != z) {
            this.o = z;
            refreshDrawableState();
            d();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f2) {
        super.setMaxCardElevation(f2);
        this.f9534l.E();
    }

    public void setOnCheckedChangeListener(C0636a aVar) {
        this.p = aVar;
    }

    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f9534l.E();
        this.f9534l.C();
    }

    public void setProgress(float f2) {
        this.f9534l.w(f2);
    }

    public void setRadius(float f2) {
        super.setRadius(f2);
        this.f9534l.v(f2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f9534l.x(colorStateList);
    }

    public void setRippleColorResource(int i2) {
        this.f9534l.x(e.a.k.a.a.c(getContext(), i2));
    }

    public void setShapeAppearanceModel(k kVar) {
        this.f9534l.y(kVar);
    }

    public void setStrokeColor(int i2) {
        this.f9534l.z(ColorStateList.valueOf(i2));
    }

    public void setStrokeWidth(int i2) {
        this.f9534l.A(i2);
    }

    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f9534l.E();
        this.f9534l.C();
    }

    public void toggle() {
        if (e() && isEnabled()) {
            this.f9536n = !this.f9536n;
            refreshDrawableState();
            d();
            C0636a aVar = this.p;
            if (aVar != null) {
                aVar.a(this, this.f9536n);
            }
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f9534l.r(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f9534l.z(colorStateList);
    }
}
