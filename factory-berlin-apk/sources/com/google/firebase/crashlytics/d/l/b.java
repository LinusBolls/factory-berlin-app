package com.google.firebase.crashlytics.d.l;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import k.b0;
import k.c0;
import k.d;
import k.v;
import k.x;
import k.y;
import k.z;

/* compiled from: HttpRequest */
public class b {

    /* renamed from: f  reason: collision with root package name */
    private static final z f4081f;
    private final a a;
    private final String b;
    private final Map<String, String> c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, String> f4082d;

    /* renamed from: e  reason: collision with root package name */
    private y.a f4083e = null;

    static {
        z.a G = new z().G();
        G.e(10000, TimeUnit.MILLISECONDS);
        f4081f = G.c();
    }

    public b(a aVar, String str, Map<String, String> map) {
        this.a = aVar;
        this.b = str;
        this.c = map;
        this.f4082d = new HashMap();
    }

    private b0 a() {
        b0.a aVar = new b0.a();
        d.a aVar2 = new d.a();
        aVar2.d();
        aVar.c(aVar2.a());
        v.a k2 = v.m(this.b).k();
        for (Map.Entry next : this.c.entrySet()) {
            k2.a((String) next.getKey(), (String) next.getValue());
        }
        aVar.m(k2.d());
        for (Map.Entry next2 : this.f4082d.entrySet()) {
            aVar.e((String) next2.getKey(), (String) next2.getValue());
        }
        y.a aVar3 = this.f4083e;
        aVar.g(this.a.name(), aVar3 == null ? null : aVar3.e());
        return aVar.b();
    }

    private y.a c() {
        if (this.f4083e == null) {
            y.a aVar = new y.a();
            aVar.f(y.f10545h);
            this.f4083e = aVar;
        }
        return this.f4083e;
    }

    public d b() {
        return d.c(f4081f.c(a()).a());
    }

    public b d(String str, String str2) {
        this.f4082d.put(str, str2);
        return this;
    }

    public b e(Map.Entry<String, String> entry) {
        d(entry.getKey(), entry.getValue());
        return this;
    }

    public String f() {
        return this.a.name();
    }

    public b g(String str, String str2) {
        y.a c2 = c();
        c2.a(str, str2);
        this.f4083e = c2;
        return this;
    }

    public b h(String str, String str2, String str3, File file) {
        c0 c2 = c0.c(x.g(str3), file);
        y.a c3 = c();
        c3.b(str, str2, c2);
        this.f4083e = c3;
        return this;
    }
}
