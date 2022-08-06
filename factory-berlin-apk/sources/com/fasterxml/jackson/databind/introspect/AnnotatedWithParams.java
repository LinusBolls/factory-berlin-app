package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;

public abstract class AnnotatedWithParams extends AnnotatedMember {
    protected final AnnotationMap[] _paramAnnotations;

    protected AnnotatedWithParams(TypeResolutionContext typeResolutionContext, AnnotationMap annotationMap, AnnotationMap[] annotationMapArr) {
        super(typeResolutionContext, annotationMap);
        this._paramAnnotations = annotationMapArr;
    }

    public abstract Object call();

    public abstract Object call(Object[] objArr);

    public abstract Object call1(Object obj);

    public final AnnotatedParameter getParameter(int i2) {
        return new AnnotatedParameter(this, getParameterType(i2), this._typeContext, getParameterAnnotations(i2), i2);
    }

    public final AnnotationMap getParameterAnnotations(int i2) {
        AnnotationMap[] annotationMapArr = this._paramAnnotations;
        if (annotationMapArr == null || i2 < 0 || i2 >= annotationMapArr.length) {
            return null;
        }
        return annotationMapArr[i2];
    }

    public abstract int getParameterCount();

    public abstract JavaType getParameterType(int i2);

    public abstract Class<?> getRawParameterType(int i2);

    /* access modifiers changed from: protected */
    public AnnotatedParameter replaceParameterAnnotations(int i2, AnnotationMap annotationMap) {
        this._paramAnnotations[i2] = annotationMap;
        return getParameter(i2);
    }

    protected AnnotatedWithParams(AnnotatedWithParams annotatedWithParams, AnnotationMap[] annotationMapArr) {
        super(annotatedWithParams);
        this._paramAnnotations = annotationMapArr;
    }
}
