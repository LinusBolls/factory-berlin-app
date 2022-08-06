package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class z3 {
    static int a(int i2) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i2) * -862048943), 15)) * 461845907);
    }

    static int b(@NullableDecl Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}
