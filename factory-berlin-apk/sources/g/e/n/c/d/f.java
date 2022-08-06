package g.e.n.c.d;

import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: BleScannerStatus.kt */
public abstract class f {

    /* compiled from: BleScannerStatus.kt */
    public static final class a extends f {
        private final List<l> a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(List<? extends l> list) {
            super((DefaultConstructorMarker) null);
            k.e(list, "reasons");
            this.a = list;
        }

        public final List<l> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && k.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            List<l> list = this.a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Disabled(reasons=" + this.a + ")";
        }
    }

    /* compiled from: BleScannerStatus.kt */
    public static final class b extends f {
        public static final b a = new b();

        private b() {
            super((DefaultConstructorMarker) null);
        }

        public String toString() {
            return "Ready";
        }
    }

    /* compiled from: BleScannerStatus.kt */
    public static final class c extends f {
        public static final c a = new c();

        private c() {
            super((DefaultConstructorMarker) null);
        }

        public String toString() {
            return "Scanning";
        }
    }

    private f() {
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
