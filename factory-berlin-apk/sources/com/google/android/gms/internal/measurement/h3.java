package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class h3<T> implements g3<T> {

    /* renamed from: g  reason: collision with root package name */
    private volatile g3<T> f2327g;

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f2328h;
    @NullableDecl

    /* renamed from: i  reason: collision with root package name */
    private T f2329i;

    h3(g3<T> g3Var) {
        b3.b(g3Var);
        this.f2327g = g3Var;
    }

    public final T b() {
        if (!this.f2328h) {
            synchronized (this) {
                if (!this.f2328h) {
                    T b = this.f2327g.b();
                    this.f2329i = b;
                    this.f2328h = true;
                    this.f2327g = null;
                    return b;
                }
            }
        }
        return this.f2329i;
    }

    public final String toString() {
        Object obj = this.f2327g;
        if (obj == null) {
            String valueOf = String.valueOf(this.f2329i);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
