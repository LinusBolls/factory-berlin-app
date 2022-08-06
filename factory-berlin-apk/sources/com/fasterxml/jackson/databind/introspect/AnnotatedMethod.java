package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public final class AnnotatedMethod extends AnnotatedWithParams implements Serializable {
    protected final transient Method _method;
    protected Class<?>[] _paramClasses;

    public AnnotatedMethod(TypeResolutionContext typeResolutionContext, Method method, AnnotationMap annotationMap, AnnotationMap[] annotationMapArr) {
        super(typeResolutionContext, annotationMap, annotationMapArr);
        if (method != null) {
            this._method = method;
            return;
        }
        throw new IllegalArgumentException("Cannot construct AnnotatedMethod with null Method");
    }

    public final Object call() {
        return this._method.invoke((Object) null, new Object[0]);
    }

    public final Object call1(Object obj) {
        return this._method.invoke((Object) null, new Object[]{obj});
    }

    public final Object callOnWith(Object obj, Object... objArr) {
        return this._method.invoke(obj, objArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return ClassUtil.hasClass(obj, AnnotatedMethod.class) && ((AnnotatedMethod) obj)._method == this._method;
    }

    public Class<?> getDeclaringClass() {
        return this._method.getDeclaringClass();
    }

    public String getFullName() {
        return String.format("%s(%d params)", new Object[]{super.getFullName(), Integer.valueOf(getParameterCount())});
    }

    public String getName() {
        return this._method.getName();
    }

    public int getParameterCount() {
        return getRawParameterTypes().length;
    }

    public JavaType getParameterType(int i2) {
        Type[] genericParameterTypes = this._method.getGenericParameterTypes();
        if (i2 >= genericParameterTypes.length) {
            return null;
        }
        return this._typeContext.resolveType(genericParameterTypes[i2]);
    }

    public Class<?> getRawParameterType(int i2) {
        Class<?>[] rawParameterTypes = getRawParameterTypes();
        if (i2 >= rawParameterTypes.length) {
            return null;
        }
        return rawParameterTypes[i2];
    }

    public Class<?>[] getRawParameterTypes() {
        if (this._paramClasses == null) {
            this._paramClasses = this._method.getParameterTypes();
        }
        return this._paramClasses;
    }

    public Class<?> getRawReturnType() {
        return this._method.getReturnType();
    }

    public Class<?> getRawType() {
        return this._method.getReturnType();
    }

    public JavaType getType() {
        return this._typeContext.resolveType(this._method.getGenericReturnType());
    }

    public Object getValue(Object obj) {
        try {
            return this._method.invoke(obj, (Object[]) null);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new IllegalArgumentException("Failed to getValue() with method " + getFullName() + ": " + e2.getMessage(), e2);
        }
    }

    public boolean hasReturnType() {
        Class<?> rawReturnType = getRawReturnType();
        return (rawReturnType == Void.TYPE || rawReturnType == Void.class) ? false : true;
    }

    public int hashCode() {
        return this._method.getName().hashCode();
    }

    public void setValue(Object obj, Object obj2) {
        try {
            this._method.invoke(obj, new Object[]{obj2});
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new IllegalArgumentException("Failed to setValue() with method " + getFullName() + ": " + e2.getMessage(), e2);
        }
    }

    public String toString() {
        return "[method " + getFullName() + "]";
    }

    public final Object call(Object[] objArr) {
        return this._method.invoke((Object) null, objArr);
    }

    public Method getAnnotated() {
        return this._method;
    }

    public Method getMember() {
        return this._method;
    }

    public AnnotatedMethod withAnnotations(AnnotationMap annotationMap) {
        return new AnnotatedMethod(this._typeContext, this._method, annotationMap, this._paramAnnotations);
    }
}
