package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import e.h.k.u;
import g.b.a.c.l;
import g.b.a.c.m.h;
import java.util.List;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    /* access modifiers changed from: private */
    public final d A;
    /* access modifiers changed from: private */
    public final d B;
    private final CoordinatorLayout.c<ExtendedFloatingActionButton> C;
    private boolean D;
    /* access modifiers changed from: private */
    public final Rect x;
    /* access modifiers changed from: private */
    public final d y;
    /* access modifiers changed from: private */
    public final d z;

    class a extends AnimatorListenerAdapter {
        private boolean a;
        final /* synthetic */ d b;
        final /* synthetic */ d c;

        a(ExtendedFloatingActionButton extendedFloatingActionButton, d dVar, d dVar2) {
            this.b = dVar;
            this.c = dVar2;
        }

        public void onAnimationCancel(Animator animator) {
            this.a = true;
            this.b.b();
        }

        public void onAnimationEnd(Animator animator) {
            this.b.a();
            if (!this.a) {
                this.b.h(this.c);
            }
        }

        public void onAnimationStart(Animator animator) {
            this.b.onAnimationStart(animator);
            this.a = false;
        }
    }

    static class b extends Property<View, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().width);
        }

        /* renamed from: b */
        public void set(View view, Float f2) {
            view.getLayoutParams().width = f2.intValue();
            view.requestLayout();
        }
    }

    static class c extends Property<View, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().height);
        }

        /* renamed from: b */
        public void set(View view, Float f2) {
            view.getLayoutParams().height = f2.intValue();
            view.requestLayout();
        }
    }

    public static abstract class d {
    }

    static {
        Class<Float> cls = Float.class;
        new b(cls, "width");
        new c(cls, "height");
    }

    /* access modifiers changed from: private */
    public void m(d dVar, d dVar2) {
        if (!dVar.i()) {
            if (!n()) {
                dVar.d();
                dVar.h(dVar2);
                return;
            }
            measure(0, 0);
            AnimatorSet f2 = dVar.f();
            f2.addListener(new a(this, dVar, dVar2));
            for (Animator.AnimatorListener addListener : dVar.g()) {
                f2.addListener(addListener);
            }
            f2.start();
        }
    }

    private boolean n() {
        return u.L(this) && !isInEditMode();
    }

    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.C;
    }

    /* access modifiers changed from: package-private */
    public int getCollapsedSize() {
        return (Math.min(u.C(this), u.B(this)) * 2) + getIconSize();
    }

    public h getExtendMotionSpec() {
        return this.z.e();
    }

    public h getHideMotionSpec() {
        return this.B.e();
    }

    public h getShowMotionSpec() {
        return this.A.e();
    }

    public h getShrinkMotionSpec() {
        return this.y.e();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.D && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.D = false;
            this.y.d();
        }
    }

    public void setExtendMotionSpec(h hVar) {
        this.z.c(hVar);
    }

    public void setExtendMotionSpecResource(int i2) {
        setExtendMotionSpec(h.c(getContext(), i2));
    }

    public void setExtended(boolean z2) {
        if (this.D != z2) {
            d dVar = z2 ? this.z : this.y;
            if (!dVar.i()) {
                dVar.d();
            }
        }
    }

    public void setHideMotionSpec(h hVar) {
        this.B.c(hVar);
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(h.c(getContext(), i2));
    }

    public void setShowMotionSpec(h hVar) {
        this.A.c(hVar);
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(h.c(getContext(), i2));
    }

    public void setShrinkMotionSpec(h hVar) {
        this.y.c(hVar);
    }

    public void setShrinkMotionSpecResource(int i2) {
        setShrinkMotionSpec(h.c(getContext(), i2));
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {
        private Rect a;
        private d b;
        private d c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f3549d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f3550e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f3549d = false;
            this.f3550e = true;
        }

        private static boolean G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void H(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            int i2;
            Rect l2 = extendedFloatingActionButton.x;
            if (l2 != null && l2.centerX() > 0 && l2.centerY() > 0) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
                int i3 = 0;
                if (extendedFloatingActionButton.getRight() >= coordinatorLayout.getWidth() - fVar.rightMargin) {
                    i2 = l2.right;
                } else {
                    i2 = extendedFloatingActionButton.getLeft() <= fVar.leftMargin ? -l2.left : 0;
                }
                if (extendedFloatingActionButton.getBottom() >= coordinatorLayout.getHeight() - fVar.bottomMargin) {
                    i3 = l2.bottom;
                } else if (extendedFloatingActionButton.getTop() <= fVar.topMargin) {
                    i3 = -l2.top;
                }
                if (i3 != 0) {
                    u.R(extendedFloatingActionButton, i3);
                }
                if (i2 != 0) {
                    u.Q(extendedFloatingActionButton, i2);
                }
            }
        }

        private boolean K(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            if ((this.f3549d || this.f3550e) && fVar.e() == view.getId()) {
                return true;
            }
            return false;
        }

        private boolean M(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!K(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            com.google.android.material.internal.b.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                L(extendedFloatingActionButton);
                return true;
            }
            E(extendedFloatingActionButton);
            return true;
        }

        private boolean N(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!K(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                L(extendedFloatingActionButton);
                return true;
            }
            E(extendedFloatingActionButton);
            return true;
        }

        /* access modifiers changed from: protected */
        public void E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            d dVar;
            d dVar2 = this.f3550e ? this.c : this.b;
            if (this.f3550e) {
                dVar = extendedFloatingActionButton.z;
            } else {
                dVar = extendedFloatingActionButton.A;
            }
            extendedFloatingActionButton.m(dVar, dVar2);
        }

        /* renamed from: F */
        public boolean b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            Rect l2 = extendedFloatingActionButton.x;
            rect.set(extendedFloatingActionButton.getLeft() + l2.left, extendedFloatingActionButton.getTop() + l2.top, extendedFloatingActionButton.getRight() - l2.right, extendedFloatingActionButton.getBottom() - l2.bottom);
            return true;
        }

        /* renamed from: I */
        public boolean h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                M(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (!G(view)) {
                return false;
            } else {
                N(view, extendedFloatingActionButton);
                return false;
            }
        }

        /* renamed from: J */
        public boolean l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i2) {
            List<View> r = coordinatorLayout.r(extendedFloatingActionButton);
            int size = r.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = r.get(i3);
                if (!(view instanceof AppBarLayout)) {
                    if (G(view) && N(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (M(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.I(extendedFloatingActionButton, i2);
            H(coordinatorLayout, extendedFloatingActionButton);
            return true;
        }

        /* access modifiers changed from: protected */
        public void L(ExtendedFloatingActionButton extendedFloatingActionButton) {
            d dVar;
            d dVar2 = this.f3550e ? this.c : this.b;
            if (this.f3550e) {
                dVar = extendedFloatingActionButton.y;
            } else {
                dVar = extendedFloatingActionButton.B;
            }
            extendedFloatingActionButton.m(dVar, dVar2);
        }

        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f636h == 0) {
                fVar.f636h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.ExtendedFloatingActionButton_Behavior_Layout);
            this.f3549d = obtainStyledAttributes.getBoolean(l.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f3550e = obtainStyledAttributes.getBoolean(l.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }
    }
}
