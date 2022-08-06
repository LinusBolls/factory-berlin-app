package retrofit2.w.b;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.n;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import k.c0;
import k.e0;
import retrofit2.f;
import retrofit2.r;

/* compiled from: MoshiConverterFactory */
public final class a extends f.a {
    private final n a;
    private final boolean b;
    private final boolean c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11861d;

    private a(n nVar, boolean z, boolean z2, boolean z3) {
        this.a = nVar;
        this.b = z;
        this.c = z2;
        this.f11861d = z3;
    }

    public static a f(n nVar) {
        if (nVar != null) {
            return new a(nVar, false, false, false);
        }
        throw new NullPointerException("moshi == null");
    }

    private static Set<? extends Annotation> g(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(com.squareup.moshi.f.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.emptySet();
    }

    public f<?, c0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, r rVar) {
        JsonAdapter<T> e2 = this.a.e(type, g(annotationArr));
        if (this.b) {
            e2 = e2.e();
        }
        if (this.c) {
            e2 = e2.a();
        }
        if (this.f11861d) {
            e2 = e2.g();
        }
        return new b(e2);
    }

    public f<e0, ?> d(Type type, Annotation[] annotationArr, r rVar) {
        JsonAdapter<T> e2 = this.a.e(type, g(annotationArr));
        if (this.b) {
            e2 = e2.e();
        }
        if (this.c) {
            e2 = e2.a();
        }
        if (this.f11861d) {
            e2 = e2.g();
        }
        return new c(e2);
    }
}
