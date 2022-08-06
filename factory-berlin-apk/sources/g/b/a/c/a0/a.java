package g.b.a.c.a0;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import g.b.a.c.c0.g;
import g.b.a.c.c0.k;
import g.b.a.c.c0.n;

/* compiled from: RippleDrawableCompat */
public class a extends Drawable implements n, androidx.core.graphics.drawable.b {

    /* renamed from: g  reason: collision with root package name */
    private b f9440g;

    public a a() {
        this.f9440g = new b(this.f9440g);
        return this;
    }

    public void draw(Canvas canvas) {
        b bVar = this.f9440g;
        if (bVar.b) {
            bVar.a.draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f9440g;
    }

    public int getOpacity() {
        return this.f9440g.a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    public /* bridge */ /* synthetic */ Drawable mutate() {
        a();
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f9440g.a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f9440g.a.setState(iArr)) {
            onStateChange = true;
        }
        boolean e2 = b.e(iArr);
        b bVar = this.f9440g;
        if (bVar.b == e2) {
            return onStateChange;
        }
        bVar.b = e2;
        return true;
    }

    public void setAlpha(int i2) {
        this.f9440g.a.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f9440g.a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(k kVar) {
        this.f9440g.a.setShapeAppearanceModel(kVar);
    }

    public void setTint(int i2) {
        this.f9440g.a.setTint(i2);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f9440g.a.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f9440g.a.setTintMode(mode);
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    /* compiled from: RippleDrawableCompat */
    static final class b extends Drawable.ConstantState {
        g a;
        boolean b;

        public b(g gVar) {
            this.a = gVar;
            this.b = false;
        }

        /* renamed from: a */
        public a newDrawable() {
            return new a(new b(this));
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.a = (g) bVar.a.getConstantState().newDrawable();
            this.b = bVar.b;
        }
    }

    private a(b bVar) {
        this.f9440g = bVar;
    }
}
