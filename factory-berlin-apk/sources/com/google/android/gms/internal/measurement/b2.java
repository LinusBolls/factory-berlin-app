package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;
import androidx.core.content.b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class b2 implements w1 {
    private static b2 c;
    private final Context a;
    private final ContentObserver b;

    private b2(Context context) {
        this.a = context;
        this.b = new d2(this, (Handler) null);
        context.getContentResolver().registerContentObserver(o1.a, true, this.b);
    }

    static b2 b(Context context) {
        b2 b2Var;
        synchronized (b2.class) {
            if (c == null) {
                c = b.c(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new b2(context) : new b2();
            }
            b2Var = c;
        }
        return b2Var;
    }

    static synchronized void c() {
        synchronized (b2.class) {
            if (!(c == null || c.a == null || c.b == null)) {
                c.a.getContentResolver().unregisterContentObserver(c.b);
            }
            c = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final String a(String str) {
        if (this.a == null) {
            return null;
        }
        try {
            return (String) z1.a(new a2(this, str));
        } catch (IllegalStateException | SecurityException e2) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String d(String str) {
        return o1.a(this.a.getContentResolver(), str, (String) null);
    }

    private b2() {
        this.a = null;
        this.b = null;
    }
}
