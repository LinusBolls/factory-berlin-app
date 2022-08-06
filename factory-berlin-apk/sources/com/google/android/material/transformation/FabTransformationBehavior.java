package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import e.h.k.u;
import g.b.a.c.f;
import g.b.a.c.m.h;
import g.b.a.c.m.i;
import g.b.a.c.m.j;
import g.b.a.c.r.d;
import java.util.ArrayList;
import java.util.List;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    private final Rect c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    private final RectF f3690d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    private final RectF f3691e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    private final int[] f3692f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    private float f3693g;

    /* renamed from: h  reason: collision with root package name */
    private float f3694h;

    class a extends AnimatorListenerAdapter {
        final /* synthetic */ boolean a;
        final /* synthetic */ View b;
        final /* synthetic */ View c;

        a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.a = z;
            this.b = view;
            this.c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.a) {
                this.b.setVisibility(4);
                this.c.setAlpha(1.0f);
                this.c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.a) {
                this.b.setVisibility(0);
                this.c.setAlpha(0.0f);
                this.c.setVisibility(4);
            }
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ View a;

        b(FabTransformationBehavior fabTransformationBehavior, View view) {
            this.a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.invalidate();
        }
    }

    class c extends AnimatorListenerAdapter {
        final /* synthetic */ g.b.a.c.r.d a;
        final /* synthetic */ Drawable b;

        c(FabTransformationBehavior fabTransformationBehavior, g.b.a.c.r.d dVar, Drawable drawable) {
            this.a = dVar;
            this.b = drawable;
        }

        public void onAnimationEnd(Animator animator) {
            this.a.setCircularRevealOverlayDrawable((Drawable) null);
        }

        public void onAnimationStart(Animator animator) {
            this.a.setCircularRevealOverlayDrawable(this.b);
        }
    }

    class d extends AnimatorListenerAdapter {
        final /* synthetic */ g.b.a.c.r.d a;

        d(FabTransformationBehavior fabTransformationBehavior, g.b.a.c.r.d dVar) {
            this.a = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            d.e revealInfo = this.a.getRevealInfo();
            revealInfo.c = Float.MAX_VALUE;
            this.a.setRevealInfo(revealInfo);
        }
    }

    protected static class e {
        public h a;
        public j b;

        protected e() {
        }
    }

    public FabTransformationBehavior() {
    }

    private ViewGroup K(View view) {
        View findViewById = view.findViewById(f.mtrl_child_content_container);
        if (findViewById != null) {
            return f0(findViewById);
        }
        if ((view instanceof b) || (view instanceof a)) {
            return f0(((ViewGroup) view).getChildAt(0));
        }
        return f0(view);
    }

    private void L(View view, e eVar, i iVar, i iVar2, float f2, float f3, float f4, float f5, RectF rectF) {
        float S = S(eVar, iVar, f2, f4);
        float S2 = S(eVar, iVar2, f3, f5);
        Rect rect = this.c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f3690d;
        rectF2.set(rect);
        RectF rectF3 = this.f3691e;
        T(view, rectF3);
        rectF3.offset(S, S2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void M(View view, RectF rectF) {
        T(view, rectF);
        rectF.offset(this.f3693g, this.f3694h);
    }

    private Pair<i, i> N(float f2, float f3, boolean z, e eVar) {
        i iVar;
        i iVar2;
        int i2;
        if (f2 == 0.0f || f3 == 0.0f) {
            iVar2 = eVar.a.e("translationXLinear");
            iVar = eVar.a.e("translationYLinear");
        } else if ((!z || f3 >= 0.0f) && (z || i2 <= 0)) {
            iVar2 = eVar.a.e("translationXCurveDownwards");
            iVar = eVar.a.e("translationYCurveDownwards");
        } else {
            iVar2 = eVar.a.e("translationXCurveUpwards");
            iVar = eVar.a.e("translationYCurveUpwards");
        }
        return new Pair<>(iVar2, iVar);
    }

    private float O(View view, View view2, j jVar) {
        RectF rectF = this.f3690d;
        RectF rectF2 = this.f3691e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(-Q(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float P(View view, View view2, j jVar) {
        RectF rectF = this.f3690d;
        RectF rectF2 = this.f3691e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(0.0f, -R(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    private float Q(View view, View view2, j jVar) {
        float f2;
        float f3;
        float f4;
        RectF rectF = this.f3690d;
        RectF rectF2 = this.f3691e;
        M(view, rectF);
        T(view2, rectF2);
        int i2 = jVar.a & 7;
        if (i2 == 1) {
            f4 = rectF2.centerX();
            f3 = rectF.centerX();
        } else if (i2 == 3) {
            f4 = rectF2.left;
            f3 = rectF.left;
        } else if (i2 != 5) {
            f2 = 0.0f;
            return f2 + jVar.b;
        } else {
            f4 = rectF2.right;
            f3 = rectF.right;
        }
        f2 = f4 - f3;
        return f2 + jVar.b;
    }

    private float R(View view, View view2, j jVar) {
        float f2;
        float f3;
        float f4;
        RectF rectF = this.f3690d;
        RectF rectF2 = this.f3691e;
        M(view, rectF);
        T(view2, rectF2);
        int i2 = jVar.a & 112;
        if (i2 == 16) {
            f4 = rectF2.centerY();
            f3 = rectF.centerY();
        } else if (i2 == 48) {
            f4 = rectF2.top;
            f3 = rectF.top;
        } else if (i2 != 80) {
            f2 = 0.0f;
            return f2 + jVar.c;
        } else {
            f4 = rectF2.bottom;
            f3 = rectF.bottom;
        }
        f2 = f4 - f3;
        return f2 + jVar.c;
    }

    private float S(e eVar, i iVar, float f2, float f3) {
        long c2 = iVar.c();
        long d2 = iVar.d();
        i e2 = eVar.a.e("expansion");
        return g.b.a.c.m.a.a(f2, f3, iVar.e().getInterpolation(((float) (((e2.c() + e2.d()) + 17) - c2)) / ((float) d2)));
    }

    private void T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f3692f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    private void U(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup K;
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if ((!(view2 instanceof g.b.a.c.r.d) || g.b.a.c.r.c.a != 0) && (K = K(view2)) != null) {
                if (z) {
                    if (!z2) {
                        g.b.a.c.m.d.a.set(K, Float.valueOf(0.0f));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(K, g.b.a.c.m.d.a, new float[]{1.0f});
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(K, g.b.a.c.m.d.a, new float[]{0.0f});
                }
                eVar.a.e("contentFade").a(objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    private void V(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof g.b.a.c.r.d) {
            g.b.a.c.r.d dVar = (g.b.a.c.r.d) view2;
            int d0 = d0(view);
            int i2 = 16777215 & d0;
            if (z) {
                if (!z2) {
                    dVar.setCircularRevealScrimColor(d0);
                }
                objectAnimator = ObjectAnimator.ofInt(dVar, d.C0638d.a, new int[]{i2});
            } else {
                objectAnimator = ObjectAnimator.ofInt(dVar, d.C0638d.a, new int[]{d0});
            }
            objectAnimator.setEvaluator(g.b.a.c.m.c.b());
            eVar.a.e("color").a(objectAnimator);
            list.add(objectAnimator);
        }
    }

    private void W(View view, View view2, boolean z, e eVar, List<Animator> list) {
        float Q = Q(view, view2, eVar.b);
        float R = R(view, view2, eVar.b);
        Pair<i, i> N = N(Q, R, z, eVar);
        i iVar = (i) N.first;
        i iVar2 = (i) N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            Q = this.f3693g;
        }
        fArr[0] = Q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            R = this.f3694h;
        }
        fArr2[0] = R;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        iVar.a(ofFloat);
        iVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    private void X(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float s = u.s(view2) - u.s(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-s);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-s});
        }
        eVar.a.e("elevation").a(objectAnimator);
        list.add(objectAnimator);
    }

    private void Y(View view, View view2, boolean z, boolean z2, e eVar, float f2, float f3, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        View view3 = view;
        View view4 = view2;
        e eVar2 = eVar;
        if (view4 instanceof g.b.a.c.r.d) {
            g.b.a.c.r.d dVar = (g.b.a.c.r.d) view4;
            float O = O(view3, view4, eVar2.b);
            float P = P(view3, view4, eVar2.b);
            ((FloatingActionButton) view3).i(this.c);
            float width = ((float) this.c.width()) / 2.0f;
            i e2 = eVar2.a.e("expansion");
            if (z) {
                if (!z2) {
                    dVar.setRevealInfo(new d.e(O, P, width));
                }
                if (z2) {
                    width = dVar.getRevealInfo().c;
                }
                animator = g.b.a.c.r.a.a(dVar, O, P, g.b.a.c.x.a.b(O, P, 0.0f, 0.0f, f2, f3));
                animator.addListener(new d(this, dVar));
                b0(view2, e2.c(), (int) O, (int) P, width, list);
            } else {
                float f4 = dVar.getRevealInfo().c;
                Animator a2 = g.b.a.c.r.a.a(dVar, O, P, width);
                int i2 = (int) O;
                int i3 = (int) P;
                View view5 = view2;
                b0(view5, e2.c(), i2, i3, f4, list);
                long c2 = e2.c();
                long d2 = e2.d();
                long f5 = eVar2.a.f();
                a0(view5, c2, d2, f5, i2, i3, width, list);
                animator = a2;
            }
            e2.a(animator);
            list.add(animator);
            list2.add(g.b.a.c.r.a.b(dVar));
        }
    }

    private void Z(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof g.b.a.c.r.d) && (view instanceof ImageView)) {
            g.b.a.c.r.d dVar = (g.b.a.c.r.d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, g.b.a.c.m.e.b, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, g.b.a.c.m.e.b, new int[]{255});
                }
                objectAnimator.addUpdateListener(new b(this, view2));
                eVar.a.e("iconFade").a(objectAnimator);
                list.add(objectAnimator);
                list2.add(new c(this, dVar, drawable));
            }
        }
    }

    private void a0(View view, long j2, long j3, long j4, int i2, int i3, float f2, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j5 = j2 + j3;
            if (j5 < j4) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i2, i3, f2, f2);
                createCircularReveal.setStartDelay(j5);
                createCircularReveal.setDuration(j4 - j5);
                list.add(createCircularReveal);
            }
        }
    }

    private void b0(View view, long j2, int i2, int i3, float f2, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21 && j2 > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i2, i3, f2, f2);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j2);
            list.add(createCircularReveal);
        }
    }

    private void c0(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        View view3 = view;
        View view4 = view2;
        boolean z3 = z;
        e eVar2 = eVar;
        List<Animator> list3 = list;
        float Q = Q(view3, view4, eVar2.b);
        float R = R(view3, view4, eVar2.b);
        Pair<i, i> N = N(Q, R, z3, eVar2);
        i iVar = (i) N.first;
        i iVar2 = (i) N.second;
        if (z3) {
            if (!z2) {
                view4.setTranslationX(-Q);
                view4.setTranslationY(-R);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});
            L(view2, eVar, iVar, iVar2, -Q, -R, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-Q});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-R});
        }
        iVar.a(objectAnimator2);
        iVar2.a(objectAnimator);
        list3.add(objectAnimator2);
        list3.add(objectAnimator);
    }

    private int d0(View view) {
        ColorStateList o = u.o(view);
        if (o != null) {
            return o.getColorForState(view.getDrawableState(), o.getDefaultColor());
        }
        return 0;
    }

    private ViewGroup f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public AnimatorSet J(View view, View view2, boolean z, boolean z2) {
        boolean z3 = z;
        e e0 = e0(view2.getContext(), z3);
        if (z3) {
            this.f3693g = view.getTranslationX();
            this.f3694h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            X(view, view2, z, z2, e0, arrayList, arrayList2);
        }
        RectF rectF = this.f3690d;
        View view3 = view;
        View view4 = view2;
        boolean z4 = z;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        c0(view3, view4, z4, z2, e0, arrayList3, arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        W(view3, view4, z4, e0, arrayList);
        boolean z5 = z2;
        e eVar = e0;
        Z(view3, view4, z4, z5, eVar, arrayList3, arrayList4);
        Y(view3, view4, z4, z5, eVar, width, height, arrayList, arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        V(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        U(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        g.b.a.c.m.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(this, z3, view2, view));
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i2));
        }
        return animatorSet;
    }

    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public abstract e e0(Context context, boolean z);

    public void g(CoordinatorLayout.f fVar) {
        if (fVar.f636h == 0) {
            fVar.f636h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
