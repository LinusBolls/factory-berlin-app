package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import k.d0;
import k.e;
import k.e0;
import kotlin.c0.d;
import retrofit2.v;

/* compiled from: HttpServiceMethod */
abstract class h<ResponseT, ReturnT> extends s<ReturnT> {
    private final p a;
    private final e.a b;
    private final f<e0, ResponseT> c;

    /* compiled from: HttpServiceMethod */
    static final class a<ResponseT, ReturnT> extends h<ResponseT, ReturnT> {

        /* renamed from: d  reason: collision with root package name */
        private final c<ResponseT, ReturnT> f11786d;

        a(p pVar, e.a aVar, f<e0, ResponseT> fVar, c<ResponseT, ReturnT> cVar) {
            super(pVar, aVar, fVar);
            this.f11786d = cVar;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [retrofit2.b, retrofit2.b<ResponseT>] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ReturnT c(retrofit2.b<ResponseT> r1, java.lang.Object[] r2) {
            /*
                r0 = this;
                retrofit2.c<ResponseT, ReturnT> r2 = r0.f11786d
                java.lang.Object r1 = r2.b(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: retrofit2.h.a.c(retrofit2.b, java.lang.Object[]):java.lang.Object");
        }
    }

    /* compiled from: HttpServiceMethod */
    static final class b<ResponseT> extends h<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        private final c<ResponseT, b<ResponseT>> f11787d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f11788e;

        b(p pVar, e.a aVar, f<e0, ResponseT> fVar, c<ResponseT, b<ResponseT>> cVar, boolean z) {
            super(pVar, aVar, fVar);
            this.f11787d = cVar;
            this.f11788e = z;
        }

        /* access modifiers changed from: protected */
        public Object c(b<ResponseT> bVar, Object[] objArr) {
            b bVar2 = (b) this.f11787d.b(bVar);
            d dVar = objArr[objArr.length - 1];
            try {
                if (this.f11788e) {
                    return j.b(bVar2, dVar);
                }
                return j.a(bVar2, dVar);
            } catch (Exception e2) {
                return j.d(e2, dVar);
            }
        }
    }

    /* compiled from: HttpServiceMethod */
    static final class c<ResponseT> extends h<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        private final c<ResponseT, b<ResponseT>> f11789d;

        c(p pVar, e.a aVar, f<e0, ResponseT> fVar, c<ResponseT, b<ResponseT>> cVar) {
            super(pVar, aVar, fVar);
            this.f11789d = cVar;
        }

        /* access modifiers changed from: protected */
        public Object c(b<ResponseT> bVar, Object[] objArr) {
            b bVar2 = (b) this.f11789d.b(bVar);
            d dVar = objArr[objArr.length - 1];
            try {
                return j.c(bVar2, dVar);
            } catch (Exception e2) {
                return j.d(e2, dVar);
            }
        }
    }

    h(p pVar, e.a aVar, f<e0, ResponseT> fVar) {
        this.a = pVar;
        this.b = aVar;
        this.c = fVar;
    }

    private static <ResponseT, ReturnT> c<ResponseT, ReturnT> d(r rVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return rVar.a(type, annotationArr);
        } catch (RuntimeException e2) {
            throw v.o(method, e2, "Unable to create call adapter for %s", type);
        }
    }

    private static <ResponseT> f<e0, ResponseT> e(r rVar, Method method, Type type) {
        try {
            return rVar.i(type, method.getAnnotations());
        } catch (RuntimeException e2) {
            throw v.o(method, e2, "Unable to create converter for %s", type);
        }
    }

    static <ResponseT, ReturnT> h<ResponseT, ReturnT> f(r rVar, Method method, p pVar) {
        Type type;
        boolean z;
        Class<q> cls = q.class;
        boolean z2 = pVar.f11834k;
        Annotation[] annotations = method.getAnnotations();
        if (z2) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type g2 = v.g(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (v.i(g2) != cls || !(g2 instanceof ParameterizedType)) {
                z = false;
            } else {
                g2 = v.h(0, (ParameterizedType) g2);
                z = true;
            }
            type = new v.b((Type) null, b.class, g2);
            annotations = u.a(annotations);
        } else {
            type = method.getGenericReturnType();
            z = false;
        }
        c d2 = d(rVar, method, type, annotations);
        Type a2 = d2.a();
        if (a2 == d0.class) {
            throw v.n(method, "'" + v.i(a2).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        } else if (a2 == cls) {
            throw v.n(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        } else if (!pVar.c.equals("HEAD") || Void.class.equals(a2)) {
            f e2 = e(rVar, method, a2);
            e.a aVar = rVar.b;
            if (!z2) {
                return new a(pVar, aVar, e2, d2);
            }
            if (z) {
                return new c(pVar, aVar, e2, d2);
            }
            return new b(pVar, aVar, e2, d2, false);
        } else {
            throw v.n(method, "HEAD method must use Void as response type.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public final ReturnT a(Object[] objArr) {
        return c(new k(this.a, objArr, this.b, this.c), objArr);
    }

    /* access modifiers changed from: protected */
    public abstract ReturnT c(b<ResponseT> bVar, Object[] objArr);
}
