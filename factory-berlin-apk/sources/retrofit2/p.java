package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k.b0;
import k.u;
import k.v;
import k.x;
import k.y;
import kotlin.c0.d;
import retrofit2.m;
import retrofit2.x.b;
import retrofit2.x.c;
import retrofit2.x.e;
import retrofit2.x.f;
import retrofit2.x.g;
import retrofit2.x.h;
import retrofit2.x.i;
import retrofit2.x.j;
import retrofit2.x.k;
import retrofit2.x.l;
import retrofit2.x.m;
import retrofit2.x.n;
import retrofit2.x.o;
import retrofit2.x.q;
import retrofit2.x.r;
import retrofit2.x.s;

/* compiled from: RequestFactory */
final class p {
    private final Method a;
    private final v b;
    final String c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11827d;

    /* renamed from: e  reason: collision with root package name */
    private final u f11828e;

    /* renamed from: f  reason: collision with root package name */
    private final x f11829f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f11830g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f11831h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f11832i;

    /* renamed from: j  reason: collision with root package name */
    private final m<?>[] f11833j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f11834k;

    /* compiled from: RequestFactory */
    static final class a {
        private static final Pattern x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        private static final Pattern y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
        final r a;
        final Method b;
        final Annotation[] c;

        /* renamed from: d  reason: collision with root package name */
        final Annotation[][] f11835d;

        /* renamed from: e  reason: collision with root package name */
        final Type[] f11836e;

        /* renamed from: f  reason: collision with root package name */
        boolean f11837f;

        /* renamed from: g  reason: collision with root package name */
        boolean f11838g;

        /* renamed from: h  reason: collision with root package name */
        boolean f11839h;

        /* renamed from: i  reason: collision with root package name */
        boolean f11840i;

        /* renamed from: j  reason: collision with root package name */
        boolean f11841j;

        /* renamed from: k  reason: collision with root package name */
        boolean f11842k;

        /* renamed from: l  reason: collision with root package name */
        boolean f11843l;

        /* renamed from: m  reason: collision with root package name */
        boolean f11844m;

        /* renamed from: n  reason: collision with root package name */
        String f11845n;
        boolean o;
        boolean p;
        boolean q;
        String r;
        u s;
        x t;
        Set<String> u;
        m<?>[] v;
        boolean w;

        a(r rVar, Method method) {
            this.a = rVar;
            this.b = method;
            this.c = method.getAnnotations();
            this.f11836e = method.getGenericParameterTypes();
            this.f11835d = method.getParameterAnnotations();
        }

        private static Class<?> a(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            return Short.TYPE == cls ? Short.class : cls;
        }

