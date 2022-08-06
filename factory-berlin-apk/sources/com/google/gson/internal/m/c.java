package com.google.gson.internal.m;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* compiled from: UnsafeReflectionAccessor */
final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    private static Class f4329d;
    private final Object b = d();
    private final Field c = c();

    c() {
    }

    private static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static Object d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f4329d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get((Object) null);
        } catch (Exception unused) {
            return null;
        }
    }

    public void b(AccessibleObject accessibleObject) {
        if (!e(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e2) {
                throw new JsonIOException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e(AccessibleObject accessibleObject) {
        if (!(this.b == null || this.c == null)) {
            try {
                long longValue = ((Long) f4329d.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(this.b, new Object[]{this.c})).longValue();
                f4329d.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(this.b, new Object[]{accessibleObject, Long.valueOf(longValue), Boolean.TRUE});
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
