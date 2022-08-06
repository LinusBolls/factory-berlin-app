package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.p0;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.b;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* compiled from: SavedStateViewModelFactory */
public final class k0 extends p0.c {

    /* renamed from: f  reason: collision with root package name */
    private static final Class<?>[] f1012f;

    /* renamed from: g  reason: collision with root package name */
    private static final Class<?>[] f1013g;
    private final Application a;
    private final p0.a b;
    private final Bundle c;

    /* renamed from: d  reason: collision with root package name */
    private final p f1014d;

    /* renamed from: e  reason: collision with root package name */
    private final SavedStateRegistry f1015e;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Class<?>[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.lifecycle.j0> r0 = androidx.lifecycle.j0.class
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.app.Application> r2 = android.app.Application.class
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r0
            f1012f = r1
            java.lang.Class[] r1 = new java.lang.Class[r2]
            r1[r3] = r0
            f1013g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.k0.<clinit>():void");
    }

    @SuppressLint({"LambdaLast"})
    public k0(Application application, b bVar, Bundle bundle) {
        this.f1015e = bVar.d();
        this.f1014d = bVar.a();
        this.c = bundle;
        this.a = application;
        this.b = p0.a.c(application);
    }

    private static <T> Constructor<T> d(Class<T> cls, Class<?>[] clsArr) {
        for (Constructor<T> constructor : cls.getConstructors()) {
            if (Arrays.equals(clsArr, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }

    public <T extends n0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* access modifiers changed from: package-private */
    public void b(n0 n0Var) {
        SavedStateHandleController.h(n0Var, this.f1015e, this.f1014d);
    }

    public <T extends n0> T c(String str, Class<T> cls) {
        Constructor<T> constructor;
        T t;
        boolean isAssignableFrom = a.class.isAssignableFrom(cls);
        if (isAssignableFrom) {
            constructor = d(cls, f1012f);
        } else {
            constructor = d(cls, f1013g);
        }
        if (constructor == null) {
            return this.b.a(cls);
        }
        SavedStateHandleController j2 = SavedStateHandleController.j(this.f1015e, this.f1014d, str, this.c);
        if (isAssignableFrom) {
            try {
                t = (n0) constructor.newInstance(new Object[]{this.a, j2.k()});
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Failed to access " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("A " + cls + " cannot be instantiated.", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("An exception happened in constructor of " + cls, e4.getCause());
            }
        } else {
            t = (n0) constructor.newInstance(new Object[]{j2.k()});
        }
        t.o("androidx.lifecycle.savedstate.vm.tag", j2);
        return t;
    }
}
