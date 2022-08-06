package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class i3<T> implements g3<T>, Serializable {

    /* renamed from: g  reason: collision with root package name */
    private final g3<T> f2347g;

    /* renamed from: h  reason: collision with root package name */
    private volatile transient boolean f2348h;
    @NullableDecl

    /* renamed from: i  reason: collision with root package name */
    private transient T f2349i;

    i3(g3<T> g3Var) {
        b3.b(g3Var);
        this.f2347g = g3Var;
    }

    public final T b() {
        if (!this.f2348h) {
            synchronized (this) {
                if (!this.f2348h) {
                    T b = this.f2347g.b();
                    this.f2349i = b;
                    this.f2348h = true;
                    return b;
                }
            }
        }
        return this.f2349i;
    }

    public final String toString() {
        Object obj;
        if (this.f2348h) {
            String valueOf = String.valueOf(this.f2349i);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.f2347g;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
