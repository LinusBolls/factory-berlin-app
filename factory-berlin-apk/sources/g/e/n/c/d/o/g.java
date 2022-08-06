package g.e.n.c.d.o;

import g.e.n.c.d.b;
import java.util.Iterator;
import java.util.List;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;
import kotlinx.coroutines.e3.c;
import kotlinx.coroutines.e3.d;
import kotlinx.coroutines.e3.e;

/* compiled from: FindFirstBleScanUseCaseImpl.kt */
public final class g implements g.e.n.c.d.g {
    private final d a;

    /* compiled from: SafeCollector.common.kt */
    public static final class a implements c<b> {
        final /* synthetic */ c a;
        final /* synthetic */ l b;

        /* renamed from: g.e.n.c.d.o.g$a$a  reason: collision with other inner class name */
        /* compiled from: Collect.kt */
        public static final class C0698a implements d<List<? extends b>> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ d f10006g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ a f10007h;

            public C0698a(d dVar, a aVar) {
                this.f10006g = dVar;
                this.f10007h = aVar;
            }

            public Object a(Object obj, kotlin.c0.d dVar) {
                Object obj2;
                d dVar2 = this.f10006g;
                l lVar = this.f10007h.b;
                Iterator it = ((List) obj).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((Boolean) lVar.o(obj2)).booleanValue()) {
                        break;
                    }
                }
                if (obj2 == null) {
                    return obj2 == d.c() ? obj2 : x.a;
                }
                Object a = dVar2.a(obj2, dVar);
                return a == d.c() ? a : x.a;
            }
        }

        public a(c cVar, l lVar) {
            this.a = cVar;
            this.b = lVar;
        }

        public Object a(d dVar, kotlin.c0.d dVar2) {
            Object a2 = this.a.a(new C0698a(dVar, this), dVar2);
            if (a2 == d.c()) {
                return a2;
            }
            return x.a;
        }
    }

    public g(d dVar) {
        k.e(dVar, "bleScanRepository");
        this.a = dVar;
    }

    public Object a(l<? super b, Boolean> lVar, kotlin.c0.d<? super b> dVar) {
        n.a.a.a("execute FindFirstBleScanUseCase", new Object[0]);
        return e.h(new a(this.a.a(), lVar), dVar);
    }
}
