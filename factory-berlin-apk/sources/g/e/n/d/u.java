package g.e.n.d;

import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.AsyncTask;
import android.os.IBinder;
import com.renz.myrenzbox.ble.BLEService;
import g.e.n.d.d;
import kotlin.c0.j.a.h;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.k;
import kotlin.x;
import kotlinx.coroutines.i;
import kotlinx.coroutines.j;

/* compiled from: MyRenzController.kt */
public final class u implements s, a {
    /* access modifiers changed from: private */
    public BLEService a;
    private ServiceConnection b;
    /* access modifiers changed from: private */
    public n c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10116d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final x f10117e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final t f10118f;

    /* renamed from: g  reason: collision with root package name */
    private final w f10119g;

    /* compiled from: MyRenzController.kt */
    static final class a extends l implements kotlin.e0.c.l<Throwable, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ AsyncTask f10120h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(AsyncTask asyncTask) {
            super(1);
            this.f10120h = asyncTask;
        }

        public final void a(Throwable th) {
            this.f10120h.cancel(true);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Throwable) obj);
            return x.a;
        }
    }

    /* compiled from: MyRenzController.kt */
    static final class b implements g.d.a.e.e {
        final /* synthetic */ i a;

        b(i iVar) {
            this.a = iVar;
        }

        public final void a(g.d.a.e.c cVar, String str) {
            d.a aVar = d.a;
            k.d(cVar, "userLoginStatus");
            d a2 = aVar.a(cVar);
            i iVar = this.a;
            k.a aVar2 = kotlin.k.f10687h;
            kotlin.k.a(a2);
            iVar.m(a2);
        }
    }

    /* compiled from: MyRenzController.kt */
    public static final class c implements a {
        final /* synthetic */ i a;
        final /* synthetic */ u b;

        c(i iVar, u uVar) {
            this.a = iVar;
            this.b = uVar;
        }

        public void i(n nVar) {
            if (nVar != null) {
                this.b.f10118f.q(this);
                i iVar = this.a;
                k.a aVar = kotlin.k.f10687h;
                kotlin.k.a(nVar);
                iVar.m(nVar);
            }
        }
    }

    /* compiled from: MyRenzController.kt */
    static final class d extends l implements kotlin.e0.c.l<Throwable, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f10121h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ u f10122i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar, u uVar) {
            super(1);
            this.f10121h = cVar;
            this.f10122i = uVar;
        }

        public final void a(Throwable th) {
            n.a.a.a("got cancelled", new Object[0]);
            this.f10122i.f10118f.q(this.f10121h);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Throwable) obj);
            return x.a;
        }
    }

    /* compiled from: MyRenzController.kt */
    public static final class e implements p {
        final /* synthetic */ i a;
        final /* synthetic */ u b;

        e(i iVar, u uVar) {
            this.a = iVar;
            this.b = uVar;
        }

        public void a(j jVar, int i2, boolean z, boolean z2) {
            kotlin.jvm.internal.k.e(jVar, "communicationResponse");
            n.a.a.a("onItemPickedUp: communicationResponse: " + jVar, new Object[0]);
            this.b.f10118f.r(this);
            i iVar = this.a;
            k.a aVar = kotlin.k.f10687h;
            kotlin.k.a(jVar);
            iVar.m(jVar);
        }
    }

    /* compiled from: MyRenzController.kt */
    static final class f extends l implements kotlin.e0.c.l<Throwable, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f10123h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ u f10124i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(e eVar, u uVar) {
            super(1);
            this.f10123h = eVar;
            this.f10124i = uVar;
        }

        public final void a(Throwable th) {
            this.f10124i.f10118f.r(this.f10123h);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Throwable) obj);
            return x.a;
        }
    }

    /* compiled from: MyRenzController.kt */
    public static final class g implements ServiceConnection {
        final /* synthetic */ u a;
        final /* synthetic */ boolean b;
        final /* synthetic */ boolean c;

        g(u uVar, boolean z, boolean z2) {
            this.a = uVar;
            this.b = z;
            this.c = z2;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            n.a.a.a("onServiceConnected", new Object[0]);
            if (iBinder != null) {
                BLEService a2 = ((BLEService.g) iBinder).a();
                kotlin.jvm.internal.k.d(a2, "(service as BLEService.BLEBinder).service");
                n.a.a.a("bleService.setCallback(bleServiceCallback)", new Object[0]);
                a2.A(this.a.f10118f);
                a2.y(this.b);
                a2.x(this.c);
                a2.q();
                this.a.a = a2;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.renz.myrenzbox.ble.BLEService.BLEBinder");
        }

        public void onServiceDisconnected(ComponentName componentName) {
            n.a.a.a("onServiceDisconnected", new Object[0]);
            this.a.a = null;
        }
    }

    public u(x xVar, t tVar, w wVar) {
        kotlin.jvm.internal.k.e(xVar, "myRenzWrapper");
        kotlin.jvm.internal.k.e(tVar, "myRenzBleServiceCallback");
        kotlin.jvm.internal.k.e(wVar, "myRenzSettings");
        this.f10117e = xVar;
        this.f10118f = tVar;
        this.f10119g = wVar;
        tVar.o(this);
    }

    private final ServiceConnection q(boolean z, boolean z2) {
        return new g(this, z, z2);
    }

    public Object a(BluetoothDevice bluetoothDevice, kotlin.c0.d<? super n> dVar) {
        BLEService bLEService = this.a;
        if (bLEService != null) {
            bLEService.u(bluetoothDevice);
        }
        return p(dVar);
    }

    public void b(Context context, boolean z, boolean z2) {
        kotlin.jvm.internal.k.e(context, "context");
        n.a.a.a("bindService", new Object[0]);
        if (this.b != null) {
            n.a.a.a("service already bound!", new Object[0]);
            return;
        }
        ServiceConnection q = q(z, z2);
        this.b = q;
        context.bindService(new Intent(context, BLEService.class), q, 1);
    }

    public void c() {
        this.f10117e.c();
    }

    public void d(Context context) {
        kotlin.jvm.internal.k.e(context, "context");
        n.a.a.a("unbindService", new Object[0]);
        ServiceConnection serviceConnection = this.b;
        if (serviceConnection != null) {
            context.unbindService(serviceConnection);
            this.b = null;
        }
    }

    public void e(Application application) {
        kotlin.jvm.internal.k.e(application, "application");
        n.a.a.a("init with api key: " + this.f10119g.a(), new Object[0]);
        if (!this.f10116d) {
            this.f10116d = true;
            this.f10117e.a(application, this.f10119g.a());
        }
    }

    public Object f(kotlin.c0.d<? super j> dVar) {
        j jVar = new j(c.b(dVar), 1);
        jVar.w();
        if (this.c == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Can not open because no device is connected");
            k.a aVar = kotlin.k.f10687h;
            Object a2 = kotlin.l.a(illegalStateException);
            kotlin.k.a(a2);
            jVar.m(a2);
        } else {
            e eVar = new e(jVar, this);
            jVar.B(new f(eVar, this));
            this.f10118f.p(eVar);
            BLEService k2 = this.a;
            if (k2 != null) {
                k2.k();
            }
        }
        Object u = jVar.u();
        if (u == d.c()) {
            h.c(dVar);
        }
        return u;
    }

    public void g() {
        BLEService bLEService = this.a;
        if (bLEService != null) {
            bLEService.v();
        }
    }

    public Object h(String str, String str2, kotlin.c0.d<? super d> dVar) {
        j jVar = new j(c.b(dVar), 1);
        jVar.w();
        n.a.a.a("authenticate: username=" + str + " password=" + str2, new Object[0]);
        AsyncTask execute = new g.d.a.e.d(new b(jVar), str, str2).execute(new Void[0]);
        kotlin.jvm.internal.k.d(execute, "UserLoginTask(userLoginT…name, password).execute()");
        jVar.B(new a(execute));
        Object u = jVar.u();
        if (u == d.c()) {
            h.c(dVar);
        }
        return u;
    }

    public void i(n nVar) {
        n.a.a.a("onActiveDeviceChanged: " + nVar, new Object[0]);
        this.c = nVar;
    }

    public void j(v vVar) {
        kotlin.jvm.internal.k.e(vVar, "myRenzPortalEnvironment");
        g.d.a.e.b b2 = vVar.b();
        String a2 = vVar.a();
        n.a.a.a("usePortalEnvironment: " + b2 + " with url: " + a2, new Object[0]);
        this.f10117e.d(b2, a2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object p(kotlin.c0.d<? super n> dVar) {
        j jVar = new j(c.b(dVar), 1);
        jVar.w();
        if (!this.f10117e.b()) {
            IllegalStateException illegalStateException = new IllegalStateException("user is not authenticated against MyRenz portal");
            k.a aVar = kotlin.k.f10687h;
            Object a2 = kotlin.l.a(illegalStateException);
            kotlin.k.a(a2);
            jVar.m(a2);
        } else {
            n l2 = this.c;
            if (l2 != null) {
                k.a aVar2 = kotlin.k.f10687h;
                kotlin.k.a(l2);
                jVar.m(l2);
            } else {
                c cVar = new c(jVar, this);
                this.f10118f.o(cVar);
                jVar.B(new d(cVar, this));
            }
        }
        Object u = jVar.u();
        if (u == d.c()) {
            h.c(dVar);
        }
        return u;
    }
}
