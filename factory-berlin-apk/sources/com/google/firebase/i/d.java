package com.google.firebase.i;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: GlobalLibraryVersionRegistrar */
public class d {
    private static volatile d b;
    private final Set<f> a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = b;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = b;
                if (dVar == null) {
                    dVar = new d();
                    b = dVar;
                }
            }
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public Set<f> b() {
        Set<f> unmodifiableSet;
        synchronized (this.a) {
            unmodifiableSet = Collections.unmodifiableSet(this.a);
        }
        return unmodifiableSet;
    }
}
