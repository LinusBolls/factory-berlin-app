package androidx.work.impl;

import androidx.lifecycle.e0;
import androidx.work.impl.utils.j.c;
import androidx.work.l;

/* compiled from: OperationImpl */
public class b implements l {
    private final e0<l.b> c = new e0<>();

    /* renamed from: d  reason: collision with root package name */
    private final c<l.b.c> f1594d = c.t();

    public b() {
        a(l.b);
    }

    public void a(l.b bVar) {
        this.c.s(bVar);
        if (bVar instanceof l.b.c) {
            this.f1594d.p((l.b.c) bVar);
        } else if (bVar instanceof l.b.a) {
            this.f1594d.q(((l.b.a) bVar).a());
        }
    }
}
