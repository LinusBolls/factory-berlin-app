package com.github.jasminb.jsonapi.r;

import com.github.jasminb.jsonapi.d;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: RetrofitType */
public class e {
    private Class<?> a;
    private boolean b;
    private boolean c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1922d = false;

    public e(Type type) {
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (parameterizedType.getRawType().equals(d.class)) {
                b(parameterizedType.getActualTypeArguments()[0]);
                this.f1922d = true;
                return;
            }
        }
        b(type);
    }

    private void b(Type type) {
        if (type instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            if (actualTypeArguments == null || actualTypeArguments.length <= 0) {
                this.c = false;
            } else if (actualTypeArguments[0] instanceof Class) {
                this.a = (Class) actualTypeArguments[0];
                this.b = true;
            } else {
                this.c = false;
            }
        } else if (type instanceof Class) {
            this.a = (Class) type;
        } else {
            this.c = false;
        }
    }

    public Class<?> a() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }

    public boolean d() {
        return this.f1922d;
    }

    public boolean e() {
        return this.c;
    }
}
