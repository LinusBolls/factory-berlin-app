package com.google.android.gms.nearby.messages.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.common.h;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.util.l;
import com.google.android.gms.nearby.messages.j;
import g.b.a.b.c.f.j1;
import g.b.a.b.c.f.n1;
import g.b.a.b.d.a;

public final class g extends i<n0> {
    private final int A;
    private final n1<i.a, IBinder> y = new n1<>();
    private final ClientAppContext z;

    @TargetApi(14)
    g(Context context, Looper looper, d.a aVar, d.b bVar, e eVar, com.google.android.gms.nearby.messages.g gVar) {
        super(context, looper, 62, eVar, aVar, bVar);
        int i2;
        String f2 = eVar.f();
        int m0 = m0(context);
        int i3 = m0;
        if (gVar != null) {
            this.z = r0;
            i2 = gVar.a;
        } else {
            ClientAppContext clientAppContext = new ClientAppContext(f2, (String) null, false, (String) null, i3);
            this.z = clientAppContext;
            i2 = -1;
        }
        this.A = i2;
        if (m0 == 1 && l.a()) {
            Activity activity = (Activity) context;
            if (Log.isLoggable("NearbyMessagesClient", 2)) {
                Log.v("NearbyMessagesClient", String.format("Registering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", new Object[]{activity.getPackageName()}));
            }
            activity.getApplication().registerActivityLifecycleCallbacks(new i(activity, this));
        }
    }

    static int m0(Context context) {
        if (context instanceof Activity) {
            return 1;
        }
        if (context instanceof Application) {
            return 2;
        }
        return context instanceof Service ? 3 : 0;
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        return queryLocalInterface instanceof n0 ? (n0) queryLocalInterface : new o0(iBinder);
    }

    public final boolean f() {
        return a.c(x());
    }

    public final int g() {
        return h.a;
    }

    /* access modifiers changed from: package-private */
    public final void k0(com.google.android.gms.common.api.internal.i<com.google.android.gms.common.api.internal.d<Status>> iVar, PendingIntent pendingIntent) {
        ((n0) B()).d0(new y((IBinder) null, new j1(iVar), pendingIntent));
    }

    /* access modifiers changed from: package-private */
    public final void l0(com.google.android.gms.common.api.internal.i<com.google.android.gms.common.api.internal.d<Status>> iVar, PendingIntent pendingIntent, c cVar, j jVar, int i2) {
        j jVar2 = jVar;
        com.google.android.gms.common.api.internal.i<com.google.android.gms.common.api.internal.d<Status>> iVar2 = iVar;
        ((n0) B()).o0(new SubscribeRequest((IBinder) null, jVar.c(), new j1(iVar), jVar.b(), pendingIntent, (byte[]) null, cVar, jVar2.f3315d, jVar2.f3316e, this.z.f3270k));
    }

    public final void m() {
        try {
            n0(2);
        } catch (RemoteException e2) {
            if (Log.isLoggable("NearbyMessagesClient", 2)) {
                Log.v("NearbyMessagesClient", String.format("Failed to emit CLIENT_DISCONNECTED from override of GmsClient#disconnect(): %s", new Object[]{e2}));
            }
        }
        this.y.a();
        super.m();
    }

    /* access modifiers changed from: package-private */
    public final void n0(int i2) {
        String str;
        if (i2 == 1) {
            str = "ACTIVITY_STOPPED";
        } else if (i2 == 2) {
            str = "CLIENT_DISCONNECTED";
        } else if (Log.isLoggable("NearbyMessagesClient", 5)) {
            Log.w("NearbyMessagesClient", String.format("Received unknown/unforeseen client lifecycle event %d, can't do anything with it.", new Object[]{Integer.valueOf(i2)}));
            return;
        } else {
            return;
        }
        if (b()) {
            e0 e0Var = new e0(i2);
            if (Log.isLoggable("NearbyMessagesClient", 3)) {
                Log.d("NearbyMessagesClient", String.format("Emitting client lifecycle event %s", new Object[]{str}));
            }
            ((n0) B()).b0(e0Var);
        } else if (Log.isLoggable("NearbyMessagesClient", 3)) {
            Log.d("NearbyMessagesClient", String.format("Failed to emit client lifecycle event %s due to GmsClient being disconnected", new Object[]{str}));
        }
    }

    /* access modifiers changed from: protected */
    public final String p() {
        return "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START";
    }

    /* access modifiers changed from: protected */
    public final Bundle y() {
        Bundle y2 = super.y();
        y2.putInt("NearbyPermissions", this.A);
        y2.putParcelable("ClientAppContext", this.z);
        return y2;
    }
}
