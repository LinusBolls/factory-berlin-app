package com.sensorberg.notifications.sdk.internal;

import android.app.Application;
import com.sensorberg.notifications.sdk.internal.model.Trigger;
import com.sensorberg.notifications.sdk.internal.model.c;
import com.sensorberg.notifications.sdk.internal.model.e;
import com.sensorberg.notifications.sdk.internal.work.UploadWork;
import com.sensorberg.notifications.sdk.internal.work.WorkUtils;
import g.e.j.a.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: TriggerProcessor.kt */
public final class k {

    /* renamed from: e  reason: collision with root package name */
    public static final a f5235e = new a((DefaultConstructorMarker) null);
    private final com.sensorberg.notifications.sdk.internal.storage.a a;
    private final WorkUtils b;
    private final a c;

    /* renamed from: d  reason: collision with root package name */
    private final Application f5236d;

    /* compiled from: TriggerProcessor.kt */
    public static final class a {
        private a() {
        }

        public final long a(long j2) {
            return j2 - System.currentTimeMillis();
        }

        public final List<e> b(com.sensorberg.notifications.sdk.internal.storage.a aVar, String str, Trigger.b bVar) {
            com.sensorberg.notifications.sdk.internal.storage.a aVar2 = aVar;
            String str2 = str;
            Trigger.b bVar2 = bVar;
            kotlin.jvm.internal.k.f(aVar2, "dao");
            kotlin.jvm.internal.k.f(str2, "triggerId");
            kotlin.jvm.internal.k.f(bVar2, "type");
            long currentTimeMillis = System.currentTimeMillis();
            List<e> h2 = aVar2.h(str2, currentTimeMillis, bVar2, Trigger.b.EnterOrExit);
            n.a.a.a("Found " + h2.size() + " actions in total for trigger " + str2, new Object[0]);
            ArrayList arrayList = new ArrayList();
            for (e eVar : h2) {
                com.sensorberg.notifications.sdk.internal.model.k i2 = aVar2.i(eVar.e());
                if (i2 != null) {
                    if (eVar.f() != 0 && i2.b() >= eVar.f()) {
                        n.a.a.a("Filter(MAX_COUNT): " + eVar.e() + " won't execute, it already executed " + i2.b() + " times; max count is " + eVar.f(), new Object[0]);
                    } else if (eVar.k() != 0 && currentTimeMillis - i2.c() < eVar.k()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Filter(SUPPRESSION_TIME): ");
                        sb.append(eVar.e());
                        sb.append(" won't execute, it executed ");
                        long j2 = (long) 1000;
                        sb.append((currentTimeMillis - i2.c()) / j2);
                        sb.append(" seconds ago; suppression is ");
                        sb.append(eVar.k() / j2);
                        sb.append(" seconds");
                        n.a.a.a(sb.toString(), new Object[0]);
                    }
                }
                if (aVar2.j(eVar.e(), currentTimeMillis) > 0) {
                    arrayList.add(eVar);
                } else {
                    n.a.a.a("Filter(TIME_PERIOD): " + eVar.e() + " won't execute, it's not allowed at this time", new Object[0]);
                }
            }
            n.a.a.a("Found " + arrayList.size() + " actions to execute for trigger " + str2, new Object[0]);
            return arrayList;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public k(com.sensorberg.notifications.sdk.internal.storage.a aVar, WorkUtils workUtils, a aVar2, Application application) {
        kotlin.jvm.internal.k.f(aVar, "dao");
        kotlin.jvm.internal.k.f(workUtils, "workUtils");
        kotlin.jvm.internal.k.f(aVar2, "actionLauncher");
        kotlin.jvm.internal.k.f(application, "app");
        this.a = aVar;
        this.b = workUtils;
        this.c = aVar2;
        this.f5236d = application;
    }

    private final void a(e eVar, b bVar, Trigger.b bVar2) {
        long a2 = f5235e.a(eVar.d());
        if (a2 > 0) {
            this.b.l(bVar, bVar2, eVar.h(), a2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (r1 == null) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(java.util.List<com.sensorberg.notifications.sdk.internal.model.e> r12, com.sensorberg.notifications.sdk.internal.model.Trigger.b r13) {
        /*
            r11 = this;
            java.util.Iterator r12 = r12.iterator()
        L_0x0004:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x007d
            java.lang.Object r0 = r12.next()
            com.sensorberg.notifications.sdk.internal.model.e r0 = (com.sensorberg.notifications.sdk.internal.model.e) r0
            java.lang.String r1 = r0.g()
            if (r1 == 0) goto L_0x002d
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0029 }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x0029 }
            java.lang.String r1 = "com.sensorberg.notifications.sdk.backend.v2.meta.action_trigger"
            int r3 = com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model.c.a(r13)     // Catch:{ JSONException -> 0x0029 }
            r2.put(r1, r3)     // Catch:{ JSONException -> 0x0029 }
            java.lang.String r1 = r2.toString()     // Catch:{ JSONException -> 0x0029 }
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            if (r1 == 0) goto L_0x002d
            goto L_0x0031
        L_0x002d:
            java.lang.String r1 = r0.g()
        L_0x0031:
            r8 = r1
            g.e.j.a.b r1 = new g.e.j.a.b
            java.lang.String r3 = r0.e()
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r4 = r2.toString()
            java.lang.String r2 = "UUID.randomUUID().toString()"
            kotlin.jvm.internal.k.b(r4, r2)
            java.lang.String r5 = r0.j()
            java.lang.String r6 = r0.b()
            java.lang.String r7 = r0.m()
            java.lang.String r9 = r0.a()
            java.lang.String r10 = r0.l()
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            long r2 = r0.d()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x006b
            r11.a(r0, r1, r13)
            goto L_0x0004
        L_0x006b:
            long r2 = r0.c()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0077
            r11.d(r1, r13, r0)
            goto L_0x0004
        L_0x0077:
            com.sensorberg.notifications.sdk.internal.a r0 = r11.c
            r0.a(r1, r13)
            goto L_0x0004
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.notifications.sdk.internal.k.b(java.util.List, com.sensorberg.notifications.sdk.internal.model.Trigger$b):void");
    }

    private final void d(b bVar, Trigger.b bVar2, e eVar) {
        this.b.l(bVar, bVar2, eVar.h(), eVar.c());
    }

    private final void e(List<e> list) {
        long currentTimeMillis = System.currentTimeMillis();
        for (e eVar : list) {
            com.sensorberg.notifications.sdk.internal.model.k i2 = this.a.i(eVar.e());
            if (i2 == null) {
                i2 = new com.sensorberg.notifications.sdk.internal.model.k(eVar.e(), 1, currentTimeMillis);
            } else {
                i2.d(i2.b() + 1);
                i2.e(currentTimeMillis);
            }
            n.a.a.a("Updating statistics for fired action: " + i2, new Object[0]);
            this.a.o(i2);
        }
    }

    public final void c(String str, Trigger.b bVar) {
        boolean z;
        kotlin.jvm.internal.k.f(str, "triggerId");
        kotlin.jvm.internal.k.f(bVar, "type");
        List<e> b2 = f5235e.b(this.a, str, bVar);
        e(b2);
        ArrayList arrayList = new ArrayList();
        for (T next : b2) {
            if (true ^ ((e) next).i()) {
                arrayList.add(next);
            }
        }
        ArrayList<e> arrayList2 = new ArrayList<>();
        for (T next2 : b2) {
            if (((e) next2).i()) {
                arrayList2.add(next2);
            }
        }
        b(arrayList, bVar);
        for (e b3 : arrayList2) {
            com.sensorberg.notifications.sdk.internal.model.b b4 = c.b(b3, bVar, d.b(this.f5236d));
            this.a.l(b4);
        }
        Iterator<T> it = b2.iterator();
        loop3:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop3;
                }
                e eVar = (e) it.next();
                if (z || eVar.h()) {
                    z = true;
                }
            }
        }
        if (z) {
            this.b.g(UploadWork.class);
        }
    }
}
