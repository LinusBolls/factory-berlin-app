package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;
import kotlinx.coroutines.n0;

/* compiled from: InlineList.kt */
public final class j<E> {
    private final Object a;

    private /* synthetic */ j(Object obj) {
        this.a = obj;
    }

    public static Object a(Object obj) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        a(obj);
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof j) && k.a(obj, ((j) obj2).g());
    }

    public static int d(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static final Object e(Object obj, E e2) {
        if (n0.a() && !(!(e2 instanceof List))) {
            throw new AssertionError();
        } else if (obj == null) {
            a(e2);
            return e2;
        } else if (!(obj instanceof ArrayList)) {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(e2);
            a(arrayList);
            return arrayList;
        } else if (obj != null) {
            ((ArrayList) obj).add(e2);
            a(obj);
            return obj;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<E> /* = java.util.ArrayList<E> */");
        }
    }

    public static String f(Object obj) {
        return "InlineList(holder=" + obj + ")";
    }

    public boolean equals(Object obj) {
        return c(this.a, obj);
    }

    public final /* synthetic */ Object g() {
        return this.a;
    }

    public int hashCode() {
        return d(this.a);
    }

    public String toString() {
        return f(this.a);
    }
}
