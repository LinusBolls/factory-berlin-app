package g.a.a.i.b.j;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import l.b0;
import l.g;
import l.p;
import l.z;

/* compiled from: DiskLruCache */
public final class a implements Closeable, Flushable {
    static final Pattern A = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: g  reason: collision with root package name */
    final c f9113g;

    /* renamed from: h  reason: collision with root package name */
    final File f9114h;

    /* renamed from: i  reason: collision with root package name */
    private final File f9115i;

    /* renamed from: j  reason: collision with root package name */
    private final File f9116j;

    /* renamed from: k  reason: collision with root package name */
    private final File f9117k;

    /* renamed from: l  reason: collision with root package name */
    private final int f9118l;

    /* renamed from: m  reason: collision with root package name */
    private long f9119m;

    /* renamed from: n  reason: collision with root package name */
    final int f9120n;
    private long o = 0;
    g p;
    final LinkedHashMap<String, e> q = new LinkedHashMap<>(0, 0.75f, true);
    int r;
    boolean s;
    boolean t;
    boolean u;
    boolean v;
    boolean w;
    private long x = 0;
    private final Executor y;
    private final Runnable z = new C0606a();

    /* renamed from: g.a.a.i.b.j.a$a  reason: collision with other inner class name */
    /* compiled from: DiskLruCache */
    class C0606a implements Runnable {
        C0606a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r4.f9121g.w = true;
            r4.f9121g.p = l.p.c(l.p.b());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
            return;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                g.a.a.i.b.j.a r0 = g.a.a.i.b.j.a.this
                monitor-enter(r0)
                g.a.a.i.b.j.a r1 = g.a.a.i.b.j.a.this     // Catch:{ all -> 0x0042 }
                boolean r1 = r1.t     // Catch:{ all -> 0x0042 }
                if (r1 == 0) goto L_0x0040
                g.a.a.i.b.j.a r1 = g.a.a.i.b.j.a.this     // Catch:{ all -> 0x0042 }
                boolean r1 = r1.u     // Catch:{ all -> 0x0042 }
                if (r1 == 0) goto L_0x0010
                goto L_0x0040
            L_0x0010:
                r1 = 1
                g.a.a.i.b.j.a r2 = g.a.a.i.b.j.a.this     // Catch:{ IOException -> 0x0017 }
                r2.b0()     // Catch:{ IOException -> 0x0017 }
                goto L_0x001b
            L_0x0017:
                g.a.a.i.b.j.a r2 = g.a.a.i.b.j.a.this     // Catch:{ all -> 0x0042 }
                r2.v = r1     // Catch:{ all -> 0x0042 }
            L_0x001b:
                g.a.a.i.b.j.a r2 = g.a.a.i.b.j.a.this     // Catch:{ IOException -> 0x002e }
                boolean r2 = r2.z()     // Catch:{ IOException -> 0x002e }
                if (r2 == 0) goto L_0x003e
                g.a.a.i.b.j.a r2 = g.a.a.i.b.j.a.this     // Catch:{ IOException -> 0x002e }
                r2.M()     // Catch:{ IOException -> 0x002e }
                g.a.a.i.b.j.a r2 = g.a.a.i.b.j.a.this     // Catch:{ IOException -> 0x002e }
                r3 = 0
                r2.r = r3     // Catch:{ IOException -> 0x002e }
                goto L_0x003e
            L_0x002e:
                g.a.a.i.b.j.a r2 = g.a.a.i.b.j.a.this     // Catch:{ all -> 0x0042 }
                r2.w = r1     // Catch:{ all -> 0x0042 }
                g.a.a.i.b.j.a r1 = g.a.a.i.b.j.a.this     // Catch:{ all -> 0x0042 }
                l.z r2 = l.p.b()     // Catch:{ all -> 0x0042 }
                l.g r2 = l.p.c(r2)     // Catch:{ all -> 0x0042 }
                r1.p = r2     // Catch:{ all -> 0x0042 }
            L_0x003e:
                monitor-exit(r0)     // Catch:{ all -> 0x0042 }
                return
            L_0x0040:
                monitor-exit(r0)     // Catch:{ all -> 0x0042 }
                return
            L_0x0042:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0042 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: g.a.a.i.b.j.a.C0606a.run():void");
        }
    }

    /* compiled from: DiskLruCache */
    class b implements ThreadFactory {
        b() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "OkHttp DiskLruCache");
            thread.setDaemon(true);
            return thread;
        }
    }

    /* compiled from: DiskLruCache */
    class c extends b {
        static {
            Class<a> cls = a.class;
        }

        c(z zVar) {
            super(zVar);
        }

        /* access modifiers changed from: protected */
        public void b(IOException iOException) {
            a.this.s = true;
        }
    }

    /* compiled from: DiskLruCache */
    public final class d {
        final e a;
        final boolean[] b;
        private boolean c;

        /* renamed from: g.a.a.i.b.j.a$d$a  reason: collision with other inner class name */
        /* compiled from: DiskLruCache */
        class C0607a extends b {
            C0607a(z zVar) {
                super(zVar);
            }

            /* access modifiers changed from: protected */
            public void b(IOException iOException) {
                synchronized (a.this) {
                    d.this.c();
                }
            }
        }

        d(e eVar) {
            this.a = eVar;
            this.b = eVar.f9126e ? null : new boolean[a.this.f9120n];
        }

        public void a() {
            synchronized (a.this) {
                if (!this.c) {
                    if (this.a.f9127f == this) {
                        a.this.i(this, false);
                    }
                    this.c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        public void b() {
            synchronized (a.this) {
                if (!this.c) {
                    if (this.a.f9127f == this) {
                        a.this.i(this, true);
                    }
                    this.c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            if (this.a.f9127f == this) {
                int i2 = 0;
                while (true) {
                    a aVar = a.this;
                    if (i2 < aVar.f9120n) {
                        try {
                            aVar.f9113g.a(this.a.f9125d[i2]);
                        } catch (IOException unused) {
                        }
                        i2++;
                    } else {
                        this.a.f9127f = null;
                        return;
                    }
                }
            }
        }

        public z d(int i2) {
            synchronized (a.this) {
                if (this.c) {
                    throw new IllegalStateException();
                } else if (this.a.f9127f != this) {
                    z b2 = p.b();
                    return b2;
                } else {
                    if (!this.a.f9126e) {
                        this.b[i2] = true;
                    }
                    try {
                        C0607a aVar = new C0607a(a.this.f9113g.c(this.a.f9125d[i2]));
                        return aVar;
                    } catch (FileNotFoundException unused) {
                        return p.b();
                    }
                }
            }
        }
    }

    /* compiled from: DiskLruCache */
    private final class e {
        final String a;
        final long[] b;
        final File[] c;

        /* renamed from: d  reason: collision with root package name */
        final File[] f9125d;

        /* renamed from: e  reason: collision with root package name */
        boolean f9126e;

        /* renamed from: f  reason: collision with root package name */
        d f9127f;

        /* renamed from: g  reason: collision with root package name */
        long f9128g;

        e(String str) {
            this.a = str;
            int i2 = a.this.f9120n;
            this.b = new long[i2];
            this.c = new File[i2];
            this.f9125d = new File[i2];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i3 = 0; i3 < a.this.f9120n; i3++) {
                sb.append(i3);
                this.c[i3] = new File(a.this.f9114h, sb.toString());
                sb.append(".tmp");
                this.f9125d[i3] = new File(a.this.f9114h, sb.toString());
                sb.setLength(length);
            }
        }

        private IOException a(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: package-private */
        public void b(String[] strArr) {
            if (strArr.length == a.this.f9120n) {
                int i2 = 0;
                while (i2 < strArr.length) {
                    try {
                        this.b[i2] = Long.parseLong(strArr[i2]);
                        i2++;
                    } catch (NumberFormatException unused) {
                        a(strArr);
                        throw null;
                    }
                }
                return;
            }
            a(strArr);
            throw null;
        }

        /* access modifiers changed from: package-private */
        public f c() {
            if (Thread.holdsLock(a.this)) {
                b0[] b0VarArr = new b0[a.this.f9120n];
                long[] jArr = (long[]) this.b.clone();
                int i2 = 0;
                int i3 = 0;
                while (i3 < a.this.f9120n) {
                    try {
                        b0VarArr[i3] = a.this.f9113g.b(this.c[i3]);
                        i3++;
                    } catch (FileNotFoundException unused) {
                        while (true) {
                            a aVar = a.this;
                            if (i2 >= aVar.f9120n || b0VarArr[i2] == null) {
                                try {
                                    a.this.Z(this);
                                    return null;
                                } catch (IOException unused2) {
                                    return null;
                                }
                            } else {
                                aVar.h(b0VarArr[i2], "file");
                                i2++;
                            }
                        }
                    }
                }
                return new f(this.a, this.f9128g, b0VarArr, jArr);
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        public void d(g gVar) {
            for (long v0 : this.b) {
                gVar.R(32).v0(v0);
            }
        }
    }

    /* compiled from: DiskLruCache */
    public final class f implements Closeable {

        /* renamed from: g  reason: collision with root package name */
        private final b0[] f9130g;

        f(String str, long j2, b0[] b0VarArr, long[] jArr) {
            this.f9130g = b0VarArr;
        }

        public b0 a(int i2) {
            return this.f9130g[i2];
        }

        public void close() {
            for (b0 h2 : this.f9130g) {
                a.this.h(h2, "source");
            }
        }
    }

    static {
        Class<a> cls = a.class;
    }

    a(c cVar, File file, int i2, int i3, long j2, Executor executor) {
        this.f9113g = cVar;
        this.f9114h = file;
        this.f9118l = i2;
        this.f9115i = new File(file, k.h0.d.d.B);
        this.f9116j = new File(file, k.h0.d.d.C);
        this.f9117k = new File(file, k.h0.d.d.D);
        this.f9120n = i3;
        this.f9119m = j2;
        this.y = executor;
    }

    private g D() {
        return p.c(new c(this.f9113g.e(this.f9115i)));
    }

    private void F() {
        this.f9113g.a(this.f9116j);
        Iterator<e> it = this.q.values().iterator();
        while (it.hasNext()) {
            e next = it.next();
            int i2 = 0;
            if (next.f9127f == null) {
                while (i2 < this.f9120n) {
                    this.o += next.b[i2];
                    i2++;
                }
            } else {
                next.f9127f = null;
                while (i2 < this.f9120n) {
                    this.f9113g.a(next.c[i2]);
                    this.f9113g.a(next.f9125d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|(1:19)(1:20)|(2:22|33)(1:34)) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.r = r0 - r9.q.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r1.Q() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r9.p = D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        if (r1 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        a((java.lang.Throwable) null, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ad, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ae, code lost:
        if (r1 != null) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b0, code lost:
        a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b3, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x005d=Splitter:B:16:0x005d, B:23:0x007d=Splitter:B:23:0x007d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void K() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            g.a.a.i.b.j.c r1 = r9.f9113g
            java.io.File r2 = r9.f9115i
            l.b0 r1 = r1.b(r2)
            l.h r1 = l.p.d(r1)
            java.lang.String r2 = r1.N()     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = r1.N()     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = r1.N()     // Catch:{ all -> 0x00ab }
            java.lang.String r5 = r1.N()     // Catch:{ all -> 0x00ab }
            java.lang.String r6 = r1.N()     // Catch:{ all -> 0x00ab }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ab }
            if (r7 == 0) goto L_0x007d
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ab }
            if (r7 == 0) goto L_0x007d
            int r7 = r9.f9118l     // Catch:{ all -> 0x00ab }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ab }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ab }
            if (r4 == 0) goto L_0x007d
            int r4 = r9.f9120n     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ab }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ab }
            if (r4 == 0) goto L_0x007d
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ab }
            if (r4 == 0) goto L_0x007d
            r0 = 0
        L_0x0053:
            java.lang.String r2 = r1.N()     // Catch:{ EOFException -> 0x005d }
            r9.L(r2)     // Catch:{ EOFException -> 0x005d }
            int r0 = r0 + 1
            goto L_0x0053
        L_0x005d:
            java.util.LinkedHashMap<java.lang.String, g.a.a.i.b.j.a$e> r2 = r9.q     // Catch:{ all -> 0x00ab }
            int r2 = r2.size()     // Catch:{ all -> 0x00ab }
            int r0 = r0 - r2
            r9.r = r0     // Catch:{ all -> 0x00ab }
            boolean r0 = r1.Q()     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x0070
            r9.M()     // Catch:{ all -> 0x00ab }
            goto L_0x0076
        L_0x0070:
            l.g r0 = r9.D()     // Catch:{ all -> 0x00ab }
            r9.p = r0     // Catch:{ all -> 0x00ab }
        L_0x0076:
            if (r1 == 0) goto L_0x007c
            r0 = 0
            a(r0, r1)
        L_0x007c:
            return
        L_0x007d:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ab }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r7.<init>()     // Catch:{ all -> 0x00ab }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00ab }
            r7.append(r2)     // Catch:{ all -> 0x00ab }
            r7.append(r0)     // Catch:{ all -> 0x00ab }
            r7.append(r3)     // Catch:{ all -> 0x00ab }
            r7.append(r0)     // Catch:{ all -> 0x00ab }
            r7.append(r5)     // Catch:{ all -> 0x00ab }
            r7.append(r0)     // Catch:{ all -> 0x00ab }
            r7.append(r6)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ab }
            r4.<init>(r0)     // Catch:{ all -> 0x00ab }
            throw r4     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r2 = move-exception
            if (r1 == 0) goto L_0x00b3
            a(r0, r1)
        L_0x00b3:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.a.i.b.j.a.K():void");
    }

    private void L(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i2 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i2);
            if (indexOf2 == -1) {
                str2 = str.substring(i2);
                if (indexOf == 6 && str.startsWith(k.h0.d.d.K)) {
                    this.q.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i2, indexOf2);
            }
            e eVar = this.q.get(str2);
            if (eVar == null) {
                eVar = new e(str2);
                this.q.put(str2, eVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith(k.h0.d.d.I)) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                eVar.f9126e = true;
                eVar.f9127f = null;
                eVar.b(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith(k.h0.d.d.J)) {
                eVar.f9127f = new d(eVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith(k.h0.d.d.L)) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    private static /* synthetic */ void a(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            autoCloseable.close();
        }
    }

    private synchronized void b() {
        if (y()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private void i0(String str) {
        if (!A.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    public static a j(c cVar, File file, int i2, int i3, long j2) {
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i3 > 0) {
            return new a(cVar, file, i2, i3, j2, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b()));
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bc, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bd, code lost:
        if (r0 != null) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c2, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void M() {
        /*
            r7 = this;
            monitor-enter(r7)
            l.g r0 = r7.p     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x000a
            l.g r0 = r7.p     // Catch:{ all -> 0x00c3 }
            r0.close()     // Catch:{ all -> 0x00c3 }
        L_0x000a:
            g.a.a.i.b.j.c r0 = r7.f9113g     // Catch:{ all -> 0x00c3 }
            java.io.File r1 = r7.f9116j     // Catch:{ all -> 0x00c3 }
            l.z r0 = r0.c(r1)     // Catch:{ all -> 0x00c3 }
            l.g r0 = l.p.c(r0)     // Catch:{ all -> 0x00c3 }
            r1 = 0
            java.lang.String r2 = "libcore.io.DiskLruCache"
            l.g r2 = r0.u0(r2)     // Catch:{ all -> 0x00ba }
            r3 = 10
            r2.R(r3)     // Catch:{ all -> 0x00ba }
            java.lang.String r2 = "1"
            l.g r2 = r0.u0(r2)     // Catch:{ all -> 0x00ba }
            r2.R(r3)     // Catch:{ all -> 0x00ba }
            int r2 = r7.f9118l     // Catch:{ all -> 0x00ba }
            long r4 = (long) r2     // Catch:{ all -> 0x00ba }
            l.g r2 = r0.v0(r4)     // Catch:{ all -> 0x00ba }
            r2.R(r3)     // Catch:{ all -> 0x00ba }
            int r2 = r7.f9120n     // Catch:{ all -> 0x00ba }
            long r4 = (long) r2     // Catch:{ all -> 0x00ba }
            l.g r2 = r0.v0(r4)     // Catch:{ all -> 0x00ba }
            r2.R(r3)     // Catch:{ all -> 0x00ba }
            r0.R(r3)     // Catch:{ all -> 0x00ba }
            java.util.LinkedHashMap<java.lang.String, g.a.a.i.b.j.a$e> r2 = r7.q     // Catch:{ all -> 0x00ba }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x00ba }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00ba }
        L_0x004c:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x0085
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x00ba }
            g.a.a.i.b.j.a$e r4 = (g.a.a.i.b.j.a.e) r4     // Catch:{ all -> 0x00ba }
            g.a.a.i.b.j.a$d r5 = r4.f9127f     // Catch:{ all -> 0x00ba }
            r6 = 32
            if (r5 == 0) goto L_0x0070
            java.lang.String r5 = "DIRTY"
            l.g r5 = r0.u0(r5)     // Catch:{ all -> 0x00ba }
            r5.R(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r4.a     // Catch:{ all -> 0x00ba }
            r0.u0(r4)     // Catch:{ all -> 0x00ba }
            r0.R(r3)     // Catch:{ all -> 0x00ba }
            goto L_0x004c
        L_0x0070:
            java.lang.String r5 = "CLEAN"
            l.g r5 = r0.u0(r5)     // Catch:{ all -> 0x00ba }
            r5.R(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r4.a     // Catch:{ all -> 0x00ba }
            r0.u0(r5)     // Catch:{ all -> 0x00ba }
            r4.d(r0)     // Catch:{ all -> 0x00ba }
            r0.R(r3)     // Catch:{ all -> 0x00ba }
            goto L_0x004c
        L_0x0085:
            if (r0 == 0) goto L_0x008a
            a(r1, r0)     // Catch:{ all -> 0x00c3 }
        L_0x008a:
            g.a.a.i.b.j.c r0 = r7.f9113g     // Catch:{ all -> 0x00c3 }
            java.io.File r1 = r7.f9115i     // Catch:{ all -> 0x00c3 }
            boolean r0 = r0.f(r1)     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x009d
            g.a.a.i.b.j.c r0 = r7.f9113g     // Catch:{ all -> 0x00c3 }
            java.io.File r1 = r7.f9115i     // Catch:{ all -> 0x00c3 }
            java.io.File r2 = r7.f9117k     // Catch:{ all -> 0x00c3 }
            r0.g(r1, r2)     // Catch:{ all -> 0x00c3 }
        L_0x009d:
            g.a.a.i.b.j.c r0 = r7.f9113g     // Catch:{ all -> 0x00c3 }
            java.io.File r1 = r7.f9116j     // Catch:{ all -> 0x00c3 }
            java.io.File r2 = r7.f9115i     // Catch:{ all -> 0x00c3 }
            r0.g(r1, r2)     // Catch:{ all -> 0x00c3 }
            g.a.a.i.b.j.c r0 = r7.f9113g     // Catch:{ all -> 0x00c3 }
            java.io.File r1 = r7.f9117k     // Catch:{ all -> 0x00c3 }
            r0.a(r1)     // Catch:{ all -> 0x00c3 }
            l.g r0 = r7.D()     // Catch:{ all -> 0x00c3 }
            r7.p = r0     // Catch:{ all -> 0x00c3 }
            r0 = 0
            r7.s = r0     // Catch:{ all -> 0x00c3 }
            r7.w = r0     // Catch:{ all -> 0x00c3 }
            monitor-exit(r7)
            return
        L_0x00ba:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r2 = move-exception
            if (r0 == 0) goto L_0x00c2
            a(r1, r0)     // Catch:{ all -> 0x00c3 }
        L_0x00c2:
            throw r2     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.a.i.b.j.a.M():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean U(java.lang.String r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r6.q()     // Catch:{ all -> 0x0029 }
            r6.b()     // Catch:{ all -> 0x0029 }
            r6.i0(r7)     // Catch:{ all -> 0x0029 }
            java.util.LinkedHashMap<java.lang.String, g.a.a.i.b.j.a$e> r0 = r6.q     // Catch:{ all -> 0x0029 }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ all -> 0x0029 }
            g.a.a.i.b.j.a$e r7 = (g.a.a.i.b.j.a.e) r7     // Catch:{ all -> 0x0029 }
            r0 = 0
            if (r7 != 0) goto L_0x0017
            monitor-exit(r6)
            return r0
        L_0x0017:
            boolean r7 = r6.Z(r7)     // Catch:{ all -> 0x0029 }
            if (r7 == 0) goto L_0x0027
            long r1 = r6.o     // Catch:{ all -> 0x0029 }
            long r3 = r6.f9119m     // Catch:{ all -> 0x0029 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0027
            r6.v = r0     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r6)
            return r7
        L_0x0029:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.a.i.b.j.a.U(java.lang.String):boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean Z(e eVar) {
        d dVar = eVar.f9127f;
        if (dVar != null) {
            dVar.c();
        }
        for (int i2 = 0; i2 < this.f9120n; i2++) {
            this.f9113g.a(eVar.c[i2]);
            long j2 = this.o;
            long[] jArr = eVar.b;
            this.o = j2 - jArr[i2];
            jArr[i2] = 0;
        }
        this.r++;
        this.p.u0(k.h0.d.d.K).R(32).u0(eVar.a).R(10);
        this.q.remove(eVar.a);
        if (z()) {
            this.y.execute(this.z);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void b0() {
        while (this.o > this.f9119m) {
            Z(this.q.values().iterator().next());
        }
        this.v = false;
    }

    public synchronized void close() {
        if (this.t) {
            if (!this.u) {
                for (e eVar : (e[]) this.q.values().toArray(new e[this.q.size()])) {
                    if (eVar.f9127f != null) {
                        eVar.f9127f.a();
                    }
                }
                b0();
                this.p.close();
                this.p = null;
                this.u = true;
                return;
            }
        }
        this.u = true;
    }

    public synchronized void flush() {
        if (this.t) {
            b();
            b0();
            this.p.flush();
        }
    }

    /* access modifiers changed from: package-private */
    public void h(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void i(g.a.a.i.b.j.a.d r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            g.a.a.i.b.j.a$e r0 = r10.a     // Catch:{ all -> 0x00fd }
            g.a.a.i.b.j.a$d r1 = r0.f9127f     // Catch:{ all -> 0x00fd }
            if (r1 != r10) goto L_0x00f7
            r1 = 0
            if (r11 == 0) goto L_0x0047
            boolean r2 = r0.f9126e     // Catch:{ all -> 0x00fd }
            if (r2 != 0) goto L_0x0047
            r2 = 0
        L_0x000f:
            int r3 = r9.f9120n     // Catch:{ all -> 0x00fd }
            if (r2 >= r3) goto L_0x0047
            boolean[] r3 = r10.b     // Catch:{ all -> 0x00fd }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00fd }
            if (r3 == 0) goto L_0x002d
            g.a.a.i.b.j.c r3 = r9.f9113g     // Catch:{ all -> 0x00fd }
            java.io.File[] r4 = r0.f9125d     // Catch:{ all -> 0x00fd }
            r4 = r4[r2]     // Catch:{ all -> 0x00fd }
            boolean r3 = r3.f(r4)     // Catch:{ all -> 0x00fd }
            if (r3 != 0) goto L_0x002a
            r10.a()     // Catch:{ all -> 0x00fd }
            monitor-exit(r9)
            return
        L_0x002a:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002d:
            r10.a()     // Catch:{ all -> 0x00fd }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fd }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            r11.<init>()     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x00fd }
            r11.append(r2)     // Catch:{ all -> 0x00fd }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00fd }
            r10.<init>(r11)     // Catch:{ all -> 0x00fd }
            throw r10     // Catch:{ all -> 0x00fd }
        L_0x0047:
            int r10 = r9.f9120n     // Catch:{ all -> 0x00fd }
            if (r1 >= r10) goto L_0x007f
            java.io.File[] r10 = r0.f9125d     // Catch:{ all -> 0x00fd }
            r10 = r10[r1]     // Catch:{ all -> 0x00fd }
            if (r11 == 0) goto L_0x0077
            g.a.a.i.b.j.c r2 = r9.f9113g     // Catch:{ all -> 0x00fd }
            boolean r2 = r2.f(r10)     // Catch:{ all -> 0x00fd }
            if (r2 == 0) goto L_0x007c
            java.io.File[] r2 = r0.c     // Catch:{ all -> 0x00fd }
            r2 = r2[r1]     // Catch:{ all -> 0x00fd }
            g.a.a.i.b.j.c r3 = r9.f9113g     // Catch:{ all -> 0x00fd }
            r3.g(r10, r2)     // Catch:{ all -> 0x00fd }
            long[] r10 = r0.b     // Catch:{ all -> 0x00fd }
            r3 = r10[r1]     // Catch:{ all -> 0x00fd }
            g.a.a.i.b.j.c r10 = r9.f9113g     // Catch:{ all -> 0x00fd }
            long r5 = r10.h(r2)     // Catch:{ all -> 0x00fd }
            long[] r10 = r0.b     // Catch:{ all -> 0x00fd }
            r10[r1] = r5     // Catch:{ all -> 0x00fd }
            long r7 = r9.o     // Catch:{ all -> 0x00fd }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.o = r7     // Catch:{ all -> 0x00fd }
            goto L_0x007c
        L_0x0077:
            g.a.a.i.b.j.c r2 = r9.f9113g     // Catch:{ all -> 0x00fd }
            r2.a(r10)     // Catch:{ all -> 0x00fd }
        L_0x007c:
            int r1 = r1 + 1
            goto L_0x0047
        L_0x007f:
            int r10 = r9.r     // Catch:{ all -> 0x00fd }
            r1 = 1
            int r10 = r10 + r1
            r9.r = r10     // Catch:{ all -> 0x00fd }
            r10 = 0
            r0.f9127f = r10     // Catch:{ all -> 0x00fd }
            boolean r10 = r0.f9126e     // Catch:{ all -> 0x00fd }
            r2 = 10
            r3 = 32
            if (r10 != 0) goto L_0x00b2
            if (r11 == 0) goto L_0x0093
            goto L_0x00b2
        L_0x0093:
            java.util.LinkedHashMap<java.lang.String, g.a.a.i.b.j.a$e> r10 = r9.q     // Catch:{ all -> 0x00fd }
            java.lang.String r11 = r0.a     // Catch:{ all -> 0x00fd }
            r10.remove(r11)     // Catch:{ all -> 0x00fd }
            l.g r10 = r9.p     // Catch:{ all -> 0x00fd }
            java.lang.String r11 = "REMOVE"
            l.g r10 = r10.u0(r11)     // Catch:{ all -> 0x00fd }
            r10.R(r3)     // Catch:{ all -> 0x00fd }
            l.g r10 = r9.p     // Catch:{ all -> 0x00fd }
            java.lang.String r11 = r0.a     // Catch:{ all -> 0x00fd }
            r10.u0(r11)     // Catch:{ all -> 0x00fd }
            l.g r10 = r9.p     // Catch:{ all -> 0x00fd }
            r10.R(r2)     // Catch:{ all -> 0x00fd }
            goto L_0x00db
        L_0x00b2:
            r0.f9126e = r1     // Catch:{ all -> 0x00fd }
            l.g r10 = r9.p     // Catch:{ all -> 0x00fd }
            java.lang.String r1 = "CLEAN"
            l.g r10 = r10.u0(r1)     // Catch:{ all -> 0x00fd }
            r10.R(r3)     // Catch:{ all -> 0x00fd }
            l.g r10 = r9.p     // Catch:{ all -> 0x00fd }
            java.lang.String r1 = r0.a     // Catch:{ all -> 0x00fd }
            r10.u0(r1)     // Catch:{ all -> 0x00fd }
            l.g r10 = r9.p     // Catch:{ all -> 0x00fd }
            r0.d(r10)     // Catch:{ all -> 0x00fd }
            l.g r10 = r9.p     // Catch:{ all -> 0x00fd }
            r10.R(r2)     // Catch:{ all -> 0x00fd }
            if (r11 == 0) goto L_0x00db
            long r10 = r9.x     // Catch:{ all -> 0x00fd }
            r1 = 1
            long r1 = r1 + r10
            r9.x = r1     // Catch:{ all -> 0x00fd }
            r0.f9128g = r10     // Catch:{ all -> 0x00fd }
        L_0x00db:
            l.g r10 = r9.p     // Catch:{ all -> 0x00fd }
            r10.flush()     // Catch:{ all -> 0x00fd }
            long r10 = r9.o     // Catch:{ all -> 0x00fd }
            long r0 = r9.f9119m     // Catch:{ all -> 0x00fd }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ee
            boolean r10 = r9.z()     // Catch:{ all -> 0x00fd }
            if (r10 == 0) goto L_0x00f5
        L_0x00ee:
            java.util.concurrent.Executor r10 = r9.y     // Catch:{ all -> 0x00fd }
            java.lang.Runnable r11 = r9.z     // Catch:{ all -> 0x00fd }
            r10.execute(r11)     // Catch:{ all -> 0x00fd }
        L_0x00f5:
            monitor-exit(r9)
            return
        L_0x00f7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fd }
            r10.<init>()     // Catch:{ all -> 0x00fd }
            throw r10     // Catch:{ all -> 0x00fd }
        L_0x00fd:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.a.i.b.j.a.i(g.a.a.i.b.j.a$d, boolean):void");
    }

    public void k() {
        close();
        this.f9113g.d(this.f9114h);
    }

    public d l(String str) {
        return n(str, -1);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized g.a.a.i.b.j.a.d n(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.q()     // Catch:{ all -> 0x0074 }
            r5.b()     // Catch:{ all -> 0x0074 }
            r5.i0(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, g.a.a.i.b.j.a$e> r0 = r5.q     // Catch:{ all -> 0x0074 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0074 }
            g.a.a.i.b.j.a$e r0 = (g.a.a.i.b.j.a.e) r0     // Catch:{ all -> 0x0074 }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0021
            long r1 = r0.f9128g     // Catch:{ all -> 0x0074 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
        L_0x0021:
            monitor-exit(r5)
            return r3
        L_0x0023:
            if (r0 == 0) goto L_0x002b
            g.a.a.i.b.j.a$d r7 = r0.f9127f     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x002b
            monitor-exit(r5)
            return r3
        L_0x002b:
            boolean r7 = r5.v     // Catch:{ all -> 0x0074 }
            if (r7 != 0) goto L_0x006b
            boolean r7 = r5.w     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0034
            goto L_0x006b
        L_0x0034:
            l.g r7 = r5.p     // Catch:{ all -> 0x0074 }
            java.lang.String r8 = "DIRTY"
            l.g r7 = r7.u0(r8)     // Catch:{ all -> 0x0074 }
            r8 = 32
            l.g r7 = r7.R(r8)     // Catch:{ all -> 0x0074 }
            l.g r7 = r7.u0(r6)     // Catch:{ all -> 0x0074 }
            r8 = 10
            r7.R(r8)     // Catch:{ all -> 0x0074 }
            l.g r7 = r5.p     // Catch:{ all -> 0x0074 }
            r7.flush()     // Catch:{ all -> 0x0074 }
            boolean r7 = r5.s     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0056
            monitor-exit(r5)
            return r3
        L_0x0056:
            if (r0 != 0) goto L_0x0062
            g.a.a.i.b.j.a$e r0 = new g.a.a.i.b.j.a$e     // Catch:{ all -> 0x0074 }
            r0.<init>(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, g.a.a.i.b.j.a$e> r7 = r5.q     // Catch:{ all -> 0x0074 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0074 }
        L_0x0062:
            g.a.a.i.b.j.a$d r6 = new g.a.a.i.b.j.a$d     // Catch:{ all -> 0x0074 }
            r6.<init>(r0)     // Catch:{ all -> 0x0074 }
            r0.f9127f = r6     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r6
        L_0x006b:
            java.util.concurrent.Executor r6 = r5.y     // Catch:{ all -> 0x0074 }
            java.lang.Runnable r7 = r5.z     // Catch:{ all -> 0x0074 }
            r6.execute(r7)     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r3
        L_0x0074:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.a.i.b.j.a.n(java.lang.String, long):g.a.a.i.b.j.a$d");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized g.a.a.i.b.j.a.f o(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.q()     // Catch:{ all -> 0x0050 }
            r3.b()     // Catch:{ all -> 0x0050 }
            r3.i0(r4)     // Catch:{ all -> 0x0050 }
            java.util.LinkedHashMap<java.lang.String, g.a.a.i.b.j.a$e> r0 = r3.q     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0050 }
            g.a.a.i.b.j.a$e r0 = (g.a.a.i.b.j.a.e) r0     // Catch:{ all -> 0x0050 }
            r1 = 0
            if (r0 == 0) goto L_0x004e
            boolean r2 = r0.f9126e     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x001a
            goto L_0x004e
        L_0x001a:
            g.a.a.i.b.j.a$f r0 = r0.c()     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            int r1 = r3.r     // Catch:{ all -> 0x0050 }
            int r1 = r1 + 1
            r3.r = r1     // Catch:{ all -> 0x0050 }
            l.g r1 = r3.p     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "READ"
            l.g r1 = r1.u0(r2)     // Catch:{ all -> 0x0050 }
            r2 = 32
            l.g r1 = r1.R(r2)     // Catch:{ all -> 0x0050 }
            l.g r4 = r1.u0(r4)     // Catch:{ all -> 0x0050 }
            r1 = 10
            r4.R(r1)     // Catch:{ all -> 0x0050 }
            boolean r4 = r3.z()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x004c
            java.util.concurrent.Executor r4 = r3.y     // Catch:{ all -> 0x0050 }
            java.lang.Runnable r1 = r3.z     // Catch:{ all -> 0x0050 }
            r4.execute(r1)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            monitor-exit(r3)
            return r0
        L_0x004e:
            monitor-exit(r3)
            return r1
        L_0x0050:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.a.i.b.j.a.o(java.lang.String):g.a.a.i.b.j.a$f");
    }

    public synchronized void q() {
        if (!this.t) {
            if (this.f9113g.f(this.f9117k)) {
                if (this.f9113g.f(this.f9115i)) {
                    this.f9113g.a(this.f9117k);
                } else {
                    this.f9113g.g(this.f9117k, this.f9115i);
                }
            }
            if (this.f9113g.f(this.f9115i)) {
                try {
                    K();
                    F();
                    this.t = true;
                    return;
                } catch (IOException unused) {
                    k();
                    this.u = false;
                } catch (Throwable th) {
                    this.u = false;
                    throw th;
                }
            }
            M();
            this.t = true;
        }
    }

    public synchronized boolean y() {
        return this.u;
    }

    /* access modifiers changed from: package-private */
    public boolean z() {
        int i2 = this.r;
        return i2 >= 2000 && i2 >= this.q.size();
    }
}
