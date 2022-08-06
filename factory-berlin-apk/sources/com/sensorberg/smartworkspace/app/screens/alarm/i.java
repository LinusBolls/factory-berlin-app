package com.sensorberg.smartworkspace.app.screens.alarm;

import android.content.res.Resources;
import com.sensorberg.factory.R;
import kotlin.jvm.internal.k;

/* compiled from: AlarmNotification.kt */
public final class i {
    private final String a;
    private final String b;
    private final p c;

    public i(Resources resources, p pVar) {
        k.e(resources, "resources");
        k.e(pVar, "notificationWrapper");
        this.c = pVar;
        String string = resources.getString(R.string.label_alarm);
        k.d(string, "resources.getString(R.string.label_alarm)");
        this.a = string;
        String string2 = resources.getString(R.string.notification_content_alarm, new Object[]{resources.getString(R.string.app_name)});
        k.d(string2, "resources.getString(R.st…tring(R.string.app_name))");
        this.b = string2;
    }

    public final void a(String str) {
        k.e(str, "alarmId");
        this.c.e(1, "notification_channel_alarm", "Alarm channel description", this.a, this.b, R.id.alarmFragment, new e(str).b());
    }
}
