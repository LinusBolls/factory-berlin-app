package com.google.firebase.components;

import com.google.firebase.g.a;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
public class q<T> implements a<T> {
    private static final Object c = new Object();
    private volatile Object a = c;
    private volatile a<T> b;

    public q(a<T> aVar) {
        this.b = aVar;
    }

    public T get() {
        T t = this.a;
        if (t == c) {
            synchronized (this) {
                t = this.a;
                if (t == c) {
                    t = this.b.get();
                    this.a = t;
                    this.b = null;
                }
            }
        }
        return t;
    }
}
