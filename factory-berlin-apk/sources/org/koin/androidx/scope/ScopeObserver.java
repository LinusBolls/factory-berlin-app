package org.koin.androidx.scope;

import androidx.lifecycle.g0;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import kotlin.i;
import m.a.c.b;
import m.a.c.c;
import m.a.c.l.a;

@i(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0005R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\r\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0012\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lorg/koin/androidx/scope/ScopeObserver;", "Landroidx/lifecycle/u;", "Lm/a/c/c;", "", "onDestroy", "()V", "onStop", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "getEvent", "()Landroidx/lifecycle/Lifecycle$Event;", "Lorg/koin/core/scope/Scope;", "scope", "Lorg/koin/core/scope/Scope;", "getScope", "()Lorg/koin/core/scope/Scope;", "", "target", "Ljava/lang/Object;", "getTarget", "()Ljava/lang/Object;", "<init>", "(Landroidx/lifecycle/Lifecycle$Event;Ljava/lang/Object;Lorg/koin/core/scope/Scope;)V", "koin-androidx-scope_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: ScopeObserver.kt */
public final class ScopeObserver implements u, c {

    /* renamed from: g  reason: collision with root package name */
    private final p.a f11461g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f11462h;

    /* renamed from: i  reason: collision with root package name */
    private final a f11463i;

    public m.a.c.a n() {
        return c.a.a(this);
    }

    @g0(p.a.ON_DESTROY)
    public final void onDestroy() {
        if (this.f11461g == p.a.ON_DESTROY) {
            m.a.c.g.c b = b.c.b();
            b.a(this.f11462h + " received ON_DESTROY");
            this.f11463i.b();
        }
    }

    @g0(p.a.ON_STOP)
    public final void onStop() {
        if (this.f11461g == p.a.ON_STOP) {
            m.a.c.g.c b = b.c.b();
            b.a(this.f11462h + " received ON_STOP");
            this.f11463i.b();
        }
    }
}
