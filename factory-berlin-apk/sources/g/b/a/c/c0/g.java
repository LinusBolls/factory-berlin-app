package g.b.a.c.c0;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import g.b.a.c.c0.k;
import g.b.a.c.c0.l;
import g.b.a.c.c0.m;

/* compiled from: MaterialShapeDrawable */
public class g extends Drawable implements androidx.core.graphics.drawable.b, n {
    private static final Paint B = new Paint(1);
    private final RectF A;

    /* renamed from: g  reason: collision with root package name */
    private c f9458g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final m.g[] f9459h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final m.g[] f9460i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public boolean f9461j;

    /* renamed from: k  reason: collision with root package name */
    private final Matrix f9462k;

    /* renamed from: l  reason: collision with root package name */
    private final Path f9463l;

    /* renamed from: m  reason: collision with root package name */
    private final Path f9464m;

    /* renamed from: n  reason: collision with root package name */
    private final RectF f9465n;
    private final RectF o;
    private final Region p;
    private final Region q;
    private k r;
    private final Paint s;
    private final Paint t;
    private final g.b.a.c.b0.a u;
    private final l.a v;
    private final l w;
    private PorterDuffColorFilter x;
    private PorterDuffColorFilter y;
    private Rect z;

    /* compiled from: MaterialShapeDrawable */
    class a implements l.a {
        a() {
        }

        public void a(m mVar, Matrix matrix, int i2) {
            g.this.f9460i[i2] = mVar.e(matrix);
        }

        public void b(m mVar, Matrix matrix, int i2) {
            g.this.f9459h[i2] = mVar.e(matrix);
        }
    }

    /* compiled from: MaterialShapeDrawable */
    class b implements k.c {
        final /* synthetic */ float a;

        b(g gVar, float f2) {
            this.a = f2;
        }

        public c a(c cVar) {
            return cVar instanceof i ? cVar : new b(this.a, cVar);
        }
    }

    /* synthetic */ g(c cVar, a aVar) {
        this(cVar);
    }

