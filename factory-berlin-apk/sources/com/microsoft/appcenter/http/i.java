package com.microsoft.appcenter.http;

import java.util.Map;

/* compiled from: HttpResponse */
public class i {
    private final int a;
    private final String b;
    private final Map<String, String> c;

    public i(int i2, String str, Map<String, String> map) {
        this.b = str;
        this.a = i2;
        this.c = map;
    }

    public Map<String, String> a() {
        return this.c;
    }

    public String b() {
        return this.b;
    }

    public int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.a != iVar.a || !this.b.equals(iVar.b) || !this.c.equals(iVar.c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
