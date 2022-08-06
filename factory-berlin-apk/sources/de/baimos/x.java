package de.baimos;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class x {
    private static final dr a = ds.a(x.class);
    private boolean b = false;
    private BluetoothAdapter c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, BluetoothDevice> f8361d = new ConcurrentHashMap();

    public void a() {
        if (this.b) {
            a.d("clear cache");
            this.f8361d.clear();
        }
    }

    public void a(Context context) {
        BluetoothManager bluetoothManager;
        if (!this.b && (bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth")) != null) {
            this.c = bluetoothManager.getAdapter();
            this.b = true;
        }
    }

    public void a(String str, BluetoothDevice bluetoothDevice) {
        if (!this.b) {
            a.d("cache not initialized");
            return;
        }
        dr drVar = a;
        drVar.d("add device with key '" + str + "'");
        this.f8361d.put(str, bluetoothDevice);
    }

    public boolean a(String str) {
        boolean z = this.b && this.f8361d.containsKey(str);
        dr drVar = a;
        drVar.d("contains key '" + str + "'? " + z);
        return z;
    }

    public BluetoothDevice b(String str) {
        if (!this.b) {
            a.d("cache not initialized");
            return null;
        }
        dr drVar = a;
        drVar.d("get device with key '" + str + "'");
        BluetoothDevice bluetoothDevice = this.f8361d.get(str);
        if (bluetoothDevice == null) {
            return null;
        }
        a.d("cache hit!");
        return bluetoothDevice;
    }
}
