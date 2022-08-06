package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.core.widget.i;
import e.a.a;
import e.h.k.t;

/* compiled from: AppCompatAutoCompleteTextView */
public class d extends AutoCompleteTextView implements t {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f401i = {16843126};

    /* renamed from: g  reason: collision with root package name */
    private final e f402g;

    /* renamed from: h  reason: collision with root package name */
    private final y f403h;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.autoCompleteTextViewStyle);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f402g;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f403h;
        if (yVar != null) {
            yVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f402g;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f402g;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        l.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f402g;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f402g;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.p(this, callback));
    }

    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(e.a.k.a.a.d(getContext(), i2));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f402g;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f402g;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f403h;
        if (yVar != null) {
            yVar.p(context, i2);
        }
    }

    public d(Context context, AttributeSet attributeSet, int i2) {
        super(t0.b(context), attributeSet, i2);
        w0 u = w0.u(getContext(), attributeSet, f401i, i2, 0);
        if (u.r(0)) {
            setDropDownBackgroundDrawable(u.g(0));
        }
        u.v();
        e eVar = new e(this);
        this.f402g = eVar;
        eVar.e(attributeSet, i2);
        y yVar = new y(this);
        this.f403h = yVar;
        yVar.m(attributeSet, i2);
        this.f403h.b();
    }
}
