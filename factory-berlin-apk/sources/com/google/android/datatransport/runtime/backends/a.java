package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.f;
import g.b.a.a.i.h;
import java.util.Arrays;

/* compiled from: AutoValue_BackendRequest */
final class a extends f {
    private final Iterable<h> a;
    private final byte[] b;

    /* compiled from: AutoValue_BackendRequest */
    static final class b extends f.a {
        private Iterable<h> a;
        private byte[] b;

        b() {
        }

        public f a() {
            String str = "";
            if (this.a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f.a b(Iterable<h> iterable) {
            if (iterable != null) {
                this.a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        public f.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }
    }

    public Iterable<h> b() {
        return this.a;
    }

    public byte[] c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.a.equals(fVar.b())) {
            if (Arrays.equals(this.b, fVar instanceof a ? ((a) fVar).b : fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.a + ", extras=" + Arrays.toString(this.b) + "}";
    }

    private a(Iterable<h> iterable, byte[] bArr) {
        this.a = iterable;
        this.b = bArr;
    }
}
