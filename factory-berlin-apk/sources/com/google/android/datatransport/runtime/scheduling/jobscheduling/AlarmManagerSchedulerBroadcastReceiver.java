package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import g.b.a.a.i.m;
import g.b.a.a.i.q;
import g.b.a.a.i.x.a;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    static /* synthetic */ void a() {
    }

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i2 = intent.getExtras().getInt("attemptNumber");
        q.f(context);
        m.a a = m.a();
        a.b(queryParameter);
        a.d(a.b(intValue));
        if (queryParameter2 != null) {
            a.c(Base64.decode(queryParameter2, 0));
        }
        q.c().e().g(a.a(), i2, b.a());
    }
}
