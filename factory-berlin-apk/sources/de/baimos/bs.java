package de.baimos;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.ScanSettings;

@TargetApi(23)
class bs extends br {
    bs() {
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
        builder.setScanMode(caVar.a());
        return builder.build();
    }
}
