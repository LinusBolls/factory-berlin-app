package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class n extends a implements Iterable<String> {
    public static final Parcelable.Creator<n> CREATOR = new p();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f2993g;

    n(Bundle bundle) {
        this.f2993g = bundle;
    }

    /* access modifiers changed from: package-private */
    public final Double K(String str) {
        return Double.valueOf(this.f2993g.getDouble(str));
    }

    /* access modifiers changed from: package-private */
    public final String L(String str) {
        return this.f2993g.getString(str);
    }

    public final int b() {
        return this.f2993g.size();
    }

    public final Iterator<String> iterator() {
        return new q(this);
    }

    /* access modifiers changed from: package-private */
    public final Object n(String str) {
        return this.f2993g.get(str);
    }

    public final Bundle o() {
        return new Bundle(this.f2993g);
    }

    /* access modifiers changed from: package-private */
    public final Long q(String str) {
        return Long.valueOf(this.f2993g.getLong(str));
    }

    public final String toString() {
        return this.f2993g.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.e(parcel, 2, o(), false);
        b.b(parcel, a);
    }
}
