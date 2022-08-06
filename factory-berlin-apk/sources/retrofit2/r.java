package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import k.c0;
import k.e;
import k.e0;
import k.v;
import k.z;
import retrofit2.a;
import retrofit2.c;
import retrofit2.f;

/* compiled from: Retrofit */
public final class r {
    private final Map<Method, s<?>> a = new ConcurrentHashMap();
    final e.a b;
    final v c;

    /* renamed from: d  reason: collision with root package name */
    final List<f.a> f11846d;

    /* renamed from: e  reason: collision with root package name */
    final List<c.a> f11847e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f11848f;

    /* compiled from: Retrofit */
    class a implements InvocationHandler {
        private final n a = n.f();
        private final Object[] b = new Object[0];
        final /* synthetic */ Class c;

        a(Class cls) {
            this.c = cls;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (this.a.h(method)) {
                return this.a.g(method, this.c, obj, objArr);
            }
            s<?> d2 = r.this.d(method);
            if (objArr == null) {
                objArr = this.b;
            }
            return d2.a(objArr);
        }
    }

    r(e.a aVar, v vVar, List<f.a> list, List<c.a> list2, Executor executor, boolean z) {
        this.b = aVar;
        this.c = vVar;
        this.f11846d = list;
        this.f11847e = list2;
        this.f11848f = z;
    }

    private void c(Class<?> cls) {
        n f2 = n.f();
        for (Method method : cls.getDeclaredMethods()) {
            if (!f2.h(method) && !Modifier.isStatic(method.getModifiers())) {
                d(method);
            }
        }
    }

    public c<?, ?> a(Type type, Annotation[] annotationArr) {
        return e((c.a) null, type, annotationArr);
    }

    public <T> T b(Class<T> cls) {
        v.v(cls);
        if (this.f11848f) {
            c(cls);
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    /* access modifiers changed from: package-private */
    public s<?> d(Method method) {
        s<?> sVar;
        s<?> sVar2 = this.a.get(method);
        if (sVar2 != null) {
            return sVar2;
        }
        synchronized (this.a) {
            sVar = this.a.get(method);
            if (sVar == null) {
                sVar = s.b(this, method);
                this.a.put(method, sVar);
            }
        }
        return sVar;
    }

    public c<?, ?> e(c.a aVar, Type type, Annotation[] annotationArr) {
        v.b(type, "returnType == null");
        v.b(annotationArr, "annotations == null");
        int indexOf = this.f11847e.indexOf(aVar) + 1;
        int size = this.f11847e.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            c<?, ?> a2 = this.f11847e.get(i2).a(type, annotationArr, this);
            if (a2 != null) {
                return a2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i3 = 0; i3 < indexOf; i3++) {
                sb.append("\n   * ");
                sb.append(this.f11847e.get(i3).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f11847e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f11847e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> f<T, c0> f(f.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        v.b(type, "type == null");
        v.b(annotationArr, "parameterAnnotations == null");
        v.b(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f11846d.indexOf(aVar) + 1;
        int size = this.f11846d.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            f<?, c0> c2 = this.f11846d.get(i2).c(type, annotationArr, annotationArr2, this);
            if (c2 != null) {
                return c2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i3 = 0; i3 < indexOf; i3++) {
                sb.append("\n   * ");
                sb.append(this.f11846d.get(i3).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f11846d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f11846d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> f<e0, T> g(f.a aVar, Type type, Annotation[] annotationArr) {
        v.b(type, "type == null");
        v.b(annotationArr, "annotations == null");
        int indexOf = this.f11846d.indexOf(aVar) + 1;
        int size = this.f11846d.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            f<e0, ?> d2 = this.f11846d.get(i2).d(type, annotationArr, this);
            if (d2 != null) {
                return d2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i3 = 0; i3 < indexOf; i3++) {
                sb.append("\n   * ");
                sb.append(this.f11846d.get(i3).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f11846d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f11846d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> f<T, c0> h(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return f((f.a) null, type, annotationArr, annotationArr2);
    }

    public <T> f<e0, T> i(Type type, Annotation[] annotationArr) {
        return g((f.a) null, type, annotationArr);
    }

    public <T> f<T, String> j(Type type, Annotation[] annotationArr) {
        v.b(type, "type == null");
        v.b(annotationArr, "annotations == null");
        int size = this.f11846d.size();
        for (int i2 = 0; i2 < size; i2++) {
            f<?, String> e2 = this.f11846d.get(i2).e(type, annotationArr, this);
            if (e2 != null) {
                return e2;
            }
        }
        return a.d.a;
    }

    /* compiled from: Retrofit */
    public static final class b {
        private final n a;
        private e.a b;
        private v c;

        /* renamed from: d  reason: collision with root package name */
        private final List<f.a> f11850d;

        /* renamed from: e  reason: collision with root package name */
        private final List<c.a> f11851e;

        /* renamed from: f  reason: collision with root package name */
        private Executor f11852f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f11853g;

        b(n nVar) {
            this.f11850d = new ArrayList();
            this.f11851e = new ArrayList();
            this.a = nVar;
        }

        public b a(f.a aVar) {
            List<f.a> list = this.f11850d;
            v.b(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(String str) {
            v.b(str, "baseUrl == null");
            c(v.h(str));
            return this;
        }

        public b c(v vVar) {
            v.b(vVar, "baseUrl == null");
            List<String> n2 = vVar.n();
            if ("".equals(n2.get(n2.size() - 1))) {
                this.c = vVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + vVar);
        }

        public r d() {
            if (this.c != null) {
                e.a aVar = this.b;
                if (aVar == null) {
                    aVar = new z();
                }
                e.a aVar2 = aVar;
                Executor executor = this.f11852f;
                if (executor == null) {
                    executor = this.a.b();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f11851e);
                arrayList.addAll(this.a.a(executor2));
                ArrayList arrayList2 = new ArrayList(this.f11850d.size() + 1 + this.a.d());
                arrayList2.add(new a());
                arrayList2.addAll(this.f11850d);
                arrayList2.addAll(this.a.c());
                return new r(aVar2, this.c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.f11853g);
            }
            throw new IllegalStateException("Base URL required.");
        }

        public b e(e.a aVar) {
            v.b(aVar, "factory == null");
            this.b = aVar;
            return this;
        }

        public b f(Executor executor) {
            v.b(executor, "executor == null");
            this.f11852f = executor;
            return this;
        }

        public b g(z zVar) {
            v.b(zVar, "client == null");
            e(zVar);
            return this;
        }

        public b() {
            this(n.f());
        }
    }
}
