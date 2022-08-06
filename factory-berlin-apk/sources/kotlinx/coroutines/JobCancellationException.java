package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0016\u001a\u00020\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0000@\u0001X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Lkotlinx/coroutines/b0;", "Ljava/util/concurrent/CancellationException;", "createCopy", "()Lkotlinx/coroutines/JobCancellationException;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "fillInStackTrace", "()Ljava/lang/Throwable;", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/Job;", "job", "Lkotlinx/coroutines/Job;", "message", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlinx/coroutines/Job;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: Exceptions.kt */
public final class JobCancellationException extends CancellationException implements b0<JobCancellationException> {

    /* renamed from: g  reason: collision with root package name */
    public final x1 f10710g;

    public JobCancellationException(String str, Throwable th, x1 x1Var) {
        super(str);
        this.f10710g = x1Var;
        if (th != null) {
            initCause(th);
        }
    }

    /* renamed from: b */
    public JobCancellationException a() {
        if (!n0.c()) {
            return null;
        }
        String message = getMessage();
        if (message != null) {
            return new JobCancellationException(message, this, this.f10710g);
        }
        k.m();
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!k.a(jobCancellationException.getMessage(), getMessage()) || !k.a(jobCancellationException.f10710g, this.f10710g) || !k.a(jobCancellationException.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        if (n0.c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        if (message != null) {
            int hashCode = ((message.hashCode() * 31) + this.f10710g.hashCode()) * 31;
            Throwable cause = getCause();
            return hashCode + (cause != null ? cause.hashCode() : 0);
        }
        k.m();
        throw null;
    }

    public String toString() {
        return super.toString() + "; job=" + this.f10710g;
    }
}
