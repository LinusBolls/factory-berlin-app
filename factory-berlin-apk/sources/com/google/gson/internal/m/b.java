package com.google.gson.internal.m;

import com.google.gson.internal.d;
import java.lang.reflect.AccessibleObject;

/* compiled from: ReflectionAccessor */
public abstract class b {
    private static final b a = (d.c() < 9 ? new a() : new c());

    public static b a() {
        return a;
    }

    public abstract void b(AccessibleObject accessibleObject);
}
