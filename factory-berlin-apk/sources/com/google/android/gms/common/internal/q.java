package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.g;
import com.google.android.gms.tasks.h;

public class q {
    private static final b a = new a0();

    public interface a<R extends g, T> {
        T a(R r);
    }

    public interface b {
        ApiException a(Status status);
    }

    public static <R extends g, T> com.google.android.gms.tasks.g<T> a(e<R> eVar, a<R, T> aVar) {
        b bVar = a;
        h hVar = new h();
        eVar.c(new b0(eVar, hVar, aVar, bVar));
        return hVar.a();
    }

    public static <R extends g> com.google.android.gms.tasks.g<Void> b(e<R> eVar) {
        return a(eVar, new c0());
    }
}
