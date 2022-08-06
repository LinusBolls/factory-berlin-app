package g.e.n.c.g.f;

import android.app.Application;
import androidx.recyclerview.widget.RecyclerView;
import g.e.n.c.g.c;
import kotlin.c0.j.a.d;
import kotlin.c0.j.a.f;
import kotlin.jvm.internal.k;

/* compiled from: OpenPostBoxUseCaseImpl.kt */
public final class b implements c {
    private final e a;

    @f(c = "com.sensorberg.smartspaces.domain.postbox.internal.OpenPostBoxUseCaseImpl", f = "OpenPostBoxUseCaseImpl.kt", l = {18, 24, 30}, m = "execute")
    /* compiled from: OpenPostBoxUseCaseImpl.kt */
    static final class a extends d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f10052j;

        /* renamed from: k  reason: collision with root package name */
        int f10053k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ b f10054l;

        /* renamed from: m  reason: collision with root package name */
        Object f10055m;

        /* renamed from: n  reason: collision with root package name */
        Object f10056n;
        Object o;
        Object p;
        Object q;
        Object r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, kotlin.c0.d dVar) {
            super(dVar);
            this.f10054l = bVar;
        }

        public final Object i(Object obj) {
            this.f10052j = obj;
            this.f10053k |= RecyclerView.UNDEFINED_DURATION;
            return this.f10054l.a((g.e.n.c.g.b) null, (Application) null, this);
        }
    }

    public b(e eVar) {
        k.e(eVar, "postBoxInteractor");
        this.a = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(g.e.n.c.g.b r11, android.app.Application r12, kotlin.c0.d<? super g.e.m.c<kotlin.x>> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof g.e.n.c.g.f.b.a
            if (r0 == 0) goto L_0x0013
            r0 = r13
            g.e.n.c.g.f.b$a r0 = (g.e.n.c.g.f.b.a) r0
            int r1 = r0.f10053k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10053k = r1
            goto L_0x0018
        L_0x0013:
            g.e.n.c.g.f.b$a r0 = new g.e.n.c.g.f.b$a
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f10052j
            java.lang.Object r1 = kotlin.c0.i.d.c()
            int r2 = r0.f10053k
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0089
            if (r2 == r5) goto L_0x0071
            if (r2 == r4) goto L_0x0050
            if (r2 != r3) goto L_0x0048
            java.lang.Object r11 = r0.r
            g.e.m.c r11 = (g.e.m.c) r11
            java.lang.Object r11 = r0.q
            g.e.m.c r11 = (g.e.m.c) r11
            java.lang.Object r11 = r0.p
            g.e.n.c.g.e r11 = (g.e.n.c.g.e) r11
            java.lang.Object r11 = r0.o
            android.app.Application r11 = (android.app.Application) r11
            java.lang.Object r12 = r0.f10056n
            g.e.n.c.g.b r12 = (g.e.n.c.g.b) r12
            java.lang.Object r12 = r0.f10055m
            g.e.n.c.g.f.b r12 = (g.e.n.c.g.f.b) r12
            kotlin.l.b(r13)
            goto L_0x00fc
        L_0x0048:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0050:
            java.lang.Object r11 = r0.q
            g.e.m.c r11 = (g.e.m.c) r11
            java.lang.Object r12 = r0.p
            g.e.n.c.g.e r12 = (g.e.n.c.g.e) r12
            java.lang.Object r2 = r0.o
            android.app.Application r2 = (android.app.Application) r2
            java.lang.Object r4 = r0.f10056n
            g.e.n.c.g.b r4 = (g.e.n.c.g.b) r4
            java.lang.Object r5 = r0.f10055m
            g.e.n.c.g.f.b r5 = (g.e.n.c.g.f.b) r5
            kotlin.l.b(r13)
            r8 = r2
            r2 = r11
            r11 = r8
            r9 = r13
            r13 = r12
            r12 = r5
            r5 = r4
            r4 = r9
            goto L_0x00d9
        L_0x0071:
            java.lang.Object r11 = r0.p
            g.e.n.c.g.e r11 = (g.e.n.c.g.e) r11
            java.lang.Object r12 = r0.o
            android.app.Application r12 = (android.app.Application) r12
            java.lang.Object r2 = r0.f10056n
            g.e.n.c.g.b r2 = (g.e.n.c.g.b) r2
            java.lang.Object r5 = r0.f10055m
            g.e.n.c.g.f.b r5 = (g.e.n.c.g.f.b) r5
            kotlin.l.b(r13)
            r8 = r13
            r13 = r11
            r11 = r2
            r2 = r8
            goto L_0x00b0
        L_0x0089:
            kotlin.l.b(r13)
            g.e.n.c.g.f.e r13 = r10.a
            r2 = 0
            r13.c(r12, r2, r5)
            g.e.n.c.g.d r13 = r11.d()
            g.e.n.c.g.e r13 = r13.b()
            if (r13 == 0) goto L_0x0104
            g.e.n.c.g.f.e r2 = r10.a
            r0.f10055m = r10
            r0.f10056n = r11
            r0.o = r12
            r0.p = r13
            r0.f10053k = r5
            java.lang.Object r2 = r2.b(r13, r0)
            if (r2 != r1) goto L_0x00af
            return r1
        L_0x00af:
            r5 = r10
        L_0x00b0:
            g.e.m.c r2 = (g.e.m.c) r2
            boolean r6 = r2 instanceof g.e.m.c.a
            if (r6 == 0) goto L_0x00bc
            g.e.n.c.g.f.e r11 = r5.a
            r11.d(r12)
            return r2
        L_0x00bc:
            g.e.n.c.g.f.e r6 = r5.a
            android.bluetooth.BluetoothDevice r7 = r11.c()
            r0.f10055m = r5
            r0.f10056n = r11
            r0.o = r12
            r0.p = r13
            r0.q = r2
            r0.f10053k = r4
            java.lang.Object r4 = r6.a(r7, r0)
            if (r4 != r1) goto L_0x00d5
            return r1
        L_0x00d5:
            r8 = r5
            r5 = r11
            r11 = r12
            r12 = r8
        L_0x00d9:
            g.e.m.c r4 = (g.e.m.c) r4
            boolean r6 = r4 instanceof g.e.m.c.a
            if (r6 == 0) goto L_0x00e5
            g.e.n.c.g.f.e r12 = r12.a
            r12.d(r11)
            return r4
        L_0x00e5:
            g.e.n.c.g.f.e r6 = r12.a
            r0.f10055m = r12
            r0.f10056n = r5
            r0.o = r11
            r0.p = r13
            r0.q = r2
            r0.r = r4
            r0.f10053k = r3
            java.lang.Object r13 = r6.e(r0)
            if (r13 != r1) goto L_0x00fc
            return r1
        L_0x00fc:
            g.e.m.c r13 = (g.e.m.c) r13
            g.e.n.c.g.f.e r12 = r12.a
            r12.d(r11)
            return r13
        L_0x0104:
            g.e.m.c$a r11 = new g.e.m.c$a
            java.lang.String r12 = "BoxCredentials are null, but required to open the box."
            r11.<init>((java.lang.String) r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.n.c.g.f.b.a(g.e.n.c.g.b, android.app.Application, kotlin.c0.d):java.lang.Object");
    }
}
