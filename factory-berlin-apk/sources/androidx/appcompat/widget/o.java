package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.l;
import e.h.k.t;

/* compiled from: AppCompatImageView */
public class o extends ImageView implements t, l {

    /* renamed from: g  reason: collision with root package name */
    private final e f473g;

    /* renamed from: h  reason: collision with root package name */
    private final n f474h;

    public o(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f473g;
        if (eVar != null) {
            eVar.b();
        }
        n nVar = this.f474h;
        if (nVar != null) {
            nVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f473g;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f473g;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        n nVar = this.f474h;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        n nVar = this.f474h;
        if (nVar != null) {
            return nVar.d();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f474h.e() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f473g;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f473g;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        n nVar = this.f474h;
        if (nVar != null) {
            nVar.b();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        n nVar = this.f474h;
        if (nVar != null) {
            nVar.b();
        }
    }

    public void setImageResource(int i2) {
        n nVar = this.f474h;
        if (nVar != null) {
            nVar.g(i2);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        n nVar = this.f474h;
        if (nVar != null) {
            nVar.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f473g;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f473g;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        n nVar = this.f474h;
        if (nVar != null) {
            nVar.h(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        n nVar = this.f474h;
        if (nVar != null) {
            nVar.i(mode);
        }
    }

    public o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public o(Context context, AttributeSet attributeSet, int i2) {
        super(t0.b(context), attributeSet, i2);
        e eVar = new e(this);
        this.f473g = eVar;
        eVar.e(attributeSet, i2);
        n nVar = new n(this);
        this.f474h = nVar;
        nVar.f(attributeSet, i2);
    }
}
