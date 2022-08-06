package g.e.n.c.d.o.n;

import g.e.n.c.d.a;
import g.e.n.c.d.b;
import g.e.n.c.d.o.f;
import java.nio.ByteBuffer;
import java.util.UUID;
import no.nordicsemi.android.support.v18.scanner.k;
import no.nordicsemi.android.support.v18.scanner.l;
import no.nordicsemi.android.support.v18.scanner.m;

/* compiled from: GatewayBleScanMapper.kt */
public final class d extends a {
    private static final k a = g.e.n.c.d.d.c.a(f.b.b);
    private static final ByteBuffer b;
    public static final d c = new d();

    static {
        ByteBuffer allocate = ByteBuffer.allocate(16);
        kotlin.jvm.internal.k.d(allocate, "ByteBuffer.allocate(BYTE_BUFFER_CAPACITY)");
        b = allocate;
    }

    private d() {
    }

    private final String d(byte[] bArr) {
        String uuid;
        synchronized (b) {
            b.clear();
            b.put(bArr);
            b.rewind();
            uuid = new UUID(b.getLong(), b.getLong()).toString();
            kotlin.jvm.internal.k.d(uuid, "UUID(high, low).toString()");
        }
        return uuid;
    }

    public b a(m mVar, m mVar2, g.e.i.b bVar, a aVar) {
        l c2;
        byte[] d2;
        kotlin.jvm.internal.k.e(mVar, "currentScanResult");
        kotlin.jvm.internal.k.e(aVar, "bleCalibration");
        if (!a.k(mVar) || (c2 = mVar.c()) == null || (d2 = c2.d(64091)) == null || d2.length != 16) {
            return null;
        }
        String d3 = d(d2);
        if (bVar == null) {
            bVar = c(1.0f, 2.0f, 1000, 7000);
        }
        g.e.i.b bVar2 = bVar;
        float b2 = b(bVar2, mVar);
        aVar.d(mVar.b());
        return new b.C0694b(bVar2, mVar, mVar2, b2 * 39.0f, b2, d3);
    }
}
