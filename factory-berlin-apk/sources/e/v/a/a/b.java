package e.v.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.c.g;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: AnimatedVectorDrawableCompat */
public class b extends g implements Animatable {

    /* renamed from: h  reason: collision with root package name */
    private C0591b f8948h;

    /* renamed from: i  reason: collision with root package name */
    private Context f8949i;

    /* renamed from: j  reason: collision with root package name */
    private ArgbEvaluator f8950j;

    /* renamed from: k  reason: collision with root package name */
    final Drawable.Callback f8951k;

    /* compiled from: AnimatedVectorDrawableCompat */
    class a implements Drawable.Callback {
        a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            b.this.scheduleSelf(runnable, j2);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            b.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: e.v.a.a.b$b  reason: collision with other inner class name */
    /* compiled from: AnimatedVectorDrawableCompat */
    private static class C0591b extends Drawable.ConstantState {
        int a;
        h b;
        AnimatorSet c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<Animator> f8953d;

        /* renamed from: e  reason: collision with root package name */
        e.e.a<Animator, String> f8954e;

        public C0591b(Context context, C0591b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.a = bVar.a;
                h hVar = bVar.b;
                if (hVar != null) {
                    Drawable.ConstantState constantState = hVar.getConstantState();
                    if (resources != null) {
                        this.b = (h) constantState.newDrawable(resources);
                    } else {
                        this.b = (h) constantState.newDrawable();
                    }
                    h hVar2 = this.b;
                    hVar2.mutate();
                    h hVar3 = hVar2;
                    this.b = hVar3;
                    hVar3.setCallback(callback);
                    this.b.setBounds(bVar.b.getBounds());
                    this.b.h(false);
                }
                ArrayList<Animator> arrayList = bVar.f8953d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f8953d = new ArrayList<>(size);
                    this.f8954e = new e.e.a<>(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        Animator animator = bVar.f8953d.get(i2);
                        Animator clone = animator.clone();
                        String str = bVar.f8954e.get(animator);
                        clone.setTarget(this.b.d(str));
                        this.f8953d.add(clone);
                        this.f8954e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.c == null) {
                this.c = new AnimatorSet();
            }
            this.c.playTogether(this.f8953d);
        }

        public int getChangingConfigurations() {
            return this.a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    b() {
        this((Context) null, (C0591b) null, (Resources) null);
    }

    public static b a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        b bVar = new b(context);
        bVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bVar;
    }

    private void b(String str, Animator animator) {
        animator.setTarget(this.f8948h.b.d(str));
        if (Build.VERSION.SDK_INT < 21) {
            c(animator);
        }
        C0591b bVar = this.f8948h;
        if (bVar.f8953d == null) {
            bVar.f8953d = new ArrayList<>();
            this.f8948h.f8954e = new e.e.a<>();
        }
        this.f8948h.f8953d.add(animator);
        this.f8948h.f8954e.put(animator, str);
    }

    private void c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                c(childAnimations.get(i2));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f8950j == null) {
                    this.f8950j = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f8950j);
            }
        }
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b(drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f8948h.b.draw(canvas);
        if (this.f8948h.c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.d(drawable);
        }
        return this.f8948h.b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f8948h.a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.e(drawable);
        }
        return this.f8948h.b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f8955g == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f8955g.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f8948h.b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f8948h.b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f8948h.b.getOpacity();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray k2 = g.k(resources, theme, attributeSet, a.f8940e);
                    int resourceId = k2.getResourceId(0, 0);
                    if (resourceId != 0) {
                        h b = h.b(resources, resourceId, theme);
                        b.h(false);
                        b.setCallback(this.f8951k);
                        h hVar = this.f8948h.b;
                        if (hVar != null) {
                            hVar.setCallback((Drawable.Callback) null);
                        }
                        this.f8948h.b = b;
                    }
                    k2.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f8941f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f8949i;
                        if (context != null) {
                            b(string, d.i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f8948h.a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.h(drawable);
        }
        return this.f8948h.b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f8948h.c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f8948h.b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f8948h.b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        return this.f8948h.b.setLevel(i2);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f8948h.b.setState(iArr);
    }

    public void setAlpha(int i2) {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f8948h.b.setAlpha(i2);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z);
        } else {
            this.f8948h.b.setAutoMirrored(z);
        }
    }

    public void setTint(int i2) {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i2);
        } else {
            this.f8948h.b.setTint(i2);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        } else {
            this.f8948h.b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
        } else {
            this.f8948h.b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f8948h.b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f8948h.c.isStarted()) {
            this.f8948h.c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f8948h.c.end();
        }
    }

    private b(Context context) {
        this(context, (C0591b) null, (Resources) null);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f8948h.b.setColorFilter(colorFilter);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat */
    private static class c extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public c(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            b bVar = new b();
            Drawable newDrawable = this.a.newDrawable();
            bVar.f8955g = newDrawable;
            newDrawable.setCallback(bVar.f8951k);
            return bVar;
        }

        public Drawable newDrawable(Resources resources) {
            b bVar = new b();
            Drawable newDrawable = this.a.newDrawable(resources);
            bVar.f8955g = newDrawable;
            newDrawable.setCallback(bVar.f8951k);
            return bVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b();
            Drawable newDrawable = this.a.newDrawable(resources, theme);
            bVar.f8955g = newDrawable;
            newDrawable.setCallback(bVar.f8951k);
            return bVar;
        }
    }

    private b(Context context, C0591b bVar, Resources resources) {
        this.f8950j = null;
        this.f8951k = new a();
        this.f8949i = context;
        if (bVar != null) {
            this.f8948h = bVar;
        } else {
            this.f8948h = new C0591b(context, bVar, this.f8951k, resources);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
