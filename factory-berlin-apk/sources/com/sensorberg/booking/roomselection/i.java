package com.sensorberg.booking.roomselection;

import android.content.res.Resources;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import com.sensorberg.booking.roomselection.g;
import e.p.h;
import g.e.n.c.j.a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.e0.c.l;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.x;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.x1;
import org.threeten.bp.LocalDate;

/* compiled from: RoomSelectionViewModel.kt */
public final class i extends n0 {

    /* renamed from: i  reason: collision with root package name */
    private final h.f f5038i;

    /* renamed from: j  reason: collision with root package name */
    private final LocalDate f5039j;

    /* renamed from: k  reason: collision with root package name */
    private final LocalDate f5040k;

    /* renamed from: l  reason: collision with root package name */
    private final e0<LocalDate> f5041l;

    /* renamed from: m  reason: collision with root package name */
    private final LiveData<LocalDate> f5042m;

    /* renamed from: n  reason: collision with root package name */
    private final String f5043n;
    /* access modifiers changed from: private */
    public final a.b o;
    private final e0<a.b> p;
    private final LiveData<h<g.a>> q;
    /* access modifiers changed from: private */
    public final e0<g.e.h.a.a<Integer>> r;
    private final LiveData<g.e.h.a.a<Integer>> s;
    /* access modifiers changed from: private */
    public final e0<List<a.b>> t;
    private final LiveData<List<a.b>> u;
    /* access modifiers changed from: private */
    public final l<List<? extends Throwable>, x> v = new e(this);
    private final g.e.n.g.c w;
    /* access modifiers changed from: private */
    public final g.e.n.g.x x;
    private final Resources y;

    /* compiled from: Transformations.kt */
    public static final class a<I, O> implements e.b.a.c.a<a.b, LiveData<h<g.a>>> {
        final /* synthetic */ i a;

        public a(i iVar) {
            this.a = iVar;
        }

        /* renamed from: b */
        public final LiveData<h<g.a>> a(a.b bVar) {
            a.b bVar2 = bVar;
            i iVar = this.a;
            k.d(bVar2, "rootUnit");
            return iVar.y(bVar2);
        }
    }

    /* compiled from: RoomSelectionViewModel.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: RoomSelectionViewModel.kt */
    static final class c<I, O> implements e.b.a.c.a<List<a.C0709a>, List<g.a>> {
        final /* synthetic */ i a;

        c(i iVar) {
            this.a = iVar;
        }

        /* renamed from: b */
        public final List<g.a> a(List<a.C0709a> list) {
            k.d(list, "bookableUnits");
            ArrayList arrayList = new ArrayList(o.p(list, 10));
            for (a.C0709a aVar : list) {
                i iVar = this.a;
                k.d(aVar, "it");
                arrayList.add(iVar.z(aVar));
            }
            return arrayList;
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class d<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return b.c(Long.valueOf(((g.e.n.c.h.a) t).b()), Long.valueOf(((g.e.n.c.h.a) t2).b()));
        }
    }

    /* compiled from: RoomSelectionViewModel.kt */
    static final class e extends kotlin.jvm.internal.l implements l<List<? extends Throwable>, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ i f5044h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(i iVar) {
            super(1);
            this.f5044h = iVar;
        }

        public final void a(List<? extends Throwable> list) {
            k.e(list, "errors");
            Throwable th = (Throwable) v.A(list);
            if (th != null) {
                n.a.a.l(th);
            }
            this.f5044h.r.s(new g.e.h.a.a(Integer.valueOf(g.e.b.h.load_bookable_units_error)));
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((List) obj);
            return x.a;
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.booking.roomselection.RoomSelectionViewModel$getRootUnits$1", f = "RoomSelectionViewModel.kt", l = {164}, m = "invokeSuspend")
    /* compiled from: RoomSelectionViewModel.kt */
    static final class f extends kotlin.c0.j.a.k implements p<i0, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f5045k;

        /* renamed from: l  reason: collision with root package name */
        Object f5046l;

        /* renamed from: m  reason: collision with root package name */
        int f5047m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ i f5048n;

        /* compiled from: RoomSelectionViewModel.kt */
        static final class a extends kotlin.jvm.internal.l implements l<List<? extends a.b>, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ f f5049h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(1);
                this.f5049h = fVar;
            }

