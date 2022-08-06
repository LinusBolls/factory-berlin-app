package e.h.k;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: ActionProvider */
public abstract class b {
    private C0563b a;

    /* compiled from: ActionProvider */
    public interface a {
    }

    /* renamed from: e.h.k.b$b  reason: collision with other inner class name */
    /* compiled from: ActionProvider */
    public interface C0563b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public b(Context context) {
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.a = null;
    }

    public void i(a aVar) {
    }

    public void j(C0563b bVar) {
        if (!(this.a == null || bVar == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.a = bVar;
    }
}
