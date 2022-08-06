package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.TypeCastException;
import kotlin.e0.c.l;
import kotlin.k;

/* compiled from: ExceptionsConstuctor.kt */
public final class g {
    private static final int a = d(Throwable.class, -1);
    private static final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    private static final WeakHashMap<Class<? extends Throwable>, l<Throwable, Throwable>> c = new WeakHashMap<>();

    /* compiled from: ExceptionsConstuctor.kt */
    public static final class a extends kotlin.jvm.internal.l implements l<Throwable, Throwable> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Constructor f11012h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Constructor constructor) {
            super(1);
            this.f11012h = constructor;
        }

        /* renamed from: a */
        public final Throwable o(Throwable th) {
            Object obj;
            try {
                k.a aVar = k.f10687h;
                Object newInstance = this.f11012h.newInstance(new Object[]{th.getMessage(), th});
                if (newInstance != null) {
                    obj = (Throwable) newInstance;
                    k.a(obj);
                    if (k.e(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                k.a aVar2 = k.f10687h;
                obj = kotlin.l.a(th2);
                k.a(obj);
            }
        }
    }

    /* compiled from: ExceptionsConstuctor.kt */
    public static final class b extends kotlin.jvm.internal.l implements l<Throwable, Throwable> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Constructor f11013h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Constructor constructor) {
            super(1);
            this.f11013h = constructor;
        }

        /* renamed from: a */
        public final Throwable o(Throwable th) {
            Object obj;
            try {
                k.a aVar = k.f10687h;
                Object newInstance = this.f11013h.newInstance(new Object[]{th});
                if (newInstance != null) {
                    obj = (Throwable) newInstance;
                    k.a(obj);
                    if (k.e(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                k.a aVar2 = k.f10687h;
                obj = kotlin.l.a(th2);
                k.a(obj);
            }
        }
    }

    /* compiled from: ExceptionsConstuctor.kt */
    public static final class c extends kotlin.jvm.internal.l implements l<Throwable, Throwable> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Constructor f11014h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Constructor constructor) {
            super(1);
            this.f11014h = constructor;
        }

        /* renamed from: a */
        public final Throwable o(Throwable th) {
            Throwable th2;
            try {
                k.a aVar = k.f10687h;
                Object newInstance = this.f11014h.newInstance(new Object[]{th.getMessage()});
                if (newInstance != null) {
                    Throwable th3 = (Throwable) newInstance;
                    th3.initCause(th);
                    k.a(th3);
                    th2 = th3;
                    boolean e2 = k.e(th2);
                    Throwable th4 = th2;
                    if (e2) {
                        th4 = null;
                    }
                    return th4;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th5) {
                k.a aVar2 = k.f10687h;
                Object a = kotlin.l.a(th5);
                k.a(a);
                th2 = a;
            }
        }
    }

    /* compiled from: ExceptionsConstuctor.kt */
    public static final class d extends kotlin.jvm.internal.l implements l<Throwable, Throwable> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Constructor f11015h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Constructor constructor) {
            super(1);
            this.f11015h = constructor;
        }

        /* renamed from: a */
        public final Throwable o(Throwable th) {
            Throwable th2;
            try {
                k.a aVar = k.f10687h;
                Object newInstance = this.f11015h.newInstance(new Object[0]);
                if (newInstance != null) {
                    Throwable th3 = (Throwable) newInstance;
                    th3.initCause(th);
                    k.a(th3);
                    th2 = th3;
                    boolean e2 = k.e(th2);
                    Throwable th4 = th2;
                    if (e2) {
                        th4 = null;
                    }
                    return th4;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th5) {
                k.a aVar2 = k.f10687h;
                Object a = kotlin.l.a(th5);
                k.a(a);
                th2 = a;
            }
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class e<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return b.c(Integer.valueOf(((Constructor) t2).getParameterTypes().length), Integer.valueOf(((Constructor) t).getParameterTypes().length));
        }
    }

    /* compiled from: ExceptionsConstuctor.kt */
    static final class f extends kotlin.jvm.internal.l implements l {

        /* renamed from: h  reason: collision with root package name */
        public static final f f11016h = new f();

        f() {
            super(1);
        }

        /* renamed from: a */
        public final Void o(Throwable th) {
            return null;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.g$g  reason: collision with other inner class name */
    /* compiled from: ExceptionsConstuctor.kt */
    static final class C0778g extends kotlin.jvm.internal.l implements l {

        /* renamed from: h  reason: collision with root package name */
        public static final C0778g f11017h = new C0778g();

        C0778g() {
            super(1);
        }

        /* renamed from: a */
        public final Void o(Throwable th) {
            return null;
        }
    }

    private static final l<Throwable, Throwable> a(Constructor<?> constructor) {
        Class<String> cls = String.class;
        Class[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new d(constructor);
        }
        if (length == 1) {
            Class cls2 = parameterTypes[0];
            if (kotlin.jvm.internal.k.a(cls2, Throwable.class)) {
                return new b(constructor);
            }
            if (kotlin.jvm.internal.k.a(cls2, cls)) {
                return new c(constructor);
            }
        } else if (length == 2 && kotlin.jvm.internal.k.a(parameterTypes[0], cls) && kotlin.jvm.internal.k.a(parameterTypes[1], Throwable.class)) {
            return new a(constructor);
        }
        return null;
    }

    private static final int b(Class<?> cls, int i2) {
        Class<? super Object> superclass;
        do {
            Field[] declaredFields = r5.getDeclaredFields();
            int length = declaredFields.length;
            int i3 = 0;
            Class<? super Object> cls2 = cls;
            for (int i4 = 0; i4 < length; i4++) {
                if (!Modifier.isStatic(declaredFields[i4].getModifiers())) {
                    i3++;
                }
            }
            i2 += i3;
            superclass = cls2.getSuperclass();
            cls2 = superclass;
        } while (superclass != null);
        return i2;
    }

    static /* synthetic */ int c(Class cls, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return b(cls, i2);
    }

    private static final int d(Class<?> cls, int i2) {
        Integer num;
        kotlin.e0.a.c(cls);
        try {
            k.a aVar = k.f10687h;
            num = Integer.valueOf(c(cls, 0, 1, (Object) null));
            k.a(num);
        } catch (Throwable th) {
            k.a aVar2 = k.f10687h;
            num = kotlin.l.a(th);
            k.a(num);
        }
        Integer valueOf = Integer.valueOf(i2);
        if (k.e(num)) {
            num = valueOf;
        }
        return ((Number) num).intValue();
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static final <E extends java.lang.Throwable> E e(E r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.b0
            r1 = 0
            if (r0 == 0) goto L_0x0026
            kotlin.k$a r0 = kotlin.k.f10687h     // Catch:{ all -> 0x0011 }
            kotlinx.coroutines.b0 r9 = (kotlinx.coroutines.b0) r9     // Catch:{ all -> 0x0011 }
            java.lang.Throwable r9 = r9.a()     // Catch:{ all -> 0x0011 }
            kotlin.k.a(r9)     // Catch:{ all -> 0x0011 }
            goto L_0x001b
        L_0x0011:
            r9 = move-exception
            kotlin.k$a r0 = kotlin.k.f10687h
            java.lang.Object r9 = kotlin.l.a(r9)
            kotlin.k.a(r9)
        L_0x001b:
            boolean r0 = kotlin.k.e(r9)
            if (r0 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r1 = r9
        L_0x0023:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            return r1
        L_0x0026:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.e0.c.l<java.lang.Throwable, java.lang.Throwable>> r2 = c     // Catch:{ all -> 0x0119 }
            java.lang.Class r3 = r9.getClass()     // Catch:{ all -> 0x0119 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0119 }
            kotlin.e0.c.l r2 = (kotlin.e0.c.l) r2     // Catch:{ all -> 0x0119 }
            r0.unlock()
            if (r2 == 0) goto L_0x0047
            java.lang.Object r9 = r2.o(r9)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            return r9
        L_0x0047:
            int r0 = a
            java.lang.Class r2 = r9.getClass()
            r3 = 0
            int r2 = d(r2, r3)
            if (r0 == r2) goto L_0x009c
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            int r4 = r0.getWriteHoldCount()
            if (r4 != 0) goto L_0x0065
            int r4 = r0.getReadHoldCount()
            goto L_0x0066
        L_0x0065:
            r4 = 0
        L_0x0066:
            r5 = 0
        L_0x0067:
            if (r5 >= r4) goto L_0x006f
            r2.unlock()
            int r5 = r5 + 1
            goto L_0x0067
        L_0x006f:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.e0.c.l<java.lang.Throwable, java.lang.Throwable>> r5 = c     // Catch:{ all -> 0x008f }
            java.lang.Class r9 = r9.getClass()     // Catch:{ all -> 0x008f }
            kotlinx.coroutines.internal.g$f r6 = kotlinx.coroutines.internal.g.f.f11016h     // Catch:{ all -> 0x008f }
            r5.put(r9, r6)     // Catch:{ all -> 0x008f }
            kotlin.x r9 = kotlin.x.a     // Catch:{ all -> 0x008f }
        L_0x0083:
            if (r3 >= r4) goto L_0x008b
            r2.lock()
            int r3 = r3 + 1
            goto L_0x0083
        L_0x008b:
            r0.unlock()
            return r1
        L_0x008f:
            r9 = move-exception
        L_0x0090:
            if (r3 >= r4) goto L_0x0098
            r2.lock()
            int r3 = r3 + 1
            goto L_0x0090
        L_0x0098:
            r0.unlock()
            throw r9
        L_0x009c:
            java.lang.Class r0 = r9.getClass()
            java.lang.reflect.Constructor[] r0 = r0.getConstructors()
            kotlinx.coroutines.internal.g$e r2 = new kotlinx.coroutines.internal.g$e
            r2.<init>()
            java.util.List r0 = kotlin.a0.j.D(r0, r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = r1
        L_0x00b2:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00c4
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            kotlin.e0.c.l r2 = a(r2)
            if (r2 == 0) goto L_0x00b2
        L_0x00c4:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r0.readLock()
            int r5 = r0.getWriteHoldCount()
            if (r5 != 0) goto L_0x00d5
            int r5 = r0.getReadHoldCount()
            goto L_0x00d6
        L_0x00d5:
            r5 = 0
        L_0x00d6:
            r6 = 0
        L_0x00d7:
            if (r6 >= r5) goto L_0x00df
            r4.unlock()
            int r6 = r6 + 1
            goto L_0x00d7
        L_0x00df:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.e0.c.l<java.lang.Throwable, java.lang.Throwable>> r6 = c     // Catch:{ all -> 0x010c }
            java.lang.Class r7 = r9.getClass()     // Catch:{ all -> 0x010c }
            if (r2 == 0) goto L_0x00f0
            r8 = r2
            goto L_0x00f2
        L_0x00f0:
            kotlinx.coroutines.internal.g$g r8 = kotlinx.coroutines.internal.g.C0778g.f11017h     // Catch:{ all -> 0x010c }
        L_0x00f2:
            r6.put(r7, r8)     // Catch:{ all -> 0x010c }
            kotlin.x r6 = kotlin.x.a     // Catch:{ all -> 0x010c }
        L_0x00f7:
            if (r3 >= r5) goto L_0x00ff
            r4.lock()
            int r3 = r3 + 1
            goto L_0x00f7
        L_0x00ff:
            r0.unlock()
            if (r2 == 0) goto L_0x010b
            java.lang.Object r9 = r2.o(r9)
            r1 = r9
            java.lang.Throwable r1 = (java.lang.Throwable) r1
        L_0x010b:
            return r1
        L_0x010c:
            r9 = move-exception
        L_0x010d:
            if (r3 >= r5) goto L_0x0115
            r4.lock()
            int r3 = r3 + 1
            goto L_0x010d
        L_0x0115:
            r0.unlock()
            throw r9
        L_0x0119:
            r9 = move-exception
            r0.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.g.e(java.lang.Throwable):java.lang.Throwable");
    }
}
