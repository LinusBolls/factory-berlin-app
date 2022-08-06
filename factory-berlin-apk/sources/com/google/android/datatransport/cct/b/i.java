package com.google.android.datatransport.cct.b;

import com.google.android.datatransport.cct.b.o;

final class i extends o {
    private final o.c a;
    private final o.b b;

    static final class b extends o.a {
        private o.c a;
        private o.b b;

        b() {
        }

        public o.a a(o.b bVar) {
            this.b = bVar;
            return this;
        }

        public o.a b(o.c cVar) {
            this.a = cVar;
            return this;
        }

        public o c() {
            return new i(this.a, this.b, (a) null);
        }
    }

    /* synthetic */ i(o.c cVar, o.b bVar, a aVar) {
        this.a = cVar;
        this.b = bVar;
    }

    public o.b b() {
        return this.b;
    }

    public o.c c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o.c cVar = this.a;
        if (cVar != null ? cVar.equals(((i) obj).a) : ((i) obj).a == null) {
            o.b bVar = this.b;
            if (bVar == null) {
                if (((i) obj).b == null) {
                    return true;
                }
            } else if (bVar.equals(((i) obj).b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.a;
        int i2 = 0;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.b;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode ^ i2;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
