package com.sensorberg.smartspaces.backend.m;

import com.sensorberg.smartspaces.backend.model.AuthToken;
import g.e.k.e;
import g.e.k.h;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: ObservableAuthToken.kt */
public final class d {
    private final g.e.k.d<AuthToken> a;
    private final g.e.k.a b;

    /* compiled from: ObservableAuthToken.kt */
    static final class a extends l implements kotlin.e0.c.l<AuthToken, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f6032h = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean o(AuthToken authToken) {
            return Boolean.valueOf(authToken != null);
        }
    }

    public d(g.e.k.a aVar, com.sensorberg.encryptor.d dVar) {
        k.e(aVar, "cancellation");
        k.e(dVar, "encryptor");
        this.b = aVar;
        this.a = new c(dVar.c("auth_token", AuthToken.class));
    }

    public final boolean a() {
        AuthToken n2 = this.a.n();
        return (n2 != null ? n2.accessToken : null) != null;
    }

    public final e<Boolean> b() {
        return h.a.b(this.a, a.f6032h);
    }

    public final void c(kotlin.e0.c.l<? super AuthToken, x> lVar) {
        k.e(lVar, "callback");
        h.a.i(this.a, this.b, lVar);
    }

    public final void d(AuthToken authToken) {
        k.e(authToken, "authToken");
        this.a.w(authToken);
    }

    public final <T> e<T> e(kotlin.e0.c.l<? super AuthToken, ? extends e<T>> lVar) {
        k.e(lVar, "callback");
        return h.a.n(this.a, this.b, lVar);
    }

    public final Object f(kotlin.c0.d<? super AuthToken> dVar) {
        return f.a(this.a, this.b, dVar);
    }
}
