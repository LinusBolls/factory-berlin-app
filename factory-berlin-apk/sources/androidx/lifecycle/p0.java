package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ViewModelProvider */
public class p0 {
    private final b a;
    private final r0 b;

    /* compiled from: ViewModelProvider */
    public static class a extends d {
        private static a c;
        private Application b;

        public a(Application application) {
            this.b = application;
        }

        public static a c(Application application) {
            if (c == null) {
                c = new a(application);
            }
            return c;
        }

        public <T extends n0> T a(Class<T> cls) {
            if (!a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                return (n0) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this.b});
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InstantiationException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            }
        }
    }

    /* compiled from: ViewModelProvider */
    public interface b {
        <T extends n0> T a(Class<T> cls);
    }

    /* compiled from: ViewModelProvider */
    static abstract class c extends e implements b {
        c() {
        }

        public <T extends n0> T a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract <T extends n0> T c(String str, Class<T> cls);
    }

    /* compiled from: ViewModelProvider */
    public static class d implements b {
        private static d a;

        static d b() {
            if (a == null) {
                a = new d();
            }
            return a;
        }

        public <T extends n0> T a(Class<T> cls) {
            try {
                return (n0) cls.newInstance();
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            }
        }
    }

    /* compiled from: ViewModelProvider */
    static class e {
        e() {
        }

        /* access modifiers changed from: package-private */
        public void b(n0 n0Var) {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p0(androidx.lifecycle.s0 r3) {
        /*
            r2 = this;
            androidx.lifecycle.r0 r0 = r3.o()
            boolean r1 = r3 instanceof androidx.lifecycle.o
            if (r1 == 0) goto L_0x000f
            androidx.lifecycle.o r3 = (androidx.lifecycle.o) r3
            androidx.lifecycle.p0$b r3 = r3.i()
            goto L_0x0013
        L_0x000f:
            androidx.lifecycle.p0$d r3 = androidx.lifecycle.p0.d.b()
        L_0x0013:
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.p0.<init>(androidx.lifecycle.s0):void");
    }

    public <T extends n0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends n0> T b(String str, Class<T> cls) {
        T t;
        T b2 = this.b.b(str);
        if (cls.isInstance(b2)) {
            b bVar = this.a;
            if (bVar instanceof e) {
                ((e) bVar).b(b2);
            }
            return b2;
        }
        b bVar2 = this.a;
        if (bVar2 instanceof c) {
            t = ((c) bVar2).c(str, cls);
        } else {
            t = bVar2.a(cls);
        }
        this.b.d(str, t);
        return t;
    }

    public p0(r0 r0Var, b bVar) {
        this.a = bVar;
        this.b = r0Var;
    }
}
