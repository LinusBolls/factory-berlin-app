package com.google.android.gms.gcm;

import android.annotation.TargetApi;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.util.l;
import com.google.android.gms.common.util.o;
import g.b.a.b.c.d.c;
import g.b.a.b.c.d.f;
import g.b.a.b.c.d.g;
import g.b.a.b.c.d.h;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

public abstract class b extends Service {
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Object f2206g = new Object();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f2207h;

    /* renamed from: i  reason: collision with root package name */
    private ExecutorService f2208i;

    /* renamed from: j  reason: collision with root package name */
    private Messenger f2209j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public ComponentName f2210k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public a f2211l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public g f2212m;

    @TargetApi(21)
    class a extends f {
        a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            Messenger messenger;
            if (!o.b(b.this, message.sendingUid, "com.google.android.gms")) {
                Log.e("GcmTaskService", "unable to verify presence of Google Play Services");
                return;
            }
            int i2 = message.what;
            if (i2 == 1) {
                Bundle data = message.getData();
                if (!data.isEmpty() && (messenger = message.replyTo) != null) {
                    String string = data.getString("tag");
                    ArrayList parcelableArrayList = data.getParcelableArrayList("triggered_uris");
                    long j2 = data.getLong("max_exec_duration", 180);
                    if (!b.this.k(string)) {
                        b.this.e(new C0068b(string, messenger, data.getBundle("extras"), j2, (List<Uri>) parcelableArrayList));
                    }
                }
            } else if (i2 != 2) {
                if (i2 != 4) {
                    String valueOf = String.valueOf(message);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                    sb.append("Unrecognized message received: ");
                    sb.append(valueOf);
                    Log.e("GcmTaskService", sb.toString());
                    return;
                }
                b.this.a();
            } else if (Log.isLoggable("GcmTaskService", 3)) {
                String valueOf2 = String.valueOf(message);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                sb2.append("ignoring unimplemented stop message for now: ");
                sb2.append(valueOf2);
                Log.d("GcmTaskService", sb2.toString());
            }
        }
    }

    private final void d(int i2) {
        synchronized (this.f2206g) {
            this.f2207h = i2;
            if (!this.f2211l.j(this.f2210k.getClassName())) {
                stopSelf(this.f2207h);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void e(C0068b bVar) {
        try {
            this.f2208i.execute(bVar);
        } catch (RejectedExecutionException e2) {
            Log.e("GcmTaskService", "Executor is shutdown. onDestroy was called but main looper had an unprocessed start task message. The task will be retried with backoff delay.", e2);
            bVar.c(1);
        }
    }

    /* access modifiers changed from: private */
    public final boolean k(String str) {
        boolean z;
        synchronized (this.f2206g) {
            z = !this.f2211l.f(str, this.f2210k.getClassName());
            if (z) {
                String packageName = getPackageName();
                StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 44 + String.valueOf(str).length());
                sb.append(packageName);
                sb.append(" ");
                sb.append(str);
                sb.append(": Task already running, won't start another");
                Log.w("GcmTaskService", sb.toString());
            }
        }
        return z;
    }

    public abstract void a();

    public abstract int b(d dVar);

    public IBinder onBind(Intent intent) {
        if (intent == null || !l.g() || !"com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction())) {
            return null;
        }
        return this.f2209j.getBinder();
    }

    public void onCreate() {
        super.onCreate();
        this.f2211l = a.b(this);
        this.f2208i = c.a().a(10, new e(this), 10);
        this.f2209j = new Messenger(new a(Looper.getMainLooper()));
        this.f2210k = new ComponentName(this, getClass());
        h.a();
        getClass();
        this.f2212m = h.a;
    }

    public void onDestroy() {
        super.onDestroy();
        List<Runnable> shutdownNow = this.f2208i.shutdownNow();
        if (!shutdownNow.isEmpty()) {
            int size = shutdownNow.size();
            StringBuilder sb = new StringBuilder(79);
            sb.append("Shutting down, but not all tasks are finished executing. Remaining: ");
            sb.append(size);
            Log.e("GcmTaskService", sb.toString());
        }
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        if (intent == null) {
            d(i3);
            return 2;
        }
        try {
            intent.setExtrasClassLoader(PendingCallback.class.getClassLoader());
            String action = intent.getAction();
            if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(action)) {
                String stringExtra = intent.getStringExtra("tag");
                Parcelable parcelableExtra = intent.getParcelableExtra("callback");
                Bundle bundleExtra = intent.getBundleExtra("extras");
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("triggered_uris");
                long longExtra = intent.getLongExtra("max_exec_duration", 180);
                if (!(parcelableExtra instanceof PendingCallback)) {
                    String packageName = getPackageName();
                    StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 47 + String.valueOf(stringExtra).length());
                    sb.append(packageName);
                    sb.append(" ");
                    sb.append(stringExtra);
                    sb.append(": Could not process request, invalid callback.");
                    Log.e("GcmTaskService", sb.toString());
                    return 2;
                } else if (k(stringExtra)) {
                    d(i3);
                    return 2;
                } else {
                    e(new C0068b(stringExtra, ((PendingCallback) parcelableExtra).f2191g, bundleExtra, longExtra, (List<Uri>) parcelableArrayListExtra));
                }
            } else if ("com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(action)) {
                a();
            } else {
                StringBuilder sb2 = new StringBuilder(String.valueOf(action).length() + 37);
                sb2.append("Unknown action received ");
                sb2.append(action);
                sb2.append(", terminating");
                Log.e("GcmTaskService", sb2.toString());
            }
            d(i3);
            return 2;
        } finally {
            d(i3);
        }
    }

    /* renamed from: com.google.android.gms.gcm.b$b  reason: collision with other inner class name */
    class C0068b implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        private final String f2213g;

        /* renamed from: h  reason: collision with root package name */
        private final Bundle f2214h;

        /* renamed from: i  reason: collision with root package name */
        private final List<Uri> f2215i;

        /* renamed from: j  reason: collision with root package name */
        private final long f2216j;

        /* renamed from: k  reason: collision with root package name */
        private final f f2217k;

        /* renamed from: l  reason: collision with root package name */
        private final Messenger f2218l;

        C0068b(String str, IBinder iBinder, Bundle bundle, long j2, List<Uri> list) {
            f fVar;
            this.f2213g = str;
            if (iBinder == null) {
                fVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
                if (queryLocalInterface instanceof f) {
                    fVar = (f) queryLocalInterface;
                } else {
                    fVar = new g(iBinder);
                }
            }
            this.f2217k = fVar;
            this.f2214h = bundle;
            this.f2216j = j2;
            this.f2215i = list;
            this.f2218l = null;
        }

        private static /* synthetic */ void b(Throwable th, n nVar) {
            if (th != null) {
                try {
                    nVar.close();
                } catch (Throwable th2) {
                    g.b.a.b.c.d.l.b(th, th2);
                }
            } else {
                nVar.close();
            }
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x005c, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(int r6) {
            /*
                r5 = this;
                com.google.android.gms.gcm.b r0 = com.google.android.gms.gcm.b.this
                java.lang.Object r0 = r0.f2206g
                monitor-enter(r0)
                com.google.android.gms.gcm.b r1 = com.google.android.gms.gcm.b.this     // Catch:{ RemoteException -> 0x00d0 }
                com.google.android.gms.gcm.a r1 = r1.f2211l     // Catch:{ RemoteException -> 0x00d0 }
                java.lang.String r2 = r5.f2213g     // Catch:{ RemoteException -> 0x00d0 }
                com.google.android.gms.gcm.b r3 = com.google.android.gms.gcm.b.this     // Catch:{ RemoteException -> 0x00d0 }
                android.content.ComponentName r3 = r3.f2210k     // Catch:{ RemoteException -> 0x00d0 }
                java.lang.String r3 = r3.getClassName()     // Catch:{ RemoteException -> 0x00d0 }
                boolean r1 = r1.k(r2, r3)     // Catch:{ RemoteException -> 0x00d0 }
                if (r1 == 0) goto L_0x005d
                com.google.android.gms.gcm.b r6 = com.google.android.gms.gcm.b.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.a r6 = r6.f2211l     // Catch:{ all -> 0x0169 }
                java.lang.String r1 = r5.f2213g     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.b r2 = com.google.android.gms.gcm.b.this     // Catch:{ all -> 0x0169 }
                android.content.ComponentName r2 = r2.f2210k     // Catch:{ all -> 0x0169 }
                java.lang.String r2 = r2.getClassName()     // Catch:{ all -> 0x0169 }
                r6.h(r1, r2)     // Catch:{ all -> 0x0169 }
                boolean r6 = r5.d()     // Catch:{ all -> 0x0169 }
                if (r6 != 0) goto L_0x005b
                com.google.android.gms.gcm.b r6 = com.google.android.gms.gcm.b.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.a r6 = r6.f2211l     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.b r1 = com.google.android.gms.gcm.b.this     // Catch:{ all -> 0x0169 }
                android.content.ComponentName r1 = r1.f2210k     // Catch:{ all -> 0x0169 }
                java.lang.String r1 = r1.getClassName()     // Catch:{ all -> 0x0169 }
                boolean r6 = r6.j(r1)     // Catch:{ all -> 0x0169 }
                if (r6 != 0) goto L_0x005b
                com.google.android.gms.gcm.b r6 = com.google.android.gms.gcm.b.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.b r1 = com.google.android.gms.gcm.b.this     // Catch:{ all -> 0x0169 }
                int r1 = r1.f2207h     // Catch:{ all -> 0x0169 }
                r6.stopSelf(r1)     // Catch:{ all -> 0x0169 }
            L_0x005b:
                monitor-exit(r0)     // Catch:{ all -> 0x0169 }
                return
            L_0x005d:
                boolean r1 = r5.d()     // Catch:{ RemoteException -> 0x00d0 }
                if (r1 == 0) goto L_0x008c
                android.os.Messenger r1 = r5.f2218l     // Catch:{ RemoteException -> 0x00d0 }
                android.os.Message r2 = android.os.Message.obtain()     // Catch:{ RemoteException -> 0x00d0 }
                r3 = 3
                r2.what = r3     // Catch:{ RemoteException -> 0x00d0 }
                r2.arg1 = r6     // Catch:{ RemoteException -> 0x00d0 }
                android.os.Bundle r6 = new android.os.Bundle     // Catch:{ RemoteException -> 0x00d0 }
                r6.<init>()     // Catch:{ RemoteException -> 0x00d0 }
                java.lang.String r3 = "component"
                com.google.android.gms.gcm.b r4 = com.google.android.gms.gcm.b.this     // Catch:{ RemoteException -> 0x00d0 }
                android.content.ComponentName r4 = r4.f2210k     // Catch:{ RemoteException -> 0x00d0 }
                r6.putParcelable(r3, r4)     // Catch:{ RemoteException -> 0x00d0 }
                java.lang.String r3 = "tag"
                java.lang.String r4 = r5.f2213g     // Catch:{ RemoteException -> 0x00d0 }
                r6.putString(r3, r4)     // Catch:{ RemoteException -> 0x00d0 }
                r2.setData(r6)     // Catch:{ RemoteException -> 0x00d0 }
                r1.send(r2)     // Catch:{ RemoteException -> 0x00d0 }
                goto L_0x0091
            L_0x008c:
                com.google.android.gms.gcm.f r1 = r5.f2217k     // Catch:{ RemoteException -> 0x00d0 }
                r1.e0(r6)     // Catch:{ RemoteException -> 0x00d0 }
            L_0x0091:
                com.google.android.gms.gcm.b r6 = com.google.android.gms.gcm.b.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.a r6 = r6.f2211l     // Catch:{ all -> 0x0169 }
                java.lang.String r1 = r5.f2213g     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.b r2 = com.google.android.gms.gcm.b.this     // Catch:{ all -> 0x0169 }
                android.content.ComponentName r2 = r2.f2210k     // Catch:{ all -> 0x0169 }
                java.lang.String r2 = r2.getClassName()     // Catch:{ all -> 0x0169 }
                r6.h(r1, r2)     // Catch:{ all -> 0x0169 }
                boolean r6 = r5.d()     // Catch:{ all -> 0x0169 }
                if (r6 != 0) goto L_0x012a
                com.google.android.gms.gcm.b r6 = com.google.android.gms.gcm.b.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.a r6 = r6.f2211l     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.b r1 = com.google.android.gms.gcm.b.this     // Catch:{ all -> 0x0169 }
                android.content.ComponentName r1 = r1.f2210k     // Catch:{ all -> 0x0169 }
                java.lang.String r1 = r1.getClassName()     // Catch:{ all -> 0x0169 }
                boolean r6 = r6.j(r1)     // Catch:{ all -> 0x0169 }
                if (r6 != 0) goto L_0x012a
                com.google.android.gms.gcm.b r6 = com.google.android.gms.gcm.b.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.b r1 = com.google.android.gms.gcm.b.this     // Catch:{ all -> 0x0169 }
                int r1 = r1.f2207h     // Catch:{ all -> 0x0169 }
                r6.stopSelf(r1)     // Catch:{ all -> 0x0169 }
                goto L_0x012a
            L_0x00ce:
                r6 = move-exception
                goto L_0x012c
            L_0x00d0:
                java.lang.String r6 = "GcmTaskService"
                java.lang.String r1 = "Error reporting result of operation to scheduler for "
                java.lang.String r2 = r5.f2213g     // Catch:{ all -> 0x00ce }
                java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00ce }
                int r3 = r2.length()     // Catch:{ all -> 0x00ce }
                if (r3 == 0) goto L_0x00e5
                java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x00ce }
                goto L_0x00eb
            L_0x00e5:
                java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x00ce }
                r2.<init>(r1)     // Catch:{ all -> 0x00ce }
                r1 = r2
            L_0x00eb:
                android.util.Log.e(r6, r1)     // Catch:{ all -> 0x00ce }
                com.google.android.gms.gcm.b r6 = com.google.android.gms.gcm.b.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.a r6 = r6.f2211l     // Catch:{ all -> 0x0169 }
                java.lang.String r1 = r5.f2213g     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.b r2 = com.google.android.gms.gcm.b.this     // Catch:{ all -> 0x0169 }
                android.content.ComponentName r2 = r2.f2210k     // Catch:{ all -> 0x0169 }
                java.lang.String r2 = r2.getClassName()     // Catch:{ all -> 0x0169 }
                r6.h(r1, r2)     // Catch:{ all -> 0x0169 }
                boolean r6 = r5.d()     // Catch:{ all -> 0x0169 }
                if (r6 != 0) goto L_0x012a
                com.google.android.gms.gcm.b r6 = com.google.android.gms.gcm.b.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.a r6 = r6.f2211l     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.b r1 = com.google.android.gms.gcm.b.this     // Catch:{ all -> 0x0169 }
                android.content.ComponentName r1 = r1.f2210k     // Catch:{ all -> 0x0169 }
                java.lang.String r1 = r1.getClassName()     // Catch:{ all -> 0x0169 }
                boolean r6 = r6.j(r1)     // Catch:{ all -> 0x0169 }
                if (r6 != 0) goto L_0x012a
                com.google.android.gms.gcm.b r6 = com.google.android.gms.gcm.b.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.b r1 = com.google.android.gms.gcm.b.this     // Catch:{ all -> 0x0169 }
                int r1 = r1.f2207h     // Catch:{ all -> 0x0169 }
                r6.stopSelf(r1)     // Catch:{ all -> 0x0169 }
            L_0x012a:
                monitor-exit(r0)     // Catch:{ all -> 0x0169 }
                return
            L_0x012c:
                com.google.android.gms.gcm.b r1 = com.google.android.gms.gcm.b.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.a r1 = r1.f2211l     // Catch:{ all -> 0x0169 }
                java.lang.String r2 = r5.f2213g     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.b r3 = com.google.android.gms.gcm.b.this     // Catch:{ all -> 0x0169 }
                android.content.ComponentName r3 = r3.f2210k     // Catch:{ all -> 0x0169 }
                java.lang.String r3 = r3.getClassName()     // Catch:{ all -> 0x0169 }
                r1.h(r2, r3)     // Catch:{ all -> 0x0169 }
                boolean r1 = r5.d()     // Catch:{ all -> 0x0169 }
                if (r1 != 0) goto L_0x0168
                com.google.android.gms.gcm.b r1 = com.google.android.gms.gcm.b.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.a r1 = r1.f2211l     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.b r2 = com.google.android.gms.gcm.b.this     // Catch:{ all -> 0x0169 }
                android.content.ComponentName r2 = r2.f2210k     // Catch:{ all -> 0x0169 }
                java.lang.String r2 = r2.getClassName()     // Catch:{ all -> 0x0169 }
                boolean r1 = r1.j(r2)     // Catch:{ all -> 0x0169 }
                if (r1 != 0) goto L_0x0168
                com.google.android.gms.gcm.b r1 = com.google.android.gms.gcm.b.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.b r2 = com.google.android.gms.gcm.b.this     // Catch:{ all -> 0x0169 }
                int r2 = r2.f2207h     // Catch:{ all -> 0x0169 }
                r1.stopSelf(r2)     // Catch:{ all -> 0x0169 }
            L_0x0168:
                throw r6     // Catch:{ all -> 0x0169 }
            L_0x0169:
                r6 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0169 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.b.C0068b.c(int):void");
        }

        private final boolean d() {
            return this.f2218l != null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
            b(r1, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
            throw r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r8 = this;
                com.google.android.gms.gcm.n r0 = new com.google.android.gms.gcm.n
                java.lang.String r1 = r8.f2213g
                java.lang.String r1 = java.lang.String.valueOf(r1)
                int r2 = r1.length()
                java.lang.String r3 = "nts:client:onRunTask:"
                if (r2 == 0) goto L_0x0015
                java.lang.String r1 = r3.concat(r1)
                goto L_0x001a
            L_0x0015:
                java.lang.String r1 = new java.lang.String
                r1.<init>(r3)
            L_0x001a:
                r0.<init>(r1)
                com.google.android.gms.gcm.d r1 = new com.google.android.gms.gcm.d     // Catch:{ all -> 0x004a }
                java.lang.String r3 = r8.f2213g     // Catch:{ all -> 0x004a }
                android.os.Bundle r4 = r8.f2214h     // Catch:{ all -> 0x004a }
                long r5 = r8.f2216j     // Catch:{ all -> 0x004a }
                java.util.List<android.net.Uri> r7 = r8.f2215i     // Catch:{ all -> 0x004a }
                r2 = r1
                r2.<init>(r3, r4, r5, r7)     // Catch:{ all -> 0x004a }
                com.google.android.gms.gcm.b r2 = com.google.android.gms.gcm.b.this     // Catch:{ all -> 0x004a }
                g.b.a.b.c.d.g r2 = r2.f2212m     // Catch:{ all -> 0x004a }
                java.lang.String r3 = "onRunTask"
                int r4 = g.b.a.b.c.d.k.a     // Catch:{ all -> 0x004a }
                r2.a(r3, r4)     // Catch:{ all -> 0x004a }
                com.google.android.gms.gcm.b r2 = com.google.android.gms.gcm.b.this     // Catch:{ all -> 0x0046 }
                int r1 = r2.b(r1)     // Catch:{ all -> 0x0046 }
                r8.c(r1)     // Catch:{ all -> 0x004a }
                r1 = 0
                b(r1, r0)
                return
            L_0x0046:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0048 }
            L_0x0048:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x004a }
            L_0x004a:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x004c }
            L_0x004c:
                r2 = move-exception
                b(r1, r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.b.C0068b.run():void");
        }

        C0068b(String str, Messenger messenger, Bundle bundle, long j2, List<Uri> list) {
            this.f2213g = str;
            this.f2218l = messenger;
            this.f2214h = bundle;
            this.f2216j = j2;
            this.f2215i = list;
            this.f2217k = null;
        }
    }
}
