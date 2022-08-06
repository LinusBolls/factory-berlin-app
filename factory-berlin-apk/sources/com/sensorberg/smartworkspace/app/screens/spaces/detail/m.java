package com.sensorberg.smartworkspace.app.screens.spaces.detail;

import android.content.res.Resources;
import kotlin.jvm.internal.k;

/* compiled from: SpanCountHelper.kt */
public final class m {
    public static final m a = new m();

    private m() {
    }

    public static /* synthetic */ int b(m mVar, Resources resources, int i2, float f2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            f2 = 1.0f;
        }
        if ((i4 & 8) != 0) {
            i3 = 1;
        }
        return mVar.a(resources, i2, f2, i3);
    }

    public final int a(Resources resources, int i2, float f2, int i3) {
        k.e(resources, "resources");
        return Math.max(i3, ((int) (((float) resources.getDisplayMetrics().widthPixels) * f2)) / resources.getDimensionPixelSize(i2));
    }
}
