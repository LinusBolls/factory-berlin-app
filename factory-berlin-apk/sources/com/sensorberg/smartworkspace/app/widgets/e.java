package com.sensorberg.smartworkspace.app.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: LayoutParamHelper.kt */
public final class e {
    public static final e a = new e();

    private e() {
    }

    public final void a(View view) {
        k.e(view, "view");
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        Context context = view.getContext();
        k.d(context, "view.context");
        Resources resources = context.getResources();
        k.d(resources, "view.context.resources");
        float f2 = resources.getDisplayMetrics().density;
        int i2 = (int) (16.0f * f2);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.bottomMargin = i2;
        int i3 = (int) (f2 * 32.0f);
        marginLayoutParams.leftMargin = i3;
        marginLayoutParams.rightMargin = i3;
        x xVar = x.a;
        view.setLayoutParams(marginLayoutParams);
    }
}
