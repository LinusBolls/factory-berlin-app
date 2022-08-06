package com.sensorberg.aliolihttp;

import android.content.Context;
import com.sensorberg.aliolihttp.storage.a;
import com.sensorberg.aliolihttp.storage.d.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import k.b0;
import k.c0;
import k.d0;
import k.u;
import k.w;
import k.x;
import kotlin.jvm.internal.k;
import l.f;

/* compiled from: AlioliHttpInterceptor.kt */
public final class b implements w {
    private final Context b;
    private final long c;

    /* renamed from: d  reason: collision with root package name */
    private final TimeUnit f4831d;

    public b(Context context, long j2, TimeUnit timeUnit) {
        k.f(context, "context");
        k.f(timeUnit, "timeUnit");
        this.b = context;
        this.c = j2;
        this.f4831d = timeUnit;
    }

    private final boolean b(u uVar, String str) {
        return uVar.a(str) != null;
    }

    private final long c(u uVar) {
        long longValue;
        List<String> k2 = uVar.k("x-alioli-http-valid-until");
        k.b(k2, "values(HEADER_KEY_VALID_UNTIL)");
        String str = (String) v.A(k2);
        Long k3 = str != null ? o.k(str) : null;
        long currentTimeMillis = System.currentTimeMillis();
        if (k3 == null) {
            longValue = 604800000;
        } else {
            longValue = k3.longValue();
        }
        return currentTimeMillis + longValue;
    }

    private final boolean d(String str) {
        return k.a(str, "x-alioli-http-valid-until");
    }

    private final boolean e(b0 b0Var) {
        u f2 = b0Var.f();
        k.b(f2, "request.headers()");
        return b(f2, "x-alioli-http-valid-until");
    }

    private final d0 f(w.a aVar, b0 b0Var, a aVar2, long j2) {
        try {
            d0 a = aVar.a(b0Var);
            k.b(a, "chain.proceed(request)");
            if (a.z()) {
                n.a.a.a("Alioli: response success " + b0Var.k(), new Object[0]);
                aVar2.a(j2);
            } else {
                n.a.a.a("Alioli: response not success " + b0Var.k() + ". Enqueueing", new Object[0]);
                AlioliHttpWorker.f4828n.b(this.c, this.f4831d);
            }
            return a;
        } catch (Throwable th) {
            n.a.a.a("Alioli: response fail with " + th.getMessage() + " for " + b0Var.k() + ". Enqueueing", new Object[0]);
            AlioliHttpWorker.f4828n.b(this.c, this.f4831d);
            throw th;
        }
    }

    private final long g(b0 b0Var, a aVar) {
        u f2 = b0Var.f();
        k.b(f2, "request.headers()");
        String h2 = b0Var.h();
        k.b(h2, "request.method()");
        String vVar = b0Var.k().toString();
        k.b(vVar, "request.url().toString()");
        return aVar.b(new com.sensorberg.aliolihttp.storage.d.b(h2, vVar, h(b0Var.a()), i(f2), c(f2), 0, 32, (DefaultConstructorMarker) null));
    }

    private final com.sensorberg.aliolihttp.storage.d.a h(c0 c0Var) {
        x b2;
        String xVar;
        String j2 = j(c0Var);
        if (j2 == null || c0Var == null || (b2 = c0Var.b()) == null || (xVar = b2.toString()) == null) {
            return null;
        }
        return new com.sensorberg.aliolihttp.storage.d.a(j2, xVar);
    }

    private final ArrayList<c> i(u uVar) {
        ArrayList<c> arrayList = new ArrayList<>();
        Set<String> e2 = uVar.e();
        k.b(e2, "headers.names()");
        for (String str : e2) {
            k.b(str, "name");
            if (!d(str)) {
                List<String> k2 = uVar.k(str);
                k.b(k2, "headers.values(name)");
                for (String str2 : k2) {
                    k.b(str2, "value");
                    arrayList.add(new c(str, str2));
                }
            }
        }
        return arrayList;
    }

    private final String j(c0 c0Var) {
        if (c0Var == null) {
            return null;
        }
        try {
            f fVar = new f();
            c0Var.i(fVar);
            return fVar.P0();
        } catch (IOException unused) {
            return null;
        }
    }

    public d0 a(w.a aVar) {
        k.f(aVar, "chain");
        b0 j2 = aVar.j();
        k.b(j2, "chain.request()");
        if (!e(j2)) {
            d0 a = aVar.a(j2);
            k.b(a, "chain.proceed(request)");
            return a;
        }
        a y = com.sensorberg.aliolihttp.storage.c.b.a(this.b).y();
        return f(aVar, j2, y, g(j2, y));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Context context, long j2, TimeUnit timeUnit, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? 15 : j2, (i2 & 4) != 0 ? TimeUnit.MINUTES : timeUnit);
    }
}
