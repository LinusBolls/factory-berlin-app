package com.sensorberg.booking.roomselection;

import e.p.f;
import g.e.n.c.j.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.c0.g;
import kotlin.e0.c.l;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.x;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.x1;

/* compiled from: BookableUnitsDataSource.kt */
public final class d extends f<String, a.C0709a> {

    /* renamed from: j  reason: collision with root package name */
    public static final a f5019j = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final g.e.n.g.c f5020f;

    /* renamed from: g  reason: collision with root package name */
    private final i0 f5021g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final String f5022h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final l<List<? extends Throwable>, x> f5023i;

    /* compiled from: BookableUnitsDataSource.kt */
    public static final class a {
        private a() {
        }

        public final f<String, a.C0709a> a(g.e.n.g.c cVar, i0 i0Var, String str, l<? super List<? extends Throwable>, x> lVar) {
            k.e(cVar, "bookingManager");
            k.e(i0Var, "coroutineScope");
            k.e(lVar, "errorCallback");
            return new d(cVar, i0Var, str, lVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.booking.roomselection.BookableUnitsDataSource$loadAfter$1", f = "BookableUnitsDataSource.kt", l = {35}, m = "invokeSuspend")
    /* compiled from: BookableUnitsDataSource.kt */
    static final class b extends kotlin.c0.j.a.k implements p<i0, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f5024k;

        /* renamed from: l  reason: collision with root package name */
        Object f5025l;

        /* renamed from: m  reason: collision with root package name */
        int f5026m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ d f5027n;
        final /* synthetic */ f.C0581f o;
        final /* synthetic */ f.a p;

        /* compiled from: BookableUnitsDataSource.kt */
        static final class a extends kotlin.jvm.internal.l implements l<g.e.n.c.b<a.C0709a>, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ b f5028h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar) {
                super(1);
                this.f5028h = bVar;
            }

            public final void a(g.e.n.c.b<a.C0709a> bVar) {
                k.e(bVar, "paged");
                List<a.C0709a> a = bVar.a();
                d dVar = this.f5028h.f5027n;
                ArrayList arrayList = new ArrayList();
                for (T next : a) {
                    if (dVar.y((a.C0709a) next)) {
                        arrayList.add(next);
                    }
                }
                this.f5028h.p.a(arrayList, bVar.b());
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((g.e.n.c.b) obj);
                return x.a;
            }
        }

        /* renamed from: com.sensorberg.booking.roomselection.d$b$b  reason: collision with other inner class name */
        /* compiled from: BookableUnitsDataSource.kt */
        static final class C0154b extends kotlin.jvm.internal.l implements l<List<? extends Throwable>, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ b f5029h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0154b(b bVar) {
                super(1);
                this.f5029h = bVar;
            }

