package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.p0;
import e.a.f;
import e.a.j;
import e.a.n.b;
import e.a.n.h;
import e.h.k.a0;
import e.h.k.b0;
import e.h.k.u;
import e.h.k.y;
import e.h.k.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: WindowDecorActionBar */
public class k extends a implements ActionBarOverlayLayout.d {
    private static final Interpolator B = new AccelerateInterpolator();
    private static final Interpolator C = new DecelerateInterpolator();
    final b0 A = new c();
    Context a;
    private Context b;
    ActionBarOverlayLayout c;

    /* renamed from: d  reason: collision with root package name */
    ActionBarContainer f162d;

    /* renamed from: e  reason: collision with root package name */
    d0 f163e;

    /* renamed from: f  reason: collision with root package name */
    ActionBarContextView f164f;

    /* renamed from: g  reason: collision with root package name */
    View f165g;

    /* renamed from: h  reason: collision with root package name */
    p0 f166h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f167i;

    /* renamed from: j  reason: collision with root package name */
    d f168j;

    /* renamed from: k  reason: collision with root package name */
    e.a.n.b f169k;

    /* renamed from: l  reason: collision with root package name */
    b.a f170l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f171m;

    /* renamed from: n  reason: collision with root package name */
    private ArrayList<a.b> f172n = new ArrayList<>();
    private boolean o;
    private int p = 0;
    boolean q = true;
    boolean r;
    boolean s;
    private boolean t;
    private boolean u = true;
    h v;
    private boolean w;
    boolean x;
    final z y = new a();
    final z z = new b();

    /* compiled from: WindowDecorActionBar */
    class a extends a0 {
        a() {
        }

