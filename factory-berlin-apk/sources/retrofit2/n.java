package retrofit2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.c;
import retrofit2.f;

/* compiled from: Platform */
class n {
    private static final n a = e();

    /* compiled from: Platform */
    static class a extends n {

        /* renamed from: retrofit2.n$a$a  reason: collision with other inner class name */
        /* compiled from: Platform */
        static class C0810a implements Executor {

            /* renamed from: g  reason: collision with root package name */
            private final Handler f11816g = new Handler(Looper.getMainLooper());

            C0810a() {
            }

            public void execute(Runnable runnable) {
                this.f11816g.post(runnable);
            }
        }

        a() {
        }

        /* access modifiers changed from: package-private */
        public List<? extends c.a> a(Executor executor) {
            if (executor != null) {
                g gVar = new g(executor);
                if (Build.VERSION.SDK_INT < 24) {
                    return Collections.singletonList(gVar);
                }
                return Arrays.asList(new c.a[]{e.a, gVar});
            }
            throw new AssertionError();
        }

        public Executor b() {
            return new C0810a();
        }

        /* access modifiers changed from: package-private */
        public List<? extends f.a> c() {
            if (Build.VERSION.SDK_INT >= 24) {
                return Collections.singletonList(l.a);
            }
            return Collections.emptyList();
        }

        /* access modifiers changed from: package-private */
        public int d() {
            return Build.VERSION.SDK_INT >= 24 ? 1 : 0;
        }

        /* access modifiers changed from: package-private */
        @IgnoreJRERequirement
        public boolean h(Method method) {
            if (Build.VERSION.SDK_INT < 24) {
                return false;
            }
            return method.isDefault();
        }
    }

    @IgnoreJRERequirement
    /* compiled from: Platform */
    static class b extends n {
        b() {
        }

        /* access modifiers changed from: package-private */
        public List<? extends c.a> a(Executor executor) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(e.a);
            arrayList.add(new g(executor));
            return Collections.unmodifiableList(arrayList);
        }

        /* access modifiers changed from: package-private */
        public List<? extends f.a> c() {
            return Collections.singletonList(l.a);
        }

        /* access modifiers changed from: package-private */
        public int d() {
            return 1;
        }

        /* access modifiers changed from: package-private */
        public Object g(Method method, Class<?> cls, Object obj, Object... objArr) {
            Constructor<MethodHandles.Lookup> declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new Object[]{cls, -1}).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }

        /* access modifiers changed from: package-private */
        public boolean h(Method method) {
            return method.isDefault();
        }
    }

    n() {
    }

    private static n e() {
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new a();
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("java.util.Optional");
            return new b();
        } catch (ClassNotFoundException unused2) {
            return new n();
        }
    }

    static n f() {
        return a;
    }

    /* access modifiers changed from: package-private */
    public List<? extends c.a> a(Executor executor) {
        return Collections.singletonList(new g(executor));
    }

    /* access modifiers changed from: package-private */
    public Executor b() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public List<? extends f.a> c() {
        return Collections.emptyList();
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public Object g(Method method, Class<?> cls, Object obj, Object... objArr) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public boolean h(Method method) {
        return false;
    }
}