            public final void a(List<? extends Throwable> list) {
                k.e(list, "it");
                this.f5029h.f5027n.f5023i.o(list);
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((List) obj);
                return x.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, f.C0581f fVar, f.a aVar, kotlin.c0.d dVar2) {
            super(2, dVar2);
            this.f5027n = dVar;
            this.o = fVar;
            this.p = aVar;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            k.e(dVar, "completion");
            b bVar = new b(this.f5027n, this.o, this.p, dVar);
            bVar.f5024k = (i0) obj;
            return bVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f5026m;
            if (i2 == 0) {
                kotlin.l.b(obj);
                i0 i0Var = this.f5024k;
                g.e.n.g.c v = this.f5027n.f5020f;
                String x = this.f5027n.f5022h;
                g.e.n.c.a aVar = new g.e.n.c.a(kotlin.c0.j.a.b.b(this.o.b), (String) this.o.a);
                this.f5025l = i0Var;
                this.f5026m = 1;
                obj = v.o(x, aVar, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0 i0Var2 = (i0) this.f5025l;
                kotlin.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.e.m.c cVar = (g.e.m.c) obj;
            cVar.e(new a(this));
            cVar.d(new C0154b(this));
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((b) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.booking.roomselection.BookableUnitsDataSource$loadInitial$1", f = "BookableUnitsDataSource.kt", l = {20}, m = "invokeSuspend")
    /* compiled from: BookableUnitsDataSource.kt */
    static final class c extends kotlin.c0.j.a.k implements p<i0, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f5030k;

        /* renamed from: l  reason: collision with root package name */
        Object f5031l;

        /* renamed from: m  reason: collision with root package name */
        int f5032m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ d f5033n;
        final /* synthetic */ f.e o;
        final /* synthetic */ f.c p;

        /* compiled from: BookableUnitsDataSource.kt */
        static final class a extends kotlin.jvm.internal.l implements l<g.e.n.c.b<a.C0709a>, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ c f5034h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar) {
                super(1);
                this.f5034h = cVar;
            }

            public final void a(g.e.n.c.b<a.C0709a> bVar) {
                k.e(bVar, "paged");
                List<a.C0709a> a = bVar.a();
                d dVar = this.f5034h.f5033n;
                ArrayList arrayList = new ArrayList();
                for (T next : a) {
                    if (dVar.y((a.C0709a) next)) {
                        arrayList.add(next);
                    }
                }
                this.f5034h.p.a(arrayList, null, bVar.b());
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((g.e.n.c.b) obj);
                return x.a;
            }
        }

        /* compiled from: BookableUnitsDataSource.kt */
        static final class b extends kotlin.jvm.internal.l implements l<List<? extends Throwable>, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ c f5035h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(c cVar) {
                super(1);
                this.f5035h = cVar;
            }

            public final void a(List<? extends Throwable> list) {
                k.e(list, "it");
                this.f5035h.f5033n.f5023i.o(list);
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((List) obj);
                return x.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar, f.e eVar, f.c cVar, kotlin.c0.d dVar2) {
            super(2, dVar2);
            this.f5033n = dVar;
            this.o = eVar;
            this.p = cVar;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            k.e(dVar, "completion");
            c cVar = new c(this.f5033n, this.o, this.p, dVar);
            cVar.f5030k = (i0) obj;
            return cVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f5032m;
            if (i2 == 0) {
                kotlin.l.b(obj);
                i0 i0Var = this.f5030k;
                g.e.n.g.c v = this.f5033n.f5020f;
                String x = this.f5033n.f5022h;
                g.e.n.c.a aVar = new g.e.n.c.a(kotlin.c0.j.a.b.b(this.o.a), (String) null);
                this.f5031l = i0Var;
                this.f5032m = 1;
                obj = v.o(x, aVar, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0 i0Var2 = (i0) this.f5031l;
                kotlin.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.e.m.c cVar = (g.e.m.c) obj;
            cVar.e(new a(this));
            cVar.d(new b(this));
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((c) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    public /* synthetic */ d(g.e.n.g.c cVar, i0 i0Var, String str, l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, i0Var, str, lVar);
    }

    /* access modifiers changed from: private */
    public final boolean y(a.C0709a aVar) {
        return !k.a(aVar.a(), "locker");
    }

    public void o(f.C0581f<String> fVar, f.a<String, a.C0709a> aVar) {
        k.e(fVar, "params");
        k.e(aVar, "callback");
        x1 unused = e.b(this.f5021g, (g) null, (l0) null, new b(this, fVar, aVar, (kotlin.c0.d) null), 3, (Object) null);
    }

    public void p(f.C0581f<String> fVar, f.a<String, a.C0709a> aVar) {
        k.e(fVar, "params");
        k.e(aVar, "callback");
        aVar.a(n.g(), null);
    }

    public void q(f.e<String> eVar, f.c<String, a.C0709a> cVar) {
        k.e(eVar, "params");
        k.e(cVar, "callback");
        x1 unused = e.b(this.f5021g, (g) null, (l0) null, new c(this, eVar, cVar, (kotlin.c0.d) null), 3, (Object) null);
    }

    private d(g.e.n.g.c cVar, i0 i0Var, String str, l<? super List<? extends Throwable>, x> lVar) {
        this.f5020f = cVar;
        this.f5021g = i0Var;
        this.f5022h = str;
        this.f5023i = lVar;
    }
}
