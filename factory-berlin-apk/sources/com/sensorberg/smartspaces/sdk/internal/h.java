package com.sensorberg.smartspaces.sdk.internal;

import g.e.k.e;
import g.e.m.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.j;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: ObservableTransformations.kt */
public final class h {
    public static final h a = new h();

    /* compiled from: ObservableTransformations.kt */
    static final class a extends l implements kotlin.e0.c.l<g.e.m.a<T, Void>, g.e.m.a<T, Void>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ List f6399h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.l f6400i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(List list, kotlin.e0.c.l lVar) {
            super(1);
            this.f6399h = list;
            this.f6400i = lVar;
        }

        /* renamed from: a */
        public final g.e.m.a<T, Void> o(g.e.m.a<T, Void> aVar) {
            List<e> list = this.f6399h;
            ArrayList arrayList = new ArrayList(o.p(list, 10));
            for (e n2 : list) {
                arrayList.add((g.e.m.a) n2.n());
            }
            j<a.b, Exception> a = h.a.a(arrayList);
            return new g.e.m.a<>(a.a(), this.f6400i.o(aVar != null ? aVar.c() : null), null, a.b());
        }
    }

    private h() {
    }

    public final j<a.b, Exception> a(List<? extends g.e.m.a<? extends Object, Void>> list) {
        boolean z;
        T t;
        boolean z2;
        boolean z3;
        k.e(list, "responses");
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g.e.m.a aVar = (g.e.m.a) it.next();
                if (aVar == null || aVar.f() == a.b.EXECUTING) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t = null;
                break;
            }
            t = it2.next();
            g.e.m.a aVar2 = (g.e.m.a) t;
            if ((aVar2 != null ? aVar2.f() : null) != a.b.FAIL || aVar2.d() == null) {
                z2 = false;
                continue;
            } else {
                z2 = true;
                continue;
            }
            if (z2) {
                break;
            }
        }
        g.e.m.a aVar3 = (g.e.m.a) t;
        Exception d2 = aVar3 != null ? aVar3.d() : null;
        if (z) {
            return new j<>(a.b.EXECUTING, null);
        }
        if (d2 != null) {
            return new j<>(a.b.FAIL, d2);
        }
        return new j<>(a.b.SUCCESS, null);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.util.List, java.lang.Object, java.util.List<? extends g.e.k.e<? extends g.e.m.a<? extends java.lang.Object, java.lang.Void>>>, java.lang.Iterable] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r7 = kotlin.a0.v.W(r8, r7);
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> g.e.k.e<g.e.m.a<T, java.lang.Void>> b(java.util.List<? extends g.e.k.e<? extends java.lang.Object>> r7, java.util.List<? extends g.e.k.e<? extends g.e.m.a<? extends java.lang.Object, java.lang.Void>>> r8, kotlin.e0.c.l<? super T, ? extends T> r9) {
        /*
            r6 = this;
            java.lang.String r0 = "sources"
            kotlin.jvm.internal.k.e(r8, r0)
            java.lang.String r0 = "mapper"
            kotlin.jvm.internal.k.e(r9, r0)
            if (r7 == 0) goto L_0x0014
            java.util.Set r7 = kotlin.a0.v.W(r8, r7)
            if (r7 == 0) goto L_0x0014
            r1 = r7
            goto L_0x0015
        L_0x0014:
            r1 = r8
        L_0x0015:
            g.e.k.h r0 = g.e.k.h.a
            r2 = 0
            com.sensorberg.smartspaces.sdk.internal.h$a r3 = new com.sensorberg.smartspaces.sdk.internal.h$a
            r3.<init>(r8, r9)
            r4 = 2
            r5 = 0
            g.e.k.e r7 = g.e.k.h.f(r0, r1, r2, r3, r4, r5)
            g.e.k.h r8 = g.e.k.h.a
            g.e.k.e r7 = r8.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.sdk.internal.h.b(java.util.List, java.util.List, kotlin.e0.c.l):g.e.k.e");
    }
}
