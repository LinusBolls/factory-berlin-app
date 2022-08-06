package no.nordicsemi.android.support.v18.scanner;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import no.nordicsemi.android.support.v18.scanner.a;

/* compiled from: BluetoothLeScannerImplJB */
class b extends a {
    /* access modifiers changed from: private */
    public final Map<j, a.C0788a> b = new HashMap();
    private HandlerThread c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Handler f11199d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public long f11200e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public long f11201f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Runnable f11202g = new a();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final Runnable f11203h = new C0791b();
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final BluetoothAdapter.LeScanCallback f11204i = new c();

    /* compiled from: BluetoothLeScannerImplJB */
    class a implements Runnable {
        a() {
        }

        public void run() {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null && b.this.f11200e > 0 && b.this.f11201f > 0) {
                defaultAdapter.stopLeScan(b.this.f11204i);
                b.this.f11199d.postDelayed(b.this.f11203h, b.this.f11200e);
            }
        }
    }

    /* renamed from: no.nordicsemi.android.support.v18.scanner.b$b  reason: collision with other inner class name */
    /* compiled from: BluetoothLeScannerImplJB */
    class C0791b implements Runnable {
        C0791b() {
        }

        public void run() {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null && b.this.f11200e > 0 && b.this.f11201f > 0) {
                defaultAdapter.startLeScan(b.this.f11204i);
                b.this.f11199d.postDelayed(b.this.f11202g, b.this.f11201f);
            }
        }
    }

    /* compiled from: BluetoothLeScannerImplJB */
    class c implements BluetoothAdapter.LeScanCallback {

        /* compiled from: BluetoothLeScannerImplJB */
        class a implements Runnable {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ a.C0788a f11207g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ m f11208h;

            a(c cVar, a.C0788a aVar, m mVar) {
                this.f11207g = aVar;
                this.f11208h = mVar;
            }

            public void run() {
                this.f11207g.g(1, this.f11208h);
            }
        }

        c() {
        }

        public void onLeScan(BluetoothDevice bluetoothDevice, int i2, byte[] bArr) {
            m mVar = new m(bluetoothDevice, l.g(bArr), i2, SystemClock.elapsedRealtimeNanos());
            synchronized (b.this.b) {
                for (a.C0788a aVar : b.this.b.values()) {
                    aVar.f11189i.post(new a(this, aVar, mVar));
                }
            }
        }
    }

    b() {
    }

    private void m() {
        long j2;
        long j3;
        synchronized (this.b) {
            j2 = Long.MAX_VALUE;
            j3 = Long.MAX_VALUE;
            for (a.C0788a aVar : this.b.values()) {
                n nVar = aVar.f11187g;
                if (nVar.p()) {
                    if (j2 > nVar.i()) {
                        j2 = nVar.i();
                    }
                    if (j3 > nVar.j()) {
                        j3 = nVar.j();
                    }
                }
            }
        }
        if (j2 >= Long.MAX_VALUE || j3 >= Long.MAX_VALUE) {
            this.f11201f = 0;
            this.f11200e = 0;
            Handler handler = this.f11199d;
            if (handler != null) {
                handler.removeCallbacks(this.f11203h);
                this.f11199d.removeCallbacks(this.f11202g);
                return;
            }
            return;
        }
        this.f11200e = j2;
        this.f11201f = j3;
        Handler handler2 = this.f11199d;
        if (handler2 != null) {
            handler2.removeCallbacks(this.f11203h);
            this.f11199d.removeCallbacks(this.f11202g);
            this.f11199d.postDelayed(this.f11202g, this.f11201f);
        }
    }

    /* access modifiers changed from: package-private */
    public void c(List<k> list, n nVar, j jVar, Handler handler) {
        boolean isEmpty;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        synchronized (this.b) {
            if (!this.b.containsKey(jVar)) {
                a.C0788a aVar = new a.C0788a(false, false, list, nVar, jVar, handler);
                isEmpty = this.b.isEmpty();
                this.b.put(jVar, aVar);
            } else {
                throw new IllegalArgumentException("scanner already started with given scanCallback");
            }
        }
        if (this.c == null) {
            HandlerThread handlerThread = new HandlerThread(b.class.getName());
            this.c = handlerThread;
            handlerThread.start();
            this.f11199d = new Handler(this.c.getLooper());
        }
        m();
        if (isEmpty) {
            defaultAdapter.startLeScan(this.f11204i);
        }
    }

    /* access modifiers changed from: package-private */
    public void e(j jVar) {
        a.C0788a remove;
        boolean isEmpty;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        synchronized (this.b) {
            remove = this.b.remove(jVar);
            isEmpty = this.b.isEmpty();
        }
        if (remove != null) {
            remove.d();
            m();
            if (isEmpty) {
                defaultAdapter.stopLeScan(this.f11204i);
                Handler handler = this.f11199d;
                if (handler != null) {
                    handler.removeCallbacksAndMessages((Object) null);
                }
                HandlerThread handlerThread = this.c;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                    this.c = null;
                }
            }
        }
    }
}
