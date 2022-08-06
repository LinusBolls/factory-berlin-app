package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class t8 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f3120g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ String f3121h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ String f3122i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ String f3123j;

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ boolean f3124k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ la f3125l;

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ c8 f3126m;

    t8(c8 c8Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z, la laVar) {
        this.f3126m = c8Var;
        this.f3120g = atomicReference;
        this.f3121h = str;
        this.f3122i = str2;
        this.f3123j = str3;
        this.f3124k = z;
        this.f3125l = laVar;
    }

    public final void run() {
        synchronized (this.f3120g) {
            try {
                u3 l0 = this.f3126m.f2770d;
                if (l0 == null) {
                    this.f3126m.i().E().d("(legacy) Failed to get user properties; not connected to service", c4.w(this.f3121h), this.f3122i, this.f3123j);
                    this.f3120g.set(Collections.emptyList());
                    this.f3120g.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f3121h)) {
                    this.f3120g.set(l0.s(this.f3122i, this.f3123j, this.f3124k, this.f3125l));
                } else {
                    this.f3120g.set(l0.O(this.f3121h, this.f3122i, this.f3123j, this.f3124k));
                }
                this.f3126m.e0();
                this.f3120g.notify();
            } catch (RemoteException e2) {
                try {
                    this.f3126m.i().E().d("(legacy) Failed to get user properties; remote exception", c4.w(this.f3121h), this.f3122i, e2);
                    this.f3120g.set(Collections.emptyList());
                    this.f3120g.notify();
                } catch (Throwable th) {
                    this.f3120g.notify();
                    throw th;
                }
            }
        }
    }
}
