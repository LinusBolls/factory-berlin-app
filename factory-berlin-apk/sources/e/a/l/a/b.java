package e.a.l.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

/* compiled from: DrawableContainer */
class b extends Drawable implements Drawable.Callback {

    /* renamed from: g  reason: collision with root package name */
    private c f8362g;

    /* renamed from: h  reason: collision with root package name */
    private Rect f8363h;

    /* renamed from: i  reason: collision with root package name */
    private Drawable f8364i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f8365j;

    /* renamed from: k  reason: collision with root package name */
    private int f8366k = 255;

    /* renamed from: l  reason: collision with root package name */
    private boolean f8367l;

    /* renamed from: m  reason: collision with root package name */
    private int f8368m = -1;

    /* renamed from: n  reason: collision with root package name */
    private boolean f8369n;
    private Runnable o;
    private long p;
    private long q;
    private C0552b r;

    /* compiled from: DrawableContainer */
    class a implements Runnable {
        a() {
        }

        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: e.a.l.a.b$b  reason: collision with other inner class name */
    /* compiled from: DrawableContainer */
    static class C0552b implements Drawable.Callback {

        /* renamed from: g  reason: collision with root package name */
        private Drawable.Callback f8371g;

        C0552b() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f8371g;
            this.f8371g = null;
            return callback;
        }

        public C0552b b(Drawable.Callback callback) {
            this.f8371g = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            Drawable.Callback callback = this.f8371g;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j2);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f8371g;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* compiled from: DrawableContainer */
    static abstract class c extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;
        final b a;
        Resources b;
        int c = 160;

        /* renamed from: d  reason: collision with root package name */
        int f8372d;

        /* renamed from: e  reason: collision with root package name */
        int f8373e;

        /* renamed from: f  reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f8374f;

        /* renamed from: g  reason: collision with root package name */
        Drawable[] f8375g;

        /* renamed from: h  reason: collision with root package name */
        int f8376h;

        /* renamed from: i  reason: collision with root package name */
        boolean f8377i;

        /* renamed from: j  reason: collision with root package name */
        boolean f8378j;

        /* renamed from: k  reason: collision with root package name */
        Rect f8379k;

        /* renamed from: l  reason: collision with root package name */
        boolean f8380l;

        /* renamed from: m  reason: collision with root package name */
        boolean f8381m;

        /* renamed from: n  reason: collision with root package name */
        int f8382n;
        int o;
        int p;
        int q;
        boolean r;
        int s;
        boolean t;
        boolean u;
        boolean v;
        boolean w;
        boolean x;
        boolean y;
        int z;

