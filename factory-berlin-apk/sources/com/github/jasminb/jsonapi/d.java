package com.github.jasminb.jsonapi;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.jasminb.jsonapi.q.a.a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: JSONAPIDocument */
public class d<T> {
    private T a;
    private ObjectMapper b;
    private Iterable<? extends a> c;

    /* renamed from: d  reason: collision with root package name */
    private f f1898d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, Object> f1899e;

    public d(T t) {
        this.a = t;
    }

    public T a() {
        return this.a;
    }

    public Iterable<? extends a> b() {
        return this.c;
    }

    public f c() {
        return this.f1898d;
    }

    public <M> M d(Class<?> cls) {
        ObjectMapper objectMapper;
        Map<String, Object> map = this.f1899e;
        if (map == null || (objectMapper = this.b) == null) {
            return null;
        }
        return objectMapper.convertValue((Object) map, cls);
    }

    public Map<String, ?> e() {
        return this.f1899e;
    }

    public void f(f fVar) {
        this.f1898d = fVar;
    }

    public void g(Map<String, ?> map) {
        this.f1899e = new HashMap(map);
    }

    public d(T t, JsonNode jsonNode, ObjectMapper objectMapper) {
        this(t);
        this.b = objectMapper;
    }

    public d() {
    }
}
