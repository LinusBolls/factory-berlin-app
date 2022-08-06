package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class e8 {
    private static final b8 a = c();
    private static final b8 b = new f8();

    static b8 a() {
        return a;
    }

    static b8 b() {
        return b;
    }

    private static b8 c() {
        try {
            return (b8) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
