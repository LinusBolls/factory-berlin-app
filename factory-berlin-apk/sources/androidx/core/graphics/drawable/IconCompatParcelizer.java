package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = versionedParcel.p(iconCompat.a, 1);
        iconCompat.c = versionedParcel.j(iconCompat.c, 2);
        iconCompat.f709d = versionedParcel.r(iconCompat.f709d, 3);
        iconCompat.f710e = versionedParcel.p(iconCompat.f710e, 4);
        iconCompat.f711f = versionedParcel.p(iconCompat.f711f, 5);
        iconCompat.f712g = (ColorStateList) versionedParcel.r(iconCompat.f712g, 6);
        iconCompat.f714i = versionedParcel.t(iconCompat.f714i, 7);
        iconCompat.l();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(true, true);
        iconCompat.m(versionedParcel.f());
        int i2 = iconCompat.a;
        if (-1 != i2) {
            versionedParcel.F(i2, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            versionedParcel.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f709d;
        if (parcelable != null) {
            versionedParcel.H(parcelable, 3);
        }
        int i3 = iconCompat.f710e;
        if (i3 != 0) {
            versionedParcel.F(i3, 4);
        }
        int i4 = iconCompat.f711f;
        if (i4 != 0) {
            versionedParcel.F(i4, 5);
        }
        ColorStateList colorStateList = iconCompat.f712g;
        if (colorStateList != null) {
            versionedParcel.H(colorStateList, 6);
        }
        String str = iconCompat.f714i;
        if (str != null) {
            versionedParcel.J(str, 7);
        }
    }
}
