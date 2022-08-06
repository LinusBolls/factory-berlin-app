package g.b.a.c.z;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.appcompat.widget.w0;
import e.a.k.a.a;

/* compiled from: MaterialResources */
public class c {
    public static ColorStateList a(Context context, TypedArray typedArray, int i2) {
        int color;
        int resourceId;
        ColorStateList c;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, 0)) != 0 && (c = a.c(context, resourceId)) != null) {
            return c;
        }
        if (Build.VERSION.SDK_INT > 15 || (color = typedArray.getColor(i2, -1)) == -1) {
            return typedArray.getColorStateList(i2);
        }
        return ColorStateList.valueOf(color);
    }

    public static ColorStateList b(Context context, w0 w0Var, int i2) {
        int b;
        int n2;
        ColorStateList c;
        if (w0Var.r(i2) && (n2 = w0Var.n(i2, 0)) != 0 && (c = a.c(context, n2)) != null) {
            return c;
        }
        if (Build.VERSION.SDK_INT > 15 || (b = w0Var.b(i2, -1)) == -1) {
            return w0Var.c(i2);
        }
        return ColorStateList.valueOf(b);
    }

    public static int c(Context context, TypedArray typedArray, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i2, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i2, i3);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i3);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable d(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable d2;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (d2 = a.d(context, resourceId)) == null) {
            return typedArray.getDrawable(i2);
        }
        return d2;
    }

    static int e(TypedArray typedArray, int i2, int i3) {
        return typedArray.hasValue(i2) ? i2 : i3;
    }

    public static d f(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return new d(context, resourceId);
    }
}
