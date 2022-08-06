package g.e.n.d;

import g.d.a.b.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k;

/* compiled from: CommunicationResponse.kt */
public abstract class j {
    public static final a a = new a((DefaultConstructorMarker) null);

    /* compiled from: CommunicationResponse.kt */
    public static final class a {
        private a() {
        }

        public final j a(c cVar) {
            k.e(cVar, "pkaRequestResponse");
            int i2 = i.a[cVar.ordinal()];
            if (i2 == 1) {
                return b.c;
            }
            if (i2 == 2) {
                return k.c;
            }
            if (i2 == 3) {
                return l.c;
            }
            throw new NoWhenBranchMatchedException();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CommunicationResponse.kt */
    public static final class b extends j {
        private static final String b = "MyRenz communication with box: OK";
        public static final b c = new b();

        private b() {
            super((DefaultConstructorMarker) null);
        }

        public String a() {
            return b;
        }
    }

    private j() {
    }

    public abstract String a();

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
