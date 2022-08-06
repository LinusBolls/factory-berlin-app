package com.google.crypto.tink.shaded.protobuf;

/* compiled from: ExtensionSchemas */
final class s {
    private static final q<?> a = new r();
    private static final q<?> b = c();

    static q<?> a() {
        q<?> qVar = b;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static q<?> b() {
        return a;
    }

    private static q<?> c() {
        try {
            return (q) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
