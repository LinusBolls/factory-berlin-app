package com.google.android.gms.internal.measurement;

import java.util.Collection;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
abstract class l3<K, V> implements p4<K, V> {
    l3() {
    }

    public boolean a(@NullableDecl Object obj) {
        for (Collection contains : b().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map<K, Collection<V>> b();

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p4) {
            return b().equals(((p4) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b().toString();
    }
}
