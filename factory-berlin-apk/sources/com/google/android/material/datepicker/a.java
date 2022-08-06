package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: CalendarConstraints */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0074a();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final l f3492g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final l f3493h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final l f3494i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final c f3495j;

    /* renamed from: k  reason: collision with root package name */
    private final int f3496k;

    /* renamed from: l  reason: collision with root package name */
    private final int f3497l;

    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    /* compiled from: CalendarConstraints */
    static class C0074a implements Parcelable.Creator<a> {
        C0074a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a((l) parcel.readParcelable(l.class.getClassLoader()), (l) parcel.readParcelable(l.class.getClassLoader()), (l) parcel.readParcelable(l.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (C0074a) null);
        }

        /* renamed from: b */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    /* compiled from: CalendarConstraints */
    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        static final long f3498e = r.a(l.f(1900, 0).f3534m);

        /* renamed from: f  reason: collision with root package name */
        static final long f3499f = r.a(l.f(2100, 11).f3534m);
        private long a = f3498e;
        private long b = f3499f;
        private Long c;

        /* renamed from: d  reason: collision with root package name */
        private c f3500d = f.a(Long.MIN_VALUE);

        b(a aVar) {
            this.a = aVar.f3492g.f3534m;
            this.b = aVar.f3493h.f3534m;
            this.c = Long.valueOf(aVar.f3494i.f3534m);
            this.f3500d = aVar.f3495j;
        }

        public a a() {
            if (this.c == null) {
                long w2 = i.w2();
                if (this.a > w2 || w2 > this.b) {
                    w2 = this.a;
                }
                this.c = Long.valueOf(w2);
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f3500d);
            return new a(l.h(this.a), l.h(this.b), l.h(this.c.longValue()), (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY"), (C0074a) null);
        }

        public b b(long j2) {
            this.c = Long.valueOf(j2);
            return this;
        }
    }

    /* compiled from: CalendarConstraints */
    public interface c extends Parcelable {
        boolean F(long j2);
    }

    /* synthetic */ a(l lVar, l lVar2, l lVar3, c cVar, C0074a aVar) {
        this(lVar, lVar2, lVar3, cVar);
    }

    public int describeContents() {
        return 0;
    }

    public c e() {
        return this.f3495j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f3492g.equals(aVar.f3492g) || !this.f3493h.equals(aVar.f3493h) || !this.f3494i.equals(aVar.f3494i) || !this.f3495j.equals(aVar.f3495j)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public l f() {
        return this.f3493h;
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f3497l;
    }

    /* access modifiers changed from: package-private */
    public l h() {
        return this.f3494i;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3492g, this.f3493h, this.f3494i, this.f3495j});
    }

    /* access modifiers changed from: package-private */
    public l i() {
        return this.f3492g;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.f3496k;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f3492g, 0);
        parcel.writeParcelable(this.f3493h, 0);
        parcel.writeParcelable(this.f3494i, 0);
        parcel.writeParcelable(this.f3495j, 0);
    }

    private a(l lVar, l lVar2, l lVar3, c cVar) {
        this.f3492g = lVar;
        this.f3493h = lVar2;
        this.f3494i = lVar3;
        this.f3495j = cVar;
        if (lVar.compareTo(lVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (lVar3.compareTo(lVar2) <= 0) {
            this.f3497l = lVar.o(lVar2) + 1;
            this.f3496k = (lVar2.f3531j - lVar.f3531j) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }
}
