package e.a.n;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import e.a.n.b;
import java.lang.ref.WeakReference;

/* compiled from: StandaloneActionMode */
public class e extends b implements g.a {

    /* renamed from: i  reason: collision with root package name */
    private Context f8388i;

    /* renamed from: j  reason: collision with root package name */
    private ActionBarContextView f8389j;

    /* renamed from: k  reason: collision with root package name */
    private b.a f8390k;

    /* renamed from: l  reason: collision with root package name */
    private WeakReference<View> f8391l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f8392m;

    /* renamed from: n  reason: collision with root package name */
    private g f8393n;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z) {
        this.f8388i = context;
        this.f8389j = actionBarContextView;
        this.f8390k = aVar;
        g gVar = new g(actionBarContextView.getContext());
        gVar.W(1);
        this.f8393n = gVar;
        gVar.V(this);
    }

    public boolean a(g gVar, MenuItem menuItem) {
        return this.f8390k.c(this, menuItem);
    }

    public void b(g gVar) {
        k();
        this.f8389j.l();
    }

    public void c() {
        if (!this.f8392m) {
            this.f8392m = true;
            this.f8389j.sendAccessibilityEvent(32);
            this.f8390k.b(this);
        }
    }

    public View d() {
        WeakReference<View> weakReference = this.f8391l;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public Menu e() {
        return this.f8393n;
    }

    public MenuInflater f() {
        return new g(this.f8389j.getContext());
    }

    public CharSequence g() {
        return this.f8389j.getSubtitle();
    }

    public CharSequence i() {
        return this.f8389j.getTitle();
    }

    public void k() {
        this.f8390k.a(this, this.f8393n);
    }

    public boolean l() {
        return this.f8389j.j();
    }

    public void m(View view) {
        this.f8389j.setCustomView(view);
        this.f8391l = view != null ? new WeakReference<>(view) : null;
    }

    public void n(int i2) {
        o(this.f8388i.getString(i2));
    }

    public void o(CharSequence charSequence) {
        this.f8389j.setSubtitle(charSequence);
    }

    public void q(int i2) {
        r(this.f8388i.getString(i2));
    }

    public void r(CharSequence charSequence) {
        this.f8389j.setTitle(charSequence);
    }

    public void s(boolean z) {
        super.s(z);
        this.f8389j.setTitleOptional(z);
    }
}
