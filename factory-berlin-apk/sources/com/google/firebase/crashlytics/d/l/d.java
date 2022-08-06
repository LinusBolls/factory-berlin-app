package com.google.firebase.crashlytics.d.l;

import k.d0;
import k.u;

/* compiled from: HttpResponse */
public class d {
    private int a;
    private String b;
    private u c;

    d(int i2, String str, u uVar) {
        this.a = i2;
        this.b = str;
        this.c = uVar;
    }

    static d c(d0 d0Var) {
        return new d(d0Var.j(), d0Var.a() == null ? null : d0Var.a().o(), d0Var.y());
    }

    public String a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public String d(String str) {
        return this.c.a(str);
    }
}