        c(c cVar, b bVar, Resources resources) {
            Resources resources2;
            this.f8377i = false;
            this.f8380l = false;
            this.x = true;
            this.A = 0;
            this.B = 0;
            this.a = bVar;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = cVar != null ? cVar.b : null;
            }
            this.b = resources2;
            int f2 = b.f(resources, cVar != null ? cVar.c : 0);
            this.c = f2;
            if (cVar != null) {
                this.f8372d = cVar.f8372d;
                this.f8373e = cVar.f8373e;
                this.v = true;
                this.w = true;
                this.f8377i = cVar.f8377i;
                this.f8380l = cVar.f8380l;
                this.x = cVar.x;
                this.y = cVar.y;
                this.z = cVar.z;
                this.A = cVar.A;
                this.B = cVar.B;
                this.C = cVar.C;
                this.D = cVar.D;
                this.E = cVar.E;
                this.F = cVar.F;
                this.G = cVar.G;
                this.H = cVar.H;
                this.I = cVar.I;
                if (cVar.c == f2) {
                    if (cVar.f8378j) {
                        this.f8379k = new Rect(cVar.f8379k);
                        this.f8378j = true;
                    }
                    if (cVar.f8381m) {
                        this.f8382n = cVar.f8382n;
                        this.o = cVar.o;
                        this.p = cVar.p;
                        this.q = cVar.q;
                        this.f8381m = true;
                    }
                }
                if (cVar.r) {
                    this.s = cVar.s;
                    this.r = true;
                }
                if (cVar.t) {
                    this.u = cVar.u;
                    this.t = true;
                }
                Drawable[] drawableArr = cVar.f8375g;
                this.f8375g = new Drawable[drawableArr.length];
                this.f8376h = cVar.f8376h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f8374f;
                if (sparseArray != null) {
                    this.f8374f = sparseArray.clone();
                } else {
                    this.f8374f = new SparseArray<>(this.f8376h);
                }
                int i2 = this.f8376h;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null) {
                        Drawable.ConstantState constantState = drawableArr[i3].getConstantState();
                        if (constantState != null) {
                            this.f8374f.put(i3, constantState);
                        } else {
                            this.f8375g[i3] = drawableArr[i3];
                        }
                    }
                }
                return;
            }
            this.f8375g = new Drawable[10];
            this.f8376h = 0;
        }

        private void e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f8374f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f8375g[this.f8374f.keyAt(i2)] = s(this.f8374f.valueAt(i2).newDrawable(this.b));
                }
                this.f8374f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.a);
            return mutate;
        }

        public final int a(Drawable drawable) {
            int i2 = this.f8376h;
            if (i2 >= this.f8375g.length) {
                o(i2, i2 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.a);
            this.f8375g[i2] = drawable;
            this.f8376h++;
            this.f8373e = drawable.getChangingConfigurations() | this.f8373e;
            p();
            this.f8379k = null;
            this.f8378j = false;
            this.f8381m = false;
            this.v = false;
            return i2;
        }

        /* access modifiers changed from: package-private */
        public final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i2 = this.f8376h;
                Drawable[] drawableArr = this.f8375g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null && drawableArr[i3].canApplyTheme()) {
                        drawableArr[i3].applyTheme(theme);
                        this.f8373e |= drawableArr[i3].getChangingConfigurations();
                    }
                }
                y(theme.getResources());
            }
        }

        public synchronized boolean c() {
            if (this.v) {
                return this.w;
            }
            e();
            this.v = true;
            int i2 = this.f8376h;
            Drawable[] drawableArr = this.f8375g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getConstantState() == null) {
                    this.w = false;
                    return false;
                }
            }
            this.w = true;
            return true;
        }

        public boolean canApplyTheme() {
            int i2 = this.f8376h;
            Drawable[] drawableArr = this.f8375g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f8374f.get(i3);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void d() {
            this.f8381m = true;
            e();
            int i2 = this.f8376h;
            Drawable[] drawableArr = this.f8375g;
            this.o = -1;
            this.f8382n = -1;
            this.q = 0;
            this.p = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f8382n) {
                    this.f8382n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.o) {
                    this.o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.p) {
                    this.p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final int f() {
            return this.f8375g.length;
        }

        public final Drawable g(int i2) {
            int indexOfKey;
            Drawable drawable = this.f8375g[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f8374f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable s2 = s(this.f8374f.valueAt(indexOfKey).newDrawable(this.b));
            this.f8375g[i2] = s2;
            this.f8374f.removeAt(indexOfKey);
            if (this.f8374f.size() == 0) {
                this.f8374f = null;
            }
            return s2;
        }

        public int getChangingConfigurations() {
            return this.f8372d | this.f8373e;
        }

        public final int h() {
            return this.f8376h;
        }

        public final int i() {
            if (!this.f8381m) {
                d();
            }
            return this.o;
        }

        public final int j() {
            if (!this.f8381m) {
                d();
            }
            return this.q;
        }

        public final int k() {
            if (!this.f8381m) {
                d();
            }
            return this.p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f8377i) {
                return null;
            }
            if (this.f8379k != null || this.f8378j) {
                return this.f8379k;
            }
            e();
            Rect rect2 = new Rect();
            int i2 = this.f8376h;
            Drawable[] drawableArr = this.f8375g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getPadding(rect2)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i4 = rect2.left;
                    if (i4 > rect.left) {
                        rect.left = i4;
                    }
                    int i5 = rect2.top;
                    if (i5 > rect.top) {
                        rect.top = i5;
                    }
                    int i6 = rect2.right;
                    if (i6 > rect.right) {
                        rect.right = i6;
                    }
                    int i7 = rect2.bottom;
                    if (i7 > rect.bottom) {
                        rect.bottom = i7;
                    }
                }
            }
            this.f8378j = true;
            this.f8379k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f8381m) {
                d();
            }
            return this.f8382n;
        }

        public final int n() {
            if (this.r) {
                return this.s;
            }
            e();
            int i2 = this.f8376h;
            Drawable[] drawableArr = this.f8375g;
            int opacity = i2 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i3 = 1; i3 < i2; i3++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i3].getOpacity());
            }
            this.s = opacity;
            this.r = true;
            return opacity;
        }

        public void o(int i2, int i3) {
            Drawable[] drawableArr = new Drawable[i3];
            System.arraycopy(this.f8375g, 0, drawableArr, 0, i2);
            this.f8375g = drawableArr;
        }

        /* access modifiers changed from: package-private */
        public void p() {
            this.r = false;
            this.t = false;
        }

        public final boolean q() {
            return this.f8380l;
        }

        /* access modifiers changed from: package-private */
        public abstract void r();

        public final void t(boolean z2) {
            this.f8380l = z2;
        }

        public final void u(int i2) {
            this.A = i2;
        }

        public final void v(int i2) {
            this.B = i2;
        }

        /* access modifiers changed from: package-private */
        public final boolean w(int i2, int i3) {
            int i4 = this.f8376h;
            Drawable[] drawableArr = this.f8375g;
            boolean z2 = false;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i5].setLayoutDirection(i2) : false;
                    if (i5 == i3) {
                        z2 = layoutDirection;
                    }
                }
            }
            this.z = i2;
            return z2;
        }

        public final void x(boolean z2) {
            this.f8377i = z2;
        }

        /* access modifiers changed from: package-private */
        public final void y(Resources resources) {
            if (resources != null) {
                this.b = resources;
                int f2 = b.f(resources, this.c);
                int i2 = this.c;
                this.c = f2;
                if (i2 != f2) {
                    this.f8381m = false;
                    this.f8378j = false;
                }
            }
        }
    }

    b() {
    }

    private void d(Drawable drawable) {
        if (this.r == null) {
            this.r = new C0552b();
        }
        C0552b bVar = this.r;
        bVar.b(drawable.getCallback());
        drawable.setCallback(bVar);
        try {
            if (this.f8362g.A <= 0 && this.f8367l) {
                drawable.setAlpha(this.f8366k);
            }
            if (this.f8362g.E) {
                drawable.setColorFilter(this.f8362g.D);
            } else {
                if (this.f8362g.H) {
                    androidx.core.graphics.drawable.a.o(drawable, this.f8362g.F);
                }
                if (this.f8362g.I) {
                    androidx.core.graphics.drawable.a.p(drawable, this.f8362g.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f8362g.x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (Build.VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f8362g.C);
            }
            Rect rect = this.f8363h;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.r.a());
        }
    }

    private boolean e() {
        if (!isAutoMirrored() || androidx.core.graphics.drawable.a.f(this) != 1) {
            return false;
        }
        return true;
    }

    static int f(Resources resources, int i2) {
        if (resources != null) {
            i2 = resources.getDisplayMetrics().densityDpi;
        }
        if (i2 == 0) {
            return 160;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f8367l = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f8364i
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0038
            long r9 = r13.p
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x003a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f8366k
            r3.setAlpha(r9)
            r13.p = r7
            goto L_0x003a
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            e.a.l.a.b$c r9 = r13.f8362g
            int r9 = r9.A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f8366k
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x003b
        L_0x0038:
            r13.p = r7
        L_0x003a:
            r3 = 0
        L_0x003b:
            android.graphics.drawable.Drawable r9 = r13.f8365j
            if (r9 == 0) goto L_0x0065
            long r10 = r13.q
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0067
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0052
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f8365j = r0
            r13.q = r7
            goto L_0x0067
        L_0x0052:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            e.a.l.a.b$c r4 = r13.f8362g
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f8366k
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0068
        L_0x0065:
            r13.q = r7
        L_0x0067:
            r0 = r3
        L_0x0068:
            if (r14 == 0) goto L_0x0074
            if (r0 == 0) goto L_0x0074
            java.lang.Runnable r14 = r13.o
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.l.a.b.a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        this.f8362g.b(theme);
    }

    /* access modifiers changed from: package-private */
    public abstract c b();

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f8368m;
    }

    public boolean canApplyTheme() {
        return this.f8362g.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f8364i;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f8365j;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f8368m
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            e.a.l.a.b$c r0 = r9.f8362g
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f8365j
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f8364i
            if (r0 == 0) goto L_0x0029
            r9.f8365j = r0
            e.a.l.a.b$c r0 = r9.f8362g
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.q = r0
            goto L_0x0035
        L_0x0029:
            r9.f8365j = r4
            r9.q = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f8364i
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            e.a.l.a.b$c r0 = r9.f8362g
            int r1 = r0.f8376h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f8364i = r0
            r9.f8368m = r10
            if (r0 == 0) goto L_0x005a
            e.a.l.a.b$c r10 = r9.f8362g
            int r10 = r10.A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.p = r2
        L_0x0051:
            r9.d(r0)
            goto L_0x005a
        L_0x0055:
            r9.f8364i = r4
            r10 = -1
            r9.f8368m = r10
        L_0x005a:
            long r0 = r9.p
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.q
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.o
            if (r0 != 0) goto L_0x0073
            e.a.l.a.b$a r0 = new e.a.l.a.b$a
            r0.<init>()
            r9.o = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.a(r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.l.a.b.g(int):boolean");
    }

    public int getAlpha() {
        return this.f8366k;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f8362g.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f8362g.c()) {
            return null;
        }
        this.f8362g.f8372d = getChangingConfigurations();
        return this.f8362g;
    }

    public Drawable getCurrent() {
        return this.f8364i;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f8363h;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f8362g.q()) {
            return this.f8362g.i();
        }
        Drawable drawable = this.f8364i;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f8362g.q()) {
            return this.f8362g.m();
        }
        Drawable drawable = this.f8364i;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f8362g.q()) {
            return this.f8362g.j();
        }
        Drawable drawable = this.f8364i;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f8362g.q()) {
            return this.f8362g.k();
        }
        Drawable drawable = this.f8364i;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f8364i;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f8362g.n();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f8364i;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect l2 = this.f8362g.l();
        if (l2 != null) {
            rect.set(l2);
            z = (l2.right | ((l2.left | l2.top) | l2.bottom)) != 0;
        } else {
            Drawable drawable = this.f8364i;
            if (drawable != null) {
                z = drawable.getPadding(rect);
            } else {
                z = super.getPadding(rect);
            }
        }
        if (e()) {
            int i2 = rect.left;
            rect.left = rect.right;
            rect.right = i2;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public void h(c cVar) {
        this.f8362g = cVar;
        int i2 = this.f8368m;
        if (i2 >= 0) {
            Drawable g2 = cVar.g(i2);
            this.f8364i = g2;
            if (g2 != null) {
                d(g2);
            }
        }
        this.f8365j = null;
    }

    /* access modifiers changed from: package-private */
    public final void i(Resources resources) {
        this.f8362g.y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        c cVar = this.f8362g;
        if (cVar != null) {
            cVar.p();
        }
        if (drawable == this.f8364i && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f8362g.C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f8365j;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f8365j = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f8364i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f8367l) {
                this.f8364i.setAlpha(this.f8366k);
            }
        }
        if (this.q != 0) {
            this.q = 0;
            z = true;
        }
        if (this.p != 0) {
            this.p = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f8369n && super.mutate() == this) {
            c b = b();
            b.r();
            h(b);
            this.f8369n = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f8365j;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f8364i;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i2) {
        return this.f8362g.w(i2, c());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        Drawable drawable = this.f8365j;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f8364i;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f8365j;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f8364i;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable == this.f8364i && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        if (!this.f8367l || this.f8366k != i2) {
            this.f8367l = true;
            this.f8366k = i2;
            Drawable drawable = this.f8364i;
            if (drawable == null) {
                return;
            }
            if (this.p == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        c cVar = this.f8362g;
        if (cVar.C != z) {
            cVar.C = z;
            Drawable drawable = this.f8364i;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.j(drawable, z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f8362g;
        cVar.E = true;
        if (cVar.D != colorFilter) {
            cVar.D = colorFilter;
            Drawable drawable = this.f8364i;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        c cVar = this.f8362g;
        if (cVar.x != z) {
            cVar.x = z;
            Drawable drawable = this.f8364i;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f8364i;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, f2, f3);
        }
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f8363h;
        if (rect == null) {
            this.f8363h = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f8364i;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.l(drawable, i2, i3, i4, i5);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.f8362g;
        cVar.H = true;
        if (cVar.F != colorStateList) {
            cVar.F = colorStateList;
            androidx.core.graphics.drawable.a.o(this.f8364i, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f8362g;
        cVar.I = true;
        if (cVar.G != mode) {
            cVar.G = mode;
            androidx.core.graphics.drawable.a.p(this.f8364i, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f8365j;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f8364i;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f8364i && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
