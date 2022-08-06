package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesImplApi21Parcelizer {
    public static b read(VersionedParcel versionedParcel) {
        b bVar = new b();
        bVar.a = (AudioAttributes) versionedParcel.r(bVar.a, 1);
        bVar.b = versionedParcel.p(bVar.b, 2);
        return bVar;
    }

    public static void write(b bVar, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.H(bVar.a, 1);
        versionedParcel.F(bVar.b, 2);
    }
}
