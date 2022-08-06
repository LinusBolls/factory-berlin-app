package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class f9 implements Iterator<Map.Entry<K, V>> {

    /* renamed from: g  reason: collision with root package name */
    private int f2297g;

    /* renamed from: h  reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f2298h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ d9 f2299i;

    private f9(d9 d9Var) {
        this.f2299i = d9Var;
        this.f2297g = this.f2299i.f2267h.size();
    }

    private final Iterator<Map.Entry<K, V>> a() {
        if (this.f2298h == null) {
            this.f2298h = this.f2299i.f2271l.entrySet().iterator();
        }
        return this.f2298h;
    }

    public final boolean hasNext() {
        int i2 = this.f2297g;
        return (i2 > 0 && i2 <= this.f2299i.f2267h.size()) || a().hasNext();
    }

    public final /* synthetic */ Object next() {
        if (a().hasNext()) {
            return (Map.Entry) a().next();
        }
        List g2 = this.f2299i.f2267h;
        int i2 = this.f2297g - 1;
        this.f2297g = i2;
        return (Map.Entry) g2.get(i2);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ f9(d9 d9Var, b9 b9Var) {
        this(d9Var);
    }
}
