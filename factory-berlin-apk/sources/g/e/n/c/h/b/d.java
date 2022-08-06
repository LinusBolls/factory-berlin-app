package g.e.n.c.h.b;

import androidx.recyclerview.widget.RecyclerView;
import g.e.n.c.e.c;
import java.util.List;
import kotlin.c0.j.a.f;
import kotlin.jvm.internal.k;

/* compiled from: GetScheduleUseCaseImpl.kt */
public final class d implements c {
    private final List<c> a = n.i(c.a.C0701c.b, c.a.b.b);
    private final f b;
    private final g.e.n.c.k.b.a c;

    @f(c = "com.sensorberg.smartspaces.domain.schedule.internal.GetScheduleUseCaseImpl", f = "GetScheduleUseCaseImpl.kt", l = {24, 33}, m = "execute")
    /* compiled from: GetScheduleUseCaseImpl.kt */
    static final class a extends kotlin.c0.j.a.d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f10068j;

        /* renamed from: k  reason: collision with root package name */
        int f10069k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ d f10070l;

        /* renamed from: m  reason: collision with root package name */
        Object f10071m;

        /* renamed from: n  reason: collision with root package name */
        Object f10072n;
        Object o;
        Object p;
        Object q;
        Object r;
        Object s;
        Object t;
        Object u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, kotlin.c0.d dVar2) {
            super(dVar2);
            this.f10070l = dVar;
        }

        public final Object i(Object obj) {
            this.f10068j = obj;
            this.f10069k |= RecyclerView.UNDEFINED_DURATION;
            return this.f10070l.a((String) null, (String) null, (String) null, (g.e.n.c.a) null, this);
        }
    }

    public d(f fVar, g.e.n.c.k.b.a aVar) {
        k.e(fVar, "scheduleRepository");
        k.e(aVar, "userRepository");
        this.b = fVar;
        this.c = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x010f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0110 A[PHI: r3 
      PHI: (r3v2 java.lang.Object) = (r3v4 java.lang.Object), (r3v1 java.lang.Object) binds: [B:27:0x010d, B:10:0x0030] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r22, java.lang.String r23, java.lang.String r24, g.e.n.c.a r25, kotlin.c0.d<? super g.e.m.c<g.e.n.c.b<g.e.n.c.h.a>>> r26) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            r2 = r24
            r3 = r26
            boolean r4 = r3 instanceof g.e.n.c.h.b.d.a
            if (r4 == 0) goto L_0x001b
            r4 = r3
            g.e.n.c.h.b.d$a r4 = (g.e.n.c.h.b.d.a) r4
            int r5 = r4.f10069k
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f10069k = r5
            goto L_0x0020
        L_0x001b:
            g.e.n.c.h.b.d$a r4 = new g.e.n.c.h.b.d$a
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r3 = r4.f10068j
            java.lang.Object r5 = kotlin.c0.i.d.c()
            int r6 = r4.f10069k
            r7 = 2
            r8 = 1
            if (r6 == 0) goto L_0x008d
            if (r6 == r8) goto L_0x0061
            if (r6 != r7) goto L_0x0059
            java.lang.Object r1 = r4.u
            g.e.n.c.h.b.e r1 = (g.e.n.c.h.b.e) r1
            java.lang.Object r1 = r4.t
            g.e.n.c.k.a r1 = (g.e.n.c.k.a) r1
            java.lang.Object r1 = r4.s
            g.e.n.c.i.c r1 = (g.e.n.c.i.c) r1
            java.lang.Object r1 = r4.r
            g.e.n.c.i.c r1 = (g.e.n.c.i.c) r1
            java.lang.Object r1 = r4.q
            g.e.n.c.a r1 = (g.e.n.c.a) r1
            java.lang.Object r1 = r4.p
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.o
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f10072n
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f10071m
            g.e.n.c.h.b.d r1 = (g.e.n.c.h.b.d) r1
            kotlin.l.b(r3)
            goto L_0x0110
        L_0x0059:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0061:
            java.lang.Object r1 = r4.s
            g.e.n.c.i.c r1 = (g.e.n.c.i.c) r1
            java.lang.Object r2 = r4.r
            g.e.n.c.i.c r2 = (g.e.n.c.i.c) r2
            java.lang.Object r6 = r4.q
            g.e.n.c.a r6 = (g.e.n.c.a) r6
            java.lang.Object r8 = r4.p
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r4.o
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r4.f10072n
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r4.f10071m
            g.e.n.c.h.b.d r11 = (g.e.n.c.h.b.d) r11
            kotlin.l.b(r3)
            r15 = r11
            r19 = r3
            r3 = r1
            r1 = r10
            r10 = r19
            r20 = r8
            r8 = r2
            r2 = r20
            goto L_0x00c6
        L_0x008d:
            kotlin.l.b(r3)
            g.e.n.c.i.c$a r3 = g.e.n.c.i.c.f10076d
            g.e.n.c.i.c r3 = r3.b(r1)
            java.lang.String r6 = "could not parse "
            if (r3 == 0) goto L_0x012b
            g.e.n.c.i.c$a r9 = g.e.n.c.i.c.f10076d
            g.e.n.c.i.c r9 = r9.b(r2)
            if (r9 == 0) goto L_0x0111
            g.e.n.c.k.b.a r6 = r0.c
            r4.f10071m = r0
            r10 = r22
            r4.f10072n = r10
            r4.o = r1
            r4.p = r2
            r11 = r25
            r4.q = r11
            r4.r = r3
            r4.s = r9
            r4.f10069k = r8
            java.lang.Object r6 = r6.a(r4)
            if (r6 != r5) goto L_0x00bf
            return r5
        L_0x00bf:
            r15 = r0
            r8 = r3
            r3 = r9
            r9 = r1
            r1 = r10
            r10 = r6
            r6 = r11
        L_0x00c6:
            g.e.m.c r10 = (g.e.m.c) r10
            java.lang.Object r10 = r10.a()
            r14 = r10
            g.e.n.c.k.a r14 = (g.e.n.c.k.a) r14
            g.e.n.c.h.b.e r13 = new g.e.n.c.h.b.e
            if (r14 == 0) goto L_0x00d8
            java.lang.String r10 = r14.a()
            goto L_0x00d9
        L_0x00d8:
            r10 = 0
        L_0x00d9:
            r16 = r10
            java.util.List<g.e.n.c.e.c> r12 = r15.a
            r10 = r13
            r11 = r1
            r17 = r12
            r12 = r8
            r7 = r13
            r13 = r3
            r0 = r14
            r14 = r6
            r18 = r5
            r5 = r15
            r15 = r16
            r16 = r17
            r10.<init>(r11, r12, r13, r14, r15, r16)
            g.e.n.c.h.b.f r10 = r5.b
            r4.f10071m = r5
            r4.f10072n = r1
            r4.o = r9
            r4.p = r2
            r4.q = r6
            r4.r = r8
            r4.s = r3
            r4.t = r0
            r4.u = r7
            r0 = 2
            r4.f10069k = r0
            java.lang.Object r3 = r10.a(r7, r4)
            r0 = r18
            if (r3 != r0) goto L_0x0110
            return r0
        L_0x0110:
            return r3
        L_0x0111:
            g.e.m.c$a r0 = new g.e.m.c$a
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            r0.<init>((java.lang.Throwable) r1)
            return r0
        L_0x012b:
            g.e.m.c$a r0 = new g.e.m.c$a
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            r0.<init>((java.lang.Throwable) r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.n.c.h.b.d.a(java.lang.String, java.lang.String, java.lang.String, g.e.n.c.a, kotlin.c0.d):java.lang.Object");
    }
}
