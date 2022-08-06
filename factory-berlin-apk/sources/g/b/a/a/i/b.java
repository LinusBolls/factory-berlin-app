package g.b.a.a.i;

import g.b.a.a.c;
import g.b.a.a.e;
import g.b.a.a.i.l;

/* compiled from: AutoValue_SendRequest */
final class b extends l {
    private final m a;
    private final String b;
    private final c<?> c;

    /* renamed from: d  reason: collision with root package name */
    private final e<?, byte[]> f9268d;

    /* renamed from: e  reason: collision with root package name */
    private final g.b.a.a.b f9269e;

    /* renamed from: g.b.a.a.i.b$b  reason: collision with other inner class name */
    /* compiled from: AutoValue_SendRequest */
    static final class C0629b extends l.a {
        private m a;
        private String b;
        private c<?> c;

        /* renamed from: d  reason: collision with root package name */
        private e<?, byte[]> f9270d;

        /* renamed from: e  reason: collision with root package name */
        private g.b.a.a.b f9271e;

        C0629b() {
        }

        public l a() {
            String str = "";
            if (this.a == null) {
                str = str + " transportContext";
            }
            if (this.b == null) {
                str = str + " transportName";
            }
            if (this.c == null) {
                str = str + " event";
            }
            if (this.f9270d == null) {
                str = str + " transformer";
            }
            if (this.f9271e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new b(this.a, this.b, this.c, this.f9270d, this.f9271e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        public l.a b(g.b.a.a.b bVar) {
            if (bVar != null) {
                this.f9271e = bVar;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        /* access modifiers changed from: package-private */
        public l.a c(c<?> cVar) {
            if (cVar != null) {
                this.c = cVar;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        /* access modifiers changed from: package-private */
        public l.a d(e<?, byte[]> eVar) {
            if (eVar != null) {
                this.f9270d = eVar;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        public l.a e(m mVar) {
            if (mVar != null) {
                this.a = mVar;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        public l.a f(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    public g.b.a.a.b b() {
        return this.f9269e;
    }

    /* access modifiers changed from: package-private */
    public c<?> c() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public e<?, byte[]> e() {
        return this.f9268d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.a.equals(lVar.f()) || !this.b.equals(lVar.g()) || !this.c.equals(lVar.c()) || !this.f9268d.equals(lVar.e()) || !this.f9269e.equals(lVar.b())) {
            return false;
        }
        return true;
    }

    public m f() {
        return this.a;
    }

    public String g() {
        return this.b;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f9268d.hashCode()) * 1000003) ^ this.f9269e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.a + ", transportName=" + this.b + ", event=" + this.c + ", transformer=" + this.f9268d + ", encoding=" + this.f9269e + "}";
    }

    private b(m mVar, String str, c<?> cVar, e<?, byte[]> eVar, g.b.a.a.b bVar) {
        this.a = mVar;
        this.b = str;
        this.c = cVar;
        this.f9268d = eVar;
        this.f9269e = bVar;
    }
}
