package g.e.n.a;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import g.e.h.b.c;
import g.e.n.a.k;
import g.e.n.c.d.c;
import g.e.n.c.d.d;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;
import kotlinx.coroutines.e3.q;
import kotlinx.coroutines.e3.u;
import no.nordicsemi.android.support.v18.scanner.j;
import no.nordicsemi.android.support.v18.scanner.m;

/* compiled from: SimpleBleScannerImpl.kt */
public final class i implements h {

    /* renamed from: k  reason: collision with root package name */
    public static final a f9942k = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public final Map<String, m> a = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final q<g.e.n.c.d.c> b = u.a(new c.b(n.g()));
    private final Handler c;

    /* renamed from: d  reason: collision with root package name */
    private final q<k> f9943d;

    /* renamed from: e  reason: collision with root package name */
    private kotlin.e0.c.a<x> f9944e;

    /* renamed from: f  reason: collision with root package name */
    private final j f9945f;

    /* renamed from: g  reason: collision with root package name */
    private final no.nordicsemi.android.support.v18.scanner.a f9946g;

    /* renamed from: h  reason: collision with root package name */
    private final c.a f9947h;

    /* renamed from: i  reason: collision with root package name */
    private final e f9948i;

    /* renamed from: j  reason: collision with root package name */
    private final g.e.n.a.l.e.a f9949j;

    /* compiled from: SimpleBleScannerImpl.kt */
    public static final class a {
        private a() {
        }

        /* access modifiers changed from: private */
        public final boolean b(m mVar) {
            return (mVar == null || mVar.b() >= 0 || mVar.c() == null) ? false : true;
        }

        public final boolean c(m mVar, long j2, c.a aVar) {
            k.e(mVar, "scanResult");
            k.e(aVar, "timeProvider");
            return aVar.b() - TimeUnit.NANOSECONDS.toMillis(mVar.d()) >= j2;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SimpleBleScannerImpl.kt */
    static final class b extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ i f9950h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ d f9951i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar, d dVar) {
            super(0);
            this.f9950h = iVar;
            this.f9951i = dVar;
        }

