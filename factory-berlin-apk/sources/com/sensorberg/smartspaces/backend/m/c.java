package com.sensorberg.smartspaces.backend.m;

import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import g.e.k.d;
import kotlin.jvm.internal.k;

/* compiled from: EncryptorToObservableData.kt */
public final class c<T> extends d<T> {
    private final f0<T> q;
    /* access modifiers changed from: private */
    public final e0<T> r;

    /* compiled from: EncryptorToObservableData.kt */
    public static final class a implements f0<T> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f6031g;

        a(c cVar) {
            this.f6031g = cVar;
        }

        public void k(T t) {
            this.f6031g.r.t(this);
            if (!k.a(this.f6031g.n(), t)) {
                this.f6031g.w(t);
            }
        }
    }

    public c(e0<T> e0Var) {
        k.e(e0Var, "liveData");
        this.r = e0Var;
        a aVar = new a(this);
        this.q = aVar;
        this.r.p(aVar);
    }

    /* access modifiers changed from: protected */
    public void u(T t) {
        this.r.s(t);
    }
}
