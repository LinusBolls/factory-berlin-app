package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class k3<T> implements g3<T>, Serializable {
    @NullableDecl

    /* renamed from: g  reason: collision with root package name */
    private final T f2373g;

    k3(@NullableDecl T t) {
        this.f2373g = t;
    }

    public final T b() {
        return this.f2373g;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof k3) {
            return z2.a(this.f2373g, ((k3) obj).f2373g);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2373g});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2373g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
