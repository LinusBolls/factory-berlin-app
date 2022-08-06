package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class v4<K> extends l4<K> {

    /* renamed from: i  reason: collision with root package name */
    private final transient h4<K, ?> f2576i;

    /* renamed from: j  reason: collision with root package name */
    private final transient b4<K> f2577j;

    v4(h4<K, ?> h4Var, b4<K> b4Var) {
        this.f2576i = h4Var;
        this.f2577j = b4Var;
    }

    /* access modifiers changed from: package-private */
    public final int a(Object[] objArr, int i2) {
        return l().a(objArr, i2);
    }

    public final boolean contains(@NullableDecl Object obj) {
        return this.f2576i.get(obj) != null;
    }

    /* renamed from: d */
    public final y4<K> iterator() {
        return (y4) l().iterator();
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        return true;
    }

    public final b4<K> l() {
        return this.f2577j;
    }

    public final int size() {
        return this.f2576i.size();
    }
}
