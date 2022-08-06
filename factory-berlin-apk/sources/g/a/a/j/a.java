package g.a.a.j;

import com.apollographql.apollo.exception.ApolloException;
import g.a.a.a;
import g.a.a.h.n;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s;
import kotlinx.coroutines.u;
import kotlinx.coroutines.x1;

/* compiled from: CoroutinesExtensions.kt */
public final class a {

    /* renamed from: g.a.a.j.a$a  reason: collision with other inner class name */
    /* compiled from: CoroutinesExtensions.kt */
    static final class C0608a extends l implements kotlin.e0.c.l<Throwable, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g.a.a.a f9133h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ s f9134i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0608a(g.a.a.a aVar, s sVar) {
            super(1);
            this.f9133h = aVar;
            this.f9134i = sVar;
        }

        public final void a(Throwable th) {
            if (this.f9134i.isCancelled()) {
                this.f9133h.cancel();
            }
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Throwable) obj);
            return x.a;
        }
    }

    /* compiled from: CoroutinesExtensions.kt */
    public static final class b extends a.C0593a<T> {
        final /* synthetic */ s a;

        b(s sVar) {
            this.a = sVar;
        }

        public void b(ApolloException apolloException) {
            k.f(apolloException, "e");
            if (this.a.b()) {
                this.a.y(apolloException);
            }
        }

        public void f(n<T> nVar) {
            k.f(nVar, "response");
            if (this.a.b()) {
                this.a.z(nVar);
            }
        }
    }

    public static final <T> r0<n<T>> a(g.a.a.a<T> aVar) {
        k.f(aVar, "$this$toDeferred");
        s b2 = u.b((x1) null, 1, (Object) null);
        b2.n(new C0608a(aVar, b2));
        aVar.j(new b(b2));
        return b2;
    }
}
