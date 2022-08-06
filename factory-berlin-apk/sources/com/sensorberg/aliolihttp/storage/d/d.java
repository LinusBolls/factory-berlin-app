package com.sensorberg.aliolihttp.storage.d;

import com.google.gson.f;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.jvm.internal.k;

/* compiled from: AlioliHttpHeaderTypeConverter.kt */
public final class d {
    private final f a = new f();
    private final Type b;

    /* compiled from: AlioliHttpHeaderTypeConverter.kt */
    public static final class a extends com.google.gson.u.a<ArrayList<c>> {
        a() {
        }
    }

    public d() {
        Type e2 = new a().e();
        k.b(e2, "object : TypeToken<Array…oliHttpHeader>>() {}.type");
        this.b = e2;
    }

    public final String a(ArrayList<c> arrayList) {
        k.f(arrayList, "alioliHttpHeaderList");
        String s = this.a.s(arrayList, this.b);
        k.b(s, "gson.toJson(alioliHttpHeaderList, type)");
        return s;
    }

    public final ArrayList<c> b(String str) {
        k.f(str, "string");
        if (p.s(str)) {
            return new ArrayList<>();
        }
        Object j2 = this.a.j(str, this.b);
        k.b(j2, "gson.fromJson(string, type)");
        return (ArrayList) j2;
    }
}
