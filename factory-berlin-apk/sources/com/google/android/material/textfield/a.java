package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import g.b.a.c.j;

/* compiled from: ClearTextEndIconDelegate */
class a extends e {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final TextWatcher f3643d = new C0079a();

    /* renamed from: e  reason: collision with root package name */
    private final TextInputLayout.f f3644e = new b();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public AnimatorSet f3645f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public ValueAnimator f3646g;

    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    /* compiled from: ClearTextEndIconDelegate */
    class C0079a implements TextWatcher {
        C0079a() {
        }

        public void afterTextChanged(Editable editable) {
            if (!a.j(editable)) {
                a.this.f3645f.cancel();
                a.this.f3646g.start();
            } else if (!a.this.a.E()) {
                a.this.f3646g.cancel();
                a.this.f3645f.start();
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* compiled from: ClearTextEndIconDelegate */
    class b implements TextInputLayout.f {
        b() {
        }

        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.j(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.removeTextChangedListener(a.this.f3643d);
            editText.addTextChangedListener(a.this.f3643d);
        }
    }

    /* compiled from: ClearTextEndIconDelegate */
    class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            a.this.a.getEditText().setText((CharSequence) null);
        }
    }

    /* compiled from: ClearTextEndIconDelegate */
    class d extends AnimatorListenerAdapter {
        d() {
        }

        public void onAnimationStart(Animator animator) {
            a.this.a.setEndIconVisible(true);
        }
    }

    /* compiled from: ClearTextEndIconDelegate */
    class e extends AnimatorListenerAdapter {
        e() {
        }

        public void onAnimationEnd(Animator animator) {
            a.this.a.setEndIconVisible(false);
        }
    }

    /* compiled from: ClearTextEndIconDelegate */
    class f implements ValueAnimator.AnimatorUpdateListener {
        f() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: ClearTextEndIconDelegate */
    class g implements ValueAnimator.AnimatorUpdateListener {
        g() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.c.setScaleX(floatValue);
            a.this.c.setScaleY(floatValue);
        }
    }

    a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    private ValueAnimator h(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(g.b.a.c.m.a.a);
        ofFloat.setDuration(100);
        ofFloat.addUpdateListener(new f());
        return ofFloat;
    }

    private ValueAnimator i() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(g.b.a.c.m.a.f9514d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new g());
        return ofFloat;
    }

    /* access modifiers changed from: private */
    public static boolean j(Editable editable) {
        return editable.length() > 0;
    }

    private void k() {
        ValueAnimator i2 = i();
        ValueAnimator h2 = h(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f3645f = animatorSet;
        animatorSet.playTogether(new Animator[]{i2, h2});
        this.f3645f.addListener(new d());
        ValueAnimator h3 = h(1.0f, 0.0f);
        this.f3646g = h3;
        h3.addListener(new e());
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.a.setEndIconDrawable(e.a.k.a.a.d(this.b, g.b.a.c.e.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(j.clear_text_end_icon_content_description));
        this.a.setEndIconOnClickListener(new c());
        this.a.c(this.f3644e);
        k();
    }
}
