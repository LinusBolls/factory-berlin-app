package com.google.firebase.crashlytics.d.o;

import com.google.firebase.crashlytics.d.h.t;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ReportUploader */
public class b {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final short[] f4102h = {10, 20, 30, 60, 120, 300};
    private final com.google.firebase.crashlytics.d.o.d.b a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final t f4103d;

    /* renamed from: e  reason: collision with root package name */
    private final a f4104e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final a f4105f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public Thread f4106g;

    /* compiled from: ReportUploader */
    public interface a {
        boolean a();
    }

    /* renamed from: com.google.firebase.crashlytics.d.o.b$b  reason: collision with other inner class name */
    /* compiled from: ReportUploader */
    public interface C0109b {
        b a(com.google.firebase.crashlytics.d.q.i.b bVar);
    }

    /* compiled from: ReportUploader */
    public interface c {
        File[] a();

        File[] b();
    }

    /* compiled from: ReportUploader */
    private class d extends com.google.firebase.crashlytics.d.h.d {

        /* renamed from: g  reason: collision with root package name */
        private final List<com.google.firebase.crashlytics.d.o.c.c> f4107g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f4108h;

        /* renamed from: i  reason: collision with root package name */
        private final float f4109i;

        d(List<com.google.firebase.crashlytics.d.o.c.c> list, boolean z, float f2) {
            this.f4107g = list;
            this.f4108h = z;
            this.f4109i = f2;
        }

