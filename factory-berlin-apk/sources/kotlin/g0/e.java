package kotlin.g0;

import kotlin.jvm.internal.k;

/* compiled from: Ranges.kt */
class e {
    public static final void a(boolean z, Number number) {
        k.e(number, "step");
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
        }
    }
}
