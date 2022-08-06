package androidx.work.impl.k.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.work.i;

/* compiled from: NetworkStateTracker */
public class e extends d<androidx.work.impl.k.b> {

    /* renamed from: j  reason: collision with root package name */
    static final String f1715j = i.f("NetworkStateTracker");

    /* renamed from: g  reason: collision with root package name */
    private final ConnectivityManager f1716g = ((ConnectivityManager) this.b.getSystemService("connectivity"));

    /* renamed from: h  reason: collision with root package name */
    private b f1717h;

    /* renamed from: i  reason: collision with root package name */
    private a f1718i;

    /* compiled from: NetworkStateTracker */
    private class a extends BroadcastReceiver {
        a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                i.c().a(e.f1715j, "Network broadcast received", new Throwable[0]);
                e eVar = e.this;
                eVar.d(eVar.g());
            }
        }
    }

    /* compiled from: NetworkStateTracker */
    private class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            i.c().a(e.f1715j, String.format("Network capabilities changed: %s", new Object[]{networkCapabilities}), new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }

        public void onLost(Network network) {
            i.c().a(e.f1715j, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }
    }

    public e(Context context, androidx.work.impl.utils.k.a aVar) {
        super(context, aVar);
        if (j()) {
            this.f1717h = new b();
        } else {
            this.f1718i = new a();
        }
    }

    private boolean i() {
        NetworkCapabilities networkCapabilities;
        if (Build.VERSION.SDK_INT >= 23 && (networkCapabilities = this.f1716g.getNetworkCapabilities(this.f1716g.getActiveNetwork())) != null && networkCapabilities.hasCapability(16)) {
            return true;
        }
        return false;
    }

    private static boolean j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public void e() {
        if (j()) {
            try {
                i.c().a(f1715j, "Registering network callback", new Throwable[0]);
                this.f1716g.registerDefaultNetworkCallback(this.f1717h);
            } catch (IllegalArgumentException e2) {
                i.c().b(f1715j, "Received exception while unregistering network callback", e2);
            }
        } else {
            i.c().a(f1715j, "Registering broadcast receiver", new Throwable[0]);
            this.b.registerReceiver(this.f1718i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    public void f() {
        if (j()) {
            try {
                i.c().a(f1715j, "Unregistering network callback", new Throwable[0]);
                this.f1716g.unregisterNetworkCallback(this.f1717h);
            } catch (IllegalArgumentException e2) {
                i.c().b(f1715j, "Received exception while unregistering network callback", e2);
            }
        } else {
            i.c().a(f1715j, "Unregistering broadcast receiver", new Throwable[0]);
            this.b.unregisterReceiver(this.f1718i);
        }
    }

    /* access modifiers changed from: package-private */
    public androidx.work.impl.k.b g() {
        NetworkInfo activeNetworkInfo = this.f1716g.getActiveNetworkInfo();
        boolean z = true;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean i2 = i();
        boolean a2 = e.h.g.a.a(this.f1716g);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z = false;
        }
        return new androidx.work.impl.k.b(z2, i2, a2, z);
    }

    /* renamed from: h */
    public androidx.work.impl.k.b b() {
        return g();
    }
}
