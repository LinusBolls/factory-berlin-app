package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

public final class AnnotatedConstructor extends AnnotatedWithParams {
    protected final Constructor<?> _constructor;

    public AnnotatedConstructor(TypeResolutionContext typeResolutionContext, Constructor<?> constructor, AnnotationMap annotationMap, AnnotationMap[] annotationMapArr) {
        super(typeResolutionContext, annotationMap, annotationMapArr);
        if (constructor != null) {
            this._constructor = constructor;
            return;
        }
        throw new IllegalArgumentException("Null constructor not allowed");
    }

    public final Object call() {
        return this._constructor.newInstance(new Object[0]);
    }

    public final Object call1(Object obj) {
        return this._constructor.newInstance(new Object[]{obj});
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return ClassUtil.hasClass(obj, AnnotatedConstructor.class) && ((AnnotatedConstructor) obj)._constructor == this._constructor;
    }

    public Class<?> getDeclaringClass() {
        return this._constructor.getDeclaringClass();
    }

    public Member getMember() {
        return this._constructor;
    }

    public String getName() {
        return this._constructor.getName();
    }

    public int getParameterCount() {
        return this._constructor.getParameterTypes().length;
    }

    public JavaType getParameterType(int i2) {
        Type[] genericParameterTypes = this._constructor.getGenericParameterTypes();
        if (i2 >= genericParameterTypes.length) {
            return null;
        }
        return this._typeContext.resolveType(genericParameterTypes[i2]);
    }

    public Class<?> getRawParameterType(int i2) {
        Class<?>[] parameterTypes = this._constructor.getParameterTypes();
        if (i2 >= parameterTypes.length) {
            return null;
        }
        return parameterTypes[i2];
    }

    public Class<?> getRawType() {
        return this._constructor.getDeclaringClass();
    }

    public JavaType getType() {
        return this._typeContext.resolveType(getRawType());
    }

    public Object getValue(Object obj) {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor of " + getDeclaringClass().getName());
    }

    public int hashCode() {
        return this._constructor.getName().hashCode();
    }

    public void setValue(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Cannot call setValue() on constructor of " + getDeclaringClass().getName());
    }

    public String toString() {
        return "[constructor for " + getName() + ", annotations: " + this._annotations + "]";
    }

    public final Object call(Object[] objArr) {
        return this._constructor.newInstance(objArr);
    }

    public Constructor<?> getAnnotated() {
        return this._constructor;
    }

    public AnnotatedConstructor withAnnotations(AnnotationMap annotationMap) {
        return new AnnotatedConstructor(this._typeContext, this._constructor, annotationMap, this._paramAnnotations);
    }
}
