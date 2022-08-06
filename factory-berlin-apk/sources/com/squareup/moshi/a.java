package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.g;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: AdapterMethodsFactory */
final class a implements JsonAdapter.d {
    private final List<f> a;
    private final List<f> b;

    /* renamed from: com.squareup.moshi.a$a  reason: collision with other inner class name */
    /* compiled from: AdapterMethodsFactory */
    class C0544a extends JsonAdapter<Object> {
        final /* synthetic */ f a;
        final /* synthetic */ JsonAdapter b;
        final /* synthetic */ n c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f8090d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Set f8091e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Type f8092f;

        C0544a(a aVar, f fVar, JsonAdapter jsonAdapter, n nVar, f fVar2, Set set, Type type) {
            this.a = fVar;
            this.b = jsonAdapter;
            this.c = nVar;
            this.f8090d = fVar2;
            this.f8091e = set;
            this.f8092f = type;
        }

        public Object b(g gVar) {
            f fVar = this.f8090d;
            if (fVar == null) {
                return this.b.b(gVar);
            }
            if (fVar.f8106g || gVar.y() != g.c.NULL) {
                try {
                    return this.f8090d.b(this.c, gVar);
                } catch (InvocationTargetException e2) {
                    Throwable cause = e2.getCause();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    throw new JsonDataException(cause + " at " + gVar.getPath(), cause);
                }
            } else {
                gVar.B0();
                return null;
            }
        }

        public void h(l lVar, Object obj) {
            f fVar = this.a;
            if (fVar == null) {
                this.b.h(lVar, obj);
            } else if (fVar.f8106g || obj != null) {
                try {
                    this.a.e(this.c, lVar, obj);
                } catch (InvocationTargetException e2) {
                    Throwable cause = e2.getCause();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    throw new JsonDataException(cause + " at " + lVar.getPath(), cause);
                }
            } else {
                lVar.o();
            }
        }

        public String toString() {
            return "JsonAdapter" + this.f8091e + "(" + this.f8092f + ")";
        }
    }

    /* compiled from: AdapterMethodsFactory */
    class b extends f {
        b(Type type, Set set, Object obj, Method method, int i2, int i3, boolean z) {
            super(type, set, obj, method, i2, i3, z);
        }

        public void e(n nVar, l lVar, Object obj) {
            d(lVar, obj);
        }
    }

    /* compiled from: AdapterMethodsFactory */
    class c extends f {

        /* renamed from: h  reason: collision with root package name */
        private JsonAdapter<Object> f8093h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Type[] f8094i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Type f8095j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Set f8096k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Set f8097l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Type type, Set set, Object obj, Method method, int i2, int i3, boolean z, Type[] typeArr, Type type2, Set set2, Set set3) {
            super(type, set, obj, method, i2, i3, z);
            this.f8094i = typeArr;
            this.f8095j = type2;
            this.f8096k = set2;
            this.f8097l = set3;
        }

        public void a(n nVar, JsonAdapter.d dVar) {
            JsonAdapter<Object> jsonAdapter;
            super.a(nVar, dVar);
            if (!p.d(this.f8094i[0], this.f8095j) || !this.f8096k.equals(this.f8097l)) {
                jsonAdapter = nVar.e(this.f8095j, this.f8097l);
            } else {
                jsonAdapter = nVar.h(dVar, this.f8095j, this.f8097l);
            }
            this.f8093h = jsonAdapter;
        }

