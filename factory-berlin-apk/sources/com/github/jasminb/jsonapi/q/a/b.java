package com.github.jasminb.jsonapi.q.a;

import java.util.List;

/* compiled from: Errors */
public class b {
    private List<a> a;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Errors{errors=");
        Object obj = this.a;
        if (obj == null) {
            obj = "Undefined";
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }
}
