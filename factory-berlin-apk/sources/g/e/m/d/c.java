package g.e.m.d;

import androidx.lifecycle.f0;
import g.e.m.a;

/* compiled from: ResponseObserver.kt */
public class c<T, P> implements f0<a<T, P>> {
    /* renamed from: a */
    public final void k(a<T, P> aVar) {
        if (aVar != null) {
            int i2 = b.a[aVar.f().ordinal()];
            if (i2 == 1) {
                b(aVar.e());
            } else if (i2 == 2) {
                d(aVar.c());
            } else if (i2 == 3) {
                c(aVar.d());
            }
        }
    }

    public void b(P p) {
    }

    public void c(Exception exc) {
    }

    public abstract void d(T t);
}
