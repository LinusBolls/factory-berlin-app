package g.b.a.c.y;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.s;
import androidx.core.widget.c;
import com.google.android.material.internal.i;
import g.b.a.c.b;
import g.b.a.c.k;
import g.b.a.c.l;

/* compiled from: MaterialRadioButton */
public class a extends s {

    /* renamed from: l  reason: collision with root package name */
    private static final int f9547l = k.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: m  reason: collision with root package name */
    private static final int[][] f9548m = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f9549j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f9550k;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.radioButtonStyle);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f9549j == null) {
            int c = g.b.a.c.s.a.c(this, b.colorControlActivated);
            int c2 = g.b.a.c.s.a.c(this, b.colorOnSurface);
            int c3 = g.b.a.c.s.a.c(this, b.colorSurface);
            int[] iArr = new int[f9548m.length];
            iArr[0] = g.b.a.c.s.a.f(c3, c, 1.0f);
            iArr[1] = g.b.a.c.s.a.f(c3, c2, 0.54f);
            iArr[2] = g.b.a.c.s.a.f(c3, c2, 0.38f);
            iArr[3] = g.b.a.c.s.a.f(c3, c2, 0.38f);
            this.f9549j = new ColorStateList(f9548m, iArr);
        }
        return this.f9549j;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9550k && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f9550k = z;
        if (z) {
            c.c(this, getMaterialThemeColorsTintList());
        } else {
            c.c(this, (ColorStateList) null);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(i.f(context, attributeSet, i2, f9547l), attributeSet, i2);
        TypedArray k2 = i.k(getContext(), attributeSet, l.MaterialRadioButton, i2, f9547l, new int[0]);
        this.f9550k = k2.getBoolean(l.MaterialRadioButton_useMaterialThemeColors, false);
        k2.recycle();
    }
}
