package com.sensorberg.smartspaces.backend.q;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import k.a0;
import k.b0;
import k.d;
import k.d0;
import k.e0;
import k.w;
import k.x;
import kotlin.jvm.internal.k;
import retrofit2.q;

/* compiled from: FunkyCachingInterceptor.kt */
public final class f {

    /* renamed from: d  reason: collision with root package name */
    public static final c f6084d = new c((DefaultConstructorMarker) null);
    @SuppressLint({"ApplySharedPref"})
    private final w a = new a(this);
    private final w b;
    /* access modifiers changed from: private */
    public final SharedPreferences c;

    /* compiled from: Interceptor.kt */
    public static final class a implements w {
        final /* synthetic */ f b;

        public a(f fVar) {
            this.b = fVar;
        }

        public d0 a(w.a aVar) {
            k.f(aVar, "chain");
            b0 j2 = aVar.j();
            if (!k.a(j2.d("x-sw-app-cache-network"), "x-sw-app-force-network")) {
                return aVar.a(j2);
            }
            b0.a i2 = j2.i();
            i2.i("x-sw-app-cache-network");
            d0 a = aVar.a(i2.b());
            String q = d0.q(a, "x-sw-content-valid-until", (String) null, 2, (Object) null);
            if (!a.z() || q == null) {
                return a;
            }
            long parseLong = Long.parseLong(q);
            this.b.c.edit().putLong(j2.k().toString(), parseLong).commit();
            long currentTimeMillis = parseLong - (System.currentTimeMillis() / 1000);
            n.a.a.a("Intercepted network call, forcing `Cache-Control` to `max-age=" + currentTimeMillis + '`', new Object[0]);
            d0.a K = a.K();
            K.a("Cache-Control", "max-age=" + currentTimeMillis);
            return K.c();
        }
    }

    /* compiled from: Interceptor.kt */
    public static final class b implements w {
        final /* synthetic */ f b;

        public b(f fVar) {
            this.b = fVar;
        }

        public d0 a(w.a aVar) {
            k.f(aVar, "chain");
            b0 j2 = aVar.j();
            if (!f.f6084d.a(j2)) {
                return aVar.a(j2);
            }
            long j3 = this.b.c.getLong(j2.k().toString(), 0);
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (j3 == 0 || j3 < currentTimeMillis) {
                n.a.a.k("Force cache failed. No cache available. Valid until is " + j3 + " and now is " + currentTimeMillis, new Object[0]);
                d0.a aVar2 = new d0.a();
                aVar2.g(428);
                aVar2.p(a0.HTTP_2);
                aVar2.m("caching-interceptor-no-cache-message");
                aVar2.b(e0.f10341h.c(x.f10543f.b("text/plain"), "caching-interceptor-no-cache-empty-body"));
                aVar2.r(j2);
                return aVar2.c();
            }
            n.a.a.a("Executing call with CacheControl.FORCE_CACHE", new Object[0]);
            b0.a i2 = j2.i();
            i2.i("x-sw-app-cache-network");
            i2.c(d.f10307n);
            return aVar.a(i2.b());
        }
    }

    /* compiled from: FunkyCachingInterceptor.kt */
    public static final class c {
        private c() {
        }

        public final boolean a(b0 b0Var) {
            k.e(b0Var, "request");
            return k.a(b0Var.d("x-sw-app-cache-network"), "x-sw-app-force-cache");
        }

        public final boolean b(q<?> qVar) {
            k.e(qVar, "response");
            if (qVar.b() == 428 && k.a(qVar.f(), "caching-interceptor-no-cache-message")) {
                e0 d2 = qVar.d();
                if (k.a(d2 != null ? d2.o() : null, "caching-interceptor-no-cache-empty-body")) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public f(SharedPreferences sharedPreferences) {
        k.e(sharedPreferences, "prefs");
        this.c = sharedPreferences;
        w.b bVar = w.a;
        w.b bVar2 = w.a;
        this.b = new b(this);
    }

    public final w b() {
        return this.b;
    }

    public final w c() {
        return this.a;
    }
}
