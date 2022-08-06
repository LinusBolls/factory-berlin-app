package com.google.android.gms.internal.measurement;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class v3 extends m3<K, V> {
    @NullableDecl

    /* renamed from: g  reason: collision with root package name */
    private final K f2573g;

    /* renamed from: h  reason: collision with root package name */
    private int f2574h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ q3 f2575i;

    v3(q3 q3Var, int i2) {
        this.f2575i = q3Var;
        this.f2573g = q3Var.f2489i[i2];
        this.f2574h = i2;
    }

    private final void a() {
        int i2 = this.f2574h;
        if (i2 == -1 || i2 >= this.f2575i.size() || !z2.a(this.f2573g, this.f2575i.f2489i[this.f2574h])) {
            this.f2574h = this.f2575i.d(this.f2573g);
        }
    }

    @NullableDecl
    public final K getKey() {
        return this.f2573g;
    }

    @NullableDecl
    public final V getValue() {
        Map l2 = this.f2575i.l();
        if (l2 != null) {
            return l2.get(this.f2573g);
        }
        a();
        int i2 = this.f2574h;
        if (i2 == -1) {
            return null;
        }
        return this.f2575i.f2490j[i2];
    }

    public final V setValue(V v) {
        Map l2 = this.f2575i.l();
        if (l2 != null) {
            return l2.put(this.f2573g, v);
        }
        a();
        int i2 = this.f2574h;
        if (i2 == -1) {
            this.f2575i.put(this.f2573g, v);
            return null;
        }
        V[] vArr = this.f2575i.f2490j;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }
}
