package com.sensorberg.noiise;

import android.content.Context;
import g.e.d.n;
import kotlin.jvm.internal.k;

/* compiled from: NoiiseTab.kt */
public abstract class b implements n {
    private final String a = "Noise";
    private final int b = e.tab_noiise;
    private final int c = f.noiiseFragment;

    public String a(Context context) {
        k.e(context, "context");
        return "NOIISE";
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public String getType() {
        return this.a;
    }
}
