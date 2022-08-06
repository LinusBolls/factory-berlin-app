package com.google.android.datatransport.cct.b;

import com.google.android.datatransport.cct.b.m;
import java.util.List;

final class g extends m {
    private final long a;
    private final long b;
    private final k c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f1944d;

    /* renamed from: e  reason: collision with root package name */
    private final String f1945e;

    /* renamed from: f  reason: collision with root package name */
    private final List<l> f1946f;

    /* renamed from: g  reason: collision with root package name */
    private final p f1947g;

    static final class b extends m.a {
        private Long a;
        private Long b;
        private k c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f1948d;

        /* renamed from: e  reason: collision with root package name */
        private String f1949e;

        /* renamed from: f  reason: collision with root package name */
        private List<l> f1950f;

        /* renamed from: g  reason: collision with root package name */
        private p f1951g;

        b() {
        }

        public m.a b(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        public m.a c(k kVar) {
            this.c = kVar;
            return this;
        }

        public m.a d(p pVar) {
            this.f1951g = pVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public m.a e(Integer num) {
            this.f1948d = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        public m.a f(String str) {
            this.f1949e = str;
            return this;
        }

        public m.a g(List<l> list) {
            this.f1950f = list;
            return this;
        }

        public m h() {
            String str = "";
            if (this.a == null) {
                str = str + " requestTimeMs";
            }
            if (this.b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.a.longValue(), this.b.longValue(), this.c, this.f1948d, this.f1949e, this.f1950f, this.f1951g, (a) null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public m.a i(long j2) {
            this.b = Long.valueOf(j2);
            return this;
        }
    }

    /* synthetic */ g(long j2, long j3, k kVar, Integer num, String str, List list, p pVar, a aVar) {
        this.a = j2;
        this.b = j3;
        this.c = kVar;
        this.f1944d = num;
        this.f1945e = str;
        this.f1946f = list;
        this.f1947g = pVar;
    }

    public k b() {
        return this.c;
    }

    public List<l> c() {
        return this.f1946f;
    }

    public Integer d() {
        return this.f1944d;
    }

    public String e() {
        return this.f1945e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.a == mVar.g() && this.b == mVar.h() && ((kVar = this.c) != null ? kVar.equals(((g) mVar).c) : ((g) mVar).c == null) && ((num = this.f1944d) != null ? num.equals(((g) mVar).f1944d) : ((g) mVar).f1944d == null) && ((str = this.f1945e) != null ? str.equals(((g) mVar).f1945e) : ((g) mVar).f1945e == null) && ((list = this.f1946f) != null ? list.equals(((g) mVar).f1946f) : ((g) mVar).f1946f == null)) {
            p pVar = this.f1947g;
            if (pVar == null) {
                if (((g) mVar).f1947g == null) {
                    return true;
                }
            } else if (pVar.equals(((g) mVar).f1947g)) {
                return true;
            }
        }
        return false;
    }

    public p f() {
        return this.f1947g;
    }

    public long g() {
        return this.a;
    }

    public long h() {
        return this.b;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        int i2 = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        k kVar = this.c;
        int i3 = 0;
        int hashCode = (i2 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f1944d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f1945e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f1946f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f1947g;
        if (pVar != null) {
            i3 = pVar.hashCode();
        }
        return hashCode4 ^ i3;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.f1944d + ", logSourceName=" + this.f1945e + ", logEvents=" + this.f1946f + ", qosTier=" + this.f1947g + "}";
    }
}
