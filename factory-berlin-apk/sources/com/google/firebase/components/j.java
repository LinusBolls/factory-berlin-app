package com.google.firebase.components;

import com.google.firebase.g.a;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
final /* synthetic */ class j implements a {
    private final Set a;

    private j(Set set) {
        this.a = set;
    }

    public static a a(Set set) {
        return new j(set);
    }

    public Object get() {
        return l.f(this.a);
    }
}
