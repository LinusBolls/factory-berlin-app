package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* compiled from: ServiceMethod */
abstract class s<T> {
    s() {
    }

    static <T> s<T> b(r rVar, Method method) {
        p b = p.b(rVar, method);
        Type genericReturnType = method.getGenericReturnType();
        if (v.k(genericReturnType)) {
            throw v.n(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        } else if (genericReturnType != Void.TYPE) {
            return h.f(rVar, method, b);
        } else {
            throw v.n(method, "Service methods cannot return void.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract T a(Object[] objArr);
}
