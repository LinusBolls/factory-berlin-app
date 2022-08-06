package e.h.k;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Objects;

/* compiled from: WindowInsetsCompat */
public class c0 {
    private final i a;

    /* compiled from: WindowInsetsCompat */
    private static class d {
        private final c0 a;

        d() {
            this(new c0((c0) null));
        }

        /* access modifiers changed from: package-private */
        public c0 a() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public void b(e.h.d.b bVar) {
        }

        d(c0 c0Var) {
            this.a = c0Var;
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class g extends f {
        g(c0 c0Var, WindowInsets windowInsets) {
            super(c0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        public c0 a() {
            return c0.l(this.b.consumeDisplayCutout());
        }

        /* access modifiers changed from: package-private */
        public c d() {
            return c.a(this.b.getDisplayCutout());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            return Objects.equals(this.b, ((g) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        g(c0 c0Var, g gVar) {
            super(c0Var, (f) gVar);
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class h extends g {
        h(c0 c0Var, WindowInsets windowInsets) {
            super(c0Var, windowInsets);
        }

        h(c0 c0Var, h hVar) {
            super(c0Var, (g) hVar);
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class i {
        final c0 a;

        i(c0 c0Var) {
            this.a = c0Var;
        }

        /* access modifiers changed from: package-private */
        public c0 a() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public c0 b() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public c0 c() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public c d() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public e.h.d.b e() {
            return e.h.d.b.f8618e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (h() != iVar.h() || g() != iVar.g() || !e.h.j.c.a(f(), iVar.f()) || !e.h.j.c.a(e(), iVar.e()) || !e.h.j.c.a(d(), iVar.d())) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public e.h.d.b f() {
            return e.h.d.b.f8618e;
        }

        /* access modifiers changed from: package-private */
        public boolean g() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean h() {
            return false;
        }

        public int hashCode() {
            return e.h.j.c.b(Boolean.valueOf(h()), Boolean.valueOf(g()), f(), e(), d());
        }
    }

    static {
        new a().a().a().b().c();
    }

    private c0(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.a = new h(this, windowInsets);
        } else if (i2 >= 28) {
            this.a = new g(this, windowInsets);
        } else if (i2 >= 21) {
            this.a = new f(this, windowInsets);
        } else if (i2 >= 20) {
            this.a = new e(this, windowInsets);
        } else {
            this.a = new i(this);
        }
    }

    public static c0 l(WindowInsets windowInsets) {
        e.h.j.h.c(windowInsets);
        return new c0(windowInsets);
    }

    public c0 a() {
        return this.a.a();
    }

    public c0 b() {
        return this.a.b();
    }

    public c0 c() {
        return this.a.c();
    }

    public int d() {
        return h().f8619d;
    }

    public int e() {
        return h().a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        return e.h.j.c.a(this.a, ((c0) obj).a);
    }

    public int f() {
        return h().c;
    }

    public int g() {
        return h().b;
    }

    public e.h.d.b h() {
        return this.a.f();
    }

    public int hashCode() {
        i iVar = this.a;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    public boolean i() {
        return this.a.g();
    }

    @Deprecated
    public c0 j(int i2, int i3, int i4, int i5) {
        a aVar = new a(this);
        aVar.b(e.h.d.b.a(i2, i3, i4, i5));
        return aVar.a();
    }

    public WindowInsets k() {
        i iVar = this.a;
        if (iVar instanceof e) {
            return ((e) iVar).b;
        }
        return null;
    }

    /* compiled from: WindowInsetsCompat */
    private static class b extends d {
        private static Field c = null;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f8671d = false;

        /* renamed from: e  reason: collision with root package name */
        private static Constructor<WindowInsets> f8672e = null;

        /* renamed from: f  reason: collision with root package name */
        private static boolean f8673f = false;
        private WindowInsets b;

        b() {
            this.b = c();
        }

        private static WindowInsets c() {
            if (!f8671d) {
                try {
                    c = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f8671d = true;
            }
            Field field = c;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!f8673f) {
                try {
                    f8672e = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                f8673f = true;
            }
            Constructor<WindowInsets> constructor = f8672e;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public c0 a() {
            return c0.l(this.b);
        }

        /* access modifiers changed from: package-private */
        public void b(e.h.d.b bVar) {
            WindowInsets windowInsets = this.b;
            if (windowInsets != null) {
                this.b = windowInsets.replaceSystemWindowInsets(bVar.a, bVar.b, bVar.c, bVar.f8619d);
            }
        }

        b(c0 c0Var) {
            this.b = c0Var.k();
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class c extends d {
        final WindowInsets.Builder b;

        c() {
            this.b = new WindowInsets.Builder();
        }

        /* access modifiers changed from: package-private */
        public c0 a() {
            return c0.l(this.b.build());
        }

        /* access modifiers changed from: package-private */
        public void b(e.h.d.b bVar) {
            this.b.setSystemWindowInsets(bVar.b());
        }

        c(c0 c0Var) {
            WindowInsets.Builder builder;
            WindowInsets k2 = c0Var.k();
            if (k2 != null) {
                builder = new WindowInsets.Builder(k2);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.b = builder;
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class f extends e {

        /* renamed from: d  reason: collision with root package name */
        private e.h.d.b f8674d = null;

        f(c0 c0Var, WindowInsets windowInsets) {
            super(c0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        public c0 b() {
            return c0.l(this.b.consumeStableInsets());
        }

        /* access modifiers changed from: package-private */
        public c0 c() {
            return c0.l(this.b.consumeSystemWindowInsets());
        }

        /* access modifiers changed from: package-private */
        public final e.h.d.b e() {
            if (this.f8674d == null) {
                this.f8674d = e.h.d.b.a(this.b.getStableInsetLeft(), this.b.getStableInsetTop(), this.b.getStableInsetRight(), this.b.getStableInsetBottom());
            }
            return this.f8674d;
        }

        /* access modifiers changed from: package-private */
        public boolean g() {
            return this.b.isConsumed();
        }

        f(c0 c0Var, f fVar) {
            super(c0Var, (e) fVar);
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class e extends i {
        final WindowInsets b;
        private e.h.d.b c;

        e(c0 c0Var, WindowInsets windowInsets) {
            super(c0Var);
            this.c = null;
            this.b = windowInsets;
        }

        /* access modifiers changed from: package-private */
        public final e.h.d.b f() {
            if (this.c == null) {
                this.c = e.h.d.b.a(this.b.getSystemWindowInsetLeft(), this.b.getSystemWindowInsetTop(), this.b.getSystemWindowInsetRight(), this.b.getSystemWindowInsetBottom());
            }
            return this.c;
        }

        /* access modifiers changed from: package-private */
        public boolean h() {
            return this.b.isRound();
        }

        e(c0 c0Var, e eVar) {
            this(c0Var, new WindowInsets(eVar.b));
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static final class a {
        private final d a;

        public a() {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                this.a = new c();
            } else if (i2 >= 20) {
                this.a = new b();
            } else {
                this.a = new d();
            }
        }

        public c0 a() {
            return this.a.a();
        }

        public a b(e.h.d.b bVar) {
            this.a.b(bVar);
            return this;
        }

        public a(c0 c0Var) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                this.a = new c(c0Var);
            } else if (i2 >= 20) {
                this.a = new b(c0Var);
            } else {
                this.a = new d(c0Var);
            }
        }
    }

    public c0(c0 c0Var) {
        if (c0Var != null) {
            i iVar = c0Var.a;
            if (Build.VERSION.SDK_INT >= 29 && (iVar instanceof h)) {
                this.a = new h(this, (h) iVar);
            } else if (Build.VERSION.SDK_INT >= 28 && (iVar instanceof g)) {
                this.a = new g(this, (g) iVar);
            } else if (Build.VERSION.SDK_INT >= 21 && (iVar instanceof f)) {
                this.a = new f(this, (f) iVar);
            } else if (Build.VERSION.SDK_INT < 20 || !(iVar instanceof e)) {
                this.a = new i(this);
            } else {
                this.a = new e(this, (e) iVar);
            }
        } else {
            this.a = new i(this);
        }
    }
}
