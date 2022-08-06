package kotlinx.coroutines.flow.internal;

import kotlin.c0.g;
import kotlin.c0.j.a.f;
import kotlin.c0.j.a.k;
import kotlin.e0.c.p;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.e3.d;
import kotlinx.coroutines.internal.b0;

/* compiled from: ChannelFlow.kt */
final class r<T> implements d<T> {

    /* renamed from: g  reason: collision with root package name */
    private final Object f10931g;

    /* renamed from: h  reason: collision with root package name */
    private final p<T, kotlin.c0.d<? super x>, Object> f10932h;

    /* renamed from: i  reason: collision with root package name */
    private final g f10933i;

    @f(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {178}, m = "invokeSuspend")
    /* compiled from: ChannelFlow.kt */
    static final class a extends k implements p<T, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private Object f10934k;

        /* renamed from: l  reason: collision with root package name */
        Object f10935l;

        /* renamed from: m  reason: collision with root package name */
        int f10936m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ d f10937n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, kotlin.c0.d dVar2) {
            super(2, dVar2);
            this.f10937n = dVar;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            a aVar = new a(this.f10937n, dVar);
            aVar.f10934k = obj;
            return aVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f10936m;
            if (i2 == 0) {
                l.b(obj);
                Object obj2 = this.f10934k;
                d dVar = this.f10937n;
                this.f10935l = obj2;
                this.f10936m = 1;
                if (dVar.a(obj2, this) == c) {
                    return c;
                }
            } else if (i2 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((a) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    public r(d<? super T> dVar, g gVar) {
        this.f10933i = gVar;
        this.f10931g = b0.b(gVar);
        this.f10932h = new a(dVar, (kotlin.c0.d) null);
    }

    public Object a(T t, kotlin.c0.d<? super x> dVar) {
        Object b = b.b(this.f10933i, this.f10931g, this.f10932h, t, dVar);
        return b == d.c() ? b : x.a;
    }
}
