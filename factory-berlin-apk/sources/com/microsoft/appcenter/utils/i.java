package com.microsoft.appcenter.utils;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import java.io.Closeable;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: NetworkStateHelper */
public class i implements Closeable {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: m  reason: collision with root package name */
    private static i f4603m;

    /* renamed from: g  reason: collision with root package name */
    private final Context f4604g;

    /* renamed from: h  reason: collision with root package name */
    private final ConnectivityManager f4605h;

    /* renamed from: i  reason: collision with root package name */
    private final Set<c> f4606i = new CopyOnWriteArraySet();

    /* renamed from: j  reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f4607j;

    /* renamed from: k  reason: collision with root package name */
    private b f4608k;

    /* renamed from: l  reason: collision with root package name */
    private final AtomicBoolean f4609l = new AtomicBoolean();

    /* compiled from: NetworkStateHelper */
    class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        public void onAvailable(Network network) {
            i.this.y(network);
        }

        public void onLost(Network network) {
            i.this.z(network);
        }
    }

    /* compiled from: NetworkStateHelper */
    private class b extends BroadcastReceiver {
        private b() {
        }

        public void onReceive(Context context, Intent intent) {
            i.this.l();
        }

        /* synthetic */ b(i iVar, a aVar) {
            this();
        }
    }

    /* compiled from: NetworkStateHelper */
    public interface c {
        void a(boolean z);
    }

    public i(Context context) {
        this.f4604g = context.getApplicationContext();
        this.f4605h = (ConnectivityManager) context.getSystemService("connectivity");
        c();
    }

    private IntentFilter j() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    public static synchronized i k(Context context) {
        i iVar;
        synchronized (i.class) {
            if (f4603m == null) {
                f4603m = new i(context);
            }
            iVar = f4603m;
        }
        return iVar;
    }

    /* access modifiers changed from: private */
    public void l() {
        boolean n2 = n();
        if (this.f4609l.compareAndSet(!n2, n2)) {
            q(n2);
        }
    }

    private boolean n() {
        if (Build.VERSION.SDK_INT >= 21) {
            Network[] allNetworks = this.f4605h.getAllNetworks();
            if (allNetworks == null) {
                return false;
            }
            for (Network networkInfo : allNetworks) {
                NetworkInfo networkInfo2 = this.f4605h.getNetworkInfo(networkInfo);
                if (networkInfo2 != null && networkInfo2.isConnected()) {
                    return true;
                }
            }
        } else {
            NetworkInfo[] allNetworkInfo = this.f4605h.getAllNetworkInfo();
            if (allNetworkInfo == null) {
                return false;
            }
            for (NetworkInfo networkInfo3 : allNetworkInfo) {
                if (networkInfo3 != null && networkInfo3.isConnected()) {
                    return true;
                }
            }
        }
        return false;
    }

    private void q(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("Network has been ");
        sb.append(z ? "connected." : "disconnected.");
        a.a("AppCenter", sb.toString());
        for (c a2 : this.f4606i) {
            a2.a(z);
        }
    }

    /* access modifiers changed from: private */
    public void y(Network network) {
        a.a("AppCenter", "Network " + network + " is available.");
        if (this.f4609l.compareAndSet(false, true)) {
            q(true);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void z(android.net.Network r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Network "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = " is lost."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AppCenter"
            com.microsoft.appcenter.utils.a.a(r1, r0)
            android.net.ConnectivityManager r0 = r4.f4605h
            android.net.Network[] r0 = r0.getAllNetworks()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0035
            int r3 = r0.length
            if (r3 == 0) goto L_0x0035
            android.net.Network[] r3 = new android.net.Network[r1]
            r3[r2] = r5
            boolean r5 = java.util.Arrays.equals(r0, r3)
            if (r5 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r5 = 0
            goto L_0x0036
        L_0x0035:
            r5 = 1
        L_0x0036:
            if (r5 == 0) goto L_0x0043
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.f4609l
            boolean r5 = r5.compareAndSet(r1, r2)
            if (r5 == 0) goto L_0x0043
            r4.q(r2)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.appcenter.utils.i.z(android.net.Network):void");
    }

    public void D(c cVar) {
        this.f4606i.remove(cVar);
    }

    public void c() {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                NetworkRequest.Builder builder = new NetworkRequest.Builder();
                builder.addCapability(12);
                this.f4607j = new a();
                this.f4605h.registerNetworkCallback(builder.build(), this.f4607j);
                return;
            }
            b bVar = new b(this, (a) null);
            this.f4608k = bVar;
            this.f4604g.registerReceiver(bVar, j());
            l();
        } catch (RuntimeException e2) {
            a.c("AppCenter", "Cannot access network state information.", e2);
            this.f4609l.set(true);
        }
    }

    public void close() {
        this.f4609l.set(false);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f4605h.unregisterNetworkCallback(this.f4607j);
        } else {
            this.f4604g.unregisterReceiver(this.f4608k);
        }
    }

    public void i(c cVar) {
        this.f4606i.add(cVar);
    }

    public boolean o() {
        return this.f4609l.get() || n();
    }
}