        public void b(View view) {
            View view2;
            k kVar = k.this;
            if (kVar.q && (view2 = kVar.f165g) != null) {
                view2.setTranslationY(0.0f);
                k.this.f162d.setTranslationY(0.0f);
            }
            k.this.f162d.setVisibility(8);
            k.this.f162d.setTransitioning(false);
            k kVar2 = k.this;
            kVar2.v = null;
            kVar2.x();
            ActionBarOverlayLayout actionBarOverlayLayout = k.this.c;
            if (actionBarOverlayLayout != null) {
                u.c0(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar */
    class b extends a0 {
        b() {
        }

        public void b(View view) {
            k kVar = k.this;
            kVar.v = null;
            kVar.f162d.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar */
    class c implements b0 {
        c() {
        }

        public void a(View view) {
            ((View) k.this.f162d.getParent()).invalidate();
        }
    }

    /* compiled from: WindowDecorActionBar */
    public class d extends e.a.n.b implements g.a {

        /* renamed from: i  reason: collision with root package name */
        private final Context f173i;

        /* renamed from: j  reason: collision with root package name */
        private final g f174j;

        /* renamed from: k  reason: collision with root package name */
        private b.a f175k;

        /* renamed from: l  reason: collision with root package name */
        private WeakReference<View> f176l;

        public d(Context context, b.a aVar) {
            this.f173i = context;
            this.f175k = aVar;
            g gVar = new g(context);
            gVar.W(1);
            this.f174j = gVar;
            gVar.V(this);
        }

        public boolean a(g gVar, MenuItem menuItem) {
            b.a aVar = this.f175k;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        public void b(g gVar) {
            if (this.f175k != null) {
                k();
                k.this.f164f.l();
            }
        }

        public void c() {
            k kVar = k.this;
            if (kVar.f168j == this) {
                if (!k.w(kVar.r, kVar.s, false)) {
                    k kVar2 = k.this;
                    kVar2.f169k = this;
                    kVar2.f170l = this.f175k;
                } else {
                    this.f175k.b(this);
                }
                this.f175k = null;
                k.this.v(false);
                k.this.f164f.g();
                k.this.f163e.l().sendAccessibilityEvent(32);
                k kVar3 = k.this;
                kVar3.c.setHideOnContentScrollEnabled(kVar3.x);
                k.this.f168j = null;
            }
        }

        public View d() {
            WeakReference<View> weakReference = this.f176l;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        public Menu e() {
            return this.f174j;
        }

        public MenuInflater f() {
            return new e.a.n.g(this.f173i);
        }

        public CharSequence g() {
            return k.this.f164f.getSubtitle();
        }

        public CharSequence i() {
            return k.this.f164f.getTitle();
        }

        public void k() {
            if (k.this.f168j == this) {
                this.f174j.h0();
                try {
                    this.f175k.a(this, this.f174j);
                } finally {
                    this.f174j.g0();
                }
            }
        }

        public boolean l() {
            return k.this.f164f.j();
        }

        public void m(View view) {
            k.this.f164f.setCustomView(view);
            this.f176l = new WeakReference<>(view);
        }

        public void n(int i2) {
            o(k.this.a.getResources().getString(i2));
        }

        public void o(CharSequence charSequence) {
            k.this.f164f.setSubtitle(charSequence);
        }

        public void q(int i2) {
            r(k.this.a.getResources().getString(i2));
        }

        public void r(CharSequence charSequence) {
            k.this.f164f.setTitle(charSequence);
        }

        public void s(boolean z) {
            super.s(z);
            k.this.f164f.setTitleOptional(z);
        }

        public boolean t() {
            this.f174j.h0();
            try {
                return this.f175k.d(this, this.f174j);
            } finally {
                this.f174j.g0();
            }
        }
    }

    public k(Activity activity, boolean z2) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        D(decorView);
        if (!z2) {
            this.f165g = decorView.findViewById(16908290);
        }
    }

    private d0 A(View view) {
        if (view instanceof d0) {
            return (d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void C() {
        if (this.t) {
            this.t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            M(false);
        }
    }

    private void D(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(f.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f163e = A(view.findViewById(f.action_bar));
        this.f164f = (ActionBarContextView) view.findViewById(f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(f.action_bar_container);
        this.f162d = actionBarContainer;
        d0 d0Var = this.f163e;
        if (d0Var == null || this.f164f == null || actionBarContainer == null) {
            throw new IllegalStateException(k.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = d0Var.c();
        boolean z2 = (this.f163e.p() & 4) != 0;
        if (z2) {
            this.f167i = true;
        }
        e.a.n.a b2 = e.a.n.a.b(this.a);
        J(b2.a() || z2);
        H(b2.g());
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes((AttributeSet) null, j.ActionBar, e.a.a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(j.ActionBar_hideOnContentScroll, false)) {
            I(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            G((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void H(boolean z2) {
        this.o = z2;
        if (!z2) {
            this.f163e.k((p0) null);
            this.f162d.setTabContainer(this.f166h);
        } else {
            this.f162d.setTabContainer((p0) null);
            this.f163e.k(this.f166h);
        }
        boolean z3 = true;
        boolean z4 = B() == 2;
        p0 p0Var = this.f166h;
        if (p0Var != null) {
            if (z4) {
                p0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    u.c0(actionBarOverlayLayout);
                }
            } else {
                p0Var.setVisibility(8);
            }
        }
        this.f163e.v(!this.o && z4);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
        if (this.o || !z4) {
            z3 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z3);
    }

    private boolean K() {
        return u.L(this.f162d);
    }

    private void L() {
        if (!this.t) {
            this.t = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            M(false);
        }
    }

    private void M(boolean z2) {
        if (w(this.r, this.s, this.t)) {
            if (!this.u) {
                this.u = true;
                z(z2);
            }
        } else if (this.u) {
            this.u = false;
            y(z2);
        }
    }

    static boolean w(boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return true;
        }
        return !z2 && !z3;
    }

    public int B() {
        return this.f163e.r();
    }

    public void E(boolean z2) {
        F(z2 ? 4 : 0, 4);
    }

    public void F(int i2, int i3) {
        int p2 = this.f163e.p();
        if ((i3 & 4) != 0) {
            this.f167i = true;
        }
        this.f163e.o((i2 & i3) | ((~i3) & p2));
    }

    public void G(float f2) {
        u.l0(this.f162d, f2);
    }

    public void I(boolean z2) {
        if (!z2 || this.c.w()) {
            this.x = z2;
            this.c.setHideOnContentScrollEnabled(z2);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public void J(boolean z2) {
        this.f163e.m(z2);
    }

    public void a() {
        if (this.s) {
            this.s = false;
            M(true);
        }
    }

    public void b() {
        h hVar = this.v;
        if (hVar != null) {
            hVar.a();
            this.v = null;
        }
    }

    public void c(int i2) {
        this.p = i2;
    }

    public void d() {
    }

    public void e(boolean z2) {
        this.q = z2;
    }

    public void f() {
        if (!this.s) {
            this.s = true;
            M(true);
        }
    }

    public boolean h() {
        d0 d0Var = this.f163e;
        if (d0Var == null || !d0Var.n()) {
            return false;
        }
        this.f163e.collapseActionView();
        return true;
    }

    public void i(boolean z2) {
        if (z2 != this.f171m) {
            this.f171m = z2;
            int size = this.f172n.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f172n.get(i2).a(z2);
            }
        }
    }

    public int j() {
        return this.f163e.p();
    }

    public Context k() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(e.a.a.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.b = new ContextThemeWrapper(this.a, i2);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    public void m(Configuration configuration) {
        H(e.a.n.a.b(this.a).g());
    }

    public boolean o(int i2, KeyEvent keyEvent) {
        Menu e2;
        d dVar = this.f168j;
        if (dVar == null || (e2 = dVar.e()) == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z2 = false;
        }
        e2.setQwertyMode(z2);
        return e2.performShortcut(i2, keyEvent, 0);
    }

    public void r(boolean z2) {
        if (!this.f167i) {
            E(z2);
        }
    }

    public void s(boolean z2) {
        h hVar;
        this.w = z2;
        if (!z2 && (hVar = this.v) != null) {
            hVar.a();
        }
    }

    public void t(CharSequence charSequence) {
        this.f163e.setWindowTitle(charSequence);
    }

    public e.a.n.b u(b.a aVar) {
        d dVar = this.f168j;
        if (dVar != null) {
            dVar.c();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f164f.k();
        d dVar2 = new d(this.f164f.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f168j = dVar2;
        dVar2.k();
        this.f164f.h(dVar2);
        v(true);
        this.f164f.sendAccessibilityEvent(32);
        return dVar2;
    }

    public void v(boolean z2) {
        y yVar;
        y yVar2;
        if (z2) {
            L();
        } else {
            C();
        }
        if (K()) {
            if (z2) {
                yVar = this.f163e.s(4, 100);
                yVar2 = this.f164f.f(0, 200);
            } else {
                yVar2 = this.f163e.s(0, 200);
                yVar = this.f164f.f(8, 100);
            }
            h hVar = new h();
            hVar.d(yVar, yVar2);
            hVar.h();
        } else if (z2) {
            this.f163e.j(4);
            this.f164f.setVisibility(0);
        } else {
            this.f163e.j(0);
            this.f164f.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public void x() {
        b.a aVar = this.f170l;
        if (aVar != null) {
            aVar.b(this.f169k);
            this.f169k = null;
            this.f170l = null;
        }
    }

    public void y(boolean z2) {
        View view;
        h hVar = this.v;
        if (hVar != null) {
            hVar.a();
        }
        if (this.p != 0 || (!this.w && !z2)) {
            this.y.b((View) null);
            return;
        }
        this.f162d.setAlpha(1.0f);
        this.f162d.setTransitioning(true);
        h hVar2 = new h();
        float f2 = (float) (-this.f162d.getHeight());
        if (z2) {
            int[] iArr = {0, 0};
            this.f162d.getLocationInWindow(iArr);
            f2 -= (float) iArr[1];
        }
        y c2 = u.c(this.f162d);
        c2.k(f2);
        c2.i(this.A);
        hVar2.c(c2);
        if (this.q && (view = this.f165g) != null) {
            y c3 = u.c(view);
            c3.k(f2);
            hVar2.c(c3);
        }
        hVar2.f(B);
        hVar2.e(250);
        hVar2.g(this.y);
        this.v = hVar2;
        hVar2.h();
    }

    public void z(boolean z2) {
        View view;
        View view2;
        h hVar = this.v;
        if (hVar != null) {
            hVar.a();
        }
        this.f162d.setVisibility(0);
        if (this.p != 0 || (!this.w && !z2)) {
            this.f162d.setAlpha(1.0f);
            this.f162d.setTranslationY(0.0f);
            if (this.q && (view = this.f165g) != null) {
                view.setTranslationY(0.0f);
            }
            this.z.b((View) null);
        } else {
            this.f162d.setTranslationY(0.0f);
            float f2 = (float) (-this.f162d.getHeight());
            if (z2) {
                int[] iArr = {0, 0};
                this.f162d.getLocationInWindow(iArr);
                f2 -= (float) iArr[1];
            }
            this.f162d.setTranslationY(f2);
            h hVar2 = new h();
            y c2 = u.c(this.f162d);
            c2.k(0.0f);
            c2.i(this.A);
            hVar2.c(c2);
            if (this.q && (view2 = this.f165g) != null) {
                view2.setTranslationY(f2);
                y c3 = u.c(this.f165g);
                c3.k(0.0f);
                hVar2.c(c3);
            }
            hVar2.f(C);
            hVar2.e(250);
            hVar2.g(this.z);
            this.v = hVar2;
            hVar2.h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            u.c0(actionBarOverlayLayout);
        }
    }

    public k(Dialog dialog) {
        new ArrayList();
        D(dialog.getWindow().getDecorView());
    }
}
