package com.github.jasminb.jsonapi;

public class StringIdHandler implements l {
    public String a(Object obj) {
        if (obj != null) {
            return String.valueOf(obj);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ Object b(String str) {
        c(str);
        return str;
    }

    public String c(String str) {
        return str;
    }
}
