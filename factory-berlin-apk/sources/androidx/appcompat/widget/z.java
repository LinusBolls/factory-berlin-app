package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.b;
import androidx.core.widget.i;
import androidx.core.widget.k;
import e.a.k.a.a;
import e.h.d.d;
import e.h.i.c;
import e.h.k.t;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: AppCompatTextView */
public class z extends TextView implements t, k, b {

    /* renamed from: g  reason: collision with root package name */
    private final e f565g;

    /* renamed from: h  reason: collision with root package name */
    private final y f566h;

    /* renamed from: i  reason: collision with root package name */
    private final x f567i;

    /* renamed from: j  reason: collision with root package name */
    private Future<c> f568j;

    public z(Context context) {
        this(context, (AttributeSet) null);
    }

    private void c() {
        Future<c> future = this.f568j;
        if (future != null) {
            try {
                this.f568j = null;
                i.m(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f565g;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f566h;
        if (yVar != null) {
            yVar.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.a) {
            return super.getAutoSizeMaxTextSize();
        }
        y yVar = this.f566h;
        if (yVar != null) {
            return yVar.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.a) {
            return super.getAutoSizeMinTextSize();
        }
        y yVar = this.f566h;
        if (yVar != null) {
            return yVar.f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.a) {
            return super.getAutoSizeStepGranularity();
        }
        y yVar = this.f566h;
        if (yVar != null) {
            return yVar.g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y yVar = this.f566h;
        return yVar != null ? yVar.h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!b.a) {
            y yVar = this.f566h;
            if (yVar != null) {
                return yVar.i();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getFirstBaselineToTopHeight() {
        return i.b(this);
    }

    public int getLastBaselineToBottomHeight() {
        return i.c(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f565g;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f565g;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f566h.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f566h.k();
    }

    public CharSequence getText() {
        c();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f567i) == null) {
            return super.getTextClassifier();
        }
        return xVar.a();
    }

    public c.a getTextMetricsParamsCompat() {
        return i.f(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        l.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        y yVar = this.f566h;
        if (yVar != null) {
            yVar.n(z, i2, i3, i4, i5);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        c();
        super.onMeasure(i2, i3);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        y yVar = this.f566h;
        if (yVar != null && !b.a && yVar.l()) {
            this.f566h.c();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (b.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        y yVar = this.f566h;
        if (yVar != null) {
            yVar.s(i2, i3, i4, i5);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (b.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        y yVar = this.f566h;
        if (yVar != null) {
            yVar.t(iArr, i2);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (b.a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        y yVar = this.f566h;
        if (yVar != null) {
            yVar.u(i2);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f565g;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f565g;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f566h;
        if (yVar != null) {
            yVar.o();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f566h;
        if (yVar != null) {
            yVar.o();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f566h;
        if (yVar != null) {
            yVar.o();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f566h;
        if (yVar != null) {
            yVar.o();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.p(this, callback));
    }

    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            i.j(this, i2);
        }
    }

    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            i.k(this, i2);
        }
    }

    public void setLineHeight(int i2) {
        i.l(this, i2);
    }

    public void setPrecomputedText(c cVar) {
        i.m(this, cVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f565g;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f565g;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f566h.v(colorStateList);
        this.f566h.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f566h.w(mode);
        this.f566h.b();
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f566h;
        if (yVar != null) {
            yVar.p(context, i2);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f567i) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xVar.b(textClassifier);
        }
    }

    public void setTextFuture(Future<c> future) {
        this.f568j = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(c.a aVar) {
        i.o(this, aVar);
    }

    public void setTextSize(int i2, float f2) {
        if (b.a) {
            super.setTextSize(i2, f2);
            return;
        }
        y yVar = this.f566h;
        if (yVar != null) {
            yVar.z(i2, f2);
        }
    }

    public void setTypeface(Typeface typeface, int i2) {
        Typeface a = (typeface == null || i2 <= 0) ? null : d.a(getContext(), typeface, i2);
        if (a != null) {
            typeface = a;
        }
        super.setTypeface(typeface, i2);
    }

    public z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public z(Context context, AttributeSet attributeSet, int i2) {
        super(t0.b(context), attributeSet, i2);
        e eVar = new e(this);
        this.f565g = eVar;
        eVar.e(attributeSet, i2);
        y yVar = new y(this);
        this.f566h = yVar;
        yVar.m(attributeSet, i2);
        this.f566h.b();
        this.f567i = new x(this);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d2 = i2 != 0 ? a.d(context, i2) : null;
        Drawable d3 = i3 != 0 ? a.d(context, i3) : null;
        Drawable d4 = i4 != 0 ? a.d(context, i4) : null;
        if (i5 != 0) {
            drawable = a.d(context, i5);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(d2, d3, d4, drawable);
        y yVar = this.f566h;
        if (yVar != null) {
            yVar.o();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d2 = i2 != 0 ? a.d(context, i2) : null;
        Drawable d3 = i3 != 0 ? a.d(context, i3) : null;
        Drawable d4 = i4 != 0 ? a.d(context, i4) : null;
        if (i5 != 0) {
            drawable = a.d(context, i5);
        }
        setCompoundDrawablesWithIntrinsicBounds(d2, d3, d4, drawable);
        y yVar = this.f566h;
        if (yVar != null) {
            yVar.o();
        }
    }
}
