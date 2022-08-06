package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class e3<T> extends c3<T> {

    /* renamed from: g  reason: collision with root package name */
    private final T f2278g;

    e3(T t) {
        this.f2278g = t;
    }

    public final boolean b() {
        return true;
    }

    public final T c() {
        return this.f2278g;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof e3) {
            return this.f2278g.equals(((e3) obj).f2278g);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2278g.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2278g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
