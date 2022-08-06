package de.baimos;

import android.bluetooth.BluetoothAdapter;
import android.os.Build;

public class y {
    private static final dr a = ds.a(y.class);
    private static final x b = new x();

    public static t a(BluetoothAdapter bluetoothAdapter) {
        if (!Boolean.getBoolean("de.baimos.blueid.sdk.debug.ble.disableNordicScanner")) {
            a.d("using nordic scanner");
            return new z(bluetoothAdapter, b);
        } else if (Build.VERSION.SDK_INT >= 23 && !Boolean.getBoolean("de.baimos.blueid.sdk.debug.ble.legacyScan")) {
            a.d("using marshmallow scanner");
            return new w(bluetoothAdapter, b);
        } else if (Build.VERSION.SDK_INT < 21 || Boolean.getBoolean("de.baimos.blueid.sdk.debug.ble.legacyScan")) {
            a.d("using legacy scanner");
            return new u(bluetoothAdapter, b);
        } else {
            a.d("using lollipop scanner");
            return new v(bluetoothAdapter, b);
        }
    }

    public static x a() {
        return b;
    }
}
