package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlin.i;
import kotlinx.coroutines.e3.d;
import kotlinx.coroutines.n0;

@i(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001d\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/flow/internal/AbortFlowException;", "Ljava/util/concurrent/CancellationException;", "", "fillInStackTrace", "()Ljava/lang/Throwable;", "Lkotlinx/coroutines/flow/FlowCollector;", "owner", "Lkotlinx/coroutines/flow/FlowCollector;", "getOwner", "()Lkotlinx/coroutines/flow/FlowCollector;", "<init>", "(Lkotlinx/coroutines/flow/FlowCollector;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: FlowExceptions.kt */
public final class AbortFlowException extends CancellationException {
    public AbortFlowException(d<?> dVar) {
        super("Flow was aborted, no more elements needed");
    }

    public Throwable fillInStackTrace() {
        if (n0.c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