    private float C() {
        if (K()) {
            return this.t.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean I() {
        c cVar = this.f9458g;
        int i2 = cVar.q;
        if (i2 == 1 || cVar.r <= 0 || (i2 != 2 && !R())) {
            return false;
        }
        return true;
    }

    private boolean J() {
        Paint.Style style = this.f9458g.v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean K() {
        Paint.Style style = this.f9458g.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.t.getStrokeWidth() > 0.0f;
    }

    private void M() {
        super.invalidateSelf();
    }

    private static int P(int i2, int i3) {
        return (i2 * (i3 + (i3 >>> 7))) >>> 8;
    }

    private void Q(Canvas canvas) {
        int y2 = y();
        int z2 = z();
        if (Build.VERSION.SDK_INT < 21) {
            Rect clipBounds = canvas.getClipBounds();
            int i2 = this.f9458g.r;
            clipBounds.inset(-i2, -i2);
            clipBounds.offset(y2, z2);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate((float) y2, (float) z2);
    }

    private boolean R() {
        return Build.VERSION.SDK_INT < 21 || (!O() && !this.f9463l.isConvex());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r2 = r2.getColor();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.PorterDuffColorFilter e(android.graphics.Paint r2, boolean r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0014
            int r2 = r2.getColor()
            int r3 = r1.k(r2)
            if (r3 == r2) goto L_0x0014
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r0)
            return r2
        L_0x0014:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.a.c.c0.g.e(android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    private boolean e0(int[] iArr) {
        boolean z2;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f9458g.f9466d == null || (color2 = this.s.getColor()) == (colorForState2 = this.f9458g.f9466d.getColorForState(iArr, color2))) {
            z2 = false;
        } else {
            this.s.setColor(colorForState2);
            z2 = true;
        }
        if (this.f9458g.f9467e == null || (color = this.t.getColor()) == (colorForState = this.f9458g.f9467e.getColorForState(iArr, color))) {
            return z2;
        }
        this.t.setColor(colorForState);
        return true;
    }

    private void f(RectF rectF, Path path) {
        g(rectF, path);
        if (this.f9458g.f9472j != 1.0f) {
            this.f9462k.reset();
            Matrix matrix = this.f9462k;
            float f2 = this.f9458g.f9472j;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f9462k);
        }
        path.computeBounds(this.A, true);
    }

    private boolean f0() {
        PorterDuffColorFilter porterDuffColorFilter = this.x;
        PorterDuffColorFilter porterDuffColorFilter2 = this.y;
        c cVar = this.f9458g;
        this.x = j(cVar.f9469g, cVar.f9470h, this.s, true);
        c cVar2 = this.f9458g;
        this.y = j(cVar2.f9468f, cVar2.f9470h, this.t, false);
        c cVar3 = this.f9458g;
        if (cVar3.u) {
            this.u.d(cVar3.f9469g.getColorForState(getState(), 0));
        }
        if (!e.h.j.c.a(porterDuffColorFilter, this.x) || !e.h.j.c.a(porterDuffColorFilter2, this.y)) {
            return true;
        }
        return false;
    }

    private void g0() {
        float H = H();
        this.f9458g.r = (int) Math.ceil((double) (0.75f * H));
        this.f9458g.s = (int) Math.ceil((double) (H * 0.25f));
        f0();
        M();
    }

    private void h() {
        k x2 = B().x(new b(this, -C()));
        this.r = x2;
        this.w.d(x2, this.f9458g.f9473k, u(), this.f9464m);
    }

    private PorterDuffColorFilter i(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z2) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z2) {
            colorForState = k(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z2) {
        if (colorStateList == null || mode == null) {
            return e(paint, z2);
        }
        return i(colorStateList, mode, z2);
    }

    private int k(int i2) {
        float H = H() + x();
        g.b.a.c.v.a aVar = this.f9458g.b;
        return aVar != null ? aVar.c(i2, H) : i2;
    }

    public static g l(Context context, float f2) {
        int b2 = g.b.a.c.s.a.b(context, g.b.a.c.b.colorSurface, g.class.getSimpleName());
        g gVar = new g();
        gVar.L(context);
        gVar.U(ColorStateList.valueOf(b2));
        gVar.T(f2);
        return gVar;
    }

    private void m(Canvas canvas) {
        if (this.f9458g.s != 0) {
            canvas.drawPath(this.f9463l, this.u.c());
        }
        for (int i2 = 0; i2 < 4; i2++) {
            this.f9459h[i2].b(this.u, this.f9458g.r, canvas);
            this.f9460i[i2].b(this.u, this.f9458g.r, canvas);
        }
        int y2 = y();
        int z2 = z();
        canvas.translate((float) (-y2), (float) (-z2));
        canvas.drawPath(this.f9463l, B);
        canvas.translate((float) y2, (float) z2);
    }

    private void n(Canvas canvas) {
        p(canvas, this.s, this.f9463l, this.f9458g.a, t());
    }

    private void p(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (kVar.u(rectF)) {
            float a2 = kVar.t().a(rectF);
            canvas.drawRoundRect(rectF, a2, a2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void q(Canvas canvas) {
        p(canvas, this.t, this.f9464m, this.r, u());
    }

    private RectF u() {
        RectF t2 = t();
        float C = C();
        this.o.set(t2.left + C, t2.top + C, t2.right - C, t2.bottom - C);
        return this.o;
    }

    public int A() {
        return this.f9458g.r;
    }

    public k B() {
        return this.f9458g.a;
    }

    public ColorStateList D() {
        return this.f9458g.f9469g;
    }

    public float E() {
        return this.f9458g.a.r().a(t());
    }

    public float F() {
        return this.f9458g.a.t().a(t());
    }

    public float G() {
        return this.f9458g.p;
    }

    public float H() {
        return v() + G();
    }

    public void L(Context context) {
        this.f9458g.b = new g.b.a.c.v.a(context);
        g0();
    }

    public boolean N() {
        g.b.a.c.v.a aVar = this.f9458g.b;
        return aVar != null && aVar.d();
    }

    public boolean O() {
        return this.f9458g.a.u(t());
    }

    public void S(float f2) {
        setShapeAppearanceModel(this.f9458g.a.w(f2));
    }

    public void T(float f2) {
        c cVar = this.f9458g;
        if (cVar.o != f2) {
            cVar.o = f2;
            g0();
        }
    }

    public void U(ColorStateList colorStateList) {
        c cVar = this.f9458g;
        if (cVar.f9466d != colorStateList) {
            cVar.f9466d = colorStateList;
            onStateChange(getState());
        }
    }

    public void V(float f2) {
        c cVar = this.f9458g;
        if (cVar.f9473k != f2) {
            cVar.f9473k = f2;
            this.f9461j = true;
            invalidateSelf();
        }
    }

    public void W(int i2, int i3, int i4, int i5) {
        c cVar = this.f9458g;
        if (cVar.f9471i == null) {
            cVar.f9471i = new Rect();
        }
        this.f9458g.f9471i.set(i2, i3, i4, i5);
        this.z = this.f9458g.f9471i;
        invalidateSelf();
    }

    public void X(float f2) {
        c cVar = this.f9458g;
        if (cVar.f9476n != f2) {
            cVar.f9476n = f2;
            g0();
        }
    }

    public void Y(int i2) {
        this.u.d(i2);
        this.f9458g.u = false;
        M();
    }

    public void Z(int i2) {
        c cVar = this.f9458g;
        if (cVar.t != i2) {
            cVar.t = i2;
            M();
        }
    }

    public void a0(float f2, int i2) {
        d0(f2);
        c0(ColorStateList.valueOf(i2));
    }

    public void b0(float f2, ColorStateList colorStateList) {
        d0(f2);
        c0(colorStateList);
    }

    public void c0(ColorStateList colorStateList) {
        c cVar = this.f9458g;
        if (cVar.f9467e != colorStateList) {
            cVar.f9467e = colorStateList;
            onStateChange(getState());
        }
    }

    public void d0(float f2) {
        this.f9458g.f9474l = f2;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.s.setColorFilter(this.x);
        int alpha = this.s.getAlpha();
        this.s.setAlpha(P(alpha, this.f9458g.f9475m));
        this.t.setColorFilter(this.y);
        this.t.setStrokeWidth(this.f9458g.f9474l);
        int alpha2 = this.t.getAlpha();
        this.t.setAlpha(P(alpha2, this.f9458g.f9475m));
        if (this.f9461j) {
            h();
            f(t(), this.f9463l);
            this.f9461j = false;
        }
        if (I()) {
            canvas.save();
            Q(canvas);
            int width = (int) (this.A.width() - ((float) getBounds().width()));
            int height = (int) (this.A.height() - ((float) getBounds().height()));
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.A.width()) + (this.f9458g.r * 2) + width, ((int) this.A.height()) + (this.f9458g.r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f2 = (float) ((getBounds().left - this.f9458g.r) - width);
            float f3 = (float) ((getBounds().top - this.f9458g.r) - height);
            canvas2.translate(-f2, -f3);
            m(canvas2);
            canvas.drawBitmap(createBitmap, f2, f3, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
        if (J()) {
            n(canvas);
        }
        if (K()) {
            q(canvas);
        }
        this.s.setAlpha(alpha);
        this.t.setAlpha(alpha2);
    }

    /* access modifiers changed from: protected */
    public final void g(RectF rectF, Path path) {
        l lVar = this.w;
        c cVar = this.f9458g;
        k kVar = cVar.a;
        float f2 = cVar.f9473k;
        lVar.e(kVar, f2, rectF, this.v, path);
    }

    public Drawable.ConstantState getConstantState() {
        return this.f9458g;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f9458g.q != 2) {
            if (O()) {
                outline.setRoundRect(getBounds(), E());
                return;
            }
            f(t(), this.f9463l);
            if (this.f9463l.isConvex()) {
                outline.setConvexPath(this.f9463l);
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.z;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.p.set(getBounds());
        f(t(), this.f9463l);
        this.q.setPath(this.f9463l, this.p);
        this.p.op(this.q, Region.Op.DIFFERENCE);
        return this.p;
    }

    public void invalidateSelf() {
        this.f9461j = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.f9458g.f9467e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.f9458g.f9466d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f9458g.f9469g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f9458g.f9468f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            g.b.a.c.c0.g$c r0 = r1.f9458g
            android.content.res.ColorStateList r0 = r0.f9469g
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            g.b.a.c.c0.g$c r0 = r1.f9458g
            android.content.res.ColorStateList r0 = r0.f9468f
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            g.b.a.c.c0.g$c r0 = r1.f9458g
            android.content.res.ColorStateList r0 = r0.f9467e
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            g.b.a.c.c0.g$c r0 = r1.f9458g
            android.content.res.ColorStateList r0 = r0.f9466d
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.a.c.c0.g.isStateful():boolean");
    }

    public Drawable mutate() {
        this.f9458g = new c(this.f9458g);
        return this;
    }

    /* access modifiers changed from: protected */
    public void o(Canvas canvas, Paint paint, Path path, RectF rectF) {
        p(canvas, paint, path, this.f9458g.a, rectF);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f9461j = true;
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z2 = e0(iArr) || f0();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    public float r() {
        return this.f9458g.a.j().a(t());
    }

    public float s() {
        return this.f9458g.a.l().a(t());
    }

    public void setAlpha(int i2) {
        c cVar = this.f9458g;
        if (cVar.f9475m != i2) {
            cVar.f9475m = i2;
            M();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f9458g.c = colorFilter;
        M();
    }

    public void setShapeAppearanceModel(k kVar) {
        this.f9458g.a = kVar;
        invalidateSelf();
    }

    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f9458g.f9469g = colorStateList;
        f0();
        M();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f9458g;
        if (cVar.f9470h != mode) {
            cVar.f9470h = mode;
            f0();
            M();
        }
    }

    /* access modifiers changed from: protected */
    public RectF t() {
        Rect bounds = getBounds();
        this.f9465n.set((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom);
        return this.f9465n;
    }

    public float v() {
        return this.f9458g.o;
    }

    public ColorStateList w() {
        return this.f9458g.f9466d;
    }

    public float x() {
        return this.f9458g.f9476n;
    }

    public int y() {
        c cVar = this.f9458g;
        return (int) (((double) cVar.s) * Math.sin(Math.toRadians((double) cVar.t)));
    }

    public int z() {
        c cVar = this.f9458g;
        return (int) (((double) cVar.s) * Math.cos(Math.toRadians((double) cVar.t)));
    }

    public g() {
        this(new k());
    }

    public g(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(k.e(context, attributeSet, i2, i3).m());
    }

    public g(k kVar) {
        this(new c(kVar, (g.b.a.c.v.a) null));
    }

    private g(c cVar) {
        this.f9459h = new m.g[4];
        this.f9460i = new m.g[4];
        this.f9462k = new Matrix();
        this.f9463l = new Path();
        this.f9464m = new Path();
        this.f9465n = new RectF();
        this.o = new RectF();
        this.p = new Region();
        this.q = new Region();
        this.s = new Paint(1);
        this.t = new Paint(1);
        this.u = new g.b.a.c.b0.a();
        this.w = new l();
        this.A = new RectF();
        this.f9458g = cVar;
        this.t.setStyle(Paint.Style.STROKE);
        this.s.setStyle(Paint.Style.FILL);
        B.setColor(-1);
        B.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        f0();
        e0(getState());
        this.v = new a();
    }

    /* compiled from: MaterialShapeDrawable */
    static final class c extends Drawable.ConstantState {
        public k a;
        public g.b.a.c.v.a b;
        public ColorFilter c;

        /* renamed from: d  reason: collision with root package name */
        public ColorStateList f9466d = null;

        /* renamed from: e  reason: collision with root package name */
        public ColorStateList f9467e = null;

        /* renamed from: f  reason: collision with root package name */
        public ColorStateList f9468f = null;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f9469g = null;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f9470h = PorterDuff.Mode.SRC_IN;

        /* renamed from: i  reason: collision with root package name */
        public Rect f9471i = null;

        /* renamed from: j  reason: collision with root package name */
        public float f9472j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f9473k = 1.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f9474l;

        /* renamed from: m  reason: collision with root package name */
        public int f9475m = 255;

        /* renamed from: n  reason: collision with root package name */
        public float f9476n = 0.0f;
        public float o = 0.0f;
        public float p = 0.0f;
        public int q = 0;
        public int r = 0;
        public int s = 0;
        public int t = 0;
        public boolean u = false;
        public Paint.Style v = Paint.Style.FILL_AND_STROKE;

        public c(k kVar, g.b.a.c.v.a aVar) {
            this.a = kVar;
            this.b = aVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            g gVar = new g(this, (a) null);
            boolean unused = gVar.f9461j = true;
            return gVar;
        }

        public c(c cVar) {
            this.a = cVar.a;
            this.b = cVar.b;
            this.f9474l = cVar.f9474l;
            this.c = cVar.c;
            this.f9466d = cVar.f9466d;
            this.f9467e = cVar.f9467e;
            this.f9470h = cVar.f9470h;
            this.f9469g = cVar.f9469g;
            this.f9475m = cVar.f9475m;
            this.f9472j = cVar.f9472j;
            this.s = cVar.s;
            this.q = cVar.q;
            this.u = cVar.u;
            this.f9473k = cVar.f9473k;
            this.f9476n = cVar.f9476n;
            this.o = cVar.o;
            this.p = cVar.p;
            this.r = cVar.r;
            this.t = cVar.t;
            this.f9468f = cVar.f9468f;
            this.v = cVar.v;
            if (cVar.f9471i != null) {
                this.f9471i = new Rect(cVar.f9471i);
            }
        }
    }
}
