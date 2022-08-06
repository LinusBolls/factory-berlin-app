package m.a.c.f;

import java.util.ArrayList;
import kotlin.e0.c.l;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import m.a.c.e.b;
import org.koin.core.error.InstanceCreationException;

/* compiled from: DefinitionInstance.kt */
public abstract class a<T> {
    private final b<T> a;

    /* renamed from: m.a.c.f.a$a  reason: collision with other inner class name */
    /* compiled from: DefinitionInstance.kt */
    public static final class C0784a {
        private C0784a() {
        }

        public /* synthetic */ C0784a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C0784a((DefaultConstructorMarker) null);
    }

    public a(b<T> bVar) {
        k.f(bVar, "beanDefinition");
        this.a = bVar;
    }

    public abstract void a();

    public <T> T b(c cVar) {
        k.f(cVar, "context");
        if (m.a.c.b.c.b().d(m.a.c.g.b.DEBUG)) {
            m.a.c.b.c.b().a("| create instance for " + this.a);
        }
        try {
            m.a.c.i.a b = cVar.b();
            p<m.a.c.l.a, m.a.c.i.a, T> c = this.a.c();
            m.a.c.l.a c2 = cVar.c();
            if (c2 != null) {
                return c.l(c2, b);
            }
            throw new IllegalStateException("Can't execute definition instance while this context is not registered against any Koin instance".toString());
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append(e2.toString());
            sb.append("\n\t");
            StackTraceElement[] stackTrace = e2.getStackTrace();
            k.b(stackTrace, "e.stackTrace");
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                k.b(stackTraceElement, "it");
                String className = stackTraceElement.getClassName();
                k.b(className, "it.className");
                if (!(!q.I(className, "sun.reflect", false, 2, (Object) null))) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb.append(v.F(arrayList, "\n\t", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
            String sb2 = sb.toString();
            m.a.c.b.c.b().b("Instance creation error : could not create instance for " + this.a + ": " + sb2);
            throw new InstanceCreationException("Could not create instance for " + this.a, e2);
        }
    }

    public abstract <T> T c(c cVar);

    public final b<T> d() {
        return this.a;
    }

    public abstract void e(c cVar);
}
