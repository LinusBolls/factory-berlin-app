package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import g.b.a.c.e;
import g.b.a.c.j;

/* compiled from: PasswordToggleEndIconDelegate */
class h extends e {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final TextWatcher f3681d = new a();

    /* renamed from: e  reason: collision with root package name */
    private final TextInputLayout.f f3682e = new b();

    /* renamed from: f  reason: collision with root package name */
    private final TextInputLayout.g f3683f = new c(this);

    /* compiled from: PasswordToggleEndIconDelegate */
    class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            h hVar = h.this;
            hVar.c.setChecked(!hVar.f());
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate */
    class b implements TextInputLayout.f {
        b() {
        }

        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            h hVar = h.this;
            hVar.c.setChecked(!hVar.f());
            editText.removeTextChangedListener(h.this.f3681d);
            editText.addTextChangedListener(h.this.f3681d);
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate */
    class c implements TextInputLayout.g {
        c(h hVar) {
        }

        public void a(TextInputLayout textInputLayout, int i2) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i2 == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate */
    class d implements View.OnClickListener {
        d() {
        }

        public void onClick(View view) {
            EditText editText = h.this.a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                if (h.this.f()) {
                    editText.setTransformationMethod((TransformationMethod) null);
                } else {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
            }
        }
    }

    h(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    public boolean f() {
        EditText editText = this.a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.a.setEndIconDrawable(e.a.k.a.a.d(this.b, e.design_password_eye));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(j.password_toggle_content_description));
        this.a.setEndIconOnClickListener(new d());
        this.a.c(this.f3682e);
        this.a.d(this.f3683f);
    }
}
