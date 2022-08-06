package g.e.n.c.d;

import android.os.ParcelUuid;
import g.e.n.c.d.o.f;
import java.util.List;
import no.nordicsemi.android.support.v18.scanner.k;
import no.nordicsemi.android.support.v18.scanner.n;

/* compiled from: BleScannerConfiguration.kt */
public final class d {
    public static final a c = new a((DefaultConstructorMarker) null);
    private final List<k> a;
    private final n b;

    /* compiled from: BleScannerConfiguration.kt */
    public static final class a {
        private a() {
        }

        private final List<k> c() {
            return n.i(a(f.b.b), a(f.a.b), a(f.c.b));
        }

        private final n d() {
            n.b bVar = new n.b();
            bVar.j(2);
            bVar.m(false);
            n a = bVar.a();
            kotlin.jvm.internal.k.d(a, "ScanSettings.Builder()\n\t…E_FILTERING)\n\t\t\t\t.build()");
            return a;
        }

        public final k a(f fVar) {
            kotlin.jvm.internal.k.e(fVar, "bleServiceId");
            k.b bVar = new k.b();
            bVar.h(new ParcelUuid(fVar.a()));
            k a = bVar.a();
            kotlin.jvm.internal.k.d(a, "ScanFilter.Builder()\n\t\t\t…ceId.uuid))\n\t\t\t\t\t.build()");
            return a;
        }

        public final d b() {
            return new d(c(), d());
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public d(List<k> list, n nVar) {
        kotlin.jvm.internal.k.e(list, "scanFilters");
        kotlin.jvm.internal.k.e(nVar, "scanSettings");
        this.a = list;
        this.b = nVar;
    }

    public final List<k> a() {
        return this.a;
    }

    public final n b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.k.a(this.a, dVar.a) && kotlin.jvm.internal.k.a(this.b, dVar.b);
    }

    public int hashCode() {
        List<k> list = this.a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        n nVar = this.b;
        if (nVar != null) {
            i2 = nVar.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "BleScannerConfiguration(scanFilters=" + this.a + ", scanSettings=" + this.b + ")";
    }
}
