package androidx.work.impl.k.f;

import android.content.Context;
import androidx.work.i;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: ConstraintTracker */
public abstract class d<T> {

    /* renamed from: f  reason: collision with root package name */
    private static final String f1710f = i.f("ConstraintTracker");
    protected final androidx.work.impl.utils.k.a a;
    protected final Context b;
    private final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Set<androidx.work.impl.k.a<T>> f1711d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    T f1712e;

    /* compiled from: ConstraintTracker */
    class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ List f1713g;

        a(List list) {
            this.f1713g = list;
        }

        public void run() {
            for (androidx.work.impl.k.a a : this.f1713g) {
                a.a(d.this.f1712e);
            }
        }
    }

    d(Context context, androidx.work.impl.utils.k.a aVar) {
        this.b = context.getApplicationContext();
        this.a = aVar;
    }

    public void a(androidx.work.impl.k.a<T> aVar) {
        synchronized (this.c) {
            if (this.f1711d.add(aVar)) {
                if (this.f1711d.size() == 1) {
                    this.f1712e = b();
                    i.c().a(f1710f, String.format("%s: initial state = %s", new Object[]{getClass().getSimpleName(), this.f1712e}), new Throwable[0]);
                    e();
                }
                aVar.a(this.f1712e);
            }
        }
    }

    public abstract T b();

    public void c(androidx.work.impl.k.a<T> aVar) {
        synchronized (this.c) {
            if (this.f1711d.remove(aVar) && this.f1711d.isEmpty()) {
                f();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(T r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.c
            monitor-enter(r0)
            T r1 = r3.f1712e     // Catch:{ all -> 0x002f }
            if (r1 == r4) goto L_0x002d
            T r1 = r3.f1712e     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0014
            T r1 = r3.f1712e     // Catch:{ all -> 0x002f }
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0014
            goto L_0x002d
        L_0x0014:
            r3.f1712e = r4     // Catch:{ all -> 0x002f }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x002f }
            java.util.Set<androidx.work.impl.k.a<T>> r1 = r3.f1711d     // Catch:{ all -> 0x002f }
            r4.<init>(r1)     // Catch:{ all -> 0x002f }
            androidx.work.impl.utils.k.a r1 = r3.a     // Catch:{ all -> 0x002f }
            java.util.concurrent.Executor r1 = r1.a()     // Catch:{ all -> 0x002f }
            androidx.work.impl.k.f.d$a r2 = new androidx.work.impl.k.f.d$a     // Catch:{ all -> 0x002f }
            r2.<init>(r4)     // Catch:{ all -> 0x002f }
            r1.execute(r2)     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x002f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.k.f.d.d(java.lang.Object):void");
    }

    public abstract void e();

    public abstract void f();
}
