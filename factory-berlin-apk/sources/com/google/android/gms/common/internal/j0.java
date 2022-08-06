package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.l.a;
import java.util.HashSet;
import java.util.Set;

final class j0 implements ServiceConnection {
    private final Set<ServiceConnection> a = new HashSet();
    private int b = 2;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private IBinder f2160d;

    /* renamed from: e  reason: collision with root package name */
    private final j.a f2161e;

    /* renamed from: f  reason: collision with root package name */
    private ComponentName f2162f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ i0 f2163g;

    public j0(i0 i0Var, j.a aVar) {
        this.f2163g = i0Var;
        this.f2161e = aVar;
    }

    public final IBinder a() {
        return this.f2160d;
    }

    public final ComponentName b() {
        return this.f2162f;
    }

    public final int c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    public final void e(ServiceConnection serviceConnection, String str) {
        a unused = this.f2163g.f2156f;
        Context unused2 = this.f2163g.f2154d;
        this.f2161e.c(this.f2163g.f2154d);
        this.a.add(serviceConnection);
    }

    public final boolean f(ServiceConnection serviceConnection) {
        return this.a.contains(serviceConnection);
    }

    public final void g(ServiceConnection serviceConnection, String str) {
        a unused = this.f2163g.f2156f;
        Context unused2 = this.f2163g.f2154d;
        this.a.remove(serviceConnection);
    }

    public final void h(String str) {
        this.b = 3;
        boolean d2 = this.f2163g.f2156f.d(this.f2163g.f2154d, str, this.f2161e.c(this.f2163g.f2154d), this, this.f2161e.d());
        this.c = d2;
        if (d2) {
            this.f2163g.f2155e.sendMessageDelayed(this.f2163g.f2155e.obtainMessage(1, this.f2161e), this.f2163g.f2158h);
            return;
        }
        this.b = 2;
        try {
            this.f2163g.f2156f.c(this.f2163g.f2154d, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void i(String str) {
        this.f2163g.f2155e.removeMessages(1, this.f2161e);
        this.f2163g.f2156f.c(this.f2163g.f2154d, this);
        this.c = false;
        this.b = 2;
    }

    public final boolean j() {
        return this.a.isEmpty();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f2163g.c) {
            this.f2163g.f2155e.removeMessages(1, this.f2161e);
            this.f2160d = iBinder;
            this.f2162f = componentName;
            for (ServiceConnection onServiceConnected : this.a) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f2163g.c) {
            this.f2163g.f2155e.removeMessages(1, this.f2161e);
            this.f2160d = null;
            this.f2162f = componentName;
            for (ServiceConnection onServiceDisconnected : this.a) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
