package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.f;
import androidx.room.g;
import androidx.room.i;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MultiInstanceInvalidationClient */
class j {
    final Context a;
    final String b;
    int c;

    /* renamed from: d  reason: collision with root package name */
    final i f1390d;

    /* renamed from: e  reason: collision with root package name */
    final i.c f1391e;

    /* renamed from: f  reason: collision with root package name */
    g f1392f;

    /* renamed from: g  reason: collision with root package name */
    final Executor f1393g;

    /* renamed from: h  reason: collision with root package name */
    final f f1394h = new a();

    /* renamed from: i  reason: collision with root package name */
    final AtomicBoolean f1395i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    final ServiceConnection f1396j = new b();

    /* renamed from: k  reason: collision with root package name */
    final Runnable f1397k = new c();

    /* renamed from: l  reason: collision with root package name */
    final Runnable f1398l = new d();

    /* renamed from: m  reason: collision with root package name */
    private final Runnable f1399m = new e();

    /* compiled from: MultiInstanceInvalidationClient */
    class a extends f.a {

        /* renamed from: androidx.room.j$a$a  reason: collision with other inner class name */
        /* compiled from: MultiInstanceInvalidationClient */
        class C0035a implements Runnable {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ String[] f1400g;

            C0035a(String[] strArr) {
                this.f1400g = strArr;
            }

            public void run() {
                j.this.f1390d.g(this.f1400g);
            }
        }

        a() {
        }

        public void Q(String[] strArr) {
            j.this.f1393g.execute(new C0035a(strArr));
        }
    }

    /* compiled from: MultiInstanceInvalidationClient */
    class b implements ServiceConnection {
        b() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            j.this.f1392f = g.a.i(iBinder);
            j jVar = j.this;
            jVar.f1393g.execute(jVar.f1397k);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            j jVar = j.this;
            jVar.f1393g.execute(jVar.f1398l);
            j.this.f1392f = null;
        }
    }

    /* compiled from: MultiInstanceInvalidationClient */
    class c implements Runnable {
        c() {
        }

        public void run() {
            try {
                g gVar = j.this.f1392f;
                if (gVar != null) {
                    j.this.c = gVar.i0(j.this.f1394h, j.this.b);
                    j.this.f1390d.a(j.this.f1391e);
                }
            } catch (RemoteException e2) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e2);
            }
        }
    }

    /* compiled from: MultiInstanceInvalidationClient */
    class d implements Runnable {
        d() {
        }

        public void run() {
            j jVar = j.this;
            jVar.f1390d.j(jVar.f1391e);
        }
    }

    /* compiled from: MultiInstanceInvalidationClient */
    class e implements Runnable {
        e() {
        }

        public void run() {
            j jVar = j.this;
            jVar.f1390d.j(jVar.f1391e);
            try {
                g gVar = j.this.f1392f;
                if (gVar != null) {
                    gVar.F0(j.this.f1394h, j.this.c);
                }
            } catch (RemoteException e2) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e2);
            }
            j jVar2 = j.this;
            jVar2.a.unbindService(jVar2.f1396j);
        }
    }

    /* compiled from: MultiInstanceInvalidationClient */
    class f extends i.c {
        f(String[] strArr) {
            super(strArr);
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return true;
        }

        public void b(Set<String> set) {
            if (!j.this.f1395i.get()) {
                try {
                    g gVar = j.this.f1392f;
                    if (gVar != null) {
                        gVar.t0(j.this.c, (String[]) set.toArray(new String[0]));
                    }
                } catch (RemoteException e2) {
                    Log.w("ROOM", "Cannot broadcast invalidation", e2);
                }
            }
        }
    }

    j(Context context, String str, i iVar, Executor executor) {
        this.a = context.getApplicationContext();
        this.b = str;
        this.f1390d = iVar;
        this.f1393g = executor;
        this.f1391e = new f((String[]) iVar.a.keySet().toArray(new String[0]));
        this.a.bindService(new Intent(this.a, MultiInstanceInvalidationService.class), this.f1396j, 1);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (this.f1395i.compareAndSet(false, true)) {
            this.f1393g.execute(this.f1399m);
        }
    }
}
