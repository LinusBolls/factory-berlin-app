package no.nordicsemi.android.support.v18.scanner;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import no.nordicsemi.android.support.v18.scanner.a;
import no.nordicsemi.android.support.v18.scanner.k;
import no.nordicsemi.android.support.v18.scanner.n;

@TargetApi(26)
/* compiled from: BluetoothLeScannerImplOreo */
class e extends d {
    private final HashMap<PendingIntent, a> c = new HashMap<>();

    /* compiled from: BluetoothLeScannerImplOreo */
    static class a extends a.C0788a {
        final i o = ((i) this.f11188h);

        a(boolean z, boolean z2, List<k> list, n nVar, PendingIntent pendingIntent) {
            super(z, z2, list, nVar, new i(pendingIntent, nVar), new Handler());
        }
    }

    e() {
    }

    /* access modifiers changed from: package-private */
    public m f(ScanResult scanResult) {
        return new m(scanResult.getDevice(), ((scanResult.getDataStatus() << 5) | (scanResult.isLegacy() ? 16 : 0)) | scanResult.isConnectable() ? 1 : 0, scanResult.getPrimaryPhy(), scanResult.getSecondaryPhy(), scanResult.getAdvertisingSid(), scanResult.getTxPower(), scanResult.getRssi(), scanResult.getPeriodicAdvertisingInterval(), l.g(scanResult.getScanRecord() != null ? scanResult.getScanRecord().getBytes() : null), scanResult.getTimestampNanos());
    }

    /* access modifiers changed from: package-private */
    public ScanSettings j(BluetoothAdapter bluetoothAdapter, n nVar, boolean z) {
        ScanSettings.Builder builder = new ScanSettings.Builder();
        if (z || (bluetoothAdapter.isOffloadedScanBatchingSupported() && nVar.m())) {
            builder.setReportDelay(nVar.k());
        }
        if (z || nVar.n()) {
            builder.setCallbackType(nVar.b()).setMatchMode(nVar.f()).setNumOfMatches(nVar.g());
        }
        builder.setScanMode(nVar.l()).setLegacy(nVar.c()).setPhy(nVar.h());
        return builder.build();
    }

    /* access modifiers changed from: package-private */
    public void k(PendingIntent pendingIntent, a aVar) {
        synchronized (this.c) {
            this.c.put(pendingIntent, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public k l(ScanFilter scanFilter) {
        k.b bVar = new k.b();
        bVar.b(scanFilter.getDeviceAddress());
        bVar.c(scanFilter.getDeviceName());
        bVar.i(scanFilter.getServiceUuid(), scanFilter.getServiceUuidMask());
        bVar.e(scanFilter.getManufacturerId(), scanFilter.getManufacturerData(), scanFilter.getManufacturerDataMask());
        if (scanFilter.getServiceDataUuid() != null) {
            bVar.g(scanFilter.getServiceDataUuid(), scanFilter.getServiceData(), scanFilter.getServiceDataMask());
        }
        return bVar.a();
    }

    /* access modifiers changed from: package-private */
    public ArrayList<k> m(List<ScanFilter> list) {
        ArrayList<k> arrayList = new ArrayList<>();
        for (ScanFilter l2 : list) {
            arrayList.add(l(l2));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public n n(ScanSettings scanSettings, boolean z, boolean z2, boolean z3, long j2, long j3, int i2, int i3) {
        n.b bVar = new n.b();
        bVar.d(scanSettings.getLegacy());
        bVar.h(scanSettings.getPhy());
        bVar.c(scanSettings.getCallbackType());
        bVar.j(scanSettings.getScanMode());
        bVar.i(scanSettings.getReportDelayMillis());
        bVar.k(z);
        bVar.m(z2);
        bVar.l(z3);
        bVar.f(j2, j3);
        bVar.e(i2);
        bVar.g(i3);
        return bVar.a();
    }

    /* access modifiers changed from: package-private */
    public a o(PendingIntent pendingIntent) {
        synchronized (this.c) {
            if (!this.c.containsKey(pendingIntent)) {
                return null;
            }
            a aVar = this.c.get(pendingIntent);
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Scanning has been stopped");
        }
    }
}
