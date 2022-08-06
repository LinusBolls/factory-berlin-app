package com.github.jasminb.jsonapi.r;

import com.github.jasminb.jsonapi.d;
import com.github.jasminb.jsonapi.k;
import k.c0;
import k.x;
import retrofit2.f;

/* compiled from: JSONAPIRequestBodyConverter */
public class c<T> implements f<T, c0> {
    private final k a;

    public c(k kVar) {
        this.a = kVar;
    }

    /* renamed from: a */
    public c0 convert(T t) {
        d dVar;
        boolean z;
        try {
            x g2 = x.g("application/vnd.api+json");
            if (t instanceof d) {
                dVar = (d) t;
                z = Iterable.class.isAssignableFrom(dVar.a().getClass());
            } else {
                d dVar2 = new d(t);
                z = Iterable.class.isAssignableFrom(t.getClass());
                dVar = dVar2;
            }
            if (z) {
                return c0.f(g2, this.a.G(dVar));
            }
            return c0.f(g2, this.a.E(dVar));
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
