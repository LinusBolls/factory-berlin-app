package com.github.jasminb.jsonapi;

public class IntegerIdHandler implements l {
    public String a(Object obj) {
        if (obj != null) {
            return String.valueOf(obj);
        }
        return null;
    }

    /* renamed from: c */
    public Integer b(String str) {
        if (str != null) {
            return Integer.valueOf(str);
        }
        return null;
    }
}
