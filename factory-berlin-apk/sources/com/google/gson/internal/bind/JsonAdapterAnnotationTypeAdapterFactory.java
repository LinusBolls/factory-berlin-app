package com.google.gson.internal.bind;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.f;
import com.google.gson.internal.c;
import com.google.gson.s;
import com.google.gson.t;
import com.google.gson.u.a;

public final class JsonAdapterAnnotationTypeAdapterFactory implements t {

    /* renamed from: g  reason: collision with root package name */
    private final c f4256g;

    public JsonAdapterAnnotationTypeAdapterFactory(c cVar) {
        this.f4256g = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: com.google.gson.s<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: com.google.gson.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.gson.s<?> a(com.google.gson.internal.c r9, com.google.gson.f r10, com.google.gson.u.a<?> r11, com.google.gson.annotations.JsonAdapter r12) {
        /*
            r8 = this;
            java.lang.Class r0 = r12.value()
            com.google.gson.u.a r0 = com.google.gson.u.a.a(r0)
            com.google.gson.internal.h r9 = r9.a(r0)
            java.lang.Object r9 = r9.a()
            boolean r0 = r9 instanceof com.google.gson.s
            if (r0 == 0) goto L_0x0017
            com.google.gson.s r9 = (com.google.gson.s) r9
            goto L_0x0075
        L_0x0017:
            boolean r0 = r9 instanceof com.google.gson.t
            if (r0 == 0) goto L_0x0022
            com.google.gson.t r9 = (com.google.gson.t) r9
            com.google.gson.s r9 = r9.c(r10, r11)
            goto L_0x0075
        L_0x0022:
            boolean r0 = r9 instanceof com.google.gson.q
            if (r0 != 0) goto L_0x005b
            boolean r1 = r9 instanceof com.google.gson.k
            if (r1 == 0) goto L_0x002b
            goto L_0x005b
        L_0x002b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Invalid attempt to bind an instance of "
            r12.append(r0)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r12.append(r9)
            java.lang.String r9 = " as a @JsonAdapter for "
            r12.append(r9)
            java.lang.String r9 = r11.toString()
            r12.append(r9)
            java.lang.String r9 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r10.<init>(r9)
            throw r10
        L_0x005b:
            r1 = 0
            if (r0 == 0) goto L_0x0063
            r0 = r9
            com.google.gson.q r0 = (com.google.gson.q) r0
            r3 = r0
            goto L_0x0064
        L_0x0063:
            r3 = r1
        L_0x0064:
            boolean r0 = r9 instanceof com.google.gson.k
            if (r0 == 0) goto L_0x006b
            r1 = r9
            com.google.gson.k r1 = (com.google.gson.k) r1
        L_0x006b:
            r4 = r1
            com.google.gson.internal.bind.TreeTypeAdapter r9 = new com.google.gson.internal.bind.TreeTypeAdapter
            r7 = 0
            r2 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0075:
            if (r9 == 0) goto L_0x0081
            boolean r10 = r12.nullSafe()
            if (r10 == 0) goto L_0x0081
            com.google.gson.s r9 = r9.a()
        L_0x0081:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.a(com.google.gson.internal.c, com.google.gson.f, com.google.gson.u.a, com.google.gson.annotations.JsonAdapter):com.google.gson.s");
    }

    public <T> s<T> c(f fVar, a<T> aVar) {
        JsonAdapter jsonAdapter = (JsonAdapter) aVar.c().getAnnotation(JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return a(this.f4256g, fVar, aVar, jsonAdapter);
    }
}
