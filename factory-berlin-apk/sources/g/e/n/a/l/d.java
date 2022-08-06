package g.e.n.a.l;

import g.e.n.c.d.f;
import g.e.n.c.d.l;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MasterDetectorState.kt */
public final class d {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f9963d;

    public d() {
        this(false, false, false, false, 15, (DefaultConstructorMarker) null);
    }

    public d(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.f9963d = z4;
    }

    public static /* synthetic */ d b(d dVar, boolean z, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = dVar.a;
        }
        if ((i2 & 2) != 0) {
            z2 = dVar.b;
        }
        if ((i2 & 4) != 0) {
            z3 = dVar.c;
        }
        if ((i2 & 8) != 0) {
            z4 = dVar.f9963d;
        }
        return dVar.a(z, z2, z3, z4);
    }

    private final List<l> c() {
        ArrayList arrayList = new ArrayList();
        if (!this.a) {
            arrayList.add(l.NO_LOCATION_PERMISSION);
        }
        if (!this.c) {
            arrayList.add(l.BLUETOOTH_IS_OFF);
        }
        if (!this.b) {
            arrayList.add(l.NO_LOCATION_SERVICES);
        }
        return arrayList;
    }

    private final boolean d() {
        return !this.a || !this.c || !this.b;
    }

    public final d a(boolean z, boolean z2, boolean z3, boolean z4) {
        return new d(z, z2, z3, z4);
    }

    public final f e() {
        if (d()) {
            return new f.a(c());
        }
        if (this.f9963d) {
            return f.c.a;
        }
        return f.b.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && this.f9963d == dVar.f9963d;
    }

    public int hashCode() {
        boolean z = this.a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z3 = this.b;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.c;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f9963d;
        if (!z5) {
            z2 = z5;
        }
        return i4 + (z2 ? 1 : 0);
    }

    public String toString() {
        return "MasterDetectorState(hasLocationPermission=" + this.a + ", isLocationEnabled=" + this.b + ", isBluetoothOn=" + this.c + ", activelyScanning=" + this.f9963d + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(boolean z, boolean z2, boolean z3, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? false : z4);
    }
}
