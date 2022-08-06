package kotlin.c0.j.a;

import java.lang.reflect.Method;
import kotlin.jvm.internal.k;

/* compiled from: DebugMetadata.kt */
final class i {
    private static final a a = new a((Method) null, (Method) null, (Method) null);
    public static a b;
    public static final i c = new i();

    /* compiled from: DebugMetadata.kt */
    private static final class a {
        public final Method a;
        public final Method b;
        public final Method c;

        public a(Method method, Method method2, Method method3) {
            this.a = method;
            this.b = method2;
            this.c = method3;
        }
    }

    private i() {
    }

    private final a a(a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            b = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = a;
            b = aVar3;
            return aVar3;
        }
    }

    public final String b(a aVar) {
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        k.e(aVar, "continuation");
        a aVar2 = b;
        if (aVar2 == null) {
            aVar2 = a(aVar);
        }
        Object obj = null;
        if (aVar2 == a || (method = aVar2.a) == null || (invoke = method.invoke(aVar.getClass(), new Object[0])) == null || (method2 = aVar2.b) == null || (invoke2 = method2.invoke(invoke, new Object[0])) == null) {
            return null;
        }
        Method method3 = aVar2.c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            obj = invoke3;
        }
        return (String) obj;
    }
}
