package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.a;

public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new o();

    /* renamed from: k  reason: collision with root package name */
    public static final b f2098k = new b(0);

    /* renamed from: g  reason: collision with root package name */
    private final int f2099g;

    /* renamed from: h  reason: collision with root package name */
    private final int f2100h;

    /* renamed from: i  reason: collision with root package name */
    private final PendingIntent f2101i;

    /* renamed from: j  reason: collision with root package name */
    private final String f2102j;

    b(int i2, int i3, PendingIntent pendingIntent, String str) {
        this.f2099g = i2;
        this.f2100h = i3;
        this.f2101i = pendingIntent;
        this.f2102j = str;
    }

    static String L(int i2) {
        if (i2 == 99) {
            return "UNFINISHED";
        }
        if (i2 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i2) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i2) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i2);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean K() {
        return this.f2100h == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2100h == bVar.f2100h && p.a(this.f2101i, bVar.f2101i) && p.a(this.f2102j, bVar.f2102j);
    }

    public final int hashCode() {
        return p.b(Integer.valueOf(this.f2100h), this.f2101i, this.f2102j);
    }

    public final int l() {
        return this.f2100h;
    }

    public final String n() {
        return this.f2102j;
    }

    public final PendingIntent o() {
        return this.f2101i;
    }

    public final boolean q() {
        return (this.f2100h == 0 || this.f2101i == null) ? false : true;
    }

    public final String toString() {
        p.a c = p.c(this);
        c.a("statusCode", L(this.f2100h));
        c.a("resolution", this.f2101i);
        c.a("message", this.f2102j);
        return c.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, 1, this.f2099g);
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, 2, l());
        com.google.android.gms.common.internal.safeparcel.b.o(parcel, 3, o(), i2, false);
        com.google.android.gms.common.internal.safeparcel.b.q(parcel, 4, n(), false);
        com.google.android.gms.common.internal.safeparcel.b.b(parcel, a);
    }

    public b(int i2) {
        this(i2, (PendingIntent) null, (String) null);
    }

    public b(int i2, PendingIntent pendingIntent) {
        this(i2, pendingIntent, (String) null);
    }

    public b(int i2, PendingIntent pendingIntent, String str) {
        this(1, i2, pendingIntent, str);
    }
}
