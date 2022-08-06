package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

public final class AnnotatedField extends AnnotatedMember implements Serializable {
    protected final transient Field _field;

    public AnnotatedField(TypeResolutionContext typeResolutionContext, Field field, AnnotationMap annotationMap) {
        super(typeResolutionContext, annotationMap);
        this._field = field;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return ClassUtil.hasClass(obj, AnnotatedField.class) && ((AnnotatedField) obj)._field == this._field;
    }

    public Class<?> getDeclaringClass() {
        return this._field.getDeclaringClass();
    }

    public Member getMember() {
        return this._field;
    }

    public int getModifiers() {
        return this._field.getModifiers();
    }

    public String getName() {
        return this._field.getName();
    }

    public Class<?> getRawType() {
        return this._field.getType();
    }

    public JavaType getType() {
        return this._typeContext.resolveType(this._field.getGenericType());
    }

    public Object getValue(Object obj) {
        try {
            return this._field.get(obj);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException("Failed to getValue() for field " + getFullName() + ": " + e2.getMessage(), e2);
        }
    }

    public int hashCode() {
        return this._field.getName().hashCode();
    }

    public boolean isTransient() {
        return Modifier.isTransient(getModifiers());
    }

    public void setValue(Object obj, Object obj2) {
        try {
            this._field.set(obj, obj2);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException("Failed to setValue() for field " + getFullName() + ": " + e2.getMessage(), e2);
        }
    }

    public String toString() {
        return "[field " + getFullName() + "]";
    }

    public Field getAnnotated() {
        return this._field;
    }

    public AnnotatedField withAnnotations(AnnotationMap annotationMap) {
        return new AnnotatedField(this._typeContext, this._field, annotationMap);
    }
}
