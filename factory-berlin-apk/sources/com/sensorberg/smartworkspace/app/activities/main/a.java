package com.sensorberg.smartworkspace.app.activities.main;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.navigation.NavController;
import androidx.navigation.o;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import g.e.d.n;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: BottomNavigationHelper.kt */
public final class a {
    public static final a a = new a();

    /* renamed from: com.sensorberg.smartworkspace.app.activities.main.a$a  reason: collision with other inner class name */
    /* compiled from: BottomNavigationHelper.kt */
    static final class C0423a implements BottomNavigationView.d {
        final /* synthetic */ List a;
        final /* synthetic */ NavController b;

        C0423a(List list, NavController navController) {
            this.a = list;
            this.b = navController;
        }

        public final boolean a(MenuItem menuItem) {
            Object obj;
            boolean z;
            k.e(menuItem, "item");
            Iterator it = this.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((n) obj).d() == menuItem.getItemId()) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            n nVar = (n) obj;
            if (nVar != null) {
                this.b.s(nVar.b());
            }
            return true;
        }
    }

    /* compiled from: BottomNavigationHelper.kt */
    public static final class b implements NavController.b {
        final /* synthetic */ WeakReference a;
        final /* synthetic */ NavController b;

        b(WeakReference weakReference, NavController navController) {
            this.a = weakReference;
            this.b = navController;
        }

        public void a(NavController navController, o oVar, Bundle bundle) {
            k.e(navController, "controller");
            k.e(oVar, "destination");
            BottomNavigationView bottomNavigationView = (BottomNavigationView) this.a.get();
            if (bottomNavigationView == null) {
                this.b.y(this);
                return;
            }
            Menu menu = bottomNavigationView.getMenu();
            k.d(menu, "view.menu");
            int size = menu.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = menu.getItem(i2);
                a aVar = a.a;
                k.d(item, "item");
                if (aVar.b(oVar, item.getItemId())) {
                    item.setChecked(true);
                }
            }
        }
    }

    private a() {
    }

    /* access modifiers changed from: private */
    public final boolean b(o oVar, int i2) {
        while (true) {
            k.c(oVar);
            if (oVar.m() != i2 && oVar.o() != null) {
                oVar = oVar.o();
            }
        }
        return oVar.m() == i2;
    }

    public final void c(BottomNavigationView bottomNavigationView, NavController navController, List<? extends n> list) {
        k.e(bottomNavigationView, "bottomNavigationView");
        k.e(navController, "navController");
        k.e(list, "tabs");
        bottomNavigationView.setOnNavigationItemSelectedListener(new C0423a(list, navController));
        navController.a(new b(new WeakReference(bottomNavigationView), navController));
    }
}
