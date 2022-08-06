package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AnnotatedMethodCollector extends CollectorBase {
    private final ClassIntrospector.MixInResolver _mixInResolver;

    private static final class MethodBuilder {
        public AnnotationCollector annotations;
        public Method method;
        public TypeResolutionContext typeContext;

        public MethodBuilder(TypeResolutionContext typeResolutionContext, Method method2, AnnotationCollector annotationCollector) {
            this.typeContext = typeResolutionContext;
            this.method = method2;
            this.annotations = annotationCollector;
        }

        public AnnotatedMethod build() {
            Method method2 = this.method;
            if (method2 == null) {
                return null;
            }
            return new AnnotatedMethod(this.typeContext, method2, this.annotations.asAnnotationMap(), (AnnotationMap[]) null);
        }
    }

    AnnotatedMethodCollector(AnnotationIntrospector annotationIntrospector, ClassIntrospector.MixInResolver mixInResolver) {
        super(annotationIntrospector);
        this._mixInResolver = annotationIntrospector == null ? null : mixInResolver;
    }

    private void _addMemberMethods(TypeResolutionContext typeResolutionContext, Class<?> cls, Map<MemberKey, MethodBuilder> map, Class<?> cls2) {
        AnnotationCollector annotationCollector;
        if (cls2 != null) {
            _addMethodMixIns(typeResolutionContext, cls, map, cls2);
        }
        if (cls != null) {
            for (Method method : ClassUtil.getClassMethods(cls)) {
                if (_isIncludableMemberMethod(method)) {
                    MemberKey memberKey = new MemberKey(method);
                    MethodBuilder methodBuilder = map.get(memberKey);
                    if (methodBuilder == null) {
                        if (this._intr == null) {
                            annotationCollector = AnnotationCollector.emptyCollector();
                        } else {
                            annotationCollector = collectAnnotations(method.getDeclaredAnnotations());
                        }
                        map.put(memberKey, new MethodBuilder(typeResolutionContext, method, annotationCollector));
                    } else {
                        if (this._intr != null) {
                            methodBuilder.annotations = collectDefaultAnnotations(methodBuilder.annotations, method.getDeclaredAnnotations());
                        }
                        Method method2 = methodBuilder.method;
                        if (method2 == null) {
                            methodBuilder.method = method;
                        } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                            methodBuilder.method = method;
                            methodBuilder.typeContext = typeResolutionContext;
                        }
                    }
                }
            }
        }
    }

    private boolean _isIncludableMemberMethod(Method method) {
        if (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || method.getParameterTypes().length > 2) {
            return false;
        }
        return true;
    }

    public static AnnotatedMethodMap collectMethods(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext, ClassIntrospector.MixInResolver mixInResolver, TypeFactory typeFactory, JavaType javaType, List<JavaType> list, Class<?> cls) {
        return new AnnotatedMethodCollector(annotationIntrospector, mixInResolver).collect(typeFactory, typeResolutionContext, javaType, list, cls);
    }

    /* access modifiers changed from: protected */
    public void _addMethodMixIns(TypeResolutionContext typeResolutionContext, Class<?> cls, Map<MemberKey, MethodBuilder> map, Class<?> cls2) {
        if (this._intr != null) {
            for (Class<?> declaredMethods : ClassUtil.findRawSuperTypes(cls2, cls, true)) {
                for (Method method : ClassUtil.getDeclaredMethods(declaredMethods)) {
                    if (_isIncludableMemberMethod(method)) {
                        MemberKey memberKey = new MemberKey(method);
                        MethodBuilder methodBuilder = map.get(memberKey);
                        Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                        if (methodBuilder == null) {
                            map.put(memberKey, new MethodBuilder(typeResolutionContext, (Method) null, collectAnnotations(declaredAnnotations)));
                        } else {
                            methodBuilder.annotations = collectDefaultAnnotations(methodBuilder.annotations, declaredAnnotations);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public AnnotatedMethodMap collect(TypeFactory typeFactory, TypeResolutionContext typeResolutionContext, JavaType javaType, List<JavaType> list, Class<?> cls) {
        boolean z;
        Class<?> findMixInClassFor;
        Class<Object> cls2 = Object.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        _addMemberMethods(typeResolutionContext, javaType.getRawClass(), linkedHashMap, cls);
        for (JavaType next : list) {
            ClassIntrospector.MixInResolver mixInResolver = this._mixInResolver;
            _addMemberMethods(new TypeResolutionContext.Basic(typeFactory, next.getBindings()), next.getRawClass(), linkedHashMap, mixInResolver == null ? null : mixInResolver.findMixInClassFor(next.getRawClass()));
        }
        ClassIntrospector.MixInResolver mixInResolver2 = this._mixInResolver;
        if (mixInResolver2 == null || (findMixInClassFor = mixInResolver2.findMixInClassFor(cls2)) == null) {
            z = false;
        } else {
            _addMethodMixIns(typeResolutionContext, javaType.getRawClass(), linkedHashMap, findMixInClassFor);
            z = true;
        }
        if (z && this._intr != null && !linkedHashMap.isEmpty()) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                MemberKey memberKey = (MemberKey) entry.getKey();
                if ("hashCode".equals(memberKey.getName()) && memberKey.argCount() == 0) {
                    try {
                        Method declaredMethod = cls2.getDeclaredMethod(memberKey.getName(), new Class[0]);
                        if (declaredMethod != null) {
                            MethodBuilder methodBuilder = (MethodBuilder) entry.getValue();
                            methodBuilder.annotations = collectDefaultAnnotations(methodBuilder.annotations, declaredMethod.getDeclaredAnnotations());
                            methodBuilder.method = declaredMethod;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return new AnnotatedMethodMap();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            AnnotatedMethod build = ((MethodBuilder) entry2.getValue()).build();
            if (build != null) {
                linkedHashMap2.put(entry2.getKey(), build);
            }
        }
        return new AnnotatedMethodMap(linkedHashMap2);
    }
}
