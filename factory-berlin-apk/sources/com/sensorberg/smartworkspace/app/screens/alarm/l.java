package com.sensorberg.smartworkspace.app.screens.alarm;

import android.content.DialogInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.i.a;
import com.sensorberg.smartworkspace.app.i.b;
import com.sensorberg.smartworkspace.app.i.c;
import com.sensorberg.smartworkspace.app.screens.alarm.m;
import g.e.n.g.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.c0.d;
import kotlin.c0.g;
import kotlin.c0.j.a.k;
import kotlin.e0.c.p;
import kotlin.x;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.x1;

/* compiled from: AlarmViewModel.kt */
public final class l extends n0 implements f {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final c0<List<m>> f7324i;

    /* renamed from: j  reason: collision with root package name */
    private final LiveData<List<m>> f7325j;

    /* renamed from: k  reason: collision with root package name */
    private final e0<Boolean> f7326k;

    /* renamed from: l  reason: collision with root package name */
    private final LiveData<Boolean> f7327l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public m.b f7328m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f7329n;
    private final e0<g.e.h.a.a<Integer>> o;
    private final LiveData<g.e.h.a.a<Integer>> p;
    private final e0<g.e.h.a.a<String>> q;
    private final LiveData<g.e.h.a.a<String>> r;
    private final m.c s = new m.c(R.string.label_alarm);
    private final m.a t = new m.a(R.string.info_alarm);
    private final p<DialogInterface, Integer, x> u;
    /* access modifiers changed from: private */
    public final f v;
    /* access modifiers changed from: private */
    public final b w;
    private final g.e.a.b x;
    private final com.sensorberg.smartworkspace.app.utils.c y;

    /* compiled from: AlarmViewModel.kt */
    static final class a<T> implements f0<a.d> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ l f7330g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f7331h;

        a(l lVar, String str) {
            this.f7330g = lVar;
            this.f7331h = str;
        }

