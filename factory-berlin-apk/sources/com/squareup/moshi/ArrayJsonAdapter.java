package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

final class ArrayJsonAdapter extends JsonAdapter<Object> {
    public static final JsonAdapter.d FACTORY = new a();
    private final JsonAdapter<Object> elementAdapter;
    private final Class<?> elementClass;

    class a implements JsonAdapter.d {
        a() {
        }

        public JsonAdapter<?> a(Type type, Set<? extends Annotation> set, n nVar) {
            Type a = p.a(type);
            if (a != null && set.isEmpty()) {
                return new ArrayJsonAdapter(p.g(a), nVar.d(a)).f();
            }
            return null;
        }
    }

    ArrayJsonAdapter(Class<?> cls, JsonAdapter<Object> jsonAdapter) {
        this.elementClass = cls;
        this.elementAdapter = jsonAdapter;
    }

    public Object b(g gVar) {
        ArrayList arrayList = new ArrayList();
        gVar.a();
        while (gVar.hasNext()) {
            arrayList.add(this.elementAdapter.b(gVar));
        }
        gVar.h();
        Object newInstance = Array.newInstance(this.elementClass, arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Array.set(newInstance, i2, arrayList.get(i2));
        }
        return newInstance;
    }

    public void h(l lVar, Object obj) {
        lVar.a();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.elementAdapter.h(lVar, Array.get(obj, i2));
        }
        lVar.i();
    }

    public String toString() {
        return this.elementAdapter + ".array()";
    }
}
