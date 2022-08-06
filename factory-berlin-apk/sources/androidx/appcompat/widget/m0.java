package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import e.e.h;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: ResourceManagerInternal */
public final class m0 {

    /* renamed from: h  reason: collision with root package name */
    private static final PorterDuff.Mode f465h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i  reason: collision with root package name */
    private static m0 f466i;

    /* renamed from: j  reason: collision with root package name */
    private static final c f467j = new c(6);
    private WeakHashMap<Context, h<ColorStateList>> a;
    private e.e.a<String, d> b;
    private h<String> c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakHashMap<Context, e.e.d<WeakReference<Drawable.ConstantState>>> f468d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    private TypedValue f469e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f470f;

    /* renamed from: g  reason: collision with root package name */
    private e f471g;

    /* compiled from: ResourceManagerInternal */
    static class a implements d {
        a() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return e.a.l.a.a.m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal */
    private static class b implements d {
        b() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return e.v.a.a.b.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal */
    private static class c extends e.e.e<Integer, PorterDuffColorFilter> {
        public c(int i2) {
            super(i2);
        }

        private static int i(int i2, PorterDuff.Mode mode) {
            return ((i2 + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter j(int i2, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) c(Integer.valueOf(i(i2, mode)));
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter k(int i2, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) d(Integer.valueOf(i(i2, mode)), porterDuffColorFilter);
        }
    }

    /* compiled from: ResourceManagerInternal */
    private interface d {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* compiled from: ResourceManagerInternal */
    interface e {
        boolean a(Context context, int i2, Drawable drawable);

        PorterDuff.Mode b(int i2);

        Drawable c(m0 m0Var, Context context, int i2);

        ColorStateList d(Context context, int i2);

        boolean e(Context context, int i2, Drawable drawable);
    }

    /* compiled from: ResourceManagerInternal */
    private static class f implements d {
        f() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return e.v.a.a.h.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
                return null;
            }
        }
    }

    private void a(String str, d dVar) {
        if (this.b == null) {
            this.b = new e.e.a<>();
        }
        this.b.put(str, dVar);
    }

    private synchronized boolean b(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        e.e.d dVar = this.f468d.get(context);
        if (dVar == null) {
            dVar = new e.e.d();
            this.f468d.put(context, dVar);
        }
        dVar.s(j2, new WeakReference(constantState));
        return true;
    }

    private void c(Context context, int i2, ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new WeakHashMap<>();
        }
        h hVar = this.a.get(context);
        if (hVar == null) {
            hVar = new h();
            this.a.put(context, hVar);
        }
        hVar.c(i2, colorStateList);
    }

