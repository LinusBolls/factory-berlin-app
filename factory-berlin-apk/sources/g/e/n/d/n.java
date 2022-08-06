package g.e.n.d;

import g.d.a.c.b;
import g.e.n.d.q;
import kotlin.jvm.internal.k;

/* compiled from: Device.kt */
public final class n {
    public static final a c = new a((DefaultConstructorMarker) null);
    private final String a;
    private final q b;

    /* compiled from: Device.kt */
    public static final class a {
        private a() {
        }

        public final n a(g.d.a.c.a aVar) {
            k.e(aVar, "pkaDevice");
            String b = aVar.b();
            k.d(b, "pkaDevice.pkaID");
            q.b bVar = q.a;
            b c = aVar.c();
            k.d(c, "pkaDevice.pkaStatus");
            return new n(b, bVar.a(c));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public n(String str, q qVar) {
        k.e(str, "id");
        k.e(qVar, "status");
        this.a = str;
        this.b = qVar;
    }

    public final q a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k.a(this.a, nVar.a) && k.a(this.b, nVar.b);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        q qVar = this.b;
        if (qVar != null) {
            i2 = qVar.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "Device(id=" + this.a + ", status=" + this.b + ")";
    }
}
