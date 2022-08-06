package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import e.h.k.u;
import g.b.a.c.c0.k;
import g.b.a.c.j;

/* compiled from: DropdownMenuEndIconDelegate */
class d extends e {
    private static final boolean o = (Build.VERSION.SDK_INT >= 21);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final TextWatcher f3649d = new a();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final TextInputLayout.e f3650e = new b(this.a);

    /* renamed from: f  reason: collision with root package name */
    private final TextInputLayout.f f3651f = new c();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f3652g = false;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f3653h = false;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public long f3654i = Long.MAX_VALUE;

    /* renamed from: j  reason: collision with root package name */
    private StateListDrawable f3655j;

    /* renamed from: k  reason: collision with root package name */
    private g.b.a.c.c0.g f3656k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public AccessibilityManager f3657l;

    /* renamed from: m  reason: collision with root package name */
    private ValueAnimator f3658m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public ValueAnimator f3659n;

    /* compiled from: DropdownMenuEndIconDelegate */
    class a implements TextWatcher {

        /* renamed from: com.google.android.material.textfield.d$a$a  reason: collision with other inner class name */
        /* compiled from: DropdownMenuEndIconDelegate */
        class C0080a implements Runnable {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f3661g;

            C0080a(AutoCompleteTextView autoCompleteTextView) {
                this.f3661g = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.f3661g.isPopupShowing();
                d.this.z(isPopupShowing);
                boolean unused = d.this.f3652g = isPopupShowing;
            }
        }

        a() {
        }

