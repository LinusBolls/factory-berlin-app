package g.b.a.b.c.f;

import android.os.Parcel;

public abstract class y extends r implements x {
    /* access modifiers changed from: protected */
    public final boolean i(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 2) {
            f0((l0) s.a(parcel, l0.CREATOR));
            return true;
        } else if (i2 == 3) {
            Q0((n0) s.a(parcel, n0.CREATOR));
            return true;
        } else if (i2 != 4) {
            return false;
        } else {
            g0((u0) s.a(parcel, u0.CREATOR));
            return true;
        }
    }
}
