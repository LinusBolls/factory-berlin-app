package com.github.jasminb.jsonapi.r;

import com.github.jasminb.jsonapi.d;
import com.github.jasminb.jsonapi.k;
import k.e0;
import retrofit2.f;

/* compiled from: JSONAPIDocumentResponseBodyConverter */
public class b<T> implements f<e0, d<T>> {
    private final Class<?> a;
    private final Boolean b;
    private final k c;

    public b(k kVar, Class<?> cls, boolean z) {
        this.a = cls;
        this.b = Boolean.valueOf(z);
        this.c = kVar;
    }

    /* renamed from: a */
    public d<T> convert(e0 e0Var) {
        if (this.b.booleanValue()) {
            return this.c.v(e0Var.a(), this.a);
        }
        return this.c.u(e0Var.a(), this.a);
    }
}
