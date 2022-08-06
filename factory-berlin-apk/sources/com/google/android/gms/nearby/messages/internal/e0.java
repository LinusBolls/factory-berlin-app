package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public final class e0 extends a {
    public static final Parcelable.Creator<e0> CREATOR = new f0();

    /* renamed from: g  reason: collision with root package name */
    private final int f3296g;
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    private final ClientAppContext f3297h;

    /* renamed from: i  reason: collision with root package name */
    private final int f3298i;

    public e0(int i2) {
        this(1, (ClientAppContext) null, i2);
    }

    e0(int i2, ClientAppContext clientAppContext, int i3) {
        this.f3296g = i2;
        this.f3297h = clientAppContext;
        this.f3298i = i3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.l(parcel, 1, this.f3296g);
        b.o(parcel, 2, this.f3297h, i2, false);
        b.l(parcel, 3, this.f3298i);
        b.b(parcel, a);
    }
}
