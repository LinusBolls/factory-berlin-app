package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: EndIconDelegate */
abstract class e {
    TextInputLayout a;
    Context b;
    CheckableImageButton c;

    e(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
        this.b = textInputLayout.getContext();
        this.c = textInputLayout.getEndIconView();
    }

    /* access modifiers changed from: package-private */
    public abstract void a();

    /* access modifiers changed from: package-private */
    public boolean b(int i2) {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return false;
    }
}
