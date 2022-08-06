package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: Month */
final class l implements Comparable<l>, Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    private final Calendar f3528g;

    /* renamed from: h  reason: collision with root package name */
    private final String f3529h = r.n().format(this.f3528g.getTime());

    /* renamed from: i  reason: collision with root package name */
    final int f3530i;

    /* renamed from: j  reason: collision with root package name */
    final int f3531j = this.f3528g.get(1);

    /* renamed from: k  reason: collision with root package name */
    final int f3532k = this.f3528g.getMaximum(7);

    /* renamed from: l  reason: collision with root package name */
    final int f3533l = this.f3528g.getActualMaximum(5);

    /* renamed from: m  reason: collision with root package name */
    final long f3534m = this.f3528g.getTimeInMillis();

    /* compiled from: Month */
    static class a implements Parcelable.Creator<l> {
        a() {
        }

        /* renamed from: a */
        public l createFromParcel(Parcel parcel) {
            return l.f(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public l[] newArray(int i2) {
            return new l[i2];
        }
    }

    private l(Calendar calendar) {
        calendar.set(5, 1);
        Calendar d2 = r.d(calendar);
        this.f3528g = d2;
        this.f3530i = d2.get(2);
    }

    static l f(int i2, int i3) {
        Calendar k2 = r.k();
        k2.set(1, i2);
        k2.set(2, i3);
        return new l(k2);
    }

    static l h(long j2) {
        Calendar k2 = r.k();
        k2.setTimeInMillis(j2);
        return new l(k2);
    }

    static l p() {
        return new l(r.i());
    }

    /* renamed from: a */
    public int compareTo(l lVar) {
        return this.f3528g.compareTo(lVar.f3528g);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f3530i == lVar.f3530i && this.f3531j == lVar.f3531j) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3530i), Integer.valueOf(this.f3531j)});
    }

    /* access modifiers changed from: package-private */
    public int i() {
        int firstDayOfWeek = this.f3528g.get(7) - this.f3528g.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f3532k : firstDayOfWeek;
    }

    /* access modifiers changed from: package-private */
    public long j(int i2) {
        Calendar d2 = r.d(this.f3528g);
        d2.set(5, i2);
        return d2.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    public String k() {
        return this.f3529h;
    }

    /* access modifiers changed from: package-private */
    public long l() {
        return this.f3528g.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    public l n(int i2) {
        Calendar d2 = r.d(this.f3528g);
        d2.add(2, i2);
        return new l(d2);
    }

    /* access modifiers changed from: package-private */
    public int o(l lVar) {
        if (this.f3528g instanceof GregorianCalendar) {
            return ((lVar.f3531j - this.f3531j) * 12) + (lVar.f3530i - this.f3530i);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f3531j);
        parcel.writeInt(this.f3530i);
    }
}
