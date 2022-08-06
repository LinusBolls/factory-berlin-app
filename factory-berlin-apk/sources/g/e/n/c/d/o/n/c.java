package g.e.n.c.d.o.n;

import android.bluetooth.BluetoothDevice;
import g.e.n.c.d.a;
import g.e.n.c.d.b;
import g.e.n.c.d.d;
import g.e.n.c.d.o.f;
import no.nordicsemi.android.support.v18.scanner.k;
import no.nordicsemi.android.support.v18.scanner.m;

/* compiled from: BlueIdBleScanMapper.kt */
public final class c extends a {
    private static final k a = d.c.a(f.a.b);
    public static final c b = new c();

    private c() {
    }

    public b a(m mVar, m mVar2, g.e.i.b bVar, a aVar) {
        kotlin.jvm.internal.k.e(mVar, "currentScanResult");
        kotlin.jvm.internal.k.e(aVar, "bleCalibration");
        if (!a.k(mVar)) {
            return null;
        }
        BluetoothDevice a2 = mVar.a();
        kotlin.jvm.internal.k.d(a2, "currentScanResult.device");
        String name = a2.getName();
        if (name == null) {
            return null;
        }
        if (name.length() == 0) {
            return null;
        }
        if (bVar == null) {
            bVar = c(1.0f, 2.0f, 500, 7000);
        }
        g.e.i.b bVar2 = bVar;
        float b2 = b(bVar2, mVar);
        return new b.a(bVar2, mVar, mVar2, b2 * 35.0f, b2, name);
    }
}
