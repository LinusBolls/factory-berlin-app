package g.b.a.b.c.f;

import android.os.Parcel;

public abstract class c0 extends r implements b0 {
    /* access modifiers changed from: protected */
    public final boolean i(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 2) {
            v((p0) s.a(parcel, p0.CREATOR));
            return true;
        } else if (i2 != 3) {
            return false;
        } else {
            j0((r0) s.a(parcel, r0.CREATOR));
            return true;
        }
    }
}
