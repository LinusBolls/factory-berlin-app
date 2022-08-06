package com.github.jasminb.jsonapi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: ReflectionUtils */
public class g {
    public static List<Field> a(Class<?> cls, Class<? extends Annotation> cls2, boolean z) {
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(cls2)) {
                arrayList.add(field);
            }
        }
        if (z && cls.getSuperclass() != null && !cls.getSuperclass().equals(Object.class)) {
            arrayList.addAll(a(cls.getSuperclass(), cls2, true));
        }
        return arrayList;
    }

    public static Class<?> b(Field field) {
        Class<?> type = field.getType();
        return Collection.class.isAssignableFrom(type) ? (Class) ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0] : type;
    }
}
