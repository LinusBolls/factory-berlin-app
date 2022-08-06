package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class PendingCallback implements Parcelable, ReflectedParcelable {
    public static final Parcelable.Creator<PendingCallback> CREATOR = new i();

    /* renamed from: g  reason: collision with root package name */
    final IBinder f2191g;

    public PendingCallback(Parcel parcel) {
        this.f2191g = parcel.readStrongBinder();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStrongBinder(this.f2191g);
    }
}
