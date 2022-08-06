package androidx.work.impl.background.gcm;

import android.content.Context;
import androidx.work.i;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.e;
import androidx.work.impl.h;
import java.util.concurrent.CountDownLatch;

/* compiled from: WorkManagerGcmDispatcher */
public class b {
    static final String b = i.f("WrkMgrGcmDispatcher");
    h a;

    /* compiled from: WorkManagerGcmDispatcher */
    class a implements Runnable {
        a() {
        }

        public void run() {
            i.c().a(b.b, "onInitializeTasks(): Rescheduling work", new Throwable[0]);
            b.this.a.y();
        }
    }

    /* renamed from: androidx.work.impl.background.gcm.b$b  reason: collision with other inner class name */
    /* compiled from: WorkManagerGcmDispatcher */
    static /* synthetic */ class C0043b {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.work.p[] r0 = androidx.work.p.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                androidx.work.p r1 = androidx.work.p.SUCCEEDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.work.p r1 = androidx.work.p.CANCELLED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.work.p r1 = androidx.work.p.FAILED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.gcm.b.C0043b.<clinit>():void");
        }
    }

    /* compiled from: WorkManagerGcmDispatcher */
    static class c implements androidx.work.impl.a {

        /* renamed from: j  reason: collision with root package name */
        private static final String f1597j = i.f("WorkSpecExecutionListener");

        /* renamed from: g  reason: collision with root package name */
        private final String f1598g;

        /* renamed from: h  reason: collision with root package name */
        private final CountDownLatch f1599h = new CountDownLatch(1);

        /* renamed from: i  reason: collision with root package name */
        private boolean f1600i = false;

        c(String str) {
            this.f1598g = str;
        }

        public void a(String str, boolean z) {
            if (!this.f1598g.equals(str)) {
                i.c().h(f1597j, String.format("Notified for %s, but was looking for %s", new Object[]{str, this.f1598g}), new Throwable[0]);
                return;
            }
            this.f1600i = z;
            this.f1599h.countDown();
        }

        /* access modifiers changed from: package-private */
        public CountDownLatch b() {
            return this.f1599h;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            return this.f1600i;
        }
    }

    public b(Context context) {
        this.a = h.q(context);
    }

    /* JADX INFO: finally extract failed */
    private int c(String str) {
        WorkDatabase u = this.a.u();
        u.c();
        try {
            u.F().e(str, -1);
            e.b(this.a.o(), this.a.u(), this.a.t());
            u.x();
            u.i();
            i.c().a(b, String.format("Returning RESULT_SUCCESS for WorkSpec %s", new Object[]{str}), new Throwable[0]);
            return 0;
        } catch (Throwable th) {
            u.i();
            throw th;
        }
    }

    public void a() {
        this.a.v().b(new a());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:30|31|32|33) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e0, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        androidx.work.i.c().a(b, java.lang.String.format("Rescheduling WorkSpec %s", new java.lang.Object[]{r11}), new java.lang.Throwable[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fc, code lost:
        return c(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fd, code lost:
        r4.e(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0100, code lost:
        throw r11;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00e2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int b(com.google.android.gms.gcm.d r11) {
        /*
            r10 = this;
            java.lang.String r0 = "Rescheduling WorkSpec %s"
            androidx.work.i r1 = androidx.work.i.c()
            java.lang.String r2 = b
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r11
            java.lang.String r6 = "Handling task %s"
            java.lang.String r4 = java.lang.String.format(r6, r4)
            java.lang.Throwable[] r6 = new java.lang.Throwable[r5]
            r1.a(r2, r4, r6)
            java.lang.String r11 = r11.a()
            r1 = 2
            if (r11 == 0) goto L_0x0101
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L_0x0028
            goto L_0x0101
        L_0x0028:
            androidx.work.impl.background.gcm.b$c r2 = new androidx.work.impl.background.gcm.b$c
            r2.<init>(r11)
            androidx.work.impl.h r4 = r10.a
            androidx.work.impl.c r4 = r4.s()
            r4.b(r2)
            androidx.work.impl.h r6 = r10.a
            r6.A(r11)
            java.util.concurrent.CountDownLatch r6 = r2.b()     // Catch:{ InterruptedException -> 0x00e2 }
            r7 = 10
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MINUTES     // Catch:{ InterruptedException -> 0x00e2 }
            r6.await(r7, r9)     // Catch:{ InterruptedException -> 0x00e2 }
            r4.e(r2)
            boolean r2 = r2.c()
            if (r2 == 0) goto L_0x0067
            androidx.work.i r1 = androidx.work.i.c()
            java.lang.String r2 = b
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r5] = r11
            java.lang.String r0 = java.lang.String.format(r0, r3)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
            r1.a(r2, r0, r3)
            int r11 = r10.c(r11)
            return r11
        L_0x0067:
            androidx.work.impl.h r0 = r10.a
            androidx.work.impl.WorkDatabase r0 = r0.u()
            androidx.work.impl.l.k r0 = r0.F()
            androidx.work.impl.l.j r0 = r0.j(r11)
            if (r0 == 0) goto L_0x007a
            androidx.work.p r0 = r0.b
            goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            if (r0 != 0) goto L_0x0093
            androidx.work.i r0 = androidx.work.i.c()
            java.lang.String r2 = b
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r5] = r11
            java.lang.String r11 = "WorkSpec %s does not exist"
            java.lang.String r11 = java.lang.String.format(r11, r3)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
            r0.a(r2, r11, r3)
            return r1
        L_0x0093:
            int[] r2 = androidx.work.impl.background.gcm.b.C0043b.a
            int r0 = r0.ordinal()
            r0 = r2[r0]
            if (r0 == r3) goto L_0x00ca
            if (r0 == r1) goto L_0x00ca
            r2 = 3
            if (r0 == r2) goto L_0x00b4
            androidx.work.i r0 = androidx.work.i.c()
            java.lang.String r1 = b
            java.lang.Throwable[] r2 = new java.lang.Throwable[r5]
            java.lang.String r3 = "Rescheduling eligible work."
            r0.a(r1, r3, r2)
            int r11 = r10.c(r11)
            return r11
        L_0x00b4:
            androidx.work.i r0 = androidx.work.i.c()
            java.lang.String r2 = b
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r5] = r11
            java.lang.String r11 = "Returning RESULT_FAILURE for WorkSpec %s"
            java.lang.String r11 = java.lang.String.format(r11, r3)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
            r0.a(r2, r11, r3)
            return r1
        L_0x00ca:
            androidx.work.i r0 = androidx.work.i.c()
            java.lang.String r1 = b
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r5] = r11
            java.lang.String r11 = "Returning RESULT_SUCCESS for WorkSpec %s"
            java.lang.String r11 = java.lang.String.format(r11, r2)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r5]
            r0.a(r1, r11, r2)
            return r5
        L_0x00e0:
            r11 = move-exception
            goto L_0x00fd
        L_0x00e2:
            androidx.work.i r1 = androidx.work.i.c()     // Catch:{ all -> 0x00e0 }
            java.lang.String r6 = b     // Catch:{ all -> 0x00e0 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00e0 }
            r3[r5] = r11     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = java.lang.String.format(r0, r3)     // Catch:{ all -> 0x00e0 }
            java.lang.Throwable[] r3 = new java.lang.Throwable[r5]     // Catch:{ all -> 0x00e0 }
            r1.a(r6, r0, r3)     // Catch:{ all -> 0x00e0 }
            int r11 = r10.c(r11)     // Catch:{ all -> 0x00e0 }
            r4.e(r2)
            return r11
        L_0x00fd:
            r4.e(r2)
            throw r11
        L_0x0101:
            androidx.work.i r11 = androidx.work.i.c()
            java.lang.String r0 = b
            java.lang.Throwable[] r2 = new java.lang.Throwable[r5]
            java.lang.String r3 = "Bad request. No workSpecId."
            r11.a(r0, r3, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.gcm.b.b(com.google.android.gms.gcm.d):int");
    }
}
