package m.a.c.f;

import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;
import m.a.c.e.b;

/* compiled from: SingleDefinitionInstance.kt */
public final class e<T> extends a<T> {
    private T b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(b<T> bVar) {
        super(bVar);
        k.f(bVar, "beanDefinition");
    }

    public void a() {
        l e2 = d().e();
        if (e2 != null) {
            x xVar = (x) e2.o(this.b);
        }
        this.b = null;
    }

    public <T> T c(c cVar) {
        k.f(cVar, "context");
        if (this.b == null) {
            this.b = b(cVar);
        }
        T t = this.b;
        if (!(t instanceof Object)) {
            t = null;
        }
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Single instance created couldn't return value".toString());
    }

    public void e(c cVar) {
        k.f(cVar, "context");
    }
}
