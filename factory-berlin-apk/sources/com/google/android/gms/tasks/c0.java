package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

final class c0 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ b0 f3320g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ Callable f3321h;

    c0(b0 b0Var, Callable callable) {
        this.f3320g = b0Var;
        this.f3321h = callable;
    }

    public final void run() {
        try {
            this.f3320g.q(this.f3321h.call());
        } catch (Exception e2) {
            this.f3320g.p(e2);
        }
    }
}
