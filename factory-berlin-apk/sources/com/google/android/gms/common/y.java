package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.n0;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.dynamic.b;

public final class y extends a {
    public static final Parcelable.Creator<y> CREATOR = new z();

    /* renamed from: g  reason: collision with root package name */
    private final String f2177g;

    /* renamed from: h  reason: collision with root package name */
    private final s f2178h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f2179i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f2180j;

    y(String str, IBinder iBinder, boolean z, boolean z2) {
        this.f2177g = str;
        this.f2178h = l(iBinder);
        this.f2179i = z;
        this.f2180j = z2;
    }

    private static s l(IBinder iBinder) {
        byte[] bArr;
        if (iBinder == null) {
            return null;
        }
        try {
            com.google.android.gms.dynamic.a c = n0.l(iBinder).c();
            if (c == null) {
                bArr = null;
            } else {
                bArr = (byte[]) b.o(c);
            }
            if (bArr != null) {
                return new t(bArr);
            }
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            return null;
        } catch (RemoteException e2) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e2);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.q(parcel, 1, this.f2177g, false);
        s sVar = this.f2178h;
        if (sVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            sVar = null;
        } else {
            sVar.asBinder();
        }
        com.google.android.gms.common.internal.safeparcel.b.k(parcel, 2, sVar, false);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 3, this.f2179i);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 4, this.f2180j);
        com.google.android.gms.common.internal.safeparcel.b.b(parcel, a);
    }

    y(String str, s sVar, boolean z, boolean z2) {
        this.f2177g = str;
        this.f2178h = sVar;
        this.f2179i = z;
        this.f2180j = z2;
    }
}
