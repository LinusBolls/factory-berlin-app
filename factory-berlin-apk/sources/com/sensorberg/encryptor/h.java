package com.sensorberg.encryptor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.k;

/* compiled from: LiveContainsString.kt */
public final class h extends LiveData<Boolean> implements f0<c> {
    private final LiveData<c> q;
    private final Executor r;
    /* access modifiers changed from: private */
    public final String s;
    /* access modifiers changed from: private */
    public final e t;

    /* compiled from: LiveContainsString.kt */
    static final class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f5098g;

        a(h hVar) {
            this.f5098g = hVar;
        }

        public final void run() {
            boolean z = this.f5098g.t.a(this.f5098g.s) != null;
            if (true ^ k.a(Boolean.valueOf(z), this.f5098g.l())) {
                this.f5098g.s(Boolean.valueOf(z));
            }
        }
    }

    public h(Executor executor, String str, e eVar) {
        k.f(executor, "executor");
        k.f(str, "alias");
        k.f(eVar, "dao");
        this.r = executor;
        this.s = str;
        this.t = eVar;
        this.q = eVar.e(str);
    }

    /* access modifiers changed from: protected */
    public void q() {
        super.q();
        this.r.execute(new a(this));
        this.q.p(this);
    }

    /* access modifiers changed from: protected */
    public void r() {
        super.r();
        this.q.t(this);
        u(null);
    }

    /* renamed from: y */
    public void k(c cVar) {
        boolean z = cVar != null;
        if (true ^ k.a(Boolean.valueOf(z), l())) {
            u(Boolean.valueOf(z));
        }
    }
}
