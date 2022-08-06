package m.a.c.l;

import java.util.HashSet;
import kotlin.jvm.internal.k;
import m.a.c.e.b;
import m.a.c.j.a;

/* compiled from: ScopeDefinition.kt */
public final class c {
    private final HashSet<b<?>> a = new HashSet<>();
    private final a b;

    public c(a aVar) {
        k.f(aVar, "qualifier");
        this.b = aVar;
    }

    public final HashSet<b<?>> a() {
        return this.a;
    }

    public final a b() {
        return this.b;
    }

    public final void c(a aVar) {
        k.f(aVar, "instance");
        for (b d2 : this.a) {
            m.a.c.f.a d3 = d2.d();
            if (d3 != null) {
                d3.e(new m.a.c.f.c((m.a.c.a) null, aVar, (kotlin.e0.c.a) null, 5, (DefaultConstructorMarker) null));
            }
        }
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
        return "ScopeDefinition(qualifier=" + this.b + ")";
    }
}
