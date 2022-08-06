package com.google.android.datatransport.cct.b;

import com.google.android.datatransport.cct.b.k;

final class e extends k {
    private final k.b a;
    private final a b;

    static final class b extends k.a {
        private k.b a;
        private a b;

        b() {
        }

        public k.a a(a aVar) {
            this.b = aVar;
            return this;
        }

        public k.a b(k.b bVar) {
            this.a = bVar;
            return this;
        }

        public k c() {
            return new e(this.a, this.b, (a) null);
        }
    }

    /* synthetic */ e(k.b bVar, a aVar, a aVar2) {
        this.a = bVar;
        this.b = aVar;
    }

    public a b() {
        return this.b;
    }

    public k.b c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k.b bVar = this.a;
        if (bVar != null ? bVar.equals(((e) obj).a) : ((e) obj).a == null) {
            a aVar = this.b;
            if (aVar == null) {
                if (((e) obj).b == null) {
                    return true;
                }
            } else if (aVar.equals(((e) obj).b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.a;
        int i2 = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        a aVar = this.b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode ^ i2;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }
}
