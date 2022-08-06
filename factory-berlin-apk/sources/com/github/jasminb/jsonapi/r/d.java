package com.github.jasminb.jsonapi.r;

import com.github.jasminb.jsonapi.k;
import k.e0;
import retrofit2.f;

/* compiled from: JSONAPIResponseBodyConverter */
public class d<T> implements f<e0, T> {
    private final Class<?> a;
    private final Boolean b;
    private final k c;

    public d(k kVar, Class<?> cls, boolean z) {
        this.a = cls;
        this.b = Boolean.valueOf(z);
        this.c = kVar;
    }

    /* renamed from: a */
    public T convert(e0 e0Var) {
        if (this.b.booleanValue()) {
            return this.c.v(e0Var.a(), this.a).a();
        }
        return this.c.u(e0Var.a(), this.a).a();
    }
}
