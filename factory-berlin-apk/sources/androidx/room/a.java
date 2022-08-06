package androidx.room;

import java.util.concurrent.Callable;
import kotlin.c0.d;
import kotlin.c0.e;
import kotlin.c0.j.a.f;
import kotlin.c0.j.a.k;
import kotlin.e0.c.p;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.i0;

/* compiled from: CoroutinesRoom.kt */
public final class a {
    public static final C0031a a = new C0031a((DefaultConstructorMarker) null);

    /* renamed from: androidx.room.a$a  reason: collision with other inner class name */
    /* compiled from: CoroutinesRoom.kt */
    public static final class C0031a {

        @f(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.room.a$a$a  reason: collision with other inner class name */
        /* compiled from: CoroutinesRoom.kt */
        static final class C0032a extends k implements p<i0, d<? super R>, Object> {

            /* renamed from: k  reason: collision with root package name */
            private i0 f1363k;

            /* renamed from: l  reason: collision with root package name */
            int f1364l;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ Callable f1365m;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0032a(Callable callable, d dVar) {
                super(2, dVar);
                this.f1365m = callable;
            }

            public final d<x> b(Object obj, d<?> dVar) {
                kotlin.jvm.internal.k.f(dVar, "completion");
                C0032a aVar = new C0032a(this.f1365m, dVar);
                aVar.f1363k = (i0) obj;
                return aVar;
            }

            public final Object i(Object obj) {
                Object unused = d.c();
                if (this.f1364l == 0) {
                    l.b(obj);
                    return this.f1365m.call();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object l(Object obj, Object obj2) {
                return ((C0032a) b(obj, (d) obj2)).i(x.a);
            }
        }

        private C0031a() {
        }

        public final <R> Object a(l lVar, boolean z, Callable<R> callable, d<? super R> dVar) {
            e eVar;
            if (lVar.t() && lVar.p()) {
                return callable.call();
            }
            t tVar = (t) dVar.c().get(t.f1444h);
            if (tVar == null || (eVar = tVar.c()) == null) {
                eVar = z ? b.b(lVar) : b.a(lVar);
            }
            return kotlinx.coroutines.d.c(eVar, new C0032a(callable, (d) null), dVar);
        }

        public /* synthetic */ C0031a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final <R> Object a(l lVar, boolean z, Callable<R> callable, d<? super R> dVar) {
        return a.a(lVar, z, callable, dVar);
    }
}
