package com.sensorberg.smartspaces.sdk.internal.u;

import androidx.recyclerview.widget.RecyclerView;
import com.sensorberg.smartspaces.backend.q.p.b;
import java.util.List;
import kotlin.c0.j.a.d;
import kotlin.c0.j.a.f;
import kotlin.jvm.internal.k;

/* compiled from: SetIotDeviceStateUseCase.kt */
public final class g {
    private final b a;

    @f(c = "com.sensorberg.smartspaces.sdk.internal.iot.SetIotDeviceStateUseCase", f = "SetIotDeviceStateUseCase.kt", l = {13}, m = "execute")
    /* compiled from: SetIotDeviceStateUseCase.kt */
    static final class a extends d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f6645j;

        /* renamed from: k  reason: collision with root package name */
        int f6646k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ g f6647l;

        /* renamed from: m  reason: collision with root package name */
        Object f6648m;

        /* renamed from: n  reason: collision with root package name */
        Object f6649n;
        Object o;
        Object p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar, kotlin.c0.d dVar) {
            super(dVar);
            this.f6647l = gVar;
        }

        public final Object i(Object obj) {
            this.f6645j = obj;
            this.f6646k |= RecyclerView.UNDEFINED_DURATION;
            return this.f6647l.a((String) null, (List<com.sensorberg.smartspaces.backend.j.f.b>) null, this);
        }
    }

    public g(b bVar) {
        k.e(bVar, "graphQlDataSource");
        this.a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r8, java.util.List<com.sensorberg.smartspaces.backend.j.f.b> r9, kotlin.c0.d<? super g.e.m.c<kotlin.x>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.sensorberg.smartspaces.sdk.internal.u.g.a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.sensorberg.smartspaces.sdk.internal.u.g$a r0 = (com.sensorberg.smartspaces.sdk.internal.u.g.a) r0
            int r1 = r0.f6646k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6646k = r1
            goto L_0x0018
        L_0x0013:
            com.sensorberg.smartspaces.sdk.internal.u.g$a r0 = new com.sensorberg.smartspaces.sdk.internal.u.g$a
            r0.<init>(r7, r10)
        L_0x0018:
            r4 = r0
            java.lang.Object r10 = r4.f6645j
            java.lang.Object r0 = kotlin.c0.i.d.c()
            int r1 = r4.f6646k
            r2 = 1
            if (r1 == 0) goto L_0x0042
            if (r1 != r2) goto L_0x003a
            java.lang.Object r8 = r4.p
            com.sensorberg.smartspaces.backend.j.b r8 = (com.sensorberg.smartspaces.backend.j.b) r8
            java.lang.Object r8 = r4.o
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r4.f6649n
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r4.f6648m
            com.sensorberg.smartspaces.sdk.internal.u.g r8 = (com.sensorberg.smartspaces.sdk.internal.u.g) r8
            kotlin.l.b(r10)
            goto L_0x0061
        L_0x003a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0042:
            kotlin.l.b(r10)
            com.sensorberg.smartspaces.backend.j.b r10 = new com.sensorberg.smartspaces.backend.j.b
            r10.<init>(r8, r9)
            com.sensorberg.smartspaces.backend.q.p.b r1 = r7.a
            r3 = 0
            r5 = 2
            r6 = 0
            r4.f6648m = r7
            r4.f6649n = r8
            r4.o = r9
            r4.p = r10
            r4.f6646k = r2
            r2 = r10
            java.lang.Object r10 = com.sensorberg.smartspaces.backend.q.p.b.a.a(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L_0x0061
            return r0
        L_0x0061:
            g.e.m.c r10 = (g.e.m.c) r10
            g.e.m.c r8 = r10.c()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.sdk.internal.u.g.a(java.lang.String, java.util.List, kotlin.c0.d):java.lang.Object");
    }
}
