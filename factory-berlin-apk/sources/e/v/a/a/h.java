package e.v.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import e.h.d.c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VectorDrawableCompat */
public class h extends g {
    static final PorterDuff.Mode p = PorterDuff.Mode.SRC_IN;

    /* renamed from: h  reason: collision with root package name */
    private C0592h f8956h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuffColorFilter f8957i;

    /* renamed from: j  reason: collision with root package name */
    private ColorFilter f8958j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f8959k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f8960l;

    /* renamed from: m  reason: collision with root package name */
    private final float[] f8961m;

    /* renamed from: n  reason: collision with root package name */
    private final Matrix f8962n;
    private final Rect o;

    /* compiled from: VectorDrawableCompat */
    private static class b extends f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.a = e.h.d.c.d(string2);
            }
            this.c = androidx.core.content.c.g.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (androidx.core.content.c.g.j(xmlPullParser, "pathData")) {
                TypedArray k2 = androidx.core.content.c.g.k(resources, theme, attributeSet, a.f8939d);
                f(k2, xmlPullParser);
                k2.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    /* compiled from: VectorDrawableCompat */
    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: e.v.a.a.h$h  reason: collision with other inner class name */
    /* compiled from: VectorDrawableCompat */
    private static class C0592h extends Drawable.ConstantState {
        int a;
        g b;
        ColorStateList c;

        /* renamed from: d  reason: collision with root package name */
        PorterDuff.Mode f8995d;

        /* renamed from: e  reason: collision with root package name */
        boolean f8996e;

        /* renamed from: f  reason: collision with root package name */
        Bitmap f8997f;

        /* renamed from: g  reason: collision with root package name */
        ColorStateList f8998g;

        /* renamed from: h  reason: collision with root package name */
        PorterDuff.Mode f8999h;

        /* renamed from: i  reason: collision with root package name */
        int f9000i;

        /* renamed from: j  reason: collision with root package name */
        boolean f9001j;

        /* renamed from: k  reason: collision with root package name */
        boolean f9002k;

        /* renamed from: l  reason: collision with root package name */
        Paint f9003l;

        public C0592h(C0592h hVar) {
            this.c = null;
            this.f8995d = h.p;
            if (hVar != null) {
                this.a = hVar.a;
                g gVar = new g(hVar.b);
                this.b = gVar;
                if (hVar.b.f8985e != null) {
                    gVar.f8985e = new Paint(hVar.b.f8985e);
                }
                if (hVar.b.f8984d != null) {
                    this.b.f8984d = new Paint(hVar.b.f8984d);
                }
                this.c = hVar.c;
                this.f8995d = hVar.f8995d;
                this.f8996e = hVar.f8996e;
            }
        }

        public boolean a(int i2, int i3) {
            return i2 == this.f8997f.getWidth() && i3 == this.f8997f.getHeight();
        }

        public boolean b() {
            return !this.f9002k && this.f8998g == this.c && this.f8999h == this.f8995d && this.f9001j == this.f8996e && this.f9000i == this.b.getRootAlpha();
        }

        public void c(int i2, int i3) {
            if (this.f8997f == null || !a(i2, i3)) {
                this.f8997f = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                this.f9002k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f8997f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f9003l == null) {
                Paint paint = new Paint();
                this.f9003l = paint;
                paint.setFilterBitmap(true);
            }
            this.f9003l.setAlpha(this.b.getRootAlpha());
            this.f9003l.setColorFilter(colorFilter);
            return this.f9003l;
        }

        public boolean f() {
            return this.b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.b.f();
        }

        public int getChangingConfigurations() {
            return this.a;
        }

        public boolean h(int[] iArr) {
            boolean g2 = this.b.g(iArr);
            this.f9002k |= g2;
            return g2;
        }

        public void i() {
            this.f8998g = this.c;
            this.f8999h = this.f8995d;
            this.f9000i = this.b.getRootAlpha();
            this.f9001j = this.f8996e;
            this.f9002k = false;
        }

        public void j(int i2, int i3) {
            this.f8997f.eraseColor(0);
            this.b.b(new Canvas(this.f8997f), i2, i3, (ColorFilter) null);
        }

        public Drawable newDrawable() {
            return new h(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new h(this);
        }

        public C0592h() {
            this.c = null;
            this.f8995d = h.p;
            this.b = new g();
        }
    }

    h() {
        this.f8960l = true;
        this.f8961m = new float[9];
        this.f8962n = new Matrix();
        this.o = new Rect();
        this.f8956h = new C0592h();
    }

    static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (((float) Color.alpha(i2)) * f2)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b A[Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e.v.a.a.h b(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0021
            e.v.a.a.h r0 = new e.v.a.a.h
            r0.<init>()
            android.graphics.drawable.Drawable r6 = androidx.core.content.c.f.a(r6, r7, r8)
            r0.f8955g = r6
            e.v.a.a.h$i r6 = new e.v.a.a.h$i
            android.graphics.drawable.Drawable r7 = r0.f8955g
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            return r0
        L_0x0021:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
        L_0x0029:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            r4 = 2
            if (r3 == r4) goto L_0x0034
            r5 = 1
            if (r3 == r5) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            if (r3 != r4) goto L_0x003b
            e.v.a.a.h r6 = c(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            return r6
        L_0x003b:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            throw r6     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
        L_0x0043:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            goto L_0x004c
        L_0x0048:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
        L_0x004c:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e.v.a.a.h.b(android.content.res.Resources, int, android.content.res.Resources$Theme):e.v.a.a.h");
    }

    public static h c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        h hVar = new h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0592h hVar = this.f8956h;
        g gVar = hVar.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f8988h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.p.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    hVar.a = cVar.f8983d | hVar.a;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.p.put(bVar.getPathName(), bVar);
                    }
                    hVar.a = bVar.f8983d | hVar.a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.a = dVar2.f8980k | hVar.a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        if (Build.VERSION.SDK_INT < 17 || !isAutoMirrored() || androidx.core.graphics.drawable.a.f(this) != 1) {
            return false;
        }
        return true;
    }

    private static PorterDuff.Mode g(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        C0592h hVar = this.f8956h;
        g gVar = hVar.b;
        hVar.f8995d = g(androidx.core.content.c.g.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c2 = androidx.core.content.c.g.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c2 != null) {
            hVar.c = c2;
        }
        hVar.f8996e = androidx.core.content.c.g.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f8996e);
        gVar.f8991k = androidx.core.content.c.g.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f8991k);
        float f2 = androidx.core.content.c.g.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f8992l);
        gVar.f8992l = f2;
        if (gVar.f8991k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f2 > 0.0f) {
            gVar.f8989i = typedArray.getDimension(3, gVar.f8989i);
            float dimension = typedArray.getDimension(2, gVar.f8990j);
            gVar.f8990j = dimension;
            if (gVar.f8989i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(androidx.core.content.c.g.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f8994n = string;
                    gVar.p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f8955g;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.b(drawable);
        return false;
    }

    /* access modifiers changed from: package-private */
    public Object d(String str) {
        return this.f8956h.b.p.get(str);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.o);
        if (this.o.width() > 0 && this.o.height() > 0) {
            ColorFilter colorFilter = this.f8958j;
            if (colorFilter == null) {
                colorFilter = this.f8957i;
            }
            canvas.getMatrix(this.f8962n);
            this.f8962n.getValues(this.f8961m);
            float abs = Math.abs(this.f8961m[0]);
            float abs2 = Math.abs(this.f8961m[4]);
            float abs3 = Math.abs(this.f8961m[1]);
            float abs4 = Math.abs(this.f8961m[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.o.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.o.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.o;
                canvas.translate((float) rect.left, (float) rect.top);
                if (f()) {
                    canvas.translate((float) this.o.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.o.offsetTo(0, 0);
                this.f8956h.c(min, min2);
                if (!this.f8960l) {
                    this.f8956h.j(min, min2);
                } else if (!this.f8956h.b()) {
                    this.f8956h.j(min, min2);
                    this.f8956h.i();
                }
                this.f8956h.d(canvas, colorFilter, this.o);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.d(drawable);
        }
        return this.f8956h.b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f8956h.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.e(drawable);
        }
        return this.f8958j;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f8955g != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f8955g.getConstantState());
        }
        this.f8956h.a = getChangingConfigurations();
        return this.f8956h;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f8956h.b.f8990j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f8956h.b.f8989i;
    }

    public int getOpacity() {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    /* access modifiers changed from: package-private */
    public void h(boolean z) {
        this.f8960l = z;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.h(drawable);
        }
        return this.f8956h.f8996e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f8956h.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f8956h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f8955g
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            e.v.a.a.h$h r0 = r1.f8956h
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x0028
            e.v.a.a.h$h r0 = r1.f8956h
            android.content.res.ColorStateList r0 = r0.c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.v.a.a.h.isStateful():boolean");
    }

    /* access modifiers changed from: package-private */
    public PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public Drawable mutate() {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f8959k && super.mutate() == this) {
            this.f8956h = new C0592h(this.f8956h);
            this.f8959k = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C0592h hVar = this.f8956h;
        ColorStateList colorStateList = hVar.c;
        if (!(colorStateList == null || (mode = hVar.f8995d) == null)) {
            this.f8957i = j(this.f8957i, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f8956h.b.getRootAlpha() != i2) {
            this.f8956h.b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z);
        } else {
            this.f8956h.f8996e = z;
        }
    }

    public void setTint(int i2) {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            return;
        }
        C0592h hVar = this.f8956h;
        if (hVar.c != colorStateList) {
            hVar.c = colorStateList;
            this.f8957i = j(this.f8957i, colorStateList, hVar.f8995d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
            return;
        }
        C0592h hVar = this.f8956h;
        if (hVar.f8995d != mode) {
            hVar.f8995d = mode;
            this.f8957i = j(this.f8957i, hVar.c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat */
    private static class i extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public i(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            h hVar = new h();
            hVar.f8955g = (VectorDrawable) this.a.newDrawable();
            return hVar;
        }

        public Drawable newDrawable(Resources resources) {
            h hVar = new h();
            hVar.f8955g = (VectorDrawable) this.a.newDrawable(resources);
            return hVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            h hVar = new h();
            hVar.f8955g = (VectorDrawable) this.a.newDrawable(resources, theme);
            return hVar;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f8958j = colorFilter;
        invalidateSelf();
    }

    /* compiled from: VectorDrawableCompat */
    private static abstract class f extends e {
        protected c.b[] a = null;
        String b;
        int c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f8983d;

        public f() {
            super();
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            c.b[] bVarArr = this.a;
            if (bVarArr != null) {
                c.b.e(bVarArr, path);
            }
        }

        public c.b[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.b;
        }

        public void setPathData(c.b[] bVarArr) {
            if (!e.h.d.c.b(this.a, bVarArr)) {
                this.a = e.h.d.c.f(bVarArr);
            } else {
                e.h.d.c.j(this.a, bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.b = fVar.b;
            this.f8983d = fVar.f8983d;
            this.a = e.h.d.c.f(fVar.a);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f8955g;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0592h hVar = this.f8956h;
        hVar.b = new g();
        TypedArray k2 = androidx.core.content.c.g.k(resources, theme, attributeSet, a.a);
        i(k2, xmlPullParser, theme);
        k2.recycle();
        hVar.a = getChangingConfigurations();
        hVar.f9002k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f8957i = j(this.f8957i, hVar.c, hVar.f8995d);
    }

    h(C0592h hVar) {
        this.f8960l = true;
        this.f8961m = new float[9];
        this.f8962n = new Matrix();
        this.o = new Rect();
        this.f8956h = hVar;
        this.f8957i = j(this.f8957i, hVar.c, hVar.f8995d);
    }

    /* compiled from: VectorDrawableCompat */
    private static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private int[] f8963e;

        /* renamed from: f  reason: collision with root package name */
        androidx.core.content.c.b f8964f;

        /* renamed from: g  reason: collision with root package name */
        float f8965g = 0.0f;

        /* renamed from: h  reason: collision with root package name */
        androidx.core.content.c.b f8966h;

        /* renamed from: i  reason: collision with root package name */
        float f8967i = 1.0f;

        /* renamed from: j  reason: collision with root package name */
        float f8968j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        float f8969k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        float f8970l = 1.0f;

        /* renamed from: m  reason: collision with root package name */
        float f8971m = 0.0f;

        /* renamed from: n  reason: collision with root package name */
        Paint.Cap f8972n = Paint.Cap.BUTT;
        Paint.Join o = Paint.Join.MITER;
        float p = 4.0f;

        c() {
        }

        private Paint.Cap e(int i2, Paint.Cap cap) {
            if (i2 == 0) {
                return Paint.Cap.BUTT;
            }
            if (i2 != 1) {
                return i2 != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        private Paint.Join f(int i2, Paint.Join join) {
            if (i2 == 0) {
                return Paint.Join.MITER;
            }
            if (i2 != 1) {
                return i2 != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f8963e = null;
            if (androidx.core.content.c.g.j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.a = e.h.d.c.d(string2);
                }
                Resources.Theme theme2 = theme;
                this.f8966h = androidx.core.content.c.g.e(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f8968j = androidx.core.content.c.g.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f8968j);
                this.f8972n = e(androidx.core.content.c.g.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f8972n);
                this.o = f(androidx.core.content.c.g.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.o);
                this.p = androidx.core.content.c.g.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.p);
                this.f8964f = androidx.core.content.c.g.e(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f8967i = androidx.core.content.c.g.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f8967i);
                this.f8965g = androidx.core.content.c.g.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f8965g);
                this.f8970l = androidx.core.content.c.g.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f8970l);
                this.f8971m = androidx.core.content.c.g.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f8971m);
                this.f8969k = androidx.core.content.c.g.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f8969k);
                this.c = androidx.core.content.c.g.g(typedArray, xmlPullParser, "fillType", 13, this.c);
            }
        }

        public boolean a() {
            return this.f8966h.i() || this.f8964f.i();
        }

        public boolean b(int[] iArr) {
            return this.f8964f.j(iArr) | this.f8966h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k2 = androidx.core.content.c.g.k(resources, theme, attributeSet, a.c);
            h(k2, xmlPullParser, theme);
            k2.recycle();
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f8968j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f8966h.e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f8967i;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f8964f.e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f8965g;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f8970l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f8971m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f8969k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f2) {
            this.f8968j = f2;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i2) {
            this.f8966h.k(i2);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f2) {
            this.f8967i = f2;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i2) {
            this.f8964f.k(i2);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f2) {
            this.f8965g = f2;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f2) {
            this.f8970l = f2;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f2) {
            this.f8971m = f2;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f2) {
            this.f8969k = f2;
        }

        c(c cVar) {
            super(cVar);
            this.f8963e = cVar.f8963e;
            this.f8964f = cVar.f8964f;
            this.f8965g = cVar.f8965g;
            this.f8967i = cVar.f8967i;
            this.f8966h = cVar.f8966h;
            this.c = cVar.c;
            this.f8968j = cVar.f8968j;
            this.f8969k = cVar.f8969k;
            this.f8970l = cVar.f8970l;
            this.f8971m = cVar.f8971m;
            this.f8972n = cVar.f8972n;
            this.o = cVar.o;
            this.p = cVar.p;
        }
    }

    /* compiled from: VectorDrawableCompat */
    private static class g {
        private static final Matrix q = new Matrix();
        private final Path a;
        private final Path b;
        private final Matrix c;

        /* renamed from: d  reason: collision with root package name */
        Paint f8984d;

        /* renamed from: e  reason: collision with root package name */
        Paint f8985e;

        /* renamed from: f  reason: collision with root package name */
        private PathMeasure f8986f;

        /* renamed from: g  reason: collision with root package name */
        private int f8987g;

        /* renamed from: h  reason: collision with root package name */
        final d f8988h;

        /* renamed from: i  reason: collision with root package name */
        float f8989i;

        /* renamed from: j  reason: collision with root package name */
        float f8990j;

        /* renamed from: k  reason: collision with root package name */
        float f8991k;

        /* renamed from: l  reason: collision with root package name */
        float f8992l;

        /* renamed from: m  reason: collision with root package name */
        int f8993m;

        /* renamed from: n  reason: collision with root package name */
        String f8994n;
        Boolean o;
        final e.e.a<String, Object> p;

        public g() {
            this.c = new Matrix();
            this.f8989i = 0.0f;
            this.f8990j = 0.0f;
            this.f8991k = 0.0f;
            this.f8992l = 0.0f;
            this.f8993m = 255;
            this.f8994n = null;
            this.o = null;
            this.p = new e.e.a<>();
            this.f8988h = new d();
            this.a = new Path();
            this.b = new Path();
        }

        private static float a(float f2, float f3, float f4, float f5) {
            return (f2 * f5) - (f3 * f4);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            dVar.a.set(matrix);
            dVar.a.preConcat(dVar.f8979j);
            canvas.save();
            for (int i4 = 0; i4 < dVar.b.size(); i4++) {
                e eVar = dVar.b.get(i4);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.a, canvas, i2, i3, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i2, i3, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            float f2 = ((float) i2) / this.f8991k;
            float f3 = ((float) i3) / this.f8992l;
            float min = Math.min(f2, f3);
            Matrix matrix = dVar.a;
            this.c.set(matrix);
            this.c.postScale(f2, f3);
            float e2 = e(matrix);
            if (e2 != 0.0f) {
                fVar.d(this.a);
                Path path = this.a;
                this.b.reset();
                if (fVar.c()) {
                    this.b.setFillType(fVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.b.addPath(path, this.c);
                    canvas.clipPath(this.b);
                    return;
                }
                c cVar = (c) fVar;
                if (!(cVar.f8969k == 0.0f && cVar.f8970l == 1.0f)) {
                    float f4 = cVar.f8969k;
                    float f5 = cVar.f8971m;
                    float f6 = (f4 + f5) % 1.0f;
                    float f7 = (cVar.f8970l + f5) % 1.0f;
                    if (this.f8986f == null) {
                        this.f8986f = new PathMeasure();
                    }
                    this.f8986f.setPath(this.a, false);
                    float length = this.f8986f.getLength();
                    float f8 = f6 * length;
                    float f9 = f7 * length;
                    path.reset();
                    if (f8 > f9) {
                        this.f8986f.getSegment(f8, length, path, true);
                        this.f8986f.getSegment(0.0f, f9, path, true);
                    } else {
                        this.f8986f.getSegment(f8, f9, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.b.addPath(path, this.c);
                if (cVar.f8966h.l()) {
                    androidx.core.content.c.b bVar = cVar.f8966h;
                    if (this.f8985e == null) {
                        Paint paint = new Paint(1);
                        this.f8985e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f8985e;
                    if (bVar.h()) {
                        Shader f10 = bVar.f();
                        f10.setLocalMatrix(this.c);
                        paint2.setShader(f10);
                        paint2.setAlpha(Math.round(cVar.f8968j * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(h.a(bVar.e(), cVar.f8968j));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.b.setFillType(cVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.b, paint2);
                }
                if (cVar.f8964f.l()) {
                    androidx.core.content.c.b bVar2 = cVar.f8964f;
                    if (this.f8984d == null) {
                        Paint paint3 = new Paint(1);
                        this.f8984d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f8984d;
                    Paint.Join join = cVar.o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f8972n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.p);
                    if (bVar2.h()) {
                        Shader f11 = bVar2.f();
                        f11.setLocalMatrix(this.c);
                        paint4.setShader(f11);
                        paint4.setAlpha(Math.round(cVar.f8967i * 255.0f));
                    } else {
                        paint4.setShader((Shader) null);
                        paint4.setAlpha(255);
                        paint4.setColor(h.a(bVar2.e(), cVar.f8967i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f8965g * min * e2);
                    canvas.drawPath(this.b, paint4);
                }
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a2 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a2) / max;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            c(this.f8988h, q, canvas, i2, i3, colorFilter);
        }

        public boolean f() {
            if (this.o == null) {
                this.o = Boolean.valueOf(this.f8988h.a());
            }
            return this.o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f8988h.b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f8993m;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.f8993m = i2;
        }

        public g(g gVar) {
            this.c = new Matrix();
            this.f8989i = 0.0f;
            this.f8990j = 0.0f;
            this.f8991k = 0.0f;
            this.f8992l = 0.0f;
            this.f8993m = 255;
            this.f8994n = null;
            this.o = null;
            e.e.a<String, Object> aVar = new e.e.a<>();
            this.p = aVar;
            this.f8988h = new d(gVar.f8988h, aVar);
            this.a = new Path(gVar.a);
            this.b = new Path(gVar.b);
            this.f8989i = gVar.f8989i;
            this.f8990j = gVar.f8990j;
            this.f8991k = gVar.f8991k;
            this.f8992l = gVar.f8992l;
            this.f8987g = gVar.f8987g;
            this.f8993m = gVar.f8993m;
            this.f8994n = gVar.f8994n;
            String str = gVar.f8994n;
            if (str != null) {
                this.p.put(str, this);
            }
            this.o = gVar.o;
        }
    }

    /* compiled from: VectorDrawableCompat */
    private static class d extends e {
        final Matrix a = new Matrix();
        final ArrayList<e> b = new ArrayList<>();
        float c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        private float f8973d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        private float f8974e = 0.0f;

        /* renamed from: f  reason: collision with root package name */
        private float f8975f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        private float f8976g = 1.0f;

        /* renamed from: h  reason: collision with root package name */
        private float f8977h = 0.0f;

        /* renamed from: i  reason: collision with root package name */
        private float f8978i = 0.0f;

        /* renamed from: j  reason: collision with root package name */
        final Matrix f8979j = new Matrix();

        /* renamed from: k  reason: collision with root package name */
        int f8980k;

        /* renamed from: l  reason: collision with root package name */
        private int[] f8981l;

        /* renamed from: m  reason: collision with root package name */
        private String f8982m = null;

        public d(d dVar, e.e.a<String, Object> aVar) {
            super();
            f fVar;
            this.c = dVar.c;
            this.f8973d = dVar.f8973d;
            this.f8974e = dVar.f8974e;
            this.f8975f = dVar.f8975f;
            this.f8976g = dVar.f8976g;
            this.f8977h = dVar.f8977h;
            this.f8978i = dVar.f8978i;
            this.f8981l = dVar.f8981l;
            String str = dVar.f8982m;
            this.f8982m = str;
            this.f8980k = dVar.f8980k;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f8979j.set(dVar.f8979j);
            ArrayList<e> arrayList = dVar.b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                e eVar = arrayList.get(i2);
                if (eVar instanceof d) {
                    this.b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        fVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        fVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.b.add(fVar);
                    String str2 = fVar.b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        private void d() {
            this.f8979j.reset();
            this.f8979j.postTranslate(-this.f8973d, -this.f8974e);
            this.f8979j.postScale(this.f8975f, this.f8976g);
            this.f8979j.postRotate(this.c, 0.0f, 0.0f);
            this.f8979j.postTranslate(this.f8977h + this.f8973d, this.f8978i + this.f8974e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f8981l = null;
            this.c = androidx.core.content.c.g.f(typedArray, xmlPullParser, "rotation", 5, this.c);
            this.f8973d = typedArray.getFloat(1, this.f8973d);
            this.f8974e = typedArray.getFloat(2, this.f8974e);
            this.f8975f = androidx.core.content.c.g.f(typedArray, xmlPullParser, "scaleX", 3, this.f8975f);
            this.f8976g = androidx.core.content.c.g.f(typedArray, xmlPullParser, "scaleY", 4, this.f8976g);
            this.f8977h = androidx.core.content.c.g.f(typedArray, xmlPullParser, "translateX", 6, this.f8977h);
            this.f8978i = androidx.core.content.c.g.f(typedArray, xmlPullParser, "translateY", 7, this.f8978i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f8982m = string;
            }
            d();
        }

        public boolean a() {
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                if (this.b.get(i2).a()) {
                    return true;
                }
            }
            return false;
        }

        public boolean b(int[] iArr) {
            boolean z = false;
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                z |= this.b.get(i2).b(iArr);
            }
            return z;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k2 = androidx.core.content.c.g.k(resources, theme, attributeSet, a.b);
            e(k2, xmlPullParser);
            k2.recycle();
        }

        public String getGroupName() {
            return this.f8982m;
        }

        public Matrix getLocalMatrix() {
            return this.f8979j;
        }

        public float getPivotX() {
            return this.f8973d;
        }

        public float getPivotY() {
            return this.f8974e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f8975f;
        }

        public float getScaleY() {
            return this.f8976g;
        }

        public float getTranslateX() {
            return this.f8977h;
        }

        public float getTranslateY() {
            return this.f8978i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.f8973d) {
                this.f8973d = f2;
                d();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.f8974e) {
                this.f8974e = f2;
                d();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.c) {
                this.c = f2;
                d();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f8975f) {
                this.f8975f = f2;
                d();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.f8976g) {
                this.f8976g = f2;
                d();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.f8977h) {
                this.f8977h = f2;
                d();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.f8978i) {
                this.f8978i = f2;
                d();
            }
        }

        public d() {
            super();
        }
    }
}
