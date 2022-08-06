package kotlinx.coroutines.internal;

import kotlin.TypeCastException;

/* compiled from: LockFreeLinkedList.kt */
public final class l {
    private static final Object a = new x("CONDITION_FALSE");
    private static final Object b = new x("LIST_EMPTY");

    public static final Object a() {
        return a;
    }

    public static final Object b() {
        return b;
    }

    public static final m c(Object obj) {
        m mVar;
        u uVar = (u) (!(obj instanceof u) ? null : obj);
        if (uVar != null && (mVar = uVar.a) != null) {
            return mVar;
        }
        if (obj != null) {
            return (m) obj;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }
}
