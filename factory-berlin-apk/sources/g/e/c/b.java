package g.e.c;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;

/* compiled from: BluetoothUtils.kt */
public final class b {
    @SuppressLint({"MissingPermission"})
    public static final boolean a() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }
}
