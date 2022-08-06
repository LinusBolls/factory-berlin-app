package com.google.gson.internal.bind;

import com.google.gson.f;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.s;
import com.google.gson.stream.a;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: TypeAdapterRuntimeTypeWrapper */
final class c<T> extends s<T> {
    private final f a;
    private final s<T> b;
    private final Type c;

    c(f fVar, s<T> sVar, Type type) {
        this.a = fVar;
        this.b = sVar;
        this.c = type;
    }

    private Type e(Type type, Object obj) {
        if (obj != null) {
            return (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type;
        }
        return type;
    }

    public T b(a aVar) {
        return this.b.b(aVar);
    }

    public void d(com.google.gson.stream.c cVar, T t) {
        s<T> sVar = this.b;
        Type e2 = e(this.c, t);
        if (e2 != this.c) {
            sVar = this.a.k(com.google.gson.u.a.b(e2));
            if (sVar instanceof ReflectiveTypeAdapterFactory.b) {
                s<T> sVar2 = this.b;
                if (!(sVar2 instanceof ReflectiveTypeAdapterFactory.b)) {
                    sVar = sVar2;
                }
            }
        }
        sVar.d(cVar, t);
    }
}
