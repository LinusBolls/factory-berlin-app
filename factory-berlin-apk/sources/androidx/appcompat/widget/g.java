package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.core.widget.j;
import e.a.a;
import e.h.k.t;

/* compiled from: AppCompatCheckBox */
public class g extends CheckBox implements j, t {

    /* renamed from: g  reason: collision with root package name */
    private final i f419g;

    /* renamed from: h  reason: collision with root package name */
    private final e f420h;

    /* renamed from: i  reason: collision with root package name */
    private final y f421i;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.checkboxStyle);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f420h;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f421i;
        if (yVar != null) {
            yVar.b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.f419g;
        return iVar != null ? iVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f420h;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f420h;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        i iVar = this.f419g;
        if (iVar != null) {
            return iVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.f419g;
        if (iVar != null) {
            return iVar.d();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f420h;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f420h;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i iVar = this.f419g;
        if (iVar != null) {
            iVar.f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f420h;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f420h;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.f419g;
        if (iVar != null) {
            iVar.g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.f419g;
        if (iVar != null) {
            iVar.h(mode);
        }
    }

    public g(Context context, AttributeSet attributeSet, int i2) {
        super(t0.b(context), attributeSet, i2);
        i iVar = new i(this);
        this.f419g = iVar;
        iVar.e(attributeSet, i2);
        e eVar = new e(this);
        this.f420h = eVar;
        eVar.e(attributeSet, i2);
        y yVar = new y(this);
        this.f421i = yVar;
        yVar.m(attributeSet, i2);
    }

    public void setButtonDrawable(int i2) {
        setButtonDrawable(e.a.k.a.a.d(getContext(), i2));
    }
}
