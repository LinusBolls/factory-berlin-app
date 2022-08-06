package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import e.h.j.h;

/* compiled from: FragmentHostCallback */
public abstract class j<E> extends f {

    /* renamed from: g  reason: collision with root package name */
    private final Activity f821g;

    /* renamed from: h  reason: collision with root package name */
    private final Context f822h;

    /* renamed from: i  reason: collision with root package name */
    private final Handler f823i;

    /* renamed from: j  reason: collision with root package name */
    final m f824j;

    j(d dVar) {
        this(dVar, dVar, new Handler(), 0);
    }

    public View e(int i2) {
        return null;
    }

    public boolean f() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public Activity g() {
        return this.f821g;
    }

    /* access modifiers changed from: package-private */
    public Context h() {
        return this.f822h;
    }

    /* access modifiers changed from: package-private */
    public Handler i() {
        return this.f823i;
    }

    /* access modifiers changed from: package-private */
    public void j(Fragment fragment) {
    }

    public abstract E k();

    public LayoutInflater l() {
        return LayoutInflater.from(this.f822h);
    }

    public void m(Fragment fragment, String[] strArr, int i2) {
    }

    public boolean n(Fragment fragment) {
        return true;
    }

    public boolean p(String str) {
        return false;
    }

    public void q(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (i2 == -1) {
            this.f822h.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public void r() {
    }

    j(Activity activity, Context context, Handler handler, int i2) {
        this.f824j = new n();
        this.f821g = activity;
        h.d(context, "context == null");
        this.f822h = context;
        h.d(handler, "handler == null");
        this.f823i = handler;
    }
}
