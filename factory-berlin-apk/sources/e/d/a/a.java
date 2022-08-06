package e.d.a;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: CardView */
public class a extends FrameLayout {

    /* renamed from: k  reason: collision with root package name */
    private static final f f8433k;

    /* renamed from: g  reason: collision with root package name */
    private boolean f8434g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f8435h;

    /* renamed from: i  reason: collision with root package name */
    final Rect f8436i;

    /* renamed from: j  reason: collision with root package name */
    private final e f8437j;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            f8433k = new c();
        } else if (i2 >= 17) {
            f8433k = new b();
        } else {
            f8433k = new d();
        }
        f8433k.e();
    }

    public ColorStateList getCardBackgroundColor() {
        return f8433k.b(this.f8437j);
    }

    public float getCardElevation() {
        return f8433k.d(this.f8437j);
    }

    public int getContentPaddingBottom() {
        return this.f8436i.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f8436i.left;
    }

    public int getContentPaddingRight() {
        return this.f8436i.right;
    }

    public int getContentPaddingTop() {
        return this.f8436i.top;
    }

    public float getMaxCardElevation() {
        return f8433k.a(this.f8437j);
    }

    public boolean getPreventCornerOverlap() {
        return this.f8435h;
    }

    public float getRadius() {
        return f8433k.f(this.f8437j);
    }

    public boolean getUseCompatPadding() {
        return this.f8434g;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (!(f8433k instanceof c)) {
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f8433k.h(this.f8437j)), View.MeasureSpec.getSize(i2)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i3);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i3 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f8433k.g(this.f8437j)), View.MeasureSpec.getSize(i3)), mode2);
            }
            super.onMeasure(i2, i3);
            return;
        }
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        f8433k.l(this.f8437j, ColorStateList.valueOf(i2));
    }

    public void setCardElevation(float f2) {
        f8433k.j(this.f8437j, f2);
    }

    public void setMaxCardElevation(float f2) {
        f8433k.m(this.f8437j, f2);
    }

    public void setMinimumHeight(int i2) {
        super.setMinimumHeight(i2);
    }

    public void setMinimumWidth(int i2) {
        super.setMinimumWidth(i2);
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f8435h) {
            this.f8435h = z;
            f8433k.k(this.f8437j);
        }
    }

    public void setRadius(float f2) {
        f8433k.c(this.f8437j, f2);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f8434g != z) {
            this.f8434g = z;
            f8433k.i(this.f8437j);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f8433k.l(this.f8437j, colorStateList);
    }
}
