package e.a.n;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* compiled from: ActionMode */
public abstract class b {

    /* renamed from: g  reason: collision with root package name */
    private Object f8384g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f8385h;

    /* compiled from: ActionMode */
    public interface a {
        boolean a(b bVar, Menu menu);

        void b(b bVar);

        boolean c(b bVar, MenuItem menuItem);

        boolean d(b bVar, Menu menu);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.f8384g;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.f8385h;
    }

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i2);

    public abstract void o(CharSequence charSequence);

    public void p(Object obj) {
        this.f8384g = obj;
    }

    public abstract void q(int i2);

    public abstract void r(CharSequence charSequence);

    public void s(boolean z) {
        this.f8385h = z;
    }
}
