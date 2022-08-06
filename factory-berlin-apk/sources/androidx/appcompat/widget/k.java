package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.widget.i;
import e.a.a;
import e.h.k.t;

/* compiled from: AppCompatEditText */
public class k extends EditText implements t {

    /* renamed from: g  reason: collision with root package name */
    private final e f460g;

    /* renamed from: h  reason: collision with root package name */
    private final y f461h;

    /* renamed from: i  reason: collision with root package name */
    private final x f462i;

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.editTextStyle);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f460g;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f461h;
        if (yVar != null) {
            yVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f460g;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f460g;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public TextClassifier getTextClassifier() {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f462i) == null) {
            return super.getTextClassifier();
        }
        return xVar.a();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        l.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f460g;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f460g;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.p(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f460g;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f460g;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f461h;
        if (yVar != null) {
            yVar.p(context, i2);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f462i) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xVar.b(textClassifier);
        }
    }

    public k(Context context, AttributeSet attributeSet, int i2) {
        super(t0.b(context), attributeSet, i2);
        e eVar = new e(this);
        this.f460g = eVar;
        eVar.e(attributeSet, i2);
        y yVar = new y(this);
        this.f461h = yVar;
        yVar.m(attributeSet, i2);
        this.f461h.b();
        this.f462i = new x(this);
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
