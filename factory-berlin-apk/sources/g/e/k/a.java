package g.e.k;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: Cancellation.kt */
public final class a {
    private final Map<kotlin.e0.c.a<x>, C0675a> a = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final d<Boolean> b = new d<>();

    /* renamed from: g.e.k.a$a  reason: collision with other inner class name */
    /* compiled from: Cancellation.kt */
    private final class C0675a {
        private final l<Boolean, x> a = new C0676a(this);
        private final kotlin.e0.c.a<x> b;
        final /* synthetic */ a c;

        /* renamed from: g.e.k.a$a$a  reason: collision with other inner class name */
        /* compiled from: Cancellation.kt */
        public static final class C0676a implements l<Boolean, x> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C0675a f9828g;

            C0676a(C0675a aVar) {
                this.f9828g = aVar;
            }

            public void a(Boolean bool) {
                if (k.a(bool, Boolean.TRUE)) {
                    this.f9828g.c.b.v(this);
                    this.f9828g.a().d();
                }
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((Boolean) obj);
                return x.a;
            }
        }

        public C0675a(a aVar, kotlin.e0.c.a<x> aVar2) {
            k.f(aVar2, "callback");
            this.c = aVar;
            this.b = aVar2;
        }

        public final kotlin.e0.c.a<x> a() {
            return this.b;
        }

        public final l<Boolean, x> b() {
            return this.a;
        }
    }

    public final void b() {
        this.b.w(Boolean.TRUE);
    }

    public final boolean c() {
        return k.a(this.b.n(), Boolean.TRUE);
    }

    public final void d(kotlin.e0.c.a<x> aVar) {
        k.f(aVar, "callback");
        C0675a aVar2 = new C0675a(this, aVar);
        this.a.put(aVar, aVar2);
        this.b.r(aVar2.b());
    }

    public final void e(kotlin.e0.c.a<x> aVar) {
        k.f(aVar, "callback");
        C0675a remove = this.a.remove(aVar);
        if (remove != null) {
            this.b.v(remove.b());
        }
    }
}
