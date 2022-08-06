package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import e.h.k.b;
import java.lang.reflect.Method;

/* compiled from: MenuItemWrapperICS */
public class j extends c implements MenuItem {

    /* renamed from: d  reason: collision with root package name */
    private final e.h.e.a.b f268d;

    /* renamed from: e  reason: collision with root package name */
    private Method f269e;

    /* compiled from: MenuItemWrapperICS */
    private class a extends e.h.k.b {
        final ActionProvider b;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.b = actionProvider;
        }

        public boolean a() {
            return this.b.hasSubMenu();
        }

        public View c() {
            return this.b.onCreateActionView();
        }

        public boolean e() {
            return this.b.onPerformDefaultAction();
        }

        public void f(SubMenu subMenu) {
            this.b.onPrepareSubMenu(j.this.d(subMenu));
        }
    }

    /* compiled from: MenuItemWrapperICS */
    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: d  reason: collision with root package name */
        private b.C0563b f270d;

        b(j jVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        public boolean b() {
            return this.b.isVisible();
        }

        public View d(MenuItem menuItem) {
            return this.b.onCreateActionView(menuItem);
        }

        public boolean g() {
            return this.b.overridesItemVisibility();
        }

        public void j(b.C0563b bVar) {
            this.f270d = bVar;
            this.b.setVisibilityListener(bVar != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            b.C0563b bVar = this.f270d;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* compiled from: MenuItemWrapperICS */
    static class c extends FrameLayout implements e.a.n.c {

        /* renamed from: g  reason: collision with root package name */
        final CollapsibleActionView f271g;

        c(View view) {
            super(view.getContext());
            this.f271g = (CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: package-private */
        public View a() {
            return (View) this.f271g;
        }

        public void c() {
            this.f271g.onActionViewExpanded();
        }

        public void f() {
            this.f271g.onActionViewCollapsed();
        }
    }

    /* compiled from: MenuItemWrapperICS */
    private class d implements MenuItem.OnActionExpandListener {
        private final MenuItem.OnActionExpandListener a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.a.onMenuItemActionCollapse(j.this.c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.a.onMenuItemActionExpand(j.this.c(menuItem));
        }
    }

    /* compiled from: MenuItemWrapperICS */
    private class e implements MenuItem.OnMenuItemClickListener {
        private final MenuItem.OnMenuItemClickListener a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.a.onMenuItemClick(j.this.c(menuItem));
        }
    }

    public j(Context context, e.h.e.a.b bVar) {
        super(context);
        if (bVar != null) {
            this.f268d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f268d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f268d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        e.h.k.b b2 = this.f268d.b();
        if (b2 instanceof a) {
            return ((a) b2).b;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f268d.getActionView();
        return actionView instanceof c ? ((c) actionView).a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f268d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f268d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f268d.getContentDescription();
    }

    public int getGroupId() {
        return this.f268d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f268d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f268d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f268d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f268d.getIntent();
    }

    public int getItemId() {
        return this.f268d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f268d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f268d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f268d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f268d.getOrder();
    }

    public SubMenu getSubMenu() {
        return d(this.f268d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f268d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f268d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f268d.getTooltipText();
    }

    public void h(boolean z) {
        try {
            if (this.f269e == null) {
                this.f269e = this.f268d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f269e.invoke(this.f268d, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e2) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
        }
    }

    public boolean hasSubMenu() {
        return this.f268d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f268d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f268d.isCheckable();
    }

    public boolean isChecked() {
        return this.f268d.isChecked();
    }

    public boolean isEnabled() {
        return this.f268d.isEnabled();
    }

    public boolean isVisible() {
        return this.f268d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        e.h.k.b bVar;
        if (Build.VERSION.SDK_INT >= 16) {
            bVar = new b(this, this.a, actionProvider);
        } else {
            bVar = new a(this.a, actionProvider);
        }
        e.h.e.a.b bVar2 = this.f268d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f268d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.f268d.setAlphabeticShortcut(c2);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f268d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f268d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f268d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f268d.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f268d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f268d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f268d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f268d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.f268d.setNumericShortcut(c2);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f268d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f268d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f268d.setShortcut(c2, c3);
        return this;
    }

    public void setShowAsAction(int i2) {
        this.f268d.setShowAsAction(i2);
    }

    public MenuItem setShowAsActionFlags(int i2) {
        this.f268d.setShowAsActionFlags(i2);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f268d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f268d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f268d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f268d.setVisible(z);
    }

    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f268d.setAlphabeticShortcut(c2, i2);
        return this;
    }

    public MenuItem setIcon(int i2) {
        this.f268d.setIcon(i2);
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f268d.setNumericShortcut(c2, i2);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f268d.setShortcut(c2, c3, i2, i3);
        return this;
    }

    public MenuItem setTitle(int i2) {
        this.f268d.setTitle(i2);
        return this;
    }

    public MenuItem setActionView(int i2) {
        this.f268d.setActionView(i2);
        View actionView = this.f268d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f268d.setActionView((View) new c(actionView));
        }
        return this;
    }
}
