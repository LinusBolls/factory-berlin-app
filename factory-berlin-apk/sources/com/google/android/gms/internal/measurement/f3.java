package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class f3 {
    public static <T> g3<T> a(g3<T> g3Var) {
        if ((g3Var instanceof h3) || (g3Var instanceof i3)) {
            return g3Var;
        }
        if (g3Var instanceof Serializable) {
            return new i3(g3Var);
        }
        return new h3(g3Var);
    }

    public static <T> g3<T> b(@NullableDecl T t) {
        return new k3(t);
    }
}
