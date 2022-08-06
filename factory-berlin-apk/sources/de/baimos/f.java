package de.baimos;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import de.baimos.blueid.sdk.api.Channel;
import de.baimos.blueid.sdk.api.SdkInfo;
import de.baimos.blueid.sdk.api.exceptions.ConnectException;
import de.baimos.blueid.sdk.api.exceptions.DeviceNotFoundException;
import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import de.baimos.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public class f extends bn implements a, b, cw {
    /* access modifiers changed from: private */
    public static final dr a = ds.a(f.class);
    /* access modifiers changed from: private */
    public static final UUID b = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    private BluetoothAdapter c;

    /* renamed from: d  reason: collision with root package name */
    private Context f8320d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public String f8321e;

    /* renamed from: f  reason: collision with root package name */
    private UUID f8322f;

    /* renamed from: g  reason: collision with root package name */
    private UUID f8323g;

    /* renamed from: h  reason: collision with root package name */
    private UUID f8324h;

    /* renamed from: i  reason: collision with root package name */
    private BluetoothGatt f8325i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public BluetoothGattCharacteristic f8326j;

    /* renamed from: k  reason: collision with root package name */
    private BluetoothGattCharacteristic f8327k;

    /* renamed from: l  reason: collision with root package name */
    private Queue<byte[]> f8328l = new ArrayBlockingQueue(1000);

    /* renamed from: m  reason: collision with root package name */
    private final AtomicBoolean f8329m = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public InputStream f8330n;
    /* access modifiers changed from: private */
    public OutputStream o;
    /* access modifiers changed from: private */
    public cz p;
    /* access modifiers changed from: private */
    public long q;
    /* access modifiers changed from: private */
    public volatile a r;
    /* access modifiers changed from: private */
    public AndroidSdkMetrics s;
    private boolean t = false;
    private boolean u;
    private boolean v;
    /* access modifiers changed from: private */
    public boolean w;

    public enum a {
        DISCONNECTED,
        CONNECTED,
        ERROR,
        FINISHED
    }

    public f(String str) {
        Uri parse = Uri.parse(str);
        String str2 = parse.getPathSegments().get(0);
        this.f8321e = parse.getHost();
        this.f8322f = UUID.fromString(str2);
        this.f8323g = UUID.fromString(str2.replaceFirst("00005301", "00005303"));
        this.f8324h = UUID.fromString(str2.replaceFirst("00005301", "00005302"));
        String str3 = Build.MANUFACTURER;
        if (Boolean.getBoolean("de.baimos.blueid.sdk.debug.ble.noCache")) {
            a.c("No device cache");
            a("clearing cache before attempting to discover & connect");
            m.a().a();
        }
        boolean z = Boolean.getBoolean("de.baimos.blueid.sdk.debug.ble.disableHuaweiWorkaround");
        if (z) {
            a.d("HUAWEI workaround was intentionally disabled");
        }
        if (!str3.toUpperCase().equals("HUAWEI") || z) {
            a.d("default mode");
            this.u = false;
            this.v = false;
            return;
        }
        a.d("enabling HUAWEI mode");
        this.u = true;
        this.v = true;
        a.c("HUAWEI workaround enabled");
    }

    /* access modifiers changed from: private */
    public String a(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? Integer.toString(i2) : "disconnecting" : "connected" : "connecting" : "disconnected";
    }

    private void a(BluetoothGatt bluetoothGatt) {
        try {
            Method method = bluetoothGatt.getClass().getMethod("refresh", new Class[0]);
            if (method != null) {
                method.invoke(bluetoothGatt, new Object[0]);
            }
        } catch (Exception unused) {
            a("failed to refresh device cache");
        }
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        dr drVar = a;
        drVar.d("set state in sync to " + aVar);
        this.r = aVar;
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        if (SdkInfo.DEBUG_LOG_BLE || Boolean.getBoolean("de.baimos.blueid.sdk.debug.ble")) {
            a.d(str);
        }
    }

    private boolean a(BluetoothDevice bluetoothDevice) {
        long j2;
        int i2;
        int i3;
        BluetoothGatt connectGatt;
        this.s.deviceFound();
        if (this.v) {
            i3 = 5;
            j2 = 5000;
            i2 = 5;
        } else {
            j2 = 10000;
            i3 = 1;
            i2 = 1;
        }
        boolean z = true;
        while (i3 > 0) {
            a.c("Device " + bluetoothDevice.getAddress() + " connection start (for " + j2 + " ms, iteration " + ((i2 - i3) + 1) + " of " + i2 + ")");
            this.p = new cz() {
                public synchronized void a() {
                    super.a();
                }
            };
            this.f8330n = new cu(this.p);
            this.o = new h(this, 20);
            this.r = a.DISCONNECTED;
            AnonymousClass2 r10 = new BluetoothGattCallback() {
                public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                    if (bluetoothGattCharacteristic.equals(f.this.f8326j)) {
                        try {
                            byte[] value = bluetoothGattCharacteristic.getValue();
                            f fVar = f.this;
                            fVar.a("received data: " + be.a(value));
                            f.this.p.a(value);
                            long unused = f.this.q = System.currentTimeMillis();
                        } catch (InterruptedException unused2) {
                            f.a.a("failed to write received data in input buffer");
                            f.this.s.addMessage("failed to write received data in input buffer");
                            f.this.n();
                        }
                    } else {
                        f fVar2 = f.this;
                        fVar2.a("onCharacteristicChanged: uid=" + bluetoothGattCharacteristic.getUuid() + ", value=" + be.a(bluetoothGattCharacteristic.getValue()));
                    }
                }

                public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) {
                    dr b = f.a;
                    b.d("onCharacteristic write: uid=" + bluetoothGattCharacteristic.getUuid() + ", value=" + be.a(bluetoothGattCharacteristic.getValue()) + ", status=" + i2);
                    f.this.o();
                }

                public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i2, int i3) {
                    f fVar = f.this;
                    fVar.a("connection state change: newState=" + i3 + ", status=" + i2);
                    dr b = f.a;
                    b.c("Device " + bluetoothGatt.getDevice().getAddress() + " connection state changed to " + f.this.a(i3));
                    if (i3 == 0) {
                        if (i2 == 133) {
                            f.a.c("Gatt error 133 detected, retry immediately");
                            boolean unused = f.this.w = true;
                            return;
                        }
                        f.this.b(i2);
                        f.this.m();
                    } else if (i2 == 0 && i3 == 2) {
                        f.this.s.gattConnected();
                        if (bluetoothGatt != null) {
                            dr b2 = f.a;
                            b2.c("Device " + bluetoothGatt.getDevice().getAddress() + " connection completed");
                        }
                        f.this.e();
                    } else {
                        AndroidSdkMetrics b3 = f.this.s;
                        b3.addMessage("Gatt callback ended without result. Following properties were set during failure " + i2 + ", new state " + i3);
                        f.this.n();
                    }
                }

                public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i2) {
                    if (!bluetoothGattDescriptor.getUuid().equals(f.b) || i2 != 0) {
                        dr b = f.a;
                        b.b("Device " + bluetoothGatt.getDevice().getAddress() + " notification enable failed for descriptor " + bluetoothGattDescriptor.getUuid() + " status " + i2);
                        AndroidSdkMetrics b2 = f.this.s;
                        StringBuilder sb = new StringBuilder();
                        sb.append("unknown descriptor write callback for descriptor ");
                        sb.append(bluetoothGattDescriptor.getUuid());
                        sb.append(" and status ");
                        sb.append(i2);
                        b2.addMessage(sb.toString());
                        f.this.n();
                        return;
                    }
                    dr b3 = f.a;
                    b3.c("Device " + bluetoothGatt.getDevice().getAddress() + " notification enabled");
                    f.this.a(a.CONNECTED);
                }

                public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i2) {
                    f fVar = f.this;
                    fVar.a("onServicesDiscovered: status=" + i2);
                    if (bluetoothGatt != null) {
                        dr b = f.a;
                        b.c("Device " + bluetoothGatt.getDevice().getAddress() + " service discovery completed with result " + Integer.toString(i2));
                    }
                    f.this.s.servicesDiscovered();
                    f.this.j();
                }
            };
            this.w = false;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 26) {
                a.d("connectGatt with Android O features");
                connectGatt = bluetoothDevice.connectGatt(this.f8320d, false, r10, 2, 1);
            } else if (i4 >= 23) {
                a.d("connectGatt with Android M features");
                connectGatt = bluetoothDevice.connectGatt(this.f8320d, false, r10, 2);
            } else {
                connectGatt = bluetoothDevice.connectGatt(this.f8320d, false, r10);
            }
            this.f8325i = connectGatt;
            if (this.f8325i != null) {
                a("wait for the connection to be established");
                long currentTimeMillis = System.currentTimeMillis();
                while (!this.w && System.currentTimeMillis() - currentTimeMillis < j2 && (a.DISCONNECTED.equals(this.r) || a.FINISHED.equals(this.r))) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e2) {
                        a.a("Waiting for connection was interrupted", e2);
                    }
                }
                a("connection state is now: " + this.r);
                if (a.CONNECTED.equals(this.r)) {
                    break;
                }
                a("did not establish connection within time limits");
                this.f8325i.disconnect();
                this.f8325i.close();
                if (!z || !this.w) {
                    i3--;
                } else {
                    z = false;
                }
                try {
                    a.d("wait before retry");
                    Thread.sleep(500);
                } catch (InterruptedException e3) {
                    e3.printStackTrace();
                }
            } else {
                return false;
            }
        }
        return a.CONNECTED.equals(this.r);
    }

    /* access modifiers changed from: private */
    public void b(int i2) {
        dr drVar;
        String str;
        if (i2 == 0) {
            drVar = a;
            str = "connection closed";
        } else if (i2 == 19) {
            drVar = a;
            str = "remote user terminated connection";
        } else if (i2 == 22) {
            drVar = a;
            str = "connection terminated by local host";
        } else if (i2 == 59) {
            drVar = a;
            str = "connection closed because of unacceptable connection parameters";
        } else if (i2 == 62) {
            drVar = a;
            str = "connection failed to be established";
        } else if (i2 != 133) {
            dr drVar2 = a;
            drVar2.c("connection closed with status " + i2);
            return;
        } else {
            drVar = a;
            str = "generic Android error, trying to reconnect";
        }
        drVar.c(str);
    }

    private void d() {
        this.q = System.currentTimeMillis();
        final Timer timer = new Timer();
        a("start read timeout checker");
        timer.schedule(new TimerTask() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                f fVar = f.this;
                fVar.a("readTimestamp = " + f.this.q + ", diff = " + (currentTimeMillis - f.this.q));
                if (!a.CONNECTED.equals(f.this.r)) {
                    f.this.a("disconnected, cancelling timer");
                    timer.cancel();
                } else if (currentTimeMillis - f.this.q > 10000) {
                    f.a.a("Failed to receive data within time! Please make sure the device is still within reach.");
                    f.this.s.addMessage("Failed to receive data within time! Please make sure the device is still within reach.");
                    timer.cancel();
                    f.this.n();
                }
            }
        }, 250, 250);
    }

    /* access modifiers changed from: private */
    public void e() {
        if (this.t) {
            a.d("service refresh required!");
            a(this.f8325i);
            this.t = false;
        }
        a("start service discovery");
        if (this.f8325i == null) {
            a.b("failed to start service discovery. gatt object is null.");
            this.s.addMessage("failed to start service discovery. gatt object is null.");
            n();
        }
        BluetoothGatt bluetoothGatt = this.f8325i;
        if (bluetoothGatt == null || bluetoothGatt.discoverServices()) {
            dr drVar = a;
            drVar.c("Device " + this.f8325i.getDevice().getAddress() + " service discovery start");
            return;
        }
        a.b("failed to start service discovery. discover returns false.");
        this.s.addMessage("failed to start service discovery. discover returns false.");
        n();
    }

    /* access modifiers changed from: private */
    public void j() {
        String str;
        AndroidSdkMetrics androidSdkMetrics;
        a("enable notifications");
        BluetoothGattService service = this.f8325i.getService(this.f8322f);
        if (SdkInfo.DEBUG_LOG_BLE || Boolean.getBoolean("de.baimos.blueid.sdk.debug.ble")) {
            List<BluetoothGattService> services = this.f8325i.getServices();
            if (services == null || services.size() == 0) {
                a.b("no services found!");
                this.s.addMessage("no services found!");
                dr drVar = a;
                drVar.b("Device " + this.f8325i.getDevice().getAddress() + " notification enable fail (service not found)");
            }
            if (services != null) {
                for (BluetoothGattService next : services) {
                    dr drVar2 = a;
                    drVar2.d("found service " + next.getUuid());
                    List<BluetoothGattCharacteristic> characteristics = next.getCharacteristics();
                    if (characteristics != null) {
                        for (BluetoothGattCharacteristic uuid : characteristics) {
                            dr drVar3 = a;
                            drVar3.d("    -> characteristic " + uuid.getUuid());
                        }
                    }
                }
            }
        }
        if (service != null) {
            this.f8326j = service.getCharacteristic(this.f8323g);
            BluetoothGattCharacteristic characteristic = service.getCharacteristic(this.f8324h);
            this.f8327k = characteristic;
            if (this.f8326j == null || characteristic == null) {
                if (this.f8326j == null) {
                    dr drVar4 = a;
                    drVar4.a("Device " + this.f8325i.getDevice().getAddress() + " notification enable failed (input characteristic not found)");
                    this.s.addMessage("Input characteristic not found! Please make sure that the Bluetooth profile on the device is configured correctly.");
                }
                if (this.f8327k == null) {
                    dr drVar5 = a;
                    drVar5.a("Device " + this.f8325i.getDevice().getAddress() + " notification enable failed (output characteristic not found)");
                    androidSdkMetrics = this.s;
                    str = "Output characteristic not found! Please make sure that the Bluetooth profile on the device is configured correctly.";
                }
                n();
            } else if (!k()) {
                dr drVar6 = a;
                drVar6.a("Device " + this.f8325i.getDevice().getAddress() + " notification enable failed");
                androidSdkMetrics = this.s;
                str = "Failed to enable characteristic notification. Please make sure that the Bluetooth profile on the device is configured correctly.";
            } else {
                return;
            }
        } else {
            dr drVar7 = a;
            drVar7.a("Device " + this.f8325i.getDevice().getAddress() + " notification enable failed (service not found)");
            androidSdkMetrics = this.s;
            str = "Service not found. Please make sure that the Bluetooth profile on the device is configured correctly.";
        }
        androidSdkMetrics.addMessage(str);
        n();
    }

    private boolean k() {
        dr drVar;
        StringBuilder sb;
        String str;
        if (!this.f8325i.setCharacteristicNotification(this.f8326j, true)) {
            drVar = a;
            sb = new StringBuilder();
            sb.append("Device ");
            sb.append(this.f8325i.getDevice().getAddress());
            str = " notification enable failed (failed to set characteristic)";
        } else {
            BluetoothGattDescriptor descriptor = this.f8326j.getDescriptor(b);
            if (descriptor == null) {
                drVar = a;
                sb = new StringBuilder();
                sb.append("Device ");
                sb.append(this.f8325i.getDevice().getAddress());
                str = " notification enable failed (failed to get configuration descriptor)";
            } else {
                descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                BluetoothGattCharacteristic characteristic = descriptor.getCharacteristic();
                int writeType = characteristic.getWriteType();
                characteristic.setWriteType(2);
                boolean writeDescriptor = this.f8325i.writeDescriptor(descriptor);
                characteristic.setWriteType(writeType);
                if (!writeDescriptor) {
                    drVar = a;
                    sb = new StringBuilder();
                    sb.append("Device ");
                    sb.append(this.f8325i.getDevice().getAddress());
                    str = " notification enable failed (failed to write descriptor)";
                } else {
                    dr drVar2 = a;
                    drVar2.c("Device " + this.f8325i.getDevice().getAddress() + " notification enable start");
                    return true;
                }
            }
        }
        sb.append(str);
        drVar.a(sb.toString());
        return false;
    }

    /* access modifiers changed from: private */
    public void l() {
        a("disconnect");
        if (!a.CONNECTED.equals(this.r)) {
            a("expected connectionState to be CONNECTED but is " + this.r + " so we won't disconnect again but shut down the connection directly");
            m();
            return;
        }
        this.f8325i.disconnect();
        a("wait for connection to be FINISHED");
        long currentTimeMillis = System.currentTimeMillis();
        while (System.currentTimeMillis() - currentTimeMillis < 2000 && !a.FINISHED.equals(this.r)) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e2) {
                a.a("Waiting for connection was interrupted", e2);
            }
        }
        a("connection state is " + this.r);
        if (!a.FINISHED.equals(this.r)) {
            m();
        }
        this.s.connectionClosed();
    }

    /* access modifiers changed from: private */
    public void m() {
        a("finish connection");
        a aVar = this.r;
        a aVar2 = a.FINISHED;
        if (aVar != aVar2) {
            a(aVar2);
            this.f8325i.close();
            long currentTimeMillis = System.currentTimeMillis();
            do {
                a.d("waiting for buffer to be emptied before eof'ing the connection");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
                if (this.p.b() <= 0 || System.currentTimeMillis() - currentTimeMillis >= 1000) {
                    this.p.a();
                }
                a.d("waiting for buffer to be emptied before eof'ing the connection");
                break;
            } while (System.currentTimeMillis() - currentTimeMillis >= 1000);
            this.p.a();
        }
    }

    /* access modifiers changed from: private */
    public void n() {
        if (this.f8325i == null) {
            a("gatt is null, so we have nothing to do here");
            return;
        }
        a.d("disconnect");
        l();
        a(a.ERROR);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:15|(3:17|18|19)|20|21|(1:23)) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0061, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0033 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void o() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Queue<byte[]> r0 = r3.f8328l     // Catch:{ all -> 0x0062 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0062 }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x0062 }
            if (r0 != 0) goto L_0x0013
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f8329m     // Catch:{ all -> 0x0062 }
            r1 = 0
            r0.set(r1)     // Catch:{ all -> 0x0062 }
            monitor-exit(r3)
            return
        L_0x0013:
            android.bluetooth.BluetoothGattCharacteristic r1 = r3.f8327k     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x0020
            java.lang.String r0 = "BLE output is null"
            r3.a((java.lang.String) r0)     // Catch:{ all -> 0x0062 }
        L_0x001c:
            r3.n()     // Catch:{ all -> 0x0062 }
            goto L_0x0060
        L_0x0020:
            android.bluetooth.BluetoothGatt r1 = r3.f8325i     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x002a
            java.lang.String r0 = "BLE gatt is null"
            r3.a((java.lang.String) r0)     // Catch:{ all -> 0x0062 }
            goto L_0x001c
        L_0x002a:
            boolean r1 = r3.u     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x0033
            r1 = 30
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0033 }
        L_0x0033:
            android.bluetooth.BluetoothGattCharacteristic r1 = r3.f8327k     // Catch:{ all -> 0x0062 }
            r1.setValue(r0)     // Catch:{ all -> 0x0062 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0062 }
            r1.<init>()     // Catch:{ all -> 0x0062 }
            java.lang.String r2 = "write data: "
            r1.append(r2)     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = de.baimos.be.a((byte[]) r0)     // Catch:{ all -> 0x0062 }
            r1.append(r0)     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0062 }
            r3.a((java.lang.String) r0)     // Catch:{ all -> 0x0062 }
            android.bluetooth.BluetoothGatt r0 = r3.f8325i     // Catch:{ all -> 0x0062 }
            android.bluetooth.BluetoothGattCharacteristic r1 = r3.f8327k     // Catch:{ all -> 0x0062 }
            boolean r0 = r0.writeCharacteristic(r1)     // Catch:{ all -> 0x0062 }
            if (r0 != 0) goto L_0x0060
            java.lang.String r0 = "failed to write to output"
            r3.a((java.lang.String) r0)     // Catch:{ all -> 0x0062 }
            goto L_0x001c
        L_0x0060:
            monitor-exit(r3)
            return
        L_0x0062:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: de.baimos.f.o():void");
    }

    /* access modifiers changed from: protected */
    public cm a() {
        l.a a2;
        a("doConnect() start");
        if (Boolean.getBoolean("de.baimos.blueid.sdk.debug.ble.noCache")) {
            a.d("clearing cache before attempting to discover & connect");
            m.a().a();
        }
        this.s.startConnectionAttempt();
        l.a b2 = m.a().b(this.f8321e);
        boolean z = false;
        int i2 = 1;
        this.s.setConnectedByCache(b2 != null);
        if (b2 != null) {
            dr drVar = a;
            drVar.d("check cached device entry, which was added " + b2.b() + " ms ago");
            z = a(b2.a());
        }
        if (Boolean.getBoolean("net.blueid.sdk.DISABLE_SCANNING")) {
            if (b2 == null) {
                throw new DeviceNotFoundException("No matching device found in cache!");
            } else if (!z) {
                throw new ConnectException("Connection could not be established with " + this.f8321e);
            }
        }
        if (!z) {
            if (b2 != null) {
                m.a().c(this.f8321e);
                AndroidSdkMetrics androidSdkMetrics = this.s;
                androidSdkMetrics.addMessage("we were not able to connect. we invalidate cache entry and stop connection attempt to " + this.f8321e);
                n();
            }
            a("scan for device");
            do {
                i a3 = m.a(this.c, this.s);
                dr drVar2 = a;
                drVar2.c("Device " + this.f8321e + " scan start (for " + 5000 + " ms, iteration " + i2 + " of " + 5 + ")");
                a2 = a3.a(this.f8321e, 5000);
                this.s.setScanDuration(a3.b());
                if (a2 == null) {
                    a("did not find a matching device!");
                    if (i2 < 5) {
                        i2++;
                        try {
                            Thread.sleep(500);
                            continue;
                        } catch (InterruptedException unused) {
                            continue;
                        }
                    } else {
                        dr drVar3 = a;
                        drVar3.b("Device " + this.f8321e + " scan failure (not found)");
                        throw new DeviceNotFoundException("Did not find a matching device during scan!");
                    }
                }
            } while (a2 == null);
            z = a(a2.a());
        }
        if (z) {
            d();
            this.s.connectionEstablished();
            a("return connection");
            return new cm() {
                public InputStream a() {
                    return f.this.f8330n;
                }

                public OutputStream b() {
                    return f.this.o;
                }

                public String c() {
                    return f.this.f8321e;
                }

                public void d() {
                    f.this.s.finishedExecution();
                    f.this.p.a();
                    f.this.l();
                }
            };
        }
        m.a().c(this.f8321e);
        n();
        throw new ConnectException("Connection could not be established with " + this.f8321e);
    }

    public void a(long j2) {
    }

    @TargetApi(18)
    public void a(Channel channel) {
        if (channel instanceof g) {
            Context a2 = ((g) channel).a();
            this.f8320d = a2;
            this.c = ((BluetoothManager) a2.getSystemService("bluetooth")).getAdapter();
            return;
        }
        throw new RuntimeException("wrong channel for btle client, expecting btlespp channel");
    }

    public void a(AndroidSdkMetrics androidSdkMetrics) {
        this.s = androidSdkMetrics;
        if (this.u && this.v) {
            androidSdkMetrics.addMessage("HUAWEI workaround enabled");
        }
        this.s.startExecution();
    }

    public synchronized void a(List<byte[]> list) {
        try {
            this.f8328l.addAll(list);
            if (this.f8329m.compareAndSet(false, true)) {
                o();
            }
        } catch (Exception e2) {
            throw new IOException("failed to write data, writeQueue size: " + this.f8328l.size(), e2);
        }
    }
}
