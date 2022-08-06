package g.b.a.b.c.a;

import android.os.IBinder;
import android.os.Parcel;

public final class f extends a implements d {
    f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    public final String getId() {
        Parcel l2 = l(1, i());
        String readString = l2.readString();
        l2.recycle();
        return readString;
    }

    public final boolean p0(boolean z) {
        Parcel i2 = i();
        c.a(i2, true);
        Parcel l2 = l(2, i2);
        boolean b = c.b(l2);
        l2.recycle();
        return b;
    }
}
