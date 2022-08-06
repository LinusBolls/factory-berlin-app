package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
abstract class s7 {
    private static final s7 a = new u7();
    private static final s7 b = new t7();

    private s7() {
    }

    static s7 a() {
        return a;
    }

    static s7 c() {
        return b;
    }

    /* access modifiers changed from: package-private */
    public abstract <L> void b(Object obj, Object obj2, long j2);

    /* access modifiers changed from: package-private */
    public abstract void d(Object obj, long j2);
}
