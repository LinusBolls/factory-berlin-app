package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

public abstract class j {
    private static final Object a = new Object();
    private static j b;

    protected static final class a {
        private final String a;
        private final String b;
        private final ComponentName c = null;

        /* renamed from: d  reason: collision with root package name */
        private final int f2159d;

        public a(String str, String str2, int i2) {
            r.g(str);
            this.a = str;
            r.g(str2);
            this.b = str2;
            this.f2159d = i2;
        }

        public final ComponentName a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final Intent c(Context context) {
            if (this.a != null) {
                return new Intent(this.a).setPackage(this.b);
            }
            return new Intent().setComponent(this.c);
        }

        public final int d() {
            return this.f2159d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p.a(this.a, aVar.a) && p.a(this.b, aVar.b) && p.a(this.c, aVar.c) && this.f2159d == aVar.f2159d;
        }

        public final int hashCode() {
            return p.b(this.a, this.b, this.c, Integer.valueOf(this.f2159d));
        }

        public final String toString() {
            String str = this.a;
            return str == null ? this.c.flattenToString() : str;
        }
    }

    public static j a(Context context) {
        synchronized (a) {
            if (b == null) {
                b = new i0(context.getApplicationContext());
            }
        }
        return b;
    }

    public final void b(String str, String str2, int i2, ServiceConnection serviceConnection, String str3) {
        d(new a(str, str2, i2), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    public abstract boolean c(a aVar, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    public abstract void d(a aVar, ServiceConnection serviceConnection, String str);
}
