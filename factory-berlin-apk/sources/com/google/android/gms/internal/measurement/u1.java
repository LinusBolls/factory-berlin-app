package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class u1 extends ContentObserver {
    private final /* synthetic */ s1 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    u1(s1 s1Var, Handler handler) {
        super((Handler) null);
        this.a = s1Var;
    }

    public final void onChange(boolean z) {
        this.a.d();
    }
}
