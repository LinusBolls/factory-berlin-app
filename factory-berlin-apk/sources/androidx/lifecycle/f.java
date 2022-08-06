package androidx.lifecycle;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.c0.g;
import kotlin.c0.h;
import kotlin.c0.j.a.d;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.t2;
import kotlinx.coroutines.x1;

/* compiled from: CoroutineLiveData.kt */
public final class f<T> extends c0<T> {
    /* access modifiers changed from: private */
    public b<T> r;
    private i s;

    /* compiled from: CoroutineLiveData.kt */
    static final class a extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ f f979h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(0);
            this.f979h = fVar;
        }

        public final void a() {
            this.f979h.r = null;
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    @kotlin.c0.j.a.f(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", l = {234}, m = "clearSource$lifecycle_livedata_ktx_release")
    /* compiled from: CoroutineLiveData.kt */
    static final class b extends d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f980j;

        /* renamed from: k  reason: collision with root package name */
        int f981k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ f f982l;

        /* renamed from: m  reason: collision with root package name */
        Object f983m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar, kotlin.c0.d dVar) {
            super(dVar);
            this.f982l = fVar;
        }

        public final Object i(Object obj) {
            this.f980j = obj;
            this.f981k |= RecyclerView.UNDEFINED_DURATION;
            return this.f982l.y(this);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, long j2, p pVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? h.f10600g : gVar, (i2 & 2) != 0 ? 5000 : j2, pVar);
    }

    /* access modifiers changed from: protected */
    public void q() {
        super.q();
        b<T> bVar = this.r;
        if (bVar != null) {
            bVar.h();
        }
    }

    /* access modifiers changed from: protected */
    public void r() {
        super.r();
        b<T> bVar = this.r;
        if (bVar != null) {
            bVar.g();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object y(kotlin.c0.d<? super kotlin.x> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.lifecycle.f.b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.lifecycle.f$b r0 = (androidx.lifecycle.f.b) r0
            int r1 = r0.f981k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f981k = r1
            goto L_0x0018
        L_0x0013:
            androidx.lifecycle.f$b r0 = new androidx.lifecycle.f$b
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f980j
            java.lang.Object r1 = kotlin.c0.i.d.c()
            int r2 = r0.f981k
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.f983m
            androidx.lifecycle.f r0 = (androidx.lifecycle.f) r0
            kotlin.l.b(r5)
            goto L_0x0048
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            kotlin.l.b(r5)
            androidx.lifecycle.i r5 = r4.s
            if (r5 == 0) goto L_0x004b
            r0.f983m = r4
            r0.f981k = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x0047:
            r0 = r4
        L_0x0048:
            kotlin.x r5 = (kotlin.x) r5
            goto L_0x004c
        L_0x004b:
            r0 = r4
        L_0x004c:
            r5 = 0
            r0.s = r5
            kotlin.x r5 = kotlin.x.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.f.y(kotlin.c0.d):java.lang.Object");
    }

    public f(g gVar, long j2, p<? super a0<T>, ? super kotlin.c0.d<? super x>, ? extends Object> pVar) {
        k.f(gVar, "context");
        k.f(pVar, "block");
        p<? super a0<T>, ? super kotlin.c0.d<? super x>, ? extends Object> pVar2 = pVar;
        long j3 = j2;
        this.r = new b(this, pVar2, j3, j0.a(a1.c().r0().plus(gVar).plus(t2.a((x1) gVar.get(x1.f11076e)))), new a(this));
    }
}
