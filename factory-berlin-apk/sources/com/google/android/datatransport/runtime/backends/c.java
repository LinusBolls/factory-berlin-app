package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import g.b.a.a.i.w.a;

/* compiled from: AutoValue_CreationContext */
final class c extends h {
    private final Context a;
    private final a b;
    private final a c;

    /* renamed from: d  reason: collision with root package name */
    private final String f1980d;

    c(Context context, a aVar, a aVar2, String str) {
        if (context != null) {
            this.a = context;
            if (aVar != null) {
                this.b = aVar;
                if (aVar2 != null) {
                    this.c = aVar2;
                    if (str != null) {
                        this.f1980d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public Context b() {
        return this.a;
    }

    public String c() {
        return this.f1980d;
    }

    public a d() {
        return this.c;
    }

    public a e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.a.equals(hVar.b()) || !this.b.equals(hVar.e()) || !this.c.equals(hVar.d()) || !this.f1980d.equals(hVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f1980d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.a + ", wallClock=" + this.b + ", monotonicClock=" + this.c + ", backendName=" + this.f1980d + "}";
    }
}
