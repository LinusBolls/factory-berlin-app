package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import g.b.a.b.c.f.r;

public abstract class c extends r implements b {
    public c() {
        super("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean i(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        K0();
        return true;
    }
}
