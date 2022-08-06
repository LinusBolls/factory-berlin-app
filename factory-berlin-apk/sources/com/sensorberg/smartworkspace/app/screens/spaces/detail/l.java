package com.sensorberg.smartworkspace.app.screens.spaces.detail;

import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import com.sensorberg.factory.R;
import com.sensorberg.smartspaces.sdk.model.IotDevice;
import com.sensorberg.smartspaces.sdk.model.StateChangeRequest;
import com.sensorberg.smartworkspace.app.screens.spaces.IotDeviceIdentifier;
import com.sensorberg.smartworkspace.app.screens.spaces.detail.p;
import g.e.n.c.g.d;
import g.e.n.g.g;
import g.e.n.g.j;
import g.e.n.g.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.c0.j.a.k;
import kotlin.x;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.x1;

/* compiled from: SpaceDetailViewModel.kt */
public final class l extends n0 implements p.f.a, p.e.d.a, p.e.c, p.d.b.a, p.e.b.a, p.a.b, p.d.a.C0526a {
    private final c A;
    /* access modifiers changed from: private */
    public final j B;
    /* access modifiers changed from: private */
    public final Application C;
    private final com.sensorberg.smartworkspace.app.screens.settings.myrenz.a D;
    private final d0 E;

    /* renamed from: i  reason: collision with root package name */
    private final e0<Integer> f7834i;

    /* renamed from: j  reason: collision with root package name */
    private final e0<Boolean> f7835j;

    /* renamed from: k  reason: collision with root package name */
    private final e0<String> f7836k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final com.sensorberg.smartworkspace.app.utils.d<String, c> f7837l;

    /* renamed from: m  reason: collision with root package name */
    private final e0<g.e.h.a.a<androidx.navigation.p>> f7838m;

    /* renamed from: n  reason: collision with root package name */
    private final LiveData<g.e.h.a.a<androidx.navigation.p>> f7839n;
    private final c0<List<p>> o;
    private final LiveData<List<p>> p;
    /* access modifiers changed from: private */
    public final e0<Integer> q;
    private final LiveData<g.e.h.a.a<Integer>> r;
    /* access modifiers changed from: private */
    public final e0<String> s;
    private final LiveData<g.e.h.a.a<String>> t;
    /* access modifiers changed from: private */
    public final AtomicBoolean u;
    /* access modifiers changed from: private */
    public List<g.e.n.c.g.b> v;
    /* access modifiers changed from: private */
    public final String w;
    private final String x;
    /* access modifiers changed from: private */
    public final g.e.n.g.g y;
    private final g z;

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartworkspace.app.screens.spaces.detail.SpaceDetailViewModel$1", f = "SpaceDetailViewModel.kt", l = {}, m = "invokeSuspend")
    /* compiled from: SpaceDetailViewModel.kt */
    static final class a extends k implements kotlin.e0.c.p<i0, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f7840k;

        /* renamed from: l  reason: collision with root package name */
        int f7841l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ l f7842m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ c0 f7843n;

        /* renamed from: com.sensorberg.smartworkspace.app.screens.spaces.detail.l$a$a  reason: collision with other inner class name */
        /* compiled from: SpaceDetailViewModel.kt */
        static final class C0524a<T> implements f0<g.e.m.c<? extends List<? extends IotDevice>>> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ a f7844g;

            C0524a(a aVar) {
                this.f7844g = aVar;
            }

