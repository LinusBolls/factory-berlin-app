package com.github.jasminb.jsonapi;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Links */
public class f implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    private Map<String, e> f1901g;

    public f() {
        this.f1901g = new LinkedHashMap();
    }

    public Map<String, e> a() {
        return new LinkedHashMap(this.f1901g);
    }

    public f(Map<String, e> map) {
        this.f1901g = new LinkedHashMap(map);
    }
}
