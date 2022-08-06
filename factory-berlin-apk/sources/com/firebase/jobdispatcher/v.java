package com.firebase.jobdispatcher;

import android.net.Uri;

/* compiled from: ObservedUri */
public final class v {
    private final Uri a;
    private final int b;

    public v(Uri uri, int i2) {
        if (uri != null) {
            this.a = uri;
            this.b = i2;
            return;
        }
        throw new IllegalArgumentException("URI must not be null.");
    }

    public int a() {
        return this.b;
    }

    public Uri b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.b != vVar.b || !this.a.equals(vVar.a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b;
    }
}
