package retrofit2;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.c0.j.a.h;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.k;
import kotlin.x;
import kotlinx.coroutines.i;

/* compiled from: KotlinExtensions.kt */
public final class j {

    /* compiled from: KotlinExtensions.kt */
    static final class a extends l implements kotlin.e0.c.l<Throwable, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f11790h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.f11790h = bVar;
        }

        public final void a(Throwable th) {
            this.f11790h.cancel();
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Throwable) obj);
            return x.a;
        }
    }

    /* compiled from: KotlinExtensions.kt */
    static final class b extends l implements kotlin.e0.c.l<Throwable, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f11791h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(b bVar) {
            super(1);
            this.f11791h = bVar;
        }

        public final void a(Throwable th) {
            this.f11791h.cancel();
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Throwable) obj);
            return x.a;
        }
    }

    /* compiled from: KotlinExtensions.kt */
    public static final class c implements d<T> {
        final /* synthetic */ i a;

        c(i iVar) {
            this.a = iVar;
        }

        public void a(b<T> bVar, q<T> qVar) {
            k.f(bVar, "call");
            k.f(qVar, "response");
            if (qVar.e()) {
                T a2 = qVar.a();
                if (a2 == null) {
                    Object j2 = bVar.j().j(i.class);
                    if (j2 != null) {
                        k.b(j2, "call.request().tag(Invocation::class.java)!!");
                        Method a3 = ((i) j2).a();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Response from ");
                        k.b(a3, "method");
                        Class<?> declaringClass = a3.getDeclaringClass();
                        k.b(declaringClass, "method.declaringClass");
                        sb.append(declaringClass.getName());
                        sb.append('.');
                        sb.append(a3.getName());
                        sb.append(" was null but response body type was declared as non-null");
                        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb.toString());
                        i iVar = this.a;
                        k.a aVar = kotlin.k.f10687h;
                        Object a4 = kotlin.l.a(kotlinNullPointerException);
                        kotlin.k.a(a4);
                        iVar.m(a4);
                        return;
                    }
                    kotlin.jvm.internal.k.m();
                    throw null;
                }
                i iVar2 = this.a;
                k.a aVar2 = kotlin.k.f10687h;
                kotlin.k.a(a2);
                iVar2.m(a2);
                return;
            }
            i iVar3 = this.a;
            HttpException httpException = new HttpException(qVar);
            k.a aVar3 = kotlin.k.f10687h;
            Object a5 = kotlin.l.a(httpException);
            kotlin.k.a(a5);
            iVar3.m(a5);
        }

        public void b(b<T> bVar, Throwable th) {
            kotlin.jvm.internal.k.f(bVar, "call");
            kotlin.jvm.internal.k.f(th, "t");
            i iVar = this.a;
            k.a aVar = kotlin.k.f10687h;
            Object a2 = kotlin.l.a(th);
            kotlin.k.a(a2);
            iVar.m(a2);
        }
    }

    /* compiled from: KotlinExtensions.kt */
    public static final class d implements d<T> {
        final /* synthetic */ i a;

        d(i iVar) {
            this.a = iVar;
        }

        public void a(b<T> bVar, q<T> qVar) {
            kotlin.jvm.internal.k.f(bVar, "call");
            kotlin.jvm.internal.k.f(qVar, "response");
            if (qVar.e()) {
                i iVar = this.a;
                T a2 = qVar.a();
                k.a aVar = kotlin.k.f10687h;
                kotlin.k.a(a2);
                iVar.m(a2);
                return;
            }
            i iVar2 = this.a;
            HttpException httpException = new HttpException(qVar);
            k.a aVar2 = kotlin.k.f10687h;
            Object a3 = kotlin.l.a(httpException);
            kotlin.k.a(a3);
            iVar2.m(a3);
        }

        public void b(b<T> bVar, Throwable th) {
            kotlin.jvm.internal.k.f(bVar, "call");
            kotlin.jvm.internal.k.f(th, "t");
            i iVar = this.a;
            k.a aVar = kotlin.k.f10687h;
            Object a2 = kotlin.l.a(th);
            kotlin.k.a(a2);
            iVar.m(a2);
        }
    }

    /* compiled from: KotlinExtensions.kt */
    static final class e extends l implements kotlin.e0.c.l<Throwable, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f11792h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(1);
            this.f11792h = bVar;
        }

        public final void a(Throwable th) {
            this.f11792h.cancel();
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Throwable) obj);
            return x.a;
        }
    }

    /* compiled from: KotlinExtensions.kt */
    public static final class f implements d<T> {
        final /* synthetic */ i a;

        f(i iVar) {
            this.a = iVar;
        }

        public void a(b<T> bVar, q<T> qVar) {
            kotlin.jvm.internal.k.f(bVar, "call");
            kotlin.jvm.internal.k.f(qVar, "response");
            i iVar = this.a;
            k.a aVar = kotlin.k.f10687h;
            kotlin.k.a(qVar);
            iVar.m(qVar);
        }

        public void b(b<T> bVar, Throwable th) {
            kotlin.jvm.internal.k.f(bVar, "call");
            kotlin.jvm.internal.k.f(th, "t");
            i iVar = this.a;
            k.a aVar = kotlin.k.f10687h;
            Object a2 = kotlin.l.a(th);
            kotlin.k.a(a2);
            iVar.m(a2);
        }
    }

    @kotlin.c0.j.a.f(c = "retrofit2/KotlinExtensions", f = "KotlinExtensions.kt", l = {100, 102}, m = "yieldAndThrow")
    /* compiled from: KotlinExtensions.kt */
    static final class g extends kotlin.c0.j.a.d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f11793j;

        /* renamed from: k  reason: collision with root package name */
        int f11794k;

        /* renamed from: l  reason: collision with root package name */
        Object f11795l;

        g(kotlin.c0.d dVar) {
            super(dVar);
        }

        public final Object i(Object obj) {
            this.f11793j = obj;
            this.f11794k |= RecyclerView.UNDEFINED_DURATION;
            return j.d((Exception) null, this);
        }
    }

    public static final <T> Object a(b<T> bVar, kotlin.c0.d<? super T> dVar) {
        kotlinx.coroutines.j jVar = new kotlinx.coroutines.j(c.b(dVar), 1);
        jVar.B(new a(bVar));
        bVar.t0(new c(jVar));
        Object u = jVar.u();
        if (u == d.c()) {
            h.c(dVar);
        }
        return u;
    }

    public static final <T> Object b(b<T> bVar, kotlin.c0.d<? super T> dVar) {
        kotlinx.coroutines.j jVar = new kotlinx.coroutines.j(c.b(dVar), 1);
        jVar.B(new b(bVar));
        bVar.t0(new d(jVar));
        Object u = jVar.u();
        if (u == d.c()) {
            h.c(dVar);
        }
        return u;
    }

    public static final <T> Object c(b<T> bVar, kotlin.c0.d<? super q<T>> dVar) {
        kotlinx.coroutines.j jVar = new kotlinx.coroutines.j(c.b(dVar), 1);
        jVar.B(new e(bVar));
        bVar.t0(new f(jVar));
        Object u = jVar.u();
        if (u == d.c()) {
            h.c(dVar);
        }
        return u;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(java.lang.Exception r4, kotlin.c0.d<?> r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.j.g
            if (r0 == 0) goto L_0x0013
            r0 = r5
            retrofit2.j$g r0 = (retrofit2.j.g) r0
            int r1 = r0.f11794k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f11794k = r1
            goto L_0x0018
        L_0x0013:
            retrofit2.j$g r0 = new retrofit2.j$g
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f11793j
            java.lang.Object r1 = kotlin.c0.i.d.c()
            int r2 = r0.f11794k
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r4 = r0.f11795l
            java.lang.Exception r4 = (java.lang.Exception) r4
            boolean r0 = r5 instanceof kotlin.k.b
            if (r0 == 0) goto L_0x0049
            kotlin.k$b r5 = (kotlin.k.b) r5
            java.lang.Throwable r4 = r5.f10689g
            throw r4
        L_0x0032:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003a:
            boolean r2 = r5 instanceof kotlin.k.b
            if (r2 != 0) goto L_0x004a
            r0.f11795l = r4
            r0.f11794k = r3
            java.lang.Object r5 = kotlinx.coroutines.d3.b(r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            throw r4
        L_0x004a:
            kotlin.k$b r5 = (kotlin.k.b) r5
            java.lang.Throwable r4 = r5.f10689g
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.j.d(java.lang.Exception, kotlin.c0.d):java.lang.Object");
    }
}
