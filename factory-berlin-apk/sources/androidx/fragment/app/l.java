package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.m;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: FragmentLifecycleCallbacksDispatcher */
class l {
    private final CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList<>();
    private final m b;

    /* compiled from: FragmentLifecycleCallbacksDispatcher */
    private static final class a {
        final m.f a;
        final boolean b;

        a(m.f fVar, boolean z) {
            this.a = fVar;
            this.b = z;
        }
    }

    l(m mVar) {
        this.b = mVar;
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment i0 = this.b.i0();
        if (i0 != null) {
            i0.P().h0().a(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.a(this.b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Fragment fragment, Context context, boolean z) {
        Fragment i0 = this.b.i0();
        if (i0 != null) {
            i0.P().h0().b(fragment, context, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.b(this.b, fragment, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment i0 = this.b.i0();
        if (i0 != null) {
            i0.P().h0().c(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.c(this.b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(Fragment fragment, boolean z) {
        Fragment i0 = this.b.i0();
        if (i0 != null) {
            i0.P().h0().d(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.d(this.b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(Fragment fragment, boolean z) {
        Fragment i0 = this.b.i0();
        if (i0 != null) {
            i0.P().h0().e(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.e(this.b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f(Fragment fragment, boolean z) {
        Fragment i0 = this.b.i0();
        if (i0 != null) {
            i0.P().h0().f(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.f(this.b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g(Fragment fragment, Context context, boolean z) {
        Fragment i0 = this.b.i0();
        if (i0 != null) {
            i0.P().h0().g(fragment, context, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.g(this.b, fragment, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment i0 = this.b.i0();
        if (i0 != null) {
            i0.P().h0().h(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.h(this.b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void i(Fragment fragment, boolean z) {
        Fragment i0 = this.b.i0();
        if (i0 != null) {
            i0.P().h0().i(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.i(this.b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment i0 = this.b.i0();
        if (i0 != null) {
            i0.P().h0().j(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.j(this.b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k(Fragment fragment, boolean z) {
        Fragment i0 = this.b.i0();
        if (i0 != null) {
            i0.P().h0().k(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.k(this.b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l(Fragment fragment, boolean z) {
        Fragment i0 = this.b.i0();
        if (i0 != null) {
            i0.P().h0().l(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.l(this.b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment i0 = this.b.i0();
        if (i0 != null) {
            i0.P().h0().m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.m(this.b, fragment, view, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void n(Fragment fragment, boolean z) {
        Fragment i0 = this.b.i0();
        if (i0 != null) {
            i0.P().h0().n(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.n(this.b, fragment);
            }
        }
    }

    public void o(m.f fVar, boolean z) {
        this.a.add(new a(fVar, z));
    }

    public void p(m.f fVar) {
        synchronized (this.a) {
            int i2 = 0;
            int size = this.a.size();
            while (true) {
                if (i2 >= size) {
                    break;
                } else if (this.a.get(i2).a == fVar) {
                    this.a.remove(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
    }
}
