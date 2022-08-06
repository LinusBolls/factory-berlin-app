package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.c;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.h;

final class q implements c<TResult> {
    private final /* synthetic */ h a;
    private final /* synthetic */ o b;

    q(o oVar, h hVar) {
        this.b = oVar;
        this.a = hVar;
    }

    public final void a(g<TResult> gVar) {
        this.b.b.remove(this.a);
    }
}
