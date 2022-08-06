package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.w0;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import e.a.n.b;
import e.a.n.f;
import e.h.k.a0;
import e.h.k.f;
import e.h.k.q;
import e.h.k.u;
import e.h.k.y;
import e.h.k.z;
import java.lang.Thread;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: AppCompatDelegateImpl */
class f extends e implements g.a, LayoutInflater.Factory2 {
    private static final Map<Class<?>, Integer> g0 = new e.e.a();
    private static final boolean h0 = (Build.VERSION.SDK_INT < 21);
    private static final int[] i0 = {16842836};
    private static boolean j0 = true;
    private static final boolean k0;
    private boolean A;
    private ViewGroup B;
    private TextView C;
    private View D;
    private boolean E;
    private boolean F;
    boolean G;
    boolean H;
    boolean I;
    boolean J;
    boolean K;
    private boolean L;
    private o[] M;
    private o N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    boolean S;
    private int T;
    private int U;
    private boolean V;
    private boolean W;
    private l X;
    private l Y;
    boolean Z;
    int a0;
    private final Runnable b0;
    private boolean c0;
    private Rect d0;
    private Rect e0;
    private AppCompatViewInflater f0;

    /* renamed from: j  reason: collision with root package name */
    final Object f126j;

    /* renamed from: k  reason: collision with root package name */
    final Context f127k;

    /* renamed from: l  reason: collision with root package name */
    Window f128l;

    /* renamed from: m  reason: collision with root package name */
    private j f129m;

    /* renamed from: n  reason: collision with root package name */
    final d f130n;
    a o;
    MenuInflater p;
    private CharSequence q;
    private c0 r;
    private h s;
    private p t;
    e.a.n.b u;
    ActionBarContextView v;
    PopupWindow w;
    Runnable x;
    y y;
    private boolean z;

