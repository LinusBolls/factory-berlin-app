package no.nordicsemi.android.support.v18.scanner;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.ScanSettings;

@TargetApi(23)
/* compiled from: BluetoothLeScannerImplMarshmallow */
class d extends c {
    d() {
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
        builder.setScanMode(nVar.l());
        return builder.build();
    }
}
