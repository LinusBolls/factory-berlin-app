package com.squareup.moshi;

import com.squareup.moshi.internal.a;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;

/* compiled from: Types */
public final class p {
    static Type a(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        if (type instanceof Class) {
            return ((Class) type).getComponentType();
        }
        return null;
    }

    public static GenericArrayType b(Type type) {
        return new a.C0546a(type);
    }

    public static Type c(Type type, Class<?> cls) {
        Type h2 = h(type, cls, Collection.class);
        if (h2 instanceof WildcardType) {
            h2 = ((WildcardType) h2).getUpperBounds()[0];
        }
        if (h2 instanceof ParameterizedType) {
            return ((ParameterizedType) h2).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    public static boolean d(Type type, Type type2) {
        Type[] typeArr;
        Type[] typeArr2;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            if (type2 instanceof GenericArrayType) {
                return d(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return type.equals(type2);
        } else if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (parameterizedType instanceof a.b) {
                typeArr = ((a.b) parameterizedType).f8127i;
            } else {
                typeArr = parameterizedType.getActualTypeArguments();
            }
            if (parameterizedType2 instanceof a.b) {
                typeArr2 = ((a.b) parameterizedType2).f8127i;
            } else {
                typeArr2 = parameterizedType2.getActualTypeArguments();
            }
            if (!d(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(typeArr, typeArr2)) {
                return false;
            }
            return true;
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return d(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    public static String e(String str) {
        return str.replace("$", "_") + "JsonAdapter";
    }

    static Type f(Type type) {
        Class<?> g2 = g(type);
        return a.o(type, g2, g2.getGenericSuperclass());
    }

    public static Class<?> g(Type type) {
        String str;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(g(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return g(((WildcardType) type).getUpperBounds()[0]);
        }
        if (type == null) {
            str = "null";
        } else {
            str = type.getClass().getName();
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + str);
    }

    static Type h(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return a.o(type, cls, a.e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    static Type[] i(Type type, Class<?> cls) {
        Class<Object> cls2 = Object.class;
        Class<String> cls3 = String.class;
        if (type == Properties.class) {
            return new Type[]{cls3, cls3};
        }
        Type h2 = h(type, cls, Map.class);
        if (h2 instanceof ParameterizedType) {
            return ((ParameterizedType) h2).getActualTypeArguments();
        }
        return new Type[]{cls2, cls2};
    }

    public static ParameterizedType j(Type type, Type... typeArr) {
        if (typeArr.length != 0) {
            return new a.b((Type) null, type, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + type);
    }

    public static WildcardType k(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new a.c(typeArr, a.b);
    }

    public static WildcardType l(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getLowerBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new a.c(new Type[]{Object.class}, typeArr);
    }
}
