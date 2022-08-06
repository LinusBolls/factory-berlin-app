package com.sensorberg.smartworkspace.app.screens.spaces.iotdetails;

import android.content.res.Resources;
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
import com.sensorberg.smartspaces.sdk.model.Property;
import com.sensorberg.smartspaces.sdk.model.StateChangeRequest;
import com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e;
import g.e.n.g.g;
import g.e.n.g.h;
import g.e.n.g.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.c0.j.a.k;
import kotlin.e0.c.p;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.x1;

/* compiled from: IotDeviceDetailsViewModel.kt */
public final class d extends n0 {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final String f7920i;

    /* renamed from: j  reason: collision with root package name */
    private final c0<List<e>> f7921j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final e0<g.e.h.a.a<String>> f7922k;

    /* renamed from: l  reason: collision with root package name */
    private final LiveData<g.e.h.a.a<String>> f7923l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final com.sensorberg.smartworkspace.app.utils.d<Long, c> f7924m;

    /* renamed from: n  reason: collision with root package name */
    private IotDevice f7925n;
    /* access modifiers changed from: private */
    public final String o;
    private final String p;
    /* access modifiers changed from: private */
    public final g q;
    private final com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.d r;
    private final d0 s;

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.IotDeviceDetailsViewModel$1", f = "IotDeviceDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    /* compiled from: IotDeviceDetailsViewModel.kt */
    static final class a extends k implements p<i0, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f7926k;

        /* renamed from: l  reason: collision with root package name */
        int f7927l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ d f7928m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ c0 f7929n;

        /* renamed from: com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.d$a$a  reason: collision with other inner class name */
        /* compiled from: IotDeviceDetailsViewModel.kt */
        static final class C0530a<T> implements f0<g.e.m.c<? extends List<? extends IotDevice>>> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ a f7930g;

            C0530a(a aVar) {
                this.f7930g = aVar;
            }

