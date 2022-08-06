package com.google.firebase.crashlytics.d.n;

import android.app.ActivityManager;
import com.google.firebase.crashlytics.d.b;
import com.google.firebase.crashlytics.d.r.e;
import java.util.List;
import java.util.Map;

/* compiled from: SessionProtobufHelper */
public class d {
    private static final a a = a.c("0");
    private static final a b = a.c("Unity");

    private static void A(c cVar, a aVar) {
        if (aVar != null) {
            cVar.f0(6, 2);
            cVar.Z(h(aVar));
            cVar.J(1, aVar);
        }
    }

    public static void B(c cVar, String str, String str2, boolean z) {
        a c = a.c(str);
        a c2 = a.c(str2);
        cVar.f0(8, 2);
        cVar.Z(m(c, c2, z));
        cVar.L(1, 3);
        cVar.J(2, c);
        cVar.J(3, c2);
        cVar.G(4, z);
    }

    public static void C(c cVar, String str, String str2, String str3) {
        if (str == null) {
            str = "";
        }
        a c = a.c(str);
        a o = o(str2);
        a o2 = o(str3);
        int c2 = c.c(1, c) + 0;
        if (str2 != null) {
            c2 += c.c(2, o);
        }
        if (str3 != null) {
            c2 += c.c(3, o2);
        }
        cVar.f0(6, 2);
        cVar.Z(c2);
        cVar.J(1, c);
        if (str2 != null) {
            cVar.J(2, o);
        }
        if (str3 != null) {
            cVar.J(3, o2);
        }
    }

    private static void D(c cVar, Thread thread, StackTraceElement[] stackTraceElementArr, int i2, boolean z) {
        cVar.f0(1, 2);
        cVar.Z(n(thread, stackTraceElementArr, i2, z));
        cVar.J(1, a.c(thread.getName()));
        cVar.g0(2, i2);
        for (StackTraceElement q : stackTraceElementArr) {
            q(cVar, 3, q, z);
        }
    }

    private static int a(a aVar, a aVar2) {
        int y = c.y(1, 0) + 0 + c.y(2, 0) + c.c(3, aVar);
        return aVar2 != null ? y + c.c(4, aVar2) : y;
    }

    private static int b(String str, String str2) {
        int c = c.c(1, a.c(str));
        if (str2 == null) {
            str2 = "";
        }
        return c + c.c(2, a.c(str2));
    }

    private static int c(e eVar, int i2, int i3) {
        int i4 = 0;
        int c = c.c(1, a.c(eVar.b)) + 0;
        String str = eVar.a;
        if (str != null) {
            c += c.c(3, a.c(str));
        }
        for (StackTraceElement i5 : eVar.c) {
            int i6 = i(i5, true);
            c += c.r(4) + c.m(i6) + i6;
        }
        e eVar2 = eVar.f4149d;
        if (eVar2 == null) {
            return c;
        }
        if (i2 < i3) {
            int c2 = c(eVar2, i2 + 1, i3);
            return c + c.r(6) + c.m(c2) + c2;
        }
        while (eVar2 != null) {
            eVar2 = eVar2.f4149d;
            i4++;
        }
        return c + c.w(7, i4);
    }

    private static int d() {
        return c.c(1, a) + 0 + c.c(2, a) + c.y(3, 0);
    }

