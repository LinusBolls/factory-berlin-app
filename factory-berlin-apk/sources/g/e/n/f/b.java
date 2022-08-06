package g.e.n.f;

import g.e.n.c.c.b.c;
import kotlin.c0.d;
import kotlin.c0.j.a.f;
import kotlin.c0.j.a.k;
import kotlin.e0.c.p;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.e3.e;
import kotlinx.coroutines.i0;

/* compiled from: QrCodeRepositoryImpl.kt */
public final class b implements c {
    /* access modifiers changed from: private */
    public final g.e.n.e.c a;
    /* access modifiers changed from: private */
    public final a b;
    private final d0 c;

    @f(c = "com.sensorberg.smartspaces.qrcode.QrCodeRepositoryImpl$createQrCode$2", f = "QrCodeRepositoryImpl.kt", l = {}, m = "invokeSuspend")
    /* compiled from: QrCodeRepositoryImpl.kt */
    static final class a extends k implements p<i0, d<? super g.e.n.c.c.a>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f10182k;

        /* renamed from: l  reason: collision with root package name */
        int f10183l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ b f10184m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, d dVar) {
            super(2, dVar);
            this.f10184m = bVar;
        }

        public final d<x> b(Object obj, d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            a aVar = new a(this.f10184m, dVar);
            aVar.f10182k = (i0) obj;
            return aVar;
        }

        public final Object i(Object obj) {
            Object unused = d.c();
            if (this.f10183l == 0) {
                l.b(obj);
                return this.f10184m.b.a(this.f10184m.a.a());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object l(Object obj, Object obj2) {
            return ((a) b(obj, (d) obj2)).i(x.a);
        }
    }

    @f(c = "com.sensorberg.smartspaces.qrcode.QrCodeRepositoryImpl$getQrCodes$1", f = "QrCodeRepositoryImpl.kt", l = {16, 16, 17}, m = "invokeSuspend")
    /* renamed from: g.e.n.f.b$b  reason: collision with other inner class name */
    /* compiled from: QrCodeRepositoryImpl.kt */
    static final class C0721b extends k implements p<kotlinx.coroutines.e3.d<? super g.e.n.c.c.a>, d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private kotlinx.coroutines.e3.d f10185k;

        /* renamed from: l  reason: collision with root package name */
        Object f10186l;

        /* renamed from: m  reason: collision with root package name */
        Object f10187m;

        /* renamed from: n  reason: collision with root package name */
        int f10188n;
        final /* synthetic */ b o;
        final /* synthetic */ long p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0721b(b bVar, long j2, d dVar) {
            super(2, dVar);
            this.o = bVar;
            this.p = j2;
        }

        public final d<x> b(Object obj, d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            C0721b bVar = new C0721b(this.o, this.p, dVar);
            bVar.f10185k = (kotlinx.coroutines.e3.d) obj;
            return bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0075 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0082 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0083  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0087  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object i(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.c0.i.d.c()
                int r1 = r9.f10188n
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x003c
                if (r1 == r4) goto L_0x002c
                if (r1 == r3) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                java.lang.Object r1 = r9.f10186l
                kotlinx.coroutines.e3.d r1 = (kotlinx.coroutines.e3.d) r1
                kotlin.l.b(r10)
                goto L_0x0042
            L_0x0019:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0021:
                java.lang.Object r1 = r9.f10186l
                kotlinx.coroutines.e3.d r1 = (kotlinx.coroutines.e3.d) r1
                kotlin.l.b(r10)
                r6 = r1
                r1 = r0
                r0 = r9
                goto L_0x0076
            L_0x002c:
                java.lang.Object r1 = r9.f10187m
                kotlinx.coroutines.e3.d r1 = (kotlinx.coroutines.e3.d) r1
                java.lang.Object r5 = r9.f10186l
                kotlinx.coroutines.e3.d r5 = (kotlinx.coroutines.e3.d) r5
                kotlin.l.b(r10)
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r9
                goto L_0x006b
            L_0x003c:
                kotlin.l.b(r10)
                kotlinx.coroutines.e3.d r10 = r9.f10185k
                r1 = r10
            L_0x0042:
                r10 = r9
            L_0x0043:
                kotlin.c0.g r5 = r10.c()
                kotlinx.coroutines.x1$b r6 = kotlinx.coroutines.x1.f11076e
                kotlin.c0.g$b r5 = r5.get(r6)
                kotlinx.coroutines.x1 r5 = (kotlinx.coroutines.x1) r5
                if (r5 == 0) goto L_0x0087
                boolean r5 = r5.b()
                if (r5 != r4) goto L_0x0087
                g.e.n.f.b r5 = r10.o
                r10.f10186l = r1
                r10.f10187m = r1
                r10.f10188n = r4
                java.lang.Object r5 = r5.d(r10)
                if (r5 != r0) goto L_0x0066
                return r0
            L_0x0066:
                r6 = r1
                r1 = r0
                r0 = r10
                r10 = r5
                r5 = r6
            L_0x006b:
                r0.f10186l = r6
                r0.f10188n = r3
                java.lang.Object r10 = r5.a(r10, r0)
                if (r10 != r1) goto L_0x0076
                return r1
            L_0x0076:
                long r7 = r0.p
                r0.f10186l = r6
                r0.f10188n = r2
                java.lang.Object r10 = kotlinx.coroutines.t0.a(r7, r0)
                if (r10 != r1) goto L_0x0083
                return r1
            L_0x0083:
                r10 = r0
                r0 = r1
                r1 = r6
                goto L_0x0043
            L_0x0087:
                kotlin.x r10 = kotlin.x.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: g.e.n.f.b.C0721b.i(java.lang.Object):java.lang.Object");
        }

        public final Object l(Object obj, Object obj2) {
            return ((C0721b) b(obj, (d) obj2)).i(x.a);
        }
    }

    public b(g.e.n.e.c cVar, a aVar, d0 d0Var) {
        kotlin.jvm.internal.k.e(cVar, "payloadDataSource");
        kotlin.jvm.internal.k.e(aVar, "qrCodeFactory");
        kotlin.jvm.internal.k.e(d0Var, "dispatcher");
        this.a = cVar;
        this.b = aVar;
        this.c = d0Var;
    }

    public kotlinx.coroutines.e3.c<g.e.n.c.c.a> a(long j2) {
        return e.i(new C0721b(this, j2, (d) null));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object d(d<? super g.e.n.c.c.a> dVar) {
        return kotlinx.coroutines.d.c(this.c, new a(this, (d) null), dVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(g.e.n.e.c cVar, a aVar, d0 d0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, aVar, (i2 & 4) != 0 ? a1.a() : d0Var);
    }
}
