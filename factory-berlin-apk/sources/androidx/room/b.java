package androidx.room;

import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.p1;

/* compiled from: CoroutinesRoom.kt */
public final class b {
    public static final d0 a(l lVar) {
        k.f(lVar, "$this$queryDispatcher");
        Map<String, Object> j2 = lVar.j();
        k.b(j2, "backingFieldMap");
        Object obj = j2.get("QueryDispatcher");
        if (obj == null) {
            Executor n2 = lVar.n();
            k.b(n2, "queryExecutor");
            obj = p1.a(n2);
            j2.put("QueryDispatcher", obj);
        }
        if (obj != null) {
            return (d0) obj;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
    }

    public static final d0 b(l lVar) {
        k.f(lVar, "$this$transactionDispatcher");
        Map<String, Object> j2 = lVar.j();
        k.b(j2, "backingFieldMap");
        Object obj = j2.get("TransactionDispatcher");
        if (obj == null) {
            Executor o = lVar.o();
            k.b(o, "transactionExecutor");
            obj = p1.a(o);
            j2.put("TransactionDispatcher", obj);
        }
        if (obj != null) {
            return (d0) obj;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
    }
}