    private void d(Context context) {
        if (!this.f470f) {
            this.f470f = true;
            Drawable j2 = j(context, e.a.m.a.abc_vector_test);
            if (j2 == null || !q(j2)) {
                this.f470f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    private static long e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable f(Context context, int i2) {
        Drawable drawable;
        if (this.f469e == null) {
            this.f469e = new TypedValue();
        }
        TypedValue typedValue = this.f469e;
        context.getResources().getValue(i2, typedValue, true);
        long e2 = e(typedValue);
        Drawable i3 = i(context, e2);
        if (i3 != null) {
            return i3;
        }
        e eVar = this.f471g;
        if (eVar == null) {
            drawable = null;
        } else {
            drawable = eVar.c(this, context, i2);
        }
        if (drawable != null) {
            drawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e2, drawable);
        }
        return drawable;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized m0 h() {
        m0 m0Var;
        synchronized (m0.class) {
            if (f466i == null) {
                m0 m0Var2 = new m0();
                f466i = m0Var2;
                p(m0Var2);
            }
            m0Var = f466i;
        }
        return m0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable i(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, e.e.d<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f468d     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            e.e.d r0 = (e.e.d) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.h(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.f(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.m0.i(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public static synchronized PorterDuffColorFilter l(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter j2;
        synchronized (m0.class) {
            j2 = f467j.j(i2, mode);
            if (j2 == null) {
                j2 = new PorterDuffColorFilter(i2, mode);
                f467j.k(i2, mode, j2);
            }
        }
        return j2;
    }

    private ColorStateList n(Context context, int i2) {
        h hVar;
        WeakHashMap<Context, h<ColorStateList>> weakHashMap = this.a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) hVar.g(i2);
    }

    private static void p(m0 m0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            m0Var.a("vector", new f());
            m0Var.a("animated-vector", new b());
            m0Var.a("animated-selector", new a());
        }
    }

    private static boolean q(Drawable drawable) {
        return (drawable instanceof e.v.a.a.h) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable r(android.content.Context r11, int r12) {
        /*
            r10 = this;
            e.e.a<java.lang.String, androidx.appcompat.widget.m0$d> r0 = r10.b
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b2
            e.e.h<java.lang.String> r0 = r10.c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.g(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            e.e.a<java.lang.String, androidx.appcompat.widget.m0$d> r3 = r10.b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            e.e.h r0 = new e.e.h
            r0.<init>()
            r10.c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f469e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f469e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f469e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = e(r0)
            android.graphics.drawable.Drawable r6 = r10.i(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00aa
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            e.e.h<java.lang.String> r8 = r10.c     // Catch:{ Exception -> 0x00a2 }
            r8.c(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            e.e.a<java.lang.String, androidx.appcompat.widget.m0$d> r8 = r10.b     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.appcompat.widget.m0$d r3 = (androidx.appcompat.widget.m0.d) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00aa
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.b(r11, r4, r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00aa
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            r11 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00aa:
            if (r6 != 0) goto L_0x00b1
            e.e.h<java.lang.String> r11 = r10.c
            r11.c(r12, r2)
        L_0x00b1:
            return r6
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.m0.r(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    private Drawable v(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList m2 = m(context, i2);
        if (m2 != null) {
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r = androidx.core.graphics.drawable.a.r(drawable);
            androidx.core.graphics.drawable.a.o(r, m2);
            PorterDuff.Mode o = o(i2);
            if (o == null) {
                return r;
            }
            androidx.core.graphics.drawable.a.p(r, o);
            return r;
        }
        e eVar = this.f471g;
        if ((eVar == null || !eVar.e(context, i2, drawable)) && !x(context, i2, drawable) && z) {
            return null;
        }
        return drawable;
    }

    static void w(Drawable drawable, u0 u0Var, int[] iArr) {
        if (!e0.a(drawable) || drawable.mutate() == drawable) {
            if (u0Var.f513d || u0Var.c) {
                drawable.setColorFilter(g(u0Var.f513d ? u0Var.a : null, u0Var.c ? u0Var.b : f465h, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public synchronized Drawable j(Context context, int i2) {
        return k(context, i2, false);
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable k(Context context, int i2, boolean z) {
        Drawable r;
        d(context);
        r = r(context, i2);
        if (r == null) {
            r = f(context, i2);
        }
        if (r == null) {
            r = androidx.core.content.a.f(context, i2);
        }
        if (r != null) {
            r = v(context, i2, z, r);
        }
        if (r != null) {
            e0.b(r);
        }
        return r;
    }

    /* access modifiers changed from: package-private */
    public synchronized ColorStateList m(Context context, int i2) {
        ColorStateList n2;
        n2 = n(context, i2);
        if (n2 == null) {
            n2 = this.f471g == null ? null : this.f471g.d(context, i2);
            if (n2 != null) {
                c(context, i2, n2);
            }
        }
        return n2;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode o(int i2) {
        e eVar = this.f471g;
        if (eVar == null) {
            return null;
        }
        return eVar.b(i2);
    }

    public synchronized void s(Context context) {
        e.e.d dVar = this.f468d.get(context);
        if (dVar != null) {
            dVar.d();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable t(Context context, b1 b1Var, int i2) {
        Drawable r = r(context, i2);
        if (r == null) {
            r = b1Var.c(i2);
        }
        if (r == null) {
            return null;
        }
        return v(context, i2, false, r);
    }

    public synchronized void u(e eVar) {
        this.f471g = eVar;
    }

    /* access modifiers changed from: package-private */
    public boolean x(Context context, int i2, Drawable drawable) {
        e eVar = this.f471g;
        return eVar != null && eVar.a(context, i2, drawable);
    }
}
