package com.google.crypto.tink.shaded.protobuf;

/* compiled from: ExtensionRegistryFactory */
final class o {
    static final Class<?> a = c();

    public static p a() {
        p b = b("getEmptyRegistry");
        return b != null ? b : p.f3778d;
    }

    private static final p b(String str) {
        Class<?> cls = a;
        if (cls == null) {
            return null;
        }
        try {
            return (p) cls.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class<?> c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
