package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.api.internal.e;

public final class n0<A extends c<? extends g, a.b>> extends u {
    private final A a;

    public n0(int i2, A a2) {
        super(i2);
        this.a = a2;
    }

    public final void b(Status status) {
        this.a.b(status);
    }

    public final void c(e.a<?> aVar) {
        try {
            this.a.p(aVar.n());
        } catch (RuntimeException e2) {
            e(e2);
        }
    }

    public final void d(o oVar, boolean z) {
        oVar.b(this.a, z);
    }

    public final void e(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.a.b(new Status(10, sb.toString()));
    }
}
