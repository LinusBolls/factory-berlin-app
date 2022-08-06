package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.a;

public class u<T extends IInterface> extends i<T> {
    private final a.h<T> y;

    /* access modifiers changed from: protected */
    public void H(int i2, T t) {
        this.y.q(i2, t);
    }

    /* access modifiers changed from: protected */
    public String c() {
        return this.y.c();
    }

    /* access modifiers changed from: protected */
    public T e(IBinder iBinder) {
        return this.y.e(iBinder);
    }

    public int g() {
        return super.g();
    }

    public a.h<T> k0() {
        return this.y;
    }

    /* access modifiers changed from: protected */
    public String p() {
        return this.y.p();
    }
}