        public final void a() {
            n.a.a.a("(re)startScan", new Object[0]);
            this.f9950h.j(this.f9951i);
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: SimpleBleScannerImpl.kt */
    public static final class c extends j {
        final /* synthetic */ i a;

        c(i iVar) {
            this.a = iVar;
        }

        public void b(int i2) {
            super.b(i2);
            n.a.a.a("onScanFailed errorCode=" + i2, new Object[0]);
            this.a.b.setValue(new c.a(i2));
        }

        public void c(int i2, m mVar) {
            k.e(mVar, "scanResult");
            super.c(i2, mVar);
            n.a.a.a("onScanResult", new Object[0]);
            if (i.f9942k.b(mVar)) {
                this.a.m(mVar);
                this.a.b.setValue(new c.b(v.R(this.a.a.values())));
            }
        }
    }

    public i(no.nordicsemi.android.support.v18.scanner.a aVar, c.a aVar2, e eVar, g.e.p.c.c cVar, g.e.n.a.l.e.a aVar3) {
        k.e(aVar, "bluetoothLeScannerCompat");
        k.e(aVar2, "timeProvider");
        k.e(eVar, "scannerRestriction");
        k.e(cVar, "handlerProvider");
        k.e(aVar3, "bluetoothServiceDetector");
        this.f9946g = aVar;
        this.f9947h = aVar2;
        this.f9948i = eVar;
        this.f9949j = aVar3;
        this.c = cVar.a();
        this.f9943d = u.a(k.b.a);
        this.f9945f = new c(this);
    }

    private final kotlin.e0.c.a<x> i(d dVar) {
        return new b(this, dVar);
    }

    /* access modifiers changed from: private */
    public final void j(d dVar) {
        n.a.a.a("call internalStartScan()", new Object[0]);
        k value = this.f9943d.getValue();
        if (!kotlin.jvm.internal.k.a(value, k.c.a)) {
            n.a.a.a("status not Waiting, but=" + value, new Object[0]);
        } else if (!this.f9949j.b()) {
            n(k.b.a);
        } else {
            n(k.a.a);
            l(14000);
            this.b.setValue(new c.b(v.R(this.a.values())));
            n.a.a.a("bluetoothLeScannerCompat.startScan()", new Object[0]);
            this.f9946g.b(dVar.a(), dVar.b(), this.f9945f);
            this.f9948i.b();
        }
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [g.e.n.a.j] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void k(g.e.n.c.d.d r5, g.e.n.a.g r6) {
        /*
            r4 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "not allowed to scan yet - please wait"
            n.a.a.a(r2, r1)
            kotlin.e0.c.a<kotlin.x> r1 = r4.f9944e
            if (r1 == 0) goto L_0x000d
            return
        L_0x000d:
            kotlin.e0.c.a r5 = r4.i(r5)
            r4.f9944e = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "postDelayed, in "
            r5.append(r1)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r2 = r6.b()
            long r1 = r1.toSeconds(r2)
            r5.append(r1)
            java.lang.String r1 = " seconds"
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            n.a.a.a(r5, r0)
            android.os.Handler r5 = r4.c
            kotlin.e0.c.a<kotlin.x> r0 = r4.f9944e
            if (r0 == 0) goto L_0x0044
            g.e.n.a.j r1 = new g.e.n.a.j
            r1.<init>(r0)
            r0 = r1
        L_0x0044:
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            long r1 = r6.b()
            boolean r5 = r5.postDelayed(r0, r1)
            if (r5 != 0) goto L_0x0058
            r5 = 0
            r4.f9944e = r5
            g.e.n.a.k$b r5 = g.e.n.a.k.b.a
            r4.n(r5)
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.n.a.i.k(g.e.n.c.d.d, g.e.n.a.g):void");
    }

    private final void l(long j2) {
        Map<String, m> map = this.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (f9942k.c((m) next.getValue(), j2, this.f9947h)) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        for (String remove : linkedHashMap.keySet()) {
            this.a.remove(remove);
        }
    }

    /* access modifiers changed from: private */
    public final void m(m mVar) {
        l(7000);
        Map<String, m> map = this.a;
        BluetoothDevice a2 = mVar.a();
        kotlin.jvm.internal.k.d(a2, "scanResult.device");
        String address = a2.getAddress();
        kotlin.jvm.internal.k.d(address, "scanResult.device.address");
        map.put(address, mVar);
    }

    private final void n(k kVar) {
        n.a.a.a("new scanner state: " + kVar, new Object[0]);
        this.f9943d.setValue(kVar);
    }

    public synchronized void a(d dVar) {
        kotlin.jvm.internal.k.e(dVar, "bleScannerConfiguration");
        n.a.a.a("call startScanning()", new Object[0]);
        k value = this.f9943d.getValue();
        if (!(value instanceof k.a)) {
            if (!(value instanceof k.c)) {
                n(k.c.a);
                g a2 = this.f9948i.a();
                if (!a2.a()) {
                    n.a.a.a("we are not allowed to scan at the moment", new Object[0]);
                    k(dVar, a2);
                    return;
                }
                j(dVar);
                return;
            }
        }
        n.a.a.a("is already actively scanning or waiting", new Object[0]);
    }

    public kotlinx.coroutines.e3.c<g.e.n.c.d.c> b() {
        return this.b;
    }

    public synchronized void c() {
        this.c.removeCallbacksAndMessages((Object) null);
        this.f9944e = null;
        if (this.f9943d.getValue() instanceof k.b) {
            n.a.a.a("scanner is stopped. return (without stopping scanner again)", new Object[0]);
            return;
        }
        n(k.b.a);
        n.a.a.a("bluetoothLeScannerCompat.stopScan()", new Object[0]);
        this.f9946g.d(this.f9945f);
    }

    public kotlinx.coroutines.e3.c<k> d() {
        return this.f9943d;
    }
}
