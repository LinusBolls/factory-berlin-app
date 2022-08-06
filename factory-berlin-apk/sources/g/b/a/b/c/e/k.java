package g.b.a.b.c.e;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.g;
import com.google.android.gms.location.r;

public final class k extends a implements j {
    k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final void B(r rVar, h hVar) {
        Parcel i2 = i();
        d0.c(i2, rVar);
        d0.b(i2, hVar);
        o(74, i2);
    }

    public final void G0(g gVar, PendingIntent pendingIntent, h hVar) {
        Parcel i2 = i();
        d0.c(i2, gVar);
        d0.c(i2, pendingIntent);
        d0.b(i2, hVar);
        o(57, i2);
    }

    public final void J0(i0 i0Var) {
        Parcel i2 = i();
        d0.c(i2, i0Var);
        o(75, i2);
    }

    public final Location a(String str) {
        Parcel i2 = i();
        i2.writeString(str);
        Parcel l2 = l(21, i2);
        Location location = (Location) d0.a(l2, Location.CREATOR);
        l2.recycle();
        return location;
    }

    public final void a0(boolean z) {
        Parcel i2 = i();
        d0.d(i2, z);
        o(12, i2);
    }

    public final void h0(y yVar) {
        Parcel i2 = i();
        d0.c(i2, yVar);
        o(59, i2);
    }
}
