package no.nordicsemi.android.support.v18.scanner;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import no.nordicsemi.android.support.v18.scanner.a;

@TargetApi(21)
/* compiled from: BluetoothLeScannerImplLollipop */
class c extends a {
    private final Map<j, b> b = new HashMap();

    /* compiled from: BluetoothLeScannerImplLollipop */
    static class b extends a.C0788a {
        /* access modifiers changed from: private */
        public final ScanCallback o;

        /* compiled from: BluetoothLeScannerImplLollipop */
        class a extends ScanCallback {
            /* access modifiers changed from: private */
            public long a;

            /* renamed from: no.nordicsemi.android.support.v18.scanner.c$b$a$a  reason: collision with other inner class name */
            /* compiled from: BluetoothLeScannerImplLollipop */
            class C0792a implements Runnable {

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ ScanResult f11209g;

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ int f11210h;

                C0792a(ScanResult scanResult, int i2) {
                    this.f11209g = scanResult;
                    this.f11210h = i2;
                }

                public void run() {
                    b.this.g(this.f11210h, ((c) a.a()).f(this.f11209g));
                }
            }

            /* renamed from: no.nordicsemi.android.support.v18.scanner.c$b$a$b  reason: collision with other inner class name */
            /* compiled from: BluetoothLeScannerImplLollipop */
            class C0793b implements Runnable {

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ List f11212g;

                C0793b(List list) {
                    this.f11212g = list;
                }

                public void run() {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (a.this.a <= (elapsedRealtime - b.this.f11187g.k()) + 5) {
                        long unused = a.this.a = elapsedRealtime;
                        b.this.h(((c) a.a()).g(this.f11212g));
                    }
                }
            }

            /* renamed from: no.nordicsemi.android.support.v18.scanner.c$b$a$c  reason: collision with other inner class name */
            /* compiled from: BluetoothLeScannerImplLollipop */
            class C0794c implements Runnable {

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ int f11214g;

                C0794c(int i2) {
                    this.f11214g = i2;
                }

                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002f */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r5 = this;
                        no.nordicsemi.android.support.v18.scanner.c$b$a r0 = no.nordicsemi.android.support.v18.scanner.c.b.a.this
                        no.nordicsemi.android.support.v18.scanner.c$b r0 = no.nordicsemi.android.support.v18.scanner.c.b.this
                        no.nordicsemi.android.support.v18.scanner.n r0 = r0.f11187g
                        boolean r0 = r0.n()
                        if (r0 == 0) goto L_0x004b
                        no.nordicsemi.android.support.v18.scanner.c$b$a r0 = no.nordicsemi.android.support.v18.scanner.c.b.a.this
                        no.nordicsemi.android.support.v18.scanner.c$b r0 = no.nordicsemi.android.support.v18.scanner.c.b.this
                        no.nordicsemi.android.support.v18.scanner.n r0 = r0.f11187g
                        int r0 = r0.b()
                        r1 = 1
                        if (r0 == r1) goto L_0x004b
                        no.nordicsemi.android.support.v18.scanner.c$b$a r0 = no.nordicsemi.android.support.v18.scanner.c.b.a.this
                        no.nordicsemi.android.support.v18.scanner.c$b r0 = no.nordicsemi.android.support.v18.scanner.c.b.this
                        no.nordicsemi.android.support.v18.scanner.n r0 = r0.f11187g
                        r0.a()
                        no.nordicsemi.android.support.v18.scanner.a r0 = no.nordicsemi.android.support.v18.scanner.a.a()
                        no.nordicsemi.android.support.v18.scanner.c$b$a r1 = no.nordicsemi.android.support.v18.scanner.c.b.a.this     // Catch:{ Exception -> 0x002f }
                        no.nordicsemi.android.support.v18.scanner.c$b r1 = no.nordicsemi.android.support.v18.scanner.c.b.this     // Catch:{ Exception -> 0x002f }
                        no.nordicsemi.android.support.v18.scanner.j r1 = r1.f11188h     // Catch:{ Exception -> 0x002f }
                        r0.d(r1)     // Catch:{ Exception -> 0x002f }
                    L_0x002f:
                        no.nordicsemi.android.support.v18.scanner.c$b$a r1 = no.nordicsemi.android.support.v18.scanner.c.b.a.this     // Catch:{ Exception -> 0x004a }
                        no.nordicsemi.android.support.v18.scanner.c$b r1 = no.nordicsemi.android.support.v18.scanner.c.b.this     // Catch:{ Exception -> 0x004a }
                        java.util.List<no.nordicsemi.android.support.v18.scanner.k> r1 = r1.f11186f     // Catch:{ Exception -> 0x004a }
                        no.nordicsemi.android.support.v18.scanner.c$b$a r2 = no.nordicsemi.android.support.v18.scanner.c.b.a.this     // Catch:{ Exception -> 0x004a }
                        no.nordicsemi.android.support.v18.scanner.c$b r2 = no.nordicsemi.android.support.v18.scanner.c.b.this     // Catch:{ Exception -> 0x004a }
                        no.nordicsemi.android.support.v18.scanner.n r2 = r2.f11187g     // Catch:{ Exception -> 0x004a }
                        no.nordicsemi.android.support.v18.scanner.c$b$a r3 = no.nordicsemi.android.support.v18.scanner.c.b.a.this     // Catch:{ Exception -> 0x004a }
                        no.nordicsemi.android.support.v18.scanner.c$b r3 = no.nordicsemi.android.support.v18.scanner.c.b.this     // Catch:{ Exception -> 0x004a }
                        no.nordicsemi.android.support.v18.scanner.j r3 = r3.f11188h     // Catch:{ Exception -> 0x004a }
                        no.nordicsemi.android.support.v18.scanner.c$b$a r4 = no.nordicsemi.android.support.v18.scanner.c.b.a.this     // Catch:{ Exception -> 0x004a }
                        no.nordicsemi.android.support.v18.scanner.c$b r4 = no.nordicsemi.android.support.v18.scanner.c.b.this     // Catch:{ Exception -> 0x004a }
                        android.os.Handler r4 = r4.f11189i     // Catch:{ Exception -> 0x004a }
                        r0.c(r1, r2, r3, r4)     // Catch:{ Exception -> 0x004a }
                    L_0x004a:
                        return
                    L_0x004b:
                        no.nordicsemi.android.support.v18.scanner.c$b$a r0 = no.nordicsemi.android.support.v18.scanner.c.b.a.this
                        no.nordicsemi.android.support.v18.scanner.c$b r0 = no.nordicsemi.android.support.v18.scanner.c.b.this
                        int r1 = r5.f11214g
                        r0.f(r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: no.nordicsemi.android.support.v18.scanner.c.b.a.C0794c.run():void");
                }
            }

