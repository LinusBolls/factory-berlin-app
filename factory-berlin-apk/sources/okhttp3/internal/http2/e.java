package okhttp3.internal.http2;

import de.baimos.blueid.sdk.api.Channel;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import kotlin.x;
import okhttp3.internal.http2.g;

/* compiled from: Http2Connection.kt */
public final class e implements Closeable {
    /* access modifiers changed from: private */
    public static final l I;
    public static final c J = new c((DefaultConstructorMarker) null);
    private long A;
    private long B;
    private long C;
    /* access modifiers changed from: private */
    public long D;
    private final Socket E;
    private final i F;
    private final C0796e G;
    /* access modifiers changed from: private */
    public final Set<Integer> H;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f11356g;

    /* renamed from: h  reason: collision with root package name */
    private final d f11357h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<Integer, h> f11358i = new LinkedHashMap();

    /* renamed from: j  reason: collision with root package name */
    private final String f11359j;

    /* renamed from: k  reason: collision with root package name */
    private int f11360k;

    /* renamed from: l  reason: collision with root package name */
    private int f11361l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public boolean f11362m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final k.h0.e.e f11363n;
    /* access modifiers changed from: private */
    public final k.h0.e.d o;
    private final k.h0.e.d p;
    /* access modifiers changed from: private */
    public final k.h0.e.d q;
    /* access modifiers changed from: private */
    public final k r;
    /* access modifiers changed from: private */
    public long s;
    /* access modifiers changed from: private */
    public long t;
    private long u;
    /* access modifiers changed from: private */
    public long v;
    /* access modifiers changed from: private */
    public long w;
    private long x;
    private final l y;
    private l z;

