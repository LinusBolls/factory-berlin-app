package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable;

final class i implements Parcelable.Creator<PendingCallback> {
    i() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PendingCallback(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new PendingCallback[i2];
    }
}
