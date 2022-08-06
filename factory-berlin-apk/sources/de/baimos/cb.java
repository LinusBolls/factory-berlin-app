package de.baimos;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import java.util.HashMap;

@TargetApi(26)
class cb extends bs {
    private final HashMap<PendingIntent, Object> a = new HashMap<>();

    cb() {
    }

    /* access modifiers changed from: package-private */
    public ScanSettings a(BluetoothAdapter bluetoothAdapter, ca caVar, boolean z) {
        ScanSettings.Builder builder = new ScanSettings.Builder();
        if (z || (bluetoothAdapter.isOffloadedScanBatchingSupported() && caVar.f())) {
            builder.setReportDelay(caVar.k());
        }
        if (z || caVar.g()) {
            builder.setCallbackType(caVar.b()).setMatchMode(caVar.c()).setNumOfMatches(caVar.d());
        }
        builder.setScanMode(caVar.a()).setLegacy(caVar.o()).setPhy(caVar.p());
        return builder.build();
    }

    /* access modifiers changed from: package-private */
    public bz a(ScanResult scanResult) {
        return new bz(scanResult.getDevice(), ((scanResult.getDataStatus() << 5) | (scanResult.isLegacy() ? 16 : 0)) | scanResult.isConnectable() ? 1 : 0, scanResult.getPrimaryPhy(), scanResult.getSecondaryPhy(), scanResult.getAdvertisingSid(), scanResult.getTxPower(), scanResult.getRssi(), scanResult.getPeriodicAdvertisingInterval(), by.a(scanResult.getScanRecord() != null ? scanResult.getScanRecord().getBytes() : null), scanResult.getTimestampNanos());
    }
}
