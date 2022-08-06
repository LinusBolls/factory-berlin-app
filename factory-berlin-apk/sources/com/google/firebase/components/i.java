package com.google.firebase.components;

import com.google.firebase.g.a;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
final /* synthetic */ class i implements a {
    private final l a;
    private final d b;

    private i(l lVar, d dVar) {
        this.a = lVar;
        this.b = dVar;
    }

    public static a a(l lVar, d dVar) {
        return new i(lVar, dVar);
    }

    public Object get() {
        return this.b.d().a(new s(this.b, this.a));
    }
}
