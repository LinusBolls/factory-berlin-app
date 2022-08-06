package com.google.android.gms.common;

import java.util.concurrent.Callable;

final /* synthetic */ class r implements Callable {
    private final boolean a;
    private final String b;
    private final s c;

    r(boolean z, String str, s sVar) {
        this.a = z;
        this.b = str;
        this.c = sVar;
    }

    public final Object call() {
        return q.b(this.a, this.b, this.c);
    }
}
