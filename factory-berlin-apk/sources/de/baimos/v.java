package de.baimos;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import java.util.List;

@TargetApi(21)
public class v extends t {
    /* access modifiers changed from: private */
    public static final dr b = ds.a(v.class);
    private ScanCallback c;

    /* renamed from: d  reason: collision with root package name */
    private BluetoothLeScanner f8358d;

    /* renamed from: e  reason: collision with root package name */
    private ScanSettings f8359e;

    public v(BluetoothAdapter bluetoothAdapter, x xVar) {
        super(bluetoothAdapter, xVar);
        ScanSettings.Builder scanMode = new ScanSettings.Builder().setScanMode(2);
        dr drVar = b;
        drVar.d("BLE supports offloaded scan batching: " + bluetoothAdapter.isOffloadedScanBatchingSupported());
        dr drVar2 = b;
        drVar2.d("BLE supports offloaded filtering: " + bluetoothAdapter.isOffloadedFilteringSupported());
        this.f8359e = scanMode.build();
        this.f8358d = bluetoothAdapter.getBluetoothLeScanner();
    }

    /* access modifiers changed from: protected */
    public void a() {
        this.f8358d.flushPendingScanResults(this.c);
        this.f8358d.stopScan(this.c);
    }

    /* access modifiers changed from: protected */
    public void a(final String str) {
        AnonymousClass1 r0 = new ScanCallback() {
            public void onBatchScanResults(List<ScanResult> list) {
                dr c = v.b;
                c.d("got batch scan results: " + list.size());
                for (ScanResult next : list) {
                    v.this.a(next.getScanRecord().getDeviceName(), next.getDevice(), str);
                }
            }

            public void onScanFailed(int i2) {
                v.this.a(i2);
            }

            public void onScanResult(int i2, ScanResult scanResult) {
                v.this.a(scanResult.getScanRecord().getDeviceName(), scanResult.getDevice(), str);
            }
        };
        this.c = r0;
        this.f8358d.startScan((List) null, this.f8359e, r0);
    }
}
