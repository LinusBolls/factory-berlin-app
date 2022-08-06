package com.sensorberg.smartspaces.backend;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.sensorberg.smartspaces.backend.l.a;
import com.sensorberg.smartspaces.backend.model.ActuatorRequest;
import com.sensorberg.smartspaces.backend.model.BeBooking;
import com.sensorberg.smartspaces.backend.model.BlueIdDeviceDetails;
import com.sensorberg.smartspaces.backend.model.Statistics;
import com.sensorberg.smartspaces.backend.model.User;
import com.sensorberg.smartspaces.backend.model.UserDevice;
import com.sensorberg.smartspaces.backend.model.settings.BlueIdSettings;
import com.sensorberg.smartspaces.backend.model.units.BeUnit;
import g.e.m.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.v;
import kotlin.x;
import org.threeten.bp.LocalDate;

/* compiled from: Backend.kt */
public final class a implements com.sensorberg.smartspaces.backend.l.a, b {
    /* access modifiers changed from: private */
    public static final boolean u = (n.a.a.i() > 0);
    public static final i v = new i((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final com.sensorberg.smartspaces.backend.m.a f5548g = ((com.sensorberg.smartspaces.backend.m.a) n().d().e(v.b(com.sensorberg.smartspaces.backend.m.a.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));

    /* renamed from: h  reason: collision with root package name */
    private final com.sensorberg.smartspaces.backend.m.i f5549h = ((com.sensorberg.smartspaces.backend.m.i) n().d().e(v.b(com.sensorberg.smartspaces.backend.m.i.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));

    /* renamed from: i  reason: collision with root package name */
    private final i f5550i;

    /* renamed from: j  reason: collision with root package name */
    private final h f5551j;

    /* renamed from: k  reason: collision with root package name */
    private final com.sensorberg.encryptor.d f5552k;

    /* renamed from: l  reason: collision with root package name */
    private final kotlin.e f5553l;

    /* renamed from: m  reason: collision with root package name */
    private final kotlin.e f5554m;

    /* renamed from: n  reason: collision with root package name */
    private final kotlin.e f5555n;
    private final kotlin.e o;
    private final kotlin.e p;
    private final kotlin.e q;
    private final k.v r;
    /* access modifiers changed from: private */
    public final g.e.n.b.g.c s;
    /* access modifiers changed from: private */
    public final g.e.n.b.e.b t;

    /* renamed from: com.sensorberg.smartspaces.backend.a$a  reason: collision with other inner class name */
    /* compiled from: Scope.kt */
    public static final class C0184a extends kotlin.jvm.internal.l implements kotlin.e0.c.a<com.sensorberg.smartspaces.backend.q.l> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5556h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5557i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5558j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0184a(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5556h = aVar;
            this.f5557i = aVar2;
            this.f5558j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.smartspaces.backend.q.l] */
        public final com.sensorberg.smartspaces.backend.q.l d() {
            return this.f5556h.e(v.b(com.sensorberg.smartspaces.backend.q.l.class), this.f5557i, this.f5558j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class b extends kotlin.jvm.internal.l implements kotlin.e0.c.a<SharedPreferences> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5559h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5560i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5561j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5559h = aVar;
            this.f5560i = aVar2;
            this.f5561j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
        public final SharedPreferences d() {
            return this.f5559h.e(v.b(SharedPreferences.class), this.f5560i, this.f5561j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.a<com.sensorberg.smartspaces.backend.q.h> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5562h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5563i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5564j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5562h = aVar;
            this.f5563i = aVar2;
            this.f5564j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.smartspaces.backend.q.h] */
        public final com.sensorberg.smartspaces.backend.q.h d() {
            return this.f5562h.e(v.b(com.sensorberg.smartspaces.backend.q.h.class), this.f5563i, this.f5564j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class d extends kotlin.jvm.internal.l implements kotlin.e0.c.a<com.sensorberg.smartspaces.backend.m.d> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5565h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5566i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5567j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5565h = aVar;
            this.f5566i = aVar2;
            this.f5567j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.smartspaces.backend.m.d] */
        public final com.sensorberg.smartspaces.backend.m.d d() {
            return this.f5565h.e(v.b(com.sensorberg.smartspaces.backend.m.d.class), this.f5566i, this.f5567j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class e extends kotlin.jvm.internal.l implements kotlin.e0.c.a<com.sensorberg.smartspaces.backend.m.e> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5568h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5569i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5570j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5568h = aVar;
            this.f5569i = aVar2;
            this.f5570j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.smartspaces.backend.m.e] */
        public final com.sensorberg.smartspaces.backend.m.e d() {
            return this.f5568h.e(v.b(com.sensorberg.smartspaces.backend.m.e.class), this.f5569i, this.f5570j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class f extends kotlin.jvm.internal.l implements kotlin.e0.c.a<g.e.k.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5571h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5572i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5573j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5571h = aVar;
            this.f5572i = aVar2;
            this.f5573j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [g.e.k.a, java.lang.Object] */
        public final g.e.k.a d() {
            return this.f5571h.e(v.b(g.e.k.a.class), this.f5572i, this.f5573j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class g extends kotlin.jvm.internal.l implements kotlin.e0.c.a<com.sensorberg.smartspaces.backend.q.p.e> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f5574h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f5575i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5576j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f5574h = aVar;
            this.f5575i = aVar2;
            this.f5576j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.smartspaces.backend.q.p.e, java.lang.Object] */
        public final com.sensorberg.smartspaces.backend.q.p.e d() {
            return this.f5574h.e(v.b(com.sensorberg.smartspaces.backend.q.p.e.class), this.f5575i, this.f5576j);
        }
    }

    /* compiled from: Backend.kt */
    public enum h {
        SENSORBERG("sensorberg-locks"),
        BLUE_ID("blueid-locks");
        

        /* renamed from: g  reason: collision with root package name */
        private final String f5580g;

        private h(String str) {
            this.f5580g = str;
        }

        public final String a() {
            return this.f5580g;
        }
    }

    /* compiled from: Backend.kt */
    public static final class i {
        private i() {
        }

        public final boolean a() {
            return a.u;
        }

        public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Backend.kt */
    public enum j {
        SENSORBERG("sensorberg-gateways"),
        BLUE_ID("blueid-devices");
        

        /* renamed from: g  reason: collision with root package name */
        private final String f5584g;

        private j(String str) {
            this.f5584g = str;
        }

        public final String a() {
            return this.f5584g;
        }
    }

    /* compiled from: Backend.kt */
    static final class k extends kotlin.jvm.internal.l implements kotlin.e0.c.l<BeBooking, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f5585h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(a aVar) {
            super(1);
            this.f5585h = aVar;
        }

        public final void a(BeBooking beBooking) {
            g.e.m.a n2 = this.f5585h.v().n();
            if (n2 != null) {
                if (n2.f() == a.b.SUCCESS && n2.c() != null) {
                    Object c = n2.c();
                    kotlin.jvm.internal.k.c(c);
                    List T = v.T((Collection) c);
                    kotlin.jvm.internal.k.c(beBooking);
                    T.add(beBooking);
                    g.e.k.e<g.e.m.a<List<BeBooking>, Void>> v = this.f5585h.v();
                    if (v != null) {
                        ((g.e.k.d) v).w(g.e.m.a.f9908e.d(v.R(T)));
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.observable.MutableObservableData<com.sensorberg.response.SimpleResponse<kotlin.collections.List<com.sensorberg.smartspaces.backend.model.BeBooking>> /* = com.sensorberg.response.Response<kotlin.collections.List<com.sensorberg.smartspaces.backend.model.BeBooking>, java.lang.Void> */>");
                    }
                }
                this.f5585h.f5548g.o();
            }
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((BeBooking) obj);
            return x.a;
        }
    }

    /* compiled from: Backend.kt */
    static final class l extends kotlin.jvm.internal.l implements kotlin.e0.c.l<Exception, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f5586h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(a aVar) {
            super(1);
            this.f5586h = aVar;
        }

        public final void a(Exception exc) {
            this.f5586h.f5548g.o();
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Exception) obj);
            return x.a;
        }
    }

    /* compiled from: Backend.kt */
    static final class m extends kotlin.jvm.internal.l implements kotlin.e0.c.l<BeBooking, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f5587h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(a aVar) {
            super(1);
            this.f5587h = aVar;
        }

        public final void a(BeBooking beBooking) {
            g.e.m.a n2 = this.f5587h.v().n();
            if (n2 != null) {
                if (n2.f() == a.b.SUCCESS && n2.c() != null) {
                    Object c = n2.c();
                    kotlin.jvm.internal.k.c(c);
                    List T = v.T((Collection) c);
                    kotlin.jvm.internal.k.c(beBooking);
                    T.add(beBooking);
                    g.e.k.e<g.e.m.a<List<BeBooking>, Void>> v = this.f5587h.v();
                    if (v != null) {
                        ((g.e.k.d) v).w(g.e.m.a.f9908e.d(v.R(T)));
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.observable.MutableObservableData<com.sensorberg.response.SimpleResponse<kotlin.collections.List<com.sensorberg.smartspaces.backend.model.BeBooking>> /* = com.sensorberg.response.Response<kotlin.collections.List<com.sensorberg.smartspaces.backend.model.BeBooking>, java.lang.Void> */>");
                    }
                }
                this.f5587h.f5548g.o();
            }
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((BeBooking) obj);
            return x.a;
        }
    }

    /* compiled from: Backend.kt */
    static final class n extends kotlin.jvm.internal.l implements kotlin.e0.c.l<Exception, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f5588h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(a aVar) {
            super(1);
            this.f5588h = aVar;
        }

        public final void a(Exception exc) {
            this.f5588h.f5548g.o();
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Exception) obj);
            return x.a;
        }
    }

    /* compiled from: Backend.kt */
    static final class o extends kotlin.jvm.internal.l implements kotlin.e0.c.l<Void, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f5589h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f5590i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(a aVar, String str) {
            super(1);
            this.f5589h = aVar;
            this.f5590i = str;
        }

        public final void a(Void voidR) {
            List list;
            g.e.m.a aVar;
            g.e.m.a n2 = this.f5589h.v().n();
            if (!(n2 == null || (list = (List) n2.c()) == null)) {
                g.e.k.e<g.e.m.a<List<BeBooking>, Void>> v = this.f5589h.v();
                if (v != null) {
                    g.e.k.d dVar = (g.e.k.d) v;
                    g.e.k.e<g.e.m.a<List<BeBooking>, Void>> v2 = this.f5589h.v();
                    if (v2 != null) {
                        g.e.m.a aVar2 = (g.e.m.a) ((g.e.k.d) v2).n();
                        if (aVar2 != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object next : list) {
                                if (!kotlin.jvm.internal.k.a(((BeBooking) next).id, this.f5590i)) {
                                    arrayList.add(next);
                                }
                            }
                            aVar = g.e.m.a.b(aVar2, (a.b) null, arrayList, (Object) null, (Exception) null, 13, (Object) null);
                        } else {
                            aVar = null;
                        }
                        dVar.w(aVar);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.observable.MutableObservableData<com.sensorberg.response.SimpleResponse<kotlin.collections.List<com.sensorberg.smartspaces.backend.model.BeBooking>> /* = com.sensorberg.response.Response<kotlin.collections.List<com.sensorberg.smartspaces.backend.model.BeBooking>, java.lang.Void> */>");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.observable.MutableObservableData<com.sensorberg.response.SimpleResponse<kotlin.collections.List<com.sensorberg.smartspaces.backend.model.BeBooking>> /* = com.sensorberg.response.Response<kotlin.collections.List<com.sensorberg.smartspaces.backend.model.BeBooking>, java.lang.Void> */>");
                }
            }
            this.f5589h.f5548g.o();
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Void) obj);
            return x.a;
        }
    }

