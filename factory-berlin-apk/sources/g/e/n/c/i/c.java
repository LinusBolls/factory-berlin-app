package g.e.n.c.i;

import kotlin.e;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import org.threeten.bp.d;

/* compiled from: SInstant.kt */
public final class c {
    /* access modifiers changed from: private */
    public static final org.threeten.bp.format.c c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f10076d = new a((DefaultConstructorMarker) null);
    private final e a;
    /* access modifiers changed from: private */
    public final d b;

    /* compiled from: SInstant.kt */
    public static final class a {
        private a() {
        }

        private final String c(d dVar) {
            String b = c.c.b(dVar);
            k.d(b, "parser.format(instant)");
            return b;
        }

        public final c a() {
            d R = d.R();
            k.d(R, "instantNow");
            return new c(R, c(R), (DefaultConstructorMarker) null);
        }

        public final c b(String str) {
            k.e(str, "value");
            try {
                d V = d.V(str);
                k.d(V, "Instant.parse(value)");
                return new c(V, str, (DefaultConstructorMarker) null);
            } catch (Exception unused) {
                return null;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SInstant.kt */
    static final class b extends l implements kotlin.e0.c.a<Long> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f10077h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.f10077h = cVar;
        }

        public final long a() {
            return this.f10077h.b.e0();
        }

        public /* bridge */ /* synthetic */ Object d() {
            return Long.valueOf(a());
        }
    }

    static {
        org.threeten.bp.format.c cVar = org.threeten.bp.format.c.f11508l;
        k.d(cVar, "DateTimeFormatter.ISO_INSTANT");
        c = cVar;
    }

    private c(d dVar, String str) {
        this.b = dVar;
        this.a = g.a(new b(this));
    }

    public final long c() {
        return ((Number) this.a.getValue()).longValue();
    }

    public /* synthetic */ c(d dVar, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, str);
    }
}
