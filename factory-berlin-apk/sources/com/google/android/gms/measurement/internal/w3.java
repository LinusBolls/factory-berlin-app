package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.measurement.v;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class w3 extends a implements u3 {
    w3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final void A(la laVar) {
        Parcel i2 = i();
        v.c(i2, laVar);
        o(20, i2);
    }

    public final void A0(s sVar, String str, String str2) {
        Parcel i2 = i();
        v.c(i2, sVar);
        i2.writeString(str);
        i2.writeString(str2);
        o(5, i2);
    }

    public final List<ua> B0(String str, String str2, la laVar) {
        Parcel i2 = i();
        i2.writeString(str);
        i2.writeString(str2);
        v.c(i2, laVar);
        Parcel l2 = l(16, i2);
        ArrayList<ua> createTypedArrayList = l2.createTypedArrayList(ua.CREATOR);
        l2.recycle();
        return createTypedArrayList;
    }

    public final void E(ua uaVar) {
        Parcel i2 = i();
        v.c(i2, uaVar);
        o(13, i2);
    }

    public final void K(ea eaVar, la laVar) {
        Parcel i2 = i();
        v.c(i2, eaVar);
        v.c(i2, laVar);
        o(2, i2);
    }

    public final void N(la laVar) {
        Parcel i2 = i();
        v.c(i2, laVar);
        o(6, i2);
    }

    public final List<ea> O(String str, String str2, String str3, boolean z) {
        Parcel i2 = i();
        i2.writeString(str);
        i2.writeString(str2);
        i2.writeString(str3);
        v.d(i2, z);
        Parcel l2 = l(15, i2);
        ArrayList<ea> createTypedArrayList = l2.createTypedArrayList(ea.CREATOR);
        l2.recycle();
        return createTypedArrayList;
    }

    public final byte[] T(s sVar, String str) {
        Parcel i2 = i();
        v.c(i2, sVar);
        i2.writeString(str);
        Parcel l2 = l(9, i2);
        byte[] createByteArray = l2.createByteArray();
        l2.recycle();
        return createByteArray;
    }

    public final void U(s sVar, la laVar) {
        Parcel i2 = i();
        v.c(i2, sVar);
        v.c(i2, laVar);
        o(1, i2);
    }

    public final String k0(la laVar) {
        Parcel i2 = i();
        v.c(i2, laVar);
        Parcel l2 = l(11, i2);
        String readString = l2.readString();
        l2.recycle();
        return readString;
    }

    public final void l0(Bundle bundle, la laVar) {
        Parcel i2 = i();
        v.c(i2, bundle);
        v.c(i2, laVar);
        o(19, i2);
    }

    public final List<ea> s(String str, String str2, boolean z, la laVar) {
        Parcel i2 = i();
        i2.writeString(str);
        i2.writeString(str2);
        v.d(i2, z);
        v.c(i2, laVar);
        Parcel l2 = l(14, i2);
        ArrayList<ea> createTypedArrayList = l2.createTypedArrayList(ea.CREATOR);
        l2.recycle();
        return createTypedArrayList;
    }

    public final List<ea> t(la laVar, boolean z) {
        Parcel i2 = i();
        v.c(i2, laVar);
        v.d(i2, z);
        Parcel l2 = l(7, i2);
        ArrayList<ea> createTypedArrayList = l2.createTypedArrayList(ea.CREATOR);
        l2.recycle();
        return createTypedArrayList;
    }

    public final void u(ua uaVar, la laVar) {
        Parcel i2 = i();
        v.c(i2, uaVar);
        v.c(i2, laVar);
        o(12, i2);
    }

    public final void u0(long j2, String str, String str2, String str3) {
        Parcel i2 = i();
        i2.writeLong(j2);
        i2.writeString(str);
        i2.writeString(str2);
        i2.writeString(str3);
        o(10, i2);
    }

    public final void w(la laVar) {
        Parcel i2 = i();
        v.c(i2, laVar);
        o(4, i2);
    }

    public final void y0(la laVar) {
        Parcel i2 = i();
        v.c(i2, laVar);
        o(18, i2);
    }

    public final List<ua> z0(String str, String str2, String str3) {
        Parcel i2 = i();
        i2.writeString(str);
        i2.writeString(str2);
        i2.writeString(str3);
        Parcel l2 = l(17, i2);
        ArrayList<ua> createTypedArrayList = l2.createTypedArrayList(ua.CREATOR);
        l2.recycle();
        return createTypedArrayList;
    }
}
