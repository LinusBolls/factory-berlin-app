package com.sensorberg.smartworkspace.app.screens.spaces;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.k;

/* compiled from: AlphaHelper.kt */
public final class a {
    public static final a a = new a();

    private a() {
    }

    public final int a(Context context, int i2) {
        k.e(context, "context");
        return androidx.core.content.a.c(context, i2) + 855638016;
    }

    public final Drawable b(Context context, int i2) {
        k.e(context, "context");
        return new ColorDrawable(a(context, i2));
    }

    public final int c() {
        return 51;
    }
}
