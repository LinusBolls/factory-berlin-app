package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class y2<T> extends c3<T> {

    /* renamed from: g  reason: collision with root package name */
    static final y2<Object> f2633g = new y2<>();

    private y2() {
    }

    public final boolean b() {
        return false;
    }

    public final T c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