        private u c(String[] strArr) {
            u.a aVar = new u.a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw v.n(this.b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.t = x.e(trim);
                    } catch (IllegalArgumentException e2) {
                        throw v.o(this.b, e2, "Malformed content type: %s", trim);
                    }
                } else {
                    aVar.a(substring, trim);
                }
            }
            return aVar.e();
        }

        private void d(String str, String str2, boolean z) {
            String str3 = this.f11845n;
            if (str3 == null) {
                this.f11845n = str;
                this.o = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (x.matcher(substring).find()) {
                            throw v.n(this.b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.r = str2;
                    this.u = h(str2);
                    return;
                }
                return;
            }
            throw v.n(this.b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        private void e(Annotation annotation) {
            if (annotation instanceof b) {
                d("DELETE", ((b) annotation).value(), false);
            } else if (annotation instanceof e) {
                d("GET", ((e) annotation).value(), false);
            } else if (annotation instanceof f) {
                d("HEAD", ((f) annotation).value(), false);
            } else if (annotation instanceof k) {
                d("PATCH", ((k) annotation).value(), true);
            } else if (annotation instanceof l) {
                d("POST", ((l) annotation).value(), true);
            } else if (annotation instanceof m) {
                d("PUT", ((m) annotation).value(), true);
            } else if (annotation instanceof j) {
                d("OPTIONS", ((j) annotation).value(), false);
            } else if (annotation instanceof g) {
                g gVar = (g) annotation;
                d(gVar.method(), gVar.path(), gVar.hasBody());
            } else if (annotation instanceof i) {
                String[] value = ((i) annotation).value();
                if (value.length != 0) {
                    this.s = c(value);
                    return;
                }
                throw v.n(this.b, "@Headers annotation is empty.", new Object[0]);
            }
        }

        private m<?> f(int i2, Type type, Annotation[] annotationArr, boolean z) {
            m<?> mVar;
            if (annotationArr != null) {
                mVar = null;
                for (Annotation g2 : annotationArr) {
                    m<?> g3 = g(i2, type, annotationArr, g2);
                    if (g3 != null) {
                        if (mVar == null) {
                            mVar = g3;
                        } else {
                            throw v.p(this.b, i2, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                    }
                }
            } else {
                mVar = null;
            }
            if (mVar != null) {
                return mVar;
            }
            if (z) {
                try {
                    if (v.i(type) == d.class) {
                        this.w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw v.p(this.b, i2, "No Retrofit annotation found.", new Object[0]);
        }

        private m<?> g(int i2, Type type, Annotation[] annotationArr, Annotation annotation) {
            Class<String> cls = String.class;
            Class<y.c> cls2 = y.c.class;
            if (annotation instanceof retrofit2.x.p) {
                j(i2, type);
                if (this.f11841j) {
                    throw v.p(this.b, i2, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f11842k) {
                    throw v.p(this.b, i2, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f11843l) {
                    throw v.p(this.b, i2, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f11844m) {
                    throw v.p(this.b, i2, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.r != null) {
                    this.f11840i = true;
                    retrofit2.x.p pVar = (retrofit2.x.p) annotation;
                    String value = pVar.value();
                    i(i2, value);
                    return new m.i(this.b, i2, value, this.a.j(type, annotationArr), pVar.encoded());
                } else {
                    throw v.p(this.b, i2, "@Path can only be used with relative url on @%s", this.f11845n);
                }
            } else if (annotation instanceof q) {
                j(i2, type);
                q qVar = (q) annotation;
                String value2 = qVar.value();
                boolean encoded = qVar.encoded();
                Class<?> i3 = v.i(type);
                this.f11841j = true;
                if (Iterable.class.isAssignableFrom(i3)) {
                    if (type instanceof ParameterizedType) {
                        return new m.j(value2, this.a.j(v.h(0, (ParameterizedType) type), annotationArr), encoded).c();
                    }
                    Method method = this.b;
                    throw v.p(method, i2, i3.getSimpleName() + " must include generic type (e.g., " + i3.getSimpleName() + "<String>)", new Object[0]);
                } else if (!i3.isArray()) {
                    return new m.j(value2, this.a.j(type, annotationArr), encoded);
                } else {
                    return new m.j(value2, this.a.j(a(i3.getComponentType()), annotationArr), encoded).b();
                }
            } else if (annotation instanceof s) {
                j(i2, type);
                boolean encoded2 = ((s) annotation).encoded();
                Class<?> i4 = v.i(type);
                this.f11842k = true;
                if (Iterable.class.isAssignableFrom(i4)) {
                    if (type instanceof ParameterizedType) {
                        return new m.l(this.a.j(v.h(0, (ParameterizedType) type), annotationArr), encoded2).c();
                    }
                    Method method2 = this.b;
                    throw v.p(method2, i2, i4.getSimpleName() + " must include generic type (e.g., " + i4.getSimpleName() + "<String>)", new Object[0]);
                } else if (!i4.isArray()) {
                    return new m.l(this.a.j(type, annotationArr), encoded2);
                } else {
                    return new m.l(this.a.j(a(i4.getComponentType()), annotationArr), encoded2).b();
                }
            } else if (annotation instanceof r) {
                j(i2, type);
                Class<?> i5 = v.i(type);
                this.f11843l = true;
                if (Map.class.isAssignableFrom(i5)) {
                    Type j2 = v.j(type, i5, Map.class);
                    if (j2 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) j2;
                        Type h2 = v.h(0, parameterizedType);
                        if (cls == h2) {
                            return new m.k(this.b, i2, this.a.j(v.h(1, parameterizedType), annotationArr), ((r) annotation).encoded());
                        }
                        Method method3 = this.b;
                        throw v.p(method3, i2, "@QueryMap keys must be of type String: " + h2, new Object[0]);
                    }
                    throw v.p(this.b, i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw v.p(this.b, i2, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof h) {
                j(i2, type);
                String value3 = ((h) annotation).value();
                Class<?> i6 = v.i(type);
                if (Iterable.class.isAssignableFrom(i6)) {
                    if (type instanceof ParameterizedType) {
                        return new m.f(value3, this.a.j(v.h(0, (ParameterizedType) type), annotationArr)).c();
                    }
                    Method method4 = this.b;
                    throw v.p(method4, i2, i6.getSimpleName() + " must include generic type (e.g., " + i6.getSimpleName() + "<String>)", new Object[0]);
                } else if (!i6.isArray()) {
                    return new m.f(value3, this.a.j(type, annotationArr));
                } else {
                    return new m.f(value3, this.a.j(a(i6.getComponentType()), annotationArr)).b();
                }
            } else if (annotation instanceof c) {
                j(i2, type);
                if (this.p) {
                    c cVar = (c) annotation;
                    String value4 = cVar.value();
                    boolean encoded3 = cVar.encoded();
                    this.f11837f = true;
                    Class<?> i7 = v.i(type);
                    if (Iterable.class.isAssignableFrom(i7)) {
                        if (type instanceof ParameterizedType) {
                            return new m.d(value4, this.a.j(v.h(0, (ParameterizedType) type), annotationArr), encoded3).c();
                        }
                        Method method5 = this.b;
                        throw v.p(method5, i2, i7.getSimpleName() + " must include generic type (e.g., " + i7.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!i7.isArray()) {
                        return new m.d(value4, this.a.j(type, annotationArr), encoded3);
                    } else {
                        return new m.d(value4, this.a.j(a(i7.getComponentType()), annotationArr), encoded3).b();
                    }
                } else {
                    throw v.p(this.b, i2, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof retrofit2.x.d) {
                j(i2, type);
                if (this.p) {
                    Class<?> i8 = v.i(type);
                    if (Map.class.isAssignableFrom(i8)) {
                        Type j3 = v.j(type, i8, Map.class);
                        if (j3 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType2 = (ParameterizedType) j3;
                            Type h3 = v.h(0, parameterizedType2);
                            if (cls == h3) {
                                f j4 = this.a.j(v.h(1, parameterizedType2), annotationArr);
                                this.f11837f = true;
                                return new m.e(this.b, i2, j4, ((retrofit2.x.d) annotation).encoded());
                            }
                            Method method6 = this.b;
                            throw v.p(method6, i2, "@FieldMap keys must be of type String: " + h3, new Object[0]);
                        }
                        throw v.p(this.b, i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw v.p(this.b, i2, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw v.p(this.b, i2, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof n) {
                j(i2, type);
                if (this.q) {
                    n nVar = (n) annotation;
                    this.f11838g = true;
                    String value5 = nVar.value();
                    Class<?> i9 = v.i(type);
                    if (!value5.isEmpty()) {
                        u i10 = u.i("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", nVar.encoding());
                        if (Iterable.class.isAssignableFrom(i9)) {
                            if (type instanceof ParameterizedType) {
                                Type h4 = v.h(0, (ParameterizedType) type);
                                if (!cls2.isAssignableFrom(v.i(h4))) {
                                    return new m.g(this.b, i2, i10, this.a.h(h4, annotationArr, this.c)).c();
                                }
                                throw v.p(this.b, i2, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                            }
                            Method method7 = this.b;
                            throw v.p(method7, i2, i9.getSimpleName() + " must include generic type (e.g., " + i9.getSimpleName() + "<String>)", new Object[0]);
                        } else if (i9.isArray()) {
                            Class<?> a2 = a(i9.getComponentType());
                            if (!cls2.isAssignableFrom(a2)) {
                                return new m.g(this.b, i2, i10, this.a.h(a2, annotationArr, this.c)).b();
                            }
                            throw v.p(this.b, i2, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        } else if (!cls2.isAssignableFrom(i9)) {
                            return new m.g(this.b, i2, i10, this.a.h(type, annotationArr, this.c));
                        } else {
                            throw v.p(this.b, i2, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                    } else if (Iterable.class.isAssignableFrom(i9)) {
                        if (!(type instanceof ParameterizedType)) {
                            Method method8 = this.b;
                            throw v.p(method8, i2, i9.getSimpleName() + " must include generic type (e.g., " + i9.getSimpleName() + "<String>)", new Object[0]);
                        } else if (cls2.isAssignableFrom(v.i(v.h(0, (ParameterizedType) type)))) {
                            return m.C0809m.a.c();
                        } else {
                            throw v.p(this.b, i2, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                    } else if (i9.isArray()) {
                        if (cls2.isAssignableFrom(i9.getComponentType())) {
                            return m.C0809m.a.b();
                        }
                        throw v.p(this.b, i2, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    } else if (cls2.isAssignableFrom(i9)) {
                        return m.C0809m.a;
                    } else {
                        throw v.p(this.b, i2, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                } else {
                    throw v.p(this.b, i2, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
            } else if (annotation instanceof o) {
                j(i2, type);
                if (this.q) {
                    this.f11838g = true;
                    Class<?> i11 = v.i(type);
                    if (Map.class.isAssignableFrom(i11)) {
                        Type j5 = v.j(type, i11, Map.class);
                        if (j5 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) j5;
                            Type h5 = v.h(0, parameterizedType3);
                            if (cls == h5) {
                                Type h6 = v.h(1, parameterizedType3);
                                if (!cls2.isAssignableFrom(v.i(h6))) {
                                    return new m.h(this.b, i2, this.a.h(h6, annotationArr, this.c), ((o) annotation).encoding());
                                }
                                throw v.p(this.b, i2, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            Method method9 = this.b;
                            throw v.p(method9, i2, "@PartMap keys must be of type String: " + h5, new Object[0]);
                        }
                        throw v.p(this.b, i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw v.p(this.b, i2, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw v.p(this.b, i2, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (!(annotation instanceof retrofit2.x.a)) {
                return null;
            } else {
                j(i2, type);
                if (this.p || this.q) {
                    throw v.p(this.b, i2, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.f11839h) {
                    try {
                        f h7 = this.a.h(type, annotationArr, this.c);
                        this.f11839h = true;
                        return new m.c(this.b, i2, h7);
                    } catch (RuntimeException e2) {
                        throw v.q(this.b, e2, i2, "Unable to create @Body converter for %s", type);
                    }
                } else {
                    throw v.p(this.b, i2, "Multiple @Body method annotations found.", new Object[0]);
                }
            }
        }

        static Set<String> h(String str) {
            Matcher matcher = x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private void i(int i2, String str) {
            if (!y.matcher(str).matches()) {
                throw v.p(this.b, i2, "@Path parameter name must match %s. Found: %s", x.pattern(), str);
            } else if (!this.u.contains(str)) {
                throw v.p(this.b, i2, "URL \"%s\" does not contain \"{%s}\".", this.r, str);
            }
        }

        private void j(int i2, Type type) {
            if (v.k(type)) {
                throw v.p(this.b, i2, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        /* access modifiers changed from: package-private */
        public p b() {
            for (Annotation e2 : this.c) {
                e(e2);
            }
            if (this.f11845n != null) {
                if (!this.o) {
                    if (this.q) {
                        throw v.n(this.b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (this.p) {
                        throw v.n(this.b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f11835d.length;
                this.v = new m[length];
                int i2 = length - 1;
                int i3 = 0;
                while (true) {
                    boolean z = true;
                    if (i3 >= length) {
                        break;
                    }
                    m<?>[] mVarArr = this.v;
                    Type type = this.f11836e[i3];
                    Annotation[] annotationArr = this.f11835d[i3];
                    if (i3 != i2) {
                        z = false;
                    }
                    mVarArr[i3] = f(i3, type, annotationArr, z);
                    i3++;
                }
                if (this.r == null && !this.f11844m) {
                    throw v.n(this.b, "Missing either @%s URL or @Url parameter.", this.f11845n);
                } else if (!this.p && !this.q && !this.o && this.f11839h) {
                    throw v.n(this.b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                } else if (this.p && !this.f11837f) {
                    throw v.n(this.b, "Form-encoded method must contain at least one @Field.", new Object[0]);
                } else if (!this.q || this.f11838g) {
                    return new p(this);
                } else {
                    throw v.n(this.b, "Multipart method must contain at least one @Part.", new Object[0]);
                }
            } else {
                throw v.n(this.b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }
    }

    p(a aVar) {
        this.a = aVar.b;
        this.b = aVar.a.c;
        this.c = aVar.f11845n;
        this.f11827d = aVar.r;
        this.f11828e = aVar.s;
        this.f11829f = aVar.t;
        this.f11830g = aVar.o;
        this.f11831h = aVar.p;
        this.f11832i = aVar.q;
        this.f11833j = aVar.v;
        this.f11834k = aVar.w;
    }

    static p b(r rVar, Method method) {
        return new a(rVar, method).b();
    }

    /* access modifiers changed from: package-private */
    public b0 a(Object[] objArr) {
        m<?>[] mVarArr = this.f11833j;
        int length = objArr.length;
        if (length == mVarArr.length) {
            o oVar = new o(this.c, this.b, this.f11827d, this.f11828e, this.f11829f, this.f11830g, this.f11831h, this.f11832i);
            if (this.f11834k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(objArr[i2]);
                mVarArr[i2].a(oVar, objArr[i2]);
            }
            b0.a i3 = oVar.i();
            i3.j(i.class, new i(this.a, arrayList));
            return i3.b();
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + mVarArr.length + ")");
    }
}
