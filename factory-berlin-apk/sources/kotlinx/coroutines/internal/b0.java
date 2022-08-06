package kotlinx.coroutines.internal;

import kotlin.TypeCastException;
import kotlin.c0.g;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.u2;

/* compiled from: ThreadContext.kt */
public final class b0 {
    private static final x a = new x("ZERO");
    private static final p<Object, g.b, Object> b = a.f11007h;
    private static final p<u2<?>, g.b, u2<?>> c = b.f11008h;

    /* renamed from: d  reason: collision with root package name */
    private static final p<e0, g.b, e0> f11005d = d.f11010h;

    /* renamed from: e  reason: collision with root package name */
    private static final p<e0, g.b, e0> f11006e = c.f11009h;

    /* compiled from: ThreadContext.kt */
    static final class a extends l implements p<Object, g.b, Object> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f11007h = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final Object l(Object obj, g.b bVar) {
            if (!(bVar instanceof u2)) {
                return obj;
            }
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    /* compiled from: ThreadContext.kt */
    static final class b extends l implements p<u2<?>, g.b, u2<?>> {

        /* renamed from: h  reason: collision with root package name */
        public static final b f11008h = new b();

        b() {
            super(2);
        }

        /* renamed from: a */
        public final u2<?> l(u2<?> u2Var, g.b bVar) {
            if (u2Var != null) {
                return u2Var;
            }
            if (!(bVar instanceof u2)) {
                bVar = null;
            }
            return (u2) bVar;
        }
    }

    /* compiled from: ThreadContext.kt */
    static final class c extends l implements p<e0, g.b, e0> {

        /* renamed from: h  reason: collision with root package name */
        public static final c f11009h = new c();

        c() {
            super(2);
        }

        public final e0 a(e0 e0Var, g.b bVar) {
            if (bVar instanceof u2) {
                ((u2) bVar).o(e0Var.b(), e0Var.d());
            }
            return e0Var;
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
            e0 e0Var = (e0) obj;
            a(e0Var, (g.b) obj2);
            return e0Var;
        }
    }

    /* compiled from: ThreadContext.kt */
    static final class d extends l implements p<e0, g.b, e0> {

        /* renamed from: h  reason: collision with root package name */
        public static final d f11010h = new d();

        d() {
            super(2);
        }

        public final e0 a(e0 e0Var, g.b bVar) {
            if (bVar instanceof u2) {
                e0Var.a(((u2) bVar).Z(e0Var.b()));
            }
            return e0Var;
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
            e0 e0Var = (e0) obj;
            a(e0Var, (g.b) obj2);
            return e0Var;
        }
    }

    public static final void a(g gVar, Object obj) {
        if (obj != a) {
            if (obj instanceof e0) {
                ((e0) obj).c();
                gVar.fold(obj, f11006e);
                return;
            }
            Object fold = gVar.fold(null, c);
            if (fold != null) {
                ((u2) fold).o(gVar, obj);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }

    public static final Object b(g gVar) {
        Object fold = gVar.fold(0, b);
        if (fold != null) {
            return fold;
        }
        k.m();
        throw null;
    }

    public static final Object c(g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return gVar.fold(new e0(gVar, ((Number) obj).intValue()), f11005d);
        }
        if (obj != null) {
            return ((u2) obj).Z(gVar);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    }
}
