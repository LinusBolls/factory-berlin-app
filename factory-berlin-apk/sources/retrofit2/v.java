package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import k.e0;
import l.f;

/* compiled from: Utils */
final class v {
    static final Type[] a = new Type[0];

    /* compiled from: Utils */
    private static final class a implements GenericArrayType {

        /* renamed from: g  reason: collision with root package name */
        private final Type f11854g;

        a(Type type) {
            this.f11854g = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && v.e(this, (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.f11854g;
        }

        public int hashCode() {
            return this.f11854g.hashCode();
        }

        public String toString() {
            return v.u(this.f11854g) + "[]";
        }
    }

    /* compiled from: Utils */
    static final class b implements ParameterizedType {

        /* renamed from: g  reason: collision with root package name */
        private final Type f11855g;

        /* renamed from: h  reason: collision with root package name */
        private final Type f11856h;

        /* renamed from: i  reason: collision with root package name */
        private final Type[] f11857i;

        b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() != null ? false : true)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                v.b(type3, "typeArgument == null");
                v.c(type3);
            }
            this.f11855g = type;
            this.f11856h = type2;
            this.f11857i = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && v.e(this, (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f11857i.clone();
        }

        public Type getOwnerType() {
            return this.f11855g;
        }

        public Type getRawType() {
            return this.f11856h;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.f11857i) ^ this.f11856h.hashCode();
            Type type = this.f11855g;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f11857i;
            if (typeArr.length == 0) {
                return v.u(this.f11856h);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(v.u(this.f11856h));
            sb.append("<");
            sb.append(v.u(this.f11857i[0]));
            for (int i2 = 1; i2 < this.f11857i.length; i2++) {
                sb.append(", ");
                sb.append(v.u(this.f11857i[i2]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* compiled from: Utils */
    private static final class c implements WildcardType {

        /* renamed from: g  reason: collision with root package name */
        private final Type f11858g;

        /* renamed from: h  reason: collision with root package name */
        private final Type f11859h;

        c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls = Object.class;
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                if (typeArr2[0] != null) {
                    v.c(typeArr2[0]);
                    if (typeArr[0] == cls) {
                        this.f11859h = typeArr2[0];
                        this.f11858g = cls;
                        return;
                    }
                    throw new IllegalArgumentException();
                }
                throw null;
            } else if (typeArr[0] != null) {
                v.c(typeArr[0]);
                this.f11859h = null;
                this.f11858g = typeArr[0];
            } else {
                throw null;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && v.e(this, (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.f11859h;
            if (type == null) {
                return v.a;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f11858g};
        }

        public int hashCode() {
            Type type = this.f11859h;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f11858g.hashCode() + 31);
        }

        public String toString() {
            if (this.f11859h != null) {
                return "? super " + v.u(this.f11859h);
            } else if (this.f11858g == Object.class) {
                return "?";
            } else {
                return "? extends " + v.u(this.f11858g);
            }
        }
    }

    static e0 a(e0 e0Var) {
        f fVar = new f();
        e0Var.n().j0(fVar);
        return e0.k(e0Var.j(), e0Var.i(), fVar);
    }

    static <T> T b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    static void c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    private static Class<?> d(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    static boolean e(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if ((ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return e(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return false;
            }
            return true;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                return false;
            }
            return true;
        }
    }

    static Type f(Type type, Class<?> cls, Class<?> cls2) {
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
                    return f(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
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
                    return f(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    static Type g(int i2, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i2];
        return type instanceof WildcardType ? ((WildcardType) type).getLowerBounds()[0] : type;
    }

    static Type h(int i2, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i2 < 0 || i2 >= actualTypeArguments.length) {
            throw new IllegalArgumentException("Index " + i2 + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
        }
        Type type = actualTypeArguments[i2];
        return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
    }

    static Class<?> i(Type type) {
        b(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(i(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return i(((WildcardType) type).getUpperBounds()[0]);
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
        }
    }

    static Type j(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return r(type, cls, f(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    static boolean k(Type type) {
        String str;
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type k2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (k(k2)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return k(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            if (type == null) {
                str = "null";
            } else {
                str = type.getClass().getName();
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + str);
        }
    }

    private static int l(Object[] objArr, Object obj) {
        for (int i2 = 0; i2 < objArr.length; i2++) {
            if (obj.equals(objArr[i2])) {
                return i2;
            }
        }
        throw new NoSuchElementException();
    }

    static boolean m(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation isInstance : annotationArr) {
            if (cls.isInstance(isInstance)) {
                return true;
            }
        }
        return false;
    }

    static RuntimeException n(Method method, String str, Object... objArr) {
        return o(method, (Throwable) null, str, objArr);
    }

    static RuntimeException o(Method method, Throwable th, String str, Object... objArr) {
        String format = String.format(str, objArr);
        return new IllegalArgumentException(format + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), th);
    }

    static RuntimeException p(Method method, int i2, String str, Object... objArr) {
        return n(method, str + " (parameter #" + (i2 + 1) + ")", objArr);
    }

    static RuntimeException q(Method method, Throwable th, int i2, String str, Object... objArr) {
        return o(method, th, str + " (parameter #" + (i2 + 1) + ")", objArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.reflect.Type r(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x000f
            java.lang.reflect.TypeVariable r10 = (java.lang.reflect.TypeVariable) r10
            java.lang.reflect.Type r0 = s(r8, r9, r10)
            if (r0 != r10) goto L_0x000d
            return r0
        L_0x000d:
            r10 = r0
            goto L_0x0000
        L_0x000f:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x002d
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x002d
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = r(r8, r9, r10)
            if (r10 != r8) goto L_0x0027
            goto L_0x002c
        L_0x0027:
            retrofit2.v$a r0 = new retrofit2.v$a
            r0.<init>(r8)
        L_0x002c:
            return r0
        L_0x002d:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0044
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = r(r8, r9, r0)
            if (r0 != r8) goto L_0x003e
            goto L_0x0043
        L_0x003e:
            retrofit2.v$a r10 = new retrofit2.v$a
            r10.<init>(r8)
        L_0x0043:
            return r10
        L_0x0044:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0086
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = r(r8, r9, r0)
            if (r3 == r0) goto L_0x0058
            r0 = 1
            goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x005e:
            if (r2 >= r5) goto L_0x0079
            r6 = r4[r2]
            java.lang.reflect.Type r6 = r(r8, r9, r6)
            r7 = r4[r2]
            if (r6 == r7) goto L_0x0076
            if (r0 != 0) goto L_0x0074
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L_0x0074:
            r4[r2] = r6
        L_0x0076:
            int r2 = r2 + 1
            goto L_0x005e
        L_0x0079:
            if (r0 == 0) goto L_0x0085
            retrofit2.v$b r8 = new retrofit2.v$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            r10 = r8
        L_0x0085:
            return r10
        L_0x0086:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x00ca
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto L_0x00b1
            r3 = r0[r2]
            java.lang.reflect.Type r8 = r(r8, r9, r3)
            r9 = r0[r2]
            if (r8 == r9) goto L_0x00ca
            retrofit2.v$c r9 = new retrofit2.v$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r1]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r10[r2] = r0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r1]
            r0[r2] = r8
            r9.<init>(r10, r0)
            return r9
        L_0x00b1:
            int r0 = r3.length
            if (r0 != r1) goto L_0x00ca
            r0 = r3[r2]
            java.lang.reflect.Type r8 = r(r8, r9, r0)     // Catch:{ all -> 0x00cb }
            r9 = r3[r2]
            if (r8 == r9) goto L_0x00ca
            retrofit2.v$c r9 = new retrofit2.v$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r1]
            r10[r2] = r8
            java.lang.reflect.Type[] r8 = a
            r9.<init>(r10, r8)
            return r9
        L_0x00ca:
            return r10
        L_0x00cb:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.v.r(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    private static Type s(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> d2 = d(typeVariable);
        if (d2 == null) {
            return typeVariable;
        }
        Type f2 = f(type, cls, d2);
        if (!(f2 instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) f2).getActualTypeArguments()[l(d2.getTypeParameters(), typeVariable)];
    }

    static void t(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    static String u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    static <T> void v(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        } else if (cls.getInterfaces().length > 0) {
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
    }
}
