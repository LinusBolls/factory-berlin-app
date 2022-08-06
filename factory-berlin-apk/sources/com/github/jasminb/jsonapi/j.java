package com.github.jasminb.jsonapi;

import java.util.HashMap;
import java.util.Map;

/* compiled from: ResourceCache */
public class j {
    private ThreadLocal<Map<String, Object>> a = new ThreadLocal<>();
    private ThreadLocal<Integer> b = new ThreadLocal<>();
    private ThreadLocal<Boolean> c = new ThreadLocal<>();

    private void i() {
        if (this.a.get() == null) {
            throw new IllegalStateException("Cache not initialised, call init() first");
        }
    }

    public void a(String str, Object obj) {
        i();
        if (!this.c.get().booleanValue()) {
            this.a.get().put(str, obj);
        }
    }

    public void b(Map<String, Object> map) {
        i();
        if (!this.c.get().booleanValue()) {
            this.a.get().putAll(map);
        }
    }

    public void c() {
        i();
        ThreadLocal<Integer> threadLocal = this.b;
        threadLocal.set(Integer.valueOf(threadLocal.get().intValue() - 1));
        if (this.b.get().intValue() == 0) {
            this.a.set((Object) null);
            this.c.set((Object) null);
            this.b.set((Object) null);
        }
    }

    public boolean d(String str) {
        i();
        return this.a.get().containsKey(str);
    }

    public Object e(String str) {
        i();
        return this.a.get().get(str);
    }

    public void f() {
        if (this.b.get() == null) {
            this.b.set(1);
        } else {
            ThreadLocal<Integer> threadLocal = this.b;
            threadLocal.set(Integer.valueOf(threadLocal.get().intValue() + 1));
        }
        if (this.a.get() == null) {
            this.a.set(new HashMap());
        }
        if (this.c.get() == null) {
            this.c.set(Boolean.FALSE);
        }
    }

    public void g() {
        i();
        this.c.set(Boolean.TRUE);
    }

    public void h() {
        i();
        this.c.set(Boolean.FALSE);
    }
}
