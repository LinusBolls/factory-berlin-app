package com.sensorberg.smartworkspace.app.screens.door.e;

import android.os.Handler;
import androidx.lifecycle.LiveData;
import kotlin.jvm.internal.k;

/* compiled from: ResetTimeLiveData.kt */
public final class c extends LiveData<Boolean> {
    private final Runnable q = new a(this);
    private final Handler r;
    private final long s;

    /* compiled from: ResetTimeLiveData.kt */
    static final class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f7425g;

        a(c cVar) {
            this.f7425g = cVar;
        }

        public final void run() {
            this.f7425g.u(Boolean.TRUE);
        }
    }

    public c(Handler handler, long j2) {
        k.e(handler, "handler");
        this.r = handler;
        this.s = j2;
    }

    /* access modifiers changed from: protected */
    public void q() {
        w();
    }

    /* access modifiers changed from: protected */
    public void r() {
        if (!k.a(l(), Boolean.FALSE)) {
            u(Boolean.FALSE);
        }
        this.r.removeCallbacks(this.q);
    }

    public final void w() {
        if (!k.a(l(), Boolean.FALSE)) {
            u(Boolean.FALSE);
        }
        this.r.removeCallbacks(this.q);
        this.r.postDelayed(this.q, this.s);
    }
}
