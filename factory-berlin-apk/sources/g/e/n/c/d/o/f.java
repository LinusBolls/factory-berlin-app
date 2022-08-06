package g.e.n.c.d.o;

import java.util.UUID;
import kotlin.jvm.internal.k;

/* compiled from: BleServiceId.kt */
public abstract class f {
    private final UUID a;

    /* compiled from: BleServiceId.kt */
    public static final class a extends f {
        public static final a b = new a();

        private a() {
            super("00005301-0000-002a-426c-756549442a00", (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: BleServiceId.kt */
    public static final class b extends f {
        public static final b b = new b();

        private b() {
            super("6e400001-b5a3-f393-e0a9-e50e24dcca9e", (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: BleServiceId.kt */
    public static final class c extends f {
        public static final c b = new c();

        private c() {
            super("6412B225-9135-11E6-AE22-56B6B6499611", (DefaultConstructorMarker) null);
        }
    }

    private f(String str) {
        UUID fromString = UUID.fromString(str);
        k.d(fromString, "UUID.fromString(uuid)");
        this.a = fromString;
    }

    public final UUID a() {
        return this.a;
    }

    public /* synthetic */ f(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
