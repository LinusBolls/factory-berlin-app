package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.fb;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class i8 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f2898g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ la f2899h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ c8 f2900i;

    i8(c8 c8Var, AtomicReference atomicReference, la laVar) {
        this.f2900i = c8Var;
        this.f2898g = atomicReference;
        this.f2899h = laVar;
    }

    public final void run() {
        synchronized (this.f2898g) {
            try {
                if (!fb.a() || !this.f2900i.l().s(u.P0) || this.f2900i.k().K().q()) {
                    u3 l0 = this.f2900i.f2770d;
                    if (l0 == null) {
                        this.f2900i.i().E().a("Failed to get app instance id");
                        this.f2898g.notify();
                        return;
                    }
                    this.f2898g.set(l0.k0(this.f2899h));
                    String str = (String) this.f2898g.get();
                    if (str != null) {
                        this.f2900i.p().T(str);
                        this.f2900i.k().f3032l.b(str);
                    }
                    this.f2900i.e0();
                    this.f2898g.notify();
                } else {
                    this.f2900i.i().J().a("Analytics storage consent denied; will not get app instance id");
                    this.f2900i.p().T((String) null);
                    this.f2900i.k().f3032l.b((String) null);
                    this.f2898g.set((Object) null);
                    this.f2898g.notify();
                }
            } catch (RemoteException e2) {
                try {
                    this.f2900i.i().E().b("Failed to get app instance id", e2);
                    this.f2898g.notify();
                } catch (Throwable th) {
                    this.f2898g.notify();
                    throw th;
                }
            }
        }
    }
}
