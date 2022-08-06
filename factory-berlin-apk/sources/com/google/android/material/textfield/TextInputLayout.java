package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.z;
import androidx.core.widget.i;
import com.google.android.material.internal.CheckableImageButton;
import e.h.k.u;
import g.b.a.c.j;
import g.b.a.c.k;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TextInputLayout extends LinearLayout {
    private static final int x0 = k.Widget_Design_TextInputLayout;
    private int A;
    private final int B;
    private int C;
    private final int D;
    private final int E;
    private int F;
    private int G;
    private final Rect H;
    private final Rect I;
    private final RectF J;
    private Typeface K;
    private final CheckableImageButton L;
    private ColorStateList M;
    private boolean N;
    private PorterDuff.Mode O;
    private boolean P;
    private Drawable Q;
    private View.OnLongClickListener R;
    private final LinkedHashSet<f> S;
    private int T;
    private final SparseArray<e> U;
    /* access modifiers changed from: private */
    public final CheckableImageButton V;
    private final LinkedHashSet<g> W;
    private ColorStateList a0;
    private boolean b0;
    private PorterDuff.Mode c0;
    private boolean d0;
    private Drawable e0;
    private Drawable f0;

    /* renamed from: g  reason: collision with root package name */
    private final FrameLayout f3629g;
    private final CheckableImageButton g0;

    /* renamed from: h  reason: collision with root package name */
    private final FrameLayout f3630h;
    private View.OnLongClickListener h0;

    /* renamed from: i  reason: collision with root package name */
    EditText f3631i;
    private ColorStateList i0;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f3632j;
    private ColorStateList j0;

    /* renamed from: k  reason: collision with root package name */
    private final f f3633k;
    private final int k0;

    /* renamed from: l  reason: collision with root package name */
    boolean f3634l;
    private final int l0;

    /* renamed from: m  reason: collision with root package name */
    private int f3635m;
    private int m0;

    /* renamed from: n  reason: collision with root package name */
    private boolean f3636n;
    private int n0;
    private TextView o;
    private final int o0;
    private int p;
    private final int p0;
    private int q;
    private final int q0;
    private ColorStateList r;
    private boolean r0;
    private ColorStateList s;
    final com.google.android.material.internal.a s0;
    private boolean t;
    private boolean t0;
    private CharSequence u;
    private ValueAnimator u0;
    private boolean v;
    private boolean v0;
    private g.b.a.c.c0.g w;
    /* access modifiers changed from: private */
    public boolean w0;
    private g.b.a.c.c0.g x;
    private g.b.a.c.c0.k y;
    private final int z;

    class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.c0(!textInputLayout.w0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f3634l) {
                textInputLayout2.V(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            TextInputLayout.this.V.performClick();
            TextInputLayout.this.V.jumpDrawablesToCurrentState();
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            TextInputLayout.this.f3631i.requestLayout();
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.s0.V(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends e.h.k.a {

        /* renamed from: d  reason: collision with root package name */
        private final TextInputLayout f3640d;

        public e(TextInputLayout textInputLayout) {
            this.f3640d = textInputLayout;
        }

        public void g(View view, e.h.k.d0.c cVar) {
            super.g(view, cVar);
            EditText editText = this.f3640d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f3640d.getHint();
            CharSequence error = this.f3640d.getError();
            CharSequence counterOverflowDescription = this.f3640d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(error);
            boolean z4 = false;
            boolean z5 = z3 || !TextUtils.isEmpty(counterOverflowDescription);
            if (z) {
                cVar.q0(text);
            } else if (z2) {
                cVar.q0(hint);
            }
            if (z2) {
                cVar.h0(hint);
                if (!z && z2) {
                    z4 = true;
                }
                cVar.o0(z4);
            }
            if (z5) {
                if (!z3) {
                    error = counterOverflowDescription;
                }
                cVar.d0(error);
                cVar.b0(true);
            }
        }
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i2);
    }

    static class h extends e.j.a.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: i  reason: collision with root package name */
        CharSequence f3641i;

        /* renamed from: j  reason: collision with root package name */
        boolean f3642j;

        static class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            /* renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            /* renamed from: c */
            public h[] newArray(int i2) {
                return new h[i2];
            }
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f3641i + "}";
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            TextUtils.writeToParcel(this.f3641i, parcel, i2);
            parcel.writeInt(this.f3642j ? 1 : 0);
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3641i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f3642j = parcel.readInt() != 1 ? false : true;
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.b.a.c.b.textInputStyle);
    }

    private void A(Canvas canvas) {
        if (this.t) {
            this.s0.i(canvas);
        }
    }

    private void B(boolean z2) {
        ValueAnimator valueAnimator = this.u0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.u0.cancel();
        }
        if (!z2 || !this.t0) {
            this.s0.V(0.0f);
        } else {
            e(0.0f);
        }
        if (w() && ((c) this.w).h0()) {
            u();
        }
        this.r0 = true;
    }

    private boolean C() {
        return this.T != 0;
    }

    private boolean D() {
        return getStartIconDrawable() != null;
    }

    private boolean H() {
        if (this.A != 1 || (Build.VERSION.SDK_INT >= 16 && this.f3631i.getMinLines() > 1)) {
            return false;
        }
        return true;
    }

    private void J() {
        l();
        M();
        e0();
        if (this.A != 0) {
            b0();
        }
    }

    private void K() {
        if (w()) {
            RectF rectF = this.J;
            this.s0.k(rectF);
            h(rectF);
            rectF.offset((float) (-getPaddingLeft()), 0.0f);
            ((c) this.w).n0(rectF);
        }
    }

    private static void L(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                L((ViewGroup) childAt, z2);
            }
        }
    }

    private void M() {
        if (R()) {
            u.h0(this.f3631i, this.w);
        }
    }

    private static void N(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean G2 = u.G(checkableImageButton);
        boolean z2 = false;
        int i2 = 1;
        boolean z3 = onLongClickListener != null;
        if (G2 || z3) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(G2);
        checkableImageButton.setPressable(G2);
        checkableImageButton.setLongClickable(z3);
        if (!z2) {
            i2 = 2;
        }
        u.o0(checkableImageButton, i2);
    }

    private static void O(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        N(checkableImageButton, onLongClickListener);
    }

    private static void P(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        N(checkableImageButton, onLongClickListener);
    }

    private boolean R() {
        EditText editText = this.f3631i;
        return (editText == null || this.w == null || editText.getBackground() != null || this.A == 0) ? false : true;
    }

    private void S(boolean z2) {
        if (!z2 || getEndIconDrawable() == null) {
            i();
            return;
        }
        Drawable mutate = androidx.core.graphics.drawable.a.r(getEndIconDrawable()).mutate();
        androidx.core.graphics.drawable.a.n(mutate, this.f3633k.n());
        this.V.setImageDrawable(mutate);
    }

    private void T(Rect rect) {
        g.b.a.c.c0.g gVar = this.x;
        if (gVar != null) {
            int i2 = rect.bottom;
            gVar.setBounds(rect.left, i2 - this.E, rect.right, i2);
        }
    }

    private void U() {
        if (this.o != null) {
            EditText editText = this.f3631i;
            V(editText == null ? 0 : editText.getText().length());
        }
    }

    private static void W(Context context, TextView textView, int i2, int i3, boolean z2) {
        textView.setContentDescription(context.getString(z2 ? j.character_counter_overflowed_content_description : j.character_counter_content_description, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}));
    }

    private void X() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.o;
        if (textView != null) {
            Q(textView, this.f3636n ? this.p : this.q);
            if (!this.f3636n && (colorStateList2 = this.r) != null) {
                this.o.setTextColor(colorStateList2);
            }
            if (this.f3636n && (colorStateList = this.s) != null) {
                this.o.setTextColor(colorStateList);
            }
        }
    }

    private boolean Z() {
        int max;
        if (this.f3631i == null || this.f3631i.getMeasuredHeight() >= (max = Math.max(this.V.getMeasuredHeight(), this.L.getMeasuredHeight()))) {
            return false;
        }
        this.f3631i.setMinimumHeight(max);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a0() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f3631i
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.D()
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0060
            boolean r0 = r10.I()
            if (r0 == 0) goto L_0x0060
            com.google.android.material.internal.CheckableImageButton r0 = r10.L
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x0060
            android.graphics.drawable.Drawable r0 = r10.Q
            if (r0 != 0) goto L_0x0048
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>()
            r10.Q = r0
            com.google.android.material.internal.CheckableImageButton r0 = r10.L
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f3631i
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.L
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = e.h.k.h.a(r6)
            int r0 = r0 + r6
            android.graphics.drawable.Drawable r6 = r10.Q
            r6.setBounds(r1, r1, r0, r5)
        L_0x0048:
            android.widget.EditText r0 = r10.f3631i
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.i.a(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.Q
            if (r6 == r7) goto L_0x0079
            android.widget.EditText r6 = r10.f3631i
            r8 = r0[r5]
            r9 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.i.i(r6, r7, r8, r9, r0)
            goto L_0x0077
        L_0x0060:
            android.graphics.drawable.Drawable r0 = r10.Q
            if (r0 == 0) goto L_0x0079
            android.widget.EditText r0 = r10.f3631i
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.i.a(r0)
            android.widget.EditText r6 = r10.f3631i
            r7 = r0[r5]
            r8 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.i.i(r6, r2, r7, r8, r0)
            r10.Q = r2
        L_0x0077:
            r0 = 1
            goto L_0x007a
        L_0x0079:
            r0 = 0
        L_0x007a:
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x00ca
            int r7 = r6.getMeasuredWidth()
            if (r7 <= 0) goto L_0x00ca
            android.graphics.drawable.Drawable r2 = r10.e0
            if (r2 != 0) goto L_0x00ac
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>()
            r10.e0 = r2
            int r2 = r6.getMeasuredWidth()
            android.widget.EditText r7 = r10.f3631i
            int r7 = r7.getPaddingRight()
            int r2 = r2 - r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = e.h.k.h.b(r6)
            int r2 = r2 + r6
            android.graphics.drawable.Drawable r6 = r10.e0
            r6.setBounds(r1, r1, r2, r5)
        L_0x00ac:
            android.widget.EditText r2 = r10.f3631i
            android.graphics.drawable.Drawable[] r2 = androidx.core.widget.i.a(r2)
            r6 = r2[r4]
            android.graphics.drawable.Drawable r7 = r10.e0
            if (r6 == r7) goto L_0x00c8
            r0 = r2[r4]
            r10.f0 = r0
            android.widget.EditText r0 = r10.f3631i
            r1 = r2[r1]
            r4 = r2[r5]
            r2 = r2[r3]
            androidx.core.widget.i.i(r0, r1, r4, r7, r2)
            goto L_0x00eb
        L_0x00c8:
            r5 = r0
            goto L_0x00eb
        L_0x00ca:
            android.graphics.drawable.Drawable r6 = r10.e0
            if (r6 == 0) goto L_0x00ec
            android.widget.EditText r6 = r10.f3631i
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.i.a(r6)
            r4 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.e0
            if (r4 != r7) goto L_0x00e8
            android.widget.EditText r0 = r10.f3631i
            r1 = r6[r1]
            r4 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f0
            r3 = r6[r3]
            androidx.core.widget.i.i(r0, r1, r4, r7, r3)
            goto L_0x00e9
        L_0x00e8:
            r5 = r0
        L_0x00e9:
            r10.e0 = r2
        L_0x00eb:
            r0 = r5
        L_0x00ec:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.a0():boolean");
    }

    private void b0() {
        if (this.A != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3629g.getLayoutParams();
            int r2 = r();
            if (r2 != layoutParams.topMargin) {
                layoutParams.topMargin = r2;
                this.f3629g.requestLayout();
            }
        }
    }

    private void d0(boolean z2, boolean z3) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f3631i;
        boolean z4 = true;
        boolean z5 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f3631i;
        if (editText2 == null || !editText2.hasFocus()) {
            z4 = false;
        }
        boolean k2 = this.f3633k.k();
        ColorStateList colorStateList2 = this.i0;
        if (colorStateList2 != null) {
            this.s0.J(colorStateList2);
            this.s0.Q(this.i0);
        }
        if (!isEnabled) {
            this.s0.J(ColorStateList.valueOf(this.q0));
            this.s0.Q(ColorStateList.valueOf(this.q0));
        } else if (k2) {
            this.s0.J(this.f3633k.o());
        } else if (this.f3636n && (textView = this.o) != null) {
            this.s0.J(textView.getTextColors());
        } else if (z4 && (colorStateList = this.j0) != null) {
            this.s0.J(colorStateList);
        }
        if (z5 || (isEnabled() && (z4 || k2))) {
            if (z3 || this.r0) {
                v(z2);
            }
        } else if (z3 || !this.r0) {
            B(z2);
        }
    }

    private void f() {
        g.b.a.c.c0.g gVar = this.w;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(this.y);
            if (s()) {
                this.w.a0((float) this.C, this.F);
            }
            int m2 = m();
            this.G = m2;
            this.w.U(ColorStateList.valueOf(m2));
            if (this.T == 3) {
                this.f3631i.getBackground().invalidateSelf();
            }
            g();
            invalidate();
        }
    }

    private void g() {
        if (this.x != null) {
            if (t()) {
                this.x.U(ColorStateList.valueOf(this.F));
            }
            invalidate();
        }
    }

    private e getEndIconDelegate() {
        e eVar = this.U.get(this.T);
        return eVar != null ? eVar : this.U.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.g0.getVisibility() == 0) {
            return this.g0;
        }
        if (!C() || !E()) {
            return null;
        }
        return this.V;
    }

    private void h(RectF rectF) {
        float f2 = rectF.left;
        int i2 = this.z;
        rectF.left = f2 - ((float) i2);
        rectF.top -= (float) i2;
        rectF.right += (float) i2;
        rectF.bottom += (float) i2;
    }

    private void i() {
        j(this.V, this.b0, this.a0, this.d0, this.c0);
    }

    private void j(CheckableImageButton checkableImageButton, boolean z2, ColorStateList colorStateList, boolean z3, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z2 || z3)) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (z2) {
                androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            }
            if (z3) {
                androidx.core.graphics.drawable.a.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private void k() {
        j(this.L, this.N, this.M, this.P, this.O);
    }

    private void l() {
        int i2 = this.A;
        if (i2 == 0) {
            this.w = null;
            this.x = null;
        } else if (i2 == 1) {
            this.w = new g.b.a.c.c0.g(this.y);
            this.x = new g.b.a.c.c0.g();
        } else if (i2 == 2) {
            if (!this.t || (this.w instanceof c)) {
                this.w = new g.b.a.c.c0.g(this.y);
            } else {
                this.w = new c(this.y);
            }
            this.x = null;
        } else {
            throw new IllegalArgumentException(this.A + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    private int m() {
        return this.A == 1 ? g.b.a.c.s.a.e(g.b.a.c.s.a.d(this, g.b.a.c.b.colorSurface, 0), this.G) : this.G;
    }

    private Rect n(Rect rect) {
        EditText editText = this.f3631i;
        if (editText != null) {
            Rect rect2 = this.I;
            rect2.bottom = rect.bottom;
            int i2 = this.A;
            if (i2 == 1) {
                rect2.left = rect.left + editText.getCompoundPaddingLeft();
                rect2.top = rect.top + this.B;
                rect2.right = rect.right - this.f3631i.getCompoundPaddingRight();
                return rect2;
            } else if (i2 != 2) {
                rect2.left = rect.left + editText.getCompoundPaddingLeft();
                rect2.top = getPaddingTop();
                rect2.right = rect.right - this.f3631i.getCompoundPaddingRight();
                return rect2;
            } else {
                rect2.left = rect.left + editText.getPaddingLeft();
                rect2.top = rect.top - r();
                rect2.right = rect.right - this.f3631i.getPaddingRight();
                return rect2;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    private int o(Rect rect, Rect rect2, float f2) {
        if (this.A == 1) {
            return (int) (((float) rect2.top) + f2);
        }
        return rect.bottom - this.f3631i.getCompoundPaddingBottom();
    }

    private int p(Rect rect, float f2) {
        if (H()) {
            return (int) (((float) rect.centerY()) - (f2 / 2.0f));
        }
        return rect.top + this.f3631i.getCompoundPaddingTop();
    }

    private Rect q(Rect rect) {
        if (this.f3631i != null) {
            Rect rect2 = this.I;
            float t2 = this.s0.t();
            rect2.left = rect.left + this.f3631i.getCompoundPaddingLeft();
            rect2.top = p(rect, t2);
            rect2.right = rect.right - this.f3631i.getCompoundPaddingRight();
            rect2.bottom = o(rect, rect2, t2);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private int r() {
        float n2;
        if (!this.t) {
            return 0;
        }
        int i2 = this.A;
        if (i2 == 0 || i2 == 1) {
            n2 = this.s0.n();
        } else if (i2 != 2) {
            return 0;
        } else {
            n2 = this.s0.n() / 2.0f;
        }
        return (int) n2;
    }

    private boolean s() {
        return this.A == 2 && t();
    }

    private void setEditText(EditText editText) {
        if (this.f3631i == null) {
            if (this.T != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f3631i = editText;
            J();
            setTextInputAccessibilityDelegate(new e(this));
            this.s0.b0(this.f3631i.getTypeface());
            this.s0.S(this.f3631i.getTextSize());
            int gravity = this.f3631i.getGravity();
            this.s0.K((gravity & -113) | 48);
            this.s0.R(gravity);
            this.f3631i.addTextChangedListener(new a());
            if (this.i0 == null) {
                this.i0 = this.f3631i.getHintTextColors();
            }
            if (this.t) {
                if (TextUtils.isEmpty(this.u)) {
                    CharSequence hint = this.f3631i.getHint();
                    this.f3632j = hint;
                    setHint(hint);
                    this.f3631i.setHint((CharSequence) null);
                }
                this.v = true;
            }
            if (this.o != null) {
                V(this.f3631i.getText().length());
            }
            Y();
            this.f3633k.e();
            this.L.bringToFront();
            this.f3630h.bringToFront();
            this.g0.bringToFront();
            x();
            d0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z2) {
        int i2 = 0;
        this.g0.setVisibility(z2 ? 0 : 8);
        FrameLayout frameLayout = this.f3630h;
        if (z2) {
            i2 = 8;
        }
        frameLayout.setVisibility(i2);
        if (!C()) {
            a0();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.u)) {
            this.u = charSequence;
            this.s0.Z(charSequence);
            if (!this.r0) {
                K();
            }
        }
    }

    private boolean t() {
        return this.C > -1 && this.F != 0;
    }

    private void u() {
        if (w()) {
            ((c) this.w).k0();
        }
    }

    private void v(boolean z2) {
        ValueAnimator valueAnimator = this.u0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.u0.cancel();
        }
        if (!z2 || !this.t0) {
            this.s0.V(1.0f);
        } else {
            e(1.0f);
        }
        this.r0 = false;
        if (w()) {
            K();
        }
    }

    private boolean w() {
        return this.t && !TextUtils.isEmpty(this.u) && (this.w instanceof c);
    }

    private void x() {
        Iterator it = this.S.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(this);
        }
    }

    private void y(int i2) {
        Iterator it = this.W.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(this, i2);
        }
    }

    private void z(Canvas canvas) {
        g.b.a.c.c0.g gVar = this.x;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.C;
            this.x.draw(canvas);
        }
    }

    public boolean E() {
        return this.f3630h.getVisibility() == 0 && this.V.getVisibility() == 0;
    }

    public boolean F() {
        return this.f3633k.w();
    }

    /* access modifiers changed from: package-private */
    public boolean G() {
        return this.v;
    }

    public boolean I() {
        return this.L.getVisibility() == 0;
    }

    /* access modifiers changed from: package-private */
    public void Q(TextView textView, int i2) {
        boolean z2 = true;
        try {
            i.n(textView, i2);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z2 = false;
            }
        } catch (Exception unused) {
        }
        if (z2) {
            i.n(textView, k.TextAppearance_AppCompat_Caption);
            textView.setTextColor(androidx.core.content.a.c(getContext(), g.b.a.c.c.design_error));
        }
    }

    /* access modifiers changed from: package-private */
    public void V(int i2) {
        boolean z2 = this.f3636n;
        if (this.f3635m == -1) {
            this.o.setText(String.valueOf(i2));
            this.o.setContentDescription((CharSequence) null);
            this.f3636n = false;
        } else {
            if (u.l(this.o) == 1) {
                u.g0(this.o, 0);
            }
            this.f3636n = i2 > this.f3635m;
            W(getContext(), this.o, i2, this.f3635m, this.f3636n);
            if (z2 != this.f3636n) {
                X();
                if (this.f3636n) {
                    u.g0(this.o, 1);
                }
            }
            this.o.setText(getContext().getString(j.character_counter_pattern, new Object[]{Integer.valueOf(i2), Integer.valueOf(this.f3635m)}));
        }
        if (this.f3631i != null && z2 != this.f3636n) {
            c0(false);
            e0();
            Y();
        }
    }

    /* access modifiers changed from: package-private */
    public void Y() {
        Drawable background;
        TextView textView;
        EditText editText = this.f3631i;
        if (editText != null && this.A == 0 && (background = editText.getBackground()) != null) {
            if (e0.a(background)) {
                background = background.mutate();
            }
            if (this.f3633k.k()) {
                background.setColorFilter(androidx.appcompat.widget.j.e(this.f3633k.n(), PorterDuff.Mode.SRC_IN));
            } else if (!this.f3636n || (textView = this.o) == null) {
                androidx.core.graphics.drawable.a.c(background);
                this.f3631i.refreshDrawableState();
            } else {
                background.setColorFilter(androidx.appcompat.widget.j.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f3629g.addView(view, layoutParams2);
            this.f3629g.setLayoutParams(layoutParams);
            b0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i2, layoutParams);
    }

    public void c(f fVar) {
        this.S.add(fVar);
        if (this.f3631i != null) {
            fVar.a(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void c0(boolean z2) {
        d0(z2, false);
    }

    public void d(g gVar) {
        this.W.add(gVar);
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText;
        if (this.f3632j == null || (editText = this.f3631i) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        boolean z2 = this.v;
        this.v = false;
        CharSequence hint = editText.getHint();
        this.f3631i.setHint(this.f3632j);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
        } finally {
            this.f3631i.setHint(hint);
            this.v = z2;
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.w0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.w0 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        A(canvas);
        z(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.v0) {
            boolean z2 = true;
            this.v0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            com.google.android.material.internal.a aVar = this.s0;
            boolean Y = aVar != null ? aVar.Y(drawableState) | false : false;
            if (!u.L(this) || !isEnabled()) {
                z2 = false;
            }
            c0(z2);
            Y();
            e0();
            if (Y) {
                invalidate();
            }
            this.v0 = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void e(float f2) {
        if (this.s0.v() != f2) {
            if (this.u0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.u0 = valueAnimator;
                valueAnimator.setInterpolator(g.b.a.c.m.a.b);
                this.u0.setDuration(167);
                this.u0.addUpdateListener(new d());
            }
            this.u0.setFloatValues(new float[]{this.s0.v(), f2});
            this.u0.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r5.f3631i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e0() {
        /*
            r5 = this;
            g.b.a.c.c0.g r0 = r5.w
            if (r0 == 0) goto L_0x00d3
            int r0 = r5.A
            if (r0 != 0) goto L_0x000a
            goto L_0x00d3
        L_0x000a:
            boolean r0 = r5.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r5.f3631i
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            boolean r3 = r5.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r5.f3631i
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            boolean r4 = r5.isEnabled()
            if (r4 != 0) goto L_0x003f
            int r4 = r5.q0
            r5.F = r4
            goto L_0x0071
        L_0x003f:
            com.google.android.material.textfield.f r4 = r5.f3633k
            boolean r4 = r4.k()
            if (r4 == 0) goto L_0x0050
            com.google.android.material.textfield.f r4 = r5.f3633k
            int r4 = r4.n()
            r5.F = r4
            goto L_0x0071
        L_0x0050:
            boolean r4 = r5.f3636n
            if (r4 == 0) goto L_0x005f
            android.widget.TextView r4 = r5.o
            if (r4 == 0) goto L_0x005f
            int r4 = r4.getCurrentTextColor()
            r5.F = r4
            goto L_0x0071
        L_0x005f:
            if (r0 == 0) goto L_0x0066
            int r4 = r5.m0
            r5.F = r4
            goto L_0x0071
        L_0x0066:
            if (r3 == 0) goto L_0x006d
            int r4 = r5.l0
            r5.F = r4
            goto L_0x0071
        L_0x006d:
            int r4 = r5.k0
            r5.F = r4
        L_0x0071:
            com.google.android.material.textfield.f r4 = r5.f3633k
            boolean r4 = r4.k()
            if (r4 == 0) goto L_0x0085
            com.google.android.material.textfield.e r4 = r5.getEndIconDelegate()
            boolean r4 = r4.c()
            if (r4 == 0) goto L_0x0085
            r4 = 1
            goto L_0x0086
        L_0x0085:
            r4 = 0
        L_0x0086:
            r5.S(r4)
            android.graphics.drawable.Drawable r4 = r5.getErrorIconDrawable()
            if (r4 == 0) goto L_0x00a0
            com.google.android.material.textfield.f r4 = r5.f3633k
            boolean r4 = r4.v()
            if (r4 == 0) goto L_0x00a0
            com.google.android.material.textfield.f r4 = r5.f3633k
            boolean r4 = r4.k()
            if (r4 == 0) goto L_0x00a0
            r1 = 1
        L_0x00a0:
            r5.setErrorIconVisible(r1)
            if (r3 != 0) goto L_0x00a7
            if (r0 == 0) goto L_0x00b2
        L_0x00a7:
            boolean r0 = r5.isEnabled()
            if (r0 == 0) goto L_0x00b2
            int r0 = r5.E
            r5.C = r0
            goto L_0x00b6
        L_0x00b2:
            int r0 = r5.D
            r5.C = r0
        L_0x00b6:
            int r0 = r5.A
            if (r0 != r2) goto L_0x00d0
            boolean r0 = r5.isEnabled()
            if (r0 != 0) goto L_0x00c5
            int r0 = r5.o0
            r5.G = r0
            goto L_0x00d0
        L_0x00c5:
            if (r3 == 0) goto L_0x00cc
            int r0 = r5.p0
            r5.G = r0
            goto L_0x00d0
        L_0x00cc:
            int r0 = r5.n0
            r5.G = r0
        L_0x00d0:
            r5.f()
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.e0():void");
    }

    public int getBaseline() {
        EditText editText = this.f3631i;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + r();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public g.b.a.c.c0.g getBoxBackground() {
        int i2 = this.A;
        if (i2 == 1 || i2 == 2) {
            return this.w;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.G;
    }

    public int getBoxBackgroundMode() {
        return this.A;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.w.r();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.w.s();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.w.F();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.w.E();
    }

    public int getBoxStrokeColor() {
        return this.m0;
    }

    public int getCounterMaxLength() {
        return this.f3635m;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f3634l || !this.f3636n || (textView = this.o) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.r;
    }

    public ColorStateList getCounterTextColor() {
        return this.r;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.i0;
    }

    public EditText getEditText() {
        return this.f3631i;
    }

    public CharSequence getEndIconContentDescription() {
        return this.V.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.V.getDrawable();
    }

    public int getEndIconMode() {
        return this.T;
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.V;
    }

    public CharSequence getError() {
        if (this.f3633k.v()) {
            return this.f3633k.m();
        }
        return null;
    }

    public int getErrorCurrentTextColors() {
        return this.f3633k.n();
    }

    public Drawable getErrorIconDrawable() {
        return this.g0.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public final int getErrorTextCurrentColor() {
        return this.f3633k.n();
    }

    public CharSequence getHelperText() {
        if (this.f3633k.w()) {
            return this.f3633k.p();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f3633k.q();
    }

    public CharSequence getHint() {
        if (this.t) {
            return this.u;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final float getHintCollapsedTextHeight() {
        return this.s0.n();
    }

    /* access modifiers changed from: package-private */
    public final int getHintCurrentCollapsedTextColor() {
        return this.s0.p();
    }

    public ColorStateList getHintTextColor() {
        return this.j0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.V.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.V.getDrawable();
    }

    public CharSequence getStartIconContentDescription() {
        return this.L.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.L.getDrawable();
    }

    public Typeface getTypeface() {
        return this.K;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        EditText editText = this.f3631i;
        if (editText != null) {
            Rect rect = this.H;
            com.google.android.material.internal.b.a(this, editText, rect);
            T(rect);
            if (this.t) {
                this.s0.H(n(rect));
                this.s0.O(q(rect));
                this.s0.E();
                if (w() && !this.r0) {
                    K();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        boolean Z = Z();
        boolean a02 = a0();
        if (Z || a02) {
            this.f3631i.post(new c());
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        setError(hVar.f3641i);
        if (hVar.f3642j) {
            this.V.post(new b());
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.f3633k.k()) {
            hVar.f3641i = getError();
        }
        hVar.f3642j = C() && this.V.isChecked();
        return hVar;
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.G != i2) {
            this.G = i2;
            this.n0 = i2;
            f();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(androidx.core.content.a.c(getContext(), i2));
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 != this.A) {
            this.A = i2;
            if (this.f3631i != null) {
                J();
            }
        }
    }

    public void setBoxStrokeColor(int i2) {
        if (this.m0 != i2) {
            this.m0 = i2;
            e0();
        }
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f3634l != z2) {
            if (z2) {
                z zVar = new z(getContext());
                this.o = zVar;
                zVar.setId(g.b.a.c.f.textinput_counter);
                Typeface typeface = this.K;
                if (typeface != null) {
                    this.o.setTypeface(typeface);
                }
                this.o.setMaxLines(1);
                this.f3633k.d(this.o, 2);
                X();
                U();
            } else {
                this.f3633k.x(this.o, 2);
                this.o = null;
            }
            this.f3634l = z2;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.f3635m != i2) {
            if (i2 > 0) {
                this.f3635m = i2;
            } else {
                this.f3635m = -1;
            }
            if (this.f3634l) {
                U();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.p != i2) {
            this.p = i2;
            X();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.s != colorStateList) {
            this.s = colorStateList;
            X();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.q != i2) {
            this.q = i2;
            X();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.r != colorStateList) {
            this.r = colorStateList;
            X();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.i0 = colorStateList;
        this.j0 = colorStateList;
        if (this.f3631i != null) {
            c0(false);
        }
    }

    public void setEnabled(boolean z2) {
        L(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.V.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.V.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i2) {
        setEndIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setEndIconDrawable(int i2) {
        setEndIconDrawable(i2 != 0 ? e.a.k.a.a.d(getContext(), i2) : null);
    }

    public void setEndIconMode(int i2) {
        int i3 = this.T;
        this.T = i2;
        setEndIconVisible(i2 != 0);
        if (getEndIconDelegate().b(this.A)) {
            getEndIconDelegate().a();
            i();
            y(i3);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.A + " is not supported by the end icon mode " + i2);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        O(this.V, onClickListener, this.h0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.h0 = onLongClickListener;
        P(this.V, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.a0 != colorStateList) {
            this.a0 = colorStateList;
            this.b0 = true;
            i();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.c0 != mode) {
            this.c0 = mode;
            this.d0 = true;
            i();
        }
    }

    public void setEndIconVisible(boolean z2) {
        if (E() != z2) {
            this.V.setVisibility(z2 ? 0 : 4);
            a0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f3633k.v()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f3633k.J(charSequence);
        } else {
            this.f3633k.r();
        }
    }

    public void setErrorEnabled(boolean z2) {
        this.f3633k.z(z2);
    }

    public void setErrorIconDrawable(int i2) {
        setErrorIconDrawable(i2 != 0 ? e.a.k.a.a.d(getContext(), i2) : null);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        Drawable drawable = this.g0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        }
        if (this.g0.getDrawable() != drawable) {
            this.g0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.g0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            androidx.core.graphics.drawable.a.p(drawable, mode);
        }
        if (this.g0.getDrawable() != drawable) {
            this.g0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i2) {
        this.f3633k.A(i2);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f3633k.B(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!F()) {
                setHelperTextEnabled(true);
            }
            this.f3633k.K(charSequence);
        } else if (F()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f3633k.E(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        this.f3633k.D(z2);
    }

    public void setHelperTextTextAppearance(int i2) {
        this.f3633k.C(i2);
    }

    public void setHint(CharSequence charSequence) {
        if (this.t) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.t0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.t) {
            this.t = z2;
            if (!z2) {
                this.v = false;
                if (!TextUtils.isEmpty(this.u) && TextUtils.isEmpty(this.f3631i.getHint())) {
                    this.f3631i.setHint(this.u);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f3631i.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.u)) {
                        setHint(hint);
                    }
                    this.f3631i.setHint((CharSequence) null);
                }
                this.v = true;
            }
            if (this.f3631i != null) {
                b0();
            }
        }
    }

    public void setHintTextAppearance(int i2) {
        this.s0.I(i2);
        this.j0 = this.s0.l();
        if (this.f3631i != null) {
            c0(false);
            b0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.j0 != colorStateList) {
            if (this.i0 == null) {
                this.s0.J(colorStateList);
            }
            this.j0 = colorStateList;
            if (this.f3631i != null) {
                c0(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        setPasswordVisibilityToggleContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        setPasswordVisibilityToggleDrawable(i2 != 0 ? e.a.k.a.a.d(getContext(), i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        if (z2 && this.T != 1) {
            setEndIconMode(1);
        } else if (!z2) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.a0 = colorStateList;
        this.b0 = true;
        i();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.c0 = mode;
        this.d0 = true;
        i();
    }

    public void setStartIconCheckable(boolean z2) {
        this.L.setCheckable(z2);
    }

    public void setStartIconContentDescription(int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconDrawable(int i2) {
        setStartIconDrawable(i2 != 0 ? e.a.k.a.a.d(getContext(), i2) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        O(this.L, onClickListener, this.R);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.R = onLongClickListener;
        P(this.L, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.M != colorStateList) {
            this.M = colorStateList;
            this.N = true;
            k();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.O != mode) {
            this.O = mode;
            this.P = true;
            k();
        }
    }

    public void setStartIconVisible(boolean z2) {
        if (I() != z2) {
            this.L.setVisibility(z2 ? 0 : 8);
            a0();
        }
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f3631i;
        if (editText != null) {
            u.e0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.K) {
            this.K = typeface;
            this.s0.b0(typeface);
            this.f3633k.G(typeface);
            TextView textView = this.o;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r1 = x0
            r2 = r17
            android.content.Context r1 = com.google.android.material.internal.i.f(r2, r7, r8, r1)
            r0.<init>(r1, r7, r8)
            com.google.android.material.textfield.f r1 = new com.google.android.material.textfield.f
            r1.<init>(r0)
            r0.f3633k = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.H = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.I = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.J = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.S = r1
            r9 = 0
            r0.T = r9
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.U = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.W = r1
            com.google.android.material.internal.a r1 = new com.google.android.material.internal.a
            r1.<init>(r0)
            r0.s0 = r1
            android.content.Context r10 = r16.getContext()
            r11 = 1
            r0.setOrientation(r11)
            r0.setWillNotDraw(r9)
            r0.setAddStatesFromChildren(r11)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r10)
            r0.f3629g = r1
            r1.setAddStatesFromChildren(r11)
            android.widget.FrameLayout r1 = r0.f3629g
            r0.addView(r1)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r10)
            r0.f3630h = r1
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -2
            r4 = 8388629(0x800015, float:1.1754973E-38)
            r2.<init>(r3, r3, r4)
            r1.setLayoutParams(r2)
            android.widget.FrameLayout r1 = r0.f3629g
            android.widget.FrameLayout r2 = r0.f3630h
            r1.addView(r2)
            com.google.android.material.internal.a r1 = r0.s0
            android.animation.TimeInterpolator r2 = g.b.a.c.m.a.a
            r1.a0(r2)
            com.google.android.material.internal.a r1 = r0.s0
            android.animation.TimeInterpolator r2 = g.b.a.c.m.a.a
            r1.X(r2)
            com.google.android.material.internal.a r1 = r0.s0
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.K(r2)
            int[] r3 = g.b.a.c.l.TextInputLayout
            int r5 = x0
            r1 = 5
            int[] r6 = new int[r1]
            int r1 = g.b.a.c.l.TextInputLayout_counterTextAppearance
            r6[r9] = r1
            int r1 = g.b.a.c.l.TextInputLayout_counterOverflowTextAppearance
            r6[r11] = r1
            int r1 = g.b.a.c.l.TextInputLayout_errorTextAppearance
            r12 = 2
            r6[r12] = r1
            int r1 = g.b.a.c.l.TextInputLayout_helperTextTextAppearance
            r13 = 3
            r6[r13] = r1
            int r1 = g.b.a.c.l.TextInputLayout_hintTextAppearance
            r2 = 4
            r6[r2] = r1
            r1 = r10
            r2 = r18
            r4 = r19
            androidx.appcompat.widget.w0 r1 = com.google.android.material.internal.i.l(r1, r2, r3, r4, r5, r6)
            int r2 = g.b.a.c.l.TextInputLayout_hintEnabled
            boolean r2 = r1.a(r2, r11)
            r0.t = r2
            int r2 = g.b.a.c.l.TextInputLayout_android_hint
            java.lang.CharSequence r2 = r1.p(r2)
            r0.setHint(r2)
            int r2 = g.b.a.c.l.TextInputLayout_hintAnimationEnabled
            boolean r2 = r1.a(r2, r11)
            r0.t0 = r2
            int r2 = x0
            g.b.a.c.c0.k$b r2 = g.b.a.c.c0.k.e(r10, r7, r8, r2)
            g.b.a.c.c0.k r2 = r2.m()
            r0.y = r2
            android.content.res.Resources r2 = r10.getResources()
            int r3 = g.b.a.c.d.mtrl_textinput_box_label_cutout_padding
            int r2 = r2.getDimensionPixelOffset(r3)
            r0.z = r2
            int r2 = g.b.a.c.l.TextInputLayout_boxCollapsedPaddingTop
            int r2 = r1.e(r2, r9)
            r0.B = r2
            int r2 = g.b.a.c.l.TextInputLayout_boxStrokeWidth
            android.content.res.Resources r3 = r10.getResources()
            int r4 = g.b.a.c.d.mtrl_textinput_box_stroke_width_default
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.f(r2, r3)
            r0.D = r2
            int r2 = g.b.a.c.l.TextInputLayout_boxStrokeWidthFocused
            android.content.res.Resources r3 = r10.getResources()
            int r4 = g.b.a.c.d.mtrl_textinput_box_stroke_width_focused
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.f(r2, r3)
            r0.E = r2
            int r2 = r0.D
            r0.C = r2
            int r2 = g.b.a.c.l.TextInputLayout_boxCornerRadiusTopStart
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r1.d(r2, r3)
            int r4 = g.b.a.c.l.TextInputLayout_boxCornerRadiusTopEnd
            float r4 = r1.d(r4, r3)
            int r5 = g.b.a.c.l.TextInputLayout_boxCornerRadiusBottomEnd
            float r5 = r1.d(r5, r3)
            int r6 = g.b.a.c.l.TextInputLayout_boxCornerRadiusBottomStart
            float r3 = r1.d(r6, r3)
            g.b.a.c.c0.k r6 = r0.y
            g.b.a.c.c0.k$b r6 = r6.v()
            r7 = 0
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 < 0) goto L_0x0149
            r6.z(r2)
        L_0x0149:
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0150
            r6.D(r4)
        L_0x0150:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0157
            r6.v(r5)
        L_0x0157:
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x015e
            r6.r(r3)
        L_0x015e:
            g.b.a.c.c0.k r2 = r6.m()
            r0.y = r2
            int r2 = g.b.a.c.l.TextInputLayout_boxBackgroundColor
            android.content.res.ColorStateList r2 = g.b.a.c.z.c.b(r10, r1, r2)
            r3 = 16843623(0x1010367, float:2.3696E-38)
            r4 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r5 = -1
            if (r2 == 0) goto L_0x01b1
            int r6 = r2.getDefaultColor()
            r0.n0 = r6
            r0.G = r6
            boolean r6 = r2.isStateful()
            if (r6 == 0) goto L_0x0196
            int[] r6 = new int[r11]
            r6[r9] = r4
            int r6 = r2.getColorForState(r6, r5)
            r0.o0 = r6
            int[] r6 = new int[r11]
            r6[r9] = r3
            int r2 = r2.getColorForState(r6, r5)
            r0.p0 = r2
            goto L_0x01b9
        L_0x0196:
            int r2 = g.b.a.c.c.mtrl_filled_background_color
            android.content.res.ColorStateList r2 = e.a.k.a.a.c(r10, r2)
            int[] r6 = new int[r11]
            r6[r9] = r4
            int r6 = r2.getColorForState(r6, r5)
            r0.o0 = r6
            int[] r6 = new int[r11]
            r6[r9] = r3
            int r2 = r2.getColorForState(r6, r5)
            r0.p0 = r2
            goto L_0x01b9
        L_0x01b1:
            r0.G = r9
            r0.n0 = r9
            r0.o0 = r9
            r0.p0 = r9
        L_0x01b9:
            int r2 = g.b.a.c.l.TextInputLayout_android_textColorHint
            boolean r2 = r1.r(r2)
            if (r2 == 0) goto L_0x01cb
            int r2 = g.b.a.c.l.TextInputLayout_android_textColorHint
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.j0 = r2
            r0.i0 = r2
        L_0x01cb:
            int r2 = g.b.a.c.l.TextInputLayout_boxStrokeColor
            android.content.res.ColorStateList r2 = g.b.a.c.z.c.b(r10, r1, r2)
            if (r2 == 0) goto L_0x0201
            boolean r6 = r2.isStateful()
            if (r6 == 0) goto L_0x0201
            int r6 = r2.getDefaultColor()
            r0.k0 = r6
            int[] r6 = new int[r11]
            r6[r9] = r4
            int r4 = r2.getColorForState(r6, r5)
            r0.q0 = r4
            int[] r4 = new int[r11]
            r4[r9] = r3
            int r3 = r2.getColorForState(r4, r5)
            r0.l0 = r3
            int[] r3 = new int[r11]
            r4 = 16842908(0x101009c, float:2.3693995E-38)
            r3[r9] = r4
            int r2 = r2.getColorForState(r3, r5)
            r0.m0 = r2
            goto L_0x0221
        L_0x0201:
            int r2 = g.b.a.c.l.TextInputLayout_boxStrokeColor
            int r2 = r1.b(r2, r9)
            r0.m0 = r2
            int r2 = g.b.a.c.c.mtrl_textinput_default_box_stroke_color
            int r2 = androidx.core.content.a.c(r10, r2)
            r0.k0 = r2
            int r2 = g.b.a.c.c.mtrl_textinput_disabled_color
            int r2 = androidx.core.content.a.c(r10, r2)
            r0.q0 = r2
            int r2 = g.b.a.c.c.mtrl_textinput_hovered_box_stroke_color
            int r2 = androidx.core.content.a.c(r10, r2)
            r0.l0 = r2
        L_0x0221:
            int r2 = g.b.a.c.l.TextInputLayout_hintTextAppearance
            int r2 = r1.n(r2, r5)
            if (r2 == r5) goto L_0x0232
            int r2 = g.b.a.c.l.TextInputLayout_hintTextAppearance
            int r2 = r1.n(r2, r9)
            r0.setHintTextAppearance(r2)
        L_0x0232:
            int r2 = g.b.a.c.l.TextInputLayout_errorTextAppearance
            int r2 = r1.n(r2, r9)
            int r3 = g.b.a.c.l.TextInputLayout_errorEnabled
            boolean r3 = r1.a(r3, r9)
            android.content.Context r4 = r16.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            int r6 = g.b.a.c.h.design_text_input_end_icon
            android.widget.FrameLayout r7 = r0.f3629g
            android.view.View r4 = r4.inflate(r6, r7, r9)
            com.google.android.material.internal.CheckableImageButton r4 = (com.google.android.material.internal.CheckableImageButton) r4
            r0.g0 = r4
            android.widget.FrameLayout r6 = r0.f3629g
            r6.addView(r4)
            com.google.android.material.internal.CheckableImageButton r4 = r0.g0
            r6 = 8
            r4.setVisibility(r6)
            int r4 = g.b.a.c.l.TextInputLayout_errorIconDrawable
            boolean r4 = r1.r(r4)
            if (r4 == 0) goto L_0x026f
            int r4 = g.b.a.c.l.TextInputLayout_errorIconDrawable
            android.graphics.drawable.Drawable r4 = r1.g(r4)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r4)
        L_0x026f:
            int r4 = g.b.a.c.l.TextInputLayout_errorIconTint
            boolean r4 = r1.r(r4)
            if (r4 == 0) goto L_0x0280
            int r4 = g.b.a.c.l.TextInputLayout_errorIconTint
            android.content.res.ColorStateList r4 = g.b.a.c.z.c.b(r10, r1, r4)
            r0.setErrorIconTintList(r4)
        L_0x0280:
            int r4 = g.b.a.c.l.TextInputLayout_errorIconTintMode
            boolean r4 = r1.r(r4)
            r7 = 0
            if (r4 == 0) goto L_0x0296
            int r4 = g.b.a.c.l.TextInputLayout_errorIconTintMode
            int r4 = r1.k(r4, r5)
            android.graphics.PorterDuff$Mode r4 = com.google.android.material.internal.j.d(r4, r7)
            r0.setErrorIconTintMode(r4)
        L_0x0296:
            com.google.android.material.internal.CheckableImageButton r4 = r0.g0
            android.content.res.Resources r8 = r16.getResources()
            int r14 = g.b.a.c.j.error_icon_content_description
            java.lang.CharSequence r8 = r8.getText(r14)
            r4.setContentDescription(r8)
            com.google.android.material.internal.CheckableImageButton r4 = r0.g0
            e.h.k.u.o0(r4, r12)
            com.google.android.material.internal.CheckableImageButton r4 = r0.g0
            r4.setClickable(r9)
            com.google.android.material.internal.CheckableImageButton r4 = r0.g0
            r4.setPressable(r9)
            com.google.android.material.internal.CheckableImageButton r4 = r0.g0
            r4.setFocusable(r9)
            int r4 = g.b.a.c.l.TextInputLayout_helperTextTextAppearance
            int r4 = r1.n(r4, r9)
            int r8 = g.b.a.c.l.TextInputLayout_helperTextEnabled
            boolean r8 = r1.a(r8, r9)
            int r14 = g.b.a.c.l.TextInputLayout_helperText
            java.lang.CharSequence r14 = r1.p(r14)
            int r15 = g.b.a.c.l.TextInputLayout_counterEnabled
            boolean r15 = r1.a(r15, r9)
            int r13 = g.b.a.c.l.TextInputLayout_counterMaxLength
            int r13 = r1.k(r13, r5)
            r0.setCounterMaxLength(r13)
            int r13 = g.b.a.c.l.TextInputLayout_counterTextAppearance
            int r13 = r1.n(r13, r9)
            r0.q = r13
            int r13 = g.b.a.c.l.TextInputLayout_counterOverflowTextAppearance
            int r13 = r1.n(r13, r9)
            r0.p = r13
            android.content.Context r13 = r16.getContext()
            android.view.LayoutInflater r13 = android.view.LayoutInflater.from(r13)
            int r12 = g.b.a.c.h.design_text_input_start_icon
            android.widget.FrameLayout r5 = r0.f3629g
            android.view.View r5 = r13.inflate(r12, r5, r9)
            com.google.android.material.internal.CheckableImageButton r5 = (com.google.android.material.internal.CheckableImageButton) r5
            r0.L = r5
            android.widget.FrameLayout r12 = r0.f3629g
            r12.addView(r5)
            com.google.android.material.internal.CheckableImageButton r5 = r0.L
            r5.setVisibility(r6)
            r0.setStartIconOnClickListener(r7)
            r0.setStartIconOnLongClickListener(r7)
            int r5 = g.b.a.c.l.TextInputLayout_startIconDrawable
            boolean r5 = r1.r(r5)
            if (r5 == 0) goto L_0x0339
            int r5 = g.b.a.c.l.TextInputLayout_startIconDrawable
            android.graphics.drawable.Drawable r5 = r1.g(r5)
            r0.setStartIconDrawable((android.graphics.drawable.Drawable) r5)
            int r5 = g.b.a.c.l.TextInputLayout_startIconContentDescription
            boolean r5 = r1.r(r5)
            if (r5 == 0) goto L_0x0330
            int r5 = g.b.a.c.l.TextInputLayout_startIconContentDescription
            java.lang.CharSequence r5 = r1.p(r5)
            r0.setStartIconContentDescription((java.lang.CharSequence) r5)
        L_0x0330:
            int r5 = g.b.a.c.l.TextInputLayout_startIconCheckable
            boolean r5 = r1.a(r5, r11)
            r0.setStartIconCheckable(r5)
        L_0x0339:
            int r5 = g.b.a.c.l.TextInputLayout_startIconTint
            boolean r5 = r1.r(r5)
            if (r5 == 0) goto L_0x034a
            int r5 = g.b.a.c.l.TextInputLayout_startIconTint
            android.content.res.ColorStateList r5 = g.b.a.c.z.c.b(r10, r1, r5)
            r0.setStartIconTintList(r5)
        L_0x034a:
            int r5 = g.b.a.c.l.TextInputLayout_startIconTintMode
            boolean r5 = r1.r(r5)
            if (r5 == 0) goto L_0x0360
            int r5 = g.b.a.c.l.TextInputLayout_startIconTintMode
            r12 = -1
            int r5 = r1.k(r5, r12)
            android.graphics.PorterDuff$Mode r5 = com.google.android.material.internal.j.d(r5, r7)
            r0.setStartIconTintMode(r5)
        L_0x0360:
            r0.setHelperTextEnabled(r8)
            r0.setHelperText(r14)
            r0.setHelperTextTextAppearance(r4)
            r0.setErrorEnabled(r3)
            r0.setErrorTextAppearance(r2)
            int r2 = r0.q
            r0.setCounterTextAppearance(r2)
            int r2 = r0.p
            r0.setCounterOverflowTextAppearance(r2)
            int r2 = g.b.a.c.l.TextInputLayout_errorTextColor
            boolean r2 = r1.r(r2)
            if (r2 == 0) goto L_0x038a
            int r2 = g.b.a.c.l.TextInputLayout_errorTextColor
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setErrorTextColor(r2)
        L_0x038a:
            int r2 = g.b.a.c.l.TextInputLayout_helperTextTextColor
            boolean r2 = r1.r(r2)
            if (r2 == 0) goto L_0x039b
            int r2 = g.b.a.c.l.TextInputLayout_helperTextTextColor
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setHelperTextColor(r2)
        L_0x039b:
            int r2 = g.b.a.c.l.TextInputLayout_hintTextColor
            boolean r2 = r1.r(r2)
            if (r2 == 0) goto L_0x03ac
            int r2 = g.b.a.c.l.TextInputLayout_hintTextColor
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setHintTextColor(r2)
        L_0x03ac:
            int r2 = g.b.a.c.l.TextInputLayout_counterTextColor
            boolean r2 = r1.r(r2)
            if (r2 == 0) goto L_0x03bd
            int r2 = g.b.a.c.l.TextInputLayout_counterTextColor
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setCounterTextColor(r2)
        L_0x03bd:
            int r2 = g.b.a.c.l.TextInputLayout_counterOverflowTextColor
            boolean r2 = r1.r(r2)
            if (r2 == 0) goto L_0x03ce
            int r2 = g.b.a.c.l.TextInputLayout_counterOverflowTextColor
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setCounterOverflowTextColor(r2)
        L_0x03ce:
            r0.setCounterEnabled(r15)
            int r2 = g.b.a.c.l.TextInputLayout_boxBackgroundMode
            int r2 = r1.k(r2, r9)
            r0.setBoxBackgroundMode(r2)
            android.content.Context r2 = r16.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            int r3 = g.b.a.c.h.design_text_input_end_icon
            android.widget.FrameLayout r4 = r0.f3630h
            android.view.View r2 = r2.inflate(r3, r4, r9)
            com.google.android.material.internal.CheckableImageButton r2 = (com.google.android.material.internal.CheckableImageButton) r2
            r0.V = r2
            android.widget.FrameLayout r3 = r0.f3630h
            r3.addView(r2)
            com.google.android.material.internal.CheckableImageButton r2 = r0.V
            r2.setVisibility(r6)
            android.util.SparseArray<com.google.android.material.textfield.e> r2 = r0.U
            com.google.android.material.textfield.b r3 = new com.google.android.material.textfield.b
            r3.<init>(r0)
            r4 = -1
            r2.append(r4, r3)
            android.util.SparseArray<com.google.android.material.textfield.e> r2 = r0.U
            com.google.android.material.textfield.g r3 = new com.google.android.material.textfield.g
            r3.<init>(r0)
            r2.append(r9, r3)
            android.util.SparseArray<com.google.android.material.textfield.e> r2 = r0.U
            com.google.android.material.textfield.h r3 = new com.google.android.material.textfield.h
            r3.<init>(r0)
            r2.append(r11, r3)
            android.util.SparseArray<com.google.android.material.textfield.e> r2 = r0.U
            com.google.android.material.textfield.a r3 = new com.google.android.material.textfield.a
            r3.<init>(r0)
            r4 = 2
            r2.append(r4, r3)
            android.util.SparseArray<com.google.android.material.textfield.e> r2 = r0.U
            com.google.android.material.textfield.d r3 = new com.google.android.material.textfield.d
            r3.<init>(r0)
            r4 = 3
            r2.append(r4, r3)
            int r2 = g.b.a.c.l.TextInputLayout_endIconMode
            boolean r2 = r1.r(r2)
            if (r2 == 0) goto L_0x046a
            int r2 = g.b.a.c.l.TextInputLayout_endIconMode
            int r2 = r1.k(r2, r9)
            r0.setEndIconMode(r2)
            int r2 = g.b.a.c.l.TextInputLayout_endIconDrawable
            boolean r2 = r1.r(r2)
            if (r2 == 0) goto L_0x044f
            int r2 = g.b.a.c.l.TextInputLayout_endIconDrawable
            android.graphics.drawable.Drawable r2 = r1.g(r2)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r2)
        L_0x044f:
            int r2 = g.b.a.c.l.TextInputLayout_endIconContentDescription
            boolean r2 = r1.r(r2)
            if (r2 == 0) goto L_0x0460
            int r2 = g.b.a.c.l.TextInputLayout_endIconContentDescription
            java.lang.CharSequence r2 = r1.p(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
        L_0x0460:
            int r2 = g.b.a.c.l.TextInputLayout_endIconCheckable
            boolean r2 = r1.a(r2, r11)
            r0.setEndIconCheckable(r2)
            goto L_0x04b4
        L_0x046a:
            int r2 = g.b.a.c.l.TextInputLayout_passwordToggleEnabled
            boolean r2 = r1.r(r2)
            if (r2 == 0) goto L_0x04b4
            int r2 = g.b.a.c.l.TextInputLayout_passwordToggleEnabled
            boolean r2 = r1.a(r2, r9)
            r0.setEndIconMode(r2)
            int r2 = g.b.a.c.l.TextInputLayout_passwordToggleDrawable
            android.graphics.drawable.Drawable r2 = r1.g(r2)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r2)
            int r2 = g.b.a.c.l.TextInputLayout_passwordToggleContentDescription
            java.lang.CharSequence r2 = r1.p(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
            int r2 = g.b.a.c.l.TextInputLayout_passwordToggleTint
            boolean r2 = r1.r(r2)
            if (r2 == 0) goto L_0x049e
            int r2 = g.b.a.c.l.TextInputLayout_passwordToggleTint
            android.content.res.ColorStateList r2 = g.b.a.c.z.c.b(r10, r1, r2)
            r0.setEndIconTintList(r2)
        L_0x049e:
            int r2 = g.b.a.c.l.TextInputLayout_passwordToggleTintMode
            boolean r2 = r1.r(r2)
            if (r2 == 0) goto L_0x04b4
            int r2 = g.b.a.c.l.TextInputLayout_passwordToggleTintMode
            r3 = -1
            int r2 = r1.k(r2, r3)
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.j.d(r2, r7)
            r0.setEndIconTintMode(r2)
        L_0x04b4:
            int r2 = g.b.a.c.l.TextInputLayout_passwordToggleEnabled
            boolean r2 = r1.r(r2)
            if (r2 != 0) goto L_0x04e3
            int r2 = g.b.a.c.l.TextInputLayout_endIconTint
            boolean r2 = r1.r(r2)
            if (r2 == 0) goto L_0x04cd
            int r2 = g.b.a.c.l.TextInputLayout_endIconTint
            android.content.res.ColorStateList r2 = g.b.a.c.z.c.b(r10, r1, r2)
            r0.setEndIconTintList(r2)
        L_0x04cd:
            int r2 = g.b.a.c.l.TextInputLayout_endIconTintMode
            boolean r2 = r1.r(r2)
            if (r2 == 0) goto L_0x04e3
            int r2 = g.b.a.c.l.TextInputLayout_endIconTintMode
            r3 = -1
            int r2 = r1.k(r2, r3)
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.j.d(r2, r7)
            r0.setEndIconTintMode(r2)
        L_0x04e3:
            r1.v()
            r1 = 2
            e.h.k.u.o0(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.V.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.V.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.g0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f3633k.v());
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.L.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.L.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            k();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        setStartIconContentDescription((CharSequence) null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.V.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.V.setImageDrawable(drawable);
    }
}
