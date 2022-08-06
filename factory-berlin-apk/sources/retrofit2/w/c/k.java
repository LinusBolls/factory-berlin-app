package retrofit2.w.c;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import k.c0;
import k.e0;
import retrofit2.f;
import retrofit2.r;

/* compiled from: ScalarsConverterFactory */
public final class k extends f.a {
    private k() {
    }

    public static k f() {
        return new k();
    }

    public f<?, c0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, r rVar) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return a.a;
        }
        return null;
    }

    public f<e0, ?> d(Type type, Annotation[] annotationArr, r rVar) {
        if (type == String.class) {
            return j.a;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return b.a;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return c.a;
        }
        if (type == Character.class || type == Character.TYPE) {
            return d.a;
        }
        if (type == Double.class || type == Double.TYPE) {
            return e.a;
        }
        if (type == Float.class || type == Float.TYPE) {
            return f.a;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return g.a;
        }
        if (type == Long.class || type == Long.TYPE) {
            return h.a;
        }
        if (type == Short.class || type == Short.TYPE) {
            return i.a;
        }
        return null;
    }
}
