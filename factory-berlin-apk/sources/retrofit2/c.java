package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: CallAdapter */
public interface c<R, T> {

    /* compiled from: CallAdapter */
    public static abstract class a {
        protected static Type b(int i2, ParameterizedType parameterizedType) {
            return v.h(i2, parameterizedType);
        }

        protected static Class<?> c(Type type) {
            return v.i(type);
        }

        public abstract c<?, ?> a(Type type, Annotation[] annotationArr, r rVar);
    }

    Type a();

    T b(b<R> bVar);
}