            a() {
            }

            public void onBatchScanResults(List<ScanResult> list) {
                b.this.f11189i.post(new C0793b(list));
            }

            public void onScanFailed(int i2) {
                b.this.f11189i.post(new C0794c(i2));
            }

            public void onScanResult(int i2, ScanResult scanResult) {
                b.this.f11189i.post(new C0792a(scanResult, i2));
            }
        }

        private b(boolean z, boolean z2, List<k> list, n nVar, j jVar, Handler handler) {
            super(z, z2, list, nVar, jVar, handler);
            this.o = new a();
        }
    }

    c() {
    }

    /* access modifiers changed from: package-private */
    public void c(List<k> list, n nVar, j jVar, Handler handler) {
        b bVar;
        j jVar2 = jVar;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        BluetoothLeScanner bluetoothLeScanner = defaultAdapter.getBluetoothLeScanner();
        if (bluetoothLeScanner != null) {
            boolean isOffloadedScanBatchingSupported = defaultAdapter.isOffloadedScanBatchingSupported();
            boolean isOffloadedFilteringSupported = defaultAdapter.isOffloadedFilteringSupported();
            synchronized (this.b) {
                if (!this.b.containsKey(jVar2)) {
                    bVar = new b(isOffloadedScanBatchingSupported, isOffloadedFilteringSupported, list, nVar, jVar, handler);
                    this.b.put(jVar2, bVar);
                } else {
                    throw new IllegalArgumentException("scanner already started with given callback");
                }
            }
            ScanSettings j2 = j(defaultAdapter, nVar, false);
            ArrayList<ScanFilter> arrayList = null;
            if (!list.isEmpty() && isOffloadedFilteringSupported && nVar.o()) {
                arrayList = i(list);
            }
            bluetoothLeScanner.startScan(arrayList, j2, bVar.o);
            return;
        }
        throw new IllegalStateException("BT le scanner not available");
    }

    /* access modifiers changed from: package-private */
    public void e(j jVar) {
        b remove;
        BluetoothLeScanner bluetoothLeScanner;
        synchronized (this.b) {
            remove = this.b.remove(jVar);
        }
        if (remove != null) {
            remove.d();
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null && (bluetoothLeScanner = defaultAdapter.getBluetoothLeScanner()) != null) {
                bluetoothLeScanner.stopScan(remove.o);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public m f(ScanResult scanResult) {
        return new m(scanResult.getDevice(), l.g(scanResult.getScanRecord() != null ? scanResult.getScanRecord().getBytes() : null), scanResult.getRssi(), scanResult.getTimestampNanos());
    }

    /* access modifiers changed from: package-private */
    public ArrayList<m> g(List<ScanResult> list) {
        ArrayList<m> arrayList = new ArrayList<>();
        for (ScanResult f2 : list) {
            arrayList.add(f(f2));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public ScanFilter h(k kVar) {
        ScanFilter.Builder builder = new ScanFilter.Builder();
        builder.setDeviceAddress(kVar.a()).setDeviceName(kVar.b()).setServiceUuid(kVar.i(), kVar.j()).setManufacturerData(kVar.e(), kVar.c(), kVar.d());
        if (kVar.h() != null) {
            builder.setServiceData(kVar.h(), kVar.f(), kVar.g());
        }
        return builder.build();
    }

    /* access modifiers changed from: package-private */
    public ArrayList<ScanFilter> i(List<k> list) {
        ArrayList<ScanFilter> arrayList = new ArrayList<>();
        for (k h2 : list) {
            arrayList.add(h(h2));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public ScanSettings j(BluetoothAdapter bluetoothAdapter, n nVar, boolean z) {
        ScanSettings.Builder builder = new ScanSettings.Builder();
        if (z || (bluetoothAdapter.isOffloadedScanBatchingSupported() && nVar.m())) {
            builder.setReportDelay(nVar.k());
        }
        if (nVar.l() != -1) {
            builder.setScanMode(nVar.l());
        } else {
            builder.setScanMode(0);
        }
        nVar.a();
        return builder.build();
    }
}
