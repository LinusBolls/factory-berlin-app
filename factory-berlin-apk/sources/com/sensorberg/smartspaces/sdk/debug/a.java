package com.sensorberg.smartspaces.sdk.debug;

import androidx.lifecycle.n0;
import androidx.lifecycle.p0;
import kotlin.jvm.internal.k;

/* compiled from: DebugActivity.kt */
public final class a {

    /* renamed from: com.sensorberg.smartspaces.sdk.debug.a$a  reason: collision with other inner class name */
    /* compiled from: DebugActivity.kt */
    public static final class C0358a implements p0.b {
        final /* synthetic */ kotlin.e0.c.a a;

        C0358a(kotlin.e0.c.a aVar) {
            this.a = aVar;
        }

        public <T extends n0> T a(Class<T> cls) {
            k.e(cls, "modelClass");
            T d2 = this.a.d();
            if (d2 != null) {
                return (n0) d2;
            }
            throw new NullPointerException("null cannot be cast to non-null type T");
        }
    }

    public static final p0.b a(kotlin.e0.c.a<? extends n0> aVar) {
        k.e(aVar, "call");
        return new C0358a(aVar);
    }
}
