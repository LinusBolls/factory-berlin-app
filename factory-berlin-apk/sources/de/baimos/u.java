package de.baimos;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;

@TargetApi(18)
public class u extends t {
    private BluetoothAdapter.LeScanCallback b;

    public u(BluetoothAdapter bluetoothAdapter, x xVar) {
        super(bluetoothAdapter, xVar);
    }

    /* access modifiers changed from: protected */
    public void a() {
        this.a.stopLeScan(this.b);
    }

    /* access modifiers changed from: protected */
    public void a(final String str) {
        AnonymousClass1 r0 = new BluetoothAdapter.LeScanCallback() {
            public void onLeScan(BluetoothDevice bluetoothDevice, int i2, byte[] bArr) {
                u.this.a(bluetoothDevice.getName(), bluetoothDevice, str);
            }
        };
        this.b = r0;
        if (!this.a.startLeScan(r0)) {
            a(-1);
        }
    }
}
