package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.z6;
import com.google.android.gms.internal.measurement.z6.b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public abstract class z6<MessageType extends z6<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends k5<MessageType, BuilderType> {
    private static Map<Object, z6<?, ?>> zzd = new ConcurrentHashMap();
    protected s9 zzb = s9.a();
    private int zzc = -1;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
    public static class a<T extends z6<T, ?>> extends o5<T> {
        public a(T t) {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
    public static abstract class b<MessageType extends z6<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends m5<MessageType, BuilderType> {

        /* renamed from: g  reason: collision with root package name */
        private final MessageType f2646g;

        /* renamed from: h  reason: collision with root package name */
        protected MessageType f2647h;

        /* renamed from: i  reason: collision with root package name */
        protected boolean f2648i = false;

        protected b(MessageType messagetype) {
            this.f2646g = messagetype;
            this.f2647h = (z6) messagetype.r(e.f2649d, (Object) null, (Object) null);
        }

        private static void u(MessageType messagetype, MessageType messagetype2) {
            u8.a().c(messagetype).i(messagetype, messagetype2);
        }

        private final BuilderType v(byte[] bArr, int i2, int i3, m6 m6Var) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            try {
                u8.a().c(this.f2647h).g(this.f2647h, bArr, 0, i3, new s5(m6Var));
                return this;
            } catch (zzig e2) {
                throw e2;
            } catch (IndexOutOfBoundsException unused) {
                throw zzig.a();
            } catch (IOException e3) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
            }
        }

        public /* synthetic */ Object clone() {
            b bVar = (b) this.f2646g.r(e.f2650e, (Object) null, (Object) null);
            bVar.t((z6) o());
            return bVar;
        }

        public final boolean h() {
            return z6.v(this.f2647h, false);
        }

        public final /* synthetic */ j8 m() {
            return this.f2646g;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ m5 p(k5 k5Var) {
            t((z6) k5Var);
            return this;
        }

        public final /* synthetic */ m5 r(byte[] bArr, int i2, int i3) {
            v(bArr, 0, i3, m6.a());
            return this;
        }

        public final /* synthetic */ m5 s(byte[] bArr, int i2, int i3, m6 m6Var) {
            v(bArr, 0, i3, m6Var);
            return this;
        }

        public final BuilderType t(MessageType messagetype) {
            if (this.f2648i) {
                w();
                this.f2648i = false;
            }
            u(this.f2647h, messagetype);
            return this;
        }

        /* access modifiers changed from: protected */
        public void w() {
            MessageType messagetype = (z6) this.f2647h.r(e.f2649d, (Object) null, (Object) null);
            u(messagetype, this.f2647h);
            this.f2647h = messagetype;
        }

        /* renamed from: x */
        public MessageType o() {
            if (this.f2648i) {
                return this.f2647h;
            }
            MessageType messagetype = this.f2647h;
            u8.a().c(messagetype).e(messagetype);
            this.f2648i = true;
            return this.f2647h;
        }

        /* renamed from: y */
        public final MessageType l() {
            MessageType messagetype = (z6) o();
            if (messagetype.h()) {
                return messagetype;
            }
            throw new zzko(messagetype);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
    static final class c implements u6<c> {
        public final i8 N(i8 i8Var, j8 j8Var) {
            throw new NoSuchMethodError();
        }

        public final int b() {
            throw new NoSuchMethodError();
        }

        public final ha c() {
            throw new NoSuchMethodError();
        }

        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        public final ka d() {
            throw new NoSuchMethodError();
        }

        public final boolean e() {
            throw new NoSuchMethodError();
        }

        public final boolean g() {
            throw new NoSuchMethodError();
        }

        public final o8 r(o8 o8Var, o8 o8Var2) {
            throw new NoSuchMethodError();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends z6<MessageType, BuilderType> implements l8 {
        protected s6<c> zzc = s6.c();

        /* access modifiers changed from: package-private */
        public final s6<c> B() {
            if (this.zzc.o()) {
                this.zzc = (s6) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
    public static final class e {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f2649d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final int f2650e = 5;

        /* renamed from: f  reason: collision with root package name */
        public static final int f2651f = 6;

        /* renamed from: g  reason: collision with root package name */
        public static final int f2652g = 7;

        /* renamed from: h  reason: collision with root package name */
        private static final /* synthetic */ int[] f2653h = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: i  reason: collision with root package name */
        public static final int f2654i = 1;

        /* renamed from: j  reason: collision with root package name */
        public static final int f2655j = 2;

        /* renamed from: k  reason: collision with root package name */
        public static final int f2656k = 1;

        /* renamed from: l  reason: collision with root package name */
        public static final int f2657l = 2;

        public static int[] a() {
            return (int[]) f2653h.clone();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
    public static class f<ContainingType extends j8, Type> extends n6<ContainingType, Type> {
    }

    protected static <E> h7<E> A() {
        return x8.g();
    }

    static <T extends z6<?, ?>> T n(Class<T> cls) {
        T t = (z6) zzd.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (z6) zzd.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t == null) {
            t = (z6) ((z6) v9.c(cls)).r(e.f2651f, (Object) null, (Object) null);
            if (t != null) {
                zzd.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    protected static <E> h7<E> p(h7<E> h7Var) {
        int size = h7Var.size();
        return h7Var.f(size == 0 ? 10 : size << 1);
    }

    protected static i7 q(i7 i7Var) {
        int size = i7Var.size();
        return i7Var.G(size == 0 ? 10 : size << 1);
    }

    protected static Object s(j8 j8Var, String str, Object[] objArr) {
        return new w8(j8Var, str, objArr);
    }

    static Object t(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static <T extends z6<?, ?>> void u(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    protected static final <T extends z6<T, ?>> boolean v(T t, boolean z) {
        byte byteValue = ((Byte) t.r(e.a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c2 = u8.a().c(t).c(t);
        if (z) {
            t.r(e.b, c2 ? t : null, (Object) null);
        }
        return c2;
    }

    protected static f7 y() {
        return c7.e();
    }

    protected static i7 z() {
        return w7.e();
    }

    public final int d() {
        if (this.zzc == -1) {
            this.zzc = u8.a().c(this).f(this);
        }
        return this.zzc;
    }

    public final /* synthetic */ i8 e() {
        b bVar = (b) r(e.f2650e, (Object) null, (Object) null);
        bVar.t(this);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return u8.a().c(this).d(this, (z6) obj);
        }
        return false;
    }

    public final void f(zzhf zzhf) {
        u8.a().c(this).h(this, l6.P(zzhf));
    }

    public final /* synthetic */ i8 g() {
        return (b) r(e.f2650e, (Object) null, (Object) null);
    }

    public final boolean h() {
        return v(this, true);
    }

    public int hashCode() {
        int i2 = this.zza;
        if (i2 != 0) {
            return i2;
        }
        int a2 = u8.a().c(this).a(this);
        this.zza = a2;
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final int j() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final void k(int i2) {
        this.zzc = i2;
    }

    public final /* synthetic */ j8 m() {
        return (z6) r(e.f2651f, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract Object r(int i2, Object obj, Object obj2);

    public String toString() {
        return k8.a(this, super.toString());
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends z6<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType w() {
        return (b) r(e.f2650e, (Object) null, (Object) null);
    }

    public final BuilderType x() {
        BuilderType buildertype = (b) r(e.f2650e, (Object) null, (Object) null);
        buildertype.t(this);
        return buildertype;
    }
}
