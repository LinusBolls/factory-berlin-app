package com.google.firebase.components;

import java.util.Set;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
abstract class a implements e {
    a() {
    }

    public <T> Set<T> a(Class<T> cls) {
        return c(cls).get();
    }

    public <T> T get(Class<T> cls) {
        com.google.firebase.g.a<T> b = b(cls);
        if (b == null) {
            return null;
        }
        return b.get();
    }
}
