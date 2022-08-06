package de.baimos;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;

@TargetApi(18)
public class j extends i {
    private BluetoothAdapter.LeScanCallback b;

    public j(BluetoothAdapter bluetoothAdapter, l lVar, AndroidSdkMetrics androidSdkMetrics) {
        super(bluetoothAdapter, lVar, androidSdkMetrics);
    }

    /* access modifiers changed from: protected */
    public void a() {
        this.a.stopLeScan(this.b);
    }

    /* access modifiers changed from: protected */
    public void a(final String str) {
        AnonymousClass1 r0 = new BluetoothAdapter.LeScanCallback() {
            public void onLeScan(BluetoothDevice bluetoothDevice, int i2, byte[] bArr) {
                j.this.a(bluetoothDevice.getName(), bluetoothDevice, str);
            }
        };
        this.b = r0;
        if (!this.a.startLeScan(r0)) {
            a(-1);
        }
    }
}
