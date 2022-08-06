package kotlinx.coroutines.internal;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;

/* compiled from: FastServiceLoader.kt */
public final class h {
    public static final h a = new h();

    private h() {
    }

    private final <S> S a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    private final <S> List<S> b(Class<S> cls, ClassLoader classLoader) {
        try {
            return d(cls, classLoader);
        } catch (Throwable unused) {
            return v.R(ServiceLoader.load(cls, classLoader));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        kotlin.io.a.a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        kotlin.b.a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0077, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0078, code lost:
        kotlin.io.a.a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007b, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<java.lang.String> e(java.net.URL r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "jar"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r1 = kotlin.j0.p.D(r0, r1, r2, r3, r4)
            if (r1 == 0) goto L_0x005d
            java.lang.String r6 = "jar:file:"
            java.lang.String r6 = kotlin.j0.q.w0(r0, r6, r4, r3, r4)
            r1 = 33
            java.lang.String r6 = kotlin.j0.q.B0(r6, r1, r4, r3, r4)
            java.lang.String r1 = "!/"
            java.lang.String r0 = kotlin.j0.q.w0(r0, r1, r4, r3, r4)
            java.util.jar.JarFile r1 = new java.util.jar.JarFile
            r1.<init>(r6, r2)
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ all -> 0x0051 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0051 }
            java.util.zip.ZipEntry r3 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0051 }
            r3.<init>(r0)     // Catch:{ all -> 0x0051 }
            java.io.InputStream r0 = r1.getInputStream(r3)     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "UTF-8"
            r2.<init>(r0, r3)     // Catch:{ all -> 0x0051 }
            r6.<init>(r2)     // Catch:{ all -> 0x0051 }
            kotlinx.coroutines.internal.h r0 = a     // Catch:{ all -> 0x004a }
            java.util.List r0 = r0.f(r6)     // Catch:{ all -> 0x004a }
            kotlin.io.a.a(r6, r4)     // Catch:{ all -> 0x0051 }
            r1.close()     // Catch:{ all -> 0x0048 }
            return r0
        L_0x0048:
            r6 = move-exception
            throw r6
        L_0x004a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r2 = move-exception
            kotlin.io.a.a(r6, r0)     // Catch:{ all -> 0x0051 }
            throw r2     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0058 }
            throw r0
        L_0x0058:
            r0 = move-exception
            kotlin.b.a(r6, r0)
            throw r6
        L_0x005d:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.InputStream r6 = r6.openStream()
            r1.<init>(r6)
            r0.<init>(r1)
            kotlinx.coroutines.internal.h r6 = a     // Catch:{ all -> 0x0075 }
            java.util.List r6 = r6.f(r0)     // Catch:{ all -> 0x0075 }
            kotlin.io.a.a(r0, r4)
            return r6
        L_0x0075:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r1 = move-exception
            kotlin.io.a.a(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.h.e(java.net.URL):java.util.List");
    }

    private final List<String> f(BufferedReader bufferedReader) {
        boolean z;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return v.R(linkedHashSet);
            }
            String C0 = q.C0(readLine, "#", (String) null, 2, (Object) null);
            if (C0 != null) {
                String obj = q.F0(C0).toString();
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= obj.length()) {
                        z = true;
                        break;
                    }
                    char charAt = obj.charAt(i2);
                    if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                        z = false;
                        break;
                    }
                    i2++;
                }
                if (z) {
                    if (obj.length() > 0) {
                        z2 = true;
                    }
                    if (z2) {
                        linkedHashSet.add(obj);
                    }
                } else {
                    throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }

    public final List<MainDispatcherFactory> c() {
        MainDispatcherFactory mainDispatcherFactory;
        Class<MainDispatcherFactory> cls = MainDispatcherFactory.class;
        if (!i.a()) {
            return b(cls, cls.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = cls.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory != null) {
                arrayList.add(mainDispatcherFactory);
            }
            try {
                mainDispatcherFactory2 = cls.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 == null) {
                return arrayList;
            }
            arrayList.add(mainDispatcherFactory2);
            return arrayList;
        } catch (Throwable unused3) {
            return b(cls, cls.getClassLoader());
        }
    }

    public final <S> List<S> d(Class<S> cls, ClassLoader classLoader) {
        ArrayList<T> list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        k.b(list, "java.util.Collections.list(this)");
        ArrayList arrayList = new ArrayList();
        for (T e2 : list) {
            boolean unused = s.s(arrayList, a.e(e2));
        }
        Set<String> V = v.V(arrayList);
        if (!V.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(o.p(V, 10));
            for (String a2 : V) {
                arrayList2.add(a.a(a2, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}
