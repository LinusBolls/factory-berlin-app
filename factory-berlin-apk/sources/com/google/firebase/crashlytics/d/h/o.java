package com.google.firebase.crashlytics.d.h;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.d.j.v;
import com.google.firebase.crashlytics.d.j.w;
import com.google.firebase.crashlytics.d.r.d;
import com.google.firebase.crashlytics.d.r.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: CrashlyticsReportDataCapture */
public class o {

    /* renamed from: e  reason: collision with root package name */
    private static final String f3962e = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{"17.2.1"});

    /* renamed from: f  reason: collision with root package name */
    private static final Map<String, Integer> f3963f;
    private final Context a;
    private final x b;
    private final b c;

    /* renamed from: d  reason: collision with root package name */
    private final d f3964d;

    static {
        HashMap hashMap = new HashMap();
        f3963f = hashMap;
        hashMap.put("armeabi", 5);
        f3963f.put("armeabi-v7a", 6);
        f3963f.put("arm64-v8a", 9);
        f3963f.put("x86", 0);
        f3963f.put("x86_64", 1);
    }

    public o(Context context, x xVar, b bVar, d dVar) {
        this.a = context;
        this.b = xVar;
        this.c = bVar;
        this.f3964d = dVar;
    }

    private v.a a() {
        v.a b2 = v.b();
        b2.h("17.2.1");
        b2.d(this.c.a);
        b2.e(this.b.a());
        b2.b(this.c.f3904e);
        b2.c(this.c.f3905f);
        b2.g(4);
        return b2;
    }

    private static int d() {
        Integer num;
        String str = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str) && (num = f3963f.get(str.toLowerCase(Locale.US))) != null) {
            return num.intValue();
        }
        return 7;
    }

    private v.d.C0096d.a.b.C0098a e() {
        v.d.C0096d.a.b.C0098a.C0099a a2 = v.d.C0096d.a.b.C0098a.a();
        a2.b(0);
        a2.d(0);
        a2.c(this.c.f3903d);
        a2.e(this.c.b);
        return a2.a();
    }

    private w<v.d.C0096d.a.b.C0098a> f() {
        return w.d(e());
    }

    private v.d.C0096d.a g(int i2, e eVar, Thread thread, int i3, int i4, boolean z) {
        Boolean bool;
        ActivityManager.RunningAppProcessInfo k2 = h.k(this.c.f3903d, this.a);
        if (k2 != null) {
            bool = Boolean.valueOf(k2.importance != 100);
        } else {
            bool = null;
        }
        v.d.C0096d.a.C0097a a2 = v.d.C0096d.a.a();
        a2.b(bool);
        a2.e(i2);
        a2.d(k(eVar, thread, i3, i4, z));
        return a2.a();
    }

    private v.d.C0096d.c h(int i2) {
        e a2 = e.a(this.a);
        Float b2 = a2.b();
        Double valueOf = b2 != null ? Double.valueOf(b2.doubleValue()) : null;
        int c2 = a2.c();
        boolean q = h.q(this.a);
        long v = h.v() - h.a(this.a);
        long b3 = h.b(Environment.getDataDirectory().getPath());
        v.d.C0096d.c.a a3 = v.d.C0096d.c.a();
        a3.b(valueOf);
        a3.c(c2);
        a3.f(q);
        a3.e(i2);
        a3.g(v);
        a3.d(b3);
        return a3.a();
    }

    private v.d.C0096d.a.b.c i(e eVar, int i2, int i3) {
        return j(eVar, i2, i3, 0);
    }

    private v.d.C0096d.a.b.c j(e eVar, int i2, int i3, int i4) {
        String str = eVar.b;
        String str2 = eVar.a;
        StackTraceElement[] stackTraceElementArr = eVar.c;
        int i5 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        e eVar2 = eVar.f4149d;
        if (i4 >= i3) {
            e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f4149d;
                i5++;
            }
        }
        v.d.C0096d.a.b.c.C0101a a2 = v.d.C0096d.a.b.c.a();
        a2.f(str);
        a2.e(str2);
        a2.c(w.a(m(stackTraceElementArr, i2)));
        a2.d(i5);
        if (eVar2 != null && i5 == 0) {
            a2.b(j(eVar2, i2, i3, i4 + 1));
        }
        return a2.a();
    }

    private v.d.C0096d.a.b k(e eVar, Thread thread, int i2, int i3, boolean z) {
        v.d.C0096d.a.b.C0100b a2 = v.d.C0096d.a.b.a();
        a2.e(u(eVar, thread, i2, z));
        a2.c(i(eVar, i2, i3));
        a2.d(r());
        a2.b(f());
        return a2.a();
    }

    private v.d.C0096d.a.b.e.C0105b l(StackTraceElement stackTraceElement, v.d.C0096d.a.b.e.C0105b.C0106a aVar) {
        long j2 = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max((long) stackTraceElement.getLineNumber(), 0) : 0;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j2 = (long) stackTraceElement.getLineNumber();
        }
        aVar.e(max);
        aVar.f(str);
        aVar.b(fileName);
        aVar.d(j2);
        return aVar.a();
    }

    private w<v.d.C0096d.a.b.e.C0105b> m(StackTraceElement[] stackTraceElementArr, int i2) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement l2 : stackTraceElementArr) {
            v.d.C0096d.a.b.e.C0105b.C0106a a2 = v.d.C0096d.a.b.e.C0105b.a();
            a2.c(i2);
            arrayList.add(l(l2, a2));
        }
        return w.a(arrayList);
    }

    private v.d.a n() {
        v.d.a.C0095a a2 = v.d.a.a();
        a2.c(this.b.d());
        a2.e(this.c.f3904e);
        a2.b(this.c.f3905f);
        a2.d(this.b.a());
        return a2.a();
    }

    private v.d o(String str, long j2) {
        v.d.b a2 = v.d.a();
        a2.l(j2);
        a2.i(str);
        a2.g(f3962e);
        a2.b(n());
        a2.k(q());
        a2.d(p());
        a2.h(3);
        return a2.a();
    }

    private v.d.c p() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int d2 = d();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long v = h.v();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean B = h.B(this.a);
        int n2 = h.n(this.a);
        String str = Build.MANUFACTURER;
        String str2 = Build.PRODUCT;
        v.d.c.a a2 = v.d.c.a();
        a2.b(d2);
        a2.f(Build.MODEL);
        a2.c(availableProcessors);
        a2.h(v);
        a2.d(blockCount);
        a2.i(B);
        a2.j(n2);
        a2.e(str);
        a2.g(str2);
        return a2.a();
    }

    private v.d.e q() {
        v.d.e.a a2 = v.d.e.a();
        a2.d(3);
        a2.e(Build.VERSION.RELEASE);
        a2.b(Build.VERSION.CODENAME);
        a2.c(h.D(this.a));
        return a2.a();
    }

    private v.d.C0096d.a.b.C0102d r() {
        v.d.C0096d.a.b.C0102d.C0103a a2 = v.d.C0096d.a.b.C0102d.a();
        a2.d("0");
        a2.c("0");
        a2.b(0);
        return a2.a();
    }

    private v.d.C0096d.a.b.e s(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return t(thread, stackTraceElementArr, 0);
    }

    private v.d.C0096d.a.b.e t(Thread thread, StackTraceElement[] stackTraceElementArr, int i2) {
        v.d.C0096d.a.b.e.C0104a a2 = v.d.C0096d.a.b.e.a();
        a2.d(thread.getName());
        a2.c(i2);
        a2.b(w.a(m(stackTraceElementArr, i2)));
        return a2.a();
    }

    private w<v.d.C0096d.a.b.e> u(e eVar, Thread thread, int i2, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(t(thread, eVar.c, i2));
        if (z) {
            for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
                Thread thread2 = (Thread) next.getKey();
                if (!thread2.equals(thread)) {
                    arrayList.add(s(thread2, this.f3964d.a((StackTraceElement[]) next.getValue())));
                }
            }
        }
        return w.a(arrayList);
    }

    public v.d.C0096d b(Throwable th, Thread thread, String str, long j2, int i2, int i3, boolean z) {
        int i4 = this.a.getResources().getConfiguration().orientation;
        Throwable th2 = th;
        e eVar = new e(th, this.f3964d);
        v.d.C0096d.b a2 = v.d.C0096d.a();
        String str2 = str;
        a2.f(str);
        long j3 = j2;
        a2.e(j2);
        a2.b(g(i4, eVar, thread, i2, i3, z));
        a2.c(h(i4));
        return a2.a();
    }

    public v c(String str, long j2) {
        v.a a2 = a();
        a2.i(o(str, j2));
        return a2.a();
    }
}
