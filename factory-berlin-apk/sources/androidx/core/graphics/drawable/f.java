package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: WrappedDrawableState */
final class f extends Drawable.ConstantState {
    int a;
    Drawable.ConstantState b;
    ColorStateList c = null;

    /* renamed from: d  reason: collision with root package name */
    PorterDuff.Mode f724d = d.f716m;

    f(f fVar) {
        if (fVar != null) {
            this.a = fVar.a;
            this.b = fVar.b;
            this.c = fVar.c;
            this.f724d = fVar.f724d;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.b != null;
    }

    public int getChangingConfigurations() {
        int i2 = this.a;
        Drawable.ConstantState constantState = this.b;
        return i2 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    public Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new e(this, resources);
        }
        return new d(this, resources);
    }
}
