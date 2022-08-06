package kotlinx.coroutines;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.c0.j.a.d;
import kotlin.c0.j.a.f;
import kotlin.e0.c.p;
import kotlinx.coroutines.f3.b;

/* compiled from: Timeout.kt */
public final class z2 {

    @f(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {80}, m = "withTimeoutOrNull")
    /* compiled from: Timeout.kt */
    static final class a extends d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f11080j;

        /* renamed from: k  reason: collision with root package name */
        int f11081k;

        /* renamed from: l  reason: collision with root package name */
        long f11082l;

        /* renamed from: m  reason: collision with root package name */
        Object f11083m;

        /* renamed from: n  reason: collision with root package name */
        Object f11084n;

        a(kotlin.c0.d dVar) {
            super(dVar);
        }

        public final Object i(Object obj) {
            this.f11080j = obj;
            this.f11081k |= RecyclerView.UNDEFINED_DURATION;
            return z2.c(0, (p) null, this);
        }
    }

    public static final TimeoutCancellationException a(long j2, x1 x1Var) {
        return new TimeoutCancellationException("Timed out waiting for " + j2 + " ms", x1Var);
    }

    private static final <U, T extends U> Object b(y2<U, ? super T> y2Var, p<? super i0, ? super kotlin.c0.d<? super T>, ? extends Object> pVar) {
        a2.h(y2Var, t0.b(y2Var.f11029j.c()).U(y2Var.f11077k, y2Var));
        return b.d(y2Var, y2Var, pVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object c(long r7, kotlin.e0.c.p<? super kotlinx.coroutines.i0, ? super kotlin.c0.d<? super T>, ? extends java.lang.Object> r9, kotlin.c0.d<? super T> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.z2.a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.z2$a r0 = (kotlinx.coroutines.z2.a) r0
            int r1 = r0.f11081k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f11081k = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.z2$a r0 = new kotlinx.coroutines.z2$a
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.f11080j
            java.lang.Object r1 = kotlin.c0.i.d.c()
            int r2 = r0.f11081k
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r7 = r0.f11084n
            kotlin.jvm.internal.u r7 = (kotlin.jvm.internal.u) r7
            java.lang.Object r8 = r0.f11083m
            kotlin.e0.c.p r8 = (kotlin.e0.c.p) r8
            long r8 = r0.f11082l
            kotlin.l.b(r10)     // Catch:{ TimeoutCancellationException -> 0x0034 }
            goto L_0x006f
        L_0x0034:
            r8 = move-exception
            goto L_0x0072
        L_0x0036:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003e:
            kotlin.l.b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L_0x0048
            return r4
        L_0x0048:
            kotlin.jvm.internal.u r10 = new kotlin.jvm.internal.u
            r10.<init>()
            r10.f10686g = r4
            r0.f11082l = r7     // Catch:{ TimeoutCancellationException -> 0x0070 }
            r0.f11083m = r9     // Catch:{ TimeoutCancellationException -> 0x0070 }
            r0.f11084n = r10     // Catch:{ TimeoutCancellationException -> 0x0070 }
            r0.f11081k = r3     // Catch:{ TimeoutCancellationException -> 0x0070 }
            kotlinx.coroutines.y2 r2 = new kotlinx.coroutines.y2     // Catch:{ TimeoutCancellationException -> 0x0070 }
            r2.<init>(r7, r0)     // Catch:{ TimeoutCancellationException -> 0x0070 }
            r10.f10686g = r2     // Catch:{ TimeoutCancellationException -> 0x0070 }
            java.lang.Object r7 = b(r2, r9)     // Catch:{ TimeoutCancellationException -> 0x0070 }
            java.lang.Object r8 = kotlin.c0.i.d.c()     // Catch:{ TimeoutCancellationException -> 0x0070 }
            if (r7 != r8) goto L_0x006b
            kotlin.c0.j.a.h.c(r0)     // Catch:{ TimeoutCancellationException -> 0x0070 }
        L_0x006b:
            if (r7 != r1) goto L_0x006e
            return r1
        L_0x006e:
            r10 = r7
        L_0x006f:
            return r10
        L_0x0070:
            r8 = move-exception
            r7 = r10
        L_0x0072:
            kotlinx.coroutines.x1 r9 = r8.f10711g
            T r7 = r7.f10686g
            kotlinx.coroutines.y2 r7 = (kotlinx.coroutines.y2) r7
            if (r9 != r7) goto L_0x007b
            return r4
        L_0x007b:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.z2.c(long, kotlin.e0.c.p, kotlin.c0.d):java.lang.Object");
    }
}
