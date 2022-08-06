package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;
import e.a.e;
import e.a.f;
import e.a.h;
import e.a.j;
import e.h.k.a0;
import e.h.k.u;
import e.h.k.y;

/* compiled from: ToolbarWidgetWrapper */
public class x0 implements d0 {
    Toolbar a;
    private int b;
    private View c;

    /* renamed from: d  reason: collision with root package name */
    private View f540d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f541e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f542f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f543g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f544h;

    /* renamed from: i  reason: collision with root package name */
    CharSequence f545i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f546j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f547k;

    /* renamed from: l  reason: collision with root package name */
    Window.Callback f548l;

    /* renamed from: m  reason: collision with root package name */
    boolean f549m;

    /* renamed from: n  reason: collision with root package name */
    private c f550n;
    private int o;
    private int p;
    private Drawable q;

    /* compiled from: ToolbarWidgetWrapper */
    class a implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final androidx.appcompat.view.menu.a f551g = new androidx.appcompat.view.menu.a(x0.this.a.getContext(), 0, 16908332, 0, 0, x0.this.f545i);

        a() {
        }

        public void onClick(View view) {
            x0 x0Var = x0.this;
            Window.Callback callback = x0Var.f548l;
            if (callback != null && x0Var.f549m) {
                callback.onMenuItemSelected(0, this.f551g);
            }
        }
    }

    /* compiled from: ToolbarWidgetWrapper */
    class b extends a0 {
        private boolean a = false;
        final /* synthetic */ int b;

        b(int i2) {
            this.b = i2;
        }

        public void a(View view) {
            this.a = true;
        }

        public void b(View view) {
            if (!this.a) {
                x0.this.a.setVisibility(this.b);
            }
        }

        public void c(View view) {
            x0.this.a.setVisibility(0);
        }
    }

    public x0(Toolbar toolbar, boolean z) {
        this(toolbar, z, h.abc_action_bar_up_description, e.abc_ic_ab_back_material);
    }

    private void F(CharSequence charSequence) {
        this.f545i = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setTitle(charSequence);
        }
    }

    private void G() {
        if ((this.b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f547k)) {
            this.a.setNavigationContentDescription(this.p);
        } else {
            this.a.setNavigationContentDescription(this.f547k);
        }
    }

    private void H() {
        if ((this.b & 4) != 0) {
            Toolbar toolbar = this.a;
            Drawable drawable = this.f543g;
            if (drawable == null) {
                drawable = this.q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.a.setNavigationIcon((Drawable) null);
    }

    private void I() {
        Drawable drawable;
        int i2 = this.b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.f542f;
            if (drawable == null) {
                drawable = this.f541e;
            }
        } else {
            drawable = this.f541e;
        }
        this.a.setLogo(drawable);
    }

    private int w() {
        if (this.a.getNavigationIcon() == null) {
            return 11;
        }
        this.q = this.a.getNavigationIcon();
        return 15;
    }

    public void A(int i2) {
        B(i2 == 0 ? null : c().getString(i2));
    }

    public void B(CharSequence charSequence) {
        this.f547k = charSequence;
        G();
    }

    public void C(Drawable drawable) {
        this.f543g = drawable;
        H();
    }

    public void D(CharSequence charSequence) {
        this.f546j = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    public void E(CharSequence charSequence) {
        this.f544h = true;
        F(charSequence);
    }

    public void a(Menu menu, m.a aVar) {
        if (this.f550n == null) {
            c cVar = new c(this.a.getContext());
            this.f550n = cVar;
            cVar.r(f.action_menu_presenter);
        }
        this.f550n.m(aVar);
        this.a.I((g) menu, this.f550n);
    }

    public boolean b() {
        return this.a.A();
    }

    public Context c() {
        return this.a.getContext();
    }

    public void collapseActionView() {
        this.a.e();
    }

    public void d() {
        this.f549m = true;
    }

    public boolean e() {
        return this.a.z();
    }

    public boolean f() {
        return this.a.w();
    }

    public boolean g() {
        return this.a.N();
    }

    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    public boolean h() {
        return this.a.d();
    }

    public void i() {
        this.a.f();
    }

    public void j(int i2) {
        this.a.setVisibility(i2);
    }

    public void k(p0 p0Var) {
        Toolbar toolbar;
        View view = this.c;
        if (view != null && view.getParent() == (toolbar = this.a)) {
            toolbar.removeView(this.c);
        }
        this.c = p0Var;
        if (p0Var != null && this.o == 2) {
            this.a.addView(p0Var, 0);
            Toolbar.e eVar = (Toolbar.e) this.c.getLayoutParams();
            eVar.width = -2;
            eVar.height = -2;
            eVar.a = 8388691;
            p0Var.setAllowCollapse(true);
        }
    }

    public ViewGroup l() {
        return this.a;
    }

    public void m(boolean z) {
    }

    public boolean n() {
        return this.a.v();
    }

    public void o(int i2) {
        View view;
        int i3 = this.b ^ i2;
        this.b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    G();
                }
                H();
            }
            if ((i3 & 3) != 0) {
                I();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.a.setTitle(this.f545i);
                    this.a.setSubtitle(this.f546j);
                } else {
                    this.a.setTitle((CharSequence) null);
                    this.a.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) != 0 && (view = this.f540d) != null) {
                if ((i2 & 16) != 0) {
                    this.a.addView(view);
                } else {
                    this.a.removeView(view);
                }
            }
        }
    }

    public int p() {
        return this.b;
    }

    public void q(int i2) {
        z(i2 != 0 ? e.a.k.a.a.d(c(), i2) : null);
    }

    public int r() {
        return this.o;
    }

    public y s(int i2, long j2) {
        y c2 = u.c(this.a);
        c2.a(i2 == 0 ? 1.0f : 0.0f);
        c2.d(j2);
        c2.f(new b(i2));
        return c2;
    }

    public void setIcon(int i2) {
        setIcon(i2 != 0 ? e.a.k.a.a.d(c(), i2) : null);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f548l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f544h) {
            F(charSequence);
        }
    }

    public void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void u() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void v(boolean z) {
        this.a.setCollapsible(z);
    }

    public void x(View view) {
        View view2 = this.f540d;
        if (!(view2 == null || (this.b & 16) == 0)) {
            this.a.removeView(view2);
        }
        this.f540d = view;
        if (view != null && (this.b & 16) != 0) {
            this.a.addView(view);
        }
    }

    public void y(int i2) {
        if (i2 != this.p) {
            this.p = i2;
            if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
                A(this.p);
            }
        }
    }

    public void z(Drawable drawable) {
        this.f542f = drawable;
        I();
    }

    public x0(Toolbar toolbar, boolean z, int i2, int i3) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.a = toolbar;
        this.f545i = toolbar.getTitle();
        this.f546j = toolbar.getSubtitle();
        this.f544h = this.f545i != null;
        this.f543g = toolbar.getNavigationIcon();
        w0 u = w0.u(toolbar.getContext(), (AttributeSet) null, j.ActionBar, e.a.a.actionBarStyle, 0);
        this.q = u.g(j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence p2 = u.p(j.ActionBar_title);
            if (!TextUtils.isEmpty(p2)) {
                E(p2);
            }
            CharSequence p3 = u.p(j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(p3)) {
                D(p3);
            }
            Drawable g2 = u.g(j.ActionBar_logo);
            if (g2 != null) {
                z(g2);
            }
            Drawable g3 = u.g(j.ActionBar_icon);
            if (g3 != null) {
                setIcon(g3);
            }
            if (this.f543g == null && (drawable = this.q) != null) {
                C(drawable);
            }
            o(u.k(j.ActionBar_displayOptions, 0));
            int n2 = u.n(j.ActionBar_customNavigationLayout, 0);
            if (n2 != 0) {
                x(LayoutInflater.from(this.a.getContext()).inflate(n2, this.a, false));
                o(this.b | 16);
            }
            int m2 = u.m(j.ActionBar_height, 0);
            if (m2 > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = m2;
                this.a.setLayoutParams(layoutParams);
            }
            int e2 = u.e(j.ActionBar_contentInsetStart, -1);
            int e3 = u.e(j.ActionBar_contentInsetEnd, -1);
            if (e2 >= 0 || e3 >= 0) {
                this.a.H(Math.max(e2, 0), Math.max(e3, 0));
            }
            int n3 = u.n(j.ActionBar_titleTextStyle, 0);
            if (n3 != 0) {
                Toolbar toolbar2 = this.a;
                toolbar2.K(toolbar2.getContext(), n3);
            }
            int n4 = u.n(j.ActionBar_subtitleTextStyle, 0);
            if (n4 != 0) {
                Toolbar toolbar3 = this.a;
                toolbar3.J(toolbar3.getContext(), n4);
            }
            int n5 = u.n(j.ActionBar_popupTheme, 0);
            if (n5 != 0) {
                this.a.setPopupTheme(n5);
            }
        } else {
            this.b = w();
        }
        u.v();
        y(i2);
        this.f547k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new a());
    }

    public void setIcon(Drawable drawable) {
        this.f541e = drawable;
        I();
    }
}
