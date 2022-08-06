package kotlin.c0.j.a;

import java.lang.reflect.Field;
import kotlin.jvm.internal.k;

/* compiled from: DebugMetadata.kt */
public final class g {
    private static final void a(int i2, int i3) {
        if (i3 > i2) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i2 + ", got " + i3 + ". Please update the Kotlin standard library.").toString());
        }
    }

    private static final f b(a aVar) {
        return (f) aVar.getClass().getAnnotation(f.class);
    }

    private static final int c(a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            k.d(declaredField, "field");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement d(a aVar) {
        int i2;
        String str;
        k.e(aVar, "$this$getStackTraceElementImpl");
        f b = b(aVar);
        if (b == null) {
            return null;
        }
        a(1, b.v());
        int c = c(aVar);
        if (c < 0) {
            i2 = -1;
        } else {
            i2 = b.l()[c];
        }
        String b2 = i.c.b(aVar);
        if (b2 == null) {
            str = b.c();
        } else {
            str = b2 + '/' + b.c();
        }
        return new StackTraceElement(str, b.m(), b.f(), i2);
    }
}
