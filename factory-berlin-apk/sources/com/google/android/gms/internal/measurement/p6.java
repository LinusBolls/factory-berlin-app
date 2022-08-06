package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class p6 {
    private static final o6<?> a = new q6();
    private static final o6<?> b = c();

    static o6<?> a() {
        return a;
    }

    static o6<?> b() {
        o6<?> o6Var = b;
        if (o6Var != null) {
            return o6Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static o6<?> c() {
        try {
            return (o6) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
