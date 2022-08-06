package com.google.android.gms.internal.measurement;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class t4<K, V> extends l4<Map.Entry<K, V>> {

    /* renamed from: i  reason: collision with root package name */
    private final transient h4<K, V> f2542i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final transient Object[] f2543j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final transient int f2544k;

    t4(h4<K, V> h4Var, Object[] objArr, int i2, int i3) {
        this.f2542i = h4Var;
        this.f2543j = objArr;
        this.f2544k = i3;
    }

    /* access modifiers changed from: package-private */
    public final int a(Object[] objArr, int i2) {
        return l().a(objArr, i2);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f2542i.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final y4<Map.Entry<K, V>> iterator() {
        return (y4) l().iterator();
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final b4<Map.Entry<K, V>> m() {
        return new s4(this);
    }

    public final int size() {
        return this.f2544k;
    }
}
