package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.tasks.h;

final class n implements d<Status> {
    private final /* synthetic */ h a;

    n(j jVar, h hVar) {
        this.a = hVar;
    }

    public final /* synthetic */ void a(Object obj) {
        this.a.c(null);
    }

    public final void b(Status status) {
        this.a.b(new ApiException(status));
    }
}
