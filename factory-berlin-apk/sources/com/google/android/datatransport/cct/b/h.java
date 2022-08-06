package com.google.android.datatransport.cct.b;

final class h extends n {
    private final long a;

    h(long j2) {
        this.a = j2;
    }

    public long a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n) || this.a != ((n) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j2 = this.a;
        return 1000003 ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.a + "}";
    }
}
