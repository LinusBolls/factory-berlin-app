package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.a1;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
final class ra {
    private a1 a;
    private Long b;
    private long c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ ma f3080d;

    private ra(ma maVar) {
        this.f3080d = maVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.a1 a(java.lang.String r18, com.google.android.gms.internal.measurement.a1 r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r8 = r19
            java.lang.String r9 = r19.T()
            java.util.List r10 = r19.C()
            com.google.android.gms.measurement.internal.ma r2 = r1.f3080d
            com.google.android.gms.measurement.internal.ba r2 = r2.m()
            java.lang.String r3 = "_eid"
            java.lang.Object r2 = r2.U(r8, r3)
            r4 = r2
            java.lang.Long r4 = (java.lang.Long) r4
            r2 = 1
            r5 = 0
            if (r4 == 0) goto L_0x0023
            r6 = 1
            goto L_0x0024
        L_0x0023:
            r6 = 0
        L_0x0024:
            if (r6 == 0) goto L_0x0030
            java.lang.String r7 = "_ep"
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x0030
            r7 = 1
            goto L_0x0031
        L_0x0030:
            r7 = 0
        L_0x0031:
            r11 = 0
            if (r7 == 0) goto L_0x0147
            com.google.android.gms.measurement.internal.ma r6 = r1.f3080d
            com.google.android.gms.measurement.internal.ba r6 = r6.m()
            java.lang.String r7 = "_en"
            java.lang.Object r6 = r6.U(r8, r7)
            r9 = r6
            java.lang.String r9 = (java.lang.String) r9
            boolean r6 = android.text.TextUtils.isEmpty(r9)
            r7 = 0
            if (r6 == 0) goto L_0x005b
            com.google.android.gms.measurement.internal.ma r0 = r1.f3080d
            com.google.android.gms.measurement.internal.c4 r0 = r0.i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.F()
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            r0.b(r2, r4)
            return r7
        L_0x005b:
            com.google.android.gms.internal.measurement.a1 r6 = r1.a
            if (r6 == 0) goto L_0x0071
            java.lang.Long r6 = r1.b
            if (r6 == 0) goto L_0x0071
            long r13 = r4.longValue()
            java.lang.Long r6 = r1.b
            long r15 = r6.longValue()
            int r6 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r6 == 0) goto L_0x00a1
        L_0x0071:
            com.google.android.gms.measurement.internal.ma r6 = r1.f3080d
            com.google.android.gms.measurement.internal.d r6 = r6.o()
            android.util.Pair r6 = r6.A(r0, r4)
            if (r6 == 0) goto L_0x0137
            java.lang.Object r13 = r6.first
            if (r13 != 0) goto L_0x0083
            goto L_0x0137
        L_0x0083:
            com.google.android.gms.internal.measurement.a1 r13 = (com.google.android.gms.internal.measurement.a1) r13
            r1.a = r13
            java.lang.Object r6 = r6.second
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            r1.c = r6
            com.google.android.gms.measurement.internal.ma r6 = r1.f3080d
            com.google.android.gms.measurement.internal.ba r6 = r6.m()
            com.google.android.gms.internal.measurement.a1 r7 = r1.a
            java.lang.Object r3 = r6.U(r7, r3)
            java.lang.Long r3 = (java.lang.Long) r3
            r1.b = r3
        L_0x00a1:
            long r6 = r1.c
            r13 = 1
            long r6 = r6 - r13
            r1.c = r6
            int r3 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r3 > 0) goto L_0x00df
            com.google.android.gms.measurement.internal.ma r3 = r1.f3080d
            com.google.android.gms.measurement.internal.d r3 = r3.o()
            r3.c()
            com.google.android.gms.measurement.internal.c4 r4 = r3.i()
            com.google.android.gms.measurement.internal.e4 r4 = r4.M()
            java.lang.String r6 = "Clearing complex main event info. appId"
            r4.b(r6, r0)
            android.database.sqlite.SQLiteDatabase r4 = r3.v()     // Catch:{ SQLiteException -> 0x00d0 }
            java.lang.String r6 = "delete from main_event_params where app_id=?"
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00d0 }
            r2[r5] = r0     // Catch:{ SQLiteException -> 0x00d0 }
            r4.execSQL(r6, r2)     // Catch:{ SQLiteException -> 0x00d0 }
            goto L_0x00ee
        L_0x00d0:
            r0 = move-exception
            com.google.android.gms.measurement.internal.c4 r2 = r3.i()
            com.google.android.gms.measurement.internal.e4 r2 = r2.E()
            java.lang.String r3 = "Error clearing complex main event"
            r2.b(r3, r0)
            goto L_0x00ee
        L_0x00df:
            com.google.android.gms.measurement.internal.ma r2 = r1.f3080d
            com.google.android.gms.measurement.internal.d r2 = r2.o()
            long r5 = r1.c
            com.google.android.gms.internal.measurement.a1 r7 = r1.a
            r3 = r18
            r2.Y(r3, r4, r5, r7)
        L_0x00ee:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.internal.measurement.a1 r2 = r1.a
            java.util.List r2 = r2.C()
            java.util.Iterator r2 = r2.iterator()
        L_0x00fd:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x011c
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.c1 r3 = (com.google.android.gms.internal.measurement.c1) r3
            com.google.android.gms.measurement.internal.ma r4 = r1.f3080d
            r4.m()
            java.lang.String r4 = r3.M()
            com.google.android.gms.internal.measurement.c1 r4 = com.google.android.gms.measurement.internal.ba.y(r8, r4)
            if (r4 != 0) goto L_0x00fd
            r0.add(r3)
            goto L_0x00fd
        L_0x011c:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x0127
            r0.addAll(r10)
            r10 = r0
            goto L_0x018c
        L_0x0127:
            com.google.android.gms.measurement.internal.ma r0 = r1.f3080d
            com.google.android.gms.measurement.internal.c4 r0 = r0.i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.F()
            java.lang.String r2 = "No unique parameters in main event. eventName"
            r0.b(r2, r9)
            goto L_0x018c
        L_0x0137:
            com.google.android.gms.measurement.internal.ma r0 = r1.f3080d
            com.google.android.gms.measurement.internal.c4 r0 = r0.i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.F()
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.c(r2, r9, r4)
            return r7
        L_0x0147:
            if (r6 == 0) goto L_0x018c
            r1.b = r4
            r1.a = r8
            com.google.android.gms.measurement.internal.ma r2 = r1.f3080d
            com.google.android.gms.measurement.internal.ba r2 = r2.m()
            java.lang.Long r3 = java.lang.Long.valueOf(r11)
            java.lang.String r5 = "_epc"
            java.lang.Object r2 = r2.U(r8, r5)
            if (r2 != 0) goto L_0x0160
            goto L_0x0161
        L_0x0160:
            r3 = r2
        L_0x0161:
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r1.c = r2
            int r5 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r5 > 0) goto L_0x017d
            com.google.android.gms.measurement.internal.ma r0 = r1.f3080d
            com.google.android.gms.measurement.internal.c4 r0 = r0.i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.F()
            java.lang.String r2 = "Complex event with zero extra param count. eventName"
            r0.b(r2, r9)
            goto L_0x018c
        L_0x017d:
            com.google.android.gms.measurement.internal.ma r2 = r1.f3080d
            com.google.android.gms.measurement.internal.d r2 = r2.o()
            long r5 = r1.c
            r3 = r18
            r7 = r19
            r2.Y(r3, r4, r5, r7)
        L_0x018c:
            com.google.android.gms.internal.measurement.z6$b r0 = r19.x()
            com.google.android.gms.internal.measurement.a1$a r0 = (com.google.android.gms.internal.measurement.a1.a) r0
            r0.F(r9)
            r0.N()
            r0.E(r10)
            com.google.android.gms.internal.measurement.j8 r0 = r0.l()
            com.google.android.gms.internal.measurement.z6 r0 = (com.google.android.gms.internal.measurement.z6) r0
            com.google.android.gms.internal.measurement.a1 r0 = (com.google.android.gms.internal.measurement.a1) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ra.a(java.lang.String, com.google.android.gms.internal.measurement.a1):com.google.android.gms.internal.measurement.a1");
    }

    /* synthetic */ ra(ma maVar, pa paVar) {
        this(maVar);
    }
}