            public final void a(List<a.b> list) {
                k.e(list, "rootUnits");
                List k2 = n.k(this.f5049h.f5048n.o);
                k2.addAll(list);
                this.f5049h.f5048n.t.s(k2);
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((List) obj);
                return x.a;
            }
        }

        /* compiled from: RoomSelectionViewModel.kt */
        static final class b extends kotlin.jvm.internal.l implements l<List<? extends Throwable>, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ f f5050h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(f fVar) {
                super(1);
                this.f5050h = fVar;
            }

            public final void a(List<? extends Throwable> list) {
                k.e(list, "throwableList");
                this.f5050h.f5048n.v.o(list);
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((List) obj);
                return x.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(i iVar, kotlin.c0.d dVar) {
            super(2, dVar);
            this.f5048n = iVar;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            k.e(dVar, "completion");
            f fVar = new f(this.f5048n, dVar);
            fVar.f5045k = (i0) obj;
            return fVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f5047m;
            if (i2 == 0) {
                kotlin.l.b(obj);
                i0 i0Var = this.f5045k;
                g.e.n.g.x v = this.f5048n.x;
                this.f5046l = i0Var;
                this.f5047m = 1;
                obj = v.getRootUnits(this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0 i0Var2 = (i0) this.f5046l;
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
            return ((f) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    static {
        new b((DefaultConstructorMarker) null);
    }

    public i(g.e.n.g.c cVar, g.e.n.g.x xVar, Resources resources, h.f fVar) {
        k.e(cVar, "bookingManager");
        k.e(xVar, "unitController");
        k.e(resources, "resources");
        k.e(fVar, "pagedListConfig");
        this.w = cVar;
        this.x = xVar;
        this.y = resources;
        this.f5038i = g.e.d.f.b(fVar, 2000);
        LocalDate x0 = LocalDate.x0();
        k.d(x0, "LocalDate.now()");
        this.f5039j = x0;
        LocalDate H0 = LocalDate.x0().H0(2);
        k.d(H0, "LocalDate.now().plusWeeks(2)");
        this.f5040k = H0;
        e0<LocalDate> e0Var = new e0<>();
        e0Var.u(LocalDate.x0());
        x xVar2 = x.a;
        this.f5041l = e0Var;
        this.f5042m = e0Var;
        String string = this.y.getString(g.e.b.h.label_room_availability_free);
        k.d(string, "resources.getString(R.st…l_room_availability_free)");
        this.f5043n = string;
        String string2 = this.y.getString(g.e.b.h.label_booking_all_locations);
        k.d(string2, "resources.getString(R.st…el_booking_all_locations)");
        this.o = new a.b("null", string2);
        e0<a.b> e0Var2 = new e0<>();
        this.p = e0Var2;
        LiveData<h<g.a>> c2 = m0.c(e0Var2, new a(this));
        k.b(c2, "Transformations.switchMap(this) { transform(it) }");
        this.q = c2;
        e0<g.e.h.a.a<Integer>> e0Var3 = new e0<>();
        this.r = e0Var3;
        this.s = e0Var3;
        e0<List<a.b>> e0Var4 = new e0<>();
        this.t = e0Var4;
        this.u = e0Var4;
        E();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0084, code lost:
        r14 = r13.y;
        r15 = g.e.b.h.label_room_availability_free_after;
        r1 = g.e.d.d.f9748d.c();
        r3 = r4.a();
        kotlin.jvm.internal.k.c(r3);
        r14 = r14.getString(r15, new java.lang.Object[]{r1.b(g.e.d.f.f(r3.longValue()))});
        kotlin.jvm.internal.k.d(r14, "resources.getString(R.st…rrent.endsAt!!.toDate()))");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ac, code lost:
        return r14;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String A(java.util.List<g.e.n.c.h.a> r14, org.threeten.bp.LocalDate r15) {
        /*
            r13 = this;
            int r0 = r14.size()
            java.lang.String r1 = "resources.getString(R.st…availability_unavailable)"
            if (r0 < 0) goto L_0x00b2
            r2 = 0
            r3 = 0
        L_0x000a:
            java.lang.Object r4 = r14.get(r3)
            g.e.n.c.h.a r4 = (g.e.n.c.h.a) r4
            int r5 = r14.size()
            r6 = 1
            int r5 = r5 - r6
            java.lang.String r7 = "resources.getString(R.st…rrent.endsAt!!.toDate()))"
            if (r3 != r5) goto L_0x0069
            java.lang.Long r14 = r4.a()
            if (r14 == 0) goto L_0x005d
            java.lang.Long r14 = r4.a()
            kotlin.jvm.internal.k.c(r14)
            long r8 = r14.longValue()
            long r14 = g.e.n.c.i.b.d(r15)
            int r0 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0034
            goto L_0x005d
        L_0x0034:
            android.content.res.Resources r14 = r13.y
            int r15 = g.e.b.h.label_room_availability_free_after
            java.lang.Object[] r0 = new java.lang.Object[r6]
            g.e.d.d r1 = g.e.d.d.f9748d
            org.threeten.bp.format.c r1 = r1.c()
            java.lang.Long r3 = r4.a()
            kotlin.jvm.internal.k.c(r3)
            long r3 = r3.longValue()
            org.threeten.bp.e r3 = g.e.d.f.f(r3)
            java.lang.String r1 = r1.b(r3)
            r0[r2] = r1
            java.lang.String r14 = r14.getString(r15, r0)
            kotlin.jvm.internal.k.d(r14, r7)
            goto L_0x0068
        L_0x005d:
            android.content.res.Resources r14 = r13.y
            int r15 = g.e.b.h.label_room_availability_unavailable
            java.lang.String r14 = r14.getString(r15)
            kotlin.jvm.internal.k.d(r14, r1)
        L_0x0068:
            return r14
        L_0x0069:
            int r5 = r3 + 1
            java.lang.Object r8 = r14.get(r5)
            g.e.n.c.h.a r8 = (g.e.n.c.h.a) r8
            java.lang.Long r9 = r4.a()
            long r10 = r8.b()
            if (r9 != 0) goto L_0x007c
            goto L_0x0084
        L_0x007c:
            long r8 = r9.longValue()
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x00ad
        L_0x0084:
            android.content.res.Resources r14 = r13.y
            int r15 = g.e.b.h.label_room_availability_free_after
            java.lang.Object[] r0 = new java.lang.Object[r6]
            g.e.d.d r1 = g.e.d.d.f9748d
            org.threeten.bp.format.c r1 = r1.c()
            java.lang.Long r3 = r4.a()
            kotlin.jvm.internal.k.c(r3)
            long r3 = r3.longValue()
            org.threeten.bp.e r3 = g.e.d.f.f(r3)
            java.lang.String r1 = r1.b(r3)
            r0[r2] = r1
            java.lang.String r14 = r14.getString(r15, r0)
            kotlin.jvm.internal.k.d(r14, r7)
            return r14
        L_0x00ad:
            if (r3 == r0) goto L_0x00b2
            r3 = r5
            goto L_0x000a
        L_0x00b2:
            android.content.res.Resources r14 = r13.y
            int r15 = g.e.b.h.label_room_availability_unavailable
            java.lang.String r14 = r14.getString(r15)
            kotlin.jvm.internal.k.d(r14, r1)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.booking.roomselection.i.A(java.util.List, org.threeten.bp.LocalDate):java.lang.String");
    }

    private final void E() {
        x1 unused = e.b(o0.a(this), (kotlin.c0.g) null, (l0) null, new f(this, (kotlin.c0.d) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final LiveData<h<g.a>> y(a.b bVar) {
        e.p.f<String, ToValue> r2 = d.f5019j.a(this.w, o0.a(this), k.a(bVar, this.o) ? null : bVar.a(), this.v).r(new c(this));
        k.d(r2, "BookableUnitsDataSource.…SelectionItem(it) }\n\t\t\t\t}");
        LiveData<h<g.a>> a2 = new e.p.e(g.e.d.a.a.a(r2), this.f5038i).a();
        k.d(a2, "LivePagedListBuilder(Abs… pagedListConfig).build()");
        return a2;
    }

    /* access modifiers changed from: private */
    public final g.a z(a.C0709a aVar) {
        f fVar;
        List<T> N = v.N(aVar.d(), new d());
        LocalDate l2 = this.f5041l.l();
        if (l2 != null) {
            LocalDate localDate = l2;
            org.threeten.bp.e m0 = org.threeten.bp.e.m0();
            k.d(m0, "LocalDateTime.now()");
            if (N.isEmpty()) {
                fVar = new f(this.f5043n, g.e.b.d.badge_free);
            } else if (((g.e.n.c.h.a) N.get(0)).b() > g.e.n.c.i.b.e(m0)) {
                String string = this.y.getString(g.e.b.h.label_room_availability_free_until, new Object[]{g.e.d.d.f9748d.c().b(g.e.d.f.f(((g.e.n.c.h.a) N.get(0)).b()))});
                k.d(string, "resources.getString(R.st…ds[0].startsAt.toDate()))");
                fVar = new f(string, g.e.b.d.badge_free);
            } else {
                LocalDate F0 = localDate.F0(1);
                k.d(F0, "currentSelectedLocalDate.plusDays(1)");
                fVar = new f(A(N, F0), ((g.e.n.c.h.a) N.get(0)).c() ? g.e.b.d.badge_booked_by_me : g.e.b.d.badge_booked);
            }
            return new g.a(aVar.b(), aVar.c(), fVar.b(), g.e.b.d.gateway, fVar.a());
        }
        throw new IllegalArgumentException("LocalDate should not be null".toString());
    }

    public final LiveData<h<g.a>> B() {
        return this.q;
    }

    public final LiveData<LocalDate> C() {
        return this.f5042m;
    }

    public final LiveData<List<a.b>> D() {
        return this.u;
    }

    public final LiveData<g.e.h.a.a<Integer>> F() {
        return this.s;
    }

    public final void G(a.b bVar) {
        k.e(bVar, "rootUnit");
        this.p.u(bVar);
    }

    public final void H(LocalDate localDate) {
        k.e(localDate, "localDate");
        if (localDate.M(this.f5039j) && localDate.O(this.f5040k)) {
            this.f5041l.u(localDate);
        }
    }
}
