package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public abstract class g5 extends s0 implements e2 {
    public static e2 l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof e2) {
            return (e2) queryLocalInterface;
        }
        return new f4(iBinder);
    }
}
