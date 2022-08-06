package androidx.work.impl.k.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.i;

/* compiled from: BroadcastReceiverConstraintTracker */
public abstract class c<T> extends d<T> {

    /* renamed from: h  reason: collision with root package name */
    private static final String f1708h = i.f("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g  reason: collision with root package name */
    private final BroadcastReceiver f1709g = new a();

    /* compiled from: BroadcastReceiverConstraintTracker */
    class a extends BroadcastReceiver {
        a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.h(context, intent);
            }
        }
    }

    public c(Context context, androidx.work.impl.utils.k.a aVar) {
        super(context, aVar);
    }

    public void e() {
        i.c().a(f1708h, String.format("%s: registering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.b.registerReceiver(this.f1709g, g());
    }

    public void f() {
        i.c().a(f1708h, String.format("%s: unregistering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.b.unregisterReceiver(this.f1709g);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, Intent intent);
}
