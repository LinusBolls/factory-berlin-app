package g.e.n.d;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: MyRenzBleServiceCallback.kt */
public final class t implements com.renz.myrenzbox.ble.b {
    private final Handler a = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public final List<h> b = new ArrayList();
    /* access modifiers changed from: private */
    public final List<m> c = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final List<a> f10093d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final List<o> f10094e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final List<b> f10095f = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final List<p> f10096g = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final List<g> f10097h = new ArrayList();

    /* compiled from: MyRenzBleServiceCallback.kt */
    static final class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ t f10098g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g.d.a.c.a f10099h;

        a(t tVar, g.d.a.c.a aVar) {
            this.f10098g = tVar;
            this.f10099h = aVar;
        }

        public final void run() {
            g.d.a.c.a aVar = this.f10099h;
            n a = aVar != null ? n.c.a(aVar) : null;
            n.a.a.a("activeDeviceCallbacks.size=" + this.f10098g.f10093d.size(), new Object[0]);
            for (a i2 : this.f10098g.f10093d) {
                i2.i(a);
            }
        }
    }

    /* compiled from: MyRenzBleServiceCallback.kt */
    static final class b implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ t f10100g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g.d.a.c.a f10101h;

        b(t tVar, g.d.a.c.a aVar) {
            this.f10100g = tVar;
            this.f10101h = aVar;
        }

        public final void run() {
            for (b a : this.f10100g.f10095f) {
                a.a(n.c.a(this.f10101h));
            }
        }
    }

    /* compiled from: MyRenzBleServiceCallback.kt */
    static final class c implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ t f10102g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ com.renz.myrenzbox.ble.c f10103h;

        c(t tVar, com.renz.myrenzbox.ble.c cVar) {
            this.f10102g = tVar;
            this.f10103h = cVar;
        }

        public final void run() {
            for (g a : this.f10102g.f10097h) {
                a.a(e.a.a(this.f10103h));
            }
        }
    }

    /* compiled from: MyRenzBleServiceCallback.kt */
    static final class d implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ t f10104g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g.d.a.b.c f10105h;

        d(t tVar, g.d.a.b.c cVar) {
            this.f10104g = tVar;
            this.f10105h = cVar;
        }

        public final void run() {
            for (o a : this.f10104g.f10094e) {
                a.a(j.a.a(this.f10105h));
            }
        }
    }

    /* compiled from: MyRenzBleServiceCallback.kt */
    static final class e implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ t f10106g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g.d.a.b.c f10107h;

        e(t tVar, g.d.a.b.c cVar) {
            this.f10106g = tVar;
            this.f10107h = cVar;
        }

        public final void run() {
            for (h a : this.f10106g.b) {
                a.a(j.a.a(this.f10107h));
            }
        }
    }

    /* compiled from: MyRenzBleServiceCallback.kt */
    static final class f implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ t f10108g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ j f10109h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f10110i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f10111j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f10112k;

        f(t tVar, j jVar, int i2, boolean z, boolean z2) {
            this.f10108g = tVar;
            this.f10109h = jVar;
            this.f10110i = i2;
            this.f10111j = z;
            this.f10112k = z2;
        }

        public final void run() {
            n.a.a.a("devicePickupCallbacks.size=" + this.f10108g.f10096g.size(), new Object[0]);
            for (p a : this.f10108g.f10096g) {
                a.a(this.f10109h, this.f10110i, this.f10111j, this.f10112k);
            }
        }
    }

    /* compiled from: MyRenzBleServiceCallback.kt */
    static final class g implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ t f10113g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g.d.a.b.c f10114h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ byte[] f10115i;

        g(t tVar, g.d.a.b.c cVar, byte[] bArr) {
            this.f10113g = tVar;
            this.f10114h = cVar;
            this.f10115i = bArr;
        }

        public final void run() {
            for (m a : this.f10113g.c) {
                a.a(j.a.a(this.f10114h), this.f10115i);
            }
        }
    }

    public void a(g.d.a.c.a aVar) {
        n.a.a.a("myrenzboxActiveDeviceChanged: pkaDevice=" + aVar, new Object[0]);
        this.a.post(new a(this, aVar));
    }

    public void b(g.d.a.b.c cVar, byte[] bArr) {
        k.e(cVar, "pkaRequestResponse");
        n.a.a.a("myrenzboxDeviceSendCustomDataCallback: pkaRequestResponse=" + cVar + ", payload=" + bArr, new Object[0]);
        this.a.post(new g(this, cVar, bArr));
    }

    public void c(g.d.a.c.a aVar) {
        k.e(aVar, "pkaDevice");
        n.a.a.a("myrenzboxActiveDeviceStatusChanged: pkaDevice=" + aVar, new Object[0]);
        this.a.post(new b(this, aVar));
    }

    public void d(com.renz.myrenzbox.ble.c cVar) {
        k.e(cVar, "bleStatus");
        n.a.a.a("myrenzboxBLEStatusChanged: bleStatus=" + cVar, new Object[0]);
        this.a.post(new c(this, cVar));
    }

    public void e(g.d.a.b.c cVar, int i2, boolean z, boolean z2) {
        k.e(cVar, "pkaRequestResponse");
        n.a.a.a("myrenzboxDevicePickupCallback", new Object[0]);
        n.a.a.a("pkaRequestResponse=" + cVar, new Object[0]);
        n.a.a.a("boxCount=" + i2, new Object[0]);
        n.a.a.a("boxAvailable=" + z, new Object[0]);
        n.a.a.a("paymentNecessary=" + z2, new Object[0]);
        this.a.post(new f(this, j.a.a(cVar), i2, z, z2));
    }

    public void f(g.d.a.b.c cVar) {
        k.e(cVar, "pkaRequestResponse");
        n.a.a.a("myrenzboxDeviceCommunicationErrorCallback: pkaRequestResponse=" + cVar, new Object[0]);
        this.a.post(new e(this, cVar));
    }

    public void g(g.d.a.b.c cVar) {
        k.e(cVar, "pkaRequestResponse");
        n.a.a.a("myrenzboxDeviceAuthorizeCallback: pkaRequestResponse=" + cVar, new Object[0]);
        this.a.post(new d(this, cVar));
    }

    public final void o(a aVar) {
        k.e(aVar, "callback");
        synchronized (this) {
            this.f10093d.add(aVar);
        }
    }

    public final void p(p pVar) {
        k.e(pVar, "callback");
        synchronized (this) {
            this.f10096g.add(pVar);
        }
    }

    public final void q(a aVar) {
        k.e(aVar, "callback");
        synchronized (this) {
            this.f10093d.remove(aVar);
        }
    }

    public final void r(p pVar) {
        k.e(pVar, "callback");
        synchronized (this) {
            this.f10096g.remove(pVar);
        }
    }
}
