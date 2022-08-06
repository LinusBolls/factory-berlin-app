package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;

/* compiled from: BottomNavigationMenu */
public final class b extends g {
    public b(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        if (size() + 1 <= 5) {
            h0();
            MenuItem a = super.a(i2, i3, i4, charSequence);
            if (a instanceof i) {
                ((i) a).t(true);
            }
            g0();
            return a;
        }
        throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }
}
