package g.e.n.c.d.o.n;

import android.bluetooth.BluetoothDevice;
import g.e.n.c.d.a;
import g.e.n.c.d.b;
import g.e.n.c.d.d;
import g.e.n.c.d.o.f;
import no.nordicsemi.android.support.v18.scanner.k;
import no.nordicsemi.android.support.v18.scanner.m;

/* compiled from: MyRenzBleScanMapper.kt */
public final class e extends a {
    private static final k a = d.c.a(f.c.b);
    public static final e b = new e();

    private e() {
    }

    public b a(m mVar, m mVar2, g.e.i.b bVar, a aVar) {
        kotlin.jvm.internal.k.e(mVar, "currentScanResult");
        kotlin.jvm.internal.k.e(aVar, "bleCalibration");
        if (!a.k(mVar)) {
            return null;
        }
        if (bVar == null) {
            bVar = c(1.0f, 2.0f, 1000, 7000);
        }
        g.e.i.b bVar2 = bVar;
        float b2 = b(bVar2, mVar);
        float f2 = b2 * 35.0f;
        BluetoothDevice a2 = mVar.a();
        kotlin.jvm.internal.k.d(a2, "currentScanResult.device");
        String name = a2.getName();
        if (name == null) {
            name = "NoName";
        }
        return new b.c(bVar2, mVar, mVar2, f2, b2, name);
    }
}
