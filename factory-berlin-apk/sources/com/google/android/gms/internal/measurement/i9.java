package com.google.android.gms.internal.measurement;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class i9 implements Comparable<i9>, Map.Entry<K, V> {

    /* renamed from: g  reason: collision with root package name */
    private final K f2350g;

    /* renamed from: h  reason: collision with root package name */
    private V f2351h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ d9 f2352i;

    i9(d9 d9Var, Map.Entry<K, V> entry) {
        this(d9Var, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((i9) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return a(this.f2350g, entry.getKey()) && a(this.f2351h, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f2350g;
    }

    public final V getValue() {
        return this.f2351h;
    }

    public final int hashCode() {
        K k2 = this.f2350g;
        int i2 = 0;
        int hashCode = k2 == null ? 0 : k2.hashCode();
        V v = this.f2351h;
        if (v != null) {
            i2 = v.hashCode();
        }
        return hashCode ^ i2;
    }

    public final V setValue(V v) {
        this.f2352i.p();
        V v2 = this.f2351h;
        this.f2351h = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2350g);
        String valueOf2 = String.valueOf(this.f2351h);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    i9(d9 d9Var, K k2, V v) {
        this.f2352i = d9Var;
        this.f2350g = k2;
        this.f2351h = v;
    }
}
