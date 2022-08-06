package g.e.n.c.j.b;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.c0.j.a.d;
import kotlin.c0.j.a.f;
import kotlin.jvm.internal.k;

/* compiled from: GetBookableUnitsUseCaseImpl.kt */
public final class b implements a {
    private final e a;
    private final g.e.n.c.k.b.a b;

    @f(c = "com.sensorberg.smartspaces.domain.unit.internal.GetBookableUnitsUseCaseImpl", f = "GetBookableUnitsUseCaseImpl.kt", l = {17, 24}, m = "execute")
    /* compiled from: GetBookableUnitsUseCaseImpl.kt */
    static final class a extends d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f10079j;

        /* renamed from: k  reason: collision with root package name */
        int f10080k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ b f10081l;

        /* renamed from: m  reason: collision with root package name */
        Object f10082m;

        /* renamed from: n  reason: collision with root package name */
        Object f10083n;
        Object o;
        Object p;
        Object q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, kotlin.c0.d dVar) {
            super(dVar);
            this.f10081l = bVar;
        }

        public final Object i(Object obj) {
            this.f10079j = obj;
            this.f10080k |= RecyclerView.UNDEFINED_DURATION;
            return this.f10081l.a((String) null, (g.e.n.c.a) null, this);
        }
    }

    public b(e eVar, g.e.n.c.k.b.a aVar) {
        k.e(eVar, "unitRepository");
        k.e(aVar, "userRepository");
        this.a = eVar;
        this.b = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: g.e.n.c.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a4 A[PHI: r11 
      PHI: (r11v2 java.lang.Object) = (r11v7 java.lang.Object), (r11v1 java.lang.Object) binds: [B:23:0x00a1, B:10:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r9, g.e.n.c.a r10, kotlin.c0.d<? super g.e.m.c<g.e.n.c.b<g.e.n.c.j.a.C0709a>>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof g.e.n.c.j.b.b.a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            g.e.n.c.j.b.b$a r0 = (g.e.n.c.j.b.b.a) r0
            int r1 = r0.f10080k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10080k = r1
            goto L_0x0018
        L_0x0013:
            g.e.n.c.j.b.b$a r0 = new g.e.n.c.j.b.b$a
            r0.<init>(r8, r11)
        L_0x0018:
            r7 = r0
            java.lang.Object r11 = r7.f10079j
            java.lang.Object r0 = kotlin.c0.i.d.c()
            int r1 = r7.f10080k
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x005a
            if (r1 == r3) goto L_0x0049
            if (r1 != r2) goto L_0x0041
            java.lang.Object r9 = r7.q
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r9 = r7.p
            g.e.n.c.k.a r9 = (g.e.n.c.k.a) r9
            java.lang.Object r9 = r7.o
            g.e.n.c.a r9 = (g.e.n.c.a) r9
            java.lang.Object r9 = r7.f10083n
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r7.f10082m
            g.e.n.c.j.b.b r9 = (g.e.n.c.j.b.b) r9
            kotlin.l.b(r11)
            goto L_0x00a4
        L_0x0041:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0049:
            java.lang.Object r9 = r7.o
            r10 = r9
            g.e.n.c.a r10 = (g.e.n.c.a) r10
            java.lang.Object r9 = r7.f10083n
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r1 = r7.f10082m
            g.e.n.c.j.b.b r1 = (g.e.n.c.j.b.b) r1
            kotlin.l.b(r11)
            goto L_0x006f
        L_0x005a:
            kotlin.l.b(r11)
            g.e.n.c.k.b.a r11 = r8.b
            r7.f10082m = r8
            r7.f10083n = r9
            r7.o = r10
            r7.f10080k = r3
            java.lang.Object r11 = r11.a(r7)
            if (r11 != r0) goto L_0x006e
            return r0
        L_0x006e:
            r1 = r8
        L_0x006f:
            r5 = r9
            r6 = r10
            g.e.m.c r11 = (g.e.m.c) r11
            java.lang.Object r9 = r11.a()
            g.e.n.c.k.a r9 = (g.e.n.c.k.a) r9
            g.e.n.c.e.c$a$a r10 = g.e.n.c.e.c.a.a
            java.util.List r4 = r10.a()
            g.e.n.c.j.b.e r10 = r1.a
            g.e.n.c.i.c$a r11 = g.e.n.c.i.c.f10076d
            g.e.n.c.i.c r11 = r11.a()
            if (r9 == 0) goto L_0x008e
            java.lang.String r3 = r9.a()
            goto L_0x008f
        L_0x008e:
            r3 = 0
        L_0x008f:
            r7.f10082m = r1
            r7.f10083n = r5
            r7.o = r6
            r7.p = r9
            r7.q = r4
            r7.f10080k = r2
            r1 = r10
            r2 = r11
            java.lang.Object r11 = r1.a(r2, r3, r4, r5, r6, r7)
            if (r11 != r0) goto L_0x00a4
            return r0
        L_0x00a4:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.n.c.j.b.b.a(java.lang.String, g.e.n.c.a, kotlin.c0.d):java.lang.Object");
    }
}
