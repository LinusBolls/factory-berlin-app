package com.sensorberg.booking.roomschedule;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import g.e.b.h;
import g.e.d.e;
import g.e.d.m;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.c0.j.a.k;
import kotlin.e0.c.p;
import kotlin.jvm.internal.l;
import kotlin.x;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.x1;
import org.threeten.bp.LocalDate;

/* compiled from: RoomScheduleViewModel.kt */
public class g extends n0 {

    /* renamed from: i  reason: collision with root package name */
    private final LiveData<Integer> f4973i = K(this.o, this.f4977m);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final e0<Boolean> f4974j;

    /* renamed from: k  reason: collision with root package name */
    private final LiveData<g.e.h.a.a<Boolean>> f4975k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final e0<g.e.d.e> f4976l;

    /* renamed from: m  reason: collision with root package name */
    private final LiveData<g.e.d.e> f4977m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final e0<List<g.e.n.c.h.a>> f4978n;
    private final LiveData<List<g.e.n.c.h.a>> o;
    /* access modifiers changed from: private */
    public final e0<Integer> p;
    private final LiveData<g.e.h.a.a<Integer>> q;
    /* access modifiers changed from: private */
    public final e0<Long> r;
    private final LiveData<Long> s;
    private final LocalDate t;
    /* access modifiers changed from: private */
    public final String u;
    /* access modifiers changed from: private */
    public final com.sensorberg.booking.roomschedule.i.e v;
    /* access modifiers changed from: private */
    public final com.sensorberg.booking.roomschedule.i.c w;
    /* access modifiers changed from: private */
    public final com.sensorberg.booking.roomschedule.i.a x;

    @kotlin.c0.j.a.f(c = "com.sensorberg.booking.roomschedule.RoomScheduleViewModel$createBooking$1", f = "RoomScheduleViewModel.kt", l = {64}, m = "invokeSuspend")
    /* compiled from: RoomScheduleViewModel.kt */
    static final class a extends k implements p<i0, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f4979k;

        /* renamed from: l  reason: collision with root package name */
        Object f4980l;

        /* renamed from: m  reason: collision with root package name */
        int f4981m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ g f4982n;
        final /* synthetic */ String o;
        final /* synthetic */ org.threeten.bp.e p;
        final /* synthetic */ org.threeten.bp.e q;

        /* renamed from: com.sensorberg.booking.roomschedule.g$a$a  reason: collision with other inner class name */
        /* compiled from: RoomScheduleViewModel.kt */
        static final class C0152a extends l implements kotlin.e0.c.l<g.e.n.c.e.b, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ a f4983h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0152a(a aVar) {
                super(1);
                this.f4983h = aVar;
            }

