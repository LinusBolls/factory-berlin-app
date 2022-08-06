package g.b.a.b.c.f;

import android.os.Parcel;

public abstract class w extends r implements v {
    /* access modifiers changed from: protected */
    public final boolean i(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 2) {
            w0((f0) s.a(parcel, f0.CREATOR));
            return true;
        } else if (i2 == 3) {
            Y((h0) s.a(parcel, h0.CREATOR));
            return true;
        } else if (i2 == 4) {
            I0((j0) s.a(parcel, j0.CREATOR));
            return true;
        } else if (i2 != 5) {
            return false;
        } else {
            M((d0) s.a(parcel, d0.CREATOR));
            return true;
        }
    }
}
