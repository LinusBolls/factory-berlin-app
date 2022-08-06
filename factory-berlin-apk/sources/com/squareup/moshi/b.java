package com.squareup.moshi;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ClassFactory */
abstract class b<T> {

    /* compiled from: ClassFactory */
    class a extends b<T> {
        final /* synthetic */ Constructor a;
        final /* synthetic */ Class b;

        a(Constructor constructor, Class cls) {
            this.a = constructor;
            this.b = cls;
        }

        public T b() {
            return this.a.newInstance((Object[]) null);
        }

        public String toString() {
            return this.b.getName();
        }
    }

    /* renamed from: com.squareup.moshi.b$b  reason: collision with other inner class name */
    /* compiled from: ClassFactory */
    class C0545b extends b<T> {
        final /* synthetic */ Method a;
        final /* synthetic */ Object b;
        final /* synthetic */ Class c;

        C0545b(Method method, Object obj, Class cls) {
            this.a = method;
            this.b = obj;
            this.c = cls;
        }

        public T b() {
            return this.a.invoke(this.b, new Object[]{this.c});
        }

        public String toString() {
            return this.c.getName();
        }
    }

    /* compiled from: ClassFactory */
    class c extends b<T> {
        final /* synthetic */ Method a;
        final /* synthetic */ Class b;
        final /* synthetic */ int c;

        c(Method method, Class cls, int i2) {
            this.a = method;
            this.b = cls;
            this.c = i2;
        }

        public T b() {
            return this.a.invoke((Object) null, new Object[]{this.b, Integer.valueOf(this.c)});
        }

        public String toString() {
            return this.b.getName();
        }
    }

    /* compiled from: ClassFactory */
    class d extends b<T> {
        final /* synthetic */ Method a;
        final /* synthetic */ Class b;

        d(Method method, Class cls) {
            this.a = method;
            this.b = cls;
        }

        public T b() {
            return this.a.invoke((Object) null, new Object[]{this.b, Object.class});
        }

        public String toString() {
            return this.b.getName();
        }
    }

    b() {
    }

    public static <T> b<T> a(Class<?> cls) {
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return new a(declaredConstructor, cls);
        } catch (NoSuchMethodException unused) {
            try {
                Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                Field declaredField = cls2.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                return new C0545b(cls2.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null), cls);
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                    declaredMethod2.setAccessible(true);
                    return new c(declaredMethod2, cls, intValue);
                } catch (IllegalAccessException unused4) {
                    throw new AssertionError();
                } catch (InvocationTargetException e2) {
                    com.squareup.moshi.internal.a.r(e2);
                    throw null;
                } catch (NoSuchMethodException unused5) {
                    try {
                        Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                        declaredMethod3.setAccessible(true);
                        return new d(declaredMethod3, cls);
                    } catch (Exception unused6) {
                        throw new IllegalArgumentException("cannot construct instances of " + cls.getName());
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract T b();
}
