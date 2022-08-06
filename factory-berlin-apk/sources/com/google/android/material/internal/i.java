package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.w0;
import e.a.n.d;
import g.b.a.c.b;
import g.b.a.c.l;

/* compiled from: ThemeEnforcement */
public final class i {
    private static final int[] a = {b.colorPrimary};
    private static final int[] b = {b.colorPrimaryVariant};
    private static final int[] c = {16842752, b.theme};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f3613d = {b.materialThemeOverlay};

    public static void a(Context context) {
        e(context, a, "Theme.AppCompat");
    }

    private static void b(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.ThemeEnforcement, i2, i3);
        boolean z = obtainStyledAttributes.getBoolean(l.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(b.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }

    public static void c(Context context) {
        e(context, b, "Theme.MaterialComponents");
    }

    private static void d(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.ThemeEnforcement, i2, i3);
        boolean z2 = false;
        if (!obtainStyledAttributes.getBoolean(l.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            if (obtainStyledAttributes.getResourceId(l.ThemeEnforcement_android_textAppearance, -1) != -1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = g(context, attributeSet, iArr, i2, i3, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void e(Context context, int[] iArr, String str) {
        if (!h(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    public static Context f(Context context, AttributeSet attributeSet, int i2, int i3) {
        int j2 = j(context, attributeSet, i2, i3);
        if (j2 == 0) {
            return context;
        }
        if ((context instanceof d) && ((d) context).b() == j2) {
            return context;
        }
        d dVar = new d(context, j2);
        int i4 = i(dVar, attributeSet);
        return i4 != 0 ? new d((Context) dVar, i4) : dVar;
    }

    private static boolean g(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    private static boolean h(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!obtainStyledAttributes.hasValue(i2)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    private static int i(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    private static int j(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3613d, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static TypedArray k(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        b(context, attributeSet, i2, i3);
        d(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    public static w0 l(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        b(context, attributeSet, i2, i3);
        d(context, attributeSet, iArr, i2, i3, iArr2);
        return w0.u(context, attributeSet, iArr, i2, i3);
    }
}
