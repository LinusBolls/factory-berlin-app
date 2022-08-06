package com.sensorberg.notifications.sdk.internal.m.b;

import android.content.Context;
import com.squareup.moshi.n;
import java.io.File;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import k.i0.a;
import k.w;
import k.z;
import kotlin.jvm.internal.k;
import retrofit2.f;
import retrofit2.r;

/* compiled from: Transport.kt */
public final class c {
    private static final a a = new a();
    public static final c b = new c();

    /* compiled from: Transport.kt */
    public static final class a implements a.b {
        a() {
        }

        public void a(String str) {
            k.f(str, "message");
            n.a.a.j(str, new Object[0]);
        }
    }

    private c() {
    }

    public final z a(Context context, boolean z, List<? extends w> list) {
        k.f(context, "context");
        k.f(list, "interceptors");
        z.a aVar = new z.a();
        aVar.M(true);
        for (w b2 : list) {
            aVar.b(b2);
        }
        if (z) {
            k.i0.a aVar2 = new k.i0.a(a);
            aVar2.c(a.C0748a.BODY);
            aVar.b(aVar2);
        }
        aVar.d(new k.c(new File(context.getCacheDir(), "HttpResponseCache"), 10485760));
        long j2 = (long) 30;
        aVar.g(j2, TimeUnit.SECONDS);
        aVar.L(j2, TimeUnit.SECONDS);
        aVar.N(j2, TimeUnit.SECONDS);
        return aVar.c();
    }

    public final a b(String str, z zVar, f.a aVar) {
        k.f(str, "baseUrl");
        k.f(zVar, "client");
        k.f(aVar, "converter");
        r.b bVar = new r.b();
        bVar.b(str);
        bVar.g(zVar);
        bVar.a(aVar);
        bVar.f(Executors.newSingleThreadExecutor());
        Object b2 = bVar.d().b(a.class);
        k.b(b2, "Retrofit.Builder()\n\t\t\t.b…>(BackendApi::class.java)");
        return (a) b2;
    }

    public final f.a c(n nVar) {
        k.f(nVar, "moshi");
        retrofit2.w.b.a f2 = retrofit2.w.b.a.f(nVar);
        k.b(f2, "MoshiConverterFactory.create(moshi)");
        return f2;
    }
}
