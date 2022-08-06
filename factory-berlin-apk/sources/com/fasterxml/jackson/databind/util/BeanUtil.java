package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class BeanUtil {
    public static Object getDefaultValue(JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        Class<?> primitiveType = ClassUtil.primitiveType(rawClass);
        if (primitiveType != null) {
            return ClassUtil.defaultValue(primitiveType);
        }
        if (javaType.isContainerType() || javaType.isReferenceType()) {
            return JsonInclude.Include.NON_EMPTY;
        }
        if (rawClass == String.class) {
            return "";
        }
        if (javaType.isTypeOrSubTypeOf(Date.class)) {
            return new Date(0);
        }
        if (!javaType.isTypeOrSubTypeOf(Calendar.class)) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(0);
        return gregorianCalendar;
    }

    protected static boolean isCglibGetCallbacks(AnnotatedMethod annotatedMethod) {
        String packageName;
        Class<?> rawType = annotatedMethod.getRawType();
        if (!rawType.isArray() || (packageName = ClassUtil.getPackageName(rawType.getComponentType())) == null || !packageName.contains(".cglib")) {
            return false;
        }
        if (packageName.startsWith("net.sf.cglib") || packageName.startsWith("org.hibernate.repackage.cglib") || packageName.startsWith("org.springframework.cglib")) {
            return true;
        }
        return false;
    }

    protected static boolean isGroovyMetaClassGetter(AnnotatedMethod annotatedMethod) {
        String packageName = ClassUtil.getPackageName(annotatedMethod.getRawType());
        return packageName != null && packageName.startsWith("groovy.lang");
    }

    protected static String legacyManglePropertyName(String str, int i2) {
        int length = str.length();
        if (length == i2) {
            return null;
        }
        char charAt = str.charAt(i2);
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i2);
        }
        StringBuilder sb = new StringBuilder(length - i2);
        sb.append(lowerCase);
        while (true) {
            i2++;
            if (i2 >= length) {
                break;
            }
            char charAt2 = str.charAt(i2);
            char lowerCase2 = Character.toLowerCase(charAt2);
            if (charAt2 == lowerCase2) {
                sb.append(str, i2, length);
                break;
            }
            sb.append(lowerCase2);
        }
        return sb.toString();
    }

    public static String okNameForGetter(AnnotatedMethod annotatedMethod, boolean z) {
        String name = annotatedMethod.getName();
        String okNameForIsGetter = okNameForIsGetter(annotatedMethod, name, z);
        return okNameForIsGetter == null ? okNameForRegularGetter(annotatedMethod, name, z) : okNameForIsGetter;
    }

    public static String okNameForIsGetter(AnnotatedMethod annotatedMethod, String str, boolean z) {
        if (!str.startsWith("is")) {
            return null;
        }
        Class<?> rawType = annotatedMethod.getRawType();
        if (rawType != Boolean.class && rawType != Boolean.TYPE) {
            return null;
        }
        if (z) {
            return stdManglePropertyName(str, 2);
        }
        return legacyManglePropertyName(str, 2);
    }

    public static String okNameForMutator(AnnotatedMethod annotatedMethod, String str, boolean z) {
        String name = annotatedMethod.getName();
        if (!name.startsWith(str)) {
            return null;
        }
        if (z) {
            return stdManglePropertyName(name, str.length());
        }
        return legacyManglePropertyName(name, str.length());
    }

    public static String okNameForRegularGetter(AnnotatedMethod annotatedMethod, String str, boolean z) {
        if (!str.startsWith("get")) {
            return null;
        }
        if ("getCallbacks".equals(str)) {
            if (isCglibGetCallbacks(annotatedMethod)) {
                return null;
            }
        } else if ("getMetaClass".equals(str) && isGroovyMetaClassGetter(annotatedMethod)) {
            return null;
        }
        if (z) {
            return stdManglePropertyName(str, 3);
        }
        return legacyManglePropertyName(str, 3);
    }

    protected static String stdManglePropertyName(String str, int i2) {
        int length = str.length();
        if (length == i2) {
            return null;
        }
        char charAt = str.charAt(i2);
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i2);
        }
        int i3 = i2 + 1;
        if (i3 < length && Character.isUpperCase(str.charAt(i3))) {
            return str.substring(i2);
        }
        StringBuilder sb = new StringBuilder(length - i2);
        sb.append(lowerCase);
        sb.append(str, i3, length);
        return sb.toString();
    }
}
