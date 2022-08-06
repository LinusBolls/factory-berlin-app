package g.e.n.d.z;

import android.bluetooth.BluetoothDevice;
import com.sensorberg.synchronousgatt.c;
import kotlin.jvm.internal.k;

/* compiled from: SynchronousGattFactory.kt */
public final class b {
    public static final b a = new b();

    private b() {
    }

    public final c a(BluetoothDevice bluetoothDevice) {
        k.e(bluetoothDevice, "bluetoothDevice");
        return new c(bluetoothDevice);
    }
}
