package g.e.n.c.d;

import kotlin.jvm.internal.k;
import no.nordicsemi.android.support.v18.scanner.m;

/* compiled from: BleScan.kt */
public abstract class b {

    /* compiled from: BleScan.kt */
    public static final class a extends b {
        private final g.e.i.b a;
        private final m b;
        private final m c;

        /* renamed from: d  reason: collision with root package name */
        private final float f9984d;

        /* renamed from: e  reason: collision with root package name */
        private final float f9985e;

        /* renamed from: f  reason: collision with root package name */
        private final String f9986f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(g.e.i.b bVar, m mVar, m mVar2, float f2, float f3, String str) {
            super((DefaultConstructorMarker) null);
            k.e(bVar, "motionlessAverage");
            k.e(mVar, "currentScanResult");
            k.e(str, "bluetoothName");
            this.a = bVar;
            this.b = mVar;
            this.c = mVar2;
            this.f9984d = f2;
            this.f9985e = f3;
            this.f9986f = str;
        }

        public float a() {
            return this.f9984d;
        }

        public float b() {
            return this.f9985e;
        }

        public m c() {
            return this.b;
        }

        public g.e.i.b d() {
            return this.a;
        }

        public final String e() {
            return this.f9986f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return k.a(d(), aVar.d()) && k.a(c(), aVar.c()) && k.a(f(), aVar.f()) && Float.compare(a(), aVar.a()) == 0 && Float.compare(b(), aVar.b()) == 0 && k.a(this.f9986f, aVar.f9986f);
        }

        public m f() {
            return this.c;
        }

        public int hashCode() {
            g.e.i.b d2 = d();
            int i2 = 0;
            int hashCode = (d2 != null ? d2.hashCode() : 0) * 31;
            m c2 = c();
            int hashCode2 = (hashCode + (c2 != null ? c2.hashCode() : 0)) * 31;
            m f2 = f();
            int hashCode3 = (((((hashCode2 + (f2 != null ? f2.hashCode() : 0)) * 31) + Float.floatToIntBits(a())) * 31) + Float.floatToIntBits(b())) * 31;
            String str = this.f9986f;
            if (str != null) {
                i2 = str.hashCode();
            }
            return hashCode3 + i2;
        }

        public String toString() {
            return "BlueId(motionlessAverage=" + d() + ", currentScanResult=" + c() + ", previousScanResult=" + f() + ", averageDistance=" + a() + ", averageRssi=" + b() + ", bluetoothName=" + this.f9986f + ")";
        }
    }

    /* renamed from: g.e.n.c.d.b$b  reason: collision with other inner class name */
    /* compiled from: BleScan.kt */
    public static final class C0694b extends b {
        private final g.e.i.b a;
        private final m b;
        private final m c;

        /* renamed from: d  reason: collision with root package name */
        private final float f9987d;

        /* renamed from: e  reason: collision with root package name */
        private final float f9988e;

        /* renamed from: f  reason: collision with root package name */
        private final String f9989f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0694b(g.e.i.b bVar, m mVar, m mVar2, float f2, float f3, String str) {
            super((DefaultConstructorMarker) null);
            k.e(bVar, "motionlessAverage");
            k.e(mVar, "currentScanResult");
            k.e(str, "uuid");
            this.a = bVar;
            this.b = mVar;
            this.c = mVar2;
            this.f9987d = f2;
            this.f9988e = f3;
            this.f9989f = str;
        }

        public float a() {
            return this.f9987d;
        }

        public float b() {
            return this.f9988e;
        }

        public m c() {
            return this.b;
        }

        public g.e.i.b d() {
            return this.a;
        }

        public m e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0694b)) {
                return false;
            }
            C0694b bVar = (C0694b) obj;
            return k.a(d(), bVar.d()) && k.a(c(), bVar.c()) && k.a(e(), bVar.e()) && Float.compare(a(), bVar.a()) == 0 && Float.compare(b(), bVar.b()) == 0 && k.a(this.f9989f, bVar.f9989f);
        }

        public final String f() {
            return this.f9989f;
        }

        public int hashCode() {
            g.e.i.b d2 = d();
            int i2 = 0;
            int hashCode = (d2 != null ? d2.hashCode() : 0) * 31;
            m c2 = c();
            int hashCode2 = (hashCode + (c2 != null ? c2.hashCode() : 0)) * 31;
            m e2 = e();
            int hashCode3 = (((((hashCode2 + (e2 != null ? e2.hashCode() : 0)) * 31) + Float.floatToIntBits(a())) * 31) + Float.floatToIntBits(b())) * 31;
            String str = this.f9989f;
            if (str != null) {
                i2 = str.hashCode();
            }
            return hashCode3 + i2;
        }

        public String toString() {
            return "Gateway(motionlessAverage=" + d() + ", currentScanResult=" + c() + ", previousScanResult=" + e() + ", averageDistance=" + a() + ", averageRssi=" + b() + ", uuid=" + this.f9989f + ")";
        }
    }

    /* compiled from: BleScan.kt */
    public static final class c extends b {
        private final g.e.i.b a;
        private final m b;
        private final m c;

        /* renamed from: d  reason: collision with root package name */
        private final float f9990d;

        /* renamed from: e  reason: collision with root package name */
        private final float f9991e;

        /* renamed from: f  reason: collision with root package name */
        private final String f9992f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(g.e.i.b bVar, m mVar, m mVar2, float f2, float f3, String str) {
            super((DefaultConstructorMarker) null);
            k.e(bVar, "motionlessAverage");
            k.e(mVar, "currentScanResult");
            k.e(str, "name");
            this.a = bVar;
            this.b = mVar;
            this.c = mVar2;
            this.f9990d = f2;
            this.f9991e = f3;
            this.f9992f = str;
        }

        public float a() {
            return this.f9990d;
        }

        public float b() {
            return this.f9991e;
        }

        public m c() {
            return this.b;
        }

        public g.e.i.b d() {
            return this.a;
        }

        public final String e() {
            return this.f9992f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return k.a(d(), cVar.d()) && k.a(c(), cVar.c()) && k.a(f(), cVar.f()) && Float.compare(a(), cVar.a()) == 0 && Float.compare(b(), cVar.b()) == 0 && k.a(this.f9992f, cVar.f9992f);
        }

        public m f() {
            return this.c;
        }

        public int hashCode() {
            g.e.i.b d2 = d();
            int i2 = 0;
            int hashCode = (d2 != null ? d2.hashCode() : 0) * 31;
            m c2 = c();
            int hashCode2 = (hashCode + (c2 != null ? c2.hashCode() : 0)) * 31;
            m f2 = f();
            int hashCode3 = (((((hashCode2 + (f2 != null ? f2.hashCode() : 0)) * 31) + Float.floatToIntBits(a())) * 31) + Float.floatToIntBits(b())) * 31;
            String str = this.f9992f;
            if (str != null) {
                i2 = str.hashCode();
            }
            return hashCode3 + i2;
        }

        public String toString() {
            return "MyRenz(motionlessAverage=" + d() + ", currentScanResult=" + c() + ", previousScanResult=" + f() + ", averageDistance=" + a() + ", averageRssi=" + b() + ", name=" + this.f9992f + ")";
        }
    }

    private b() {
    }

    public abstract float a();

    public abstract float b();

    public abstract m c();

    public abstract g.e.i.b d();

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
