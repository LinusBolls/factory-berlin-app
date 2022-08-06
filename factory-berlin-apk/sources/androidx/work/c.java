package androidx.work;

import android.os.Build;

/* compiled from: Constraints */
public final class c {

    /* renamed from: i  reason: collision with root package name */
    public static final c f1573i = new a().a();
    private j a = j.NOT_REQUIRED;
    private boolean b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1574d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1575e;

    /* renamed from: f  reason: collision with root package name */
    private long f1576f = -1;

    /* renamed from: g  reason: collision with root package name */
    private long f1577g = -1;

    /* renamed from: h  reason: collision with root package name */
    private d f1578h = new d();

    /* compiled from: Constraints */
    public static final class a {
        boolean a = false;
        boolean b = false;
        j c = j.NOT_REQUIRED;

        /* renamed from: d  reason: collision with root package name */
        boolean f1579d = false;

        /* renamed from: e  reason: collision with root package name */
        boolean f1580e = false;

        /* renamed from: f  reason: collision with root package name */
        long f1581f = -1;

        /* renamed from: g  reason: collision with root package name */
        long f1582g = -1;

        /* renamed from: h  reason: collision with root package name */
        d f1583h = new d();

        public c a() {
            return new c(this);
        }

        public a b(j jVar) {
            this.c = jVar;
            return this;
        }
    }

    public c() {
    }

    public d a() {
        return this.f1578h;
    }

    public j b() {
        return this.a;
    }

    public long c() {
        return this.f1576f;
    }

    public long d() {
        return this.f1577g;
    }

    public boolean e() {
        return this.f1578h.c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.b == cVar.b && this.c == cVar.c && this.f1574d == cVar.f1574d && this.f1575e == cVar.f1575e && this.f1576f == cVar.f1576f && this.f1577g == cVar.f1577g && this.a == cVar.a) {
            return this.f1578h.equals(cVar.f1578h);
        }
        return false;
    }

    public boolean f() {
        return this.f1574d;
    }

    public boolean g() {
        return this.b;
    }

    public boolean h() {
        return this.c;
    }

    public int hashCode() {
        long j2 = this.f1576f;
        long j3 = this.f1577g;
        return (((((((((((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.f1574d ? 1 : 0)) * 31) + (this.f1575e ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f1578h.hashCode();
    }

    public boolean i() {
        return this.f1575e;
    }

    public void j(d dVar) {
        this.f1578h = dVar;
    }

    public void k(j jVar) {
        this.a = jVar;
    }

    public void l(boolean z) {
        this.f1574d = z;
    }

    public void m(boolean z) {
        this.b = z;
    }

    public void n(boolean z) {
        this.c = z;
    }

    public void o(boolean z) {
        this.f1575e = z;
    }

    public void p(long j2) {
        this.f1576f = j2;
    }

    public void q(long j2) {
        this.f1577g = j2;
    }

    c(a aVar) {
        this.b = aVar.a;
        this.c = Build.VERSION.SDK_INT >= 23 && aVar.b;
        this.a = aVar.c;
        this.f1574d = aVar.f1579d;
        this.f1575e = aVar.f1580e;
        if (Build.VERSION.SDK_INT >= 24) {
            this.f1578h = aVar.f1583h;
            this.f1576f = aVar.f1581f;
            this.f1577g = aVar.f1582g;
        }
    }

    public c(c cVar) {
        this.b = cVar.b;
        this.c = cVar.c;
        this.a = cVar.a;
        this.f1574d = cVar.f1574d;
        this.f1575e = cVar.f1575e;
        this.f1578h = cVar.f1578h;
    }
}
