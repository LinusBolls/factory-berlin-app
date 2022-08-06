package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public final class af extends gf {
    private final AtomicReference<Bundle> a = new AtomicReference<>();
    private boolean b;

    public static <T> T l(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e2) {
            String canonicalName = cls.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            Log.w("AM", String.format("Unexpected object type. Expected, Received".concat(": %s, %s"), new Object[]{canonicalName, canonicalName2}), e2);
            throw e2;
        }
    }

    public final Bundle S0(long j2) {
        Bundle bundle;
        synchronized (this.a) {
            if (!this.b) {
                try {
                    this.a.wait(j2);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.a.get();
        }
        return bundle;
    }

    public final void f(Bundle bundle) {
        synchronized (this.a) {
            try {
                this.a.set(bundle);
                this.b = true;
                this.a.notify();
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }

    public final String o(long j2) {
        return (String) l(S0(j2), String.class);
    }
}
