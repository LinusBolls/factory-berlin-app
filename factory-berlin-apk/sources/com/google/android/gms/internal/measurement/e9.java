package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class e9 extends k9 {

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ d9 f2280h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private e9(d9 d9Var) {
        super(d9Var, (b9) null);
        this.f2280h = d9Var;
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new f9(this.f2280h, (b9) null);
    }

    /* synthetic */ e9(d9 d9Var, b9 b9Var) {
        this(d9Var);
    }
}
