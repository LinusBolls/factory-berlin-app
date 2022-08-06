package g.b.a.b.c.e;

import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.b0;
import com.google.android.gms.location.h;

final class m extends b0 {
    private final i<h> a;

    public final void P0(LocationAvailability locationAvailability) {
        this.a.a(new o(this, locationAvailability));
    }

    public final void R(LocationResult locationResult) {
        this.a.a(new n(this, locationResult));
    }
}
