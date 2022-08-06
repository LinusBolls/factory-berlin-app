package com.google.firebase.crashlytics.d.h;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import com.google.firebase.crashlytics.d.h.q;
import com.google.firebase.crashlytics.d.i.b;
import com.google.firebase.crashlytics.d.o.b;
import com.google.firebase.crashlytics.d.o.c.c;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: CrashlyticsController */
class k {
    static final Comparator<File> A = new n();
    static final Comparator<File> B = new o();
    /* access modifiers changed from: private */
    public static final Pattern C = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    private static final Map<String, String> D = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", k.h0.d.d.F);
    private static final String[] E = {"SessionUser", "SessionApp", "SessionOS", "SessionDevice"};
    static final FilenameFilter x = new h("BeginSession");
    static final FilenameFilter y = j.a();
    static final FilenameFilter z = new m();
    private final Context a;
    /* access modifiers changed from: private */
    public final s b;
    /* access modifiers changed from: private */
    public final n c;

    /* renamed from: d  reason: collision with root package name */
    private final i0 f3920d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final i f3921e;

    /* renamed from: f  reason: collision with root package name */
    private final com.google.firebase.crashlytics.d.l.c f3922f;

    /* renamed from: g  reason: collision with root package name */
    private final x f3923g;

    /* renamed from: h  reason: collision with root package name */
    private final com.google.firebase.crashlytics.d.m.h f3924h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final b f3925i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final b.C0109b f3926j;

    /* renamed from: k  reason: collision with root package name */
    private final y f3927k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final com.google.firebase.crashlytics.d.i.b f3928l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final com.google.firebase.crashlytics.d.o.a f3929m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final b.a f3930n;
    private final com.google.firebase.crashlytics.d.a o;
    private final com.google.firebase.crashlytics.d.r.d p;
    /* access modifiers changed from: private */
    public final String q;
    /* access modifiers changed from: private */
    public final com.google.firebase.crashlytics.d.f.a r;
    /* access modifiers changed from: private */
    public final g0 s;
    private q t;
    com.google.android.gms.tasks.h<Boolean> u = new com.google.android.gms.tasks.h<>();
    com.google.android.gms.tasks.h<Boolean> v = new com.google.android.gms.tasks.h<>();
    com.google.android.gms.tasks.h<Void> w = new com.google.android.gms.tasks.h<>();

    /* compiled from: CrashlyticsController */
    class a implements Callable<Void> {
        final /* synthetic */ long a;
        final /* synthetic */ String b;

        a(long j2, String str) {
            this.a = j2;
            this.b = str;
        }

        /* renamed from: a */
        public Void call() {
            if (k.this.c0()) {
                return null;
            }
            k.this.f3928l.i(this.a, this.b);
            return null;
        }
    }

    /* compiled from: CrashlyticsController */
    private final class a0 implements b.a {
        private a0() {
        }

        public boolean a() {
            return k.this.c0();
        }

        /* synthetic */ a0(k kVar, h hVar) {
            this();
        }
    }

    /* compiled from: CrashlyticsController */
    class b implements Callable<Void> {
        b() {
        }

        /* renamed from: a */
        public Void call() {
            k.this.I();
            return null;
        }
    }

    /* compiled from: CrashlyticsController */
    private static final class b0 implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        private final Context f3931g;

        /* renamed from: h  reason: collision with root package name */
        private final com.google.firebase.crashlytics.d.o.c.c f3932h;

        /* renamed from: i  reason: collision with root package name */
        private final com.google.firebase.crashlytics.d.o.b f3933i;

        /* renamed from: j  reason: collision with root package name */
        private final boolean f3934j;

        public b0(Context context, com.google.firebase.crashlytics.d.o.c.c cVar, com.google.firebase.crashlytics.d.o.b bVar, boolean z) {
            this.f3931g = context;
            this.f3932h = cVar;
            this.f3933i = bVar;
            this.f3934j = z;
        }

