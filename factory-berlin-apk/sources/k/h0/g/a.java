package k.h0.g;

import k.u;
import kotlin.jvm.internal.k;
import l.h;

/* compiled from: HeadersReader.kt */
public final class a {
    private long a = ((long) 262144);
    private final h b;

    /* renamed from: k.h0.g.a$a  reason: collision with other inner class name */
    /* compiled from: HeadersReader.kt */
    public static final class C0741a {
        private C0741a() {
        }

        public /* synthetic */ C0741a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C0741a((DefaultConstructorMarker) null);
    }

    public a(h hVar) {
        k.f(hVar, "source");
        this.b = hVar;
    }

    public final u a() {
        u.a aVar = new u.a();
        while (true) {
            String b2 = b();
            if (b2.length() == 0) {
                return aVar.e();
            }
            aVar.b(b2);
        }
    }

    public final String b() {
        String h0 = this.b.h0(this.a);
        this.a -= (long) h0.length();
        return h0;
    }
}