        /* renamed from: a */
        public final void k(a.d dVar) {
            this.f7330g.I(dVar);
            String str = this.f7331h;
            if (str != null) {
                this.f7330g.H(str);
            }
        }
    }

    /* compiled from: AlarmViewModel.kt */
    static final class b extends kotlin.jvm.internal.l implements p<DialogInterface, Integer, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ l f7332h;

        @kotlin.c0.j.a.f(c = "com.sensorberg.smartworkspace.app.screens.alarm.AlarmViewModel$alarmActivationConfirmed$1$1", f = "AlarmViewModel.kt", l = {116}, m = "invokeSuspend")
        /* compiled from: AlarmViewModel.kt */
        static final class a extends k implements p<i0, d<? super x>, Object> {

            /* renamed from: k  reason: collision with root package name */
            private i0 f7333k;

            /* renamed from: l  reason: collision with root package name */
            Object f7334l;

            /* renamed from: m  reason: collision with root package name */
            int f7335m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ b f7336n;
            final /* synthetic */ com.sensorberg.smartworkspace.app.i.b o;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar, com.sensorberg.smartworkspace.app.i.b bVar2, d dVar) {
                super(2, dVar);
                this.f7336n = bVar;
                this.o = bVar2;
            }

            public final d<x> b(Object obj, d<?> dVar) {
                kotlin.jvm.internal.k.e(dVar, "completion");
                a aVar = new a(this.f7336n, this.o, dVar);
                aVar.f7333k = (i0) obj;
                return aVar;
            }

            public final Object i(Object obj) {
                List list;
                Object c = d.c();
                int i2 = this.f7335m;
                if (i2 == 0) {
                    kotlin.l.b(obj);
                    i0 i0Var = this.f7333k;
                    f t = this.f7336n.f7332h.v;
                    com.sensorberg.smartworkspace.app.i.b bVar = this.o;
                    this.f7334l = i0Var;
                    this.f7335m = 1;
                    obj = t.C(bVar, this);
                    if (obj == c) {
                        return c;
                    }
                } else if (i2 == 1) {
                    i0 i0Var2 = (i0) this.f7334l;
                    kotlin.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.d dVar = (b.d) ((g.e.m.c) obj).a();
                b.f fVar = null;
                b.e c2 = dVar != null ? dVar.c() : null;
                b.a b = c2 != null ? c2.b() : null;
                if (c2 != null) {
                    fVar = c2.c();
                }
                if (b == null || fVar == null) {
                    return x.a;
                }
                this.f7336n.f7332h.N(b);
                List list2 = (List) this.f7336n.f7332h.f7324i.l();
                if (list2 == null || (list = v.T(list2)) == null) {
                    list = new ArrayList();
                }
                c0 u = this.f7336n.f7332h.f7324i;
                Iterator it = list.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    m mVar = (m) it.next();
                    if (kotlin.c0.j.a.b.a((mVar instanceof m.b) && kotlin.jvm.internal.k.a(((m.b) mVar).d(), b.d())).booleanValue()) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1) {
                    list.set(i3, this.f7336n.f7332h.K(b, fVar));
                }
                x xVar = x.a;
                u.u(list);
                this.f7336n.f7332h.w.b();
                return x.a;
            }

            public final Object l(Object obj, Object obj2) {
                return ((a) b(obj, (d) obj2)).i(x.a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(l lVar) {
            super(2);
            this.f7332h = lVar;
        }

        public final void a(DialogInterface dialogInterface, int i2) {
            kotlin.jvm.internal.k.e(dialogInterface, "<anonymous parameter 0>");
            m.b r = this.f7332h.f7328m;
            kotlin.jvm.internal.k.c(r);
            x1 unused = e.b(o0.a(this.f7332h), (g) null, (l0) null, new a(this, new com.sensorberg.smartworkspace.app.i.b(r.d()), (d) null), 3, (Object) null);
            this.f7332h.f7328m = null;
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
            a((DialogInterface) obj, ((Number) obj2).intValue());
            return x.a;
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartworkspace.app.screens.alarm.AlarmViewModel$snoozeAlarm$1", f = "AlarmViewModel.kt", l = {93}, m = "invokeSuspend")
    /* compiled from: AlarmViewModel.kt */
    static final class c extends k implements p<i0, d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f7337k;

        /* renamed from: l  reason: collision with root package name */
        Object f7338l;

        /* renamed from: m  reason: collision with root package name */
        int f7339m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ l f7340n;
        final /* synthetic */ com.sensorberg.smartworkspace.app.i.c o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(l lVar, com.sensorberg.smartworkspace.app.i.c cVar, d dVar) {
            super(2, dVar);
            this.f7340n = lVar;
            this.o = cVar;
        }

        public final d<x> b(Object obj, d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            c cVar = new c(this.f7340n, this.o, dVar);
            cVar.f7337k = (i0) obj;
            return cVar;
        }

        public final Object i(Object obj) {
            List list;
            Object c = d.c();
            int i2 = this.f7339m;
            if (i2 == 0) {
                kotlin.l.b(obj);
                i0 i0Var = this.f7337k;
                f t = this.f7340n.v;
                com.sensorberg.smartworkspace.app.i.c cVar = this.o;
                this.f7338l = i0Var;
                this.f7339m = 1;
                obj = t.C(cVar, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0 i0Var2 = (i0) this.f7338l;
                kotlin.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.d dVar = (c.d) ((g.e.m.c) obj).a();
            c.f fVar = null;
            c.e c2 = dVar != null ? dVar.c() : null;
            c.a b = c2 != null ? c2.b() : null;
            if (c2 != null) {
                fVar = c2.c();
            }
            if (b == null || fVar == null) {
                return x.a;
            }
            List list2 = (List) this.f7340n.f7324i.l();
            if (list2 == null || (list = v.T(list2)) == null) {
                list = new ArrayList();
            }
            c0 u = this.f7340n.f7324i;
            Iterator it = list.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                }
                m mVar = (m) it.next();
                if (kotlin.c0.j.a.b.a((mVar instanceof m.b) && kotlin.jvm.internal.k.a(((m.b) mVar).d(), b.d())).booleanValue()) {
                    break;
                }
                i3++;
            }
            if (i3 != -1) {
                list.set(i3, this.f7340n.L(b, fVar));
            }
            x xVar = x.a;
            u.u(list);
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((c) b(obj, (d) obj2)).i(x.a);
        }
    }

    public l(String str, f fVar, b bVar, g.e.a.b bVar2, com.sensorberg.smartworkspace.app.utils.c cVar) {
        kotlin.jvm.internal.k.e(fVar, "graphQl");
        kotlin.jvm.internal.k.e(bVar, "alarmDataSource");
        kotlin.jvm.internal.k.e(bVar2, "alarmScheduler");
        kotlin.jvm.internal.k.e(cVar, "buildConfig");
        this.v = fVar;
        this.w = bVar;
        this.x = bVar2;
        this.y = cVar;
        c0<List<m>> c0Var = new c0<>();
        this.f7324i = c0Var;
        this.f7325j = c0Var;
        e0<Boolean> e0Var = new e0<>();
        this.f7326k = e0Var;
        this.f7327l = e0Var;
        e0<g.e.h.a.a<Integer>> e0Var2 = new e0<>();
        this.o = e0Var2;
        this.p = e0Var2;
        e0<g.e.h.a.a<String>> e0Var3 = new e0<>();
        this.q = e0Var3;
        this.r = e0Var3;
        this.f7324i.v(this.w.a(), new a(this, str));
        this.u = new b(this);
    }

    /* access modifiers changed from: private */
    public final void H(String str) {
        List l2;
        if (str != null && !this.f7329n && (l2 = this.f7324i.l()) != null) {
            Iterator it = l2.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                m mVar = (m) it.next();
                if ((mVar instanceof m.b) && kotlin.jvm.internal.k.a(((m.b) mVar).d(), str)) {
                    break;
                }
                i2++;
            }
            if (i2 > -1) {
                this.o.u(new g.e.h.a.a(Integer.valueOf(i2)));
                this.f7329n = true;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void I(a.d dVar) {
        List<T> list;
        a.C0430a b2;
        List<a.e> b3;
        if (dVar != null) {
            a.g c2 = dVar.c();
            if (c2 == null || (b2 = c2.b()) == null || (b3 = b2.b()) == null || (list = v.w(b3)) == null) {
                list = n.g();
            }
            c0<List<m>> c0Var = this.f7324i;
            List k2 = n.k(this.s, this.t);
            ArrayList arrayList = new ArrayList(o.p(list, 10));
            for (T J : list) {
                arrayList.add(J(J));
            }
            k2.addAll(arrayList);
            x xVar = x.a;
            c0Var.u(k2);
        }
    }

    private final m.b J(a.e eVar) {
        return M(eVar.d(), eVar.f().b(), eVar.c(), eVar.e(), eVar.b());
    }

    /* access modifiers changed from: private */
    public final m.b K(b.a aVar, b.f fVar) {
        return M(aVar.d(), fVar.b(), aVar.c(), aVar.e(), aVar.b());
    }

    /* access modifiers changed from: private */
    public final m.b L(c.a aVar, c.f fVar) {
        return M(aVar.d(), fVar.b(), aVar.c(), aVar.e(), aVar.b());
    }

    private final m.b M(String str, String str2, Long l2, int i2, boolean z) {
        if (str2 == null) {
            str2 = "unknown";
        }
        return new m.b(str, str2, z, l2 != null ? l2.longValue() : -1, i2);
    }

    /* access modifiers changed from: private */
    public final void N(b.a aVar) {
        Long c2 = aVar.c();
        long longValue = c2 != null ? c2.longValue() : -1;
        boolean b2 = aVar.b();
        long s2 = longValue - this.y.s();
        if (b2 || s2 < g.e.h.b.c.b.c()) {
            this.x.a(aVar.d());
        }
    }

    public final void B() {
        this.f7326k.u(Boolean.FALSE);
        this.f7328m = null;
    }

    public final p<DialogInterface, Integer, x> C() {
        return this.u;
    }

    public final LiveData<g.e.h.a.a<String>> D() {
        return this.r;
    }

    public final LiveData<g.e.h.a.a<Integer>> E() {
        return this.p;
    }

    public final LiveData<Boolean> F() {
        return this.f7327l;
    }

    public final LiveData<List<m>> G() {
        return this.f7325j;
    }

    public void c(m.b bVar) {
        kotlin.jvm.internal.k.e(bVar, "item");
        this.f7328m = bVar;
        this.f7326k.u(Boolean.TRUE);
    }

    public void h(m.b bVar) {
        kotlin.jvm.internal.k.e(bVar, "item");
        x1 unused = e.b(o0.a(this), (g) null, (l0) null, new c(this, new com.sensorberg.smartworkspace.app.i.c(bVar.d(), bVar.e()), (d) null), 3, (Object) null);
    }
}
