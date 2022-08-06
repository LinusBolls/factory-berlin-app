package com.sensorberg.smartspaces.sdk.internal;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.sensorberg.smartspaces.sdk.exception.LoggedOutException;
import g.e.k.e;
import g.e.k.h;
import g.e.m.a;
import kotlin.jvm.internal.k;

/* compiled from: LiveDataHelper.kt */
public final class f {
    public static final <T, P> LiveData<a<T, P>> a(d dVar) {
        k.e(dVar, "component");
        e0 e0Var = new e0();
        a.C0681a aVar = a.f9908e;
        String simpleName = dVar.getClass().getSimpleName();
        k.d(simpleName, "component.javaClass.simpleName");
        e0Var.u(aVar.c(new LoggedOutException(simpleName)));
        return e0Var;
    }

    public static final <T> e<T> b(e<T> eVar, g.e.k.a aVar) {
        k.e(eVar, "$this$nullOnCancelled");
        k.e(aVar, "cancellation");
        return h.a.h(eVar, aVar);
    }
}
