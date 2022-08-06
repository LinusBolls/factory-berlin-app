package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.p;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: FragmentTransaction */
public abstract class u {
    ArrayList<a> a = new ArrayList<>();
    int b;
    int c;

    /* renamed from: d  reason: collision with root package name */
    int f860d;

    /* renamed from: e  reason: collision with root package name */
    int f861e;

    /* renamed from: f  reason: collision with root package name */
    int f862f;

    /* renamed from: g  reason: collision with root package name */
    boolean f863g;

    /* renamed from: h  reason: collision with root package name */
    boolean f864h = true;

    /* renamed from: i  reason: collision with root package name */
    String f865i;

    /* renamed from: j  reason: collision with root package name */
    int f866j;

    /* renamed from: k  reason: collision with root package name */
    CharSequence f867k;

    /* renamed from: l  reason: collision with root package name */
    int f868l;

    /* renamed from: m  reason: collision with root package name */
    CharSequence f869m;

    /* renamed from: n  reason: collision with root package name */
    ArrayList<String> f870n;
    ArrayList<String> o;
    boolean p = false;
    ArrayList<Runnable> q;

    /* compiled from: FragmentTransaction */
    static final class a {
        int a;
        Fragment b;
        int c;

        /* renamed from: d  reason: collision with root package name */
        int f871d;

        /* renamed from: e  reason: collision with root package name */
        int f872e;

        /* renamed from: f  reason: collision with root package name */
        int f873f;

        /* renamed from: g  reason: collision with root package name */
        p.b f874g;

        /* renamed from: h  reason: collision with root package name */
        p.b f875h;

        a() {
        }

        a(int i2, Fragment fragment) {
            this.a = i2;
            this.b = fragment;
            p.b bVar = p.b.RESUMED;
            this.f874g = bVar;
            this.f875h = bVar;
        }

        a(int i2, Fragment fragment, p.b bVar) {
            this.a = i2;
            this.b = fragment;
            this.f874g = fragment.V;
            this.f875h = bVar;
        }
    }

    u(i iVar, ClassLoader classLoader) {
    }

    public u b(int i2, Fragment fragment) {
        p(i2, fragment, (String) null, 1);
        return this;
    }

    public u c(int i2, Fragment fragment, String str) {
        p(i2, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public u d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.L = viewGroup;
        c(viewGroup.getId(), fragment, str);
        return this;
    }

    public u e(Fragment fragment, String str) {
        p(0, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void f(a aVar) {
        this.a.add(aVar);
        aVar.c = this.b;
        aVar.f871d = this.c;
        aVar.f872e = this.f860d;
        aVar.f873f = this.f861e;
    }

    public u g(View view, String str) {
        if (v.D()) {
            String D = e.h.k.u.D(view);
            if (D != null) {
                if (this.f870n == null) {
                    this.f870n = new ArrayList<>();
                    this.o = new ArrayList<>();
                } else if (this.o.contains(str)) {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                } else if (this.f870n.contains(D)) {
                    throw new IllegalArgumentException("A shared element with the source name '" + D + "' has already been added to the transaction.");
                }
                this.f870n.add(D);
                this.o.add(str);
            } else {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
        }
        return this;
    }

    public u h(String str) {
        if (this.f864h) {
            this.f863g = true;
            this.f865i = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public u i(Fragment fragment) {
        f(new a(7, fragment));
        return this;
    }

    public abstract int j();

    public abstract int k();

    public abstract void l();

    public abstract void m();

    public u n(Fragment fragment) {
        f(new a(6, fragment));
        return this;
    }

    public u o() {
        if (!this.f863g) {
            this.f864h = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* access modifiers changed from: package-private */
    public void p(int i2, Fragment fragment, String str, int i3) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.D;
            if (str2 == null || str.equals(str2)) {
                fragment.D = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.D + " now " + str);
            }
        }
        if (i2 != 0) {
            if (i2 != -1) {
                int i4 = fragment.B;
                if (i4 == 0 || i4 == i2) {
                    fragment.B = i2;
                    fragment.C = i2;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.B + " now " + i2);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        f(new a(i3, fragment));
    }

    public u q(Fragment fragment) {
        f(new a(3, fragment));
        return this;
    }

    public u r(int i2, Fragment fragment) {
        s(i2, fragment, (String) null);
        return this;
    }

    public u s(int i2, Fragment fragment, String str) {
        if (i2 != 0) {
            p(i2, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public u t(int i2, int i3, int i4, int i5) {
        this.b = i2;
        this.c = i3;
        this.f860d = i4;
        this.f861e = i5;
        return this;
    }

    public u u(Fragment fragment, p.b bVar) {
        f(new a(10, fragment, bVar));
        return this;
    }

    public u v(Fragment fragment) {
        f(new a(8, fragment));
        return this;
    }

    public u w(boolean z) {
        this.p = z;
        return this;
    }
}
