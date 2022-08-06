package g.e.n.c.g;

import android.bluetooth.BluetoothDevice;
import kotlin.jvm.internal.k;

/* compiled from: NearbyPostBox.kt */
public final class b {
    private final d a;
    private final BluetoothDevice b;

    public b(d dVar, BluetoothDevice bluetoothDevice) {
        k.e(dVar, "postBox");
        k.e(bluetoothDevice, "bluetoothDevice");
        this.a = dVar;
        this.b = bluetoothDevice;
    }

    public static /* synthetic */ b b(b bVar, d dVar, BluetoothDevice bluetoothDevice, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            dVar = bVar.a;
        }
        if ((i2 & 2) != 0) {
            bluetoothDevice = bVar.b;
        }
        return bVar.a(dVar, bluetoothDevice);
    }

    public final b a(d dVar, BluetoothDevice bluetoothDevice) {
        k.e(dVar, "postBox");
        k.e(bluetoothDevice, "bluetoothDevice");
        return new b(dVar, bluetoothDevice);
    }

    public final BluetoothDevice c() {
        return this.b;
    }

    public final d d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.a(this.a, bVar.a) && k.a(this.b, bVar.b);
    }

    public int hashCode() {
        d dVar = this.a;
        int i2 = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        BluetoothDevice bluetoothDevice = this.b;
        if (bluetoothDevice != null) {
            i2 = bluetoothDevice.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "NearbyPostBox(postBox=" + this.a + ", bluetoothDevice=" + this.b + ")";
    }
}
