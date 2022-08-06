package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class s4 extends b4<Map.Entry<K, V>> {

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ t4 f2528i;

    s4(t4 t4Var) {
        this.f2528i = t4Var;
    }

    public final /* synthetic */ Object get(int i2) {
        b3.a(i2, this.f2528i.f2544k);
        int i3 = i2 * 2;
        return new AbstractMap.SimpleImmutableEntry(this.f2528i.f2543j[i3], this.f2528i.f2543j[i3 + 1]);
    }

    public final boolean j() {
        return true;
    }

    public final int size() {
        return this.f2528i.f2544k;
    }
}
