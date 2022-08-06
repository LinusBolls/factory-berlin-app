package com.renz.myrenzbox.ble;

import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.zip.CRC32;

public class BLEService extends Service {

    /* renamed from: g  reason: collision with root package name */
    private final IBinder f4784g = new g();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public b f4785h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public Handler f4786i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public g.d.a.c.a f4787j;

    /* renamed from: k  reason: collision with root package name */
    private BluetoothAdapter f4788k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public BluetoothGatt f4789l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public BluetoothGattCharacteristic f4790m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public BLEEncryption f4791n;
    /* access modifiers changed from: private */
    public ArrayList<BluetoothDevice> o = new ArrayList<>();
    /* access modifiers changed from: private */
    public ArrayList<BluetoothDevice> p = new ArrayList<>();
    /* access modifiers changed from: private */
    public ArrayList<g.d.a.c.a> q = new ArrayList<>();
    private c r;
    private boolean s = false;
    private boolean t = false;
    private boolean u = true;
    /* access modifiers changed from: private */
    public boolean v = true;
    /* access modifiers changed from: private */
    public g.d.a.c.a w;
    private final BroadcastReceiver x = new e();
    /* access modifiers changed from: private */
    public final BluetoothGattCallback y = new f();

    class a implements BluetoothAdapter.LeScanCallback {
        a() {
        }

        public final void onLeScan(BluetoothDevice bluetoothDevice, int i2, byte[] bArr) {
            BLEService.f(BLEService.this, bluetoothDevice);
        }
    }

    class b extends ScanCallback {
        b() {
        }

        public final void onBatchScanResults(List<ScanResult> list) {
            super.onBatchScanResults(list);
        }

        public final void onScanFailed(int i2) {
            super.onScanFailed(i2);
        }

        public final void onScanResult(int i2, ScanResult scanResult) {
            super.onScanResult(i2, scanResult);
            BLEService.f(BLEService.this, scanResult.getDevice());
        }
    }

    class c implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ BLEService f4792g;

        c(BLEService bLEService) {
            this.f4792g = bLEService;
        }

