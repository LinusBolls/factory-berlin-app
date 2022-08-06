package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.h;
import com.google.android.gms.common.internal.c;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class z3 extends c<u3> {
    public z3(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(context, looper, 93, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    public final /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof u3) {
            return (u3) queryLocalInterface;
        }
        return new w3(iBinder);
    }

    public final int g() {
        return h.a;
    }

    /* access modifiers changed from: protected */
    public final String p() {
        return "com.google.android.gms.measurement.START";
    }
}
