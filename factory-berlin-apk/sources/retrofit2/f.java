package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import k.c0;
import k.e0;

/* compiled from: Converter */
public interface f<F, T> {

    /* compiled from: Converter */
    public static abstract class a {
        protected static Type a(int i2, ParameterizedType parameterizedType) {
            return v.h(i2, parameterizedType);
        }

        protected static Class<?> b(Type type) {
            return v.i(type);
        }

        public f<?, c0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, r rVar) {
            return null;
        }

        public f<e0, ?> d(Type type, Annotation[] annotationArr, r rVar) {
            return null;
        }

        public f<?, String> e(Type type, Annotation[] annotationArr, r rVar) {
            return null;
        }
    }

    T convert(F f2);
}
