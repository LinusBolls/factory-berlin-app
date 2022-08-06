package androidx.work.impl.l;

import androidx.work.c;
import androidx.work.e;
import androidx.work.i;
import androidx.work.p;

/* compiled from: WorkSpec */
public class j {
    private static final String q = i.f("WorkSpec");
    public String a;
    public p b = p.ENQUEUED;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public String f1722d;

    /* renamed from: e  reason: collision with root package name */
    public e f1723e;

    /* renamed from: f  reason: collision with root package name */
    public e f1724f;

    /* renamed from: g  reason: collision with root package name */
    public long f1725g;

    /* renamed from: h  reason: collision with root package name */
    public long f1726h;

    /* renamed from: i  reason: collision with root package name */
    public long f1727i;

    /* renamed from: j  reason: collision with root package name */
    public c f1728j;

    /* renamed from: k  reason: collision with root package name */
    public int f1729k;

    /* renamed from: l  reason: collision with root package name */
    public androidx.work.a f1730l;

    /* renamed from: m  reason: collision with root package name */
    public long f1731m;

    /* renamed from: n  reason: collision with root package name */
    public long f1732n;
    public long o;
    public long p;

    /* compiled from: WorkSpec */
    public static class a {
        public String a;
        public p b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.b != aVar.b) {
                return false;
            }
            return this.a.equals(aVar.a);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }
    }

    public j(String str, String str2) {
        e eVar = e.c;
        this.f1723e = eVar;
        this.f1724f = eVar;
        this.f1728j = c.f1573i;
        this.f1730l = androidx.work.a.EXPONENTIAL;
        this.f1731m = 30000;
        this.p = -1;
        this.a = str;
        this.c = str2;
    }

    public long a() {
        long j2;
        boolean z = false;
        if (c()) {
            if (this.f1730l == androidx.work.a.LINEAR) {
                z = true;
            }
            if (z) {
                j2 = this.f1731m * ((long) this.f1729k);
            } else {
                j2 = (long) Math.scalb((float) this.f1731m, this.f1729k - 1);
            }
            return this.f1732n + Math.min(18000000, j2);
        }
        long j3 = 0;
        if (d()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j4 = this.f1732n;
            if (j4 == 0) {
                j4 = this.f1725g + currentTimeMillis;
            }
            if (this.f1727i != this.f1726h) {
                z = true;
            }
            if (z) {
                if (this.f1732n == 0) {
                    j3 = this.f1727i * -1;
                }
                return j4 + this.f1726h + j3;
            }
            if (this.f1732n != 0) {
                j3 = this.f1726h;
            }
            return j4 + j3;
        }
        long j5 = this.f1732n;
        if (j5 == 0) {
            j5 = System.currentTimeMillis();
        }
        return j5 + this.f1725g;
    }

    public boolean b() {
        return !c.f1573i.equals(this.f1728j);
    }

    public boolean c() {
        return this.b == p.ENQUEUED && this.f1729k > 0;
    }

    public boolean d() {
        return this.f1726h != 0;
    }

    public void e(long j2) {
        if (j2 > 18000000) {
            i.c().h(q, "Backoff delay duration exceeds maximum value", new Throwable[0]);
            j2 = 18000000;
        }
        if (j2 < 10000) {
            i.c().h(q, "Backoff delay duration less than minimum value", new Throwable[0]);
            j2 = 10000;
        }
        this.f1731m = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f1725g != jVar.f1725g || this.f1726h != jVar.f1726h || this.f1727i != jVar.f1727i || this.f1729k != jVar.f1729k || this.f1731m != jVar.f1731m || this.f1732n != jVar.f1732n || this.o != jVar.o || this.p != jVar.p || !this.a.equals(jVar.a) || this.b != jVar.b || !this.c.equals(jVar.c)) {
            return false;
        }
        String str = this.f1722d;
        if (str == null ? jVar.f1722d != null : !str.equals(jVar.f1722d)) {
            return false;
        }
        if (this.f1723e.equals(jVar.f1723e) && this.f1724f.equals(jVar.f1724f) && this.f1728j.equals(jVar.f1728j) && this.f1730l == jVar.f1730l) {
            return true;
        }
        return false;
    }

    public void f(long j2, long j3) {
        if (j2 < 900000) {
            i.c().h(q, String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{900000L}), new Throwable[0]);
            j2 = 900000;
        }
        if (j3 < 300000) {
            i.c().h(q, String.format("Flex duration lesser than minimum allowed value; Changed to %s", new Object[]{300000L}), new Throwable[0]);
            j3 = 300000;
        }
        if (j3 > j2) {
            i.c().h(q, String.format("Flex duration greater than interval duration; Changed to %s", new Object[]{Long.valueOf(j2)}), new Throwable[0]);
            j3 = j2;
        }
        this.f1726h = j2;
        this.f1727i = j3;
    }

    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        String str = this.f1722d;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j2 = this.f1725g;
        long j3 = this.f1726h;
        long j4 = this.f1727i;
        long j5 = this.f1731m;
        long j6 = this.f1732n;
        long j7 = this.o;
        long j8 = this.p;
        return ((((((((((((((((((((((((hashCode + hashCode2) * 31) + this.f1723e.hashCode()) * 31) + this.f1724f.hashCode()) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f1728j.hashCode()) * 31) + this.f1729k) * 31) + this.f1730l.hashCode()) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "{WorkSpec: " + this.a + "}";
    }

    public j(j jVar) {
        e eVar = e.c;
        this.f1723e = eVar;
        this.f1724f = eVar;
        this.f1728j = c.f1573i;
        this.f1730l = androidx.work.a.EXPONENTIAL;
        this.f1731m = 30000;
        this.p = -1;
        this.a = jVar.a;
        this.c = jVar.c;
        this.b = jVar.b;
        this.f1722d = jVar.f1722d;
        this.f1723e = new e(jVar.f1723e);
        this.f1724f = new e(jVar.f1724f);
        this.f1725g = jVar.f1725g;
        this.f1726h = jVar.f1726h;
        this.f1727i = jVar.f1727i;
        this.f1728j = new c(jVar.f1728j);
        this.f1729k = jVar.f1729k;
        this.f1730l = jVar.f1730l;
        this.f1731m = jVar.f1731m;
        this.f1732n = jVar.f1732n;
        this.o = jVar.o;
        this.p = jVar.p;
    }
}
