package e.h.k;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import e.h.k.a;
import e.h.k.d0.c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ViewCompat */
public class u {
    private static Field a;
    private static boolean b;
    private static Field c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f8705d;

    /* renamed from: e  reason: collision with root package name */
    private static WeakHashMap<View, String> f8706e;

    /* renamed from: f  reason: collision with root package name */
    private static WeakHashMap<View, y> f8707f = null;

    /* renamed from: g  reason: collision with root package name */
    private static Field f8708g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f8709h = false;

    /* renamed from: i  reason: collision with root package name */
    private static ThreadLocal<Rect> f8710i;

    /* compiled from: ViewCompat */
    class a implements View.OnApplyWindowInsetsListener {
        final /* synthetic */ q a;

        a(q qVar) {
            this.a = qVar;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return this.a.a(view, c0.l(windowInsets)).k();
        }
    }

    /* compiled from: ViewCompat */
    class b extends f<Boolean> {
        b(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            view.setScreenReaderFocusable(bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* compiled from: ViewCompat */
    class c extends f<CharSequence> {
        c(int i2, Class cls, int i3, int i4) {
            super(i2, cls, i3, i4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence d(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* compiled from: ViewCompat */
    class d extends f<Boolean> {
        d(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            view.setAccessibilityHeading(bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* compiled from: ViewCompat */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: g  reason: collision with root package name */
        private WeakHashMap<View, Boolean> f8711g = new WeakHashMap<>();

        e() {
        }

        private void a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                if (z2) {
                    u.P(view, 16);
                }
                this.f8711g.put(view, Boolean.valueOf(z2));
            }
        }

        private void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void onGlobalLayout() {
            for (Map.Entry next : this.f8711g.entrySet()) {
                a((View) next.getKey(), ((Boolean) next.getValue()).booleanValue());
            }
        }

        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: ViewCompat */
    static abstract class f<T> {
        private final int a;
        private final Class<T> b;
        private final int c;

        f(int i2, Class<T> cls, int i3) {
            this(i2, cls, 0, i3);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= 19;
        }

        private boolean c() {
            return Build.VERSION.SDK_INT >= this.c;
        }

        /* access modifiers changed from: package-private */
        public boolean a(Boolean bool, Boolean bool2) {
            boolean z;
            boolean booleanValue = bool == null ? false : bool.booleanValue();
            if (bool2 == null) {
                z = false;
            } else {
                z = bool2.booleanValue();
            }
            if (booleanValue == z) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public abstract T d(View view);

        /* access modifiers changed from: package-private */
        public abstract void e(View view, T t);

        /* access modifiers changed from: package-private */
        public T f(View view) {
            if (c()) {
                return d(view);
            }
            if (!b()) {
                return null;
            }
            T tag = view.getTag(this.a);
            if (this.b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void g(View view, T t) {
            if (c()) {
                e(view, t);
            } else if (b() && h(f(view), t)) {
                u.A(view);
                view.setTag(this.a, t);
                u.P(view, 0);
            }
        }

        /* access modifiers changed from: package-private */
        public abstract boolean h(T t, T t2);

        f(int i2, Class<T> cls, int i3, int i4) {
            this.a = i2;
            this.b = cls;
            this.c = i4;
        }
    }

    /* compiled from: ViewCompat */
    public interface g {
        boolean a(View view, KeyEvent keyEvent);
    }

    /* compiled from: ViewCompat */
    static class h {

        /* renamed from: d  reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f8712d = new ArrayList<>();
        private WeakHashMap<View, Boolean> a = null;
        private SparseArray<WeakReference<View>> b = null;
        private WeakReference<KeyEvent> c = null;

        h() {
        }

        static h a(View view) {
            h hVar = (h) view.getTag(e.h.b.tag_unhandled_key_event_manager);
            if (hVar != null) {
                return hVar;
            }
            h hVar2 = new h();
            view.setTag(e.h.b.tag_unhandled_key_event_manager, hVar2);
            return hVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c2 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c2 != null) {
                            return c2;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.b == null) {
                this.b = new SparseArray<>();
            }
            return this.b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(e.h.b.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((g) arrayList.get(size)).a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!f8712d.isEmpty()) {
                synchronized (f8712d) {
                    if (this.a == null) {
                        this.a = new WeakHashMap<>();
                    }
                    for (int size = f8712d.size() - 1; size >= 0; size--) {
                        View view = (View) f8712d.get(size).get();
                        if (view == null) {
                            f8712d.remove(size);
                        } else {
                            this.a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c2 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c2 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(c2));
                }
            }
            return c2 != null;
        }

        /* access modifiers changed from: package-private */
        public boolean f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.c = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray<WeakReference<View>> d2 = d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d2.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d2.valueAt(indexOfKey);
                d2.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d2.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && u.K(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    static {
        new AtomicInteger(1);
        new e();
    }

    static a A(View view) {
        a i2 = i(view);
        if (i2 == null) {
            i2 = new a();
        }
        e0(view, i2);
        return i2;
    }

    public static int B(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    public static int C(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    public static String D(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f8706e;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static int E(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    public static float F(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static boolean G(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    public static boolean H(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    public static boolean I(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    public static boolean J(View view) {
        Boolean f2 = a().f(view);
        if (f2 == null) {
            return false;
        }
        return f2.booleanValue();
    }

    public static boolean K(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    public static boolean L(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static boolean M(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof k) {
            return ((k) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public static boolean N(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    public static boolean O(View view) {
        Boolean f2 = d0().f(view);
        if (f2 == null) {
            return false;
        }
        return f2.booleanValue();
    }

    static void P(View view, int i2) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = m(view) != null;
            if (l(view) != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i2);
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    public static void Q(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetLeftAndRight(i2);
        } else if (i3 >= 21) {
            Rect t = t();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                t.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !t.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            d(view, i2);
            if (z && t.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(t);
            }
        } else {
            d(view, i2);
        }
    }

    public static void R(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetTopAndBottom(i2);
        } else if (i3 >= 21) {
            Rect t = t();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                t.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !t.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            e(view, i2);
            if (z && t.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(t);
            }
        } else {
            e(view, i2);
        }
    }

    public static c0 S(View view, c0 c0Var) {
        WindowInsets k2;
        if (Build.VERSION.SDK_INT >= 21 && (k2 = c0Var.k()) != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(k2);
            if (!onApplyWindowInsets.equals(k2)) {
                return c0.l(onApplyWindowInsets);
            }
        }
        return c0Var;
    }

    public static void T(View view, e.h.k.d0.c cVar) {
        view.onInitializeAccessibilityNodeInfo(cVar.s0());
    }

    private static f<CharSequence> U() {
        return new c(e.h.b.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    public static boolean V(View view, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i2, bundle);
        }
        return false;
    }

    public static void W(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    public static void X(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    public static void Y(View view, Runnable runnable, long j2) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j2);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j2);
        }
    }

    public static void Z(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            a0(i2, view);
            P(view, 0);
        }
    }

    private static f<Boolean> a() {
        return new d(e.h.b.tag_accessibility_heading, Boolean.class, 28);
    }

    private static void a0(int i2, View view) {
        List<c.a> n2 = n(view);
        for (int i3 = 0; i3 < n2.size(); i3++) {
            if (n2.get(i3).b() == i2) {
                n2.remove(i3);
                return;
            }
        }
    }

    private static void b(View view, c.a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            A(view);
            a0(aVar.b(), view);
            n(view).add(aVar);
            P(view, 0);
        }
    }

    public static void b0(View view, c.a aVar, CharSequence charSequence, e.h.k.d0.f fVar) {
        if (fVar == null && charSequence == null) {
            Z(view, aVar.b());
        } else {
            b(view, aVar.a(charSequence, fVar));
        }
    }

    public static y c(View view) {
        if (f8707f == null) {
            f8707f = new WeakHashMap<>();
        }
        y yVar = f8707f.get(view);
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(view);
        f8707f.put(view, yVar2);
        return yVar2;
    }

    public static void c0(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 20) {
            view.requestApplyInsets();
        } else if (i2 >= 16) {
            view.requestFitSystemWindows();
        }
    }

    private static void d(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            w0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                w0((View) parent);
            }
        }
    }

    private static f<Boolean> d0() {
        return new b(e.h.b.tag_screen_reader_focusable, Boolean.class, 28);
    }

    private static void e(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            w0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                w0((View) parent);
            }
        }
    }

    public static void e0(View view, a aVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (aVar == null && (j(view) instanceof a.C0562a)) {
            aVar = new a();
        }
        if (aVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = aVar.d();
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r3.k();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e.h.k.c0 f(android.view.View r2, e.h.k.c0 r3) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x001b
            android.view.WindowInsets r0 = r3.k()
            if (r0 == 0) goto L_0x001b
            android.view.WindowInsets r2 = r2.dispatchApplyWindowInsets(r0)
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x001b
            e.h.k.c0 r2 = e.h.k.c0.l(r0)
            return r2
        L_0x001b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.k.u.f(android.view.View, e.h.k.c0):e.h.k.c0");
    }

    public static void f0(View view, boolean z) {
        a().g(view, Boolean.valueOf(z));
    }

    static boolean g(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return h.a(view).b(view, keyEvent);
    }

    public static void g0(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i2);
        }
    }

    static boolean h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return h.a(view).f(keyEvent);
    }

    public static void h0(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static a i(View view) {
        View.AccessibilityDelegate j2 = j(view);
        if (j2 == null) {
            return null;
        }
        if (j2 instanceof a.C0562a) {
            return ((a.C0562a) j2).a;
        }
        return new a(j2);
    }

    public static void i0(View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof t) {
            ((t) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    private static View.AccessibilityDelegate j(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        return k(view);
    }

    public static void j0(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof t) {
            ((t) view).setSupportBackgroundTintMode(mode);
        }
    }

    private static View.AccessibilityDelegate k(View view) {
        if (f8709h) {
            return null;
        }
        if (f8708g == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f8708g = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f8709h = true;
                return null;
            }
        }
        try {
            Object obj = f8708g.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f8709h = true;
            return null;
        }
    }

    public static void k0(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    public static int l(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    public static void l0(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f2);
        }
    }

    public static CharSequence m(View view) {
        return U().f(view);
    }

    @Deprecated
    public static void m0(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    private static List<c.a> n(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(e.h.b.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(e.h.b.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void n0(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    public static ColorStateList o(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof t) {
            return ((t) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static void o0(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 19) {
            view.setImportantForAccessibility(i2);
        } else if (i3 >= 16) {
            if (i2 == 4) {
                i2 = 2;
            }
            view.setImportantForAccessibility(i2);
        }
    }

    public static PorterDuff.Mode p(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof t) {
            return ((t) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    public static void p0(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i2);
        }
    }

    public static Rect q(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    public static void q0(View view, q qVar) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (qVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
        } else {
            view.setOnApplyWindowInsetsListener(new a(qVar));
        }
    }

    public static Display r(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (K(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    public static void r0(View view, int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i2, i3, i4, i5);
        } else {
            view.setPadding(i2, i3, i4, i5);
        }
    }

    public static float s(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    public static void s0(View view, s sVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (sVar != null ? sVar.a() : null));
        }
    }

    private static Rect t() {
        if (f8710i == null) {
            f8710i = new ThreadLocal<>();
        }
        Rect rect = f8710i.get();
        if (rect == null) {
            rect = new Rect();
            f8710i.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void t0(View view, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i2, i3);
        }
    }

    public static boolean u(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    public static void u0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f8706e == null) {
            f8706e = new WeakHashMap<>();
        }
        f8706e.put(view, str);
    }

    public static int v(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    public static void v0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof k) {
            ((k) view).stopNestedScroll();
        }
    }

    @SuppressLint({"InlinedApi"})
    public static int w(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    private static void w0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static int x(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    public static int y(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f8705d) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f8705d = true;
        }
        Field field = c;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static int z(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!b) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            b = true;
        }
        Field field = a;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }
}
