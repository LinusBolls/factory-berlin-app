package k.h0.d;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import k.h0.i.h;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;
import l.b0;
import l.g;
import l.p;

/* compiled from: DiskLruCache.kt */
public final class d implements Closeable, Flushable {
    public static final String B = B;
    public static final String C = C;
    public static final String D = D;
    public static final String E = E;
    public static final String F = F;
    public static final long G = -1;
    public static final kotlin.j0.f H = new kotlin.j0.f("[a-z0-9_-]{1,120}");
    public static final String I = I;
    public static final String J = J;
    public static final String K = K;
    public static final String L = L;
    private final int A;

    /* renamed from: g  reason: collision with root package name */
    private long f10380g;

    /* renamed from: h  reason: collision with root package name */
    private final File f10381h;

    /* renamed from: i  reason: collision with root package name */
    private final File f10382i;

    /* renamed from: j  reason: collision with root package name */
    private final File f10383j;

    /* renamed from: k  reason: collision with root package name */
    private long f10384k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public g f10385l;

    /* renamed from: m  reason: collision with root package name */
    private final LinkedHashMap<String, c> f10386m = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public int f10387n;
    /* access modifiers changed from: private */
    public boolean o;
    /* access modifiers changed from: private */
    public boolean p;
    /* access modifiers changed from: private */
    public boolean q;
    private boolean r;
    /* access modifiers changed from: private */
    public boolean s;
    /* access modifiers changed from: private */
    public boolean t;
    private long u;
    private final k.h0.e.d v;
    private final e w;
    private final k.h0.h.b x;
    private final File y;
    private final int z;

    /* compiled from: DiskLruCache.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: DiskLruCache.kt */
    public final class b {
        private final boolean[] a;
        private boolean b;
        private final c c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f10388d;

        /* compiled from: DiskLruCache.kt */
        static final class a extends l implements kotlin.e0.c.l<IOException, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ b f10389h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar, int i2) {
                super(1);
                this.f10389h = bVar;
            }

