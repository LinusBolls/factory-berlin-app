package com.sensorberg.noiise;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.m0;
import java.net.URL;
import kotlin.e;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: NoiiseViewModel.kt */
public final class c extends g.e.d.t.a.a {
    private final LiveData<Boolean> p;
    private final e q;

    /* compiled from: NoiiseViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: NoiiseViewModel.kt */
    static final class b<I, O> implements e.b.a.c.a<String, Boolean> {
        final /* synthetic */ c a;

        b(c cVar) {
            this.a = cVar;
        }

        /* renamed from: b */
        public final Boolean a(String str) {
            return Boolean.valueOf(this.a.z(str));
        }
    }

    /* renamed from: com.sensorberg.noiise.c$c  reason: collision with other inner class name */
    /* compiled from: NoiiseViewModel.kt */
    static final class C0163c extends l implements kotlin.e0.c.a<e0<URL>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f5127h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f5128i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0163c(String str, String str2) {
            super(0);
            this.f5127h = str;
            this.f5128i = str2;
        }

        /* renamed from: a */
        public final e0<URL> d() {
            String h0 = q.h0(this.f5127h, "https://");
            return new e0<>(new URL("https://noiise-react.sensorberg-ux.com/?client_id=" + this.f5128i + "&hostname=" + h0 + "&access_token=4B2_aFmbBciemRrSQV8GluO5HCk-3JSGnp5if3QP8Xo"));
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public c(String str, String str2) {
        k.e(str, "oauthId");
        k.e(str2, "baseUrl");
        LiveData<Boolean> b2 = m0.b(t(), new b(this));
        k.d(b2, "Transformations.map(onUr…anGoBack(loadedUrl)\n    }");
        this.p = b2;
        this.q = g.a(new C0163c(str2, str));
    }

    public final LiveData<Boolean> A() {
        return this.p;
    }

    public final LiveData<URL> B() {
        return (LiveData) this.q.getValue();
    }

    public final boolean z(String str) {
        return str != null && (k.a(str, "https://noiise-react.sensorberg-ux.com/#/") ^ true);
    }
}
