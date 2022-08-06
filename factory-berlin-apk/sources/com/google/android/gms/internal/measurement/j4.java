package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public class j4<K, V> extends o3<K, V> implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    private final transient h4<K, ? extends c4<V>> f2363g;

    j4(h4<K, ? extends c4<V>> h4Var, int i2) {
        this.f2363g = h4Var;
    }

    public final boolean a(@NullableDecl Object obj) {
        return obj != null && super.a(obj);
    }

    public final /* synthetic */ Map b() {
        return this.f2363g;
    }
}
