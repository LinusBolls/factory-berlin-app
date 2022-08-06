package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.c.f;
import e.a.k.a.a;

/* compiled from: TintTypedArray */
public class w0 {
    private final Context a;
    private final TypedArray b;
    private TypedValue c;

    private w0(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static w0 s(Context context, int i2, int[] iArr) {
        return new w0(context, context.obtainStyledAttributes(i2, iArr));
    }

    public static w0 t(Context context, AttributeSet attributeSet, int[] iArr) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static w0 u(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public boolean a(int i2, boolean z) {
        return this.b.getBoolean(i2, z);
    }

    public int b(int i2, int i3) {
        return this.b.getColor(i2, i3);
    }

    public ColorStateList c(int i2) {
        int resourceId;
        ColorStateList c2;
        if (!this.b.hasValue(i2) || (resourceId = this.b.getResourceId(i2, 0)) == 0 || (c2 = a.c(this.a, resourceId)) == null) {
            return this.b.getColorStateList(i2);
        }
        return c2;
    }

    public float d(int i2, float f2) {
        return this.b.getDimension(i2, f2);
    }

    public int e(int i2, int i3) {
        return this.b.getDimensionPixelOffset(i2, i3);
    }

    public int f(int i2, int i3) {
        return this.b.getDimensionPixelSize(i2, i3);
    }

    public Drawable g(int i2) {
        int resourceId;
        if (!this.b.hasValue(i2) || (resourceId = this.b.getResourceId(i2, 0)) == 0) {
            return this.b.getDrawable(i2);
        }
        return a.d(this.a, resourceId);
    }

    public Drawable h(int i2) {
        int resourceId;
        if (!this.b.hasValue(i2) || (resourceId = this.b.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return j.b().d(this.a, resourceId, true);
    }

    public float i(int i2, float f2) {
        return this.b.getFloat(i2, f2);
    }

    public Typeface j(int i2, int i3, f.a aVar) {
        int resourceId = this.b.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        return f.c(this.a, resourceId, this.c, i3, aVar);
    }

    public int k(int i2, int i3) {
        return this.b.getInt(i2, i3);
    }

    public int l(int i2, int i3) {
        return this.b.getInteger(i2, i3);
    }

    public int m(int i2, int i3) {
        return this.b.getLayoutDimension(i2, i3);
    }

    public int n(int i2, int i3) {
        return this.b.getResourceId(i2, i3);
    }

    public String o(int i2) {
        return this.b.getString(i2);
    }

    public CharSequence p(int i2) {
        return this.b.getText(i2);
    }

    public CharSequence[] q(int i2) {
        return this.b.getTextArray(i2);
    }

    public boolean r(int i2) {
        return this.b.hasValue(i2);
    }

    public void v() {
        this.b.recycle();
    }
}
