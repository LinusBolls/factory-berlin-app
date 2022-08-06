package com.microsoft.appcenter.persistence;

import com.microsoft.appcenter.k.d.d;
import com.microsoft.appcenter.k.d.i.g;
import java.io.Closeable;
import java.util.Collection;
import java.util.List;

public abstract class Persistence implements Closeable {

    /* renamed from: g  reason: collision with root package name */
    private g f4588g;

    public static class PersistenceException extends Exception {
        public PersistenceException(String str, Throwable th) {
            super(str, th);
        }

        PersistenceException(String str) {
            super(str);
        }
    }

    public abstract void a();

    public abstract int b(String str);

    public abstract void h(String str);

    public abstract void i(String str, String str2);

    /* access modifiers changed from: package-private */
    public g j() {
        g gVar = this.f4588g;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("logSerializer not configured");
    }

    public abstract String k(String str, Collection<String> collection, int i2, List<d> list);

    public abstract long l(d dVar, String str, int i2);

    public void n(g gVar) {
        this.f4588g = gVar;
    }

    public abstract boolean o(long j2);
}
