package g.b.a.b.c.f;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.h;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.i;

public final class t0 extends i<q1> {
    public t0(Context context, Looper looper, d.a aVar, d.b bVar, e eVar) {
        super(context, looper, 69, eVar, aVar, bVar);
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService";
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
        return queryLocalInterface instanceof q1 ? (q1) queryLocalInterface : new r1(iBinder);
    }

    public final int g() {
        return h.a;
    }

    /* access modifiers changed from: protected */
    public final String p() {
        return "com.google.android.gms.nearby.bootstrap.service.NearbyBootstrapService.START";
    }
}
