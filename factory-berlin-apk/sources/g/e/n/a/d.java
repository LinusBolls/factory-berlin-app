package g.e.n.a;

import g.e.h.b.c;
import g.e.n.a.l.b;
import g.e.n.c.d.e;
import g.e.n.c.d.f;
import kotlin.jvm.internal.k;
import kotlin.x;
import no.nordicsemi.android.support.v18.scanner.m;

/* compiled from: BleScannerDataSourceImpl.kt */
public final class d implements e {
    private final a a;
    private final c b;
    private final b c;

    /* renamed from: d  reason: collision with root package name */
    private final c.a f9938d;

    /* compiled from: SafeCollector.common.kt */
    public static final class a implements kotlinx.coroutines.e3.c<f> {
        final /* synthetic */ kotlinx.coroutines.e3.c a;

        /* renamed from: g.e.n.a.d$a$a  reason: collision with other inner class name */
        /* compiled from: Collect.kt */
        public static final class C0687a implements kotlinx.coroutines.e3.d<g.e.n.a.l.d> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.e3.d f9939g;

            public C0687a(kotlinx.coroutines.e3.d dVar, a aVar) {
                this.f9939g = dVar;
            }

            public Object a(Object obj, kotlin.c0.d dVar) {
                Object a = this.f9939g.a(((g.e.n.a.l.d) obj).e(), dVar);
                return a == d.c() ? a : x.a;
            }
        }

        public a(kotlinx.coroutines.e3.c cVar) {
            this.a = cVar;
        }

        public Object a(kotlinx.coroutines.e3.d dVar, kotlin.c0.d dVar2) {
            Object a2 = this.a.a(new C0687a(dVar, this), dVar2);
            if (a2 == d.c()) {
                return a2;
            }
            return x.a;
        }
    }

    public d(a aVar, c cVar, b bVar, c.a aVar2) {
        k.e(aVar, "advancedBleScanner");
        k.e(cVar, "bleScannerController");
        k.e(bVar, "masterDetector");
        k.e(aVar2, "timeProvider");
        this.a = aVar;
        this.b = cVar;
        this.c = bVar;
        this.f9938d = aVar2;
    }

    public void a(g.e.n.c.d.d dVar) {
        k.e(dVar, "bleScannerConfiguration");
        this.b.a(dVar);
    }

    public kotlinx.coroutines.e3.c<g.e.n.c.d.c> b(g.e.n.c.d.d dVar) {
        k.e(dVar, "bleScannerConfiguration");
        return this.a.b(dVar);
    }

    public void c() {
        this.b.c();
    }

    public boolean d(m mVar) {
        k.e(mVar, "scanResult");
        return i.f9942k.c(mVar, 7000, this.f9938d);
    }

    public kotlinx.coroutines.e3.c<f> e() {
        return new a(this.c.a());
    }
}
