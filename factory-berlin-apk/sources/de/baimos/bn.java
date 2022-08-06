package de.baimos;

import de.baimos.core.util.filter.ConnectionFilter;
import de.baimos.core.util.filter.b;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

public abstract class bn implements bp {
    /* access modifiers changed from: private */
    public static final dr a = ds.a(bn.class);
    private long b = Long.MAX_VALUE;
    private Vector c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f8242d = false;

    private b b(cm cmVar) {
        return new b(cmVar, this.c, false);
    }

    /* access modifiers changed from: protected */
    public abstract cm a();

    public void a(long j2) {
        if (j2 >= 0) {
            this.b = j2;
            return;
        }
        throw new IllegalArgumentException("timeout must not be negative!");
    }

    /* access modifiers changed from: protected */
    public void a(final cm cmVar) {
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                boolean unused = bn.this.f8242d = true;
                cm cmVar = cmVar;
                if (cmVar instanceof b) {
                    b bVar = (b) cmVar;
                    if (!bVar.f()) {
                        bn.a.b("connection timed out - closing connection");
                        bVar.d();
                    }
                } else {
                    cmVar.d();
                }
                timer.cancel();
            }
        }, this.b);
    }

    public void a(ConnectionFilter connectionFilter) {
        if (this.c == null) {
            this.c = new Vector();
        }
        this.c.addElement(connectionFilter);
    }

    public boolean f() {
        return this.f8242d;
    }

    public long g() {
        return this.b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0018  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized de.baimos.cm h() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.Vector r0 = r6.c     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x0010
            java.util.Vector r0 = r6.c     // Catch:{ all -> 0x0030 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x000e
            goto L_0x0010
        L_0x000e:
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r0 == 0) goto L_0x0018
            de.baimos.cm r0 = r6.a()     // Catch:{ all -> 0x0030 }
            goto L_0x0020
        L_0x0018:
            de.baimos.cm r0 = r6.a()     // Catch:{ all -> 0x0030 }
            de.baimos.core.util.filter.b r0 = r6.b(r0)     // Catch:{ all -> 0x0030 }
        L_0x0020:
            long r1 = r6.b     // Catch:{ all -> 0x0030 }
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x002e
            r6.a((de.baimos.cm) r0)     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r6)
            return r0
        L_0x0030:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: de.baimos.bn.h():de.baimos.cm");
    }
}
