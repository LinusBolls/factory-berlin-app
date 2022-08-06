package com.sensorberg.smartspaces.sdk.internal.q;

import androidx.lifecycle.LiveData;
import com.sensorberg.smartspaces.backend.model.BeBooking;
import com.sensorberg.smartspaces.backend.q.n;
import com.sensorberg.smartspaces.sdk.internal.d;
import com.sensorberg.smartspaces.sdk.model.Booking;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartspaces.sdk.model.Schedule;
import g.e.m.a;
import g.e.n.c.j.a;
import java.util.List;
import kotlin.e0.c.l;
import kotlin.x;
import org.threeten.bp.LocalDate;

/* compiled from: BookingManagerImpl.kt */
public final class a implements g.e.n.g.c {
    private final com.sensorberg.smartspaces.backend.b a;
    private final b b;
    /* access modifiers changed from: private */
    public final com.sensorberg.smartspaces.sdk.internal.p.e c;

    /* renamed from: d  reason: collision with root package name */
    private final g.e.k.a f6500d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final g.e.n.c.e.d.d f6501e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final g.e.n.c.e.d.f f6502f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final g.e.n.c.j.b.a f6503g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final g.e.n.c.h.b.c f6504h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final g.e.n.c.e.d.b f6505i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final g.e.n.c.h.b.a f6506j;

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartspaces.sdk.internal.booking.BookingManagerImpl$createBooking$2", f = "BookingManagerImpl.kt", l = {164}, m = "invokeSuspend")
    /* renamed from: com.sensorberg.smartspaces.sdk.internal.q.a$a  reason: collision with other inner class name */
    /* compiled from: BookingManagerImpl.kt */
    static final class C0388a extends kotlin.c0.j.a.k implements l<kotlin.c0.d<? super g.e.m.c<? extends g.e.n.c.e.b>>, Object> {

