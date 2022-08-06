package kotlin.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.c.l;
import kotlin.e0.c.p;
import kotlin.i0.d;
import kotlin.jvm.internal.k;
import kotlin.x;
import kotlin.z;

/* compiled from: FileTreeWalk.kt */
public final class c implements d<File> {
    /* access modifiers changed from: private */
    public final File a;
    /* access modifiers changed from: private */
    public final e b;
    /* access modifiers changed from: private */
    public final l<File, Boolean> c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final l<File, x> f10634d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final p<File, IOException, x> f10635e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final int f10636f;

    /* compiled from: FileTreeWalk.kt */
    private static abstract class a extends C0761c {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(File file) {
            super(file);
            k.e(file, "rootDir");
            if (z.a) {
                boolean isDirectory = file.isDirectory();
                if (z.a && !isDirectory) {
                    throw new AssertionError("rootDir must be verified to be directory beforehand.");
                }
            }
        }
    }

    /* compiled from: FileTreeWalk.kt */
    private final class b extends kotlin.a0.c<File> {

        /* renamed from: i  reason: collision with root package name */
        private final ArrayDeque<C0761c> f10637i = new ArrayDeque<>();

        /* compiled from: FileTreeWalk.kt */
        private final class a extends a {
            private boolean b;
            private File[] c;

            /* renamed from: d  reason: collision with root package name */
            private int f10639d;

            /* renamed from: e  reason: collision with root package name */
            private boolean f10640e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ b f10641f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, File file) {
                super(file);
                k.e(file, "rootDir");
                this.f10641f = bVar;
            }

            public File b() {
                if (!this.f10640e && this.c == null) {
                    l d2 = c.this.c;
                    if (d2 != null && !((Boolean) d2.o(a())).booleanValue()) {
                        return null;
                    }
                    File[] listFiles = a().listFiles();
                    this.c = listFiles;
                    if (listFiles == null) {
                        p e2 = c.this.f10635e;
                        if (e2 != null) {
                            x xVar = (x) e2.l(a(), new AccessDeniedException(a(), (File) null, "Cannot list files in a directory", 2, (DefaultConstructorMarker) null));
                        }
                        this.f10640e = true;
                    }
                }
                File[] fileArr = this.c;
                if (fileArr != null) {
                    int i2 = this.f10639d;
                    k.c(fileArr);
                    if (i2 < fileArr.length) {
                        File[] fileArr2 = this.c;
                        k.c(fileArr2);
                        int i3 = this.f10639d;
                        this.f10639d = i3 + 1;
                        return fileArr2[i3];
                    }
                }
                if (!this.b) {
                    this.b = true;
                    return a();
                }
                l f2 = c.this.f10634d;
                if (f2 != null) {
                    x xVar2 = (x) f2.o(a());
                }
                return null;
            }
        }

        /* renamed from: kotlin.io.c$b$b  reason: collision with other inner class name */
        /* compiled from: FileTreeWalk.kt */
        private final class C0759b extends C0761c {
            private boolean b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0759b(b bVar, File file) {
                super(file);
                k.e(file, "rootFile");
                if (z.a) {
                    boolean isFile = file.isFile();
                    if (z.a && !isFile) {
                        throw new AssertionError("rootFile must be verified to be file beforehand.");
                    }
                }
            }

            public File b() {
                if (this.b) {
                    return null;
                }
                this.b = true;
                return a();
            }
        }

        /* renamed from: kotlin.io.c$b$c  reason: collision with other inner class name */
        /* compiled from: FileTreeWalk.kt */
        private final class C0760c extends a {
            private boolean b;
            private File[] c;

