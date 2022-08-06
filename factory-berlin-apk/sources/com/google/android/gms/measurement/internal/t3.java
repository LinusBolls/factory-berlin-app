package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.s0;
import com.google.android.gms.internal.measurement.v;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public abstract class t3 extends s0 implements u3 {
    public t3() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* access modifiers changed from: protected */
    public final boolean i(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                U((s) v.a(parcel, s.CREATOR), (la) v.a(parcel, la.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                K((ea) v.a(parcel, ea.CREATOR), (la) v.a(parcel, la.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                w((la) v.a(parcel, la.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                A0((s) v.a(parcel, s.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                N((la) v.a(parcel, la.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                List<ea> t = t((la) v.a(parcel, la.CREATOR), v.e(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(t);
                return true;
            case 9:
                byte[] T = T((s) v.a(parcel, s.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(T);
                return true;
            case 10:
                u0(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String k0 = k0((la) v.a(parcel, la.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(k0);
                return true;
            case 12:
                u((ua) v.a(parcel, ua.CREATOR), (la) v.a(parcel, la.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                E((ua) v.a(parcel, ua.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                List<ea> s = s(parcel.readString(), parcel.readString(), v.e(parcel), (la) v.a(parcel, la.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(s);
                return true;
            case 15:
                List<ea> O = O(parcel.readString(), parcel.readString(), parcel.readString(), v.e(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(O);
                return true;
            case 16:
                List<ua> B0 = B0(parcel.readString(), parcel.readString(), (la) v.a(parcel, la.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(B0);
                return true;
            case 17:
                List<ua> z0 = z0(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(z0);
                return true;
            case 18:
                y0((la) v.a(parcel, la.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                l0((Bundle) v.a(parcel, Bundle.CREATOR), (la) v.a(parcel, la.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                A((la) v.a(parcel, la.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
