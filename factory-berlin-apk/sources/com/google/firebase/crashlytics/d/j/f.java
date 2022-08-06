package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;

/* compiled from: AutoValue_CrashlyticsReport_Session */
final class f extends v.d {
    private final String a;
    private final String b;
    private final long c;

    /* renamed from: d  reason: collision with root package name */
    private final Long f4012d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f4013e;

    /* renamed from: f  reason: collision with root package name */
    private final v.d.a f4014f;

    /* renamed from: g  reason: collision with root package name */
    private final v.d.f f4015g;

    /* renamed from: h  reason: collision with root package name */
    private final v.d.e f4016h;

    /* renamed from: i  reason: collision with root package name */
    private final v.d.c f4017i;

    /* renamed from: j  reason: collision with root package name */
    private final w<v.d.C0096d> f4018j;

    /* renamed from: k  reason: collision with root package name */
    private final int f4019k;

    /* compiled from: AutoValue_CrashlyticsReport_Session */
    static final class b extends v.d.b {
        private String a;
        private String b;
        private Long c;

        /* renamed from: d  reason: collision with root package name */
        private Long f4020d;

        /* renamed from: e  reason: collision with root package name */
        private Boolean f4021e;

        /* renamed from: f  reason: collision with root package name */
        private v.d.a f4022f;

        /* renamed from: g  reason: collision with root package name */
        private v.d.f f4023g;

        /* renamed from: h  reason: collision with root package name */
        private v.d.e f4024h;

        /* renamed from: i  reason: collision with root package name */
        private v.d.c f4025i;

        /* renamed from: j  reason: collision with root package name */
        private w<v.d.C0096d> f4026j;

        /* renamed from: k  reason: collision with root package name */
        private Integer f4027k;

        public v.d a() {
            String str = "";
            if (this.a == null) {
                str = str + " generator";
            }
            if (this.b == null) {
                str = str + " identifier";
            }
            if (this.c == null) {
                str = str + " startedAt";
            }
            if (this.f4021e == null) {
                str = str + " crashed";
            }
            if (this.f4022f == null) {
                str = str + " app";
            }
            if (this.f4027k == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new f(this.a, this.b, this.c.longValue(), this.f4020d, this.f4021e.booleanValue(), this.f4022f, this.f4023g, this.f4024h, this.f4025i, this.f4026j, this.f4027k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public v.d.b b(v.d.a aVar) {
            if (aVar != null) {
                this.f4022f = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        public v.d.b c(boolean z) {
            this.f4021e = Boolean.valueOf(z);
            return this;
        }

        public v.d.b d(v.d.c cVar) {
            this.f4025i = cVar;
            return this;
        }

        public v.d.b e(Long l2) {
            this.f4020d = l2;
            return this;
        }

        public v.d.b f(w<v.d.C0096d> wVar) {
            this.f4026j = wVar;
            return this;
        }

        public v.d.b g(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        public v.d.b h(int i2) {
            this.f4027k = Integer.valueOf(i2);
            return this;
        }

        public v.d.b i(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        public v.d.b k(v.d.e eVar) {
            this.f4024h = eVar;
            return this;
        }

        public v.d.b l(long j2) {
            this.c = Long.valueOf(j2);
            return this;
        }

        public v.d.b m(v.d.f fVar) {
            this.f4023g = fVar;
            return this;
        }

        b() {
        }

        private b(v.d dVar) {
            this.a = dVar.f();
            this.b = dVar.h();
            this.c = Long.valueOf(dVar.k());
            this.f4020d = dVar.d();
            this.f4021e = Boolean.valueOf(dVar.m());
            this.f4022f = dVar.b();
            this.f4023g = dVar.l();
            this.f4024h = dVar.j();
            this.f4025i = dVar.c();
            this.f4026j = dVar.e();
            this.f4027k = Integer.valueOf(dVar.g());
        }
    }

    public v.d.a b() {
        return this.f4014f;
    }

    public v.d.c c() {
        return this.f4017i;
    }

    public Long d() {
        return this.f4012d;
    }

    public w<v.d.C0096d> e() {
        return this.f4018j;
    }

    public boolean equals(Object obj) {
        Long l2;
        v.d.f fVar;
        v.d.e eVar;
        v.d.c cVar;
        w<v.d.C0096d> wVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d)) {
            return false;
        }
        v.d dVar = (v.d) obj;
        if (!this.a.equals(dVar.f()) || !this.b.equals(dVar.h()) || this.c != dVar.k() || ((l2 = this.f4012d) != null ? !l2.equals(dVar.d()) : dVar.d() != null) || this.f4013e != dVar.m() || !this.f4014f.equals(dVar.b()) || ((fVar = this.f4015g) != null ? !fVar.equals(dVar.l()) : dVar.l() != null) || ((eVar = this.f4016h) != null ? !eVar.equals(dVar.j()) : dVar.j() != null) || ((cVar = this.f4017i) != null ? !cVar.equals(dVar.c()) : dVar.c() != null) || ((wVar = this.f4018j) != null ? !wVar.equals(dVar.e()) : dVar.e() != null) || this.f4019k != dVar.g()) {
            return false;
        }
        return true;
    }

    public String f() {
        return this.a;
    }

    public int g() {
        return this.f4019k;
    }

    public String h() {
        return this.b;
    }

    public int hashCode() {
        long j2 = this.c;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Long l2 = this.f4012d;
        int i2 = 0;
        int hashCode2 = (((((hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003) ^ (this.f4013e ? 1231 : 1237)) * 1000003) ^ this.f4014f.hashCode()) * 1000003;
        v.d.f fVar = this.f4015g;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        v.d.e eVar = this.f4016h;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        v.d.c cVar = this.f4017i;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        w<v.d.C0096d> wVar = this.f4018j;
        if (wVar != null) {
            i2 = wVar.hashCode();
        }
        return ((hashCode5 ^ i2) * 1000003) ^ this.f4019k;
    }

    public v.d.e j() {
        return this.f4016h;
    }

    public long k() {
        return this.c;
    }

    public v.d.f l() {
        return this.f4015g;
    }

    public boolean m() {
        return this.f4013e;
    }

    public v.d.b n() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.a + ", identifier=" + this.b + ", startedAt=" + this.c + ", endedAt=" + this.f4012d + ", crashed=" + this.f4013e + ", app=" + this.f4014f + ", user=" + this.f4015g + ", os=" + this.f4016h + ", device=" + this.f4017i + ", events=" + this.f4018j + ", generatorType=" + this.f4019k + "}";
    }

    private f(String str, String str2, long j2, Long l2, boolean z, v.d.a aVar, v.d.f fVar, v.d.e eVar, v.d.c cVar, w<v.d.C0096d> wVar, int i2) {
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.f4012d = l2;
        this.f4013e = z;
        this.f4014f = aVar;
        this.f4015g = fVar;
        this.f4016h = eVar;
        this.f4017i = cVar;
        this.f4018j = wVar;
        this.f4019k = i2;
    }
}
