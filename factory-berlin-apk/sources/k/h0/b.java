package k.h0;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import k.c0;
import k.d0;
import k.e;
import k.e0;
import k.r;
import k.u;
import k.v;
import k.x;
import k.z;
import kotlin.TypeCastException;
import kotlin.a0.a0;
import kotlin.g0.c;
import kotlin.j0.d;
import kotlin.j0.f;
import kotlin.jvm.internal.k;
import l.b0;
import l.g;
import l.h;
import l.i;
import l.s;

/* compiled from: Util.kt */
public final class b {
    public static final byte[] a = new byte[0];
    public static final u b = u.f10524h.g(new String[0]);
    public static final e0 c = e0.b.g(e0.f10341h, a, (x) null, 1, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    private static final s f10362d = s.f11122j.d(i.f11104k.b("efbbbf"), i.f11104k.b("feff"), i.f11104k.b("fffe"), i.f11104k.b("0000ffff"), i.f11104k.b("ffff0000"));

    /* renamed from: e  reason: collision with root package name */
    public static final TimeZone f10363e;

    /* renamed from: f  reason: collision with root package name */
    private static final f f10364f = new f("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f10365g = z.class.desiredAssertionStatus();

    /* renamed from: h  reason: collision with root package name */
    public static final String f10366h;

    /* compiled from: Util.kt */
    public static final class a implements r.c {
        final /* synthetic */ r a;

        a(r rVar) {
            this.a = rVar;
        }

        public r a(e eVar) {
            k.f(eVar, "call");
            return this.a;
        }
    }

    /* renamed from: k.h0.b$b  reason: collision with other inner class name */
    /* compiled from: Util.kt */
    static final class C0738b implements ThreadFactory {
        final /* synthetic */ String a;
        final /* synthetic */ boolean b;

        C0738b(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.a);
            thread.setDaemon(this.b);
            return thread;
        }
    }

    static {
        c0.a.k(c0.a, a, (x) null, 0, 0, 7, (Object) null);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        if (timeZone != null) {
            f10363e = timeZone;
            String name = z.class.getName();
            k.b(name, "OkHttpClient::class.java.name");
            f10366h = q.i0(q.h0(name, "okhttp3."), "Client");
            return;
        }
        k.m();
        throw null;
    }

    public static final int A(String str, int i2) {
        k.f(str, "$this$indexOfNonWhitespace");
        int length = str.length();
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt != ' ' && charAt != 9) {
                return i2;
            }
            i2++;
        }
        return str.length();
    }

    public static final String[] B(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        k.f(strArr, "$this$intersect");
        k.f(strArr2, "other");
        k.f(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i2++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        kotlin.io.a.a(r0, (java.lang.Throwable) null);
        r3.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        kotlin.io.a.a(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r2 = kotlin.x.a;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0019 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean C(k.h0.h.b r3, java.io.File r4) {
        /*
            java.lang.String r0 = "$this$isCivilized"
            kotlin.jvm.internal.k.f(r3, r0)
            java.lang.String r0 = "file"
            kotlin.jvm.internal.k.f(r4, r0)
            l.z r0 = r3.c(r4)
            r1 = 0
            r3.a(r4)     // Catch:{  }
            r2 = 1
            kotlin.io.a.a(r0, r1)     // Catch:{ IOException -> 0x0019 }
            return r2
        L_0x0017:
            r3 = move-exception
            goto L_0x0023
        L_0x0019:
            kotlin.x r2 = kotlin.x.a     // Catch:{ all -> 0x0017 }
            kotlin.io.a.a(r0, r1)
            r3.a(r4)
            r3 = 0
            return r3
        L_0x0023:
            throw r3     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r4 = move-exception
            kotlin.io.a.a(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.b.C(k.h0.h.b, java.io.File):boolean");
    }

    public static final boolean D(Socket socket, h hVar) {
        int soTimeout;
        k.f(socket, "$this$isHealthy");
        k.f(hVar, "source");
        try {
            soTimeout = socket.getSoTimeout();
            socket.setSoTimeout(1);
            boolean z = !hVar.Q();
            socket.setSoTimeout(soTimeout);
            return z;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        } catch (Throwable th) {
            socket.setSoTimeout(soTimeout);
            throw th;
        }
    }

    public static final int E(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        char c3 = 'a';
        if ('a' > c2 || 'f' < c2) {
            c3 = 'A';
            if ('A' > c2 || 'F' < c2) {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    public static final Charset F(h hVar, Charset charset) {
        k.f(hVar, "$this$readBomAsCharset");
        k.f(charset, "default");
        int E0 = hVar.E0(f10362d);
        if (E0 == -1) {
            return charset;
        }
        if (E0 == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            k.b(charset2, "UTF_8");
            return charset2;
        } else if (E0 == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            k.b(charset3, "UTF_16BE");
            return charset3;
        } else if (E0 == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            k.b(charset4, "UTF_16LE");
            return charset4;
        } else if (E0 == 3) {
            return d.f10650e.a();
        } else {
            if (E0 == 4) {
                return d.f10650e.b();
            }
            throw new AssertionError();
        }
    }

    public static final int G(h hVar) {
        k.f(hVar, "$this$readMedium");
        return b(hVar.readByte(), 255) | (b(hVar.readByte(), 255) << 16) | (b(hVar.readByte(), 255) << 8);
    }

    public static final int H(l.f fVar, byte b2) {
        k.f(fVar, "$this$skipAll");
        int i2 = 0;
        while (!fVar.Q() && fVar.b0(0) == b2) {
            i2++;
            fVar.readByte();
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
        if (r5 == Long.MAX_VALUE) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
        r11.e().a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
        r11.e().d(r0 + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
        if (r5 != Long.MAX_VALUE) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0081, code lost:
        return r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean I(l.b0 r11, int r12, java.util.concurrent.TimeUnit r13) {
        /*
            java.lang.String r0 = "$this$skipAll"
            kotlin.jvm.internal.k.f(r11, r0)
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.k.f(r13, r0)
            long r0 = java.lang.System.nanoTime()
            l.c0 r2 = r11.e()
            boolean r2 = r2.e()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L_0x0027
            l.c0 r2 = r11.e()
            long r5 = r2.c()
            long r5 = r5 - r0
            goto L_0x0028
        L_0x0027:
            r5 = r3
        L_0x0028:
            l.c0 r2 = r11.e()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.d(r12)
            l.f r12 = new l.f     // Catch:{ InterruptedIOException -> 0x007a, all -> 0x0064 }
            r12.<init>()     // Catch:{ InterruptedIOException -> 0x007a, all -> 0x0064 }
        L_0x003e:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.g0(r12, r7)     // Catch:{ InterruptedIOException -> 0x007a, all -> 0x0064 }
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L_0x004e
            r12.h()     // Catch:{ InterruptedIOException -> 0x007a, all -> 0x0064 }
            goto L_0x003e
        L_0x004e:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x005b
        L_0x0053:
            l.c0 r11 = r11.e()
            r11.a()
            goto L_0x0081
        L_0x005b:
            l.c0 r11 = r11.e()
            long r0 = r0 + r5
            r11.d(r0)
            goto L_0x0081
        L_0x0064:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0071
            l.c0 r11 = r11.e()
            r11.a()
            goto L_0x0079
        L_0x0071:
            l.c0 r11 = r11.e()
            long r0 = r0 + r5
            r11.d(r0)
        L_0x0079:
            throw r12
        L_0x007a:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x005b
            goto L_0x0053
        L_0x0081:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.b.I(l.b0, int, java.util.concurrent.TimeUnit):boolean");
    }

    public static final ThreadFactory J(String str, boolean z) {
        k.f(str, "name");
        return new C0738b(str, z);
    }

    public static final List<okhttp3.internal.http2.b> K(u uVar) {
        k.f(uVar, "$this$toHeaderList");
        c i2 = f.i(0, uVar.size());
        ArrayList arrayList = new ArrayList(o.p(i2, 10));
        Iterator it = i2.iterator();
        while (it.hasNext()) {
            int c2 = ((a0) it).c();
            arrayList.add(new okhttp3.internal.http2.b(uVar.d(c2), uVar.j(c2)));
        }
        return arrayList;
    }

    public static final u L(List<okhttp3.internal.http2.b> list) {
        k.f(list, "$this$toHeaders");
        u.a aVar = new u.a();
        for (okhttp3.internal.http2.b next : list) {
            aVar.c(next.a().L(), next.b().L());
        }
        return aVar.e();
    }

    public static final String M(v vVar, boolean z) {
        String str;
        k.f(vVar, "$this$toHostHeader");
        if (q.I(vVar.i(), ":", false, 2, (Object) null)) {
            str = '[' + vVar.i() + ']';
        } else {
            str = vVar.i();
        }
        if (!z && vVar.o() == v.f10527l.c(vVar.s())) {
            return str;
        }
        return str + ':' + vVar.o();
    }

    public static /* synthetic */ String N(v vVar, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return M(vVar, z);
    }

    public static final <T> List<T> O(List<? extends T> list) {
        k.f(list, "$this$toImmutableList");
        List<T> unmodifiableList = Collections.unmodifiableList(v.T(list));
        k.b(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final <K, V> Map<K, V> P(Map<K, ? extends V> map) {
        k.f(map, "$this$toImmutableMap");
        if (map.isEmpty()) {
            return e0.e();
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        k.b(unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return unmodifiableMap;
    }

    public static final long Q(String str, long j2) {
        k.f(str, "$this$toLongOrDefault");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j2;
        }
    }

    public static final int R(String str, int i2) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > ((long) Integer.MAX_VALUE)) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i2;
    }

    public static final String S(String str, int i2, int i3) {
        k.f(str, "$this$trimSubstring");
        int w = w(str, i2, i3);
        String substring = str.substring(w, y(str, w, i3));
        k.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String T(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return S(str, i2, i3);
    }

    public static final Throwable U(Exception exc, List<? extends Exception> list) {
        k.f(exc, "$this$withSuppressed");
        k.f(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        for (Exception addSuppressed : list) {
            exc.addSuppressed(addSuppressed);
        }
        return exc;
    }

    public static final void V(g gVar, int i2) {
        k.f(gVar, "$this$writeMedium");
        gVar.R((i2 >>> 16) & 255);
        gVar.R((i2 >>> 8) & 255);
        gVar.R(i2 & 255);
    }

    public static final <E> void a(List<E> list, E e2) {
        k.f(list, "$this$addIfAbsent");
        if (!list.contains(e2)) {
            list.add(e2);
        }
    }

    public static final int b(byte b2, int i2) {
        return b2 & i2;
    }

    public static final int c(short s, int i2) {
        return s & i2;
    }

    public static final long d(int i2, long j2) {
        return ((long) i2) & j2;
    }

    public static final r.c e(r rVar) {
        k.f(rVar, "$this$asFactory");
        return new a(rVar);
    }

    public static final boolean f(String str) {
        k.f(str, "$this$canParseAsIpAddress");
        return f10364f.a(str);
    }

    public static final boolean g(v vVar, v vVar2) {
        k.f(vVar, "$this$canReuseConnectionFor");
        k.f(vVar2, "other");
        return k.a(vVar.i(), vVar2.i()) && vVar.o() == vVar2.o() && k.a(vVar.s(), vVar2.s());
    }

    public static final int h(String str, long j2, TimeUnit timeUnit) {
        k.f(str, "name");
        boolean z = true;
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j2);
                if (millis <= ((long) Integer.MAX_VALUE)) {
                    if (millis == 0 && i2 > 0) {
                        z = false;
                    }
                    if (z) {
                        return (int) millis;
                    }
                    throw new IllegalArgumentException((str + " too small.").toString());
                }
                throw new IllegalArgumentException((str + " too large.").toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException((str + " < 0").toString());
    }

    public static final void i(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void j(Closeable closeable) {
        k.f(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void k(Socket socket) {
        k.f(socket, "$this$closeQuietly");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            throw e3;
        } catch (Exception unused) {
        }
    }

    public static final String[] l(String[] strArr, String str) {
        k.f(strArr, "$this$concat");
        k.f(str, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        k.b(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[j.t(strArr2)] = str;
        if (strArr2 != null) {
            return strArr2;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
    }

    public static final int m(String str, char c2, int i2, int i3) {
        k.f(str, "$this$delimiterOffset");
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final int n(String str, String str2, int i2, int i3) {
        k.f(str, "$this$delimiterOffset");
        k.f(str2, "delimiters");
        while (i2 < i3) {
            if (q.H(str2, str.charAt(i2), false, 2, (Object) null)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static /* synthetic */ int o(String str, char c2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = str.length();
        }
        return m(str, c2, i2, i3);
    }

    public static final boolean p(b0 b0Var, int i2, TimeUnit timeUnit) {
        k.f(b0Var, "$this$discard");
        k.f(timeUnit, "timeUnit");
        try {
            return I(b0Var, i2, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String q(String str, Object... objArr) {
        k.f(str, "format");
        k.f(objArr, "args");
        kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.a;
        Locale locale = Locale.US;
        k.b(locale, "Locale.US");
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        k.b(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public static final boolean r(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        k.f(strArr, "$this$hasIntersection");
        k.f(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String compare : strArr2) {
                        if (comparator.compare(str, compare) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long s(d0 d0Var) {
        k.f(d0Var, "$this$headersContentLength");
        String a2 = d0Var.y().a("Content-Length");
        if (a2 != null) {
            return Q(a2, -1);
        }
        return -1;
    }

    @SafeVarargs
    public static final <T> List<T> t(T... tArr) {
        k.f(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(objArr, objArr.length)));
        k.b(unmodifiableList, "Collections.unmodifiable…sList(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int u(String[] strArr, String str, Comparator<String> comparator) {
        k.f(strArr, "$this$indexOf");
        k.f(str, "value");
        k.f(comparator, "comparator");
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (comparator.compare(strArr[i2], str) == 0) {
                return i2;
            }
        }
        return -1;
    }

    public static final int v(String str) {
        k.f(str, "$this$indexOfControlOrNonAscii");
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                return i2;
            }
        }
        return -1;
    }

    public static final int w(String str, int i2, int i3) {
        k.f(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static /* synthetic */ int x(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return w(str, i2, i3);
    }

    public static final int y(String str, int i2, int i3) {
        k.f(str, "$this$indexOfLastNonAsciiWhitespace");
        int i4 = i3 - 1;
        if (i4 >= i2) {
            while (true) {
                char charAt = str.charAt(i4);
                if (charAt == 9 || charAt == 10 || charAt == 12 || charAt == 13 || charAt == ' ') {
                    if (i4 == i2) {
                        break;
                    }
                    i4--;
                } else {
                    return i4 + 1;
                }
            }
        }
        return i2;
    }

    public static /* synthetic */ int z(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return y(str, i2, i3);
    }
}
