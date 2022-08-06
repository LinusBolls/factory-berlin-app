package com.google.crypto.tink.shaded.protobuf;

/* compiled from: JavaType */
public enum b0 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(i.class, i.class, i.f3733h),
    ENUM(Integer.TYPE, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: g  reason: collision with root package name */
    private final Class<?> f3707g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f3708h;

    private b0(Class<?> cls, Class<?> cls2, Object obj) {
        this.f3707g = cls2;
        this.f3708h = obj;
    }

    public Class<?> a() {
        return this.f3707g;
    }
}
