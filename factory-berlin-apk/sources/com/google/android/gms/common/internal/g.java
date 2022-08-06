package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;

public abstract class g implements DialogInterface.OnClickListener {
    public static g a(Activity activity, Intent intent, int i2) {
        return new x(intent, activity, i2);
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    public void onClick(DialogInterface dialogInterface, int i2) {
        try {
            b();
        } catch (ActivityNotFoundException e2) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e2);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
