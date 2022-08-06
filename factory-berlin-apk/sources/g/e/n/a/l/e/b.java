package g.e.n.a.l.e;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.k;
import kotlinx.coroutines.e3.q;
import kotlinx.coroutines.e3.u;

/* compiled from: BluetoothServiceDetectorImpl.kt */
public final class b implements a {
    /* access modifiers changed from: private */
    public final q<Boolean> a = u.a(Boolean.valueOf(b()));
    /* access modifiers changed from: private */
    public final BroadcastReceiver b = new C0689b(this);
    private final g.e.p.a.c<Boolean> c = new c(this);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Context f9964d;

    /* compiled from: BluetoothServiceDetectorImpl.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.n.a.l.e.b$b  reason: collision with other inner class name */
    /* compiled from: BluetoothServiceDetectorImpl.kt */
    public static final class C0689b extends BroadcastReceiver {
        final /* synthetic */ b a;

        C0689b(b bVar) {
            this.a = bVar;
        }

        public void onReceive(Context context, Intent intent) {
            k.e(context, "context");
            k.e(intent, "intent");
            if (k.a("android.bluetooth.adapter.action.STATE_CHANGED", intent.getAction())) {
                this.a.a.setValue(Boolean.valueOf(this.a.b()));
            }
        }
    }

    /* compiled from: BluetoothServiceDetectorImpl.kt */
    public static final class c extends g.e.p.a.c<Boolean> {
        final /* synthetic */ b b;

        c(b bVar) {
            this.b = bVar;
        }

        public void c() {
            this.b.a.setValue(Boolean.valueOf(this.b.b()));
            this.b.f9964d.registerReceiver(this.b.b, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        }

        public void d() {
            try {
                this.b.f9964d.unregisterReceiver(this.b.b);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public b(Context context) {
        k.e(context, "context");
        this.f9964d = context;
    }

    public kotlinx.coroutines.e3.c<Boolean> a() {
        return this.c.b(this.a);
    }

    public boolean b() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            return defaultAdapter.isEnabled();
        }
        return false;
    }
}
