package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable;

final class h implements Parcelable.Creator<OneoffTask> {
    h() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new OneoffTask(parcel, (h) null);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new OneoffTask[i2];
    }
}
