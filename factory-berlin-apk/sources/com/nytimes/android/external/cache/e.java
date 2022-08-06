package com.nytimes.android.external.cache;

import com.nytimes.android.external.cache.k;
import com.nytimes.android.external.cache.l;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: CacheBuilder */
public final class e<K, V> {
    static final u p = new a();
    private static final Logger q = Logger.getLogger(e.class.getName());
    boolean a = true;
    int b = -1;
    int c = -1;

    /* renamed from: d  reason: collision with root package name */
    long f4636d = -1;

    /* renamed from: e  reason: collision with root package name */
    long f4637e = -1;

    /* renamed from: f  reason: collision with root package name */
    x<? super K, ? super V> f4638f;

    /* renamed from: g  reason: collision with root package name */
    k.r f4639g;

    /* renamed from: h  reason: collision with root package name */
    k.r f4640h;

    /* renamed from: i  reason: collision with root package name */
    long f4641i = -1;

    /* renamed from: j  reason: collision with root package name */
    long f4642j = -1;

    /* renamed from: k  reason: collision with root package name */
    long f4643k = -1;

    /* renamed from: l  reason: collision with root package name */
    g<Object> f4644l;

    /* renamed from: m  reason: collision with root package name */
    g<Object> f4645m;

    /* renamed from: n  reason: collision with root package name */
    q<? super K, ? super V> f4646n;
    u o;

    /* compiled from: CacheBuilder */
    class a extends u {
        a() {
        }

        public long a() {
            return 0;
        }
    }

    /* compiled from: CacheBuilder */
    enum b implements q<Object, Object> {
        INSTANCE;

        public void a(r<Object, Object> rVar) {
        }
    }

    /* compiled from: CacheBuilder */
    enum c implements x<Object, Object> {
        INSTANCE;

        public int a(Object obj, Object obj2) {
            return 1;
        }
    }

    e() {
    }

    private void b() {
        o.d(this.f4643k == -1, "refreshAfterWrite requires a LoadingCache");
    }

    private void c() {
        boolean z = true;
        if (this.f4638f == null) {
            if (this.f4637e != -1) {
                z = false;
            }
            o.d(z, "maximumWeight requires weigher");
        } else if (this.a) {
            if (this.f4637e == -1) {
                z = false;
            }
            o.d(z, "weigher requires maximumWeight");
        } else if (this.f4637e == -1) {
            q.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    public static e<Object, Object> q() {
        return new e<>();
    }

    public <K1 extends K, V1 extends V> d<K1, V1> a() {
        c();
        b();
        return new k.m(this);
    }

    /* access modifiers changed from: package-private */
    public int d() {
        int i2 = this.c;
        if (i2 == -1) {
            return 4;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public long e() {
        long j2 = this.f4642j;
        if (j2 == -1) {
            return 0;
        }
        return j2;
    }

    /* access modifiers changed from: package-private */
    public long f() {
        long j2 = this.f4641i;
        if (j2 == -1) {
            return 0;
        }
        return j2;
    }

    /* access modifiers changed from: package-private */
    public int g() {
        int i2 = this.b;
        if (i2 == -1) {
            return 16;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public g<Object> h() {
        return (g) l.a(this.f4644l, i().a());
    }

    /* access modifiers changed from: package-private */
    public k.r i() {
        return (k.r) l.a(this.f4639g, k.r.STRONG);
    }

    /* access modifiers changed from: package-private */
    public long j() {
        if (this.f4641i == 0 || this.f4642j == 0) {
            return 0;
        }
        return this.f4638f == null ? this.f4636d : this.f4637e;
    }

    /* access modifiers changed from: package-private */
    public long k() {
        long j2 = this.f4643k;
        if (j2 == -1) {
            return 0;
        }
        return j2;
    }

    /* access modifiers changed from: package-private */
    public <K1 extends K, V1 extends V> q<K1, V1> l() {
        return (q) l.a(this.f4646n, b.INSTANCE);
    }

    /* access modifiers changed from: package-private */
    public u m(boolean z) {
        u uVar = this.o;
        if (uVar != null) {
            return uVar;
        }
        return z ? u.b() : p;
    }

    /* access modifiers changed from: package-private */
    public g<Object> n() {
        return (g) l.a(this.f4645m, o().a());
    }

    /* access modifiers changed from: package-private */
    public k.r o() {
        return (k.r) l.a(this.f4640h, k.r.STRONG);
    }

    /* access modifiers changed from: package-private */
    public <K1 extends K, V1 extends V> x<K1, V1> p() {
        return (x) l.a(this.f4638f, c.INSTANCE);
    }

    public String toString() {
        l.b b2 = l.b(this);
        int i2 = this.b;
        if (i2 != -1) {
            b2.a("initialCapacity", i2);
        }
        int i3 = this.c;
        if (i3 != -1) {
            b2.a("concurrencyLevel", i3);
        }
        long j2 = this.f4636d;
        if (j2 != -1) {
            b2.b("maximumSize", j2);
        }
        long j3 = this.f4637e;
        if (j3 != -1) {
            b2.b("maximumWeight", j3);
        }
        if (this.f4641i != -1) {
            b2.c("expireAfterWrite", this.f4641i + "ns");
        }
        if (this.f4642j != -1) {
            b2.c("expireAfterAccess", this.f4642j + "ns");
        }
        k.r rVar = this.f4639g;
        if (rVar != null) {
            b2.c("keyStrength", c.b(rVar.toString()));
        }
        k.r rVar2 = this.f4640h;
        if (rVar2 != null) {
            b2.c("valueStrength", c.b(rVar2.toString()));
        }
        if (this.f4644l != null) {
            b2.g("keyEquivalence");
        }
        if (this.f4645m != null) {
            b2.g("valueEquivalence");
        }
        if (this.f4646n != null) {
            b2.g("removalListener");
        }
        return b2.toString();
    }
}
