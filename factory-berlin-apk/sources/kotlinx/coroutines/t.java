package kotlinx.coroutines;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.c0.j.a.d;
import kotlin.c0.j.a.f;
import kotlin.e0.c.p;
import kotlinx.coroutines.h3.c;

/* compiled from: CompletableDeferred.kt */
final class t<T> extends e2 implements s<T>, c<T> {

    @f(c = "kotlinx.coroutines.CompletableDeferredImpl", f = "CompletableDeferred.kt", l = {87}, m = "await")
    /* compiled from: CompletableDeferred.kt */
    static final class a extends d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f11061j;

        /* renamed from: k  reason: collision with root package name */
        int f11062k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ t f11063l;

        /* renamed from: m  reason: collision with root package name */
        Object f11064m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(t tVar, kotlin.c0.d dVar) {
            super(dVar);
            this.f11063l = tVar;
        }

        public final Object i(Object obj) {
            this.f11061j = obj;
            this.f11062k |= RecyclerView.UNDEFINED_DURATION;
            return this.f11063l.L(this);
        }
    }

    public t(x1 x1Var) {
        super(true);
        j0(x1Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object L(kotlin.c0.d<? super T> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.t.a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlinx.coroutines.t$a r0 = (kotlinx.coroutines.t.a) r0
            int r1 = r0.f11062k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f11062k = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.t$a r0 = new kotlinx.coroutines.t$a
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f11061j
            java.lang.Object r1 = kotlin.c0.i.d.c()
            int r2 = r0.f11062k
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.f11064m
            kotlinx.coroutines.t r0 = (kotlinx.coroutines.t) r0
            kotlin.l.b(r5)
            goto L_0x0043
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            kotlin.l.b(r5)
            r0.f11064m = r4
            r0.f11062k = r3
            java.lang.Object r5 = r4.A(r0)
            if (r5 != r1) goto L_0x0043
            return r1
        L_0x0043:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.t.L(kotlin.c0.d):java.lang.Object");
    }

    public boolean d0() {
        return true;
    }

    public <R> void l(kotlinx.coroutines.h3.d<? super R> dVar, p<? super T, ? super kotlin.c0.d<? super R>, ? extends Object> pVar) {
        B0(dVar, pVar);
    }

    public boolean y(Throwable th) {
        return p0(new w(th, false, 2, (DefaultConstructorMarker) null));
    }

    public boolean z(T t) {
        return p0(t);
    }
}
