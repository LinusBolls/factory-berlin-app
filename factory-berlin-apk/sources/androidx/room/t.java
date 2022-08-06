package androidx.room;

import kotlin.c0.e;
import kotlin.c0.g;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;

/* compiled from: RoomDatabase.kt */
public final class t implements g.b {

    /* renamed from: h  reason: collision with root package name */
    public static final a f1444h = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private final e f1445g;

    /* compiled from: RoomDatabase.kt */
    public static final class a implements g.c<t> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final e c() {
        return this.f1445g;
    }

    public <R> R fold(R r, p<? super R, ? super g.b, ? extends R> pVar) {
        k.f(pVar, "operation");
        return g.b.a.a(this, r, pVar);
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        k.f(cVar, "key");
        return g.b.a.b(this, cVar);
    }

    public g.c<t> getKey() {
        return f1444h;
    }

    public g minusKey(g.c<?> cVar) {
        k.f(cVar, "key");
        return g.b.a.c(this, cVar);
    }

    public g plus(g gVar) {
        k.f(gVar, "context");
        return g.b.a.d(this, gVar);
    }
}
