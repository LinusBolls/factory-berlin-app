package de.baimos;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import de.baimos.blueid.sdk.api.SdkInfo;
import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import de.baimos.l;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class i {
    private static final dr b = ds.a(i.class);
    protected BluetoothAdapter a;
    private final AtomicBoolean c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private l f8333d;

    /* renamed from: e  reason: collision with root package name */
    private long f8334e;

    /* renamed from: f  reason: collision with root package name */
    private AndroidSdkMetrics f8335f;

    public i(BluetoothAdapter bluetoothAdapter, l lVar, AndroidSdkMetrics androidSdkMetrics) {
        this.a = bluetoothAdapter;
        this.f8333d = lVar;
        this.f8335f = androidSdkMetrics;
    }

    private void b(String str) {
        if (this.c.compareAndSet(false, true)) {
            if (SdkInfo.DEBUG_LOG_BLE) {
                bj.a("start scan");
            }
            try {
                a(str);
            } catch (IOException e2) {
                b.a("failed to start scan", e2);
                this.f8335f.addMessage(e2.toString());
            }
        } else {
            throw new RuntimeException("already running a scan");
        }
    }

    private void c() {
        if (this.c.get()) {
            b.d("BLE stop scanning");
            if (SdkInfo.DEBUG_LOG_BLE) {
                bj.a("stop scan");
            }
            b.c("stopped scanning");
            try {
                a();
            } catch (IOException e2) {
                b.a("failed to stop scan", e2);
                this.f8335f.addMessage(e2.toString());
            }
            try {
                Thread.sleep(250);
            } catch (InterruptedException e3) {
                b.a("failed to sleep after scan", e3);
            }
            this.c.set(false);
            synchronized (this.c) {
                this.c.notifyAll();
            }
        }
    }

    public l.a a(String str, long j2) {
        long currentTimeMillis = System.currentTimeMillis();
        dr drVar = b;
        drVar.d("BLE start device scan " + currentTimeMillis);
        if (this.f8333d.a(str)) {
            b.c("returning cached device");
        } else {
            b(str);
            long currentTimeMillis2 = System.currentTimeMillis();
            while (System.currentTimeMillis() - currentTimeMillis2 < j2 && this.c.get()) {
                synchronized (this.c) {
                    try {
                        this.c.wait(5);
                    } catch (InterruptedException e2) {
                        b.a("waiting for scan result was interrupted", e2);
                    }
                }
            }
            this.f8334e = System.currentTimeMillis() - currentTimeMillis;
            c();
        }
        return this.f8333d.b(str);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public void a(int i2) {
        dr drVar = b;
        drVar.a("Scanning failed with error code " + i2);
        c();
    }

    /* access modifiers changed from: protected */
    public abstract void a(String str);

    /* access modifiers changed from: protected */
    public void a(String str, BluetoothDevice bluetoothDevice, String str2) {
        if (bluetoothDevice != null) {
            try {
                if (this.c.get()) {
                    b.d("found new device");
                    if (str != null) {
                        dr drVar = b;
                        drVar.d("name = " + str);
                        this.f8333d.a(str, bluetoothDevice);
                    }
                    if (this.f8333d.a(str2)) {
                        b.c("found device!");
                        c();
                    }
                }
            } catch (Exception e2) {
                b.a("failed to retrieve scan result", e2);
                this.f8335f.addMessage(e2.toString());
            }
        }
    }

    public long b() {
        return this.f8334e;
    }
}
