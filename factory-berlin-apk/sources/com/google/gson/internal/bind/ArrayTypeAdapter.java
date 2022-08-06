package com.google.gson.internal.bind;

import com.google.gson.f;
import com.google.gson.internal.b;
import com.google.gson.s;
import com.google.gson.stream.c;
import com.google.gson.t;
import com.google.gson.u.a;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class ArrayTypeAdapter<E> extends s<Object> {
    public static final t c = new t() {
        public <T> s<T> c(f fVar, a<T> aVar) {
            Type e2 = aVar.e();
            if (!(e2 instanceof GenericArrayType) && (!(e2 instanceof Class) || !((Class) e2).isArray())) {
                return null;
            }
            Type g2 = b.g(e2);
            return new ArrayTypeAdapter(fVar, fVar.k(a.b(g2)), b.k(g2));
        }
    };
    private final Class<E> a;
    private final s<E> b;

    public ArrayTypeAdapter(f fVar, s<E> sVar, Class<E> cls) {
        this.b = new c(fVar, sVar, cls);
        this.a = cls;
    }

    public Object b(com.google.gson.stream.a aVar) {
        if (aVar.Z() == com.google.gson.stream.b.NULL) {
            aVar.L();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.hasNext()) {
            arrayList.add(this.b.b(aVar));
        }
        aVar.k();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.a, size);
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(newInstance, i2, arrayList.get(i2));
        }
        return newInstance;
    }

    public void d(c cVar, Object obj) {
        if (obj == null) {
            cVar.D();
            return;
        }
        cVar.h();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.b.d(cVar, Array.get(obj, i2));
        }
        cVar.k();
    }
}
