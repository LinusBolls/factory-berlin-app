package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class ka implements Parcelable.Creator<la> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int x = SafeParcelReader.x(parcel);
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        long j7 = -2147483648L;
        String str9 = "";
        boolean z = true;
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            switch (SafeParcelReader.i(p)) {
                case 2:
                    str = SafeParcelReader.d(parcel2, p);
                    break;
                case 3:
                    str2 = SafeParcelReader.d(parcel2, p);
                    break;
                case 4:
                    str3 = SafeParcelReader.d(parcel2, p);
                    break;
                case 5:
                    str4 = SafeParcelReader.d(parcel2, p);
                    break;
                case 6:
                    j2 = SafeParcelReader.s(parcel2, p);
                    break;
                case 7:
                    j3 = SafeParcelReader.s(parcel2, p);
                    break;
                case 8:
                    str5 = SafeParcelReader.d(parcel2, p);
                    break;
                case 9:
                    z = SafeParcelReader.j(parcel2, p);
                    break;
                case 10:
                    z2 = SafeParcelReader.j(parcel2, p);
                    break;
                case 11:
                    j7 = SafeParcelReader.s(parcel2, p);
                    break;
                case 12:
                    str6 = SafeParcelReader.d(parcel2, p);
                    break;
                case 13:
                    j4 = SafeParcelReader.s(parcel2, p);
                    break;
                case 14:
                    j5 = SafeParcelReader.s(parcel2, p);
                    break;
                case 15:
                    i2 = SafeParcelReader.r(parcel2, p);
                    break;
                case 16:
                    z3 = SafeParcelReader.j(parcel2, p);
                    break;
                case 17:
                    z4 = SafeParcelReader.j(parcel2, p);
                    break;
                case 18:
                    z5 = SafeParcelReader.j(parcel2, p);
                    break;
                case 19:
                    str7 = SafeParcelReader.d(parcel2, p);
                    break;
                case 21:
                    bool = SafeParcelReader.k(parcel2, p);
                    break;
                case 22:
                    j6 = SafeParcelReader.s(parcel2, p);
                    break;
                case 23:
                    arrayList = SafeParcelReader.e(parcel2, p);
                    break;
                case 24:
                    str8 = SafeParcelReader.d(parcel2, p);
                    break;
                case 25:
                    str9 = SafeParcelReader.d(parcel2, p);
                    break;
                default:
                    SafeParcelReader.w(parcel2, p);
                    break;
            }
        }
        SafeParcelReader.h(parcel2, x);
        return new la(str, str2, str3, str4, j2, j3, str5, z, z2, j7, str6, j4, j5, i2, z3, z4, z5, str7, bool, j6, (List<String>) arrayList, str8, str9);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new la[i2];
    }
}
