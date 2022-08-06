package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import g.b.a.b.c.f.r;
import g.b.a.b.c.f.s;

public abstract class l0 extends r implements k0 {
    public l0() {
        super("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean i(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        P((Status) s.a(parcel, Status.CREATOR));
        return true;
    }
}
