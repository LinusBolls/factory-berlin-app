package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import e.h.e.a.b;

/* compiled from: ActionMenuItem */
public class a implements b {
    private final int a;
    private final int b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f193d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f194e;

    /* renamed from: f  reason: collision with root package name */
    private Intent f195f;

    /* renamed from: g  reason: collision with root package name */
    private char f196g;

    /* renamed from: h  reason: collision with root package name */
    private int f197h = 4096;

    /* renamed from: i  reason: collision with root package name */
    private char f198i;

    /* renamed from: j  reason: collision with root package name */
    private int f199j = 4096;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f200k;

    /* renamed from: l  reason: collision with root package name */
    private Context f201l;

    /* renamed from: m  reason: collision with root package name */
    private CharSequence f202m;

    /* renamed from: n  reason: collision with root package name */
    private CharSequence f203n;
    private ColorStateList o = null;
    private PorterDuff.Mode p = null;
    private boolean q = false;
    private boolean r = false;
    private int s = 16;

    public a(Context context, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.f201l = context;
        this.a = i3;
        this.b = i2;
        this.c = i5;
        this.f193d = charSequence;
    }

    private void c() {
        if (this.f200k == null) {
            return;
        }
        if (this.q || this.r) {
            Drawable r2 = androidx.core.graphics.drawable.a.r(this.f200k);
            this.f200k = r2;
            Drawable mutate = r2.mutate();
            this.f200k = mutate;
            if (this.q) {
                androidx.core.graphics.drawable.a.o(mutate, this.o);
            }
            if (this.r) {
                androidx.core.graphics.drawable.a.p(this.f200k, this.p);
            }
        }
    }

    public b a(e.h.k.b bVar) {
        throw new UnsupportedOperationException();
    }

    public e.h.k.b b() {
        return null;
    }

    public boolean collapseActionView() {
        return false;
    }

    public b d(int i2) {
        throw new UnsupportedOperationException();
    }

    public b e(View view) {
        throw new UnsupportedOperationException();
    }

    public boolean expandActionView() {
        return false;
    }

    public b f(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f199j;
    }

    public char getAlphabeticShortcut() {
        return this.f198i;
    }

    public CharSequence getContentDescription() {
        return this.f202m;
    }

    public int getGroupId() {
        return this.b;
    }

    public Drawable getIcon() {
        return this.f200k;
    }

    public ColorStateList getIconTintList() {
        return this.o;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.p;
    }

    public Intent getIntent() {
        return this.f195f;
    }

    public int getItemId() {
        return this.a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f197h;
    }

    public char getNumericShortcut() {
        return this.f196g;
    }

    public int getOrder() {
        return this.c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f193d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f194e;
        return charSequence != null ? charSequence : this.f193d;
    }

    public CharSequence getTooltipText() {
        return this.f203n;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.s & 1) != 0;
    }

    public boolean isChecked() {
        return (this.s & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.s & 16) != 0;
    }

    public boolean isVisible() {
        return (this.s & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(int i2) {
        d(i2);
        throw null;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.f198i = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.s = z | (this.s & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.s = (z ? 2 : 0) | (this.s & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.s = (z ? 16 : 0) | (this.s & -17);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f200k = drawable;
        c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.o = colorStateList;
        this.q = true;
        c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.p = mode;
        this.r = true;
        c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f195f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.f196g = c2;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f196g = c2;
        this.f198i = Character.toLowerCase(c3);
        return this;
    }

    public void setShowAsAction(int i2) {
    }

    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
        f(i2);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f193d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f194e = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i2 = 8;
        int i3 = this.s & 8;
        if (z) {
            i2 = 0;
        }
        this.s = i3 | i2;
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        e(view);
        throw null;
    }

    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f198i = Character.toLowerCase(c2);
        this.f199j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public b setContentDescription(CharSequence charSequence) {
        this.f202m = charSequence;
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f196g = c2;
        this.f197h = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setTitle(int i2) {
        this.f193d = this.f201l.getResources().getString(i2);
        return this;
    }

    public b setTooltipText(CharSequence charSequence) {
        this.f203n = charSequence;
        return this;
    }

    public MenuItem setIcon(int i2) {
        this.f200k = androidx.core.content.a.f(this.f201l, i2);
        c();
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f196g = c2;
        this.f197h = KeyEvent.normalizeMetaState(i2);
        this.f198i = Character.toLowerCase(c3);
        this.f199j = KeyEvent.normalizeMetaState(i3);
        return this;
    }
}
