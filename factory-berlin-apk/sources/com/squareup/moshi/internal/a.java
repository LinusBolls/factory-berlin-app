package com.squareup.moshi.internal;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.g;
import com.squareup.moshi.p;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: Util */
public final class a {
    public static final Set<Annotation> a = Collections.emptySet();
    public static final Type[] b = new Type[0];
    public static final Class<?> c;

    /* renamed from: d  reason: collision with root package name */
    private static final Class<? extends Annotation> f8123d;

    /* renamed from: com.squareup.moshi.internal.a$a  reason: collision with other inner class name */
    /* compiled from: Util */
    public static final class C0546a implements GenericArrayType {

        /* renamed from: g  reason: collision with root package name */
        private final Type f8124g;

        public C0546a(Type type) {
            this.f8124g = a.a(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && p.d(this, (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.f8124g;
        }

        public int hashCode() {
            return this.f8124g.hashCode();
        }

        public String toString() {
            return a.t(this.f8124g) + "[]";
        }
    }

    /* compiled from: Util */
    public static final class b implements ParameterizedType {

        /* renamed from: g  reason: collision with root package name */
        private final Type f8125g;

        /* renamed from: h  reason: collision with root package name */
        private final Type f8126h;

        /* renamed from: i  reason: collision with root package name */
        public final Type[] f8127i;

        public b(Type type, Type type2, Type... typeArr) {
            Type type3;
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || p.g(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            if (type == null) {
                type3 = null;
            } else {
                type3 = a.a(type);
            }
            this.f8125g = type3;
            this.f8126h = a.a(type2);
            this.f8127i = (Type[]) typeArr.clone();
            int i2 = 0;
            while (true) {
                Type[] typeArr2 = this.f8127i;
                if (i2 >= typeArr2.length) {
                    return;
                }
                if (typeArr2[i2] != null) {
                    a.b(typeArr2[i2]);
                    Type[] typeArr3 = this.f8127i;
                    typeArr3[i2] = a.a(typeArr3[i2]);
                    i2++;
                } else {
                    throw null;
                }
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && p.d(this, (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f8127i.clone();
        }

        public Type getOwnerType() {
            return this.f8125g;
        }

        public Type getRawType() {
            return this.f8126h;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f8127i) ^ this.f8126h.hashCode()) ^ a.g(this.f8125g);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((this.f8127i.length + 1) * 30);
            sb.append(a.t(this.f8126h));
            if (this.f8127i.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(a.t(this.f8127i[0]));
            for (int i2 = 1; i2 < this.f8127i.length; i2++) {
                sb.append(", ");
                sb.append(a.t(this.f8127i[i2]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* compiled from: Util */
    public static final class c implements WildcardType {

        /* renamed from: g  reason: collision with root package name */
        private final Type f8128g;

        /* renamed from: h  reason: collision with root package name */
        private final Type f8129h;

        public c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls = Object.class;
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                if (typeArr2[0] != null) {
                    a.b(typeArr2[0]);
                    if (typeArr[0] == cls) {
                        this.f8129h = a.a(typeArr2[0]);
                        this.f8128g = cls;
                        return;
                    }
                    throw new IllegalArgumentException();
                }
                throw null;
            } else if (typeArr[0] != null) {
                a.b(typeArr[0]);
                this.f8129h = null;
                this.f8128g = a.a(typeArr[0]);
            } else {
                throw null;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && p.d(this, (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.f8129h;
            if (type == null) {
                return a.b;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f8128g};
        }

        public int hashCode() {
            Type type = this.f8129h;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f8128g.hashCode() + 31);
        }

        public String toString() {
            if (this.f8129h != null) {
                return "? super " + a.t(this.f8129h);
            } else if (this.f8128g == Object.class) {
                return "?";
            } else {
                return "? extends " + a.t(this.f8128g);
            }
        }
    }

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("kotlin.i");
            try {
                cls2 = Class.forName("kotlin.jvm.internal.DefaultConstructorMarker");
            } catch (ClassNotFoundException unused) {
            }
        } catch (ClassNotFoundException unused2) {
            cls = null;
        }
        f8123d = cls;
        c = cls2;
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C0546a(a(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            if (type instanceof b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (type instanceof C0546a) {
                return type;
            }
            return new C0546a(((GenericArrayType) type).getGenericComponentType());
        } else if (!(type instanceof WildcardType) || (type instanceof c)) {
            return type;
        } else {
            WildcardType wildcardType = (WildcardType) type;
            return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    static Class<?> c(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0078, code lost:
        r(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        throw new java.lang.RuntimeException("Failed to instantiate the generated JsonAdapter for " + r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0094, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ab, code lost:
        throw new java.lang.RuntimeException("Failed to access the generated JsonAdapter for " + r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ac, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c3, code lost:
        throw new java.lang.RuntimeException("Failed to find the generated JsonAdapter constructor for " + r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c4, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00db, code lost:
        throw new java.lang.RuntimeException("Failed to find the generated JsonAdapter class for " + r9, r7);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0045 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0061 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0077 A[ExcHandler: InvocationTargetException (r7v5 'e' java.lang.reflect.InvocationTargetException A[CUSTOM_DECLARE]), Splitter:B:5:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007c A[ExcHandler: InstantiationException (r7v4 'e' java.lang.InstantiationException A[CUSTOM_DECLARE]), Splitter:B:5:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0094 A[ExcHandler: IllegalAccessException (r7v3 'e' java.lang.IllegalAccessException A[CUSTOM_DECLARE]), Splitter:B:5:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c4 A[ExcHandler: ClassNotFoundException (r7v1 'e' java.lang.ClassNotFoundException A[CUSTOM_DECLARE]), Splitter:B:5:0x001d] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0061=Splitter:B:16:0x0061, B:12:0x0045=Splitter:B:12:0x0045} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.squareup.moshi.JsonAdapter<?> d(com.squareup.moshi.n r7, java.lang.reflect.Type r8, java.lang.Class<?> r9) {
        /*
            java.lang.Class<com.squareup.moshi.n> r0 = com.squareup.moshi.n.class
            java.lang.Class<com.squareup.moshi.e> r1 = com.squareup.moshi.e.class
            java.lang.annotation.Annotation r1 = r9.getAnnotation(r1)
            com.squareup.moshi.e r1 = (com.squareup.moshi.e) r1
            r2 = 0
            if (r1 == 0) goto L_0x00dc
            boolean r1 = r1.generateAdapter()
            if (r1 != 0) goto L_0x0015
            goto L_0x00dc
        L_0x0015:
            java.lang.String r1 = r9.getName()
            java.lang.String r1 = com.squareup.moshi.p.e(r1)
            java.lang.ClassLoader r3 = r9.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            r4 = 1
            java.lang.Class r1 = java.lang.Class.forName(r1, r4, r3)     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            boolean r3 = r8 instanceof java.lang.reflect.ParameterizedType     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            r5 = 0
            if (r3 == 0) goto L_0x0054
            java.lang.reflect.ParameterizedType r8 = (java.lang.reflect.ParameterizedType) r8     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            java.lang.reflect.Type[] r8 = r8.getActualTypeArguments()     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            r3 = 2
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0045, ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            r6[r5] = r0     // Catch:{ NoSuchMethodException -> 0x0045, ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            java.lang.Class<java.lang.reflect.Type[]> r0 = java.lang.reflect.Type[].class
            r6[r4] = r0     // Catch:{ NoSuchMethodException -> 0x0045, ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            java.lang.reflect.Constructor r0 = r1.getDeclaredConstructor(r6)     // Catch:{ NoSuchMethodException -> 0x0045, ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x0045, ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            r3[r5] = r7     // Catch:{ NoSuchMethodException -> 0x0045, ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            r3[r4] = r8     // Catch:{ NoSuchMethodException -> 0x0045, ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            goto L_0x0069
        L_0x0045:
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            java.lang.Class<java.lang.reflect.Type[]> r0 = java.lang.reflect.Type[].class
            r7[r5] = r0     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            java.lang.reflect.Constructor r0 = r1.getDeclaredConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            r3[r5] = r8     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            goto L_0x0069
        L_0x0054:
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x0061, ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            r8[r5] = r0     // Catch:{ NoSuchMethodException -> 0x0061, ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            java.lang.reflect.Constructor r0 = r1.getDeclaredConstructor(r8)     // Catch:{ NoSuchMethodException -> 0x0061, ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ NoSuchMethodException -> 0x0061, ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            r3[r5] = r7     // Catch:{ NoSuchMethodException -> 0x0061, ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            goto L_0x0069
        L_0x0061:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            java.lang.reflect.Constructor r0 = r1.getDeclaredConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
        L_0x0069:
            r0.setAccessible(r4)     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            java.lang.Object r7 = r0.newInstance(r3)     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            com.squareup.moshi.JsonAdapter r7 = (com.squareup.moshi.JsonAdapter) r7     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            com.squareup.moshi.JsonAdapter r7 = r7.f()     // Catch:{ ClassNotFoundException -> 0x00c4, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0077 }
            return r7
        L_0x0077:
            r7 = move-exception
            r(r7)
            throw r2
        L_0x007c:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to instantiate the generated JsonAdapter for "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.<init>(r9, r7)
            throw r8
        L_0x0094:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to access the generated JsonAdapter for "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.<init>(r9, r7)
            throw r8
        L_0x00ac:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to find the generated JsonAdapter constructor for "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.<init>(r9, r7)
            throw r8
        L_0x00c4:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to find the generated JsonAdapter class for "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.<init>(r9, r7)
            throw r8
        L_0x00dc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.internal.a.d(com.squareup.moshi.n, java.lang.reflect.Type, java.lang.Class):com.squareup.moshi.JsonAdapter");
    }

    public static Type e(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (interfaces[i2] == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(interfaces[i2])) {
                    return e(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static boolean f(Annotation[] annotationArr) {
        for (Annotation annotationType : annotationArr) {
            if (annotationType.annotationType().getSimpleName().equals("Nullable")) {
                return true;
            }
        }
        return false;
    }

    static int g(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    static int h(Object[] objArr, Object obj) {
        for (int i2 = 0; i2 < objArr.length; i2++) {
            if (obj.equals(objArr[i2])) {
                return i2;
            }
        }
        throw new NoSuchElementException();
    }

    public static boolean i(Class<?> cls) {
        Class<? extends Annotation> cls2 = f8123d;
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    public static boolean j(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static Set<? extends Annotation> k(AnnotatedElement annotatedElement) {
        return l(annotatedElement.getAnnotations());
    }

    public static Set<? extends Annotation> l(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(f.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : a;
    }

    public static JsonDataException m(String str, String str2, g gVar) {
        String str3;
        String path = gVar.getPath();
        if (str2.equals(str)) {
            str3 = String.format("Required value '%s' missing at %s", new Object[]{str, path});
        } else {
            str3 = String.format("Required value '%s' (JSON name '%s') missing at %s", new Object[]{str, str2, path});
        }
        return new JsonDataException(str3);
    }

    public static Type n(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        throw new IllegalArgumentException();
    }

    public static Type o(Type type, Class<?> cls, Type type2) {
        return p(type, cls, type2, new LinkedHashSet());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type p(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable> r11) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x0018
            r0 = r10
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            boolean r1 = r11.contains(r0)
            if (r1 == 0) goto L_0x000e
            return r10
        L_0x000e:
            r11.add(r0)
            java.lang.reflect.Type r10 = q(r8, r9, r0)
            if (r10 != r0) goto L_0x0000
            return r10
        L_0x0018:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0035
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x0035
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = p(r8, r9, r10, r11)
            if (r10 != r8) goto L_0x0030
            goto L_0x0034
        L_0x0030:
            java.lang.reflect.GenericArrayType r0 = com.squareup.moshi.p.b(r8)
        L_0x0034:
            return r0
        L_0x0035:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x004b
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = p(r8, r9, r0, r11)
            if (r0 != r8) goto L_0x0046
            goto L_0x004a
        L_0x0046:
            java.lang.reflect.GenericArrayType r10 = com.squareup.moshi.p.b(r8)
        L_0x004a:
            return r10
        L_0x004b:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x008d
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = p(r8, r9, r0, r11)
            if (r3 == r0) goto L_0x005f
            r0 = 1
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x0065:
            if (r2 >= r5) goto L_0x0080
            r6 = r4[r2]
            java.lang.reflect.Type r6 = p(r8, r9, r6, r11)
            r7 = r4[r2]
            if (r6 == r7) goto L_0x007d
            if (r0 != 0) goto L_0x007b
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L_0x007b:
            r4[r2] = r6
        L_0x007d:
            int r2 = r2 + 1
            goto L_0x0065
        L_0x0080:
            if (r0 == 0) goto L_0x008c
            com.squareup.moshi.internal.a$b r8 = new com.squareup.moshi.internal.a$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            r10 = r8
        L_0x008c:
            return r10
        L_0x008d:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x00bf
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto L_0x00ad
            r1 = r0[r2]
            java.lang.reflect.Type r8 = p(r8, r9, r1, r11)
            r9 = r0[r2]
            if (r8 == r9) goto L_0x00bf
            java.lang.reflect.WildcardType r8 = com.squareup.moshi.p.l(r8)
            return r8
        L_0x00ad:
            int r0 = r3.length
            if (r0 != r1) goto L_0x00bf
            r0 = r3[r2]
            java.lang.reflect.Type r8 = p(r8, r9, r0, r11)     // Catch:{ all -> 0x00c0 }
            r9 = r3[r2]
            if (r8 == r9) goto L_0x00bf
            java.lang.reflect.WildcardType r8 = com.squareup.moshi.p.k(r8)
            return r8
        L_0x00bf:
            return r10
        L_0x00c0:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.internal.a.p(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }

    static Type q(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> c2 = c(typeVariable);
        if (c2 == null) {
            return typeVariable;
        }
        Type e2 = e(type, cls, c2);
        if (!(e2 instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) e2).getActualTypeArguments()[h(c2.getTypeParameters(), typeVariable)];
    }

    public static RuntimeException r(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        } else if (targetException instanceof Error) {
            throw ((Error) targetException);
        } else {
            throw new RuntimeException(targetException);
        }
    }

    public static String s(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    static String t(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static JsonDataException u(String str, String str2, g gVar) {
        String str3;
        String path = gVar.getPath();
        if (str2.equals(str)) {
            str3 = String.format("Non-null value '%s' was null at %s", new Object[]{str, path});
        } else {
            str3 = String.format("Non-null value '%s' (JSON name '%s') was null at %s", new Object[]{str, str2, path});
        }
        return new JsonDataException(str3);
    }
}
