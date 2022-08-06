package kotlinx.coroutines.internal;

import kotlin.c0.g;
import kotlinx.coroutines.i0;

/* compiled from: Scopes.kt */
public final class f implements i0 {

    /* renamed from: g  reason: collision with root package name */
    private final g f11011g;

    public f(g gVar) {
        this.f11011g = gVar;
    }

    public g k() {
        return this.f11011g;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + k() + ')';
    }
}
