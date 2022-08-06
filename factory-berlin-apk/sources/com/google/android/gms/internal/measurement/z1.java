package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final /* synthetic */ class z1 {
    public static <V> V a(y1<V> y1Var) {
        long clearCallingIdentity;
        try {
            return y1Var.b();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V b = y1Var.b();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return b;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
