package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.j;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.i;
import com.google.android.gms.common.util.l;
import g.b.a.b.b.b;
import g.b.a.b.c.b.d;
import java.util.ArrayList;
import java.util.Arrays;

public class e extends f {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f2109d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static final e f2110e = new e();
    private String c;

    @SuppressLint({"HandlerLeak"})
    private class a extends d {
        private final Context a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i2);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int g2 = e.this.g(this.a);
            if (e.this.i(g2)) {
                e.this.p(this.a, g2);
            }
        }
    }

    public static e n() {
        return f2110e;
    }

    static Dialog q(Context context, int i2, g gVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i2 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(f.d(context, i2));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c2 = f.c(context, i2);
        if (c2 != null) {
            builder.setPositiveButton(c2, gVar);
        }
        String g2 = f.g(context, i2);
        if (g2 != null) {
            builder.setTitle(g2);
        }
        return builder.create();
    }

    static void r(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof androidx.fragment.app.d) {
            k.f2(dialog, onCancelListener).d2(((androidx.fragment.app.d) activity).s(), str);
            return;
        }
        c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    private final void t(Context context, int i2, String str, PendingIntent pendingIntent) {
        int i3;
        if (i2 == 18) {
            s(context);
        } else if (pendingIntent != null) {
            String f2 = f.f(context, i2);
            String e2 = f.e(context, i2);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            j.d dVar = new j.d(context);
            dVar.k(true);
            dVar.e(true);
            dVar.i(f2);
            j.b bVar = new j.b();
            bVar.g(e2);
            dVar.o(bVar);
            if (i.c(context)) {
                r.n(l.f());
                dVar.n(context.getApplicationInfo().icon);
                dVar.l(2);
                if (i.d(context)) {
                    dVar.a(g.b.a.b.b.a.common_full_open_on_phone, resources.getString(b.common_open_on_phone), pendingIntent);
                } else {
                    dVar.g(pendingIntent);
                }
            } else {
                dVar.n(17301642);
                dVar.p(resources.getString(b.common_google_play_services_notification_ticker));
                dVar.q(System.currentTimeMillis());
                dVar.g(pendingIntent);
                dVar.h(e2);
            }
            if (l.i()) {
                r.n(l.i());
                String v = v();
                if (v == null) {
                    v = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(v);
                    String b = f.b(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(v, b, 4));
                    } else if (!b.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                dVar.f(v);
            }
            Notification b2 = dVar.b();
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                i3 = 10436;
                h.f2111d.set(false);
            } else {
                i3 = 39789;
            }
            notificationManager.notify(i3, b2);
        } else if (i2 == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    private final String v() {
        String str;
        synchronized (f2109d) {
            str = this.c;
        }
        return str;
    }

    public Intent b(Context context, int i2, String str) {
        return super.b(context, i2, str);
    }

    public PendingIntent c(Context context, int i2, int i3) {
        return super.c(context, i2, i3);
    }

    public final String e(int i2) {
        return super.e(i2);
    }

    public int g(Context context) {
        return super.g(context);
    }

    public int h(Context context, int i2) {
        return super.h(context, i2);
    }

    public final boolean i(int i2) {
        return super.i(i2);
    }

    public com.google.android.gms.tasks.g<Void> k(c<?> cVar, c<?>... cVarArr) {
        r.l(cVar, "Requested API must not be null.");
        for (c<?> l2 : cVarArr) {
            r.l(l2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(cVarArr.length + 1);
        arrayList.add(cVar);
        arrayList.addAll(Arrays.asList(cVarArr));
        return com.google.android.gms.common.api.internal.e.j().b(arrayList).e(new n(this));
    }

    public Dialog l(Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        return q(activity, i2, g.a(activity, b(activity, i2, "d"), i3), onCancelListener);
    }

    public PendingIntent m(Context context, b bVar) {
        if (bVar.q()) {
            return bVar.o();
        }
        return c(context, bVar.l(), 0);
    }

    public boolean o(Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        Dialog l2 = l(activity, i2, i3, onCancelListener);
        if (l2 == null) {
            return false;
        }
        r(activity, l2, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void p(Context context, int i2) {
        t(context, i2, (String) null, d(context, i2, 0, "n"));
    }

    /* access modifiers changed from: package-private */
    public final void s(Context context) {
        new a(context).sendEmptyMessageDelayed(1, 120000);
    }

    public final boolean u(Context context, b bVar, int i2) {
        PendingIntent m2 = m(context, bVar);
        if (m2 == null) {
            return false;
        }
        t(context, bVar.l(), (String) null, GoogleApiActivity.a(context, m2, i2));
        return true;
    }
}
