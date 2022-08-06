package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class v9 {
    private static final Logger a = Logger.getLogger(v9.class.getName());
    private static final Unsafe b = t();
    private static final Class<?> c = q5.c();

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f2586d = B(Long.TYPE);

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f2587e = B(Integer.TYPE);

    /* renamed from: f  reason: collision with root package name */
    private static final d f2588f;

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f2589g = E();

    /* renamed from: h  reason: collision with root package name */
    private static final boolean f2590h = A();

    /* renamed from: i  reason: collision with root package name */
    private static final long f2591i = ((long) n(byte[].class));

    /* renamed from: j  reason: collision with root package name */
    static final boolean f2592j = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
    static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j2) {
            if (v9.f2592j) {
                return v9.L(obj, j2);
            }
            return v9.M(obj, j2);
        }

        public final void b(Object obj, long j2, byte b) {
            if (v9.f2592j) {
                v9.u(obj, j2, b);
            } else {
                v9.y(obj, j2, b);
            }
        }

        public final void c(Object obj, long j2, double d2) {
            f(obj, j2, Double.doubleToLongBits(d2));
        }

        public final void d(Object obj, long j2, float f2) {
            e(obj, j2, Float.floatToIntBits(f2));
        }

        public final void g(Object obj, long j2, boolean z) {
            if (v9.f2592j) {
                v9.z(obj, j2, z);
            } else {
                v9.D(obj, j2, z);
            }
        }

        public final boolean h(Object obj, long j2) {
            if (v9.f2592j) {
                return v9.N(obj, j2);
            }
            return v9.O(obj, j2);
        }

        public final float i(Object obj, long j2) {
            return Float.intBitsToFloat(k(obj, j2));
        }

        public final double j(Object obj, long j2) {
            return Double.longBitsToDouble(l(obj, j2));
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j2) {
            return this.a.getByte(obj, j2);
        }

        public final void b(Object obj, long j2, byte b) {
            this.a.putByte(obj, j2, b);
        }

        public final void c(Object obj, long j2, double d2) {
            this.a.putDouble(obj, j2, d2);
        }

        public final void d(Object obj, long j2, float f2) {
            this.a.putFloat(obj, j2, f2);
        }

        public final void g(Object obj, long j2, boolean z) {
            this.a.putBoolean(obj, j2, z);
        }

        public final boolean h(Object obj, long j2) {
            return this.a.getBoolean(obj, j2);
        }

        public final float i(Object obj, long j2) {
            return this.a.getFloat(obj, j2);
        }

        public final double j(Object obj, long j2) {
            return this.a.getDouble(obj, j2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j2) {
            if (v9.f2592j) {
                return v9.L(obj, j2);
            }
            return v9.M(obj, j2);
        }

        public final void b(Object obj, long j2, byte b) {
            if (v9.f2592j) {
                v9.u(obj, j2, b);
            } else {
                v9.y(obj, j2, b);
            }
        }

        public final void c(Object obj, long j2, double d2) {
            f(obj, j2, Double.doubleToLongBits(d2));
        }

        public final void d(Object obj, long j2, float f2) {
            e(obj, j2, Float.floatToIntBits(f2));
        }

        public final void g(Object obj, long j2, boolean z) {
            if (v9.f2592j) {
                v9.z(obj, j2, z);
            } else {
                v9.D(obj, j2, z);
            }
        }

        public final boolean h(Object obj, long j2) {
            if (v9.f2592j) {
                return v9.N(obj, j2);
            }
            return v9.O(obj, j2);
        }

        public final float i(Object obj, long j2) {
            return Float.intBitsToFloat(k(obj, j2));
        }

        public final double j(Object obj, long j2) {
            return Double.longBitsToDouble(l(obj, j2));
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
    static abstract class d {
        Unsafe a;

        d(Unsafe unsafe) {
            this.a = unsafe;
        }

        public abstract byte a(Object obj, long j2);

        public abstract void b(Object obj, long j2, byte b);

        public abstract void c(Object obj, long j2, double d2);

        public abstract void d(Object obj, long j2, float f2);

        public final void e(Object obj, long j2, int i2) {
            this.a.putInt(obj, j2, i2);
        }

        public final void f(Object obj, long j2, long j3) {
            this.a.putLong(obj, j2, j3);
        }

        public abstract void g(Object obj, long j2, boolean z);

        public abstract boolean h(Object obj, long j2);

        public abstract float i(Object obj, long j2);

        public abstract double j(Object obj, long j2);

        public final int k(Object obj, long j2) {
            return this.a.getInt(obj, j2);
        }

        public final long l(Object obj, long j2) {
            return this.a.getLong(obj, j2);
        }
    }

    static {
        d dVar;
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        d dVar2 = null;
        if (b != null) {
            if (!q5.b()) {
                dVar2 = new b(b);
            } else if (f2586d) {
                dVar2 = new c(b);
            } else if (f2587e) {
                dVar2 = new a(b);
            }
        }
        f2588f = dVar2;
        n(cls6);
        s(cls6);
        n(cls5);
        s(cls5);
        n(cls4);
        s(cls4);
        n(cls3);
        s(cls3);
        n(cls2);
        s(cls2);
        n(cls);
        s(cls);
        Field G = G();
        if (!(G == null || (dVar = f2588f) == null)) {
            dVar.a.objectFieldOffset(G);
        }
    }

    private v9() {
    }

    private static boolean A() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls2.getMethod("getInt", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putInt", new Class[]{cls, Long.TYPE, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putLong", new Class[]{cls, Long.TYPE, Long.TYPE});
            cls2.getMethod("getObject", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putObject", new Class[]{cls, Long.TYPE, cls});
            if (q5.b()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putByte", new Class[]{cls, Long.TYPE, Byte.TYPE});
            cls2.getMethod("getBoolean", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putBoolean", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("getFloat", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putFloat", new Class[]{cls, Long.TYPE, Float.TYPE});
            cls2.getMethod("getDouble", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putDouble", new Class[]{cls, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean B(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!q5.b()) {
            return false;
        }
        try {
            Class<?> cls3 = c;
            cls3.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls3.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls3.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static double C(Object obj, long j2) {
        return f2588f.j(obj, j2);
    }

    /* access modifiers changed from: private */
    public static void D(Object obj, long j2, boolean z) {
        y(obj, j2, z ? (byte) 1 : 0);
    }

    private static boolean E() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("getLong", new Class[]{cls, Long.TYPE});
            if (G() == null) {
                return false;
            }
            if (q5.b()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{Long.TYPE});
            cls2.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls2.getMethod("getInt", new Class[]{Long.TYPE});
            cls2.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{Long.TYPE});
            cls2.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls2.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls2.getMethod("copyMemory", new Class[]{cls, Long.TYPE, cls, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    static Object F(Object obj, long j2) {
        return f2588f.a.getObject(obj, j2);
    }

    private static Field G() {
        Field d2;
        if (q5.b() && (d2 = d(Buffer.class, "effectiveDirectAddress")) != null) {
            return d2;
        }
        Field d3 = d(Buffer.class, "address");
        if (d3 == null || d3.getType() != Long.TYPE) {
            return null;
        }
        return d3;
    }

    /* access modifiers changed from: private */
    public static byte L(Object obj, long j2) {
        return (byte) (b(obj, -4 & j2) >>> ((int) (((~j2) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte M(Object obj, long j2) {
        return (byte) (b(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static boolean N(Object obj, long j2) {
        return L(obj, j2) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean O(Object obj, long j2) {
        return M(obj, j2) != 0;
    }

    static byte a(byte[] bArr, long j2) {
        return f2588f.a(bArr, f2591i + j2);
    }

    static int b(Object obj, long j2) {
        return f2588f.k(obj, j2);
    }

    static <T> T c(Class<T> cls) {
        try {
            return b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static Field d(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static void f(Object obj, long j2, double d2) {
        f2588f.c(obj, j2, d2);
    }

    static void g(Object obj, long j2, float f2) {
        f2588f.d(obj, j2, f2);
    }

    static void h(Object obj, long j2, int i2) {
        f2588f.e(obj, j2, i2);
    }

    static void i(Object obj, long j2, long j3) {
        f2588f.f(obj, j2, j3);
    }

    static void j(Object obj, long j2, Object obj2) {
        f2588f.a.putObject(obj, j2, obj2);
    }

    static void k(Object obj, long j2, boolean z) {
        f2588f.g(obj, j2, z);
    }

    static void l(byte[] bArr, long j2, byte b2) {
        f2588f.b(bArr, f2591i + j2, b2);
    }

    static boolean m() {
        return f2590h;
    }

    private static int n(Class<?> cls) {
        if (f2590h) {
            return f2588f.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static long o(Object obj, long j2) {
        return f2588f.l(obj, j2);
    }

    static boolean r() {
        return f2589g;
    }

    private static int s(Class<?> cls) {
        if (f2590h) {
            return f2588f.a.arrayIndexScale(cls);
        }
        return -1;
    }

    static Unsafe t() {
        try {
            return (Unsafe) AccessController.doPrivileged(new x9());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void u(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int b3 = b(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        h(obj, j3, ((255 & b2) << i2) | (b3 & (~(255 << i2))));
    }

    static boolean w(Object obj, long j2) {
        return f2588f.h(obj, j2);
    }

    static float x(Object obj, long j2) {
        return f2588f.i(obj, j2);
    }

    /* access modifiers changed from: private */
    public static void y(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = (((int) j2) & 3) << 3;
        h(obj, j3, ((255 & b2) << i2) | (b(obj, j3) & (~(255 << i2))));
    }

    /* access modifiers changed from: private */
    public static void z(Object obj, long j2, boolean z) {
        u(obj, j2, z ? (byte) 1 : 0);
    }
}
