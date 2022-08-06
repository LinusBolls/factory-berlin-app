package g.e.n.a;

import g.e.h.b.c;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;

/* compiled from: ScannerRestrictionImpl.kt */
public final class f implements e {

    /* renamed from: d  reason: collision with root package name */
    private static final long f9940d = TimeUnit.SECONDS.toMillis((long) 30);

    /* renamed from: e  reason: collision with root package name */
    private static final long f9941e = TimeUnit.SECONDS.toMillis((long) 2);
    private final Queue<Long> a = new ArrayBlockingQueue(5);
    private final c.a b;
    private final g.e.p.c.a c;

    /* compiled from: ScannerRestrictionImpl.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public f(c.a aVar, g.e.p.c.a aVar2) {
        k.e(aVar, "timeProvider");
        k.e(aVar2, "buildVersionProvider");
        this.b = aVar;
        this.c = aVar2;
    }

    private final void c() {
        if (this.a.size() <= 5) {
            if (this.a.size() == 5) {
                this.a.poll();
            }
            n.a.a.a("requestScan", new Object[0]);
            this.a.offer(Long.valueOf(this.b.a()));
            n.a.a.a("number of scans: " + this.a.size(), new Object[0]);
            return;
        }
        throw new IllegalStateException("queue size exceeded");
    }

    public g a() {
        if (this.c.a() < 24) {
            n.a.a.a("allowed, pre Nougat", new Object[0]);
            return new g(true, 0, 2, (DefaultConstructorMarker) null);
        } else if (this.a.size() < 5) {
            n.a.a.a("allowed, limit by number not reached yet", new Object[0]);
            return new g(true, 0, 2, (DefaultConstructorMarker) null);
        } else {
            Long peek = this.a.peek();
            k.d(peek, "scanLimitQueue.peek()");
            long a2 = this.b.a() - peek.longValue();
            n.a.a.a("seconds since first scan: " + TimeUnit.MILLISECONDS.toSeconds(a2), new Object[0]);
            boolean z = a2 > f9940d;
            n.a.a.a("allowed=" + z, new Object[0]);
            return new g(z, (f9940d - a2) + f9941e);
        }
    }

    public void b() {
        c();
    }
}
