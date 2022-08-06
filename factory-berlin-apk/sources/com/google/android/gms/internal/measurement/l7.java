package com.google.android.gms.internal.measurement;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class l7<K> implements Map.Entry<K, Object> {

    /* renamed from: g  reason: collision with root package name */
    private Map.Entry<K, j7> f2402g;

    private l7(Map.Entry<K, j7> entry) {
        this.f2402g = entry;
    }

    public final j7 a() {
        return this.f2402g.getValue();
    }

    public final K getKey() {
        return this.f2402g.getKey();
    }

    public final Object getValue() {
        if (this.f2402g.getValue() == null) {
            return null;
        }
        j7.e();
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof j8) {
            return this.f2402g.getValue().a((j8) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
