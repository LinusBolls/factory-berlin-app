package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.l0;
import e.a.g;
import e.h.k.e;
import e.h.k.u;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CascadingMenuPopup */
final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int H = g.abc_cascading_menu_item_layout;
    private int A;
    private boolean B;
    private boolean C;
    private m.a D;
    ViewTreeObserver E;
    private PopupWindow.OnDismissListener F;
    boolean G;

    /* renamed from: h  reason: collision with root package name */
    private final Context f212h;

    /* renamed from: i  reason: collision with root package name */
    private final int f213i;

    /* renamed from: j  reason: collision with root package name */
    private final int f214j;

    /* renamed from: k  reason: collision with root package name */
    private final int f215k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f216l;

    /* renamed from: m  reason: collision with root package name */
    final Handler f217m;

    /* renamed from: n  reason: collision with root package name */
    private final List<g> f218n = new ArrayList();
    final List<C0005d> o = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener p = new a();
    private final View.OnAttachStateChangeListener q = new b();
    private final k0 r = new c();
    private int s = 0;
    private int t = 0;
    private View u;
    View v;
    private int w;
    private boolean x;
    private boolean y;
    private int z;

    /* compiled from: CascadingMenuPopup */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (d.this.c() && d.this.o.size() > 0 && !d.this.o.get(0).a.x()) {
                View view = d.this.v;
                if (view == null || !view.isShown()) {
                    d.this.dismiss();
                    return;
                }
                for (C0005d dVar : d.this.o) {
                    dVar.a.e();
                }
            }
        }
    }

    /* compiled from: CascadingMenuPopup */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = d.this.E;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.E = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.E.removeGlobalOnLayoutListener(dVar.p);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* compiled from: CascadingMenuPopup */
    class c implements k0 {

        /* compiled from: CascadingMenuPopup */
        class a implements Runnable {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C0005d f222g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ MenuItem f223h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ g f224i;

            a(C0005d dVar, MenuItem menuItem, g gVar) {
                this.f222g = dVar;
                this.f223h = menuItem;
                this.f224i = gVar;
            }

            public void run() {
                C0005d dVar = this.f222g;
                if (dVar != null) {
                    d.this.G = true;
                    dVar.b.e(false);
                    d.this.G = false;
                }
                if (this.f223h.isEnabled() && this.f223h.hasSubMenu()) {
                    this.f224i.N(this.f223h, 4);
                }
            }
        }

        c() {
        }

        public void a(g gVar, MenuItem menuItem) {
            C0005d dVar = null;
            d.this.f217m.removeCallbacksAndMessages((Object) null);
            int size = d.this.o.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (gVar == d.this.o.get(i2).b) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                int i3 = i2 + 1;
                if (i3 < d.this.o.size()) {
                    dVar = d.this.o.get(i3);
                }
                d.this.f217m.postAtTime(new a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        public void f(g gVar, MenuItem menuItem) {
            d.this.f217m.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d  reason: collision with other inner class name */
    /* compiled from: CascadingMenuPopup */
    private static class C0005d {
        public final l0 a;
        public final g b;
        public final int c;

        public C0005d(l0 l0Var, g gVar, int i2) {
            this.a = l0Var;
            this.b = gVar;
            this.c = i2;
        }

        public ListView a() {
            return this.a.h();
        }
    }

    public d(Context context, View view, int i2, int i3, boolean z2) {
        this.f212h = context;
        this.u = view;
        this.f214j = i2;
        this.f215k = i3;
        this.f216l = z2;
        this.B = false;
        this.w = F();
        Resources resources = context.getResources();
        this.f213i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(e.a.d.abc_config_prefDialogWidth));
        this.f217m = new Handler();
    }

    private l0 B() {
        l0 l0Var = new l0(this.f212h, (AttributeSet) null, this.f214j, this.f215k);
        l0Var.P(this.r);
        l0Var.H(this);
        l0Var.G(this);
        l0Var.z(this.u);
        l0Var.C(this.t);
        l0Var.F(true);
        l0Var.E(2);
        return l0Var;
    }

    private int C(g gVar) {
        int size = this.o.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (gVar == this.o.get(i2).b) {
                return i2;
            }
        }
        return -1;
    }

    private MenuItem D(g gVar, g gVar2) {
        int size = gVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = gVar.getItem(i2);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View E(C0005d dVar, g gVar) {
        int i2;
        f fVar;
        int firstVisiblePosition;
        MenuItem D2 = D(dVar.b, gVar);
        if (D2 == null) {
            return null;
        }
        ListView a2 = dVar.a();
        ListAdapter adapter = a2.getAdapter();
        int i3 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i2 = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            i2 = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i3 >= count) {
                i3 = -1;
                break;
            } else if (D2 == fVar.getItem(i3)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 != -1 && (firstVisiblePosition = (i3 + i2) - a2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a2.getChildCount()) {
            return a2.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int F() {
        return u.x(this.u) == 1 ? 0 : 1;
    }

    private int G(int i2) {
        List<C0005d> list = this.o;
        ListView a2 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.v.getWindowVisibleDisplayFrame(rect);
        if (this.w == 1) {
            if (iArr[0] + a2.getWidth() + i2 > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i2 < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    private void H(g gVar) {
        View view;
        C0005d dVar;
        int i2;
        int i3;
        int i4;
        LayoutInflater from = LayoutInflater.from(this.f212h);
        f fVar = new f(gVar, from, this.f216l, H);
        if (!c() && this.B) {
            fVar.d(true);
        } else if (c()) {
            fVar.d(k.z(gVar));
        }
        int q2 = k.q(fVar, (ViewGroup) null, this.f212h, this.f213i);
        l0 B2 = B();
        B2.p(fVar);
        B2.B(q2);
        B2.C(this.t);
        if (this.o.size() > 0) {
            List<C0005d> list = this.o;
            dVar = list.get(list.size() - 1);
            view = E(dVar, gVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            B2.Q(false);
            B2.N((Object) null);
            int G2 = G(q2);
            boolean z2 = G2 == 1;
            this.w = G2;
            if (Build.VERSION.SDK_INT >= 26) {
                B2.z(view);
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr = new int[2];
                this.u.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.t & 7) == 5) {
                    iArr[0] = iArr[0] + this.u.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i2 = iArr2[0] - iArr[0];
                i3 = iArr2[1] - iArr[1];
            }
            if ((this.t & 5) != 5) {
                if (z2) {
                    q2 = view.getWidth();
                }
                i4 = i2 - q2;
                B2.l(i4);
                B2.I(true);
                B2.j(i3);
            } else if (!z2) {
                q2 = view.getWidth();
                i4 = i2 - q2;
                B2.l(i4);
                B2.I(true);
                B2.j(i3);
            }
            i4 = i2 + q2;
            B2.l(i4);
            B2.I(true);
            B2.j(i3);
        } else {
            if (this.x) {
                B2.l(this.z);
            }
            if (this.y) {
                B2.j(this.A);
            }
            B2.D(p());
        }
        this.o.add(new C0005d(B2, gVar, this.w));
        B2.e();
        ListView h2 = B2.h();
        h2.setOnKeyListener(this);
        if (dVar == null && this.C && gVar.z() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(g.abc_popup_menu_header_item_layout, h2, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(gVar.z());
            h2.addHeaderView(frameLayout, (Object) null, false);
            B2.e();
        }
    }

    public void a(g gVar, boolean z2) {
        int C2 = C(gVar);
        if (C2 >= 0) {
            int i2 = C2 + 1;
            if (i2 < this.o.size()) {
                this.o.get(i2).b.e(false);
            }
            C0005d remove = this.o.remove(C2);
            remove.b.Q(this);
            if (this.G) {
                remove.a.O((Object) null);
                remove.a.A(0);
            }
            remove.a.dismiss();
            int size = this.o.size();
            if (size > 0) {
                this.w = this.o.get(size - 1).c;
            } else {
                this.w = F();
            }
            if (size == 0) {
                dismiss();
                m.a aVar = this.D;
                if (aVar != null) {
                    aVar.a(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.E;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.E.removeGlobalOnLayoutListener(this.p);
                    }
                    this.E = null;
                }
                this.v.removeOnAttachStateChangeListener(this.q);
                this.F.onDismiss();
            } else if (z2) {
                this.o.get(0).b.e(false);
            }
        }
    }

    public boolean c() {
        return this.o.size() > 0 && this.o.get(0).a.c();
    }

    public void d(Parcelable parcelable) {
    }

    public void dismiss() {
        int size = this.o.size();
        if (size > 0) {
            C0005d[] dVarArr = (C0005d[]) this.o.toArray(new C0005d[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0005d dVar = dVarArr[i2];
                if (dVar.a.c()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    public void e() {
        if (!c()) {
            for (g H2 : this.f218n) {
                H(H2);
            }
            this.f218n.clear();
            View view = this.u;
            this.v = view;
            if (view != null) {
                boolean z2 = this.E == null;
                ViewTreeObserver viewTreeObserver = this.v.getViewTreeObserver();
                this.E = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.p);
                }
                this.v.addOnAttachStateChangeListener(this.q);
            }
        }
    }

    public boolean f(r rVar) {
        for (C0005d next : this.o) {
            if (rVar == next.b) {
                next.a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        n(rVar);
        m.a aVar = this.D;
        if (aVar != null) {
            aVar.b(rVar);
        }
        return true;
    }

    public void g(boolean z2) {
        for (C0005d a2 : this.o) {
            k.A(a2.a().getAdapter()).notifyDataSetChanged();
        }
    }

    public ListView h() {
        if (this.o.isEmpty()) {
            return null;
        }
        List<C0005d> list = this.o;
        return list.get(list.size() - 1).a();
    }

    public boolean i() {
        return false;
    }

    public Parcelable j() {
        return null;
    }

    public void m(m.a aVar) {
        this.D = aVar;
    }

    public void n(g gVar) {
        gVar.c(this, this.f212h);
        if (c()) {
            H(gVar);
        } else {
            this.f218n.add(gVar);
        }
    }

    /* access modifiers changed from: protected */
    public boolean o() {
        return false;
    }

    public void onDismiss() {
        C0005d dVar;
        int size = this.o.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                dVar = null;
                break;
            }
            dVar = this.o.get(i2);
            if (!dVar.a.c()) {
                break;
            }
            i2++;
        }
        if (dVar != null) {
            dVar.b.e(false);
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void r(View view) {
        if (this.u != view) {
            this.u = view;
            this.t = e.b(this.s, u.x(view));
        }
    }

    public void t(boolean z2) {
        this.B = z2;
    }

    public void u(int i2) {
        if (this.s != i2) {
            this.s = i2;
            this.t = e.b(i2, u.x(this.u));
        }
    }

    public void v(int i2) {
        this.x = true;
        this.z = i2;
    }

    public void w(PopupWindow.OnDismissListener onDismissListener) {
        this.F = onDismissListener;
    }

    public void x(boolean z2) {
        this.C = z2;
    }

    public void y(int i2) {
        this.y = true;
        this.A = i2;
    }
}
