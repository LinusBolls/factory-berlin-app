package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.z6;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class v7 implements a9 {
    private static final g8 b = new y7();
    private final g8 a;

    public v7() {
        this(new x7(a7.c(), b()));
    }

    private static g8 b() {
        try {
            return (g8) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return b;
        }
    }

    private static boolean c(h8 h8Var) {
        return h8Var.b() == z6.e.f2654i;
    }

    public final <T> y8<T> a(Class<T> cls) {
        Class<z6> cls2 = z6.class;
        z8.p(cls);
        h8 b2 = this.a.b(cls);
        if (b2.c()) {
            if (cls2.isAssignableFrom(cls)) {
                return p8.j(z8.B(), p6.a(), b2.d());
            }
            return p8.j(z8.f(), p6.b(), b2.d());
        } else if (cls2.isAssignableFrom(cls)) {
            if (c(b2)) {
                return n8.q(cls, b2, t8.b(), s7.c(), z8.B(), p6.a(), e8.b());
            }
            return n8.q(cls, b2, t8.b(), s7.c(), z8.B(), (o6<?>) null, e8.b());
        } else if (c(b2)) {
            return n8.q(cls, b2, t8.a(), s7.a(), z8.f(), p6.b(), e8.a());
        } else {
            return n8.q(cls, b2, t8.a(), s7.a(), z8.v(), (o6<?>) null, e8.a());
        }
    }

    private v7(g8 g8Var) {
        b7.f(g8Var, "messageInfoFactory");
        this.a = g8Var;
    }
}
