package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class f4 extends a implements e2 {
    f4(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    public final Bundle f(Bundle bundle) {
        Parcel i2 = i();
        v.c(i2, bundle);
        Parcel l2 = l(1, i2);
        Bundle bundle2 = (Bundle) v.a(l2, Bundle.CREATOR);
        l2.recycle();
        return bundle2;
    }
}
