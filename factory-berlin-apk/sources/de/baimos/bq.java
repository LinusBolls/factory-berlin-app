package de.baimos;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import de.baimos.bo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class bq extends bo {
    /* access modifiers changed from: private */
    public final Map<bw, bo.a> a = new HashMap();
    private HandlerThread b;
    /* access modifiers changed from: private */
    public Handler c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public long f8254d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public long f8255e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f8256f = new Runnable() {
        public void run() {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null && bq.this.f8254d > 0 && bq.this.f8255e > 0) {
                defaultAdapter.stopLeScan(bq.this.f8258h);
                bq.this.c.postDelayed(bq.this.f8257g, bq.this.f8254d);
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Runnable f8257g = new Runnable() {
        public void run() {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null && bq.this.f8254d > 0 && bq.this.f8255e > 0) {
                defaultAdapter.startLeScan(bq.this.f8258h);
                bq.this.c.postDelayed(bq.this.f8256f, bq.this.f8255e);
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final BluetoothAdapter.LeScanCallback f8258h = new BluetoothAdapter.LeScanCallback() {
        public void onLeScan(BluetoothDevice bluetoothDevice, int i2, byte[] bArr) {
            final bz bzVar = new bz(bluetoothDevice, by.a(bArr), i2, SystemClock.elapsedRealtimeNanos());
            synchronized (bq.this.a) {
                for (final bo.a aVar : bq.this.a.values()) {
                    aVar.f8243d.post(new Runnable() {
                        public void run() {
                            aVar.a(1, bzVar);
                        }
                    });
                }
            }
        }
    };

    bq() {
    }

    private void b() {
        long j2;
        long j3;
        synchronized (this.a) {
            j2 = Long.MAX_VALUE;
            j3 = Long.MAX_VALUE;
            for (bo.a aVar : this.a.values()) {
                ca caVar = aVar.b;
                if (caVar.l()) {
                    if (j2 > caVar.m()) {
                        j2 = caVar.m();
                    }
                    if (j3 > caVar.n()) {
                        j3 = caVar.n();
                    }
                }
            }
        }
        if (j2 >= Long.MAX_VALUE || j3 >= Long.MAX_VALUE) {
            this.f8255e = 0;
            this.f8254d = 0;
            Handler handler = this.c;
            if (handler != null) {
                handler.removeCallbacks(this.f8257g);
                this.c.removeCallbacks(this.f8256f);
                return;
            }
            return;
        }
        this.f8254d = j2;
        this.f8255e = j3;
        Handler handler2 = this.c;
        if (handler2 != null) {
            handler2.removeCallbacks(this.f8257g);
            this.c.removeCallbacks(this.f8256f);
            this.c.postDelayed(this.f8256f, this.f8255e);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(List<bx> list, ca caVar, bw bwVar, Handler handler) {
        boolean isEmpty;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        synchronized (this.a) {
            if (!this.a.containsKey(bwVar)) {
                bo.a aVar = new bo.a(false, false, list, caVar, bwVar, handler);
                isEmpty = this.a.isEmpty();
                this.a.put(bwVar, aVar);
            } else {
                throw new IllegalArgumentException("scanner already started with given scanCallback");
            }
        }
        if (this.b == null) {
            HandlerThread handlerThread = new HandlerThread(bq.class.getName());
            this.b = handlerThread;
            handlerThread.start();
            this.c = new Handler(this.b.getLooper());
        }
        b();
        if (isEmpty) {
            defaultAdapter.startLeScan(this.f8258h);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(bw bwVar) {
        bo.a remove;
        boolean isEmpty;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        synchronized (this.a) {
            remove = this.a.remove(bwVar);
            isEmpty = this.a.isEmpty();
        }
        if (remove != null) {
            remove.a();
            b();
            if (isEmpty) {
                defaultAdapter.stopLeScan(this.f8258h);
                Handler handler = this.c;
                if (handler != null) {
                    handler.removeCallbacksAndMessages((Object) null);
                }
                HandlerThread handlerThread = this.b;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                    this.b = null;
                }
            }
        }
    }
}
