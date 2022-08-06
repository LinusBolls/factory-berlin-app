package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.d;
import com.google.android.gms.tasks.h;

public final class o0<ResultT> extends e0 {
    private final m<a.b, ResultT> a;
    private final h<ResultT> b;
    private final l c;

    public o0(int i2, m<a.b, ResultT> mVar, h<ResultT> hVar, l lVar) {
        super(i2);
        this.b = hVar;
        this.a = mVar;
        this.c = lVar;
    }

    public final void b(Status status) {
        this.b.d(this.c.a(status));
    }

    public final void c(e.a<?> aVar) {
        try {
            this.a.a(aVar.n(), this.b);
        } catch (DeadObjectException e2) {
            throw e2;
        } catch (RemoteException e3) {
            b(u.a(e3));
        } catch (RuntimeException e4) {
            e(e4);
        }
    }

    public final void d(o oVar, boolean z) {
        oVar.c(this.b, z);
    }

    public final void e(RuntimeException runtimeException) {
        this.b.d(runtimeException);
    }

    public final d[] g(e.a<?> aVar) {
        return this.a.c();
    }

    public final boolean h(e.a<?> aVar) {
        return this.a.b();
    }
}
