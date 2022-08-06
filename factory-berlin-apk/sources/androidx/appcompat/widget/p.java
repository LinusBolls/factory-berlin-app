package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import e.a.a;
import e.h.k.t;

/* compiled from: AppCompatMultiAutoCompleteTextView */
public class p extends MultiAutoCompleteTextView implements t {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f480i = {16843126};

    /* renamed from: g  reason: collision with root package name */
    private final e f481g;

    /* renamed from: h  reason: collision with root package name */
    private final y f482h;

    public p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.autoCompleteTextViewStyle);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f481g;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f482h;
        if (yVar != null) {
            yVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f481g;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f481g;
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
        e eVar = this.f481g;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f481g;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(e.a.k.a.a.d(getContext(), i2));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f481g;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f481g;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f482h;
        if (yVar != null) {
            yVar.p(context, i2);
        }
    }

    public p(Context context, AttributeSet attributeSet, int i2) {
        super(t0.b(context), attributeSet, i2);
        w0 u = w0.u(getContext(), attributeSet, f480i, i2, 0);
        if (u.r(0)) {
            setDropDownBackgroundDrawable(u.g(0));
        }
        u.v();
        e eVar = new e(this);
        this.f481g = eVar;
        eVar.e(attributeSet, i2);
        y yVar = new y(this);
        this.f482h = yVar;
        yVar.m(attributeSet, i2);
        this.f482h.b();
    }
}
