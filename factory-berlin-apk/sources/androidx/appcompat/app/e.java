package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import e.e.b;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: AppCompatDelegate */
public abstract class e {

    /* renamed from: g  reason: collision with root package name */
    private static int f123g = -100;

    /* renamed from: h  reason: collision with root package name */
    private static final b<WeakReference<e>> f124h = new b<>();

    /* renamed from: i  reason: collision with root package name */
    private static final Object f125i = new Object();

    e() {
    }

    public static e e(Activity activity, d dVar) {
        return new f(activity, dVar);
    }

    public static e f(Dialog dialog, d dVar) {
        return new f(dialog, dVar);
    }

    public static int h() {
        return f123g;
    }

    static void n(e eVar) {
        synchronized (f125i) {
            x(eVar);
            f124h.add(new WeakReference(eVar));
        }
    }

    static void o(e eVar) {
        synchronized (f125i) {
            x(eVar);
        }
    }

    private static void x(e eVar) {
        synchronized (f125i) {
            Iterator<WeakReference<e>> it = f124h.iterator();
            while (it.hasNext()) {
                e eVar2 = (e) it.next().get();
                if (eVar2 == eVar || eVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void A(View view);

    public abstract void B(View view, ViewGroup.LayoutParams layoutParams);

    public void C(int i2) {
    }

    public abstract void D(CharSequence charSequence);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public void d(Context context) {
    }

    public abstract <T extends View> T g(int i2);

    public int i() {
        return -100;
    }

    public abstract MenuInflater j();

    public abstract a k();

    public abstract void l();

    public abstract void m();

    public abstract void p(Configuration configuration);

    public abstract void q(Bundle bundle);

    public abstract void r();

    public abstract void s(Bundle bundle);

    public abstract void t();

    public abstract void u(Bundle bundle);

    public abstract void v();

    public abstract void w();

    public abstract boolean y(int i2);

    public abstract void z(int i2);
}
