package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.g;

public final class b0<O extends a.d> extends t {
    private final c<O> a;

    public b0(c<O> cVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.a = cVar;
    }

    public final <A extends a.b, T extends c<? extends g, A>> T a(T t) {
        this.a.d(t);
        return t;
    }

    public final Looper b() {
        return this.a.h();
    }
}
