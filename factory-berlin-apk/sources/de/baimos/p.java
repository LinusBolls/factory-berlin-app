package de.baimos;

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
import de.baimos.blueid.sdk.api.exceptions.ConnectException;
import de.baimos.blueid.sdk.api.exceptions.DeviceNotFoundException;
import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import de.baimos.q;
import de.baimos.r;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class p extends bn implements a, b, q.a, r.a {
    /* access modifiers changed from: private */
    public static final dr a = ds.a(p.class);
    /* access modifiers changed from: private */
    public static final UUID c = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    private t b;

    /* renamed from: d  reason: collision with root package name */
    private UUID f8337d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public BluetoothGattCharacteristic f8338e;

    /* renamed from: f  reason: collision with root package name */
    private UUID f8339f;

    /* renamed from: g  reason: collision with root package name */
    private BluetoothGattCharacteristic f8340g;

    /* renamed from: h  reason: collision with root package name */
    private UUID f8341h;

    /* renamed from: i  reason: collision with root package name */
    private Context f8342i;

    /* renamed from: j  reason: collision with root package name */
    private BluetoothGatt f8343j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final LinkedBlockingQueue<a> f8344k = new LinkedBlockingQueue<>();
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public String f8345l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public AtomicBoolean f8346m = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public InputStream f8347n;
    /* access modifiers changed from: private */
    public r o;
    /* access modifiers changed from: private */
    public o p;
    private boolean q;
    /* access modifiers changed from: private */
    public boolean r;
    /* access modifiers changed from: private */
    public AndroidSdkMetrics s;
    /* access modifiers changed from: private */
    public long t = -1;
    private Timer u;
    private final AtomicBoolean v = new AtomicBoolean(false);
    private final AtomicBoolean w = new AtomicBoolean(false);
    private boolean x = false;
    private boolean y = false;

    enum a {
        GATT_CONNECTED,
        SERVICES_DISCOVERED,
        NOTIFICATIONS_ENABLED,
        GATT_DISCONNECTED,
        PACKET_WRITTEN,
        RELIABLE_WRITE_DONE,
        QUEUE_FULL
    }

    public p(String str) {
        a.d("#### START ####");
        Uri parse = Uri.parse(str);
        String str2 = parse.getPathSegments().get(0);
        this.f8345l = parse.getHost();
        this.f8337d = UUID.fromString(str2);
        this.f8339f = UUID.fromString(str2.replaceFirst("00005301", "00005303"));
        this.f8341h = UUID.fromString(str2.replaceFirst("00005301", "00005302"));
        if (Boolean.getBoolean("de.baimos.blueid.sdk.debug.ble.noCache")) {
            a.d("clearing cache before attempting to discover & connect");
            y.a().a();
            this.x = true;
        }
        String str3 = Build.MANUFACTURER;
        dr drVar = a;
        drVar.d("manufacturer = " + str3);
        str3 = str3 == null ? "NO_MANUFACTURER_SET" : str3;
        boolean z = Boolean.getBoolean("de.baimos.blueid.sdk.debug.ble.disableHuaweiWorkaround");
        if (z) {
            a.d("HUAWEI workaround was intentionally disabled");
        }
        if (!str3.toUpperCase().equals("HUAWEI") || z) {
            a.d("default mode");
            this.q = false;
            return;
        }
        a.d("enabling HUAWEI mode");
        this.q = true;
        this.y = true;
    }

    private cm a(BluetoothDevice bluetoothDevice) {
        int i2 = 0;
        while (true) {
            long j2 = (long) i2;
            if (j2 < 5) {
                dr drVar = a;
                StringBuilder sb = new StringBuilder();
                sb.append("connect attempt attempt ");
                i2++;
                sb.append(i2);
                sb.append(" of ");
                sb.append(5);
                drVar.d(sb.toString());
                try {
                    return b(bluetoothDevice);
                } catch (s e2) {
                    a.a("failed to establish connection! close & retry", e2);
                    l();
                    if (j2 < 4) {
                        a.d("wait 1s and then try again");
                        b(1000);
                    }
                }
            } else {
                throw new ConnectException();
            }
        }
    }

    private a a(long j2, a... aVarArr) {
        List asList = Arrays.asList(aVarArr);
        try {
            a poll = this.f8344k.poll(j2, TimeUnit.MILLISECONDS);
            if (poll == null) {
                throw new s("Failed to retrieve one of " + asList + " in time");
            } else if (a.GATT_DISCONNECTED.equals(poll) && !asList.contains(a.GATT_DISCONNECTED)) {
                throw new s("GATT disconnected while waiting for one of " + asList);
            } else if (asList.contains(poll)) {
                return poll;
            } else {
                throw new s("Expected one of " + asList + " but got " + poll + " instead");
            }
        } catch (InterruptedException e2) {
            throw new s("Thread was interrupted while waiting for one of " + asList, e2);
        }
    }

    /* access modifiers changed from: private */
    public String a(int i2) {
        if (i2 == 0) {
            return "connection closed properly";
        }
        if (i2 == 1) {
            return "L2CAP error";
        }
        if (i2 == 8) {
            return "connection timeout";
        }
        if (i2 == 19) {
            return "remote user terminated connection";
        }
        if (i2 == 22) {
            return "connection terminated by local host";
        }
        if (i2 == 34) {
            return "LMP timeout";
        }
        if (i2 == 59) {
            return "connection closed because of unacceptable connection parameters";
        }
        if (i2 == 62) {
            return "connection failed to be established";
        }
        if (i2 == 133) {
            return "generic BLE error";
        }
        if (i2 == 256) {
            return "connection cancelled";
        }
        return "connection closed with status " + i2;
    }

    private void a(BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt.setCharacteristicNotification(this.f8338e, true)) {
            BluetoothGattDescriptor descriptor = this.f8338e.getDescriptor(c);
            if (descriptor != null) {
                descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                BluetoothGattCharacteristic characteristic = descriptor.getCharacteristic();
                int writeType = characteristic.getWriteType();
                characteristic.setWriteType(2);
                boolean writeDescriptor = bluetoothGatt.writeDescriptor(descriptor);
                characteristic.setWriteType(writeType);
                if (writeDescriptor) {
                    a(10000, a.NOTIFICATIONS_ENABLED);
                    a.d("notifications enabled");
                    return;
                }
                throw new s("Failed to write descriptor. Please make sure that the Bluetooth profile on the device is configured correctly.");
            }
            throw new s("Cannot get client configuration descriptor. Please make sure that the Bluetooth profile on the device is configured correctly.");
        }
        throw new s("Failed to set characteristic notification. Please make sure that the Bluetooth profile on the device is configured correctly.");
    }

    private cm b(BluetoothDevice bluetoothDevice) {
        this.f8344k.clear();
        this.v.set(false);
        BluetoothGatt c2 = c(bluetoothDevice);
        this.f8343j = c2;
        b(c2);
        a(this.f8343j);
        this.v.set(true);
        this.p = new o();
        this.f8347n = new q(this.p, this);
        this.o = new r(this, 20);
        this.u = n();
        return new cm() {
            public InputStream a() {
                return p.this.f8347n;
            }

            public OutputStream b() {
                return p.this.o;
            }

            public String c() {
                return p.this.f8345l;
            }

            public void d() {
                p.a.d("#### FIN ####");
                p.this.o.a();
                p.this.l();
            }
        };
    }

    private void b(long j2) {
        try {
            Thread.sleep(j2);
        } catch (InterruptedException unused) {
        }
    }

    private void b(BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt.discoverServices()) {
            a(10000, a.SERVICES_DISCOVERED);
            p();
            BluetoothGattService service = bluetoothGatt.getService(this.f8337d);
            if (service != null) {
                this.f8338e = service.getCharacteristic(this.f8339f);
                BluetoothGattCharacteristic characteristic = service.getCharacteristic(this.f8341h);
                this.f8340g = characteristic;
                if (this.f8338e == null || characteristic == null) {
                    if (this.f8338e == null) {
                        a.a("Input characteristic not found! Please make sure that the Bluetooth profile on the device is configured correctly.");
                    }
                    if (this.f8340g == null) {
                        a.a("Output characteristic not found! Please make sure that the Bluetooth profile on the device is configured correctly.");
                    }
                    throw new s("Failed to retrieve characteristics");
                }
                a.d("services discovered");
                return;
            }
            throw new s("Failed to retrieve BlueID service");
        }
        throw new s("failed to start service discovery");
    }

    private BluetoothGatt c(BluetoothDevice bluetoothDevice) {
        BluetoothGatt connectGatt;
        dr drVar;
        String str;
        if (!this.f8346m.get() || this.f8343j == null) {
            this.t = -1;
            this.w.set(false);
            this.f8346m.set(false);
            AnonymousClass3 r5 = new BluetoothGattCallback() {
                public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                    byte[] value = bluetoothGattCharacteristic.getValue();
                    dr d2 = p.a;
                    d2.d("onCharacteristicChanged, characteristic=" + bluetoothGattCharacteristic.getUuid() + ", value = " + be.a(value));
                    if (bluetoothGattCharacteristic.equals(p.this.f8338e)) {
                        try {
                            p.this.p.a(value);
                        } catch (InterruptedException unused) {
                            p.a.a("failed to write received data in input buffer");
                            p.this.k();
                        }
                    }
                }

                public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) {
                    a aVar;
                    LinkedBlockingQueue linkedBlockingQueue;
                    super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i2);
                    dr d2 = p.a;
                    d2.d("onCharacteristicWrite, status=" + i2 + ", data=" + be.a(bluetoothGattCharacteristic.getValue()));
                    if (i2 != 9 || !p.this.r) {
                        linkedBlockingQueue = p.this.f8344k;
                        aVar = a.PACKET_WRITTEN;
                    } else {
                        linkedBlockingQueue = p.this.f8344k;
                        aVar = a.QUEUE_FULL;
                    }
                    linkedBlockingQueue.add(aVar);
                }

                public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i2, int i3) {
                    if (i2 == 0 && i3 == 2) {
                        p.this.f8344k.add(a.GATT_CONNECTED);
                        p.this.f8346m.set(true);
                        p.this.s.gattConnected();
                        return;
                    }
                    if (i3 == 0) {
                        p.this.s.connectionClosed();
                        p.this.f8344k.add(a.GATT_DISCONNECTED);
                        dr d2 = p.a;
                        d2.d("connection closed, reason: " + p.this.a(i2));
                        if (p.this.f8346m.compareAndSet(true, false)) {
                            p.this.m();
                        }
                        bluetoothGatt.close();
                    }
                    dr d3 = p.a;
                    d3.a("onConnectionStateChange: status=" + i2 + ", newState=" + i3);
                }

                public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i2) {
                    dr d2 = p.a;
                    d2.d("onDescriptorWrite, status=" + i2 + ", descriptor=" + bluetoothGattDescriptor.getUuid());
                    if (!bluetoothGattDescriptor.getUuid().equals(p.c) || i2 != 0) {
                        dr d3 = p.a;
                        d3.b("unknown descriptor write callback for descriptor " + bluetoothGattDescriptor.getUuid() + " and status " + i2);
                        return;
                    }
                    p.this.f8344k.add(a.NOTIFICATIONS_ENABLED);
                }

                public void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i2) {
                    dr d2 = p.a;
                    d2.d("onReliableWriteCompleted, status=" + i2);
                    p.this.f8344k.add(a.RELIABLE_WRITE_DONE);
                }

                public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i2) {
                    dr d2 = p.a;
                    d2.d("onServicesDiscovered, status=" + i2);
                    p.this.f8344k.add(a.SERVICES_DISCOVERED);
                    p.this.s.servicesDiscovered();
                }
            };
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 26) {
                a.d("connectGatt with Android O features");
                connectGatt = bluetoothDevice.connectGatt(this.f8342i, false, r5, 2, 1);
            } else if (i2 >= 23) {
                a.d("connectGatt with Android M features");
                connectGatt = bluetoothDevice.connectGatt(this.f8342i, false, r5, 2);
            } else {
                a.d("connectGatt the legacy way");
                connectGatt = bluetoothDevice.connectGatt(this.f8342i, false, r5);
            }
            this.f8343j = connectGatt;
            a(5000, a.GATT_CONNECTED);
            drVar = a;
            str = "connection established";
        } else {
            drVar = a;
            str = "we still seem to be connected, returning old instance";
        }
        drVar.d(str);
        return this.f8343j;
    }

    private BluetoothDevice j() {
        long currentTimeMillis = System.currentTimeMillis();
        BluetoothDevice bluetoothDevice = null;
        int i2 = 0;
        while (true) {
            long j2 = (long) i2;
            if (j2 >= 5) {
                break;
            }
            dr drVar = a;
            StringBuilder sb = new StringBuilder();
            sb.append("scan attempt ");
            i2++;
            sb.append(i2);
            sb.append(" of ");
            sb.append(5);
            drVar.d(sb.toString());
            bluetoothDevice = this.b.a(this.f8345l, 5000);
            if (bluetoothDevice != null) {
                this.s.setScanDuration(this.b.b());
                this.s.deviceFound();
                break;
            } else if (j2 < 4) {
                b(500);
            }
        }
        if (bluetoothDevice != null) {
            dr drVar2 = a;
            drVar2.d("device discovered after " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
            return bluetoothDevice;
        }
        a.a("no device found");
        throw new DeviceNotFoundException("Did not discover a matching device!");
    }

    /* access modifiers changed from: private */
    public void k() {
        a.d("disconnectAndCloseConnection");
        if (this.f8346m.compareAndSet(true, false) && this.f8343j != null) {
            a.d("gatt.disconnect()");
            this.f8343j.disconnect();
            try {
                a(2000, a.GATT_DISCONNECTED);
                a.d("received GATT_DISCONNECTED");
            } catch (s unused) {
                a.d("did not get GATT_DISCONNECTED in time!");
            }
            try {
                a.d("gatt.close()");
                this.f8343j.close();
            } catch (NullPointerException unused2) {
            }
        }
        m();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:12|13|14|15|16|17|18) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0069 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l() {
        /*
            r7 = this;
            java.lang.String r0 = "received GATT_DISCONNECTED"
            de.baimos.dr r1 = a
            java.lang.String r2 = "waitForDisconnectAndCloseConnection"
            r1.d(r2)
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.f8346m
            r2 = 1
            r3 = 0
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L_0x007d
            android.bluetooth.BluetoothGatt r1 = r7.f8343j
            if (r1 == 0) goto L_0x007d
        L_0x0017:
            java.util.concurrent.LinkedBlockingQueue<de.baimos.p$a> r1 = r7.f8344k
            java.lang.Object r1 = r1.poll()
            de.baimos.p$a r1 = (de.baimos.p.a) r1
            if (r1 == 0) goto L_0x002a
            de.baimos.p$a r4 = de.baimos.p.a.GATT_DISCONNECTED
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x002a
            goto L_0x0017
        L_0x002a:
            de.baimos.p$a r4 = de.baimos.p.a.GATT_DISCONNECTED
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0076
            android.bluetooth.BluetoothGatt r1 = r7.f8343j
            if (r1 == 0) goto L_0x0076
            de.baimos.dr r1 = a
            java.lang.String r4 = "GATT_DISCONNECTED not found yet, waiting for it"
            r1.d(r4)
            r4 = 2000(0x7d0, double:9.88E-321)
            de.baimos.p$a[] r1 = new de.baimos.p.a[r2]     // Catch:{ s -> 0x004e }
            de.baimos.p$a r6 = de.baimos.p.a.GATT_DISCONNECTED     // Catch:{ s -> 0x004e }
            r1[r3] = r6     // Catch:{ s -> 0x004e }
            r7.a((long) r4, (de.baimos.p.a[]) r1)     // Catch:{ s -> 0x004e }
            de.baimos.dr r1 = a     // Catch:{ s -> 0x004e }
            r1.d(r0)     // Catch:{ s -> 0x004e }
            goto L_0x007d
        L_0x004e:
            de.baimos.dr r1 = a     // Catch:{ Exception -> 0x0069 }
            java.lang.String r6 = "we now call disconnect()"
            r1.d(r6)     // Catch:{ Exception -> 0x0069 }
            android.bluetooth.BluetoothGatt r1 = r7.f8343j     // Catch:{ Exception -> 0x0069 }
            r1.disconnect()     // Catch:{ Exception -> 0x0069 }
            de.baimos.p$a[] r1 = new de.baimos.p.a[r2]     // Catch:{ Exception -> 0x0069 }
            de.baimos.p$a r2 = de.baimos.p.a.GATT_DISCONNECTED     // Catch:{ Exception -> 0x0069 }
            r1[r3] = r2     // Catch:{ Exception -> 0x0069 }
            r7.a((long) r4, (de.baimos.p.a[]) r1)     // Catch:{ Exception -> 0x0069 }
            de.baimos.dr r1 = a     // Catch:{ Exception -> 0x0069 }
            r1.d(r0)     // Catch:{ Exception -> 0x0069 }
            goto L_0x007d
        L_0x0069:
            de.baimos.dr r0 = a     // Catch:{ Exception -> 0x007d }
            java.lang.String r1 = "gatt.close()"
            r0.d(r1)     // Catch:{ Exception -> 0x007d }
            android.bluetooth.BluetoothGatt r0 = r7.f8343j     // Catch:{ Exception -> 0x007d }
            r0.close()     // Catch:{ Exception -> 0x007d }
            goto L_0x007d
        L_0x0076:
            de.baimos.dr r0 = a
            java.lang.String r1 = "found GATT_DISCONNECTED"
            r0.d(r1)
        L_0x007d:
            r7.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.baimos.p.l():void");
    }

    /* access modifiers changed from: private */
    public void m() {
        Timer timer = this.u;
        if (timer != null) {
            try {
                timer.cancel();
            } catch (Exception unused) {
            }
        }
        o oVar = this.p;
        if (oVar != null) {
            try {
                oVar.a();
            } catch (Exception unused2) {
            }
        }
    }

    private Timer n() {
        Timer timer = new Timer();
        a.d("start read timeout checker");
        timer.schedule(new TimerTask() {
            public void run() {
                if (p.this.t != -1) {
                    long currentTimeMillis = System.currentTimeMillis();
                    dr d2 = p.a;
                    d2.d("requested read = " + p.this.t + ", diff = " + (currentTimeMillis - p.this.t));
                    if (currentTimeMillis - p.this.t > 10000) {
                        p.a.a("Failed to receive data within time! Please make sure the device is still within reach.");
                        p.this.k();
                    }
                }
            }
        }, 250, 250);
        return timer;
    }

    private void o() {
        a.d("executing reliable write and wait for confirmation");
        if (this.f8343j.executeReliableWrite()) {
            try {
                a(2500, a.RELIABLE_WRITE_DONE);
                a.d("reliable write finished");
            } catch (s e2) {
                throw new RuntimeException("failed to write data reliably", e2);
            }
        } else {
            throw new RuntimeException("failed to execute reliable write");
        }
    }

    private void p() {
        List<BluetoothGattService> services = this.f8343j.getServices();
        if (services == null || services.size() == 0) {
            a.b("no services found!");
            return;
        }
        for (BluetoothGattService next : services) {
            dr drVar = a;
            drVar.d("found service " + next.getUuid());
            List<BluetoothGattCharacteristic> characteristics = next.getCharacteristics();
            if (characteristics == null || characteristics.size() == 0) {
                a.d("   [no characteristics found]");
            } else {
                for (BluetoothGattCharacteristic uuid : characteristics) {
                    dr drVar2 = a;
                    drVar2.d("    -> characteristic " + uuid.getUuid());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public cm a() {
        this.s.startConnectionAttempt();
        this.s.setConnectedByCache(y.a().a(this.f8345l));
        return a(j());
    }

    public void a(long j2) {
    }

    public void a(Channel channel) {
        if (channel instanceof g) {
            this.f8342i = ((g) channel).a();
            y.a().a(this.f8342i);
            this.b = y.a(((BluetoothManager) this.f8342i.getSystemService("bluetooth")).getAdapter());
            return;
        }
        throw new RuntimeException("wrong channel for btle client, expecting btlespp channel");
    }

    public void a(AndroidSdkMetrics androidSdkMetrics) {
        this.s = androidSdkMetrics;
        if (this.y) {
            androidSdkMetrics.addMessage("HUAWEI workaround enabled");
        }
        if (this.x) {
            this.s.addMessage("Cache is disabled.");
        }
    }

    public boolean a(byte[] bArr) {
        try {
            if (this.q) {
                b(30);
            }
            this.f8340g.setValue(bArr);
            if (!this.f8343j.writeCharacteristic(this.f8340g)) {
                a.a("failed to write to output");
                k();
            }
            a.d("waiting for packet to be written");
            a a2 = a(5000, a.PACKET_WRITTEN, a.QUEUE_FULL);
            if (a.QUEUE_FULL.equals(a2)) {
                a.d("queue full!");
                return true;
            }
            if (a.PACKET_WRITTEN.equals(a2)) {
                a.d("packet written!");
            }
            if (this.r) {
                o();
            }
            return false;
        } catch (s e2) {
            throw new IOException("failed to write data", e2);
        } catch (RuntimeException e3) {
            a.a("failed to write data", e3);
            throw new IOException(e3);
        }
    }

    public void b() {
        this.t = System.currentTimeMillis();
    }

    public void c() {
        this.t = -1;
    }
}
