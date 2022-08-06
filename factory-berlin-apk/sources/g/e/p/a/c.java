package g.e.p.a;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.c0.j.a.f;
import kotlin.c0.j.a.k;
import kotlin.e0.c.p;
import kotlin.e0.c.q;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.e3.d;
import kotlinx.coroutines.e3.e;

/* compiled from: FlowObserver.kt */
public class c<T> {
    /* access modifiers changed from: private */
    public final List<String> a = new ArrayList();

    @f(c = "com.sensorberg.util.couroutine.FlowObserver$observeFlow$1", f = "FlowObserver.kt", l = {}, m = "invokeSuspend")
    /* compiled from: FlowObserver.kt */
    static final class a extends k implements p<d<? super T>, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private d f10238k;

        /* renamed from: l  reason: collision with root package name */
        int f10239l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ c f10240m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ String f10241n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, String str, kotlin.c0.d dVar) {
            super(2, dVar);
            this.f10240m = cVar;
            this.f10241n = str;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            a aVar = new a(this.f10240m, this.f10241n, dVar);
            aVar.f10238k = (d) obj;
            return aVar;
        }

        public final Object i(Object obj) {
            Object unused = d.c();
            if (this.f10239l == 0) {
                l.b(obj);
                this.f10240m.a.add(this.f10241n);
                if (this.f10240m.a.size() == 1) {
                    this.f10240m.c();
                }
                return x.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object l(Object obj, Object obj2) {
            return ((a) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    @f(c = "com.sensorberg.util.couroutine.FlowObserver$observeFlow$2", f = "FlowObserver.kt", l = {}, m = "invokeSuspend")
    /* compiled from: FlowObserver.kt */
    static final class b extends k implements q<d<? super T>, Throwable, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private d f10242k;

        /* renamed from: l  reason: collision with root package name */
        private Throwable f10243l;

        /* renamed from: m  reason: collision with root package name */
        int f10244m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ c f10245n;
        final /* synthetic */ String o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, String str, kotlin.c0.d dVar) {
            super(3, dVar);
            this.f10245n = cVar;
            this.o = str;
        }

        public final Object i(Object obj) {
            Object unused = d.c();
            if (this.f10244m == 0) {
                l.b(obj);
                this.f10245n.a.remove(this.o);
                if (this.f10245n.a.isEmpty()) {
                    this.f10245n.d();
                }
                return x.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object k(Object obj, Object obj2, Object obj3) {
            return ((b) s((d) obj, (Throwable) obj2, (kotlin.c0.d) obj3)).i(x.a);
        }

        public final kotlin.c0.d<x> s(d<? super T> dVar, Throwable th, kotlin.c0.d<? super x> dVar2) {
            kotlin.jvm.internal.k.e(dVar, "$this$create");
            kotlin.jvm.internal.k.e(dVar2, "continuation");
            b bVar = new b(this.f10245n, this.o, dVar2);
            bVar.f10242k = dVar;
            bVar.f10243l = th;
            return bVar;
        }
    }

    public final kotlinx.coroutines.e3.c<T> b(kotlinx.coroutines.e3.c<? extends T> cVar) {
        kotlin.jvm.internal.k.e(cVar, "flow");
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.k.d(uuid, "UUID.randomUUID().toString()");
        return e.n(e.p(cVar, new a(this, uuid, (kotlin.c0.d) null)), new b(this, uuid, (kotlin.c0.d) null));
    }

    public void c() {
    }

    public abstract void d();
}
