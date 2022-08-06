package kotlinx.coroutines.e3;

import kotlin.c0.d;
import kotlin.c0.j.a.k;
import kotlin.e0.c.q;
import kotlin.e0.c.r;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.flow.internal.f;

/* compiled from: Zip.kt */
final /* synthetic */ class p {

    /* compiled from: SafeCollector.common.kt */
    public static final class a implements c<R> {
        final /* synthetic */ c a;
        final /* synthetic */ c b;
        final /* synthetic */ q c;

        /* renamed from: kotlinx.coroutines.e3.p$a$a  reason: collision with other inner class name */
        /* compiled from: Zip.kt */
        static final class C0770a extends k implements r<d<? super R>, T1, T2, d<? super x>, Object> {

            /* renamed from: k  reason: collision with root package name */
            private d f10842k;

            /* renamed from: l  reason: collision with root package name */
            private Object f10843l;

            /* renamed from: m  reason: collision with root package name */
            private Object f10844m;

            /* renamed from: n  reason: collision with root package name */
            Object f10845n;
            Object o;
            Object p;
            Object q;
            int r;
            final /* synthetic */ a s;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0770a(d dVar, a aVar) {
                super(4, dVar);
                this.s = aVar;
            }

            public final Object i(Object obj) {
                d dVar;
                Object obj2;
                Object obj3;
                d dVar2;
                Object c = d.c();
                int i2 = this.r;
                if (i2 == 0) {
                    l.b(obj);
                    dVar2 = this.f10842k;
                    obj2 = this.f10843l;
                    Object obj4 = this.f10844m;
                    q qVar = this.s.c;
                    this.f10845n = dVar2;
                    this.o = obj2;
                    this.p = obj4;
                    this.q = dVar2;
                    this.r = 1;
                    Object k2 = qVar.k(obj2, obj4, this);
                    if (k2 == c) {
                        return c;
                    }
                    dVar = dVar2;
                    Object obj5 = k2;
                    obj3 = obj4;
                    obj = obj5;
                } else if (i2 == 1) {
                    dVar2 = (d) this.q;
                    obj3 = this.p;
                    obj2 = this.o;
                    dVar = (d) this.f10845n;
                    l.b(obj);
                } else if (i2 == 2) {
                    d dVar3 = (d) this.f10845n;
                    l.b(obj);
                    return x.a;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f10845n = dVar;
                this.o = obj2;
                this.p = obj3;
                this.r = 2;
                if (dVar2.a(obj, this) == c) {
                    return c;
                }
                return x.a;
            }

            public final d<x> s(d<? super R> dVar, T1 t1, T2 t2, d<? super x> dVar2) {
                C0770a aVar = new C0770a(dVar2, this.s);
                aVar.f10842k = dVar;
                aVar.f10843l = t1;
                aVar.f10844m = t2;
                return aVar;
            }

            public final Object z(Object obj, Object obj2, Object obj3, Object obj4) {
                return ((C0770a) s((d) obj, obj2, obj3, (d) obj4)).i(x.a);
            }
        }

        public a(c cVar, c cVar2, q qVar) {
            this.a = cVar;
            this.b = cVar2;
            this.c = qVar;
        }

        public Object a(d dVar, d dVar2) {
            Object c2 = f.c(dVar, this.a, this.b, new C0770a((d) null, this), dVar2);
            if (c2 == d.c()) {
                return c2;
            }
            return x.a;
        }
    }

    public static final <T1, T2, R> c<R> a(c<? extends T1> cVar, c<? extends T2> cVar2, q<? super T1, ? super T2, ? super d<? super R>, ? extends Object> qVar) {
        return new a(cVar, cVar2, qVar);
    }
}
