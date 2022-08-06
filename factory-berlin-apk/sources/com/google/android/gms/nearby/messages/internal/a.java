package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.b;

public final class a extends com.google.android.gms.common.internal.safeparcel.a implements com.google.android.gms.nearby.messages.a {
    public static final Parcelable.Creator<a> CREATOR = new o();

    /* renamed from: g  reason: collision with root package name */
    private final int f3287g;

    /* renamed from: h  reason: collision with root package name */
    private final int f3288h;

    /* renamed from: i  reason: collision with root package name */
    private final int f3289i;

    a(int i2, int i3, int i4) {
        this.f3287g = i2;
        this.f3288h = i3;
        this.f3289i = (-169 >= i4 || i4 >= 87) ? RecyclerView.UNDEFINED_DURATION : i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.nearby.messages.a)) {
            return false;
        }
        com.google.android.gms.nearby.messages.a aVar = (com.google.android.gms.nearby.messages.a) obj;
        return this.f3288h == aVar.j() && this.f3289i == aVar.i();
    }

    public final int hashCode() {
        return p.b(Integer.valueOf(this.f3288h), Integer.valueOf(this.f3289i));
    }

    public final int i() {
        return this.f3289i;
    }

    public final int j() {
        return this.f3288h;
    }

    public final String toString() {
        int i2 = this.f3288h;
        int i3 = this.f3289i;
        StringBuilder sb = new StringBuilder(48);
        sb.append("BleSignal{rssi=");
        sb.append(i2);
        sb.append(", txPower=");
        sb.append(i3);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.l(parcel, 1, this.f3287g);
        b.l(parcel, 2, this.f3288h);
        b.l(parcel, 3, this.f3289i);
        b.b(parcel, a);
    }
}
