package androidx.room;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import androidx.room.i;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: RoomTrackingLiveData */
class p<T> extends LiveData<T> {
    final l q;
    final boolean r;
    final Callable<T> s;
    private final h t;
    final i.c u;
    final AtomicBoolean v = new AtomicBoolean(true);
    final AtomicBoolean w = new AtomicBoolean(false);
    final AtomicBoolean x = new AtomicBoolean(false);
    final Runnable y = new a();
    final Runnable z = new b();

    /* compiled from: RoomTrackingLiveData */
    class a implements Runnable {
        a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                androidx.room.p r0 = androidx.room.p.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.x
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L_0x001b
                androidx.room.p r0 = androidx.room.p.this
                androidx.room.l r0 = r0.q
                androidx.room.i r0 = r0.l()
                androidx.room.p r3 = androidx.room.p.this
                androidx.room.i$c r3 = r3.u
                r0.b(r3)
            L_0x001b:
                androidx.room.p r0 = androidx.room.p.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.w
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L_0x005c
                r0 = 0
                r3 = 0
            L_0x0027:
                androidx.room.p r4 = androidx.room.p.this     // Catch:{ all -> 0x0053 }
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.v     // Catch:{ all -> 0x0053 }
                boolean r4 = r4.compareAndSet(r2, r1)     // Catch:{ all -> 0x0053 }
                if (r4 == 0) goto L_0x0044
                androidx.room.p r0 = androidx.room.p.this     // Catch:{ Exception -> 0x003b }
                java.util.concurrent.Callable<T> r0 = r0.s     // Catch:{ Exception -> 0x003b }
                java.lang.Object r0 = r0.call()     // Catch:{ Exception -> 0x003b }
                r3 = 1
                goto L_0x0027
            L_0x003b:
                r0 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0053 }
                java.lang.String r3 = "Exception while computing database live data."
                r2.<init>(r3, r0)     // Catch:{ all -> 0x0053 }
                throw r2     // Catch:{ all -> 0x0053 }
            L_0x0044:
                if (r3 == 0) goto L_0x004b
                androidx.room.p r4 = androidx.room.p.this     // Catch:{ all -> 0x0053 }
                r4.s(r0)     // Catch:{ all -> 0x0053 }
            L_0x004b:
                androidx.room.p r0 = androidx.room.p.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.w
                r0.set(r1)
                goto L_0x005d
            L_0x0053:
                r0 = move-exception
                androidx.room.p r2 = androidx.room.p.this
                java.util.concurrent.atomic.AtomicBoolean r2 = r2.w
                r2.set(r1)
                throw r0
            L_0x005c:
                r3 = 0
            L_0x005d:
                if (r3 == 0) goto L_0x0069
                androidx.room.p r0 = androidx.room.p.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.v
                boolean r0 = r0.get()
                if (r0 != 0) goto L_0x001b
            L_0x0069:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.p.a.run():void");
        }
    }

    /* compiled from: RoomTrackingLiveData */
    class b implements Runnable {
        b() {
        }

        public void run() {
            boolean n2 = p.this.n();
            if (p.this.v.compareAndSet(false, true) && n2) {
                p.this.w().execute(p.this.y);
            }
        }
    }

    /* compiled from: RoomTrackingLiveData */
    class c extends i.c {
        c(String[] strArr) {
            super(strArr);
        }

        public void b(Set<String> set) {
            e.b.a.a.a.f().b(p.this.z);
        }
    }

    @SuppressLint({"RestrictedApi"})
    p(l lVar, h hVar, boolean z2, Callable<T> callable, String[] strArr) {
        this.q = lVar;
        this.r = z2;
        this.s = callable;
        this.t = hVar;
        this.u = new c(strArr);
    }

    /* access modifiers changed from: protected */
    public void q() {
        super.q();
        this.t.b(this);
        w().execute(this.y);
    }

    /* access modifiers changed from: protected */
    public void r() {
        super.r();
        this.t.c(this);
    }

    /* access modifiers changed from: package-private */
    public Executor w() {
        if (this.r) {
            return this.q.o();
        }
        return this.q.n();
    }
}
