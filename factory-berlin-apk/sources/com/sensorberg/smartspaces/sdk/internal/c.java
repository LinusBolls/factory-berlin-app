package com.sensorberg.smartspaces.sdk.internal;

import g.e.n.g.d;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.k;
import kotlinx.coroutines.x1;

/* compiled from: CancelableJob.kt */
public final class c implements d {
    private final x1 a;

    public c(x1 x1Var) {
        k.e(x1Var, "job");
        this.a = x1Var;
    }

    public void cancel() {
        x1.a.b(this.a, (CancellationException) null, 1, (Object) null);
    }
}