        public void e(n nVar, l lVar, Object obj) {
            this.f8093h.h(lVar, c(obj));
        }
    }

    /* compiled from: AdapterMethodsFactory */
    class d extends f {
        d(Type type, Set set, Object obj, Method method, int i2, int i3, boolean z) {
            super(type, set, obj, method, i2, i3, z);
        }

        public Object b(n nVar, g gVar) {
            return c(gVar);
        }
    }

    /* compiled from: AdapterMethodsFactory */
    class e extends f {

        /* renamed from: h  reason: collision with root package name */
        JsonAdapter<Object> f8098h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Type[] f8099i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Type f8100j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Set f8101k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Set f8102l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Type type, Set set, Object obj, Method method, int i2, int i3, boolean z, Type[] typeArr, Type type2, Set set2, Set set3) {
            super(type, set, obj, method, i2, i3, z);
            this.f8099i = typeArr;
            this.f8100j = type2;
            this.f8101k = set2;
            this.f8102l = set3;
        }

        public void a(n nVar, JsonAdapter.d dVar) {
            JsonAdapter<Object> jsonAdapter;
            super.a(nVar, dVar);
            if (!p.d(this.f8099i[0], this.f8100j) || !this.f8101k.equals(this.f8102l)) {
                jsonAdapter = nVar.e(this.f8099i[0], this.f8101k);
            } else {
                jsonAdapter = nVar.h(dVar, this.f8099i[0], this.f8101k);
            }
            this.f8098h = jsonAdapter;
        }

        public Object b(n nVar, g gVar) {
            return c(this.f8098h.b(gVar));
        }
    }

    /* compiled from: AdapterMethodsFactory */
    static abstract class f {
        final Type a;
        final Set<? extends Annotation> b;
        final Object c;

        /* renamed from: d  reason: collision with root package name */
        final Method f8103d;

        /* renamed from: e  reason: collision with root package name */
        final int f8104e;

        /* renamed from: f  reason: collision with root package name */
        final JsonAdapter<?>[] f8105f;

        /* renamed from: g  reason: collision with root package name */
        final boolean f8106g;

        f(Type type, Set<? extends Annotation> set, Object obj, Method method, int i2, int i3, boolean z) {
            this.a = com.squareup.moshi.internal.a.a(type);
            this.b = set;
            this.c = obj;
            this.f8103d = method;
            this.f8104e = i3;
            this.f8105f = new JsonAdapter[(i2 - i3)];
            this.f8106g = z;
        }

        public void a(n nVar, JsonAdapter.d dVar) {
            JsonAdapter<?> jsonAdapter;
            if (this.f8105f.length > 0) {
                Type[] genericParameterTypes = this.f8103d.getGenericParameterTypes();
                Annotation[][] parameterAnnotations = this.f8103d.getParameterAnnotations();
                int length = genericParameterTypes.length;
                for (int i2 = this.f8104e; i2 < length; i2++) {
                    Type type = ((ParameterizedType) genericParameterTypes[i2]).getActualTypeArguments()[0];
                    Set<? extends Annotation> l2 = com.squareup.moshi.internal.a.l(parameterAnnotations[i2]);
                    JsonAdapter<?>[] jsonAdapterArr = this.f8105f;
                    int i3 = i2 - this.f8104e;
                    if (!p.d(this.a, type) || !this.b.equals(l2)) {
                        jsonAdapter = nVar.e(type, l2);
                    } else {
                        jsonAdapter = nVar.h(dVar, type, l2);
                    }
                    jsonAdapterArr[i3] = jsonAdapter;
                }
            }
        }

        public Object b(n nVar, g gVar) {
            throw new AssertionError();
        }

        /* access modifiers changed from: protected */
        public Object c(Object obj) {
            JsonAdapter<?>[] jsonAdapterArr = this.f8105f;
            Object[] objArr = new Object[(jsonAdapterArr.length + 1)];
            objArr[0] = obj;
            System.arraycopy(jsonAdapterArr, 0, objArr, 1, jsonAdapterArr.length);
            try {
                return this.f8103d.invoke(this.c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: protected */
        public Object d(Object obj, Object obj2) {
            JsonAdapter<?>[] jsonAdapterArr = this.f8105f;
            Object[] objArr = new Object[(jsonAdapterArr.length + 2)];
            objArr[0] = obj;
            objArr[1] = obj2;
            System.arraycopy(jsonAdapterArr, 0, objArr, 2, jsonAdapterArr.length);
            try {
                return this.f8103d.invoke(this.c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        public void e(n nVar, l lVar, Object obj) {
            throw new AssertionError();
        }
    }

    a(List<f> list, List<f> list2) {
        this.a = list;
        this.b = list2;
    }

    static f b(Object obj, Method method) {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Set<? extends Annotation> k2 = com.squareup.moshi.internal.a.k(method);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (genericParameterTypes.length >= 1 && genericParameterTypes[0] == g.class && genericReturnType != Void.TYPE && e(1, genericParameterTypes)) {
            return new d(genericReturnType, k2, obj, method, genericParameterTypes.length, 1, true);
        } else if (genericParameterTypes.length != 1 || genericReturnType == Void.TYPE) {
            throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
        } else {
            Set<? extends Annotation> l2 = com.squareup.moshi.internal.a.l(parameterAnnotations[0]);
            return new e(genericReturnType, k2, obj, method, genericParameterTypes.length, 1, com.squareup.moshi.internal.a.f(parameterAnnotations[0]), genericParameterTypes, genericReturnType, l2, k2);
        }
    }

    private static f c(List<f> list, Type type, Set<? extends Annotation> set) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            f fVar = list.get(i2);
            if (p.d(fVar.a, type) && fVar.b.equals(set)) {
                return fVar;
            }
        }
        return null;
    }

    public static a d(Object obj) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Class cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.isAnnotationPresent(o.class)) {
                    f f2 = f(obj, method);
                    f c2 = c(arrayList, f2.a, f2.b);
                    if (c2 == null) {
                        arrayList.add(f2);
                    } else {
                        throw new IllegalArgumentException("Conflicting @ToJson methods:\n    " + c2.f8103d + "\n    " + f2.f8103d);
                    }
                }
                if (method.isAnnotationPresent(c.class)) {
                    f b2 = b(obj, method);
                    f c3 = c(arrayList2, b2.a, b2.b);
                    if (c3 == null) {
                        arrayList2.add(b2);
                    } else {
                        throw new IllegalArgumentException("Conflicting @FromJson methods:\n    " + c3.f8103d + "\n    " + b2.f8103d);
                    }
                }
            }
        }
        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
            return new a(arrayList, arrayList2);
        }
        throw new IllegalArgumentException("Expected at least one @ToJson or @FromJson method on " + obj.getClass().getName());
    }

    private static boolean e(int i2, Type[] typeArr) {
        int length = typeArr.length;
        while (i2 < length) {
            if (!(typeArr[i2] instanceof ParameterizedType) || typeArr[i2].getRawType() != JsonAdapter.class) {
                return false;
            }
            i2++;
        }
        return true;
    }

    static f f(Object obj, Method method) {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (genericParameterTypes.length >= 2 && genericParameterTypes[0] == l.class && genericReturnType == Void.TYPE && e(2, genericParameterTypes)) {
            return new b(genericParameterTypes[1], com.squareup.moshi.internal.a.l(parameterAnnotations[1]), obj, method, genericParameterTypes.length, 2, true);
        } else if (genericParameterTypes.length != 1 || genericReturnType == Void.TYPE) {
            throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
        } else {
            Set<? extends Annotation> k2 = com.squareup.moshi.internal.a.k(method);
            Set<? extends Annotation> l2 = com.squareup.moshi.internal.a.l(parameterAnnotations[0]);
            return new c(genericParameterTypes[0], l2, obj, method, genericParameterTypes.length, 1, com.squareup.moshi.internal.a.f(parameterAnnotations[0]), genericParameterTypes, genericReturnType, l2, k2);
        }
    }

    public JsonAdapter<?> a(Type type, Set<? extends Annotation> set, n nVar) {
        f c2 = c(this.a, type, set);
        f c3 = c(this.b, type, set);
        JsonAdapter<T> jsonAdapter = null;
        if (c2 == null && c3 == null) {
            return null;
        }
        if (c2 == null || c3 == null) {
            try {
                jsonAdapter = nVar.h(this, type, set);
            } catch (IllegalArgumentException e2) {
                String str = c2 == null ? "@ToJson" : "@FromJson";
                throw new IllegalArgumentException("No " + str + " adapter for " + com.squareup.moshi.internal.a.s(type, set), e2);
            }
        }
        JsonAdapter<T> jsonAdapter2 = jsonAdapter;
        if (c2 != null) {
            c2.a(nVar, this);
        }
        if (c3 != null) {
            c3.a(nVar, this);
        }
        return new C0544a(this, c2, jsonAdapter2, nVar, c3, set, type);
    }
}
