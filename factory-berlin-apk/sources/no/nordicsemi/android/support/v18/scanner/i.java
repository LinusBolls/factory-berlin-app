package no.nordicsemi.android.support.v18.scanner;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PendingIntentExecutor */
class i extends j {
    private final PendingIntent a;
    private Context b;
    private Context c;

    /* renamed from: d  reason: collision with root package name */
    private long f11216d;

    /* renamed from: e  reason: collision with root package name */
    private long f11217e;

    i(PendingIntent pendingIntent, n nVar) {
        this.a = pendingIntent;
        this.f11217e = nVar.k();
    }

    public void a(List<m> list) {
        Context context = this.b;
        if (context == null) {
            context = this.c;
        }
        if (context != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f11216d <= (elapsedRealtime - this.f11217e) + 5) {
                this.f11216d = elapsedRealtime;
                try {
                    Intent intent = new Intent();
                    intent.putExtra("android.bluetooth.le.extra.CALLBACK_TYPE", 1);
                    intent.putParcelableArrayListExtra("android.bluetooth.le.extra.LIST_SCAN_RESULT", new ArrayList(list));
                    intent.setExtrasClassLoader(m.class.getClassLoader());
                    this.a.send(context, 0, intent);
                } catch (PendingIntent.CanceledException unused) {
                }
            }
        }
    }

    public void b(int i2) {
        Context context = this.b;
        if (context == null) {
            context = this.c;
        }
        if (context != null) {
            try {
                Intent intent = new Intent();
                intent.putExtra("android.bluetooth.le.extra.ERROR_CODE", i2);
                this.a.send(context, 0, intent);
            } catch (PendingIntent.CanceledException unused) {
            }
        }
    }

    public void c(int i2, m mVar) {
        Context context = this.b;
        if (context == null) {
            context = this.c;
        }
        if (context != null) {
            try {
                Intent intent = new Intent();
                intent.putExtra("android.bluetooth.le.extra.CALLBACK_TYPE", i2);
                intent.putParcelableArrayListExtra("android.bluetooth.le.extra.LIST_SCAN_RESULT", new ArrayList(Collections.singletonList(mVar)));
                this.a.send(context, 0, intent);
            } catch (PendingIntent.CanceledException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(Context context) {
        this.b = context;
    }

    i(PendingIntent pendingIntent, n nVar, Service service) {
        this.a = pendingIntent;
        this.f11217e = nVar.k();
        this.c = service;
    }
}
