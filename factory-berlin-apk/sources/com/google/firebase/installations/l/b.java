package com.google.firebase.installations.l;

import com.google.firebase.installations.l.e;

/* compiled from: AutoValue_TokenResult */
final class b extends e {
    private final String a;
    private final long b;
    private final e.b c;

    /* renamed from: com.google.firebase.installations.l.b$b  reason: collision with other inner class name */
    /* compiled from: AutoValue_TokenResult */
    static final class C0113b extends e.a {
        private String a;
        private Long b;
        private e.b c;

        C0113b() {
        }

        public e a() {
            String str = "";
            if (this.b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.a, this.b.longValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public e.a b(e.b bVar) {
            this.c = bVar;
            return this;
        }

        public e.a c(String str) {
            this.a = str;
            return this;
        }

        public e.a d(long j2) {
            this.b = Long.valueOf(j2);
            return this;
        }
    }

    public e.b b() {
        return this.c;
    }

    public String c() {
        return this.a;
    }

    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        String str = this.a;
        if (str != null ? str.equals(eVar.c()) : eVar.c() == null) {
            if (this.b == eVar.d()) {
                e.b bVar = this.c;
                if (bVar == null) {
                    if (eVar.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(eVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j2 = this.b;
        int i3 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        e.b bVar = this.c;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.c + "}";
    }

    private b(String str, long j2, e.b bVar) {
        this.a = str;
        this.b = j2;
        this.c = bVar;
    }
}
