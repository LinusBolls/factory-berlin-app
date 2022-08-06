package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* compiled from: Intrinsics */
public class k {
    private k() {
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            IllegalStateException illegalStateException = new IllegalStateException(str + " must not be null");
            i(illegalStateException);
            throw illegalStateException;
        }
    }

    public static void c(Object obj) {
        if (obj == null) {
            l();
            throw null;
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str + " must not be null");
            i(nullPointerException);
            throw nullPointerException;
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            o(str);
            throw null;
        }
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            n(str);
            throw null;
        }
    }

    public static int g(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    private static String h(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    private static <T extends Throwable> T i(T t) {
        j(t, k.class.getName());
        return t;
    }

    static <T extends Throwable> T j(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
        return t;
    }

    public static String k(String str, Object obj) {
        return str + obj;
    }

    public static void l() {
        NullPointerException nullPointerException = new NullPointerException();
        i(nullPointerException);
        throw nullPointerException;
    }

    public static void m() {
        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
        i(kotlinNullPointerException);
        throw kotlinNullPointerException;
    }

    private static void n(String str) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(h(str));
        i(illegalArgumentException);
        throw illegalArgumentException;
    }

    private static void o(String str) {
        NullPointerException nullPointerException = new NullPointerException(h(str));
        i(nullPointerException);
        throw nullPointerException;
    }

    public static void p(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(str);
        i(uninitializedPropertyAccessException);
        throw uninitializedPropertyAccessException;
    }

    public static void q(String str) {
        p("lateinit property " + str + " has not been initialized");
        throw null;
    }
}
