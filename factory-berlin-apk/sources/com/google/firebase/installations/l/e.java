package com.google.firebase.installations.l;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.l.b;

@AutoValue
/* compiled from: TokenResult */
public abstract class e {

    @AutoValue.Builder
    /* compiled from: TokenResult */
    public static abstract class a {
        public abstract e a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j2);
    }

    /* compiled from: TokenResult */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        b.C0113b bVar = new b.C0113b();
        bVar.d(0);
        return bVar;
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
