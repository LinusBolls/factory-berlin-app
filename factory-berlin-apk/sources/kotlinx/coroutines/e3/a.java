package kotlinx.coroutines.e3;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.c0.j.a.d;
import kotlin.c0.j.a.f;
import kotlin.x;

/* compiled from: Flow.kt */
public abstract class a<T> implements c<T> {

    @f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {210}, m = "collect")
    /* renamed from: kotlinx.coroutines.e3.a$a  reason: collision with other inner class name */
    /* compiled from: Flow.kt */
    static final class C0765a extends d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f10774j;

        /* renamed from: k  reason: collision with root package name */
        int f10775k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ a f10776l;

        /* renamed from: m  reason: collision with root package name */
        Object f10777m;

        /* renamed from: n  reason: collision with root package name */
        Object f10778n;
        Object o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0765a(a aVar, kotlin.c0.d dVar) {
            super(dVar);
            this.f10776l = aVar;
        }

        public final Object i(Object obj) {
            this.f10774j = obj;
            this.f10775k |= RecyclerView.UNDEFINED_DURATION;
            return this.f10776l.a((d) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlinx.coroutines.e3.d<? super T> r5, kotlin.c0.d<? super kotlin.x> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.e3.a.C0765a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.e3.a$a r0 = (kotlinx.coroutines.e3.a.C0765a) r0
            int r1 = r0.f10775k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10775k = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.e3.a$a r0 = new kotlinx.coroutines.e3.a$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f10774j
            java.lang.Object r1 = kotlin.c0.i.d.c()
            int r2 = r0.f10775k
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r5 = r0.o
            kotlinx.coroutines.flow.internal.n r5 = (kotlinx.coroutines.flow.internal.n) r5
            java.lang.Object r1 = r0.f10778n
            kotlinx.coroutines.e3.d r1 = (kotlinx.coroutines.e3.d) r1
            java.lang.Object r0 = r0.f10777m
            kotlinx.coroutines.e3.a r0 = (kotlinx.coroutines.e3.a) r0
            kotlin.l.b(r6)     // Catch:{ all -> 0x0035 }
            goto L_0x005b
        L_0x0035:
            r6 = move-exception
            goto L_0x0063
        L_0x0037:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003f:
            kotlin.l.b(r6)
            kotlin.c0.g r6 = r0.c()
            kotlinx.coroutines.flow.internal.n r2 = new kotlinx.coroutines.flow.internal.n
            r2.<init>(r5, r6)
            r0.f10777m = r4     // Catch:{ all -> 0x0061 }
            r0.f10778n = r5     // Catch:{ all -> 0x0061 }
            r0.o = r2     // Catch:{ all -> 0x0061 }
            r0.f10775k = r3     // Catch:{ all -> 0x0061 }
            java.lang.Object r5 = r4.c(r2, r0)     // Catch:{ all -> 0x0061 }
            if (r5 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r5 = r2
        L_0x005b:
            r5.p()
            kotlin.x r5 = kotlin.x.a
            return r5
        L_0x0061:
            r6 = move-exception
            r5 = r2
        L_0x0063:
            r5.p()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.e3.a.a(kotlinx.coroutines.e3.d, kotlin.c0.d):java.lang.Object");
    }

    public abstract Object c(d<? super T> dVar, kotlin.c0.d<? super x> dVar2);
}
