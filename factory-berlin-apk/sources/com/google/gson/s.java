package com.google.gson;

import com.google.gson.stream.b;
import com.google.gson.stream.c;
import java.io.IOException;

/* compiled from: TypeAdapter */
public abstract class s<T> {

    /* compiled from: TypeAdapter */
    class a extends s<T> {
        a() {
        }

        public T b(com.google.gson.stream.a aVar) {
            if (aVar.Z() != b.NULL) {
                return s.this.b(aVar);
            }
            aVar.L();
            return null;
        }

        public void d(c cVar, T t) {
            if (t == null) {
                cVar.D();
            } else {
                s.this.d(cVar, t);
            }
        }
    }

    public final s<T> a() {
        return new a();
    }

    public abstract T b(com.google.gson.stream.a aVar);

    public final l c(T t) {
        try {
            com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
            d(bVar, t);
            return bVar.H0();
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        }
    }

    public abstract void d(c cVar, T t);
}
