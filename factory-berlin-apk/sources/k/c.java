package k;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import k.b0;
import k.d0;
import k.h0.d.d;
import k.h0.e.e;
import k.h0.f.f;
import k.u;
import kotlin.TypeCastException;
import kotlin.jvm.internal.x;
import l.b0;
import l.g;
import l.h;
import l.i;
import l.j;
import l.k;
import l.p;
import l.z;

/* compiled from: Cache.kt */
public final class c implements Closeable, Flushable {

    /* renamed from: m  reason: collision with root package name */
    public static final b f10281m = new b((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private final k.h0.d.d f10282g;

    /* renamed from: h  reason: collision with root package name */
    private int f10283h;

    /* renamed from: i  reason: collision with root package name */
    private int f10284i;

    /* renamed from: j  reason: collision with root package name */
    private int f10285j;

    /* renamed from: k  reason: collision with root package name */
    private int f10286k;

    /* renamed from: l  reason: collision with root package name */
    private int f10287l;

    /* compiled from: Cache.kt */
    private static final class a extends e0 {

        /* renamed from: i  reason: collision with root package name */
        private final h f10288i;

        /* renamed from: j  reason: collision with root package name */
        private final d.C0740d f10289j;

        /* renamed from: k  reason: collision with root package name */
        private final String f10290k;

        /* renamed from: l  reason: collision with root package name */
        private final String f10291l;

        /* renamed from: k.c$a$a  reason: collision with other inner class name */
        /* compiled from: Cache.kt */
        public static final class C0735a extends k {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ a f10292h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0735a(a aVar, b0 b0Var, b0 b0Var2) {
                super(b0Var2);
                this.f10292h = aVar;
            }

            public void close() {
                this.f10292h.q().close();
                super.close();
            }
        }

        public a(d.C0740d dVar, String str, String str2) {
            kotlin.jvm.internal.k.f(dVar, "snapshot");
            this.f10289j = dVar;
            this.f10290k = str;
            this.f10291l = str2;
            b0 b = dVar.b(1);
            this.f10288i = p.d(new C0735a(this, b, b));
        }

        public long i() {
            String str = this.f10291l;
            if (str != null) {
                return k.h0.b.Q(str, -1);
            }
            return -1;
        }

        public x j() {
            String str = this.f10290k;
            if (str != null) {
                return x.f10543f.b(str);
            }
            return null;
        }

        public h n() {
            return this.f10288i;
        }

        public final d.C0740d q() {
            return this.f10289j;
        }
    }

    /* compiled from: Cache.kt */
    public static final class b {
        private b() {
        }

        private final Set<String> d(u uVar) {
            int size = uVar.size();
            TreeSet treeSet = null;
            for (int i2 = 0; i2 < size; i2++) {
                if (p.q("Vary", uVar.d(i2), true)) {
                    String j2 = uVar.j(i2);
                    if (treeSet == null) {
                        treeSet = new TreeSet(p.r(x.a));
                    }
                    for (String str : q.m0(j2, new char[]{','}, false, 0, 6, (Object) null)) {
                        if (str != null) {
                            treeSet.add(q.F0(str).toString());
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                    }
                    continue;
                }
            }
            return treeSet != null ? treeSet : i0.b();
        }

        private final u e(u uVar, u uVar2) {
            Set<String> d2 = d(uVar2);
            if (d2.isEmpty()) {
                return k.h0.b.b;
            }
            u.a aVar = new u.a();
            int size = uVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                String d3 = uVar.d(i2);
                if (d2.contains(d3)) {
                    aVar.a(d3, uVar.j(i2));
                }
            }
            return aVar.e();
        }

        public final boolean a(d0 d0Var) {
            kotlin.jvm.internal.k.f(d0Var, "$this$hasVaryAll");
            return d(d0Var.y()).contains("*");
        }

        public final String b(v vVar) {
            kotlin.jvm.internal.k.f(vVar, "url");
            return i.f11104k.d(vVar.toString()).x().t();
        }

        public final int c(h hVar) {
            kotlin.jvm.internal.k.f(hVar, "source");
            try {
                long e0 = hVar.e0();
                String N = hVar.N();
                if (e0 >= 0 && e0 <= ((long) Integer.MAX_VALUE)) {
                    if (!(N.length() > 0)) {
                        return (int) e0;
                    }
                }
                throw new IOException("expected an int but was \"" + e0 + N + '\"');
            } catch (NumberFormatException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        public final u f(d0 d0Var) {
            kotlin.jvm.internal.k.f(d0Var, "$this$varyHeaders");
            d0 F = d0Var.F();
            if (F != null) {
                return e(F.Z().f(), d0Var.y());
            }
            kotlin.jvm.internal.k.m();
            throw null;
        }

        public final boolean g(d0 d0Var, u uVar, b0 b0Var) {
            kotlin.jvm.internal.k.f(d0Var, "cachedResponse");
            kotlin.jvm.internal.k.f(uVar, "cachedRequest");
            kotlin.jvm.internal.k.f(b0Var, "newRequest");
            Set<String> d2 = d(d0Var.y());
            if ((d2 instanceof Collection) && d2.isEmpty()) {
                return true;
            }
            for (String str : d2) {
                if (!kotlin.jvm.internal.k.a(uVar.k(str), b0Var.e(str))) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Cache.kt */
    private final class d implements k.h0.d.b {
        private final z a;
        private final z b;
        private boolean c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final d.b f10302d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c f10303e;

        /* compiled from: Cache.kt */
        public static final class a extends j {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ d f10304h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar, z zVar) {
                super(zVar);
                this.f10304h = dVar;
            }

            public void close() {
                synchronized (this.f10304h.f10303e) {
                    if (!this.f10304h.d()) {
                        this.f10304h.e(true);
                        c cVar = this.f10304h.f10303e;
                        cVar.n(cVar.i() + 1);
                        super.close();
                        this.f10304h.f10302d.b();
                    }
                }
            }
        }

        public d(c cVar, d.b bVar) {
            kotlin.jvm.internal.k.f(bVar, "editor");
            this.f10303e = cVar;
            this.f10302d = bVar;
            z f2 = bVar.f(1);
            this.a = f2;
            this.b = new a(this, f2);
        }

        public void a() {
            synchronized (this.f10303e) {
                if (!this.c) {
                    this.c = true;
                    c cVar = this.f10303e;
                    cVar.l(cVar.h() + 1);
                    k.h0.b.j(this.a);
                    try {
                        this.f10302d.a();
                    } catch (IOException unused) {
                    }
                }
            }
        }

        public z b() {
            return this.b;
        }

        public final boolean d() {
            return this.c;
        }

        public final void e(boolean z) {
            this.c = z;
        }
    }

    public c(File file, long j2, k.h0.h.b bVar) {
        kotlin.jvm.internal.k.f(file, "directory");
        kotlin.jvm.internal.k.f(bVar, "fileSystem");
        this.f10282g = new k.h0.d.d(bVar, file, 201105, 2, j2, e.f10412h);
    }

    private final void a(d.b bVar) {
        if (bVar != null) {
            try {
                bVar.a();
            } catch (IOException unused) {
            }
        }
    }

    public final d0 b(b0 b0Var) {
        kotlin.jvm.internal.k.f(b0Var, "request");
        try {
            d.C0740d F = this.f10282g.F(f10281m.b(b0Var.k()));
            if (F != null) {
                try {
                    C0736c cVar = new C0736c(F.b(0));
                    d0 d2 = cVar.d(F);
                    if (cVar.b(b0Var, d2)) {
                        return d2;
                    }
                    e0 a2 = d2.a();
                    if (a2 != null) {
                        k.h0.b.j(a2);
                    }
                    return null;
                } catch (IOException unused) {
                    k.h0.b.j(F);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    public void close() {
        this.f10282g.close();
    }

    public void flush() {
        this.f10282g.flush();
    }

    public final int h() {
        return this.f10284i;
    }

    public final int i() {
        return this.f10283h;
    }

    public final k.h0.d.b j(d0 d0Var) {
        d.b bVar;
        kotlin.jvm.internal.k.f(d0Var, "response");
        String h2 = d0Var.Z().h();
        if (f.a.a(d0Var.Z().h())) {
            try {
                k(d0Var.Z());
            } catch (IOException unused) {
            }
            return null;
        } else if ((!kotlin.jvm.internal.k.a(h2, "GET")) || f10281m.a(d0Var)) {
            return null;
        } else {
            C0736c cVar = new C0736c(d0Var);
            try {
                bVar = k.h0.d.d.D(this.f10282g, f10281m.b(d0Var.Z().k()), 0, 2, (Object) null);
                if (bVar == null) {
                    return null;
                }
                try {
                    cVar.f(bVar);
                    return new d(this, bVar);
                } catch (IOException unused2) {
                    a(bVar);
                    return null;
                }
            } catch (IOException unused3) {
                bVar = null;
                a(bVar);
                return null;
            }
        }
    }

    public final void k(b0 b0Var) {
        kotlin.jvm.internal.k.f(b0Var, "request");
        this.f10282g.w0(f10281m.b(b0Var.k()));
    }

    public final void l(int i2) {
        this.f10284i = i2;
    }

    public final void n(int i2) {
        this.f10283h = i2;
    }

    public final synchronized void o() {
        this.f10286k++;
    }

    public final synchronized void q(k.h0.d.c cVar) {
        kotlin.jvm.internal.k.f(cVar, "cacheStrategy");
        this.f10287l++;
        if (cVar.b() != null) {
            this.f10285j++;
        } else if (cVar.a() != null) {
            this.f10286k++;
        }
    }

    public final void y(d0 d0Var, d0 d0Var2) {
        kotlin.jvm.internal.k.f(d0Var, "cached");
        kotlin.jvm.internal.k.f(d0Var2, "network");
        C0736c cVar = new C0736c(d0Var2);
        e0 a2 = d0Var.a();
        if (a2 != null) {
            try {
                d.b a3 = ((a) a2).q().a();
                if (a3 != null) {
                    cVar.f(a3);
                    a3.b();
                }
            } catch (IOException unused) {
                a((d.b) null);
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(File file, long j2) {
        this(file, j2, k.h0.h.b.a);
        kotlin.jvm.internal.k.f(file, "directory");
    }

    /* renamed from: k.c$c  reason: collision with other inner class name */
    /* compiled from: Cache.kt */
    private static final class C0736c {

        /* renamed from: k  reason: collision with root package name */
        private static final String f10293k = (k.h0.i.h.c.g().g() + "-Sent-Millis");

        /* renamed from: l  reason: collision with root package name */
        private static final String f10294l = (k.h0.i.h.c.g().g() + "-Received-Millis");
        private final String a;
        private final u b;
        private final String c;

        /* renamed from: d  reason: collision with root package name */
        private final a0 f10295d;

        /* renamed from: e  reason: collision with root package name */
        private final int f10296e;

        /* renamed from: f  reason: collision with root package name */
        private final String f10297f;

        /* renamed from: g  reason: collision with root package name */
        private final u f10298g;

        /* renamed from: h  reason: collision with root package name */
        private final t f10299h;

        /* renamed from: i  reason: collision with root package name */
        private final long f10300i;

        /* renamed from: j  reason: collision with root package name */
        private final long f10301j;

        /* renamed from: k.c$c$a */
        /* compiled from: Cache.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new a((DefaultConstructorMarker) null);
        }

        public C0736c(b0 b0Var) {
            g0 g0Var;
            kotlin.jvm.internal.k.f(b0Var, "rawSource");
            try {
                h d2 = p.d(b0Var);
                this.a = d2.N();
                this.c = d2.N();
                u.a aVar = new u.a();
                int c2 = c.f10281m.c(d2);
                boolean z = false;
                for (int i2 = 0; i2 < c2; i2++) {
                    aVar.b(d2.N());
                }
                this.b = aVar.e();
                k.h0.f.k a2 = k.h0.f.k.f10429d.a(d2.N());
                this.f10295d = a2.a;
                this.f10296e = a2.b;
                this.f10297f = a2.c;
                u.a aVar2 = new u.a();
                int c3 = c.f10281m.c(d2);
                for (int i3 = 0; i3 < c3; i3++) {
                    aVar2.b(d2.N());
                }
                String f2 = aVar2.f(f10293k);
                String f3 = aVar2.f(f10294l);
                aVar2.h(f10293k);
                aVar2.h(f10294l);
                long j2 = 0;
                this.f10300i = f2 != null ? Long.parseLong(f2) : 0;
                this.f10301j = f3 != null ? Long.parseLong(f3) : j2;
                this.f10298g = aVar2.e();
                if (a()) {
                    String N = d2.N();
                    if (!(N.length() > 0 ? true : z)) {
                        i b2 = i.t.b(d2.N());
                        List<Certificate> c4 = c(d2);
                        List<Certificate> c5 = c(d2);
                        if (!d2.Q()) {
                            g0Var = g0.f10360n.a(d2.N());
                        } else {
                            g0Var = g0.SSL_3_0;
                        }
                        this.f10299h = t.f10519e.b(g0Var, b2, c4, c5);
                    } else {
                        throw new IOException("expected \"\" but was \"" + N + '\"');
                    }
                } else {
                    this.f10299h = null;
                }
            } finally {
                b0Var.close();
            }
        }

        private final boolean a() {
            return p.D(this.a, "https://", false, 2, (Object) null);
        }

        private final List<Certificate> c(h hVar) {
            int c2 = c.f10281m.c(hVar);
            if (c2 == -1) {
                return n.g();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(c2);
                int i2 = 0;
                while (i2 < c2) {
                    String N = hVar.N();
                    l.f fVar = new l.f();
                    i a2 = i.f11104k.a(N);
                    if (a2 != null) {
                        fVar.X0(a2);
                        arrayList.add(instance.generateCertificate(fVar.D0()));
                        i2++;
                    } else {
                        kotlin.jvm.internal.k.m();
                        throw null;
                    }
                }
                return arrayList;
            } catch (CertificateException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        private final void e(g gVar, List<? extends Certificate> list) {
            try {
                gVar.v0((long) list.size()).R(10);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] encoded = ((Certificate) list.get(i2)).getEncoded();
                    i.a aVar = i.f11104k;
                    kotlin.jvm.internal.k.b(encoded, "bytes");
                    gVar.u0(i.a.g(aVar, encoded, 0, 0, 3, (Object) null).a()).R(10);
                }
            } catch (CertificateEncodingException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        public final boolean b(b0 b0Var, d0 d0Var) {
            kotlin.jvm.internal.k.f(b0Var, "request");
            kotlin.jvm.internal.k.f(d0Var, "response");
            return kotlin.jvm.internal.k.a(this.a, b0Var.k().toString()) && kotlin.jvm.internal.k.a(this.c, b0Var.h()) && c.f10281m.g(d0Var, this.b, b0Var);
        }

        public final d0 d(d.C0740d dVar) {
            kotlin.jvm.internal.k.f(dVar, "snapshot");
            String a2 = this.f10298g.a("Content-Type");
            String a3 = this.f10298g.a("Content-Length");
            b0.a aVar = new b0.a();
            aVar.l(this.a);
            aVar.g(this.c, (c0) null);
            aVar.f(this.b);
            b0 b2 = aVar.b();
            d0.a aVar2 = new d0.a();
            aVar2.r(b2);
            aVar2.p(this.f10295d);
            aVar2.g(this.f10296e);
            aVar2.m(this.f10297f);
            aVar2.k(this.f10298g);
            aVar2.b(new a(dVar, a2, a3));
            aVar2.i(this.f10299h);
            aVar2.s(this.f10300i);
            aVar2.q(this.f10301j);
            return aVar2.c();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0118, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0119, code lost:
            kotlin.io.a.a(r8, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x011c, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void f(k.h0.d.d.b r8) {
            /*
                r7 = this;
                java.lang.String r0 = "editor"
                kotlin.jvm.internal.k.f(r8, r0)
                r0 = 0
                l.z r8 = r8.f(r0)
                l.g r8 = l.p.c(r8)
                java.lang.String r1 = r7.a     // Catch:{ all -> 0x0116 }
                l.g r1 = r8.u0(r1)     // Catch:{ all -> 0x0116 }
                r2 = 10
                r1.R(r2)     // Catch:{ all -> 0x0116 }
                java.lang.String r1 = r7.c     // Catch:{ all -> 0x0116 }
                l.g r1 = r8.u0(r1)     // Catch:{ all -> 0x0116 }
                r1.R(r2)     // Catch:{ all -> 0x0116 }
                k.u r1 = r7.b     // Catch:{ all -> 0x0116 }
                int r1 = r1.size()     // Catch:{ all -> 0x0116 }
                long r3 = (long) r1     // Catch:{ all -> 0x0116 }
                l.g r1 = r8.v0(r3)     // Catch:{ all -> 0x0116 }
                r1.R(r2)     // Catch:{ all -> 0x0116 }
                k.u r1 = r7.b     // Catch:{ all -> 0x0116 }
                int r1 = r1.size()     // Catch:{ all -> 0x0116 }
                r3 = 0
            L_0x0037:
                java.lang.String r4 = ": "
                if (r3 >= r1) goto L_0x0059
                k.u r5 = r7.b     // Catch:{ all -> 0x0116 }
                java.lang.String r5 = r5.d(r3)     // Catch:{ all -> 0x0116 }
                l.g r5 = r8.u0(r5)     // Catch:{ all -> 0x0116 }
                l.g r4 = r5.u0(r4)     // Catch:{ all -> 0x0116 }
                k.u r5 = r7.b     // Catch:{ all -> 0x0116 }
                java.lang.String r5 = r5.j(r3)     // Catch:{ all -> 0x0116 }
                l.g r4 = r4.u0(r5)     // Catch:{ all -> 0x0116 }
                r4.R(r2)     // Catch:{ all -> 0x0116 }
                int r3 = r3 + 1
                goto L_0x0037
            L_0x0059:
                k.h0.f.k r1 = new k.h0.f.k     // Catch:{ all -> 0x0116 }
                k.a0 r3 = r7.f10295d     // Catch:{ all -> 0x0116 }
                int r5 = r7.f10296e     // Catch:{ all -> 0x0116 }
                java.lang.String r6 = r7.f10297f     // Catch:{ all -> 0x0116 }
                r1.<init>(r3, r5, r6)     // Catch:{ all -> 0x0116 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0116 }
                l.g r1 = r8.u0(r1)     // Catch:{ all -> 0x0116 }
                r1.R(r2)     // Catch:{ all -> 0x0116 }
                k.u r1 = r7.f10298g     // Catch:{ all -> 0x0116 }
                int r1 = r1.size()     // Catch:{ all -> 0x0116 }
                int r1 = r1 + 2
                long r5 = (long) r1     // Catch:{ all -> 0x0116 }
                l.g r1 = r8.v0(r5)     // Catch:{ all -> 0x0116 }
                r1.R(r2)     // Catch:{ all -> 0x0116 }
                k.u r1 = r7.f10298g     // Catch:{ all -> 0x0116 }
                int r1 = r1.size()     // Catch:{ all -> 0x0116 }
            L_0x0085:
                if (r0 >= r1) goto L_0x00a5
                k.u r3 = r7.f10298g     // Catch:{ all -> 0x0116 }
                java.lang.String r3 = r3.d(r0)     // Catch:{ all -> 0x0116 }
                l.g r3 = r8.u0(r3)     // Catch:{ all -> 0x0116 }
                l.g r3 = r3.u0(r4)     // Catch:{ all -> 0x0116 }
                k.u r5 = r7.f10298g     // Catch:{ all -> 0x0116 }
                java.lang.String r5 = r5.j(r0)     // Catch:{ all -> 0x0116 }
                l.g r3 = r3.u0(r5)     // Catch:{ all -> 0x0116 }
                r3.R(r2)     // Catch:{ all -> 0x0116 }
                int r0 = r0 + 1
                goto L_0x0085
            L_0x00a5:
                java.lang.String r0 = f10293k     // Catch:{ all -> 0x0116 }
                l.g r0 = r8.u0(r0)     // Catch:{ all -> 0x0116 }
                l.g r0 = r0.u0(r4)     // Catch:{ all -> 0x0116 }
                long r5 = r7.f10300i     // Catch:{ all -> 0x0116 }
                l.g r0 = r0.v0(r5)     // Catch:{ all -> 0x0116 }
                r0.R(r2)     // Catch:{ all -> 0x0116 }
                java.lang.String r0 = f10294l     // Catch:{ all -> 0x0116 }
                l.g r0 = r8.u0(r0)     // Catch:{ all -> 0x0116 }
                l.g r0 = r0.u0(r4)     // Catch:{ all -> 0x0116 }
                long r3 = r7.f10301j     // Catch:{ all -> 0x0116 }
                l.g r0 = r0.v0(r3)     // Catch:{ all -> 0x0116 }
                r0.R(r2)     // Catch:{ all -> 0x0116 }
                boolean r0 = r7.a()     // Catch:{ all -> 0x0116 }
                r1 = 0
                if (r0 == 0) goto L_0x0110
                r8.R(r2)     // Catch:{ all -> 0x0116 }
                k.t r0 = r7.f10299h     // Catch:{ all -> 0x0116 }
                if (r0 == 0) goto L_0x010c
                k.i r0 = r0.a()     // Catch:{ all -> 0x0116 }
                java.lang.String r0 = r0.d()     // Catch:{ all -> 0x0116 }
                l.g r0 = r8.u0(r0)     // Catch:{ all -> 0x0116 }
                r0.R(r2)     // Catch:{ all -> 0x0116 }
                k.t r0 = r7.f10299h     // Catch:{ all -> 0x0116 }
                java.util.List r0 = r0.e()     // Catch:{ all -> 0x0116 }
                r7.e(r8, r0)     // Catch:{ all -> 0x0116 }
                k.t r0 = r7.f10299h     // Catch:{ all -> 0x0116 }
                java.util.List r0 = r0.d()     // Catch:{ all -> 0x0116 }
                r7.e(r8, r0)     // Catch:{ all -> 0x0116 }
                k.t r0 = r7.f10299h     // Catch:{ all -> 0x0116 }
                k.g0 r0 = r0.f()     // Catch:{ all -> 0x0116 }
                java.lang.String r0 = r0.f()     // Catch:{ all -> 0x0116 }
                l.g r0 = r8.u0(r0)     // Catch:{ all -> 0x0116 }
                r0.R(r2)     // Catch:{ all -> 0x0116 }
                goto L_0x0110
            L_0x010c:
                kotlin.jvm.internal.k.m()     // Catch:{ all -> 0x0116 }
                throw r1
            L_0x0110:
                kotlin.x r0 = kotlin.x.a     // Catch:{ all -> 0x0116 }
                kotlin.io.a.a(r8, r1)
                return
            L_0x0116:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x0118 }
            L_0x0118:
                r1 = move-exception
                kotlin.io.a.a(r8, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: k.c.C0736c.f(k.h0.d.d$b):void");
        }

        public C0736c(d0 d0Var) {
            kotlin.jvm.internal.k.f(d0Var, "response");
            this.a = d0Var.Z().k().toString();
            this.b = c.f10281m.f(d0Var);
            this.c = d0Var.Z().h();
            this.f10295d = d0Var.M();
            this.f10296e = d0Var.j();
            this.f10297f = d0Var.D();
            this.f10298g = d0Var.y();
            this.f10299h = d0Var.l();
            this.f10300i = d0Var.b0();
            this.f10301j = d0Var.U();
        }
    }
}
