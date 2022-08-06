package g.e.j.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.sensorberg.notifications.sdk.internal.d;
import kotlin.jvm.internal.k;

/* compiled from: AbstractActionReceiver.kt */
public abstract class a extends BroadcastReceiver {
    public abstract void a(Context context, b bVar);

    public void onReceive(Context context, Intent intent) {
        k.f(context, "context");
        k.f(intent, "intent");
        if (k.a(intent.getAction(), "com.sensorberg.notifications.sdk.ACTION_RECEIVER")) {
            try {
                b h2 = d.h(intent);
                n.a.a.a("Sending action to host app: " + h2, new Object[0]);
                a(context, h2);
            } catch (IllegalArgumentException e2) {
                n.a.a.e(e2, "Failed to send action to host app, invalid data", new Object[0]);
            }
        }
    }
}