            public final void a(IOException iOException) {
                k.f(iOException, "it");
                synchronized (this.f10389h.f10388d) {
                    this.f10389h.c();
                    x xVar = x.a;
                }
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((IOException) obj);
                return x.a;
            }
        }

        public b(d dVar, c cVar) {
            k.f(cVar, "entry");
            this.f10388d = dVar;
            this.c = cVar;
            this.a = cVar.g() ? null : new boolean[dVar.U()];
        }

        public final void a() {
            synchronized (this.f10388d) {
                if (!this.b) {
                    if (k.a(this.c.b(), this)) {
                        this.f10388d.q(this, false);
                    }
                    this.b = true;
                    x xVar = x.a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void b() {
            synchronized (this.f10388d) {
                if (!this.b) {
                    if (k.a(this.c.b(), this)) {
                        this.f10388d.q(this, true);
                    }
                    this.b = true;
                    x xVar = x.a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void c() {
            if (!k.a(this.c.b(), this)) {
                return;
            }
            if (this.f10388d.p) {
                this.f10388d.q(this, false);
            } else {
                this.c.q(true);
            }
        }

        public final c d() {
            return this.c;
        }

        public final boolean[] e() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            r5 = l.p.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0057, code lost:
            return r5;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0052 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final l.z f(int r5) {
            /*
                r4 = this;
                k.h0.d.d r0 = r4.f10388d
                monitor-enter(r0)
                boolean r1 = r4.b     // Catch:{ all -> 0x0064 }
                r2 = 1
                r1 = r1 ^ r2
                if (r1 == 0) goto L_0x0058
                k.h0.d.d$c r1 = r4.c     // Catch:{ all -> 0x0064 }
                k.h0.d.d$b r1 = r1.b()     // Catch:{ all -> 0x0064 }
                boolean r1 = kotlin.jvm.internal.k.a(r1, r4)     // Catch:{ all -> 0x0064 }
                r1 = r1 ^ r2
                if (r1 == 0) goto L_0x001c
                l.z r5 = l.p.b()     // Catch:{ all -> 0x0064 }
                monitor-exit(r0)
                return r5
            L_0x001c:
                k.h0.d.d$c r1 = r4.c     // Catch:{ all -> 0x0064 }
                boolean r1 = r1.g()     // Catch:{ all -> 0x0064 }
                if (r1 != 0) goto L_0x0030
                boolean[] r1 = r4.a     // Catch:{ all -> 0x0064 }
                if (r1 == 0) goto L_0x002b
                r1[r5] = r2     // Catch:{ all -> 0x0064 }
                goto L_0x0030
            L_0x002b:
                kotlin.jvm.internal.k.m()     // Catch:{ all -> 0x0064 }
                r5 = 0
                throw r5
            L_0x0030:
                k.h0.d.d$c r1 = r4.c     // Catch:{ all -> 0x0064 }
                java.util.List r1 = r1.c()     // Catch:{ all -> 0x0064 }
                java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0064 }
                java.io.File r1 = (java.io.File) r1     // Catch:{ all -> 0x0064 }
                k.h0.d.d r2 = r4.f10388d     // Catch:{ FileNotFoundException -> 0x0052 }
                k.h0.h.b r2 = r2.M()     // Catch:{ FileNotFoundException -> 0x0052 }
                l.z r1 = r2.c(r1)     // Catch:{ FileNotFoundException -> 0x0052 }
                k.h0.d.e r2 = new k.h0.d.e     // Catch:{ all -> 0x0064 }
                k.h0.d.d$b$a r3 = new k.h0.d.d$b$a     // Catch:{ all -> 0x0064 }
                r3.<init>(r4, r5)     // Catch:{ all -> 0x0064 }
                r2.<init>(r1, r3)     // Catch:{ all -> 0x0064 }
                monitor-exit(r0)
                return r2
            L_0x0052:
                l.z r5 = l.p.b()     // Catch:{ all -> 0x0064 }
                monitor-exit(r0)
                return r5
            L_0x0058:
                java.lang.String r5 = "Check failed."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0064 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0064 }
                r1.<init>(r5)     // Catch:{ all -> 0x0064 }
                throw r1     // Catch:{ all -> 0x0064 }
            L_0x0064:
                r5 = move-exception
                monitor-exit(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: k.h0.d.d.b.f(int):l.z");
        }
    }

    /* compiled from: DiskLruCache.kt */
    public final class c {
        private final long[] a;
        private final List<File> b = new ArrayList();
        private final List<File> c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private boolean f10390d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f10391e;

        /* renamed from: f  reason: collision with root package name */
        private b f10392f;

        /* renamed from: g  reason: collision with root package name */
        private int f10393g;

        /* renamed from: h  reason: collision with root package name */
        private long f10394h;

        /* renamed from: i  reason: collision with root package name */
        private final String f10395i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ d f10396j;

        /* compiled from: DiskLruCache.kt */
        public static final class a extends l.k {

            /* renamed from: h  reason: collision with root package name */
            private boolean f10397h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ c f10398i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar, b0 b0Var, b0 b0Var2) {
                super(b0Var2);
                this.f10398i = cVar;
            }

            public void close() {
                super.close();
                if (!this.f10397h) {
                    this.f10397h = true;
                    synchronized (this.f10398i.f10396j) {
                        c cVar = this.f10398i;
                        cVar.n(cVar.f() - 1);
                        if (this.f10398i.f() == 0 && this.f10398i.i()) {
                            this.f10398i.f10396j.F0(this.f10398i);
                        }
                        x xVar = x.a;
                    }
                }
            }
        }

        public c(d dVar, String str) {
            k.f(str, "key");
            this.f10396j = dVar;
            this.f10395i = str;
            this.a = new long[dVar.U()];
            StringBuilder sb = new StringBuilder(this.f10395i);
            sb.append('.');
            int length = sb.length();
            int U = dVar.U();
            for (int i2 = 0; i2 < U; i2++) {
                sb.append(i2);
                this.b.add(new File(dVar.L(), sb.toString()));
                sb.append(".tmp");
                this.c.add(new File(dVar.L(), sb.toString()));
                sb.setLength(length);
            }
        }

        private final Void j(List<String> list) {
            throw new IOException("unexpected journal line: " + list);
        }

        private final b0 k(int i2) {
            b0 b2 = this.f10396j.M().b(this.b.get(i2));
            if (this.f10396j.p) {
                return b2;
            }
            this.f10393g++;
            return new a(this, b2, b2);
        }

        public final List<File> a() {
            return this.b;
        }

        public final b b() {
            return this.f10392f;
        }

        public final List<File> c() {
            return this.c;
        }

        public final String d() {
            return this.f10395i;
        }

        public final long[] e() {
            return this.a;
        }

        public final int f() {
            return this.f10393g;
        }

        public final boolean g() {
            return this.f10390d;
        }

        public final long h() {
            return this.f10394h;
        }

        public final boolean i() {
            return this.f10391e;
        }

        public final void l(b bVar) {
            this.f10392f = bVar;
        }

        public final void m(List<String> list) {
            k.f(list, "strings");
            if (list.size() == this.f10396j.U()) {
                try {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        this.a[i2] = Long.parseLong(list.get(i2));
                    }
                } catch (NumberFormatException unused) {
                    j(list);
                    throw null;
                }
            } else {
                j(list);
                throw null;
            }
        }

        public final void n(int i2) {
            this.f10393g = i2;
        }

        public final void o(boolean z) {
            this.f10390d = z;
        }

        public final void p(long j2) {
            this.f10394h = j2;
        }

        public final void q(boolean z) {
            this.f10391e = z;
        }

        public final C0740d r() {
            d dVar = this.f10396j;
            if (k.h0.b.f10365g && !Thread.holdsLock(dVar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread currentThread = Thread.currentThread();
                k.b(currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST hold lock on ");
                sb.append(dVar);
                throw new AssertionError(sb.toString());
            } else if (!this.f10390d) {
                return null;
            } else {
                if (!this.f10396j.p && (this.f10392f != null || this.f10391e)) {
                    return null;
                }
                ArrayList<b0> arrayList = new ArrayList<>();
                long[] jArr = (long[]) this.a.clone();
                try {
                    int U = this.f10396j.U();
                    for (int i2 = 0; i2 < U; i2++) {
                        arrayList.add(k(i2));
                    }
                    return new C0740d(this.f10396j, this.f10395i, this.f10394h, arrayList, jArr);
                } catch (FileNotFoundException unused) {
                    for (b0 j2 : arrayList) {
                        k.h0.b.j(j2);
                    }
                    try {
                        this.f10396j.F0(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
        }

        public final void s(g gVar) {
            k.f(gVar, "writer");
            for (long v0 : this.a) {
                gVar.R(32).v0(v0);
            }
        }
    }

    /* renamed from: k.h0.d.d$d  reason: collision with other inner class name */
    /* compiled from: DiskLruCache.kt */
    public final class C0740d implements Closeable {

        /* renamed from: g  reason: collision with root package name */
        private final String f10399g;

        /* renamed from: h  reason: collision with root package name */
        private final long f10400h;

        /* renamed from: i  reason: collision with root package name */
        private final List<b0> f10401i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ d f10402j;

        public C0740d(d dVar, String str, long j2, List<? extends b0> list, long[] jArr) {
            k.f(str, "key");
            k.f(list, "sources");
            k.f(jArr, "lengths");
            this.f10402j = dVar;
            this.f10399g = str;
            this.f10400h = j2;
            this.f10401i = list;
        }

        public final b a() {
            return this.f10402j.z(this.f10399g, this.f10400h);
        }

        public final b0 b(int i2) {
            return this.f10401i.get(i2);
        }

        public void close() {
            for (b0 j2 : this.f10401i) {
                k.h0.b.j(j2);
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    public static final class e extends k.h0.e.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f10403e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d dVar, String str) {
            super(str, false, 2, (DefaultConstructorMarker) null);
            this.f10403e = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            k.h0.d.d.k(r6.f10403e, true);
            k.h0.d.d.j(r6.f10403e, l.p.c(l.p.b()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0036 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long f() {
            /*
                r6 = this;
                k.h0.d.d r0 = r6.f10403e
                monitor-enter(r0)
                k.h0.d.d r1 = r6.f10403e     // Catch:{ all -> 0x004c }
                boolean r1 = r1.q     // Catch:{ all -> 0x004c }
                r2 = -1
                if (r1 == 0) goto L_0x004a
                k.h0.d.d r1 = r6.f10403e     // Catch:{ all -> 0x004c }
                boolean r1 = r1.K()     // Catch:{ all -> 0x004c }
                if (r1 == 0) goto L_0x0016
                goto L_0x004a
            L_0x0016:
                r1 = 1
                k.h0.d.d r4 = r6.f10403e     // Catch:{ IOException -> 0x001d }
                r4.H0()     // Catch:{ IOException -> 0x001d }
                goto L_0x0022
            L_0x001d:
                k.h0.d.d r4 = r6.f10403e     // Catch:{ all -> 0x004c }
                r4.s = r1     // Catch:{ all -> 0x004c }
            L_0x0022:
                k.h0.d.d r4 = r6.f10403e     // Catch:{ IOException -> 0x0036 }
                boolean r4 = r4.b0()     // Catch:{ IOException -> 0x0036 }
                if (r4 == 0) goto L_0x0048
                k.h0.d.d r4 = r6.f10403e     // Catch:{ IOException -> 0x0036 }
                r4.t0()     // Catch:{ IOException -> 0x0036 }
                k.h0.d.d r4 = r6.f10403e     // Catch:{ IOException -> 0x0036 }
                r5 = 0
                r4.f10387n = r5     // Catch:{ IOException -> 0x0036 }
                goto L_0x0048
            L_0x0036:
                k.h0.d.d r4 = r6.f10403e     // Catch:{ all -> 0x004c }
                r4.t = r1     // Catch:{ all -> 0x004c }
                k.h0.d.d r1 = r6.f10403e     // Catch:{ all -> 0x004c }
                l.z r4 = l.p.b()     // Catch:{ all -> 0x004c }
                l.g r4 = l.p.c(r4)     // Catch:{ all -> 0x004c }
                r1.f10385l = r4     // Catch:{ all -> 0x004c }
            L_0x0048:
                monitor-exit(r0)
                return r2
            L_0x004a:
                monitor-exit(r0)
                return r2
            L_0x004c:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: k.h0.d.d.e.f():long");
        }
    }

    /* compiled from: DiskLruCache.kt */
    static final class f extends l implements kotlin.e0.c.l<IOException, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f10404h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar) {
            super(1);
            this.f10404h = dVar;
        }

        public final void a(IOException iOException) {
            k.f(iOException, "it");
            d dVar = this.f10404h;
            if (!k.h0.b.f10365g || Thread.holdsLock(dVar)) {
                this.f10404h.o = true;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.b(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(dVar);
            throw new AssertionError(sb.toString());
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((IOException) obj);
            return x.a;
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public d(k.h0.h.b bVar, File file, int i2, int i3, long j2, k.h0.e.e eVar) {
        k.f(bVar, "fileSystem");
        k.f(file, "directory");
        k.f(eVar, "taskRunner");
        this.x = bVar;
        this.y = file;
        this.z = i2;
        this.A = i3;
        this.f10380g = j2;
        boolean z2 = false;
        this.v = eVar.i();
        this.w = new e(this, k.h0.b.f10366h + " Cache");
        if (j2 > 0) {
            if (this.A > 0 ? true : z2) {
                this.f10381h = new File(this.y, B);
                this.f10382i = new File(this.y, C);
                this.f10383j = new File(this.y, D);
                return;
            }
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    public static /* synthetic */ b D(d dVar, String str, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = G;
        }
        return dVar.z(str, j2);
    }

    private final boolean G0() {
        for (c next : this.f10386m.values()) {
            if (!next.i()) {
                k.b(next, "toEvict");
                F0(next);
                return true;
            }
        }
        return false;
    }

    private final void I0(String str) {
        if (!H.a(str)) {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
        }
    }

    /* access modifiers changed from: private */
    public final boolean b0() {
        int i2 = this.f10387n;
        return i2 >= 2000 && i2 >= this.f10386m.size();
    }

    private final g i0() {
        return p.c(new e(this.x.e(this.f10381h), new f(this)));
    }

    private final void l0() {
        this.x.a(this.f10382i);
        Iterator<c> it = this.f10386m.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            k.b(next, "i.next()");
            c cVar = next;
            int i2 = 0;
            if (cVar.b() == null) {
                int i3 = this.A;
                while (i2 < i3) {
                    this.f10384k += cVar.e()[i2];
                    i2++;
                }
            } else {
                cVar.l((b) null);
                int i4 = this.A;
                while (i2 < i4) {
                    this.x.a(cVar.a().get(i2));
                    this.x.a(cVar.c().get(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:18|19|(1:21)(1:22)|23|24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r9.f10387n = r7 - r9.f10386m.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        if (r1.Q() == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        t0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        r9.f10385l = i0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
        r0 = kotlin.x.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        kotlin.io.a.a(r1, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b5, code lost:
        kotlin.io.a.a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b8, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0064 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0064=Splitter:B:18:0x0064, B:26:0x0084=Splitter:B:26:0x0084} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void n0() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            k.h0.h.b r1 = r9.x
            java.io.File r2 = r9.f10381h
            l.b0 r1 = r1.b(r2)
            l.h r1 = l.p.d(r1)
            java.lang.String r2 = r1.N()     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = r1.N()     // Catch:{ all -> 0x00b2 }
            java.lang.String r4 = r1.N()     // Catch:{ all -> 0x00b2 }
            java.lang.String r5 = r1.N()     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = r1.N()     // Catch:{ all -> 0x00b2 }
            java.lang.String r7 = E     // Catch:{ all -> 0x00b2 }
            boolean r7 = kotlin.jvm.internal.k.a(r7, r2)     // Catch:{ all -> 0x00b2 }
            r8 = 1
            r7 = r7 ^ r8
            if (r7 != 0) goto L_0x0084
            java.lang.String r7 = F     // Catch:{ all -> 0x00b2 }
            boolean r7 = kotlin.jvm.internal.k.a(r7, r3)     // Catch:{ all -> 0x00b2 }
            r7 = r7 ^ r8
            if (r7 != 0) goto L_0x0084
            int r7 = r9.z     // Catch:{ all -> 0x00b2 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x00b2 }
            boolean r4 = kotlin.jvm.internal.k.a(r7, r4)     // Catch:{ all -> 0x00b2 }
            r4 = r4 ^ r8
            if (r4 != 0) goto L_0x0084
            int r4 = r9.A     // Catch:{ all -> 0x00b2 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00b2 }
            boolean r4 = kotlin.jvm.internal.k.a(r4, r5)     // Catch:{ all -> 0x00b2 }
            r4 = r4 ^ r8
            if (r4 != 0) goto L_0x0084
            int r4 = r6.length()     // Catch:{ all -> 0x00b2 }
            r7 = 0
            if (r4 <= 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r8 = 0
        L_0x0058:
            if (r8 != 0) goto L_0x0084
        L_0x005a:
            java.lang.String r0 = r1.N()     // Catch:{ EOFException -> 0x0064 }
            r9.r0(r0)     // Catch:{ EOFException -> 0x0064 }
            int r7 = r7 + 1
            goto L_0x005a
        L_0x0064:
            java.util.LinkedHashMap<java.lang.String, k.h0.d.d$c> r0 = r9.f10386m     // Catch:{ all -> 0x00b2 }
            int r0 = r0.size()     // Catch:{ all -> 0x00b2 }
            int r7 = r7 - r0
            r9.f10387n = r7     // Catch:{ all -> 0x00b2 }
            boolean r0 = r1.Q()     // Catch:{ all -> 0x00b2 }
            if (r0 != 0) goto L_0x0077
            r9.t0()     // Catch:{ all -> 0x00b2 }
            goto L_0x007d
        L_0x0077:
            l.g r0 = r9.i0()     // Catch:{ all -> 0x00b2 }
            r9.f10385l = r0     // Catch:{ all -> 0x00b2 }
        L_0x007d:
            kotlin.x r0 = kotlin.x.a     // Catch:{ all -> 0x00b2 }
            r0 = 0
            kotlin.io.a.a(r1, r0)
            return
        L_0x0084:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r7.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00b2 }
            r7.append(r2)     // Catch:{ all -> 0x00b2 }
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            r7.append(r3)     // Catch:{ all -> 0x00b2 }
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            r7.append(r5)     // Catch:{ all -> 0x00b2 }
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            r7.append(r6)     // Catch:{ all -> 0x00b2 }
            r0 = 93
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00b2 }
            r4.<init>(r0)     // Catch:{ all -> 0x00b2 }
            throw r4     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r2 = move-exception
            kotlin.io.a.a(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.d.d.n0():void");
    }

    private final synchronized void o() {
        if (!(!this.r)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    private final void r0(String str) {
        String str2;
        String str3 = str;
        int S = q.S(str, ' ', 0, false, 6, (Object) null);
        if (S != -1) {
            int i2 = S + 1;
            int S2 = q.S(str, ' ', i2, false, 4, (Object) null);
            if (S2 == -1) {
                if (str3 != null) {
                    str2 = str3.substring(i2);
                    k.b(str2, "(this as java.lang.String).substring(startIndex)");
                    if (S == K.length() && p.D(str3, K, false, 2, (Object) null)) {
                        this.f10386m.remove(str2);
                        return;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else if (str3 != null) {
                str2 = str3.substring(i2, S2);
                k.b(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            c cVar = this.f10386m.get(str2);
            if (cVar == null) {
                cVar = new c(this, str2);
                this.f10386m.put(str2, cVar);
            }
            if (S2 != -1 && S == I.length() && p.D(str3, I, false, 2, (Object) null)) {
                int i3 = S2 + 1;
                if (str3 != null) {
                    String substring = str3.substring(i3);
                    k.b(substring, "(this as java.lang.String).substring(startIndex)");
                    List m0 = q.m0(substring, new char[]{' '}, false, 0, 6, (Object) null);
                    cVar.o(true);
                    cVar.l((b) null);
                    cVar.m(m0);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            } else if (S2 == -1 && S == J.length() && p.D(str3, J, false, 2, (Object) null)) {
                cVar.l(new b(this, cVar));
            } else if (S2 != -1 || S != L.length() || !p.D(str3, L, false, 2, (Object) null)) {
                throw new IOException("unexpected journal line: " + str3);
            }
        } else {
            throw new IOException("unexpected journal line: " + str3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized k.h0.d.d.C0740d F(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.k.f(r8, r0)     // Catch:{ all -> 0x005f }
            r7.Z()     // Catch:{ all -> 0x005f }
            r7.o()     // Catch:{ all -> 0x005f }
            r7.I0(r8)     // Catch:{ all -> 0x005f }
            java.util.LinkedHashMap<java.lang.String, k.h0.d.d$c> r0 = r7.f10386m     // Catch:{ all -> 0x005f }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x005f }
            k.h0.d.d$c r0 = (k.h0.d.d.c) r0     // Catch:{ all -> 0x005f }
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.lang.String r2 = "lruEntries[key] ?: return null"
            kotlin.jvm.internal.k.b(r0, r2)     // Catch:{ all -> 0x005f }
            k.h0.d.d$d r0 = r0.r()     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x005b
            int r2 = r7.f10387n     // Catch:{ all -> 0x005f }
            int r2 = r2 + 1
            r7.f10387n = r2     // Catch:{ all -> 0x005f }
            l.g r2 = r7.f10385l     // Catch:{ all -> 0x005f }
            if (r2 == 0) goto L_0x0057
            java.lang.String r1 = L     // Catch:{ all -> 0x005f }
            l.g r1 = r2.u0(r1)     // Catch:{ all -> 0x005f }
            r2 = 32
            l.g r1 = r1.R(r2)     // Catch:{ all -> 0x005f }
            l.g r8 = r1.u0(r8)     // Catch:{ all -> 0x005f }
            r1 = 10
            r8.R(r1)     // Catch:{ all -> 0x005f }
            boolean r8 = r7.b0()     // Catch:{ all -> 0x005f }
            if (r8 == 0) goto L_0x0055
            k.h0.e.d r1 = r7.v     // Catch:{ all -> 0x005f }
            k.h0.d.d$e r2 = r7.w     // Catch:{ all -> 0x005f }
            r3 = 0
            r5 = 2
            r6 = 0
            k.h0.e.d.j(r1, r2, r3, r5, r6)     // Catch:{ all -> 0x005f }
        L_0x0055:
            monitor-exit(r7)
            return r0
        L_0x0057:
            kotlin.jvm.internal.k.m()     // Catch:{ all -> 0x005f }
            throw r1
        L_0x005b:
            monitor-exit(r7)
            return r1
        L_0x005d:
            monitor-exit(r7)
            return r1
        L_0x005f:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.d.d.F(java.lang.String):k.h0.d.d$d");
    }

    public final boolean F0(c cVar) {
        g gVar;
        k.f(cVar, "entry");
        if (!this.p) {
            if (cVar.f() > 0 && (gVar = this.f10385l) != null) {
                gVar.u0(J);
                gVar.R(32);
                gVar.u0(cVar.d());
                gVar.R(10);
                gVar.flush();
            }
            if (cVar.f() > 0 || cVar.b() != null) {
                cVar.q(true);
                return true;
            }
        }
        b b2 = cVar.b();
        if (b2 != null) {
            b2.c();
        }
        int i2 = this.A;
        for (int i3 = 0; i3 < i2; i3++) {
            this.x.a(cVar.a().get(i3));
            this.f10384k -= cVar.e()[i3];
            cVar.e()[i3] = 0;
        }
        this.f10387n++;
        g gVar2 = this.f10385l;
        if (gVar2 != null) {
            gVar2.u0(K);
            gVar2.R(32);
            gVar2.u0(cVar.d());
            gVar2.R(10);
        }
        this.f10386m.remove(cVar.d());
        if (b0()) {
            k.h0.e.d.j(this.v, this.w, 0, 2, (Object) null);
        }
        return true;
    }

    public final void H0() {
        while (this.f10384k > this.f10380g) {
            if (!G0()) {
                return;
            }
        }
        this.s = false;
    }

    public final boolean K() {
        return this.r;
    }

    public final File L() {
        return this.y;
    }

    public final k.h0.h.b M() {
        return this.x;
    }

    public final int U() {
        return this.A;
    }

    public final synchronized void Z() {
        if (k.h0.b.f10365g) {
            if (!Thread.holdsLock(this)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread currentThread = Thread.currentThread();
                k.b(currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST hold lock on ");
                sb.append(this);
                throw new AssertionError(sb.toString());
            }
        }
        if (!this.q) {
            if (this.x.f(this.f10383j)) {
                if (this.x.f(this.f10381h)) {
                    this.x.a(this.f10383j);
                } else {
                    this.x.g(this.f10383j, this.f10381h);
                }
            }
            this.p = k.h0.b.C(this.x, this.f10383j);
            if (this.x.f(this.f10381h)) {
                try {
                    n0();
                    l0();
                    this.q = true;
                    return;
                } catch (IOException e2) {
                    h g2 = h.c.g();
                    g2.k("DiskLruCache " + this.y + " is corrupt: " + e2.getMessage() + ", removing", 5, e2);
                    y();
                    this.r = false;
                } catch (Throwable th) {
                    this.r = false;
                    throw th;
                }
            }
            t0();
            this.q = true;
        }
    }

    public synchronized void close() {
        b b2;
        if (this.q) {
            if (!this.r) {
                Collection<c> values = this.f10386m.values();
                k.b(values, "lruEntries.values");
                Object[] array = values.toArray(new c[0]);
                if (array != null) {
                    for (c cVar : (c[]) array) {
                        if (!(cVar.b() == null || (b2 = cVar.b()) == null)) {
                            b2.c();
                        }
                    }
                    H0();
                    g gVar = this.f10385l;
                    if (gVar != null) {
                        gVar.close();
                        this.f10385l = null;
                        this.r = true;
                        return;
                    }
                    k.m();
                    throw null;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        this.r = true;
    }

    public synchronized void flush() {
        if (this.q) {
            o();
            H0();
            g gVar = this.f10385l;
            if (gVar != null) {
                gVar.flush();
            } else {
                k.m();
                throw null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0137, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void q(k.h0.d.d.b r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "editor"
            kotlin.jvm.internal.k.f(r10, r0)     // Catch:{ all -> 0x0148 }
            k.h0.d.d$c r0 = r10.d()     // Catch:{ all -> 0x0148 }
            k.h0.d.d$b r1 = r0.b()     // Catch:{ all -> 0x0148 }
            boolean r1 = kotlin.jvm.internal.k.a(r1, r10)     // Catch:{ all -> 0x0148 }
            if (r1 == 0) goto L_0x013c
            r1 = 0
            r2 = 0
            if (r11 == 0) goto L_0x0065
            boolean r3 = r0.g()     // Catch:{ all -> 0x0148 }
            if (r3 != 0) goto L_0x0065
            int r3 = r9.A     // Catch:{ all -> 0x0148 }
            r4 = 0
        L_0x0021:
            if (r4 >= r3) goto L_0x0065
            boolean[] r5 = r10.e()     // Catch:{ all -> 0x0148 }
            if (r5 == 0) goto L_0x0061
            boolean r5 = r5[r4]     // Catch:{ all -> 0x0148 }
            if (r5 == 0) goto L_0x0047
            k.h0.h.b r5 = r9.x     // Catch:{ all -> 0x0148 }
            java.util.List r6 = r0.c()     // Catch:{ all -> 0x0148 }
            java.lang.Object r6 = r6.get(r4)     // Catch:{ all -> 0x0148 }
            java.io.File r6 = (java.io.File) r6     // Catch:{ all -> 0x0148 }
            boolean r5 = r5.f(r6)     // Catch:{ all -> 0x0148 }
            if (r5 != 0) goto L_0x0044
            r10.a()     // Catch:{ all -> 0x0148 }
            monitor-exit(r9)
            return
        L_0x0044:
            int r4 = r4 + 1
            goto L_0x0021
        L_0x0047:
            r10.a()     // Catch:{ all -> 0x0148 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0148 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0148 }
            r11.<init>()     // Catch:{ all -> 0x0148 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x0148 }
            r11.append(r4)     // Catch:{ all -> 0x0148 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0148 }
            r10.<init>(r11)     // Catch:{ all -> 0x0148 }
            throw r10     // Catch:{ all -> 0x0148 }
        L_0x0061:
            kotlin.jvm.internal.k.m()     // Catch:{ all -> 0x0148 }
            throw r2
        L_0x0065:
            int r10 = r9.A     // Catch:{ all -> 0x0148 }
        L_0x0067:
            if (r1 >= r10) goto L_0x00b3
            java.util.List r3 = r0.c()     // Catch:{ all -> 0x0148 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x0148 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x0148 }
            if (r11 == 0) goto L_0x00ab
            boolean r4 = r0.i()     // Catch:{ all -> 0x0148 }
            if (r4 != 0) goto L_0x00ab
            k.h0.h.b r4 = r9.x     // Catch:{ all -> 0x0148 }
            boolean r4 = r4.f(r3)     // Catch:{ all -> 0x0148 }
            if (r4 == 0) goto L_0x00b0
            java.util.List r4 = r0.a()     // Catch:{ all -> 0x0148 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x0148 }
            java.io.File r4 = (java.io.File) r4     // Catch:{ all -> 0x0148 }
            k.h0.h.b r5 = r9.x     // Catch:{ all -> 0x0148 }
            r5.g(r3, r4)     // Catch:{ all -> 0x0148 }
            long[] r3 = r0.e()     // Catch:{ all -> 0x0148 }
            r5 = r3[r1]     // Catch:{ all -> 0x0148 }
            k.h0.h.b r3 = r9.x     // Catch:{ all -> 0x0148 }
            long r3 = r3.h(r4)     // Catch:{ all -> 0x0148 }
            long[] r7 = r0.e()     // Catch:{ all -> 0x0148 }
            r7[r1] = r3     // Catch:{ all -> 0x0148 }
            long r7 = r9.f10384k     // Catch:{ all -> 0x0148 }
            long r7 = r7 - r5
            long r7 = r7 + r3
            r9.f10384k = r7     // Catch:{ all -> 0x0148 }
            goto L_0x00b0
        L_0x00ab:
            k.h0.h.b r4 = r9.x     // Catch:{ all -> 0x0148 }
            r4.a(r3)     // Catch:{ all -> 0x0148 }
        L_0x00b0:
            int r1 = r1 + 1
            goto L_0x0067
        L_0x00b3:
            r0.l(r2)     // Catch:{ all -> 0x0148 }
            boolean r10 = r0.i()     // Catch:{ all -> 0x0148 }
            if (r10 == 0) goto L_0x00c1
            r9.F0(r0)     // Catch:{ all -> 0x0148 }
            monitor-exit(r9)
            return
        L_0x00c1:
            int r10 = r9.f10387n     // Catch:{ all -> 0x0148 }
            r1 = 1
            int r10 = r10 + r1
            r9.f10387n = r10     // Catch:{ all -> 0x0148 }
            l.g r10 = r9.f10385l     // Catch:{ all -> 0x0148 }
            if (r10 == 0) goto L_0x0138
            boolean r2 = r0.g()     // Catch:{ all -> 0x0148 }
            r3 = 10
            r4 = 32
            if (r2 != 0) goto L_0x00f5
            if (r11 == 0) goto L_0x00d8
            goto L_0x00f5
        L_0x00d8:
            java.util.LinkedHashMap<java.lang.String, k.h0.d.d$c> r11 = r9.f10386m     // Catch:{ all -> 0x0148 }
            java.lang.String r1 = r0.d()     // Catch:{ all -> 0x0148 }
            r11.remove(r1)     // Catch:{ all -> 0x0148 }
            java.lang.String r11 = K     // Catch:{ all -> 0x0148 }
            l.g r11 = r10.u0(r11)     // Catch:{ all -> 0x0148 }
            r11.R(r4)     // Catch:{ all -> 0x0148 }
            java.lang.String r11 = r0.d()     // Catch:{ all -> 0x0148 }
            r10.u0(r11)     // Catch:{ all -> 0x0148 }
            r10.R(r3)     // Catch:{ all -> 0x0148 }
            goto L_0x011a
        L_0x00f5:
            r0.o(r1)     // Catch:{ all -> 0x0148 }
            java.lang.String r1 = I     // Catch:{ all -> 0x0148 }
            l.g r1 = r10.u0(r1)     // Catch:{ all -> 0x0148 }
            r1.R(r4)     // Catch:{ all -> 0x0148 }
            java.lang.String r1 = r0.d()     // Catch:{ all -> 0x0148 }
            r10.u0(r1)     // Catch:{ all -> 0x0148 }
            r0.s(r10)     // Catch:{ all -> 0x0148 }
            r10.R(r3)     // Catch:{ all -> 0x0148 }
            if (r11 == 0) goto L_0x011a
            long r1 = r9.u     // Catch:{ all -> 0x0148 }
            r3 = 1
            long r3 = r3 + r1
            r9.u = r3     // Catch:{ all -> 0x0148 }
            r0.p(r1)     // Catch:{ all -> 0x0148 }
        L_0x011a:
            r10.flush()     // Catch:{ all -> 0x0148 }
            long r10 = r9.f10384k     // Catch:{ all -> 0x0148 }
            long r0 = r9.f10380g     // Catch:{ all -> 0x0148 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x012b
            boolean r10 = r9.b0()     // Catch:{ all -> 0x0148 }
            if (r10 == 0) goto L_0x0136
        L_0x012b:
            k.h0.e.d r0 = r9.v     // Catch:{ all -> 0x0148 }
            k.h0.d.d$e r1 = r9.w     // Catch:{ all -> 0x0148 }
            r2 = 0
            r4 = 2
            r5 = 0
            k.h0.e.d.j(r0, r1, r2, r4, r5)     // Catch:{ all -> 0x0148 }
        L_0x0136:
            monitor-exit(r9)
            return
        L_0x0138:
            kotlin.jvm.internal.k.m()     // Catch:{ all -> 0x0148 }
            throw r2
        L_0x013c:
            java.lang.String r10 = "Check failed."
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0148 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0148 }
            r11.<init>(r10)     // Catch:{ all -> 0x0148 }
            throw r11     // Catch:{ all -> 0x0148 }
        L_0x0148:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.d.d.q(k.h0.d.d$b, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c0, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        kotlin.io.a.a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c4, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void t0() {
        /*
            r7 = this;
            monitor-enter(r7)
            l.g r0 = r7.f10385l     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0008
            r0.close()     // Catch:{ all -> 0x00c5 }
        L_0x0008:
            k.h0.h.b r0 = r7.x     // Catch:{ all -> 0x00c5 }
            java.io.File r1 = r7.f10382i     // Catch:{ all -> 0x00c5 }
            l.z r0 = r0.c(r1)     // Catch:{ all -> 0x00c5 }
            l.g r0 = l.p.c(r0)     // Catch:{ all -> 0x00c5 }
            r1 = 0
            java.lang.String r2 = E     // Catch:{ all -> 0x00be }
            l.g r2 = r0.u0(r2)     // Catch:{ all -> 0x00be }
            r3 = 10
            r2.R(r3)     // Catch:{ all -> 0x00be }
            java.lang.String r2 = F     // Catch:{ all -> 0x00be }
            l.g r2 = r0.u0(r2)     // Catch:{ all -> 0x00be }
            r2.R(r3)     // Catch:{ all -> 0x00be }
            int r2 = r7.z     // Catch:{ all -> 0x00be }
            long r4 = (long) r2     // Catch:{ all -> 0x00be }
            l.g r2 = r0.v0(r4)     // Catch:{ all -> 0x00be }
            r2.R(r3)     // Catch:{ all -> 0x00be }
            int r2 = r7.A     // Catch:{ all -> 0x00be }
            long r4 = (long) r2     // Catch:{ all -> 0x00be }
            l.g r2 = r0.v0(r4)     // Catch:{ all -> 0x00be }
            r2.R(r3)     // Catch:{ all -> 0x00be }
            r0.R(r3)     // Catch:{ all -> 0x00be }
            java.util.LinkedHashMap<java.lang.String, k.h0.d.d$c> r2 = r7.f10386m     // Catch:{ all -> 0x00be }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x00be }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00be }
        L_0x004a:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x00be }
            if (r4 == 0) goto L_0x0089
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x00be }
            k.h0.d.d$c r4 = (k.h0.d.d.c) r4     // Catch:{ all -> 0x00be }
            k.h0.d.d$b r5 = r4.b()     // Catch:{ all -> 0x00be }
            r6 = 32
            if (r5 == 0) goto L_0x0072
            java.lang.String r5 = J     // Catch:{ all -> 0x00be }
            l.g r5 = r0.u0(r5)     // Catch:{ all -> 0x00be }
            r5.R(r6)     // Catch:{ all -> 0x00be }
            java.lang.String r4 = r4.d()     // Catch:{ all -> 0x00be }
            r0.u0(r4)     // Catch:{ all -> 0x00be }
            r0.R(r3)     // Catch:{ all -> 0x00be }
            goto L_0x004a
        L_0x0072:
            java.lang.String r5 = I     // Catch:{ all -> 0x00be }
            l.g r5 = r0.u0(r5)     // Catch:{ all -> 0x00be }
            r5.R(r6)     // Catch:{ all -> 0x00be }
            java.lang.String r5 = r4.d()     // Catch:{ all -> 0x00be }
            r0.u0(r5)     // Catch:{ all -> 0x00be }
            r4.s(r0)     // Catch:{ all -> 0x00be }
            r0.R(r3)     // Catch:{ all -> 0x00be }
            goto L_0x004a
        L_0x0089:
            kotlin.x r2 = kotlin.x.a     // Catch:{ all -> 0x00be }
            kotlin.io.a.a(r0, r1)     // Catch:{ all -> 0x00c5 }
            k.h0.h.b r0 = r7.x     // Catch:{ all -> 0x00c5 }
            java.io.File r1 = r7.f10381h     // Catch:{ all -> 0x00c5 }
            boolean r0 = r0.f(r1)     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x00a1
            k.h0.h.b r0 = r7.x     // Catch:{ all -> 0x00c5 }
            java.io.File r1 = r7.f10381h     // Catch:{ all -> 0x00c5 }
            java.io.File r2 = r7.f10383j     // Catch:{ all -> 0x00c5 }
            r0.g(r1, r2)     // Catch:{ all -> 0x00c5 }
        L_0x00a1:
            k.h0.h.b r0 = r7.x     // Catch:{ all -> 0x00c5 }
            java.io.File r1 = r7.f10382i     // Catch:{ all -> 0x00c5 }
            java.io.File r2 = r7.f10381h     // Catch:{ all -> 0x00c5 }
            r0.g(r1, r2)     // Catch:{ all -> 0x00c5 }
            k.h0.h.b r0 = r7.x     // Catch:{ all -> 0x00c5 }
            java.io.File r1 = r7.f10383j     // Catch:{ all -> 0x00c5 }
            r0.a(r1)     // Catch:{ all -> 0x00c5 }
            l.g r0 = r7.i0()     // Catch:{ all -> 0x00c5 }
            r7.f10385l = r0     // Catch:{ all -> 0x00c5 }
            r0 = 0
            r7.o = r0     // Catch:{ all -> 0x00c5 }
            r7.t = r0     // Catch:{ all -> 0x00c5 }
            monitor-exit(r7)
            return
        L_0x00be:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r2 = move-exception
            kotlin.io.a.a(r0, r1)     // Catch:{ all -> 0x00c5 }
            throw r2     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.d.d.t0():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean w0(java.lang.String r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.k.f(r7, r0)     // Catch:{ all -> 0x0033 }
            r6.Z()     // Catch:{ all -> 0x0033 }
            r6.o()     // Catch:{ all -> 0x0033 }
            r6.I0(r7)     // Catch:{ all -> 0x0033 }
            java.util.LinkedHashMap<java.lang.String, k.h0.d.d$c> r0 = r6.f10386m     // Catch:{ all -> 0x0033 }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ all -> 0x0033 }
            k.h0.d.d$c r7 = (k.h0.d.d.c) r7     // Catch:{ all -> 0x0033 }
            r0 = 0
            if (r7 == 0) goto L_0x0031
            java.lang.String r1 = "lruEntries[key] ?: return false"
            kotlin.jvm.internal.k.b(r7, r1)     // Catch:{ all -> 0x0033 }
            boolean r7 = r6.F0(r7)     // Catch:{ all -> 0x0033 }
            if (r7 == 0) goto L_0x002f
            long r1 = r6.f10384k     // Catch:{ all -> 0x0033 }
            long r3 = r6.f10380g     // Catch:{ all -> 0x0033 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x002f
            r6.s = r0     // Catch:{ all -> 0x0033 }
        L_0x002f:
            monitor-exit(r6)
            return r7
        L_0x0031:
            monitor-exit(r6)
            return r0
        L_0x0033:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.d.d.w0(java.lang.String):boolean");
    }

    public final void y() {
        close();
        this.x.d(this.y);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized k.h0.d.d.b z(java.lang.String r11, long r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.k.f(r11, r0)     // Catch:{ all -> 0x0092 }
            r10.Z()     // Catch:{ all -> 0x0092 }
            r10.o()     // Catch:{ all -> 0x0092 }
            r10.I0(r11)     // Catch:{ all -> 0x0092 }
            java.util.LinkedHashMap<java.lang.String, k.h0.d.d$c> r0 = r10.f10386m     // Catch:{ all -> 0x0092 }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x0092 }
            k.h0.d.d$c r0 = (k.h0.d.d.c) r0     // Catch:{ all -> 0x0092 }
            long r1 = G     // Catch:{ all -> 0x0092 }
            r3 = 0
            int r4 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x002a
            if (r0 == 0) goto L_0x0028
            long r1 = r0.h()     // Catch:{ all -> 0x0092 }
            int r4 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x002a
        L_0x0028:
            monitor-exit(r10)
            return r3
        L_0x002a:
            if (r0 == 0) goto L_0x0031
            k.h0.d.d$b r12 = r0.b()     // Catch:{ all -> 0x0092 }
            goto L_0x0032
        L_0x0031:
            r12 = r3
        L_0x0032:
            if (r12 == 0) goto L_0x0036
            monitor-exit(r10)
            return r3
        L_0x0036:
            if (r0 == 0) goto L_0x0040
            int r12 = r0.f()     // Catch:{ all -> 0x0092 }
            if (r12 == 0) goto L_0x0040
            monitor-exit(r10)
            return r3
        L_0x0040:
            boolean r12 = r10.s     // Catch:{ all -> 0x0092 }
            if (r12 != 0) goto L_0x0085
            boolean r12 = r10.t     // Catch:{ all -> 0x0092 }
            if (r12 == 0) goto L_0x0049
            goto L_0x0085
        L_0x0049:
            l.g r12 = r10.f10385l     // Catch:{ all -> 0x0092 }
            if (r12 == 0) goto L_0x0081
            java.lang.String r13 = J     // Catch:{ all -> 0x0092 }
            l.g r13 = r12.u0(r13)     // Catch:{ all -> 0x0092 }
            r1 = 32
            l.g r13 = r13.R(r1)     // Catch:{ all -> 0x0092 }
            l.g r13 = r13.u0(r11)     // Catch:{ all -> 0x0092 }
            r1 = 10
            r13.R(r1)     // Catch:{ all -> 0x0092 }
            r12.flush()     // Catch:{ all -> 0x0092 }
            boolean r12 = r10.o     // Catch:{ all -> 0x0092 }
            if (r12 == 0) goto L_0x006b
            monitor-exit(r10)
            return r3
        L_0x006b:
            if (r0 != 0) goto L_0x0077
            k.h0.d.d$c r0 = new k.h0.d.d$c     // Catch:{ all -> 0x0092 }
            r0.<init>(r10, r11)     // Catch:{ all -> 0x0092 }
            java.util.LinkedHashMap<java.lang.String, k.h0.d.d$c> r12 = r10.f10386m     // Catch:{ all -> 0x0092 }
            r12.put(r11, r0)     // Catch:{ all -> 0x0092 }
        L_0x0077:
            k.h0.d.d$b r11 = new k.h0.d.d$b     // Catch:{ all -> 0x0092 }
            r11.<init>(r10, r0)     // Catch:{ all -> 0x0092 }
            r0.l(r11)     // Catch:{ all -> 0x0092 }
            monitor-exit(r10)
            return r11
        L_0x0081:
            kotlin.jvm.internal.k.m()     // Catch:{ all -> 0x0092 }
            throw r3
        L_0x0085:
            k.h0.e.d r4 = r10.v     // Catch:{ all -> 0x0092 }
            k.h0.d.d$e r5 = r10.w     // Catch:{ all -> 0x0092 }
            r6 = 0
            r8 = 2
            r9 = 0
            k.h0.e.d.j(r4, r5, r6, r8, r9)     // Catch:{ all -> 0x0092 }
            monitor-exit(r10)
            return r3
        L_0x0092:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.d.d.z(java.lang.String, long):k.h0.d.d$b");
    }
}
