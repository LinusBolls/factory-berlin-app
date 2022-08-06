package com.sensorberg.smartspaces.backend.m;

import com.sensorberg.encryptor.d;
import com.sensorberg.smartspaces.backend.model.UserDevice;
import g.e.k.a;
import g.e.k.e;
import g.e.k.h;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: ObservableUserDevice.kt */
public final class i {
    private final c<UserDevice> a;
    private final a b;

    public i(a aVar, d dVar) {
        k.e(aVar, "cancellation");
        k.e(dVar, "encryptor");
        this.b = aVar;
        this.a = new c<>(dVar.c("device", UserDevice.class));
    }

    public final String a() {
        UserDevice n2 = this.a.n();
        if (n2 != null) {
            return n2.blueIdIdentifier;
        }
        return null;
    }

    public final String b() {
        UserDevice n2 = this.a.n();
        if (n2 != null) {
            return n2.id;
        }
        return null;
    }

    public final <T> e<T> c(l<? super UserDevice, ? extends T> lVar) {
        k.e(lVar, "mapper");
        return h.a.c(this.a, this.b, lVar);
    }

    public final void d(l<? super UserDevice, x> lVar) {
        k.e(lVar, "callback");
        h.a.i(this.a, this.b, lVar);
    }

    public final void e(UserDevice userDevice) {
        k.e(userDevice, "userDevice");
        this.a.w(userDevice);
    }

    public final <T> e<T> f(l<? super UserDevice, ? extends e<T>> lVar) {
        k.e(lVar, "callback");
        return h.a.n(this.a, this.b, lVar);
    }
}
