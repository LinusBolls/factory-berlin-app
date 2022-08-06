package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public final class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new f();

    /* renamed from: g  reason: collision with root package name */
    private final int f3293g;

    /* renamed from: h  reason: collision with root package name */
    private final String f3294h;

    /* renamed from: i  reason: collision with root package name */
    private final String f3295i;

    e(int i2, String str, String str2) {
        this.f3293g = i2;
        this.f3294h = str;
        this.f3295i = str2;
    }

    public e(String str, String str2) {
        this(1, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && hashCode() == obj.hashCode()) {
            e eVar = (e) obj;
            return p.a(this.f3294h, eVar.f3294h) && p.a(this.f3295i, eVar.f3295i);
        }
    }

    public final int hashCode() {
        return p.b(this.f3294h, this.f3295i);
    }

    public final String toString() {
        String str = this.f3294h;
        String str2 = this.f3295i;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 17 + String.valueOf(str2).length());
        sb.append("namespace=");
        sb.append(str);
        sb.append(", type=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.q(parcel, 1, this.f3294h, false);
        b.q(parcel, 2, this.f3295i, false);
        b.l(parcel, 1000, this.f3293g);
        b.b(parcel, a);
    }
}
