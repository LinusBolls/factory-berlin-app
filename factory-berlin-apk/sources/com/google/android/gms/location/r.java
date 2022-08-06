package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.Collections;
import java.util.List;

public final class r extends a {
    public static final Parcelable.Creator<r> CREATOR = new s();

    /* renamed from: g  reason: collision with root package name */
    private final List<String> f2692g;

    /* renamed from: h  reason: collision with root package name */
    private final PendingIntent f2693h;

    /* renamed from: i  reason: collision with root package name */
    private final String f2694i;

    r(List<String> list, PendingIntent pendingIntent, String str) {
        this.f2692g = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f2693h = pendingIntent;
        this.f2694i = str;
    }

    public static r l(PendingIntent pendingIntent) {
        com.google.android.gms.common.internal.r.l(pendingIntent, "PendingIntent can not be null.");
        return new r((List<String>) null, pendingIntent, "");
    }

    public static r n(List<String> list) {
        com.google.android.gms.common.internal.r.l(list, "geofence can't be null.");
        com.google.android.gms.common.internal.r.b(!list.isEmpty(), "Geofences must contains at least one id.");
        return new r(list, (PendingIntent) null, "");
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.r(parcel, 1, this.f2692g, false);
        b.o(parcel, 2, this.f2693h, i2, false);
        b.q(parcel, 3, this.f2694i, false);
        b.b(parcel, a);
    }
}
