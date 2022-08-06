package g.e.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.lifecycle.LiveData;
import kotlin.jvm.internal.k;

/* compiled from: LocationUtils.kt */
public final class f extends LiveData<Boolean> {
    private static final IntentFilter s = new IntentFilter("android.location.PROVIDERS_CHANGED");
    private final b q = new b(this);
    private final Context r;

    /* compiled from: LocationUtils.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LocationUtils.kt */
    public static final class b extends BroadcastReceiver {
        final /* synthetic */ f a;

        b(f fVar) {
            this.a = fVar;
        }

        public void onReceive(Context context, Intent intent) {
            k.f(context, "context");
            k.f(intent, "intent");
            this.a.w();
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public f(Context context) {
        k.f(context, "context");
        this.r = context;
        u(Boolean.valueOf(g.a(context)));
    }

    /* access modifiers changed from: private */
    public final void w() {
        boolean a2 = g.a(this.r);
        if (!k.a(Boolean.valueOf(a2), l())) {
            u(Boolean.valueOf(a2));
        }
    }

    /* access modifiers changed from: protected */
    public void q() {
        super.q();
        w();
        this.r.registerReceiver(this.q, s);
    }

    /* access modifiers changed from: protected */
    public void r() {
        this.r.unregisterReceiver(this.q);
        super.r();
    }
}
