package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.p;
import androidx.viewpager.widget.a;

/* compiled from: FragmentPagerAdapter */
public abstract class q extends a {
    private final m a;
    private final int b;
    private u c;

    /* renamed from: d  reason: collision with root package name */
    private Fragment f850d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f851e;

    @Deprecated
    public q(m mVar) {
        this(mVar, 0);
    }

    private static String p(int i2, long j2) {
        return "android:switcher:" + i2 + ":" + j2;
    }

    public void a(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.c == null) {
            this.c = this.a.i();
        }
        this.c.n(fragment);
        if (fragment.equals(this.f850d)) {
            this.f850d = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void b(ViewGroup viewGroup) {
        u uVar = this.c;
        if (uVar != null) {
            if (!this.f851e) {
                try {
                    this.f851e = true;
                    uVar.m();
                    this.f851e = false;
                } catch (Throwable th) {
                    this.f851e = false;
                    throw th;
                }
            }
            this.c = null;
        }
    }

    public Object g(ViewGroup viewGroup, int i2) {
        if (this.c == null) {
            this.c = this.a.i();
        }
        long o = o(i2);
        Fragment X = this.a.X(p(viewGroup.getId(), o));
        if (X != null) {
            this.c.i(X);
        } else {
            X = n(i2);
            this.c.c(viewGroup.getId(), X, p(viewGroup.getId(), o));
        }
        if (X != this.f850d) {
            X.F1(false);
            if (this.b == 1) {
                this.c.u(X, p.b.STARTED);
            } else {
                X.L1(false);
            }
        }
        return X;
    }

    public boolean h(View view, Object obj) {
        return ((Fragment) obj).Z() == view;
    }

    public void i(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable j() {
        return null;
    }

    public void k(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f850d;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.F1(false);
                if (this.b == 1) {
                    if (this.c == null) {
                        this.c = this.a.i();
                    }
                    this.c.u(this.f850d, p.b.STARTED);
                } else {
                    this.f850d.L1(false);
                }
            }
            fragment.F1(true);
            if (this.b == 1) {
                if (this.c == null) {
                    this.c = this.a.i();
                }
                this.c.u(fragment, p.b.RESUMED);
            } else {
                fragment.L1(true);
            }
            this.f850d = fragment;
        }
    }

    public void m(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    public abstract Fragment n(int i2);

    public long o(int i2) {
        return (long) i2;
    }

    public q(m mVar, int i2) {
        this.c = null;
        this.f850d = null;
        this.a = mVar;
        this.b = i2;
    }
}
