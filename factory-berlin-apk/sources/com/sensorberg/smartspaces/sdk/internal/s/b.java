package com.sensorberg.smartspaces.sdk.internal.s;

import kotlin.jvm.internal.k;
import m.a.c.a;

/* compiled from: SmartspacesKoinComponent.kt */
final class b {
    private static m.a.c.b a;
    public static final b b = new b();

    private b() {
    }

    public final void a() {
        b().a();
        a = null;
    }

    public final a b() {
        a d2;
        m.a.c.b bVar = a;
        if (bVar != null && (d2 = bVar.d()) != null) {
            return d2;
        }
        throw new IllegalStateException("SmartspacesKoinInstance has not been initialised");
    }

    public final void c(m.a.c.b bVar) {
        k.e(bVar, "koinInstance");
        a = bVar;
    }
}
