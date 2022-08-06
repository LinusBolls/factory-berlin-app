package com.sensorberg.smartworkspace.app.screens.door.d;

import android.widget.TextView;
import com.sensorberg.smartworkspace.app.k.k1;
import kotlin.jvm.internal.k;

/* compiled from: FavoriteListViewHolder.kt */
public final class g extends d<f, k1> {
    private final k1 u;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g(android.view.ViewGroup r2, com.sensorberg.smartworkspace.app.k.k1 r3) {
        /*
            r1 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.k.e(r2, r0)
            java.lang.String r2 = "binding"
            kotlin.jvm.internal.k.e(r3, r2)
            android.view.View r2 = r3.s()
            java.lang.String r0 = "binding.root"
            kotlin.jvm.internal.k.d(r2, r0)
            r0 = 0
            r1.<init>(r2, r0)
            r1.u = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartworkspace.app.screens.door.d.g.<init>(android.view.ViewGroup, com.sensorberg.smartworkspace.app.k.k1):void");
    }

    /* renamed from: N */
    public void M(f fVar) {
        k.e(fVar, "model");
        TextView textView = this.u.v;
        k.d(textView, "binding.title");
        textView.setText(fVar.b());
    }
}
