package com.google.android.gms.internal.measurement;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class i5 extends WeakReference<Throwable> {
    private final int a;

    public i5(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == i5.class) {
            if (this == obj) {
                return true;
            }
            i5 i5Var = (i5) obj;
            return this.a == i5Var.a && get() == i5Var.get();
        }
    }

    public final int hashCode() {
        return this.a;
    }
}
