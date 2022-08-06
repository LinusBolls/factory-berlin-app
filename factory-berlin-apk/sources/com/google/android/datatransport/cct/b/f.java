package com.google.android.datatransport.cct.b;

import com.google.android.datatransport.cct.b.l;
import java.util.Arrays;

final class f extends l {
    private final long a;
    private final Integer b;
    private final long c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f1936d;

    /* renamed from: e  reason: collision with root package name */
    private final String f1937e;

    /* renamed from: f  reason: collision with root package name */
    private final long f1938f;

    /* renamed from: g  reason: collision with root package name */
    private final o f1939g;

    static final class b extends l.a {
        private Long a;
        private Integer b;
        private Long c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f1940d;

        /* renamed from: e  reason: collision with root package name */
        private String f1941e;

        /* renamed from: f  reason: collision with root package name */
        private Long f1942f;

        /* renamed from: g  reason: collision with root package name */
        private o f1943g;

        b() {
        }

        public l.a a(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        public l.a b(o oVar) {
            this.f1943g = oVar;
            return this;
        }

        public l.a c(Integer num) {
            this.b = num;
            return this;
        }

        public l d() {
            String str = "";
            if (this.a == null) {
                str = str + " eventTimeMs";
            }
            if (this.c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f1942f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.a.longValue(), this.b, this.c.longValue(), this.f1940d, this.f1941e, this.f1942f.longValue(), this.f1943g, (a) null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public l.a e(long j2) {
            this.c = Long.valueOf(j2);
            return this;
        }

        public l.a f(long j2) {
            this.f1942f = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public l.a g(String str) {
            this.f1941e = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public l.a h(byte[] bArr) {
            this.f1940d = bArr;
            return this;
        }
    }

    /* synthetic */ f(long j2, Integer num, long j3, byte[] bArr, String str, long j4, o oVar, a aVar) {
        this.a = j2;
        this.b = num;
        this.c = j3;
        this.f1936d = bArr;
        this.f1937e = str;
        this.f1938f = j4;
        this.f1939g = oVar;
    }

    public Integer c() {
        return this.b;
    }

    public long d() {
        return this.a;
    }

    public long e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.a == lVar.d() && ((num = this.b) != null ? num.equals(((f) lVar).b) : ((f) lVar).b == null) && this.c == lVar.e()) {
            if (Arrays.equals(this.f1936d, lVar instanceof f ? ((f) lVar).f1936d : lVar.g()) && ((str = this.f1937e) != null ? str.equals(((f) lVar).f1937e) : ((f) lVar).f1937e == null) && this.f1938f == lVar.i()) {
                o oVar = this.f1939g;
                if (oVar == null) {
                    if (((f) lVar).f1939g == null) {
                        return true;
                    }
                } else if (oVar.equals(((f) lVar).f1939g)) {
                    return true;
                }
            }
        }
        return false;
    }

    public o f() {
        return this.f1939g;
    }

    public byte[] g() {
        return this.f1936d;
    }

    public String h() {
        return this.f1937e;
    }

    public int hashCode() {
        long j2 = this.a;
        int i2 = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int i3 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j3 = this.c;
        int hashCode2 = (((((i2 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f1936d)) * 1000003;
        String str = this.f1937e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j4 = this.f1938f;
        int i4 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        o oVar = this.f1939g;
        if (oVar != null) {
            i3 = oVar.hashCode();
        }
        return i4 ^ i3;
    }

    public long i() {
        return this.f1938f;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.f1936d) + ", sourceExtensionJsonProto3=" + this.f1937e + ", timezoneOffsetSeconds=" + this.f1938f + ", networkConnectionInfo=" + this.f1939g + "}";
    }
}
