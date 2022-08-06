package g.e.p.a;

import androidx.recyclerview.widget.RecyclerView;
import g.e.m.c;
import java.util.List;
import kotlin.c0.j.a.f;
import kotlin.c0.j.a.k;
import kotlin.e0.c.q;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.e3.d;
import kotlinx.coroutines.e3.e;

/* compiled from: CoroutineGuard.kt */
public final class a {
    public static final a a = new a();

    @f(c = "com.sensorberg.util.couroutine.CoroutineGuard$catchThrowable$1", f = "CoroutineGuard.kt", l = {18}, m = "invokeSuspend")
    /* renamed from: g.e.p.a.a$a  reason: collision with other inner class name */
    /* compiled from: CoroutineGuard.kt */
    static final class C0729a extends k implements q<d<? super c<? extends T>>, Throwable, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private d f10224k;

        /* renamed from: l  reason: collision with root package name */
        private Throwable f10225l;

        /* renamed from: m  reason: collision with root package name */
        Object f10226m;

        /* renamed from: n  reason: collision with root package name */
        Object f10227n;
        Object o;
        int p;

        C0729a(kotlin.c0.d dVar) {
            super(3, dVar);
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.p;
            if (i2 == 0) {
                l.b(obj);
                d dVar = this.f10224k;
                Throwable th = this.f10225l;
                c.a aVar = new c.a((List<? extends Throwable>) m.b(th));
                this.f10226m = dVar;
                this.f10227n = th;
                this.o = aVar;
                this.p = 1;
                if (dVar.a(aVar, this) == c) {
                    return c;
                }
            } else if (i2 == 1) {
                c.a aVar2 = (c.a) this.o;
                Throwable th2 = (Throwable) this.f10227n;
                d dVar2 = (d) this.f10226m;
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return x.a;
        }

        public final Object k(Object obj, Object obj2, Object obj3) {
            return ((C0729a) s((d) obj, (Throwable) obj2, (kotlin.c0.d) obj3)).i(x.a);
        }

        public final kotlin.c0.d<x> s(d<? super c<? extends T>> dVar, Throwable th, kotlin.c0.d<? super x> dVar2) {
            kotlin.jvm.internal.k.e(dVar, "$this$create");
            kotlin.jvm.internal.k.e(th, "throwable");
            kotlin.jvm.internal.k.e(dVar2, "continuation");
            C0729a aVar = new C0729a(dVar2);
            aVar.f10224k = dVar;
            aVar.f10225l = th;
            return aVar;
        }
    }

    @f(c = "com.sensorberg.util.couroutine.CoroutineGuard", f = "CoroutineGuard.kt", l = {44}, m = "safeResult")
    /* compiled from: CoroutineGuard.kt */
    static final class b extends kotlin.c0.j.a.d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f10228j;

        /* renamed from: k  reason: collision with root package name */
        int f10229k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ a f10230l;

        /* renamed from: m  reason: collision with root package name */
        Object f10231m;

        /* renamed from: n  reason: collision with root package name */
        Object f10232n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, kotlin.c0.d dVar) {
            super(dVar);
            this.f10230l = aVar;
        }

        public final Object i(Object obj) {
            this.f10228j = obj;
            this.f10229k |= RecyclerView.UNDEFINED_DURATION;
            return this.f10230l.c((kotlin.e0.c.l) null, this);
        }
    }

    private a() {
    }

    public final <T> kotlinx.coroutines.e3.c<c<T>> a(kotlinx.coroutines.e3.c<? extends c<? extends T>> cVar) {
        kotlin.jvm.internal.k.e(cVar, "$this$catchThrowable");
        return e.a(cVar, new C0729a((kotlin.c0.d) null));
    }

    public final <T> kotlinx.coroutines.e3.c<c<T>> b(kotlin.e0.c.a<? extends kotlinx.coroutines.e3.c<? extends c<? extends T>>> aVar) {
        kotlin.jvm.internal.k.e(aVar, "block");
        try {
            return (kotlinx.coroutines.e3.c) aVar.d();
        } catch (Exception e2) {
            return e.k(new c.a((List<? extends Throwable>) m.b(e2)));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> java.lang.Object c(kotlin.e0.c.l<? super kotlin.c0.d<? super g.e.m.c<? extends T>>, ? extends java.lang.Object> r5, kotlin.c0.d<? super g.e.m.c<? extends T>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof g.e.p.a.a.b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            g.e.p.a.a$b r0 = (g.e.p.a.a.b) r0
            int r1 = r0.f10229k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10229k = r1
            goto L_0x0018
        L_0x0013:
            g.e.p.a.a$b r0 = new g.e.p.a.a$b
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f10228j
            java.lang.Object r1 = kotlin.c0.i.d.c()
            int r2 = r0.f10229k
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r5 = r0.f10232n
            kotlin.e0.c.l r5 = (kotlin.e0.c.l) r5
            java.lang.Object r5 = r0.f10231m
            g.e.p.a.a r5 = (g.e.p.a.a) r5
            kotlin.l.b(r6)     // Catch:{ Exception -> 0x004c }
            goto L_0x0049
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            kotlin.l.b(r6)
            r0.f10231m = r4     // Catch:{ Exception -> 0x004c }
            r0.f10232n = r5     // Catch:{ Exception -> 0x004c }
            r0.f10229k = r3     // Catch:{ Exception -> 0x004c }
            java.lang.Object r6 = r5.o(r0)     // Catch:{ Exception -> 0x004c }
            if (r6 != r1) goto L_0x0049
            return r1
        L_0x0049:
            g.e.m.c r6 = (g.e.m.c) r6     // Catch:{ Exception -> 0x004c }
            goto L_0x0056
        L_0x004c:
            r5 = move-exception
            g.e.m.c$a r6 = new g.e.m.c$a
            java.util.List r5 = kotlin.a0.m.b(r5)
            r6.<init>((java.util.List<? extends java.lang.Throwable>) r5)
        L_0x0056:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.p.a.a.c(kotlin.e0.c.l, kotlin.c0.d):java.lang.Object");
    }
}
