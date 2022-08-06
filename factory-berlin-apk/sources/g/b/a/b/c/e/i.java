package g.b.a.b.c.e;

import android.app.PendingIntent;
import android.os.Parcel;

public abstract class i extends t implements h {
    public i() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean i(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            m0(parcel.readInt(), parcel.createStringArray());
        } else if (i2 == 2) {
            N0(parcel.readInt(), parcel.createStringArray());
        } else if (i2 != 3) {
            return false;
        } else {
            E0(parcel.readInt(), (PendingIntent) d0.a(parcel, PendingIntent.CREATOR));
        }
        return true;
    }
}
