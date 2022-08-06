package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;

final class p implements e.a {
    private final /* synthetic */ BasePendingResult a;
    private final /* synthetic */ o b;

    p(o oVar, BasePendingResult basePendingResult) {
        this.b = oVar;
        this.a = basePendingResult;
    }

    public final void a(Status status) {
        this.b.a.remove(this.a);
    }
}
