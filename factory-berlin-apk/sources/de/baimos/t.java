package de.baimos;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import de.baimos.blueid.sdk.api.SdkInfo;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class t {
    private static final dr b = ds.a(t.class);
    protected BluetoothAdapter a;
    private final AtomicBoolean c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private x f8355d;

    /* renamed from: e  reason: collision with root package name */
    private long f8356e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, AtomicInteger> f8357f = new ConcurrentHashMap();

    public t(BluetoothAdapter bluetoothAdapter, x xVar) {
        this.a = bluetoothAdapter;
        this.f8355d = xVar;
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
            for (String next : this.f8357f.keySet()) {
                dr drVar = b;
                drVar.d("findings of '" + next + "': " + this.f8357f.get(next));
            }
            b.c("stopped scanning");
            try {
                a();
            } catch (IOException e2) {
                b.a("failed to stop scan", e2);
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

    public BluetoothDevice a(String str, long j2) {
        long currentTimeMillis = System.currentTimeMillis();
        dr drVar = b;
        drVar.d("BLE start device scan " + currentTimeMillis);
        this.f8357f.clear();
        if (this.f8355d.a(str)) {
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
            this.f8356e = System.currentTimeMillis() - currentTimeMillis;
            c();
        }
        return this.f8355d.b(str);
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
                        this.f8355d.a(str, bluetoothDevice);
                        if (!this.f8357f.containsKey(str)) {
                            this.f8357f.put(str, new AtomicInteger(0));
                        }
                        this.f8357f.get(str).incrementAndGet();
                    }
                    if (this.f8355d.a(str2)) {
                        b.c("found device!");
                        c();
                    }
                }
            } catch (Exception e2) {
                b.a("failed to retrieve scan result", e2);
            }
        }
    }

    public long b() {
        return this.f8356e;
    }
}
