package com.google.android.material.appbar;

import android.view.View;
import e.h.k.u;

/* compiled from: ViewOffsetHelper */
class d {
    private final View a;
    private int b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f3378d;

    /* renamed from: e  reason: collision with root package name */
    private int f3379e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3380f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3381g = true;

    public d(View view) {
        this.a = view;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        View view = this.a;
        u.R(view, this.f3378d - (view.getTop() - this.b));
        View view2 = this.a;
        u.Q(view2, this.f3379e - (view2.getLeft() - this.c));
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.f3378d;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.b = this.a.getTop();
        this.c = this.a.getLeft();
    }

    public boolean e(int i2) {
        if (!this.f3381g || this.f3379e == i2) {
            return false;
        }
        this.f3379e = i2;
        a();
        return true;
    }

    public boolean f(int i2) {
        if (!this.f3380f || this.f3378d == i2) {
            return false;
        }
        this.f3378d = i2;
        a();
        return true;
    }
}
