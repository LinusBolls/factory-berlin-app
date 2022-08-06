package com.google.firebase.components;

import com.google.firebase.g.a;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
public interface e {
    <T> Set<T> a(Class<T> cls);

    <T> a<T> b(Class<T> cls);

    <T> a<Set<T>> c(Class<T> cls);

    <T> T get(Class<T> cls);
}
