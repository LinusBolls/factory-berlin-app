package kotlinx.coroutines.flow.internal;

import kotlin.TypeCastException;
import kotlin.c0.d;
import kotlin.c0.g;
import kotlin.c0.j.a.h;
import kotlin.e0.c.p;
import kotlin.jvm.internal.y;
import kotlinx.coroutines.internal.b0;

/* compiled from: ChannelFlow.kt */
public final class b {

    /* compiled from: Continuation.kt */
    public static final class a implements d<T> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g f10867g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f10868h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Object f10869i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Object f10870j;

        public a(g gVar, d dVar, g gVar2, Object obj, p pVar, Object obj2) {
            this.f10867g = gVar;
            this.f10868h = dVar;
            this.f10869i = obj;
            this.f10870j = obj2;
        }

        public g c() {
            return this.f10867g;
        }

        public void m(Object obj) {
            this.f10868h.m(obj);
        }
    }

    /* JADX INFO: finally extract failed */
    static final /* synthetic */ <T, V> Object b(g gVar, Object obj, p<? super V, ? super d<? super T>, ? extends Object> pVar, V v, d<? super T> dVar) {
        Object c = b0.c(gVar, obj);
        try {
            a aVar = new a(gVar, dVar, gVar, obj, pVar, v);
            if (pVar != null) {
                y.d(pVar, 2);
                Object l2 = pVar.l(v, aVar);
                b0.a(gVar, c);
                if (l2 == d.c()) {
                    h.c(dVar);
                }
                return l2;
            }
            throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        } catch (Throwable th) {
            b0.a(gVar, c);
            throw th;
        }
    }

    static /* synthetic */ Object c(g gVar, Object obj, p pVar, Object obj2, d dVar, int i2, Object obj3) {
        if ((i2 & 2) != 0) {
            obj = b0.b(gVar);
        }
        return b(gVar, obj, pVar, obj2, dVar);
    }

    /* access modifiers changed from: private */
    public static final <T> kotlinx.coroutines.e3.d<T> d(kotlinx.coroutines.e3.d<? super T> dVar, g gVar) {
        return (!(dVar instanceof q) && !(dVar instanceof l)) ? new r(dVar, gVar) : dVar;
    }
}
