package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.l0;
import e.a.d;
import e.a.g;
import e.h.k.u;

/* compiled from: StandardMenuPopup */
final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {
    private static final int B = g.abc_popup_menu_item_layout;
    private boolean A;

    /* renamed from: h  reason: collision with root package name */
    private final Context f284h;

    /* renamed from: i  reason: collision with root package name */
    private final g f285i;

    /* renamed from: j  reason: collision with root package name */
    private final f f286j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f287k;

    /* renamed from: l  reason: collision with root package name */
    private final int f288l;

    /* renamed from: m  reason: collision with root package name */
    private final int f289m;

    /* renamed from: n  reason: collision with root package name */
    private final int f290n;
    final l0 o;
    final ViewTreeObserver.OnGlobalLayoutListener p = new a();
    private final View.OnAttachStateChangeListener q = new b();
    private PopupWindow.OnDismissListener r;
    private View s;
    View t;
    private m.a u;
    ViewTreeObserver v;
    private boolean w;
    private boolean x;
    private int y;
    private int z = 0;

    /* compiled from: StandardMenuPopup */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (q.this.c() && !q.this.o.x()) {
                View view = q.this.t;
                if (view == null || !view.isShown()) {
                    q.this.dismiss();
                } else {
                    q.this.o.e();
                }
            }
        }
    }

    /* compiled from: StandardMenuPopup */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.v;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.v = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.v.removeGlobalOnLayoutListener(qVar.p);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i2, int i3, boolean z2) {
        this.f284h = context;
        this.f285i = gVar;
        this.f287k = z2;
        this.f286j = new f(gVar, LayoutInflater.from(context), this.f287k, B);
        this.f289m = i2;
        this.f290n = i3;
        Resources resources = context.getResources();
        this.f288l = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.abc_config_prefDialogWidth));
        this.s = view;
        this.o = new l0(this.f284h, (AttributeSet) null, this.f289m, this.f290n);
        gVar.c(this, context);
    }

    private boolean B() {
        View view;
        if (c()) {
            return true;
        }
        if (this.w || (view = this.s) == null) {
            return false;
        }
        this.t = view;
        this.o.G(this);
        this.o.H(this);
        this.o.F(true);
        View view2 = this.t;
        boolean z2 = this.v == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.v = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.p);
        }
        view2.addOnAttachStateChangeListener(this.q);
        this.o.z(view2);
        this.o.C(this.z);
        if (!this.x) {
            this.y = k.q(this.f286j, (ViewGroup) null, this.f284h, this.f288l);
            this.x = true;
        }
        this.o.B(this.y);
        this.o.E(2);
        this.o.D(p());
        this.o.e();
        ListView h2 = this.o.h();
        h2.setOnKeyListener(this);
        if (this.A && this.f285i.z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f284h).inflate(g.abc_popup_menu_header_item_layout, h2, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f285i.z());
            }
            frameLayout.setEnabled(false);
            h2.addHeaderView(frameLayout, (Object) null, false);
        }
        this.o.p(this.f286j);
        this.o.e();
        return true;
    }

    public void a(g gVar, boolean z2) {
        if (gVar == this.f285i) {
            dismiss();
            m.a aVar = this.u;
            if (aVar != null) {
                aVar.a(gVar, z2);
            }
        }
    }

    public boolean c() {
        return !this.w && this.o.c();
    }

    public void d(Parcelable parcelable) {
    }

    public void dismiss() {
        if (c()) {
            this.o.dismiss();
        }
    }

    public void e() {
        if (!B()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public boolean f(r rVar) {
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.f284h, rVar, this.t, this.f287k, this.f289m, this.f290n);
            lVar.j(this.u);
            lVar.g(k.z(rVar));
            lVar.i(this.r);
            this.r = null;
            this.f285i.e(false);
            int d2 = this.o.d();
            int n2 = this.o.n();
            if ((Gravity.getAbsoluteGravity(this.z, u.x(this.s)) & 7) == 5) {
                d2 += this.s.getWidth();
            }
            if (lVar.n(d2, n2)) {
                m.a aVar = this.u;
                if (aVar == null) {
                    return true;
                }
                aVar.b(rVar);
                return true;
            }
        }
        return false;
    }

    public void g(boolean z2) {
        this.x = false;
        f fVar = this.f286j;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    public ListView h() {
        return this.o.h();
    }

    public boolean i() {
        return false;
    }

    public Parcelable j() {
        return null;
    }

    public void m(m.a aVar) {
        this.u = aVar;
    }

    public void n(g gVar) {
    }

    public void onDismiss() {
        this.w = true;
        this.f285i.close();
        ViewTreeObserver viewTreeObserver = this.v;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.v = this.t.getViewTreeObserver();
            }
            this.v.removeGlobalOnLayoutListener(this.p);
            this.v = null;
        }
        this.t.removeOnAttachStateChangeListener(this.q);
        PopupWindow.OnDismissListener onDismissListener = this.r;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.s = view;
    }

    public void t(boolean z2) {
        this.f286j.d(z2);
    }

    public void u(int i2) {
        this.z = i2;
    }

    public void v(int i2) {
        this.o.l(i2);
    }

    public void w(PopupWindow.OnDismissListener onDismissListener) {
        this.r = onDismissListener;
    }

    public void x(boolean z2) {
        this.A = z2;
    }

    public void y(int i2) {
        this.o.j(i2);
    }
}
