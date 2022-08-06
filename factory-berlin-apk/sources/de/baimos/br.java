package de.baimos;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.os.Handler;
import android.os.SystemClock;
import de.baimos.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@TargetApi(21)
class br extends bo {
    private final Map<bw, a> a = new HashMap();

    static class a extends bo.a {
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final ScanCallback f8259e;

        private a(boolean z, boolean z2, List<bx> list, ca caVar, bw bwVar, Handler handler) {
            super(z, z2, list, caVar, bwVar, handler);
            this.f8259e = new ScanCallback() {
                /* access modifiers changed from: private */
                public long b;

                public void onBatchScanResults(final List<ScanResult> list) {
                    a.this.f8243d.post(new Runnable() {
                        public void run() {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (AnonymousClass1.this.b <= (elapsedRealtime - a.this.b.k()) + 5) {
                                long unused = AnonymousClass1.this.b = elapsedRealtime;
                                a.this.a((List<bz>) ((br) bo.a()).b((List<ScanResult>) list));
                            }
                        }
                    });
                }

                public void onScanFailed(final int i2) {
                    a.this.f8243d.post(new Runnable() {
                        /* JADX WARNING: Failed to process nested try/catch */
                        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002f */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public void run() {
                            /*
                                r5 = this;
                                de.baimos.br$a$1 r0 = de.baimos.br.a.AnonymousClass1.this
                                de.baimos.br$a r0 = de.baimos.br.a.this
                                de.baimos.ca r0 = r0.b
                                boolean r0 = r0.g()
                                if (r0 == 0) goto L_0x004b
                                de.baimos.br$a$1 r0 = de.baimos.br.a.AnonymousClass1.this
                                de.baimos.br$a r0 = de.baimos.br.a.this
                                de.baimos.ca r0 = r0.b
                                int r0 = r0.b()
                                r1 = 1
                                if (r0 == r1) goto L_0x004b
                                de.baimos.br$a$1 r0 = de.baimos.br.a.AnonymousClass1.this
                                de.baimos.br$a r0 = de.baimos.br.a.this
                                de.baimos.ca r0 = r0.b
                                r0.h()
                                de.baimos.bo r0 = de.baimos.bo.a()
                                de.baimos.br$a$1 r1 = de.baimos.br.a.AnonymousClass1.this     // Catch:{ Exception -> 0x002f }
                                de.baimos.br$a r1 = de.baimos.br.a.this     // Catch:{ Exception -> 0x002f }
                                de.baimos.bw r1 = r1.c     // Catch:{ Exception -> 0x002f }
                                r0.a(r1)     // Catch:{ Exception -> 0x002f }
                            L_0x002f:
                                de.baimos.br$a$1 r1 = de.baimos.br.a.AnonymousClass1.this     // Catch:{ Exception -> 0x004a }
                                de.baimos.br$a r1 = de.baimos.br.a.this     // Catch:{ Exception -> 0x004a }
                                java.util.List<de.baimos.bx> r1 = r1.a     // Catch:{ Exception -> 0x004a }
                                de.baimos.br$a$1 r2 = de.baimos.br.a.AnonymousClass1.this     // Catch:{ Exception -> 0x004a }
                                de.baimos.br$a r2 = de.baimos.br.a.this     // Catch:{ Exception -> 0x004a }
                                de.baimos.ca r2 = r2.b     // Catch:{ Exception -> 0x004a }
                                de.baimos.br$a$1 r3 = de.baimos.br.a.AnonymousClass1.this     // Catch:{ Exception -> 0x004a }
                                de.baimos.br$a r3 = de.baimos.br.a.this     // Catch:{ Exception -> 0x004a }
                                de.baimos.bw r3 = r3.c     // Catch:{ Exception -> 0x004a }
                                de.baimos.br$a$1 r4 = de.baimos.br.a.AnonymousClass1.this     // Catch:{ Exception -> 0x004a }
                                de.baimos.br$a r4 = de.baimos.br.a.this     // Catch:{ Exception -> 0x004a }
                                android.os.Handler r4 = r4.f8243d     // Catch:{ Exception -> 0x004a }
                                r0.a(r1, r2, r3, r4)     // Catch:{ Exception -> 0x004a }
                            L_0x004a:
                                return
                            L_0x004b:
                                de.baimos.br$a$1 r0 = de.baimos.br.a.AnonymousClass1.this
                                de.baimos.br$a r0 = de.baimos.br.a.this
                                int r1 = r3
                                r0.a((int) r1)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: de.baimos.br.a.AnonymousClass1.AnonymousClass3.run():void");
                        }
                    });
                }

                public void onScanResult(final int i2, final ScanResult scanResult) {
                    a.this.f8243d.post(new Runnable() {
                        public void run() {
                            a.this.a(i2, ((br) bo.a()).a(scanResult));
                        }
                    });
                }
            };
        }
    }

    br() {
    }

    /* access modifiers changed from: package-private */
    public ScanFilter a(bx bxVar) {
        ScanFilter.Builder builder = new ScanFilter.Builder();
        builder.setDeviceAddress(bxVar.d()).setDeviceName(bxVar.a()).setServiceUuid(bxVar.b(), bxVar.c()).setManufacturerData(bxVar.h(), bxVar.i(), bxVar.j());
        if (bxVar.g() != null) {
            builder.setServiceData(bxVar.g(), bxVar.e(), bxVar.f());
        }
        return builder.build();
    }

    /* access modifiers changed from: package-private */
    public ScanSettings a(BluetoothAdapter bluetoothAdapter, ca caVar, boolean z) {
        ScanSettings.Builder builder = new ScanSettings.Builder();
        if (z || (bluetoothAdapter.isOffloadedScanBatchingSupported() && caVar.f())) {
            builder.setReportDelay(caVar.k());
        }
        builder.setScanMode(caVar.a() != -1 ? caVar.a() : 0);
        caVar.h();
        return builder.build();
    }

    /* access modifiers changed from: package-private */
    public bz a(ScanResult scanResult) {
        return new bz(scanResult.getDevice(), by.a(scanResult.getScanRecord() != null ? scanResult.getScanRecord().getBytes() : null), scanResult.getRssi(), scanResult.getTimestampNanos());
    }

    /* access modifiers changed from: package-private */
    public ArrayList<ScanFilter> a(List<bx> list) {
        ArrayList<ScanFilter> arrayList = new ArrayList<>();
        for (bx a2 : list) {
            arrayList.add(a(a2));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public void a(List<bx> list, ca caVar, bw bwVar, Handler handler) {
        a aVar;
        bw bwVar2 = bwVar;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        BluetoothLeScanner bluetoothLeScanner = defaultAdapter.getBluetoothLeScanner();
        if (bluetoothLeScanner != null) {
            boolean isOffloadedScanBatchingSupported = defaultAdapter.isOffloadedScanBatchingSupported();
            boolean isOffloadedFilteringSupported = defaultAdapter.isOffloadedFilteringSupported();
            synchronized (this.a) {
                if (!this.a.containsKey(bwVar2)) {
                    aVar = new a(isOffloadedScanBatchingSupported, isOffloadedFilteringSupported, list, caVar, bwVar, handler);
                    this.a.put(bwVar2, aVar);
                } else {
                    throw new IllegalArgumentException("scanner already started with given callback");
                }
            }
            ScanSettings a2 = a(defaultAdapter, caVar, false);
            ArrayList<ScanFilter> arrayList = null;
            if (!list.isEmpty() && isOffloadedFilteringSupported && caVar.e()) {
                arrayList = a(list);
            }
            bluetoothLeScanner.startScan(arrayList, a2, aVar.f8259e);
            return;
        }
        throw new IllegalStateException("BT le scanner not available");
    }

    /* access modifiers changed from: package-private */
    public ArrayList<bz> b(List<ScanResult> list) {
        ArrayList<bz> arrayList = new ArrayList<>();
        for (ScanResult a2 : list) {
            arrayList.add(a(a2));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public void b(bw bwVar) {
        a remove;
        BluetoothLeScanner bluetoothLeScanner;
        synchronized (this.a) {
            remove = this.a.remove(bwVar);
        }
        if (remove != null) {
            remove.a();
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null && (bluetoothLeScanner = defaultAdapter.getBluetoothLeScanner()) != null) {
                bluetoothLeScanner.stopScan(remove.f8259e);
            }
        }
    }
}
