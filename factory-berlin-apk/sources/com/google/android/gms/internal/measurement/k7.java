package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public enum k7 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(t5.class, t5.class, t5.f2545h),
    ENUM(Integer.TYPE, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: g  reason: collision with root package name */
    private final Class<?> f2382g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f2383h;

    private k7(Class<?> cls, Class<?> cls2, Object obj) {
        this.f2382g = cls2;
        this.f2383h = obj;
    }

    public final Class<?> a() {
        return this.f2382g;
    }
}
