package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.tasks.h;

abstract class m0<T> extends e0 {
    protected final h<T> a;

    public m0(int i2, h<T> hVar) {
        super(i2);
        this.a = hVar;
    }

    public void b(Status status) {
        this.a.d(new ApiException(status));
    }

    public final void c(e.a<?> aVar) {
        try {
            i(aVar);
        } catch (DeadObjectException e2) {
            b(u.a(e2));
            throw e2;
        } catch (RemoteException e3) {
            b(u.a(e3));
        } catch (RuntimeException e4) {
            e(e4);
        }
    }

    public void e(RuntimeException runtimeException) {
        this.a.d(runtimeException);
    }

    /* access modifiers changed from: protected */
    public abstract void i(e.a<?> aVar);
}
