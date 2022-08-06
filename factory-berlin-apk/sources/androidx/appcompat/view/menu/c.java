package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import e.e.a;
import e.h.e.a.b;
import java.util.Iterator;
import java.util.Map;

/* compiled from: BaseMenuWrapper */
abstract class c {
    final Context a;
    private Map<b, MenuItem> b;
    private Map<e.h.e.a.c, SubMenu> c;

    c(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: package-private */
    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof b)) {
            return menuItem;
        }
        b bVar = (b) menuItem;
        if (this.b == null) {
            this.b = new a();
        }
        MenuItem menuItem2 = this.b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j jVar = new j(this.a, bVar);
        this.b.put(bVar, jVar);
        return jVar;
    }

    /* access modifiers changed from: package-private */
    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof e.h.e.a.c)) {
            return subMenu;
        }
        e.h.e.a.c cVar = (e.h.e.a.c) subMenu;
        if (this.c == null) {
            this.c = new a();
        }
        SubMenu subMenu2 = this.c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        s sVar = new s(this.a, cVar);
        this.c.put(cVar, sVar);
        return sVar;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        Map<b, MenuItem> map = this.b;
        if (map != null) {
            map.clear();
        }
        Map<e.h.e.a.c, SubMenu> map2 = this.c;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final void f(int i2) {
        Map<b, MenuItem> map = this.b;
        if (map != null) {
            Iterator<b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i2 == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void g(int i2) {
        Map<b, MenuItem> map = this.b;
        if (map != null) {
            Iterator<b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i2 == it.next().getItemId()) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
