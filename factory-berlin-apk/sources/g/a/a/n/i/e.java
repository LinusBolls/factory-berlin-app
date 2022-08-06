package g.a.a.n.i;

import g.a.a.h.s.q;
import g.a.a.m.a;
import g.a.a.m.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: RealApolloInterceptorChain */
public final class e implements b {
    private final List<a> a;
    private final int b;

    public e(List<a> list) {
        this(list, 0);
    }

    public void a() {
        for (a a2 : this.a) {
            a2.a();
        }
    }

    public void b(a.c cVar, Executor executor, a.C0610a aVar) {
        if (this.b < this.a.size()) {
            this.a.get(this.b).b(cVar, new e(this.a, this.b + 1), executor, aVar);
            return;
        }
        throw new IllegalStateException();
    }

    private e(List<a> list, int i2) {
        if (i2 <= list.size()) {
            q.b(list, "interceptors == null");
            this.a = new ArrayList(list);
            this.b = i2;
            return;
        }
        throw new IllegalArgumentException();
    }
}
