package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class l9 implements Iterator<Map.Entry<K, V>> {

    /* renamed from: g  reason: collision with root package name */
    private int f2403g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2404h;

    /* renamed from: i  reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f2405i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ d9 f2406j;

    private l9(d9 d9Var) {
        this.f2406j = d9Var;
        this.f2403g = -1;
    }

    private final Iterator<Map.Entry<K, V>> a() {
        if (this.f2405i == null) {
            this.f2405i = this.f2406j.f2268i.entrySet().iterator();
        }
        return this.f2405i;
    }

    public final boolean hasNext() {
        if (this.f2403g + 1 < this.f2406j.f2267h.size() || (!this.f2406j.f2268i.isEmpty() && a().hasNext())) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.f2404h = true;
        int i2 = this.f2403g + 1;
        this.f2403g = i2;
        if (i2 < this.f2406j.f2267h.size()) {
            return (Map.Entry) this.f2406j.f2267h.get(this.f2403g);
        }
        return (Map.Entry) a().next();
    }

    public final void remove() {
        if (this.f2404h) {
            this.f2404h = false;
            this.f2406j.p();
            if (this.f2403g < this.f2406j.f2267h.size()) {
                d9 d9Var = this.f2406j;
                int i2 = this.f2403g;
                this.f2403g = i2 - 1;
                Object unused = d9Var.k(i2);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    /* synthetic */ l9(d9 d9Var, b9 b9Var) {
        this(d9Var);
    }
}
