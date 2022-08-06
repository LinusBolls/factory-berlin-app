package g.e.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.k;

/* compiled from: BluetoothUtils.kt */
public final class a extends LiveData<Boolean> {
    private static final IntentFilter s = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
    private final b q;
    private final Context r;

    /* renamed from: g.e.c.a$a  reason: collision with other inner class name */
    /* compiled from: BluetoothUtils.kt */
    public static final class C0658a {
        private C0658a() {
        }

        public /* synthetic */ C0658a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: BluetoothUtils.kt */
    public static final class b extends BroadcastReceiver {
        final /* synthetic */ a a;

        b(a aVar) {
            this.a = aVar;
        }

        public void onReceive(Context context, Intent intent) {
            Boolean bool;
            k.f(context, "context");
            k.f(intent, "intent");
            if (k.a("android.bluetooth.adapter.action.STATE_CHANGED", intent.getAction())) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", RecyclerView.UNDEFINED_DURATION);
                a aVar = this.a;
                if (intExtra != 12) {
                    bool = Boolean.FALSE;
                } else {
                    bool = Boolean.TRUE;
                }
                aVar.u(bool);
            }
        }
    }

    static {
        new C0658a((DefaultConstructorMarker) null);
    }

    public a(Context context) {
        k.f(context, "context");
        this.r = context;
        if (k.a(Looper.getMainLooper(), Looper.myLooper())) {
            u(Boolean.valueOf(b.a()));
        } else {
            s(Boolean.valueOf(b.a()));
        }
        this.q = new b(this);
    }

    /* access modifiers changed from: protected */
    public void q() {
        super.q();
        boolean a = b.a();
        if (!k.a(Boolean.valueOf(a), l())) {
            u(Boolean.valueOf(a));
        }
        this.r.registerReceiver(this.q, s);
    }

    /* access modifiers changed from: protected */
    public void r() {
        this.r.unregisterReceiver(this.q);
        super.r();
    }
}
