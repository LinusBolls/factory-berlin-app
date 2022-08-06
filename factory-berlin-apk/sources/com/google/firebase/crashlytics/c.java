package com.google.firebase.crashlytics;

import com.google.firebase.analytics.a.a;
import com.google.firebase.crashlytics.d.b;
import com.google.firebase.crashlytics.d.e;
import com.google.firebase.crashlytics.d.h.m;
import com.google.firebase.crashlytics.d.q.d;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: FirebaseCrashlytics */
public class c {

    /* compiled from: FirebaseCrashlytics */
    class a implements Callable<Void> {
        final /* synthetic */ e a;
        final /* synthetic */ ExecutorService b;
        final /* synthetic */ d c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f3886d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f3887e;

        a(e eVar, ExecutorService executorService, d dVar, boolean z, m mVar) {
            this.a = eVar;
            this.b = executorService;
            this.c = dVar;
            this.f3886d = z;
            this.f3887e = mVar;
        }

        /* renamed from: a */
        public Void call() {
            this.a.c(this.b, this.c);
            if (!this.f3886d) {
                return null;
            }
            this.f3887e.g(this.c);
            return null;
        }
    }

    private c(m mVar) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.firebase.crashlytics.d.f.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.google.firebase.crashlytics.d.f.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.firebase.crashlytics.d.f.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.google.firebase.crashlytics.d.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.google.firebase.crashlytics.d.f.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.google.firebase.crashlytics.d.f.f} */
    /* JADX WARNING: type inference failed for: r0v16, types: [com.google.firebase.crashlytics.d.f.d, com.google.firebase.crashlytics.d.f.b] */
    /* JADX WARNING: type inference failed for: r6v2, types: [com.google.firebase.crashlytics.d.f.c, com.google.firebase.crashlytics.d.f.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.firebase.crashlytics.c a(com.google.firebase.c r16, com.google.firebase.installations.e r17, com.google.firebase.crashlytics.d.a r18, com.google.firebase.analytics.a.a r19) {
        /*
            r8 = r16
            r0 = r19
            android.content.Context r9 = r16.g()
            java.lang.String r1 = r9.getPackageName()
            com.google.firebase.crashlytics.d.h.x r2 = new com.google.firebase.crashlytics.d.h.x
            r3 = r17
            r2.<init>(r9, r1, r3)
            com.google.firebase.crashlytics.d.h.s r4 = new com.google.firebase.crashlytics.d.h.s
            r4.<init>(r8)
            if (r18 != 0) goto L_0x0021
            com.google.firebase.crashlytics.d.c r1 = new com.google.firebase.crashlytics.d.c
            r1.<init>()
            r3 = r1
            goto L_0x0023
        L_0x0021:
            r3 = r18
        L_0x0023:
            com.google.firebase.crashlytics.d.e r11 = new com.google.firebase.crashlytics.d.e
            r11.<init>(r8, r9, r2, r4)
            if (r0 == 0) goto L_0x0071
            com.google.firebase.crashlytics.d.b r1 = com.google.firebase.crashlytics.d.b.f()
            java.lang.String r5 = "Firebase Analytics is available."
            r1.b(r5)
            com.google.firebase.crashlytics.d.f.e r1 = new com.google.firebase.crashlytics.d.f.e
            r1.<init>(r0)
            com.google.firebase.crashlytics.a r5 = new com.google.firebase.crashlytics.a
            r5.<init>()
            com.google.firebase.analytics.a.a$a r0 = b(r0, r5)
            if (r0 == 0) goto L_0x0062
            com.google.firebase.crashlytics.d.b r0 = com.google.firebase.crashlytics.d.b.f()
            java.lang.String r6 = "Firebase Analytics listener registered successfully."
            r0.b(r6)
            com.google.firebase.crashlytics.d.f.d r0 = new com.google.firebase.crashlytics.d.f.d
            r0.<init>()
            com.google.firebase.crashlytics.d.f.c r6 = new com.google.firebase.crashlytics.d.f.c
            r7 = 500(0x1f4, float:7.0E-43)
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            r6.<init>(r1, r7, r10)
            r5.d(r0)
            r5.e(r6)
            r1 = r6
            goto L_0x0084
        L_0x0062:
            com.google.firebase.crashlytics.d.b r0 = com.google.firebase.crashlytics.d.b.f()
            java.lang.String r5 = "Firebase Analytics listener registration failed."
            r0.b(r5)
            com.google.firebase.crashlytics.d.g.c r0 = new com.google.firebase.crashlytics.d.g.c
            r0.<init>()
            goto L_0x0084
        L_0x0071:
            com.google.firebase.crashlytics.d.b r0 = com.google.firebase.crashlytics.d.b.f()
            java.lang.String r1 = "Firebase Analytics is unavailable."
            r0.b(r1)
            com.google.firebase.crashlytics.d.g.c r0 = new com.google.firebase.crashlytics.d.g.c
            r0.<init>()
            com.google.firebase.crashlytics.d.f.f r1 = new com.google.firebase.crashlytics.d.f.f
            r1.<init>()
        L_0x0084:
            r5 = r0
            r6 = r1
            java.lang.String r0 = "Crashlytics Exception Handler"
            java.util.concurrent.ExecutorService r7 = com.google.firebase.crashlytics.d.h.v.c(r0)
            com.google.firebase.crashlytics.d.h.m r15 = new com.google.firebase.crashlytics.d.h.m
            r0 = r15
            r1 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = r11.h()
            if (r0 != 0) goto L_0x00a5
            com.google.firebase.crashlytics.d.b r0 = com.google.firebase.crashlytics.d.b.f()
            java.lang.String r1 = "Unable to start Crashlytics."
            r0.d(r1)
            r0 = 0
            return r0
        L_0x00a5:
            java.lang.String r0 = "com.google.firebase.crashlytics.startup"
            java.util.concurrent.ExecutorService r0 = com.google.firebase.crashlytics.d.h.v.c(r0)
            com.google.firebase.crashlytics.d.q.d r13 = r11.l(r9, r8, r0)
            boolean r14 = r15.n(r13)
            com.google.firebase.crashlytics.c$a r1 = new com.google.firebase.crashlytics.c$a
            r10 = r1
            r12 = r0
            r2 = r15
            r10.<init>(r11, r12, r13, r14, r15)
            com.google.android.gms.tasks.j.b(r0, r1)
            com.google.firebase.crashlytics.c r0 = new com.google.firebase.crashlytics.c
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.c.a(com.google.firebase.c, com.google.firebase.installations.e, com.google.firebase.crashlytics.d.a, com.google.firebase.analytics.a.a):com.google.firebase.crashlytics.c");
    }

    private static a.C0086a b(com.google.firebase.analytics.a.a aVar, a aVar2) {
        a.C0086a a2 = aVar.a("clx", aVar2);
        if (a2 == null) {
            b.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            a2 = aVar.a("crash", aVar2);
            if (a2 != null) {
                b.f().i("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return a2;
    }
}
