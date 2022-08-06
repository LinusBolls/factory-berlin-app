package kotlinx.coroutines.flow.internal;

import kotlin.c0.g;
import kotlin.e0.c.p;

/* compiled from: SafeCollector.kt */
public final class g implements g.b {

    /* renamed from: i  reason: collision with root package name */
    public static final a f10917i = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private final g.c<?> f10918g = f10917i;

    /* renamed from: h  reason: collision with root package name */
    public final Throwable f10919h;

    /* compiled from: SafeCollector.kt */
    public static final class a implements g.c<g> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public g(Throwable th) {
        this.f10919h = th;
    }

    public <R> R fold(R r, p<? super R, ? super g.b, ? extends R> pVar) {
        return g.b.a.a(this, r, pVar);
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        return g.b.a.b(this, cVar);
    }

    public g.c<?> getKey() {
        return this.f10918g;
    }

    public kotlin.c0.g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    public kotlin.c0.g plus(kotlin.c0.g gVar) {
        return g.b.a.d(this, gVar);
    }
}
