package g.b.a.c.z;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.c.f;
import g.b.a.c.l;

/* compiled from: TextAppearance */
public class d {
    public final float a;
    public final ColorStateList b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9551d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9552e;

    /* renamed from: f  reason: collision with root package name */
    public final ColorStateList f9553f;

    /* renamed from: g  reason: collision with root package name */
    public final float f9554g;

    /* renamed from: h  reason: collision with root package name */
    public final float f9555h;

    /* renamed from: i  reason: collision with root package name */
    public final float f9556i;

    /* renamed from: j  reason: collision with root package name */
    private final int f9557j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public boolean f9558k = false;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public Typeface f9559l;

    /* compiled from: TextAppearance */
    class a extends f.a {
        final /* synthetic */ f a;

        a(f fVar) {
            this.a = fVar;
        }

        public void c(int i2) {
            boolean unused = d.this.f9558k = true;
            this.a.a(i2);
        }

        public void d(Typeface typeface) {
            d dVar = d.this;
            Typeface unused = dVar.f9559l = Typeface.create(typeface, dVar.c);
            boolean unused2 = d.this.f9558k = true;
            this.a.b(d.this.f9559l, false);
        }
    }

    /* compiled from: TextAppearance */
    class b extends f {
        final /* synthetic */ TextPaint a;
        final /* synthetic */ f b;

        b(TextPaint textPaint, f fVar) {
            this.a = textPaint;
            this.b = fVar;
        }

        public void a(int i2) {
            this.b.a(i2);
        }

        public void b(Typeface typeface, boolean z) {
            d.this.k(this.a, typeface);
            this.b.b(typeface, z);
        }
    }

    public d(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, l.TextAppearance);
        this.a = obtainStyledAttributes.getDimension(l.TextAppearance_android_textSize, 0.0f);
        this.b = c.a(context, obtainStyledAttributes, l.TextAppearance_android_textColor);
        c.a(context, obtainStyledAttributes, l.TextAppearance_android_textColorHint);
        c.a(context, obtainStyledAttributes, l.TextAppearance_android_textColorLink);
        this.c = obtainStyledAttributes.getInt(l.TextAppearance_android_textStyle, 0);
        this.f9551d = obtainStyledAttributes.getInt(l.TextAppearance_android_typeface, 1);
        int e2 = c.e(obtainStyledAttributes, l.TextAppearance_fontFamily, l.TextAppearance_android_fontFamily);
        this.f9557j = obtainStyledAttributes.getResourceId(e2, 0);
        this.f9552e = obtainStyledAttributes.getString(e2);
        obtainStyledAttributes.getBoolean(l.TextAppearance_textAllCaps, false);
        this.f9553f = c.a(context, obtainStyledAttributes, l.TextAppearance_android_shadowColor);
        this.f9554g = obtainStyledAttributes.getFloat(l.TextAppearance_android_shadowDx, 0.0f);
        this.f9555h = obtainStyledAttributes.getFloat(l.TextAppearance_android_shadowDy, 0.0f);
        this.f9556i = obtainStyledAttributes.getFloat(l.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private void d() {
        String str;
        if (this.f9559l == null && (str = this.f9552e) != null) {
            this.f9559l = Typeface.create(str, this.c);
        }
        if (this.f9559l == null) {
            int i2 = this.f9551d;
            if (i2 == 1) {
                this.f9559l = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f9559l = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f9559l = Typeface.DEFAULT;
            } else {
                this.f9559l = Typeface.MONOSPACE;
            }
            this.f9559l = Typeface.create(this.f9559l, this.c);
        }
    }

    public Typeface e() {
        d();
        return this.f9559l;
    }

    public Typeface f(Context context) {
        if (this.f9558k) {
            return this.f9559l;
        }
        if (!context.isRestricted()) {
            try {
                Typeface b2 = f.b(context, this.f9557j);
                this.f9559l = b2;
                if (b2 != null) {
                    this.f9559l = Typeface.create(b2, this.c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f9552e, e2);
            }
        }
        d();
        this.f9558k = true;
        return this.f9559l;
    }

    public void g(Context context, TextPaint textPaint, f fVar) {
        k(textPaint, e());
        h(context, new b(textPaint, fVar));
    }

    public void h(Context context, f fVar) {
        if (e.a()) {
            f(context);
        } else {
            d();
        }
        if (this.f9557j == 0) {
            this.f9558k = true;
        }
        if (this.f9558k) {
            fVar.b(this.f9559l, true);
            return;
        }
        try {
            f.d(context, this.f9557j, new a(fVar), (Handler) null);
        } catch (Resources.NotFoundException unused) {
            this.f9558k = true;
            fVar.a(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f9552e, e2);
            this.f9558k = true;
            fVar.a(-3);
        }
    }

    public void i(Context context, TextPaint textPaint, f fVar) {
        j(context, textPaint, fVar);
        ColorStateList colorStateList = this.b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f2 = this.f9556i;
        float f3 = this.f9554g;
        float f4 = this.f9555h;
        ColorStateList colorStateList2 = this.f9553f;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void j(Context context, TextPaint textPaint, f fVar) {
        if (e.a()) {
            k(textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void k(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i2 = (~typeface.getStyle()) & this.c;
        textPaint.setFakeBoldText((i2 & 1) != 0);
        textPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.a);
    }
}
