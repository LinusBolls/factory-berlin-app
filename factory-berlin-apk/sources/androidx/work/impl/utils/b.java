package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.work.c;
import androidx.work.e;
import androidx.work.i;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.d;
import androidx.work.impl.f;
import androidx.work.impl.h;
import androidx.work.impl.l.j;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.l;
import java.util.List;

/* compiled from: EnqueueRunnable */
public class b implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    private static final String f1749i = i.f("EnqueueRunnable");

    /* renamed from: g  reason: collision with root package name */
    private final f f1750g;

    /* renamed from: h  reason: collision with root package name */
    private final androidx.work.impl.b f1751h = new androidx.work.impl.b();

    public b(f fVar) {
        this.f1750g = fVar;
    }

    private static boolean b(f fVar) {
        boolean c = c(fVar.i(), fVar.h(), (String[]) f.n(fVar).toArray(new String[0]), fVar.f(), fVar.d());
        fVar.m();
        return c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01a8 A[LOOP:6: B:107:0x01a2->B:109:0x01a8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01d1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x015f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean c(androidx.work.impl.h r19, java.util.List<? extends androidx.work.r> r20, java.lang.String[] r21, java.lang.String r22, androidx.work.g r23) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = r23
            long r4 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r6 = r19.u()
            r8 = 1
            if (r1 == 0) goto L_0x0018
            int r9 = r1.length
            if (r9 <= 0) goto L_0x0018
            r9 = 1
            goto L_0x0019
        L_0x0018:
            r9 = 0
        L_0x0019:
            if (r9 == 0) goto L_0x005d
            int r10 = r1.length
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
        L_0x0020:
            if (r11 >= r10) goto L_0x0060
            r15 = r1[r11]
            androidx.work.impl.l.k r7 = r6.F()
            androidx.work.impl.l.j r7 = r7.j(r15)
            if (r7 != 0) goto L_0x0045
            androidx.work.i r0 = androidx.work.i.c()
            java.lang.String r1 = f1749i
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r3 = 0
            r2[r3] = r15
            java.lang.String r4 = "Prerequisite %s doesn't exist; not enqueuing"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r0.b(r1, r2, r4)
            return r3
        L_0x0045:
            androidx.work.p r7 = r7.b
            androidx.work.p r15 = androidx.work.p.SUCCEEDED
            if (r7 != r15) goto L_0x004d
            r15 = 1
            goto L_0x004e
        L_0x004d:
            r15 = 0
        L_0x004e:
            r12 = r12 & r15
            androidx.work.p r15 = androidx.work.p.FAILED
            if (r7 != r15) goto L_0x0055
            r13 = 1
            goto L_0x005a
        L_0x0055:
            androidx.work.p r15 = androidx.work.p.CANCELLED
            if (r7 != r15) goto L_0x005a
            r14 = 1
        L_0x005a:
            int r11 = r11 + 1
            goto L_0x0020
        L_0x005d:
            r12 = 1
            r13 = 0
            r14 = 0
        L_0x0060:
            boolean r7 = android.text.TextUtils.isEmpty(r22)
            r7 = r7 ^ r8
            if (r7 == 0) goto L_0x006b
            if (r9 != 0) goto L_0x006b
            r10 = 1
            goto L_0x006c
        L_0x006b:
            r10 = 0
        L_0x006c:
            if (r10 == 0) goto L_0x00cc
            androidx.work.impl.l.k r10 = r6.F()
            java.util.List r10 = r10.g(r2)
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x00cc
            androidx.work.g r11 = androidx.work.g.APPEND
            if (r3 != r11) goto L_0x00ce
            androidx.work.impl.l.b r3 = r6.z()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x008d:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00c0
            java.lang.Object r11 = r10.next()
            androidx.work.impl.l.j$a r11 = (androidx.work.impl.l.j.a) r11
            java.lang.String r15 = r11.a
            boolean r15 = r3.c(r15)
            if (r15 != 0) goto L_0x00be
            androidx.work.p r15 = r11.b
            androidx.work.p r8 = androidx.work.p.SUCCEEDED
            if (r15 != r8) goto L_0x00a9
            r8 = 1
            goto L_0x00aa
        L_0x00a9:
            r8 = 0
        L_0x00aa:
            r8 = r8 & r12
            androidx.work.p r12 = r11.b
            androidx.work.p r15 = androidx.work.p.FAILED
            if (r12 != r15) goto L_0x00b3
            r13 = 1
            goto L_0x00b8
        L_0x00b3:
            androidx.work.p r15 = androidx.work.p.CANCELLED
            if (r12 != r15) goto L_0x00b8
            r14 = 1
        L_0x00b8:
            java.lang.String r11 = r11.a
            r9.add(r11)
            r12 = r8
        L_0x00be:
            r8 = 1
            goto L_0x008d
        L_0x00c0:
            java.lang.Object[] r1 = r9.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r3 = r1.length
            if (r3 <= 0) goto L_0x00cb
            r9 = 1
            goto L_0x00cc
        L_0x00cb:
            r9 = 0
        L_0x00cc:
            r3 = 0
            goto L_0x0113
        L_0x00ce:
            androidx.work.g r8 = androidx.work.g.KEEP
            if (r3 != r8) goto L_0x00ee
            java.util.Iterator r3 = r10.iterator()
        L_0x00d6:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x00ee
            java.lang.Object r8 = r3.next()
            androidx.work.impl.l.j$a r8 = (androidx.work.impl.l.j.a) r8
            androidx.work.p r8 = r8.b
            androidx.work.p r11 = androidx.work.p.ENQUEUED
            if (r8 == r11) goto L_0x00ec
            androidx.work.p r11 = androidx.work.p.RUNNING
            if (r8 != r11) goto L_0x00d6
        L_0x00ec:
            r3 = 0
            return r3
        L_0x00ee:
            r3 = 0
            androidx.work.impl.utils.a r8 = androidx.work.impl.utils.a.b(r2, r0, r3)
            r8.run()
            androidx.work.impl.l.k r8 = r6.F()
            java.util.Iterator r10 = r10.iterator()
        L_0x00fe:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0110
            java.lang.Object r11 = r10.next()
            androidx.work.impl.l.j$a r11 = (androidx.work.impl.l.j.a) r11
            java.lang.String r11 = r11.a
            r8.a(r11)
            goto L_0x00fe
        L_0x0110:
            r16 = 1
            goto L_0x0115
        L_0x0113:
            r16 = 0
        L_0x0115:
            java.util.Iterator r8 = r20.iterator()
        L_0x0119:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x01d6
            java.lang.Object r10 = r8.next()
            androidx.work.r r10 = (androidx.work.r) r10
            androidx.work.impl.l.j r11 = r10.d()
            if (r9 == 0) goto L_0x0140
            if (r12 != 0) goto L_0x0140
            if (r13 == 0) goto L_0x0134
            androidx.work.p r15 = androidx.work.p.FAILED
            r11.b = r15
            goto L_0x0148
        L_0x0134:
            if (r14 == 0) goto L_0x013b
            androidx.work.p r15 = androidx.work.p.CANCELLED
            r11.b = r15
            goto L_0x0148
        L_0x013b:
            androidx.work.p r15 = androidx.work.p.BLOCKED
            r11.b = r15
            goto L_0x0148
        L_0x0140:
            boolean r15 = r11.d()
            if (r15 != 0) goto L_0x014b
            r11.f1732n = r4
        L_0x0148:
            r17 = r4
            goto L_0x0151
        L_0x014b:
            r17 = r4
            r3 = 0
            r11.f1732n = r3
        L_0x0151:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r3 < r4) goto L_0x015f
            r4 = 25
            if (r3 > r4) goto L_0x015f
            g(r11)
            goto L_0x0170
        L_0x015f:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 22
            if (r3 > r4) goto L_0x0170
            java.lang.String r3 = "androidx.work.impl.background.gcm.GcmScheduler"
            boolean r3 = h(r0, r3)
            if (r3 == 0) goto L_0x0170
            g(r11)
        L_0x0170:
            androidx.work.p r3 = r11.b
            androidx.work.p r4 = androidx.work.p.ENQUEUED
            if (r3 != r4) goto L_0x0178
            r16 = 1
        L_0x0178:
            androidx.work.impl.l.k r3 = r6.F()
            r3.l(r11)
            if (r9 == 0) goto L_0x019a
            int r3 = r1.length
            r4 = 0
        L_0x0183:
            if (r4 >= r3) goto L_0x019a
            r5 = r1[r4]
            androidx.work.impl.l.a r11 = new androidx.work.impl.l.a
            java.lang.String r15 = r10.b()
            r11.<init>(r15, r5)
            androidx.work.impl.l.b r5 = r6.z()
            r5.a(r11)
            int r4 = r4 + 1
            goto L_0x0183
        L_0x019a:
            java.util.Set r3 = r10.c()
            java.util.Iterator r3 = r3.iterator()
        L_0x01a2:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01bf
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            androidx.work.impl.l.n r5 = r6.G()
            androidx.work.impl.l.m r11 = new androidx.work.impl.l.m
            java.lang.String r15 = r10.b()
            r11.<init>(r4, r15)
            r5.a(r11)
            goto L_0x01a2
        L_0x01bf:
            if (r7 == 0) goto L_0x01d1
            androidx.work.impl.l.h r3 = r6.E()
            androidx.work.impl.l.g r4 = new androidx.work.impl.l.g
            java.lang.String r5 = r10.b()
            r4.<init>(r2, r5)
            r3.a(r4)
        L_0x01d1:
            r4 = r17
            r3 = 0
            goto L_0x0119
        L_0x01d6:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.b.c(androidx.work.impl.h, java.util.List, java.lang.String[], java.lang.String, androidx.work.g):boolean");
    }

    private static boolean e(f fVar) {
        List<f> g2 = fVar.g();
        boolean z = false;
        if (g2 != null) {
            boolean z2 = false;
            for (f next : g2) {
                if (!next.l()) {
                    z2 |= e(next);
                } else {
                    i.c().h(f1749i, String.format("Already enqueued work ids (%s).", new Object[]{TextUtils.join(", ", next.e())}), new Throwable[0]);
                }
            }
            z = z2;
        }
        return b(fVar) | z;
    }

    private static void g(j jVar) {
        c cVar = jVar.f1728j;
        if (cVar.f() || cVar.i()) {
            String str = jVar.c;
            e.a aVar = new e.a();
            aVar.c(jVar.f1723e);
            aVar.f("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            jVar.c = ConstraintTrackingWorker.class.getName();
            jVar.f1723e = aVar.a();
        }
    }

    private static boolean h(h hVar, String str) {
        try {
            Class<?> cls = Class.forName(str);
            for (d dVar : hVar.t()) {
                if (cls.isAssignableFrom(dVar.getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    public boolean a() {
        WorkDatabase u = this.f1750g.i().u();
        u.c();
        try {
            boolean e2 = e(this.f1750g);
            u.x();
            return e2;
        } finally {
            u.i();
        }
    }

    public l d() {
        return this.f1751h;
    }

    public void f() {
        h i2 = this.f1750g.i();
        androidx.work.impl.e.b(i2.o(), i2.u(), i2.t());
    }

    public void run() {
        try {
            if (!this.f1750g.j()) {
                if (a()) {
                    d.a(this.f1750g.i().n(), RescheduleReceiver.class, true);
                    f();
                }
                this.f1751h.a(l.a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[]{this.f1750g}));
        } catch (Throwable th) {
            this.f1751h.a(new l.b.a(th));
        }
    }
}
