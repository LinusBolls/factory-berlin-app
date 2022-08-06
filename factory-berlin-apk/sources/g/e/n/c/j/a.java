package g.e.n.c.j;

import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: SensorbergUnit.kt */
public abstract class a {

    /* renamed from: g.e.n.c.j.a$a  reason: collision with other inner class name */
    /* compiled from: SensorbergUnit.kt */
    public static final class C0709a extends a {
        private final String a;
        private final String b;
        private final String c;

        /* renamed from: d  reason: collision with root package name */
        private final List<g.e.n.c.h.a> f10078d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0709a(String str, String str2, String str3, List<g.e.n.c.h.a> list) {
            super((DefaultConstructorMarker) null);
            k.e(str, "id");
            k.e(str2, "name");
            k.e(str3, "externalIdentifier");
            k.e(list, "unavailableTimes");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.f10078d = list;
        }

        public final String a() {
            return this.c;
        }

        public String b() {
            return this.a;
        }

        public String c() {
            return this.b;
        }

        public final List<g.e.n.c.h.a> d() {
            return this.f10078d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0709a)) {
                return false;
            }
            C0709a aVar = (C0709a) obj;
            return k.a(b(), aVar.b()) && k.a(c(), aVar.c()) && k.a(this.c, aVar.c) && k.a(this.f10078d, aVar.f10078d);
        }

        public int hashCode() {
            String b2 = b();
            int i2 = 0;
            int hashCode = (b2 != null ? b2.hashCode() : 0) * 31;
            String c2 = c();
            int hashCode2 = (hashCode + (c2 != null ? c2.hashCode() : 0)) * 31;
            String str = this.c;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
            List<g.e.n.c.h.a> list = this.f10078d;
            if (list != null) {
                i2 = list.hashCode();
            }
            return hashCode3 + i2;
        }

        public String toString() {
            return "BookableUnit(id=" + b() + ", name=" + c() + ", externalIdentifier=" + this.c + ", unavailableTimes=" + this.f10078d + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C0709a(String str, String str2, String str3, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i2 & 8) != 0 ? n.g() : list);
        }
    }

    /* compiled from: SensorbergUnit.kt */
    public static final class b extends a {
        private final String a;
        private final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super((DefaultConstructorMarker) null);
            k.e(str, "id");
            k.e(str2, "name");
            this.a = str;
            this.b = str2;
        }

        public String a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return k.a(a(), bVar.a()) && k.a(b(), bVar.b());
        }

        public int hashCode() {
            String a2 = a();
            int i2 = 0;
            int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
            String b2 = b();
            if (b2 != null) {
                i2 = b2.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "RootUnit(id=" + a() + ", name=" + b() + ")";
        }
    }

    private a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
