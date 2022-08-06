package com.sensorberg.smartworkspace.app.utils;

import android.os.Handler;
import androidx.lifecycle.g0;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/sensorberg/smartworkspace/app/utils/LifecycleObserverHandler;", "Landroidx/lifecycle/u;", "", "onDestroy$app_appCenterRelease", "()V", "onDestroy", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "<init>", "(Landroid/os/Handler;)V", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: LifecycleHandlerFactory.kt */
final class LifecycleObserverHandler implements u {

    /* renamed from: g  reason: collision with root package name */
    private final Handler f7997g;

    public LifecycleObserverHandler(Handler handler) {
        k.e(handler, "handler");
        this.f7997g = handler;
    }

    @g0(p.a.ON_DESTROY)
    public final void onDestroy$app_appCenterRelease() {
        this.f7997g.removeCallbacksAndMessages((Object) null);
    }
}
