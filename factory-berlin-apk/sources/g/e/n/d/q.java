package g.e.n.d;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k;

/* compiled from: DeviceStatus.kt */
public abstract class q {
    public static final b a = new b((DefaultConstructorMarker) null);

    /* compiled from: DeviceStatus.kt */
    public static final class a extends q {
        private static final String b = "PKADeviceStatus:  Blocked";
        public static final a c = new a();

        private a() {
            super((DefaultConstructorMarker) null);
        }

        public String a() {
            return b;
        }
    }

    /* compiled from: DeviceStatus.kt */
    public static final class b {
        private b() {
        }

        public final q a(g.d.a.c.b bVar) {
            k.e(bVar, "pkaDeviceStatus");
            int i2 = r.a[bVar.ordinal()];
            if (i2 == 1) {
                return e.c;
            }
            if (i2 == 2) {
                return d.c;
            }
            if (i2 == 3) {
                return a.c;
            }
            if (i2 == 4) {
                return c.c;
            }
            throw new NoWhenBranchMatchedException();
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: DeviceStatus.kt */
    public static final class c extends q {
        private static final String b = "PKADeviceStatus:  Error";
        public static final c c = new c();

        private c() {
            super((DefaultConstructorMarker) null);
        }

        public String a() {
            return b;
        }
    }

    /* compiled from: DeviceStatus.kt */
    public static final class d extends q {
        private static final String b = "PKADeviceStatus:  Ready";
        public static final d c = new d();

        private d() {
            super((DefaultConstructorMarker) null);
        }

        public String a() {
            return b;
        }
    }

    /* compiled from: DeviceStatus.kt */
    public static final class e extends q {
        private static final String b = "PKADeviceStatus:  Unknown";
        public static final e c = new e();

        private e() {
            super((DefaultConstructorMarker) null);
        }

        public String a() {
            return b;
        }
    }

    private q() {
    }

    public abstract String a();

    public /* synthetic */ q(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
