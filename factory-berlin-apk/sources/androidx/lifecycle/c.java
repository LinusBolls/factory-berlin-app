package androidx.lifecycle;

import androidx.lifecycle.p;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ClassesInfoCache */
class c {
    static c c = new c();
    private final Map<Class<?>, a> a = new HashMap();
    private final Map<Class<?>, Boolean> b = new HashMap();

    /* compiled from: ClassesInfoCache */
    static class a {
        final Map<p.a, List<b>> a = new HashMap();
        final Map<b, p.a> b;

        a(Map<b, p.a> map) {
            this.b = map;
            for (Map.Entry next : map.entrySet()) {
                p.a aVar = (p.a) next.getValue();
                List list = this.a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.a.put(aVar, list);
                }
                list.add(next.getKey());
            }
        }

        private static void b(List<b> list, v vVar, p.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(vVar, aVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(v vVar, p.a aVar, Object obj) {
            b(this.a.get(aVar), vVar, aVar, obj);
            b(this.a.get(p.a.ON_ANY), vVar, aVar, obj);
        }
    }

    /* compiled from: ClassesInfoCache */
    static class b {
        final int a;
        final Method b;

        b(int i2, Method method) {
            this.a = i2;
            this.b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        public void a(v vVar, p.a aVar, Object obj) {
            try {
                int i2 = this.a;
                if (i2 == 0) {
                    this.b.invoke(obj, new Object[0]);
                } else if (i2 == 1) {
                    this.b.invoke(obj, new Object[]{vVar});
                } else if (i2 == 2) {
                    this.b.invoke(obj, new Object[]{vVar, aVar});
                }
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(e3);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a != bVar.a || !this.b.getName().equals(bVar.b.getName())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.a * 31) + this.b.getName().hashCode();
        }
    }

    c() {
    }

    private a a(Class<?> cls, Method[] methodArr) {
        int i2;
        a c2;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c2 = c(superclass)) == null)) {
            hashMap.putAll(c2.b);
        }
        for (Class c3 : cls.getInterfaces()) {
            for (Map.Entry next : c(c3).b.entrySet()) {
                e(hashMap, (b) next.getKey(), (p.a) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            g0 g0Var = (g0) method.getAnnotation(g0.class);
            if (g0Var != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else if (parameterTypes[0].isAssignableFrom(v.class)) {
                    i2 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                p.a value = g0Var.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(p.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == p.a.ON_ANY) {
                        i2 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new b(i2, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.a.put(cls, aVar);
        this.b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
        }
    }

    private void e(Map<b, p.a> map, b bVar, p.a aVar, Class<?> cls) {
        p.a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public a c(Class<?> cls) {
        a aVar = this.a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return a(cls, (Method[]) null);
    }

    /* access modifiers changed from: package-private */
    public boolean d(Class<?> cls) {
        Boolean bool = this.b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b2 = b(cls);
        for (Method annotation : b2) {
            if (((g0) annotation.getAnnotation(g0.class)) != null) {
                a(cls, b2);
                return true;
            }
        }
        this.b.put(cls, Boolean.FALSE);
        return false;
    }
}
