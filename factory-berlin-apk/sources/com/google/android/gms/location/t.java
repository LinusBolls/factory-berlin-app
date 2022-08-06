package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public final class t extends a {
    public static final Parcelable.Creator<t> CREATOR = new u();

    /* renamed from: g  reason: collision with root package name */
    private boolean f2695g;

    /* renamed from: h  reason: collision with root package name */
    private long f2696h;

    /* renamed from: i  reason: collision with root package name */
    private float f2697i;

    /* renamed from: j  reason: collision with root package name */
    private long f2698j;

    /* renamed from: k  reason: collision with root package name */
    private int f2699k;

    public t() {
        this(true, 50, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    t(boolean z, long j2, float f2, long j3, int i2) {
        this.f2695g = z;
        this.f2696h = j2;
        this.f2697i = f2;
        this.f2698j = j3;
        this.f2699k = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f2695g == tVar.f2695g && this.f2696h == tVar.f2696h && Float.compare(this.f2697i, tVar.f2697i) == 0 && this.f2698j == tVar.f2698j && this.f2699k == tVar.f2699k;
    }

    public final int hashCode() {
        return p.b(Boolean.valueOf(this.f2695g), Long.valueOf(this.f2696h), Float.valueOf(this.f2697i), Long.valueOf(this.f2698j), Integer.valueOf(this.f2699k));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f2695g);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f2696h);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f2697i);
        long j2 = this.f2698j;
        if (j2 != Long.MAX_VALUE) {
            sb.append(" expireIn=");
            sb.append(j2 - SystemClock.elapsedRealtime());
            sb.append("ms");
        }
        if (this.f2699k != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f2699k);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.c(parcel, 1, this.f2695g);
        b.m(parcel, 2, this.f2696h);
        b.i(parcel, 3, this.f2697i);
        b.m(parcel, 4, this.f2698j);
        b.l(parcel, 5, this.f2699k);
        b.b(parcel, a);
    }
}