    /* compiled from: TaskQueue.kt */
    public static final class a extends k.h0.e.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f11364e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f11365f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, e eVar, long j2) {
            super(str2, false, 2, (DefaultConstructorMarker) null);
            this.f11364e = eVar;
            this.f11365f = j2;
        }

        public long f() {
            boolean z;
            synchronized (this.f11364e) {
                if (this.f11364e.t < this.f11364e.s) {
                    z = true;
                } else {
                    e eVar = this.f11364e;
                    eVar.s = eVar.s + 1;
                    z = false;
                }
            }
            if (z) {
                this.f11364e.b0((IOException) null);
                return -1;
            }
            this.f11364e.c1(false, 1, 0);
            return this.f11365f;
        }
    }

    /* compiled from: Http2Connection.kt */
    public static final class b {
        public Socket a;
        public String b;
        public l.h c;

        /* renamed from: d  reason: collision with root package name */
        public l.g f11366d;

        /* renamed from: e  reason: collision with root package name */
        private d f11367e = d.a;

        /* renamed from: f  reason: collision with root package name */
        private k f11368f = k.a;

        /* renamed from: g  reason: collision with root package name */
        private int f11369g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f11370h;

        /* renamed from: i  reason: collision with root package name */
        private final k.h0.e.e f11371i;

        public b(boolean z, k.h0.e.e eVar) {
            kotlin.jvm.internal.k.f(eVar, "taskRunner");
            this.f11370h = z;
            this.f11371i = eVar;
        }

        public final e a() {
            return new e(this);
        }

        public final boolean b() {
            return this.f11370h;
        }

        public final String c() {
            String str = this.b;
            if (str != null) {
                return str;
            }
            kotlin.jvm.internal.k.q("connectionName");
            throw null;
        }

        public final d d() {
            return this.f11367e;
        }

        public final int e() {
            return this.f11369g;
        }

        public final k f() {
            return this.f11368f;
        }

        public final l.g g() {
            l.g gVar = this.f11366d;
            if (gVar != null) {
                return gVar;
            }
            kotlin.jvm.internal.k.q("sink");
            throw null;
        }

        public final Socket h() {
            Socket socket = this.a;
            if (socket != null) {
                return socket;
            }
            kotlin.jvm.internal.k.q(Channel.SOCKET_CHANNEL_ID);
            throw null;
        }

        public final l.h i() {
            l.h hVar = this.c;
            if (hVar != null) {
                return hVar;
            }
            kotlin.jvm.internal.k.q("source");
            throw null;
        }

        public final k.h0.e.e j() {
            return this.f11371i;
        }

        public final b k(d dVar) {
            kotlin.jvm.internal.k.f(dVar, "listener");
            this.f11367e = dVar;
            return this;
        }

        public final b l(int i2) {
            this.f11369g = i2;
            return this;
        }

        public final b m(Socket socket, String str, l.h hVar, l.g gVar) {
            String str2;
            kotlin.jvm.internal.k.f(socket, Channel.SOCKET_CHANNEL_ID);
            kotlin.jvm.internal.k.f(str, "peerName");
            kotlin.jvm.internal.k.f(hVar, "source");
            kotlin.jvm.internal.k.f(gVar, "sink");
            this.a = socket;
            if (this.f11370h) {
                str2 = k.h0.b.f10366h + ' ' + str;
            } else {
                str2 = "MockWebServer " + str;
            }
            this.b = str2;
            this.c = hVar;
            this.f11366d = gVar;
            return this;
        }
    }

    /* compiled from: Http2Connection.kt */
    public static final class c {
        private c() {
        }

        public final l a() {
            return e.I;
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Http2Connection.kt */
    public static abstract class d {
        public static final d a = new a();

        /* compiled from: Http2Connection.kt */
        public static final class a extends d {
            a() {
            }

            public void c(h hVar) {
                kotlin.jvm.internal.k.f(hVar, "stream");
                hVar.d(a.REFUSED_STREAM, (IOException) null);
            }
        }

        /* compiled from: Http2Connection.kt */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new b((DefaultConstructorMarker) null);
        }

        public void b(e eVar, l lVar) {
            kotlin.jvm.internal.k.f(eVar, "connection");
            kotlin.jvm.internal.k.f(lVar, "settings");
        }

        public abstract void c(h hVar);
    }

    /* renamed from: okhttp3.internal.http2.e$e  reason: collision with other inner class name */
    /* compiled from: Http2Connection.kt */
    public final class C0796e implements g.c, kotlin.e0.c.a<x> {

        /* renamed from: g  reason: collision with root package name */
        private final g f11372g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f11373h;

        /* renamed from: okhttp3.internal.http2.e$e$a */
        /* compiled from: TaskQueue.kt */
        public static final class a extends k.h0.e.a {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C0796e f11374e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ u f11375f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z, String str2, boolean z2, C0796e eVar, boolean z3, u uVar, l lVar, t tVar, u uVar2) {
                super(str2, z2);
                this.f11374e = eVar;
                this.f11375f = uVar;
            }

            public long f() {
                this.f11374e.f11373h.r0().b(this.f11374e.f11373h, (l) this.f11375f.f10686g);
                return -1;
            }
        }

        /* renamed from: okhttp3.internal.http2.e$e$b */
        /* compiled from: TaskQueue.kt */
        public static final class b extends k.h0.e.a {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ h f11376e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C0796e f11377f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z, String str2, boolean z2, h hVar, C0796e eVar, h hVar2, int i2, List list, boolean z3) {
                super(str2, z2);
                this.f11376e = hVar;
                this.f11377f = eVar;
            }

            public long f() {
                try {
                    this.f11377f.f11373h.r0().c(this.f11376e);
                    return -1;
                } catch (IOException e2) {
                    k.h0.i.h g2 = k.h0.i.h.c.g();
                    g2.k("Http2Connection.Listener failure for " + this.f11377f.f11373h.l0(), 4, e2);
                    try {
                        this.f11376e.d(a.PROTOCOL_ERROR, e2);
                        return -1;
                    } catch (IOException unused) {
                        return -1;
                    }
                }
            }
        }

        /* renamed from: okhttp3.internal.http2.e$e$c */
        /* compiled from: TaskQueue.kt */
        public static final class c extends k.h0.e.a {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C0796e f11378e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ int f11379f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ int f11380g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z, String str2, boolean z2, C0796e eVar, int i2, int i3) {
                super(str2, z2);
                this.f11378e = eVar;
                this.f11379f = i2;
                this.f11380g = i3;
            }

            public long f() {
                this.f11378e.f11373h.c1(true, this.f11379f, this.f11380g);
                return -1;
            }
        }

        /* renamed from: okhttp3.internal.http2.e$e$d */
        /* compiled from: TaskQueue.kt */
        public static final class d extends k.h0.e.a {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C0796e f11381e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ boolean f11382f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ l f11383g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(String str, boolean z, String str2, boolean z2, C0796e eVar, boolean z3, l lVar) {
                super(str2, z2);
                this.f11381e = eVar;
                this.f11382f = z3;
                this.f11383g = lVar;
            }

            public long f() {
                this.f11381e.q(this.f11382f, this.f11383g);
                return -1;
            }
        }

        public C0796e(e eVar, g gVar) {
            kotlin.jvm.internal.k.f(gVar, "reader");
            this.f11373h = eVar;
            this.f11372g = gVar;
        }

        public void a() {
        }

        public void b(boolean z, l lVar) {
            kotlin.jvm.internal.k.f(lVar, "settings");
            String str = this.f11373h.l0() + " applyAndAckSettings";
            this.f11373h.o.i(new d(str, true, str, true, this, z, lVar), 0);
        }

        public void c(boolean z, int i2, l.h hVar, int i3) {
            kotlin.jvm.internal.k.f(hVar, "source");
            if (this.f11373h.R0(i2)) {
                this.f11373h.N0(i2, hVar, i3, z);
                return;
            }
            h G0 = this.f11373h.G0(i2);
            if (G0 == null) {
                this.f11373h.e1(i2, a.PROTOCOL_ERROR);
                long j2 = (long) i3;
                this.f11373h.Z0(j2);
                hVar.x(j2);
                return;
            }
            G0.w(hVar, i3);
            if (z) {
                G0.x(k.h0.b.b, true);
            }
        }

        public /* bridge */ /* synthetic */ Object d() {
            r();
            return x.a;
        }

        public void e(boolean z, int i2, int i3) {
            if (z) {
                synchronized (this.f11373h) {
                    if (i2 == 1) {
                        e eVar = this.f11373h;
                        eVar.t = eVar.t + 1;
                    } else if (i2 != 2) {
                        if (i2 == 3) {
                            e eVar2 = this.f11373h;
                            eVar2.w = eVar2.w + 1;
                            e eVar3 = this.f11373h;
                            if (eVar3 != null) {
                                eVar3.notifyAll();
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                            }
                        }
                        x xVar = x.a;
                    } else {
                        e eVar4 = this.f11373h;
                        eVar4.v = eVar4.v + 1;
                    }
                }
                return;
            }
            String str = this.f11373h.l0() + " ping";
            this.f11373h.o.i(new c(str, true, str, true, this, i2, i3), 0);
        }

        public void f(int i2, int i3, int i4, boolean z) {
        }

        public void g(int i2, a aVar) {
            kotlin.jvm.internal.k.f(aVar, "errorCode");
            if (this.f11373h.R0(i2)) {
                this.f11373h.Q0(i2, aVar);
                return;
            }
            h S0 = this.f11373h.S0(i2);
            if (S0 != null) {
                S0.y(aVar);
            }
        }

        public void i(boolean z, int i2, int i3, List<b> list) {
            boolean z2 = z;
            int i4 = i2;
            List<b> list2 = list;
            kotlin.jvm.internal.k.f(list2, "headerBlock");
            if (this.f11373h.R0(i4)) {
                this.f11373h.O0(i4, list2, z2);
                return;
            }
            synchronized (this.f11373h) {
                h G0 = this.f11373h.G0(i4);
                if (G0 != null) {
                    x xVar = x.a;
                    G0.x(k.h0.b.L(list), z2);
                } else if (!this.f11373h.f11362m) {
                    if (i4 > this.f11373h.n0()) {
                        if (i4 % 2 != this.f11373h.t0() % 2) {
                            h hVar = new h(i2, this.f11373h, false, z, k.h0.b.L(list));
                            this.f11373h.U0(i4);
                            this.f11373h.H0().put(Integer.valueOf(i2), hVar);
                            String str = this.f11373h.l0() + '[' + i4 + "] onStream";
                            this.f11373h.f11363n.i().i(new b(str, true, str, true, hVar, this, G0, i2, list, z), 0);
                        }
                    }
                }
            }
        }

        public void j(int i2, long j2) {
            if (i2 == 0) {
                synchronized (this.f11373h) {
                    e eVar = this.f11373h;
                    eVar.D = eVar.I0() + j2;
                    e eVar2 = this.f11373h;
                    if (eVar2 != null) {
                        eVar2.notifyAll();
                        x xVar = x.a;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                    }
                }
                return;
            }
            h G0 = this.f11373h.G0(i2);
            if (G0 != null) {
                synchronized (G0) {
                    G0.a(j2);
                    x xVar2 = x.a;
                }
            }
        }

        public void m(int i2, int i3, List<b> list) {
            kotlin.jvm.internal.k.f(list, "requestHeaders");
            this.f11373h.P0(i3, list);
        }

        public void p(int i2, a aVar, l.i iVar) {
            int i3;
            h[] hVarArr;
            kotlin.jvm.internal.k.f(aVar, "errorCode");
            kotlin.jvm.internal.k.f(iVar, "debugData");
            iVar.G();
            synchronized (this.f11373h) {
                Object[] array = this.f11373h.H0().values().toArray(new h[0]);
                if (array != null) {
                    hVarArr = (h[]) array;
                    this.f11373h.f11362m = true;
                    x xVar = x.a;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            for (h hVar : hVarArr) {
                if (hVar.j() > i2 && hVar.t()) {
                    hVar.y(a.REFUSED_STREAM);
                    this.f11373h.S0(hVar.j());
                }
            }
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
            	at java.util.ArrayList.get(ArrayList.java:435)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        public final void q(boolean r23, okhttp3.internal.http2.l r24) {
            /*
                r22 = this;
                r12 = r22
                r0 = r24
                java.lang.String r1 = "settings"
                kotlin.jvm.internal.k.f(r0, r1)
                kotlin.jvm.internal.t r13 = new kotlin.jvm.internal.t
                r13.<init>()
                kotlin.jvm.internal.u r14 = new kotlin.jvm.internal.u
                r14.<init>()
                kotlin.jvm.internal.u r15 = new kotlin.jvm.internal.u
                r15.<init>()
                okhttp3.internal.http2.e r1 = r12.f11373h
                okhttp3.internal.http2.i r16 = r1.J0()
                monitor-enter(r16)
                okhttp3.internal.http2.e r11 = r12.f11373h     // Catch:{ all -> 0x0111 }
                monitor-enter(r11)     // Catch:{ all -> 0x0111 }
                okhttp3.internal.http2.e r1 = r12.f11373h     // Catch:{ all -> 0x010c }
                okhttp3.internal.http2.l r1 = r1.F0()     // Catch:{ all -> 0x010c }
                if (r23 == 0) goto L_0x002d
                r15.f10686g = r0     // Catch:{ all -> 0x010c }
                goto L_0x003a
            L_0x002d:
                okhttp3.internal.http2.l r2 = new okhttp3.internal.http2.l     // Catch:{ all -> 0x010c }
                r2.<init>()     // Catch:{ all -> 0x010c }
                r2.g(r1)     // Catch:{ all -> 0x010c }
                r2.g(r0)     // Catch:{ all -> 0x010c }
                r15.f10686g = r2     // Catch:{ all -> 0x010c }
            L_0x003a:
                T r2 = r15.f10686g     // Catch:{ all -> 0x010c }
                okhttp3.internal.http2.l r2 = (okhttp3.internal.http2.l) r2     // Catch:{ all -> 0x010c }
                int r2 = r2.c()     // Catch:{ all -> 0x010c }
                long r2 = (long) r2     // Catch:{ all -> 0x010c }
                int r1 = r1.c()     // Catch:{ all -> 0x010c }
                long r4 = (long) r1     // Catch:{ all -> 0x010c }
                long r2 = r2 - r4
                r13.f10685g = r2     // Catch:{ all -> 0x010c }
                r10 = 0
                r17 = 0
                r8 = 0
                int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r1 == 0) goto L_0x007e
                okhttp3.internal.http2.e r1 = r12.f11373h     // Catch:{ all -> 0x010c }
                java.util.Map r1 = r1.H0()     // Catch:{ all -> 0x010c }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x010c }
                if (r1 == 0) goto L_0x0061
                goto L_0x007e
            L_0x0061:
                okhttp3.internal.http2.e r1 = r12.f11373h     // Catch:{ all -> 0x010c }
                java.util.Map r1 = r1.H0()     // Catch:{ all -> 0x010c }
                java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x010c }
                okhttp3.internal.http2.h[] r2 = new okhttp3.internal.http2.h[r10]     // Catch:{ all -> 0x010c }
                java.lang.Object[] r1 = r1.toArray(r2)     // Catch:{ all -> 0x010c }
                if (r1 == 0) goto L_0x0076
                okhttp3.internal.http2.h[] r1 = (okhttp3.internal.http2.h[]) r1     // Catch:{ all -> 0x010c }
                goto L_0x0080
            L_0x0076:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ all -> 0x010c }
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
                r0.<init>(r1)     // Catch:{ all -> 0x010c }
                throw r0     // Catch:{ all -> 0x010c }
            L_0x007e:
                r1 = r17
            L_0x0080:
                r14.f10686g = r1     // Catch:{ all -> 0x010c }
                okhttp3.internal.http2.e r1 = r12.f11373h     // Catch:{ all -> 0x010c }
                T r2 = r15.f10686g     // Catch:{ all -> 0x010c }
                okhttp3.internal.http2.l r2 = (okhttp3.internal.http2.l) r2     // Catch:{ all -> 0x010c }
                r1.V0(r2)     // Catch:{ all -> 0x010c }
                okhttp3.internal.http2.e r1 = r12.f11373h     // Catch:{ all -> 0x010c }
                k.h0.e.d r7 = r1.q     // Catch:{ all -> 0x010c }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x010c }
                r1.<init>()     // Catch:{ all -> 0x010c }
                okhttp3.internal.http2.e r2 = r12.f11373h     // Catch:{ all -> 0x010c }
                java.lang.String r2 = r2.l0()     // Catch:{ all -> 0x010c }
                r1.append(r2)     // Catch:{ all -> 0x010c }
                java.lang.String r2 = " onSettings"
                r1.append(r2)     // Catch:{ all -> 0x010c }
                java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x010c }
                r5 = 1
                okhttp3.internal.http2.e$e$a r6 = new okhttp3.internal.http2.e$e$a     // Catch:{ all -> 0x010c }
                r1 = r6
                r2 = r4
                r3 = r5
                r18 = r6
                r6 = r22
                r19 = r7
                r7 = r23
                r8 = r15
                r9 = r24
                r20 = 0
                r10 = r13
                r21 = r11
                r11 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x010a }
                r1 = r18
                r0 = r19
                r2 = 0
                r0.i(r1, r2)     // Catch:{ all -> 0x010a }
                kotlin.x r0 = kotlin.x.a     // Catch:{ all -> 0x010a }
                monitor-exit(r21)     // Catch:{ all -> 0x0111 }
                okhttp3.internal.http2.e r0 = r12.f11373h     // Catch:{ IOException -> 0x00dc }
                okhttp3.internal.http2.i r0 = r0.J0()     // Catch:{ IOException -> 0x00dc }
                T r1 = r15.f10686g     // Catch:{ IOException -> 0x00dc }
                okhttp3.internal.http2.l r1 = (okhttp3.internal.http2.l) r1     // Catch:{ IOException -> 0x00dc }
                r0.a(r1)     // Catch:{ IOException -> 0x00dc }
                goto L_0x00e2
            L_0x00dc:
                r0 = move-exception
                okhttp3.internal.http2.e r1 = r12.f11373h     // Catch:{ all -> 0x0111 }
                r1.b0(r0)     // Catch:{ all -> 0x0111 }
            L_0x00e2:
                kotlin.x r0 = kotlin.x.a     // Catch:{ all -> 0x0111 }
                monitor-exit(r16)
                T r0 = r14.f10686g
                r1 = r0
                okhttp3.internal.http2.h[] r1 = (okhttp3.internal.http2.h[]) r1
                if (r1 == 0) goto L_0x0109
                okhttp3.internal.http2.h[] r0 = (okhttp3.internal.http2.h[]) r0
                if (r0 == 0) goto L_0x0105
                int r1 = r0.length
                r10 = 0
            L_0x00f2:
                if (r10 >= r1) goto L_0x0109
                r2 = r0[r10]
                monitor-enter(r2)
                long r3 = r13.f10685g     // Catch:{ all -> 0x0102 }
                r2.a(r3)     // Catch:{ all -> 0x0102 }
                kotlin.x r3 = kotlin.x.a     // Catch:{ all -> 0x0102 }
                monitor-exit(r2)
                int r10 = r10 + 1
                goto L_0x00f2
            L_0x0102:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x0105:
                kotlin.jvm.internal.k.m()
                throw r17
            L_0x0109:
                return
            L_0x010a:
                r0 = move-exception
                goto L_0x010f
            L_0x010c:
                r0 = move-exception
                r21 = r11
            L_0x010f:
                monitor-exit(r21)     // Catch:{ all -> 0x0111 }
                throw r0     // Catch:{ all -> 0x0111 }
            L_0x0111:
                r0 = move-exception
                monitor-exit(r16)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.C0796e.q(boolean, okhttp3.internal.http2.l):void");
        }

        public void r() {
            a aVar;
            a aVar2;
            a aVar3 = a.INTERNAL_ERROR;
            e = null;
            try {
                this.f11372g.h(this);
                while (this.f11372g.b(false, this)) {
                }
                aVar = a.NO_ERROR;
                try {
                    aVar2 = a.CANCEL;
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (IOException e3) {
                e = e3;
                aVar = aVar3;
                try {
                    aVar = a.PROTOCOL_ERROR;
                    aVar2 = a.PROTOCOL_ERROR;
                    this.f11373h.Z(aVar, aVar2, e);
                    k.h0.b.j(this.f11372g);
                } catch (Throwable th) {
                    th = th;
                    this.f11373h.Z(aVar, aVar3, e);
                    k.h0.b.j(this.f11372g);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                aVar = aVar3;
                this.f11373h.Z(aVar, aVar3, e);
                k.h0.b.j(this.f11372g);
                throw th;
            }
            this.f11373h.Z(aVar, aVar2, e);
            k.h0.b.j(this.f11372g);
        }
    }

    /* compiled from: TaskQueue.kt */
    public static final class f extends k.h0.e.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f11384e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f11385f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ l.f f11386g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f11387h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f11388i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z, String str2, boolean z2, e eVar, int i2, l.f fVar, int i3, boolean z3) {
            super(str2, z2);
            this.f11384e = eVar;
            this.f11385f = i2;
            this.f11386g = fVar;
            this.f11387h = i3;
            this.f11388i = z3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long f() {
            /*
                r5 = this;
                okhttp3.internal.http2.e r0 = r5.f11384e     // Catch:{ IOException -> 0x003e }
                okhttp3.internal.http2.k r0 = r0.r     // Catch:{ IOException -> 0x003e }
                int r1 = r5.f11385f     // Catch:{ IOException -> 0x003e }
                l.f r2 = r5.f11386g     // Catch:{ IOException -> 0x003e }
                int r3 = r5.f11387h     // Catch:{ IOException -> 0x003e }
                boolean r4 = r5.f11388i     // Catch:{ IOException -> 0x003e }
                boolean r0 = r0.d(r1, r2, r3, r4)     // Catch:{ IOException -> 0x003e }
                if (r0 == 0) goto L_0x0021
                okhttp3.internal.http2.e r1 = r5.f11384e     // Catch:{ IOException -> 0x003e }
                okhttp3.internal.http2.i r1 = r1.J0()     // Catch:{ IOException -> 0x003e }
                int r2 = r5.f11385f     // Catch:{ IOException -> 0x003e }
                okhttp3.internal.http2.a r3 = okhttp3.internal.http2.a.CANCEL     // Catch:{ IOException -> 0x003e }
                r1.y(r2, r3)     // Catch:{ IOException -> 0x003e }
            L_0x0021:
                if (r0 != 0) goto L_0x0027
                boolean r0 = r5.f11388i     // Catch:{ IOException -> 0x003e }
                if (r0 == 0) goto L_0x003e
            L_0x0027:
                okhttp3.internal.http2.e r0 = r5.f11384e     // Catch:{ IOException -> 0x003e }
                monitor-enter(r0)     // Catch:{ IOException -> 0x003e }
                okhttp3.internal.http2.e r1 = r5.f11384e     // Catch:{ all -> 0x003b }
                java.util.Set r1 = r1.H     // Catch:{ all -> 0x003b }
                int r2 = r5.f11385f     // Catch:{ all -> 0x003b }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x003b }
                r1.remove(r2)     // Catch:{ all -> 0x003b }
                monitor-exit(r0)     // Catch:{ IOException -> 0x003e }
                goto L_0x003e
            L_0x003b:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ IOException -> 0x003e }
                throw r1     // Catch:{ IOException -> 0x003e }
            L_0x003e:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.f.f():long");
        }
    }

    /* compiled from: TaskQueue.kt */
    public static final class g extends k.h0.e.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f11389e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f11390f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ List f11391g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f11392h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z, String str2, boolean z2, e eVar, int i2, List list, boolean z3) {
            super(str2, z2);
            this.f11389e = eVar;
            this.f11390f = i2;
            this.f11391g = list;
            this.f11392h = z3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long f() {
            /*
                r4 = this;
                okhttp3.internal.http2.e r0 = r4.f11389e
                okhttp3.internal.http2.k r0 = r0.r
                int r1 = r4.f11390f
                java.util.List r2 = r4.f11391g
                boolean r3 = r4.f11392h
                boolean r0 = r0.b(r1, r2, r3)
                if (r0 == 0) goto L_0x001f
                okhttp3.internal.http2.e r1 = r4.f11389e     // Catch:{ IOException -> 0x003c }
                okhttp3.internal.http2.i r1 = r1.J0()     // Catch:{ IOException -> 0x003c }
                int r2 = r4.f11390f     // Catch:{ IOException -> 0x003c }
                okhttp3.internal.http2.a r3 = okhttp3.internal.http2.a.CANCEL     // Catch:{ IOException -> 0x003c }
                r1.y(r2, r3)     // Catch:{ IOException -> 0x003c }
            L_0x001f:
                if (r0 != 0) goto L_0x0025
                boolean r0 = r4.f11392h     // Catch:{ IOException -> 0x003c }
                if (r0 == 0) goto L_0x003c
            L_0x0025:
                okhttp3.internal.http2.e r0 = r4.f11389e     // Catch:{ IOException -> 0x003c }
                monitor-enter(r0)     // Catch:{ IOException -> 0x003c }
                okhttp3.internal.http2.e r1 = r4.f11389e     // Catch:{ all -> 0x0039 }
                java.util.Set r1 = r1.H     // Catch:{ all -> 0x0039 }
                int r2 = r4.f11390f     // Catch:{ all -> 0x0039 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0039 }
                r1.remove(r2)     // Catch:{ all -> 0x0039 }
                monitor-exit(r0)     // Catch:{ IOException -> 0x003c }
                goto L_0x003c
            L_0x0039:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ IOException -> 0x003c }
                throw r1     // Catch:{ IOException -> 0x003c }
            L_0x003c:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.g.f():long");
        }
    }

    /* compiled from: TaskQueue.kt */
    public static final class h extends k.h0.e.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f11393e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f11394f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ List f11395g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z, String str2, boolean z2, e eVar, int i2, List list) {
            super(str2, z2);
            this.f11393e = eVar;
            this.f11394f = i2;
            this.f11395g = list;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long f() {
            /*
                r3 = this;
                okhttp3.internal.http2.e r0 = r3.f11393e
                okhttp3.internal.http2.k r0 = r0.r
                int r1 = r3.f11394f
                java.util.List r2 = r3.f11395g
                boolean r0 = r0.a(r1, r2)
                if (r0 == 0) goto L_0x0034
                okhttp3.internal.http2.e r0 = r3.f11393e     // Catch:{ IOException -> 0x0034 }
                okhttp3.internal.http2.i r0 = r0.J0()     // Catch:{ IOException -> 0x0034 }
                int r1 = r3.f11394f     // Catch:{ IOException -> 0x0034 }
                okhttp3.internal.http2.a r2 = okhttp3.internal.http2.a.CANCEL     // Catch:{ IOException -> 0x0034 }
                r0.y(r1, r2)     // Catch:{ IOException -> 0x0034 }
                okhttp3.internal.http2.e r0 = r3.f11393e     // Catch:{ IOException -> 0x0034 }
                monitor-enter(r0)     // Catch:{ IOException -> 0x0034 }
                okhttp3.internal.http2.e r1 = r3.f11393e     // Catch:{ all -> 0x0031 }
                java.util.Set r1 = r1.H     // Catch:{ all -> 0x0031 }
                int r2 = r3.f11394f     // Catch:{ all -> 0x0031 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0031 }
                r1.remove(r2)     // Catch:{ all -> 0x0031 }
                monitor-exit(r0)     // Catch:{ IOException -> 0x0034 }
                goto L_0x0034
            L_0x0031:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ IOException -> 0x0034 }
                throw r1     // Catch:{ IOException -> 0x0034 }
            L_0x0034:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.h.f():long");
        }
    }

    /* compiled from: TaskQueue.kt */
    public static final class i extends k.h0.e.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f11396e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f11397f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f11398g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z, String str2, boolean z2, e eVar, int i2, a aVar) {
            super(str2, z2);
            this.f11396e = eVar;
            this.f11397f = i2;
            this.f11398g = aVar;
        }

        public long f() {
            this.f11396e.r.c(this.f11397f, this.f11398g);
            synchronized (this.f11396e) {
                this.f11396e.H.remove(Integer.valueOf(this.f11397f));
            }
            return -1;
        }
    }

    /* compiled from: TaskQueue.kt */
    public static final class j extends k.h0.e.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f11399e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(String str, boolean z, String str2, boolean z2, e eVar) {
            super(str2, z2);
            this.f11399e = eVar;
        }

        public long f() {
            this.f11399e.c1(false, 2, 0);
            return -1;
        }
    }

    /* compiled from: TaskQueue.kt */
    public static final class k extends k.h0.e.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f11400e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f11401f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f11402g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z, String str2, boolean z2, e eVar, int i2, a aVar) {
            super(str2, z2);
            this.f11400e = eVar;
            this.f11401f = i2;
            this.f11402g = aVar;
        }

        public long f() {
            try {
                this.f11400e.d1(this.f11401f, this.f11402g);
                return -1;
            } catch (IOException e2) {
                this.f11400e.b0(e2);
                return -1;
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    public static final class l extends k.h0.e.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f11403e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f11404f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f11405g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z, String str2, boolean z2, e eVar, int i2, long j2) {
            super(str2, z2);
            this.f11403e = eVar;
            this.f11404f = i2;
            this.f11405g = j2;
        }

        public long f() {
            try {
                this.f11403e.J0().D(this.f11404f, this.f11405g);
                return -1;
            } catch (IOException e2) {
                this.f11403e.b0(e2);
                return -1;
            }
        }
    }

    static {
        l lVar = new l();
        lVar.h(7, 65535);
        lVar.h(5, 16384);
        I = lVar;
    }

    public e(b bVar) {
        kotlin.jvm.internal.k.f(bVar, "builder");
        this.f11356g = bVar.b();
        this.f11357h = bVar.d();
        this.f11359j = bVar.c();
        this.f11361l = bVar.b() ? 3 : 2;
        k.h0.e.e j2 = bVar.j();
        this.f11363n = j2;
        this.o = j2.i();
        this.p = this.f11363n.i();
        this.q = this.f11363n.i();
        this.r = bVar.f();
        l lVar = new l();
        if (bVar.b()) {
            lVar.h(7, 16777216);
        }
        this.y = lVar;
        l lVar2 = I;
        this.z = lVar2;
        this.D = (long) lVar2.c();
        this.E = bVar.h();
        this.F = new i(bVar.g(), this.f11356g);
        this.G = new C0796e(this, new g(bVar.i(), this.f11356g));
        this.H = new LinkedHashSet();
        if (bVar.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) bVar.e());
            String str = this.f11359j + " ping";
            this.o.i(new a(str, str, this, nanos), nanos);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final okhttp3.internal.http2.h L0(int r11, java.util.List<okhttp3.internal.http2.b> r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            okhttp3.internal.http2.i r7 = r10.F
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0088 }
            int r0 = r10.f11361l     // Catch:{ all -> 0x0085 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0013
            okhttp3.internal.http2.a r0 = okhttp3.internal.http2.a.REFUSED_STREAM     // Catch:{ all -> 0x0085 }
            r10.W0(r0)     // Catch:{ all -> 0x0085 }
        L_0x0013:
            boolean r0 = r10.f11362m     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x007f
            int r8 = r10.f11361l     // Catch:{ all -> 0x0085 }
            int r0 = r10.f11361l     // Catch:{ all -> 0x0085 }
            int r0 = r0 + 2
            r10.f11361l = r0     // Catch:{ all -> 0x0085 }
            okhttp3.internal.http2.h r9 = new okhttp3.internal.http2.h     // Catch:{ all -> 0x0085 }
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0085 }
            r0 = 1
            if (r13 == 0) goto L_0x0043
            long r1 = r10.C     // Catch:{ all -> 0x0085 }
            long r3 = r10.D     // Catch:{ all -> 0x0085 }
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x0043
            long r1 = r9.r()     // Catch:{ all -> 0x0085 }
            long r3 = r9.q()     // Catch:{ all -> 0x0085 }
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r13 = 0
            goto L_0x0044
        L_0x0043:
            r13 = 1
        L_0x0044:
            boolean r1 = r9.u()     // Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x0053
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.h> r1 = r10.f11358i     // Catch:{ all -> 0x0085 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0085 }
            r1.put(r2, r9)     // Catch:{ all -> 0x0085 }
        L_0x0053:
            kotlin.x r1 = kotlin.x.a     // Catch:{ all -> 0x0085 }
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            if (r11 != 0) goto L_0x005e
            okhttp3.internal.http2.i r11 = r10.F     // Catch:{ all -> 0x0088 }
            r11.l(r6, r8, r12)     // Catch:{ all -> 0x0088 }
            goto L_0x0068
        L_0x005e:
            boolean r1 = r10.f11356g     // Catch:{ all -> 0x0088 }
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0073
            okhttp3.internal.http2.i r0 = r10.F     // Catch:{ all -> 0x0088 }
            r0.q(r11, r8, r12)     // Catch:{ all -> 0x0088 }
        L_0x0068:
            kotlin.x r11 = kotlin.x.a     // Catch:{ all -> 0x0088 }
            monitor-exit(r7)
            if (r13 == 0) goto L_0x0072
            okhttp3.internal.http2.i r11 = r10.F
            r11.flush()
        L_0x0072:
            return r9
        L_0x0073:
            java.lang.String r11 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0088 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0088 }
            r12.<init>(r11)     // Catch:{ all -> 0x0088 }
            throw r12     // Catch:{ all -> 0x0088 }
        L_0x007f:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x0085 }
            r11.<init>()     // Catch:{ all -> 0x0085 }
            throw r11     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            throw r11     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.L0(int, java.util.List, boolean):okhttp3.internal.http2.h");
    }

    public static /* synthetic */ void Y0(e eVar, boolean z2, k.h0.e.e eVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        if ((i2 & 2) != 0) {
            eVar2 = k.h0.e.e.f10412h;
        }
        eVar.X0(z2, eVar2);
    }

    /* access modifiers changed from: private */
    public final void b0(IOException iOException) {
        a aVar = a.PROTOCOL_ERROR;
        Z(aVar, aVar, iOException);
    }

    public final l F0() {
        return this.z;
    }

    public final synchronized h G0(int i2) {
        return this.f11358i.get(Integer.valueOf(i2));
    }

    public final Map<Integer, h> H0() {
        return this.f11358i;
    }

    public final long I0() {
        return this.D;
    }

    public final i J0() {
        return this.F;
    }

    public final synchronized boolean K0(long j2) {
        if (this.f11362m) {
            return false;
        }
        if (this.v >= this.u || j2 < this.x) {
            return true;
        }
        return false;
    }

    public final h M0(List<b> list, boolean z2) {
        kotlin.jvm.internal.k.f(list, "requestHeaders");
        return L0(0, list, z2);
    }

    public final void N0(int i2, l.h hVar, int i3, boolean z2) {
        kotlin.jvm.internal.k.f(hVar, "source");
        l.f fVar = new l.f();
        long j2 = (long) i3;
        hVar.s0(j2);
        hVar.g0(fVar, j2);
        String str = this.f11359j + '[' + i2 + "] onData";
        this.p.i(new f(str, true, str, true, this, i2, fVar, i3, z2), 0);
    }

    public final void O0(int i2, List<b> list, boolean z2) {
        kotlin.jvm.internal.k.f(list, "requestHeaders");
        String str = this.f11359j + '[' + i2 + "] onHeaders";
        this.p.i(new g(str, true, str, true, this, i2, list, z2), 0);
    }

    public final void P0(int i2, List<b> list) {
        kotlin.jvm.internal.k.f(list, "requestHeaders");
        synchronized (this) {
            if (this.H.contains(Integer.valueOf(i2))) {
                e1(i2, a.PROTOCOL_ERROR);
                return;
            }
            this.H.add(Integer.valueOf(i2));
            String str = this.f11359j + '[' + i2 + "] onRequest";
            this.p.i(new h(str, true, str, true, this, i2, list), 0);
        }
    }

    public final void Q0(int i2, a aVar) {
        kotlin.jvm.internal.k.f(aVar, "errorCode");
        String str = this.f11359j + '[' + i2 + "] onReset";
        this.p.i(new i(str, true, str, true, this, i2, aVar), 0);
    }

    public final boolean R0(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    public final synchronized h S0(int i2) {
        h remove;
        remove = this.f11358i.remove(Integer.valueOf(i2));
        notifyAll();
        return remove;
    }

    public final void T0() {
        synchronized (this) {
            if (this.v >= this.u) {
                this.u++;
                this.x = System.nanoTime() + ((long) 1000000000);
                x xVar = x.a;
                String str = this.f11359j + " ping";
                this.o.i(new j(str, true, str, true, this), 0);
            }
        }
    }

    public final void U0(int i2) {
        this.f11360k = i2;
    }

    public final void V0(l lVar) {
        kotlin.jvm.internal.k.f(lVar, "<set-?>");
        this.z = lVar;
    }

    public final void W0(a aVar) {
        kotlin.jvm.internal.k.f(aVar, "statusCode");
        synchronized (this.F) {
            synchronized (this) {
                if (!this.f11362m) {
                    this.f11362m = true;
                    int i2 = this.f11360k;
                    x xVar = x.a;
                    this.F.k(i2, aVar, k.h0.b.a);
                    x xVar2 = x.a;
                }
            }
        }
    }

    public final void X0(boolean z2, k.h0.e.e eVar) {
        kotlin.jvm.internal.k.f(eVar, "taskRunner");
        if (z2) {
            this.F.b();
            this.F.z(this.y);
            int c2 = this.y.c();
            if (c2 != 65535) {
                this.F.D(0, (long) (c2 - 65535));
            }
        }
        k.h0.e.d i2 = eVar.i();
        String str = this.f11359j;
        i2.i(new k.h0.e.c(this.G, str, true, str, true), 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:6|7|8|45|(2:22|(5:24|25|26|39|27))|29|30|31|32|33|35) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0084 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Z(okhttp3.internal.http2.a r4, okhttp3.internal.http2.a r5, java.io.IOException r6) {
        /*
            r3 = this;
            java.lang.String r0 = "connectionCode"
            kotlin.jvm.internal.k.f(r4, r0)
            java.lang.String r0 = "streamCode"
            kotlin.jvm.internal.k.f(r5, r0)
            boolean r0 = k.h0.b.f10365g
            if (r0 == 0) goto L_0x0041
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto L_0x0015
            goto L_0x0041
        L_0x0015:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Thread "
            r5.append(r6)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r0 = "Thread.currentThread()"
            kotlin.jvm.internal.k.b(r6, r0)
            java.lang.String r6 = r6.getName()
            r5.append(r6)
            java.lang.String r6 = " MUST NOT hold lock on "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x0041:
            r3.W0(r4)     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            r4 = 0
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.h> r0 = r3.f11358i     // Catch:{ all -> 0x0099 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0099 }
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L_0x006f
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.h> r4 = r3.f11358i     // Catch:{ all -> 0x0099 }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x0099 }
            okhttp3.internal.http2.h[] r0 = new okhttp3.internal.http2.h[r1]     // Catch:{ all -> 0x0099 }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x0099 }
            if (r4 == 0) goto L_0x0067
            okhttp3.internal.http2.h[] r4 = (okhttp3.internal.http2.h[]) r4     // Catch:{ all -> 0x0099 }
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.h> r0 = r3.f11358i     // Catch:{ all -> 0x0099 }
            r0.clear()     // Catch:{ all -> 0x0099 }
            goto L_0x006f
        L_0x0067:
            kotlin.TypeCastException r4 = new kotlin.TypeCastException     // Catch:{ all -> 0x0099 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r4.<init>(r5)     // Catch:{ all -> 0x0099 }
            throw r4     // Catch:{ all -> 0x0099 }
        L_0x006f:
            kotlin.x r0 = kotlin.x.a     // Catch:{ all -> 0x0099 }
            monitor-exit(r3)
            if (r4 == 0) goto L_0x007f
            int r0 = r4.length
        L_0x0075:
            if (r1 >= r0) goto L_0x007f
            r2 = r4[r1]
            r2.d(r5, r6)     // Catch:{ IOException -> 0x007c }
        L_0x007c:
            int r1 = r1 + 1
            goto L_0x0075
        L_0x007f:
            okhttp3.internal.http2.i r4 = r3.F     // Catch:{ IOException -> 0x0084 }
            r4.close()     // Catch:{ IOException -> 0x0084 }
        L_0x0084:
            java.net.Socket r4 = r3.E     // Catch:{ IOException -> 0x0089 }
            r4.close()     // Catch:{ IOException -> 0x0089 }
        L_0x0089:
            k.h0.e.d r4 = r3.o
            r4.n()
            k.h0.e.d r4 = r3.p
            r4.n()
            k.h0.e.d r4 = r3.q
            r4.n()
            return
        L_0x0099:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.Z(okhttp3.internal.http2.a, okhttp3.internal.http2.a, java.io.IOException):void");
    }

    public final synchronized void Z0(long j2) {
        long j3 = this.A + j2;
        this.A = j3;
        long j4 = j3 - this.B;
        if (j4 >= ((long) (this.y.c() / 2))) {
            f1(0, j4);
            this.B += j4;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r5 = (int) java.lang.Math.min(r13, r9.D - r9.C);
        r3.f10684g = r5;
        r4 = java.lang.Math.min(r5, r9.F.n());
        r3.f10684g = r4;
        r9.C += (long) r4;
        r5 = kotlin.x.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0079, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a1(int r10, boolean r11, l.f r12, long r13) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            okhttp3.internal.http2.i r13 = r9.F
            r13.h(r11, r10, r12, r0)
            return
        L_0x000d:
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x007c
            kotlin.jvm.internal.s r3 = new kotlin.jvm.internal.s
            r3.<init>()
            monitor-enter(r9)
        L_0x0017:
            long r4 = r9.C     // Catch:{ InterruptedException -> 0x006d }
            long r6 = r9.D     // Catch:{ InterruptedException -> 0x006d }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0037
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.h> r4 = r9.f11358i     // Catch:{ InterruptedException -> 0x006d }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ InterruptedException -> 0x006d }
            boolean r4 = r4.containsKey(r5)     // Catch:{ InterruptedException -> 0x006d }
            if (r4 == 0) goto L_0x002f
            r9.wait()     // Catch:{ InterruptedException -> 0x006d }
            goto L_0x0017
        L_0x002f:
            java.io.IOException r10 = new java.io.IOException     // Catch:{ InterruptedException -> 0x006d }
            java.lang.String r11 = "stream closed"
            r10.<init>(r11)     // Catch:{ InterruptedException -> 0x006d }
            throw r10     // Catch:{ InterruptedException -> 0x006d }
        L_0x0037:
            long r4 = r9.D     // Catch:{ all -> 0x006b }
            long r6 = r9.C     // Catch:{ all -> 0x006b }
            long r4 = r4 - r6
            long r4 = java.lang.Math.min(r13, r4)     // Catch:{ all -> 0x006b }
            int r5 = (int) r4     // Catch:{ all -> 0x006b }
            r3.f10684g = r5     // Catch:{ all -> 0x006b }
            okhttp3.internal.http2.i r4 = r9.F     // Catch:{ all -> 0x006b }
            int r4 = r4.n()     // Catch:{ all -> 0x006b }
            int r4 = java.lang.Math.min(r5, r4)     // Catch:{ all -> 0x006b }
            r3.f10684g = r4     // Catch:{ all -> 0x006b }
            long r5 = r9.C     // Catch:{ all -> 0x006b }
            long r7 = (long) r4     // Catch:{ all -> 0x006b }
            long r5 = r5 + r7
            r9.C = r5     // Catch:{ all -> 0x006b }
            kotlin.x r5 = kotlin.x.a     // Catch:{ all -> 0x006b }
            monitor-exit(r9)
            long r4 = (long) r4
            long r13 = r13 - r4
            okhttp3.internal.http2.i r4 = r9.F
            if (r11 == 0) goto L_0x0064
            int r5 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0064
            r5 = 1
            goto L_0x0065
        L_0x0064:
            r5 = 0
        L_0x0065:
            int r3 = r3.f10684g
            r4.h(r5, r10, r12, r3)
            goto L_0x000d
        L_0x006b:
            r10 = move-exception
            goto L_0x007a
        L_0x006d:
            java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x006b }
            r10.interrupt()     // Catch:{ all -> 0x006b }
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch:{ all -> 0x006b }
            r10.<init>()     // Catch:{ all -> 0x006b }
            throw r10     // Catch:{ all -> 0x006b }
        L_0x007a:
            monitor-exit(r9)
            throw r10
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.a1(int, boolean, l.f, long):void");
    }

    public final void b1(int i2, boolean z2, List<b> list) {
        kotlin.jvm.internal.k.f(list, "alternating");
        this.F.l(z2, i2, list);
    }

    public final void c1(boolean z2, int i2, int i3) {
        try {
            this.F.o(z2, i2, i3);
        } catch (IOException e2) {
            b0(e2);
        }
    }

    public void close() {
        Z(a.NO_ERROR, a.CANCEL, (IOException) null);
    }

    public final void d1(int i2, a aVar) {
        kotlin.jvm.internal.k.f(aVar, "statusCode");
        this.F.y(i2, aVar);
    }

    public final void e1(int i2, a aVar) {
        kotlin.jvm.internal.k.f(aVar, "errorCode");
        String str = this.f11359j + '[' + i2 + "] writeSynReset";
        this.o.i(new k(str, true, str, true, this, i2, aVar), 0);
    }

    public final void f1(int i2, long j2) {
        String str = this.f11359j + '[' + i2 + "] windowUpdate";
        this.o.i(new l(str, true, str, true, this, i2, j2), 0);
    }

    public final void flush() {
        this.F.flush();
    }

    public final boolean i0() {
        return this.f11356g;
    }

    public final String l0() {
        return this.f11359j;
    }

    public final int n0() {
        return this.f11360k;
    }

    public final d r0() {
        return this.f11357h;
    }

    public final int t0() {
        return this.f11361l;
    }

    public final l w0() {
        return this.y;
    }
}
