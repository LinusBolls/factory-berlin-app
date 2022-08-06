package com.google.firebase.e;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
public class a<T> {
    private final Class<T> a;
    private final T b;

    public T a() {
        return this.b;
    }

    public Class<T> b() {
        return this.a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", new Object[]{this.a, this.b});
    }
}
