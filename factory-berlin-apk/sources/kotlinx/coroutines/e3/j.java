package kotlinx.coroutines.e3;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.c0.j.a.d;
import kotlin.c0.j.a.f;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.u;
import kotlin.x;
import kotlinx.coroutines.flow.internal.m;

/* compiled from: Distinct.kt */
final /* synthetic */ class j {

    /* compiled from: Distinct.kt */
    static final class a extends l implements kotlin.e0.c.l<T, T> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f10788h = new a();

        a() {
            super(1);
        }

        public final T o(T t) {
            return t;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    public static final class b implements c<T> {
        final /* synthetic */ c a;
        final /* synthetic */ kotlin.e0.c.l b;

        /* compiled from: Collect.kt */
        public static final class a implements d<T> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ d f10789g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ u f10790h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ b f10791i;

            @f(c = "kotlinx.coroutines.flow.FlowKt__DistinctKt$distinctUntilChangedBy$$inlined$distinctUntilChangedBy$FlowKt__DistinctKt$1$2", f = "Distinct.kt", l = {137}, m = "emit")
            /* renamed from: kotlinx.coroutines.e3.j$b$a$a  reason: collision with other inner class name */
            public static final class C0766a extends d {

                /* renamed from: j  reason: collision with root package name */
                /* synthetic */ Object f10792j;

                /* renamed from: k  reason: collision with root package name */
                int f10793k;

                /* renamed from: l  reason: collision with root package name */
                Object f10794l;

                /* renamed from: m  reason: collision with root package name */
                Object f10795m;

                /* renamed from: n  reason: collision with root package name */
                Object f10796n;
                Object o;
                Object p;
                final /* synthetic */ a q;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0766a(a aVar, kotlin.c0.d dVar) {
                    super(dVar);
                    this.q = aVar;
                }

                public final Object i(Object obj) {
                    this.f10792j = obj;
                    this.f10793k |= RecyclerView.UNDEFINED_DURATION;
                    return this.q.a((Object) null, this);
                }
            }

            public a(d dVar, u uVar, b bVar) {
                this.f10789g = dVar;
                this.f10790h = uVar;
                this.f10791i = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object a(java.lang.Object r6, kotlin.c0.d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof kotlinx.coroutines.e3.j.b.a.C0766a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    kotlinx.coroutines.e3.j$b$a$a r0 = (kotlinx.coroutines.e3.j.b.a.C0766a) r0
                    int r1 = r0.f10793k
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f10793k = r1
                    goto L_0x0018
                L_0x0013:
                    kotlinx.coroutines.e3.j$b$a$a r0 = new kotlinx.coroutines.e3.j$b$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f10792j
                    java.lang.Object r1 = kotlin.c0.i.d.c()
                    int r2 = r0.f10793k
                    r3 = 1
                    if (r2 == 0) goto L_0x003f
                    if (r2 != r3) goto L_0x0037
                    java.lang.Object r6 = r0.p
                    java.lang.Object r6 = r0.o
                    java.lang.Object r6 = r0.f10796n
                    kotlinx.coroutines.e3.j$b$a$a r6 = (kotlinx.coroutines.e3.j.b.a.C0766a) r6
                    java.lang.Object r6 = r0.f10795m
                    java.lang.Object r6 = r0.f10794l
                    kotlinx.coroutines.e3.j$b$a r6 = (kotlinx.coroutines.e3.j.b.a) r6
                    kotlin.l.b(r7)
                    goto L_0x0079
                L_0x0037:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x003f:
                    kotlin.l.b(r7)
                    kotlinx.coroutines.e3.j$b r7 = r5.f10791i
                    kotlin.e0.c.l r7 = r7.b
                    java.lang.Object r7 = r7.o(r6)
                    kotlin.jvm.internal.u r2 = r5.f10790h
                    T r2 = r2.f10686g
                    kotlinx.coroutines.internal.x r4 = kotlinx.coroutines.flow.internal.m.a
                    if (r2 == r4) goto L_0x0060
                    boolean r2 = kotlin.jvm.internal.k.a(r2, r7)
                    java.lang.Boolean r2 = kotlin.c0.j.a.b.a(r2)
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L_0x0079
                L_0x0060:
                    kotlin.jvm.internal.u r2 = r5.f10790h
                    r2.f10686g = r7
                    kotlinx.coroutines.e3.d r2 = r5.f10789g
                    r0.f10794l = r5
                    r0.f10795m = r6
                    r0.f10796n = r0
                    r0.o = r6
                    r0.p = r7
                    r0.f10793k = r3
                    java.lang.Object r6 = r2.a(r6, r0)
                    if (r6 != r1) goto L_0x0079
                    return r1
                L_0x0079:
                    kotlin.x r6 = kotlin.x.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.e3.j.b.a.a(java.lang.Object, kotlin.c0.d):java.lang.Object");
            }
        }

        public b(c cVar, kotlin.e0.c.l lVar) {
            this.a = cVar;
            this.b = lVar;
        }

        public Object a(d dVar, kotlin.c0.d dVar2) {
            u uVar = new u();
            uVar.f10686g = m.a;
            Object a2 = this.a.a(new a(dVar, uVar, this), dVar2);
            if (a2 == d.c()) {
                return a2;
            }
            return x.a;
        }
    }

    public static final <T> c<T> a(c<? extends T> cVar) {
        return cVar instanceof s ? cVar : e.e(cVar, a.f10788h);
    }

    public static final <T, K> c<T> b(c<? extends T> cVar, kotlin.e0.c.l<? super T, ? extends K> lVar) {
        return new b(cVar, lVar);
    }
}