        public void run() {
            if (h.c(this.f3931g)) {
                com.google.firebase.crashlytics.d.b.f().b("Attempting to send crash report at time of crash...");
                this.f3933i.d(this.f3932h, this.f3934j);
            }
        }
    }

    /* compiled from: CrashlyticsController */
    class c implements Runnable {
        c() {
        }

        public void run() {
            k kVar = k.this;
            kVar.F(kVar.h0(new x()));
        }
    }

    /* compiled from: CrashlyticsController */
    static class c0 implements FilenameFilter {
        private final String a;

        public c0(String str) {
            this.a = str;
        }

        public boolean accept(File file, String str) {
            if (!str.equals(this.a + ".cls") && str.contains(this.a) && !str.endsWith(".cls_temp")) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: CrashlyticsController */
    class d implements FilenameFilter {
        final /* synthetic */ Set a;

        d(k kVar, Set set) {
            this.a = set;
        }

        public boolean accept(File file, String str) {
            if (str.length() < 35) {
                return false;
            }
            return this.a.contains(str.substring(0, 35));
        }
    }

    /* compiled from: CrashlyticsController */
    class e implements v {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ long c;

        e(k kVar, String str, String str2, long j2) {
            this.a = str;
            this.b = str2;
            this.c = j2;
        }

        public void a(com.google.firebase.crashlytics.d.n.c cVar) {
            com.google.firebase.crashlytics.d.n.d.p(cVar, this.a, this.b, this.c);
        }
    }

    /* compiled from: CrashlyticsController */
    class f implements v {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f3936d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f3937e;

        f(String str, String str2, String str3, String str4, int i2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.f3936d = str4;
            this.f3937e = i2;
        }

        public void a(com.google.firebase.crashlytics.d.n.c cVar) {
            com.google.firebase.crashlytics.d.n.d.r(cVar, this.a, this.b, this.c, this.f3936d, this.f3937e, k.this.q);
        }
    }

    /* compiled from: CrashlyticsController */
    class g implements v {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ boolean c;

        g(k kVar, String str, String str2, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        public void a(com.google.firebase.crashlytics.d.n.c cVar) {
            com.google.firebase.crashlytics.d.n.d.B(cVar, this.a, this.b, this.c);
        }
    }

    /* compiled from: CrashlyticsController */
    class h extends w {
        h(String str) {
            super(str);
        }

        public boolean accept(File file, String str) {
            return super.accept(file, str) && str.endsWith(".cls");
        }
    }

    /* compiled from: CrashlyticsController */
    class i implements v {
        final /* synthetic */ int a;
        final /* synthetic */ String b;
        final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f3939d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f3940e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f3941f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f3942g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f3943h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f3944i;

        i(k kVar, int i2, String str, int i3, long j2, long j3, boolean z, int i4, String str2, String str3) {
            this.a = i2;
            this.b = str;
            this.c = i3;
            this.f3939d = j2;
            this.f3940e = j3;
            this.f3941f = z;
            this.f3942g = i4;
            this.f3943h = str2;
            this.f3944i = str3;
        }

        public void a(com.google.firebase.crashlytics.d.n.c cVar) {
            com.google.firebase.crashlytics.d.n.d.t(cVar, this.a, this.b, this.c, this.f3939d, this.f3940e, this.f3941f, this.f3942g, this.f3943h, this.f3944i);
        }
    }

    /* compiled from: CrashlyticsController */
    class j implements v {
        final /* synthetic */ i0 a;

        j(k kVar, i0 i0Var) {
            this.a = i0Var;
        }

        public void a(com.google.firebase.crashlytics.d.n.c cVar) {
            com.google.firebase.crashlytics.d.n.d.C(cVar, this.a.b(), (String) null, (String) null);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.d.h.k$k  reason: collision with other inner class name */
    /* compiled from: CrashlyticsController */
    class C0088k implements v {
        final /* synthetic */ String a;

        C0088k(String str) {
            this.a = str;
        }

        public void a(com.google.firebase.crashlytics.d.n.c cVar) {
            com.google.firebase.crashlytics.d.n.d.s(cVar, this.a);
        }
    }

    /* compiled from: CrashlyticsController */
    class l implements Callable<Void> {
        final /* synthetic */ long a;

        l(long j2) {
            this.a = j2;
        }

        /* renamed from: a */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.a);
            k.this.r.a("_ae", bundle);
            return null;
        }
    }

    /* compiled from: CrashlyticsController */
    class m implements FilenameFilter {
        m() {
        }

        public boolean accept(File file, String str) {
            return str.length() == 39 && str.endsWith(".cls");
        }
    }

    /* compiled from: CrashlyticsController */
    class n implements Comparator<File> {
        n() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            return file2.getName().compareTo(file.getName());
        }
    }

    /* compiled from: CrashlyticsController */
    class o implements Comparator<File> {
        o() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    }

    /* compiled from: CrashlyticsController */
    class p implements q.a {
        p() {
        }

        public void a(com.google.firebase.crashlytics.d.q.e eVar, Thread thread, Throwable th) {
            k.this.b0(eVar, thread, th);
        }
    }

    /* compiled from: CrashlyticsController */
    class q implements Callable<com.google.android.gms.tasks.g<Void>> {
        final /* synthetic */ Date a;
        final /* synthetic */ Throwable b;
        final /* synthetic */ Thread c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.google.firebase.crashlytics.d.q.e f3945d;

        /* compiled from: CrashlyticsController */
        class a implements com.google.android.gms.tasks.f<com.google.firebase.crashlytics.d.q.i.b, Void> {
            final /* synthetic */ Executor a;

            a(Executor executor) {
                this.a = executor;
            }

            /* renamed from: b */
            public com.google.android.gms.tasks.g<Void> a(com.google.firebase.crashlytics.d.q.i.b bVar) {
                if (bVar == null) {
                    com.google.firebase.crashlytics.d.b.f().i("Received null app settings, cannot send reports at crash time.");
                    return com.google.android.gms.tasks.j.d(null);
                }
                k.this.r0(bVar, true);
                return com.google.android.gms.tasks.j.f(k.this.n0(), k.this.s.m(this.a, t.a(bVar)));
            }
        }

        q(Date date, Throwable th, Thread thread, com.google.firebase.crashlytics.d.q.e eVar) {
            this.a = date;
            this.b = th;
            this.c = thread;
            this.f3945d = eVar;
        }

        /* renamed from: a */
        public com.google.android.gms.tasks.g<Void> call() {
            k.this.c.a();
            long q = k.Y(this.a);
            k.this.s.k(this.b, this.c, q);
            k.this.A0(this.c, this.b, q);
            k.this.y0(this.a.getTime());
            com.google.firebase.crashlytics.d.q.i.e b2 = this.f3945d.b();
            int i2 = b2.a().a;
            int i3 = b2.a().b;
            k.this.G(i2);
            k.this.I();
            k.this.w0(i3);
            if (!k.this.b.d()) {
                return com.google.android.gms.tasks.j.d(null);
            }
            Executor c2 = k.this.f3921e.c();
            return this.f3945d.a().n(c2, new a(c2));
        }
    }

    /* compiled from: CrashlyticsController */
    class r implements com.google.android.gms.tasks.f<Void, Boolean> {
        r(k kVar) {
        }

        /* renamed from: b */
        public com.google.android.gms.tasks.g<Boolean> a(Void voidR) {
            return com.google.android.gms.tasks.j.d(Boolean.TRUE);
        }
    }

    /* compiled from: CrashlyticsController */
    class s implements com.google.android.gms.tasks.f<Boolean, Void> {
        final /* synthetic */ com.google.android.gms.tasks.g a;
        final /* synthetic */ float b;

        /* compiled from: CrashlyticsController */
        class a implements Callable<com.google.android.gms.tasks.g<Void>> {
            final /* synthetic */ Boolean a;

            /* renamed from: com.google.firebase.crashlytics.d.h.k$s$a$a  reason: collision with other inner class name */
            /* compiled from: CrashlyticsController */
            class C0089a implements com.google.android.gms.tasks.f<com.google.firebase.crashlytics.d.q.i.b, Void> {
                final /* synthetic */ List a;
                final /* synthetic */ boolean b;
                final /* synthetic */ Executor c;

                C0089a(List list, boolean z, Executor executor) {
                    this.a = list;
                    this.b = z;
                    this.c = executor;
                }

                /* renamed from: b */
                public com.google.android.gms.tasks.g<Void> a(com.google.firebase.crashlytics.d.q.i.b bVar) {
                    if (bVar == null) {
                        com.google.firebase.crashlytics.d.b.f().i("Received null app settings, cannot send reports during app startup.");
                        return com.google.android.gms.tasks.j.d(null);
                    }
                    for (com.google.firebase.crashlytics.d.o.c.c cVar : this.a) {
                        if (cVar.getType() == c.a.JAVA) {
                            k.w(bVar.f4136e, cVar.e());
                        }
                    }
                    com.google.android.gms.tasks.g unused = k.this.n0();
                    k.this.f3926j.a(bVar).e(this.a, this.b, s.this.b);
                    k.this.s.m(this.c, t.a(bVar));
                    k.this.w.e(null);
                    return com.google.android.gms.tasks.j.d(null);
                }
            }

            a(Boolean bool) {
                this.a = bool;
            }

            /* renamed from: a */
            public com.google.android.gms.tasks.g<Void> call() {
                List<com.google.firebase.crashlytics.d.o.c.c> d2 = k.this.f3929m.d();
                if (!this.a.booleanValue()) {
                    com.google.firebase.crashlytics.d.b.f().b("Reports are being deleted.");
                    k.D(k.this.e0());
                    k.this.f3929m.c(d2);
                    k.this.s.l();
                    k.this.w.e(null);
                    return com.google.android.gms.tasks.j.d(null);
                }
                com.google.firebase.crashlytics.d.b.f().b("Reports are being sent.");
                boolean booleanValue = this.a.booleanValue();
                k.this.b.c(booleanValue);
                Executor c = k.this.f3921e.c();
                return s.this.a.n(c, new C0089a(d2, booleanValue, c));
            }
        }

        s(com.google.android.gms.tasks.g gVar, float f2) {
            this.a = gVar;
            this.b = f2;
        }

        /* renamed from: b */
        public com.google.android.gms.tasks.g<Void> a(Boolean bool) {
            return k.this.f3921e.i(new a(bool));
        }
    }

    /* compiled from: CrashlyticsController */
    class t implements b.C0109b {
        t() {
        }

        public com.google.firebase.crashlytics.d.o.b a(com.google.firebase.crashlytics.d.q.i.b bVar) {
            String str = bVar.c;
            String str2 = bVar.f4135d;
            return new com.google.firebase.crashlytics.d.o.b(bVar.f4136e, k.this.f3925i.a, t.a(bVar), k.this.f3929m, k.this.P(str, str2), k.this.f3930n);
        }
    }

    /* compiled from: CrashlyticsController */
    private static class u implements FilenameFilter {
        private u() {
        }

        public boolean accept(File file, String str) {
            return !k.z.accept(file, str) && k.C.matcher(str).matches();
        }

        /* synthetic */ u(h hVar) {
            this();
        }
    }

    /* compiled from: CrashlyticsController */
    private interface v {
        void a(com.google.firebase.crashlytics.d.n.c cVar);
    }

    /* compiled from: CrashlyticsController */
    static class w implements FilenameFilter {
        private final String a;

        public w(String str) {
            this.a = str;
        }

        public boolean accept(File file, String str) {
            return str.contains(this.a) && !str.endsWith(".cls_temp");
        }
    }

    /* compiled from: CrashlyticsController */
    static class x implements FilenameFilter {
        x() {
        }

        public boolean accept(File file, String str) {
            return com.google.firebase.crashlytics.d.n.b.f4094j.accept(file, str) || str.contains("SessionMissingBinaryImages");
        }
    }

    /* compiled from: CrashlyticsController */
    private static final class y implements b.C0091b {
        private final com.google.firebase.crashlytics.d.m.h a;

        public y(com.google.firebase.crashlytics.d.m.h hVar) {
            this.a = hVar;
        }

        public File a() {
            File file = new File(this.a.b(), "log-files");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    /* compiled from: CrashlyticsController */
    private final class z implements b.c {
        private z() {
        }

        public File[] a() {
            return k.this.i0();
        }

        public File[] b() {
            return k.this.f0();
        }

        /* synthetic */ z(k kVar, h hVar) {
            this();
        }
    }

    k(Context context, i iVar, com.google.firebase.crashlytics.d.l.c cVar, x xVar, s sVar, com.google.firebase.crashlytics.d.m.h hVar, n nVar, b bVar, com.google.firebase.crashlytics.d.o.a aVar, b.C0109b bVar2, com.google.firebase.crashlytics.d.a aVar2, com.google.firebase.crashlytics.d.s.b bVar3, com.google.firebase.crashlytics.d.f.a aVar3, com.google.firebase.crashlytics.d.q.e eVar) {
        com.google.firebase.crashlytics.d.m.h hVar2 = hVar;
        b.C0109b bVar4 = bVar2;
        new AtomicInteger(0);
        new AtomicBoolean(false);
        this.a = context;
        this.f3921e = iVar;
        this.f3922f = cVar;
        this.f3923g = xVar;
        this.b = sVar;
        this.f3924h = hVar2;
        this.c = nVar;
        this.f3925i = bVar;
        if (bVar4 != null) {
            this.f3926j = bVar4;
        } else {
            this.f3926j = C();
        }
        this.o = aVar2;
        this.q = bVar3.a();
        this.r = aVar3;
        this.f3920d = new i0();
        this.f3927k = new y(hVar2);
        this.f3928l = new com.google.firebase.crashlytics.d.i.b(context, this.f3927k);
        this.f3929m = aVar == null ? new com.google.firebase.crashlytics.d.o.a(new z(this, (h) null)) : aVar;
        this.f3930n = new a0(this, (h) null);
        com.google.firebase.crashlytics.d.r.a aVar4 = new com.google.firebase.crashlytics.d.r.a(1024, new com.google.firebase.crashlytics.d.r.c(10));
        this.p = aVar4;
        this.s = g0.b(context, xVar, hVar, bVar, this.f3928l, this.f3920d, aVar4, eVar);
    }

    private void A(com.google.firebase.crashlytics.d.n.b bVar) {
        if (bVar != null) {
            try {
                bVar.a();
            } catch (IOException e2) {
                com.google.firebase.crashlytics.d.b.f().e("Error closing session file stream in the presence of an exception", e2);
            }
        }
    }

    /* access modifiers changed from: private */
    public void A0(Thread thread, Throwable th, long j2) {
        com.google.firebase.crashlytics.d.n.b bVar;
        com.google.firebase.crashlytics.d.n.c cVar = null;
        try {
            String Q = Q();
            if (Q == null) {
                com.google.firebase.crashlytics.d.b.f().d("Tried to write a fatal exception while no session was open.");
                h.j((Flushable) null, "Failed to flush to session begin file.");
                h.e((Closeable) null, "Failed to close fatal exception file output stream.");
                return;
            }
            bVar = new com.google.firebase.crashlytics.d.n.b(T(), Q + "SessionCrash");
            try {
                cVar = com.google.firebase.crashlytics.d.n.c.D(bVar);
                F0(cVar, thread, th, j2, "crash", true);
            } catch (Exception e2) {
                e = e2;
            }
            h.j(cVar, "Failed to flush to session begin file.");
            h.e(bVar, "Failed to close fatal exception file output stream.");
        } catch (Exception e3) {
            e = e3;
            bVar = null;
            try {
                com.google.firebase.crashlytics.d.b.f().e("An error occurred in the fatal exception logger", e);
                h.j(cVar, "Failed to flush to session begin file.");
                h.e(bVar, "Failed to close fatal exception file output stream.");
            } catch (Throwable th2) {
                th = th2;
                h.j(cVar, "Failed to flush to session begin file.");
                h.e(bVar, "Failed to close fatal exception file output stream.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bVar = null;
            h.j(cVar, "Failed to flush to session begin file.");
            h.e(bVar, "Failed to close fatal exception file output stream.");
            throw th;
        }
    }

    private static void B(InputStream inputStream, com.google.firebase.crashlytics.d.n.c cVar, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read < 0) {
                break;
            }
            i3 += read;
        }
        cVar.V(bArr);
    }

    private void B0(com.google.firebase.crashlytics.d.n.c cVar, String str) {
        for (String str2 : E) {
            File[] h0 = h0(new w(str + str2 + ".cls"));
            if (h0.length == 0) {
                com.google.firebase.crashlytics.d.b.f().b("Can't find " + str2 + " data for session ID " + str);
            } else {
                com.google.firebase.crashlytics.d.b.f().b("Collecting " + str2 + " data for session ID " + str);
                K0(cVar, h0[0]);
            }
        }
    }

    private b.C0109b C() {
        return new t();
    }

    private static void C0(com.google.firebase.crashlytics.d.n.c cVar, File[] fileArr, String str) {
        Arrays.sort(fileArr, h.c);
        for (File file : fileArr) {
            try {
                com.google.firebase.crashlytics.d.b.f().b(String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[]{str, file.getName()}));
                K0(cVar, file);
            } catch (Exception e2) {
                com.google.firebase.crashlytics.d.b.f().e("Error writting non-fatal to session.", e2);
            }
        }
    }

    /* access modifiers changed from: private */
    public static void D(File[] fileArr) {
        if (fileArr != null) {
            for (File delete : fileArr) {
                delete.delete();
            }
        }
    }

    private void D0(String str) {
        String d2 = this.f3923g.d();
        b bVar = this.f3925i;
        String str2 = bVar.f3904e;
        String str3 = bVar.f3905f;
        String str4 = d2;
        String str5 = str2;
        String str6 = str3;
        String a2 = this.f3923g.a();
        int f2 = u.a(this.f3925i.c).f();
        H0(str, "SessionApp", new f(str4, str5, str6, a2, f2));
        this.o.d(str, str4, str5, str6, a2, f2, this.q);
    }

    private void E0(String str) {
        Context O = O();
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int m2 = h.m();
        String str2 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long v2 = h.v();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean B2 = h.B(O);
        int n2 = h.n(O);
        String str3 = Build.MANUFACTURER;
        String str4 = Build.PRODUCT;
        H0(str, "SessionDevice", new i(this, m2, str2, availableProcessors, v2, blockCount, B2, n2, str3, str4));
        this.o.c(str, m2, str2, availableProcessors, v2, blockCount, B2, n2, str3, str4);
    }

    private void F0(com.google.firebase.crashlytics.d.n.c cVar, Thread thread, Throwable th, long j2, String str, boolean z2) {
        Thread[] threadArr;
        TreeMap treeMap;
        Map map;
        com.google.firebase.crashlytics.d.r.e eVar = new com.google.firebase.crashlytics.d.r.e(th, this.p);
        Context O = O();
        e a2 = e.a(O);
        Float b2 = a2.b();
        int c2 = a2.c();
        boolean q2 = h.q(O);
        int i2 = O.getResources().getConfiguration().orientation;
        long v2 = h.v() - h.a(O);
        long b3 = h.b(Environment.getDataDirectory().getPath());
        ActivityManager.RunningAppProcessInfo k2 = h.k(O.getPackageName(), O);
        LinkedList linkedList = new LinkedList();
        StackTraceElement[] stackTraceElementArr = eVar.c;
        String str2 = this.f3925i.b;
        String d2 = this.f3923g.d();
        int i3 = 0;
        if (z2) {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            Thread[] threadArr2 = new Thread[allStackTraces.size()];
            for (Map.Entry next : allStackTraces.entrySet()) {
                threadArr2[i3] = (Thread) next.getKey();
                linkedList.add(this.p.a((StackTraceElement[]) next.getValue()));
                i3++;
            }
            threadArr = threadArr2;
        } else {
            threadArr = new Thread[0];
        }
        if (!h.l(O, "com.crashlytics.CollectCustomKeys", true)) {
            map = new TreeMap();
        } else {
            map = this.f3920d.a();
            if (map != null && map.size() > 1) {
                treeMap = new TreeMap(map);
                com.google.firebase.crashlytics.d.n.d.u(cVar, j2, str, eVar, thread, stackTraceElementArr, threadArr, linkedList, 8, treeMap, this.f3928l.c(), k2, i2, d2, str2, b2, c2, q2, v2, b3);
                this.f3928l.a();
            }
        }
        treeMap = map;
        com.google.firebase.crashlytics.d.n.d.u(cVar, j2, str, eVar, thread, stackTraceElementArr, threadArr, linkedList, 8, treeMap, this.f3928l.c(), k2, i2, d2, str2, b2, c2, q2, v2, b3);
        this.f3928l.a();
    }

    private void G0(String str) {
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        boolean D2 = h.D(O());
        H0(str, "SessionOS", new g(this, str2, str3, D2));
        this.o.f(str, str2, str3, D2);
    }

    private void H(int i2, boolean z2) {
        int i3 = !z2;
        u0(i3 + 8);
        File[] l0 = l0();
        if (l0.length <= i3) {
            com.google.firebase.crashlytics.d.b.f().b("No open sessions to be closed.");
            return;
        }
        String X = X(l0[i3]);
        J0(X);
        if (z2) {
            this.s.h();
        } else if (this.o.h(X)) {
            L(X);
            if (!this.o.a(X)) {
                com.google.firebase.crashlytics.d.b.f().b("Could not finalize native session: " + X);
            }
        }
        z(l0, i3, i2);
        this.s.d(R());
    }

    private void H0(String str, String str2, v vVar) {
        com.google.firebase.crashlytics.d.n.b bVar;
        com.google.firebase.crashlytics.d.n.c cVar = null;
        try {
            bVar = new com.google.firebase.crashlytics.d.n.b(T(), str + str2);
            try {
                cVar = com.google.firebase.crashlytics.d.n.c.D(bVar);
                vVar.a(cVar);
                h.j(cVar, "Failed to flush to session " + str2 + " file.");
                h.e(bVar, "Failed to close session " + str2 + " file.");
            } catch (Throwable th) {
                th = th;
                h.j(cVar, "Failed to flush to session " + str2 + " file.");
                h.e(bVar, "Failed to close session " + str2 + " file.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bVar = null;
            h.j(cVar, "Failed to flush to session " + str2 + " file.");
            h.e(bVar, "Failed to close session " + str2 + " file.");
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public void I() {
        long R = R();
        String gVar = new g(this.f3923g).toString();
        com.google.firebase.crashlytics.d.b f2 = com.google.firebase.crashlytics.d.b.f();
        f2.b("Opening a new session with ID " + gVar);
        this.o.g(gVar);
        z0(gVar, R);
        D0(gVar);
        G0(gVar);
        E0(gVar);
        this.f3928l.g(gVar);
        this.s.g(o0(gVar), R);
    }

    private void I0(File file, String str, int i2) {
        com.google.firebase.crashlytics.d.b f2 = com.google.firebase.crashlytics.d.b.f();
        f2.b("Collecting session parts for ID " + str);
        File[] h0 = h0(new w(str + "SessionCrash"));
        boolean z2 = h0 != null && h0.length > 0;
        com.google.firebase.crashlytics.d.b.f().b(String.format(Locale.US, "Session %s has fatal exception: %s", new Object[]{str, Boolean.valueOf(z2)}));
        File[] h02 = h0(new w(str + "SessionEvent"));
        boolean z3 = h02 != null && h02.length > 0;
        com.google.firebase.crashlytics.d.b.f().b(String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[]{str, Boolean.valueOf(z3)}));
        if (z2 || z3) {
            t0(file, str, Z(str, h02, i2), z2 ? h0[0] : null);
        } else {
            com.google.firebase.crashlytics.d.b f3 = com.google.firebase.crashlytics.d.b.f();
            f3.b("No events present for session ID " + str);
        }
        com.google.firebase.crashlytics.d.b f4 = com.google.firebase.crashlytics.d.b.f();
        f4.b("Removing session part files for ID " + str);
        D(k0(str));
    }

    private void J0(String str) {
        H0(str, "SessionUser", new j(this, a0(str)));
    }

    private File[] K(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    private static void K0(com.google.firebase.crashlytics.d.n.c cVar, File file) {
        if (!file.exists()) {
            com.google.firebase.crashlytics.d.b f2 = com.google.firebase.crashlytics.d.b.f();
            f2.d("Tried to include a file that doesn't exist: " + file.getName());
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                B(fileInputStream2, cVar, (int) file.length());
                h.e(fileInputStream2, "Failed to close file input stream.");
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                h.e(fileInputStream, "Failed to close file input stream.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            h.e(fileInputStream, "Failed to close file input stream.");
            throw th;
        }
    }

    private void L(String str) {
        com.google.firebase.crashlytics.d.b f2 = com.google.firebase.crashlytics.d.b.f();
        f2.b("Finalizing native report for session " + str);
        com.google.firebase.crashlytics.d.d b2 = this.o.b(str);
        File d2 = b2.d();
        if (d2 == null || !d2.exists()) {
            com.google.firebase.crashlytics.d.b f3 = com.google.firebase.crashlytics.d.b.f();
            f3.i("No minidump data found for session " + str);
            return;
        }
        long lastModified = d2.lastModified();
        com.google.firebase.crashlytics.d.i.b bVar = new com.google.firebase.crashlytics.d.i.b(this.a, this.f3927k, str);
        File file = new File(V(), str);
        if (!file.mkdirs()) {
            com.google.firebase.crashlytics.d.b.f().b("Couldn't create native sessions directory");
            return;
        }
        y0(lastModified);
        List<b0> U = U(b2, str, O(), T(), bVar.c());
        c0.b(file, U);
        this.s.c(o0(str), U);
        bVar.a();
    }

    private static boolean N() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private Context O() {
        return this.a;
    }

    /* access modifiers changed from: private */
    public com.google.firebase.crashlytics.d.o.d.b P(String str, String str2) {
        String u2 = h.u(O(), "com.crashlytics.ApiEndpoint");
        return new com.google.firebase.crashlytics.d.o.d.a(new com.google.firebase.crashlytics.d.o.d.c(u2, str, this.f3922f, m.i()), new com.google.firebase.crashlytics.d.o.d.d(u2, str2, this.f3922f, m.i()));
    }

    private String Q() {
        File[] l0 = l0();
        if (l0.length > 0) {
            return X(l0[0]);
        }
        return null;
    }

    private static long R() {
        return Y(new Date());
    }

    static List<b0> U(com.google.firebase.crashlytics.d.d dVar, String str, Context context, File file, byte[] bArr) {
        byte[] bArr2;
        a0 a0Var = new a0(file);
        File b2 = a0Var.b(str);
        File a2 = a0Var.a(str);
        try {
            bArr2 = com.google.firebase.crashlytics.d.k.b.a(dVar.f(), context);
        } catch (Exception unused) {
            bArr2 = null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new f("logs_file", "logs", bArr));
        arrayList.add(new f("binary_images_file", "binaryImages", bArr2));
        arrayList.add(new w("crash_meta_file", "metadata", dVar.g()));
        arrayList.add(new w("session_meta_file", "session", dVar.e()));
        arrayList.add(new w("app_meta_file", "app", dVar.a()));
        arrayList.add(new w("device_meta_file", "device", dVar.c()));
        arrayList.add(new w("os_meta_file", "os", dVar.b()));
        arrayList.add(new w("minidump_file", "minidump", dVar.d()));
        arrayList.add(new w("user_meta_file", "user", b2));
        arrayList.add(new w("keys_file", "keys", a2));
        return arrayList;
    }

    static String X(File file) {
        return file.getName().substring(0, 35);
    }

    /* access modifiers changed from: private */
    public static long Y(Date date) {
        return date.getTime() / 1000;
    }

    private File[] Z(String str, File[] fileArr, int i2) {
        if (fileArr.length <= i2) {
            return fileArr;
        }
        com.google.firebase.crashlytics.d.b.f().b(String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[]{Integer.valueOf(i2)}));
        v0(str, i2);
        return h0(new w(str + "SessionEvent"));
    }

    private i0 a0(String str) {
        if (c0()) {
            return this.f3920d;
        }
        return new a0(T()).d(str);
    }

    private File[] g0(File file, FilenameFilter filenameFilter) {
        return K(file.listFiles(filenameFilter));
    }

    /* access modifiers changed from: private */
    public File[] h0(FilenameFilter filenameFilter) {
        return g0(T(), filenameFilter);
    }

    private File[] k0(String str) {
        return h0(new c0(str));
    }

    private File[] l0() {
        File[] j0 = j0();
        Arrays.sort(j0, A);
        return j0;
    }

    private com.google.android.gms.tasks.g<Void> m0(long j2) {
        if (!N()) {
            return com.google.android.gms.tasks.j.b(new ScheduledThreadPoolExecutor(1), new l(j2));
        }
        com.google.firebase.crashlytics.d.b.f().b("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
        return com.google.android.gms.tasks.j.d(null);
    }

    /* access modifiers changed from: private */
    public com.google.android.gms.tasks.g<Void> n0() {
        ArrayList arrayList = new ArrayList();
        for (File file : e0()) {
            try {
                arrayList.add(m0(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                com.google.firebase.crashlytics.d.b.f().b("Could not parse timestamp from file " + file.getName());
            }
            file.delete();
        }
        return com.google.android.gms.tasks.j.e(arrayList);
    }

    private static String o0(String str) {
        return str.replaceAll("-", "");
    }

    private void q0(File[] fileArr, Set<String> set) {
        for (File file : fileArr) {
            String name = file.getName();
            Matcher matcher = C.matcher(name);
            if (!matcher.matches()) {
                com.google.firebase.crashlytics.d.b.f().b("Deleting unknown file: " + name);
                file.delete();
            } else if (!set.contains(matcher.group(1))) {
                com.google.firebase.crashlytics.d.b.f().b("Trimming session file: " + name);
                file.delete();
            }
        }
    }

    /* access modifiers changed from: private */
    public void r0(com.google.firebase.crashlytics.d.q.i.b bVar, boolean z2) {
        Context O = O();
        com.google.firebase.crashlytics.d.o.b a2 = this.f3926j.a(bVar);
        for (File file : f0()) {
            w(bVar.f4136e, file);
            this.f3921e.g(new b0(O, new com.google.firebase.crashlytics.d.o.c.d(file, D), a2, z2));
        }
    }

    private void t0(File file, String str, File[] fileArr, File file2) {
        com.google.firebase.crashlytics.d.n.b bVar;
        boolean z2 = file2 != null;
        File S = z2 ? S() : W();
        if (!S.exists()) {
            S.mkdirs();
        }
        try {
            bVar = new com.google.firebase.crashlytics.d.n.b(S, str);
            try {
                com.google.firebase.crashlytics.d.n.c D2 = com.google.firebase.crashlytics.d.n.c.D(bVar);
                com.google.firebase.crashlytics.d.b.f().b("Collecting SessionStart data for session ID " + str);
                K0(D2, file);
                D2.i0(4, R());
                D2.G(5, z2);
                D2.g0(11, 1);
                D2.L(12, 3);
                B0(D2, str);
                C0(D2, fileArr, str);
                if (z2) {
                    K0(D2, file2);
                }
                h.j(D2, "Error flushing session file stream");
                h.e(bVar, "Failed to close CLS file");
            } catch (Exception e2) {
                e = e2;
                try {
                    com.google.firebase.crashlytics.d.b.f().e("Failed to write session file for session ID: " + str, e);
                    h.j((Flushable) null, "Error flushing session file stream");
                    A(bVar);
                } catch (Throwable th) {
                    th = th;
                    h.j((Flushable) null, "Error flushing session file stream");
                    h.e(bVar, "Failed to close CLS file");
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            bVar = null;
            com.google.firebase.crashlytics.d.b.f().e("Failed to write session file for session ID: " + str, e);
            h.j((Flushable) null, "Error flushing session file stream");
            A(bVar);
        } catch (Throwable th2) {
            th = th2;
            bVar = null;
            h.j((Flushable) null, "Error flushing session file stream");
            h.e(bVar, "Failed to close CLS file");
            throw th;
        }
    }

    private void u0(int i2) {
        HashSet hashSet = new HashSet();
        File[] l0 = l0();
        int min = Math.min(i2, l0.length);
        for (int i3 = 0; i3 < min; i3++) {
            hashSet.add(X(l0[i3]));
        }
        this.f3928l.b(hashSet);
        q0(h0(new u((h) null)), hashSet);
    }

    private void v0(String str, int i2) {
        File T = T();
        k0.d(T, new w(str + "SessionEvent"), i2, B);
    }

    /* access modifiers changed from: private */
    public static void w(String str, File file) {
        if (str != null) {
            x(file, new C0088k(str));
        }
    }

    private static void x(File file, v vVar) {
        FileOutputStream fileOutputStream;
        com.google.firebase.crashlytics.d.n.c cVar = null;
        try {
            fileOutputStream = new FileOutputStream(file, true);
            try {
                cVar = com.google.firebase.crashlytics.d.n.c.D(fileOutputStream);
                vVar.a(cVar);
                h.j(cVar, "Failed to flush to append to " + file.getPath());
                h.e(fileOutputStream, "Failed to close " + file.getPath());
            } catch (Throwable th) {
                th = th;
                h.j(cVar, "Failed to flush to append to " + file.getPath());
                h.e(fileOutputStream, "Failed to close " + file.getPath());
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
            h.j(cVar, "Failed to flush to append to " + file.getPath());
            h.e(fileOutputStream, "Failed to close " + file.getPath());
            throw th;
        }
    }

    private com.google.android.gms.tasks.g<Boolean> x0() {
        if (this.b.d()) {
            com.google.firebase.crashlytics.d.b.f().b("Automatic data collection is enabled. Allowing upload.");
            this.u.e(Boolean.FALSE);
            return com.google.android.gms.tasks.j.d(Boolean.TRUE);
        }
        com.google.firebase.crashlytics.d.b.f().b("Automatic data collection is disabled.");
        com.google.firebase.crashlytics.d.b.f().b("Notifying that unsent reports are available.");
        this.u.e(Boolean.TRUE);
        com.google.android.gms.tasks.g<TContinuationResult> m2 = this.b.g().m(new r(this));
        com.google.firebase.crashlytics.d.b.f().b("Waiting for send/deleteUnsentReports to be called.");
        return k0.h(m2, this.v.a());
    }

    /* access modifiers changed from: private */
    public void y0(long j2) {
        try {
            File T = T();
            new File(T, ".ae" + j2).createNewFile();
        } catch (IOException unused) {
            com.google.firebase.crashlytics.d.b.f().b("Could not write app exception marker.");
        }
    }

    private void z(File[] fileArr, int i2, int i3) {
        com.google.firebase.crashlytics.d.b.f().b("Closing open sessions.");
        while (i2 < fileArr.length) {
            File file = fileArr[i2];
            String X = X(file);
            com.google.firebase.crashlytics.d.b f2 = com.google.firebase.crashlytics.d.b.f();
            f2.b("Closing session: " + X);
            I0(file, X, i3);
            i2++;
        }
    }

    private void z0(String str, long j2) {
        String format = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{m.i()});
        H0(str, "BeginSession", new e(this, str, format, j2));
        this.o.e(str, format, j2);
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        if (!this.c.c()) {
            String Q = Q();
            if (Q == null || !this.o.h(Q)) {
                return false;
            }
            return true;
        }
        com.google.firebase.crashlytics.d.b.f().b("Found previous crash marker.");
        this.c.d();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void F(File[] fileArr) {
        HashSet hashSet = new HashSet();
        for (File file : fileArr) {
            com.google.firebase.crashlytics.d.b.f().b("Found invalid session part file: " + file);
            hashSet.add(X(file));
        }
        if (!hashSet.isEmpty()) {
            for (File file2 : h0(new d(this, hashSet))) {
                com.google.firebase.crashlytics.d.b.f().b("Deleting invalid session file: " + file2);
                file2.delete();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void G(int i2) {
        H(i2, true);
    }

    /* access modifiers changed from: package-private */
    public void J(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, com.google.firebase.crashlytics.d.q.e eVar) {
        p0();
        q qVar = new q(new p(), eVar, uncaughtExceptionHandler);
        this.t = qVar;
        Thread.setDefaultUncaughtExceptionHandler(qVar);
    }

    /* access modifiers changed from: package-private */
    public void L0(long j2, String str) {
        this.f3921e.h(new a(j2, str));
    }

    /* access modifiers changed from: package-private */
    public boolean M(int i2) {
        this.f3921e.b();
        if (c0()) {
            com.google.firebase.crashlytics.d.b.f().b("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        com.google.firebase.crashlytics.d.b.f().b("Finalizing previously open sessions.");
        try {
            H(i2, false);
            com.google.firebase.crashlytics.d.b.f().b("Closed all previously open sessions");
            return true;
        } catch (Exception e2) {
            com.google.firebase.crashlytics.d.b.f().e("Unable to finalize previously open sessions.", e2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public File S() {
        return new File(T(), "fatal-sessions");
    }

    /* access modifiers changed from: package-private */
    public File T() {
        return this.f3924h.b();
    }

    /* access modifiers changed from: package-private */
    public File V() {
        return new File(T(), "native-sessions");
    }

    /* access modifiers changed from: package-private */
    public File W() {
        return new File(T(), "nonfatal-sessions");
    }

    /* access modifiers changed from: package-private */
    public synchronized void b0(com.google.firebase.crashlytics.d.q.e eVar, Thread thread, Throwable th) {
        com.google.firebase.crashlytics.d.b f2 = com.google.firebase.crashlytics.d.b.f();
        f2.b("Crashlytics is handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            k0.a(this.f3921e.i(new q(new Date(), th, thread, eVar)));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c0() {
        q qVar = this.t;
        return qVar != null && qVar.a();
    }

    /* access modifiers changed from: package-private */
    public File[] e0() {
        return h0(y);
    }

    /* access modifiers changed from: package-private */
    public File[] f0() {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, g0(S(), z));
        Collections.addAll(linkedList, g0(W(), z));
        Collections.addAll(linkedList, g0(T(), z));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    /* access modifiers changed from: package-private */
    public File[] i0() {
        return K(V().listFiles());
    }

    /* access modifiers changed from: package-private */
    public File[] j0() {
        return h0(x);
    }

    /* access modifiers changed from: package-private */
    public void p0() {
        this.f3921e.h(new b());
    }

    /* access modifiers changed from: package-private */
    public com.google.android.gms.tasks.g<Void> s0(float f2, com.google.android.gms.tasks.g<com.google.firebase.crashlytics.d.q.i.b> gVar) {
        if (!this.f3929m.a()) {
            com.google.firebase.crashlytics.d.b.f().b("No reports are available.");
            this.u.e(Boolean.FALSE);
            return com.google.android.gms.tasks.j.d(null);
        }
        com.google.firebase.crashlytics.d.b.f().b("Unsent reports are available.");
        return x0().m(new s(gVar, f2));
    }

    /* access modifiers changed from: package-private */
    public void w0(int i2) {
        int f2 = i2 - k0.f(V(), S(), i2, B);
        k0.d(T(), z, f2 - k0.c(W(), f2, B), B);
    }

    /* access modifiers changed from: package-private */
    public void y() {
        this.f3921e.g(new c());
    }
}
