package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class t8 {
    private static final r8 a = c();
    private static final r8 b = new q8();

    static r8 a() {
        return a;
    }

    static r8 b() {
        return b;
    }

    private static r8 c() {
        try {
            return (r8) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
