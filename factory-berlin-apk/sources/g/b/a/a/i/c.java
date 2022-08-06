package g.b.a.a.i;

import g.b.a.a.d;
import g.b.a.a.i.m;
import java.util.Arrays;

/* compiled from: AutoValue_TransportContext */
final class c extends m {
    private final String a;
    private final byte[] b;
    private final d c;

    /* compiled from: AutoValue_TransportContext */
    static final class b extends m.a {
        private String a;
        private byte[] b;
        private d c;

        b() {
        }

        public m a() {
            String str = "";
            if (this.a == null) {
                str = str + " backendName";
            }
            if (this.c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new c(this.a, this.b, this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public m.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        public m.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }

        public m.a d(d dVar) {
            if (dVar != null) {
                this.c = dVar;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    public String b() {
        return this.a;
    }

    public byte[] c() {
        return this.b;
    }

    public d d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.a.equals(mVar.b())) {
            if (!Arrays.equals(this.b, mVar instanceof c ? ((c) mVar).b : mVar.c()) || !this.c.equals(mVar.d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }

    private c(String str, byte[] bArr, d dVar) {
        this.a = str;
        this.b = bArr;
        this.c = dVar;
    }
}
