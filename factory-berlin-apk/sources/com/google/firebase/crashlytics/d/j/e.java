package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;
import java.util.Arrays;

/* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File */
final class e extends v.c.b {
    private final String a;
    private final byte[] b;

    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File */
    static final class b extends v.c.b.a {
        private String a;
        private byte[] b;

        b() {
        }

        public v.c.b a() {
            String str = "";
            if (this.a == null) {
                str = str + " filename";
            }
            if (this.b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new e(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public v.c.b.a b(byte[] bArr) {
            if (bArr != null) {
                this.b = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        public v.c.b.a c(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }

    public byte[] b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.c.b)) {
            return false;
        }
        v.c.b bVar = (v.c.b) obj;
        if (this.a.equals(bVar.c())) {
            if (Arrays.equals(this.b, bVar instanceof e ? ((e) bVar).b : bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }

    private e(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }
}
