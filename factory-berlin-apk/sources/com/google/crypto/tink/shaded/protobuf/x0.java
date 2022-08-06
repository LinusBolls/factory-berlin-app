package com.google.crypto.tink.shaded.protobuf;

/* compiled from: NewInstanceSchemas */
final class x0 {
    private static final v0 a = c();
    private static final v0 b = new w0();

    static v0 a() {
        return a;
    }

    static v0 b() {
        return b;
    }

    private static v0 c() {
        try {
            return (v0) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
