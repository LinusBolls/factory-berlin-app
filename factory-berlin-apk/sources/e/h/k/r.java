package e.h.k;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: OneShotPreDrawListener */
public final class r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: g  reason: collision with root package name */
    private final View f8702g;

    /* renamed from: h  reason: collision with root package name */
    private ViewTreeObserver f8703h;

    /* renamed from: i  reason: collision with root package name */
    private final Runnable f8704i;

    private r(View view, Runnable runnable) {
        this.f8702g = view;
        this.f8703h = view.getViewTreeObserver();
        this.f8704i = runnable;
    }

    public static r a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            r rVar = new r(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(rVar);
            view.addOnAttachStateChangeListener(rVar);
            return rVar;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public void b() {
        if (this.f8703h.isAlive()) {
            this.f8703h.removeOnPreDrawListener(this);
        } else {
            this.f8702g.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f8702g.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        b();
        this.f8704i.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f8703h = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
