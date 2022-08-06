package com.github.jasminb.jsonapi;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.Serializable;
import java.util.Map;

@JsonSerialize(using = a.class)
/* compiled from: Link */
public class e implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    private String f1900g;

    /* compiled from: Link */
    protected static class a extends StdSerializer<e> {
    }

    public e() {
    }

    public String a() {
        return this.f1900g;
    }

    public void b(String str) {
        this.f1900g = str;
    }

    public void c(Map<String, ?> map) {
    }

    public String toString() {
        return String.valueOf(a());
    }

    public e(String str) {
        this.f1900g = str;
    }
}
