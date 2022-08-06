package com.sensorberg.smartworkspace.app.screens.alarm;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.j;
import androidx.navigation.m;
import com.sensorberg.factory.R;
import kotlin.jvm.internal.k;

/* compiled from: NotificationWrapper.kt */
public final class p {
    private final Context a;
    private final NotificationManager b;

    /* compiled from: NotificationWrapper.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public p(Context context, NotificationManager notificationManager) {
        k.e(context, "context");
        k.e(notificationManager, "notificationManager");
        this.a = context;
        this.b = notificationManager;
    }

    private final PendingIntent a(int i2, Bundle bundle) {
        m mVar = new m(this.a);
        mVar.f(R.navigation.nav_graph);
        mVar.e(i2);
        mVar.d(bundle);
        PendingIntent a2 = mVar.a();
        k.d(a2, "NavDeepLinkBuilder(conte…\t\t\t.createPendingIntent()");
        return a2;
    }

    private final Notification b(String str, PendingIntent pendingIntent, String str2, String str3) {
        j.d dVar = new j.d(this.a, str);
        dVar.l(1);
        dVar.g(pendingIntent);
        dVar.i(str2);
        dVar.h(str3);
        dVar.n(R.drawable.ic_notification);
        dVar.e(true);
        dVar.m(true);
        Notification b2 = dVar.b();
        k.d(b2, "NotificationCompat.Build…howWhen(true)\n\t\t\t.build()");
        return b2;
    }

    private final Notification c(String str, String str2, String str3, String str4, int i2, Bundle bundle) {
        d(str, str3, str2);
        return b(str, a(i2, bundle), str3, str4);
    }

    @TargetApi(26)
    private final void d(String str, String str2, String str3) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(str, str2, 4);
            notificationChannel.setDescription(str3);
            this.b.createNotificationChannel(notificationChannel);
        }
    }

    public final void e(int i2, String str, String str2, String str3, String str4, int i3, Bundle bundle) {
        k.e(str, "channel");
        k.e(str2, "channelDescription");
        k.e(str3, "title");
        k.e(str4, "contentText");
        this.b.notify(i2, c(str, str2, str3, str4, i3, bundle));
    }
}
