package com.google.android.gms.internal.measurement;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
abstract class m3<K, V> implements Map.Entry<K, V> {
    m3() {
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (!z2.a(getKey(), entry.getKey()) || !z2.a(getValue(), entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public abstract K getKey();

    public abstract V getValue();

    public int hashCode() {
        int i2;
        Object key = getKey();
        Object value = getValue();
        int i3 = 0;
        if (key == null) {
            i2 = 0;
        } else {
            i2 = key.hashCode();
        }
        if (value != null) {
            i3 = value.hashCode();
        }
        return i2 ^ i3;
    }

    public String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