            /* renamed from: a */
            public final void k(g.e.m.c<? extends List<IotDevice>> cVar) {
                this.f7844g.f7843n.u(cVar);
            }
        }

        /* compiled from: SpaceDetailViewModel.kt */
        static final class b implements g.e.n.g.h {
            final /* synthetic */ a a;

            b(a aVar) {
                this.a = aVar;
            }

            public final boolean a(IotDevice iotDevice) {
                kotlin.jvm.internal.k.e(iotDevice, "it");
                return kotlin.jvm.internal.k.a(iotDevice.getContainedUnit().getId(), this.a.f7842m.w);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(l lVar, c0 c0Var, kotlin.c0.d dVar) {
            super(2, dVar);
            this.f7842m = lVar;
            this.f7843n = c0Var;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            a aVar = new a(this.f7842m, this.f7843n, dVar);
            aVar.f7840k = (i0) obj;
            return aVar;
        }

        public final Object i(Object obj) {
            Object unused = d.c();
            if (this.f7841l == 0) {
                kotlin.l.b(obj);
                LiveData a = m0.a(androidx.lifecycle.k.c(g.a.a(this.f7842m.y, t.None, new b(this), (g.e.n.g.k) null, 5000, 4, (Object) null), (kotlin.c0.g) null, 0, 3, (Object) null));
                kotlin.jvm.internal.k.b(a, "Transformations.distinctUntilChanged(this)");
                this.f7843n.v(a, new C0524a(this));
                return x.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object l(Object obj, Object obj2) {
            return ((a) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartworkspace.app.screens.spaces.detail.SpaceDetailViewModel$2", f = "SpaceDetailViewModel.kt", l = {}, m = "invokeSuspend")
    /* compiled from: SpaceDetailViewModel.kt */
    static final class b extends k implements kotlin.e0.c.p<List<? extends g.e.n.c.g.b>, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private List f7845k;

        /* renamed from: l  reason: collision with root package name */
        int f7846l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ l f7847m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(l lVar, kotlin.c0.d dVar) {
            super(2, dVar);
            this.f7847m = lVar;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            b bVar = new b(this.f7847m, dVar);
            bVar.f7845k = (List) obj;
            return bVar;
        }

        public final Object i(Object obj) {
            Object unused = d.c();
            if (this.f7846l == 0) {
                kotlin.l.b(obj);
                this.f7847m.v = this.f7845k;
                return x.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object l(Object obj, Object obj2) {
            return ((b) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    /* compiled from: SpaceDetailViewModel.kt */
    private static abstract class c {

        /* compiled from: SpaceDetailViewModel.kt */
        public static final class a extends c {
            private final boolean a;

            public a(boolean z) {
                super((DefaultConstructorMarker) null);
                this.a = z;
            }

            public final boolean a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof a) && this.a == ((a) obj).a;
                }
                return true;
            }

            public int hashCode() {
                boolean z = this.a;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public String toString() {
                return "Binary(checked=" + this.a + ")";
            }
        }

        /* compiled from: SpaceDetailViewModel.kt */
        public static final class b extends c {
            private final float a;

            public b(float f2) {
                super((DefaultConstructorMarker) null);
                this.a = f2;
            }

            public final float a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof b) && Float.compare(this.a, ((b) obj).a) == 0;
                }
                return true;
            }

            public int hashCode() {
                return Float.floatToIntBits(this.a);
            }

            public String toString() {
                return "Numeric(value=" + this.a + ")";
            }
        }

        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SpaceDetailViewModel.kt */
    static final class d<I, O> implements e.b.a.c.a<String, g.e.h.a.a<? extends String>> {
        public static final d a = new d();

        d() {
        }

        /* renamed from: b */
        public final g.e.h.a.a<String> a(String str) {
            return new g.e.h.a.a<>(str);
        }
    }

    /* compiled from: SpaceDetailViewModel.kt */
    static final class e<I, O> implements e.b.a.c.a<Integer, g.e.h.a.a<? extends Integer>> {
        public static final e a = new e();

        e() {
        }

        /* renamed from: b */
        public final g.e.h.a.a<Integer> a(Integer num) {
            return new g.e.h.a.a<>(num);
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartworkspace.app.screens.spaces.detail.SpaceDetailViewModel$executeStateChangeRequest$1", f = "SpaceDetailViewModel.kt", l = {351}, m = "invokeSuspend")
    /* compiled from: SpaceDetailViewModel.kt */
    static final class f extends k implements kotlin.e0.c.p<i0, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f7848k;

        /* renamed from: l  reason: collision with root package name */
        Object f7849l;

        /* renamed from: m  reason: collision with root package name */
        int f7850m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ l f7851n;
        final /* synthetic */ StateChangeRequest o;
        final /* synthetic */ String p;

        /* compiled from: SpaceDetailViewModel.kt */
        static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<List<? extends Throwable>, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ f f7852h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(1);
                this.f7852h = fVar;
            }

            public final void a(List<? extends Throwable> list) {
                kotlin.jvm.internal.k.e(list, "throwables");
                this.f7852h.f7851n.f7837l.w(this.f7852h.p);
                this.f7852h.f7851n.q.u(Integer.valueOf(R.string.unknown_error));
                for (Throwable d2 : list) {
                    n.a.a.d(d2);
                }
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((List) obj);
                return x.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(l lVar, StateChangeRequest stateChangeRequest, String str, kotlin.c0.d dVar) {
            super(2, dVar);
            this.f7851n = lVar;
            this.o = stateChangeRequest;
            this.p = str;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            f fVar = new f(this.f7851n, this.o, this.p, dVar);
            fVar.f7848k = (i0) obj;
            return fVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f7850m;
            if (i2 == 0) {
                kotlin.l.b(obj);
                i0 i0Var = this.f7848k;
                g.e.n.g.g s = this.f7851n.y;
                StateChangeRequest stateChangeRequest = this.o;
                this.f7849l = i0Var;
                this.f7850m = 1;
                obj = s.v(stateChangeRequest, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0 i0Var2 = (i0) this.f7849l;
                kotlin.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ((g.e.m.c) obj).d(new a(this));
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((f) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    /* compiled from: SpaceDetailViewModel.kt */
    static final class g<T> implements f0<Object> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ l f7853g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c0 f7854h;

        g(l lVar, c0 c0Var) {
            this.f7853g = lVar;
            this.f7854h = c0Var;
        }

        public final void k(Object obj) {
            this.f7853g.J((g.e.m.c) this.f7854h.l(), (Map) this.f7853g.f7837l.l());
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartworkspace.app.screens.spaces.detail.SpaceDetailViewModel$onSwitchChanged$1", f = "SpaceDetailViewModel.kt", l = {126}, m = "invokeSuspend")
    /* compiled from: SpaceDetailViewModel.kt */
    static final class h extends k implements kotlin.e0.c.p<i0, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f7855k;

        /* renamed from: l  reason: collision with root package name */
        Object f7856l;

        /* renamed from: m  reason: collision with root package name */
        int f7857m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ l f7858n;
        final /* synthetic */ StateChangeRequest o;
        final /* synthetic */ p.e.d p;

        /* compiled from: SpaceDetailViewModel.kt */
        static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<List<? extends Throwable>, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ h f7859h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h hVar) {
                super(1);
                this.f7859h = hVar;
            }

            public final void a(List<? extends Throwable> list) {
                kotlin.jvm.internal.k.e(list, "throwables");
                this.f7859h.f7858n.f7837l.w(this.f7859h.p.a());
                for (Throwable d2 : list) {
                    n.a.a.d(d2);
                }
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((List) obj);
                return x.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(l lVar, StateChangeRequest stateChangeRequest, p.e.d dVar, kotlin.c0.d dVar2) {
            super(2, dVar2);
            this.f7858n = lVar;
            this.o = stateChangeRequest;
            this.p = dVar;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            h hVar = new h(this.f7858n, this.o, this.p, dVar);
            hVar.f7855k = (i0) obj;
            return hVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f7857m;
            if (i2 == 0) {
                kotlin.l.b(obj);
                i0 i0Var = this.f7855k;
                g.e.n.g.g s = this.f7858n.y;
                StateChangeRequest stateChangeRequest = this.o;
                this.f7856l = i0Var;
                this.f7857m = 1;
                obj = s.v(stateChangeRequest, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0 i0Var2 = (i0) this.f7856l;
                kotlin.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ((g.e.m.c) obj).d(new a(this));
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((h) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartworkspace.app.screens.spaces.detail.SpaceDetailViewModel$openLetterBox$1", f = "SpaceDetailViewModel.kt", l = {334}, m = "invokeSuspend")
    /* compiled from: SpaceDetailViewModel.kt */
    static final class i extends k implements kotlin.e0.c.p<i0, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f7860k;

        /* renamed from: l  reason: collision with root package name */
        Object f7861l;

        /* renamed from: m  reason: collision with root package name */
        int f7862m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ l f7863n;
        final /* synthetic */ g.e.n.c.g.b o;

        /* compiled from: SpaceDetailViewModel.kt */
        static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<List<? extends Throwable>, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ i f7864h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(i iVar) {
                super(1);
                this.f7864h = iVar;
            }

            public final void a(List<? extends Throwable> list) {
                kotlin.jvm.internal.k.e(list, "throwableList");
                this.f7864h.f7863n.s.u(((Throwable) v.z(list)).getMessage());
                for (Throwable d2 : list) {
                    n.a.a.d(d2);
                }
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((List) obj);
                return x.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(l lVar, g.e.n.c.g.b bVar, kotlin.c0.d dVar) {
            super(2, dVar);
            this.f7863n = lVar;
            this.o = bVar;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            i iVar = new i(this.f7863n, this.o, dVar);
            iVar.f7860k = (i0) obj;
            return iVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f7862m;
            if (i2 == 0) {
                kotlin.l.b(obj);
                i0 i0Var = this.f7860k;
                j u = this.f7863n.B;
                g.e.n.c.g.b bVar = this.o;
                Application r = this.f7863n.C;
                this.f7861l = i0Var;
                this.f7862m = 1;
                obj = u.B(bVar, r, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0 i0Var2 = (i0) this.f7861l;
                kotlin.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ((g.e.m.c) obj).d(new a(this));
            this.f7863n.u.set(false);
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((i) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    public l(String str, String str2, g.e.n.g.g gVar, g gVar2, c cVar, Handler handler, j jVar, Application application, com.sensorberg.smartworkspace.app.screens.settings.myrenz.a aVar, d0 d0Var) {
        kotlin.jvm.internal.k.e(str, "unitId");
        kotlin.jvm.internal.k.e(gVar, "iotDeviceController");
        kotlin.jvm.internal.k.e(gVar2, "rowWidgetFactory");
        kotlin.jvm.internal.k.e(cVar, "miniIconWidgetFactory");
        kotlin.jvm.internal.k.e(handler, "handler");
        kotlin.jvm.internal.k.e(jVar, "postBoxController");
        kotlin.jvm.internal.k.e(application, "application");
        kotlin.jvm.internal.k.e(aVar, "myRenzCredentialsRepository");
        kotlin.jvm.internal.k.e(d0Var, "dispatcher");
        this.w = str;
        this.x = str2;
        this.y = gVar;
        this.z = gVar2;
        this.A = cVar;
        this.B = jVar;
        this.C = application;
        this.D = aVar;
        this.E = d0Var;
        this.f7834i = new e0<>();
        this.f7835j = new e0<>();
        this.f7836k = new e0<>();
        this.f7837l = new com.sensorberg.smartworkspace.app.utils.d<>(handler);
        e0<g.e.h.a.a<androidx.navigation.p>> e0Var = new e0<>();
        this.f7838m = e0Var;
        this.f7839n = e0Var;
        c0<List<p>> c0Var = new c0<>();
        this.o = c0Var;
        this.p = c0Var;
        e0<Integer> e0Var2 = new e0<>();
        this.q = e0Var2;
        LiveData<g.e.h.a.a<Integer>> b2 = m0.b(e0Var2, e.a);
        kotlin.jvm.internal.k.d(b2, "Transformations.map(_displayMessage) { Event(it) }");
        this.r = b2;
        e0<String> e0Var3 = new e0<>();
        this.s = e0Var3;
        LiveData<g.e.h.a.a<String>> b3 = m0.b(e0Var3, d.a);
        kotlin.jvm.internal.k.d(b3, "Transformations.map(_displayError) { Event(it) }");
        this.t = b3;
        this.u = new AtomicBoolean(false);
        this.v = n.g();
        c0 c0Var2 = new c0();
        x1 unused = e.b(o0.a(this), this.E, (l0) null, new a(this, c0Var2, (kotlin.c0.d) null), 2, (Object) null);
        kotlinx.coroutines.e3.e.m(kotlinx.coroutines.e3.e.o(this.B.q(this.w), new b(this, (kotlin.c0.d) null)), o0.a(this));
        this.f7835j.u(Boolean.FALSE);
        g gVar3 = new g(this, c0Var2);
        this.o.v(this.f7834i, gVar3);
        this.o.v(this.f7835j, gVar3);
        this.o.v(this.f7836k, gVar3);
        this.o.v(c0Var2, gVar3);
        this.o.v(this.f7837l, gVar3);
        String str3 = this.x;
        if (str3 != null) {
            this.o.u(n.i(new p.g(), new p.c(str3, true)));
        }
    }

    private final androidx.navigation.p B(String str, String str2, IotDeviceIdentifier iotDeviceIdentifier) {
        return j.a.a(str, str2, iotDeviceIdentifier);
    }

    private final void C(StateChangeRequest stateChangeRequest, c cVar, String str) {
        this.f7837l.v(str, cVar, 7000);
        x1 unused = e.b(o0.a(this), this.E, (l0) null, new f(this, stateChangeRequest, str, (kotlin.c0.d) null), 2, (Object) null);
    }

    private final void H(g.e.n.c.g.b bVar) {
        if (bVar == null) {
            this.s.s("No nearby box");
            return;
        }
        g.e.n.c.g.d d2 = bVar.d();
        if (d2 instanceof d.b) {
            bVar = g.e.n.c.g.b.b(bVar, d.b.d((d.b) d2, (String) null, new g.e.n.c.g.e(this.D.b(), this.D.a()), 1, (Object) null), (BluetoothDevice) null, 2, (Object) null);
        }
        I(bVar);
    }

    private final void I(g.e.n.c.g.b bVar) {
        this.q.u(Integer.valueOf(R.string.label_opening_box));
        if (!this.u.getAndSet(true)) {
            x1 unused = e.b(o0.a(this), this.E, (l0) null, new i(this, bVar, (kotlin.c0.d) null), 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x013c, code lost:
        r6 = r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void J(g.e.m.c<? extends java.util.List<com.sensorberg.smartspaces.sdk.model.IotDevice>> r23, java.util.Map<java.lang.String, ? extends com.sensorberg.smartworkspace.app.screens.spaces.detail.l.c> r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            if (r1 == 0) goto L_0x0175
            boolean r3 = r1 instanceof g.e.m.c.a
            if (r3 == 0) goto L_0x0033
            androidx.lifecycle.e0<java.lang.Integer> r2 = r0.q
            r3 = 2131820949(0x7f110195, float:1.9274627E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.u(r3)
            g.e.m.c$a r1 = (g.e.m.c.a) r1
            java.util.List r1 = r1.g()
            java.util.Iterator r1 = r1.iterator()
        L_0x0022:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0032
            java.lang.Object r2 = r1.next()
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            n.a.a.d(r2)
            goto L_0x0022
        L_0x0032:
            return
        L_0x0033:
            java.util.List r1 = r22.M(r23)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0044
            boolean r5 = r24.isEmpty()
            if (r5 == 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r5 = 0
            goto L_0x0045
        L_0x0044:
            r5 = 1
        L_0x0045:
            if (r5 != 0) goto L_0x014a
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            androidx.lifecycle.c0<java.util.List<com.sensorberg.smartworkspace.app.screens.spaces.detail.p>> r4 = r0.o
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.a0.o.p(r1, r6)
            r5.<init>(r6)
            java.util.Iterator r1 = r1.iterator()
        L_0x005d:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0141
            java.lang.Object r6 = r1.next()
            com.sensorberg.smartworkspace.app.screens.spaces.detail.p r6 = (com.sensorberg.smartworkspace.app.screens.spaces.detail.p) r6
            java.lang.String r7 = r6.a()
            java.lang.Object r8 = r2.get(r7)
            com.sensorberg.smartworkspace.app.screens.spaces.detail.l$c r8 = (com.sensorberg.smartworkspace.app.screens.spaces.detail.l.c) r8
            boolean r9 = r6 instanceof com.sensorberg.smartworkspace.app.screens.spaces.detail.p.e.d
            if (r9 == 0) goto L_0x00d9
            boolean r9 = r8 instanceof com.sensorberg.smartworkspace.app.screens.spaces.detail.l.c.a
            if (r9 == 0) goto L_0x00d9
            r10 = r6
            com.sensorberg.smartworkspace.app.screens.spaces.detail.p$e$d r10 = (com.sensorberg.smartworkspace.app.screens.spaces.detail.p.e.d) r10
            com.sensorberg.smartspaces.sdk.model.Property$Binary r9 = r10.i()
            boolean r9 = r9.getValue()
            r11 = r8
            com.sensorberg.smartworkspace.app.screens.spaces.detail.l$c$a r11 = (com.sensorberg.smartworkspace.app.screens.spaces.detail.l.c.a) r11
            boolean r12 = r11.a()
            if (r9 != r12) goto L_0x00af
            r3.add(r7)
            boolean r9 = r10.k()
            if (r9 == 0) goto L_0x00d9
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 255(0xff, float:3.57E-43)
            r21 = 0
            com.sensorberg.smartworkspace.app.screens.spaces.detail.p$e$d r6 = com.sensorberg.smartworkspace.app.screens.spaces.detail.p.e.d.f(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x013c
        L_0x00af:
            com.sensorberg.smartspaces.sdk.model.Property$Binary r6 = r10.i()
            boolean r12 = r11.a()
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 62
            r19 = 0
            r11 = r6
            com.sensorberg.smartspaces.sdk.model.Property$Binary r12 = com.sensorberg.smartspaces.sdk.model.Property.Binary.copy$default(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r11 = 0
            r19 = 1
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r20 = 253(0xfd, float:3.55E-43)
            r21 = 0
            com.sensorberg.smartworkspace.app.screens.spaces.detail.p$e$d r6 = com.sensorberg.smartworkspace.app.screens.spaces.detail.p.e.d.f(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x013c
        L_0x00d9:
            boolean r9 = r6 instanceof com.sensorberg.smartworkspace.app.screens.spaces.detail.p.f
            if (r9 == 0) goto L_0x013c
            boolean r9 = r8 instanceof com.sensorberg.smartworkspace.app.screens.spaces.detail.l.c.b
            if (r9 == 0) goto L_0x013c
            r10 = r6
            com.sensorberg.smartworkspace.app.screens.spaces.detail.p$f r10 = (com.sensorberg.smartworkspace.app.screens.spaces.detail.p.f) r10
            com.sensorberg.smartspaces.sdk.model.Property$Numeric r9 = r10.e()
            float r9 = r9.getValue()
            com.sensorberg.smartworkspace.app.screens.spaces.detail.l$c$b r8 = (com.sensorberg.smartworkspace.app.screens.spaces.detail.l.c.b) r8
            float r11 = r8.a()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x0111
            r3.add(r7)
            boolean r7 = r10.i()
            if (r7 == 0) goto L_0x013c
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 111(0x6f, float:1.56E-43)
            r19 = 0
            com.sensorberg.smartworkspace.app.screens.spaces.detail.p$f r6 = com.sensorberg.smartworkspace.app.screens.spaces.detail.p.f.c(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x013c
        L_0x0111:
            com.sensorberg.smartspaces.sdk.model.Property$Numeric r11 = r10.e()
            float r12 = r8.a()
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 254(0xfe, float:3.56E-43)
            r21 = 0
            com.sensorberg.smartspaces.sdk.model.Property$Numeric r12 = com.sensorberg.smartspaces.sdk.model.Property.Numeric.copy$default(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r11 = 0
            r15 = 1
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 109(0x6d, float:1.53E-43)
            r19 = 0
            com.sensorberg.smartworkspace.app.screens.spaces.detail.p$f r6 = com.sensorberg.smartworkspace.app.screens.spaces.detail.p.f.c(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x013c:
            r5.add(r6)
            goto L_0x005d
        L_0x0141:
            r4.u(r5)
            com.sensorberg.smartworkspace.app.utils.d<java.lang.String, com.sensorberg.smartworkspace.app.screens.spaces.detail.l$c> r1 = r0.f7837l
            r1.x(r3)
            goto L_0x0175
        L_0x014a:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0170
            java.lang.String r1 = r0.x
            if (r1 == 0) goto L_0x0175
            androidx.lifecycle.c0<java.util.List<com.sensorberg.smartworkspace.app.screens.spaces.detail.p>> r2 = r0.o
            r5 = 2
            com.sensorberg.smartworkspace.app.screens.spaces.detail.p[] r6 = new com.sensorberg.smartworkspace.app.screens.spaces.detail.p[r5]
            com.sensorberg.smartworkspace.app.screens.spaces.detail.p$g r7 = new com.sensorberg.smartworkspace.app.screens.spaces.detail.p$g
            r7.<init>()
            r6[r4] = r7
            com.sensorberg.smartworkspace.app.screens.spaces.detail.p$c r7 = new com.sensorberg.smartworkspace.app.screens.spaces.detail.p$c
            r8 = 0
            r7.<init>(r1, r4, r5, r8)
            r6[r3] = r7
            java.util.List r1 = kotlin.a0.n.i(r6)
            r2.u(r1)
            goto L_0x0175
        L_0x0170:
            androidx.lifecycle.c0<java.util.List<com.sensorberg.smartworkspace.app.screens.spaces.detail.p>> r2 = r0.o
            r2.u(r1)
        L_0x0175:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartworkspace.app.screens.spaces.detail.l.J(g.e.m.c, java.util.Map):void");
    }

    private final void L(p.e eVar) {
        if (kotlin.jvm.internal.k.a(this.f7836k.l(), eVar.a())) {
            this.f7836k.u(null);
        } else {
            this.f7836k.u(eVar.a());
        }
    }

    private final List<p> M(g.e.m.c<? extends List<IotDevice>> cVar) {
        List list = cVar != null ? (List) cVar.a() : null;
        int i2 = 1;
        if (list == null || list.isEmpty()) {
            return n.g();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new p.g());
        arrayList.add(new p.c(((IotDevice) list.get(0)).getContainedUnit().getName(), false, 2, (DefaultConstructorMarker) null));
        arrayList.add(new p.g());
        Integer l2 = this.f7834i.l();
        if (l2 != null) {
            i2 = l2.intValue();
        }
        arrayList.addAll(this.A.a(list, i2, this.f7835j.l()));
        arrayList.add(new p.g());
        arrayList.addAll(this.z.d(list, this.f7836k.l()));
        return arrayList;
    }

    public final LiveData<g.e.h.a.a<String>> D() {
        return this.t;
    }

    public final LiveData<g.e.h.a.a<Integer>> E() {
        return this.r;
    }

    public final LiveData<g.e.h.a.a<androidx.navigation.p>> F() {
        return this.f7839n;
    }

    public final LiveData<List<p>> G() {
        return this.p;
    }

    public final void K(int i2) {
        this.f7834i.u(Integer.valueOf(i2));
    }

    public void b(p.e eVar) {
        kotlin.jvm.internal.k.e(eVar, "row");
        if (eVar.b()) {
            L(eVar);
            return;
        }
        this.f7838m.u(new g.e.h.a.a(B(eVar.a(), eVar.d(), eVar.c())));
    }

    public void e(p.e.d dVar, boolean z2) {
        kotlin.jvm.internal.k.e(dVar, "iconRowSwitch");
        if (dVar.i().getValue() != z2) {
            StateChangeRequest.Builder newRequest = dVar.h().newRequest();
            newRequest.addState(dVar.i(), z2);
            StateChangeRequest build = newRequest.build();
            this.f7837l.v(dVar.a(), new c.a(z2), 7000);
            x1 unused = e.b(o0.a(this), this.E, (l0) null, new h(this, build, dVar, (kotlin.c0.d) null), 2, (Object) null);
        }
    }

    public void f(p.d.a aVar) {
        kotlin.jvm.internal.k.e(aVar, "miniIcon");
        this.f7838m.u(new g.e.h.a.a(B(aVar.a(), aVar.d(), aVar.c())));
    }

    public void g(p.a aVar) {
        kotlin.jvm.internal.k.e(aVar, "item");
        this.f7838m.u(new g.e.h.a.a(B(aVar.b(), aVar.d(), aVar.c())));
    }

    /* access modifiers changed from: protected */
    public void l() {
        super.l();
        this.u.set(false);
    }

    public void m() {
        e0<Boolean> e0Var = this.f7835j;
        Boolean l2 = e0Var.l();
        boolean z2 = false;
        if (l2 != null && !l2.booleanValue()) {
            z2 = true;
        }
        e0Var.u(Boolean.valueOf(z2));
    }

    public void p(p.e.b bVar) {
        kotlin.jvm.internal.k.e(bVar, "iconRowButton");
        n.a.a.a("onButtonClicked", new Object[0]);
        n.a.a.a("unitId: " + this.w, new Object[0]);
        T t2 = null;
        if (bVar.c() == IotDeviceIdentifier.MYRENZ_LETTER_BOX) {
            Iterator<T> it = this.v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (((g.e.n.c.g.b) next).d() instanceof d.a) {
                    t2 = next;
                    break;
                }
            }
            H((g.e.n.c.g.b) t2);
        } else if (bVar.c() == IotDeviceIdentifier.MYRENZ_PARCEL_BOX) {
            Iterator<T> it2 = this.v.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                T next2 = it2.next();
                if (((g.e.n.c.g.b) next2).d() instanceof d.b) {
                    t2 = next2;
                    break;
                }
            }
            H((g.e.n.c.g.b) t2);
        } else {
            boolean z2 = !bVar.h().getValue();
            StateChangeRequest.Builder newRequest = bVar.g().newRequest();
            newRequest.addState(bVar.h(), z2);
            C(newRequest.build(), new c.a(z2), bVar.a());
        }
    }

    public void q(p.f fVar, int i2) {
        kotlin.jvm.internal.k.e(fVar, "seekBarRow");
        if (((int) fVar.e().getValue()) != i2) {
            StateChangeRequest.Builder newRequest = fVar.d().newRequest();
            newRequest.addState(fVar.e(), fVar.f().b(i2));
            C(newRequest.build(), new c.b((float) i2), fVar.a());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, String str2, g.e.n.g.g gVar, g gVar2, c cVar, Handler handler, j jVar, Application application, com.sensorberg.smartworkspace.app.screens.settings.myrenz.a aVar, d0 d0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, gVar, gVar2, cVar, handler, jVar, application, aVar, (i2 & 512) != 0 ? a1.c() : d0Var);
    }
}
