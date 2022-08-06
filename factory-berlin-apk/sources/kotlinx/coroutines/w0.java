package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.c0.d;
import kotlin.c0.g;
import kotlinx.coroutines.internal.v;

/* compiled from: Builders.common.kt */
final class w0<T> extends v<T> {

    /* renamed from: k  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f11073k = AtomicIntegerFieldUpdater.newUpdater(w0.class, "_decision");
    private volatile int _decision = 0;

    public w0(g gVar, d<? super T> dVar) {
        super(gVar, dVar);
    }

    private final boolean X0() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f11073k.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean Y0() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f11073k.compareAndSet(this, 0, 1));
        return true;
    }

    /* access modifiers changed from: protected */
    public void P0(Object obj) {
        if (!X0()) {
            v0.b(c.b(this.f11029j), x.a(obj, this.f11029j));
        }
    }

    public final Object W0() {
        if (Y0()) {
            return d.c();
        }
        Object h2 = f2.h(g0());
        if (!(h2 instanceof w)) {
            return h2;
        }
        throw ((w) h2).a;
    }

    /* access modifiers changed from: protected */
    public void x(Object obj) {
        P0(obj);
    }
}
