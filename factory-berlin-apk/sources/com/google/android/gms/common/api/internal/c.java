package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.u;

public abstract class c<R extends g, A extends a.b> extends BasePendingResult<R> implements d<R> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected c(a<?> aVar, d dVar) {
        super(dVar);
        r.l(dVar, "GoogleApiClient must not be null");
        r.l(aVar, "Api must not be null");
        aVar.a();
    }

    private void q(RemoteException remoteException) {
        b(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    public /* bridge */ /* synthetic */ void a(Object obj) {
        super.h((g) obj);
    }

    public final void b(Status status) {
        r.b(!status.q(), "Failed result must not be success");
        e(status);
        h(status);
        o(status);
    }

    /* access modifiers changed from: protected */
    public abstract void n(A a);

    /* access modifiers changed from: protected */
    public void o(R r) {
    }

    public final void p(A a) {
        if (a instanceof u) {
            a = ((u) a).k0();
        }
        try {
            n(a);
        } catch (DeadObjectException e2) {
            q(e2);
            throw e2;
        } catch (RemoteException e3) {
            q(e3);
        }
    }
}