        /* renamed from: k  reason: collision with root package name */
        int f6507k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ a f6508l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f6509m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ String f6510n;
        final /* synthetic */ String o;
        final /* synthetic */ String p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0388a(a aVar, String str, String str2, String str3, String str4, kotlin.c0.d dVar) {
            super(1, dVar);
            this.f6508l = aVar;
            this.f6509m = str;
            this.f6510n = str2;
            this.o = str3;
            this.p = str4;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f6507k;
            if (i2 == 0) {
                kotlin.l.b(obj);
                g.e.n.c.e.d.b c2 = this.f6508l.f6505i;
                String str = this.f6509m;
                String str2 = this.f6510n;
                String str3 = this.o;
                String str4 = this.p;
                this.f6507k = 1;
                obj = c2.a(str, str2, str3, str4, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                kotlin.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        public final Object o(Object obj) {
            return ((C0388a) s((kotlin.c0.d) obj)).i(x.a);
        }

        public final kotlin.c0.d<x> s(kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            return new C0388a(this.f6508l, this.f6509m, this.f6510n, this.o, this.p, dVar);
        }
    }

    /* compiled from: BookingManagerImpl.kt */
    static final class b extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g.e.k.c f6511h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ g.e.k.e f6512i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ g.e.k.e f6513j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g.e.k.c cVar, g.e.k.e eVar, g.e.k.e eVar2) {
            super(0);
            this.f6511h = cVar;
            this.f6512i = eVar;
            this.f6513j = eVar2;
        }

        public final void a() {
            this.f6511h.A(this.f6512i);
            this.f6511h.A(this.f6513j);
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: BookingManagerImpl.kt */
    static final class c extends kotlin.jvm.internal.l implements l<Object, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g.e.k.e f6514h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ g.e.k.c f6515i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ b f6516j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ g.e.k.e f6517k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g.e.k.e eVar, g.e.k.c cVar, b bVar, g.e.k.e eVar2) {
            super(1);
            this.f6514h = eVar;
            this.f6515i = cVar;
            this.f6516j = bVar;
            this.f6517k = eVar2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Exception} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Exception} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.sensorberg.smartspaces.sdk.model.Booking} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Exception} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Exception} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Exception} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.lang.Object r6) {
            /*
                r5 = this;
                g.e.k.e r6 = r5.f6514h
                java.lang.Object r6 = r6.n()
                g.e.m.a r6 = (g.e.m.a) r6
                r0 = 0
                if (r6 == 0) goto L_0x0010
                g.e.m.a$b r6 = r6.f()
                goto L_0x0011
            L_0x0010:
                r6 = r0
            L_0x0011:
                g.e.m.a$b r1 = g.e.m.a.b.FAIL
                if (r6 != r1) goto L_0x0034
                g.e.k.c r6 = r5.f6515i
                g.e.m.a$a r1 = g.e.m.a.f9908e
                g.e.k.e r2 = r5.f6514h
                java.lang.Object r2 = r2.n()
                g.e.m.a r2 = (g.e.m.a) r2
                if (r2 == 0) goto L_0x0027
                java.lang.Exception r0 = r2.d()
            L_0x0027:
                g.e.m.a r0 = r1.c(r0)
                r6.w(r0)
                com.sensorberg.smartspaces.sdk.internal.q.a$b r6 = r5.f6516j
                r6.a()
                return
            L_0x0034:
                g.e.k.e r6 = r5.f6514h
                java.lang.Object r6 = r6.n()
                g.e.m.a r6 = (g.e.m.a) r6
                if (r6 == 0) goto L_0x0043
                g.e.m.a$b r6 = r6.f()
                goto L_0x0044
            L_0x0043:
                r6 = r0
            L_0x0044:
                g.e.m.a$b r1 = g.e.m.a.b.SUCCESS
                if (r6 != r1) goto L_0x00c0
                g.e.k.e r6 = r5.f6514h
                java.lang.Object r6 = r6.n()
                g.e.m.a r6 = (g.e.m.a) r6
                if (r6 == 0) goto L_0x0059
                java.lang.Object r6 = r6.c()
                com.sensorberg.smartspaces.backend.model.BeBooking r6 = (com.sensorberg.smartspaces.backend.model.BeBooking) r6
                goto L_0x005a
            L_0x0059:
                r6 = r0
            L_0x005a:
                if (r6 != 0) goto L_0x0074
                g.e.k.c r6 = r5.f6515i
                g.e.m.a$a r0 = g.e.m.a.f9908e
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Backend didn't return value"
                r1.<init>(r2)
                g.e.m.a r0 = r0.c(r1)
                r6.w(r0)
                com.sensorberg.smartspaces.sdk.internal.q.a$b r6 = r5.f6516j
                r6.a()
                return
            L_0x0074:
                g.e.k.e r1 = r5.f6517k
                java.lang.Object r1 = r1.n()
                g.e.m.a r1 = (g.e.m.a) r1
                if (r1 == 0) goto L_0x00c0
                java.lang.Object r1 = r1.c()
                java.util.List r1 = (java.util.List) r1
                if (r1 == 0) goto L_0x00c0
                java.util.Iterator r1 = r1.iterator()
            L_0x008a:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x00ac
                java.lang.Object r2 = r1.next()
                r3 = r2
                com.sensorberg.smartspaces.sdk.model.Booking r3 = (com.sensorberg.smartspaces.sdk.model.Booking) r3
                com.sensorberg.smartspaces.sdk.model.IotUnit r3 = r3.getIotUnit()
                if (r3 == 0) goto L_0x00a2
                java.lang.String r3 = r3.getActuatorId()
                goto L_0x00a3
            L_0x00a2:
                r3 = r0
            L_0x00a3:
                java.lang.String r4 = r6.actuatorId
                boolean r3 = kotlin.jvm.internal.k.a(r3, r4)
                if (r3 == 0) goto L_0x008a
                r0 = r2
            L_0x00ac:
                com.sensorberg.smartspaces.sdk.model.Booking r0 = (com.sensorberg.smartspaces.sdk.model.Booking) r0
                if (r0 == 0) goto L_0x00c0
                g.e.k.c r6 = r5.f6515i
                g.e.m.a$a r1 = g.e.m.a.f9908e
                g.e.m.a r0 = r1.d(r0)
                r6.w(r0)
                com.sensorberg.smartspaces.sdk.internal.q.a$b r6 = r5.f6516j
                r6.a()
            L_0x00c0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.sdk.internal.q.a.c.a(java.lang.Object):void");
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a(obj);
            return x.a;
        }
    }

    /* compiled from: BookingManagerImpl.kt */
    static final class d extends kotlin.jvm.internal.l implements l<Booking, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6518h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(1);
            this.f6518h = aVar;
        }

        public final void a(Booking booking) {
            this.f6518h.c.b();
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Booking) obj);
            return x.a;
        }
    }

    /* compiled from: BookingManagerImpl.kt */
    static final class e extends kotlin.jvm.internal.l implements l<g.e.m.a<BeBooking, Void>, g.e.m.a<Booking, Void>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6519h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ IotUnit f6520i;

        /* renamed from: com.sensorberg.smartspaces.sdk.internal.q.a$e$a  reason: collision with other inner class name */
        /* compiled from: BookingManagerImpl.kt */
        static final class C0389a extends kotlin.jvm.internal.l implements l<BeBooking, Booking> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ e f6521h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0389a(e eVar) {
                super(1);
                this.f6521h = eVar;
            }

            /* renamed from: a */
            public final Booking o(BeBooking beBooking) {
                e eVar = this.f6521h;
                return eVar.f6519h.n(beBooking, eVar.f6520i);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, IotUnit iotUnit) {
            super(1);
            this.f6519h = aVar;
            this.f6520i = iotUnit;
        }

        /* renamed from: a */
        public final g.e.m.a<Booking, Void> o(g.e.m.a<BeBooking, Void> aVar) {
            if (aVar != null) {
                return g.e.m.b.a(aVar, new C0389a(this));
            }
            return null;
        }
    }

    /* compiled from: BookingManagerImpl.kt */
    static final class f extends kotlin.jvm.internal.l implements l<Void, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6522h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(1);
            this.f6522h = aVar;
        }

        public final void a(Void voidR) {
            this.f6522h.c.b();
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Void) obj);
            return x.a;
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartspaces.sdk.internal.booking.BookingManagerImpl$getBookableParameters$2", f = "BookingManagerImpl.kt", l = {275}, m = "invokeSuspend")
    /* compiled from: BookingManagerImpl.kt */
    static final class g extends kotlin.c0.j.a.k implements l<kotlin.c0.d<? super g.e.m.c<? extends g.e.n.c.e.a>>, Object> {

        /* renamed from: k  reason: collision with root package name */
        int f6523k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ a f6524l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f6525m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar, String str, kotlin.c0.d dVar) {
            super(1, dVar);
            this.f6524l = aVar;
            this.f6525m = str;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f6523k;
            if (i2 == 0) {
                kotlin.l.b(obj);
                g.e.n.c.h.b.a d2 = this.f6524l.f6506j;
                String str = this.f6525m;
                this.f6523k = 1;
                obj = d2.a(str, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                kotlin.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        public final Object o(Object obj) {
            return ((g) s((kotlin.c0.d) obj)).i(x.a);
        }

        public final kotlin.c0.d<x> s(kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            return new g(this.f6524l, this.f6525m, dVar);
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartspaces.sdk.internal.booking.BookingManagerImpl$getBookableUnits$2", f = "BookingManagerImpl.kt", l = {87}, m = "invokeSuspend")
    /* compiled from: BookingManagerImpl.kt */
    static final class h extends kotlin.c0.j.a.k implements l<kotlin.c0.d<? super g.e.m.c<? extends g.e.n.c.b<a.C0709a>>>, Object> {

        /* renamed from: k  reason: collision with root package name */
        int f6526k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ a f6527l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f6528m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ g.e.n.c.a f6529n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar, String str, g.e.n.c.a aVar2, kotlin.c0.d dVar) {
            super(1, dVar);
            this.f6527l = aVar;
            this.f6528m = str;
            this.f6529n = aVar2;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f6526k;
            if (i2 == 0) {
                kotlin.l.b(obj);
                g.e.n.c.j.b.a e2 = this.f6527l.f6503g;
                String str = this.f6528m;
                g.e.n.c.a aVar = this.f6529n;
                this.f6526k = 1;
                obj = e2.a(str, aVar, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                kotlin.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        public final Object o(Object obj) {
            return ((h) s((kotlin.c0.d) obj)).i(x.a);
        }

        public final kotlin.c0.d<x> s(kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            return new h(this.f6527l, this.f6528m, this.f6529n, dVar);
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartspaces.sdk.internal.booking.BookingManagerImpl$getBookings$2", f = "BookingManagerImpl.kt", l = {66}, m = "invokeSuspend")
    /* compiled from: BookingManagerImpl.kt */
    static final class i extends kotlin.c0.j.a.k implements l<kotlin.c0.d<? super g.e.m.c<? extends g.e.n.c.b<g.e.n.c.e.b>>>, Object> {

        /* renamed from: k  reason: collision with root package name */
        int f6530k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ a f6531l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f6532m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ String f6533n;
        final /* synthetic */ g.e.n.c.a o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar, String str, String str2, g.e.n.c.a aVar2, kotlin.c0.d dVar) {
            super(1, dVar);
            this.f6531l = aVar;
            this.f6532m = str;
            this.f6533n = str2;
            this.o = aVar2;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f6530k;
            if (i2 == 0) {
                kotlin.l.b(obj);
                g.e.n.c.e.d.d g2 = this.f6531l.f6501e;
                String str = this.f6532m;
                String str2 = this.f6533n;
                g.e.n.c.a aVar = this.o;
                this.f6530k = 1;
                obj = g2.a(str, str2, aVar, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                kotlin.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        public final Object o(Object obj) {
            return ((i) s((kotlin.c0.d) obj)).i(x.a);
        }

        public final kotlin.c0.d<x> s(kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            return new i(this.f6531l, this.f6532m, this.f6533n, this.o, dVar);
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartspaces.sdk.internal.booking.BookingManagerImpl$getSchedules$2", f = "BookingManagerImpl.kt", l = {116}, m = "invokeSuspend")
    /* compiled from: BookingManagerImpl.kt */
    static final class j extends kotlin.c0.j.a.k implements l<kotlin.c0.d<? super g.e.m.c<? extends g.e.n.c.b<g.e.n.c.h.a>>>, Object> {

        /* renamed from: k  reason: collision with root package name */
        int f6534k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ a f6535l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f6536m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ String f6537n;
        final /* synthetic */ String o;
        final /* synthetic */ g.e.n.c.a p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(a aVar, String str, String str2, String str3, g.e.n.c.a aVar2, kotlin.c0.d dVar) {
            super(1, dVar);
            this.f6535l = aVar;
            this.f6536m = str;
            this.f6537n = str2;
            this.o = str3;
            this.p = aVar2;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f6534k;
            if (i2 == 0) {
                kotlin.l.b(obj);
                g.e.n.c.h.b.c h2 = this.f6535l.f6504h;
                String str = this.f6536m;
                String str2 = this.f6537n;
                String str3 = this.o;
                g.e.n.c.a aVar = this.p;
                this.f6534k = 1;
                obj = h2.a(str, str2, str3, aVar, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                kotlin.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        public final Object o(Object obj) {
            return ((j) s((kotlin.c0.d) obj)).i(x.a);
        }

        public final kotlin.c0.d<x> s(kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            return new j(this.f6535l, this.f6536m, this.f6537n, this.o, this.p, dVar);
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartspaces.sdk.internal.booking.BookingManagerImpl$removeBooking$2", f = "BookingManagerImpl.kt", l = {216}, m = "invokeSuspend")
    /* compiled from: BookingManagerImpl.kt */
    static final class k extends kotlin.c0.j.a.k implements l<kotlin.c0.d<? super g.e.m.c<? extends x>>, Object> {

        /* renamed from: k  reason: collision with root package name */
        int f6538k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ a f6539l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f6540m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(a aVar, String str, kotlin.c0.d dVar) {
            super(1, dVar);
            this.f6539l = aVar;
            this.f6540m = str;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f6538k;
            if (i2 == 0) {
                kotlin.l.b(obj);
                g.e.n.c.e.d.f i3 = this.f6539l.f6502f;
                String str = this.f6540m;
                this.f6538k = 1;
                obj = i3.a(str, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                kotlin.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        public final Object o(Object obj) {
            return ((k) s((kotlin.c0.d) obj)).i(x.a);
        }

        public final kotlin.c0.d<x> s(kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            return new k(this.f6539l, this.f6540m, dVar);
        }
    }

    public a(com.sensorberg.smartspaces.backend.b bVar, b bVar2, com.sensorberg.smartspaces.sdk.internal.p.e eVar, g.e.k.a aVar, g.e.n.c.e.d.d dVar, g.e.n.c.e.d.f fVar, g.e.n.c.j.b.a aVar2, g.e.n.c.h.b.c cVar, g.e.n.c.e.d.b bVar3, g.e.n.c.h.b.a aVar3) {
        kotlin.jvm.internal.k.e(bVar, "backendBookingsInterface");
        kotlin.jvm.internal.k.e(bVar2, "bookingMapper");
        kotlin.jvm.internal.k.e(eVar, "blueId");
        kotlin.jvm.internal.k.e(aVar, "logoutEvent");
        kotlin.jvm.internal.k.e(dVar, "getBookingsUseCase");
        kotlin.jvm.internal.k.e(fVar, "removeBookingUseCase");
        kotlin.jvm.internal.k.e(aVar2, "getBookableUnitsUseCase");
        kotlin.jvm.internal.k.e(cVar, "getScheduleUseCase");
        kotlin.jvm.internal.k.e(bVar3, "createBookingUseCase");
        kotlin.jvm.internal.k.e(aVar3, "getBookableParametersUseCase");
        this.a = bVar;
        this.b = bVar2;
        this.c = eVar;
        this.f6500d = aVar;
        this.f6501e = dVar;
        this.f6502f = fVar;
        this.f6503g = aVar2;
        this.f6504h = cVar;
        this.f6505i = bVar3;
        this.f6506j = aVar3;
    }

    /* access modifiers changed from: private */
    public final Booking n(BeBooking beBooking, IotUnit iotUnit) {
        Long l2 = null;
        if (beBooking == null) {
            return null;
        }
        String str = beBooking.id;
        kotlin.jvm.internal.k.d(str, "id");
        String str2 = beBooking.startsAt;
        kotlin.jvm.internal.k.d(str2, "startsAt");
        long a2 = n.a(str2);
        String str3 = beBooking.endsAt;
        if (str3 != null) {
            l2 = Long.valueOf(n.a(str3));
        }
        return new Booking(str, iotUnit, a2, l2);
    }

    public Object b(String str, kotlin.c0.d<? super g.e.m.c<x>> dVar) {
        return g.e.p.a.a.a.c(new k(this, str, (kotlin.c0.d) null), dVar);
    }

    public Object f(String str, kotlin.c0.d<? super g.e.m.c<g.e.n.c.e.a>> dVar) {
        return g.e.p.a.a.a.c(new g(this, str, (kotlin.c0.d) null), dVar);
    }

    public Object j(String str, String str2, String str3, String str4, kotlin.c0.d<? super g.e.m.c<g.e.n.c.e.b>> dVar) {
        return g.e.p.a.a.a.c(new C0388a(this, str, str2, str3, str4, (kotlin.c0.d) null), dVar);
    }

    public LiveData<g.e.m.a<Booking, Void>> k(IotUnit iotUnit, long j2, Long l2) {
        kotlin.jvm.internal.k.e(iotUnit, "iotUnit");
        if (this.f6500d.c()) {
            return com.sensorberg.smartspaces.sdk.internal.f.a(d.a.a);
        }
        String str = null;
        String actuatorId = iotUnit.getType() == IotUnit.Type.LOCKER_BOX ? iotUnit.getActuatorId() : null;
        String actuatorType$sdk_release = iotUnit.getType() == IotUnit.Type.LOCKER_BOX ? iotUnit.getActuatorType$sdk_release() : null;
        com.sensorberg.smartspaces.backend.b bVar = this.a;
        String unitId = iotUnit.getUnitId();
        String b2 = n.b(j2);
        if (l2 != null) {
            str = n.b(l2.longValue());
        }
        g.e.k.e<O> b3 = g.e.k.h.a.b(bVar.b(unitId, actuatorId, actuatorType$sdk_release, b2, str), new e(this, iotUnit));
        if (iotUnit.getHardwareType() == IotUnit.HardwareType.BLUE_ID) {
            g.e.m.e.e.a(b3, this.f6500d).f(new d(this));
        }
        return com.sensorberg.smartspaces.sdk.internal.f.b(b3, this.f6500d).x();
    }

    public LiveData<g.e.m.a<List<Booking>, Void>> m() {
        if (this.f6500d.c()) {
            return com.sensorberg.smartspaces.sdk.internal.f.a(d.a.a);
        }
        return this.b.b().x();
    }

    public Object o(String str, g.e.n.c.a aVar, kotlin.c0.d<? super g.e.m.c<g.e.n.c.b<a.C0709a>>> dVar) {
        return g.e.p.a.a.a.c(new h(this, str, aVar, (kotlin.c0.d) null), dVar);
    }

    public LiveData<g.e.m.a<Void, Void>> p(Booking booking) {
        kotlin.jvm.internal.k.e(booking, "booking");
        if (this.f6500d.c()) {
            return com.sensorberg.smartspaces.sdk.internal.f.a(d.a.a);
        }
        g.e.k.e<g.e.m.a<Void, Void>> a2 = this.a.a(booking.getId());
        IotUnit iotUnit = booking.getIotUnit();
        if ((iotUnit != null ? iotUnit.getHardwareType() : null) == IotUnit.HardwareType.BLUE_ID) {
            g.e.m.e.e.a(a2, this.f6500d).f(new f(this));
        }
        return com.sensorberg.smartspaces.sdk.internal.f.b(a2, this.f6500d).x();
    }

    public LiveData<g.e.m.a<List<Schedule>, Void>> r(LocalDate localDate, LocalDate localDate2, IotUnit iotUnit) {
        kotlin.jvm.internal.k.e(localDate, "from");
        kotlin.jvm.internal.k.e(localDate2, "to");
        if (this.f6500d.c()) {
            return com.sensorberg.smartspaces.sdk.internal.f.a(d.a.a);
        }
        return com.sensorberg.smartspaces.sdk.internal.f.b(this.b.a(localDate, localDate2, iotUnit), this.f6500d).x();
    }

    public Object s(String str, String str2, g.e.n.c.a aVar, kotlin.c0.d<? super g.e.m.c<g.e.n.c.b<g.e.n.c.e.b>>> dVar) {
        return g.e.p.a.a.a.c(new i(this, str, str2, aVar, (kotlin.c0.d) null), dVar);
    }

    public Object t(String str, String str2, String str3, g.e.n.c.a aVar, kotlin.c0.d<? super g.e.m.c<g.e.n.c.b<g.e.n.c.h.a>>> dVar) {
        return g.e.p.a.a.a.c(new j(this, str, str2, str3, aVar, (kotlin.c0.d) null), dVar);
    }

    public LiveData<g.e.m.a<Booking, Void>> u(String str, long j2) {
        kotlin.jvm.internal.k.e(str, "unitOrClusterId");
        if (this.f6500d.c()) {
            return com.sensorberg.smartspaces.sdk.internal.f.a(d.a.a);
        }
        g.e.k.c cVar = new g.e.k.c();
        cVar.w(a.C0681a.b(g.e.m.a.f9908e, (Object) null, (Object) null, 3, (Object) null));
        g.e.k.e<g.e.m.a<BeBooking, Void>> c2 = this.a.c(str, n.b(j2));
        g.e.k.e<g.e.m.a<List<Booking>, Void>> b2 = this.b.b();
        c cVar2 = new c(c2, cVar, new b(cVar, c2, b2), b2);
        cVar.z(c2, cVar2);
        cVar.z(b2, cVar2);
        return com.sensorberg.smartspaces.sdk.internal.f.b(cVar, this.f6500d).x();
    }
}
