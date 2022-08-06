package com.firebase.jobdispatcher;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.firebase.jobdispatcher.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JobServiceConnection */
class s implements ServiceConnection {
    private final Map<q, Boolean> a = new HashMap();
    private final l b;
    private final Context c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1879d = false;

    /* renamed from: e  reason: collision with root package name */
    private m f1880e;

    s(l lVar, Context context) {
        this.b = lVar;
        this.c = context;
    }

    private static Bundle a(r rVar) {
        p d2 = GooglePlayReceiver.d();
        Bundle bundle = new Bundle();
        d2.g(rVar, bundle);
        return bundle;
    }

    private void e(q qVar) {
        try {
            this.b.D0(a(qVar), 1);
        } catch (RemoteException e2) {
            Log.e("FJD.ExternalReceiver", "Error sending result for job " + qVar.a() + ": " + e2);
        }
    }

    private synchronized void g(boolean z, q qVar) {
        try {
            this.f1880e.q0(a(qVar), z);
        } catch (RemoteException e2) {
            Log.e("FJD.ExternalReceiver", "Failed to stop a job", e2);
            h();
        }
        return;
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean b() {
        return this.f1880e != null;
    }

    /* access modifiers changed from: package-private */
    public synchronized void c(q qVar) {
        this.a.remove(qVar);
        if (this.a.isEmpty()) {
            h();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void d(q qVar, boolean z) {
        if (!i()) {
            if (Boolean.TRUE.equals(this.a.remove(qVar)) && b()) {
                g(z, qVar);
            }
            if (!z && this.a.isEmpty()) {
                h();
            }
        } else {
            Log.w("FJD.ExternalReceiver", "Can't send stop request because service was unbound.");
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean f(q qVar) {
        boolean b2;
        if (i()) {
            e(qVar);
        }
        b2 = b();
        if (b2) {
            if (Boolean.TRUE.equals(this.a.get(qVar))) {
                Log.w("FJD.ExternalReceiver", "Received an execution request for already running job " + qVar);
                g(false, qVar);
            }
            try {
                this.f1880e.J(a(qVar), this.b);
            } catch (RemoteException e2) {
                Log.e("FJD.ExternalReceiver", "Failed to start the job " + qVar, e2);
                h();
                return false;
            }
        }
        this.a.put(qVar, Boolean.valueOf(b2));
        return b2;
    }

    /* access modifiers changed from: package-private */
    public synchronized void h() {
        if (!i()) {
            this.f1880e = null;
            this.f1879d = true;
            try {
                this.c.unbindService(this);
            } catch (IllegalArgumentException e2) {
                Log.w("FJD.ExternalReceiver", "Error unbinding service: " + e2.getMessage());
            }
            ArrayList<q> arrayList = new ArrayList<>(this.a.size());
            Iterator<q> it = this.a.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
                it.remove();
            }
            for (q e3 : arrayList) {
                e(e3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean i() {
        return this.f1879d;
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (i()) {
            Log.w("FJD.ExternalReceiver", "Connection have been used already.");
            return;
        }
        this.f1880e = m.a.i(iBinder);
        HashSet<q> hashSet = new HashSet<>();
        for (Map.Entry next : this.a.entrySet()) {
            if (Boolean.FALSE.equals(next.getValue())) {
                try {
                    this.f1880e.J(a((r) next.getKey()), this.b);
                    hashSet.add(next.getKey());
                } catch (RemoteException e2) {
                    Log.e("FJD.ExternalReceiver", "Failed to start job " + next.getKey(), e2);
                    h();
                    return;
                }
            }
        }
        for (q put : hashSet) {
            this.a.put(put, Boolean.TRUE);
        }
    }

    public synchronized void onServiceDisconnected(ComponentName componentName) {
        h();
    }
}
