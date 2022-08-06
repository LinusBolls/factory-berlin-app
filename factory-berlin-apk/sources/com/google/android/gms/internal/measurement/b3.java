package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class b3 {
    public static int a(int i2, int i3) {
        String str;
        if (i2 >= 0 && i2 < i3) {
            return i2;
        }
        if (i2 < 0) {
            str = d3.b("%s (%s) must not be negative", "index", Integer.valueOf(i2));
        } else if (i3 < 0) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i3);
            throw new IllegalArgumentException(sb.toString());
        } else {
            str = d3.b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IndexOutOfBoundsException(str);
    }

    @NonNullDecl
    public static <T> T b(@NonNullDecl T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    @NonNullDecl
    public static <T> T c(@NonNullDecl T t, @NullableDecl Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    private static String d(int i2, int i3, @NullableDecl String str) {
        if (i2 < 0) {
            return d3.b("%s (%s) must not be negative", str, Integer.valueOf(i2));
        } else if (i3 >= 0) {
            return d3.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i3);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static void e(int i2, int i3, int i4) {
        String str;
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            if (i2 < 0 || i2 > i4) {
                str = d(i2, i4, "start index");
            } else if (i3 < 0 || i3 > i4) {
                str = d(i3, i4, "end index");
            } else {
                str = d3.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void f(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int g(int i2, int i3) {
        if (i2 >= 0 && i2 <= i3) {
            return i2;
        }
        throw new IndexOutOfBoundsException(d(i2, i3, "index"));
    }

    public static void h(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
