package kotlinx.coroutines.e3;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.c0.d;
import kotlin.c0.j.a.f;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.l;

/* compiled from: Reduce.kt */
final /* synthetic */ class n {

    /* compiled from: Collect.kt */
    public static final class a implements d<T> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ u f10829g;

        public a(u uVar) {
            this.f10829g = uVar;
        }

        public Object a(Object obj, d dVar) {
            this.f10829g.f10686g = obj;
            throw new AbortFlowException(l.f10922g);
        }
    }

    @f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {172}, m = "first")
    /* compiled from: Reduce.kt */
    static final class b extends kotlin.c0.j.a.d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f10830j;

        /* renamed from: k  reason: collision with root package name */
        int f10831k;

        /* renamed from: l  reason: collision with root package name */
        Object f10832l;

        /* renamed from: m  reason: collision with root package name */
        Object f10833m;

        /* renamed from: n  reason: collision with root package name */
        Object f10834n;

        b(d dVar) {
            super(dVar);
        }

        public final Object i(Object obj) {
            this.f10830j = obj;
            this.f10831k |= RecyclerView.UNDEFINED_DURATION;
            return e.h((c) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object a(kotlinx.coroutines.e3.c<? extends T> r4, kotlin.c0.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.e3.n.b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlinx.coroutines.e3.n$b r0 = (kotlinx.coroutines.e3.n.b) r0
            int r1 = r0.f10831k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10831k = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.e3.n$b r0 = new kotlinx.coroutines.e3.n$b
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f10830j
            java.lang.Object r1 = kotlin.c0.i.d.c()
            int r2 = r0.f10831k
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r4 = r0.f10834n
            kotlinx.coroutines.e3.c r4 = (kotlinx.coroutines.e3.c) r4
            java.lang.Object r4 = r0.f10833m
            kotlin.jvm.internal.u r4 = (kotlin.jvm.internal.u) r4
            java.lang.Object r0 = r0.f10832l
            kotlinx.coroutines.e3.c r0 = (kotlinx.coroutines.e3.c) r0
            kotlin.l.b(r5)     // Catch:{ AbortFlowException -> 0x0035 }
            goto L_0x0060
        L_0x0035:
            goto L_0x0060
        L_0x0037:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003f:
            kotlin.l.b(r5)
            kotlin.jvm.internal.u r5 = new kotlin.jvm.internal.u
            r5.<init>()
            kotlinx.coroutines.internal.x r2 = kotlinx.coroutines.flow.internal.m.a
            r5.f10686g = r2
            kotlinx.coroutines.e3.n$a r2 = new kotlinx.coroutines.e3.n$a     // Catch:{ AbortFlowException -> 0x005f }
            r2.<init>(r5)     // Catch:{ AbortFlowException -> 0x005f }
            r0.f10832l = r4     // Catch:{ AbortFlowException -> 0x005f }
            r0.f10833m = r5     // Catch:{ AbortFlowException -> 0x005f }
            r0.f10834n = r4     // Catch:{ AbortFlowException -> 0x005f }
            r0.f10831k = r3     // Catch:{ AbortFlowException -> 0x005f }
            java.lang.Object r4 = r4.a(r2, r0)     // Catch:{ AbortFlowException -> 0x005f }
            if (r4 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r4 = r5
        L_0x0060:
            T r4 = r4.f10686g
            kotlinx.coroutines.internal.x r5 = kotlinx.coroutines.flow.internal.m.a
            if (r4 == r5) goto L_0x0067
            return r4
        L_0x0067:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.e3.n.a(kotlinx.coroutines.e3.c, kotlin.c0.d):java.lang.Object");
    }
}
