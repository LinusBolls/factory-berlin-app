package kotlinx.coroutines.internal;

import kotlin.c0.d;
import kotlin.c0.g;
import kotlin.c0.j.a.e;
import kotlinx.coroutines.a;
import kotlinx.coroutines.v0;
import kotlinx.coroutines.x;
import kotlinx.coroutines.x1;

/* compiled from: Scopes.kt */
public class v<T> extends a<T> implements e {

    /* renamed from: j  reason: collision with root package name */
    public final d<T> f11029j;

    public v(g gVar, d<? super T> dVar) {
        super(gVar, true);
        this.f11029j = dVar;
    }

    public final StackTraceElement C() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void P0(Object obj) {
        d<T> dVar = this.f11029j;
        dVar.m(x.a(obj, dVar));
    }

    public final x1 V0() {
        return (x1) this.f10713i.get(x1.f11076e);
    }

    public final e j() {
        return (e) this.f11029j;
    }

    /* access modifiers changed from: protected */
    public final boolean l0() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void x(Object obj) {
        v0.b(c.b(this.f11029j), x.a(obj, this.f11029j));
    }
}
