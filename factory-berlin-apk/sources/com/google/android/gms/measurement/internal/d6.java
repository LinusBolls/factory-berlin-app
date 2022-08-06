package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
abstract class d6 extends a6 {
    private boolean b;

    d6(h5 h5Var) {
        super(h5Var);
        this.a.k(this);
    }

    /* access modifiers changed from: protected */
    public void m() {
    }

    /* access modifiers changed from: protected */
    public final void o() {
        if (!s()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void p() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!r()) {
            this.a.t();
            this.b = true;
        }
    }

    public final void q() {
        if (!this.b) {
            m();
            this.a.t();
            this.b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    public abstract boolean r();

    /* access modifiers changed from: package-private */
    public final boolean s() {
        return this.b;
    }
}
