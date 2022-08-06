package e.j.b;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import e.e.h;
import e.h.k.d0.d;
import e.h.k.d0.e;
import e.h.k.u;
import e.j.b.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ExploreByTouchHelper */
public abstract class a extends e.h.k.a {

    /* renamed from: n  reason: collision with root package name */
    private static final Rect f8724n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);
    private static final b.a<e.h.k.d0.c> o = new C0568a();
    private static final b.C0569b<h<e.h.k.d0.c>, e.h.k.d0.c> p = new b();

    /* renamed from: d  reason: collision with root package name */
    private final Rect f8725d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    private final Rect f8726e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private final Rect f8727f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    private final int[] f8728g = new int[2];

    /* renamed from: h  reason: collision with root package name */
    private final AccessibilityManager f8729h;

    /* renamed from: i  reason: collision with root package name */
    private final View f8730i;

    /* renamed from: j  reason: collision with root package name */
    private c f8731j;

    /* renamed from: k  reason: collision with root package name */
    int f8732k = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: l  reason: collision with root package name */
    int f8733l = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: m  reason: collision with root package name */
    private int f8734m = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: e.j.b.a$a  reason: collision with other inner class name */
    /* compiled from: ExploreByTouchHelper */
    class C0568a implements b.a<e.h.k.d0.c> {
        C0568a() {
        }

        /* renamed from: b */
        public void a(e.h.k.d0.c cVar, Rect rect) {
            cVar.l(rect);
        }
    }

    /* compiled from: ExploreByTouchHelper */
    class b implements b.C0569b<h<e.h.k.d0.c>, e.h.k.d0.c> {
        b() {
        }

        /* renamed from: c */
        public e.h.k.d0.c a(h<e.h.k.d0.c> hVar, int i2) {
            return hVar.w(i2);
        }

        /* renamed from: d */
        public int b(h<e.h.k.d0.c> hVar) {
            return hVar.v();
        }
    }

    /* compiled from: ExploreByTouchHelper */
    private class c extends d {
        c() {
        }

        public e.h.k.d0.c a(int i2) {
            return e.h.k.d0.c.M(a.this.H(i2));
        }

        public e.h.k.d0.c c(int i2) {
            int i3 = i2 == 2 ? a.this.f8732k : a.this.f8733l;
            if (i3 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i3);
        }

        public boolean e(int i2, int i3, Bundle bundle) {
            return a.this.P(i2, i3, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f8730i = view;
            this.f8729h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (u.v(view) == 0) {
                u.o0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private static Rect D(View view, int i2, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i2 == 17) {
            rect.set(width, 0, width, height);
        } else if (i2 == 33) {
            rect.set(0, height, width, height);
        } else if (i2 == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i2 == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    private boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f8730i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f8730i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent != null) {
            return true;
        }
        return false;
    }

    private static int F(int i2) {
        if (i2 == 19) {
            return 33;
        }
        if (i2 != 21) {
            return i2 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean G(int i2, Rect rect) {
        e.h.k.d0.c cVar;
        e.h.k.d0.c cVar2;
        h<e.h.k.d0.c> y = y();
        int i3 = this.f8733l;
        int i4 = RecyclerView.UNDEFINED_DURATION;
        if (i3 == Integer.MIN_VALUE) {
            cVar = null;
        } else {
            cVar = y.g(i3);
        }
        e.h.k.d0.c cVar3 = cVar;
        if (i2 == 1 || i2 == 2) {
            cVar2 = (e.h.k.d0.c) b.d(y, p, o, cVar3, i2, u.x(this.f8730i) == 1, false);
        } else if (i2 == 17 || i2 == 33 || i2 == 66 || i2 == 130) {
            Rect rect2 = new Rect();
            int i5 = this.f8733l;
            if (i5 != Integer.MIN_VALUE) {
                z(i5, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f8730i, i2, rect2);
            }
            cVar2 = (e.h.k.d0.c) b.c(y, p, o, cVar3, rect2, i2);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (cVar2 != null) {
            i4 = y.r(y.p(cVar2));
        }
        return T(i4);
    }

    private boolean Q(int i2, int i3, Bundle bundle) {
        if (i3 == 1) {
            return T(i2);
        }
        if (i3 == 2) {
            return o(i2);
        }
        if (i3 == 64) {
            return S(i2);
        }
        if (i3 != 128) {
            return J(i2, i3, bundle);
        }
        return n(i2);
    }

    private boolean R(int i2, Bundle bundle) {
        return u.V(this.f8730i, i2, bundle);
    }

    private boolean S(int i2) {
        int i3;
        if (!this.f8729h.isEnabled() || !this.f8729h.isTouchExplorationEnabled() || (i3 = this.f8732k) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            n(i3);
        }
        this.f8732k = i2;
        this.f8730i.invalidate();
        U(i2, 32768);
        return true;
    }

    private void V(int i2) {
        int i3 = this.f8734m;
        if (i3 != i2) {
            this.f8734m = i2;
            U(i2, 128);
            U(i3, 256);
        }
    }

    private boolean n(int i2) {
        if (this.f8732k != i2) {
            return false;
        }
        this.f8732k = RecyclerView.UNDEFINED_DURATION;
        this.f8730i.invalidate();
        U(i2, 65536);
        return true;
    }

    private boolean p() {
        int i2 = this.f8733l;
        return i2 != Integer.MIN_VALUE && J(i2, 16, (Bundle) null);
    }

    private AccessibilityEvent q(int i2, int i3) {
        if (i2 != -1) {
            return r(i2, i3);
        }
        return s(i3);
    }

    private AccessibilityEvent r(int i2, int i3) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        e.h.k.d0.c H = H(i2);
        obtain.getText().add(H.v());
        obtain.setContentDescription(H.q());
        obtain.setScrollable(H.H());
        obtain.setPassword(H.G());
        obtain.setEnabled(H.C());
        obtain.setChecked(H.A());
        L(i2, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(H.o());
            e.c(obtain, this.f8730i, i2);
            obtain.setPackageName(this.f8730i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    private AccessibilityEvent s(int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        this.f8730i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private e.h.k.d0.c t(int i2) {
        e.h.k.d0.c K = e.h.k.d0.c.K();
        K.c0(true);
        K.e0(true);
        K.W("android.view.View");
        K.S(f8724n);
        K.T(f8724n);
        K.k0(this.f8730i);
        N(i2, K);
        if (K.v() == null && K.q() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        K.l(this.f8726e);
        if (!this.f8726e.equals(f8724n)) {
            int j2 = K.j();
            if ((j2 & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((j2 & 128) == 0) {
                K.i0(this.f8730i.getContext().getPackageName());
                K.p0(this.f8730i, i2);
                if (this.f8732k == i2) {
                    K.Q(true);
                    K.a(128);
                } else {
                    K.Q(false);
                    K.a(64);
                }
                boolean z = this.f8733l == i2;
                if (z) {
                    K.a(2);
                } else if (K.D()) {
                    K.a(1);
                }
                K.f0(z);
                this.f8730i.getLocationOnScreen(this.f8728g);
                K.m(this.f8725d);
                if (this.f8725d.equals(f8724n)) {
                    K.l(this.f8725d);
                    if (K.b != -1) {
                        e.h.k.d0.c K2 = e.h.k.d0.c.K();
                        for (int i3 = K.b; i3 != -1; i3 = K2.b) {
                            K2.l0(this.f8730i, -1);
                            K2.S(f8724n);
                            N(i3, K2);
                            K2.l(this.f8726e);
                            Rect rect = this.f8725d;
                            Rect rect2 = this.f8726e;
                            rect.offset(rect2.left, rect2.top);
                        }
                        K2.O();
                    }
                    this.f8725d.offset(this.f8728g[0] - this.f8730i.getScrollX(), this.f8728g[1] - this.f8730i.getScrollY());
                }
                if (this.f8730i.getLocalVisibleRect(this.f8727f)) {
                    this.f8727f.offset(this.f8728g[0] - this.f8730i.getScrollX(), this.f8728g[1] - this.f8730i.getScrollY());
                    if (this.f8725d.intersect(this.f8727f)) {
                        K.T(this.f8725d);
                        if (E(this.f8725d)) {
                            K.r0(true);
                        }
                    }
                }
                return K;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    private e.h.k.d0.c u() {
        e.h.k.d0.c L = e.h.k.d0.c.L(this.f8730i);
        u.T(this.f8730i, L);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (L.n() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                L.c(this.f8730i, ((Integer) arrayList.get(i2)).intValue());
            }
            return L;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    private h<e.h.k.d0.c> y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        h<e.h.k.d0.c> hVar = new h<>();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            hVar.s(((Integer) arrayList.get(i2)).intValue(), t(((Integer) arrayList.get(i2)).intValue()));
        }
        return hVar;
    }

    private void z(int i2, Rect rect) {
        H(i2).l(rect);
    }

    public final int A() {
        return this.f8733l;
    }

    /* access modifiers changed from: protected */
    public abstract int B(float f2, float f3);

    /* access modifiers changed from: protected */
    public abstract void C(List<Integer> list);

    /* access modifiers changed from: package-private */
    public e.h.k.d0.c H(int i2) {
        if (i2 == -1) {
            return u();
        }
        return t(i2);
    }

    public final void I(boolean z, int i2, Rect rect) {
        int i3 = this.f8733l;
        if (i3 != Integer.MIN_VALUE) {
            o(i3);
        }
        if (z) {
            G(i2, rect);
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean J(int i2, int i3, Bundle bundle);

    /* access modifiers changed from: protected */
    public void K(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public void L(int i2, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public void M(e.h.k.d0.c cVar) {
    }

    /* access modifiers changed from: protected */
    public abstract void N(int i2, e.h.k.d0.c cVar);

    /* access modifiers changed from: protected */
    public void O(int i2, boolean z) {
    }

    /* access modifiers changed from: package-private */
    public boolean P(int i2, int i3, Bundle bundle) {
        if (i2 != -1) {
            return Q(i2, i3, bundle);
        }
        return R(i3, bundle);
    }

    public final boolean T(int i2) {
        int i3;
        if ((!this.f8730i.isFocused() && !this.f8730i.requestFocus()) || (i3 = this.f8733l) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            o(i3);
        }
        if (i2 == Integer.MIN_VALUE) {
            return false;
        }
        this.f8733l = i2;
        O(i2, true);
        U(i2, 8);
        return true;
    }

    public final boolean U(int i2, int i3) {
        ViewParent parent;
        if (i2 == Integer.MIN_VALUE || !this.f8729h.isEnabled() || (parent = this.f8730i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f8730i, q(i2, i3));
    }

    public d b(View view) {
        if (this.f8731j == null) {
            this.f8731j = new c();
        }
        return this.f8731j;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    public void g(View view, e.h.k.d0.c cVar) {
        super.g(view, cVar);
        M(cVar);
    }

    public final boolean o(int i2) {
        if (this.f8733l != i2) {
            return false;
        }
        this.f8733l = RecyclerView.UNDEFINED_DURATION;
        O(i2, false);
        U(i2, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (!this.f8729h.isEnabled() || !this.f8729h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int B = B(motionEvent.getX(), motionEvent.getY());
            V(B);
            if (B != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10 || this.f8734m == Integer.MIN_VALUE) {
            return false;
        } else {
            V(RecyclerView.UNDEFINED_DURATION);
            return true;
        }
    }

    public final boolean w(KeyEvent keyEvent) {
        int i2 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int F = F(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i2 < repeatCount && G(F, (Rect) null)) {
                            i2++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            p();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return G(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return G(1, (Rect) null);
            }
            return false;
        }
    }

    public final int x() {
        return this.f8732k;
    }
}
