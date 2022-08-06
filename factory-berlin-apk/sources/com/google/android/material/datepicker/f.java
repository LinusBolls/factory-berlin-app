package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

/* compiled from: DateValidatorPointForward */
public class f implements a.c {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    private final long f3509g;

    /* compiled from: DateValidatorPointForward */
    static class a implements Parcelable.Creator<f> {
        a() {
        }

        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel.readLong(), (a) null);
        }

        /* renamed from: b */
        public f[] newArray(int i2) {
            return new f[i2];
        }
    }

    /* synthetic */ f(long j2, a aVar) {
        this(j2);
    }

    public static f a(long j2) {
        return new f(j2);
    }

    public boolean F(long j2) {
        return j2 >= this.f3509g;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && this.f3509g == ((f) obj).f3509g) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3509g)});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f3509g);
    }

    private f(long j2) {
        this.f3509g = j2;
    }
}
