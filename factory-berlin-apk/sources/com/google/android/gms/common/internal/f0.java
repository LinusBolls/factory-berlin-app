package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public final class f0 extends a {
    public static final Parcelable.Creator<f0> CREATOR = new g0();

    /* renamed from: g  reason: collision with root package name */
    Bundle f2144g;

    /* renamed from: h  reason: collision with root package name */
    d[] f2145h;

    f0(Bundle bundle, d[] dVarArr) {
        this.f2144g = bundle;
        this.f2145h = dVarArr;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.e(parcel, 1, this.f2144g, false);
        b.s(parcel, 2, this.f2145h, i2, false);
        b.b(parcel, a);
    }

    public f0() {
    }
}