    /* compiled from: Backend.kt */
    static final class p extends kotlin.jvm.internal.l implements kotlin.e0.c.l<Exception, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f5591h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(a aVar) {
            super(1);
            this.f5591h = aVar;
        }

        public final void a(Exception exc) {
            this.f5591h.f5548g.o();
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Exception) obj);
            return x.a;
        }
    }

    /* compiled from: Backend.kt */
    static final class q extends kotlin.jvm.internal.l implements kotlin.e0.c.l<String, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f5592h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(a aVar) {
            super(1);
            this.f5592h = aVar;
        }

        public final void a(String str) {
            kotlin.jvm.internal.k.e(str, "deviceId");
            n.a.a.a("deviceId: " + str, new Object[0]);
            this.f5592h.t.a(str);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((String) obj);
            return x.a;
        }
    }

    /* compiled from: Backend.kt */
    static final class r extends kotlin.jvm.internal.l implements kotlin.e0.c.l<UserDevice, String> {

        /* renamed from: h  reason: collision with root package name */
        public static final r f5593h = new r();

        r() {
            super(1);
        }

        /* renamed from: a */
        public final String o(UserDevice userDevice) {
            kotlin.jvm.internal.k.e(userDevice, "it");
            return userDevice.id;
        }
    }

    /* compiled from: Backend.kt */
    static final class s extends kotlin.jvm.internal.l implements kotlin.e0.c.l<String, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f5594h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(a aVar) {
            super(1);
            this.f5594h = aVar;
        }

        public final void a(String str) {
            kotlin.jvm.internal.k.e(str, "userId");
            n.a.a.a("userId: " + str, new Object[0]);
            this.f5594h.s.a(str);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((String) obj);
            return x.a;
        }
    }

    /* compiled from: Backend.kt */
    static final class t extends kotlin.jvm.internal.l implements kotlin.e0.c.l<User, String> {

        /* renamed from: h  reason: collision with root package name */
        public static final t f5595h = new t();

        t() {
            super(1);
        }

        /* renamed from: a */
        public final String o(User user) {
            kotlin.jvm.internal.k.e(user, "it");
            return user.id;
        }
    }

    public a(Context context, k.v vVar, String str, k.g gVar, Map<g.a.a.h.p, ? extends g.a.a.h.b<? extends Object>> map, g.e.n.b.g.c cVar, g.e.n.b.e.b bVar) {
        kotlin.jvm.internal.k.e(context, "context");
        kotlin.jvm.internal.k.e(vVar, "baseHttpUrl");
        kotlin.jvm.internal.k.e(str, "oauthId");
        kotlin.jvm.internal.k.e(gVar, "certificatePinner");
        kotlin.jvm.internal.k.e(map, "apolloTypeAdapters");
        kotlin.jvm.internal.k.e(cVar, "userIdDataSource");
        kotlin.jvm.internal.k.e(bVar, "deviceIdDataSource");
        this.r = vVar;
        this.s = cVar;
        this.t = bVar;
        n.a.a.f("Initializing SmartWorkspace Backend", new Object[0]);
        g.c.a.a.b(context);
        com.sensorberg.smartspaces.backend.l.b.c(context, this.r, str, gVar, map);
        E();
        D();
        this.f5550i = (i) n().d().e(v.b(i.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null);
        this.f5551j = (h) n().d().e(v.b(h.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null);
        this.f5552k = (com.sensorberg.encryptor.d) n().d().e(v.b(com.sensorberg.encryptor.d.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null);
        this.f5553l = g.a(new C0184a(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));
        this.f5554m = g.a(new b(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));
        this.f5555n = g.a(new c(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));
        this.o = g.a(new d(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));
        this.p = g.a(new e(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));
        this.q = g.a(new f(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));
        kotlin.e<T> unused = g.a(new g(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    }

    private final void D() {
        g.e.k.h.j(g.e.k.h.a, g.e.k.h.a.a(this.f5549h.c(r.f5593h)), (g.e.k.a) null, new q(this), 2, (Object) null);
    }

    private final void E() {
        g.e.k.h.j(g.e.k.h.a, g.e.k.h.a.a(g.e.k.h.d(g.e.k.h.a, g.e.m.e.b.a(A()), (g.e.k.a) null, t.f5595h, 2, (Object) null)), (g.e.k.a) null, new s(this), 2, (Object) null);
    }

    private final com.sensorberg.smartspaces.backend.m.d o() {
        return (com.sensorberg.smartspaces.backend.m.d) this.o.getValue();
    }

    private final com.sensorberg.smartspaces.backend.m.e p() {
        return (com.sensorberg.smartspaces.backend.m.e) this.p.getValue();
    }

    private final com.sensorberg.smartspaces.backend.q.h s() {
        return (com.sensorberg.smartspaces.backend.q.h) this.f5555n.getValue();
    }

    private final g.e.k.a t() {
        return (g.e.k.a) this.q.getValue();
    }

    private final SharedPreferences w() {
        return (SharedPreferences) this.f5554m.getValue();
    }

    private final com.sensorberg.smartspaces.backend.q.l x() {
        return (com.sensorberg.smartspaces.backend.q.l) this.f5553l.getValue();
    }

    public final g.e.k.e<g.e.m.a<User, Void>> A() {
        return this.f5548g.g();
    }

    public final boolean B() {
        long c2 = x().c();
        BlueIdSettings d2 = this.f5548g.d();
        return c2 <= (d2 != null ? d2.serverTimeThreshold : 25000);
    }

    public final g.e.k.e<g.e.m.a<Void, Void>> C(String str) {
        kotlin.jvm.internal.k.e(str, "redirectedUri");
        return this.f5550i.q(str);
    }

    public final void F(kotlin.e0.c.l<? super BlueIdSettings, x> lVar) {
        kotlin.jvm.internal.k.e(lVar, "callback");
        this.f5548g.n(lVar);
    }

    public final void G(BlueIdDeviceDetails blueIdDeviceDetails) {
        kotlin.jvm.internal.k.e(blueIdDeviceDetails, "details");
        g.e.m.e.b.b(this.f5551j.B(blueIdDeviceDetails), "postBlueIdDeviceDetails");
    }

    public final void H(Statistics statistics) {
        kotlin.jvm.internal.k.e(statistics, "statistics");
        if (statistics.getFinished()) {
            g.e.m.e.b.b(this.f5551j.C(statistics), "postStatistics");
            return;
        }
        throw new IllegalStateException("Attempting to send unfinished statistics");
    }

    public final void I() {
        t().b();
        this.s.clear();
        this.t.clear();
    }

    public final void J(e eVar) {
        kotlin.jvm.internal.k.e(eVar, "refresh");
        s().c(eVar);
    }

    public final g.e.k.e<g.e.m.a<Void, Void>> K(String str) {
        kotlin.jvm.internal.k.e(str, "deviceId");
        return this.f5550i.t(str);
    }

    public final void L(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        kotlin.jvm.internal.k.e(str, "requestId");
        kotlin.jvm.internal.k.e(str2, "state");
        kotlin.jvm.internal.k.e(str4, "unitId");
        String str8 = str5;
        kotlin.jvm.internal.k.e(str8, "connectableId");
        String str9 = str6;
        kotlin.jvm.internal.k.e(str9, "actuatorId");
        String str10 = str7;
        kotlin.jvm.internal.k.e(str10, "action");
        g.e.m.e.e.b(this.f5551j.D(str, str2, str3, str4, str8, str9, str10, j.BLUE_ID, h.BLUE_ID), (g.e.k.a) null, 1, (Object) null);
    }

    public final void M(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        kotlin.jvm.internal.k.e(str, "requestId");
        kotlin.jvm.internal.k.e(str2, "state");
        kotlin.jvm.internal.k.e(str4, "unitId");
        String str8 = str5;
        kotlin.jvm.internal.k.e(str8, "connectableId");
        String str9 = str6;
        kotlin.jvm.internal.k.e(str9, "actuatorId");
        String str10 = str7;
        kotlin.jvm.internal.k.e(str10, "action");
        g.e.m.e.e.b(this.f5551j.D(str, str2, str3, str4, str8, str9, str10, j.SENSORBERG, h.SENSORBERG), (g.e.k.a) null, 1, (Object) null);
    }

    public final g.e.k.e<g.e.m.a<Void, Void>> N(String str, String str2) {
        kotlin.jvm.internal.k.e(str, "username");
        kotlin.jvm.internal.k.e(str2, "password");
        return this.f5550i.u(str, str2);
    }

    public g.e.k.e<g.e.m.a<Void, Void>> a(String str) {
        kotlin.jvm.internal.k.e(str, "id");
        g.e.k.e<g.e.m.a<Void, Void>> o2 = this.f5551j.o(str);
        g.e.m.e.d<g.e.m.a<Void, Void>, P> a = g.e.m.e.e.a(o2, t());
        a.f(new o(this, str));
        a.e(new p(this));
        return o2;
    }

    public g.e.k.e<g.e.m.a<BeBooking, Void>> b(String str, String str2, String str3, String str4, String str5) {
        kotlin.jvm.internal.k.e(str, "unitId");
        kotlin.jvm.internal.k.e(str4, "startsAt");
        g.e.k.e<g.e.m.a<BeBooking, Void>> j2 = this.f5551j.j(str, str2, str3, str4, str5);
        g.e.m.e.d<g.e.m.a<BeBooking, Void>, P> a = g.e.m.e.e.a(j2, t());
        a.f(new k(this));
        a.e(new l(this));
        return j2;
    }

    public g.e.k.e<g.e.m.a<BeBooking, Void>> c(String str, String str2) {
        kotlin.jvm.internal.k.e(str, "unitOrClusterId");
        kotlin.jvm.internal.k.e(str2, "startsAt");
        g.e.k.e<g.e.m.a<BeBooking, Void>> k2 = this.f5551j.k(str, str2);
        g.e.m.e.d<g.e.m.a<BeBooking, Void>, P> a = g.e.m.e.e.a(k2, t());
        a.f(new m(this));
        a.e(new n(this));
        return k2;
    }

    public final g.e.k.e<g.e.m.a<Void, Void>> h(String str, String str2, String str3) {
        kotlin.jvm.internal.k.e(str, "currentPassword");
        kotlin.jvm.internal.k.e(str2, "newPassword");
        kotlin.jvm.internal.k.e(str3, "newPasswordConfirmation");
        return this.f5551j.i(str, str2, str3);
    }

    @SuppressLint({"ApplySharedPref"})
    public final void i() {
        t().b();
        this.f5552k.destroy();
        w().edit().clear().commit();
        com.sensorberg.smartspaces.backend.l.b.b();
    }

    public final g.e.k.e<g.e.m.a<Void, Void>> j(String str) {
        kotlin.jvm.internal.k.e(str, "blueIdSecureId");
        return this.f5551j.l(str);
    }

    public final void k(String str) {
        kotlin.jvm.internal.k.e(str, "blueIdSecureId");
        this.f5551j.m(str);
    }

    public final g.e.k.e<g.e.m.a<Void, Void>> l(String str) {
        kotlin.jvm.internal.k.e(str, "authenticationToken");
        return this.f5550i.p(str);
    }

    public final kotlin.j<g.e.k.e<String>, g.e.k.e<g.e.m.a<ActuatorRequest, Void>>> m(String str, String str2, String str3, String str4, String str5, List<String> list) {
        kotlin.jvm.internal.k.e(str, "unitId");
        kotlin.jvm.internal.k.e(str2, "connectableId");
        kotlin.jvm.internal.k.e(str3, "actuatorId");
        kotlin.jvm.internal.k.e(str4, "action");
        kotlin.jvm.internal.k.e(str5, "requestId");
        kotlin.jvm.internal.k.e(list, "commChannels");
        return this.f5551j.q(str, str2, str3, str4, str5, list);
    }

    public m.a.c.a n() {
        return a.C0333a.a(this);
    }

    public final k.v q() {
        return this.r;
    }

    public g.e.k.e<g.e.m.a<List<BeBooking>, Void>> r(LocalDate localDate, LocalDate localDate2, String str) {
        kotlin.jvm.internal.k.e(localDate, "from");
        kotlin.jvm.internal.k.e(localDate2, "to");
        return this.f5551j.t(localDate, localDate2, str);
    }

    public final g.e.k.e<Boolean> u() {
        return o().b();
    }

    public g.e.k.e<g.e.m.a<List<BeBooking>, Void>> v() {
        return this.f5548g.e();
    }

    public final g.e.k.e<f> y() {
        return p().f();
    }

    public final g.e.k.e<g.e.m.a<List<BeUnit>, Void>> z() {
        return this.f5548g.f();
    }
}
