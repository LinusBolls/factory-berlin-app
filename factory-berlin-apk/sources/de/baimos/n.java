package de.baimos;

import android.bluetooth.BluetoothAdapter;
import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import de.baimos.bx;
import de.baimos.ca;
import java.util.ArrayList;
import java.util.List;

public class n extends i {
    bw b;
    ca c;

    public n(BluetoothAdapter bluetoothAdapter, l lVar, AndroidSdkMetrics androidSdkMetrics) {
        super(bluetoothAdapter, lVar, androidSdkMetrics);
        ca.a aVar = new ca.a();
        aVar.b(1);
        aVar.b(true);
        aVar.c(true);
        aVar.a(true);
        aVar.d(1);
        aVar.c(3);
        aVar.a(2);
        this.c = aVar.a();
    }

    /* access modifiers changed from: protected */
    public void a() {
        bo.a().a(this.b);
    }

    /* access modifiers changed from: protected */
    public void a(final String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new bx.a().a(str).a());
        this.b = new bw() {
            public void a(int i2) {
                n.this.a(i2);
            }

            public void a(int i2, bz bzVar) {
                n.this.a(bzVar.b().b(), bzVar.a(), str);
            }

            public void a(List<bz> list) {
                for (bz next : list) {
                    n.this.a(next.b().b(), next.a(), str);
                }
            }
        };
        bo.a().a(arrayList, this.c, this.b);
    }
}