    /* compiled from: AppCompatDelegateImpl */
    static class a implements Thread.UncaughtExceptionHandler {
        final /* synthetic */ Thread.UncaughtExceptionHandler a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            if (message.contains("drawable") || message.contains("Drawable")) {
                return true;
            }
            return false;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.a.uncaughtException(thread, notFoundException);
                return;
            }
            this.a.uncaughtException(thread, th);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class b implements Runnable {
        b() {
        }

        public void run() {
            f fVar = f.this;
            if ((fVar.a0 & 1) != 0) {
                fVar.S(0);
            }
            f fVar2 = f.this;
            if ((fVar2.a0 & 4096) != 0) {
                fVar2.S(108);
            }
            f fVar3 = f.this;
            fVar3.Z = false;
            fVar3.a0 = 0;
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class c implements q {
        c() {
        }

        public e.h.k.c0 a(View view, e.h.k.c0 c0Var) {
            int g2 = c0Var.g();
            int I0 = f.this.I0(g2);
            if (g2 != I0) {
                c0Var = c0Var.j(c0Var.e(), I0, c0Var.f(), c0Var.d());
            }
            return u.S(view, c0Var);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class d implements g0.a {
        d() {
        }

        public void a(Rect rect) {
            rect.top = f.this.I0(rect.top);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class e implements ContentFrameLayout.a {
        e() {
        }

        public void a() {
        }

        public void onDetachedFromWindow() {
            f.this.Q();
        }
    }

    /* renamed from: androidx.appcompat.app.f$f  reason: collision with other inner class name */
    /* compiled from: AppCompatDelegateImpl */
    class C0004f implements Runnable {

        /* renamed from: androidx.appcompat.app.f$f$a */
        /* compiled from: AppCompatDelegateImpl */
        class a extends a0 {
            a() {
            }

            public void b(View view) {
                f.this.v.setAlpha(1.0f);
                f.this.y.f((z) null);
                f.this.y = null;
            }

            public void c(View view) {
                f.this.v.setVisibility(0);
            }
        }

        C0004f() {
        }

        public void run() {
            f fVar = f.this;
            fVar.w.showAtLocation(fVar.v, 55, 0, 0);
            f.this.T();
            if (f.this.A0()) {
                f.this.v.setAlpha(0.0f);
                f fVar2 = f.this;
                y c = u.c(fVar2.v);
                c.a(1.0f);
                fVar2.y = c;
                f.this.y.f(new a());
                return;
            }
            f.this.v.setAlpha(1.0f);
            f.this.v.setVisibility(0);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class g extends a0 {
        g() {
        }

        public void b(View view) {
            f.this.v.setAlpha(1.0f);
            f.this.y.f((z) null);
            f.this.y = null;
        }

        public void c(View view) {
            f.this.v.setVisibility(0);
            f.this.v.sendAccessibilityEvent(32);
            if (f.this.v.getParent() instanceof View) {
                u.c0((View) f.this.v.getParent());
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private final class h implements m.a {
        h() {
        }

        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
            f.this.K(gVar);
        }

        public boolean b(androidx.appcompat.view.menu.g gVar) {
            Window.Callback c0 = f.this.c0();
            if (c0 == null) {
                return true;
            }
            c0.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class i implements b.a {
        private b.a a;

        /* compiled from: AppCompatDelegateImpl */
        class a extends a0 {
            a() {
            }

            public void b(View view) {
                f.this.v.setVisibility(8);
                f fVar = f.this;
                PopupWindow popupWindow = fVar.w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.v.getParent() instanceof View) {
                    u.c0((View) f.this.v.getParent());
                }
                f.this.v.removeAllViews();
                f.this.y.f((z) null);
                f.this.y = null;
            }
        }

        public i(b.a aVar) {
            this.a = aVar;
        }

        public boolean a(e.a.n.b bVar, Menu menu) {
            return this.a.a(bVar, menu);
        }

        public void b(e.a.n.b bVar) {
            this.a.b(bVar);
            f fVar = f.this;
            if (fVar.w != null) {
                fVar.f128l.getDecorView().removeCallbacks(f.this.x);
            }
            f fVar2 = f.this;
            if (fVar2.v != null) {
                fVar2.T();
                f fVar3 = f.this;
                y c = u.c(fVar3.v);
                c.a(0.0f);
                fVar3.y = c;
                f.this.y.f(new a());
            }
            f fVar4 = f.this;
            d dVar = fVar4.f130n;
            if (dVar != null) {
                dVar.g(fVar4.u);
            }
            f.this.u = null;
        }

        public boolean c(e.a.n.b bVar, MenuItem menuItem) {
            return this.a.c(bVar, menuItem);
        }

        public boolean d(e.a.n.b bVar, Menu menu) {
            return this.a.d(bVar, menu);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private class k extends l {
        private final PowerManager c;

        k(Context context) {
            super();
            this.c = (PowerManager) context.getSystemService("power");
        }

        /* access modifiers changed from: package-private */
        public IntentFilter b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        public int c() {
            if (Build.VERSION.SDK_INT < 21 || !this.c.isPowerSaveMode()) {
                return 1;
            }
            return 2;
        }

        public void d() {
            f.this.E();
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    abstract class l {
        private BroadcastReceiver a;

        /* compiled from: AppCompatDelegateImpl */
        class a extends BroadcastReceiver {
            a() {
            }

            public void onReceive(Context context, Intent intent) {
                l.this.d();
            }
        }

        l() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                try {
                    f.this.f127k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        /* access modifiers changed from: package-private */
        public abstract IntentFilter b();

        /* access modifiers changed from: package-private */
        public abstract int c();

        /* access modifiers changed from: package-private */
        public abstract void d();

        /* access modifiers changed from: package-private */
        public void e() {
            a();
            IntentFilter b2 = b();
            if (b2 != null && b2.countActions() != 0) {
                if (this.a == null) {
                    this.a = new a();
                }
                f.this.f127k.registerReceiver(this.a, b2);
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private class m extends l {
        private final j c;

        m(j jVar) {
            super();
            this.c = jVar;
        }

        /* access modifiers changed from: package-private */
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        public int c() {
            return this.c.d() ? 2 : 1;
        }

        public void d() {
            f.this.E();
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private class n extends ContentFrameLayout {
        public n(Context context) {
            super(context);
        }

        private boolean c(int i2, int i3) {
            return i2 < -5 || i3 < -5 || i2 > getWidth() + 5 || i3 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.R(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            f.this.M(0);
            return true;
        }

        public void setBackgroundResource(int i2) {
            setBackgroundDrawable(e.a.k.a.a.d(getContext(), i2));
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    protected static final class o {
        int a;
        int b;
        int c;

        /* renamed from: d  reason: collision with root package name */
        int f137d;

        /* renamed from: e  reason: collision with root package name */
        int f138e;

        /* renamed from: f  reason: collision with root package name */
        int f139f;

        /* renamed from: g  reason: collision with root package name */
        ViewGroup f140g;

        /* renamed from: h  reason: collision with root package name */
        View f141h;

        /* renamed from: i  reason: collision with root package name */
        View f142i;

        /* renamed from: j  reason: collision with root package name */
        androidx.appcompat.view.menu.g f143j;

        /* renamed from: k  reason: collision with root package name */
        androidx.appcompat.view.menu.e f144k;

        /* renamed from: l  reason: collision with root package name */
        Context f145l;

        /* renamed from: m  reason: collision with root package name */
        boolean f146m;

        /* renamed from: n  reason: collision with root package name */
        boolean f147n;
        boolean o;
        public boolean p;
        boolean q = false;
        boolean r;
        Bundle s;

        o(int i2) {
            this.a = i2;
        }

        /* access modifiers changed from: package-private */
        public androidx.appcompat.view.menu.n a(m.a aVar) {
            if (this.f143j == null) {
                return null;
            }
            if (this.f144k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.f145l, e.a.g.abc_list_menu_item_layout);
                this.f144k = eVar;
                eVar.m(aVar);
                this.f143j.b(this.f144k);
            }
            return this.f144k.e(this.f140g);
        }

        public boolean b() {
            if (this.f141h == null) {
                return false;
            }
            if (this.f142i == null && this.f144k.c().getCount() <= 0) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public void c(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.f143j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.Q(this.f144k);
                }
                this.f143j = gVar;
                if (gVar != null && (eVar = this.f144k) != null) {
                    gVar.b(eVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(e.a.a.actionBarPopupTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            }
            newTheme.resolveAttribute(e.a.a.panelMenuListTheme, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 != 0) {
                newTheme.applyStyle(i3, true);
            } else {
                newTheme.applyStyle(e.a.i.Theme_AppCompat_CompactMenu, true);
            }
            e.a.n.d dVar = new e.a.n.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f145l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(e.a.j.AppCompatTheme);
            this.b = obtainStyledAttributes.getResourceId(e.a.j.AppCompatTheme_panelBackground, 0);
            this.f139f = obtainStyledAttributes.getResourceId(e.a.j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private final class p implements m.a {
        p() {
        }

        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
            androidx.appcompat.view.menu.g F = gVar.F();
            boolean z2 = F != gVar;
            f fVar = f.this;
            if (z2) {
                gVar = F;
            }
            o W = fVar.W(gVar);
            if (W == null) {
                return;
            }
            if (z2) {
                f.this.J(W.a, W, F);
                f.this.N(W, true);
                return;
            }
            f.this.N(W, z);
        }

        public boolean b(androidx.appcompat.view.menu.g gVar) {
            Window.Callback c0;
            if (gVar != null) {
                return true;
            }
            f fVar = f.this;
            if (!fVar.G || (c0 = fVar.c0()) == null || f.this.S) {
                return true;
            }
            c0.onMenuOpened(108, gVar);
            return true;
        }
    }

    static {
        boolean z2 = false;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21 && i2 <= 25) {
            z2 = true;
        }
        k0 = z2;
        if (h0 && !j0) {
            Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    f(Activity activity, d dVar) {
        this(activity, (Window) null, dVar, activity);
    }

    private boolean B0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f128l.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || u.K((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private void E0() {
        if (this.A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private boolean F(boolean z2) {
        if (this.S) {
            return false;
        }
        int I2 = I();
        boolean G0 = G0(k0(I2), z2);
        if (I2 == 0) {
            Z().e();
        } else {
            l lVar = this.X;
            if (lVar != null) {
                lVar.a();
            }
        }
        if (I2 == 3) {
            Y().e();
        } else {
            l lVar2 = this.Y;
            if (lVar2 != null) {
                lVar2.a();
            }
        }
        return G0;
    }

    private c F0() {
        Context context = this.f127k;
        while (context != null) {
            if (!(context instanceof c)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (c) context;
            }
        }
        return null;
    }

    private void G() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.B.findViewById(16908290);
        View decorView = this.f128l.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f127k.obtainStyledAttributes(e.a.j.AppCompatTheme);
        obtainStyledAttributes.getValue(e.a.j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(e.a.j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(e.a.j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(e.a.j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(e.a.j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(e.a.j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(e.a.j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(e.a.j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(e.a.j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(e.a.j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private boolean G0(int i2, boolean z2) {
        int i3 = this.f127k.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        boolean z3 = true;
        int i4 = i2 != 1 ? i2 != 2 ? i3 : 32 : 16;
        boolean i02 = i0();
        boolean z4 = false;
        if ((k0 || i4 != i3) && !i02 && Build.VERSION.SDK_INT >= 17 && !this.P && (this.f126j instanceof ContextThemeWrapper)) {
            Configuration configuration = new Configuration();
            configuration.uiMode = (configuration.uiMode & -49) | i4;
            try {
                ((ContextThemeWrapper) this.f126j).applyOverrideConfiguration(configuration);
                z4 = true;
            } catch (IllegalStateException e2) {
                Log.e("AppCompatDelegate", "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()", e2);
            }
        }
        int i5 = this.f127k.getResources().getConfiguration().uiMode & 48;
        if (!z4 && i5 != i4 && z2 && !i02 && this.P && (Build.VERSION.SDK_INT >= 17 || this.Q)) {
            Object obj = this.f126j;
            if (obj instanceof Activity) {
                androidx.core.app.a.o((Activity) obj);
                z4 = true;
            }
        }
        if (z4 || i5 == i4) {
            z3 = z4;
        } else {
            H0(i4, i02);
        }
        if (z3) {
            Object obj2 = this.f126j;
            if (obj2 instanceof c) {
                ((c) obj2).E(i2);
            }
        }
        return z3;
    }

    private void H(Window window) {
        if (this.f128l == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof j)) {
                j jVar = new j(callback);
                this.f129m = jVar;
                window.setCallback(jVar);
                w0 t2 = w0.t(this.f127k, (AttributeSet) null, i0);
                Drawable h2 = t2.h(0);
                if (h2 != null) {
                    window.setBackgroundDrawable(h2);
                }
                t2.v();
                this.f128l = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private void H0(int i2, boolean z2) {
        Resources resources = this.f127k.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.uiMode = i2 | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration, (DisplayMetrics) null);
        if (Build.VERSION.SDK_INT < 26) {
            h.a(resources);
        }
        int i3 = this.U;
        if (i3 != 0) {
            this.f127k.setTheme(i3);
            if (Build.VERSION.SDK_INT >= 23) {
                this.f127k.getTheme().applyStyle(this.U, true);
            }
        }
        if (z2) {
            Object obj = this.f126j;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof v) {
                    if (((v) activity).a().b().a(p.b.STARTED)) {
                        activity.onConfigurationChanged(configuration);
                    }
                } else if (this.R) {
                    activity.onConfigurationChanged(configuration);
                }
            }
        }
    }

    private int I() {
        int i2 = this.T;
        return i2 != -100 ? i2 : e.h();
    }

    private void L() {
        l lVar = this.X;
        if (lVar != null) {
            lVar.a();
        }
        l lVar2 = this.Y;
        if (lVar2 != null) {
            lVar2.a();
        }
    }

    private ViewGroup O() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f127k.obtainStyledAttributes(e.a.j.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(e.a.j.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(e.a.j.AppCompatTheme_windowNoTitle, false)) {
                y(1);
            } else if (obtainStyledAttributes.getBoolean(e.a.j.AppCompatTheme_windowActionBar, false)) {
                y(108);
            }
            if (obtainStyledAttributes.getBoolean(e.a.j.AppCompatTheme_windowActionBarOverlay, false)) {
                y(109);
            }
            if (obtainStyledAttributes.getBoolean(e.a.j.AppCompatTheme_windowActionModeOverlay, false)) {
                y(10);
            }
            this.J = obtainStyledAttributes.getBoolean(e.a.j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            V();
            this.f128l.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f127k);
            if (this.K) {
                if (this.I) {
                    viewGroup = (ViewGroup) from.inflate(e.a.g.abc_screen_simple_overlay_action_mode, (ViewGroup) null);
                } else {
                    viewGroup = (ViewGroup) from.inflate(e.a.g.abc_screen_simple, (ViewGroup) null);
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    u.q0(viewGroup, new c());
                } else {
                    ((g0) viewGroup).setOnFitSystemWindowsListener(new d());
                }
            } else if (this.J) {
                viewGroup = (ViewGroup) from.inflate(e.a.g.abc_dialog_title_material, (ViewGroup) null);
                this.H = false;
                this.G = false;
            } else if (this.G) {
                TypedValue typedValue = new TypedValue();
                this.f127k.getTheme().resolveAttribute(e.a.a.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new e.a.n.d(this.f127k, typedValue.resourceId);
                } else {
                    context = this.f127k;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(e.a.g.abc_screen_toolbar, (ViewGroup) null);
                c0 c0Var = (c0) viewGroup.findViewById(e.a.f.decor_content_parent);
                this.r = c0Var;
                c0Var.setWindowCallback(c0());
                if (this.H) {
                    this.r.k(109);
                }
                if (this.E) {
                    this.r.k(2);
                }
                if (this.F) {
                    this.r.k(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (this.r == null) {
                    this.C = (TextView) viewGroup.findViewById(e.a.f.title);
                }
                c1.c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(e.a.f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f128l.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f128l.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.G + ", windowActionBarOverlay: " + this.H + ", android:windowIsFloating: " + this.J + ", windowActionModeOverlay: " + this.I + ", windowNoTitle: " + this.K + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void U() {
        if (!this.A) {
            this.B = O();
            CharSequence b02 = b0();
            if (!TextUtils.isEmpty(b02)) {
                c0 c0Var = this.r;
                if (c0Var != null) {
                    c0Var.setWindowTitle(b02);
                } else if (v0() != null) {
                    v0().t(b02);
                } else {
                    TextView textView = this.C;
                    if (textView != null) {
                        textView.setText(b02);
                    }
                }
            }
            G();
            t0(this.B);
            this.A = true;
            o a02 = a0(0, false);
            if (this.S) {
                return;
            }
            if (a02 == null || a02.f143j == null) {
                h0(108);
            }
        }
    }

    private void V() {
        if (this.f128l == null) {
            Object obj = this.f126j;
            if (obj instanceof Activity) {
                H(((Activity) obj).getWindow());
            }
        }
        if (this.f128l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private l Y() {
        if (this.Y == null) {
            this.Y = new k(this.f127k);
        }
        return this.Y;
    }

    private void d0() {
        U();
        if (this.G && this.o == null) {
            Object obj = this.f126j;
            if (obj instanceof Activity) {
                this.o = new k((Activity) this.f126j, this.H);
            } else if (obj instanceof Dialog) {
                this.o = new k((Dialog) this.f126j);
            }
            a aVar = this.o;
            if (aVar != null) {
                aVar.r(this.c0);
            }
        }
    }

    private boolean e0(o oVar) {
        View view = oVar.f142i;
        if (view != null) {
            oVar.f141h = view;
            return true;
        } else if (oVar.f143j == null) {
            return false;
        } else {
            if (this.t == null) {
                this.t = new p();
            }
            View view2 = (View) oVar.a(this.t);
            oVar.f141h = view2;
            if (view2 != null) {
                return true;
            }
            return false;
        }
    }

    private boolean f0(o oVar) {
        oVar.d(X());
        oVar.f140g = new n(oVar.f145l);
        oVar.c = 81;
        return true;
    }

    private boolean g0(o oVar) {
        Context context = this.f127k;
        int i2 = oVar.a;
        if ((i2 == 0 || i2 == 108) && this.r != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(e.a.a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(e.a.a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(e.a.a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                e.a.n.d dVar = new e.a.n.d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.V(this);
        oVar.c(gVar);
        return true;
    }

    private void h0(int i2) {
        this.a0 = (1 << i2) | this.a0;
        if (!this.Z) {
            u.X(this.f128l.getDecorView(), this.b0);
            this.Z = true;
        }
    }

    private boolean i0() {
        if (!this.W && (this.f126j instanceof Activity)) {
            PackageManager packageManager = this.f127k.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f127k, this.f126j.getClass()), 0);
                this.V = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.V = false;
            }
        }
        this.W = true;
        return this.V;
    }

    private boolean n0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        o a02 = a0(i2, true);
        if (!a02.o) {
            return x0(a02, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean q0(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            e.a.n.b r0 = r3.u
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.f$o r2 = r3.a0(r4, r0)
            if (r4 != 0) goto L_0x0043
            androidx.appcompat.widget.c0 r4 = r3.r
            if (r4 == 0) goto L_0x0043
            boolean r4 = r4.h()
            if (r4 == 0) goto L_0x0043
            android.content.Context r4 = r3.f127k
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = r4.hasPermanentMenuKey()
            if (r4 != 0) goto L_0x0043
            androidx.appcompat.widget.c0 r4 = r3.r
            boolean r4 = r4.b()
            if (r4 != 0) goto L_0x003c
            boolean r4 = r3.S
            if (r4 != 0) goto L_0x0062
            boolean r4 = r3.x0(r2, r5)
            if (r4 == 0) goto L_0x0062
            androidx.appcompat.widget.c0 r4 = r3.r
            boolean r0 = r4.g()
            goto L_0x006a
        L_0x003c:
            androidx.appcompat.widget.c0 r4 = r3.r
            boolean r0 = r4.f()
            goto L_0x006a
        L_0x0043:
            boolean r4 = r2.o
            if (r4 != 0) goto L_0x0064
            boolean r4 = r2.f147n
            if (r4 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            boolean r4 = r2.f146m
            if (r4 == 0) goto L_0x0062
            boolean r4 = r2.r
            if (r4 == 0) goto L_0x005b
            r2.f146m = r1
            boolean r4 = r3.x0(r2, r5)
            goto L_0x005c
        L_0x005b:
            r4 = 1
        L_0x005c:
            if (r4 == 0) goto L_0x0062
            r3.u0(r2, r5)
            goto L_0x006a
        L_0x0062:
            r0 = 0
            goto L_0x006a
        L_0x0064:
            boolean r4 = r2.o
            r3.N(r2, r0)
            r0 = r4
        L_0x006a:
            if (r0 == 0) goto L_0x0083
            android.content.Context r4 = r3.f127k
            java.lang.String r5 = "audio"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.media.AudioManager r4 = (android.media.AudioManager) r4
            if (r4 == 0) goto L_0x007c
            r4.playSoundEffect(r1)
            goto L_0x0083
        L_0x007c:
            java.lang.String r4 = "AppCompatDelegate"
            java.lang.String r5 = "Couldn't get audio manager"
            android.util.Log.w(r4, r5)
        L_0x0083:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.q0(int, android.view.KeyEvent):boolean");
    }

    private void u0(o oVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (!oVar.o && !this.S) {
            if (oVar.a == 0) {
                if ((this.f127k.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback c02 = c0();
            if (c02 == null || c02.onMenuOpened(oVar.a, oVar.f143j)) {
                WindowManager windowManager = (WindowManager) this.f127k.getSystemService("window");
                if (windowManager != null && x0(oVar, keyEvent)) {
                    if (oVar.f140g == null || oVar.q) {
                        ViewGroup viewGroup = oVar.f140g;
                        if (viewGroup == null) {
                            if (!f0(oVar) || oVar.f140g == null) {
                                return;
                            }
                        } else if (oVar.q && viewGroup.getChildCount() > 0) {
                            oVar.f140g.removeAllViews();
                        }
                        if (e0(oVar) && oVar.b()) {
                            ViewGroup.LayoutParams layoutParams2 = oVar.f141h.getLayoutParams();
                            if (layoutParams2 == null) {
                                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            oVar.f140g.setBackgroundResource(oVar.b);
                            ViewParent parent = oVar.f141h.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(oVar.f141h);
                            }
                            oVar.f140g.addView(oVar.f141h, layoutParams2);
                            if (!oVar.f141h.hasFocus()) {
                                oVar.f141h.requestFocus();
                            }
                        } else {
                            return;
                        }
                    } else {
                        View view = oVar.f142i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i2 = -1;
                            oVar.f147n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i2, -2, oVar.f137d, oVar.f138e, 1002, 8519680, -3);
                            layoutParams3.gravity = oVar.c;
                            layoutParams3.windowAnimations = oVar.f139f;
                            windowManager.addView(oVar.f140g, layoutParams3);
                            oVar.o = true;
                            return;
                        }
                    }
                    i2 = -2;
                    oVar.f147n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i2, -2, oVar.f137d, oVar.f138e, 1002, 8519680, -3);
                    layoutParams32.gravity = oVar.c;
                    layoutParams32.windowAnimations = oVar.f139f;
                    windowManager.addView(oVar.f140g, layoutParams32);
                    oVar.o = true;
                    return;
                }
                return;
            }
            N(oVar, true);
        }
    }

    private boolean w0(o oVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.g gVar;
        boolean z2 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((oVar.f146m || x0(oVar, keyEvent)) && (gVar = oVar.f143j) != null) {
            z2 = gVar.performShortcut(i2, keyEvent, i3);
        }
        if (z2 && (i3 & 1) == 0 && this.r == null) {
            N(oVar, true);
        }
        return z2;
    }

    private boolean x0(o oVar, KeyEvent keyEvent) {
        c0 c0Var;
        c0 c0Var2;
        c0 c0Var3;
        if (this.S) {
            return false;
        }
        if (oVar.f146m) {
            return true;
        }
        o oVar2 = this.N;
        if (!(oVar2 == null || oVar2 == oVar)) {
            N(oVar2, false);
        }
        Window.Callback c02 = c0();
        if (c02 != null) {
            oVar.f142i = c02.onCreatePanelView(oVar.a);
        }
        int i2 = oVar.a;
        boolean z2 = i2 == 0 || i2 == 108;
        if (z2 && (c0Var3 = this.r) != null) {
            c0Var3.d();
        }
        if (oVar.f142i == null) {
            if (z2) {
                v0();
            }
            if (oVar.f143j == null || oVar.r) {
                if (oVar.f143j == null && (!g0(oVar) || oVar.f143j == null)) {
                    return false;
                }
                if (z2 && this.r != null) {
                    if (this.s == null) {
                        this.s = new h();
                    }
                    this.r.a(oVar.f143j, this.s);
                }
                oVar.f143j.h0();
                if (!c02.onCreatePanelMenu(oVar.a, oVar.f143j)) {
                    oVar.c((androidx.appcompat.view.menu.g) null);
                    if (z2 && (c0Var2 = this.r) != null) {
                        c0Var2.a((Menu) null, this.s);
                    }
                    return false;
                }
                oVar.r = false;
            }
            oVar.f143j.h0();
            Bundle bundle = oVar.s;
            if (bundle != null) {
                oVar.f143j.R(bundle);
                oVar.s = null;
            }
            if (!c02.onPreparePanel(0, oVar.f142i, oVar.f143j)) {
                if (z2 && (c0Var = this.r) != null) {
                    c0Var.a((Menu) null, this.s);
                }
                oVar.f143j.g0();
                return false;
            }
            boolean z3 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            oVar.p = z3;
            oVar.f143j.setQwertyMode(z3);
            oVar.f143j.g0();
        }
        oVar.f146m = true;
        oVar.f147n = false;
        this.N = oVar;
        return true;
    }

    private void y0(androidx.appcompat.view.menu.g gVar, boolean z2) {
        c0 c0Var = this.r;
        if (c0Var == null || !c0Var.h() || (ViewConfiguration.get(this.f127k).hasPermanentMenuKey() && !this.r.e())) {
            o a02 = a0(0, true);
            a02.q = true;
            N(a02, false);
            u0(a02, (KeyEvent) null);
            return;
        }
        Window.Callback c02 = c0();
        if (this.r.b() && z2) {
            this.r.f();
            if (!this.S) {
                c02.onPanelClosed(108, a0(0, true).f143j);
            }
        } else if (c02 != null && !this.S) {
            if (this.Z && (this.a0 & 1) != 0) {
                this.f128l.getDecorView().removeCallbacks(this.b0);
                this.b0.run();
            }
            o a03 = a0(0, true);
            androidx.appcompat.view.menu.g gVar2 = a03.f143j;
            if (gVar2 != null && !a03.r && c02.onPreparePanel(0, a03.f142i, gVar2)) {
                c02.onMenuOpened(108, a03.f143j);
                this.r.g();
            }
        }
    }

    private int z0(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i2 != 9) {
            return i2;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    public void A(View view) {
        U();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f129m.a().onContentChanged();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.B;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0() {
        /*
            r1 = this;
            boolean r0 = r1.A
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.B
            if (r0 == 0) goto L_0x0010
            boolean r0 = e.h.k.u.L(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.A0():boolean");
    }

    public void B(View view, ViewGroup.LayoutParams layoutParams) {
        U();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f129m.a().onContentChanged();
    }

    public void C(int i2) {
        this.U = i2;
    }

    public e.a.n.b C0(b.a aVar) {
        d dVar;
        if (aVar != null) {
            e.a.n.b bVar = this.u;
            if (bVar != null) {
                bVar.c();
            }
            i iVar = new i(aVar);
            a k2 = k();
            if (k2 != null) {
                e.a.n.b u2 = k2.u(iVar);
                this.u = u2;
                if (!(u2 == null || (dVar = this.f130n) == null)) {
                    dVar.f(u2);
                }
            }
            if (this.u == null) {
                this.u = D0(iVar);
            }
            return this.u;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    public final void D(CharSequence charSequence) {
        this.q = charSequence;
        c0 c0Var = this.r;
        if (c0Var != null) {
            c0Var.setWindowTitle(charSequence);
        } else if (v0() != null) {
            v0().t(charSequence);
        } else {
            TextView textView = this.C;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e.a.n.b D0(e.a.n.b.a r8) {
        /*
            r7 = this;
            r7.T()
            e.a.n.b r0 = r7.u
            if (r0 == 0) goto L_0x000a
            r0.c()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.f.i
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.f$i r0 = new androidx.appcompat.app.f$i
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.d r0 = r7.f130n
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.S
            if (r2 != 0) goto L_0x0022
            e.a.n.b r0 = r0.j(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.u = r0
            goto L_0x0161
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.v
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.J
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f127k
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = e.a.a.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f127k
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            e.a.n.d r4 = new e.a.n.d
            android.content.Context r6 = r7.f127k
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f127k
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.v = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = e.a.a.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.w = r5
            r6 = 2
            androidx.core.widget.h.b(r5, r6)
            android.widget.PopupWindow r5 = r7.w
            androidx.appcompat.widget.ActionBarContextView r6 = r7.v
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.w
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = e.a.a.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.v
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.w
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.f$f r0 = new androidx.appcompat.app.f$f
            r0.<init>()
            r7.x = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.B
            int r4 = e.a.f.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.X()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.v = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.v
            if (r0 == 0) goto L_0x0161
            r7.T()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.v
            r0.k()
            e.a.n.e r0 = new e.a.n.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.v
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.v
            android.widget.PopupWindow r6 = r7.w
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = 0
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.e()
            boolean r8 = r8.d(r0, r3)
            if (r8 == 0) goto L_0x015f
            r0.k()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.v
            r8.h(r0)
            r7.u = r0
            boolean r8 = r7.A0()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x0129
            androidx.appcompat.widget.ActionBarContextView r8 = r7.v
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.v
            e.h.k.y r8 = e.h.k.u.c(r8)
            r8.a(r0)
            r7.y = r8
            androidx.appcompat.app.f$g r0 = new androidx.appcompat.app.f$g
            r0.<init>()
            r8.f(r0)
            goto L_0x014f
        L_0x0129:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.v
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.v
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.v
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.v
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x014f
            androidx.appcompat.widget.ActionBarContextView r8 = r7.v
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            e.h.k.u.c0(r8)
        L_0x014f:
            android.widget.PopupWindow r8 = r7.w
            if (r8 == 0) goto L_0x0161
            android.view.Window r8 = r7.f128l
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.x
            r8.post(r0)
            goto L_0x0161
        L_0x015f:
            r7.u = r1
        L_0x0161:
            e.a.n.b r8 = r7.u
            if (r8 == 0) goto L_0x016c
            androidx.appcompat.app.d r0 = r7.f130n
            if (r0 == 0) goto L_0x016c
            r0.f(r8)
        L_0x016c:
            e.a.n.b r8 = r7.u
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.D0(e.a.n.b$a):e.a.n.b");
    }

    public boolean E() {
        return F(true);
    }

    /* access modifiers changed from: package-private */
    public int I0(int i2) {
        boolean z2;
        boolean z3;
        ActionBarContextView actionBarContextView = this.v;
        int i3 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.v.getLayoutParams();
            boolean z4 = true;
            if (this.v.isShown()) {
                if (this.d0 == null) {
                    this.d0 = new Rect();
                    this.e0 = new Rect();
                }
                Rect rect = this.d0;
                Rect rect2 = this.e0;
                rect.set(0, i2, 0, 0);
                c1.a(this.B, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i2 : 0)) {
                    marginLayoutParams.topMargin = i2;
                    View view = this.D;
                    if (view == null) {
                        View view2 = new View(this.f127k);
                        this.D = view2;
                        view2.setBackgroundColor(this.f127k.getResources().getColor(e.a.c.abc_input_method_navigation_guard));
                        this.B.addView(this.D, -1, new ViewGroup.LayoutParams(-1, i2));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i2) {
                            layoutParams.height = i2;
                            this.D.setLayoutParams(layoutParams);
                        }
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.D == null) {
                    z4 = false;
                }
                if (!this.I && z4) {
                    i2 = 0;
                }
                boolean z5 = z4;
                z4 = z3;
                z2 = z5;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                z2 = false;
                z4 = false;
            }
            if (z4) {
                this.v.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.D;
        if (view3 != null) {
            if (!z2) {
                i3 = 8;
            }
            view3.setVisibility(i3);
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public void J(int i2, o oVar, Menu menu) {
        if (menu == null) {
            if (oVar == null && i2 >= 0) {
                o[] oVarArr = this.M;
                if (i2 < oVarArr.length) {
                    oVar = oVarArr[i2];
                }
            }
            if (oVar != null) {
                menu = oVar.f143j;
            }
        }
        if ((oVar == null || oVar.o) && !this.S) {
            this.f129m.a().onPanelClosed(i2, menu);
        }
    }

    /* access modifiers changed from: package-private */
    public void K(androidx.appcompat.view.menu.g gVar) {
        if (!this.L) {
            this.L = true;
            this.r.l();
            Window.Callback c02 = c0();
            if (c02 != null && !this.S) {
                c02.onPanelClosed(108, gVar);
            }
            this.L = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void M(int i2) {
        N(a0(i2, true), true);
    }

    /* access modifiers changed from: package-private */
    public void N(o oVar, boolean z2) {
        ViewGroup viewGroup;
        c0 c0Var;
        if (!z2 || oVar.a != 0 || (c0Var = this.r) == null || !c0Var.b()) {
            WindowManager windowManager = (WindowManager) this.f127k.getSystemService("window");
            if (!(windowManager == null || !oVar.o || (viewGroup = oVar.f140g) == null)) {
                windowManager.removeView(viewGroup);
                if (z2) {
                    J(oVar.a, oVar, (Menu) null);
                }
            }
            oVar.f146m = false;
            oVar.f147n = false;
            oVar.o = false;
            oVar.f141h = null;
            oVar.q = true;
            if (this.N == oVar) {
                this.N = null;
                return;
            }
            return;
        }
        K(oVar.f143j);
    }

    public View P(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        boolean z3 = false;
        if (this.f0 == null) {
            String string = this.f127k.obtainStyledAttributes(e.a.j.AppCompatTheme).getString(e.a.j.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                this.f0 = new AppCompatViewInflater();
            } else {
                try {
                    this.f0 = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f0 = new AppCompatViewInflater();
                }
            }
        }
        if (h0) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z3 = B0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z3 = true;
            }
            z2 = z3;
        } else {
            z2 = false;
        }
        return this.f0.createView(view, str, context, attributeSet, z2, h0, true, b1.b());
    }

    /* access modifiers changed from: package-private */
    public void Q() {
        androidx.appcompat.view.menu.g gVar;
        c0 c0Var = this.r;
        if (c0Var != null) {
            c0Var.l();
        }
        if (this.w != null) {
            this.f128l.getDecorView().removeCallbacks(this.x);
            if (this.w.isShowing()) {
                try {
                    this.w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.w = null;
        }
        T();
        o a02 = a0(0, false);
        if (a02 != null && (gVar = a02.f143j) != null) {
            gVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean R(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f126j;
        boolean z2 = true;
        if (((obj instanceof f.a) || (obj instanceof g)) && (decorView = this.f128l.getDecorView()) != null && e.h.k.f.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f129m.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z2 = false;
        }
        return z2 ? m0(keyCode, keyEvent) : p0(keyCode, keyEvent);
    }

    /* access modifiers changed from: package-private */
    public void S(int i2) {
        o a02;
        o a03 = a0(i2, true);
        if (a03.f143j != null) {
            Bundle bundle = new Bundle();
            a03.f143j.T(bundle);
            if (bundle.size() > 0) {
                a03.s = bundle;
            }
            a03.f143j.h0();
            a03.f143j.clear();
        }
        a03.r = true;
        a03.q = true;
        if ((i2 == 108 || i2 == 0) && this.r != null && (a02 = a0(0, false)) != null) {
            a02.f146m = false;
            x0(a02, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void T() {
        y yVar = this.y;
        if (yVar != null) {
            yVar.b();
        }
    }

    /* access modifiers changed from: package-private */
    public o W(Menu menu) {
        o[] oVarArr = this.M;
        int length = oVarArr != null ? oVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            o oVar = oVarArr[i2];
            if (oVar != null && oVar.f143j == menu) {
                return oVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final Context X() {
        a k2 = k();
        Context k3 = k2 != null ? k2.k() : null;
        return k3 == null ? this.f127k : k3;
    }

    /* access modifiers changed from: package-private */
    public final l Z() {
        if (this.X == null) {
            this.X = new m(j.a(this.f127k));
        }
        return this.X;
    }

    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        o W2;
        Window.Callback c02 = c0();
        if (c02 == null || this.S || (W2 = W(gVar.F())) == null) {
            return false;
        }
        return c02.onMenuItemSelected(W2.a, menuItem);
    }

    /* access modifiers changed from: protected */
    public o a0(int i2, boolean z2) {
        o[] oVarArr = this.M;
        if (oVarArr == null || oVarArr.length <= i2) {
            o[] oVarArr2 = new o[(i2 + 1)];
            if (oVarArr != null) {
                System.arraycopy(oVarArr, 0, oVarArr2, 0, oVarArr.length);
            }
            this.M = oVarArr2;
            oVarArr = oVarArr2;
        }
        o oVar = oVarArr[i2];
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o(i2);
        oVarArr[i2] = oVar2;
        return oVar2;
    }

    public void b(androidx.appcompat.view.menu.g gVar) {
        y0(gVar, true);
    }

    /* access modifiers changed from: package-private */
    public final CharSequence b0() {
        Object obj = this.f126j;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.q;
    }

    public void c(View view, ViewGroup.LayoutParams layoutParams) {
        U();
        ((ViewGroup) this.B.findViewById(16908290)).addView(view, layoutParams);
        this.f129m.a().onContentChanged();
    }

    /* access modifiers changed from: package-private */
    public final Window.Callback c0() {
        return this.f128l.getCallback();
    }

    public void d(Context context) {
        F(false);
        this.P = true;
    }

    public <T extends View> T g(int i2) {
        U();
        return this.f128l.findViewById(i2);
    }

    public int i() {
        return this.T;
    }

    public MenuInflater j() {
        if (this.p == null) {
            d0();
            a aVar = this.o;
            this.p = new e.a.n.g(aVar != null ? aVar.k() : this.f127k);
        }
        return this.p;
    }

    public boolean j0() {
        return this.z;
    }

    public a k() {
        d0();
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public int k0(int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 == -1) {
            return i2;
        }
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                return i2;
            }
            if (i2 == 3) {
                return Y().c();
            }
            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
        } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) this.f127k.getSystemService(UiModeManager.class)).getNightMode() != 0) {
            return Z().c();
        } else {
            return -1;
        }
    }

    public void l() {
        LayoutInflater from = LayoutInflater.from(this.f127k);
        if (from.getFactory() == null) {
            e.h.k.g.b(from, this);
        } else if (!(from.getFactory2() instanceof f)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* access modifiers changed from: package-private */
    public boolean l0() {
        e.a.n.b bVar = this.u;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        a k2 = k();
        if (k2 == null || !k2.h()) {
            return false;
        }
        return true;
    }

    public void m() {
        a k2 = k();
        if (k2 == null || !k2.l()) {
            h0(0);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean m0(int i2, KeyEvent keyEvent) {
        boolean z2 = true;
        if (i2 == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z2 = false;
            }
            this.O = z2;
        } else if (i2 == 82) {
            n0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean o0(int i2, KeyEvent keyEvent) {
        a k2 = k();
        if (k2 != null && k2.o(i2, keyEvent)) {
            return true;
        }
        o oVar = this.N;
        if (oVar == null || !w0(oVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.N == null) {
                o a02 = a0(0, true);
                x0(a02, keyEvent);
                boolean w0 = w0(a02, keyEvent.getKeyCode(), keyEvent, 1);
                a02.f146m = false;
                if (w0) {
                    return true;
                }
            }
            return false;
        }
        o oVar2 = this.N;
        if (oVar2 != null) {
            oVar2.f147n = true;
        }
        return true;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return P(view, str, context, attributeSet);
    }

    public void p(Configuration configuration) {
        a k2;
        if (this.G && this.A && (k2 = k()) != null) {
            k2.m(configuration);
        }
        androidx.appcompat.widget.j.b().g(this.f127k);
        F(false);
    }

    /* access modifiers changed from: package-private */
    public boolean p0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z2 = this.O;
            this.O = false;
            o a02 = a0(0, false);
            if (a02 != null && a02.o) {
                if (!z2) {
                    N(a02, true);
                }
                return true;
            } else if (l0()) {
                return true;
            }
        } else if (i2 == 82) {
            q0(0, keyEvent);
            return true;
        }
        return false;
    }

    public void q(Bundle bundle) {
        this.P = true;
        F(false);
        V();
        Object obj = this.f126j;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = androidx.core.app.h.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                a v0 = v0();
                if (v0 == null) {
                    this.c0 = true;
                } else {
                    v0.r(true);
                }
            }
        }
        this.Q = true;
    }

    public void r() {
        e.o(this);
        if (this.Z) {
            this.f128l.getDecorView().removeCallbacks(this.b0);
        }
        this.R = false;
        this.S = true;
        a aVar = this.o;
        if (aVar != null) {
            aVar.n();
        }
        L();
    }

    /* access modifiers changed from: package-private */
    public void r0(int i2) {
        a k2;
        if (i2 == 108 && (k2 = k()) != null) {
            k2.i(true);
        }
    }

    public void s(Bundle bundle) {
        U();
    }

    /* access modifiers changed from: package-private */
    public void s0(int i2) {
        if (i2 == 108) {
            a k2 = k();
            if (k2 != null) {
                k2.i(false);
            }
        } else if (i2 == 0) {
            o a02 = a0(i2, true);
            if (a02.o) {
                N(a02, false);
            }
        }
    }

    public void t() {
        a k2 = k();
        if (k2 != null) {
            k2.s(true);
        }
    }

    /* access modifiers changed from: package-private */
    public void t0(ViewGroup viewGroup) {
    }

    public void u(Bundle bundle) {
        if (this.T != -100) {
            g0.put(this.f126j.getClass(), Integer.valueOf(this.T));
        }
    }

    public void v() {
        this.R = true;
        E();
        e.n(this);
    }

    /* access modifiers changed from: package-private */
    public final a v0() {
        return this.o;
    }

    public void w() {
        this.R = false;
        e.o(this);
        a k2 = k();
        if (k2 != null) {
            k2.s(false);
        }
        if (this.f126j instanceof Dialog) {
            L();
        }
    }

    public boolean y(int i2) {
        int z0 = z0(i2);
        if (this.K && z0 == 108) {
            return false;
        }
        if (this.G && z0 == 1) {
            this.G = false;
        }
        if (z0 == 1) {
            E0();
            this.K = true;
            return true;
        } else if (z0 == 2) {
            E0();
            this.E = true;
            return true;
        } else if (z0 == 5) {
            E0();
            this.F = true;
            return true;
        } else if (z0 == 10) {
            E0();
            this.I = true;
            return true;
        } else if (z0 == 108) {
            E0();
            this.G = true;
            return true;
        } else if (z0 != 109) {
            return this.f128l.requestFeature(z0);
        } else {
            E0();
            this.H = true;
            return true;
        }
    }

    public void z(int i2) {
        U();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f127k).inflate(i2, viewGroup);
        this.f129m.a().onContentChanged();
    }

    f(Dialog dialog, d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    private f(Context context, Window window, d dVar, Object obj) {
        Integer num;
        c F0;
        this.y = null;
        this.z = true;
        this.T = -100;
        this.b0 = new b();
        this.f127k = context;
        this.f130n = dVar;
        this.f126j = obj;
        if (this.T == -100 && (obj instanceof Dialog) && (F0 = F0()) != null) {
            this.T = F0.B().i();
        }
        if (this.T == -100 && (num = g0.get(this.f126j.getClass())) != null) {
            this.T = num.intValue();
            g0.remove(this.f126j.getClass());
        }
        if (window != null) {
            H(window);
        }
        androidx.appcompat.widget.j.h();
    }

    /* compiled from: AppCompatDelegateImpl */
    class j extends e.a.n.i {
        j(Window.Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: package-private */
        public final ActionMode b(ActionMode.Callback callback) {
            f.a aVar = new f.a(f.this.f127k, callback);
            e.a.n.b C0 = f.this.C0(aVar);
            if (C0 != null) {
                return aVar.e(C0);
            }
            return null;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.R(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || f.this.o0(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i2, Menu menu) {
            if (i2 != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i2, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i2, Menu menu) {
            super.onMenuOpened(i2, menu);
            f.this.r0(i2);
            return true;
        }

        public void onPanelClosed(int i2, Menu menu) {
            super.onPanelClosed(i2, menu);
            f.this.s0(i2);
        }

        public boolean onPreparePanel(int i2, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i2 == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.e0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i2, view, menu);
            if (gVar != null) {
                gVar.e0(false);
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
            androidx.appcompat.view.menu.g gVar;
            o a0 = f.this.a0(0, true);
            if (a0 == null || (gVar = a0.f143j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i2);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i2);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (f.this.j0()) {
                return b(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            if (!f.this.j0() || i2 != 0) {
                return super.onWindowStartingActionMode(callback, i2);
            }
            return b(callback);
        }
    }
}
