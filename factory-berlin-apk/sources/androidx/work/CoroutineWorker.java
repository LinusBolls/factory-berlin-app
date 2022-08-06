package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.j.c;
import kotlin.c0.d;
import kotlin.c0.g;
import kotlin.c0.j.a.f;
import kotlin.c0.j.a.k;
import kotlin.e0.c.p;
import kotlin.i;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.x1;

@i(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0016@\u0017X\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\u00020\u00168\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Landroidx/work/ListenableWorker$Result;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "onStopped", "()V", "Lcom/google/common/util/concurrent/ListenableFuture;", "startWork", "()Lcom/google/common/util/concurrent/ListenableFuture;", "Lkotlinx/coroutines/CoroutineDispatcher;", "coroutineContext", "Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineContext", "()Lkotlinx/coroutines/CoroutineDispatcher;", "coroutineContext$annotations", "Landroidx/work/impl/utils/futures/SettableFuture;", "future", "Landroidx/work/impl/utils/futures/SettableFuture;", "getFuture$work_runtime_ktx_release", "()Landroidx/work/impl/utils/futures/SettableFuture;", "Lkotlinx/coroutines/Job;", "job", "Lkotlinx/coroutines/Job;", "getJob$work_runtime_ktx_release", "()Lkotlinx/coroutines/Job;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: CoroutineWorker.kt */
public abstract class CoroutineWorker extends ListenableWorker {

    /* renamed from: j  reason: collision with root package name */
    private final x1 f1547j = c2.d((x1) null, 1, (Object) null);

    /* renamed from: k  reason: collision with root package name */
    private final c<ListenableWorker.a> f1548k;

    /* renamed from: l  reason: collision with root package name */
    private final d0 f1549l;

    /* compiled from: CoroutineWorker.kt */
    static final class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ CoroutineWorker f1550g;

        a(CoroutineWorker coroutineWorker) {
            this.f1550g = coroutineWorker;
        }

        public final void run() {
            if (this.f1550g.q().isCancelled()) {
                this.f1550g.r().cancel();
            }
        }
    }

    @f(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {68}, m = "invokeSuspend")
    /* compiled from: CoroutineWorker.kt */
    static final class b extends k implements p<i0, d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f1551k;

        /* renamed from: l  reason: collision with root package name */
        Object f1552l;

        /* renamed from: m  reason: collision with root package name */
        int f1553m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ CoroutineWorker f1554n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CoroutineWorker coroutineWorker, d dVar) {
            super(2, dVar);
            this.f1554n = coroutineWorker;
        }

        public final d<x> b(Object obj, d<?> dVar) {
            kotlin.jvm.internal.k.f(dVar, "completion");
            b bVar = new b(this.f1554n, dVar);
            bVar.f1551k = (i0) obj;
            return bVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f1553m;
            if (i2 == 0) {
                l.b(obj);
                i0 i0Var = this.f1551k;
                CoroutineWorker coroutineWorker = this.f1554n;
                this.f1552l = i0Var;
                this.f1553m = 1;
                obj = coroutineWorker.o(this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0 i0Var2 = (i0) this.f1552l;
                try {
                    l.b(obj);
                } catch (Throwable th) {
                    this.f1554n.q().q(th);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f1554n.q().p((ListenableWorker.a) obj);
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((b) b(obj, (d) obj2)).i(x.a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.k.f(context, "appContext");
        kotlin.jvm.internal.k.f(workerParameters, "params");
        c<ListenableWorker.a> t = c.t();
        kotlin.jvm.internal.k.b(t, "SettableFuture.create()");
        this.f1548k = t;
        a aVar = new a(this);
        androidx.work.impl.utils.k.a g2 = g();
        kotlin.jvm.internal.k.b(g2, "taskExecutor");
        t.a(aVar, g2.c());
        this.f1549l = a1.a();
    }

    public final void j() {
        super.j();
        this.f1548k.cancel(false);
    }

    public final g.b.b.a.a.a<ListenableWorker.a> l() {
        x1 unused = e.b(j0.a(p().plus(this.f1547j)), (g) null, (l0) null, new b(this, (d) null), 3, (Object) null);
        return this.f1548k;
    }

    public abstract Object o(d<? super ListenableWorker.a> dVar);

    public d0 p() {
        return this.f1549l;
    }

    public final c<ListenableWorker.a> q() {
        return this.f1548k;
    }

    public final x1 r() {
        return this.f1547j;
    }
}