        public final void run() {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) BLEService.this.o.get(0);
            Log.d("PKABLE", "mLeMaybeTryNextDevice: Try device: " + bluetoothDevice.getAddress());
            BLEService bLEService = BLEService.this;
            BluetoothGatt unused = bLEService.f4789l = bluetoothDevice.connectGatt(this.f4792g, false, bLEService.y);
        }
    }

    class d implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ BluetoothDevice f4794g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ BLEService f4795h;

        d(BluetoothDevice bluetoothDevice, BLEService bLEService) {
            this.f4794g = bluetoothDevice;
            this.f4795h = bLEService;
        }

        public final void run() {
            Log.d("PKABLE", "manualConnectBLEDevice: " + this.f4794g.getAddress());
            BLEService bLEService = BLEService.this;
            BluetoothGatt unused = bLEService.f4789l = this.f4794g.connectGatt(this.f4795h, false, bLEService.y);
        }
    }

    class e extends BroadcastReceiver {
        e() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", RecyclerView.UNDEFINED_DURATION);
                if (intExtra == 10) {
                    BLEService.this.w(false);
                    BLEService.i(BLEService.this);
                } else if (intExtra == 12) {
                    BLEService.this.w(true);
                    BLEService.i(BLEService.this);
                }
            }
        }
    }

    class f extends BluetoothGattCallback {
        private int a = 0;

        class a implements Runnable {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ BluetoothGatt f4797g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ BluetoothGattCharacteristic f4798h;

            a(f fVar, BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                this.f4797g = bluetoothGatt;
                this.f4798h = bluetoothGattCharacteristic;
            }

            public final void run() {
                this.f4797g.readCharacteristic(this.f4798h);
            }
        }

        class b implements Runnable {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ BluetoothGatt f4799g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ BluetoothGattCharacteristic f4800h;

            b(f fVar, BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                this.f4799g = bluetoothGatt;
                this.f4800h = bluetoothGattCharacteristic;
            }

            public final void run() {
                this.f4799g.readCharacteristic(this.f4800h);
            }
        }

        class c implements Runnable {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ BluetoothGatt f4801g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ BluetoothGattCharacteristic f4802h;

            c(f fVar, BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                this.f4801g = bluetoothGatt;
                this.f4802h = bluetoothGattCharacteristic;
            }

            public final void run() {
                this.f4801g.readCharacteristic(this.f4802h);
            }
        }

        f() {
        }

        private void a(BluetoothGatt bluetoothGatt) {
            Log.d("PKABLE", "disconnect: " + bluetoothGatt.getDevice().getAddress());
            BluetoothGattCharacteristic unused = BLEService.this.f4790m = null;
            bluetoothGatt.close();
            if (BLEService.this.f4787j != null && bluetoothGatt.getDevice().getAddress().equals(BLEService.this.f4787j.a())) {
                BLEService.this.B((g.d.a.c.a) null);
            }
            BluetoothGatt unused2 = BLEService.this.f4789l = null;
            BLEService.this.o.remove(bluetoothGatt.getDevice());
            BLEService.this.p.add(bluetoothGatt.getDevice());
            BLEService.this.e();
        }

        public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            StringBuilder sb;
            String[] split = bluetoothGattCharacteristic.getStringValue(0).split("\\|");
            if (BLEService.this.f4787j != null) {
                BLEService.this.C(BLEService.c(split[1]));
            } else {
                g.d.a.c.a aVar = new g.d.a.c.a(bluetoothGatt.getDevice().getAddress(), split[0], BLEService.c(split[1]), bluetoothGatt.getDevice());
                Log.d("PKABLE", "onCharacteristicChanged: Device created: " + aVar.b());
                if (aVar.d().booleanValue()) {
                    if (BLEService.this.v) {
                        sb = new StringBuilder("onCharacteristicChanged: Auto-connect: CurrentPKA: ");
                    } else {
                        if (!BLEService.this.q.contains(aVar)) {
                            Log.d("PKABLE", "onCharacteristicChanged: Manual-connect: Adding to mDevicesUseable: " + aVar.b());
                            BLEService.this.q.add(aVar);
                        }
                        if (BLEService.this.w == null || !BLEService.this.w.equals(aVar)) {
                            Log.d("PKABLE", "onCharacteristicChanged: Manual-connect: Disconnecting: " + aVar.b());
                        } else {
                            sb = new StringBuilder("onCharacteristicChanged: Manual-connect: CurrentPKA: ");
                        }
                    }
                    sb.append(aVar.b());
                    Log.d("PKABLE", sb.toString());
                    BLEService.this.B(aVar);
                }
                a(bluetoothGatt);
            }
            BLEService.this.f4791n.f(split[2]);
        }

        public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) {
            if (i2 == 0 && bluetoothGattCharacteristic.getUuid().equals(UUID.fromString(a.c))) {
                String stringValue = bluetoothGattCharacteristic.getStringValue(0);
                if (!stringValue.contains(a.f4804e)) {
                    BLEService.this.f4786i.postDelayed(new b(this, bluetoothGatt, bluetoothGattCharacteristic), 100);
                    return;
                }
                boolean z = true;
                try {
                    byte[] c2 = BLEService.this.f4791n.c(stringValue.substring(0, stringValue.indexOf(a.f4804e)));
                    if (c2 == null || c2.length == 0) {
                        throw new Exception("");
                    }
                    int b2 = g.d.a.a.a.b(Arrays.copyOfRange(c2, 0, 4));
                    byte[] copyOfRange = Arrays.copyOfRange(c2, 4, c2.length);
                    CRC32 crc32 = new CRC32();
                    crc32.update(copyOfRange);
                    if (b2 != ((int) crc32.getValue())) {
                        BLEService.this.f4785h.f(g.d.a.b.c.PKARequestResponseError);
                        return;
                    }
                    short c3 = g.d.a.a.a.c(Arrays.copyOfRange(c2, 4, 6));
                    short c4 = g.d.a.a.a.c(Arrays.copyOfRange(c2, 6, 8));
                    if (c3 == g.d.a.b.a.c) {
                        if (c4 == g.d.a.b.a.f9696f) {
                            BLEService.this.f4785h.g(g.d.a.b.c.PKARequestResponseOK);
                        } else {
                            BLEService.this.f4785h.g(g.d.a.b.c.PKARequestResponseError);
                        }
                    } else if (c3 == g.d.a.b.a.f9694d) {
                        short c5 = g.d.a.a.a.c(Arrays.copyOfRange(c2, 8, 10));
                        boolean z2 = c2[10] != 0;
                        if (c2[11] == 0) {
                            z = false;
                        }
                        if (c4 == g.d.a.b.a.f9696f) {
                            BLEService.this.f4785h.e(g.d.a.b.c.PKARequestResponseOK, c5, z2, z);
                        } else {
                            BLEService.this.f4785h.e(g.d.a.b.c.PKARequestResponseError, 0, false, false);
                        }
                    } else if (c3 == g.d.a.b.a.f9695e) {
                        byte[] copyOfRange2 = Arrays.copyOfRange(c2, 8, c2.length);
                        if (c4 == g.d.a.b.a.f9696f) {
                            BLEService.this.f4785h.b(g.d.a.b.c.PKARequestResponseOK, copyOfRange2);
                        } else {
                            BLEService.this.f4785h.b(g.d.a.b.c.PKARequestResponseError, (byte[]) null);
                        }
                    }
                } catch (Exception unused) {
                    int i3 = this.a;
                    if (i3 <= 3) {
                        this.a = i3 + 1;
                        BLEService.this.f4786i.postDelayed(new c(this, bluetoothGatt, bluetoothGattCharacteristic), 100);
                        return;
                    }
                    this.a = 0;
                    BLEService.this.f4785h.f(g.d.a.b.c.PKARequestResponseError);
                }
            }
        }

        public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) {
            if (i2 == 0 && bluetoothGattCharacteristic.getUuid().equals(UUID.fromString(a.c))) {
                BLEService.this.f4786i.postDelayed(new a(this, bluetoothGatt, bluetoothGattCharacteristic), 500);
            }
        }

        public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i2, int i3) {
            if (i3 == 2) {
                bluetoothGatt.discoverServices();
            } else {
                a(bluetoothGatt);
            }
        }

        public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i2) {
            String str;
            if (i2 == 0) {
                BluetoothGattService service = bluetoothGatt.getService(UUID.fromString(a.a));
                if (service != null) {
                    BluetoothGattCharacteristic characteristic = service.getCharacteristic(UUID.fromString(a.b));
                    if (characteristic == null) {
                        str = "onServicesDiscovered: No PKA Characteristic: Disconnecting";
                    } else if (bluetoothGatt.setCharacteristicNotification(characteristic, true)) {
                        BluetoothGattDescriptor bluetoothGattDescriptor = characteristic.getDescriptors().get(0);
                        bluetoothGattDescriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                        bluetoothGatt.writeDescriptor(bluetoothGattDescriptor);
                        BluetoothGattCharacteristic unused = BLEService.this.f4790m = service.getCharacteristic(UUID.fromString(a.c));
                        return;
                    } else {
                        str = "onServicesDiscovered: No Notification possible: Disconnecting";
                    }
                    Log.d("PKABLE", str);
                    a(bluetoothGatt);
                    BluetoothGattCharacteristic unused2 = BLEService.this.f4790m = service.getCharacteristic(UUID.fromString(a.c));
                    return;
                }
                Log.d("PKABLE", "onServicesDiscovered: No PKA Service: Disconnecting");
                a(bluetoothGatt);
            }
        }
    }

    public class g extends Binder {
        public g() {
        }

        public BLEService a() {
            return BLEService.this;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ g.d.a.c.b c(java.lang.String r4) {
        /*
            g.d.a.c.b r0 = g.d.a.c.b.PKADeviceStatusUnknown
            int r1 = r4.hashCode()
            r2 = 2
            r3 = 1
            switch(r1) {
                case 49: goto L_0x0020;
                case 50: goto L_0x0016;
                case 51: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x002a
        L_0x000c:
            java.lang.String r1 = "3"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x002a
            r4 = 2
            goto L_0x002b
        L_0x0016:
            java.lang.String r1 = "2"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x002a
            r4 = 1
            goto L_0x002b
        L_0x0020:
            java.lang.String r1 = "1"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x002a
            r4 = 0
            goto L_0x002b
        L_0x002a:
            r4 = -1
        L_0x002b:
            if (r4 == 0) goto L_0x0038
            if (r4 == r3) goto L_0x0035
            if (r4 == r2) goto L_0x0032
            goto L_0x003a
        L_0x0032:
            g.d.a.c.b r0 = g.d.a.c.b.PKADeviceStatusError
            goto L_0x003a
        L_0x0035:
            g.d.a.c.b r0 = g.d.a.c.b.PKADeviceStatusBlocked
            goto L_0x003a
        L_0x0038:
            g.d.a.c.b r0 = g.d.a.c.b.PKADeviceStatusReady
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.renz.myrenzbox.ble.BLEService.c(java.lang.String):g.d.a.c.b");
    }

    /* access modifiers changed from: private */
    public void e() {
        if (this.f4789l == null && !this.o.isEmpty()) {
            B((g.d.a.c.a) null);
            new Handler(Looper.getMainLooper()).post(new c(this));
        }
    }

    static /* synthetic */ void f(BLEService bLEService, BluetoothDevice bluetoothDevice) {
        String name;
        if (bLEService.s && (name = bluetoothDevice.getName()) != null && name.equals(a.f4805f) && !bLEService.o.contains(bluetoothDevice) && !bLEService.p.contains(bluetoothDevice)) {
            Log.d("PKABLE", "scanFoundDevice: Found new device: " + bluetoothDevice.getAddress() + " / " + name);
            bLEService.o.add(bluetoothDevice);
            if (bLEService.o.size() == 1) {
                bLEService.e();
            }
        }
    }

    private void g(byte[] bArr) {
        String d2;
        if (this.f4790m != null && (d2 = this.f4791n.d(bArr)) != null) {
            this.f4790m.setWriteType(2);
            this.f4790m.setValue(d2 + a.f4803d);
            this.f4789l.writeCharacteristic(this.f4790m);
        }
    }

    static /* synthetic */ void i(BLEService bLEService) {
        BluetoothManager bluetoothManager = (BluetoothManager) bLEService.getSystemService("bluetooth");
        if (bluetoothManager != null && bLEService.f4788k == null) {
            bLEService.f4788k = bluetoothManager.getAdapter();
        }
        BluetoothAdapter bluetoothAdapter = bLEService.f4788k;
        bLEService.z((bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) ? (Build.VERSION.SDK_INT < 23 || androidx.core.content.a.a(bLEService, "android.permission.ACCESS_COARSE_LOCATION") == 0) ? c.BLEStatusInactive : c.BLEStatusNoPermissions : c.BLEStatusActive);
    }

    public void A(b bVar) {
        this.f4785h = bVar;
    }

    public void B(g.d.a.c.a aVar) {
        String str;
        b bVar;
        if (aVar == null) {
            str = "setCurrentPKA null";
        } else {
            str = "setCurrentPKA " + aVar.b();
        }
        Log.d("PKABLE", str);
        if (this.f4787j != null || aVar != null) {
            boolean z = true;
            if ((this.f4787j != null || aVar == null) && this.f4787j.equals(aVar)) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            this.f4787j = aVar;
            if (valueOf.booleanValue() && (bVar = this.f4785h) != null) {
                bVar.a(this.f4787j);
            }
        }
    }

    public void C(g.d.a.c.b bVar) {
        g.d.a.c.a aVar = this.f4787j;
        if (aVar != null && aVar.c() != bVar) {
            this.f4787j.e(bVar);
            this.f4785h.c(this.f4787j);
        }
    }

    public void k() {
        if (this.f4787j == null || this.f4790m == null) {
            this.f4785h.e(g.d.a.b.c.PKARequestResponseError, 0, false, false);
        } else {
            g(new g.d.a.b.b((String) g.d.a.d.d().getAll().get("token")).e());
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f4784g;
    }

    public void onCreate() {
        Log.d("PKABLE", "onCreate");
        this.f4791n = new BLEEncryption();
        this.f4786i = new Handler();
        registerReceiver(this.x, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        super.onCreate();
    }

    public void onDestroy() {
        Log.d("PKABLE", "onDestroy");
        unregisterReceiver(this.x);
        super.onDestroy();
    }

    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    public void q() {
        c cVar;
        Log.d("PKABLE", "initBLE");
        if (Build.VERSION.SDK_INT < 23 || androidx.core.content.a.a(this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            BluetoothManager bluetoothManager = (BluetoothManager) getSystemService("bluetooth");
            if (bluetoothManager != null && this.f4788k == null) {
                this.f4788k = bluetoothManager.getAdapter();
            }
            BluetoothAdapter bluetoothAdapter = this.f4788k;
            if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
                cVar = c.BLEStatusInactive;
            } else if (this.u) {
                z(c.BLEStatusActive);
                w(true);
                return;
            } else {
                return;
            }
        } else {
            cVar = c.BLEStatusNoPermissions;
        }
        z(cVar);
    }

    public void u(BluetoothDevice bluetoothDevice) {
        this.w = null;
        new Handler(Looper.getMainLooper()).post(new d(bluetoothDevice, this));
    }

    public void v() {
        BluetoothGatt bluetoothGatt = this.f4789l;
        if (bluetoothGatt != null) {
            bluetoothGatt.disconnect();
        }
    }

    public void w(boolean z) {
        Log.d("PKABLE", z ? "scanLeDevice start" : "scanLeDevice stop");
        if (this.f4788k != null) {
            this.s = z;
            if (Build.VERSION.SDK_INT >= 21) {
                b bVar = new b();
                BluetoothLeScanner bluetoothLeScanner = this.f4788k.getBluetoothLeScanner();
                if (bluetoothLeScanner != null) {
                    if (!z) {
                        bluetoothLeScanner.stopScan(bVar);
                        bluetoothLeScanner.flushPendingScanResults(bVar);
                    } else if (this.t) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new ScanFilter.Builder().setDeviceName(a.f4805f).build());
                        bluetoothLeScanner.startScan(arrayList, new ScanSettings.Builder().setScanMode(2).build(), bVar);
                    } else {
                        bluetoothLeScanner.startScan(bVar);
                    }
                }
            } else {
                a aVar = new a();
                BluetoothAdapter bluetoothAdapter = this.f4788k;
                if (z) {
                    bluetoothAdapter.startLeScan(aVar);
                } else {
                    bluetoothAdapter.stopLeScan(aVar);
                }
            }
            if (!z) {
                this.o.clear();
                this.p.clear();
                this.q.clear();
                this.w = null;
                this.f4790m = null;
                BluetoothGatt bluetoothGatt = this.f4789l;
                if (bluetoothGatt != null) {
                    bluetoothGatt.close();
                }
                this.f4789l = null;
                B((g.d.a.c.a) null);
            }
        }
    }

    public void x(boolean z) {
        this.v = z;
    }

    public void y(boolean z) {
        this.u = z;
    }

    public void z(c cVar) {
        b bVar;
        Boolean valueOf = Boolean.valueOf(this.r != cVar);
        this.r = cVar;
        if (valueOf.booleanValue() && (bVar = this.f4785h) != null) {
            bVar.d(this.r);
        }
    }
}
