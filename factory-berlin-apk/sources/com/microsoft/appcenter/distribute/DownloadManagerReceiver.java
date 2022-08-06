package com.microsoft.appcenter.distribute;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.microsoft.appcenter.utils.d;

public class DownloadManagerReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.DOWNLOAD_NOTIFICATION_CLICKED".equals(action)) {
            Distribute.getInstance().e0(context);
        } else if ("android.intent.action.DOWNLOAD_COMPLETE".equals(action)) {
            long longExtra = intent.getLongExtra("extra_download_id", -1);
            if (longExtra != -1) {
                d.a("AppCenterDistribute", new j(context, longExtra), new Void[0]);
            }
        }
    }
}
