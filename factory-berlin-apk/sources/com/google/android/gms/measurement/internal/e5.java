package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.db;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class e5<V> extends FutureTask<V> implements Comparable<e5<V>> {

    /* renamed from: g  reason: collision with root package name */
    private final long f2805g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f2806h;

    /* renamed from: i  reason: collision with root package name */
    private final String f2807i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ a5 f2808j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    e5(a5 a5Var, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.f2808j = a5Var;
        db.a().a(callable);
        r.k(str);
        long andIncrement = a5.f2707l.getAndIncrement();
        this.f2805g = andIncrement;
        this.f2807i = str;
        this.f2806h = z;
        if (andIncrement == Long.MAX_VALUE) {
            a5Var.i().E().a("Tasks index overflow");
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        e5 e5Var = (e5) obj;
        boolean z = this.f2806h;
        if (z != e5Var.f2806h) {
            return z ? -1 : 1;
        }
        long j2 = this.f2805g;
        long j3 = e5Var.f2805g;
        if (j2 < j3) {
            return -1;
        }
        if (j2 > j3) {
            return 1;
        }
        this.f2808j.i().F().b("Two tasks share the same index. index", Long.valueOf(this.f2805g));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.f2808j.i().E().b(this.f2807i, th);
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    e5(a5 a5Var, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.f2808j = a5Var;
        db.a().b(runnable);
        r.k(str);
        long andIncrement = a5.f2707l.getAndIncrement();
        this.f2805g = andIncrement;
        this.f2807i = str;
        this.f2806h = z;
        if (andIncrement == Long.MAX_VALUE) {
            a5Var.i().E().a("Tasks index overflow");
        }
    }
}