            public final void a(g.e.n.c.e.b bVar) {
                kotlin.jvm.internal.k.e(bVar, "it");
                this.f4983h.f4982n.G();
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((g.e.n.c.e.b) obj);
                return x.a;
            }
        }

        /* compiled from: RoomScheduleViewModel.kt */
        static final class b extends l implements kotlin.e0.c.l<List<? extends Throwable>, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ a f4984h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(a aVar) {
                super(1);
                this.f4984h = aVar;
            }

            public final void a(List<? extends Throwable> list) {
                kotlin.jvm.internal.k.e(list, "throwableList");
                this.f4984h.f4982n.p.s(Integer.valueOf(h.create_booking_error));
                n.a.a.l((Throwable) v.z(list));
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((List) obj);
                return x.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar, String str, org.threeten.bp.e eVar, org.threeten.bp.e eVar2, kotlin.c0.d dVar) {
            super(2, dVar);
            this.f4982n = gVar;
            this.o = str;
            this.p = eVar;
            this.q = eVar2;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            a aVar = new a(this.f4982n, this.o, this.p, this.q, dVar);
            aVar.f4979k = (i0) obj;
            return aVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f4981m;
            if (i2 == 0) {
                kotlin.l.b(obj);
                i0 i0Var = this.f4979k;
                com.sensorberg.booking.roomschedule.i.a r = this.f4982n.x;
                String str = this.o;
                String c2 = g.e.n.c.i.b.c(this.p);
                String c3 = g.e.n.c.i.b.c(this.q);
                this.f4980l = i0Var;
                this.f4981m = 1;
                obj = r.a(str, c2, c3, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0 i0Var2 = (i0) this.f4980l;
                kotlin.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.e.m.c cVar = (g.e.m.c) obj;
            cVar.e(new C0152a(this));
            cVar.d(new b(this));
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((a) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.booking.roomschedule.RoomScheduleViewModel$getBookableParameter$1", f = "RoomScheduleViewModel.kt", l = {125}, m = "invokeSuspend")
    /* compiled from: RoomScheduleViewModel.kt */
    static final class b extends k implements p<i0, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f4985k;

        /* renamed from: l  reason: collision with root package name */
        Object f4986l;

        /* renamed from: m  reason: collision with root package name */
        int f4987m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ g f4988n;

        /* compiled from: RoomScheduleViewModel.kt */
        static final class a extends l implements kotlin.e0.c.l<g.e.n.c.e.a, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ b f4989h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar) {
                super(1);
                this.f4989h = bVar;
            }

            public final void a(g.e.n.c.e.a aVar) {
                kotlin.jvm.internal.k.e(aVar, "bookableParams");
                n.a.a.a("got bookable parameter", new Object[0]);
                if (aVar.a() != null) {
                    this.f4989h.f4988n.r.s(aVar.a());
                }
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((g.e.n.c.e.a) obj);
                return x.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar, kotlin.c0.d dVar) {
            super(2, dVar);
            this.f4988n = gVar;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            b bVar = new b(this.f4988n, dVar);
            bVar.f4985k = (i0) obj;
            return bVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f4987m;
            if (i2 == 0) {
                kotlin.l.b(obj);
                i0 i0Var = this.f4985k;
                com.sensorberg.booking.roomschedule.i.c s = this.f4988n.w;
                String v = this.f4988n.u;
                this.f4986l = i0Var;
                this.f4987m = 1;
                obj = s.a(v, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0 i0Var2 = (i0) this.f4986l;
                kotlin.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ((g.e.m.c) obj).e(new a(this));
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((b) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.booking.roomschedule.RoomScheduleViewModel$getSchedules$1", f = "RoomScheduleViewModel.kt", l = {107}, m = "invokeSuspend")
    /* compiled from: RoomScheduleViewModel.kt */
    static final class c extends k implements p<i0, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f4990k;

        /* renamed from: l  reason: collision with root package name */
        Object f4991l;

        /* renamed from: m  reason: collision with root package name */
        int f4992m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ g f4993n;
        final /* synthetic */ org.threeten.bp.e o;

        /* compiled from: RoomScheduleViewModel.kt */
        static final class a extends l implements kotlin.e0.c.l<List<? extends Throwable>, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ c f4994h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar) {
                super(1);
                this.f4994h = cVar;
            }

            public final void a(List<? extends Throwable> list) {
                kotlin.jvm.internal.k.e(list, "throwableList");
                this.f4994h.f4993n.f4974j.s(Boolean.FALSE);
                this.f4994h.f4993n.p.s(Integer.valueOf(h.receive_schedules_error));
                n.a.a.l((Throwable) v.z(list));
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((List) obj);
                return x.a;
            }
        }

        /* compiled from: RoomScheduleViewModel.kt */
        static final class b extends l implements kotlin.e0.c.l<List<? extends g.e.n.c.h.a>, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ c f4995h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(c cVar) {
                super(1);
                this.f4995h = cVar;
            }

            public final void a(List<g.e.n.c.h.a> list) {
                kotlin.jvm.internal.k.e(list, "timePeriodList");
                n.a.a.a("got schedules", new Object[0]);
                this.f4995h.f4993n.f4974j.s(Boolean.FALSE);
                e0 x = this.f4995h.f4993n.f4976l;
                e.a aVar = g.e.d.e.f9749d;
                org.threeten.bp.e eVar = this.f4995h.o;
                org.threeten.bp.e B0 = eVar.B0(2);
                kotlin.jvm.internal.k.d(B0, "from.plusWeeks(2)");
                x.s(aVar.a(eVar, B0));
                this.f4995h.f4993n.f4978n.s(list);
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((List) obj);
                return x.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar, org.threeten.bp.e eVar, kotlin.c0.d dVar) {
            super(2, dVar);
            this.f4993n = gVar;
            this.o = eVar;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            c cVar = new c(this.f4993n, this.o, dVar);
            cVar.f4990k = (i0) obj;
            return cVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f4992m;
            if (i2 == 0) {
                kotlin.l.b(obj);
                i0 i0Var = this.f4990k;
                com.sensorberg.booking.roomschedule.i.e t = this.f4993n.v;
                String v = this.f4993n.u;
                String c2 = g.e.n.c.i.b.c(this.o);
                org.threeten.bp.e B0 = this.o.B0(2);
                kotlin.jvm.internal.k.d(B0, "from.plusWeeks(2)");
                String c3 = g.e.n.c.i.b.c(B0);
                this.f4991l = i0Var;
                this.f4992m = 1;
                obj = t.a(v, c2, c3, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0 i0Var2 = (i0) this.f4991l;
                kotlin.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.e.m.c cVar = (g.e.m.c) obj;
            cVar.d(new a(this));
            cVar.e(new b(this));
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((c) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    /* compiled from: RoomScheduleViewModel.kt */
    static final class d extends l implements kotlin.e0.c.l<e0<Integer>, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ LiveData f4996h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ LiveData f4997i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(LiveData liveData, LiveData liveData2) {
            super(1);
            this.f4996h = liveData;
            this.f4997i = liveData2;
        }

        public final void a(e0<Integer> e0Var) {
            int i2;
            kotlin.jvm.internal.k.e(e0Var, "it");
            List list = (List) this.f4996h.l();
            g.e.d.e eVar = (g.e.d.e) this.f4997i.l();
            org.threeten.bp.e e2 = eVar != null ? eVar.e() : null;
            if (list != null && e2 != null) {
                long e3 = g.e.n.c.i.b.e(e2);
                if (m.f9758l.a(g.e.n.c.i.b.e(e2)) == m.Today) {
                    e3 = System.currentTimeMillis();
                }
                if (list.isEmpty() || ((g.e.n.c.h.a) list.get(0)).b() > e3) {
                    i2 = g.e.b.d.badge_free;
                } else if (((g.e.n.c.h.a) list.get(0)).c()) {
                    i2 = g.e.b.d.badge_booked_by_me;
                } else {
                    i2 = g.e.b.d.badge_booked;
                }
                Integer l2 = e0Var.l();
                if (l2 == null || i2 != l2.intValue()) {
                    e0Var.u(Integer.valueOf(i2));
                }
            }
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((e0) obj);
            return x.a;
        }
    }

    /* compiled from: RoomScheduleViewModel.kt */
    static final class e<I, O> implements e.b.a.c.a<Integer, g.e.h.a.a<? extends Integer>> {
        public static final e a = new e();

        e() {
        }

        /* renamed from: b */
        public final g.e.h.a.a<Integer> a(Integer num) {
            return new g.e.h.a.a<>(num);
        }
    }

    /* compiled from: RoomScheduleViewModel.kt */
    static final class f<I, O> implements e.b.a.c.a<Boolean, g.e.h.a.a<? extends Boolean>> {
        public static final f a = new f();

        f() {
        }

        /* renamed from: b */
        public final g.e.h.a.a<Boolean> a(Boolean bool) {
            return new g.e.h.a.a<>(bool);
        }
    }

    public g(LocalDate localDate, String str, com.sensorberg.booking.roomschedule.i.e eVar, com.sensorberg.booking.roomschedule.i.c cVar, com.sensorberg.booking.roomschedule.i.a aVar) {
        kotlin.jvm.internal.k.e(localDate, "fromLocalDate");
        kotlin.jvm.internal.k.e(str, "unitId");
        kotlin.jvm.internal.k.e(eVar, "getSchedulesUseCase");
        kotlin.jvm.internal.k.e(cVar, "getBookableParameterUseCase");
        kotlin.jvm.internal.k.e(aVar, "createBookingUseCase");
        this.t = localDate;
        this.u = str;
        this.v = eVar;
        this.w = cVar;
        this.x = aVar;
        e0<Boolean> e0Var = new e0<>();
        this.f4974j = e0Var;
        LiveData<g.e.h.a.a<Boolean>> b2 = m0.b(e0Var, f.a);
        kotlin.jvm.internal.k.d(b2, "Transformations.map(_showProgress) { Event(it) }");
        this.f4975k = b2;
        e0<g.e.d.e> e0Var2 = new e0<>();
        this.f4976l = e0Var2;
        this.f4977m = e0Var2;
        e0<List<g.e.n.c.h.a>> e0Var3 = new e0<>();
        this.f4978n = e0Var3;
        this.o = e0Var3;
        e0<Integer> e0Var4 = new e0<>();
        this.p = e0Var4;
        LiveData<g.e.h.a.a<Integer>> b3 = m0.b(e0Var4, e.a);
        kotlin.jvm.internal.k.d(b3, "Transformations.map(_showError) { Event(it) }");
        this.q = b3;
        e0<Long> e0Var5 = new e0<>(Long.valueOf(TimeUnit.MINUTES.toMillis(240)));
        this.r = e0Var5;
        this.s = e0Var5;
        G();
        D();
    }

    private final void D() {
        x1 unused = e.b(o0.a(this), (kotlin.c0.g) null, (l0) null, new b(this, (kotlin.c0.d) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void G() {
        org.threeten.bp.e W = this.t.W();
        kotlin.jvm.internal.k.d(W, "fromLocalDate.atStartOfDay()");
        this.f4974j.u(Boolean.TRUE);
        x1 unused = e.b(o0.a(this), (kotlin.c0.g) null, (l0) null, new c(this, W, (kotlin.c0.d) null), 3, (Object) null);
    }

    private final LiveData<Integer> K(LiveData<List<g.e.n.c.h.a>> liveData, LiveData<g.e.d.e> liveData2) {
        return g.e.d.p.a.c(new LiveData[]{liveData, liveData2}, new d(liveData, liveData2));
    }

    public final void B(String str, org.threeten.bp.e eVar, org.threeten.bp.e eVar2) {
        kotlin.jvm.internal.k.e(str, "unitId");
        kotlin.jvm.internal.k.e(eVar, "startLocalDateTime");
        kotlin.jvm.internal.k.e(eVar2, "endLocalDateTime");
        x1 unused = e.b(o0.a(this), (kotlin.c0.g) null, (l0) null, new a(this, str, eVar, eVar2, (kotlin.c0.d) null), 3, (Object) null);
    }

    public final LiveData<Integer> C() {
        return this.f4973i;
    }

    public final LiveData<Long> E() {
        return this.s;
    }

    public final LiveData<g.e.d.e> F() {
        return this.f4977m;
    }

    public final LiveData<g.e.h.a.a<Integer>> H() {
        return this.q;
    }

    public final LiveData<g.e.h.a.a<Boolean>> I() {
        return this.f4975k;
    }

    public final LiveData<List<g.e.n.c.h.a>> J() {
        return this.o;
    }
}
