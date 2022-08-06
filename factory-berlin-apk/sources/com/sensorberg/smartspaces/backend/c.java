package com.sensorberg.smartspaces.backend;

import com.google.gson.f;
import com.sensorberg.smartspaces.backend.q.a;
import k.b0;
import kotlin.jvm.internal.k;

/* compiled from: BackendExceptionParser.kt */
public final class c {
    public static final c a = new c();

    private c() {
    }

    private final boolean a(b0 b0Var) {
        return q.I(b0Var.k().toString(), "/oauth/token", false, 2, (Object) null);
    }

    private final String b(String... strArr) {
        for (String str : strArr) {
            if (str != null && (!p.s(str))) {
                return str;
            }
        }
        Object z = j.z(strArr);
        k.c(z);
        return (String) z;
    }

    private final a d(String str, f fVar) {
        if (str == null) {
            return null;
        }
        try {
            n.a.a.j(str, new Object[0]);
            return (a) fVar.i(str, a.class);
        } catch (Exception e2) {
            n.a.a.e(e2, "Failed to parse ApiError", new Object[0]);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0075, code lost:
        r5 = r5.o();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> com.sensorberg.smartspaces.sdk.exception.BackendException c(retrofit2.b<T> r9, retrofit2.q<T> r10, com.google.gson.f r11) {
        /*
            r8 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.k.e(r9, r0)
            java.lang.String r0 = "response"
            kotlin.jvm.internal.k.e(r10, r0)
            java.lang.String r0 = "gson"
            kotlin.jvm.internal.k.e(r11, r0)
            com.sensorberg.smartspaces.backend.q.f$c r0 = com.sensorberg.smartspaces.backend.q.f.f6084d
            boolean r0 = r0.b(r10)
            if (r0 == 0) goto L_0x0021
            com.sensorberg.smartspaces.sdk.exception.BackendException r9 = new com.sensorberg.smartspaces.sdk.exception.BackendException
            r10 = 428(0x1ac, float:6.0E-43)
            java.lang.String r11 = "No cache"
            r9.<init>(r11, r11, r11, r10)
            return r9
        L_0x0021:
            boolean r0 = r10.e()
            if (r0 != 0) goto L_0x0043
            int r0 = r10.b()
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 < r1) goto L_0x0043
            int r0 = r10.b()
            r1 = 599(0x257, float:8.4E-43)
            if (r0 >= r1) goto L_0x0043
            com.sensorberg.smartspaces.sdk.exception.BackendException r9 = new com.sensorberg.smartspaces.sdk.exception.BackendException
            int r10 = r10.b()
            java.lang.String r11 = "Internal Server Error"
            r9.<init>(r11, r11, r11, r10)
            return r9
        L_0x0043:
            k.b0 r9 = r9.j()
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = r10.f()
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "Unknown error"
            r4 = 1
            r1[r4] = r2
            java.lang.String r1 = r8.b(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Unknown error for "
            r2.append(r5)
            k.v r5 = r9.k()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            k.e0 r5 = r10.d()
            if (r5 == 0) goto L_0x0080
            java.lang.String r5 = r5.o()
            if (r5 == 0) goto L_0x0080
            com.sensorberg.smartspaces.backend.q.a r11 = r8.d(r5, r11)
            goto L_0x0081
        L_0x0080:
            r11 = 0
        L_0x0081:
            java.lang.String r5 = "request"
            kotlin.jvm.internal.k.d(r9, r5)
            boolean r9 = r8.a(r9)
            r5 = 3
            if (r9 == 0) goto L_0x00c5
            if (r11 == 0) goto L_0x012b
            com.sensorberg.smartspaces.sdk.exception.BackendException r9 = new com.sensorberg.smartspaces.sdk.exception.BackendException
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.String r6 = r11.b
            r5[r3] = r6
            java.lang.String r6 = r11.a
            r5[r4] = r6
            java.lang.String r6 = r10.f()
            r5[r0] = r6
            java.lang.String r5 = r8.b(r5)
            java.lang.String[] r6 = new java.lang.String[r0]
            java.lang.String r7 = r11.a
            r6[r3] = r7
            r6[r4] = r1
            java.lang.String r1 = r8.b(r6)
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r11 = r11.b
            r0[r3] = r11
            r0[r4] = r2
            java.lang.String r11 = r8.b(r0)
            int r10 = r10.b()
            r9.<init>(r5, r1, r11, r10)
            return r9
        L_0x00c5:
            if (r11 == 0) goto L_0x012b
            java.util.List<com.sensorberg.smartspaces.backend.q.a$a> r9 = r11.c
            java.lang.String r6 = "apiError.errors"
            kotlin.jvm.internal.k.d(r9, r6)
            boolean r9 = r9.isEmpty()
            r9 = r9 ^ r4
            if (r9 == 0) goto L_0x012b
            com.sensorberg.smartspaces.sdk.exception.BackendException r9 = new com.sensorberg.smartspaces.sdk.exception.BackendException
            java.lang.String[] r5 = new java.lang.String[r5]
            java.util.List<com.sensorberg.smartspaces.backend.q.a$a> r6 = r11.c
            java.lang.Object r6 = r6.get(r3)
            com.sensorberg.smartspaces.backend.q.a$a r6 = (com.sensorberg.smartspaces.backend.q.a.C0346a) r6
            java.lang.String r6 = r6.b
            r5[r3] = r6
            java.util.List<com.sensorberg.smartspaces.backend.q.a$a> r6 = r11.c
            java.lang.Object r6 = r6.get(r3)
            com.sensorberg.smartspaces.backend.q.a$a r6 = (com.sensorberg.smartspaces.backend.q.a.C0346a) r6
            java.lang.String r6 = r6.a
            r5[r4] = r6
            java.lang.String r6 = r10.f()
            r5[r0] = r6
            java.lang.String r5 = r8.b(r5)
            java.lang.String[] r6 = new java.lang.String[r0]
            java.util.List<com.sensorberg.smartspaces.backend.q.a$a> r7 = r11.c
            java.lang.Object r7 = r7.get(r3)
            com.sensorberg.smartspaces.backend.q.a$a r7 = (com.sensorberg.smartspaces.backend.q.a.C0346a) r7
            java.lang.String r7 = r7.a
            r6[r3] = r7
            r6[r4] = r1
            java.lang.String r1 = r8.b(r6)
            java.lang.String[] r0 = new java.lang.String[r0]
            java.util.List<com.sensorberg.smartspaces.backend.q.a$a> r11 = r11.c
            java.lang.Object r11 = r11.get(r3)
            com.sensorberg.smartspaces.backend.q.a$a r11 = (com.sensorberg.smartspaces.backend.q.a.C0346a) r11
            java.lang.String r11 = r11.b
            r0[r3] = r11
            r0[r4] = r2
            java.lang.String r11 = r8.b(r0)
            int r10 = r10.b()
            r9.<init>(r5, r1, r11, r10)
            return r9
        L_0x012b:
            com.sensorberg.smartspaces.sdk.exception.BackendException r9 = new com.sensorberg.smartspaces.sdk.exception.BackendException
            int r10 = r10.b()
            r9.<init>(r1, r1, r2, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.backend.c.c(retrofit2.b, retrofit2.q, com.google.gson.f):com.sensorberg.smartspaces.sdk.exception.BackendException");
    }
}
