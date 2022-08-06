package com.sensorberg.smartspaces.sdk.internal.r;

import android.os.Looper;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import kotlin.jvm.internal.k;

/* compiled from: AbstractDecorator.kt */
public class a<T> {
    private final e0<T> a;

    public a(T t) {
        this.a = new e0<>(t);
    }

    public final T D() {
        T l2 = this.a.l();
        k.c(l2);
        return l2;
    }

    /* access modifiers changed from: protected */
    public final LiveData<T> E() {
        return this.a;
    }

    public void F(T t) {
        if (k.a(Looper.myLooper(), Looper.getMainLooper())) {
            this.a.u(t);
        } else {
            this.a.s(t);
        }
    }
}
