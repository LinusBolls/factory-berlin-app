package kotlinx.coroutines.flow.internal;

import kotlin.TypeCastException;
import kotlin.c0.g;
import kotlin.c0.h;
import kotlin.c0.j.a.d;
import kotlin.e0.c.p;
import kotlin.e0.c.q;
import kotlin.jvm.internal.l;
import kotlin.k;
import kotlin.x;
import kotlinx.coroutines.a2;

/* compiled from: SafeCollector.kt */
public final class n<T> extends d implements kotlinx.coroutines.e3.d<T> {

    /* renamed from: j  reason: collision with root package name */
    public final int f10923j;

    /* renamed from: k  reason: collision with root package name */
    private g f10924k;

    /* renamed from: l  reason: collision with root package name */
    private kotlin.c0.d<? super x> f10925l;

    /* renamed from: m  reason: collision with root package name */
    public final kotlinx.coroutines.e3.d<T> f10926m;

    /* renamed from: n  reason: collision with root package name */
    public final g f10927n;

    /* compiled from: SafeCollector.kt */
    static final class a extends l implements p<Integer, g.b, Integer> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f10928h = new a();

        a() {
            super(2);
        }

        public final int a(int i2, g.b bVar) {
            return i2 + 1;
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
            return Integer.valueOf(a(((Number) obj).intValue(), (g.b) obj2));
        }
    }

    public n(kotlinx.coroutines.e3.d<? super T> dVar, g gVar) {
        super(k.f10921h, h.f10600g);
        this.f10926m = dVar;
        this.f10927n = gVar;
        this.f10923j = ((Number) gVar.fold(0, a.f10928h)).intValue();
    }

    private final void s(g gVar, g gVar2, T t) {
        if (!(gVar2 instanceof g)) {
            p.a(this, gVar);
            this.f10924k = gVar;
            return;
        }
        u((g) gVar2, t);
        throw null;
    }

    private final Object t(kotlin.c0.d<? super x> dVar, T t) {
        g c = dVar.c();
        a2.i(c);
        g gVar = this.f10924k;
        if (gVar != c) {
            s(c, gVar, t);
        }
        this.f10925l = dVar;
        q a2 = o.a;
        kotlinx.coroutines.e3.d<T> dVar2 = this.f10926m;
        if (dVar2 != null) {
            return a2.k(dVar2, t, this);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
    }

    private final void u(g gVar, Object obj) {
        throw new IllegalStateException(i.f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + gVar.f10919h + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    public Object a(T t, kotlin.c0.d<? super x> dVar) {
        try {
            Object t2 = t(dVar, t);
            if (t2 == d.c()) {
                kotlin.c0.j.a.h.c(dVar);
            }
            return t2 == d.c() ? t2 : x.a;
        } catch (Throwable th) {
            this.f10924k = new g(th);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kotlin.c0.g c() {
        /*
            r1 = this;
            kotlin.c0.d<? super kotlin.x> r0 = r1.f10925l
            if (r0 == 0) goto L_0x000b
            kotlin.c0.g r0 = r0.c()
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            kotlin.c0.h r0 = kotlin.c0.h.f10600g
        L_0x000d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.n.c():kotlin.c0.g");
    }

    public Object i(Object obj) {
        Throwable c = k.c(obj);
        if (c != null) {
            this.f10924k = new g(c);
        }
        kotlin.c0.d<? super x> dVar = this.f10925l;
        if (dVar != null) {
            dVar.m(obj);
        }
        return d.c();
    }

    public void p() {
        super.p();
    }
}
