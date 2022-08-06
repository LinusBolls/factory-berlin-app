package g.e.n.d;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k;

/* compiled from: MyRenzPortalEnvironment.kt */
public abstract class v {
    private final String a;

    /* compiled from: MyRenzPortalEnvironment.kt */
    public static final class a extends v {
        private final String b;

        public String a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && k.a(a(), ((a) obj).a());
            }
            return true;
        }

        public int hashCode() {
            String a = a();
            if (a != null) {
                return a.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Custom(url=" + a() + ")";
        }
    }

    /* compiled from: MyRenzPortalEnvironment.kt */
    public static final class b extends v {
        public static final b b = new b();

        private b() {
            super((String) null, 1, (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: MyRenzPortalEnvironment.kt */
    public static final class c extends v {
        public static final c b = new c();

        private c() {
            super((String) null, 1, (DefaultConstructorMarker) null);
        }
    }

    private v(String str) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }

    public final g.d.a.e.b b() {
        if (k.a(this, b.b)) {
            return g.d.a.e.b.PortalEnvironmentMYRENZCOM;
        }
        if (k.a(this, c.b)) {
            return g.d.a.e.b.PortalEnvironmentDEMOMYRENZCOM;
        }
        if (this instanceof a) {
            return g.d.a.e.b.PortalEnvironmentOWN;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ v(String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str);
    }

    public /* synthetic */ v(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