        public void afterTextChanged(Editable editable) {
            d dVar = d.this;
            AutoCompleteTextView d2 = dVar.u(dVar.a.getEditText());
            d2.post(new C0080a(d2));
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate */
    class b extends TextInputLayout.e {
        b(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        public void g(View view, e.h.k.d0.c cVar) {
            super.g(view, cVar);
            cVar.W(Spinner.class.getName());
            if (cVar.J()) {
                cVar.h0((CharSequence) null);
            }
        }

        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            d dVar = d.this;
            AutoCompleteTextView d2 = dVar.u(dVar.a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && d.this.f3657l.isTouchExplorationEnabled()) {
                d.this.C(d2);
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate */
    class c implements TextInputLayout.f {
        c() {
        }

        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView d2 = d.this.u(textInputLayout.getEditText());
            d.this.A(d2);
            d.this.r(d2);
            d.this.B(d2);
            d2.setThreshold(0);
            d2.removeTextChangedListener(d.this.f3649d);
            d2.addTextChangedListener(d.this.f3649d);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(d.this.f3650e);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d  reason: collision with other inner class name */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C0081d implements View.OnClickListener {
        C0081d() {
        }

        public void onClick(View view) {
            d.this.C((AutoCompleteTextView) d.this.a.getEditText());
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate */
    class e implements View.OnTouchListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ AutoCompleteTextView f3665g;

        e(AutoCompleteTextView autoCompleteTextView) {
            this.f3665g = autoCompleteTextView;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (d.this.y()) {
                    boolean unused = d.this.f3652g = false;
                }
                d.this.C(this.f3665g);
                view.performClick();
            }
            return false;
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate */
    class f implements View.OnFocusChangeListener {
        f() {
        }

        public void onFocusChange(View view, boolean z) {
            d.this.a.setEndIconActivated(z);
            if (!z) {
                d.this.z(false);
                boolean unused = d.this.f3652g = false;
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate */
    class g implements AutoCompleteTextView.OnDismissListener {
        g() {
        }

        public void onDismiss() {
            boolean unused = d.this.f3652g = true;
            long unused2 = d.this.f3654i = System.currentTimeMillis();
            d.this.z(false);
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate */
    class h extends AnimatorListenerAdapter {
        h() {
        }

        public void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            dVar.c.setChecked(dVar.f3653h);
            d.this.f3659n.start();
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate */
    class i implements ValueAnimator.AnimatorUpdateListener {
        i() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    d(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    public void A(AutoCompleteTextView autoCompleteTextView) {
        if (o) {
            int boxBackgroundMode = this.a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f3656k);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f3655j);
            }
        }
    }

    /* access modifiers changed from: private */
    public void B(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new e(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(new f());
        if (o) {
            autoCompleteTextView.setOnDismissListener(new g());
        }
    }

    /* access modifiers changed from: private */
    public void C(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (y()) {
                this.f3652g = false;
            }
            if (!this.f3652g) {
                if (o) {
                    z(!this.f3653h);
                } else {
                    this.f3653h = !this.f3653h;
                    this.c.toggle();
                }
                if (this.f3653h) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            this.f3652g = false;
        }
    }

    /* access modifiers changed from: private */
    public void r(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() == null) {
            int boxBackgroundMode = this.a.getBoxBackgroundMode();
            g.b.a.c.c0.g boxBackground = this.a.getBoxBackground();
            int c2 = g.b.a.c.s.a.c(autoCompleteTextView, g.b.a.c.b.colorControlHighlight);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                t(autoCompleteTextView, c2, iArr, boxBackground);
            } else if (boxBackgroundMode == 1) {
                s(autoCompleteTextView, c2, iArr, boxBackground);
            }
        }
    }

    private void s(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, g.b.a.c.c0.g gVar) {
        int boxBackgroundColor = this.a.getBoxBackgroundColor();
        int[] iArr2 = {g.b.a.c.s.a.f(i2, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (o) {
            u.h0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        g.b.a.c.c0.g gVar2 = new g.b.a.c.c0.g(gVar.B());
        gVar2.U(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int C = u.C(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int B = u.B(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        u.h0(autoCompleteTextView, layerDrawable);
        u.r0(autoCompleteTextView, C, paddingTop, B, paddingBottom);
    }

    private void t(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, g.b.a.c.c0.g gVar) {
        LayerDrawable layerDrawable;
        int c2 = g.b.a.c.s.a.c(autoCompleteTextView, g.b.a.c.b.colorSurface);
        g.b.a.c.c0.g gVar2 = new g.b.a.c.c0.g(gVar.B());
        int f2 = g.b.a.c.s.a.f(i2, c2, 0.1f);
        gVar2.U(new ColorStateList(iArr, new int[]{f2, 0}));
        if (o) {
            gVar2.setTint(c2);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{f2, c2});
            g.b.a.c.c0.g gVar3 = new g.b.a.c.c0.g(gVar.B());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        u.h0(autoCompleteTextView, layerDrawable);
    }

    /* access modifiers changed from: private */
    public AutoCompleteTextView u(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator v(int i2, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(g.b.a.c.m.a.a);
        ofFloat.setDuration((long) i2);
        ofFloat.addUpdateListener(new i());
        return ofFloat;
    }

    private g.b.a.c.c0.g w(float f2, float f3, float f4, int i2) {
        k.b a2 = k.a();
        a2.z(f2);
        a2.D(f2);
        a2.r(f3);
        a2.v(f3);
        k m2 = a2.m();
        g.b.a.c.c0.g l2 = g.b.a.c.c0.g.l(this.b, f4);
        l2.setShapeAppearanceModel(m2);
        l2.W(0, i2, 0, i2);
        return l2;
    }

    private void x() {
        this.f3659n = v(67, 0.0f, 1.0f);
        ValueAnimator v = v(50, 1.0f, 0.0f);
        this.f3658m = v;
        v.addListener(new h());
    }

    /* access modifiers changed from: private */
    public boolean y() {
        long currentTimeMillis = System.currentTimeMillis() - this.f3654i;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* access modifiers changed from: private */
    public void z(boolean z) {
        if (this.f3653h != z) {
            this.f3653h = z;
            this.f3659n.cancel();
            this.f3658m.start();
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        float dimensionPixelOffset = (float) this.b.getResources().getDimensionPixelOffset(g.b.a.c.d.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.b.getResources().getDimensionPixelOffset(g.b.a.c.d.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.b.getResources().getDimensionPixelOffset(g.b.a.c.d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        g.b.a.c.c0.g w = w(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        g.b.a.c.c0.g w2 = w(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f3656k = w;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f3655j = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, w);
        this.f3655j.addState(new int[0], w2);
        this.a.setEndIconDrawable(e.a.k.a.a.d(this.b, o ? g.b.a.c.e.mtrl_dropdown_arrow : g.b.a.c.e.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(j.exposed_dropdown_menu_content_description));
        this.a.setEndIconOnClickListener(new C0081d());
        this.a.c(this.f3651f);
        x();
        u.o0(this.c, 2);
        this.f3657l = (AccessibilityManager) this.b.getSystemService("accessibility");
    }

    /* access modifiers changed from: package-private */
    public boolean b(int i2) {
        return i2 != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return true;
    }
}
