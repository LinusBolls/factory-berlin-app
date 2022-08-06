package g.b.a.c.q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.g;
import androidx.core.widget.c;
import com.google.android.material.internal.i;
import g.b.a.c.b;
import g.b.a.c.k;
import g.b.a.c.l;

/* compiled from: MaterialCheckBox */
public class a extends g {

    /* renamed from: l  reason: collision with root package name */
    private static final int f9537l = k.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: m  reason: collision with root package name */
    private static final int[][] f9538m = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f9539j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f9540k;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.checkboxStyle);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f9539j == null) {
            int[] iArr = new int[f9538m.length];
            int c = g.b.a.c.s.a.c(this, b.colorControlActivated);
            int c2 = g.b.a.c.s.a.c(this, b.colorSurface);
            int c3 = g.b.a.c.s.a.c(this, b.colorOnSurface);
            iArr[0] = g.b.a.c.s.a.f(c2, c, 1.0f);
            iArr[1] = g.b.a.c.s.a.f(c2, c3, 0.54f);
            iArr[2] = g.b.a.c.s.a.f(c2, c3, 0.38f);
            iArr[3] = g.b.a.c.s.a.f(c2, c3, 0.38f);
            this.f9539j = new ColorStateList(f9538m, iArr);
        }
        return this.f9539j;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9540k && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f9540k = z;
        if (z) {
            c.c(this, getMaterialThemeColorsTintList());
        } else {
            c.c(this, (ColorStateList) null);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(i.f(context, attributeSet, i2, f9537l), attributeSet, i2);
        Context context2 = getContext();
        TypedArray k2 = i.k(context2, attributeSet, l.MaterialCheckBox, i2, f9537l, new int[0]);
        if (k2.hasValue(l.MaterialCheckBox_buttonTint)) {
            c.c(this, g.b.a.c.z.c.a(context2, k2, l.MaterialCheckBox_buttonTint));
        }
        this.f9540k = k2.getBoolean(l.MaterialCheckBox_useMaterialThemeColors, false);
        k2.recycle();
    }
}
