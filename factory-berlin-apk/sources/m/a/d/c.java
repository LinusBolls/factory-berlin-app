package m.a.d;

import java.util.HashSet;
import kotlin.jvm.internal.k;
import m.a.c.e.b;
import m.a.c.j.a;

/* compiled from: ScopeSet.kt */
public final class c {
    private final HashSet<b<?>> a;
    private final a b;

    public final m.a.c.l.c a() {
        m.a.c.l.c cVar = new m.a.c.l.c(this.b);
        cVar.a().addAll(this.a);
        return cVar;
    }

    public final HashSet<b<?>> b() {
        return this.a;
    }

    public final a c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && k.a(this.b, ((c) obj).b);
        }
        return true;
    }

    public int hashCode() {
        a aVar = this.b;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "Scope['" + this.b + "']";
    }
}
