package com.google.crypto.tink.shaded.protobuf;

/* compiled from: ManifestSchemaFactory */
final class i0 implements h1 {
    private static final p0 b = new a();
    private final p0 a;

    /* compiled from: ManifestSchemaFactory */
    class a implements p0 {
        a() {
        }

        public o0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        public boolean b(Class<?> cls) {
            return false;
        }
    }

    /* compiled from: ManifestSchemaFactory */
    private static class b implements p0 {
        private p0[] a;

        b(p0... p0VarArr) {
            this.a = p0VarArr;
        }

        public o0 a(Class<?> cls) {
            for (p0 p0Var : this.a) {
                if (p0Var.b(cls)) {
                    return p0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        public boolean b(Class<?> cls) {
            for (p0 b : this.a) {
                if (b.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public i0() {
        this(b());
    }

    private static p0 b() {
        return new b(x.c(), c());
    }

    private static p0 c() {
        try {
            return (p0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return b;
        }
    }

    private static boolean d(o0 o0Var) {
        return o0Var.b() == b1.PROTO2;
    }

    private static <T> g1<T> e(Class<T> cls, o0 o0Var) {
        if (y.class.isAssignableFrom(cls)) {
            if (d(o0Var)) {
                return t0.R(cls, o0Var, x0.b(), g0.b(), i1.M(), s.b(), n0.b());
            }
            return t0.R(cls, o0Var, x0.b(), g0.b(), i1.M(), (q<?>) null, n0.b());
        } else if (d(o0Var)) {
            return t0.R(cls, o0Var, x0.a(), g0.a(), i1.H(), s.a(), n0.a());
        } else {
            return t0.R(cls, o0Var, x0.a(), g0.a(), i1.I(), (q<?>) null, n0.a());
        }
    }

    public <T> g1<T> a(Class<T> cls) {
        i1.J(cls);
        o0 a2 = this.a.a(cls);
        if (!a2.a()) {
            return e(cls, a2);
        }
        if (y.class.isAssignableFrom(cls)) {
            return u0.m(i1.M(), s.b(), a2.c());
        }
        return u0.m(i1.H(), s.a(), a2.c());
    }

    private i0(p0 p0Var) {
        a0.b(p0Var, "messageInfoFactory");
        this.a = p0Var;
    }
}
