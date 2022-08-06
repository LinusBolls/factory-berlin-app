package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import kotlin.TypeCastException;
import kotlin.c0.j.a.e;
import kotlin.j;
import kotlin.k;
import kotlin.l;
import kotlin.n;
import kotlinx.coroutines.n0;

/* compiled from: StackTraceRecovery.kt */
public final class w {
    private static final String a;
    private static final String b;

    static {
        Object obj;
        Object obj2;
        try {
            k.a aVar = k.f10687h;
            obj = Class.forName("kotlin.c0.j.a.a").getCanonicalName();
            k.a(obj);
        } catch (Throwable th) {
            k.a aVar2 = k.f10687h;
            obj = l.a(th);
            k.a(obj);
        }
        if (k.c(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        a = (String) obj;
        try {
            k.a aVar3 = k.f10687h;
            obj2 = Class.forName("kotlinx.coroutines.internal.w").getCanonicalName();
            k.a(obj2);
        } catch (Throwable th2) {
            k.a aVar4 = k.f10687h;
            obj2 = l.a(th2);
            k.a(obj2);
        }
        if (k.c(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        b = (String) obj2;
    }

    public static final StackTraceElement b(String str) {
        return new StackTraceElement("\b\b\b(" + str, "\b", "\b", -1);
    }

    private static final <E extends Throwable> j<E, StackTraceElement[]> c(E e2) {
        boolean z;
        Throwable cause = e2.getCause();
        if (cause == null || !kotlin.jvm.internal.k.a(cause.getClass(), e2.getClass())) {
            return n.a(e2, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int length = stackTrace.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            } else if (h(stackTrace[i2])) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            return n.a(cause, stackTrace);
        }
        return n.a(e2, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E d(E e2, E e3, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(b("Coroutine boundary"));
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int g2 = g(stackTrace, a);
        int i2 = 0;
        if (g2 == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            if (array != null) {
                e3.setStackTrace((StackTraceElement[]) array);
                return e3;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[(arrayDeque.size() + g2)];
        for (int i3 = 0; i3 < g2; i3++) {
            stackTraceElementArr[i3] = stackTrace[i3];
        }
        for (StackTraceElement stackTraceElement : arrayDeque) {
            stackTraceElementArr[g2 + i2] = stackTraceElement;
            i2++;
        }
        e3.setStackTrace(stackTraceElementArr);
        return e3;
    }

    private static final ArrayDeque<StackTraceElement> e(e eVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement C = eVar.C();
        if (C != null) {
            arrayDeque.add(C);
        }
        while (true) {
            if (!(eVar instanceof e)) {
                eVar = null;
            }
            if (eVar == null || (eVar = eVar.j()) == null) {
                return arrayDeque;
            }
            StackTraceElement C2 = eVar.C();
            if (C2 != null) {
                arrayDeque.add(C2);
            }
        }
        return arrayDeque;
    }

    private static final boolean f(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && kotlin.jvm.internal.k.a(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && kotlin.jvm.internal.k.a(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && kotlin.jvm.internal.k.a(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int g(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (kotlin.jvm.internal.k.a(str, stackTraceElementArr[i2].getClassName())) {
                return i2;
            }
        }
        return -1;
    }

    public static final boolean h(StackTraceElement stackTraceElement) {
        return p.D(stackTraceElement.getClassName(), "\b\b\b", false, 2, (Object) null);
    }

    private static final void i(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (h(stackTraceElementArr[i2])) {
                break;
            } else {
                i2++;
            }
        }
        int i3 = i2 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (length2 >= i3) {
            while (true) {
                if (f(stackTraceElementArr[length2], arrayDeque.getLast())) {
                    arrayDeque.removeLast();
                }
                arrayDeque.addFirst(stackTraceElementArr[length2]);
                if (length2 != i3) {
                    length2--;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final <E extends Throwable> E j(E e2, e eVar) {
        j c = c(e2);
        E e3 = (Throwable) c.a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c.b();
        E e4 = g.e(e3);
        if (e4 == null || (!kotlin.jvm.internal.k.a(e4.getMessage(), e3.getMessage()))) {
            return e2;
        }
        ArrayDeque<StackTraceElement> e5 = e(eVar);
        if (e5.isEmpty()) {
            return e2;
        }
        if (e3 != e2) {
            i(stackTraceElementArr, e5);
        }
        d(e3, e4, e5);
        return e4;
    }

    public static final <E extends Throwable> E k(E e2) {
        E e3;
        if (!n0.d() || (e3 = g.e(e2)) == null) {
            return e2;
        }
        l(e3);
        return e3;
    }

    private static final <E extends Throwable> E l(E e2) {
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int length = stackTrace.length;
        int g2 = g(stackTrace, b);
        int i2 = g2 + 1;
        int g3 = g(stackTrace, a);
        int i3 = (length - g2) - (g3 == -1 ? 0 : length - g3);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 == 0) {
                stackTraceElement = b("Coroutine boundary");
            } else {
                stackTraceElement = stackTrace[(i2 + i4) - 1];
            }
            stackTraceElementArr[i4] = stackTraceElement;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    public static final <E extends Throwable> E m(E e2) {
        E cause = e2.getCause();
        if (cause != null) {
            boolean z = true;
            if (!(!kotlin.jvm.internal.k.a(cause.getClass(), e2.getClass()))) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                int length = stackTrace.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    } else if (h(stackTrace[i2])) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z) {
                    return cause;
                }
            }
        }
        return e2;
    }
}
