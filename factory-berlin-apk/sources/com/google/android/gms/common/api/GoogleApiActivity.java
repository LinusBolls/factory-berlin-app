package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.b;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: g  reason: collision with root package name */
    private int f2022g = 0;

    public static PendingIntent a(Context context, PendingIntent pendingIntent, int i2) {
        return PendingIntent.getActivity(context, 0, b(context, pendingIntent, i2, true), 134217728);
    }

    public static Intent b(Context context, PendingIntent pendingIntent, int i2, boolean z) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i2);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f2022g = 0;
            setResult(i3, intent);
            if (booleanExtra) {
                e h2 = e.h(this);
                if (i3 == -1) {
                    h2.w();
                } else if (i3 == 0) {
                    h2.c(new b(13, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i2 == 2) {
            this.f2022g = 0;
            setResult(i3, intent);
        }
        finish();
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f2022g = 0;
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f2022g = bundle.getInt("resolution");
        }
        if (this.f2022g != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
            } else if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                    this.f2022g = 1;
                } catch (IntentSender.SendIntentException e2) {
                    Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e2);
                    finish();
                }
            } else {
                com.google.android.gms.common.e.n().o(this, num.intValue(), 2, this);
                this.f2022g = 1;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f2022g);
        super.onSaveInstanceState(bundle);
    }
}
