package g.e.n.d;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k;

/* compiled from: BleStatus.kt */
public abstract class e {
    public static final b a = new b((DefaultConstructorMarker) null);

    /* compiled from: BleStatus.kt */
    public static final class a extends e {
        public static final a b = new a();

        private a() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* compiled from: BleStatus.kt */
    public static final class b {
        private b() {
        }

        public final e a(com.renz.myrenzbox.ble.c cVar) {
            k.e(cVar, "bleStatus");
            int i2 = f.a[cVar.ordinal()];
            if (i2 == 1) {
                return a.b;
            }
            if (i2 == 2) {
                return c.b;
            }
            if (i2 == 3) {
                return d.b;
            }
            throw new NoWhenBranchMatchedException();
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: BleStatus.kt */
    public static final class c extends e {
        public static final c b = new c();

        private c() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* compiled from: BleStatus.kt */
    public static final class d extends e {
        public static final d b = new d();

        private d() {
            super((DefaultConstructorMarker) null);
        }
    }

    private e() {
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
