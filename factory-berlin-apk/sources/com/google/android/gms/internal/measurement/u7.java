package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class u7 extends s7 {
    private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private u7() {
        super();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.measurement.q7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.android.gms.internal.measurement.q7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.android.gms.internal.measurement.q7} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> e(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = f(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.p7
            if (r1 == 0) goto L_0x0014
            com.google.android.gms.internal.measurement.q7 r0 = new com.google.android.gms.internal.measurement.q7
            r0.<init>((int) r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.v8
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.h7
            if (r1 == 0) goto L_0x0024
            com.google.android.gms.internal.measurement.h7 r0 = (com.google.android.gms.internal.measurement.h7) r0
            com.google.android.gms.internal.measurement.h7 r6 = r0.f(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            com.google.android.gms.internal.measurement.v9.j(r3, r4, r0)
            goto L_0x007f
        L_0x002d:
            java.lang.Class<?> r1 = c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.android.gms.internal.measurement.v9.j(r3, r4, r1)
        L_0x0049:
            r0 = r1
            goto L_0x007f
        L_0x004b:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.u9
            if (r1 == 0) goto L_0x0062
            com.google.android.gms.internal.measurement.q7 r1 = new com.google.android.gms.internal.measurement.q7
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            com.google.android.gms.internal.measurement.u9 r0 = (com.google.android.gms.internal.measurement.u9) r0
            r1.addAll(r0)
            com.google.android.gms.internal.measurement.v9.j(r3, r4, r1)
            goto L_0x0049
        L_0x0062:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.v8
            if (r1 == 0) goto L_0x007f
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.h7
            if (r1 == 0) goto L_0x007f
            r1 = r0
            com.google.android.gms.internal.measurement.h7 r1 = (com.google.android.gms.internal.measurement.h7) r1
            boolean r2 = r1.b()
            if (r2 != 0) goto L_0x007f
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.measurement.h7 r0 = r1.f(r0)
            com.google.android.gms.internal.measurement.v9.j(r3, r4, r0)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.u7.e(java.lang.Object, long, int):java.util.List");
    }

    private static <E> List<E> f(Object obj, long j2) {
        return (List) v9.F(obj, j2);
    }

    /* access modifiers changed from: package-private */
    public final <E> void b(Object obj, Object obj2, long j2) {
        List f2 = f(obj2, j2);
        List e2 = e(obj, j2, f2.size());
        int size = e2.size();
        int size2 = f2.size();
        if (size > 0 && size2 > 0) {
            e2.addAll(f2);
        }
        if (size > 0) {
            f2 = e2;
        }
        v9.j(obj, j2, f2);
    }

    /* access modifiers changed from: package-private */
    public final void d(Object obj, long j2) {
        Object obj2;
        List list = (List) v9.F(obj, j2);
        if (list instanceof p7) {
            obj2 = ((p7) list).v();
        } else if (!c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof v8) || !(list instanceof h7)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                h7 h7Var = (h7) list;
                if (h7Var.b()) {
                    h7Var.B();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        v9.j(obj, j2, obj2);
    }
}
