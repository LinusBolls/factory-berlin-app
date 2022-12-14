package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.i;

@i(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u001b\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\fJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000@\u0001X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/TimeoutCancellationException;", "Lkotlinx/coroutines/b0;", "Ljava/util/concurrent/CancellationException;", "createCopy", "()Lkotlinx/coroutines/TimeoutCancellationException;", "Lkotlinx/coroutines/Job;", "coroutine", "Lkotlinx/coroutines/Job;", "", "message", "<init>", "(Ljava/lang/String;)V", "(Ljava/lang/String;Lkotlinx/coroutines/Job;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: Timeout.kt */
public final class TimeoutCancellationException extends CancellationException implements b0<TimeoutCancellationException> {

    /* renamed from: g  reason: collision with root package name */
    public final x1 f10711g;

    public TimeoutCancellationException(String str, x1 x1Var) {
        super(str);
        this.f10711g = x1Var;
    }

    /* renamed from: b */
    public TimeoutCancellationException a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.f10711g);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }
}
