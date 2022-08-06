package g.e.n.c.d.o;

import android.bluetooth.BluetoothDevice;
import g.e.n.c.d.c;
import g.e.n.c.d.o.n.b;
import g.e.n.c.d.o.n.d;
import g.e.n.c.d.o.n.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import no.nordicsemi.android.support.v18.scanner.m;

/* compiled from: BleScanParserImpl.kt */
public final class c implements b {
    /* access modifiers changed from: private */
    public static final List<b> c = n.i(d.c, g.e.n.c.d.o.n.c.b, e.b);

    /* renamed from: d  reason: collision with root package name */
    public static final a f9997d = new a((DefaultConstructorMarker) null);
    private final List<b> a;
    private final g.e.n.c.d.a b;

    /* compiled from: BleScanParserImpl.kt */
    public static final class a {
        private a() {
        }

        public final List<b> a() {
            return c.c;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public c(List<? extends b> list, g.e.n.c.d.a aVar) {
        k.e(list, "bleScanMappers");
        k.e(aVar, "bleCalibration");
        this.a = list;
        this.b = aVar;
    }

    private final g.e.n.c.d.b c(List<? extends b> list, m mVar, m mVar2, g.e.i.b bVar) {
        for (b a2 : list) {
            g.e.n.c.d.b a3 = a2.a(mVar, mVar2, bVar, this.b);
            if (a3 != null) {
                return a3;
            }
        }
        return null;
    }

    private final g.e.n.c.d.b d(m mVar, g.e.n.c.d.b bVar) {
        g.e.i.b bVar2 = null;
        m c2 = bVar != null ? bVar.c() : null;
        if (bVar != null) {
            bVar2 = bVar.d();
        }
        return c(this.a, mVar, c2, bVar2);
    }

    public List<g.e.n.c.d.b> a(c.b bVar, Map<String, ? extends g.e.n.c.d.b> map) {
        k.e(bVar, "bleScanResult");
        k.e(map, "previousBleScanMap");
        List<m> a2 = bVar.a();
        ArrayList arrayList = new ArrayList();
        for (m mVar : a2) {
            BluetoothDevice a3 = mVar.a();
            k.d(a3, "scanResult.device");
            g.e.n.c.d.b d2 = d(mVar, (g.e.n.c.d.b) map.get(a3.getAddress()));
            if (d2 != null) {
                arrayList.add(d2);
            }
        }
        return arrayList;
    }
}
