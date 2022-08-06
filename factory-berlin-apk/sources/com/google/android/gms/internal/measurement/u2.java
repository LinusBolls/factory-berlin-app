package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class u2 {
    private final boolean a;

    public u2(t2 t2Var) {
        b3.c(t2Var, "BuildInfo must be non-null");
        this.a = !t2Var.b();
    }

    public final boolean a(String str) {
        b3.c(str, "flagName must not be null");
        if (!this.a) {
            return true;
        }
        return w2.a.b().a(str);
    }
}
