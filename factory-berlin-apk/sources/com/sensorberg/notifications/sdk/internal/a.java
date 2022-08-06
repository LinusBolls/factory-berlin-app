package com.sensorberg.notifications.sdk.internal;

import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import com.sensorberg.notifications.sdk.internal.model.Trigger;
import com.sensorberg.notifications.sdk.internal.model.c;
import g.e.j.a.b;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: ActionLauncher.kt */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C0167a f5152d = new C0167a((DefaultConstructorMarker) null);
    private final String a = (this.b.getPackageName() + ".permission.notification.sdk");
    private final Application b;
    private final com.sensorberg.notifications.sdk.internal.storage.a c;

    /* renamed from: com.sensorberg.notifications.sdk.internal.a$a  reason: collision with other inner class name */
    /* compiled from: ActionLauncher.kt */
    public static final class C0167a {
        private C0167a() {
        }

        /* access modifiers changed from: private */
        public final Intent b(Application application, String str) {
            Intent intent = new Intent();
            intent.setAction("com.sensorberg.notifications.sdk.ACTION_RECEIVER");
            intent.setPackage(application.getPackageName());
            if (str != null) {
                intent.setClassName(application, str);
            }
            return intent;
        }

        static /* synthetic */ Intent c(C0167a aVar, Application application, String str, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                str = null;
            }
            return aVar.b(application, str);
        }

        public /* synthetic */ C0167a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(Application application, com.sensorberg.notifications.sdk.internal.storage.a aVar, SharedPreferences sharedPreferences) {
        k.f(application, "app");
        k.f(aVar, "dao");
        k.f(sharedPreferences, "prefs");
        this.b = application;
        this.c = aVar;
    }

    public final void a(b bVar, Trigger.b bVar2) {
        k.f(bVar, "action");
        k.f(bVar2, "type");
        com.sensorberg.notifications.sdk.internal.model.b a2 = c.a(bVar, bVar2, d.b(this.b));
        this.c.l(a2);
        n.a.a.a("action received to launch with ActionLauncher: " + bVar, new Object[0]);
        List<ResolveInfo> queryBroadcastReceivers = this.b.getPackageManager().queryBroadcastReceivers(C0167a.c(f5152d, this.b, (String) null, 2, (Object) null), 0);
        if (queryBroadcastReceivers != null && (!queryBroadcastReceivers.isEmpty())) {
            Intent a3 = f5152d.b(this.b, queryBroadcastReceivers.get(0).activityInfo.name);
            d.i(bVar, a3);
            this.b.sendBroadcast(a3, this.a);
        }
    }
}
