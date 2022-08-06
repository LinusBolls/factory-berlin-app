package com.sensorberg.smartworkspace.app;

import android.app.Application;
import android.content.ComponentCallbacks;
import androidx.lifecycle.f0;
import com.sensorberg.smartworkspace.app.screens.alarm.j;
import com.sensorberg.smartworkspace.app.utils.h;
import g.e.n.g.s;
import g.e.n.g.y;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.x;

@i(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001d\u0010\n\u001a\u00020\u00058B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\u00020\u00108B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/sensorberg/smartworkspace/app/App;", "Landroid/app/Application;", "", "onCreate", "()V", "Lcom/sensorberg/smartworkspace/app/utils/BuildConfigImpl;", "buildConfig$delegate", "Lkotlin/Lazy;", "getBuildConfig", "()Lcom/sensorberg/smartworkspace/app/utils/BuildConfigImpl;", "buildConfig", "Lcom/sensorberg/smartworkspace/app/utils/LoginTracker;", "loginTracker$delegate", "getLoginTracker", "()Lcom/sensorberg/smartworkspace/app/utils/LoginTracker;", "loginTracker", "Lcom/sensorberg/smartspaces/sdk/SmartSpacesSdk;", "smartSpacesSdk$delegate", "getSmartSpacesSdk", "()Lcom/sensorberg/smartspaces/sdk/SmartSpacesSdk;", "smartSpacesSdk", "<init>", "Companion", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: App.kt */
public final class App extends Application {
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static g.f.a.b f6871j;

    /* renamed from: k  reason: collision with root package name */
    public static final d f6872k = new d((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private final kotlin.e f6873g = g.a(new a(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: h  reason: collision with root package name */
    private final kotlin.e f6874h = g.a(new b(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: i  reason: collision with root package name */
    private final kotlin.e f6875i = g.a(new c(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* compiled from: ComponentCallbackExt.kt */
    public static final class a extends l implements kotlin.e0.c.a<s> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ComponentCallbacks f6876h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6877i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6878j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f6876h = componentCallbacks;
            this.f6877i = aVar;
            this.f6878j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, g.e.n.g.s] */
        public final s d() {
            ComponentCallbacks componentCallbacks = this.f6876h;
            return m.a.a.a.a.a.a(componentCallbacks).d().e(v.b(s.class), this.f6877i, this.f6878j);
        }
    }

    /* compiled from: ComponentCallbackExt.kt */
    public static final class b extends l implements kotlin.e0.c.a<com.sensorberg.smartworkspace.app.utils.c> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ComponentCallbacks f6879h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6880i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6881j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f6879h = componentCallbacks;
            this.f6880i = aVar;
            this.f6881j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.sensorberg.smartworkspace.app.utils.c] */
        public final com.sensorberg.smartworkspace.app.utils.c d() {
            ComponentCallbacks componentCallbacks = this.f6879h;
            return m.a.a.a.a.a.a(componentCallbacks).d().e(v.b(com.sensorberg.smartworkspace.app.utils.c.class), this.f6880i, this.f6881j);
        }
    }

    /* compiled from: ComponentCallbackExt.kt */
    public static final class c extends l implements kotlin.e0.c.a<com.sensorberg.smartworkspace.app.utils.i> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ComponentCallbacks f6882h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6883i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6884j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f6882h = componentCallbacks;
            this.f6883i = aVar;
            this.f6884j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.sensorberg.smartworkspace.app.utils.i, java.lang.Object] */
        public final com.sensorberg.smartworkspace.app.utils.i d() {
            ComponentCallbacks componentCallbacks = this.f6882h;
            return m.a.a.a.a.a.a(componentCallbacks).d().e(v.b(com.sensorberg.smartworkspace.app.utils.i.class), this.f6883i, this.f6884j);
        }
    }

    /* compiled from: App.kt */
    public static final class d {
        private d() {
        }

        public final void a(Object obj) {
            k.e(obj, "any");
            g.f.a.b a = App.f6871j;
            if (a != null) {
                a.a(obj, obj.getClass().getSimpleName());
            } else {
                k.q("refWatcher");
                throw null;
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: App.kt */
    static final class e extends l implements kotlin.e0.c.l<m.a.c.b, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ App f6885h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(App app) {
            super(1);
            this.f6885h = app;
        }

        public final void a(m.a.c.b bVar) {
            k.e(bVar, "$receiver");
            m.a.a.a.b.a.a(bVar, this.f6885h);
            bVar.g(n.i(g.e.d.q.a.a.a(this.f6885h), g.e.b.j.a.a.a(), com.sensorberg.qrcode.e.a.a.a(), com.sensorberg.smartworkspace.app.l.b.a.a(), com.sensorberg.noiise.i.a.a.a(), com.sensorberg.debug.e.a.a.a()));
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((m.a.c.b) obj);
            return x.a;
        }
    }

    /* compiled from: App.kt */
    static final class f<T> implements f0<y.a> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ com.sensorberg.smartworkspace.app.screens.info.i f6886g;

        f(com.sensorberg.smartworkspace.app.screens.info.i iVar) {
            this.f6886g = iVar;
        }

        /* renamed from: a */
        public final void k(y.a aVar) {
            if ((aVar instanceof y.a.c) || (aVar instanceof y.a.b)) {
                this.f6886g.setEnabled(false);
            } else if (aVar instanceof y.a.d) {
                this.f6886g.setEnabled(true);
            }
        }
    }

    private final com.sensorberg.smartworkspace.app.utils.c b() {
        return (com.sensorberg.smartworkspace.app.utils.c) this.f6874h.getValue();
    }

    private final com.sensorberg.smartworkspace.app.utils.i c() {
        return (com.sensorberg.smartworkspace.app.utils.i) this.f6875i.getValue();
    }

    private final s d() {
        return (s) this.f6873g.getValue();
    }

    public void onCreate() {
        super.onCreate();
        if (!g.f.a.a.b(this)) {
            g.f.a.b a2 = g.f.a.a.a(this);
            k.d(a2, "LeakCanary.install(this)");
            f6871j = a2;
            h.b.a(this);
            n.a.a.f("Starting Application", new Object[0]);
            m.a.c.d.b.a(new e(this));
            m.a.a.a.a.a.a(this).d().e(v.b(g.e.a.b.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null);
            m.a.a.a.a.a.a(this).d().e(v.b(j.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null);
            com.sensorberg.smartworkspace.app.screens.info.i iVar = (com.sensorberg.smartworkspace.app.screens.info.i) m.a.a.a.a.a.a(this).d().e(v.b(com.sensorberg.smartworkspace.app.screens.info.i.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null);
            n.a.a.a("Last successful login was at " + c().b(), new Object[0]);
            if (b().I()) {
                d().f().getStatusLiveData().p(new f(iVar));
            } else {
                iVar.setEnabled(false);
            }
            g.c.a.a.a(this);
            com.sensorberg.smartworkspace.app.j.a.a.a(this, b());
        }
    }
}
