package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesImplBaseParcelizer {
    public static c read(VersionedParcel versionedParcel) {
        c cVar = new c();
        cVar.a = versionedParcel.p(cVar.a, 1);
        cVar.b = versionedParcel.p(cVar.b, 2);
        cVar.c = versionedParcel.p(cVar.c, 3);
        cVar.f1045d = versionedParcel.p(cVar.f1045d, 4);
        return cVar;
    }

    public static void write(c cVar, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.F(cVar.a, 1);
        versionedParcel.F(cVar.b, 2);
        versionedParcel.F(cVar.c, 3);
        versionedParcel.F(cVar.f1045d, 4);
    }
}
