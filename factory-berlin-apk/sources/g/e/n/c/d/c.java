package g.e.n.c.d;

import java.util.List;
import kotlin.jvm.internal.k;
import no.nordicsemi.android.support.v18.scanner.m;

/* compiled from: BleScanResult.kt */
public abstract class c {

    /* compiled from: BleScanResult.kt */
    public static final class a extends c {
        private final int a;

        public a(int i2) {
            super((DefaultConstructorMarker) null);
            this.a = i2;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && this.a == ((a) obj).a;
            }
            return true;
        }

        public int hashCode() {
            return this.a;
        }

        public String toString() {
            return "Error(errorCode=" + this.a + ")";
        }
    }

    /* compiled from: BleScanResult.kt */
    public static final class b extends c {
        private final List<m> a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(List<m> list) {
            super((DefaultConstructorMarker) null);
            k.e(list, "scanResult");
            this.a = list;
        }

        public final List<m> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && k.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            List<m> list = this.a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Success(scanResult=" + this.a + ")";
        }
    }

    private c() {
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
