package de.baimos;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanSettings;

@TargetApi(23)
public class w extends v {
    private static final dr b = ds.a(w.class);
    private BluetoothLeScanner c;

    /* renamed from: d  reason: collision with root package name */
    private ScanSettings f8360d;

    public w(BluetoothAdapter bluetoothAdapter, x xVar) {
        super(bluetoothAdapter, xVar);
        ScanSettings.Builder callbackType = new ScanSettings.Builder().setScanMode(2).setMatchMode(1).setCallbackType(2);
        dr drVar = b;
        drVar.d("BLE supports offloaded scan batching: " + bluetoothAdapter.isOffloadedScanBatchingSupported());
        dr drVar2 = b;
        drVar2.d("BLE supports offloaded filtering: " + bluetoothAdapter.isOffloadedFilteringSupported());
        this.f8360d = callbackType.build();
        this.c = bluetoothAdapter.getBluetoothLeScanner();
    }
}
