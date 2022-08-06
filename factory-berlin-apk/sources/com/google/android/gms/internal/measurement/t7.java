package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class t7 extends s7 {
    private t7() {
        super();
    }

    private static <E> h7<E> e(Object obj, long j2) {
        return (h7) v9.F(obj, j2);
    }

    /* access modifiers changed from: package-private */
    public final <E> void b(Object obj, Object obj2, long j2) {
        h7 e2 = e(obj, j2);
        h7 e3 = e(obj2, j2);
        int size = e2.size();
        int size2 = e3.size();
        if (size > 0 && size2 > 0) {
            if (!e2.b()) {
                e2 = e2.f(size2 + size);
            }
            e2.addAll(e3);
        }
        if (size > 0) {
            e3 = e2;
        }
        v9.j(obj, j2, e3);
    }

    /* access modifiers changed from: package-private */
    public final void d(Object obj, long j2) {
        e(obj, j2).B();
    }
}
