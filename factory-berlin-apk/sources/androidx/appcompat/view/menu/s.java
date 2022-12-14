package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import e.h.e.a.c;

/* compiled from: SubMenuWrapperICS */
class s extends o implements SubMenu {

    /* renamed from: e  reason: collision with root package name */
    private final c f293e;

    s(Context context, c cVar) {
        super(context, cVar);
        this.f293e = cVar;
    }

    public void clearHeader() {
        this.f293e.clearHeader();
    }

    public MenuItem getItem() {
        return c(this.f293e.getItem());
    }

    public SubMenu setHeaderIcon(int i2) {
        this.f293e.setHeaderIcon(i2);
        return this;
    }

    public SubMenu setHeaderTitle(int i2) {
        this.f293e.setHeaderTitle(i2);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f293e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i2) {
        this.f293e.setIcon(i2);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f293e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f293e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f293e.setIcon(drawable);
        return this;
    }
}
