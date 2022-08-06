package g.b.a.b.c.f;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.h;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.i;
import e.e.b;
import g.b.a.b.d.a;
import java.util.Set;

public final class v1 extends i<z> {
    private final Set<m> A = new b();
    private final Set<x1> B = new b();
    private w0 C;
    private final long y = ((long) hashCode());
    private final Set<h> z = new b();

    public v1(Context context, Looper looper, e eVar, d.a aVar, d.b bVar) {
        super(context, looper, 54, eVar, aVar, bVar);
    }

    private final void k0() {
        for (h l2 : this.z) {
            l2.l();
        }
        for (m l3 : this.A) {
            l3.l();
        }
        for (x1 l4 : this.B) {
            l4.l();
        }
        this.z.clear();
        this.A.clear();
        this.B.clear();
        w0 w0Var = this.C;
        if (w0Var != null) {
            w0Var.a();
            this.C = null;
        }
    }

    /* access modifiers changed from: private */
    public static Status l0(int i2) {
        return new Status(i2, g.b.a.b.d.b.d.a(i2));
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void D(IInterface iInterface) {
        super.D((z) iInterface);
        this.C = new w0();
    }

    public final void F(int i2) {
        if (i2 == 1) {
            k0();
        }
        super.F(i2);
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        return queryLocalInterface instanceof z ? (z) queryLocalInterface : new a0(iBinder);
    }

    public final boolean f() {
        return a.c(x());
    }

    public final int g() {
        return h.a;
    }

    public final void m() {
        if (b()) {
            try {
                ((z) B()).r(new t1().a());
            } catch (RemoteException e2) {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", e2);
            }
        }
        k0();
        super.m();
    }

    /* access modifiers changed from: protected */
    public final String p() {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    /* access modifiers changed from: protected */
    public final Bundle y() {
        Bundle bundle = new Bundle();
        bundle.putLong("clientId", this.y);
        return bundle;
    }
}
