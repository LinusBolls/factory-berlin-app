package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.util.l;

public abstract class u {
    public u(int i2) {
    }

    /* access modifiers changed from: private */
    public static Status a(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (l.b() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    public abstract void b(Status status);

    public abstract void c(e.a<?> aVar);

    public abstract void d(o oVar, boolean z);

    public abstract void e(RuntimeException runtimeException);
}
