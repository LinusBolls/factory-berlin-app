package k.h0.i.i;

import java.lang.reflect.Method;
import kotlin.jvm.internal.k;

/* compiled from: CloseGuard.kt */
public final class h {

    /* renamed from: d  reason: collision with root package name */
    public static final a f10479d = new a((DefaultConstructorMarker) null);
    private final Method a;
    private final Method b;
    private final Method c;

    /* compiled from: CloseGuard.kt */
    public static final class a {
        private a() {
        }

        public final h a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", new Class[]{String.class});
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new h(method3, method, method2);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public h(Method method, Method method2, Method method3) {
        this.a = method;
        this.b = method2;
        this.c = method3;
    }

    public final Object a(String str) {
        k.f(str, "closer");
        Method method = this.a;
        if (method != null) {
            try {
                Object invoke = method.invoke((Object) null, new Object[0]);
                Method method2 = this.b;
                if (method2 != null) {
                    method2.invoke(invoke, new Object[]{str});
                    return invoke;
                }
                k.m();
                throw null;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.c;
            if (method != null) {
                method.invoke(obj, new Object[0]);
                return true;
            }
            k.m();
            throw null;
        } catch (Exception unused) {
            return false;
        }
    }
}
