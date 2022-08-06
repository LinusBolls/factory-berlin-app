package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class r8 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f3074g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ String f3075h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ String f3076i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ String f3077j;

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ la f3078k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ c8 f3079l;

    r8(c8 c8Var, AtomicReference atomicReference, String str, String str2, String str3, la laVar) {
        this.f3079l = c8Var;
        this.f3074g = atomicReference;
        this.f3075h = str;
        this.f3076i = str2;
        this.f3077j = str3;
        this.f3078k = laVar;
    }

    public final void run() {
        synchronized (this.f3074g) {
            try {
                u3 l0 = this.f3079l.f2770d;
                if (l0 == null) {
                    this.f3079l.i().E().d("(legacy) Failed to get conditional properties; not connected to service", c4.w(this.f3075h), this.f3076i, this.f3077j);
                    this.f3074g.set(Collections.emptyList());
                    this.f3074g.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f3075h)) {
                    this.f3074g.set(l0.B0(this.f3076i, this.f3077j, this.f3078k));
                } else {
                    this.f3074g.set(l0.z0(this.f3075h, this.f3076i, this.f3077j));
                }
                this.f3079l.e0();
                this.f3074g.notify();
            } catch (RemoteException e2) {
                try {
                    this.f3079l.i().E().d("(legacy) Failed to get conditional properties; remote exception", c4.w(this.f3075h), this.f3076i, e2);
                    this.f3074g.set(Collections.emptyList());
                    this.f3074g.notify();
                } catch (Throwable th) {
                    this.f3074g.notify();
                    throw th;
                }
            }
        }
    }
}
