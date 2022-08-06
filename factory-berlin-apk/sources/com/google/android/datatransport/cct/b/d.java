package com.google.android.datatransport.cct.b;

import java.util.List;

final class d extends j {
    private final List<m> a;

    d(List<m> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    public List<m> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.a.equals(((j) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}