    private static int e(e eVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i2, a aVar, a aVar2) {
        int n2 = n(thread, stackTraceElementArr, 4, true);
        int r = c.r(1) + c.m(n2) + n2 + 0;
        int length = threadArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            int n3 = n(threadArr[i3], list.get(i3), 0, false);
            r += c.r(1) + c.m(n3) + n3;
        }
        int c = c(eVar, 1, i2);
        int d2 = d();
        int a2 = a(aVar, aVar2);
        return r + c.r(2) + c.m(c) + c + c.r(3) + c.m(d2) + d2 + c.r(3) + c.m(a2) + a2;
    }

    private static int f(e eVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i2, a aVar, a aVar2, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i3) {
        int e2 = e(eVar, thread, stackTraceElementArr, threadArr, list, i2, aVar, aVar2);
        boolean z = true;
        int r = c.r(1) + c.m(e2) + e2 + 0;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                int b2 = b((String) next.getKey(), (String) next.getValue());
                r += c.r(2) + c.m(b2) + b2;
            }
        }
        if (runningAppProcessInfo != null) {
            if (runningAppProcessInfo.importance == 100) {
                z = false;
            }
            r += c.a(3, z);
        }
        return r + c.w(4, i3);
    }

    private static int g(Float f2, int i2, boolean z, int i3, long j2, long j3) {
        int i4 = 0;
        if (f2 != null) {
            i4 = 0 + c.j(1, f2.floatValue());
        }
        return i4 + c.o(2, i2) + c.a(3, z) + c.w(4, i3) + c.y(5, j2) + c.y(6, j3);
    }

    private static int h(a aVar) {
        return c.c(1, aVar);
    }

    private static int i(StackTraceElement stackTraceElement, boolean z) {
        int i2;
        int i3 = 0;
        if (stackTraceElement.isNativeMethod()) {
            i2 = c.y(1, (long) Math.max(stackTraceElement.getLineNumber(), 0));
        } else {
            i2 = c.y(1, 0);
        }
        int c = i2 + 0 + c.c(2, a.c(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName()));
        if (stackTraceElement.getFileName() != null) {
            c += c.c(3, a.c(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            c += c.y(4, (long) stackTraceElement.getLineNumber());
        }
        if (z) {
            i3 = 2;
        }
        return c + c.w(5, i3);
    }

    private static int j(a aVar, a aVar2, a aVar3, a aVar4, int i2, a aVar5) {
        int c = c.c(1, aVar) + 0 + c.c(2, aVar2) + c.c(3, aVar3) + c.c(6, aVar4);
        if (aVar5 != null) {
            c = c + c.c(8, b) + c.c(9, aVar5);
        }
        return c + c.h(10, i2);
    }

    private static int k(int i2, a aVar, int i3, long j2, long j3, boolean z, int i4, a aVar2, a aVar3) {
        int i5;
        int i6;
        int i7 = 0;
        int h2 = c.h(3, i2) + 0;
        if (aVar == null) {
            i5 = 0;
        } else {
            i5 = c.c(4, aVar);
        }
        int w = h2 + i5 + c.w(5, i3) + c.y(6, j2) + c.y(7, j3) + c.a(10, z) + c.w(12, i4);
        if (aVar2 == null) {
            i6 = 0;
        } else {
            i6 = c.c(13, aVar2);
        }
        int i8 = w + i6;
        if (aVar3 != null) {
            i7 = c.c(14, aVar3);
        }
        return i8 + i7;
    }

    private static int l(long j2, String str, e eVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i2, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i3, a aVar, a aVar2, Float f2, int i4, boolean z, long j3, long j4, a aVar3) {
        long j5 = j2;
        int y = c.y(1, j2) + 0 + c.c(2, a.c(str));
        int f3 = f(eVar, thread, stackTraceElementArr, threadArr, list, i2, aVar, aVar2, map, runningAppProcessInfo, i3);
        int g2 = g(f2, i4, z, i3, j3, j4);
        int r = y + c.r(3) + c.m(f3) + f3 + c.r(5) + c.m(g2) + g2;
        if (aVar3 == null) {
            return r;
        }
        int h2 = h(aVar3);
        return r + c.r(6) + c.m(h2) + h2;
    }

    private static int m(a aVar, a aVar2, boolean z) {
        return c.h(1, 3) + 0 + c.c(2, aVar) + c.c(3, aVar2) + c.a(4, z);
    }

    private static int n(Thread thread, StackTraceElement[] stackTraceElementArr, int i2, boolean z) {
        int c = c.c(1, a.c(thread.getName())) + c.w(2, i2);
        for (StackTraceElement i3 : stackTraceElementArr) {
            int i4 = i(i3, z);
            c += c.r(3) + c.m(i4) + i4;
        }
        return c;
    }

    private static a o(String str) {
        if (str == null) {
            return null;
        }
        return a.c(str);
    }

    public static void p(c cVar, String str, String str2, long j2) {
        cVar.J(1, a.c(str2));
        cVar.J(2, a.c(str));
        cVar.i0(3, j2);
    }

    private static void q(c cVar, int i2, StackTraceElement stackTraceElement, boolean z) {
        cVar.f0(i2, 2);
        cVar.Z(i(stackTraceElement, z));
        int i3 = 0;
        if (stackTraceElement.isNativeMethod()) {
            cVar.i0(1, (long) Math.max(stackTraceElement.getLineNumber(), 0));
        } else {
            cVar.i0(1, 0);
        }
        cVar.J(2, a.c(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName()));
        if (stackTraceElement.getFileName() != null) {
            cVar.J(3, a.c(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            cVar.i0(4, (long) stackTraceElement.getLineNumber());
        }
        if (z) {
            i3 = 4;
        }
        cVar.g0(5, i3);
    }

    public static void r(c cVar, String str, String str2, String str3, String str4, int i2, String str5) {
        a c = a.c(str);
        a c2 = a.c(str2);
        a c3 = a.c(str3);
        a c4 = a.c(str4);
        a c5 = str5 != null ? a.c(str5) : null;
        cVar.f0(7, 2);
        cVar.Z(j(c, c2, c3, c4, i2, c5));
        cVar.J(1, c);
        cVar.J(2, c2);
        cVar.J(3, c3);
        cVar.J(6, c4);
        if (c5 != null) {
            cVar.J(8, b);
            cVar.J(9, c5);
        }
        cVar.L(10, i2);
    }

    public static void s(c cVar, String str) {
        a c = a.c(str);
        cVar.f0(7, 2);
        int c2 = c.c(2, c);
        cVar.Z(c.r(5) + c.m(c2) + c2);
        cVar.f0(5, 2);
        cVar.Z(c2);
        cVar.J(2, c);
    }

    public static void t(c cVar, int i2, String str, int i3, long j2, long j3, boolean z, int i4, String str2, String str3) {
        c cVar2 = cVar;
        a o = o(str);
        a o2 = o(str3);
        a o3 = o(str2);
        cVar.f0(9, 2);
        cVar.Z(k(i2, o, i3, j2, j3, z, i4, o3, o2));
        cVar.L(3, i2);
        cVar.J(4, o);
        cVar.g0(5, i3);
        cVar.i0(6, j2);
        cVar.i0(7, j3);
        cVar.G(10, z);
        cVar.g0(12, i4);
        if (o3 != null) {
            cVar.J(13, o3);
        }
        if (o2 != null) {
            cVar.J(14, o2);
        }
    }

    public static void u(c cVar, long j2, String str, e eVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i2, Map<String, String> map, byte[] bArr, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i3, String str2, String str3, Float f2, int i4, boolean z, long j3, long j4) {
        a aVar;
        c cVar2 = cVar;
        String str4 = str3;
        a c = a.c(str2);
        a aVar2 = null;
        if (str4 == null) {
            aVar = null;
        } else {
            aVar = a.c(str4.replace("-", ""));
        }
        if (bArr != null) {
            aVar2 = a.a(bArr);
        } else {
            b.f().b("No log data to include with this event.");
        }
        a aVar3 = aVar2;
        cVar2.f0(10, 2);
        cVar2.Z(l(j2, str, eVar, thread, stackTraceElementArr, threadArr, list, i2, map, runningAppProcessInfo, i3, c, aVar, f2, i4, z, j3, j4, aVar3));
        cVar2.i0(1, j2);
        cVar2.J(2, a.c(str));
        v(cVar, eVar, thread, stackTraceElementArr, threadArr, list, i2, c, aVar, map, runningAppProcessInfo, i3);
        z(cVar, f2, i4, z, i3, j3, j4);
        A(cVar2, aVar3);
    }

    private static void v(c cVar, e eVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i2, a aVar, a aVar2, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i3) {
        cVar.f0(3, 2);
        cVar.Z(f(eVar, thread, stackTraceElementArr, threadArr, list, i2, aVar, aVar2, map, runningAppProcessInfo, i3));
        x(cVar, eVar, thread, stackTraceElementArr, threadArr, list, i2, aVar, aVar2);
        if (map != null && !map.isEmpty()) {
            w(cVar, map);
        }
        if (runningAppProcessInfo != null) {
            cVar.G(3, runningAppProcessInfo.importance != 100);
        }
        cVar.g0(4, i3);
    }

    private static void w(c cVar, Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            cVar.f0(2, 2);
            cVar.Z(b((String) next.getKey(), (String) next.getValue()));
            cVar.J(1, a.c((String) next.getKey()));
            String str = (String) next.getValue();
            if (str == null) {
                str = "";
            }
            cVar.J(2, a.c(str));
        }
    }

    private static void x(c cVar, e eVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i2, a aVar, a aVar2) {
        cVar.f0(1, 2);
        cVar.Z(e(eVar, thread, stackTraceElementArr, threadArr, list, i2, aVar, aVar2));
        D(cVar, thread, stackTraceElementArr, 4, true);
        int length = threadArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            D(cVar, threadArr[i3], list.get(i3), 0, false);
        }
        y(cVar, eVar, 1, i2, 2);
        cVar.f0(3, 2);
        cVar.Z(d());
        cVar.J(1, a);
        cVar.J(2, a);
        cVar.i0(3, 0);
        cVar.f0(4, 2);
        cVar.Z(a(aVar, aVar2));
        cVar.i0(1, 0);
        cVar.i0(2, 0);
        cVar.J(3, aVar);
        if (aVar2 != null) {
            cVar.J(4, aVar2);
        }
    }

    private static void y(c cVar, e eVar, int i2, int i3, int i4) {
        cVar.f0(i4, 2);
        cVar.Z(c(eVar, 1, i3));
        cVar.J(1, a.c(eVar.b));
        String str = eVar.a;
        if (str != null) {
            cVar.J(3, a.c(str));
        }
        int i5 = 0;
        for (StackTraceElement q : eVar.c) {
            q(cVar, 4, q, true);
        }
        e eVar2 = eVar.f4149d;
        if (eVar2 == null) {
            return;
        }
        if (i2 < i3) {
            y(cVar, eVar2, i2 + 1, i3, 6);
            return;
        }
        while (eVar2 != null) {
            eVar2 = eVar2.f4149d;
            i5++;
        }
        cVar.g0(7, i5);
    }

    private static void z(c cVar, Float f2, int i2, boolean z, int i3, long j2, long j3) {
        cVar.f0(5, 2);
        cVar.Z(g(f2, i2, z, i3, j2, j3));
        if (f2 != null) {
            cVar.N(1, f2.floatValue());
        }
        cVar.c0(2, i2);
        cVar.G(3, z);
        cVar.g0(4, i3);
        cVar.i0(5, j2);
        cVar.i0(6, j3);
    }
}
