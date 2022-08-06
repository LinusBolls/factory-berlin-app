package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import e.h.k.u;
import e.j.b.c;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    e.j.b.c a;
    b b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private float f3383d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3384e;

    /* renamed from: f  reason: collision with root package name */
    int f3385f = 2;

    /* renamed from: g  reason: collision with root package name */
    float f3386g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    float f3387h = 0.0f;

    /* renamed from: i  reason: collision with root package name */
    float f3388i = 0.5f;

    /* renamed from: j  reason: collision with root package name */
    private final c.C0570c f3389j = new a();

    class a extends c.C0570c {
        private int a;
        private int b = -1;

        a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0023 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0030 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean n(android.view.View r7, float r8) {
            /*
                r6 = this;
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x0032
                int r7 = e.h.k.u.x(r7)
                if (r7 != r2) goto L_0x000f
                r7 = 1
                goto L_0x0010
            L_0x000f:
                r7 = 0
            L_0x0010:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r4 = r4.f3385f
                r5 = 2
                if (r4 != r5) goto L_0x0018
                return r2
            L_0x0018:
                if (r4 != 0) goto L_0x0025
                if (r7 == 0) goto L_0x0021
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0024
                goto L_0x0023
            L_0x0021:
                if (r3 <= 0) goto L_0x0024
            L_0x0023:
                r1 = 1
            L_0x0024:
                return r1
            L_0x0025:
                if (r4 != r2) goto L_0x0031
                if (r7 == 0) goto L_0x002c
                if (r3 <= 0) goto L_0x0031
                goto L_0x0030
            L_0x002c:
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0031
            L_0x0030:
                r1 = 1
            L_0x0031:
                return r1
            L_0x0032:
                int r8 = r7.getLeft()
                int r0 = r6.a
                int r8 = r8 - r0
                int r7 = r7.getWidth()
                float r7 = (float) r7
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r0 = r0.f3386g
                float r7 = r7 * r0
                int r7 = java.lang.Math.round(r7)
                int r8 = java.lang.Math.abs(r8)
                if (r8 < r7) goto L_0x004f
                r1 = 1
            L_0x004f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.n(android.view.View, float):boolean");
        }

        public int a(View view, int i2, int i3) {
            int i4;
            int i5;
            int width;
            boolean z = u.x(view) == 1;
            int i6 = SwipeDismissBehavior.this.f3385f;
            if (i6 != 0) {
                if (i6 != 1) {
                    i4 = this.a - view.getWidth();
                    i5 = view.getWidth() + this.a;
                } else if (z) {
                    i4 = this.a;
                    width = view.getWidth();
                } else {
                    i4 = this.a - view.getWidth();
                    i5 = this.a;
                }
                return SwipeDismissBehavior.G(i4, i2, i5);
            } else if (z) {
                i4 = this.a - view.getWidth();
                i5 = this.a;
                return SwipeDismissBehavior.G(i4, i2, i5);
            } else {
                i4 = this.a;
                width = view.getWidth();
            }
            i5 = width + i4;
            return SwipeDismissBehavior.G(i4, i2, i5);
        }

        public int b(View view, int i2, int i3) {
            return view.getTop();
        }

        public int d(View view) {
            return view.getWidth();
        }

        public void i(View view, int i2) {
            this.b = i2;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        public void j(int i2) {
            b bVar = SwipeDismissBehavior.this.b;
            if (bVar != null) {
                bVar.b(i2);
            }
        }

        public void k(View view, int i2, int i3, int i4, int i5) {
            float width = ((float) this.a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f3387h);
            float width2 = ((float) this.a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f3388i);
            float f2 = (float) i2;
            if (f2 <= width) {
                view.setAlpha(1.0f);
            } else if (f2 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.F(0.0f, 1.0f - SwipeDismissBehavior.I(width, width2, f2), 1.0f));
            }
        }

        public void l(View view, float f2, float f3) {
            boolean z;
            int i2;
            b bVar;
            this.b = -1;
            int width = view.getWidth();
            if (n(view, f2)) {
                int left = view.getLeft();
                int i3 = this.a;
                i2 = left < i3 ? i3 - width : i3 + width;
                z = true;
            } else {
                i2 = this.a;
                z = false;
            }
            if (SwipeDismissBehavior.this.a.F(i2, view.getTop())) {
                u.X(view, new c(view, z));
            } else if (z && (bVar = SwipeDismissBehavior.this.b) != null) {
                bVar.a(view);
            }
        }

        public boolean m(View view, int i2) {
            int i3 = this.b;
            return (i3 == -1 || i3 == i2) && SwipeDismissBehavior.this.E(view);
        }
    }

    public interface b {
        void a(View view);

        void b(int i2);
    }

    private class c implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        private final View f3390g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f3391h;

        c(View view, boolean z) {
            this.f3390g = view;
            this.f3391h = z;
        }

        public void run() {
            b bVar;
            e.j.b.c cVar = SwipeDismissBehavior.this.a;
            if (cVar != null && cVar.k(true)) {
                u.X(this.f3390g, this);
            } else if (this.f3391h && (bVar = SwipeDismissBehavior.this.b) != null) {
                bVar.a(this.f3390g);
            }
        }
    }

    static float F(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    static int G(int i2, int i3, int i4) {
        return Math.min(Math.max(i2, i3), i4);
    }

    private void H(ViewGroup viewGroup) {
        e.j.b.c cVar;
        if (this.a == null) {
            if (this.f3384e) {
                cVar = e.j.b.c.l(viewGroup, this.f3383d, this.f3389j);
            } else {
                cVar = e.j.b.c.m(viewGroup, this.f3389j);
            }
            this.a = cVar;
        }
    }

    static float I(float f2, float f3, float f4) {
        return (f4 - f2) / (f3 - f2);
    }

    public boolean D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        e.j.b.c cVar = this.a;
        if (cVar == null) {
            return false;
        }
        cVar.z(motionEvent);
        return true;
    }

    public boolean E(View view) {
        return true;
    }

    public void J(float f2) {
        this.f3388i = F(0.0f, f2, 1.0f);
    }

    public void K(float f2) {
        this.f3387h = F(0.0f, f2, 1.0f);
    }

    public void L(int i2) {
        this.f3385f = i2;
    }

    public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.B(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (!z) {
            return false;
        }
        H(coordinatorLayout);
        return this.a.G(motionEvent);
    }
}
