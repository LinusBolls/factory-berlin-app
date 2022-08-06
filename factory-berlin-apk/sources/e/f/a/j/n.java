package e.f.a.j;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ResolutionNode */
public class n {
    HashSet<n> a = new HashSet<>(2);
    int b = 0;

    public void a(n nVar) {
        this.a.add(nVar);
    }

    public void b() {
        this.b = 1;
        Iterator<n> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    public void c() {
        this.b = 0;
        Iterator<n> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    public boolean d() {
        return this.b == 1;
    }

    public void e() {
        this.b = 0;
        this.a.clear();
    }

    public void f() {
    }
}
