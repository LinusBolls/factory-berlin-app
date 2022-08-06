package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import e.h.k.u;
import e.h.k.v;

/* compiled from: TooltipCompatHandler */
class z0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static z0 p;
    private static z0 q;

    /* renamed from: g  reason: collision with root package name */
    private final View f569g;

    /* renamed from: h  reason: collision with root package name */
    private final CharSequence f570h;

    /* renamed from: i  reason: collision with root package name */
    private final int f571i;

    /* renamed from: j  reason: collision with root package name */
    private final Runnable f572j = new a();

    /* renamed from: k  reason: collision with root package name */
    private final Runnable f573k = new b();

    /* renamed from: l  reason: collision with root package name */
    private int f574l;

    /* renamed from: m  reason: collision with root package name */
    private int f575m;

    /* renamed from: n  reason: collision with root package name */
    private a1 f576n;
    private boolean o;

    /* compiled from: TooltipCompatHandler */
    class a implements Runnable {
        a() {
        }

        public void run() {
            z0.this.g(false);
        }
    }

    /* compiled from: TooltipCompatHandler */
    class b implements Runnable {
        b() {
        }

        public void run() {
            z0.this.c();
        }
    }

    private z0(View view, CharSequence charSequence) {
        this.f569g = view;
        this.f570h = charSequence;
        this.f571i = v.c(ViewConfiguration.get(view.getContext()));
        b();
        this.f569g.setOnLongClickListener(this);
        this.f569g.setOnHoverListener(this);
    }

    private void a() {
        this.f569g.removeCallbacks(this.f572j);
    }

    private void b() {
        this.f574l = Integer.MAX_VALUE;
        this.f575m = Integer.MAX_VALUE;
    }

    private void d() {
        this.f569g.postDelayed(this.f572j, (long) ViewConfiguration.getLongPressTimeout());
    }

    private static void e(z0 z0Var) {
        z0 z0Var2 = p;
        if (z0Var2 != null) {
            z0Var2.a();
        }
        p = z0Var;
        if (z0Var != null) {
            z0Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        z0 z0Var = p;
        if (z0Var != null && z0Var.f569g == view) {
            e((z0) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            z0 z0Var2 = q;
            if (z0Var2 != null && z0Var2.f569g == view) {
                z0Var2.c();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new z0(view, charSequence);
    }

    private boolean h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f574l) <= this.f571i && Math.abs(y - this.f575m) <= this.f571i) {
            return false;
        }
        this.f574l = x;
        this.f575m = y;
        return true;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (q == this) {
            q = null;
            a1 a1Var = this.f576n;
            if (a1Var != null) {
                a1Var.c();
                this.f576n = null;
                b();
                this.f569g.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (p == this) {
            e((z0) null);
        }
        this.f569g.removeCallbacks(this.f573k);
    }

    /* access modifiers changed from: package-private */
    public void g(boolean z) {
        long j2;
        int i2;
        long j3;
        if (u.K(this.f569g)) {
            e((z0) null);
            z0 z0Var = q;
            if (z0Var != null) {
                z0Var.c();
            }
            q = this;
            this.o = z;
            a1 a1Var = new a1(this.f569g.getContext());
            this.f576n = a1Var;
            a1Var.e(this.f569g, this.f574l, this.f575m, this.o, this.f570h);
            this.f569g.addOnAttachStateChangeListener(this);
            if (this.o) {
                j2 = 2500;
            } else {
                if ((u.E(this.f569g) & 1) == 1) {
                    j3 = 3000;
                    i2 = ViewConfiguration.getLongPressTimeout();
                } else {
                    j3 = 15000;
                    i2 = ViewConfiguration.getLongPressTimeout();
                }
                j2 = j3 - ((long) i2);
            }
            this.f569g.removeCallbacks(this.f573k);
            this.f569g.postDelayed(this.f573k, j2);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f576n != null && this.o) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f569g.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.f569g.isEnabled() && this.f576n == null && h(motionEvent)) {
            e(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f574l = view.getWidth() / 2;
        this.f575m = view.getHeight() / 2;
        g(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
