package m.a.c.f;

import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: FactoryDefinitionInstance.kt */
public final class b<T> extends a<T> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(m.a.c.e.b<T> bVar) {
        super(bVar);
        k.f(bVar, "beanDefinition");
    }

    public void a() {
        l e2 = d().e();
        if (e2 != null) {
            x xVar = (x) e2.o(null);
        }
    }

    public <T> T c(c cVar) {
        k.f(cVar, "context");
        return b(cVar);
    }

    public void e(c cVar) {
        k.f(cVar, "context");
    }
}
