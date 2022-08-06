package g.e.n.a.l.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import kotlin.jvm.internal.k;
import kotlinx.coroutines.e3.q;
import kotlinx.coroutines.e3.u;

/* compiled from: LocationServiceDetectorImpl.kt */
public final class d implements c {
    private final LocationManager a;
    /* access modifiers changed from: private */
    public final q<Boolean> b;
    /* access modifiers changed from: private */
    public final BroadcastReceiver c;

    /* renamed from: d  reason: collision with root package name */
    private final g.e.p.a.c<Boolean> f9966d;

    /* renamed from: e  reason: collision with root package name */
    private final g.e.p.c.a f9967e;

    /* compiled from: LocationServiceDetectorImpl.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LocationServiceDetectorImpl.kt */
    public static final class b extends BroadcastReceiver {
        final /* synthetic */ d a;

        b(d dVar) {
            this.a = dVar;
        }

        public void onReceive(Context context, Intent intent) {
            k.e(context, "context");
            k.e(intent, "intent");
            if (k.a(intent.getAction(), "android.location.PROVIDERS_CHANGED")) {
                this.a.b.setValue(Boolean.valueOf(this.a.f()));
            }
        }
    }

    /* compiled from: LocationServiceDetectorImpl.kt */
    public static final class c extends g.e.p.a.c<Boolean> {
        final /* synthetic */ d b;
        final /* synthetic */ Context c;

        c(d dVar, Context context) {
            this.b = dVar;
            this.c = context;
        }

        public void c() {
            this.b.b.setValue(Boolean.valueOf(this.b.f()));
            this.c.registerReceiver(this.b.c, new IntentFilter("android.location.PROVIDERS_CHANGED"));
        }

        public void d() {
            try {
                this.c.unregisterReceiver(this.b.c);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public d(Context context, g.e.p.c.a aVar) {
        k.e(context, "context");
        k.e(aVar, "buildVersionProvider");
        this.f9967e = aVar;
        Object systemService = context.getSystemService("location");
        if (systemService != null) {
            this.a = (LocationManager) systemService;
            this.b = u.a(Boolean.valueOf(f()));
            this.c = new b(this);
            this.f9966d = new c(this, context);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
    }

    /* access modifiers changed from: private */
    public final boolean f() {
        return this.f9967e.a() < 23 || this.a.isProviderEnabled("gps") || this.a.isProviderEnabled("network");
    }

    public kotlinx.coroutines.e3.c<Boolean> a() {
        return this.f9966d.b(this.b);
    }
}
