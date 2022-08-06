package g.a.a;

import com.apollographql.apollo.exception.ApolloCanceledException;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloHttpException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.exception.ApolloParseException;
import g.a.a.h.k;
import g.a.a.h.n;
import k.d0;

/* compiled from: ApolloCall */
public interface a<T> {

    /* renamed from: g.a.a.a$a  reason: collision with other inner class name */
    /* compiled from: ApolloCall */
    public static abstract class C0593a<T> {
        public void a(ApolloCanceledException apolloCanceledException) {
            b(apolloCanceledException);
        }

        public abstract void b(ApolloException apolloException);

        public void c(ApolloHttpException apolloHttpException) {
            b(apolloHttpException);
            d0 b = apolloHttpException.b();
            if (b != null) {
                b.close();
            }
        }

        public void d(ApolloNetworkException apolloNetworkException) {
            b(apolloNetworkException);
        }

        public void e(ApolloParseException apolloParseException) {
            b(apolloParseException);
        }

        public abstract void f(n<T> nVar);

        public void g(b bVar) {
        }
    }

    /* compiled from: ApolloCall */
    public enum b {
        SCHEDULED,
        FETCH_CACHE,
        FETCH_NETWORK,
        COMPLETED
    }

    void cancel();

    a<T> i();

    void j(C0593a<T> aVar);

    k k();
}
