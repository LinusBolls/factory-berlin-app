package com.google.android.datatransport.cct.b;

import com.google.android.datatransport.cct.b.a;

final class c extends a {
    private final Integer a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final String f1926d;

    /* renamed from: e  reason: collision with root package name */
    private final String f1927e;

    /* renamed from: f  reason: collision with root package name */
    private final String f1928f;

    /* renamed from: g  reason: collision with root package name */
    private final String f1929g;

    /* renamed from: h  reason: collision with root package name */
    private final String f1930h;

    static final class b extends a.C0056a {
        private Integer a;
        private String b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private String f1931d;

        /* renamed from: e  reason: collision with root package name */
        private String f1932e;

        /* renamed from: f  reason: collision with root package name */
        private String f1933f;

        /* renamed from: g  reason: collision with root package name */
        private String f1934g;

        /* renamed from: h  reason: collision with root package name */
        private String f1935h;

        b() {
        }

        public a.C0056a a(Integer num) {
            this.a = num;
            return this;
        }

        public a.C0056a b(String str) {
            this.f1931d = str;
            return this;
        }

        public a c() {
            return new c(this.a, this.b, this.c, this.f1931d, this.f1932e, this.f1933f, this.f1934g, this.f1935h, (a) null);
        }

        public a.C0056a d(String str) {
            this.f1935h = str;
            return this;
        }

        public a.C0056a e(String str) {
            this.c = str;
            return this;
        }

        public a.C0056a f(String str) {
            this.f1934g = str;
            return this;
        }

        public a.C0056a g(String str) {
            this.b = str;
            return this;
        }

        public a.C0056a h(String str) {
            this.f1933f = str;
            return this;
        }

        public a.C0056a i(String str) {
            this.f1932e = str;
            return this;
        }
    }

    /* synthetic */ c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, a aVar) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.f1926d = str3;
        this.f1927e = str4;
        this.f1928f = str5;
        this.f1929g = str6;
        this.f1930h = str7;
    }

    public String b() {
        return this.f1926d;
    }

    public String c() {
        return this.f1930h;
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return this.f1929g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        Integer num = this.a;
        if (num != null ? num.equals(((c) obj).a) : ((c) obj).a == null) {
            String str = this.b;
            if (str != null ? str.equals(((c) obj).b) : ((c) obj).b == null) {
                String str2 = this.c;
                if (str2 != null ? str2.equals(((c) obj).c) : ((c) obj).c == null) {
                    String str3 = this.f1926d;
                    if (str3 != null ? str3.equals(((c) obj).f1926d) : ((c) obj).f1926d == null) {
                        String str4 = this.f1927e;
                        if (str4 != null ? str4.equals(((c) obj).f1927e) : ((c) obj).f1927e == null) {
                            String str5 = this.f1928f;
                            if (str5 != null ? str5.equals(((c) obj).f1928f) : ((c) obj).f1928f == null) {
                                String str6 = this.f1929g;
                                if (str6 != null ? str6.equals(((c) obj).f1929g) : ((c) obj).f1929g == null) {
                                    String str7 = this.f1930h;
                                    if (str7 == null) {
                                        if (((c) obj).f1930h == null) {
                                            return true;
                                        }
                                    } else if (str7.equals(((c) obj).f1930h)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public String f() {
        return this.b;
    }

    public String g() {
        return this.f1928f;
    }

    public String h() {
        return this.f1927e;
    }

    public int hashCode() {
        Integer num = this.a;
        int i2 = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f1926d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f1927e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f1928f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f1929g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f1930h;
        if (str7 != null) {
            i2 = str7.hashCode();
        }
        return hashCode7 ^ i2;
    }

    public Integer i() {
        return this.a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.a + ", model=" + this.b + ", hardware=" + this.c + ", device=" + this.f1926d + ", product=" + this.f1927e + ", osBuild=" + this.f1928f + ", manufacturer=" + this.f1929g + ", fingerprint=" + this.f1930h + "}";
    }
}
