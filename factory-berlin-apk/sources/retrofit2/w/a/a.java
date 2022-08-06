package retrofit2.w.a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import k.c0;
import k.e0;
import retrofit2.f;
import retrofit2.r;

/* compiled from: GsonConverterFactory */
public final class a extends f.a {
    private final com.google.gson.f a;

    private a(com.google.gson.f fVar) {
        this.a = fVar;
    }

    public static a f(com.google.gson.f fVar) {
        if (fVar != null) {
            return new a(fVar);
        }
        throw new NullPointerException("gson == null");
    }

    public f<?, c0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, r rVar) {
        return new b(this.a, this.a.k(com.google.gson.u.a.b(type)));
    }

    public f<e0, ?> d(Type type, Annotation[] annotationArr, r rVar) {
        return new c(this.a, this.a.k(com.google.gson.u.a.b(type)));
    }
}
