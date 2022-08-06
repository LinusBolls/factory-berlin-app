package com.github.jasminb.jsonapi.r;

import com.github.jasminb.jsonapi.k;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import k.c0;
import k.e0;
import retrofit2.f;
import retrofit2.r;

/* compiled from: JSONAPIConverterFactory */
public class a extends f.a {
    private k a;
    private k b;
    private f.a c;

    public a(k kVar) {
        this.a = kVar;
        this.b = kVar;
    }

    public f<?, c0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, r rVar) {
        e eVar = new e(type);
        if (eVar.e() && this.b.p(eVar.a())) {
            return new c(this.b);
        }
        f.a aVar = this.c;
        if (aVar != null) {
            return aVar.c(type, annotationArr, annotationArr2, rVar);
        }
        return null;
    }

    public f<e0, ?> d(Type type, Annotation[] annotationArr, r rVar) {
        e eVar = new e(type);
        if (!eVar.e() || !this.a.p(eVar.a())) {
            f.a aVar = this.c;
            if (aVar != null) {
                return aVar.d(type, annotationArr, rVar);
            }
            return null;
        } else if (eVar.d()) {
            return new b(this.a, eVar.a(), eVar.c());
        } else {
            return new d(this.a, eVar.a(), eVar.c());
        }
    }
}
