package de.baimos;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class l {
    private static final dr a = ds.a(l.class);
    private boolean b = false;
    private Map<String, a> c = new ConcurrentHashMap();

    public class a {
        private BluetoothDevice b;
        private long c = System.currentTimeMillis();

        a(BluetoothDevice bluetoothDevice) {
            this.b = bluetoothDevice;
        }

        public BluetoothDevice a() {
            return this.b;
        }

        public long b() {
            return System.currentTimeMillis() - this.c;
        }
    }

    public void a() {
        if (this.b) {
            a.d("clear cache");
            this.c.clear();
        }
    }

    public void a(Context context) {
        if (!this.b && ((BluetoothManager) context.getSystemService("bluetooth")) != null) {
            this.b = true;
        }
    }

    public void a(String str, BluetoothDevice bluetoothDevice) {
        if (str == null) {
            a.d("ignoring device as key is null");
        } else if (!this.b) {
            a.d("cache not initialized");
        } else {
            dr drVar = a;
            drVar.d("add device with key '" + str + "'");
            this.c.put(str, new a(bluetoothDevice));
        }
    }

    public boolean a(String str) {
        boolean z = this.b && this.c.containsKey(str);
        dr drVar = a;
        drVar.d("contains key '" + str + "'? " + z);
        return z;
    }

    public a b(String str) {
        if (!this.b) {
            a.d("cache not initialized");
            return null;
        }
        dr drVar = a;
        drVar.d("get device with key '" + str + "'");
        a aVar = this.c.get(str);
        if (aVar == null) {
            return null;
        }
        a.d("cache hit!");
        return aVar;
    }

    public void c(String str) {
        if (!this.b) {
            a.d("cache not initialized");
            return;
        }
        dr drVar = a;
        drVar.d("remove device with key '" + str + "'");
        this.c.remove(str);
    }
}
