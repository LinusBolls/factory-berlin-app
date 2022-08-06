package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.l.a;
import g.b.a.b.c.c.d;
import java.util.HashMap;

final class i0 extends j implements Handler.Callback {
    /* access modifiers changed from: private */
    public final HashMap<j.a, j0> c = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Context f2154d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Handler f2155e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final a f2156f;

    /* renamed from: g  reason: collision with root package name */
    private final long f2157g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final long f2158h;

    i0(Context context) {
        this.f2154d = context.getApplicationContext();
        this.f2155e = new d(context.getMainLooper(), this);
        this.f2156f = a.b();
        this.f2157g = 5000;
        this.f2158h = 300000;
    }

    /* access modifiers changed from: protected */
    public final boolean c(j.a aVar, ServiceConnection serviceConnection, String str) {
        boolean d2;
        r.l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.c) {
            j0 j0Var = this.c.get(aVar);
            if (j0Var == null) {
                j0Var = new j0(this, aVar);
                j0Var.e(serviceConnection, str);
                j0Var.h(str);
                this.c.put(aVar, j0Var);
            } else {
                this.f2155e.removeMessages(0, aVar);
                if (!j0Var.f(serviceConnection)) {
                    j0Var.e(serviceConnection, str);
                    int c2 = j0Var.c();
                    if (c2 == 1) {
                        serviceConnection.onServiceConnected(j0Var.b(), j0Var.a());
                    } else if (c2 == 2) {
                        j0Var.h(str);
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            d2 = j0Var.d();
        }
        return d2;
    }

    /* access modifiers changed from: protected */
    public final void d(j.a aVar, ServiceConnection serviceConnection, String str) {
        r.l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.c) {
            j0 j0Var = this.c.get(aVar);
            if (j0Var == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (j0Var.f(serviceConnection)) {
                j0Var.g(serviceConnection, str);
                if (j0Var.j()) {
                    this.f2155e.sendMessageDelayed(this.f2155e.obtainMessage(0, aVar), this.f2157g);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            synchronized (this.c) {
                j.a aVar = (j.a) message.obj;
                j0 j0Var = this.c.get(aVar);
                if (j0Var != null && j0Var.j()) {
                    if (j0Var.d()) {
                        j0Var.i("GmsClientSupervisor");
                    }
                    this.c.remove(aVar);
                }
            }
            return true;
        } else if (i2 != 1) {
            return false;
        } else {
            synchronized (this.c) {
                j.a aVar2 = (j.a) message.obj;
                j0 j0Var2 = this.c.get(aVar2);
                if (j0Var2 != null && j0Var2.c() == 3) {
                    String valueOf = String.valueOf(aVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName b = j0Var2.b();
                    if (b == null) {
                        b = aVar2.a();
                    }
                    if (b == null) {
                        b = new ComponentName(aVar2.b(), "unknown");
                    }
                    j0Var2.onServiceDisconnected(b);
                }
            }
            return true;
        }
    }
}
