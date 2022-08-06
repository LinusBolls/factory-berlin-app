package g.b.a.a.i;

import g.b.a.a.i.h;
import java.util.Map;

/* compiled from: AutoValue_EventInternal */
final class a extends h {
    private final String a;
    private final Integer b;
    private final g c;

    /* renamed from: d  reason: collision with root package name */
    private final long f9262d;

    /* renamed from: e  reason: collision with root package name */
    private final long f9263e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f9264f;

    /* compiled from: AutoValue_EventInternal */
    static final class b extends h.a {
        private String a;
        private Integer b;
        private g c;

        /* renamed from: d  reason: collision with root package name */
        private Long f9265d;

        /* renamed from: e  reason: collision with root package name */
        private Long f9266e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, String> f9267f;

        b() {
        }

        public h d() {
            String str = "";
            if (this.a == null) {
                str = str + " transportName";
            }
            if (this.c == null) {
                str = str + " encodedPayload";
            }
            if (this.f9265d == null) {
                str = str + " eventMillis";
            }
            if (this.f9266e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f9267f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b, this.c, this.f9265d.longValue(), this.f9266e.longValue(), this.f9267f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: protected */
        public Map<String, String> e() {
            Map<String, String> map = this.f9267f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* access modifiers changed from: protected */
        public h.a f(Map<String, String> map) {
            if (map != null) {
                this.f9267f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        public h.a g(Integer num) {
            this.b = num;
            return this;
        }

        public h.a h(g gVar) {
            if (gVar != null) {
                this.c = gVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        public h.a i(long j2) {
            this.f9265d = Long.valueOf(j2);
            return this;
        }

        public h.a j(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        public h.a k(long j2) {
            this.f9266e = Long.valueOf(j2);
            return this;
        }
    }

    /* access modifiers changed from: protected */
    public Map<String, String> c() {
        return this.f9264f;
    }

    public Integer d() {
        return this.b;
    }

    public g e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.a.equals(hVar.j()) || ((num = this.b) != null ? !num.equals(hVar.d()) : hVar.d() != null) || !this.c.equals(hVar.e()) || this.f9262d != hVar.f() || this.f9263e != hVar.k() || !this.f9264f.equals(hVar.c())) {
            return false;
        }
        return true;
    }

    public long f() {
        return this.f9262d;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j2 = this.f9262d;
        long j3 = this.f9263e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.f9264f.hashCode();
    }

    public String j() {
        return this.a;
    }

    public long k() {
        return this.f9263e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.f9262d + ", uptimeMillis=" + this.f9263e + ", autoMetadata=" + this.f9264f + "}";
    }

    private a(String str, Integer num, g gVar, long j2, long j3, Map<String, String> map) {
        this.a = str;
        this.b = num;
        this.c = gVar;
        this.f9262d = j2;
        this.f9263e = j3;
        this.f9264f = map;
    }
}
