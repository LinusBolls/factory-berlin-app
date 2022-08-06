package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import e.h.d.a;

/* compiled from: ThemeUtils */
class r0 {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    static final int[] b = {-16842910};
    static final int[] c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    static final int[] f503d = {16842919};

    /* renamed from: e  reason: collision with root package name */
    static final int[] f504e = {16842912};

    /* renamed from: f  reason: collision with root package name */
    static final int[] f505f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f506g = new int[1];

    public static int a(Context context, int i2) {
        ColorStateList d2 = d(context, i2);
        if (d2 != null && d2.isStateful()) {
            return d2.getColorForState(b, d2.getDefaultColor());
        }
        TypedValue e2 = e();
        context.getTheme().resolveAttribute(16842803, e2, true);
        return c(context, i2, e2.getFloat());
    }

    public static int b(Context context, int i2) {
        int[] iArr = f506g;
        iArr[0] = i2;
        w0 t = w0.t(context, (AttributeSet) null, iArr);
        try {
            return t.b(0, 0);
        } finally {
            t.v();
        }
    }

    static int c(Context context, int i2, float f2) {
        int b2 = b(context, i2);
        return a.d(b2, Math.round(((float) Color.alpha(b2)) * f2));
    }

    public static ColorStateList d(Context context, int i2) {
        int[] iArr = f506g;
        iArr[0] = i2;
        w0 t = w0.t(context, (AttributeSet) null, iArr);
        try {
            return t.c(0);
        } finally {
            t.v();
        }
    }

    private static TypedValue e() {
        TypedValue typedValue = a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        a.set(typedValue2);
        return typedValue2;
    }
}