            /* renamed from: d  reason: collision with root package name */
            private int f10642d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ b f10643e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0760c(b bVar, File file) {
                super(file);
                k.e(file, "rootDir");
                this.f10643e = bVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:27:0x0085, code lost:
                if (r0.length == 0) goto L_0x0087;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.io.File b() {
                /*
                    r10 = this;
                    boolean r0 = r10.b
                    r1 = 0
                    if (r0 != 0) goto L_0x0028
                    kotlin.io.c$b r0 = r10.f10643e
                    kotlin.io.c r0 = kotlin.io.c.this
                    kotlin.e0.c.l r0 = r0.c
                    if (r0 == 0) goto L_0x0020
                    java.io.File r2 = r10.a()
                    java.lang.Object r0 = r0.o(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L_0x0020
                    return r1
                L_0x0020:
                    r0 = 1
                    r10.b = r0
                    java.io.File r0 = r10.a()
                    return r0
                L_0x0028:
                    java.io.File[] r0 = r10.c
                    if (r0 == 0) goto L_0x004a
                    int r2 = r10.f10642d
                    kotlin.jvm.internal.k.c(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L_0x0035
                    goto L_0x004a
                L_0x0035:
                    kotlin.io.c$b r0 = r10.f10643e
                    kotlin.io.c r0 = kotlin.io.c.this
                    kotlin.e0.c.l r0 = r0.f10634d
                    if (r0 == 0) goto L_0x0049
                    java.io.File r2 = r10.a()
                    java.lang.Object r0 = r0.o(r2)
                    kotlin.x r0 = (kotlin.x) r0
                L_0x0049:
                    return r1
                L_0x004a:
                    java.io.File[] r0 = r10.c
                    if (r0 != 0) goto L_0x009c
                    java.io.File r0 = r10.a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.c = r0
                    if (r0 != 0) goto L_0x007d
                    kotlin.io.c$b r0 = r10.f10643e
                    kotlin.io.c r0 = kotlin.io.c.this
                    kotlin.e0.c.p r0 = r0.f10635e
                    if (r0 == 0) goto L_0x007d
                    java.io.File r2 = r10.a()
                    kotlin.io.AccessDeniedException r9 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r10.a()
                    r5 = 0
                    r7 = 2
                    r8 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    java.lang.Object r0 = r0.l(r2, r9)
                    kotlin.x r0 = (kotlin.x) r0
                L_0x007d:
                    java.io.File[] r0 = r10.c
                    if (r0 == 0) goto L_0x0087
                    kotlin.jvm.internal.k.c(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L_0x009c
                L_0x0087:
                    kotlin.io.c$b r0 = r10.f10643e
                    kotlin.io.c r0 = kotlin.io.c.this
                    kotlin.e0.c.l r0 = r0.f10634d
                    if (r0 == 0) goto L_0x009b
                    java.io.File r2 = r10.a()
                    java.lang.Object r0 = r0.o(r2)
                    kotlin.x r0 = (kotlin.x) r0
                L_0x009b:
                    return r1
                L_0x009c:
                    java.io.File[] r0 = r10.c
                    kotlin.jvm.internal.k.c(r0)
                    int r1 = r10.f10642d
                    int r2 = r1 + 1
                    r10.f10642d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.io.c.b.C0760c.b():java.io.File");
            }
        }

        public b() {
            if (c.this.a.isDirectory()) {
                this.f10637i.push(f(c.this.a));
            } else if (c.this.a.isFile()) {
                this.f10637i.push(new C0759b(this, c.this.a));
            } else {
                c();
            }
        }

        private final a f(File file) {
            int i2 = d.a[c.this.b.ordinal()];
            if (i2 == 1) {
                return new C0760c(this, file);
            }
            if (i2 == 2) {
                return new a(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }

        private final File g() {
            File b;
            while (true) {
                C0761c peek = this.f10637i.peek();
                if (peek == null) {
                    return null;
                }
                b = peek.b();
                if (b == null) {
                    this.f10637i.pop();
                } else if (k.a(b, peek.a()) || !b.isDirectory() || this.f10637i.size() >= c.this.f10636f) {
                    return b;
                } else {
                    this.f10637i.push(f(b));
                }
            }
            return b;
        }

        /* access modifiers changed from: protected */
        public void a() {
            File g2 = g();
            if (g2 != null) {
                d(g2);
            } else {
                c();
            }
        }
    }

    /* renamed from: kotlin.io.c$c  reason: collision with other inner class name */
    /* compiled from: FileTreeWalk.kt */
    private static abstract class C0761c {
        private final File a;

        public C0761c(File file) {
            k.e(file, "root");
            this.a = file;
        }

        public final File a() {
            return this.a;
        }

        public abstract File b();
    }

    private c(File file, e eVar, l<? super File, Boolean> lVar, l<? super File, x> lVar2, p<? super File, ? super IOException, x> pVar, int i2) {
        this.a = file;
        this.b = eVar;
        this.c = lVar;
        this.f10634d = lVar2;
        this.f10635e = pVar;
        this.f10636f = i2;
    }

    public Iterator<File> iterator() {
        return new b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ c(File file, e eVar, l lVar, l lVar2, p pVar, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i3 & 2) != 0 ? e.TOP_DOWN : eVar, lVar, lVar2, pVar, (i3 & 32) != 0 ? Integer.MAX_VALUE : i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(File file, e eVar) {
        this(file, eVar, (l) null, (l) null, (p) null, 0, 32, (DefaultConstructorMarker) null);
        k.e(file, "start");
        k.e(eVar, "direction");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(File file, e eVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? e.TOP_DOWN : eVar);
    }
}
