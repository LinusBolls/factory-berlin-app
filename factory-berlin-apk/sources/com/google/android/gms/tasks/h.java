package com.google.android.gms.tasks;

public class h<TResult> {
    private final b0<TResult> a = new b0<>();

    public g<TResult> a() {
        return this.a;
    }

    public void b(Exception exc) {
        this.a.p(exc);
    }

    public void c(TResult tresult) {
        this.a.q(tresult);
    }

    public boolean d(Exception exc) {
        return this.a.r(exc);
    }

    public boolean e(TResult tresult) {
        return this.a.s(tresult);
    }
}
