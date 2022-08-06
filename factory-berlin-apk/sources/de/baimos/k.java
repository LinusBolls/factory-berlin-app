package de.baimos;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import java.util.ArrayList;
import java.util.List;

@TargetApi(21)
public class k extends i {
    private ScanCallback b;
    private BluetoothLeScanner c;

    /* renamed from: d  reason: collision with root package name */
    private ScanSettings f8336d = new ScanSettings.Builder().setScanMode(2).setReportDelay(0).build();

    public k(BluetoothAdapter bluetoothAdapter, l lVar, AndroidSdkMetrics androidSdkMetrics) {
        super(bluetoothAdapter, lVar, androidSdkMetrics);
        this.c = bluetoothAdapter.getBluetoothLeScanner();
    }

    /* access modifiers changed from: protected */
    public void a() {
        this.c.flushPendingScanResults(this.b);
        this.c.stopScan(this.b);
    }

    /* access modifiers changed from: protected */
    public void a(final String str) {
        ArrayList arrayList = new ArrayList();
        AnonymousClass1 r1 = new ScanCallback() {
            public void onBatchScanResults(List<ScanResult> list) {
                for (ScanResult next : list) {
                    k.this.a(next.getScanRecord().getDeviceName(), next.getDevice(), str);
                }
            }

            public void onScanFailed(int i2) {
                k.this.a(i2);
            }

            public void onScanResult(int i2, ScanResult scanResult) {
                k.this.a(scanResult.getScanRecord().getDeviceName(), scanResult.getDevice(), str);
            }
        };
        this.b = r1;
        this.c.startScan(arrayList, this.f8336d, r1);
    }
}
