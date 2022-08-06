package de.baimos;

import android.bluetooth.BluetoothAdapter;
import android.os.Build;
import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;

public class m {
    private static final dr a = ds.a(m.class);
    private static final l b = new l();

    public static i a(BluetoothAdapter bluetoothAdapter, AndroidSdkMetrics androidSdkMetrics) {
        if (!Boolean.getBoolean("de.baimos.blueid.sdk.debug.ble.disableNordicScanner")) {
            return new n(bluetoothAdapter, b, androidSdkMetrics);
        }
        if (Build.VERSION.SDK_INT < 21 || Boolean.getBoolean("de.baimos.blueid.sdk.debug.ble.legacyScan")) {
            a.d("using legacy scanner");
            return new j(bluetoothAdapter, b, androidSdkMetrics);
        }
        a.d("using lollipop scanner");
        return new k(bluetoothAdapter, b, androidSdkMetrics);
    }

    public static l a() {
        return b;
    }
}
