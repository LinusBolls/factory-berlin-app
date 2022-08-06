package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class LocationResult extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationResult> CREATOR = new n();

    /* renamed from: h  reason: collision with root package name */
    static final List<Location> f2676h = Collections.emptyList();

    /* renamed from: g  reason: collision with root package name */
    private final List<Location> f2677g;

    LocationResult(List<Location> list) {
        this.f2677g = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.f2677g.size() != this.f2677g.size()) {
            return false;
        }
        Iterator<Location> it = this.f2677g.iterator();
        for (Location time : locationResult.f2677g) {
            if (it.next().getTime() != time.getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 17;
        for (Location time : this.f2677g) {
            long time2 = time.getTime();
            i2 = (i2 * 31) + ((int) (time2 ^ (time2 >>> 32)));
        }
        return i2;
    }

    public final List<Location> l() {
        return this.f2677g;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2677g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.t(parcel, 1, l(), false);
        b.b(parcel, a);
    }
}
