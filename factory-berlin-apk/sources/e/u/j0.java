package e.u;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import e.u.a;
import e.u.m;

/* compiled from: Visibility */
public abstract class j0 extends m {
    private static final String[] Q = {"android:visibility:visibility", "android:visibility:parent"};
    private int P = 3;

    /* compiled from: Visibility */
    class a extends n {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ View b;
        final /* synthetic */ View c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.a = viewGroup;
            this.b = view;
            this.c = view2;
        }

        public void c(m mVar) {
            x.a(this.a).c(this.b);
        }

        public void d(m mVar) {
            if (this.b.getParent() == null) {
                x.a(this.a).a(this.b);
            } else {
                j0.this.cancel();
            }
        }

        public void e(m mVar) {
            this.c.setTag(j.save_overlay_view, (Object) null);
            x.a(this.a).c(this.b);
            mVar.a0(this);
        }
    }

    /* compiled from: Visibility */
    private static class b extends AnimatorListenerAdapter implements m.f, a.C0587a {
        private final View a;
        private final int b;
        private final ViewGroup c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f8913d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f8914e;

        /* renamed from: f  reason: collision with root package name */
        boolean f8915f = false;

        b(View view, int i2, boolean z) {
            this.a = view;
            this.b = i2;
            this.c = (ViewGroup) view.getParent();
            this.f8913d = z;
            g(true);
        }

        private void f() {
            if (!this.f8915f) {
                c0.h(this.a, this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z) {
            ViewGroup viewGroup;
            if (this.f8913d && this.f8914e != z && (viewGroup = this.c) != null) {
                this.f8914e = z;
                x.c(viewGroup, z);
            }
        }

        public void a(m mVar) {
        }

        public void b(m mVar) {
        }

        public void c(m mVar) {
            g(false);
        }

        public void d(m mVar) {
            g(true);
        }

        public void e(m mVar) {
            f();
            mVar.a0(this);
        }

        public void onAnimationCancel(Animator animator) {
            this.f8915f = true;
        }

        public void onAnimationEnd(Animator animator) {
            f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f8915f) {
                c0.h(this.a, this.b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f8915f) {
                c0.h(this.a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: Visibility */
    private static class c {
        boolean a;
        boolean b;
        int c;

        /* renamed from: d  reason: collision with root package name */
        int f8916d;

        /* renamed from: e  reason: collision with root package name */
        ViewGroup f8917e;

        /* renamed from: f  reason: collision with root package name */
        ViewGroup f8918f;

        c() {
        }
    }

    private void q0(s sVar) {
        sVar.a.put("android:visibility:visibility", Integer.valueOf(sVar.b.getVisibility()));
        sVar.a.put("android:visibility:parent", sVar.b.getParent());
        int[] iArr = new int[2];
        sVar.b.getLocationOnScreen(iArr);
        sVar.a.put("android:visibility:screenLocation", iArr);
    }

    private c r0(s sVar, s sVar2) {
        c cVar = new c();
        cVar.a = false;
        cVar.b = false;
        if (sVar == null || !sVar.a.containsKey("android:visibility:visibility")) {
            cVar.c = -1;
            cVar.f8917e = null;
        } else {
            cVar.c = ((Integer) sVar.a.get("android:visibility:visibility")).intValue();
            cVar.f8917e = (ViewGroup) sVar.a.get("android:visibility:parent");
        }
        if (sVar2 == null || !sVar2.a.containsKey("android:visibility:visibility")) {
            cVar.f8916d = -1;
            cVar.f8918f = null;
        } else {
            cVar.f8916d = ((Integer) sVar2.a.get("android:visibility:visibility")).intValue();
            cVar.f8918f = (ViewGroup) sVar2.a.get("android:visibility:parent");
        }
        if (sVar == null || sVar2 == null) {
            if (sVar == null && cVar.f8916d == 0) {
                cVar.b = true;
                cVar.a = true;
            } else if (sVar2 == null && cVar.c == 0) {
                cVar.b = false;
                cVar.a = true;
            }
        } else if (cVar.c == cVar.f8916d && cVar.f8917e == cVar.f8918f) {
            return cVar;
        } else {
            int i2 = cVar.c;
            int i3 = cVar.f8916d;
            if (i2 != i3) {
                if (i2 == 0) {
                    cVar.b = false;
                    cVar.a = true;
                } else if (i3 == 0) {
                    cVar.b = true;
                    cVar.a = true;
                }
            } else if (cVar.f8918f == null) {
                cVar.b = false;
                cVar.a = true;
            } else if (cVar.f8917e == null) {
                cVar.b = true;
                cVar.a = true;
            }
        }
        return cVar;
    }

    public String[] N() {
        return Q;
    }

    public boolean P(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.a.containsKey("android:visibility:visibility") != sVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c r0 = r0(sVar, sVar2);
        if (!r0.a) {
            return false;
        }
        if (r0.c == 0 || r0.f8916d == 0) {
            return true;
        }
        return false;
    }

    public void h(s sVar) {
        q0(sVar);
    }

    public void r(s sVar) {
        q0(sVar);
    }

    public abstract Animator s0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    public Animator u0(ViewGroup viewGroup, s sVar, int i2, s sVar2, int i3) {
        if ((this.P & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.b.getParent();
            if (r0(B(view, false), O(view, false)).a) {
                return null;
            }
        }
        return s0(viewGroup, sVar2.b, sVar, sVar2);
    }

    public Animator v(ViewGroup viewGroup, s sVar, s sVar2) {
        c r0 = r0(sVar, sVar2);
        if (!r0.a) {
            return null;
        }
        if (r0.f8917e == null && r0.f8918f == null) {
            return null;
        }
        if (r0.b) {
            return u0(viewGroup, sVar, r0.c, sVar2, r0.f8916d);
        }
        return w0(viewGroup, sVar, r0.c, sVar2, r0.f8916d);
    }

    public abstract Animator v0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007f, code lost:
        if (r10.B != false) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator w0(android.view.ViewGroup r11, e.u.s r12, int r13, e.u.s r14, int r15) {
        /*
            r10 = this;
            int r13 = r10.P
            r0 = 2
            r13 = r13 & r0
            r1 = 0
            if (r13 == r0) goto L_0x0008
            return r1
        L_0x0008:
            if (r12 != 0) goto L_0x000b
            return r1
        L_0x000b:
            android.view.View r13 = r12.b
            if (r14 == 0) goto L_0x0012
            android.view.View r2 = r14.b
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            int r3 = e.u.j.save_overlay_view
            java.lang.Object r3 = r13.getTag(r3)
            android.view.View r3 = (android.view.View) r3
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0023
            r2 = r1
            r6 = 1
            goto L_0x0089
        L_0x0023:
            if (r2 == 0) goto L_0x0036
            android.view.ViewParent r3 = r2.getParent()
            if (r3 != 0) goto L_0x002c
            goto L_0x0036
        L_0x002c:
            r3 = 4
            if (r15 != r3) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            if (r13 != r2) goto L_0x003b
        L_0x0032:
            r3 = r2
            r6 = 0
            r2 = r1
            goto L_0x003e
        L_0x0036:
            if (r2 == 0) goto L_0x003b
            r3 = r1
            r6 = 0
            goto L_0x003e
        L_0x003b:
            r2 = r1
            r3 = r2
            r6 = 1
        L_0x003e:
            if (r6 == 0) goto L_0x0085
            android.view.ViewParent r6 = r13.getParent()
            if (r6 != 0) goto L_0x0047
            goto L_0x0081
        L_0x0047:
            android.view.ViewParent r6 = r13.getParent()
            boolean r6 = r6 instanceof android.view.View
            if (r6 == 0) goto L_0x0085
            android.view.ViewParent r6 = r13.getParent()
            android.view.View r6 = (android.view.View) r6
            e.u.s r7 = r10.O(r6, r5)
            e.u.s r8 = r10.B(r6, r5)
            e.u.j0$c r7 = r10.r0(r7, r8)
            boolean r7 = r7.a
            if (r7 != 0) goto L_0x006a
            android.view.View r2 = e.u.r.a(r11, r13, r6)
            goto L_0x0085
        L_0x006a:
            int r7 = r6.getId()
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != 0) goto L_0x0085
            r6 = -1
            if (r7 == r6) goto L_0x0085
            android.view.View r6 = r11.findViewById(r7)
            if (r6 == 0) goto L_0x0085
            boolean r6 = r10.B
            if (r6 == 0) goto L_0x0085
        L_0x0081:
            r2 = r3
            r6 = 0
            r3 = r13
            goto L_0x0089
        L_0x0085:
            r6 = 0
            r9 = r3
            r3 = r2
            r2 = r9
        L_0x0089:
            if (r3 == 0) goto L_0x00db
            if (r6 != 0) goto L_0x00bd
            java.util.Map<java.lang.String, java.lang.Object> r15 = r12.a
            java.lang.String r1 = "android:visibility:screenLocation"
            java.lang.Object r15 = r15.get(r1)
            int[] r15 = (int[]) r15
            r1 = r15[r4]
            r15 = r15[r5]
            int[] r0 = new int[r0]
            r11.getLocationOnScreen(r0)
            r2 = r0[r4]
            int r1 = r1 - r2
            int r2 = r3.getLeft()
            int r1 = r1 - r2
            r3.offsetLeftAndRight(r1)
            r0 = r0[r5]
            int r15 = r15 - r0
            int r0 = r3.getTop()
            int r15 = r15 - r0
            r3.offsetTopAndBottom(r15)
            e.u.w r15 = e.u.x.a(r11)
            r15.a(r3)
        L_0x00bd:
            android.animation.Animator r12 = r10.v0(r11, r3, r12, r14)
            if (r6 != 0) goto L_0x00da
            if (r12 != 0) goto L_0x00cd
            e.u.w r11 = e.u.x.a(r11)
            r11.c(r3)
            goto L_0x00da
        L_0x00cd:
            int r14 = e.u.j.save_overlay_view
            r13.setTag(r14, r3)
            e.u.j0$a r14 = new e.u.j0$a
            r14.<init>(r11, r3, r13)
            r10.c(r14)
        L_0x00da:
            return r12
        L_0x00db:
            if (r2 == 0) goto L_0x00fd
            int r13 = r2.getVisibility()
            e.u.c0.h(r2, r4)
            android.animation.Animator r11 = r10.v0(r11, r2, r12, r14)
            if (r11 == 0) goto L_0x00f9
            e.u.j0$b r12 = new e.u.j0$b
            r12.<init>(r2, r15, r5)
            r11.addListener(r12)
            e.u.a.a(r11, r12)
            r10.c(r12)
            goto L_0x00fc
        L_0x00f9:
            e.u.c0.h(r2, r13)
        L_0x00fc:
            return r11
        L_0x00fd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.u.j0.w0(android.view.ViewGroup, e.u.s, int, e.u.s, int):android.animation.Animator");
    }

    public void x0(int i2) {
        if ((i2 & -4) == 0) {
            this.P = i2;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
}
