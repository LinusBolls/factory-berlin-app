package kotlinx.coroutines.flow.internal;

import kotlin.x;
import kotlinx.coroutines.channels.v;
import kotlinx.coroutines.e3.d;

/* compiled from: SendingCollector.kt */
public final class q<T> implements d<T> {

    /* renamed from: g  reason: collision with root package name */
    private final v<T> f10930g;

    public q(v<? super T> vVar) {
        this.f10930g = vVar;
    }

    public Object a(T t, kotlin.c0.d<? super x> dVar) {
        Object s = this.f10930g.s(t, dVar);
        return s == d.c() ? s : x.a;
    }
}