            /* renamed from: a */
            public final void k(g.e.m.c<? extends List<IotDevice>> cVar) {
                this.f7930g.f7929n.u(cVar);
            }
        }

        /* compiled from: IotDeviceDetailsViewModel.kt */
        static final class b implements h {
            final /* synthetic */ a a;

            b(a aVar) {
                this.a = aVar;
            }

            public final boolean a(IotDevice iotDevice) {
                kotlin.jvm.internal.k.e(iotDevice, "it");
                return kotlin.jvm.internal.k.a(iotDevice.getId(), this.a.f7928m.o);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, c0 c0Var, kotlin.c0.d dVar2) {
            super(2, dVar2);
            this.f7928m = dVar;
            this.f7929n = c0Var;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            a aVar = new a(this.f7928m, this.f7929n, dVar);
            aVar.f7926k = (i0) obj;
            return aVar;
        }

        public final Object i(Object obj) {
            Object unused = d.c();
            if (this.f7927l == 0) {
                l.b(obj);
                LiveData a = m0.a(androidx.lifecycle.k.c(g.a.a(this.f7928m.q, t.None, new b(this), (g.e.n.g.k) null, 5000, 4, (Object) null), (kotlin.c0.g) null, 0, 3, (Object) null));
                kotlin.jvm.internal.k.b(a, "Transformations.distinctUntilChanged(this)");
                this.f7929n.v(a, new C0530a(this));
                return x.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object l(Object obj, Object obj2) {
            return ((a) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    /* compiled from: IotDeviceDetailsViewModel.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: IotDeviceDetailsViewModel.kt */
    private static abstract class c {

        /* compiled from: IotDeviceDetailsViewModel.kt */
        public static final class a extends c {
            private final long a;
            private final boolean b;

            public a(long j2, boolean z) {
                super((DefaultConstructorMarker) null);
                this.a = j2;
                this.b = z;
            }

            public long a() {
                return this.a;
            }

            public final boolean b() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return a() == aVar.a() && this.b == aVar.b;
            }

            public int hashCode() {
                int a2 = defpackage.c.a(a()) * 31;
                boolean z = this.b;
                if (z) {
                    z = true;
                }
                return a2 + (z ? 1 : 0);
            }

            public String toString() {
                return "Binary(id=" + a() + ", checked=" + this.b + ")";
            }
        }

        /* compiled from: IotDeviceDetailsViewModel.kt */
        public static final class b extends c {
            private final long a;
            private final int b;

            public b(long j2, int i2) {
                super((DefaultConstructorMarker) null);
                this.a = j2;
                this.b = i2;
            }

            public long a() {
                return this.a;
            }

            public final int b() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return a() == bVar.a() && this.b == bVar.b;
            }

            public int hashCode() {
                return (defpackage.c.a(a()) * 31) + this.b;
            }

            public String toString() {
                return "Numeric(id=" + a() + ", value=" + this.b + ")";
            }
        }

        private c() {
        }

        public abstract long a();

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.d$d  reason: collision with other inner class name */
    /* compiled from: IotDeviceDetailsViewModel.kt */
    static final class C0531d<T> implements f0<Object> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f7931g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c0 f7932h;

        C0531d(d dVar, c0 c0Var) {
            this.f7931g = dVar;
            this.f7932h = c0Var;
        }

        public final void k(Object obj) {
            this.f7931g.D((g.e.m.c) this.f7932h.l(), (Map) this.f7931g.f7924m.l());
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.IotDeviceDetailsViewModel$onSeekBarChanged$1", f = "IotDeviceDetailsViewModel.kt", l = {177}, m = "invokeSuspend")
    /* compiled from: IotDeviceDetailsViewModel.kt */
    static final class e extends k implements p<i0, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f7933k;

        /* renamed from: l  reason: collision with root package name */
        Object f7934l;

        /* renamed from: m  reason: collision with root package name */
        int f7935m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ d f7936n;
        final /* synthetic */ StateChangeRequest o;
        final /* synthetic */ long p;

        /* compiled from: IotDeviceDetailsViewModel.kt */
        static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<List<? extends Throwable>, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ e f7937h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(e eVar) {
                super(1);
                this.f7937h = eVar;
            }

            public final void a(List<? extends Throwable> list) {
                kotlin.jvm.internal.k.e(list, "throwables");
                this.f7937h.f7936n.f7924m.w(Long.valueOf(this.f7937h.p));
                ArrayList arrayList = new ArrayList();
                for (Throwable message : list) {
                    String message2 = message.getMessage();
                    if (message2 != null) {
                        arrayList.add(message2);
                    }
                }
                String str = (String) v.A(arrayList);
                if (str == null) {
                    str = this.f7937h.f7936n.f7920i;
                }
                this.f7937h.f7936n.f7922k.u(new g.e.h.a.a(str));
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((List) obj);
                return x.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d dVar, StateChangeRequest stateChangeRequest, long j2, kotlin.c0.d dVar2) {
            super(2, dVar2);
            this.f7936n = dVar;
            this.o = stateChangeRequest;
            this.p = j2;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            e eVar = new e(this.f7936n, this.o, this.p, dVar);
            eVar.f7933k = (i0) obj;
            return eVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f7935m;
            if (i2 == 0) {
                l.b(obj);
                i0 i0Var = this.f7933k;
                g s = this.f7936n.q;
                StateChangeRequest stateChangeRequest = this.o;
                this.f7934l = i0Var;
                this.f7935m = 1;
                obj = s.v(stateChangeRequest, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0 i0Var2 = (i0) this.f7934l;
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ((g.e.m.c) obj).d(new a(this));
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((e) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.IotDeviceDetailsViewModel$onSwitchChanged$1", f = "IotDeviceDetailsViewModel.kt", l = {155}, m = "invokeSuspend")
    /* compiled from: IotDeviceDetailsViewModel.kt */
    static final class f extends k implements p<i0, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f7938k;

        /* renamed from: l  reason: collision with root package name */
        Object f7939l;

        /* renamed from: m  reason: collision with root package name */
        int f7940m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ d f7941n;
        final /* synthetic */ StateChangeRequest o;
        final /* synthetic */ long p;

        /* compiled from: IotDeviceDetailsViewModel.kt */
        static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<List<? extends Throwable>, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ f f7942h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(1);
                this.f7942h = fVar;
            }

            public final void a(List<? extends Throwable> list) {
                kotlin.jvm.internal.k.e(list, "throwables");
                this.f7942h.f7941n.f7924m.w(Long.valueOf(this.f7942h.p));
                ArrayList arrayList = new ArrayList();
                for (Throwable message : list) {
                    String message2 = message.getMessage();
                    if (message2 != null) {
                        arrayList.add(message2);
                    }
                }
                String str = (String) v.A(arrayList);
                if (str == null) {
                    str = this.f7942h.f7941n.f7920i;
                }
                this.f7942h.f7941n.f7922k.u(new g.e.h.a.a(str));
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((List) obj);
                return x.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar, StateChangeRequest stateChangeRequest, long j2, kotlin.c0.d dVar2) {
            super(2, dVar2);
            this.f7941n = dVar;
            this.o = stateChangeRequest;
            this.p = j2;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            f fVar = new f(this.f7941n, this.o, this.p, dVar);
            fVar.f7938k = (i0) obj;
            return fVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f7940m;
            if (i2 == 0) {
                l.b(obj);
                i0 i0Var = this.f7938k;
                g s = this.f7941n.q;
                StateChangeRequest stateChangeRequest = this.o;
                this.f7939l = i0Var;
                this.f7940m = 1;
                obj = s.v(stateChangeRequest, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0 i0Var2 = (i0) this.f7939l;
                l.b(obj);
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

    static {
        new b((DefaultConstructorMarker) null);
    }

    public d(String str, String str2, Resources resources, g gVar, com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.d dVar, Handler handler, d0 d0Var) {
        kotlin.jvm.internal.k.e(str, "iotDeviceId");
        kotlin.jvm.internal.k.e(str2, "iotDeviceName");
        kotlin.jvm.internal.k.e(resources, "resources");
        kotlin.jvm.internal.k.e(gVar, "iotDeviceController");
        kotlin.jvm.internal.k.e(dVar, "mapper");
        kotlin.jvm.internal.k.e(handler, "handler");
        kotlin.jvm.internal.k.e(d0Var, "dispatcher");
        this.o = str;
        this.p = str2;
        this.q = gVar;
        this.r = dVar;
        this.s = d0Var;
        String string = resources.getString(R.string.label_iotdevice_cannot_find_device, new Object[]{str2});
        kotlin.jvm.internal.k.d(string, "resources.getString(R.st…nd_device, iotDeviceName)");
        this.f7920i = string;
        this.f7921j = new c0<>();
        e0<g.e.h.a.a<String>> e0Var = new e0<>();
        this.f7922k = e0Var;
        this.f7923l = e0Var;
        this.f7924m = new com.sensorberg.smartworkspace.app.utils.d<>(handler);
        E(true);
        c0 c0Var = new c0();
        x1 unused = e.b(o0.a(this), this.s, (l0) null, new a(this, c0Var, (kotlin.c0.d) null), 2, (Object) null);
        C0531d dVar2 = new C0531d(this, c0Var);
        this.f7921j.v(c0Var, dVar2);
        this.f7921j.v(this.f7924m, dVar2);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x013b, code lost:
        r7 = r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D(g.e.m.c<? extends java.util.List<com.sensorberg.smartspaces.sdk.model.IotDevice>> r22, java.util.Map<java.lang.Long, ? extends com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.d.c> r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            if (r1 == 0) goto L_0x014a
            boolean r3 = r1 instanceof g.e.m.c.a
            if (r3 == 0) goto L_0x0028
            g.e.m.c$a r1 = (g.e.m.c.a) r1
            java.util.List r1 = r1.f()
            java.lang.Object r1 = kotlin.a0.v.A(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            java.lang.String r1 = r0.f7920i
        L_0x001d:
            androidx.lifecycle.e0<g.e.h.a.a<java.lang.String>> r2 = r0.f7922k
            g.e.h.a.a r3 = new g.e.h.a.a
            r3.<init>(r1)
            r2.u(r3)
            return
        L_0x0028:
            boolean r3 = r1 instanceof g.e.m.c.b
            r4 = 0
            if (r3 != 0) goto L_0x002e
            r1 = r4
        L_0x002e:
            g.e.m.c$b r1 = (g.e.m.c.b) r1
            if (r1 == 0) goto L_0x014a
            java.lang.Object r1 = r1.f()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x014a
            java.lang.Object r1 = kotlin.a0.v.A(r1)
            com.sensorberg.smartspaces.sdk.model.IotDevice r1 = (com.sensorberg.smartspaces.sdk.model.IotDevice) r1
            if (r1 == 0) goto L_0x014a
            r0.f7925n = r1
            com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.d r3 = r0.r
            if (r1 == 0) goto L_0x0144
            java.util.List r1 = r3.b(r1)
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x0053
            return
        L_0x0053:
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            androidx.lifecycle.c0<java.util.List<com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e>> r5 = r0.f7921j
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = kotlin.a0.o.p(r1, r7)
            r6.<init>(r7)
            java.util.Iterator r1 = r1.iterator()
        L_0x0069:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x0140
            java.lang.Object r7 = r1.next()
            com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e r7 = (com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e) r7
            if (r2 == 0) goto L_0x0086
            long r8 = r7.a()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.Object r8 = r2.get(r8)
            com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.d$c r8 = (com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.d.c) r8
            goto L_0x0087
        L_0x0086:
            r8 = r4
        L_0x0087:
            boolean r9 = r7 instanceof com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e.C0532e
            if (r9 == 0) goto L_0x00d8
            boolean r9 = r8 instanceof com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.d.c.a
            if (r9 == 0) goto L_0x00d8
            r10 = r7
            com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e$e r10 = (com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e.C0532e) r10
            boolean r9 = r10.e()
            r11 = r8
            com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.d$c$a r11 = (com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.d.c.a) r11
            boolean r12 = r11.b()
            if (r9 != r12) goto L_0x00c3
            long r11 = r8.a()
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            r3.add(r9)
            boolean r9 = r10.h()
            if (r9 == 0) goto L_0x00d8
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 47
            r19 = 0
            com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e$e r7 = com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e.C0532e.c(r10, r11, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x013b
        L_0x00c3:
            r7 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 1
            boolean r17 = r11.b()
            r18 = 15
            r19 = 0
            r11 = r7
            com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e$e r7 = com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e.C0532e.c(r10, r11, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x013b
        L_0x00d8:
            boolean r9 = r7 instanceof com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e.d
            if (r9 == 0) goto L_0x012c
            boolean r9 = r8 instanceof com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.d.c.b
            if (r9 == 0) goto L_0x012c
            r10 = r7
            com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e$d r10 = (com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e.d) r10
            int r9 = r10.h()
            r11 = r8
            com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.d$c$b r11 = (com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.d.c.b) r11
            int r12 = r11.b()
            if (r9 != r12) goto L_0x0115
            long r8 = r8.a()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r3.add(r8)
            boolean r8 = r10.i()
            if (r8 == 0) goto L_0x012c
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 119(0x77, float:1.67E-43)
            r20 = 0
            com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e$d r7 = com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e.d.c(r10, r11, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x013b
        L_0x0115:
            r7 = 0
            r13 = 0
            r14 = 0
            r15 = 1
            int r16 = r11.b()
            r17 = 0
            r18 = 0
            r19 = 103(0x67, float:1.44E-43)
            r20 = 0
            r11 = r7
            com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e$d r7 = com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e.d.c(r10, r11, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x013b
        L_0x012c:
            boolean r8 = r7 instanceof com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e.b
            if (r8 == 0) goto L_0x0131
            goto L_0x013b
        L_0x0131:
            boolean r8 = r7 instanceof com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e.a
            if (r8 == 0) goto L_0x0136
            goto L_0x013b
        L_0x0136:
            com.sensorberg.smartworkspace.app.utils.d<java.lang.Long, com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.d$c> r8 = r0.f7924m
            r8.x(r3)
        L_0x013b:
            r6.add(r7)
            goto L_0x0069
        L_0x0140:
            r5.u(r6)
            return
        L_0x0144:
            java.lang.String r1 = "iotDevice"
            kotlin.jvm.internal.k.q(r1)
            throw r4
        L_0x014a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.d.D(g.e.m.c, java.util.Map):void");
    }

    private final void E(boolean z) {
        this.f7921j.u(m.b(new e.b(-1, this.p, false, z, this.r.a())));
    }

    public final void A(long j2, String str) {
        kotlin.jvm.internal.k.e(str, "newName");
    }

    public final void B(long j2, Property.Numeric numeric, int i2) {
        kotlin.jvm.internal.k.e(numeric, "property");
        if (((int) numeric.getValue()) != i2) {
            IotDevice iotDevice = this.f7925n;
            if (iotDevice != null) {
                StateChangeRequest.Builder newRequest = iotDevice.newRequest();
                newRequest.addState(numeric, (float) i2);
                StateChangeRequest build = newRequest.build();
                this.f7924m.v(Long.valueOf(j2), new c.b(j2, i2), 7000);
                x1 unused = e.b(o0.a(this), this.s, (l0) null, new e(this, build, j2, (kotlin.c0.d) null), 2, (Object) null);
                return;
            }
            kotlin.jvm.internal.k.q("iotDevice");
            throw null;
        }
    }

    public final void C(long j2, Property.Binary binary, boolean z) {
        Property.Binary binary2 = binary;
        boolean z2 = z;
        kotlin.jvm.internal.k.e(binary2, "property");
        if (binary.getValue() != z2) {
            IotDevice iotDevice = this.f7925n;
            if (iotDevice != null) {
                StateChangeRequest.Builder newRequest = iotDevice.newRequest();
                newRequest.addState(binary2, z2);
                StateChangeRequest build = newRequest.build();
                this.f7924m.v(Long.valueOf(j2), new c.a(j2, z2), 7000);
                x1 unused = e.b(o0.a(this), this.s, (l0) null, new f(this, build, j2, (kotlin.c0.d) null), 2, (Object) null);
                return;
            }
            kotlin.jvm.internal.k.q("iotDevice");
            throw null;
        }
    }

    public final LiveData<List<e>> x() {
        return this.f7921j;
    }

    public final LiveData<g.e.h.a.a<String>> y() {
        return this.f7923l;
    }

    public final void z(long j2, int i2) {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(String str, String str2, Resources resources, g gVar, com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f.d dVar, Handler handler, d0 d0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, resources, gVar, dVar, handler, (i2 & 64) != 0 ? a1.c() : d0Var);
    }
}