        private void b(List<com.google.firebase.crashlytics.d.o.c.c> list, boolean z) {
            com.google.firebase.crashlytics.d.b f2 = com.google.firebase.crashlytics.d.b.f();
            f2.b("Starting report processing in " + this.f4109i + " second(s)...");
            float f3 = this.f4109i;
            if (f3 > 0.0f) {
                try {
                    Thread.sleep((long) (f3 * 1000.0f));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (!b.this.f4105f.a()) {
                int i2 = 0;
                while (list.size() > 0 && !b.this.f4105f.a()) {
                    com.google.firebase.crashlytics.d.b f4 = com.google.firebase.crashlytics.d.b.f();
                    f4.b("Attempting to send " + list.size() + " report(s)");
                    ArrayList arrayList = new ArrayList();
                    for (com.google.firebase.crashlytics.d.o.c.c next : list) {
                        if (!b.this.d(next, z)) {
                            arrayList.add(next);
                        }
                    }
                    if (arrayList.size() > 0) {
                        int i3 = i2 + 1;
                        long j2 = (long) b.f4102h[Math.min(i2, b.f4102h.length - 1)];
                        com.google.firebase.crashlytics.d.b f5 = com.google.firebase.crashlytics.d.b.f();
                        f5.b("Report submission: scheduling delayed retry in " + j2 + " seconds");
                        try {
                            Thread.sleep(j2 * 1000);
                            i2 = i3;
                        } catch (InterruptedException unused2) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    list = arrayList;
                }
            }
        }

        public void a() {
            try {
                b(this.f4107g, this.f4108h);
            } catch (Exception e2) {
                com.google.firebase.crashlytics.d.b.f().e("An unexpected error occurred while attempting to upload crash reports.", e2);
            }
            Thread unused = b.this.f4106g = null;
        }
    }

    public b(String str, String str2, t tVar, a aVar, com.google.firebase.crashlytics.d.o.d.b bVar, a aVar2) {
        if (bVar != null) {
            this.a = bVar;
            this.b = str;
            this.c = str2;
            this.f4103d = tVar;
            this.f4104e = aVar;
            this.f4105f = aVar2;
            return;
        }
        throw new IllegalArgumentException("createReportCall must not be null.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062 A[Catch:{ Exception -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(com.google.firebase.crashlytics.d.o.c.c r6, boolean r7) {
        /*
            r5 = this;
            r0 = 0
            com.google.firebase.crashlytics.d.o.c.a r1 = new com.google.firebase.crashlytics.d.o.c.a     // Catch:{ Exception -> 0x0069 }
            java.lang.String r2 = r5.b     // Catch:{ Exception -> 0x0069 }
            java.lang.String r3 = r5.c     // Catch:{ Exception -> 0x0069 }
            r1.<init>(r2, r3, r6)     // Catch:{ Exception -> 0x0069 }
            com.google.firebase.crashlytics.d.h.t r2 = r5.f4103d     // Catch:{ Exception -> 0x0069 }
            com.google.firebase.crashlytics.d.h.t r3 = com.google.firebase.crashlytics.d.h.t.ALL     // Catch:{ Exception -> 0x0069 }
            r4 = 1
            if (r2 != r3) goto L_0x001b
            com.google.firebase.crashlytics.d.b r7 = com.google.firebase.crashlytics.d.b.f()     // Catch:{ Exception -> 0x0069 }
            java.lang.String r1 = "Send to Reports Endpoint disabled. Removing Reports Endpoint report."
            r7.b(r1)     // Catch:{ Exception -> 0x0069 }
            goto L_0x0032
        L_0x001b:
            com.google.firebase.crashlytics.d.h.t r2 = r5.f4103d     // Catch:{ Exception -> 0x0069 }
            com.google.firebase.crashlytics.d.h.t r3 = com.google.firebase.crashlytics.d.h.t.JAVA_ONLY     // Catch:{ Exception -> 0x0069 }
            if (r2 != r3) goto L_0x0034
            com.google.firebase.crashlytics.d.o.c.c$a r2 = r6.getType()     // Catch:{ Exception -> 0x0069 }
            com.google.firebase.crashlytics.d.o.c.c$a r3 = com.google.firebase.crashlytics.d.o.c.c.a.JAVA     // Catch:{ Exception -> 0x0069 }
            if (r2 != r3) goto L_0x0034
            com.google.firebase.crashlytics.d.b r7 = com.google.firebase.crashlytics.d.b.f()     // Catch:{ Exception -> 0x0069 }
            java.lang.String r1 = "Send to Reports Endpoint for non-native reports disabled. Removing Reports Uploader report."
            r7.b(r1)     // Catch:{ Exception -> 0x0069 }
        L_0x0032:
            r7 = 1
            goto L_0x0060
        L_0x0034:
            com.google.firebase.crashlytics.d.o.d.b r2 = r5.a     // Catch:{ Exception -> 0x0069 }
            boolean r7 = r2.b(r1, r7)     // Catch:{ Exception -> 0x0069 }
            com.google.firebase.crashlytics.d.b r1 = com.google.firebase.crashlytics.d.b.f()     // Catch:{ Exception -> 0x0069 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0069 }
            r2.<init>()     // Catch:{ Exception -> 0x0069 }
            java.lang.String r3 = "Crashlytics Reports Endpoint upload "
            r2.append(r3)     // Catch:{ Exception -> 0x0069 }
            if (r7 == 0) goto L_0x004d
            java.lang.String r3 = "complete: "
            goto L_0x004f
        L_0x004d:
            java.lang.String r3 = "FAILED: "
        L_0x004f:
            r2.append(r3)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r3 = r6.d()     // Catch:{ Exception -> 0x0069 }
            r2.append(r3)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0069 }
            r1.g(r2)     // Catch:{ Exception -> 0x0069 }
        L_0x0060:
            if (r7 == 0) goto L_0x0082
            com.google.firebase.crashlytics.d.o.a r7 = r5.f4104e     // Catch:{ Exception -> 0x0069 }
            r7.b(r6)     // Catch:{ Exception -> 0x0069 }
            r0 = 1
            goto L_0x0082
        L_0x0069:
            r7 = move-exception
            com.google.firebase.crashlytics.d.b r1 = com.google.firebase.crashlytics.d.b.f()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error occurred sending report "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.e(r6, r7)
        L_0x0082:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.d.o.b.d(com.google.firebase.crashlytics.d.o.c.c, boolean):boolean");
    }

    public synchronized void e(List<com.google.firebase.crashlytics.d.o.c.c> list, boolean z, float f2) {
        if (this.f4106g != null) {
            com.google.firebase.crashlytics.d.b.f().b("Report upload has already been started.");
            return;
        }
        Thread thread = new Thread(new d(list, z, f2), "Crashlytics Report Uploader");
        this.f4106g = thread;
        thread.start();
    }
}
