package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class x7 implements g8 {
    private g8[] a;

    x7(g8... g8VarArr) {
        this.a = g8VarArr;
    }

    public final boolean a(Class<?> cls) {
        for (g8 a2 : this.a) {
            if (a2.a(cls)) {
                return true;
            }
        }
        return false;
    }

    public final h8 b(Class<?> cls) {
        for (g8 g8Var : this.a) {
            if (g8Var.a(cls)) {
                return g8Var.b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
